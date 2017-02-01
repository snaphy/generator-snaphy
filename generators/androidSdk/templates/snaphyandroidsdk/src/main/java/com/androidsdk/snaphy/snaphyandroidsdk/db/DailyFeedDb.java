package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.DailyFeed;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.DailyFeedRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class DailyFeedDb extends DbHandler<DailyFeed, DailyFeedRepository> {
  public DailyFeedDb(Context context, RestAdapter restAdapter){
    super(context, "DailyFeed", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                     
    String CREATE_DailyFeed_TABLE = "CREATE TABLE  DailyFeed IF NOT EXISTS (  added TEXT, updated TEXT, title TEXT, description TEXT, image TEXT, id TEXT PRIMARY KEY, brandId TEXT)";
    db.execSQL(CREATE_DailyFeed_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS DailyFeed");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, DailyFeed modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("DailyFeed", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(DailyFeed modelData){
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
                                
                                                            String idData = "";
                        if(modelData.getId() != null){
                          idData =modelData.getId().toString();
                        }
                                                values.put("id", idData);
                                
                                                            String brandIdData = "";
                        if(modelData.getBrandId() != null){
                          brandIdData =modelData.getBrandId().toString();
                        }
                                                values.put("brandId", brandIdData);
                  
        return values;
    }



    // Getting single cont
    public   DailyFeed get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("DailyFeed", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                
                if (chatHashMap != null) {
                    DailyFeedRepository repo = restAdapter.createRepository(DailyFeedRepository.class);
                    return (DailyFeed)repo.createObject(chatHashMap);
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
      HashMap<String, Object> chatHashMap = new HashMap<>();

                      
                                                            String addedData = "";
                        if(cursor.getString(0) != null){
                          addedData = cursor.getString(0);
                          if(addedData != null){
                            addedData = (String)addedData;
                            chatHashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(1) != null){
                          updatedData = cursor.getString(1);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            chatHashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String titleData = "";
                        if(cursor.getString(2) != null){
                          titleData = cursor.getString(2);
                          if(titleData != null){
                            titleData = (String)titleData;
                            chatHashMap.put("title", titleData);
                          }
                        }
                                                
                                
                                                            String descriptionData = "";
                        if(cursor.getString(3) != null){
                          descriptionData = cursor.getString(3);
                          if(descriptionData != null){
                            descriptionData = (String)descriptionData;
                            chatHashMap.put("description", descriptionData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> imageData = new HashMap<>();
                        if(cursor.getString(4) != null){
                          imageData = new Gson().fromJson(cursor.getString(4), Map.class);
                          if(imageData != null){
                            imageData = (Map<String, Object>)imageData;
                            chatHashMap.put("image", imageData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(5) != null){
                          idData = cursor.getString(5);
                          if(idData != null){
                            idData = idData.toString();
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String brandIdData = "";
                        if(cursor.getString(6) != null){
                          brandIdData = cursor.getString(6);
                          if(brandIdData != null){
                            brandIdData = brandIdData.toString();
                            chatHashMap.put("brandId", brandIdData);
                          }
                        }
                                                
                    
        return chatHashMap;
    }//parseCursor



    public void upsert__db(String id, DailyFeed model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<DailyFeed>  getAll__db() {
        DataList<DailyFeed> modelList = new DataList<DailyFeed>();
        // Select All Query
        String selectQuery = "SELECT  * FROM DailyFeed";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    DailyFeedRepository repo = restAdapter.createRepository(DailyFeedRepository.class);
                    modelList.add((DailyFeed)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<DailyFeed>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   DailyFeed modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("DailyFeed", values, "id = ?",
                new String[] { id });
    }

}
