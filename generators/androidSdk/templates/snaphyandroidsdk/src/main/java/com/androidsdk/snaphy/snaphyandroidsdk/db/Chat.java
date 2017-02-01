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
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
        
    String CREATE_Chat_TABLE = "CREATE TABLE  Chat IF NOT EXISTS (  added TEXT, updated TEXT, message TEXT, type TEXT, image TEXT, from TEXT, guid TEXT, status TEXT, id TEXT PRIMARY KEY, appUserId TEXT, brandId TEXT)";
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
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   Chat get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Chat", null, "id=?", new String[]{id}, null, null, null, null);
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
                                                                        
                                                        
                                                                                    String messageData;
                                if(cursor.getString(2) != null){
                                  messageData = cursor.getString(2);
                                  if(messageData != null){
                                    messageData = (String)messageData;
                                    chatHashMap.put("message", messageData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String typeData;
                                if(cursor.getString(3) != null){
                                  typeData = cursor.getString(3);
                                  if(typeData != null){
                                    typeData = (String)typeData;
                                    chatHashMap.put("type", typeData);
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
                                                                        
                                                        
                                                                                    String fromData;
                                if(cursor.getString(5) != null){
                                  fromData = cursor.getString(5);
                                  if(fromData != null){
                                    fromData = (String)fromData;
                                    chatHashMap.put("from", fromData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String guidData;
                                if(cursor.getString(6) != null){
                                  guidData = cursor.getString(6);
                                  if(guidData != null){
                                    guidData = (String)guidData;
                                    chatHashMap.put("guid", guidData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String statusData;
                                if(cursor.getString(7) != null){
                                  statusData = cursor.getString(7);
                                  if(statusData != null){
                                    statusData = (String)statusData;
                                    chatHashMap.put("status", statusData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String idData;
                                if(cursor.getString(8) != null){
                                  idData = cursor.getString(8);
                                  if(idData != null){
                                    idData = (Object)idData;
                                    chatHashMap.put("id", idData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String appUserIdData;
                                if(cursor.getString(9) != null){
                                  appUserIdData = cursor.getString(9);
                                  if(appUserIdData != null){
                                    appUserIdData = (Object)appUserIdData;
                                    chatHashMap.put("appUserId", appUserIdData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String brandIdData;
                                if(cursor.getString(10) != null){
                                  brandIdData = cursor.getString(10);
                                  if(brandIdData != null){
                                    brandIdData = (Object)brandIdData;
                                    chatHashMap.put("brandId", brandIdData);
                                  }
                                }
                                                                        
                                    

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                        return (Chat)repo.createObject(chatHashMap);
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
