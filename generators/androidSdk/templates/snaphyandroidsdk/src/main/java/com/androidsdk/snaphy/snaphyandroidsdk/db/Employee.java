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



public class EmployeeDb extends DbHandler<Employee, EmployeeRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "Employee", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
        
        
    
    
    String CREATE_Employee_TABLE = tableQuery;
    db.execSQL(CREATE_Employee_TABLE);
  }
}
