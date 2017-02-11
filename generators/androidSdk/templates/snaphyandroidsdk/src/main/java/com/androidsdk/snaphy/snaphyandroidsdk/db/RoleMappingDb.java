package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
import java.lang.reflect.Method;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.RoleMapping;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.RoleMappingRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class RoleMappingDb extends DbHandler<RoleMapping, RoleMappingRepository> {
  public RoleMappingDb(Context context, RestAdapter restAdapter){
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
        db.insert("RoleMapping", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(RoleMapping modelData){
      ContentValues values = new ContentValues();
                       
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        try {
                              Method method = modelData.getClass().getMethod("getId");
                              String idData = "";
                              if(method.invoke(modelData) != null){
                                //idData = modelData.getId().toString();
                                idData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("id", idData);
                                
                                                            String principalTypeData = "";
                        if(modelData.getPrincipalType() != null){
                          principalTypeData = modelData.getPrincipalType().toString();
                        }
                                                values.put("principalType", principalTypeData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        try {
                              Method method = modelData.getClass().getMethod("getPrincipalId");
                              String principalIdData = "";
                              if(method.invoke(modelData) != null){
                                //principalIdData = modelData.getPrincipalId().toString();
                                principalIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("principalId", principalIdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        try {
                              Method method = modelData.getClass().getMethod("getRoleId");
                              String roleIdData = "";
                              if(method.invoke(modelData) != null){
                                //roleIdData = modelData.getRoleId().toString();
                                roleIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("roleId", roleIdData);
                  
        return values;
    }



    // Getting single c
    public   RoleMapping get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("RoleMapping", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                    return (RoleMapping)repo.createObject(hashMap);
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




    // Getting single cont
    public   RoleMapping get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("RoleMapping", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                    return (RoleMapping)repo.createObject(hashMap);
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
      HashMap<String, Object> hashMap = new HashMap<>();

                      
                                                            String idData = "";
                        if(cursor.getString(0) != null){
                          idData = cursor.getString(0);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String principalTypeData = "";
                        if(cursor.getString(1) != null){
                          principalTypeData = cursor.getString(1);
                          if(principalTypeData != null){
                            principalTypeData = (String)principalTypeData;
                            hashMap.put("principalType", principalTypeData);
                          }
                        }
                                                
                                
                                                            String principalIdData = "";
                        if(cursor.getString(2) != null){
                          principalIdData = cursor.getString(2);
                          if(principalIdData != null){
                            principalIdData = principalIdData.toString();
                            hashMap.put("principalId", principalIdData);
                          }
                        }
                                                
                                
                                                            String roleIdData = "";
                        if(cursor.getString(3) != null){
                          roleIdData = cursor.getString(3);
                          if(roleIdData != null){
                            roleIdData = roleIdData.toString();
                            hashMap.put("roleId", roleIdData);
                          }
                        }
                                                
                  
        return hashMap;
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

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                    modelList.add((RoleMapping)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<RoleMapping>) modelList;
    }


    // Getting All Data where
    public DataList<RoleMapping>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<RoleMapping> modelList = new DataList<RoleMapping>();
        // Select All Query
        String selectQuery = "SELECT  * FROM RoleMapping WHERE " + whereKey +"="+ whereKeyValue ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                    modelList.add((RoleMapping)repo.createObject(hashMap));
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
        return db.update("RoleMapping", values, "id = ?",
                new String[] { id });
    }

}
