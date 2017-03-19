package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.InstagramPostRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.InstagramUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.InstagramCaptionRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class InstagramPost extends Model {


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

    private InstagramPost that ;

    public InstagramPost (){
        that = this;
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

            
            
        
    
        
            

            
                private boolean user_has_liked;
                /* Adding Getter and Setter methods */
                public boolean getUser_has_liked(){
                    return user_has_liked;
                }

                /* Adding Getter and Setter methods */
                public void setUser_has_liked(boolean user_has_liked){
                    this.user_has_liked = user_has_liked;
                    //Update hashMap value..
                    hashMap.put("user_has_liked", user_has_liked);
                }

            
            
        
    
        
            

            
                private Map<String, Object> comments;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getComments(){
                    return comments;
                }

                /* Adding Getter and Setter methods */
                public void setComments(Map<String, Object> comments){
                    this.comments = comments;
                    //Update Map value..
                    hashMap.put("comments", comments);
                }

            
            
        
    
        
            

            
                private Map<String, Object> likes;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getLikes(){
                    return likes;
                }

                /* Adding Getter and Setter methods */
                public void setLikes(Map<String, Object> likes){
                    this.likes = likes;
                    //Update Map value..
                    hashMap.put("likes", likes);
                }

            
            
        
    
        
            

            
                private Map<String, Object> images;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getImages(){
                    return images;
                }

                /* Adding Getter and Setter methods */
                public void setImages(Map<String, Object> images){
                    this.images = images;
                    //Update Map value..
                    hashMap.put("images", images);
                }

            
            
        
    
        
            

            
                private double created_time;
                /* Adding Getter and Setter methods */
                public double getCreated_time(){
                    return created_time;
                }

                /* Adding Getter and Setter methods */
                public void setCreated_time(double created_time){
                    this.created_time = created_time;
                    //Update hashMap value..
                    hashMap.put("created_time", created_time);
                }

            
            
        
    
        
            

            
                private String filter;
                /* Adding Getter and Setter methods */
                public String getFilter(){
                    return filter;
                }

                /* Adding Getter and Setter methods */
                public void setFilter(String filter){
                    this.filter = filter;
                    //Update hashMap value..
                    hashMap.put("filter", filter);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      InstagramPostRepository lowercaseFirstLetterRepository = (InstagramPostRepository) getRepository();
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
      InstagramPostRepository lowercaseFirstLetterRepository = (InstagramPostRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      InstagramPostRepository lowercaseFirstLetterRepository = (InstagramPostRepository) getRepository();
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
                    private transient InstagramUser  user ;
                    private String instagramUserId;

                    public String getInstagramUserId(){
                         return instagramUserId;
                    }

                    public void setInstagramUserId(Object instagramUserId){
                        if(instagramUserId != null){
                          this.instagramUserId = instagramUserId.toString();
                        }
                    }

                    public InstagramUser getUser() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(user == null){
		                  InstagramPostRepository instagramPostRepository = (InstagramPostRepository) getRepository();

		                  RestAdapter restAdapter = instagramPostRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    user = getUser__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return user;
                    }

                    public void setUser(InstagramUser user) {
                        this.user = user;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setUser(Map<String, Object> user) {
                        //First create a dummy Repo class object for customer.
                        InstagramUserRepository userRepository = new InstagramUserRepository();
                        InstagramUser user1 = userRepository.createObject(user);
                        setUser(user1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setUser(HashMap<String, Object> user) {
                        //First create a dummy Repo class object for customer.
                        InstagramUserRepository userRepository = new InstagramUserRepository();
                        InstagramUser user1 = userRepository.createObject(user);
                        setUser(user1);
                    }

                    //Adding relation method..
                    public void addRelation(InstagramUser user) {
                        that.setUser(user);
                    }


                    //Fetch related data from local database if present a instagramUserId identifier as property for belongsTo
                    public InstagramUser getUser__db(RestAdapter restAdapter){
                      if(instagramUserId != null){
                        InstagramUserRepository userRepository = restAdapter.createRepository(InstagramUserRepository.class);
			  try{
				InstagramPostRepository lowercaseFirstLetterRepository = (InstagramPostRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(userRepository.getDb() == null ){
		                            userRepository.addStorage(context);
		                        }

		                        if(context != null && userRepository.getDb() != null){
		                            userRepository.addStorage(context);
		                            InstagramUser user = (InstagramUser) userRepository.getDb().get__db(instagramUserId);
		                            return user;
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
                                    public void get__user( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<InstagramUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramPostRepository  instagramPostRepo = restAdapter.createRepository(InstagramPostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramPostRepo.get__user( (String)that.getId(), refresh,  new ObjectCallback<InstagramUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramUser object) {
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
                                    public void create__user( InstagramUser data,  RestAdapter restAdapter, final ObjectCallback<InstagramUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramPostRepository  instagramPostRepo = restAdapter.createRepository(InstagramPostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramPostRepo.create__user( (String)that.getId(), data.convertMap(),  new ObjectCallback<InstagramUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramUser object) {
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
                                    public void update__user( InstagramUser data,  RestAdapter restAdapter, final ObjectCallback<InstagramUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramPostRepository  instagramPostRepo = restAdapter.createRepository(InstagramPostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramPostRepo.update__user( (String)that.getId(), data.convertMap(),  new ObjectCallback<InstagramUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramUser object) {
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
                                    public void destroy__user( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramPostRepository  instagramPostRepo = restAdapter.createRepository(InstagramPostRepository.class);
                                        
                                        



                                        instagramPostRepo.destroy__user( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient InstagramCaption  caption ;
                    private String instagramCaptionId;

                    public String getInstagramCaptionId(){
                         return instagramCaptionId;
                    }

                    public void setInstagramCaptionId(Object instagramCaptionId){
                        if(instagramCaptionId != null){
                          this.instagramCaptionId = instagramCaptionId.toString();
                        }
                    }

                    public InstagramCaption getCaption() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(caption == null){
		                  InstagramPostRepository instagramPostRepository = (InstagramPostRepository) getRepository();

		                  RestAdapter restAdapter = instagramPostRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    caption = getCaption__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return caption;
                    }

                    public void setCaption(InstagramCaption caption) {
                        this.caption = caption;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCaption(Map<String, Object> caption) {
                        //First create a dummy Repo class object for customer.
                        InstagramCaptionRepository captionRepository = new InstagramCaptionRepository();
                        InstagramCaption caption1 = captionRepository.createObject(caption);
                        setCaption(caption1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCaption(HashMap<String, Object> caption) {
                        //First create a dummy Repo class object for customer.
                        InstagramCaptionRepository captionRepository = new InstagramCaptionRepository();
                        InstagramCaption caption1 = captionRepository.createObject(caption);
                        setCaption(caption1);
                    }

                    //Adding relation method..
                    public void addRelation(InstagramCaption caption) {
                        that.setCaption(caption);
                    }


                    //Fetch related data from local database if present a instagramCaptionId identifier as property for belongsTo
                    public InstagramCaption getCaption__db(RestAdapter restAdapter){
                      if(instagramCaptionId != null){
                        InstagramCaptionRepository captionRepository = restAdapter.createRepository(InstagramCaptionRepository.class);
			  try{
				InstagramPostRepository lowercaseFirstLetterRepository = (InstagramPostRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(captionRepository.getDb() == null ){
		                            captionRepository.addStorage(context);
		                        }

		                        if(context != null && captionRepository.getDb() != null){
		                            captionRepository.addStorage(context);
		                            InstagramCaption caption = (InstagramCaption) captionRepository.getDb().get__db(instagramCaptionId);
		                            return caption;
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
                                    public void get__caption( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<InstagramCaption> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramPostRepository  instagramPostRepo = restAdapter.createRepository(InstagramPostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramPostRepo.get__caption( (String)that.getId(), refresh,  new ObjectCallback<InstagramCaption> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramCaption object) {
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
                                    public void create__caption( InstagramCaption data,  RestAdapter restAdapter, final ObjectCallback<InstagramCaption> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramPostRepository  instagramPostRepo = restAdapter.createRepository(InstagramPostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramPostRepo.create__caption( (String)that.getId(), data.convertMap(),  new ObjectCallback<InstagramCaption> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramCaption object) {
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
                                    public void update__caption( InstagramCaption data,  RestAdapter restAdapter, final ObjectCallback<InstagramCaption> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramPostRepository  instagramPostRepo = restAdapter.createRepository(InstagramPostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramPostRepo.update__caption( (String)that.getId(), data.convertMap(),  new ObjectCallback<InstagramCaption> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramCaption object) {
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
                                    public void destroy__caption( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramPostRepository  instagramPostRepo = restAdapter.createRepository(InstagramPostRepository.class);
                                        
                                        



                                        instagramPostRepo.destroy__caption( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
