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
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
    
    String CREATE_FacebookAccessToken_TABLE = tableQuery;
    db.execSQL(CREATE_FacebookAccessToken_TABLE);
  }
}
