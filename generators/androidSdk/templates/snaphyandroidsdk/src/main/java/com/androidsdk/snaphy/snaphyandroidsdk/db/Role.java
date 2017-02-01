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
                           
                           
                           
                           
                           
        
    String CREATE_Role_TABLE = "CREATE TABLE  Role IF NOT EXISTS (  id TEXT PRIMARY KEY, name TEXT, description TEXT, created TEXT, modified TEXT)";
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
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   Role get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Role", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = new HashMap<>();

                                      
                                                                                    String idData;
                                if(cursor.getString(0) != null){
                                  idData = cursor.getString(0);
                                  if(idData != null){
                                    idData = (Object)idData;
                                    chatHashMap.put("id", idData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String nameData;
                                if(cursor.getString(1) != null){
                                  nameData = cursor.getString(1);
                                  if(nameData != null){
                                    nameData = (String)nameData;
                                    chatHashMap.put("name", nameData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String descriptionData;
                                if(cursor.getString(2) != null){
                                  descriptionData = cursor.getString(2);
                                  if(descriptionData != null){
                                    descriptionData = (Object)descriptionData;
                                    chatHashMap.put("description", descriptionData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String createdData;
                                if(cursor.getString(3) != null){
                                  createdData = cursor.getString(3);
                                  if(createdData != null){
                                    createdData = (Object)createdData;
                                    chatHashMap.put("created", createdData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String modifiedData;
                                if(cursor.getString(4) != null){
                                  modifiedData = cursor.getString(4);
                                  if(modifiedData != null){
                                    modifiedData = (Object)modifiedData;
                                    chatHashMap.put("modified", modifiedData);
                                  }
                                }
                                                                        
                                    

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        RoleRepository repo = restAdapter.createRepository(RoleRepository.class);
                        return (Role)repo.createObject(chatHashMap);
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