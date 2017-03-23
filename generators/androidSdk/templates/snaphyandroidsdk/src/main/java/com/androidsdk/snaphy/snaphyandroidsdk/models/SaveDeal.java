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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.SaveDealRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HotDealRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class SaveDeal extends Model {


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

    private SaveDeal that ;

    public SaveDeal (){
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      SaveDealRepository lowercaseFirstLetterRepository = (SaveDealRepository) getRepository();
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
      SaveDealRepository lowercaseFirstLetterRepository = (SaveDealRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      SaveDealRepository lowercaseFirstLetterRepository = (SaveDealRepository) getRepository();
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
		                  SaveDealRepository saveDealRepository = (SaveDealRepository) getRepository();

		                  RestAdapter restAdapter = saveDealRepository.getRestAdapter();
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
                    public AppUser getAppUser__db(RestAdapter restAdapter){
                      if(appUserId != null){
                        AppUserRepository appUserRepository = restAdapter.createRepository(AppUserRepository.class);
			  try{
				SaveDealRepository lowercaseFirstLetterRepository = (SaveDealRepository) getRepository();
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
                                    public void get__appUser( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SaveDealRepository  saveDealRepo = restAdapter.createRepository(SaveDealRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        saveDealRepo.get__appUser( (String)that.getId(), refresh,  new ObjectCallback<AppUser> (){
                                            

                                            
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
                                 
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient HotDeal  hotDeal ;
                    private String hotDealId;

                    public String getHotDealId(){
                         return hotDealId;
                    }

                    public void setHotDealId(Object hotDealId){
                        if(hotDealId != null){
                          this.hotDealId = hotDealId.toString();
                        }
                    }

                    public HotDeal getHotDeal() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(hotDeal == null){
		                  SaveDealRepository saveDealRepository = (SaveDealRepository) getRepository();

		                  RestAdapter restAdapter = saveDealRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    hotDeal = getHotDeal__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return hotDeal;
                    }

                    public void setHotDeal(HotDeal hotDeal) {
                        this.hotDeal = hotDeal;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHotDeal(Map<String, Object> hotDeal) {
                        //First create a dummy Repo class object for customer.
                        HotDealRepository hotDealRepository = new HotDealRepository();
                        HotDeal hotDeal1 = hotDealRepository.createObject(hotDeal);
                        setHotDeal(hotDeal1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHotDeal(HashMap<String, Object> hotDeal) {
                        //First create a dummy Repo class object for customer.
                        HotDealRepository hotDealRepository = new HotDealRepository();
                        HotDeal hotDeal1 = hotDealRepository.createObject(hotDeal);
                        setHotDeal(hotDeal1);
                    }

                    //Adding relation method..
                    public void addRelation(HotDeal hotDeal) {
                        that.setHotDeal(hotDeal);
                    }


                    //Fetch related data from local database if present a hotDealId identifier as property for belongsTo
                    public HotDeal getHotDeal__db(RestAdapter restAdapter){
                      if(hotDealId != null){
                        HotDealRepository hotDealRepository = restAdapter.createRepository(HotDealRepository.class);
			  try{
				SaveDealRepository lowercaseFirstLetterRepository = (SaveDealRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(hotDealRepository.getDb() == null ){
		                            hotDealRepository.addStorage(context);
		                        }

		                        if(context != null && hotDealRepository.getDb() != null){
		                            hotDealRepository.addStorage(context);
		                            HotDeal hotDeal = (HotDeal) hotDealRepository.getDb().get__db(hotDealId);
		                            return hotDeal;
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
                                    public void get__hotDeal( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SaveDealRepository  saveDealRepo = restAdapter.createRepository(SaveDealRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        saveDealRepo.get__hotDeal( (String)that.getId(), refresh,  new ObjectCallback<HotDeal> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HotDeal object) {
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
