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
import android.database.sqlite.SQLiteOpenHelper;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.AmazonImage;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AmazonImageRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class AmazonImageDb extends SQLiteOpenHelper {

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

  public AmazonImageDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.restAdapter = restAdapter;
    TABLE = "AmazonImage";
    this.DATABASE_NAME = DATABASE_NAME;
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                           
    
    String CREATE_AmazonImage_TABLE = "CREATE TABLE IF NOT EXISTS AmazonImage (  name TEXT, container TEXT, type TEXT, url TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_AmazonImage_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS AmazonImage");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, AmazonImage modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("AmazonImage", null, values);
        db.close(); // Closing database connection
    }





    public ContentValues getContentValues(AmazonImage modelData){
      ContentValues values = new ContentValues();
                       
                                                            String nameData = "";
                        if(modelData.getName() != null){
                          nameData = modelData.getName().toString();
                        }
                                                values.put("name", nameData);
                                
                                                            String containerData = "";
                        if(modelData.getContainer() != null){
                          containerData = modelData.getContainer().toString();
                        }
                                                values.put("container", containerData);
                                
                                                            String typeData = "";
                        if(modelData.getType() != null){
                          typeData = modelData.getType().toString();
                        }
                                                values.put("type", typeData);
                                
                                                            String urlData = "";
                        if(modelData.getUrl() != null){
                          urlData = new Gson().toJson(modelData.getUrl(), HashMap.class);
                        }
                                                values.put("url", urlData);
                                
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
    public   AmazonImage get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AmazonImage", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    AmazonImageRepository repo = restAdapter.createRepository(AmazonImageRepository.class);
                    return (AmazonImage)repo.createObject(hashMap);
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
    public   AmazonImage get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AmazonImage", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    AmazonImageRepository repo = restAdapter.createRepository(AmazonImageRepository.class);
                    return (AmazonImage)repo.createObject(hashMap);
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

                      
                                                            String nameData = "";
                        if(cursor.getString(0) != null){
                          nameData = cursor.getString(0);
                          if(nameData != null){
                            nameData = (String)nameData;
                            hashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            String containerData = "";
                        if(cursor.getString(1) != null){
                          containerData = cursor.getString(1);
                          if(containerData != null){
                            containerData = (String)containerData;
                            hashMap.put("container", containerData);
                          }
                        }
                                                
                                
                                                            String typeData = "";
                        if(cursor.getString(2) != null){
                          typeData = cursor.getString(2);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> urlData = new HashMap<>();
                        if(cursor.getString(3) != null){
                          urlData = new Gson().fromJson(cursor.getString(3), Map.class);
                          if(urlData != null){
                            urlData = (Map<String, Object>)urlData;
                            hashMap.put("url", urlData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(4) != null){
                          idData = cursor.getString(4);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, AmazonImage model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<AmazonImage>  getAll__db() {
        DataList<AmazonImage> modelList = new DataList<AmazonImage>();
        // Select All Query
        String selectQuery = "SELECT  * FROM AmazonImage";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    AmazonImageRepository repo = restAdapter.createRepository(AmazonImageRepository.class);
                    modelList.add((AmazonImage)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<AmazonImage>) modelList;
    }


    // Getting All Data where
    public DataList<AmazonImage>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<AmazonImage> modelList = new DataList<AmazonImage>();
        // Select All Query
        String selectQuery = "SELECT  * FROM AmazonImage WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    AmazonImageRepository repo = restAdapter.createRepository(AmazonImageRepository.class);
                    modelList.add((AmazonImage)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<AmazonImage>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM AmazonImage WHERE " + whereKey +"='"+ whereKeyValue + "'" ;
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
        db.update("AmazonImage", values, "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(String whereKey, String whereKeyValue) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("AmazonImage", "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Updating single contact
    public void update__db(String id,   AmazonImage modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        db.update("AmazonImage", values, "id = ?",
                new String[] { id });
        db.close();
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        db.update("AmazonImage", values, "_DATA_UPDATED = 1", null);
        db.close();
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete("AmazonImage", "_DATA_UPDATED = 0", null);
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
