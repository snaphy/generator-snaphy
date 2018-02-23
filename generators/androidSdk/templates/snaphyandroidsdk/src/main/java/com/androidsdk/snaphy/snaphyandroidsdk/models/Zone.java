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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ZoneRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SecurityAreaRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Zone extends Model {


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

    private Zone that ;

    public Zone (){
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

            
            
        
    
        
            

            
                private String unique_number;
                /* Adding Getter and Setter methods */
                public String getUnique_number(){
                    return unique_number;
                }

                /* Adding Getter and Setter methods */
                public void setUnique_number(String unique_number){
                    this.unique_number = unique_number;
                    //Update hashMap value..
                    hashMap.put("unique_number", unique_number);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ZoneRepository lowercaseFirstLetterRepository = (ZoneRepository) getRepository();
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
      ZoneRepository lowercaseFirstLetterRepository = (ZoneRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ZoneRepository lowercaseFirstLetterRepository = (ZoneRepository) getRepository();
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
                    private transient SecurityArea  securityArea ;
                    private String securityAreaId;

                    public String getSecurityAreaId(){
                         return securityAreaId;
                    }

                    public void setSecurityAreaId(Object securityAreaId){
                        if(securityAreaId != null){
                          this.securityAreaId = securityAreaId.toString();
                        }
                    }

                    public SecurityArea getSecurityArea() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(securityArea == null){
                                        ZoneRepository zoneRepository = (ZoneRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = zoneRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          securityArea = getSecurityArea__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return securityArea;
                    }

                    public void setSecurityArea(SecurityArea securityArea) {
                        this.securityArea = securityArea;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSecurityArea(Map<String, Object> securityArea) {
                        //First create a dummy Repo class object for customer.
                        SecurityAreaRepository securityAreaRepository = new SecurityAreaRepository();
                        SecurityArea securityArea1 = securityAreaRepository.createObject(securityArea);
                        setSecurityArea(securityArea1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSecurityArea(HashMap<String, Object> securityArea) {
                        //First create a dummy Repo class object for customer.
                        SecurityAreaRepository securityAreaRepository = new SecurityAreaRepository();
                        SecurityArea securityArea1 = securityAreaRepository.createObject(securityArea);
                        setSecurityArea(securityArea1);
                    }

                    //Adding relation method..
                    public void addRelation(SecurityArea securityArea) {
                        that.setSecurityArea(securityArea);
                    }


                    //Fetch related data from local database if present a securityAreaId identifier as property for belongsTo
                    public SecurityArea getSecurityArea__db(SnaphyRestAdapter restAdapter){
                      if(securityAreaId != null){
                        SecurityAreaRepository securityAreaRepository = restAdapter.createRepository(SecurityAreaRepository.class);
                            try{
                            ZoneRepository lowercaseFirstLetterRepository = (ZoneRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(securityAreaRepository.getDb() == null ){
                                                    securityAreaRepository.addStorage(context);
                                                }

                                                if(context != null && securityAreaRepository.getDb() != null){
                                                    securityAreaRepository.addStorage(context);
                                                    SecurityArea securityArea = (SecurityArea) securityAreaRepository.getDb().get__db(securityAreaId);
                                                    return securityArea;
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
                                    public void get__securityArea( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<SecurityArea> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ZoneRepository  zoneRepo = restAdapter.createRepository(ZoneRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        zoneRepo.get__securityArea( (String)that.getId(), refresh,  new ObjectCallback<SecurityArea> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SecurityArea object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Hospital>  hospitals ;

                    public DataList< Hospital > getHospitals() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HospitalRepository hospitalRepository = (HospitalRepository) getRepository();

                            if(that.getId() != null && hospitalRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hospitals = getHospitals__db(restAdapter);
                                 // Getting single cont
                                 hospitals = hospitalRepository.getDb().getAll__db("zoneId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return hospitals;
                    }

                    public void setHospitals(DataList<Hospital> hospitals) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hospitals){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHospitals1(hashMaps);
                        }else{
                            this.hospitals = hospitals;
                            //TODO: Warning move this to new thread
                            for(Hospital data: hospitals){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitals1(List<Map<String, Object>> hospitals) {
                        //First create a dummy Repo class object for ..
                        HospitalRepository hospitalsRepository = new HospitalRepository();
                        List<Hospital> result = new ArrayList<>();
                        for (Map<String, Object> obj : hospitals) {
                            //Also add relation to child type for two way communication..
                            Hospital obj1 = hospitalsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitals(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitals1(DataList<HashMap<String, Object>> hospitals) {
                        //First create a dummy Repo class object for ..
                        HospitalRepository hospitalsRepository = new HospitalRepository();
                        DataList<Hospital> result = new DataList<>();
                        for (HashMap<String, Object> obj : hospitals) {
                            //Also add relation to child type for two way communication..
                            Hospital obj1 = hospitalsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitals(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Hospital> hospitals, Hospital dummyClassInstance) {
                        that.setHospitals(hospitals);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Hospital hospitals) {
                        try{
                            try{

                                  //Save to database..
                                  hospitals.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHospitals().add(hospitals);
                        }catch(Exception e){
                            DataList< Hospital> hospitals1 = new DataList();
                            //Now add this item to list..
                            hospitals1.add(hospitals);
                            //Now set data....
                            that.setHospitals(hospitals1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void findById__hospitals( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ZoneRepository  zoneRepo = restAdapter.createRepository(ZoneRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        zoneRepo.findById__hospitals( (String)that.getId(), fk,  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__hospitals( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ZoneRepository  zoneRepo = restAdapter.createRepository(ZoneRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        zoneRepo.destroyById__hospitals( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitals( String fk,  Hospital data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ZoneRepository  zoneRepo = restAdapter.createRepository(ZoneRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        zoneRepo.updateById__hospitals( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void get__hospitals( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ZoneRepository  zoneRepo = restAdapter.createRepository(ZoneRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        zoneRepo.get__hospitals( (String)that.getId(), filter,  new DataListCallback<Hospital> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Hospital> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Hospital obj = new Hospital();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Hospital obj : object) {
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
                                    public void create__hospitals( Hospital data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ZoneRepository  zoneRepo = restAdapter.createRepository(ZoneRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        zoneRepo.create__hospitals( (String)that.getId(), data.convertMap(),  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__hospitals( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ZoneRepository  zoneRepo = restAdapter.createRepository(ZoneRepository.class);
                                        
                                        



                                        zoneRepo.delete__hospitals( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitals( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ZoneRepository  zoneRepo = restAdapter.createRepository(ZoneRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        zoneRepo.count__hospitals( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
