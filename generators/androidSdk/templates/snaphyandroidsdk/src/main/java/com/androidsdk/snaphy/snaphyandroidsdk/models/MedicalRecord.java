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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.MedicalRecordRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class MedicalRecord extends Model {


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

    private MedicalRecord that ;

    public MedicalRecord (){
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

            
            
        
    
        
            

                private DataList<Map<String, Object>> records;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getRecords(){
                    return records;
                }

                /* Adding Getter and Setter methods */
                public void setRecords(DataList<Map<String, Object>> records){
                    this.records = records;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("records", records);
                }

            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      MedicalRecordRepository lowercaseFirstLetterRepository = (MedicalRecordRepository) getRepository();
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
      MedicalRecordRepository lowercaseFirstLetterRepository = (MedicalRecordRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      MedicalRecordRepository lowercaseFirstLetterRepository = (MedicalRecordRepository) getRepository();
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
                                        MedicalRecordRepository medicalRecordRepository = (MedicalRecordRepository) getRepository();

                                        RestAdapter restAdapter = medicalRecordRepository.getRestAdapter();
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
                            MedicalRecordRepository lowercaseFirstLetterRepository = (MedicalRecordRepository) getRepository();
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
                                        final MedicalRecordRepository  medicalRecordRepo = restAdapter.createRepository(MedicalRecordRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        medicalRecordRepo.get__patientGroup( (String)that.getId(), refresh,  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        MedicalRecordRepository medicalRecordRepository = (MedicalRecordRepository) getRepository();

                                        RestAdapter restAdapter = medicalRecordRepository.getRestAdapter();
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
                            MedicalRecordRepository lowercaseFirstLetterRepository = (MedicalRecordRepository) getRepository();
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
                                        final MedicalRecordRepository  medicalRecordRepo = restAdapter.createRepository(MedicalRecordRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        medicalRecordRepo.get__hospital( (String)that.getId(), refresh,  new ObjectCallback<Hospital> (){
                                            

                                            
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
