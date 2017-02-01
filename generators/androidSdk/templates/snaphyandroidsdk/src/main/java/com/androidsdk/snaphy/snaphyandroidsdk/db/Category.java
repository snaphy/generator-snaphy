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



public class CategoryDb extends DbHandler<Category, CategoryRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "Category", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                        
    String CREATE_Category_TABLE = "CREATE TABLE  Category IF NOT EXISTS ( id TEXT PRIMARY KEY, name TEXT, added TEXT, updated TEXT, id TEXT)";
    db.execSQL(CREATE_Category_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS Category");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, Category model) {

        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String nameData;
                        if(model.getName() != null){
                          nameData = model.getName().toString();
                        }
                                                values.put("name", nameData);
                                
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
                                
                                                            String idData;
                        if(model.getId() != null){
                          idData = model.getId().toString();
                        }
                                                values.put("id", idData);
                  
        if(model.getId() != null){
            values.put("id", model.getId().toString());
        }
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



}
