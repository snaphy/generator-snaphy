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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentResponseRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostLikeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostShareRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class AppUser extends User {


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

    private AppUser that ;

    public AppUser (){
        that = this;
    }

    
        
            

            
                private String firstName;
                /* Adding Getter and Setter methods */
                public String getFirstName(){
                    return firstName;
                }

                /* Adding Getter and Setter methods */
                public void setFirstName(String firstName){
                    this.firstName = firstName;
                    //Update hashMap value..
                    hashMap.put("firstName", firstName);
                }

            
            
        
    
        
            

            
                private String lastName;
                /* Adding Getter and Setter methods */
                public String getLastName(){
                    return lastName;
                }

                /* Adding Getter and Setter methods */
                public void setLastName(String lastName){
                    this.lastName = lastName;
                    //Update hashMap value..
                    hashMap.put("lastName", lastName);
                }

            
            
        
    
        
            

            
                private String email;
                /* Adding Getter and Setter methods */
                public String getEmail(){
                    return email;
                }

                /* Adding Getter and Setter methods */
                public void setEmail(String email){
                    this.email = email;
                    //Update hashMap value..
                    hashMap.put("email", email);
                }

            
            
        
    
        
            

            
                private String password;
                /* Adding Getter and Setter methods */
                public String getPassword(){
                    return password;
                }

                /* Adding Getter and Setter methods */
                public void setPassword(String password){
                    this.password = password;
                    //Update hashMap value..
                    hashMap.put("password", password);
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

            
            
        
    
        
            

            
                private Map<String, Object> profilePic;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getProfilePic(){
                    return profilePic;
                }

                /* Adding Getter and Setter methods */
                public void setProfilePic(Map<String, Object> profilePic){
                    this.profilePic = profilePic;
                    //Update Map value..
                    hashMap.put("profilePic", profilePic);
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

            
            
        
    
        
            

            
                private double cricUserId;
                /* Adding Getter and Setter methods */
                public double getCricUserId(){
                    return cricUserId;
                }

                /* Adding Getter and Setter methods */
                public void setCricUserId(double cricUserId){
                    this.cricUserId = cricUserId;
                    //Update hashMap value..
                    hashMap.put("cricUserId", cricUserId);
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      AppUserRepository lowercaseFirstLetterRepository = (AppUserRepository) getRepository();
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
      AppUserRepository lowercaseFirstLetterRepository = (AppUserRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      AppUserRepository lowercaseFirstLetterRepository = (AppUserRepository) getRepository();
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
    
         
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Post>  posts ;

                    public DataList< Post > getPosts() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PostRepository postRepository = (PostRepository) getRepository();

                            if(that.getId() != null && postRepository.getDb() != null){

                                 //Fetch locally from db
                                 //posts = getPosts__db(restAdapter);
                                 // Getting single cont
                                 posts = postRepository.getDb().getAll__db("appUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return posts;
                    }

                    public void setPosts(DataList<Post> posts) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: posts){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPosts1(hashMaps);
                        }else{
                            this.posts = posts;
                            //TODO: Warning move this to new thread
                            for(Post data: posts){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPosts1(List<Map<String, Object>> posts) {
                        //First create a dummy Repo class object for ..
                        PostRepository postsRepository = new PostRepository();
                        List<Post> result = new ArrayList<>();
                        for (Map<String, Object> obj : posts) {
                            //Also add relation to child type for two way communication..
                            Post obj1 = postsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPosts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPosts1(DataList<HashMap<String, Object>> posts) {
                        //First create a dummy Repo class object for ..
                        PostRepository postsRepository = new PostRepository();
                        DataList<Post> result = new DataList<>();
                        for (HashMap<String, Object> obj : posts) {
                            //Also add relation to child type for two way communication..
                            Post obj1 = postsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPosts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Post> posts, Post dummyClassInstance) {
                        that.setPosts(posts);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Post posts) {
                        try{
                            try{

                                  //Save to database..
                                  posts.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPosts().add(posts);
                        }catch(Exception e){
                            DataList< Post> posts1 = new DataList();
                            //Now add this item to list..
                            posts1.add(posts);
                            //Now set data....
                            that.setPosts(posts1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__posts( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__posts( (String)that.getId(), fk,  new ObjectCallback<Post> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__posts( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__posts( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__posts( String fk,  Post data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__posts( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Post> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__posts( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__posts( (String)that.getId(), filter,  new DataListCallback<Post> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Post> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Post obj = new Post();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Post obj : object) {
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
                                    public void create__posts( Post data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__posts( (String)that.getId(), data.convertMap(),  new ObjectCallback<Post> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__posts( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__posts( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__posts( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__posts( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Comment>  comments ;

                    public DataList< Comment > getComments() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            CommentRepository commentRepository = (CommentRepository) getRepository();

                            if(that.getId() != null && commentRepository.getDb() != null){

                                 //Fetch locally from db
                                 //comments = getComments__db(restAdapter);
                                 // Getting single cont
                                 comments = commentRepository.getDb().getAll__db("appUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return comments;
                    }

                    public void setComments(DataList<Comment> comments) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: comments){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setComments1(hashMaps);
                        }else{
                            this.comments = comments;
                            //TODO: Warning move this to new thread
                            for(Comment data: comments){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(List<Map<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentRepository commentsRepository = new CommentRepository();
                        List<Comment> result = new ArrayList<>();
                        for (Map<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comment obj1 = commentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setComments(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(DataList<HashMap<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentRepository commentsRepository = new CommentRepository();
                        DataList<Comment> result = new DataList<>();
                        for (HashMap<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comment obj1 = commentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setComments(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Comment> comments, Comment dummyClassInstance) {
                        that.setComments(comments);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Comment comments) {
                        try{
                            try{

                                  //Save to database..
                                  comments.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getComments().add(comments);
                        }catch(Exception e){
                            DataList< Comment> comments1 = new DataList();
                            //Now add this item to list..
                            comments1.add(comments);
                            //Now set data....
                            that.setComments(comments1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__comments( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__comments( (String)that.getId(), fk,  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void destroyById__comments( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__comments( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__comments( String fk,  Comment data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__comments( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void get__comments( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__comments( (String)that.getId(), filter,  new DataListCallback<Comment> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Comment> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Comment obj = new Comment();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Comment obj : object) {
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
                                    public void create__comments( Comment data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__comments( (String)that.getId(), data.convertMap(),  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void delete__comments( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__comments( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__comments( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__comments( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 commentResponses = commentResponseRepository.getDb().getAll__db("appUserId", that.getId().toString());

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
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__commentResponses( (String)that.getId(), fk,  new ObjectCallback<CommentResponse> (){
                                            

                                            
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
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__commentResponses( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__commentResponses( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<CommentResponse> (){
                                            

                                            
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
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__commentResponses( (String)that.getId(), filter,  new DataListCallback<CommentResponse> (){
                                            

                                            


                                            
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
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__commentResponses( (String)that.getId(), data.convertMap(),  new ObjectCallback<CommentResponse> (){
                                            

                                            
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
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__commentResponses( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__commentResponses( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<ChatItem>  chatItems ;

                    public DataList< ChatItem > getChatItems() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ChatItemRepository chatItemRepository = (ChatItemRepository) getRepository();

                            if(that.getId() != null && chatItemRepository.getDb() != null){

                                 //Fetch locally from db
                                 //chatItems = getChatItems__db(restAdapter);
                                 // Getting single cont
                                 chatItems = chatItemRepository.getDb().getAll__db("appUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return chatItems;
                    }

                    public void setChatItems(DataList<ChatItem> chatItems) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: chatItems){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setChatItems1(hashMaps);
                        }else{
                            this.chatItems = chatItems;
                            //TODO: Warning move this to new thread
                            for(ChatItem data: chatItems){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChatItems1(List<Map<String, Object>> chatItems) {
                        //First create a dummy Repo class object for ..
                        ChatItemRepository chatItemsRepository = new ChatItemRepository();
                        List<ChatItem> result = new ArrayList<>();
                        for (Map<String, Object> obj : chatItems) {
                            //Also add relation to child type for two way communication..
                            ChatItem obj1 = chatItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChatItems(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChatItems1(DataList<HashMap<String, Object>> chatItems) {
                        //First create a dummy Repo class object for ..
                        ChatItemRepository chatItemsRepository = new ChatItemRepository();
                        DataList<ChatItem> result = new DataList<>();
                        for (HashMap<String, Object> obj : chatItems) {
                            //Also add relation to child type for two way communication..
                            ChatItem obj1 = chatItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChatItems(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<ChatItem> chatItems, ChatItem dummyClassInstance) {
                        that.setChatItems(chatItems);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(ChatItem chatItems) {
                        try{
                            try{

                                  //Save to database..
                                  chatItems.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getChatItems().add(chatItems);
                        }catch(Exception e){
                            DataList< ChatItem> chatItems1 = new DataList();
                            //Now add this item to list..
                            chatItems1.add(chatItems);
                            //Now set data....
                            that.setChatItems(chatItems1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__chatItems( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__chatItems( (String)that.getId(), fk,  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void destroyById__chatItems( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__chatItems( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__chatItems( String fk,  ChatItem data,  SnaphyRestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__chatItems( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void get__chatItems( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__chatItems( (String)that.getId(), filter,  new DataListCallback<ChatItem> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<ChatItem> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            ChatItem obj = new ChatItem();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (ChatItem obj : object) {
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
                                    public void create__chatItems( ChatItem data,  SnaphyRestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__chatItems( (String)that.getId(), data.convertMap(),  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void delete__chatItems( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__chatItems( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__chatItems( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__chatItems( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<PostLike>  postLikes ;

                    public DataList< PostLike > getPostLikes() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PostLikeRepository postLikeRepository = (PostLikeRepository) getRepository();

                            if(that.getId() != null && postLikeRepository.getDb() != null){

                                 //Fetch locally from db
                                 //postLikes = getPostLikes__db(restAdapter);
                                 // Getting single cont
                                 postLikes = postLikeRepository.getDb().getAll__db("appUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return postLikes;
                    }

                    public void setPostLikes(DataList<PostLike> postLikes) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: postLikes){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPostLikes1(hashMaps);
                        }else{
                            this.postLikes = postLikes;
                            //TODO: Warning move this to new thread
                            for(PostLike data: postLikes){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostLikes1(List<Map<String, Object>> postLikes) {
                        //First create a dummy Repo class object for ..
                        PostLikeRepository postLikesRepository = new PostLikeRepository();
                        List<PostLike> result = new ArrayList<>();
                        for (Map<String, Object> obj : postLikes) {
                            //Also add relation to child type for two way communication..
                            PostLike obj1 = postLikesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostLikes(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostLikes1(DataList<HashMap<String, Object>> postLikes) {
                        //First create a dummy Repo class object for ..
                        PostLikeRepository postLikesRepository = new PostLikeRepository();
                        DataList<PostLike> result = new DataList<>();
                        for (HashMap<String, Object> obj : postLikes) {
                            //Also add relation to child type for two way communication..
                            PostLike obj1 = postLikesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostLikes(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PostLike> postLikes, PostLike dummyClassInstance) {
                        that.setPostLikes(postLikes);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PostLike postLikes) {
                        try{
                            try{

                                  //Save to database..
                                  postLikes.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPostLikes().add(postLikes);
                        }catch(Exception e){
                            DataList< PostLike> postLikes1 = new DataList();
                            //Now add this item to list..
                            postLikes1.add(postLikes);
                            //Now set data....
                            that.setPostLikes(postLikes1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__postLikes( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostLike> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__postLikes( (String)that.getId(), fk,  new ObjectCallback<PostLike> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostLike object) {
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
                                    public void destroyById__postLikes( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__postLikes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__postLikes( String fk,  PostLike data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostLike> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__postLikes( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PostLike> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostLike object) {
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
                                    public void get__postLikes( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<PostLike> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__postLikes( (String)that.getId(), filter,  new DataListCallback<PostLike> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PostLike> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PostLike obj = new PostLike();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PostLike obj : object) {
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
                                    public void create__postLikes( PostLike data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostLike> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__postLikes( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostLike> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostLike object) {
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
                                    public void delete__postLikes( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__postLikes( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__postLikes( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__postLikes( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<PostShare>  postShares ;

                    public DataList< PostShare > getPostShares() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PostShareRepository postShareRepository = (PostShareRepository) getRepository();

                            if(that.getId() != null && postShareRepository.getDb() != null){

                                 //Fetch locally from db
                                 //postShares = getPostShares__db(restAdapter);
                                 // Getting single cont
                                 postShares = postShareRepository.getDb().getAll__db("appUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return postShares;
                    }

                    public void setPostShares(DataList<PostShare> postShares) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: postShares){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPostShares1(hashMaps);
                        }else{
                            this.postShares = postShares;
                            //TODO: Warning move this to new thread
                            for(PostShare data: postShares){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostShares1(List<Map<String, Object>> postShares) {
                        //First create a dummy Repo class object for ..
                        PostShareRepository postSharesRepository = new PostShareRepository();
                        List<PostShare> result = new ArrayList<>();
                        for (Map<String, Object> obj : postShares) {
                            //Also add relation to child type for two way communication..
                            PostShare obj1 = postSharesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostShares(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostShares1(DataList<HashMap<String, Object>> postShares) {
                        //First create a dummy Repo class object for ..
                        PostShareRepository postSharesRepository = new PostShareRepository();
                        DataList<PostShare> result = new DataList<>();
                        for (HashMap<String, Object> obj : postShares) {
                            //Also add relation to child type for two way communication..
                            PostShare obj1 = postSharesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostShares(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PostShare> postShares, PostShare dummyClassInstance) {
                        that.setPostShares(postShares);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PostShare postShares) {
                        try{
                            try{

                                  //Save to database..
                                  postShares.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPostShares().add(postShares);
                        }catch(Exception e){
                            DataList< PostShare> postShares1 = new DataList();
                            //Now add this item to list..
                            postShares1.add(postShares);
                            //Now set data....
                            that.setPostShares(postShares1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__postShares( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostShare> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__postShares( (String)that.getId(), fk,  new ObjectCallback<PostShare> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostShare object) {
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
                                    public void destroyById__postShares( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__postShares( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__postShares( String fk,  PostShare data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostShare> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__postShares( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PostShare> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostShare object) {
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
                                    public void get__postShares( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<PostShare> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__postShares( (String)that.getId(), filter,  new DataListCallback<PostShare> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PostShare> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PostShare obj = new PostShare();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PostShare obj : object) {
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
                                    public void create__postShares( PostShare data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostShare> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__postShares( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostShare> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostShare object) {
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
                                    public void delete__postShares( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__postShares( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__postShares( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__postShares( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
      

}
