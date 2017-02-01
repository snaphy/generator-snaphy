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


    public void insert__db (String id, RoleMapping modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(RoleMapping modelData){
      ContentValues values = new ContentValues();
                       
                                                            String idData;
                        if(modelData.getId() != null){
                          idData =modelData.getId().toString();
                        }
                                                values.put("id", idData);
                                
                                                            String principalTypeData;
                        if(modelData.getPrincipalType() != null){
                          principalTypeData = modelData.getPrincipalType().toString();
                        }
                                                values.put("principalType", principalTypeData);
                                
                                                            String principalIdData;
                        if(modelData.getPrincipalId() != null){
                          principalIdData =modelData.getPrincipalId().toString();
                        }
                                                values.put("principalId", principalIdData);
                                
                                                            String roleIdData;
                        if(modelData.getRoleId() != null){
                          roleIdData =modelData.getRoleId().toString();
                        }
                                                values.put("roleId", roleIdData);
                  
        return values;
    }



    // Getting single cont
    public   RoleMapping get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("RoleMapping", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

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

    } //get__db



    private HashMap<String, Object> parseCursor(Cursor cursor ){
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
                                                
                    
        return chatHashMap;
    }//parseCursor



    public void upsert__db(String id, RoleMapping model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<RoleMapping>  getAll__db() {
        DataList<RoleMapping> modelList = new DataList<RoleMapping>();
        // Select All Query
        String selectQuery = "SELECT  * FROM RoleMapping";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                    modelList.add((RoleMapping)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<RoleMapping>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   RoleMapping modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update(TABLE, values, KEY_ID + " = ?",
                new String[] { id });
    }








}
