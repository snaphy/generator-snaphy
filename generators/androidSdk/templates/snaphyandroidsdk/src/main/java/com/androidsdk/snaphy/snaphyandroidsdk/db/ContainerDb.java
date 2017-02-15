package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Container;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ContainerRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class ContainerDb extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    RestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";

    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;

  public ContainerDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, "Container", DATABASE_NAME, restAdapter);
    TABLE = "Container";
    this.DATABASE_NAME = DATABASE_NAME;
    //this.create__db();
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                               
    
    String CREATE_Container_TABLE = "CREATE TABLE IF NOT EXISTS Container (  id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_Container_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS Container");
            // Create tables again
            onCreate(db);
    }



    private void create__db () {
        SQLiteDatabase db = this.getWritableDatabase();
                                                   
        
        String CREATE_Container_TABLE = "CREATE TABLE IF NOT EXISTS Container (  id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
        db.execSQL(CREATE_Container_TABLE);
        db.close(); // Closing database connection
    }



    public void insert__db (String id, Container modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("Container", null, values);
        db.close(); // Closing database connection
    }





    public ContentValues getContentValues(Container modelData){
      ContentValues values = new ContentValues();
                       
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String idData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getId");
                              if(method.invoke(modelData) != null){
                                //idData = modelData.getId().toString();
                                idData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("id", idData);
                  

        //Add the updated data property value to be 1
        values.put("_DATA_UPDATED", 1);
        return values;
    }



    // Getting single c
    public   Container get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Container", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    ContainerRepository repo = restAdapter.createRepository(ContainerRepository.class);
                    return (Container)repo.createObject(hashMap);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }

    } //get__db




    // Getting single cont
    public   Container get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Container", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    ContainerRepository repo = restAdapter.createRepository(ContainerRepository.class);
                    return (Container)repo.createObject(hashMap);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }

    } //get__db




    private HashMap<String, Object> parseCursor(Cursor cursor ){
      HashMap<String, Object> hashMap = new HashMap<>();

                      
                                                            String idData = "";
                        if(cursor.getString(0) != null){
                          idData = cursor.getString(0);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Container model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Container>  getAll__db() {
        DataList<Container> modelList = new DataList<Container>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Container";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ContainerRepository repo = restAdapter.createRepository(ContainerRepository.class);
                    modelList.add((Container)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Container>) modelList;
    }


    // Getting All Data where
    public DataList<Container>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Container> modelList = new DataList<Container>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Container WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ContainerRepository repo = restAdapter.createRepository(ContainerRepository.class);
                    modelList.add((Container)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Container>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM Container WHERE " + whereKey +"='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(String whereKey, String whereKeyValue) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        db.update("Container", values, "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(String whereKey, String whereKeyValue) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("Container", "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Updating single contact
    public void update__db(String id,   Container modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        db.update("Container", values, "id = ?",
                new String[] { id });
        db.close();
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        db.update("Container", values, "_DATA_UPDATED = 1", null);
        db.close();
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete("Container", "_DATA_UPDATED = 0", null);
      db.close();
    }


    // Getting contacts Count
    public int count__db() {
        String countQuery = "SELECT  * FROM " + TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }


    /**
     * Get count by Id..
     * @param id
     * @return
     */
    public int count__db(String id){
        String countQuery = "SELECT  * FROM " + TABLE  + " WHERE ID='" + id+"'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }


    // Deleting by id
    public void delete__db(String id) {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete(TABLE, KEY_ID + " = ?",
      new String[] { id });
      db.close();
    }

    public void reset__db(){
       SQLiteDatabase db = this.getWritableDatabase();
       db.delete(TABLE,null,null);
       db.close();
    }

}
