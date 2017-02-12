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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Chat;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class ChatDb extends DbHandler<Chat, ChatRepository> {
  public ChatDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, "Chat", DATABASE_NAME, restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                                                                                                 
    String CREATE_Chat_TABLE = "CREATE TABLE IF NOT EXISTS Chat (  added TEXT, updated TEXT, message TEXT, type TEXT, image TEXT, from TEXT, guid TEXT, status TEXT, id TEXT PRIMARY KEY, appUserId TEXT, brandId TEXT)";
    db.execSQL(CREATE_Chat_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS Chat");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, Chat modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("Chat", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(Chat modelData){
      ContentValues values = new ContentValues();
                       
                                                            String addedData = "";
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
                                                            String updatedData = "";
                        if(modelData.getUpdated() != null){
                          updatedData = modelData.getUpdated().toString();
                        }
                                                values.put("updated", updatedData);
                                
                                                            String messageData = "";
                        if(modelData.getMessage() != null){
                          messageData = modelData.getMessage().toString();
                        }
                                                values.put("message", messageData);
                                
                                                            String typeData = "";
                        if(modelData.getType() != null){
                          typeData = modelData.getType().toString();
                        }
                                                values.put("type", typeData);
                                
                                                            String imageData = "";
                        if(modelData.getImage() != null){
                          imageData = new Gson().toJson(modelData.getImage(), HashMap.class);
                        }
                                                values.put("image", imageData);
                                
                                                            String fromData = "";
                        if(modelData.getFrom() != null){
                          fromData = modelData.getFrom().toString();
                        }
                                                values.put("from", fromData);
                                
                                                            String guidData = "";
                        if(modelData.getGuid() != null){
                          guidData = modelData.getGuid().toString();
                        }
                                                values.put("guid", guidData);
                                
                                                            String statusData = "";
                        if(modelData.getStatus() != null){
                          statusData = modelData.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
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
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String appUserIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getAppUserId");
                              if(method.invoke(modelData) != null){
                                //appUserIdData = modelData.getAppUserId().toString();
                                appUserIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("appUserId", appUserIdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String brandIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getBrandId");
                              if(method.invoke(modelData) != null){
                                //brandIdData = modelData.getBrandId().toString();
                                brandIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("brandId", brandIdData);
                  
        return values;
    }



    // Getting single c
    public   Chat get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Chat", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                    return (Chat)repo.createObject(hashMap);
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
    public   Chat get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Chat", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                    return (Chat)repo.createObject(hashMap);
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

                      
                                                            String addedData = "";
                        if(cursor.getString(0) != null){
                          addedData = cursor.getString(0);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(1) != null){
                          updatedData = cursor.getString(1);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String messageData = "";
                        if(cursor.getString(2) != null){
                          messageData = cursor.getString(2);
                          if(messageData != null){
                            messageData = (String)messageData;
                            hashMap.put("message", messageData);
                          }
                        }
                                                
                                
                                                            String typeData = "";
                        if(cursor.getString(3) != null){
                          typeData = cursor.getString(3);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> imageData = new HashMap<>();
                        if(cursor.getString(4) != null){
                          imageData = new Gson().fromJson(cursor.getString(4), Map.class);
                          if(imageData != null){
                            imageData = (Map<String, Object>)imageData;
                            hashMap.put("image", imageData);
                          }
                        }
                                                
                                
                                                            String fromData = "";
                        if(cursor.getString(5) != null){
                          fromData = cursor.getString(5);
                          if(fromData != null){
                            fromData = (String)fromData;
                            hashMap.put("from", fromData);
                          }
                        }
                                                
                                
                                                            String guidData = "";
                        if(cursor.getString(6) != null){
                          guidData = cursor.getString(6);
                          if(guidData != null){
                            guidData = (String)guidData;
                            hashMap.put("guid", guidData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(7) != null){
                          statusData = cursor.getString(7);
                          if(statusData != null){
                            statusData = (String)statusData;
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(8) != null){
                          idData = cursor.getString(8);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String appUserIdData = "";
                        if(cursor.getString(9) != null){
                          appUserIdData = cursor.getString(9);
                          if(appUserIdData != null){
                            appUserIdData = appUserIdData.toString();
                            hashMap.put("appUserId", appUserIdData);
                          }
                        }
                                                
                                
                                                            String brandIdData = "";
                        if(cursor.getString(10) != null){
                          brandIdData = cursor.getString(10);
                          if(brandIdData != null){
                            brandIdData = brandIdData.toString();
                            hashMap.put("brandId", brandIdData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Chat model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Chat>  getAll__db() {
        DataList<Chat> modelList = new DataList<Chat>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Chat";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                    modelList.add((Chat)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Chat>) modelList;
    }


    // Getting All Data where
    public DataList<Chat>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Chat> modelList = new DataList<Chat>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Chat WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                    modelList.add((Chat)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Chat>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   Chat modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("Chat", values, "id = ?",
                new String[] { id });
    }

}
