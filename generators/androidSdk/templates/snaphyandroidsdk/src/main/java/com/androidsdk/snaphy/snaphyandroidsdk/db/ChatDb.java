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

public class ChatDb{

    // All Static variables
    RestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";
    private Context context;
    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;

  public ChatDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Chat";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Chat modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("Chat", null, values);
                //db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(Chat modelData){
      ContentValues values = new ContentValues();
                       
                                                            String addedData = "";
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                        }
                                                values.put("`added`", addedData);
                                
                                                            String updatedData = "";
                        if(modelData.getUpdated() != null){
                          updatedData = modelData.getUpdated().toString();
                        }
                                                values.put("`updated`", updatedData);
                                
                                                            String messageData = "";
                        if(modelData.getMessage() != null){
                          messageData = modelData.getMessage().toString();
                        }
                                                values.put("`message`", messageData);
                                
                                                            String typeData = "";
                        if(modelData.getType() != null){
                          typeData = modelData.getType().toString();
                        }
                                                values.put("`type`", typeData);
                                
                                                            String imageData = "";
                        if(modelData.getImage() != null){
                          imageData = new Gson().toJson(modelData.getImage(), HashMap.class);
                        }
                                                values.put("`image`", imageData);
                                
                                                            String fromData = "";
                        if(modelData.getFrom() != null){
                          fromData = modelData.getFrom().toString();
                        }
                                                values.put("`from`", fromData);
                                
                                                            String guidData = "";
                        if(modelData.getGuid() != null){
                          guidData = modelData.getGuid().toString();
                        }
                                                values.put("`guid`", guidData);
                                
                                                            String statusData = "";
                        if(modelData.getStatus() != null){
                          statusData = modelData.getStatus().toString();
                        }
                                                values.put("`status`", statusData);
                                
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

                                                values.put("`id`", idData);
                                
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

                                                values.put("`appUserId`", appUserIdData);
                                
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

                                                values.put("`brandId`", brandIdData);
                  

        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Chat get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Chat", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                        repo.addStorage(context);
                        return (Chat)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
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
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Chat", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                        repo.addStorage(context);
                        return (Chat)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
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

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Chat>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                    repo.addStorage(context);
                    modelList.add((Chat)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Chat>) modelList;
    }



    public String getWhereQuery(HashMap<String, Object> whereKeyValue){
        //Prepare where key value
        String where = "";
        if(whereKeyValue.size() > 0){
            where = where +  " WHERE ";
        }
        where = where + getWhere(whereKeyValue);
        return where;
    }


     //Now also accept gt and lt values
     public String getWhere(HashMap<String, Object> whereKeyValue){
        String where = "";
        int i=0;
        for(String key : whereKeyValue.keySet()){
            Object o = whereKeyValue.get(key);
            DataList<String> keyValue = getKeyValue(key, o);
            if(keyValue != null){
                if(keyValue.size() != 0){
                    String returnedKey = keyValue.get(0);
                    String value = keyValue.get(1);

                    if(i==0){
                        if(returnedKey.equals("gt")){
                            where = where + " `" + key + "` >= '"+ value + "'";
                        }else if(returnedKey.equals("lt")){
                            where = where + " `" + key + "` <= '"+ value + "'";
                        }else{
                            where = where + " `" + key + "` = '"+ value + "'";
                        }
                    }else{
                        if(returnedKey.equals("gt")){
                            where = where + " AND `" + key + "` >= '"+ value + "'";
                        }else if(returnedKey.equals("lt")){
                            where = where + " AND `" + key + "` <= '"+ value + "'";
                        }else{
                            where = where + " AND `" + key + "` = '"+ value + "'";
                        }
                    }
                    i++;
                }
            }
        }
        return where;
     }




    //first argument is key and second is value
    public DataList<String> getKeyValue(String key, Object keyValue){
        DataList<String> returnVal = new DataList<>();
        try{
            //Converting to nested hashmap
            HashMap<String, Object> value = (HashMap<String, Object>)keyValue;
            for(String key_ : value.keySet()){
                Object o = value.get(key_);
                returnVal.add(key_);
                returnVal.add(o.toString());
                return returnVal;
            }
        }catch(Exception e){
            returnVal.add(key);
            returnVal.add(keyValue.toString());
            return returnVal;
        }
        return null;
    }



    // Getting All Data where
    public DataList<Chat>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, 0);
    }


    // Getting All Data where
    public DataList<Chat>  getAll__db(HashMap<String, Object> whereKeyValue, int limit) {
        DataList<Chat> modelList = new DataList<Chat>();
        String whereQuery = getWhereQuery(whereKeyValue);
            String selectQuery;
          if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Chat " + whereQuery + " LIMIT " + limit;
          }else{
                selectQuery = "SELECT  * FROM Chat " + whereQuery;
          }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Chat>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                    repo.addStorage(context);
                    modelList.add((Chat)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Chat>) modelList;
    }





    /**
     * Check count of database.
     * @param whereKeyValue
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, int limit){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(limit != 0){
            countQuery = "SELECT  * FROM Chat " + whereQuery + " LIMIT " + limit;
        }else{
            countQuery = "SELECT  * FROM Chat " + whereQuery;
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue){
            return count__db(whereKeyValue, 0);
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final HashMap<String, Object> whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                String where = getWhere(whereKeyValue);
                // updating row
                db.update("Chat", values, "_DATA_UPDATED = 1 AND " + where, null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("Chat", "_DATA_UPDATED = 0 AND " + where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }





    // Getting All Data where
    public DataList<Chat>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Chat> modelList = new DataList<Chat>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Chat` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Chat>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ChatRepository repo = restAdapter.createRepository(ChatRepository.class);
                    repo.addStorage(context);
                    modelList.add((Chat)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Chat>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM `Chat` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("Chat", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("Chat", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Updating single contact
    public void update__db(final String id,   final Chat modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("Chat", values, "id = ?",
                        new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("Chat", values, "_DATA_UPDATED = 1", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Delete Old data
    public void deleteOldData__db() {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("Chat", "_DATA_UPDATED = 0", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Getting contacts Count
    public int count__db() {
        String countQuery = "SELECT  * FROM `" + TABLE + "`";
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }


    /**
     * Get count by Id..
     * @param id
     * @return
     */
    public int count__db(String id){
        String countQuery = "SELECT  * FROM `" + TABLE  + "` WHERE ID='" + id+"'";
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }



    // Deleting by id
    public void delete__db(final String id) {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, KEY_ID + " = ?",
                new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();
    }

    public void reset__db(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE,null,null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }

}
