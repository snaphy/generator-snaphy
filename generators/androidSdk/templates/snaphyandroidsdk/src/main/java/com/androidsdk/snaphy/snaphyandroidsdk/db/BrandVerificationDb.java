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

import com.androidsdk.snaphy.snaphyandroidsdk.models.BrandVerification;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandVerificationRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class BrandVerificationDb extends DbHandler<BrandVerification, BrandVerificationRepository> {
  public BrandVerificationDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, "BrandVerification", DATABASE_NAME, restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                           
    
    String CREATE_BrandVerification_TABLE = "CREATE TABLE IF NOT EXISTS BrandVerification (  code TEXT, added TEXT, updated TEXT, id TEXT PRIMARY KEY, brandId TEXT, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_BrandVerification_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS BrandVerification");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, BrandVerification modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("BrandVerification", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(BrandVerification modelData){
      ContentValues values = new ContentValues();
                       
                                                            String codeData = "";
                        if(modelData.getCode() != null){
                          codeData = modelData.getCode().toString();
                        }
                                                values.put("code", codeData);
                                
                                                            String addedData = "";
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
                                                            String updatedData = "";
                        if(modelData.getUpdated() != null){
                          updatedData = modelData.getUpdated().toString();
                        }
                                                values.put("updated", updatedData);
                                
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
    public   BrandVerification get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("BrandVerification", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    BrandVerificationRepository repo = restAdapter.createRepository(BrandVerificationRepository.class);
                    return (BrandVerification)repo.createObject(hashMap);
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
    public   BrandVerification get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("BrandVerification", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    BrandVerificationRepository repo = restAdapter.createRepository(BrandVerificationRepository.class);
                    return (BrandVerification)repo.createObject(hashMap);
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

                      
                                                            String codeData = "";
                        if(cursor.getString(0) != null){
                          codeData = cursor.getString(0);
                          if(codeData != null){
                            codeData = (String)codeData;
                            hashMap.put("code", codeData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(1) != null){
                          addedData = cursor.getString(1);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(2) != null){
                          updatedData = cursor.getString(2);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(3) != null){
                          idData = cursor.getString(3);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String brandIdData = "";
                        if(cursor.getString(4) != null){
                          brandIdData = cursor.getString(4);
                          if(brandIdData != null){
                            brandIdData = brandIdData.toString();
                            hashMap.put("brandId", brandIdData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, BrandVerification model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<BrandVerification>  getAll__db() {
        DataList<BrandVerification> modelList = new DataList<BrandVerification>();
        // Select All Query
        String selectQuery = "SELECT  * FROM BrandVerification";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    BrandVerificationRepository repo = restAdapter.createRepository(BrandVerificationRepository.class);
                    modelList.add((BrandVerification)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<BrandVerification>) modelList;
    }


    // Getting All Data where
    public DataList<BrandVerification>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<BrandVerification> modelList = new DataList<BrandVerification>();
        // Select All Query
        String selectQuery = "SELECT  * FROM BrandVerification WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    BrandVerificationRepository repo = restAdapter.createRepository(BrandVerificationRepository.class);
                    modelList.add((BrandVerification)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<BrandVerification>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM BrandVerification WHERE " + whereKey +"='"+ whereKeyValue + "'" ;
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
        db.update("BrandVerification", values, "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(String whereKey, String whereKeyValue) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("BrandVerification", "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Updating single contact
    public void update__db(String id,   BrandVerification modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        db.update("BrandVerification", values, "id = ?",
                new String[] { id });
        db.close();
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        db.update("BrandVerification", values, "_DATA_UPDATED = 1", null);
        db.close();
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete("BrandVerification", "_DATA_UPDATED = 0", null);
      db.close();
    }

}
