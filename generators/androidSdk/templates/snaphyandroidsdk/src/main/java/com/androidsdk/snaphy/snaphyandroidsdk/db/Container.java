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



public class ContainerDb extends DbHandler<Container, ContainerRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "Container", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
    
        
        
    
    
    String CREATE_Container_TABLE = tableQuery;
    db.execSQL(CREATE_Container_TABLE);
  }
}
