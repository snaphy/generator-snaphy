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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdCategoryRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdBedRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class IpdCategory extends Model {


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

    private IpdCategory that ;

    public IpdCategory (){
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

            
            
        
    
        
            

            
                private String name;
                /* Adding Getter and Setter methods */
                public String getName(){
                    return name;
                }

                /* Adding Getter and Setter methods */
                public void setName(String name){
                    this.name = name;
                    //Update hashMap value..
                    hashMap.put("name", name);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      IpdCategoryRepository lowercaseFirstLetterRepository = (IpdCategoryRepository) getRepository();
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
      IpdCategoryRepository lowercaseFirstLetterRepository = (IpdCategoryRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      IpdCategoryRepository lowercaseFirstLetterRepository = (IpdCategoryRepository) getRepository();
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
                    private transient DataList<IpdBed>  ipdBeds ;

                    public DataList< IpdBed > getIpdBeds() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            IpdBedRepository ipdBedRepository = (IpdBedRepository) getRepository();

                            if(that.getId() != null && ipdBedRepository.getDb() != null){

                                 //Fetch locally from db
                                 //ipdBeds = getIpdBeds__db(restAdapter);
                                 // Getting single cont
                                 ipdBeds = ipdBedRepository.getDb().getAll__db("ipdCategoryId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return ipdBeds;
                    }

                    public void setIpdBeds(DataList<IpdBed> ipdBeds) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: ipdBeds){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setIpdBeds1(hashMaps);
                        }else{
                            this.ipdBeds = ipdBeds;
                            //TODO: Warning move this to new thread
                            for(IpdBed data: ipdBeds){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setIpdBeds1(List<Map<String, Object>> ipdBeds) {
                        //First create a dummy Repo class object for ..
                        IpdBedRepository ipdBedsRepository = new IpdBedRepository();
                        List<IpdBed> result = new ArrayList<>();
                        for (Map<String, Object> obj : ipdBeds) {
                            //Also add relation to child type for two way communication..
                            IpdBed obj1 = ipdBedsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setIpdBeds(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setIpdBeds1(DataList<HashMap<String, Object>> ipdBeds) {
                        //First create a dummy Repo class object for ..
                        IpdBedRepository ipdBedsRepository = new IpdBedRepository();
                        DataList<IpdBed> result = new DataList<>();
                        for (HashMap<String, Object> obj : ipdBeds) {
                            //Also add relation to child type for two way communication..
                            IpdBed obj1 = ipdBedsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setIpdBeds(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<IpdBed> ipdBeds, IpdBed dummyClassInstance) {
                        that.setIpdBeds(ipdBeds);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(IpdBed ipdBeds) {
                        try{
                            try{

                                  //Save to database..
                                  ipdBeds.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getIpdBeds().add(ipdBeds);
                        }catch(Exception e){
                            DataList< IpdBed> ipdBeds1 = new DataList();
                            //Now add this item to list..
                            ipdBeds1.add(ipdBeds);
                            //Now set data....
                            that.setIpdBeds(ipdBeds1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__ipdBeds( String fk,  RestAdapter restAdapter, final ObjectCallback<IpdBed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdCategoryRepository  ipdCategoryRepo = restAdapter.createRepository(IpdCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdCategoryRepo.findById__ipdBeds( (String)that.getId(), fk,  new ObjectCallback<IpdBed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdBed object) {
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
                                    public void destroyById__ipdBeds( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdCategoryRepository  ipdCategoryRepo = restAdapter.createRepository(IpdCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdCategoryRepo.destroyById__ipdBeds( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__ipdBeds( String fk,  IpdBed data,  RestAdapter restAdapter, final ObjectCallback<IpdBed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdCategoryRepository  ipdCategoryRepo = restAdapter.createRepository(IpdCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        ipdCategoryRepo.updateById__ipdBeds( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<IpdBed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdBed object) {
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
                                    public void get__ipdBeds( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<IpdBed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdCategoryRepository  ipdCategoryRepo = restAdapter.createRepository(IpdCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdCategoryRepo.get__ipdBeds( (String)that.getId(), filter,  new DataListCallback<IpdBed> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<IpdBed> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            IpdBed obj = new IpdBed();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (IpdBed obj : object) {
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
                                    public void create__ipdBeds( IpdBed data,  RestAdapter restAdapter, final ObjectCallback<IpdBed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdCategoryRepository  ipdCategoryRepo = restAdapter.createRepository(IpdCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdCategoryRepo.create__ipdBeds( (String)that.getId(), data.convertMap(),  new ObjectCallback<IpdBed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdBed object) {
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
                                    public void delete__ipdBeds( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdCategoryRepository  ipdCategoryRepo = restAdapter.createRepository(IpdCategoryRepository.class);
                                        
                                        



                                        ipdCategoryRepo.delete__ipdBeds( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__ipdBeds( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdCategoryRepository  ipdCategoryRepo = restAdapter.createRepository(IpdCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdCategoryRepo.count__ipdBeds( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient Hospital  hospital ;
                    private String hospitalId;

                    public String getHospitalId(){
                         return hospitalId;
                    }

                    public void setHospitalId(Object hospitalId){
                        if(hospitalId != null){
                          this.hospitalId = hospitalId.toString();
                        }
                    }

                    public Hospital getHospital() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(hospital == null){
                                        IpdCategoryRepository ipdCategoryRepository = (IpdCategoryRepository) getRepository();

                                        RestAdapter restAdapter = ipdCategoryRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          hospital = getHospital__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return hospital;
                    }

                    public void setHospital(Hospital hospital) {
                        this.hospital = hospital;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospital(Map<String, Object> hospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository hospitalRepository = new HospitalRepository();
                        Hospital hospital1 = hospitalRepository.createObject(hospital);
                        setHospital(hospital1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospital(HashMap<String, Object> hospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository hospitalRepository = new HospitalRepository();
                        Hospital hospital1 = hospitalRepository.createObject(hospital);
                        setHospital(hospital1);
                    }

                    //Adding relation method..
                    public void addRelation(Hospital hospital) {
                        that.setHospital(hospital);
                    }


                    //Fetch related data from local database if present a hospitalId identifier as property for belongsTo
                    public Hospital getHospital__db(RestAdapter restAdapter){
                      if(hospitalId != null){
                        HospitalRepository hospitalRepository = restAdapter.createRepository(HospitalRepository.class);
                            try{
                            IpdCategoryRepository lowercaseFirstLetterRepository = (IpdCategoryRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(hospitalRepository.getDb() == null ){
                                                    hospitalRepository.addStorage(context);
                                                }

                                                if(context != null && hospitalRepository.getDb() != null){
                                                    hospitalRepository.addStorage(context);
                                                    Hospital hospital = (Hospital) hospitalRepository.getDb().get__db(hospitalId);
                                                    return hospital;
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
                                    public void get__hospital( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final IpdCategoryRepository  ipdCategoryRepo = restAdapter.createRepository(IpdCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ipdCategoryRepo.get__hospital( (String)that.getId(), refresh,  new ObjectCallback<Hospital> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Hospital object) {
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
