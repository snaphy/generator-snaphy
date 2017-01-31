package com.androidsdk.snaphy.snaphyandroidsdk.db;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;
import com.androidsdk.snaphy.snaphyandroidsdk.models.Model;
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ModelRepository;
import com.google.gson.Gson;
import com.strongloop.android.loopback.RestAdapter;

import java.util.HashMap;

/**
 * Created by snaphy on 31/1/17.
 */

public class DbHandler<M extends Model, R extends ModelRepository> extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    RestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";

    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";

    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;




    public DbHandler(Context context, String tableName, RestAdapter restAdapter) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.restAdapter = restAdapter;
        TABLE = tableName;
        try{
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            DATABASE_NAME = (String) ai.metaData.get(METADATA_DATABASE_NAME_KEY);
        }
        catch (Exception e){
            Log.e(TAG, e.toString());
        }
    }


    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

            String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE + " IF NOT EXISTS ( ID TEXT PRIMARY KEY, OBJECT TEXT )";
            db.execSQL(CREATE_CONTACTS_TABLE);


    }


    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS " + TABLE);
            // Create tables again
            onCreate(db);

    }


    public void insert__db (String id, String object) {
        /*Chat chat = new Chat();*/
        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

        // Inserting Row
        ContentValues values = new ContentValues();
        values.put("ID", id); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection

    }

    // Getting single cont
    public  M get__db(Class<R> type, String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();

            Cursor cursor = db.query(TABLE, new String[]{"",
                            KEY_ID, KEY_OBJECT}, KEY_ID + "=?",
                    new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();

                //String model_id = cursor.getString(0);
                String object = cursor.getString(1);
                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    HashMap<String, Object> chatHashMap = toHashMap(object);
                    if (chatHashMap != null) {
                        R repo = restAdapter.createRepository(type);
                        return (M)repo.createObject(chatHashMap);
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }

            } else {
                return null;
            }
        } else {
            return null;
        }

    }


    public void upsert__db(String id, String object){
        if(count__db(id) != 0){
            update__db(id, object);
        }else{
            insert__db(id, object);
        }
    }


    public String toJsonString(HashMap<String, Object> data ){
        if(data != null){
            return  new Gson().toJson(data, HashMap.class);
        }else{
            return null;
        }
    }


    public HashMap toHashMap(String jsonString){
        if(jsonString != null){
            return new Gson().fromJson(jsonString, HashMap.class);
        }else{
            return null;
        }

    }




    // Getting All Contacts
    public <M> DataList<M>  getAll__db(Class<R> type) {
        DataList<M> modelList = new DataList<M>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                //String model_id = cursor.getString(0);
                String object = cursor.getString(1);
                HashMap<String, Object> chatHashMap = toHashMap(object);
                if(chatHashMap != null){
                    R repo = restAdapter.createRepository(type);
                    modelList.add((M)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<M>) modelList;
    }



    // Getting contacts Count
    public int count__db() {
        String countQuery = "SELECT  * FROM " + TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
        // return count
        return cursor.getCount();
    }

    
    /**
     * Get count by Id..
     * @param id
     * @return
     */
    public int count__db(String id){
        String countQuery = "SELECT  * FROM " + TABLE  + " WHERE ID=" + id;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
        // return count
        return cursor.getCount();
    }


    // Updating single contact
    public int update__db(String id, String object) {
        SQLiteDatabase db = this.getWritableDatabase();
        /*HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);*/
        ContentValues values = new ContentValues();
        values.put("ID", id); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number

        // updating row
        return db.update(TABLE, values, KEY_ID + " = ?",
                new String[] { id });
    }


    // Deleting single contact
    public void deleteContact(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE, KEY_ID + " = ?",
                new String[] { id });
        db.close();
    }
}
