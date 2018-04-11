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
import com.androidsdk.snaphy.snaphyandroidsdk.models.News;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.NewsDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.NewsRead;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsReadRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.PostLike;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostLikeRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Comment;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.CommentResponse;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentResponseRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.NewsSource;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsSourceRepository;
            
        
    





public class NewsRepository extends ModelRepository<News> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public NewsRepository(){
        super("News", null, News.class);

    }


    public Context getContext(){
        return context;
    }


    







    public NewsDb getDb() {
      return newsDb;
    }

    public void setNewsDb(NewsDb newsDb) {
      this.newsDb = newsDb;
    }

    private NewsDb newsDb;



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
         setNewsDb(new NewsDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/postLikes/:fk", "GET"), "News.prototype.__findById__postLikes");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/postLikes/:fk", "DELETE"), "News.prototype.__destroyById__postLikes");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/postLikes/:fk", "PUT"), "News.prototype.__updateById__postLikes");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/comments/:fk", "GET"), "News.prototype.__findById__comments");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/comments/:fk", "DELETE"), "News.prototype.__destroyById__comments");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/comments/:fk", "PUT"), "News.prototype.__updateById__comments");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/commentResponses/:fk", "GET"), "News.prototype.__findById__commentResponses");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/commentResponses/:fk", "DELETE"), "News.prototype.__destroyById__commentResponses");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/commentResponses/:fk", "PUT"), "News.prototype.__updateById__commentResponses");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/newsReads/:fk", "GET"), "News.prototype.__findById__newsReads");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/newsReads/:fk", "DELETE"), "News.prototype.__destroyById__newsReads");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/newsReads/:fk", "PUT"), "News.prototype.__updateById__newsReads");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/newsSource", "GET"), "News.prototype.__get__newsSource");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/postLikes", "GET"), "News.prototype.__get__postLikes");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/postLikes", "POST"), "News.prototype.__create__postLikes");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/postLikes", "DELETE"), "News.prototype.__delete__postLikes");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/postLikes/count", "GET"), "News.prototype.__count__postLikes");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/comments", "GET"), "News.prototype.__get__comments");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/comments", "POST"), "News.prototype.__create__comments");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/comments", "DELETE"), "News.prototype.__delete__comments");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/comments/count", "GET"), "News.prototype.__count__comments");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/commentResponses", "GET"), "News.prototype.__get__commentResponses");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/commentResponses", "POST"), "News.prototype.__create__commentResponses");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/commentResponses", "DELETE"), "News.prototype.__delete__commentResponses");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/commentResponses/count", "GET"), "News.prototype.__count__commentResponses");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/newsReads", "GET"), "News.prototype.__get__newsReads");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/newsReads", "POST"), "News.prototype.__create__newsReads");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/newsReads", "DELETE"), "News.prototype.__delete__newsReads");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId/newsReads/count", "GET"), "News.prototype.__count__newsReads");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/", "POST"), "News.create");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/", "POST"), "News.create");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/", "PUT"), "News.upsert");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:id/exists", "GET"), "News.exists");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:id", "GET"), "News.findById");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/", "GET"), "News.find");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/findOne", "GET"), "News.findOne");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/update", "POST"), "News.updateAll");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:id", "DELETE"), "News.deleteById");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/count", "GET"), "News.count");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/:newsId", "PUT"), "News.prototype.updateAttributes");
    

    
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getSchema", "POST"), "News.getSchema");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getAbsoluteSchema", "POST"), "News.getAbsoluteSchema");
    

    
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getNews", "POST"), "News.getNews");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getNewsByCat", "POST"), "News.getNewsByCat");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getNewsByTag", "POST"), "News.getNewsByTag");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getLatestNews", "POST"), "News.getLatestNews");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getNewsDetail", "POST"), "News.getNewsDetail");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/fetchHomeNews", "POST"), "News.fetchHomeNews");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getSimilarNews", "POST"), "News.getSimilarNews");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getLatestVideoNews", "POST"), "News.getLatestVideoNews");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getLatestNews", "POST"), "News.getLatestNews");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getRelatedNews", "POST"), "News.getRelatedNews");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getHighestCommentNews", "POST"), "News.getHighestCommentNews");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getDetailSchema", "POST"), "News.getDetailSchema");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "News"  + "/getModelRelationSchema", "POST"), "News.getModelRelationSchema");
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            return "News";
        
    }



    




    
        
            //Method findById__postLikes definition
            public void findById__postLikes(  String newsId,  String fk, final ObjectCallback<PostLike> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__postLikes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PostLikeRepository postLikeRepo = getRestAdapter().createRepository(PostLikeRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postLikeRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postLikeRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //postLikeRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PostLike postLike = postLikeRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = postLike.getClass().getMethod("save__db");
                                                    method.invoke(postLike);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(postLike);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__postLikes definition ends here..

            

        
    
        
            //Method destroyById__postLikes definition
            public void destroyById__postLikes(  String newsId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__postLikes", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method destroyById__postLikes definition ends here..

            

        
    
        
            //Method updateById__postLikes definition
            public void updateById__postLikes(  String newsId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<PostLike> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__postLikes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PostLikeRepository postLikeRepo = getRestAdapter().createRepository(PostLikeRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postLikeRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postLikeRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //postLikeRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PostLike postLike = postLikeRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = postLike.getClass().getMethod("save__db");
                                                    method.invoke(postLike);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(postLike);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__postLikes definition ends here..

            

        
    
        
            //Method findById__comments definition
            public void findById__comments(  String newsId,  String fk, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__comments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CommentRepository commentRepo = getRestAdapter().createRepository(CommentRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = commentRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(commentRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //commentRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Comment comment = commentRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = comment.getClass().getMethod("save__db");
                                                    method.invoke(comment);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(comment);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__comments definition ends here..

            

        
    
        
            //Method destroyById__comments definition
            public void destroyById__comments(  String newsId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__comments", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method destroyById__comments definition ends here..

            

        
    
        
            //Method updateById__comments definition
            public void updateById__comments(  String newsId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__comments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CommentRepository commentRepo = getRestAdapter().createRepository(CommentRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = commentRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(commentRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //commentRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Comment comment = commentRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = comment.getClass().getMethod("save__db");
                                                    method.invoke(comment);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(comment);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__comments definition ends here..

            

        
    
        
            //Method findById__commentResponses definition
            public void findById__commentResponses(  String newsId,  String fk, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__commentResponses", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CommentResponseRepository commentResponseRepo = getRestAdapter().createRepository(CommentResponseRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = commentResponseRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(commentResponseRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //commentResponseRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    CommentResponse commentResponse = commentResponseRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = commentResponse.getClass().getMethod("save__db");
                                                    method.invoke(commentResponse);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(commentResponse);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__commentResponses definition ends here..

            

        
    
        
            //Method destroyById__commentResponses definition
            public void destroyById__commentResponses(  String newsId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__commentResponses", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method destroyById__commentResponses definition ends here..

            

        
    
        
            //Method updateById__commentResponses definition
            public void updateById__commentResponses(  String newsId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__commentResponses", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CommentResponseRepository commentResponseRepo = getRestAdapter().createRepository(CommentResponseRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = commentResponseRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(commentResponseRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //commentResponseRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    CommentResponse commentResponse = commentResponseRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = commentResponse.getClass().getMethod("save__db");
                                                    method.invoke(commentResponse);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(commentResponse);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__commentResponses definition ends here..

            

        
    
        
            //Method findById__newsReads definition
            public void findById__newsReads(  String newsId,  String fk, final ObjectCallback<NewsRead> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__newsReads", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsReadRepository newsReadRepo = getRestAdapter().createRepository(NewsReadRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsReadRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsReadRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsReadRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    NewsRead newsRead = newsReadRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = newsRead.getClass().getMethod("save__db");
                                                    method.invoke(newsRead);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(newsRead);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__newsReads definition ends here..

            

        
    
        
            //Method destroyById__newsReads definition
            public void destroyById__newsReads(  String newsId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__newsReads", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method destroyById__newsReads definition ends here..

            

        
    
        
            //Method updateById__newsReads definition
            public void updateById__newsReads(  String newsId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<NewsRead> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__newsReads", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsReadRepository newsReadRepo = getRestAdapter().createRepository(NewsReadRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsReadRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsReadRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsReadRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    NewsRead newsRead = newsReadRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = newsRead.getClass().getMethod("save__db");
                                                    method.invoke(newsRead);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(newsRead);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__newsReads definition ends here..

            

        
    
        
            //Method get__newsSource definition
            public void get__newsSource(  String newsId,  Boolean refresh, final ObjectCallback<NewsSource> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__newsSource", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method get__newsSource definition ends here..

            

        
    
        
            //Method get__postLikes definition
            public void get__postLikes(  String newsId,  Map<String,  ? extends Object> filter, final DataListCallback<PostLike> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__postLikes", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<PostLike> postLikeList = new DataList<PostLike>();
                                    PostLikeRepository postLikeRepo = getRestAdapter().createRepository(PostLikeRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postLikeRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postLikeRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        PostLike postLike = postLikeRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = postLike.getClass().getMethod("save__db");
                                                      method.invoke(postLike);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        postLikeList.add(postLike);
                                    }
                                    callback.onSuccess(postLikeList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__postLikes definition ends here..

            

        
    
        
            //Method create__postLikes definition
            public void create__postLikes(  String newsId,  Map<String,  ? extends Object> data, final ObjectCallback<PostLike> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__postLikes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PostLikeRepository postLikeRepo = getRestAdapter().createRepository(PostLikeRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postLikeRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postLikeRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //postLikeRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PostLike postLike = postLikeRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = postLike.getClass().getMethod("save__db");
                                                    method.invoke(postLike);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(postLike);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__postLikes definition ends here..

            

        
    
        
            //Method delete__postLikes definition
            public void delete__postLikes(  String newsId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                

                
                    invokeStaticMethod("prototype.__delete__postLikes", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method delete__postLikes definition ends here..

            

        
    
        
            //Method count__postLikes definition
            public void count__postLikes(  String newsId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__postLikes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method count__postLikes definition ends here..

            

        
    
        
            //Method get__comments definition
            public void get__comments(  String newsId,  Map<String,  ? extends Object> filter, final DataListCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__comments", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<Comment> commentList = new DataList<Comment>();
                                    CommentRepository commentRepo = getRestAdapter().createRepository(CommentRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = commentRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(commentRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Comment comment = commentRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = comment.getClass().getMethod("save__db");
                                                      method.invoke(comment);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        commentList.add(comment);
                                    }
                                    callback.onSuccess(commentList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__comments definition ends here..

            

        
    
        
            //Method create__comments definition
            public void create__comments(  String newsId,  Map<String,  ? extends Object> data, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__comments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CommentRepository commentRepo = getRestAdapter().createRepository(CommentRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = commentRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(commentRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //commentRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Comment comment = commentRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = comment.getClass().getMethod("save__db");
                                                    method.invoke(comment);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(comment);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__comments definition ends here..

            

        
    
        
            //Method delete__comments definition
            public void delete__comments(  String newsId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                

                
                    invokeStaticMethod("prototype.__delete__comments", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method delete__comments definition ends here..

            

        
    
        
            //Method count__comments definition
            public void count__comments(  String newsId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__comments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method count__comments definition ends here..

            

        
    
        
            //Method get__commentResponses definition
            public void get__commentResponses(  String newsId,  Map<String,  ? extends Object> filter, final DataListCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__commentResponses", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<CommentResponse> commentResponseList = new DataList<CommentResponse>();
                                    CommentResponseRepository commentResponseRepo = getRestAdapter().createRepository(CommentResponseRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = commentResponseRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(commentResponseRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        CommentResponse commentResponse = commentResponseRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = commentResponse.getClass().getMethod("save__db");
                                                      method.invoke(commentResponse);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        commentResponseList.add(commentResponse);
                                    }
                                    callback.onSuccess(commentResponseList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__commentResponses definition ends here..

            

        
    
        
            //Method create__commentResponses definition
            public void create__commentResponses(  String newsId,  Map<String,  ? extends Object> data, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__commentResponses", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CommentResponseRepository commentResponseRepo = getRestAdapter().createRepository(CommentResponseRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = commentResponseRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(commentResponseRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //commentResponseRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    CommentResponse commentResponse = commentResponseRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = commentResponse.getClass().getMethod("save__db");
                                                    method.invoke(commentResponse);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(commentResponse);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__commentResponses definition ends here..

            

        
    
        
            //Method delete__commentResponses definition
            public void delete__commentResponses(  String newsId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                

                
                    invokeStaticMethod("prototype.__delete__commentResponses", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method delete__commentResponses definition ends here..

            

        
    
        
            //Method count__commentResponses definition
            public void count__commentResponses(  String newsId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__commentResponses", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method count__commentResponses definition ends here..

            

        
    
        
            //Method get__newsReads definition
            public void get__newsReads(  String newsId,  Map<String,  ? extends Object> filter, final DataListCallback<NewsRead> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__newsReads", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<NewsRead> newsReadList = new DataList<NewsRead>();
                                    NewsReadRepository newsReadRepo = getRestAdapter().createRepository(NewsReadRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsReadRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsReadRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        NewsRead newsRead = newsReadRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = newsRead.getClass().getMethod("save__db");
                                                      method.invoke(newsRead);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        newsReadList.add(newsRead);
                                    }
                                    callback.onSuccess(newsReadList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__newsReads definition ends here..

            

        
    
        
            //Method create__newsReads definition
            public void create__newsReads(  String newsId,  Map<String,  ? extends Object> data, final ObjectCallback<NewsRead> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__newsReads", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    NewsReadRepository newsReadRepo = getRestAdapter().createRepository(NewsReadRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = newsReadRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(newsReadRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //newsReadRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    NewsRead newsRead = newsReadRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = newsRead.getClass().getMethod("save__db");
                                                    method.invoke(newsRead);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(newsRead);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__newsReads definition ends here..

            

        
    
        
            //Method delete__newsReads definition
            public void delete__newsReads(  String newsId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                

                
                    invokeStaticMethod("prototype.__delete__newsReads", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method delete__newsReads definition ends here..

            

        
    
        
            //Method count__newsReads definition
            public void count__newsReads(  String newsId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__newsReads", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method count__newsReads definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<News> callback){

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
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<News> callback){

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
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<News> callback){

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
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<News> callback){

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
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<News> callback){

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
            public void updateAttributes(  String newsId,  Map<String,  ? extends Object> data, final ObjectCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
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

            

        
    
        
    
        
            //Method getNews definition
            public void getNews(  String newsId, final ObjectCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                

                


                
                    
                    
                    invokeStaticMethod("getNews", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method getNews definition ends here..

            

        
    
        
            //Method getNewsByCat definition
            public void getNewsByCat(  double userId,  String categoryId,  double limit,  double skip, final DataListCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("userId", userId);
                
                        hashMapObject.put("categoryId", categoryId);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("getNewsByCat", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method getNewsByCat definition ends here..

            

        
    
        
            //Method getNewsByTag definition
            public void getNewsByTag(  DataList<String> tagsId,  String categoryId,  String newsId,  double limit,  double skip, final DataListCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("tagsId", tagsId);
                
                        hashMapObject.put("categoryId", categoryId);
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("getNewsByTag", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method getNewsByTag definition ends here..

            

        
    
        
            //Method getLatestNews definition
            public void getLatestNews(  double limit,  double skip, final DataListCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("getLatestNews", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method getLatestNews definition ends here..

            

        
    
        
            //Method getNewsDetail definition
            public void getNewsDetail(  double userId,  String newsId, final ObjectCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("userId", userId);
                
                        hashMapObject.put("newsId", newsId);
                

                


                
                    
                    
                    invokeStaticMethod("getNewsDetail", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method getNewsDetail definition ends here..

            

        
    
        
            //Method fetchHomeNews definition
            public void fetchHomeNews(  double limit,  double skip, final ObjectCallback<JSONArray> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("fetchHomeNews", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method fetchHomeNews definition ends here..

            

        
    
        
            //Method getSimilarNews definition
            public void getSimilarNews(  DataList<String> tagsId,  String categoryId,  String newsId,  double limit,  double skip, final DataListCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("tagsId", tagsId);
                
                        hashMapObject.put("categoryId", categoryId);
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("getSimilarNews", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method getSimilarNews definition ends here..

            

        
    
        
            //Method getLatestVideoNews definition
            public void getLatestVideoNews(  double limit,  double skip, final DataListCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("getLatestVideoNews", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method getLatestVideoNews definition ends here..

            

        
    
        
        
            //Method getRelatedNews definition
            public void getRelatedNews(  DataList<Map<String,  ? extends Object>> newsCategories, final DataListCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsCategories", newsCategories);
                

                


                

                
                    invokeStaticMethod("getRelatedNews", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method getRelatedNews definition ends here..

            

        
    
        
            //Method getHighestCommentNews definition
            public void getHighestCommentNews(  double limit,  double skip, final DataListCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("getHighestCommentNews", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method getHighestCommentNews definition ends here..

            

        
    
        
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
