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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdBedRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdBedLogRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdCategoryRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class IpdBed extends Model {


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

    private IpdBed that ;

    public IpdBed (){
        that = this;
    }

    
        
            

            
                private String bedNumber;
                /* Adding Getter and Setter methods */
                public String getBedNumber(){
                    return bedNumber;
                }

                /* Adding Getter and Setter methods */
                public void setBedNumber(String bedNumber){
                    this.bedNumber = bedNumber;
                    //Update hashMap value..
                    hashMap.put("bedNumber", bedNumber);
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
      IpdBedRepository lowercaseFirstLetterRepository = (IpdBedRepository) getRepository();
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
      IpdBedRepository lowercaseFirstLetterRepository = (IpdBedRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      IpdBedRepository lowercaseFirstLetterRepository = (IpdBedRepository) getRepository();
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
                    private transient DataList<IpdBedLog>  ipdBedLogs ;

                    public DataList< IpdBedLog > getIpdBedLogs() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            IpdBedLogRepository ipdBedLogRepository = (IpdBedLogRepository) getRepository();

                            if(that.getId() != null && ipdBedLogRepository.getDb() != null){

                                 //Fetch locally from db
                                 //ipdBedLogs = getIpdBedLogs__db(restAdapter);
                                 // Getting single cont
                                 ipdBedLogs = ipdBedLogRepository.getDb().getAll__db("ipdBedId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return ipdBedLogs;
                    }

                    public void setIpdBedLogs(DataList<IpdBedLog> ipdBedLogs) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: ipdBedLogs){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setIpdBedLogs1(hashMaps);
                        }else{
                            this.ipdBedLogs = ipdBedLogs;
                            //TODO: Warning move this to new thread
                            for(IpdBedLog data: ipdBedLogs){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setIpdBedLogs1(List<Map<String, Object>> ipdBedLogs) {
                        //First create a dummy Repo class object for ..
                        IpdBedLogRepository ipdBedLogsRepository = new IpdBedLogRepository();
                        List<IpdBedLog> result = new ArrayList<>();
                        for (Map<String, Object> obj : ipdBedLogs) {
                            //Also add relation to child type for two way communication..
                            IpdBedLog obj1 = ipdBedLogsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setIpdBedLogs(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setIpdBedLogs1(DataList<HashMap<String, Object>> ipdBedLogs) {
                        //First create a dummy Repo class object for ..
                        IpdBedLogRepository ipdBedLogsRepository = new IpdBedLogRepository();
                        DataList<IpdBedLog> result = new DataList<>();
                        for (HashMap<String, Object> obj : ipdBedLogs) {
                            //Also add relation to child type for two way communication..
                            IpdBedLog obj1 = ipdBedLogsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setIpdBedLogs(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<IpdBedLog> ipdBedLogs, IpdBedLog dummyClassInstance) {
                        that.setIpdBedLogs(ipdBedLogs);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(IpdBedLog ipdBedLogs) {
                        try{
                            try{

                                  //Save to database..
                                  ipdBedLogs.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getIpdBedLogs().add(ipdBedLogs);
                        }catch(Exception e){
                            DataList< IpdBedLog> ipdBedLogs1 = new DataList();
                            //Now add this item to list..
                            ipdBedLogs1.add(ipdBedLogs);
                            //Now set data....
                            that.setIpdBedLogs(ipdBedLogs1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__ipdBedLogs( String fk,  RestAdapter restAdapter, final ObjectCallback<IpdBedLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdBedRepository  ipdBedRepo = restAdapter.createRepository(IpdBedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdBedRepo.findById__ipdBedLogs( (String)that.getId(), fk,  new ObjectCallback<IpdBedLog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdBedLog object) {
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
                                    public void destroyById__ipdBedLogs( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdBedRepository  ipdBedRepo = restAdapter.createRepository(IpdBedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdBedRepo.destroyById__ipdBedLogs( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__ipdBedLogs( String fk,  IpdBedLog data,  RestAdapter restAdapter, final ObjectCallback<IpdBedLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdBedRepository  ipdBedRepo = restAdapter.createRepository(IpdBedRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        ipdBedRepo.updateById__ipdBedLogs( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<IpdBedLog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdBedLog object) {
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
                                    public void get__ipdBedLogs( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<IpdBedLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdBedRepository  ipdBedRepo = restAdapter.createRepository(IpdBedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdBedRepo.get__ipdBedLogs( (String)that.getId(), filter,  new DataListCallback<IpdBedLog> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<IpdBedLog> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            IpdBedLog obj = new IpdBedLog();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (IpdBedLog obj : object) {
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
                                    public void create__ipdBedLogs( IpdBedLog data,  RestAdapter restAdapter, final ObjectCallback<IpdBedLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdBedRepository  ipdBedRepo = restAdapter.createRepository(IpdBedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdBedRepo.create__ipdBedLogs( (String)that.getId(), data.convertMap(),  new ObjectCallback<IpdBedLog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdBedLog object) {
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
                                    public void delete__ipdBedLogs( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdBedRepository  ipdBedRepo = restAdapter.createRepository(IpdBedRepository.class);
                                        
                                        



                                        ipdBedRepo.delete__ipdBedLogs( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__ipdBedLogs( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdBedRepository  ipdBedRepo = restAdapter.createRepository(IpdBedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdBedRepo.count__ipdBedLogs( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient IpdCategory  ipdCategory ;
                    private String ipdCategoryId;

                    public String getIpdCategoryId(){
                         return ipdCategoryId;
                    }

                    public void setIpdCategoryId(Object ipdCategoryId){
                        if(ipdCategoryId != null){
                          this.ipdCategoryId = ipdCategoryId.toString();
                        }
                    }

                    public IpdCategory getIpdCategory() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(ipdCategory == null){
                                        IpdBedRepository ipdBedRepository = (IpdBedRepository) getRepository();

                                        RestAdapter restAdapter = ipdBedRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          ipdCategory = getIpdCategory__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return ipdCategory;
                    }

                    public void setIpdCategory(IpdCategory ipdCategory) {
                        this.ipdCategory = ipdCategory;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIpdCategory(Map<String, Object> ipdCategory) {
                        //First create a dummy Repo class object for customer.
                        IpdCategoryRepository ipdCategoryRepository = new IpdCategoryRepository();
                        IpdCategory ipdCategory1 = ipdCategoryRepository.createObject(ipdCategory);
                        setIpdCategory(ipdCategory1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIpdCategory(HashMap<String, Object> ipdCategory) {
                        //First create a dummy Repo class object for customer.
                        IpdCategoryRepository ipdCategoryRepository = new IpdCategoryRepository();
                        IpdCategory ipdCategory1 = ipdCategoryRepository.createObject(ipdCategory);
                        setIpdCategory(ipdCategory1);
                    }

                    //Adding relation method..
                    public void addRelation(IpdCategory ipdCategory) {
                        that.setIpdCategory(ipdCategory);
                    }


                    //Fetch related data from local database if present a ipdCategoryId identifier as property for belongsTo
                    public IpdCategory getIpdCategory__db(RestAdapter restAdapter){
                      if(ipdCategoryId != null){
                        IpdCategoryRepository ipdCategoryRepository = restAdapter.createRepository(IpdCategoryRepository.class);
                            try{
                            IpdBedRepository lowercaseFirstLetterRepository = (IpdBedRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(ipdCategoryRepository.getDb() == null ){
                                                    ipdCategoryRepository.addStorage(context);
                                                }

                                                if(context != null && ipdCategoryRepository.getDb() != null){
                                                    ipdCategoryRepository.addStorage(context);
                                                    IpdCategory ipdCategory = (IpdCategory) ipdCategoryRepository.getDb().get__db(ipdCategoryId);
                                                    return ipdCategory;
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
                                    public void get__ipdCategory( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<IpdCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdBedRepository  ipdBedRepo = restAdapter.createRepository(IpdBedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdBedRepo.get__ipdCategory( (String)that.getId(), refresh,  new ObjectCallback<IpdCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdCategory object) {
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
