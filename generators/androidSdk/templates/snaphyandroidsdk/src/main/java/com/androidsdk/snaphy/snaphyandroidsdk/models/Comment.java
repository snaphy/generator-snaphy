package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;
import com.strongloop.android.remoting.adapters.Adapter;
import android.content.Context;

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

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentResponseRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Comment extends Model {


    //For converting all model values to hashMap
    private  transient Map<String, Object> hashMap = new HashMap<>();

    public Map<String,  ? extends Object> convertMap(){
        if(that.getId() != null){
            return hashMap;
        }else{
            hashMap.put("id", that.getId());
            return hashMap;
        }
    }

    private Comment that ;

    public Comment (){
        that = this;
    }

    
        
            

            
                private String uniqueNumber;
                /* Adding Getter and Setter methods */
                public String getUniqueNumber(){
                    return uniqueNumber;
                }

                /* Adding Getter and Setter methods */
                public void setUniqueNumber(String uniqueNumber){
                    this.uniqueNumber = uniqueNumber;
                    //Update hashMap value..
                    hashMap.put("uniqueNumber", uniqueNumber);
                }

            
            
        
    
        
            

            
                private String message;
                /* Adding Getter and Setter methods */
                public String getMessage(){
                    return message;
                }

                /* Adding Getter and Setter methods */
                public void setMessage(String message){
                    this.message = message;
                    //Update hashMap value..
                    hashMap.put("message", message);
                }

            
            
        
    
        
            

            
                private String username;
                /* Adding Getter and Setter methods */
                public String getUsername(){
                    return username;
                }

                /* Adding Getter and Setter methods */
                public void setUsername(String username){
                    this.username = username;
                    //Update hashMap value..
                    hashMap.put("username", username);
                }

            
            
        
    
        
            

            
                private String status;
                /* Adding Getter and Setter methods */
                public String getStatus(){
                    return status;
                }

                /* Adding Getter and Setter methods */
                public void setStatus(String status){
                    this.status = status;
                    //Update hashMap value..
                    hashMap.put("status", status);
                }

            
            
        
    
        
            

            
                private double totalResponses;
                /* Adding Getter and Setter methods */
                public double getTotalResponses(){
                    return totalResponses;
                }

                /* Adding Getter and Setter methods */
                public void setTotalResponses(double totalResponses){
                    this.totalResponses = totalResponses;
                    //Update hashMap value..
                    hashMap.put("totalResponses", totalResponses);
                }

            
            
        
    
        
            

            
                private String added;
                /* Adding Getter and Setter methods */
                public String getAdded(){
                    return added;
                }

                /* Adding Getter and Setter methods */
                public void setAdded(String added){
                    this.added = added;
                    //Update hashMap value..
                    hashMap.put("added", added);
                }

            
            
        
    
        
            

            
                private String updated;
                /* Adding Getter and Setter methods */
                public String getUpdated(){
                    return updated;
                }

                /* Adding Getter and Setter methods */
                public void setUpdated(String updated){
                    this.updated = updated;
                    //Update hashMap value..
                    hashMap.put("updated", updated);
                }

            
            
        
    
        
            

            
                private double commentorId;
                /* Adding Getter and Setter methods */
                public double getCommentorId(){
                    return commentorId;
                }

                /* Adding Getter and Setter methods */
                public void setCommentorId(double commentorId){
                    this.commentorId = commentorId;
                    //Update hashMap value..
                    hashMap.put("commentorId", commentorId);
                }

            
            
        
    
        
            

            
                private String type;
                /* Adding Getter and Setter methods */
                public String getType(){
                    return type;
                }

                /* Adding Getter and Setter methods */
                public void setType(String type){
                    this.type = type;
                    //Update hashMap value..
                    hashMap.put("type", type);
                }

            
            
        
    
        
            

            
                private String oriUserId;
                /* Adding Getter and Setter methods */
                public String getOriUserId(){
                    return oriUserId;
                }

                /* Adding Getter and Setter methods */
                public void setOriUserId(String oriUserId){
                    this.oriUserId = oriUserId;
                    //Update hashMap value..
                    hashMap.put("oriUserId", oriUserId);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null && lowercaseFirstLetterRepository.getDb() != null){
             lowercaseFirstLetterRepository.getDb().delete__db(id);
          }
      }
      //Also save to database..
      super.destroy(callback);
    }



    public void save__db(String id){
      CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){

        if(getId() != null && lowercaseFirstLetterRepository.getDb() != null){
            String id = getId().toString();
          lowercaseFirstLetterRepository.getDb().delete__db(id);
        }
      }
    }


    public void save__db(){
      if(getId() == null){
        return;
      }
      String id = getId().toString();
      save__db(id);
    }



