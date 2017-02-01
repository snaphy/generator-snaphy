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
                                                                                                                                
    String CREATE_FacebookAccessToken_TABLE = "CREATE TABLE  FacebookAccessToken IF NOT EXISTS ( id TEXT PRIMARY KEY, FbUserId TEXT, token TEXT, expires TEXT, userId TEXT, type TEXT, appUserId TEXT)";
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
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

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
                  
        if(model.getId() != null){
            values.put("id", model.getId().toString());
        }
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



}
