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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookAccessTokenRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class FacebookAccessToken extends Model {


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

    private FacebookAccessToken that ;

    public FacebookAccessToken (){
        that = this;
    }

    
        
            

            
                private String FbUserId;
                /* Adding Getter and Setter methods */
                public String getFbUserId(){
                    return FbUserId;
                }

                /* Adding Getter and Setter methods */
                public void setFbUserId(String FbUserId){
                    this.FbUserId = FbUserId;
                    //Update hashMap value..
                    hashMap.put("FbUserId", FbUserId);
                }

            
            
        
    
        
            

            
                private String token;
                /* Adding Getter and Setter methods */
                public String getToken(){
                    return token;
                }

                /* Adding Getter and Setter methods */
                public void setToken(String token){
                    this.token = token;
                    //Update hashMap value..
                    hashMap.put("token", token);
                }

            
            
        
    
        
            

            
                private String expires;
                /* Adding Getter and Setter methods */
                public String getExpires(){
                    return expires;
                }

                /* Adding Getter and Setter methods */
                public void setExpires(String expires){
                    this.expires = expires;
                    //Update hashMap value..
                    hashMap.put("expires", expires);
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

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      FacebookAccessTokenRepository lowercaseFirstLetterRepository = (FacebookAccessTokenRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null && lowercaseFirstLetterRepository.getDb() != null){
             lowercaseFirstLetterRepository.getDb().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }



    public void save__db(String id){
      FacebookAccessTokenRepository lowercaseFirstLetterRepository = (FacebookAccessTokenRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      FacebookAccessTokenRepository lowercaseFirstLetterRepository = (FacebookAccessTokenRepository) getRepository();
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
                    private transient AppUser  appUser ;
                    private String userId;

                    public String getUserId(){
                         return userId;
                    }

                    public void setUserId(Object userId){
                        if(userId != null){
                          this.userId = userId.toString();
                        }
                    }

                    public AppUser getAppUser() {
                        //Adding database method for fetching from relation if not present..
                        if(appUser == null){
                          FacebookAccessTokenRepository facebookAccessTokenRepository = (FacebookAccessTokenRepository) getRepository();

                          RestAdapter restAdapter = facebookAccessTokenRepository.getRestAdapter();
                          if(restAdapter != null){
                            //Fetch locally from db
                            appUser = getAppUser__db(restAdapter);
                          }
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


                    //Fetch related data from local database if present a userId identifier as property for belongsTo
                    public AppUser getAppUser__db(RestAdapter restAdapter){
                      if(userId != null){
                        AppUserRepository appUserRepository = restAdapter.createRepository(AppUserRepository.class);
                           FacebookAccessTokenRepository lowercaseFirstLetterRepository = (FacebookAccessTokenRepository) getRepository();
                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                Context context = lowercaseFirstLetterRepository.getContext();
                                if(context != null && appUserRepository.getDb() != null){
                                    appUserRepository.addStorage(context);
                                    AppUser appUser = (AppUser) appUserRepository.getDb().get__db(userId);
                                    return appUser;
                                }else{
                                    return null;
                                }
                          }else{
                            return null;
                          }
                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__appUser( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FacebookAccessTokenRepository  facebookAccessTokenRepo = restAdapter.createRepository(FacebookAccessTokenRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        facebookAccessTokenRepo.get__appUser( (String)that.getId(), refresh,  new ObjectCallback<AppUser> (){
                                            

                                            
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
