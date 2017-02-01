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



public class RoleMappingDb extends DbHandler<RoleMapping, RoleMappingRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "RoleMapping", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                           
                           
                           
                           
        
    String CREATE_RoleMapping_TABLE = "CREATE TABLE  RoleMapping IF NOT EXISTS (  id TEXT PRIMARY KEY, principalType TEXT, principalId TEXT, roleId TEXT)";
    db.execSQL(CREATE_RoleMapping_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS RoleMapping");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, RoleMapping model) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String idData;
                        if(model.getId() != null){
                          idData = model.getId().toString();
                        }
                                                values.put("id", idData);
                                
                                                            String principalTypeData;
                        if(model.getPrincipalType() != null){
                          principalTypeData = model.getPrincipalType().toString();
                        }
                                                values.put("principalType", principalTypeData);
                                
                                                            String principalIdData;
                        if(model.getPrincipalId() != null){
                          principalIdData = model.getPrincipalId().toString();
                        }
                                                values.put("principalId", principalIdData);
                                
                                                            String roleIdData;
                        if(model.getRoleId() != null){
                          roleIdData = model.getRoleId().toString();
                        }
                                                values.put("roleId", roleIdData);
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   RoleMapping get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("RoleMapping", null, "id=?", new String[]{id}, null, null, null, null);
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
                                                                        
                                                        
                                                                                    String principalTypeData;
                                if(cursor.getString(1) != null){
                                  principalTypeData = cursor.getString(1);
                                  if(principalTypeData != null){
                                    principalTypeData = (String)principalTypeData;
                                    chatHashMap.put("principalType", principalTypeData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String principalIdData;
                                if(cursor.getString(2) != null){
                                  principalIdData = cursor.getString(2);
                                  if(principalIdData != null){
                                    principalIdData = (Object)principalIdData;
                                    chatHashMap.put("principalId", principalIdData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String roleIdData;
                                if(cursor.getString(3) != null){
                                  roleIdData = cursor.getString(3);
                                  if(roleIdData != null){
                                    roleIdData = (Object)roleIdData;
                                    chatHashMap.put("roleId", roleIdData);
                                  }
                                }
                                                                        
                                    

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                        return (RoleMapping)repo.createObject(chatHashMap);
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