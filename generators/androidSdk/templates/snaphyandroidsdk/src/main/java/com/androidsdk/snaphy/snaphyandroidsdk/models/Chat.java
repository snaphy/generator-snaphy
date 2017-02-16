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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Chat extends Model {


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

    private Chat that ;

    public Chat (){
        that = this;
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

            
            
        
    
        
            

            
                private Map<String, Object> image;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getImage(){
                    return image;
                }

                /* Adding Getter and Setter methods */
                public void setImage(Map<String, Object> image){
                    this.image = image;
                    //Update Map value..
                    hashMap.put("image", image);
                }

            
            
        
    
        
            

            
                private String from;
                /* Adding Getter and Setter methods */
                public String getFrom(){
                    return from;
                }

                /* Adding Getter and Setter methods */
                public void setFrom(String from){
                    this.from = from;
                    //Update hashMap value..
                    hashMap.put("from", from);
                }

            
            
        
    
        
            

            
                private String guid;
                /* Adding Getter and Setter methods */
                public String getGuid(){
                    return guid;
                }

                /* Adding Getter and Setter methods */
                public void setGuid(String guid){
                    this.guid = guid;
                    //Update hashMap value..
                    hashMap.put("guid", guid);
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
      ChatRepository lowercaseFirstLetterRepository = (ChatRepository) getRepository();
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
      ChatRepository lowercaseFirstLetterRepository = (ChatRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ChatRepository lowercaseFirstLetterRepository = (ChatRepository) getRepository();
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
                    private transient Brand  brand ;
                    private String brandId;

                    public String getBrandId(){
                         return brandId;
                    }

                    public void setBrandId(Object brandId){
                        if(brandId != null){
                          this.brandId = brandId.toString();
                        }
                    }

                    public Brand getBrand() {
                        //Adding database method for fetching from relation if not present..
                        if(brand == null){
                          ChatRepository chatRepository = (ChatRepository) getRepository();

                          RestAdapter restAdapter = chatRepository.getRestAdapter();
                          if(restAdapter != null){
                            //Fetch locally from db
                            brand = getBrand__db(restAdapter);
                          }
                        }
                        return brand;
                    }

                    public void setBrand(Brand brand) {
                        this.brand = brand;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBrand(Map<String, Object> brand) {
                        //First create a dummy Repo class object for customer.
                        BrandRepository brandRepository = new BrandRepository();
                        Brand brand1 = brandRepository.createObject(brand);
                        setBrand(brand1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBrand(HashMap<String, Object> brand) {
                        //First create a dummy Repo class object for customer.
                        BrandRepository brandRepository = new BrandRepository();
                        Brand brand1 = brandRepository.createObject(brand);
                        setBrand(brand1);
                    }

                    //Adding relation method..
                    public void addRelation(Brand brand) {
                        that.setBrand(brand);
                    }


                    //Fetch related data from local database if present a brandId identifier as property for belongsTo
                    public Brand getBrand__db(RestAdapter restAdapter){
                      if(brandId != null){
                        BrandRepository brandRepository = restAdapter.createRepository(BrandRepository.class);
                           ChatRepository lowercaseFirstLetterRepository = (ChatRepository) getRepository();
                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                Context context = lowercaseFirstLetterRepository.getContext();
                                if(context != null && brandRepository.getDb() != null){
                                    brandRepository.addStorage(context);
                                    Brand brand = (Brand) brandRepository.getDb().get__db(brandId);
                                    return brand;
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
                                    public void get__brand( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Brand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRepository  chatRepo = restAdapter.createRepository(ChatRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRepo.get__brand( (String)that.getId(), refresh,  new ObjectCallback<Brand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Brand object) {
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
                        //Adding database method for fetching from relation if not present..
                        if(appUser == null){
                          ChatRepository chatRepository = (ChatRepository) getRepository();

                          RestAdapter restAdapter = chatRepository.getRestAdapter();
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


                    //Fetch related data from local database if present a appUserId identifier as property for belongsTo
                    public AppUser getAppUser__db(RestAdapter restAdapter){
                      if(appUserId != null){
                        AppUserRepository appUserRepository = restAdapter.createRepository(AppUserRepository.class);
                           ChatRepository lowercaseFirstLetterRepository = (ChatRepository) getRepository();
                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                Context context = lowercaseFirstLetterRepository.getContext();
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
                                        final ChatRepository  chatRepo = restAdapter.createRepository(ChatRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRepo.get__appUser( (String)that.getId(), refresh,  new ObjectCallback<AppUser> (){
                                            

                                            
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
