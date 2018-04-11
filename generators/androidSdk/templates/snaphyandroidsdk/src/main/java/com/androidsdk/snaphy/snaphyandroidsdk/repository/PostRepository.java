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
import com.androidsdk.snaphy.snaphyandroidsdk.models.Post;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.PostDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Comment;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.PostLike;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostLikeRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.CommentResponse;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentResponseRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.PostShare;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostShareRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.AppUser;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            
        
    





public class PostRepository extends ModelRepository<Post> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public PostRepository(){
        super("Post", null, Post.class);

    }


    public Context getContext(){
        return context;
    }


    







    public PostDb getDb() {
      return postDb;
    }

    public void setPostDb(PostDb postDb) {
      this.postDb = postDb;
    }

    private PostDb postDb;



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
         setPostDb(new PostDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/appUser", "GET"), "Post.prototype.__get__appUser");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postLikes/:fk", "GET"), "Post.prototype.__findById__postLikes");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postLikes/:fk", "DELETE"), "Post.prototype.__destroyById__postLikes");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postLikes/:fk", "PUT"), "Post.prototype.__updateById__postLikes");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/comments/:fk", "GET"), "Post.prototype.__findById__comments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/comments/:fk", "DELETE"), "Post.prototype.__destroyById__comments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/comments/:fk", "PUT"), "Post.prototype.__updateById__comments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/commentResponses/:fk", "GET"), "Post.prototype.__findById__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/commentResponses/:fk", "DELETE"), "Post.prototype.__destroyById__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/commentResponses/:fk", "PUT"), "Post.prototype.__updateById__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postShares/:fk", "GET"), "Post.prototype.__findById__postShares");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postShares/:fk", "DELETE"), "Post.prototype.__destroyById__postShares");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postShares/:fk", "PUT"), "Post.prototype.__updateById__postShares");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postLikes", "GET"), "Post.prototype.__get__postLikes");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postLikes", "POST"), "Post.prototype.__create__postLikes");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postLikes", "DELETE"), "Post.prototype.__delete__postLikes");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postLikes/count", "GET"), "Post.prototype.__count__postLikes");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/comments", "GET"), "Post.prototype.__get__comments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/comments", "POST"), "Post.prototype.__create__comments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/comments", "DELETE"), "Post.prototype.__delete__comments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/comments/count", "GET"), "Post.prototype.__count__comments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/commentResponses", "GET"), "Post.prototype.__get__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/commentResponses", "POST"), "Post.prototype.__create__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/commentResponses", "DELETE"), "Post.prototype.__delete__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/commentResponses/count", "GET"), "Post.prototype.__count__commentResponses");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postShares", "GET"), "Post.prototype.__get__postShares");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postShares", "POST"), "Post.prototype.__create__postShares");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postShares", "DELETE"), "Post.prototype.__delete__postShares");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId/postShares/count", "GET"), "Post.prototype.__count__postShares");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Post.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Post.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "Post.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "Post.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "Post.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "Post.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "Post.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "Post.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "Post.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "Post.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:postId", "PUT"), "Post.prototype.updateAttributes");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "Post.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "Post.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getPost", "POST"), "Post.getPost");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/setPost", "POST"), "Post.setPost");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchPosts", "POST"), "Post.fetchPosts");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/deletePost", "POST"), "Post.deletePost");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getUserPosts", "POST"), "Post.getUserPosts");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getPostDetails", "POST"), "Post.getPostDetails");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/markPostInsense", "POST"), "Post.markPostInsense");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getUserPostCount", "POST"), "Post.getUserPostCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "Post.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "Post.getModelRelationSchema");
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method get__appUser definition
            public void get__appUser(  String postId,  Boolean refresh, final ObjectCallback<AppUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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

            

        
    
        
            //Method findById__postLikes definition
            public void findById__postLikes(  String postId,  String fk, final ObjectCallback<PostLike> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void destroyById__postLikes(  String postId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void updateById__postLikes(  String postId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<PostLike> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void findById__comments(  String postId,  String fk, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void destroyById__comments(  String postId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void updateById__comments(  String postId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void findById__commentResponses(  String postId,  String fk, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void destroyById__commentResponses(  String postId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void updateById__commentResponses(  String postId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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

            

        
    
        
            //Method findById__postShares definition
            public void findById__postShares(  String postId,  String fk, final ObjectCallback<PostShare> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__postShares", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PostShareRepository postShareRepo = getRestAdapter().createRepository(PostShareRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postShareRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postShareRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //postShareRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PostShare postShare = postShareRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = postShare.getClass().getMethod("save__db");
                                                    method.invoke(postShare);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(postShare);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__postShares definition ends here..

            

        
    
        
            //Method destroyById__postShares definition
            public void destroyById__postShares(  String postId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__postShares", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method destroyById__postShares definition ends here..

            

        
    
        
            //Method updateById__postShares definition
            public void updateById__postShares(  String postId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<PostShare> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__postShares", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PostShareRepository postShareRepo = getRestAdapter().createRepository(PostShareRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postShareRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postShareRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //postShareRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PostShare postShare = postShareRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = postShare.getClass().getMethod("save__db");
                                                    method.invoke(postShare);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(postShare);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__postShares definition ends here..

            

        
    
        
            //Method get__postLikes definition
            public void get__postLikes(  String postId,  Map<String,  ? extends Object> filter, final DataListCallback<PostLike> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void create__postLikes(  String postId,  Map<String,  ? extends Object> data, final ObjectCallback<PostLike> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void delete__postLikes(  String postId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                

                
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
            public void count__postLikes(  String postId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void get__comments(  String postId,  Map<String,  ? extends Object> filter, final DataListCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void create__comments(  String postId,  Map<String,  ? extends Object> data, final ObjectCallback<Comment> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void delete__comments(  String postId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                

                
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
            public void count__comments(  String postId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void get__commentResponses(  String postId,  Map<String,  ? extends Object> filter, final DataListCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void create__commentResponses(  String postId,  Map<String,  ? extends Object> data, final ObjectCallback<CommentResponse> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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
            public void delete__commentResponses(  String postId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                

                
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
            public void count__commentResponses(  String postId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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

            

        
    
        
            //Method get__postShares definition
            public void get__postShares(  String postId,  Map<String,  ? extends Object> filter, final DataListCallback<PostShare> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__postShares", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<PostShare> postShareList = new DataList<PostShare>();
                                    PostShareRepository postShareRepo = getRestAdapter().createRepository(PostShareRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postShareRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postShareRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        PostShare postShare = postShareRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = postShare.getClass().getMethod("save__db");
                                                      method.invoke(postShare);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        postShareList.add(postShare);
                                    }
                                    callback.onSuccess(postShareList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__postShares definition ends here..

            

        
    
        
            //Method create__postShares definition
            public void create__postShares(  String postId,  Map<String,  ? extends Object> data, final ObjectCallback<PostShare> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__postShares", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PostShareRepository postShareRepo = getRestAdapter().createRepository(PostShareRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postShareRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postShareRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //postShareRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PostShare postShare = postShareRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = postShare.getClass().getMethod("save__db");
                                                    method.invoke(postShare);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(postShare);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__postShares definition ends here..

            

        
    
        
            //Method delete__postShares definition
            public void delete__postShares(  String postId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                

                
                    invokeStaticMethod("prototype.__delete__postShares", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method delete__postShares definition ends here..

            

        
    
        
            //Method count__postShares definition
            public void count__postShares(  String postId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__postShares", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method count__postShares definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<Post> callback){

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
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<Post> callback){

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
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<Post> callback){

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
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<Post> callback){

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
                                    DataList<Post> postList = new DataList<Post>();
                                    PostRepository postRepo = getRestAdapter().createRepository(PostRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Post post = postRepo.createObject(obj);

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

                                        postList.add(post);
                                    }
                                    callback.onSuccess(postList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<Post> callback){

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
            public void updateAttributes(  String postId,  Map<String,  ? extends Object> data, final ObjectCallback<Post> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                
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

            

        
    
        
    
        
            //Method getPost definition
            public void getPost(  String postId, final ObjectCallback<Post> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                

                


                
                    
                    
                    invokeStaticMethod("getPost", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method getPost definition ends here..

            

        
    
        
            //Method setPost definition
            public void setPost(  Map<String,  ? extends Object> postObj,  Map<String,  ? extends Object> userData, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postObj", postObj);
                
                        hashMapObject.put("userData", userData);
                

                


                
                    
                    invokeStaticMethod("setPost", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method setPost definition ends here..

            

        
    
        
            //Method fetchPosts definition
            public void fetchPosts(  double id,  String accessToken,  double limit,  double skip, final DataListCallback<Post> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("accessToken", accessToken);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("fetchPosts", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<Post> postList = new DataList<Post>();
                                    PostRepository postRepo = getRestAdapter().createRepository(PostRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Post post = postRepo.createObject(obj);

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

                                        postList.add(post);
                                    }
                                    callback.onSuccess(postList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method fetchPosts definition ends here..

            

        
    
        
            //Method deletePost definition
            public void deletePost(  String postId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                

                
                    invokeStaticMethod("deletePost", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method deletePost definition ends here..

            

        
    
        
            //Method getUserPosts definition
            public void getUserPosts(  double id,  double limit,  double skip, final DataListCallback<Post> callback){

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
                

                


                

                
                    invokeStaticMethod("getUserPosts", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<Post> postList = new DataList<Post>();
                                    PostRepository postRepo = getRestAdapter().createRepository(PostRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = postRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(postRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Post post = postRepo.createObject(obj);

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

                                        postList.add(post);
                                    }
                                    callback.onSuccess(postList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method getUserPosts definition ends here..

            

        
    
        
            //Method getPostDetails definition
            public void getPostDetails(  double userId,  String postId, final ObjectCallback<Post> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("userId", userId);
                
                        hashMapObject.put("postId", postId);
                

                


                
                    
                    
                    invokeStaticMethod("getPostDetails", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method getPostDetails definition ends here..

            

        
    
        
            //Method markPostInsense definition
            public void markPostInsense(  String postId, final ObjectCallback<Post> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("postId", postId);
                

                


                
                    
                    
                    invokeStaticMethod("markPostInsense", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method markPostInsense definition ends here..

            

        
    
        
            //Method getUserPostCount definition
            public void getUserPostCount(  double id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("getUserPostCount", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method getUserPostCount definition ends here..

            

        
    
        
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
