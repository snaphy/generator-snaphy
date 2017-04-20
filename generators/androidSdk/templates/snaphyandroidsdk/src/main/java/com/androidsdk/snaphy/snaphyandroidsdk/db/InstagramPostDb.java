package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import android.database.Cursor;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.InstagramPost;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.InstagramPostRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class InstagramPostDb{

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

  public InstagramPostDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "InstagramPost";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final InstagramPost modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("`InstagramPost`", null, values);
                //db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(InstagramPost modelData){
      ContentValues values = new ContentValues();
                       
                                                            String typeData = "";
                        if(modelData.getType() != null){
                          typeData = modelData.getType().toString();
                          values.put("`type`", typeData);
                        }
                                  
                                
                                                            int user_has_likedData = 0;
                        if(modelData.getUser_has_liked()){
                          user_has_likedData = 1;
                        }else{
                          user_has_likedData = 0;
                        }
                        values.put("`user_has_liked`", user_has_likedData);
                                  
                                
                                                            String commentsData = "";
                        if(modelData.getComments() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          commentsData = gson.toJson(modelData.getComments(), HashMap.class);
                          values.put("`comments`", commentsData);
                        }
                                  
                                
                                                            String likesData = "";
                        if(modelData.getLikes() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          likesData = gson.toJson(modelData.getLikes(), HashMap.class);
                          values.put("`likes`", likesData);
                        }
                                  
                                
                                                            String imagesData = "";
                        if(modelData.getImages() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          imagesData = gson.toJson(modelData.getImages(), HashMap.class);
                          values.put("`images`", imagesData);
                        }
                                  
                                
                                                            double created_timeData;
                        created_timeData = (double)modelData.getCreated_time();
                        values.put("`created_time`", created_timeData);
                                  
                                
                                                            String filterData = "";
                        if(modelData.getFilter() != null){
                          filterData = modelData.getFilter().toString();
                          values.put("`filter`", filterData);
                        }
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String idData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getId");
                              if(method.invoke(modelData) != null){
                                //idData = modelData.getId().toString();
                                idData = (String) method.invoke(modelData);
                                values.put("`id`", idData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String instagramUserIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getInstagramUserId");
                              if(method.invoke(modelData) != null){
                                //instagramUserIdData = modelData.getInstagramUserId().toString();
                                instagramUserIdData = (String) method.invoke(modelData);
                                values.put("`instagramUserId`", instagramUserIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
                    String instagramUserIdData = "";
                    try {
                        Method method = modelData.getClass().getMethod("getInstagramUserId");
                        if(method.invoke(modelData) != null){
                          //instagramUserIdData = modelData.getInstagramUserId().toString();
                          instagramUserIdData = (String) method.invoke(modelData);
                          values.put("`instagramUserId`", instagramUserIdData);
                        }
                    } catch (Exception e) {
                      Log.e("Database Error", e.toString());
                    }
          
                    String instagramCaptionIdData = "";
                    try {
                        Method method = modelData.getClass().getMethod("getInstagramCaptionId");
                        if(method.invoke(modelData) != null){
                          //instagramCaptionIdData = modelData.getInstagramCaptionId().toString();
                          instagramCaptionIdData = (String) method.invoke(modelData);
                          values.put("`instagramCaptionId`", instagramCaptionIdData);
                        }
                    } catch (Exception e) {
                      Log.e("Database Error", e.toString());
                    }
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   InstagramPost get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("InstagramPost", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        InstagramPostRepository repo = restAdapter.createRepository(InstagramPostRepository.class);
                        repo.addStorage(context);
                        return (InstagramPost)repo.createObject(hashMap);
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
    public   InstagramPost get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`InstagramPost`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        InstagramPostRepository repo = restAdapter.createRepository(InstagramPostRepository.class);
                        repo.addStorage(context);
                        return (InstagramPost)repo.createObject(hashMap);
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

                      
                                                            String typeData = "";
                        if(cursor.getString(0) != null){
                          typeData = cursor.getString(0);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            boolean user_has_likedData = false;
                        int tempuser_has_likedData = cursor.getInt(1);
                        if( tempuser_has_likedData > 0){
                          user_has_likedData = true;
                        }else{
                          user_has_likedData = false;
                        }
                        hashMap.put("user_has_liked", user_has_likedData);
                                                
                                
                                                            Map<String, Object> commentsData = new HashMap<>();
                        if(cursor.getString(2) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           commentsData = gson.fromJson(cursor.getString(2), Map.class);
                          if(commentsData != null){
                            commentsData = (Map<String, Object>)commentsData;
                            hashMap.put("comments", commentsData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> likesData = new HashMap<>();
                        if(cursor.getString(3) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           likesData = gson.fromJson(cursor.getString(3), Map.class);
                          if(likesData != null){
                            likesData = (Map<String, Object>)likesData;
                            hashMap.put("likes", likesData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> imagesData = new HashMap<>();
                        if(cursor.getString(4) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           imagesData = gson.fromJson(cursor.getString(4), Map.class);
                          if(imagesData != null){
                            imagesData = (Map<String, Object>)imagesData;
                            hashMap.put("images", imagesData);
                          }
                        }
                                                
                                
                                                            double created_timeData = (double)0;
                          created_timeData = cursor.getInt(5);
                          created_timeData = (double)created_timeData;
                          hashMap.put("created_time", created_timeData);


                                                
                                
                                                            String filterData = "";
                        if(cursor.getString(6) != null){
                          filterData = cursor.getString(6);
                          if(filterData != null){
                            filterData = (String)filterData;
                            hashMap.put("filter", filterData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(7) != null){
                          idData = cursor.getString(7);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String instagramUserIdData = "";
                        if(cursor.getString(8) != null){
                          instagramUserIdData = cursor.getString(8);
                          if(instagramUserIdData != null){
                            instagramUserIdData = instagramUserIdData.toString();
                            hashMap.put("instagramUserId", instagramUserIdData);
                          }
                        }
                                                
                  //End for loop
         
          
                    String instagramUserIdData = "";
                    int instagramUserIdindex = cursor.getColumnIndex("instagramUserId");
                    if(instagramUserIdindex >= 0){

                        if(cursor.getString(instagramUserIdindex) != null){
                          instagramUserIdData = cursor.getString(instagramUserIdindex);
                          if(instagramUserIdData != null){
                            instagramUserIdData = instagramUserIdData.toString();
                            hashMap.put("instagramUserId", instagramUserIdData);
                          }
                        }

                    }

          
                    String instagramCaptionIdData = "";
                    int instagramCaptionIdindex = cursor.getColumnIndex("instagramCaptionId");
                    if(instagramCaptionIdindex >= 0){

                        if(cursor.getString(instagramCaptionIdindex) != null){
                          instagramCaptionIdData = cursor.getString(instagramCaptionIdindex);
                          if(instagramCaptionIdData != null){
                            instagramCaptionIdData = instagramCaptionIdData.toString();
                            hashMap.put("instagramCaptionId", instagramCaptionIdData);
                          }
                        }

                    }

          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, InstagramPost model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<InstagramPost>  getAll__db() {
        DataList<InstagramPost> modelList = new DataList<InstagramPost>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `InstagramPost`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<InstagramPost>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    InstagramPostRepository repo = restAdapter.createRepository(InstagramPostRepository.class);
                    repo.addStorage(context);
                    modelList.add((InstagramPost)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<InstagramPost>) modelList;
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
                    try{
                        int value = Integer.parseInt(keyValue.get(1));
                        if(i==0){
                            if(returnedKey.equals("gt")){
                                where = where + " `" + key + "` > "+ value + "";
                            }else if(returnedKey.equals("lt")){
                                where = where + " `" + key + "` < "+ value + "";
                            }else{
                                where = where + " `" + key + "` = "+ value + "";
                            }
                        }else{
                            if(returnedKey.equals("gt")){
                                where = where + " AND `" + key + "` > "+ value + "";
                            }else if(returnedKey.equals("lt")){
                                where = where + " AND `" + key + "` < "+ value + "";
                            }else{
                                where = where + " AND `" + key + "` = "+ value + "";
                            }
                        }

                    }catch(Exception e){
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
    public DataList<InstagramPost>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<InstagramPost>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit) {
        DataList<InstagramPost> modelList = new DataList<InstagramPost>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `InstagramPost` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM InstagramPost " + whereQuery + " LIMIT " + limit;
            }else{
                selectQuery = "SELECT  * FROM InstagramPost " + whereQuery;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<InstagramPost>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    InstagramPostRepository repo = restAdapter.createRepository(InstagramPostRepository.class);
                    repo.addStorage(context);
                    modelList.add((InstagramPost)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<InstagramPost>) modelList;
    }


    // Getting All Data where
    public DataList<InstagramPost>  getAll__db(HashMap<String, Object> whereKeyValue, int limit) {
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
            countQuery = "SELECT  * FROM `InstagramPost` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `InstagramPost` " + whereQuery + " LIMIT " + limit;
            }else{
                countQuery = "SELECT  * FROM `InstagramPost` " + whereQuery;
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
            countQuery = "SELECT  * FROM `InstagramPost` " + whereQuery + " LIMIT " + limit;
        }else{
            countQuery = "SELECT  * FROM `InstagramPost` " + whereQuery;
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
                db.update("`InstagramPost`", values, "_DATA_UPDATED = 1 AND " + where, null);
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
                db.delete("`InstagramPost`", "_DATA_UPDATED = 0 AND " + where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("`InstagramPost`", where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
            }
        }).start();
    }







    // Getting All Data where
    public DataList<InstagramPost>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<InstagramPost> modelList = new DataList<InstagramPost>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `InstagramPost` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<InstagramPost>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    InstagramPostRepository repo = restAdapter.createRepository(InstagramPostRepository.class);
                    repo.addStorage(context);
                    modelList.add((InstagramPost)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<InstagramPost>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM `InstagramPost` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
                db.update("`InstagramPost`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
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
                db.delete("`InstagramPost`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final InstagramPost modelData ){
      new Thread(new Runnable(){
        @Override
        public void run(){
          SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
          db.beginTransaction();
          ContentValues values = getContentValues(modelData);
          String where = getWhere(whereKeyValue);
          db.update("`InstagramPost`", values, where, null);
          db.setTransactionSuccessful();
          db.endTransaction();
          //db.close();
        }

      }).start();
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();
    }



    // Updating single contact
    public void update__db(final String id,   final InstagramPost modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("`InstagramPost`", values, "id = ?",
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
                db.update("`InstagramPost`", values, "_DATA_UPDATED = 1", null);
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
                db.delete("`InstagramPost`", "_DATA_UPDATED = 0", null);
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
