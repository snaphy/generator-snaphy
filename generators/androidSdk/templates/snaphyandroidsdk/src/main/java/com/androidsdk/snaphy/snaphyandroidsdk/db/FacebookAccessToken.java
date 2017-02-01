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



public class FacebookAccessTokenDb extends DbHandler<FacebookAccessToken, FacebookAccessTokenRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "FacebookAccessToken", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                           
                           
                           
                           
                           
                           
        
    String CREATE_FacebookAccessToken_TABLE = "CREATE TABLE  FacebookAccessToken IF NOT EXISTS (  FbUserId TEXT, token TEXT, expires TEXT, userId TEXT, type TEXT, appUserId TEXT)";
    db.execSQL(CREATE_FacebookAccessToken_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS FacebookAccessToken");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, FacebookAccessToken model) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String FbUserIdData;
                        if(model.getFbUserId() != null){
                          FbUserIdData = model.getFbUserId().toString();
                        }
                                                values.put("FbUserId", FbUserIdData);
                                
                                                            String tokenData;
                        if(model.getToken() != null){
                          tokenData = model.getToken().toString();
                        }
                                                values.put("token", tokenData);
                                
                                                            String expiresData;
                        if(model.getExpires() != null){
                          expiresData = model.getExpires().toString();
                        }
                                                values.put("expires", expiresData);
                                
                                                            String userIdData;
                        if(model.getUserId() != null){
                          userIdData = model.getUserId().toString();
                        }
                                                values.put("userId", userIdData);
                                
                                                            String typeData;
                        if(model.getType() != null){
                          typeData = model.getType().toString();
                        }
                                                values.put("type", typeData);
                                
                                                            String appUserIdData;
                        if(model.getAppUserId() != null){
                          appUserIdData = model.getAppUserId().toString();
                        }
                                                values.put("appUserId", appUserIdData);
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   FacebookAccessToken get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("FacebookAccessToken", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = new HashMap<>();

                                      
                                                                                    String FbUserIdData;
                                if(cursor.getString(0) != null){
                                  FbUserIdData = cursor.getString(0);
                                  if(FbUserIdData != null){
                                    FbUserIdData = (String)FbUserIdData;
                                    chatHashMap.put("FbUserId", FbUserIdData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String tokenData;
                                if(cursor.getString(1) != null){
                                  tokenData = cursor.getString(1);
                                  if(tokenData != null){
                                    tokenData = (String)tokenData;
                                    chatHashMap.put("token", tokenData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String expiresData;
                                if(cursor.getString(2) != null){
                                  expiresData = cursor.getString(2);
                                  if(expiresData != null){
                                    expiresData = (String)expiresData;
                                    chatHashMap.put("expires", expiresData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String userIdData;
                                if(cursor.getString(3) != null){
                                  userIdData = cursor.getString(3);
                                  if(userIdData != null){
                                    userIdData = (Object)userIdData;
                                    chatHashMap.put("userId", userIdData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String typeData;
                                if(cursor.getString(4) != null){
                                  typeData = cursor.getString(4);
                                  if(typeData != null){
                                    typeData = (String)typeData;
                                    chatHashMap.put("type", typeData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String appUserIdData;
                                if(cursor.getString(5) != null){
                                  appUserIdData = cursor.getString(5);
                                  if(appUserIdData != null){
                                    appUserIdData = (Object)appUserIdData;
                                    chatHashMap.put("appUserId", appUserIdData);
                                  }
                                }
                                                                        
                                    

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        FacebookAccessTokenRepository repo = restAdapter.createRepository(FacebookAccessTokenRepository.class);
                        return (FacebookAccessToken)repo.createObject(chatHashMap);
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