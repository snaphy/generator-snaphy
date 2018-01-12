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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientFlagRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FlagRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientSecurityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class PatientFlag extends Model {


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

    private PatientFlag that ;

    public PatientFlag (){
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

            
            
        
    
        
            

            
                private double severityPoints;
                /* Adding Getter and Setter methods */
                public double getSeverityPoints(){
                    return severityPoints;
                }

                /* Adding Getter and Setter methods */
                public void setSeverityPoints(double severityPoints){
                    this.severityPoints = severityPoints;
                    //Update hashMap value..
                    hashMap.put("severityPoints", severityPoints);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      PatientFlagRepository lowercaseFirstLetterRepository = (PatientFlagRepository) getRepository();
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
      PatientFlagRepository lowercaseFirstLetterRepository = (PatientFlagRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      PatientFlagRepository lowercaseFirstLetterRepository = (PatientFlagRepository) getRepository();
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
                    private transient Flag  flag ;
                    private String flagId;

                    public String getFlagId(){
                         return flagId;
                    }

                    public void setFlagId(Object flagId){
                        if(flagId != null){
                          this.flagId = flagId.toString();
                        }
                    }

                    public Flag getFlag() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(flag == null){
                                        PatientFlagRepository patientFlagRepository = (PatientFlagRepository) getRepository();

                                        RestAdapter restAdapter = patientFlagRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          flag = getFlag__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return flag;
                    }

                    public void setFlag(Flag flag) {
                        this.flag = flag;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setFlag(Map<String, Object> flag) {
                        //First create a dummy Repo class object for customer.
                        FlagRepository flagRepository = new FlagRepository();
                        Flag flag1 = flagRepository.createObject(flag);
                        setFlag(flag1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setFlag(HashMap<String, Object> flag) {
                        //First create a dummy Repo class object for customer.
                        FlagRepository flagRepository = new FlagRepository();
                        Flag flag1 = flagRepository.createObject(flag);
                        setFlag(flag1);
                    }

                    //Adding relation method..
                    public void addRelation(Flag flag) {
                        that.setFlag(flag);
                    }


                    //Fetch related data from local database if present a flagId identifier as property for belongsTo
                    public Flag getFlag__db(RestAdapter restAdapter){
                      if(flagId != null){
                        FlagRepository flagRepository = restAdapter.createRepository(FlagRepository.class);
                            try{
                            PatientFlagRepository lowercaseFirstLetterRepository = (PatientFlagRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(flagRepository.getDb() == null ){
                                                    flagRepository.addStorage(context);
                                                }

                                                if(context != null && flagRepository.getDb() != null){
                                                    flagRepository.addStorage(context);
                                                    Flag flag = (Flag) flagRepository.getDb().get__db(flagId);
                                                    return flag;
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
                                    public void get__flag( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Flag> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientFlagRepository  patientFlagRepo = restAdapter.createRepository(PatientFlagRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientFlagRepo.get__flag( (String)that.getId(), refresh,  new ObjectCallback<Flag> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Flag object) {
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
                    private transient PatientSecurity  patientSecurity ;
                    private String patientSecurityId;

                    public String getPatientSecurityId(){
                         return patientSecurityId;
                    }

                    public void setPatientSecurityId(Object patientSecurityId){
                        if(patientSecurityId != null){
                          this.patientSecurityId = patientSecurityId.toString();
                        }
                    }

                    public PatientSecurity getPatientSecurity() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(patientSecurity == null){
                                        PatientFlagRepository patientFlagRepository = (PatientFlagRepository) getRepository();

                                        RestAdapter restAdapter = patientFlagRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          patientSecurity = getPatientSecurity__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return patientSecurity;
                    }

                    public void setPatientSecurity(PatientSecurity patientSecurity) {
                        this.patientSecurity = patientSecurity;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatientSecurity(Map<String, Object> patientSecurity) {
                        //First create a dummy Repo class object for customer.
                        PatientSecurityRepository patientSecurityRepository = new PatientSecurityRepository();
                        PatientSecurity patientSecurity1 = patientSecurityRepository.createObject(patientSecurity);
                        setPatientSecurity(patientSecurity1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatientSecurity(HashMap<String, Object> patientSecurity) {
                        //First create a dummy Repo class object for customer.
                        PatientSecurityRepository patientSecurityRepository = new PatientSecurityRepository();
                        PatientSecurity patientSecurity1 = patientSecurityRepository.createObject(patientSecurity);
                        setPatientSecurity(patientSecurity1);
                    }

                    //Adding relation method..
                    public void addRelation(PatientSecurity patientSecurity) {
                        that.setPatientSecurity(patientSecurity);
                    }


                    //Fetch related data from local database if present a patientSecurityId identifier as property for belongsTo
                    public PatientSecurity getPatientSecurity__db(RestAdapter restAdapter){
                      if(patientSecurityId != null){
                        PatientSecurityRepository patientSecurityRepository = restAdapter.createRepository(PatientSecurityRepository.class);
                            try{
                            PatientFlagRepository lowercaseFirstLetterRepository = (PatientFlagRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(patientSecurityRepository.getDb() == null ){
                                                    patientSecurityRepository.addStorage(context);
                                                }

                                                if(context != null && patientSecurityRepository.getDb() != null){
                                                    patientSecurityRepository.addStorage(context);
                                                    PatientSecurity patientSecurity = (PatientSecurity) patientSecurityRepository.getDb().get__db(patientSecurityId);
                                                    return patientSecurity;
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
                                    public void get__patientSecurity( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<PatientSecurity> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientFlagRepository  patientFlagRepo = restAdapter.createRepository(PatientFlagRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientFlagRepo.get__patientSecurity( (String)that.getId(), refresh,  new ObjectCallback<PatientSecurity> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientSecurity object) {
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
                                        PatientFlagRepository patientFlagRepository = (PatientFlagRepository) getRepository();

                                        RestAdapter restAdapter = patientFlagRepository.getRestAdapter();
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
                            PatientFlagRepository lowercaseFirstLetterRepository = (PatientFlagRepository) getRepository();
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
                                        final PatientFlagRepository  patientFlagRepo = restAdapter.createRepository(PatientFlagRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientFlagRepo.get__patient( (String)that.getId(), refresh,  new ObjectCallback<Patient> (){
                                            

                                            
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
                                 
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
