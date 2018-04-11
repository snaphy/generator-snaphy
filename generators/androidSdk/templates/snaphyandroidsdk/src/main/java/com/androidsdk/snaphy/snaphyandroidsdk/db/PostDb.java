package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.GsonBuilder;
import android.database.Cursor;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;


import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.GetUpdatedQuery;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.ObjectCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.OnParseCursor;
import com.androidsdk.snaphy.snaphyandroidsdk.list.LazyList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Post;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class PostDb{

    // All Static variables
    SnaphyRestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";
    private Context context;
    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;



    public SQLiteDatabase getInstance(){
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
        return db;
    }

  public PostDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Post";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Post _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`Post`", null, values);
    }





    public ContentValues getContentValues(Post _modelData){
      ContentValues values = new ContentValues();
                       
                                                            String uniqueNumberData = "";
                        if(_modelData.getUniqueNumber() != null){
                          uniqueNumberData = _modelData.getUniqueNumber().toString();
                          values.put("`uniqueNumber`", uniqueNumberData);
                        }
                                  
                                
                                                            String titleData = "";
                        if(_modelData.getTitle() != null){
                          titleData = _modelData.getTitle().toString();
                          values.put("`title`", titleData);
                        }
                                  
                                
                                                            String profilePicData = "";
                        if(_modelData.getProfilePic() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          profilePicData = gson.toJson(_modelData.getProfilePic(), HashMap.class);
                          values.put("`profilePic`", profilePicData);
                        }
                                  
                                
                                                            int isLikedData = 0;
                        if(_modelData.getIsLiked()){
                          isLikedData = 1;
                        }else{
                          isLikedData = 0;
                        }
                        values.put("`isLiked`", isLikedData);
                                  
                                
                                                            String usernameData = "";
                        if(_modelData.getUsername() != null){
                          usernameData = _modelData.getUsername().toString();
                          values.put("`username`", usernameData);
                        }
                                  
                                
                                                            String imageData = "";
                        if(_modelData.getImage() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          imageData = gson.toJson(_modelData.getImage(), HashMap.class);
                          values.put("`image`", imageData);
                        }
                                  
                                
                                                            String typeData = "";
                        if(_modelData.getType() != null){
                          typeData = _modelData.getType().toString();
                          values.put("`type`", typeData);
                        }
                                  
                                
                                                            double scoreData;
                        scoreData = (double)_modelData.getScore();
                        values.put("`score`", scoreData);
                                  
                                
                                                            String tweetData = "";
                        if(_modelData.getTweet() != null){
                          tweetData = _modelData.getTweet().toString();
                          values.put("`tweet`", tweetData);
                        }
                                  
                                
                                                            double totalLikesData;
                        totalLikesData = (double)_modelData.getTotalLikes();
                        values.put("`totalLikes`", totalLikesData);
                                  
                                
                                                            double totalCommentsData;
                        totalCommentsData = (double)_modelData.getTotalComments();
                        values.put("`totalComments`", totalCommentsData);
                                  
                                
                                                            String isAdminData = "";
                        if(_modelData.getIsAdmin() != null){
                          isAdminData = _modelData.getIsAdmin().toString();
                          values.put("`isAdmin`", isAdminData);
                        }
                                  
                                
                                                            String statusData = "";
                        if(_modelData.getStatus() != null){
                          statusData = _modelData.getStatus().toString();
                          values.put("`status`", statusData);
                        }
                                  
                                
                                                            int isMarkedInsensitiveData = 0;
                        if(_modelData.getIsMarkedInsensitive()){
                          isMarkedInsensitiveData = 1;
                        }else{
                          isMarkedInsensitiveData = 0;
                        }
                        values.put("`isMarkedInsensitive`", isMarkedInsensitiveData);
                                  
                                
                                                            int isFollowedData = 0;
                        if(_modelData.getIsFollowed()){
                          isFollowedData = 1;
                        }else{
                          isFollowedData = 0;
                        }
                        values.put("`isFollowed`", isFollowedData);
                                  
                                
                                                            double priorityTimeData;
                        priorityTimeData = (double)_modelData.getPriorityTime();
                        values.put("`priorityTime`", priorityTimeData);
                                  
                                
                                                            double postUserIdData;
                        postUserIdData = (double)_modelData.getPostUserId();
                        values.put("`postUserId`", postUserIdData);
                                  
                                
                                                            String addedData = "";
                        if(_modelData.getAdded() != null){
                          addedData = _modelData.getAdded().toString();
                          values.put("`added`", addedData);
                        }
                                  
                                
                                                            String tweetIdData = "";
                        if(_modelData.getTweetId() != null){
                          tweetIdData = _modelData.getTweetId().toString();
                          values.put("`tweetId`", tweetIdData);
                        }
                                  
                                
                                                            String updatedData = "";
                        if(_modelData.getUpdated() != null){
                          updatedData = _modelData.getUpdated().toString();
                          values.put("`updated`", updatedData);
                        }
                                  
                                
                                                            double totalSharesData;
                        totalSharesData = (double)_modelData.getTotalShares();
                        values.put("`totalShares`", totalSharesData);
                                  
                                
                                                            double priorityData;
                        priorityData = (double)_modelData.getPriority();
                        values.put("`priority`", priorityData);
                                  
                                
                                                            String onClickData = "";
                        if(_modelData.getOnClick() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          onClickData = gson.toJson(_modelData.getOnClick(), HashMap.class);
                          values.put("`onClick`", onClickData);
                        }
                                  
                                
                                                            String twitterUserData = "";
                        if(_modelData.getTwitterUser() != null){
                          twitterUserData = _modelData.getTwitterUser().toString();
                          values.put("`twitterUser`", twitterUserData);
                        }
                                  
                                
                                                            String twitterUserProfilePicData = "";
                        if(_modelData.getTwitterUserProfilePic() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          twitterUserProfilePicData = gson.toJson(_modelData.getTwitterUserProfilePic(), HashMap.class);
                          values.put("`twitterUserProfilePic`", twitterUserProfilePicData);
                        }
                                  
                                
                                                            String data_rawData = "";
                        if(_modelData.getData_raw() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          data_rawData = gson.toJson(_modelData.getData_raw(), HashMap.class);
                          values.put("`data_raw`", data_rawData);
                        }
                                  
                                
                                                            String twitterUserIdData = "";
                        if(_modelData.getTwitterUserId() != null){
                          twitterUserIdData = _modelData.getTwitterUserId().toString();
                          values.put("`twitterUserId`", twitterUserIdData);
                        }
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String idData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getId");
                              if(method.invoke(_modelData) != null){
                                //idData = _modelData.getId().toString();
                                idData = (String) method.invoke(_modelData);
                                values.put("`id`", idData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String appUserIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getAppUserId");
                              if(method.invoke(_modelData) != null){
                                //appUserIdData = _modelData.getAppUserId().toString();
                                appUserIdData = (String) method.invoke(_modelData);
                                values.put("`appUserId`", appUserIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Post get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Post", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        PostRepository repo = restAdapter.createRepository(PostRepository.class);
                        repo.addStorage(context);
                        return (Post)repo.createObject(hashMap);
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
    public   Post get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`Post`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        PostRepository repo = restAdapter.createRepository(PostRepository.class);
                        repo.addStorage(context);
                        return (Post)repo.createObject(hashMap);
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

                      
                                                            String uniqueNumberData = "";
                        if(cursor.getString(0) != null){
                          uniqueNumberData = cursor.getString(0);
                          if(uniqueNumberData != null){
                            uniqueNumberData = (String)uniqueNumberData;
                            hashMap.put("uniqueNumber", uniqueNumberData);
                          }
                        }
                                                
                                
                                                            String titleData = "";
                        if(cursor.getString(1) != null){
                          titleData = cursor.getString(1);
                          if(titleData != null){
                            titleData = (String)titleData;
                            hashMap.put("title", titleData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> profilePicData = new HashMap<>();
                        if(cursor.getString(2) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           profilePicData = gson.fromJson(cursor.getString(2), Map.class);
                          if(profilePicData != null){
                            profilePicData = (Map<String, Object>)profilePicData;
                            hashMap.put("profilePic", profilePicData);
                          }
                        }
                                                
                                
                                                            boolean isLikedData = false;
                        int tempisLikedData = cursor.getInt(3);
                        if( tempisLikedData > 0){
                          isLikedData = true;
                        }else{
                          isLikedData = false;
                        }
                        hashMap.put("isLiked", isLikedData);
                                                
                                
                                                            String usernameData = "";
                        if(cursor.getString(4) != null){
                          usernameData = cursor.getString(4);
                          if(usernameData != null){
                            usernameData = (String)usernameData;
                            hashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> imageData = new HashMap<>();
                        if(cursor.getString(5) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           imageData = gson.fromJson(cursor.getString(5), Map.class);
                          if(imageData != null){
                            imageData = (Map<String, Object>)imageData;
                            hashMap.put("image", imageData);
                          }
                        }
                                                
                                
                                                            String typeData = "";
                        if(cursor.getString(6) != null){
                          typeData = cursor.getString(6);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            double scoreData = (double)0;
                          scoreData = cursor.getInt(7);
                          scoreData = (double)scoreData;
                          hashMap.put("score", scoreData);


                                                
                                
                                                            String tweetData = "";
                        if(cursor.getString(8) != null){
                          tweetData = cursor.getString(8);
                          if(tweetData != null){
                            tweetData = (String)tweetData;
                            hashMap.put("tweet", tweetData);
                          }
                        }
                                                
                                
                                                            double totalLikesData = (double)0;
                          totalLikesData = cursor.getInt(9);
                          totalLikesData = (double)totalLikesData;
                          hashMap.put("totalLikes", totalLikesData);


                                                
                                
                                                            double totalCommentsData = (double)0;
                          totalCommentsData = cursor.getInt(10);
                          totalCommentsData = (double)totalCommentsData;
                          hashMap.put("totalComments", totalCommentsData);


                                                
                                
                                                            String isAdminData = "";
                        if(cursor.getString(11) != null){
                          isAdminData = cursor.getString(11);
                          if(isAdminData != null){
                            isAdminData = (String)isAdminData;
                            hashMap.put("isAdmin", isAdminData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(12) != null){
                          statusData = cursor.getString(12);
                          if(statusData != null){
                            statusData = (String)statusData;
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            boolean isMarkedInsensitiveData = false;
                        int tempisMarkedInsensitiveData = cursor.getInt(13);
                        if( tempisMarkedInsensitiveData > 0){
                          isMarkedInsensitiveData = true;
                        }else{
                          isMarkedInsensitiveData = false;
                        }
                        hashMap.put("isMarkedInsensitive", isMarkedInsensitiveData);
                                                
                                
                                                            boolean isFollowedData = false;
                        int tempisFollowedData = cursor.getInt(14);
                        if( tempisFollowedData > 0){
                          isFollowedData = true;
                        }else{
                          isFollowedData = false;
                        }
                        hashMap.put("isFollowed", isFollowedData);
                                                
                                
                                                            double priorityTimeData = (double)0;
                          priorityTimeData = cursor.getInt(15);
                          priorityTimeData = (double)priorityTimeData;
                          hashMap.put("priorityTime", priorityTimeData);


                                                
                                
                                                            double postUserIdData = (double)0;
                          postUserIdData = cursor.getInt(16);
                          postUserIdData = (double)postUserIdData;
                          hashMap.put("postUserId", postUserIdData);


                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(17) != null){
                          addedData = cursor.getString(17);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String tweetIdData = "";
                        if(cursor.getString(18) != null){
                          tweetIdData = cursor.getString(18);
                          if(tweetIdData != null){
                            tweetIdData = (String)tweetIdData;
                            hashMap.put("tweetId", tweetIdData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(19) != null){
                          updatedData = cursor.getString(19);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            double totalSharesData = (double)0;
                          totalSharesData = cursor.getInt(20);
                          totalSharesData = (double)totalSharesData;
                          hashMap.put("totalShares", totalSharesData);


                                                
                                
                                                            double priorityData = (double)0;
                          priorityData = cursor.getInt(21);
                          priorityData = (double)priorityData;
                          hashMap.put("priority", priorityData);


                                                
                                
                                                            Map<String, Object> onClickData = new HashMap<>();
                        if(cursor.getString(22) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           onClickData = gson.fromJson(cursor.getString(22), Map.class);
                          if(onClickData != null){
                            onClickData = (Map<String, Object>)onClickData;
                            hashMap.put("onClick", onClickData);
                          }
                        }
                                                
                                
                                                            String twitterUserData = "";
                        if(cursor.getString(23) != null){
                          twitterUserData = cursor.getString(23);
                          if(twitterUserData != null){
                            twitterUserData = (String)twitterUserData;
                            hashMap.put("twitterUser", twitterUserData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> twitterUserProfilePicData = new HashMap<>();
                        if(cursor.getString(24) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           twitterUserProfilePicData = gson.fromJson(cursor.getString(24), Map.class);
                          if(twitterUserProfilePicData != null){
                            twitterUserProfilePicData = (Map<String, Object>)twitterUserProfilePicData;
                            hashMap.put("twitterUserProfilePic", twitterUserProfilePicData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> data_rawData = new HashMap<>();
                        if(cursor.getString(25) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           data_rawData = gson.fromJson(cursor.getString(25), Map.class);
                          if(data_rawData != null){
                            data_rawData = (Map<String, Object>)data_rawData;
                            hashMap.put("data_raw", data_rawData);
                          }
                        }
                                                
                                
                                                            String twitterUserIdData = "";
                        if(cursor.getString(26) != null){
                          twitterUserIdData = cursor.getString(26);
                          if(twitterUserIdData != null){
                            twitterUserIdData = (String)twitterUserIdData;
                            hashMap.put("twitterUserId", twitterUserIdData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(27) != null){
                          idData = cursor.getString(27);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String appUserIdData = "";
                        if(cursor.getString(28) != null){
                          appUserIdData = cursor.getString(28);
                          if(appUserIdData != null){
                            appUserIdData = appUserIdData.toString();
                            hashMap.put("appUserId", appUserIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Post model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Post>  getAll__db() {
        DataList<Post> modelList = new DataList<Post>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Post`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Post>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PostRepository repo = restAdapter.createRepository(PostRepository.class);
                    repo.addStorage(context);
                    modelList.add((Post)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Post>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<Post> getAll__lazy(final int limit, final int skip, ObjectCallback<Post> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final PostRepository repo = restAdapter.createRepository(PostRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<Post>() {
            @Override
            public Post create(Cursor cursor, int index) {
                Post data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (Post)repo.createObject(hashMap);
                return data;
            }
        }, callback, new LazyList.OnQueryChange(){
            @Override
            public String getUpdateQuery() {
                String orderBy = getUpdatedQuery.onOrderByChange();
                //Get Where Key Value..
                HashMap<String, Object> getWhereKeyValue = getUpdatedQuery.onQueryChange();

                String whereQuery = getWhereQuery(getWhereKeyValue);
                String selectQuery;
                if(orderBy != null){
                    selectQuery = "SELECT  * FROM `Post` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM Post " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM Post " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public Post get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Post", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        PostRepository repo = restAdapter.createRepository(PostRepository.class);
                        repo.addStorage(context);
                        return (Post)repo.createObject(hashMap);
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
    public DataList<Post>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Post>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Post> modelList = new DataList<Post>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Post` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Post " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Post " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Post>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PostRepository repo = restAdapter.createRepository(PostRepository.class);
                    repo.addStorage(context);
                    modelList.add((Post)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<Post>) modelList;
    }



    // Getting All Data where
    public DataList<Post>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
        return getAll__db(whereKeyValue, null,  limit, skip);
    }





    /**
     * Check count of database.
     * @param whereKeyValue
     * @param orderBy
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(orderBy != null){
            countQuery = "SELECT  * FROM `Post` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Post` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Post` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
    public int count__db(HashMap<String, Object> whereKeyValue, int limit, int skip){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(limit != 0){
            countQuery = "SELECT  * FROM `Post` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Post` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            return count__db(whereKeyValue, 0, 0);
    }



    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final HashMap<String, Object> whereKeyValue) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
            //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
            ContentValues values = new ContentValues();
            values.put("_DATA_UPDATED", 0);
            String where = getWhere(whereKeyValue);
            // updating row
            db.update("`Post`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Post`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Post`", where , null);
    }







    // Getting All Data where
    public DataList<Post>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Post> modelList = new DataList<Post>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Post` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Post>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PostRepository repo = restAdapter.createRepository(PostRepository.class);
                    repo.addStorage(context);
                    modelList.add((Post)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<Post>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `Post` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
      Cursor cursor = db.rawQuery(countQuery, null);
      int count = cursor.getCount();
      cursor.close();
      return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Post`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Post`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Post _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`Post`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final Post _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`Post`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Post`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Post`", "_DATA_UPDATED = 0", null);
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
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, KEY_ID + " = ?",
      new String[] { id });
    }

    public void reset__db(){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE,null,null);
    }

}
