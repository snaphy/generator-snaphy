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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserSpecializationRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SpecializationRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class HospitalUserSpecialization extends Model {


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

    private HospitalUserSpecialization that ;

    public HospitalUserSpecialization (){
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      HospitalUserSpecializationRepository lowercaseFirstLetterRepository = (HospitalUserSpecializationRepository) getRepository();
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
      HospitalUserSpecializationRepository lowercaseFirstLetterRepository = (HospitalUserSpecializationRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      HospitalUserSpecializationRepository lowercaseFirstLetterRepository = (HospitalUserSpecializationRepository) getRepository();
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
                    private transient HospitalUser  hospitalUser ;
                    private String hospitalUserId;

                    public String getHospitalUserId(){
                         return hospitalUserId;
                    }

                    public void setHospitalUserId(Object hospitalUserId){
                        if(hospitalUserId != null){
                          this.hospitalUserId = hospitalUserId.toString();
                        }
                    }

                    public HospitalUser getHospitalUser() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(hospitalUser == null){
                                        HospitalUserSpecializationRepository hospitalUserSpecializationRepository = (HospitalUserSpecializationRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = hospitalUserSpecializationRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          hospitalUser = getHospitalUser__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return hospitalUser;
                    }

                    public void setHospitalUser(HospitalUser hospitalUser) {
                        this.hospitalUser = hospitalUser;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospitalUser(Map<String, Object> hospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository hospitalUserRepository = new HospitalUserRepository();
                        HospitalUser hospitalUser1 = hospitalUserRepository.createObject(hospitalUser);
                        setHospitalUser(hospitalUser1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospitalUser(HashMap<String, Object> hospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository hospitalUserRepository = new HospitalUserRepository();
                        HospitalUser hospitalUser1 = hospitalUserRepository.createObject(hospitalUser);
                        setHospitalUser(hospitalUser1);
                    }

                    //Adding relation method..
                    public void addRelation(HospitalUser hospitalUser) {
                        that.setHospitalUser(hospitalUser);
                    }


                    //Fetch related data from local database if present a hospitalUserId identifier as property for belongsTo
                    public HospitalUser getHospitalUser__db(SnaphyRestAdapter restAdapter){
                      if(hospitalUserId != null){
                        HospitalUserRepository hospitalUserRepository = restAdapter.createRepository(HospitalUserRepository.class);
                            try{
                            HospitalUserSpecializationRepository lowercaseFirstLetterRepository = (HospitalUserSpecializationRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(hospitalUserRepository.getDb() == null ){
                                                    hospitalUserRepository.addStorage(context);
                                                }

                                                if(context != null && hospitalUserRepository.getDb() != null){
                                                    hospitalUserRepository.addStorage(context);
                                                    HospitalUser hospitalUser = (HospitalUser) hospitalUserRepository.getDb().get__db(hospitalUserId);
                                                    return hospitalUser;
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
                                    public void get__hospitalUser( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserSpecializationRepository  hospitalUserSpecializationRepo = restAdapter.createRepository(HospitalUserSpecializationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserSpecializationRepo.get__hospitalUser( (String)that.getId(), refresh,  new ObjectCallback<HospitalUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUser object) {
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
                    private transient Specialization  specialization ;
                    private String specializationId;

                    public String getSpecializationId(){
                         return specializationId;
                    }

                    public void setSpecializationId(Object specializationId){
                        if(specializationId != null){
                          this.specializationId = specializationId.toString();
                        }
                    }

                    public Specialization getSpecialization() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(specialization == null){
                                        HospitalUserSpecializationRepository hospitalUserSpecializationRepository = (HospitalUserSpecializationRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = hospitalUserSpecializationRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          specialization = getSpecialization__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return specialization;
                    }

                    public void setSpecialization(Specialization specialization) {
                        this.specialization = specialization;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSpecialization(Map<String, Object> specialization) {
                        //First create a dummy Repo class object for customer.
                        SpecializationRepository specializationRepository = new SpecializationRepository();
                        Specialization specialization1 = specializationRepository.createObject(specialization);
                        setSpecialization(specialization1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSpecialization(HashMap<String, Object> specialization) {
                        //First create a dummy Repo class object for customer.
                        SpecializationRepository specializationRepository = new SpecializationRepository();
                        Specialization specialization1 = specializationRepository.createObject(specialization);
                        setSpecialization(specialization1);
                    }

                    //Adding relation method..
                    public void addRelation(Specialization specialization) {
                        that.setSpecialization(specialization);
                    }


                    //Fetch related data from local database if present a specializationId identifier as property for belongsTo
                    public Specialization getSpecialization__db(SnaphyRestAdapter restAdapter){
                      if(specializationId != null){
                        SpecializationRepository specializationRepository = restAdapter.createRepository(SpecializationRepository.class);
                            try{
                            HospitalUserSpecializationRepository lowercaseFirstLetterRepository = (HospitalUserSpecializationRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(specializationRepository.getDb() == null ){
                                                    specializationRepository.addStorage(context);
                                                }

                                                if(context != null && specializationRepository.getDb() != null){
                                                    specializationRepository.addStorage(context);
                                                    Specialization specialization = (Specialization) specializationRepository.getDb().get__db(specializationId);
                                                    return specialization;
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
                                    public void get__specialization( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Specialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserSpecializationRepository  hospitalUserSpecializationRepo = restAdapter.createRepository(HospitalUserSpecializationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserSpecializationRepo.get__specialization( (String)that.getId(), refresh,  new ObjectCallback<Specialization> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Specialization object) {
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