//-----------------------------------END Database Methods------------------------------------------------


    




    //Now adding relations between related models
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Post  post ;
                    private String postId;

                    public String getPostId(){
                         return postId;
                    }

                    public void setPostId(Object postId){
                        if(postId != null){
                          this.postId = postId.toString();
                        }
                    }

                    public Post getPost() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(post == null){
                                        CommentRepository commentRepository = (CommentRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = commentRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          post = getPost__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return post;
                    }

                    public void setPost(Post post) {
                        this.post = post;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPost(Map<String, Object> post) {
                        //First create a dummy Repo class object for customer.
                        PostRepository postRepository = new PostRepository();
                        Post post1 = postRepository.createObject(post);
                        setPost(post1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPost(HashMap<String, Object> post) {
                        //First create a dummy Repo class object for customer.
                        PostRepository postRepository = new PostRepository();
                        Post post1 = postRepository.createObject(post);
                        setPost(post1);
                    }

                    //Adding relation method..
                    public void addRelation(Post post) {
                        that.setPost(post);
                    }


                    //Fetch related data from local database if present a postId identifier as property for belongsTo
                    public Post getPost__db(SnaphyRestAdapter restAdapter){
                      if(postId != null){
                        PostRepository postRepository = restAdapter.createRepository(PostRepository.class);
                            try{
                            CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(postRepository.getDb() == null ){
                                                    postRepository.addStorage(context);
                                                }

                                                if(context != null && postRepository.getDb() != null){
                                                    postRepository.addStorage(context);
                                                    Post post = (Post) postRepository.getDb().get__db(postId);
                                                    return post;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__post( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__post( (String)that.getId(), refresh,  new ObjectCallback<Post> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Post object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient News  news ;
                    private String newsId;

                    public String getNewsId(){
                         return newsId;
                    }

                    public void setNewsId(Object newsId){
                        if(newsId != null){
                          this.newsId = newsId.toString();
                        }
                    }

                    public News getNews() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(news == null){
                                        CommentRepository commentRepository = (CommentRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = commentRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          news = getNews__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return news;
                    }

                    public void setNews(News news) {
                        this.news = news;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setNews(Map<String, Object> news) {
                        //First create a dummy Repo class object for customer.
                        NewsRepository newsRepository = new NewsRepository();
                        News news1 = newsRepository.createObject(news);
                        setNews(news1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setNews(HashMap<String, Object> news) {
                        //First create a dummy Repo class object for customer.
                        NewsRepository newsRepository = new NewsRepository();
                        News news1 = newsRepository.createObject(news);
                        setNews(news1);
                    }

                    //Adding relation method..
                    public void addRelation(News news) {
                        that.setNews(news);
                    }


                    //Fetch related data from local database if present a newsId identifier as property for belongsTo
                    public News getNews__db(SnaphyRestAdapter restAdapter){
                      if(newsId != null){
                        NewsRepository newsRepository = restAdapter.createRepository(NewsRepository.class);
                            try{
                            CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(newsRepository.getDb() == null ){
                                                    newsRepository.addStorage(context);
                                                }

                                                if(context != null && newsRepository.getDb() != null){
                                                    newsRepository.addStorage(context);
                                                    News news = (News) newsRepository.getDb().get__db(newsId);
                                                    return news;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__news( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<News> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__news( (String)that.getId(), refresh,  new ObjectCallback<News> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(News object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<CommentResponse>  commentResponses ;

                    public DataList< CommentResponse > getCommentResponses() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            CommentResponseRepository commentResponseRepository = (CommentResponseRepository) getRepository();

                            if(that.getId() != null && commentResponseRepository.getDb() != null){

                                 //Fetch locally from db
                                 //commentResponses = getCommentResponses__db(restAdapter);
                                 // Getting single cont
                                 commentResponses = commentResponseRepository.getDb().getAll__db("commentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return commentResponses;
                    }

                    public void setCommentResponses(DataList<CommentResponse> commentResponses) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: commentResponses){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setCommentResponses1(hashMaps);
                        }else{
                            this.commentResponses = commentResponses;
                            //TODO: Warning move this to new thread
                            for(CommentResponse data: commentResponses){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCommentResponses1(List<Map<String, Object>> commentResponses) {
                        //First create a dummy Repo class object for ..
                        CommentResponseRepository commentResponsesRepository = new CommentResponseRepository();
                        List<CommentResponse> result = new ArrayList<>();
                        for (Map<String, Object> obj : commentResponses) {
                            //Also add relation to child type for two way communication..
                            CommentResponse obj1 = commentResponsesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCommentResponses(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCommentResponses1(DataList<HashMap<String, Object>> commentResponses) {
                        //First create a dummy Repo class object for ..
                        CommentResponseRepository commentResponsesRepository = new CommentResponseRepository();
                        DataList<CommentResponse> result = new DataList<>();
                        for (HashMap<String, Object> obj : commentResponses) {
                            //Also add relation to child type for two way communication..
                            CommentResponse obj1 = commentResponsesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCommentResponses(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<CommentResponse> commentResponses, CommentResponse dummyClassInstance) {
                        that.setCommentResponses(commentResponses);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(CommentResponse commentResponses) {
                        try{
                            try{

                                  //Save to database..
                                  commentResponses.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getCommentResponses().add(commentResponses);
                        }catch(Exception e){
                            DataList< CommentResponse> commentResponses1 = new DataList();
                            //Now add this item to list..
                            commentResponses1.add(commentResponses);
                            //Now set data....
                            that.setCommentResponses(commentResponses1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__commentResponses( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<CommentResponse> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.findById__commentResponses( (String)that.getId(), fk,  new ObjectCallback<CommentResponse> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentResponse object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__commentResponses( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.destroyById__commentResponses( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__commentResponses( String fk,  CommentResponse data,  SnaphyRestAdapter restAdapter, final ObjectCallback<CommentResponse> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.updateById__commentResponses( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<CommentResponse> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentResponse object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__commentResponses( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<CommentResponse> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__commentResponses( (String)that.getId(), filter,  new DataListCallback<CommentResponse> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<CommentResponse> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            CommentResponse obj = new CommentResponse();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (CommentResponse obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__commentResponses( CommentResponse data,  SnaphyRestAdapter restAdapter, final ObjectCallback<CommentResponse> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.create__commentResponses( (String)that.getId(), data.convertMap(),  new ObjectCallback<CommentResponse> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentResponse object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__commentResponses( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        



                                        commentRepo.delete__commentResponses( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__commentResponses( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.count__commentResponses( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient AppUser  appUser ;
                    private String appUserId;

                    public String getAppUserId(){
                         return appUserId;
                    }

                    public void setAppUserId(Object appUserId){
                        if(appUserId != null){
                          this.appUserId = appUserId.toString();
                        }
                    }

                    public AppUser getAppUser() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(appUser == null){
                                        CommentRepository commentRepository = (CommentRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = commentRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          appUser = getAppUser__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return appUser;
                    }

                    public void setAppUser(AppUser appUser) {
                        this.appUser = appUser;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAppUser(Map<String, Object> appUser) {
                        //First create a dummy Repo class object for customer.
                        AppUserRepository appUserRepository = new AppUserRepository();
                        AppUser appUser1 = appUserRepository.createObject(appUser);
                        setAppUser(appUser1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAppUser(HashMap<String, Object> appUser) {
                        //First create a dummy Repo class object for customer.
                        AppUserRepository appUserRepository = new AppUserRepository();
                        AppUser appUser1 = appUserRepository.createObject(appUser);
                        setAppUser(appUser1);
                    }

                    //Adding relation method..
                    public void addRelation(AppUser appUser) {
                        that.setAppUser(appUser);
                    }


                    //Fetch related data from local database if present a appUserId identifier as property for belongsTo
                    public AppUser getAppUser__db(SnaphyRestAdapter restAdapter){
                      if(appUserId != null){
                        AppUserRepository appUserRepository = restAdapter.createRepository(AppUserRepository.class);
                            try{
                            CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(appUserRepository.getDb() == null ){
                                                    appUserRepository.addStorage(context);
                                                }

                                                if(context != null && appUserRepository.getDb() != null){
                                                    appUserRepository.addStorage(context);
                                                    AppUser appUser = (AppUser) appUserRepository.getDb().get__db(appUserId);
                                                    return appUser;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void get__appUser( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__appUser( (String)that.getId(), refresh,  new ObjectCallback<AppUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(AppUser object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
