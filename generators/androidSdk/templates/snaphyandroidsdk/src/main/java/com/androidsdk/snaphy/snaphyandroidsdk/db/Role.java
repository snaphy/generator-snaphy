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



public class RoleDb extends DbHandler<Role, RoleRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "Role", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                            
    String CREATE_Role_TABLE = "CREATE TABLE  Role IF NOT EXISTS ( id TEXT PRIMARY KEY, id TEXT, name TEXT, description TEXT, created TEXT, modified TEXT)";
    db.execSQL(CREATE_Role_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS Role");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, Role model) {

        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String idData;
                        if(model.getId() != null){
                          idData = model.getId().toString();
                        }
                                                values.put("id", idData);
                                
                                                            String nameData;
                        if(model.getName() != null){
                          nameData = model.getName().toString();
                        }
                                                values.put("name", nameData);
                                
                                                            String descriptionData;
                        if(model.getDescription() != null){
                          descriptionData = model.getDescription().toString();
                        }
                                                values.put("description", descriptionData);
                                
                                                            String createdData;
                        if(model.getCreated() != null){
                          createdData = model.getCreated().toString();
                        }
                                                values.put("created", createdData);
                                
                                                            String modifiedData;
                        if(model.getModified() != null){
                          modifiedData = model.getModified().toString();
                        }
                                                values.put("modified", modifiedData);
                  
        if(model.getId() != null){
            values.put("id", model.getId().toString());
        }
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



}
