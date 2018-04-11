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

import com.androidsdk.snaphy.snaphyandroidsdk.models.News;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class NewsDb{

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

  public NewsDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "News";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final News _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`News`", null, values);
    }





    public ContentValues getContentValues(News _modelData){
      ContentValues values = new ContentValues();
                       
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

                                  
                                
                                                            String titleData = "";
                        if(_modelData.getTitle() != null){
                          titleData = _modelData.getTitle().toString();
                          values.put("`title`", titleData);
                        }
                                  
                                
                                                            String mainImageData = "";
                        if(_modelData.getMainImage() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          mainImageData = gson.toJson(_modelData.getMainImage(), HashMap.class);
                          values.put("`mainImage`", mainImageData);
                        }
                                  
                                
                                                            String shortDescriptionData = "";
                        if(_modelData.getShortDescription() != null){
                          shortDescriptionData = _modelData.getShortDescription().toString();
                          values.put("`shortDescription`", shortDescriptionData);
                        }
                                  
                                
                                                            String fullStoryData = "";
                        if(_modelData.getFullStory() != null){
                          fullStoryData = _modelData.getFullStory().toString();
                          values.put("`fullStory`", fullStoryData);
                        }
                                  
                                
                                                            String statusData = "";
                        if(_modelData.getStatus() != null){
                          statusData = _modelData.getStatus().toString();
                          values.put("`status`", statusData);
                        }
                                  
                                
                                                            int isLikedData = 0;
                        if(_modelData.getIsLiked()){
                          isLikedData = 1;
                        }else{
                          isLikedData = 0;
                        }
                        values.put("`isLiked`", isLikedData);
                                  
                                
                                                            double totalLikesData;
                        totalLikesData = (double)_modelData.getTotalLikes();
                        values.put("`totalLikes`", totalLikesData);
                                  
                                
                                                            double totalReadsData;
                        totalReadsData = (double)_modelData.getTotalReads();
                        values.put("`totalReads`", totalReadsData);
                                  
                                
                                                            double totalCommentsData;
                        totalCommentsData = (double)_modelData.getTotalComments();
                        values.put("`totalComments`", totalCommentsData);
                                  
                                
                                                            double priorityData;
                        priorityData = (double)_modelData.getPriority();
                        values.put("`priority`", priorityData);
                                  
                                
                                                            double tagPriorityData;
                        tagPriorityData = (double)_modelData.getTagPriority();
                        values.put("`tagPriority`", tagPriorityData);
                                  
                                
                                                            String onClickData = "";
                        if(_modelData.getOnClick() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          onClickData = gson.toJson(_modelData.getOnClick(), HashMap.class);
                          values.put("`onClick`", onClickData);
                        }
                                  
                                
                                  String newsLabelsData = "";
                  if(_modelData.getNewsLabels() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    newsLabelsData = gson.toJson(_modelData.getNewsLabels(), DataList.class);
                    values.put("`newsLabels`", newsLabelsData);
                  }
              
                                
                                  String newsCategoriesData = "";
                  if(_modelData.getNewsCategories() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    newsCategoriesData = gson.toJson(_modelData.getNewsCategories(), DataList.class);
                    values.put("`newsCategories`", newsCategoriesData);
                  }
              
                                
                                                            int containsGraphicsData = 0;
                        if(_modelData.getContainsGraphics()){
                          containsGraphicsData = 1;
                        }else{
                          containsGraphicsData = 0;
                        }
                        values.put("`containsGraphics`", containsGraphicsData);
                                  
                                
                                                            String addedData = "";
                        if(_modelData.getAdded() != null){
                          addedData = _modelData.getAdded().toString();
                          values.put("`added`", addedData);
                        }
                                  
                                
                                                            String updatedData = "";
                        if(_modelData.getUpdated() != null){
                          updatedData = _modelData.getUpdated().toString();
                          values.put("`updated`", updatedData);
                        }
                                  
                                
                                                            String uniqueNumberData = "";
                        if(_modelData.getUniqueNumber() != null){
                          uniqueNumberData = _modelData.getUniqueNumber().toString();
                          values.put("`uniqueNumber`", uniqueNumberData);
                        }
                                  
                                
                                                            String slugData = "";
                        if(_modelData.getSlug() != null){
                          slugData = _modelData.getSlug().toString();
                          values.put("`slug`", slugData);
                        }
                                  
                                
                                                            int isReadData = 0;
                        if(_modelData.getIsRead()){
                          isReadData = 1;
                        }else{
                          isReadData = 0;
                        }
                        values.put("`isRead`", isReadData);
                                  
                                
                                                            String setImageAsCoverData = "";
                        if(_modelData.getSetImageAsCover() != null){
                          setImageAsCoverData = _modelData.getSetImageAsCover().toString();
                          values.put("`setImageAsCover`", setImageAsCoverData);
                        }
                                  
                                
                                                            double coinsData;
                        coinsData = (double)_modelData.getCoins();
                        values.put("`coins`", coinsData);
                                  
                                
                                                            int containsVideoData = 0;
                        if(_modelData.getContainsVideo()){
                          containsVideoData = 1;
                        }else{
                          containsVideoData = 0;
                        }
                        values.put("`containsVideo`", containsVideoData);
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String newsSourceIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getNewsSourceId");
                              if(method.invoke(_modelData) != null){
                                //newsSourceIdData = _modelData.getNewsSourceId().toString();
                                newsSourceIdData = (String) method.invoke(_modelData);
                                values.put("`newsSourceId`", newsSourceIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   News get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("News", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        NewsRepository repo = restAdapter.createRepository(NewsRepository.class);
                        repo.addStorage(context);
                        return (News)repo.createObject(hashMap);
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
    public   News get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`News`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        NewsRepository repo = restAdapter.createRepository(NewsRepository.class);
                        repo.addStorage(context);
                        return (News)repo.createObject(hashMap);
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

                      
                                                            String idData = "";
                        if(cursor.getString(0) != null){
                          idData = cursor.getString(0);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
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
                                                
                                
                                                            Map<String, Object> mainImageData = new HashMap<>();
                        if(cursor.getString(2) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           mainImageData = gson.fromJson(cursor.getString(2), Map.class);
                          if(mainImageData != null){
                            mainImageData = (Map<String, Object>)mainImageData;
                            hashMap.put("mainImage", mainImageData);
                          }
                        }
                                                
                                
                                                            String shortDescriptionData = "";
                        if(cursor.getString(3) != null){
                          shortDescriptionData = cursor.getString(3);
                          if(shortDescriptionData != null){
                            shortDescriptionData = (String)shortDescriptionData;
                            hashMap.put("shortDescription", shortDescriptionData);
                          }
                        }
                                                
                                
                                                            String fullStoryData = "";
                        if(cursor.getString(4) != null){
                          fullStoryData = cursor.getString(4);
                          if(fullStoryData != null){
                            fullStoryData = (String)fullStoryData;
                            hashMap.put("fullStory", fullStoryData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(5) != null){
                          statusData = cursor.getString(5);
                          if(statusData != null){
                            statusData = (String)statusData;
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            boolean isLikedData = false;
                        int tempisLikedData = cursor.getInt(6);
                        if( tempisLikedData > 0){
                          isLikedData = true;
                        }else{
                          isLikedData = false;
                        }
                        hashMap.put("isLiked", isLikedData);
                                                
                                
                                                            double totalLikesData = (double)0;
                          totalLikesData = cursor.getInt(7);
                          totalLikesData = (double)totalLikesData;
                          hashMap.put("totalLikes", totalLikesData);


                                                
                                
                                                            double totalReadsData = (double)0;
                          totalReadsData = cursor.getInt(8);
                          totalReadsData = (double)totalReadsData;
                          hashMap.put("totalReads", totalReadsData);


                                                
                                
                                                            double totalCommentsData = (double)0;
                          totalCommentsData = cursor.getInt(9);
                          totalCommentsData = (double)totalCommentsData;
                          hashMap.put("totalComments", totalCommentsData);


                                                
                                
                                                            double priorityData = (double)0;
                          priorityData = cursor.getInt(10);
                          priorityData = (double)priorityData;
                          hashMap.put("priority", priorityData);


                                                
                                
                                                            double tagPriorityData = (double)0;
                          tagPriorityData = cursor.getInt(11);
                          tagPriorityData = (double)tagPriorityData;
                          hashMap.put("tagPriority", tagPriorityData);


                                                
                                
                                                            Map<String, Object> onClickData = new HashMap<>();
                        if(cursor.getString(12) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           onClickData = gson.fromJson(cursor.getString(12), Map.class);
                          if(onClickData != null){
                            onClickData = (Map<String, Object>)onClickData;
                            hashMap.put("onClick", onClickData);
                          }
                        }
                                                
                                
                                  DataList<Map<String, Object>> newsLabelsData = new DataList<>();
                  if(cursor.getString(13) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    newsLabelsData = gson.fromJson(cursor.getString(13), DataList.class);
                    if(newsLabelsData != null){
                      newsLabelsData = (DataList<Map<String, Object>>)newsLabelsData;
                      hashMap.put("newsLabels", newsLabelsData);
                    }
                  }
                            
                                
                                  DataList<Map<String, Object>> newsCategoriesData = new DataList<>();
                  if(cursor.getString(14) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    newsCategoriesData = gson.fromJson(cursor.getString(14), DataList.class);
                    if(newsCategoriesData != null){
                      newsCategoriesData = (DataList<Map<String, Object>>)newsCategoriesData;
                      hashMap.put("newsCategories", newsCategoriesData);
                    }
                  }
                            
                                
                                                            boolean containsGraphicsData = false;
                        int tempcontainsGraphicsData = cursor.getInt(15);
                        if( tempcontainsGraphicsData > 0){
                          containsGraphicsData = true;
                        }else{
                          containsGraphicsData = false;
                        }
                        hashMap.put("containsGraphics", containsGraphicsData);
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(16) != null){
                          addedData = cursor.getString(16);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(17) != null){
                          updatedData = cursor.getString(17);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String uniqueNumberData = "";
                        if(cursor.getString(18) != null){
                          uniqueNumberData = cursor.getString(18);
                          if(uniqueNumberData != null){
                            uniqueNumberData = (String)uniqueNumberData;
                            hashMap.put("uniqueNumber", uniqueNumberData);
                          }
                        }
                                                
                                
                                                            String slugData = "";
                        if(cursor.getString(19) != null){
                          slugData = cursor.getString(19);
                          if(slugData != null){
                            slugData = (String)slugData;
                            hashMap.put("slug", slugData);
                          }
                        }
                                                
                                
                                                            boolean isReadData = false;
                        int tempisReadData = cursor.getInt(20);
                        if( tempisReadData > 0){
                          isReadData = true;
                        }else{
                          isReadData = false;
                        }
                        hashMap.put("isRead", isReadData);
                                                
                                
                                                            String setImageAsCoverData = "";
                        if(cursor.getString(21) != null){
                          setImageAsCoverData = cursor.getString(21);
                          if(setImageAsCoverData != null){
                            setImageAsCoverData = (String)setImageAsCoverData;
                            hashMap.put("setImageAsCover", setImageAsCoverData);
                          }
                        }
                                                
                                
                                                            double coinsData = (double)0;
                          coinsData = cursor.getInt(22);
                          coinsData = (double)coinsData;
                          hashMap.put("coins", coinsData);


                                                
                                
                                                            boolean containsVideoData = false;
                        int tempcontainsVideoData = cursor.getInt(23);
                        if( tempcontainsVideoData > 0){
                          containsVideoData = true;
                        }else{
                          containsVideoData = false;
                        }
                        hashMap.put("containsVideo", containsVideoData);
                                                
                                
                                                            String newsSourceIdData = "";
                        if(cursor.getString(24) != null){
                          newsSourceIdData = cursor.getString(24);
                          if(newsSourceIdData != null){
                            newsSourceIdData = newsSourceIdData.toString();
                            hashMap.put("newsSourceId", newsSourceIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, News model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<News>  getAll__db() {
        DataList<News> modelList = new DataList<News>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `News`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<News>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    NewsRepository repo = restAdapter.createRepository(NewsRepository.class);
                    repo.addStorage(context);
                    modelList.add((News)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<News>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<News> getAll__lazy(final int limit, final int skip, ObjectCallback<News> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final NewsRepository repo = restAdapter.createRepository(NewsRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<News>() {
            @Override
            public News create(Cursor cursor, int index) {
                News data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (News)repo.createObject(hashMap);
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
                    selectQuery = "SELECT  * FROM `News` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM News " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM News " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public News get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("News", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        NewsRepository repo = restAdapter.createRepository(NewsRepository.class);
                        repo.addStorage(context);
                        return (News)repo.createObject(hashMap);
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
    public DataList<News>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<News>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<News> modelList = new DataList<News>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `News` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM News " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM News " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<News>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    NewsRepository repo = restAdapter.createRepository(NewsRepository.class);
                    repo.addStorage(context);
                    modelList.add((News)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<News>) modelList;
    }



    // Getting All Data where
    public DataList<News>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `News` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `News` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `News` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `News` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `News` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            db.update("`News`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`News`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`News`", where , null);
    }







    // Getting All Data where
    public DataList<News>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<News> modelList = new DataList<News>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `News` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<News>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    NewsRepository repo = restAdapter.createRepository(NewsRepository.class);
                    repo.addStorage(context);
                    modelList.add((News)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<News>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `News` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
      db.update("`News`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`News`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final News _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`News`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final News _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`News`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`News`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`News`", "_DATA_UPDATED = 0", null);
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
