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

import com.androidsdk.snaphy.snaphyandroidsdk.models.FollowBrand;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.FollowBrandRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class FollowBrandDb extends DbHandler<FollowBrand, FollowBrandRepository> {
  public FollowBrandDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, "FollowBrand", DATABASE_NAME, restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                
    
    String CREATE_FollowBrand_TABLE = "CREATE TABLE IF NOT EXISTS FollowBrand (  added TEXT, id TEXT PRIMARY KEY, appUserId TEXT, brandId TEXT, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_FollowBrand_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS FollowBrand");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, FollowBrand modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("FollowBrand", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(FollowBrand modelData){
      ContentValues values = new ContentValues();
                       
                                                            String addedData = "";
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
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
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String appUserIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getAppUserId");
                              if(method.invoke(modelData) != null){
                                //appUserIdData = modelData.getAppUserId().toString();
                                appUserIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("appUserId", appUserIdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String brandIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getBrandId");
                              if(method.invoke(modelData) != null){
                                //brandIdData = modelData.getBrandId().toString();
                                brandIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("brandId", brandIdData);
                  

        //Add the updated data property value to be 1
        values.put("_DATA_UPDATED", 1);
        return values;
    }



    // Getting single c
    public   FollowBrand get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("FollowBrand", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    FollowBrandRepository repo = restAdapter.createRepository(FollowBrandRepository.class);
                    return (FollowBrand)repo.createObject(hashMap);
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
    public   FollowBrand get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("FollowBrand", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    FollowBrandRepository repo = restAdapter.createRepository(FollowBrandRepository.class);
                    return (FollowBrand)repo.createObject(hashMap);
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

                      
                                                            String addedData = "";
                        if(cursor.getString(0) != null){
                          addedData = cursor.getString(0);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(1) != null){
                          idData = cursor.getString(1);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String appUserIdData = "";
                        if(cursor.getString(2) != null){
                          appUserIdData = cursor.getString(2);
                          if(appUserIdData != null){
                            appUserIdData = appUserIdData.toString();
                            hashMap.put("appUserId", appUserIdData);
                          }
                        }
                                                
                                
                                                            String brandIdData = "";
                        if(cursor.getString(3) != null){
                          brandIdData = cursor.getString(3);
                          if(brandIdData != null){
                            brandIdData = brandIdData.toString();
                            hashMap.put("brandId", brandIdData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, FollowBrand model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<FollowBrand>  getAll__db() {
        DataList<FollowBrand> modelList = new DataList<FollowBrand>();
        // Select All Query
        String selectQuery = "SELECT  * FROM FollowBrand";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    FollowBrandRepository repo = restAdapter.createRepository(FollowBrandRepository.class);
                    modelList.add((FollowBrand)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<FollowBrand>) modelList;
    }


    // Getting All Data where
    public DataList<FollowBrand>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<FollowBrand> modelList = new DataList<FollowBrand>();
        // Select All Query
        String selectQuery = "SELECT  * FROM FollowBrand WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    FollowBrandRepository repo = restAdapter.createRepository(FollowBrandRepository.class);
                    modelList.add((FollowBrand)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<FollowBrand>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   FollowBrand modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("FollowBrand", values, "id = ?",
                new String[] { id });
    }


    // Updating updated data property to new contact
    public int checkOldData__db() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        return db.update("FollowBrand", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete("FollowBrand", "_DATA_UPDATED = 0", null);
      db.close();
    }

}
