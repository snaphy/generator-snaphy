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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ReferPatientRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class ReferPatient extends Model {


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

    private ReferPatient that ;

    public ReferPatient (){
        that = this;
    }

    
        
            

            
                private String reason;
                /* Adding Getter and Setter methods */
                public String getReason(){
                    return reason;
                }

                /* Adding Getter and Setter methods */
                public void setReason(String reason){
                    this.reason = reason;
                    //Update hashMap value..
                    hashMap.put("reason", reason);
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

            
            
        
    
        
            

            
                private boolean isRefered;
                /* Adding Getter and Setter methods */
                public boolean getIsRefered(){
                    return isRefered;
                }

                /* Adding Getter and Setter methods */
                public void setIsRefered(boolean isRefered){
                    this.isRefered = isRefered;
                    //Update hashMap value..
                    hashMap.put("isRefered", isRefered);
                }

            
            
        
    
        
            

            
                private boolean isConsulted;
                /* Adding Getter and Setter methods */
                public boolean getIsConsulted(){
                    return isConsulted;
                }

                /* Adding Getter and Setter methods */
                public void setIsConsulted(boolean isConsulted){
                    this.isConsulted = isConsulted;
                    //Update hashMap value..
                    hashMap.put("isConsulted", isConsulted);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> listOfRecords;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getListOfRecords(){
                    return listOfRecords;
                }

                /* Adding Getter and Setter methods */
                public void setListOfRecords(DataList<Map<String, Object>> listOfRecords){
                    this.listOfRecords = listOfRecords;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("listOfRecords", listOfRecords);
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

            
            
        
    
        
            

            
                private String description;
                /* Adding Getter and Setter methods */
                public String getDescription(){
                    return description;
                }

                /* Adding Getter and Setter methods */
                public void setDescription(String description){
                    this.description = description;
                    //Update hashMap value..
                    hashMap.put("description", description);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();
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
      ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();
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
                    private transient PatientGroup  patientGroup ;
                    private String patientGroupId;

                    public String getPatientGroupId(){
                         return patientGroupId;
                    }

                    public void setPatientGroupId(Object patientGroupId){
                        if(patientGroupId != null){
                          this.patientGroupId = patientGroupId.toString();
                        }
                    }

                    public PatientGroup getPatientGroup() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(patientGroup == null){
                                        ReferPatientRepository referPatientRepository = (ReferPatientRepository) getRepository();

                                        RestAdapter restAdapter = referPatientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          patientGroup = getPatientGroup__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return patientGroup;
                    }

                    public void setPatientGroup(PatientGroup patientGroup) {
                        this.patientGroup = patientGroup;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatientGroup(Map<String, Object> patientGroup) {
                        //First create a dummy Repo class object for customer.
                        PatientGroupRepository patientGroupRepository = new PatientGroupRepository();
                        PatientGroup patientGroup1 = patientGroupRepository.createObject(patientGroup);
                        setPatientGroup(patientGroup1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatientGroup(HashMap<String, Object> patientGroup) {
                        //First create a dummy Repo class object for customer.
                        PatientGroupRepository patientGroupRepository = new PatientGroupRepository();
                        PatientGroup patientGroup1 = patientGroupRepository.createObject(patientGroup);
                        setPatientGroup(patientGroup1);
                    }

                    //Adding relation method..
                    public void addRelation(PatientGroup patientGroup) {
                        that.setPatientGroup(patientGroup);
                    }


                    //Fetch related data from local database if present a patientGroupId identifier as property for belongsTo
                    public PatientGroup getPatientGroup__db(RestAdapter restAdapter){
                      if(patientGroupId != null){
                        PatientGroupRepository patientGroupRepository = restAdapter.createRepository(PatientGroupRepository.class);
                            try{
                            ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(patientGroupRepository.getDb() == null ){
                                                    patientGroupRepository.addStorage(context);
                                                }

                                                if(context != null && patientGroupRepository.getDb() != null){
                                                    patientGroupRepository.addStorage(context);
                                                    PatientGroup patientGroup = (PatientGroup) patientGroupRepository.getDb().get__db(patientGroupId);
                                                    return patientGroup;
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
                                    public void get__patientGroup( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ReferPatientRepository  referPatientRepo = restAdapter.createRepository(ReferPatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        referPatientRepo.get__patientGroup( (String)that.getId(), refresh,  new ObjectCallback<PatientGroup> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientGroup object) {
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
                    private transient Patient  patient ;
                    private String patientId;

                    public String getPatientId(){
                         return patientId;
                    }

                    public void setPatientId(Object patientId){
                        if(patientId != null){
                          this.patientId = patientId.toString();
                        }
                    }

                    public Patient getPatient() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(patient == null){
                                        ReferPatientRepository referPatientRepository = (ReferPatientRepository) getRepository();

                                        RestAdapter restAdapter = referPatientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          patient = getPatient__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return patient;
                    }

                    public void setPatient(Patient patient) {
                        this.patient = patient;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatient(Map<String, Object> patient) {
                        //First create a dummy Repo class object for customer.
                        PatientRepository patientRepository = new PatientRepository();
                        Patient patient1 = patientRepository.createObject(patient);
                        setPatient(patient1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatient(HashMap<String, Object> patient) {
                        //First create a dummy Repo class object for customer.
                        PatientRepository patientRepository = new PatientRepository();
                        Patient patient1 = patientRepository.createObject(patient);
                        setPatient(patient1);
                    }

                    //Adding relation method..
                    public void addRelation(Patient patient) {
                        that.setPatient(patient);
                    }


                    //Fetch related data from local database if present a patientId identifier as property for belongsTo
                    public Patient getPatient__db(RestAdapter restAdapter){
                      if(patientId != null){
                        PatientRepository patientRepository = restAdapter.createRepository(PatientRepository.class);
                            try{
                            ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(patientRepository.getDb() == null ){
                                                    patientRepository.addStorage(context);
                                                }

                                                if(context != null && patientRepository.getDb() != null){
                                                    patientRepository.addStorage(context);
                                                    Patient patient = (Patient) patientRepository.getDb().get__db(patientId);
                                                    return patient;
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
                                    public void get__patient( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Patient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ReferPatientRepository  referPatientRepo = restAdapter.createRepository(ReferPatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        referPatientRepo.get__patient( (String)that.getId(), refresh,  new ObjectCallback<Patient> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Patient object) {
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
                    private transient Hospital  referedHospital ;
                    private String hospitalId;

                    public String getHospitalId(){
                         return hospitalId;
                    }

                    public void setHospitalId(Object hospitalId){
                        if(hospitalId != null){
                          this.hospitalId = hospitalId.toString();
                        }
                    }

                    public Hospital getReferedHospital() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(referedHospital == null){
                                        ReferPatientRepository referPatientRepository = (ReferPatientRepository) getRepository();

                                        RestAdapter restAdapter = referPatientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          referedHospital = getReferedHospital__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return referedHospital;
                    }

                    public void setReferedHospital(Hospital referedHospital) {
                        this.referedHospital = referedHospital;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setReferedHospital(Map<String, Object> referedHospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository referedHospitalRepository = new HospitalRepository();
                        Hospital referedHospital1 = referedHospitalRepository.createObject(referedHospital);
                        setReferedHospital(referedHospital1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setReferedHospital(HashMap<String, Object> referedHospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository referedHospitalRepository = new HospitalRepository();
                        Hospital referedHospital1 = referedHospitalRepository.createObject(referedHospital);
                        setReferedHospital(referedHospital1);
                    }

                    //Adding relation method..
                    public void addRelation(Hospital referedHospital) {
                        that.setReferedHospital(referedHospital);
                    }


                    //Fetch related data from local database if present a hospitalId identifier as property for belongsTo
                    public Hospital getReferedHospital__db(RestAdapter restAdapter){
                      if(hospitalId != null){
                        HospitalRepository referedHospitalRepository = restAdapter.createRepository(HospitalRepository.class);
                            try{
                            ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(referedHospitalRepository.getDb() == null ){
                                                    referedHospitalRepository.addStorage(context);
                                                }

                                                if(context != null && referedHospitalRepository.getDb() != null){
                                                    referedHospitalRepository.addStorage(context);
                                                    Hospital referedHospital = (Hospital) referedHospitalRepository.getDb().get__db(hospitalId);
                                                    return referedHospital;
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
                                    public void get__referedHospital( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ReferPatientRepository  referPatientRepo = restAdapter.createRepository(ReferPatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        referPatientRepo.get__referedHospital( (String)that.getId(), refresh,  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient HospitalUser  referedHospitalUser ;
                    private String hospitalUserId;

                    public String getHospitalUserId(){
                         return hospitalUserId;
                    }

                    public void setHospitalUserId(Object hospitalUserId){
                        if(hospitalUserId != null){
                          this.hospitalUserId = hospitalUserId.toString();
                        }
                    }

                    public HospitalUser getReferedHospitalUser() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(referedHospitalUser == null){
                                        ReferPatientRepository referPatientRepository = (ReferPatientRepository) getRepository();

                                        RestAdapter restAdapter = referPatientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          referedHospitalUser = getReferedHospitalUser__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return referedHospitalUser;
                    }

                    public void setReferedHospitalUser(HospitalUser referedHospitalUser) {
                        this.referedHospitalUser = referedHospitalUser;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setReferedHospitalUser(Map<String, Object> referedHospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository referedHospitalUserRepository = new HospitalUserRepository();
                        HospitalUser referedHospitalUser1 = referedHospitalUserRepository.createObject(referedHospitalUser);
                        setReferedHospitalUser(referedHospitalUser1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setReferedHospitalUser(HashMap<String, Object> referedHospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository referedHospitalUserRepository = new HospitalUserRepository();
                        HospitalUser referedHospitalUser1 = referedHospitalUserRepository.createObject(referedHospitalUser);
                        setReferedHospitalUser(referedHospitalUser1);
                    }

                    //Adding relation method..
                    public void addRelation(HospitalUser referedHospitalUser) {
                        that.setReferedHospitalUser(referedHospitalUser);
                    }


                    //Fetch related data from local database if present a hospitalUserId identifier as property for belongsTo
                    public HospitalUser getReferedHospitalUser__db(RestAdapter restAdapter){
                      if(hospitalUserId != null){
                        HospitalUserRepository referedHospitalUserRepository = restAdapter.createRepository(HospitalUserRepository.class);
                            try{
                            ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(referedHospitalUserRepository.getDb() == null ){
                                                    referedHospitalUserRepository.addStorage(context);
                                                }

                                                if(context != null && referedHospitalUserRepository.getDb() != null){
                                                    referedHospitalUserRepository.addStorage(context);
                                                    HospitalUser referedHospitalUser = (HospitalUser) referedHospitalUserRepository.getDb().get__db(hospitalUserId);
                                                    return referedHospitalUser;
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
                                    public void get__referedHospitalUser( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ReferPatientRepository  referPatientRepo = restAdapter.createRepository(ReferPatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        referPatientRepo.get__referedHospitalUser( (String)that.getId(), refresh,  new ObjectCallback<HospitalUser> (){
                                            

                                            
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
                    private transient Hospital  repliedHospital ;
                    private String hospitalId;

                    public String getHospitalId(){
                         return hospitalId;
                    }

                    public void setHospitalId(Object hospitalId){
                        if(hospitalId != null){
                          this.hospitalId = hospitalId.toString();
                        }
                    }

                    public Hospital getRepliedHospital() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(repliedHospital == null){
                                        ReferPatientRepository referPatientRepository = (ReferPatientRepository) getRepository();

                                        RestAdapter restAdapter = referPatientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          repliedHospital = getRepliedHospital__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return repliedHospital;
                    }

                    public void setRepliedHospital(Hospital repliedHospital) {
                        this.repliedHospital = repliedHospital;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRepliedHospital(Map<String, Object> repliedHospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository repliedHospitalRepository = new HospitalRepository();
                        Hospital repliedHospital1 = repliedHospitalRepository.createObject(repliedHospital);
                        setRepliedHospital(repliedHospital1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRepliedHospital(HashMap<String, Object> repliedHospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository repliedHospitalRepository = new HospitalRepository();
                        Hospital repliedHospital1 = repliedHospitalRepository.createObject(repliedHospital);
                        setRepliedHospital(repliedHospital1);
                    }

                    //Adding relation method..
                    public void addRelation(Hospital repliedHospital) {
                        that.setRepliedHospital(repliedHospital);
                    }


                    //Fetch related data from local database if present a hospitalId identifier as property for belongsTo
                    public Hospital getRepliedHospital__db(RestAdapter restAdapter){
                      if(hospitalId != null){
                        HospitalRepository repliedHospitalRepository = restAdapter.createRepository(HospitalRepository.class);
                            try{
                            ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(repliedHospitalRepository.getDb() == null ){
                                                    repliedHospitalRepository.addStorage(context);
                                                }

                                                if(context != null && repliedHospitalRepository.getDb() != null){
                                                    repliedHospitalRepository.addStorage(context);
                                                    Hospital repliedHospital = (Hospital) repliedHospitalRepository.getDb().get__db(hospitalId);
                                                    return repliedHospital;
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
                                    public void get__repliedHospital( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ReferPatientRepository  referPatientRepo = restAdapter.createRepository(ReferPatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        referPatientRepo.get__repliedHospital( (String)that.getId(), refresh,  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                 
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient HospitalUser  repliedHospitalUser ;
                    private String hospitalUserId;

                    public String getHospitalUserId(){
                         return hospitalUserId;
                    }

                    public void setHospitalUserId(Object hospitalUserId){
                        if(hospitalUserId != null){
                          this.hospitalUserId = hospitalUserId.toString();
                        }
                    }

                    public HospitalUser getRepliedHospitalUser() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(repliedHospitalUser == null){
                                        ReferPatientRepository referPatientRepository = (ReferPatientRepository) getRepository();

                                        RestAdapter restAdapter = referPatientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          repliedHospitalUser = getRepliedHospitalUser__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return repliedHospitalUser;
                    }

                    public void setRepliedHospitalUser(HospitalUser repliedHospitalUser) {
                        this.repliedHospitalUser = repliedHospitalUser;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRepliedHospitalUser(Map<String, Object> repliedHospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository repliedHospitalUserRepository = new HospitalUserRepository();
                        HospitalUser repliedHospitalUser1 = repliedHospitalUserRepository.createObject(repliedHospitalUser);
                        setRepliedHospitalUser(repliedHospitalUser1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRepliedHospitalUser(HashMap<String, Object> repliedHospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository repliedHospitalUserRepository = new HospitalUserRepository();
                        HospitalUser repliedHospitalUser1 = repliedHospitalUserRepository.createObject(repliedHospitalUser);
                        setRepliedHospitalUser(repliedHospitalUser1);
                    }

                    //Adding relation method..
                    public void addRelation(HospitalUser repliedHospitalUser) {
                        that.setRepliedHospitalUser(repliedHospitalUser);
                    }


                    //Fetch related data from local database if present a hospitalUserId identifier as property for belongsTo
                    public HospitalUser getRepliedHospitalUser__db(RestAdapter restAdapter){
                      if(hospitalUserId != null){
                        HospitalUserRepository repliedHospitalUserRepository = restAdapter.createRepository(HospitalUserRepository.class);
                            try{
                            ReferPatientRepository lowercaseFirstLetterRepository = (ReferPatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(repliedHospitalUserRepository.getDb() == null ){
                                                    repliedHospitalUserRepository.addStorage(context);
                                                }

                                                if(context != null && repliedHospitalUserRepository.getDb() != null){
                                                    repliedHospitalUserRepository.addStorage(context);
                                                    HospitalUser repliedHospitalUser = (HospitalUser) repliedHospitalUserRepository.getDb().get__db(hospitalUserId);
                                                    return repliedHospitalUser;
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
                                    public void get__repliedHospitalUser( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ReferPatientRepository  referPatientRepo = restAdapter.createRepository(ReferPatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        referPatientRepo.get__repliedHospitalUser( (String)that.getId(), refresh,  new ObjectCallback<HospitalUser> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
