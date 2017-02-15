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

import com.androidsdk.snaphy.snaphyandroidsdk.models.HotDeal;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.HotDealRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class HotDealDb extends SQLiteOpenHelper {

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

  public HotDealDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, "HotDeal", DATABASE_NAME, restAdapter);
    TABLE = "HotDeal";
    this.DATABASE_NAME = DATABASE_NAME;
    //this.create__db();
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                                                                                                                        
    
    String CREATE_HotDeal_TABLE = "CREATE TABLE IF NOT EXISTS HotDeal (  title TEXT, description TEXT, image TEXT, url TEXT, price NUMBER, status TEXT, expiryDate TEXT, added TEXT, updated TEXT, id TEXT PRIMARY KEY, categoryId TEXT, brandId TEXT, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_HotDeal_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS HotDeal");
            // Create tables again
            onCreate(db);
    }



    private void create__db () {
        SQLiteDatabase db = this.getWritableDatabase();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        
        String CREATE_HotDeal_TABLE = "CREATE TABLE IF NOT EXISTS HotDeal (  title TEXT, description TEXT, image TEXT, url TEXT, price NUMBER, status TEXT, expiryDate TEXT, added TEXT, updated TEXT, id TEXT PRIMARY KEY, categoryId TEXT, brandId TEXT, _DATA_UPDATED NUMBER )";
        db.execSQL(CREATE_HotDeal_TABLE);
        db.close(); // Closing database connection
    }



    public void insert__db (String id, HotDeal modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("HotDeal", null, values);
        db.close(); // Closing database connection
    }





    public ContentValues getContentValues(HotDeal modelData){
      ContentValues values = new ContentValues();
                       
                                                            String titleData = "";
                        if(modelData.getTitle() != null){
                          titleData = modelData.getTitle().toString();
                        }
                                                values.put("title", titleData);
                                
                                                            String descriptionData = "";
                        if(modelData.getDescription() != null){
                          descriptionData = modelData.getDescription().toString();
                        }
                                                values.put("description", descriptionData);
                                
                                                            String imageData = "";
                        if(modelData.getImage() != null){
                          imageData = new Gson().toJson(modelData.getImage(), HashMap.class);
                        }
                                                values.put("image", imageData);
                                
                                                            String urlData = "";
                        if(modelData.getUrl() != null){
                          urlData = modelData.getUrl().toString();
                        }
                                                values.put("url", urlData);
                                
                                                            double priceData;
                        priceData = (double)modelData.getPrice();
                                                values.put("price", priceData);
                                
                                                            String statusData = "";
                        if(modelData.getStatus() != null){
                          statusData = modelData.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
                                                            String expiryDateData = "";
                        if(modelData.getExpiryDate() != null){
                          expiryDateData = modelData.getExpiryDate().toString();
                        }
                                                values.put("expiryDate", expiryDateData);
                                
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
                        String categoryIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getCategoryId");
                              if(method.invoke(modelData) != null){
                                //categoryIdData = modelData.getCategoryId().toString();
                                categoryIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("categoryId", categoryIdData);
                                
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
    public   HotDeal get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("HotDeal", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    HotDealRepository repo = restAdapter.createRepository(HotDealRepository.class);
                    return (HotDeal)repo.createObject(hashMap);
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
    public   HotDeal get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("HotDeal", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    HotDealRepository repo = restAdapter.createRepository(HotDealRepository.class);
                    return (HotDeal)repo.createObject(hashMap);
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

                      
                                                            String titleData = "";
                        if(cursor.getString(0) != null){
                          titleData = cursor.getString(0);
                          if(titleData != null){
                            titleData = (String)titleData;
                            hashMap.put("title", titleData);
                          }
                        }
                                                
                                
                                                            String descriptionData = "";
                        if(cursor.getString(1) != null){
                          descriptionData = cursor.getString(1);
                          if(descriptionData != null){
                            descriptionData = (String)descriptionData;
                            hashMap.put("description", descriptionData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> imageData = new HashMap<>();
                        if(cursor.getString(2) != null){
                          imageData = new Gson().fromJson(cursor.getString(2), Map.class);
                          if(imageData != null){
                            imageData = (Map<String, Object>)imageData;
                            hashMap.put("image", imageData);
                          }
                        }
                                                
                                
                                                            String urlData = "";
                        if(cursor.getString(3) != null){
                          urlData = cursor.getString(3);
                          if(urlData != null){
                            urlData = (String)urlData;
                            hashMap.put("url", urlData);
                          }
                        }
                                                
                                
                                                            double priceData = (double)0;
                          priceData = cursor.getInt(4);
                          priceData = (double)priceData;
                          hashMap.put("price", priceData);


                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(5) != null){
                          statusData = cursor.getString(5);
                          if(statusData != null){
                            statusData = (String)statusData;
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String expiryDateData = "";
                        if(cursor.getString(6) != null){
                          expiryDateData = cursor.getString(6);
                          if(expiryDateData != null){
                            expiryDateData = (String)expiryDateData;
                            hashMap.put("expiryDate", expiryDateData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(7) != null){
                          addedData = cursor.getString(7);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(8) != null){
                          updatedData = cursor.getString(8);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(9) != null){
                          idData = cursor.getString(9);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String categoryIdData = "";
                        if(cursor.getString(10) != null){
                          categoryIdData = cursor.getString(10);
                          if(categoryIdData != null){
                            categoryIdData = categoryIdData.toString();
                            hashMap.put("categoryId", categoryIdData);
                          }
                        }
                                                
                                
                                                            String brandIdData = "";
                        if(cursor.getString(11) != null){
                          brandIdData = cursor.getString(11);
                          if(brandIdData != null){
                            brandIdData = brandIdData.toString();
                            hashMap.put("brandId", brandIdData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, HotDeal model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<HotDeal>  getAll__db() {
        DataList<HotDeal> modelList = new DataList<HotDeal>();
        // Select All Query
        String selectQuery = "SELECT  * FROM HotDeal";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    HotDealRepository repo = restAdapter.createRepository(HotDealRepository.class);
                    modelList.add((HotDeal)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<HotDeal>) modelList;
    }


    // Getting All Data where
    public DataList<HotDeal>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<HotDeal> modelList = new DataList<HotDeal>();
        // Select All Query
        String selectQuery = "SELECT  * FROM HotDeal WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    HotDealRepository repo = restAdapter.createRepository(HotDealRepository.class);
                    modelList.add((HotDeal)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<HotDeal>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM HotDeal WHERE " + whereKey +"='"+ whereKeyValue + "'" ;
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
        db.update("HotDeal", values, "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(String whereKey, String whereKeyValue) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("HotDeal", "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Updating single contact
    public void update__db(String id,   HotDeal modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        db.update("HotDeal", values, "id = ?",
                new String[] { id });
        db.close();
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        db.update("HotDeal", values, "_DATA_UPDATED = 1", null);
        db.close();
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete("HotDeal", "_DATA_UPDATED = 0", null);
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
