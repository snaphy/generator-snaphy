package com.androidsdk.snaphy.snaphyandroidsdk.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Chat;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.Repository;
//Import Model
import com.androidsdk.snaphy.snaphyandroidsdk.repository.;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/



public class DailyFeedDb extends DbHandler<DailyFeed, DailyFeedRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
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


    public void insert__db (String id, DailyFeed model) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String addedData;
                        if(model.getAdded() != null){
                          addedData = model.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
                                                            String updatedData;
                        if(model.getUpdated() != null){
                          updatedData = model.getUpdated().toString();
                        }
                                                values.put("updated", updatedData);
                                
                                                            String titleData;
                        if(model.getTitle() != null){
                          titleData = model.getTitle().toString();
                        }
                                                values.put("title", titleData);
                                
                                                            String descriptionData;
                        if(model.getDescription() != null){
                          descriptionData = model.getDescription().toString();
                        }
                                                values.put("description", descriptionData);
                                
                                                            String imageData;
                        if(model.getImage() != null){
                          imageData = new Gson().toJson(model.getImage(), HashMap.class);
                        }
                                                values.put("image", imageData);
                                
                                                            String idData;
                        if(model.getId() != null){
                          idData = model.getId().toString();
                        }
                                                values.put("id", idData);
                                
                                                            String brandIdData;
                        if(model.getBrandId() != null){
                          brandIdData = model.getBrandId().toString();
                        }
                                                values.put("brandId", brandIdData);
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   DailyFeed get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("DailyFeed", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = new HashMap<>();

                                      
                                                                                    String addedData;
                                if(cursor.getString(0) != null){
                                  addedData = cursor.getString(0);
                                  if(addedData != null){
                                    addedData = (String)addedData;
                                    chatHashMap.put("added", addedData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String updatedData;
                                if(cursor.getString(1) != null){
                                  updatedData = cursor.getString(1);
                                  if(updatedData != null){
                                    updatedData = (String)updatedData;
                                    chatHashMap.put("updated", updatedData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String titleData;
                                if(cursor.getString(2) != null){
                                  titleData = cursor.getString(2);
                                  if(titleData != null){
                                    titleData = (String)titleData;
                                    chatHashMap.put("title", titleData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String descriptionData;
                                if(cursor.getString(3) != null){
                                  descriptionData = cursor.getString(3);
                                  if(descriptionData != null){
                                    descriptionData = (String)descriptionData;
                                    chatHashMap.put("description", descriptionData);
                                  }
                                }
                                                                        
                                                        
                                                                                    Map<String, Object> imageData = new Map<>();
                                if(cursor.getString(4) != null){
                                  imageData = new Gson().fromJson(cursor.getString(4), Map.class);
                                  if(imageData != null){
                                    imageData = (Map<String, Object>)imageData;
                                    chatHashMap.put("image", imageData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String idData;
                                if(cursor.getString(5) != null){
                                  idData = cursor.getString(5);
                                  if(idData != null){
                                    idData = (Object)idData;
                                    chatHashMap.put("id", idData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String brandIdData;
                                if(cursor.getString(6) != null){
                                  brandIdData = cursor.getString(6);
                                  if(brandIdData != null){
                                    brandIdData = (Object)brandIdData;
                                    chatHashMap.put("brandId", brandIdData);
                                  }
                                }
                                                                        
                                    

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
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
        } else {
            return null;
        }

    }




}
