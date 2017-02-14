package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Role;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.RoleRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class RoleDb extends DbHandler<Role, RoleRepository> {
  public RoleDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, "Role", DATABASE_NAME, restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                           
    
    String CREATE_Role_TABLE = "CREATE TABLE IF NOT EXISTS Role (  id TEXT PRIMARY KEY, name TEXT, description TEXT, created TEXT, modified TEXT, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_Role_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS Role");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, Role modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("Role", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(Role modelData){
      ContentValues values = new ContentValues();
                       
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String idData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getId");
                              if(method.invoke(modelData) != null){
                                //idData = modelData.getId().toString();
                                idData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("id", idData);
                                
                                                            String nameData = "";
                        if(modelData.getName() != null){
                          nameData = modelData.getName().toString();
                        }
                                                values.put("name", nameData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String descriptionData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getDescription");
                              if(method.invoke(modelData) != null){
                                //descriptionData = modelData.getDescription().toString();
                                descriptionData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("description", descriptionData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String createdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getCreated");
                              if(method.invoke(modelData) != null){
                                //createdData = modelData.getCreated().toString();
                                createdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("created", createdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String modifiedData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getModified");
                              if(method.invoke(modelData) != null){
                                //modifiedData = modelData.getModified().toString();
                                modifiedData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("modified", modifiedData);
                  

        //Add the updated data property value to be 1
        values.put("_DATA_UPDATED", 1);
        return values;
    }



    // Getting single c
    public   Role get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Role", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    RoleRepository repo = restAdapter.createRepository(RoleRepository.class);
                    return (Role)repo.createObject(hashMap);
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
    public   Role get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Role", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    RoleRepository repo = restAdapter.createRepository(RoleRepository.class);
                    return (Role)repo.createObject(hashMap);
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
                                                
                                
                                                            String nameData = "";
                        if(cursor.getString(1) != null){
                          nameData = cursor.getString(1);
                          if(nameData != null){
                            nameData = (String)nameData;
                            hashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            String descriptionData = "";
                        if(cursor.getString(2) != null){
                          descriptionData = cursor.getString(2);
                          if(descriptionData != null){
                            descriptionData = descriptionData.toString();
                            hashMap.put("description", descriptionData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(3) != null){
                          createdData = cursor.getString(3);
                          if(createdData != null){
                            createdData = createdData.toString();
                            hashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String modifiedData = "";
                        if(cursor.getString(4) != null){
                          modifiedData = cursor.getString(4);
                          if(modifiedData != null){
                            modifiedData = modifiedData.toString();
                            hashMap.put("modified", modifiedData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Role model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Role>  getAll__db() {
        DataList<Role> modelList = new DataList<Role>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Role";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    RoleRepository repo = restAdapter.createRepository(RoleRepository.class);
                    modelList.add((Role)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Role>) modelList;
    }


    // Getting All Data where
    public DataList<Role>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Role> modelList = new DataList<Role>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Role WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    RoleRepository repo = restAdapter.createRepository(RoleRepository.class);
                    modelList.add((Role)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Role>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   Role modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("Role", values, "id = ?",
                new String[] { id });
    }


    // Updating updated data property to new contact
    public int checkOldData__db() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        return db.update("Role", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete("Role", "_DATA_UPDATED = 0", null);
      db.close();
    }

}
