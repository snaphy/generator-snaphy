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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Message;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.MessageRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class MessageDb{

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

  public MessageDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Message";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Message modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("Message", null, values);
                //db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(Message modelData){
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
                                
                                                            String descriptionData = "";
                        if(modelData.getDescription() != null){
                          descriptionData = modelData.getDescription().toString();
                        }
                                                values.put("`description`", descriptionData);
                                
                                                            String toData = "";
                        if(modelData.getTo() != null){
                          toData = modelData.getTo().toString();
                        }
                                                values.put("`to`", toData);
                                
                                                            String fromData = "";
                        if(modelData.getFrom() != null){
                          fromData = modelData.getFrom().toString();
                        }
                                                values.put("`from`", fromData);
                                
                                                            int sendSmsData = 0;
                        if(modelData.getSendSms()){
                          sendSmsData = 1;
                        }else{
                          sendSmsData = 0;
                        }
                                                values.put("`sendSms`", sendSmsData);
                                
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
                        String schoolIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getSchoolId");
                              if(method.invoke(modelData) != null){
                                //schoolIdData = modelData.getSchoolId().toString();
                                schoolIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`schoolId`", schoolIdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String adminIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getAdminId");
                              if(method.invoke(modelData) != null){
                                //adminIdData = modelData.getAdminId().toString();
                                adminIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`adminId`", adminIdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String teacherIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getTeacherId");
                              if(method.invoke(modelData) != null){
                                //teacherIdData = modelData.getTeacherId().toString();
                                teacherIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`teacherId`", teacherIdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String ainakClassAndSectionIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getAinakClassAndSectionId");
                              if(method.invoke(modelData) != null){
                                //ainakClassAndSectionIdData = modelData.getAinakClassAndSectionId().toString();
                                ainakClassAndSectionIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`ainakClassAndSectionId`", ainakClassAndSectionIdData);
                  

        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Message get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Message", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        MessageRepository repo = restAdapter.createRepository(MessageRepository.class);
                        repo.addStorage(context);
                        return (Message)repo.createObject(hashMap);
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
    public   Message get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Message", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        MessageRepository repo = restAdapter.createRepository(MessageRepository.class);
                        repo.addStorage(context);
                        return (Message)repo.createObject(hashMap);
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
                                                
                                
                                                            String descriptionData = "";
                        if(cursor.getString(2) != null){
                          descriptionData = cursor.getString(2);
                          if(descriptionData != null){
                            descriptionData = (String)descriptionData;
                            hashMap.put("description", descriptionData);
                          }
                        }
                                                
                                
                                                            String toData = "";
                        if(cursor.getString(3) != null){
                          toData = cursor.getString(3);
                          if(toData != null){
                            toData = (String)toData;
                            hashMap.put("to", toData);
                          }
                        }
                                                
                                
                                                            String fromData = "";
                        if(cursor.getString(4) != null){
                          fromData = cursor.getString(4);
                          if(fromData != null){
                            fromData = (String)fromData;
                            hashMap.put("from", fromData);
                          }
                        }
                                                
                                
                                                            boolean sendSmsData = false;
                        int tempsendSmsData = cursor.getInt(5);
                        if( tempsendSmsData > 0){
                          sendSmsData = true;
                        }else{
                          sendSmsData = false;
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(6) != null){
                          idData = cursor.getString(6);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String schoolIdData = "";
                        if(cursor.getString(7) != null){
                          schoolIdData = cursor.getString(7);
                          if(schoolIdData != null){
                            schoolIdData = schoolIdData.toString();
                            hashMap.put("schoolId", schoolIdData);
                          }
                        }
                                                
                                
                                                            String adminIdData = "";
                        if(cursor.getString(8) != null){
                          adminIdData = cursor.getString(8);
                          if(adminIdData != null){
                            adminIdData = adminIdData.toString();
                            hashMap.put("adminId", adminIdData);
                          }
                        }
                                                
                                
                                                            String teacherIdData = "";
                        if(cursor.getString(9) != null){
                          teacherIdData = cursor.getString(9);
                          if(teacherIdData != null){
                            teacherIdData = teacherIdData.toString();
                            hashMap.put("teacherId", teacherIdData);
                          }
                        }
                                                
                                
                                                            String ainakClassAndSectionIdData = "";
                        if(cursor.getString(10) != null){
                          ainakClassAndSectionIdData = cursor.getString(10);
                          if(ainakClassAndSectionIdData != null){
                            ainakClassAndSectionIdData = ainakClassAndSectionIdData.toString();
                            hashMap.put("ainakClassAndSectionId", ainakClassAndSectionIdData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Message model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Message>  getAll__db() {
        DataList<Message> modelList = new DataList<Message>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Message";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Message>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    MessageRepository repo = restAdapter.createRepository(MessageRepository.class);
                    repo.addStorage(context);
                    modelList.add((Message)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Message>) modelList;
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
                            where = where + " `" + key + "` > '"+ value + "'";
                        }else if(returnedKey.equals("lt")){
                            where = where + " `" + key + "` < '"+ value + "'";
                        }else{
                            where = where + " `" + key + "` = '"+ value + "'";
                        }
                    }else{
                        if(returnedKey.equals("gt")){
                            where = where + " AND `" + key + "` > '"+ value + "'";
                        }else if(returnedKey.equals("lt")){
                            where = where + " AND `" + key + "` < '"+ value + "'";
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
    public DataList<Message>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Message>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit) {
        DataList<Message> modelList = new DataList<Message>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM Message " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Message " + whereQuery + " LIMIT " + limit;
            }else{
                selectQuery = "SELECT  * FROM Message " + whereQuery;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Message>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    MessageRepository repo = restAdapter.createRepository(MessageRepository.class);
                    repo.addStorage(context);
                    modelList.add((Message)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Message>) modelList;
    }


    // Getting All Data where
    public DataList<Message>  getAll__db(HashMap<String, Object> whereKeyValue, int limit) {
        return getAll__db(whereKeyValue, null,  limit);
    }





    /**
     * Check count of database.
     * @param whereKeyValue
     * @param orderBy
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(orderBy != null){
            countQuery = "SELECT  * FROM Message " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM Message " + whereQuery + " LIMIT " + limit;
            }else{
                countQuery = "SELECT  * FROM Message " + whereQuery;
            }
        }


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
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
            countQuery = "SELECT  * FROM Message " + whereQuery + " LIMIT " + limit;
        }else{
            countQuery = "SELECT  * FROM Message " + whereQuery;
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    /**
     * Check count of database.
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
                db.update("Message", values, "_DATA_UPDATED = 1 AND " + where, null);
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
                db.delete("Message", "_DATA_UPDATED = 0 AND " + where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }





    // Getting All Data where
    public DataList<Message>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Message> modelList = new DataList<Message>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Message` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Message>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    MessageRepository repo = restAdapter.createRepository(MessageRepository.class);
                    repo.addStorage(context);
                    modelList.add((Message)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Message>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM `Message` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
                db.update("Message", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
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
                db.delete("Message", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Updating single contact
    public void update__db(final String id,   final Message modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("Message", values, "id = ?",
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
                db.update("Message", values, "_DATA_UPDATED = 1", null);
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
                db.delete("Message", "_DATA_UPDATED = 0", null);
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
