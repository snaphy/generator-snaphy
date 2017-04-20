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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.GooglePostRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.GoogleObjectRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class GooglePost extends Model {


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

    private GooglePost that ;

    public GooglePost (){
        that = this;
    }

    
        
            

            
                private String title;
                /* Adding Getter and Setter methods */
                public String getTitle(){
                    return title;
                }

                /* Adding Getter and Setter methods */
                public void setTitle(String title){
                    this.title = title;
                    //Update hashMap value..
                    hashMap.put("title", title);
                }

            
            
        
    
        
            

            
                private String url;
                /* Adding Getter and Setter methods */
                public String getUrl(){
                    return url;
                }

                /* Adding Getter and Setter methods */
                public void setUrl(String url){
                    this.url = url;
                    //Update hashMap value..
                    hashMap.put("url", url);
                }

            
            
        
    
        
            

            
                private Map<String, Object> actor;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getActor(){
                    return actor;
                }

                /* Adding Getter and Setter methods */
                public void setActor(Map<String, Object> actor){
                    this.actor = actor;
                    //Update Map value..
                    hashMap.put("actor", actor);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      GooglePostRepository lowercaseFirstLetterRepository = (GooglePostRepository) getRepository();
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
      GooglePostRepository lowercaseFirstLetterRepository = (GooglePostRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      GooglePostRepository lowercaseFirstLetterRepository = (GooglePostRepository) getRepository();
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
                    private transient GoogleObject  object ;
                    private String googleObjectId;

                    public String getGoogleObjectId(){
                         return googleObjectId;
                    }

                    public void setGoogleObjectId(Object googleObjectId){
                        if(googleObjectId != null){
                          this.googleObjectId = googleObjectId.toString();
                        }
                    }

                    public GoogleObject getObject() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(object == null){
                                        GooglePostRepository googlePostRepository = (GooglePostRepository) getRepository();

                                        RestAdapter restAdapter = googlePostRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          object = getObject__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return object;
                    }

                    public void setObject(GoogleObject object) {
                        this.object = object;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setObject(Map<String, Object> object) {
                        //First create a dummy Repo class object for customer.
                        GoogleObjectRepository objectRepository = new GoogleObjectRepository();
                        GoogleObject object1 = objectRepository.createObject(object);
                        setObject(object1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setObject(HashMap<String, Object> object) {
                        //First create a dummy Repo class object for customer.
                        GoogleObjectRepository objectRepository = new GoogleObjectRepository();
                        GoogleObject object1 = objectRepository.createObject(object);
                        setObject(object1);
                    }

                    //Adding relation method..
                    public void addRelation(GoogleObject object) {
                        that.setObject(object);
                    }


                    //Fetch related data from local database if present a googleObjectId identifier as property for belongsTo
                    public GoogleObject getObject__db(RestAdapter restAdapter){
                      if(googleObjectId != null){
                        GoogleObjectRepository objectRepository = restAdapter.createRepository(GoogleObjectRepository.class);
                            try{
                            GooglePostRepository lowercaseFirstLetterRepository = (GooglePostRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(objectRepository.getDb() == null ){
                                                    objectRepository.addStorage(context);
                                                }

                                                if(context != null && objectRepository.getDb() != null){
                                                    objectRepository.addStorage(context);
                                                    GoogleObject object = (GoogleObject) objectRepository.getDb().get__db(googleObjectId);
                                                    return object;
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
                                    public void get__object( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<GoogleObject> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final GooglePostRepository  googlePostRepo = restAdapter.createRepository(GooglePostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        googlePostRepo.get__object( (String)that.getId(), refresh,  new ObjectCallback<GoogleObject> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(GoogleObject object) {
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
                                    public void create__object( GoogleObject data,  RestAdapter restAdapter, final ObjectCallback<GoogleObject> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final GooglePostRepository  googlePostRepo = restAdapter.createRepository(GooglePostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        googlePostRepo.create__object( (String)that.getId(), data.convertMap(),  new ObjectCallback<GoogleObject> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(GoogleObject object) {
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
                                    public void update__object( GoogleObject data,  RestAdapter restAdapter, final ObjectCallback<GoogleObject> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final GooglePostRepository  googlePostRepo = restAdapter.createRepository(GooglePostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        googlePostRepo.update__object( (String)that.getId(), data.convertMap(),  new ObjectCallback<GoogleObject> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(GoogleObject object) {
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
                                    public void destroy__object( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final GooglePostRepository  googlePostRepo = restAdapter.createRepository(GooglePostRepository.class);
                                        
                                        



                                        googlePostRepo.destroy__object( (String)that.getId(),  new VoidCallback (){
                                            
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
