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



public class ChatDb extends DbHandler<Chat, ChatRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "Chat", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                    
    String CREATE_Chat_TABLE = "CREATE TABLE  Chat IF NOT EXISTS ( id TEXT PRIMARY KEY, added TEXT, updated TEXT, message TEXT, type TEXT, image TEXT, from TEXT, guid TEXT, status TEXT, id TEXT, appUserId TEXT, brandId TEXT)";
    db.execSQL(CREATE_Chat_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS Chat");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, Chat model) {

        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

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
                                
                                                            String messageData;
                        if(model.getMessage() != null){
                          messageData = model.getMessage().toString();
                        }
                                                values.put("message", messageData);
                                
                                                            String typeData;
                        if(model.getType() != null){
                          typeData = model.getType().toString();
                        }
                                                values.put("type", typeData);
                                
                                                            String imageData;
                        if(model.getImage() != null){
                          imageData = new Gson().toJson(model.getImage(), HashMap.class);
                        }
                                                values.put("image", imageData);
                                
                                                            String fromData;
                        if(model.getFrom() != null){
                          fromData = model.getFrom().toString();
                        }
                                                values.put("from", fromData);
                                
                                                            String guidData;
                        if(model.getGuid() != null){
                          guidData = model.getGuid().toString();
                        }
                                                values.put("guid", guidData);
                                
                                                            String statusData;
                        if(model.getStatus() != null){
                          statusData = model.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
                                                            String idData;
                        if(model.getId() != null){
                          idData = model.getId().toString();
                        }
                                                values.put("id", idData);
                                
                                                            String appUserIdData;
                        if(model.getAppUserId() != null){
                          appUserIdData = model.getAppUserId().toString();
                        }
                                                values.put("appUserId", appUserIdData);
                                
                                                            String brandIdData;
                        if(model.getBrandId() != null){
                          brandIdData = model.getBrandId().toString();
                        }
                                                values.put("brandId", brandIdData);
                  
        if(model.getId() != null){
            values.put("id", model.getId().toString());
        }
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



}
