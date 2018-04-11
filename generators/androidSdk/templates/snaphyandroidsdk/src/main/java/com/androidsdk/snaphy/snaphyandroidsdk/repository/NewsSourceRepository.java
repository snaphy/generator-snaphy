package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
/*
Replacing with custom Snaphy callback methods
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
*/
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.ObjectCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.DataListCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.VoidCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;
import com.androidsdk.snaphy.snaphyandroidsdk.list.Util;

import com.strongloop.android.remoting.adapters.Adapter;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;
import android.util.Log;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;


//Replaced by Custom ModelRepository method
//import com.strongloop.android.loopback.ModelRepository;



import org.json.JSONArray;
import org.json.JSONObject;


//Import its models too.
import com.androidsdk.snaphy.snaphyandroidsdk.models.NewsSource;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.NewsSourceDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.News;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsRepository;
            
        
    





public class NewsSourceRepository extends ModelRepository<NewsSource> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public NewsSourceRepository(){
        super("NewsSource", null, NewsSource.class);

    }


    public Context getContext(){
        return context;
    }


    







    public NewsSourceDb getDb() {
      return newsSourceDb;
    }

    public void setNewsSourceDb(NewsSourceDb newsSourceDb) {
      this.newsSourceDb = newsSourceDb;
    }

    private NewsSourceDb newsSourceDb;



    //Flag to check either to store data locally or not..
    private boolean STORE_LOCALLY = true;

    public boolean isSTORE_LOCALLY() {
      return STORE_LOCALLY;
    }


    public void  persistData(boolean persist){
      STORE_LOCALLY = persist;
    }



    public void reset__db(){
      if(isSTORE_LOCALLY()){
          getDb().reset__db();
      }
    }



    public void addStorage(Context context){
         try{
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            DATABASE_NAME = (String) ai.metaData.get(METADATA_DATABASE_NAME_KEY);
         }
         catch (Exception e){
            Log.e("Snaphy", e.toString());
         }
         setNewsSourceDb(new NewsSourceDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:newsSourceId/news/:fk", "GET"), "NewsSource.prototype.__findById__news");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:newsSourceId/news/:fk", "DELETE"), "NewsSource.prototype.__destroyById__news");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:newsSourceId/news/:fk", "PUT"), "NewsSource.prototype.__updateById__news");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:newsSourceId/news", "GET"), "NewsSource.prototype.__get__news");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:newsSourceId/news", "POST"), "NewsSource.prototype.__create__news");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:newsSourceId/news", "DELETE"), "NewsSource.prototype.__delete__news");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:newsSourceId/news/count", "GET"), "NewsSource.prototype.__count__news");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "NewsSource.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "NewsSource.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "NewsSource.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "NewsSource.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "NewsSource.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "NewsSource.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "NewsSource.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "NewsSource.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "NewsSource.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "NewsSource.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:newsSourceId", "PUT"), "NewsSource.prototype.updateAttributes");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "NewsSource.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "NewsSource.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "NewsSource.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "NewsSource.getModelRelationSchema");
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method findById__news definition
            public void findById__news(  String newsSourceId,  String fk, final ObjectCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsSourceId", newsSourceId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__news", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsRepository newsRepo = getRestAdapter().createRepository(NewsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    News news = newsRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = news.getClass().getMethod("save__db");
                                                    method.invoke(news);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(news);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__news definition ends here..

            

        
    
        
            //Method destroyById__news definition
            public void destroyById__news(  String newsSourceId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsSourceId", newsSourceId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__news", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__news definition ends here..

            

        
    
        
            //Method updateById__news definition
            public void updateById__news(  String newsSourceId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsSourceId", newsSourceId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__news", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsRepository newsRepo = getRestAdapter().createRepository(NewsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    News news = newsRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = news.getClass().getMethod("save__db");
                                                    method.invoke(news);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(news);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__news definition ends here..

            

        
    
        
            //Method get__news definition
            public void get__news(  String newsSourceId,  Map<String,  ? extends Object> filter, final DataListCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsSourceId", newsSourceId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__news", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<News> newsList = new DataList<News>();
                                    NewsRepository newsRepo = getRestAdapter().createRepository(NewsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        News news = newsRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = news.getClass().getMethod("save__db");
                                                      method.invoke(news);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        newsList.add(news);
                                    }
                                    callback.onSuccess(newsList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__news definition ends here..

            

        
    
        
            //Method create__news definition
            public void create__news(  String newsSourceId,  Map<String,  ? extends Object> data, final ObjectCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsSourceId", newsSourceId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__news", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsRepository newsRepo = getRestAdapter().createRepository(NewsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    News news = newsRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = news.getClass().getMethod("save__db");
                                                    method.invoke(news);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(news);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__news definition ends here..

            

        
    
        
            //Method delete__news definition
            public void delete__news(  String newsSourceId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsSourceId", newsSourceId);
                

                
                    invokeStaticMethod("prototype.__delete__news", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__news definition ends here..

            

        
    
        
            //Method count__news definition
            public void count__news(  String newsSourceId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsSourceId", newsSourceId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__news", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__news definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<NewsSource> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsSourceRepository newsSourceRepo = getRestAdapter().createRepository(NewsSourceRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsSourceRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsSourceRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsSourceRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    NewsSource newsSource = newsSourceRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = newsSource.getClass().getMethod("save__db");
                                                    method.invoke(newsSource);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(newsSource);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<NewsSource> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsSourceRepository newsSourceRepo = getRestAdapter().createRepository(NewsSourceRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsSourceRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsSourceRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsSourceRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    NewsSource newsSource = newsSourceRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = newsSource.getClass().getMethod("save__db");
                                                    method.invoke(newsSource);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(newsSource);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method upsert definition ends here..

            

        
    
        
            //Method exists definition
            public void exists(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method exists definition ends here..

            

        
    
        
            //Method findById definition
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<NewsSource> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsSourceRepository newsSourceRepo = getRestAdapter().createRepository(NewsSourceRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsSourceRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsSourceRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsSourceRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    NewsSource newsSource = newsSourceRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = newsSource.getClass().getMethod("save__db");
                                                    method.invoke(newsSource);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(newsSource);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<NewsSource> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<NewsSource> newsSourceList = new DataList<NewsSource>();
                                    NewsSourceRepository newsSourceRepo = getRestAdapter().createRepository(NewsSourceRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsSourceRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsSourceRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        NewsSource newsSource = newsSourceRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = newsSource.getClass().getMethod("save__db");
                                                      method.invoke(newsSource);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        newsSourceList.add(newsSource);
                                    }
                                    callback.onSuccess(newsSourceList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<NewsSource> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsSourceRepository newsSourceRepo = getRestAdapter().createRepository(NewsSourceRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsSourceRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsSourceRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsSourceRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    NewsSource newsSource = newsSourceRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = newsSource.getClass().getMethod("save__db");
                                                    method.invoke(newsSource);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(newsSource);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findOne definition ends here..

            

        
    
        
            //Method updateAll definition
            public void updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAll definition ends here..

            

        
    
        
            //Method deleteById definition
            public void deleteById(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method deleteById definition ends here..

            

        
    
        
            //Method count definition
            public void count(  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String newsSourceId,  Map<String,  ? extends Object> data, final ObjectCallback<NewsSource> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsSourceId", newsSourceId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.updateAttributes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsSourceRepository newsSourceRepo = getRestAdapter().createRepository(NewsSourceRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsSourceRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsSourceRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsSourceRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    NewsSource newsSource = newsSourceRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = newsSource.getClass().getMethod("save__db");
                                                    method.invoke(newsSource);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(newsSource);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
            //Method getSchema definition
            public void getSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
            //Method getAbsoluteSchema definition
            public void getAbsoluteSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getAbsoluteSchema definition ends here..

            

        
    
        
    
        
            //Method getDetailSchema definition
            public void getDetailSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getDetailSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getDetailSchema definition ends here..

            

        
    
        
            //Method getModelRelationSchema definition
            public void getModelRelationSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getModelRelationSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getModelRelationSchema definition ends here..

            

        
    
        
    



}
