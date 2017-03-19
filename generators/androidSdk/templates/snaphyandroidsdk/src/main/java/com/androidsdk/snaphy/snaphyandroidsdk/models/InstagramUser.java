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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.InstagramUserRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.InstagramPostRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class InstagramUser extends Model {


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

    private InstagramUser that ;

    public InstagramUser (){
        that = this;
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

            
            
        
    
        
            

            
                private String full_name;
                /* Adding Getter and Setter methods */
                public String getFull_name(){
                    return full_name;
                }

                /* Adding Getter and Setter methods */
                public void setFull_name(String full_name){
                    this.full_name = full_name;
                    //Update hashMap value..
                    hashMap.put("full_name", full_name);
                }

            
            
        
    
        
            

            
                private String profile_picture;
                /* Adding Getter and Setter methods */
                public String getProfile_picture(){
                    return profile_picture;
                }

                /* Adding Getter and Setter methods */
                public void setProfile_picture(String profile_picture){
                    this.profile_picture = profile_picture;
                    //Update hashMap value..
                    hashMap.put("profile_picture", profile_picture);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      InstagramUserRepository lowercaseFirstLetterRepository = (InstagramUserRepository) getRepository();
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
      InstagramUserRepository lowercaseFirstLetterRepository = (InstagramUserRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      InstagramUserRepository lowercaseFirstLetterRepository = (InstagramUserRepository) getRepository();
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
                    private transient DataList<InstagramPost>  instagramPosts ;

                    public DataList< InstagramPost > getInstagramPosts() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            InstagramPostRepository instagramPostRepository = (InstagramPostRepository) getRepository();

                            if(that.getId() != null && instagramPostRepository.getDb() != null){

                                 //Fetch locally from db
                                 //instagramPosts = getInstagramPosts__db(restAdapter);
                                 // Getting single cont
                                 instagramPosts = instagramPostRepository.getDb().getAll__db("instagramUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return instagramPosts;
                    }

                    public void setInstagramPosts(DataList<InstagramPost> instagramPosts) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: instagramPosts){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setInstagramPosts1(hashMaps);
                        }else{
                            this.instagramPosts = instagramPosts;
                            //TODO: Warning move this to new thread
                            for(InstagramPost data: instagramPosts){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setInstagramPosts1(List<Map<String, Object>> instagramPosts) {
                        //First create a dummy Repo class object for ..
                        InstagramPostRepository instagramPostsRepository = new InstagramPostRepository();
                        List<InstagramPost> result = new ArrayList<>();
                        for (Map<String, Object> obj : instagramPosts) {
                            //Also add relation to child type for two way communication..
                            InstagramPost obj1 = instagramPostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setInstagramPosts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setInstagramPosts1(DataList<HashMap<String, Object>> instagramPosts) {
                        //First create a dummy Repo class object for ..
                        InstagramPostRepository instagramPostsRepository = new InstagramPostRepository();
                        DataList<InstagramPost> result = new DataList<>();
                        for (HashMap<String, Object> obj : instagramPosts) {
                            //Also add relation to child type for two way communication..
                            InstagramPost obj1 = instagramPostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setInstagramPosts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<InstagramPost> instagramPosts, InstagramPost dummyClassInstance) {
                        that.setInstagramPosts(instagramPosts);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(InstagramPost instagramPosts) {
                        try{
                            try{

                                  //Save to database..
                                  instagramPosts.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getInstagramPosts().add(instagramPosts);
                        }catch(Exception e){
                            DataList< InstagramPost> instagramPosts1 = new DataList();
                            //Now add this item to list..
                            instagramPosts1.add(instagramPosts);
                            //Now set data....
                            that.setInstagramPosts(instagramPosts1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__instagramPosts( String fk,  RestAdapter restAdapter, final ObjectCallback<InstagramPost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramUserRepository  instagramUserRepo = restAdapter.createRepository(InstagramUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramUserRepo.findById__instagramPosts( (String)that.getId(), fk,  new ObjectCallback<InstagramPost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramPost object) {
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
                                    public void destroyById__instagramPosts( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramUserRepository  instagramUserRepo = restAdapter.createRepository(InstagramUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramUserRepo.destroyById__instagramPosts( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__instagramPosts( String fk,  InstagramPost data,  RestAdapter restAdapter, final ObjectCallback<InstagramPost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramUserRepository  instagramUserRepo = restAdapter.createRepository(InstagramUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        instagramUserRepo.updateById__instagramPosts( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<InstagramPost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramPost object) {
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
                                    public void get__instagramPosts( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<InstagramPost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramUserRepository  instagramUserRepo = restAdapter.createRepository(InstagramUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramUserRepo.get__instagramPosts( (String)that.getId(), filter,  new DataListCallback<InstagramPost> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<InstagramPost> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            InstagramPost obj = new InstagramPost();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (InstagramPost obj : object) {
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
                                    public void create__instagramPosts( InstagramPost data,  RestAdapter restAdapter, final ObjectCallback<InstagramPost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramUserRepository  instagramUserRepo = restAdapter.createRepository(InstagramUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramUserRepo.create__instagramPosts( (String)that.getId(), data.convertMap(),  new ObjectCallback<InstagramPost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(InstagramPost object) {
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
                                    public void delete__instagramPosts( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramUserRepository  instagramUserRepo = restAdapter.createRepository(InstagramUserRepository.class);
                                        
                                        



                                        instagramUserRepo.delete__instagramPosts( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__instagramPosts( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramUserRepository  instagramUserRepo = restAdapter.createRepository(InstagramUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramUserRepo.count__instagramPosts( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
