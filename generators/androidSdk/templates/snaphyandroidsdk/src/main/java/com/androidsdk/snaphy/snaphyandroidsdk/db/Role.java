package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
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


    public void insert__db (String id, Role modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("Role", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(Role modelData){
      ContentValues values = new ContentValues();
                       
                                                            String idData = "";
                        if(modelData.getId() != null){
                          idData =modelData.getId().toString();
                        }
                                                values.put("id", idData);
                                
                                                            String nameData = "";
                        if(modelData.getName() != null){
                          nameData = modelData.getName().toString();
                        }
                                                values.put("name", nameData);
                                
                                                            String descriptionData = "";
                        if(modelData.getDescription() != null){
                          descriptionData =modelData.getDescription().toString();
                        }
                                                values.put("description", descriptionData);
                                
                                                            String createdData = "";
                        if(modelData.getCreated() != null){
                          createdData =modelData.getCreated().toString();
                        }
                                                values.put("created", createdData);
                                
                                                            String modifiedData = "";
                        if(modelData.getModified() != null){
                          modifiedData =modelData.getModified().toString();
                        }
                                                values.put("modified", modifiedData);
                  
        return values;
    }



    // Getting single cont
    public   Role get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Role", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                
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

    } //get__db



    private HashMap<String, Object> parseCursor(Cursor cursor ){
      HashMap<String, Object> chatHashMap = new HashMap<>();

                      
                                                            String idData = "";
                        if(cursor.getString(0) != null){
                          idData = cursor.getString(0);
                          if(idData != null){
                            idData = idData.toString();
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String nameData = "";
                        if(cursor.getString(1) != null){
                          nameData = cursor.getString(1);
                          if(nameData != null){
                            nameData = (String)nameData;
                            chatHashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            String descriptionData = "";
                        if(cursor.getString(2) != null){
                          descriptionData = cursor.getString(2);
                          if(descriptionData != null){
                            descriptionData = descriptionData.toString();
                            chatHashMap.put("description", descriptionData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(3) != null){
                          createdData = cursor.getString(3);
                          if(createdData != null){
                            createdData = createdData.toString();
                            chatHashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String modifiedData = "";
                        if(cursor.getString(4) != null){
                          modifiedData = cursor.getString(4);
                          if(modifiedData != null){
                            modifiedData = modifiedData.toString();
                            chatHashMap.put("modified", modifiedData);
                          }
                        }
                                                
                    
        return chatHashMap;
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
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    RoleRepository repo = restAdapter.createRepository(RoleRepository.class);
                    modelList.add((Role)repo.createObject(chatHashMap));
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

}
