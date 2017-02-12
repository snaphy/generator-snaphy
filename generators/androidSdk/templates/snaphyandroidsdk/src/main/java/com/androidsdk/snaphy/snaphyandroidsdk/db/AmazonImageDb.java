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

import com.androidsdk.snaphy.snaphyandroidsdk.models.AmazonImage;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AmazonImageRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class AmazonImageDb extends DbHandler<AmazonImage, AmazonImageRepository> {
  public AmazonImageDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, "AmazonImage", DATABASE_NAME, restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                               
    String CREATE_AmazonImage_TABLE = "CREATE TABLE IF NOT EXISTS AmazonImage (  name TEXT, container TEXT, type TEXT, url TEXT, id TEXT PRIMARY KEY)";
    db.execSQL(CREATE_AmazonImage_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS AmazonImage");
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


    // Updating single contact
    public int update__db(String id,   AmazonImage modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("AmazonImage", values, "id = ?",
                new String[] { id });
    }

}
