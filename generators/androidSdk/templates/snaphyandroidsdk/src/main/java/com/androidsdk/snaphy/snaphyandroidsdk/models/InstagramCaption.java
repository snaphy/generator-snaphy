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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.InstagramCaptionRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.InstagramUserRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class InstagramCaption extends Model {


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

    private InstagramCaption that ;

    public InstagramCaption (){
        that = this;
    }

    
        
            

            
                private String text;
                /* Adding Getter and Setter methods */
                public String getText(){
                    return text;
                }

                /* Adding Getter and Setter methods */
                public void setText(String text){
                    this.text = text;
                    //Update hashMap value..
                    hashMap.put("text", text);
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      InstagramCaptionRepository lowercaseFirstLetterRepository = (InstagramCaptionRepository) getRepository();
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
      InstagramCaptionRepository lowercaseFirstLetterRepository = (InstagramCaptionRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      InstagramCaptionRepository lowercaseFirstLetterRepository = (InstagramCaptionRepository) getRepository();
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
                    private transient InstagramUser  from ;
                    private String instagramUserId;

                    public String getInstagramUserId(){
                         return instagramUserId;
                    }

                    public void setInstagramUserId(Object instagramUserId){
                        if(instagramUserId != null){
                          this.instagramUserId = instagramUserId.toString();
                        }
                    }

                    public InstagramUser getFrom() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(from == null){
                                        InstagramCaptionRepository instagramCaptionRepository = (InstagramCaptionRepository) getRepository();

                                        RestAdapter restAdapter = instagramCaptionRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          from = getFrom__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return from;
                    }

                    public void setFrom(InstagramUser from) {
                        this.from = from;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setFrom(Map<String, Object> from) {
                        //First create a dummy Repo class object for customer.
                        InstagramUserRepository fromRepository = new InstagramUserRepository();
                        InstagramUser from1 = fromRepository.createObject(from);
                        setFrom(from1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setFrom(HashMap<String, Object> from) {
                        //First create a dummy Repo class object for customer.
                        InstagramUserRepository fromRepository = new InstagramUserRepository();
                        InstagramUser from1 = fromRepository.createObject(from);
                        setFrom(from1);
                    }

                    //Adding relation method..
                    public void addRelation(InstagramUser from) {
                        that.setFrom(from);
                    }


                    //Fetch related data from local database if present a instagramUserId identifier as property for belongsTo
                    public InstagramUser getFrom__db(RestAdapter restAdapter){
                      if(instagramUserId != null){
                        InstagramUserRepository fromRepository = restAdapter.createRepository(InstagramUserRepository.class);
                            try{
                            InstagramCaptionRepository lowercaseFirstLetterRepository = (InstagramCaptionRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(fromRepository.getDb() == null ){
                                                    fromRepository.addStorage(context);
                                                }

                                                if(context != null && fromRepository.getDb() != null){
                                                    fromRepository.addStorage(context);
                                                    InstagramUser from = (InstagramUser) fromRepository.getDb().get__db(instagramUserId);
                                                    return from;
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
                                    public void get__from( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<InstagramUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramCaptionRepository  instagramCaptionRepo = restAdapter.createRepository(InstagramCaptionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramCaptionRepo.get__from( (String)that.getId(), refresh,  new ObjectCallback<InstagramUser> (){
                                            

                                            
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
                                    public void create__from( InstagramUser data,  RestAdapter restAdapter, final ObjectCallback<InstagramUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramCaptionRepository  instagramCaptionRepo = restAdapter.createRepository(InstagramCaptionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramCaptionRepo.create__from( (String)that.getId(), data.convertMap(),  new ObjectCallback<InstagramUser> (){
                                            

                                            
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
                                    public void update__from( InstagramUser data,  RestAdapter restAdapter, final ObjectCallback<InstagramUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramCaptionRepository  instagramCaptionRepo = restAdapter.createRepository(InstagramCaptionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        instagramCaptionRepo.update__from( (String)that.getId(), data.convertMap(),  new ObjectCallback<InstagramUser> (){
                                            

                                            
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
                                    public void destroy__from( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InstagramCaptionRepository  instagramCaptionRepo = restAdapter.createRepository(InstagramCaptionRepository.class);
                                        
                                        



                                        instagramCaptionRepo.destroy__from( (String)that.getId(),  new VoidCallback (){
                                            
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
