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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupLogRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class PatientGroupLog extends Model {


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

    private PatientGroupLog that ;

    public PatientGroupLog (){
        that = this;
    }

    
        
            

            
                private String stage;
                /* Adding Getter and Setter methods */
                public String getStage(){
                    return stage;
                }

                /* Adding Getter and Setter methods */
                public void setStage(String stage){
                    this.stage = stage;
                    //Update hashMap value..
                    hashMap.put("stage", stage);
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

            
            
        
    
        
            

            
                private boolean flaggedInSameHospital;
                /* Adding Getter and Setter methods */
                public boolean getFlaggedInSameHospital(){
                    return flaggedInSameHospital;
                }

                /* Adding Getter and Setter methods */
                public void setFlaggedInSameHospital(boolean flaggedInSameHospital){
                    this.flaggedInSameHospital = flaggedInSameHospital;
                    //Update hashMap value..
                    hashMap.put("flaggedInSameHospital", flaggedInSameHospital);
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

            
            
        
    
        
            

            
                private String hospitalName;
                /* Adding Getter and Setter methods */
                public String getHospitalName(){
                    return hospitalName;
                }

                /* Adding Getter and Setter methods */
                public void setHospitalName(String hospitalName){
                    this.hospitalName = hospitalName;
                    //Update hashMap value..
                    hashMap.put("hospitalName", hospitalName);
                }

            
            
        
    
        
            

            
                private String doctorName;
                /* Adding Getter and Setter methods */
                public String getDoctorName(){
                    return doctorName;
                }

                /* Adding Getter and Setter methods */
                public void setDoctorName(String doctorName){
                    this.doctorName = doctorName;
                    //Update hashMap value..
                    hashMap.put("doctorName", doctorName);
                }

            
            
        
    
        
            

            
                private String lastVisitedOn;
                /* Adding Getter and Setter methods */
                public String getLastVisitedOn(){
                    return lastVisitedOn;
                }

                /* Adding Getter and Setter methods */
                public void setLastVisitedOn(String lastVisitedOn){
                    this.lastVisitedOn = lastVisitedOn;
                    //Update hashMap value..
                    hashMap.put("lastVisitedOn", lastVisitedOn);
                }

            
            
        
    
        
            

            
                private String lastDischargedOn;
                /* Adding Getter and Setter methods */
                public String getLastDischargedOn(){
                    return lastDischargedOn;
                }

                /* Adding Getter and Setter methods */
                public void setLastDischargedOn(String lastDischargedOn){
                    this.lastDischargedOn = lastDischargedOn;
                    //Update hashMap value..
                    hashMap.put("lastDischargedOn", lastDischargedOn);
                }

            
            
        
    
        
            

            
                private String internalStatus;
                /* Adding Getter and Setter methods */
                public String getInternalStatus(){
                    return internalStatus;
                }

                /* Adding Getter and Setter methods */
                public void setInternalStatus(String internalStatus){
                    this.internalStatus = internalStatus;
                    //Update hashMap value..
                    hashMap.put("internalStatus", internalStatus);
                }

            
            
        
    
        
            

            
                private String externalStatus;
                /* Adding Getter and Setter methods */
                public String getExternalStatus(){
                    return externalStatus;
                }

                /* Adding Getter and Setter methods */
                public void setExternalStatus(String externalStatus){
                    this.externalStatus = externalStatus;
                    //Update hashMap value..
                    hashMap.put("externalStatus", externalStatus);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      PatientGroupLogRepository lowercaseFirstLetterRepository = (PatientGroupLogRepository) getRepository();
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
      PatientGroupLogRepository lowercaseFirstLetterRepository = (PatientGroupLogRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      PatientGroupLogRepository lowercaseFirstLetterRepository = (PatientGroupLogRepository) getRepository();
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
                                        PatientGroupLogRepository patientGroupLogRepository = (PatientGroupLogRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupLogRepository.getRestAdapter();
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
                            PatientGroupLogRepository lowercaseFirstLetterRepository = (PatientGroupLogRepository) getRepository();
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
                                        final PatientGroupLogRepository  patientGroupLogRepo = restAdapter.createRepository(PatientGroupLogRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupLogRepo.get__patientGroup( (String)that.getId(), refresh,  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
