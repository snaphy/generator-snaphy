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
import com.androidsdk.snaphy.snaphyandroidsdk.models.Comment;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.CommentDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Post;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.News;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.CommentResponse;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentResponseRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.AppUser;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            
        
    





public class CommentRepository extends ModelRepository<Comment> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public CommentRepository(){
        super("Comment", null, Comment.class);

    }


    public Context getContext(){
        return context;
    }


    







    public CommentDb getDb() {
      return commentDb;
    }

    public void setCommentDb(CommentDb commentDb) {
      this.commentDb = commentDb;
    }

    private CommentDb commentDb;



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
         setCommentDb(new CommentDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/post", "GET"), "Comment.prototype.__get__post");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/appUser", "GET"), "Comment.prototype.__get__appUser");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/commentResponses/:fk", "GET"), "Comment.prototype.__findById__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/commentResponses/:fk", "DELETE"), "Comment.prototype.__destroyById__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/commentResponses/:fk", "PUT"), "Comment.prototype.__updateById__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/news", "GET"), "Comment.prototype.__get__news");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/commentResponses", "GET"), "Comment.prototype.__get__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/commentResponses", "POST"), "Comment.prototype.__create__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/commentResponses", "DELETE"), "Comment.prototype.__delete__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId/commentResponses/count", "GET"), "Comment.prototype.__count__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Comment.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Comment.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "Comment.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "Comment.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "Comment.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "Comment.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "Comment.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "Comment.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "Comment.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "Comment.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:commentId", "PUT"), "Comment.prototype.updateAttributes");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "Comment.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "Comment.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/saveComment", "POST"), "Comment.saveComment");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchComments", "POST"), "Comment.fetchComments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/deleteComment", "POST"), "Comment.deleteComment");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getUserComments", "POST"), "Comment.getUserComments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/createNewsComment", "POST"), "Comment.createNewsComment");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchNewsComments", "POST"), "Comment.fetchNewsComments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "Comment.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "Comment.getModelRelationSchema");
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method get__post definition
            public void get__post(  String commentId,  Boolean refresh, final ObjectCallback<Post> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__post", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PostRepository postRepo = getRestAdapter().createRepository(PostRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //postRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Post post = postRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = post.getClass().getMethod("save__db");
                                                    method.invoke(post);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(post);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__post definition ends here..

            

        
    
        
            //Method get__appUser definition
            public void get__appUser(  String commentId,  Boolean refresh, final ObjectCallback<AppUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__appUser", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AppUserRepository appUserRepo = getRestAdapter().createRepository(AppUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = appUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(appUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //appUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    AppUser appUser = appUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = appUser.getClass().getMethod("save__db");
                                                    method.invoke(appUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(appUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__appUser definition ends here..

            

        
    
        
            //Method findById__commentResponses definition
            public void findById__commentResponses(  String commentId,  String fk, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
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
            public void destroyById__commentResponses(  String commentId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
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
            public void updateById__commentResponses(  String commentId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
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

            

        
    
        
            //Method get__news definition
            public void get__news(  String commentId,  Boolean refresh, final ObjectCallback<News> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__news", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method get__news definition ends here..

            

        
    
        
            //Method get__commentResponses definition
            public void get__commentResponses(  String commentId,  Map<String,  ? extends Object> filter, final DataListCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
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
            public void create__commentResponses(  String commentId,  Map<String,  ? extends Object> data, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
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
            public void delete__commentResponses(  String commentId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                

                
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
            public void count__commentResponses(  String commentId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
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

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<Comment> callback){

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
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<Comment> callback){

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
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<Comment> callback){

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
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<Comment> callback){

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
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<Comment> callback){

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
            public void updateAttributes(  String commentId,  Map<String,  ? extends Object> data, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                
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

            

        
    
        
    
        
            //Method saveComment definition
            public void saveComment(  Map<String,  ? extends Object> commentObj,  Map<String,  ? extends Object> userData, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentObj", commentObj);
                
                        hashMapObject.put("userData", userData);
                

                


                
                    
                    
                    invokeStaticMethod("saveComment", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method saveComment definition ends here..

            

        
    
        
            //Method fetchComments definition
            public void fetchComments(  String postId,  double limit,  double skip, final DataListCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("fetchComments", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method fetchComments definition ends here..

            

        
    
        
            //Method deleteComment definition
            public void deleteComment(  String commentId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("commentId", commentId);
                

                
                    invokeStaticMethod("deleteComment", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method deleteComment definition ends here..

            

        
    
        
            //Method getUserComments definition
            public void getUserComments(  double id,  double limit,  double skip, final DataListCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("getUserComments", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method getUserComments definition ends here..

            

        
    
        
            //Method createNewsComment definition
            public void createNewsComment(  Map<String,  ? extends Object> newsObject,  Map<String,  ? extends Object> userData, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsObject", newsObject);
                
                        hashMapObject.put("userData", userData);
                

                


                
                    
                    
                    invokeStaticMethod("createNewsComment", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method createNewsComment definition ends here..

            

        
    
        
            //Method fetchNewsComments definition
            public void fetchNewsComments(  String newsId,  double limit,  double skip, final DataListCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("newsId", newsId);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("fetchNewsComments", hashMapObject, new Adapter.JsonArrayCallback() {
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
                

            }//Method fetchNewsComments definition ends here..

            

        
    
        
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
