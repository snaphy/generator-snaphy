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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Brand;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class BrandDb{

    // All Static variables


    RestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";
    private Context context;
    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;

  public BrandDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Brand";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }

  /**
      // Creating Tables
      @Override
      public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        
        String CREATE_Brand_TABLE = "CREATE TABLE IF NOT EXISTS Brand(  added TEXT, updated TEXT, name TEXT, image TEXT, trending TEXT, facebookUrl TEXT, googleUrl TEXT, instagramUrl TEXT, status TEXT, associatedEmail TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
        db.execSQL(CREATE_Brand_TABLE);
      }

        // Upgrading database
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS Brand");
                // Create tables again
                onCreate(db);
        }
    **/

    public void insert__db (final String id, final Brand modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("Brand", null, values);
                db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(Brand modelData){
      ContentValues values = new ContentValues();
                       
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
                                
                                                            String nameData = "";
                        if(modelData.getName() != null){
                          nameData = modelData.getName().toString();
                        }
                                                values.put("name", nameData);
                                
                                                            String imageData = "";
                        if(modelData.getImage() != null){
                          imageData = new Gson().toJson(modelData.getImage(), HashMap.class);
                        }
                                                values.put("image", imageData);
                                
                                                            String trendingData = "";
                        if(modelData.getTrending() != null){
                          trendingData = modelData.getTrending().toString();
                        }
                                                values.put("trending", trendingData);
                                
                                                            String facebookUrlData = "";
                        if(modelData.getFacebookUrl() != null){
                          facebookUrlData = modelData.getFacebookUrl().toString();
                        }
                                                values.put("facebookUrl", facebookUrlData);
                                
                                                            String googleUrlData = "";
                        if(modelData.getGoogleUrl() != null){
                          googleUrlData = modelData.getGoogleUrl().toString();
                        }
                                                values.put("googleUrl", googleUrlData);
                                
                                                            String instagramUrlData = "";
                        if(modelData.getInstagramUrl() != null){
                          instagramUrlData = modelData.getInstagramUrl().toString();
                        }
                                                values.put("instagramUrl", instagramUrlData);
                                
                                                            String statusData = "";
                        if(modelData.getStatus() != null){
                          statusData = modelData.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
                                                            String associatedEmailData = "";
                        if(modelData.getAssociatedEmail() != null){
                          associatedEmailData = modelData.getAssociatedEmail().toString();
                        }
                                                values.put("associatedEmail", associatedEmailData);
                                
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
    public   Brand get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Brand", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    db.close(); // Closing database connection
                    if (hashMap != null) {
                        BrandRepository repo = restAdapter.createRepository(BrandRepository.class);
                        repo.addStorage(context);
                        return (Brand)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
                }

            } else {
                return null;
            }
        } else {
            return null;
        }

    } //get__db




    // Getting single cont
    public   Brand get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Brand", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    db.close(); // Closing database connection

                    if (hashMap != null) {
                        BrandRepository repo = restAdapter.createRepository(BrandRepository.class);
                        repo.addStorage(context);
                        return (Brand)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
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
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(1) != null){
                          updatedData = cursor.getString(1);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String nameData = "";
                        if(cursor.getString(2) != null){
                          nameData = cursor.getString(2);
                          if(nameData != null){
                            nameData = (String)nameData;
                            hashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> imageData = new HashMap<>();
                        if(cursor.getString(3) != null){
                          imageData = new Gson().fromJson(cursor.getString(3), Map.class);
                          if(imageData != null){
                            imageData = (Map<String, Object>)imageData;
                            hashMap.put("image", imageData);
                          }
                        }
                                                
                                
                                                            String trendingData = "";
                        if(cursor.getString(4) != null){
                          trendingData = cursor.getString(4);
                          if(trendingData != null){
                            trendingData = (String)trendingData;
                            hashMap.put("trending", trendingData);
                          }
                        }
                                                
                                
                                                            String facebookUrlData = "";
                        if(cursor.getString(5) != null){
                          facebookUrlData = cursor.getString(5);
                          if(facebookUrlData != null){
                            facebookUrlData = (String)facebookUrlData;
                            hashMap.put("facebookUrl", facebookUrlData);
                          }
                        }
                                                
                                
                                                            String googleUrlData = "";
                        if(cursor.getString(6) != null){
                          googleUrlData = cursor.getString(6);
                          if(googleUrlData != null){
                            googleUrlData = (String)googleUrlData;
                            hashMap.put("googleUrl", googleUrlData);
                          }
                        }
                                                
                                
                                                            String instagramUrlData = "";
                        if(cursor.getString(7) != null){
                          instagramUrlData = cursor.getString(7);
                          if(instagramUrlData != null){
                            instagramUrlData = (String)instagramUrlData;
                            hashMap.put("instagramUrl", instagramUrlData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(8) != null){
                          statusData = cursor.getString(8);
                          if(statusData != null){
                            statusData = (String)statusData;
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String associatedEmailData = "";
                        if(cursor.getString(9) != null){
                          associatedEmailData = cursor.getString(9);
                          if(associatedEmailData != null){
                            associatedEmailData = (String)associatedEmailData;
                            hashMap.put("associatedEmail", associatedEmailData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(10) != null){
                          idData = cursor.getString(10);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Brand model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Brand>  getAll__db() {
        DataList<Brand> modelList = new DataList<Brand>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Brand";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
            return (DataList<Brand>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    BrandRepository repo = restAdapter.createRepository(BrandRepository.class);
                    repo.addStorage(context);
                    modelList.add((Brand)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Brand>) modelList;
    }


    // Getting All Data where
    public DataList<Brand>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Brand> modelList = new DataList<Brand>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Brand WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
            return (DataList<Brand>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    BrandRepository repo = restAdapter.createRepository(BrandRepository.class);
                    repo.addStorage(context);
                    modelList.add((Brand)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Brand>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM Brand WHERE " + whereKey +"='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("Brand", values, "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("Brand", "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Updating single contact
    public void update__db(final String id,   final Brand modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("Brand", values, "id = ?",
                        new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("Brand", values, "_DATA_UPDATED = 1", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Delete Old data
    public void deleteOldData__db() {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("Brand", "_DATA_UPDATED = 0", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Getting contacts Count
    public int count__db() {
        String countQuery = "SELECT  * FROM " + TABLE;
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
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
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }



    // Deleting by id
    public void delete__db(final String id) {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, KEY_ID + " = ?",
                new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();
    }

    public void reset__db(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE,null,null);
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }

}
