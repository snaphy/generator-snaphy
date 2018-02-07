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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AadharRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientDocumentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientSecurityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PincodeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StateRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TalukRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Patient extends User {


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

    private Patient that ;

    public Patient (){
        that = this;
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

            
            
        
    
        
            

            
                private String fatherName;
                /* Adding Getter and Setter methods */
                public String getFatherName(){
                    return fatherName;
                }

                /* Adding Getter and Setter methods */
                public void setFatherName(String fatherName){
                    this.fatherName = fatherName;
                    //Update hashMap value..
                    hashMap.put("fatherName", fatherName);
                }

            
            
        
    
        
            

            
                private Map<String, Object> profilePic;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getProfilePic(){
                    return profilePic;
                }

                /* Adding Getter and Setter methods */
                public void setProfilePic(Map<String, Object> profilePic){
                    this.profilePic = profilePic;
                    //Update Map value..
                    hashMap.put("profilePic", profilePic);
                }

            
            
        
    
        
            

            
                private Map<String, Object> idProof;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getIdProof(){
                    return idProof;
                }

                /* Adding Getter and Setter methods */
                public void setIdProof(Map<String, Object> idProof){
                    this.idProof = idProof;
                    //Update Map value..
                    hashMap.put("idProof", idProof);
                }

            
            
        
    
        
            

            
                private double yearOfBirth;
                /* Adding Getter and Setter methods */
                public double getYearOfBirth(){
                    return yearOfBirth;
                }

                /* Adding Getter and Setter methods */
                public void setYearOfBirth(double yearOfBirth){
                    this.yearOfBirth = yearOfBirth;
                    //Update hashMap value..
                    hashMap.put("yearOfBirth", yearOfBirth);
                }

            
            
        
    
        
            

            
                private double uHId;
                /* Adding Getter and Setter methods */
                public double getUHId(){
                    return uHId;
                }

                /* Adding Getter and Setter methods */
                public void setUHId(double uHId){
                    this.uHId = uHId;
                    //Update hashMap value..
                    hashMap.put("uHId", uHId);
                }

            
            
        
    
        
            

            
                private String aadharLastNumber;
                /* Adding Getter and Setter methods */
                public String getAadharLastNumber(){
                    return aadharLastNumber;
                }

                /* Adding Getter and Setter methods */
                public void setAadharLastNumber(String aadharLastNumber){
                    this.aadharLastNumber = aadharLastNumber;
                    //Update hashMap value..
                    hashMap.put("aadharLastNumber", aadharLastNumber);
                }

            
            
        
    
        
            

            
                private String patientContactNumber;
                /* Adding Getter and Setter methods */
                public String getPatientContactNumber(){
                    return patientContactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPatientContactNumber(String patientContactNumber){
                    this.patientContactNumber = patientContactNumber;
                    //Update hashMap value..
                    hashMap.put("patientContactNumber", patientContactNumber);
                }

            
            
        
    
        
            

            
                private String email;
                /* Adding Getter and Setter methods */
                public String getEmail(){
                    return email;
                }

                /* Adding Getter and Setter methods */
                public void setEmail(String email){
                    this.email = email;
                    //Update hashMap value..
                    hashMap.put("email", email);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> patientOtherAddress;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getPatientOtherAddress(){
                    return patientOtherAddress;
                }

                /* Adding Getter and Setter methods */
                public void setPatientOtherAddress(DataList<Map<String, Object>> patientOtherAddress){
                    this.patientOtherAddress = patientOtherAddress;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("patientOtherAddress", patientOtherAddress);
                }

            

            
            
        
    
        
            

                private DataList<Map<String, Object>> patientOtherContactNumber;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getPatientOtherContactNumber(){
                    return patientOtherContactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPatientOtherContactNumber(DataList<Map<String, Object>> patientOtherContactNumber){
                    this.patientOtherContactNumber = patientOtherContactNumber;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("patientOtherContactNumber", patientOtherContactNumber);
                }

            

            
            
        
    
        
            

                private DataList<Map<String, Object>> otherEmail;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getOtherEmail(){
                    return otherEmail;
                }

                /* Adding Getter and Setter methods */
                public void setOtherEmail(DataList<Map<String, Object>> otherEmail){
                    this.otherEmail = otherEmail;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("otherEmail", otherEmail);
                }

            

            
            
        
    
        
            

            
                private String gender;
                /* Adding Getter and Setter methods */
                public String getGender(){
                    return gender;
                }

                /* Adding Getter and Setter methods */
                public void setGender(String gender){
                    this.gender = gender;
                    //Update hashMap value..
                    hashMap.put("gender", gender);
                }

            
            
        
    
        
            

            
                private Map<String, Object> relationLogs;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getRelationLogs(){
                    return relationLogs;
                }

                /* Adding Getter and Setter methods */
                public void setRelationLogs(Map<String, Object> relationLogs){
                    this.relationLogs = relationLogs;
                    //Update Map value..
                    hashMap.put("relationLogs", relationLogs);
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

            
            
        
    
        
            

            
                private String age;
                /* Adding Getter and Setter methods */
                public String getAge(){
                    return age;
                }

                /* Adding Getter and Setter methods */
                public void setAge(String age){
                    this.age = age;
                    //Update hashMap value..
                    hashMap.put("age", age);
                }

            
            
        
    
        
            

                private DataList<Object> relatedPatients;
                /* Adding Getter and Setter methods */
                public DataList<Object> getRelatedPatients(){
                    return relatedPatients;
                }

                /* Adding Getter and Setter methods */
                public void setRelatedPatients(DataList<Object> relatedPatients){
                    this.relatedPatients = relatedPatients;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("relatedPatients", relatedPatients);
                }

            

            
            
        
    
        
            

            
                private String address;
                /* Adding Getter and Setter methods */
                public String getAddress(){
                    return address;
                }

                /* Adding Getter and Setter methods */
                public void setAddress(String address){
                    this.address = address;
                    //Update hashMap value..
                    hashMap.put("address", address);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> otherAddress;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getOtherAddress(){
                    return otherAddress;
                }

                /* Adding Getter and Setter methods */
                public void setOtherAddress(DataList<Map<String, Object>> otherAddress){
                    this.otherAddress = otherAddress;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("otherAddress", otherAddress);
                }

            

            
            
        
    
        
            

            
                private String pincodeNumber;
                /* Adding Getter and Setter methods */
                public String getPincodeNumber(){
                    return pincodeNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPincodeNumber(String pincodeNumber){
                    this.pincodeNumber = pincodeNumber;
                    //Update hashMap value..
                    hashMap.put("pincodeNumber", pincodeNumber);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();
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
      PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();
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
                    private transient DataList<PatientGroup>  patientGroups ;

                    public DataList< PatientGroup > getPatientGroups() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                            if(that.getId() != null && patientGroupRepository.getDb() != null){

                                 //Fetch locally from db
                                 //patientGroups = getPatientGroups__db(restAdapter);
                                 // Getting single cont
                                 patientGroups = patientGroupRepository.getDb().getAll__db("patientId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return patientGroups;
                    }

                    public void setPatientGroups(DataList<PatientGroup> patientGroups) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: patientGroups){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPatientGroups1(hashMaps);
                        }else{
                            this.patientGroups = patientGroups;
                            //TODO: Warning move this to new thread
                            for(PatientGroup data: patientGroups){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientGroups1(List<Map<String, Object>> patientGroups) {
                        //First create a dummy Repo class object for ..
                        PatientGroupRepository patientGroupsRepository = new PatientGroupRepository();
                        List<PatientGroup> result = new ArrayList<>();
                        for (Map<String, Object> obj : patientGroups) {
                            //Also add relation to child type for two way communication..
                            PatientGroup obj1 = patientGroupsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientGroups(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientGroups1(DataList<HashMap<String, Object>> patientGroups) {
                        //First create a dummy Repo class object for ..
                        PatientGroupRepository patientGroupsRepository = new PatientGroupRepository();
                        DataList<PatientGroup> result = new DataList<>();
                        for (HashMap<String, Object> obj : patientGroups) {
                            //Also add relation to child type for two way communication..
                            PatientGroup obj1 = patientGroupsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientGroups(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PatientGroup> patientGroups, PatientGroup dummyClassInstance) {
                        that.setPatientGroups(patientGroups);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PatientGroup patientGroups) {
                        try{
                            try{

                                  //Save to database..
                                  patientGroups.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPatientGroups().add(patientGroups);
                        }catch(Exception e){
                            DataList< PatientGroup> patientGroups1 = new DataList();
                            //Now add this item to list..
                            patientGroups1.add(patientGroups);
                            //Now set data....
                            that.setPatientGroups(patientGroups1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__patientGroups( String fk,  RestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.findById__patientGroups( (String)that.getId(), fk,  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__patientGroups( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.destroyById__patientGroups( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__patientGroups( String fk,  PatientGroup data,  RestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.updateById__patientGroups( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__patientGroups( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__patientGroups( (String)that.getId(), filter,  new DataListCallback<PatientGroup> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PatientGroup> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PatientGroup obj = new PatientGroup();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PatientGroup obj : object) {
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
                                    public void create__patientGroups( PatientGroup data,  RestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.create__patientGroups( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__patientGroups( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        



                                        patientRepo.delete__patientGroups( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__patientGroups( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.count__patientGroups( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient Aadhar  aadhar ;
                    private String aadharId;

                    public String getAadharId(){
                         return aadharId;
                    }

                    public void setAadharId(Object aadharId){
                        if(aadharId != null){
                          this.aadharId = aadharId.toString();
                        }
                    }

                    public Aadhar getAadhar() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(aadhar == null){
                                        PatientRepository patientRepository = (PatientRepository) getRepository();

                                        RestAdapter restAdapter = patientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          aadhar = getAadhar__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return aadhar;
                    }

                    public void setAadhar(Aadhar aadhar) {
                        this.aadhar = aadhar;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAadhar(Map<String, Object> aadhar) {
                        //First create a dummy Repo class object for customer.
                        AadharRepository aadharRepository = new AadharRepository();
                        Aadhar aadhar1 = aadharRepository.createObject(aadhar);
                        setAadhar(aadhar1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAadhar(HashMap<String, Object> aadhar) {
                        //First create a dummy Repo class object for customer.
                        AadharRepository aadharRepository = new AadharRepository();
                        Aadhar aadhar1 = aadharRepository.createObject(aadhar);
                        setAadhar(aadhar1);
                    }

                    //Adding relation method..
                    public void addRelation(Aadhar aadhar) {
                        that.setAadhar(aadhar);
                    }


                    //Fetch related data from local database if present a aadharId identifier as property for belongsTo
                    public Aadhar getAadhar__db(RestAdapter restAdapter){
                      if(aadharId != null){
                        AadharRepository aadharRepository = restAdapter.createRepository(AadharRepository.class);
                            try{
                            PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(aadharRepository.getDb() == null ){
                                                    aadharRepository.addStorage(context);
                                                }

                                                if(context != null && aadharRepository.getDb() != null){
                                                    aadharRepository.addStorage(context);
                                                    Aadhar aadhar = (Aadhar) aadharRepository.getDb().get__db(aadharId);
                                                    return aadhar;
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
                                    public void get__aadhar( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Aadhar> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__aadhar( (String)that.getId(), refresh,  new ObjectCallback<Aadhar> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Aadhar object) {
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
                    private transient DataList<PatientDocument>  patientDocuments ;

                    public DataList< PatientDocument > getPatientDocuments() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PatientDocumentRepository patientDocumentRepository = (PatientDocumentRepository) getRepository();

                            if(that.getId() != null && patientDocumentRepository.getDb() != null){

                                 //Fetch locally from db
                                 //patientDocuments = getPatientDocuments__db(restAdapter);
                                 // Getting single cont
                                 patientDocuments = patientDocumentRepository.getDb().getAll__db("patientId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return patientDocuments;
                    }

                    public void setPatientDocuments(DataList<PatientDocument> patientDocuments) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: patientDocuments){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPatientDocuments1(hashMaps);
                        }else{
                            this.patientDocuments = patientDocuments;
                            //TODO: Warning move this to new thread
                            for(PatientDocument data: patientDocuments){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientDocuments1(List<Map<String, Object>> patientDocuments) {
                        //First create a dummy Repo class object for ..
                        PatientDocumentRepository patientDocumentsRepository = new PatientDocumentRepository();
                        List<PatientDocument> result = new ArrayList<>();
                        for (Map<String, Object> obj : patientDocuments) {
                            //Also add relation to child type for two way communication..
                            PatientDocument obj1 = patientDocumentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientDocuments(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientDocuments1(DataList<HashMap<String, Object>> patientDocuments) {
                        //First create a dummy Repo class object for ..
                        PatientDocumentRepository patientDocumentsRepository = new PatientDocumentRepository();
                        DataList<PatientDocument> result = new DataList<>();
                        for (HashMap<String, Object> obj : patientDocuments) {
                            //Also add relation to child type for two way communication..
                            PatientDocument obj1 = patientDocumentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientDocuments(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PatientDocument> patientDocuments, PatientDocument dummyClassInstance) {
                        that.setPatientDocuments(patientDocuments);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PatientDocument patientDocuments) {
                        try{
                            try{

                                  //Save to database..
                                  patientDocuments.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPatientDocuments().add(patientDocuments);
                        }catch(Exception e){
                            DataList< PatientDocument> patientDocuments1 = new DataList();
                            //Now add this item to list..
                            patientDocuments1.add(patientDocuments);
                            //Now set data....
                            that.setPatientDocuments(patientDocuments1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__patientDocuments( String fk,  RestAdapter restAdapter, final ObjectCallback<PatientDocument> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.findById__patientDocuments( (String)that.getId(), fk,  new ObjectCallback<PatientDocument> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientDocument object) {
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
                                    public void destroyById__patientDocuments( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.destroyById__patientDocuments( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__patientDocuments( String fk,  PatientDocument data,  RestAdapter restAdapter, final ObjectCallback<PatientDocument> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.updateById__patientDocuments( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientDocument> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientDocument object) {
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
                                    public void get__patientDocuments( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<PatientDocument> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__patientDocuments( (String)that.getId(), filter,  new DataListCallback<PatientDocument> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PatientDocument> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PatientDocument obj = new PatientDocument();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PatientDocument obj : object) {
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
                                    public void create__patientDocuments( PatientDocument data,  RestAdapter restAdapter, final ObjectCallback<PatientDocument> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.create__patientDocuments( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientDocument> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientDocument object) {
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
                                    public void delete__patientDocuments( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        



                                        patientRepo.delete__patientDocuments( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__patientDocuments( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.count__patientDocuments( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<PatientSecurity>  patientSecurities ;

                    public DataList< PatientSecurity > getPatientSecurities() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PatientSecurityRepository patientSecurityRepository = (PatientSecurityRepository) getRepository();

                            if(that.getId() != null && patientSecurityRepository.getDb() != null){

                                 //Fetch locally from db
                                 //patientSecurities = getPatientSecurities__db(restAdapter);
                                 // Getting single cont
                                 patientSecurities = patientSecurityRepository.getDb().getAll__db("patientId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return patientSecurities;
                    }

                    public void setPatientSecurities(DataList<PatientSecurity> patientSecurities) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: patientSecurities){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPatientSecurities1(hashMaps);
                        }else{
                            this.patientSecurities = patientSecurities;
                            //TODO: Warning move this to new thread
                            for(PatientSecurity data: patientSecurities){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientSecurities1(List<Map<String, Object>> patientSecurities) {
                        //First create a dummy Repo class object for ..
                        PatientSecurityRepository patientSecuritiesRepository = new PatientSecurityRepository();
                        List<PatientSecurity> result = new ArrayList<>();
                        for (Map<String, Object> obj : patientSecurities) {
                            //Also add relation to child type for two way communication..
                            PatientSecurity obj1 = patientSecuritiesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientSecurities(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientSecurities1(DataList<HashMap<String, Object>> patientSecurities) {
                        //First create a dummy Repo class object for ..
                        PatientSecurityRepository patientSecuritiesRepository = new PatientSecurityRepository();
                        DataList<PatientSecurity> result = new DataList<>();
                        for (HashMap<String, Object> obj : patientSecurities) {
                            //Also add relation to child type for two way communication..
                            PatientSecurity obj1 = patientSecuritiesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientSecurities(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PatientSecurity> patientSecurities, PatientSecurity dummyClassInstance) {
                        that.setPatientSecurities(patientSecurities);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PatientSecurity patientSecurities) {
                        try{
                            try{

                                  //Save to database..
                                  patientSecurities.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPatientSecurities().add(patientSecurities);
                        }catch(Exception e){
                            DataList< PatientSecurity> patientSecurities1 = new DataList();
                            //Now add this item to list..
                            patientSecurities1.add(patientSecurities);
                            //Now set data....
                            that.setPatientSecurities(patientSecurities1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__patientSecurities( String fk,  RestAdapter restAdapter, final ObjectCallback<PatientSecurity> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.findById__patientSecurities( (String)that.getId(), fk,  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__patientSecurities( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.destroyById__patientSecurities( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__patientSecurities( String fk,  PatientSecurity data,  RestAdapter restAdapter, final ObjectCallback<PatientSecurity> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.updateById__patientSecurities( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__patientSecurities( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<PatientSecurity> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__patientSecurities( (String)that.getId(), filter,  new DataListCallback<PatientSecurity> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PatientSecurity> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PatientSecurity obj = new PatientSecurity();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PatientSecurity obj : object) {
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
                                    public void create__patientSecurities( PatientSecurity data,  RestAdapter restAdapter, final ObjectCallback<PatientSecurity> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.create__patientSecurities( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__patientSecurities( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        



                                        patientRepo.delete__patientSecurities( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__patientSecurities( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.count__patientSecurities( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient Patient  mergedWith ;
                    private String patientId;

                    public String getPatientId(){
                         return patientId;
                    }

                    public void setPatientId(Object patientId){
                        if(patientId != null){
                          this.patientId = patientId.toString();
                        }
                    }

                    public Patient getMergedWith() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(mergedWith == null){
                                        PatientRepository patientRepository = (PatientRepository) getRepository();

                                        RestAdapter restAdapter = patientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          mergedWith = getMergedWith__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return mergedWith;
                    }

                    public void setMergedWith(Patient mergedWith) {
                        this.mergedWith = mergedWith;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setMergedWith(Map<String, Object> mergedWith) {
                        //First create a dummy Repo class object for customer.
                        PatientRepository mergedWithRepository = new PatientRepository();
                        Patient mergedWith1 = mergedWithRepository.createObject(mergedWith);
                        setMergedWith(mergedWith1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setMergedWith(HashMap<String, Object> mergedWith) {
                        //First create a dummy Repo class object for customer.
                        PatientRepository mergedWithRepository = new PatientRepository();
                        Patient mergedWith1 = mergedWithRepository.createObject(mergedWith);
                        setMergedWith(mergedWith1);
                    }

                    //Adding relation method..
                    public void addRelation(Patient mergedWith) {
                        that.setMergedWith(mergedWith);
                    }


                    //Fetch related data from local database if present a patientId identifier as property for belongsTo
                    public Patient getMergedWith__db(RestAdapter restAdapter){
                      if(patientId != null){
                        PatientRepository mergedWithRepository = restAdapter.createRepository(PatientRepository.class);
                            try{
                            PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(mergedWithRepository.getDb() == null ){
                                                    mergedWithRepository.addStorage(context);
                                                }

                                                if(context != null && mergedWithRepository.getDb() != null){
                                                    mergedWithRepository.addStorage(context);
                                                    Patient mergedWith = (Patient) mergedWithRepository.getDb().get__db(patientId);
                                                    return mergedWith;
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
                                    public void get__mergedWith( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Patient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__mergedWith( (String)that.getId(), refresh,  new ObjectCallback<Patient> (){
                                            

                                            
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
                    private transient Pincode  pincode ;
                    private String pincodeId;

                    public String getPincodeId(){
                         return pincodeId;
                    }

                    public void setPincodeId(Object pincodeId){
                        if(pincodeId != null){
                          this.pincodeId = pincodeId.toString();
                        }
                    }

                    public Pincode getPincode() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(pincode == null){
                                        PatientRepository patientRepository = (PatientRepository) getRepository();

                                        RestAdapter restAdapter = patientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          pincode = getPincode__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return pincode;
                    }

                    public void setPincode(Pincode pincode) {
                        this.pincode = pincode;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPincode(Map<String, Object> pincode) {
                        //First create a dummy Repo class object for customer.
                        PincodeRepository pincodeRepository = new PincodeRepository();
                        Pincode pincode1 = pincodeRepository.createObject(pincode);
                        setPincode(pincode1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPincode(HashMap<String, Object> pincode) {
                        //First create a dummy Repo class object for customer.
                        PincodeRepository pincodeRepository = new PincodeRepository();
                        Pincode pincode1 = pincodeRepository.createObject(pincode);
                        setPincode(pincode1);
                    }

                    //Adding relation method..
                    public void addRelation(Pincode pincode) {
                        that.setPincode(pincode);
                    }


                    //Fetch related data from local database if present a pincodeId identifier as property for belongsTo
                    public Pincode getPincode__db(RestAdapter restAdapter){
                      if(pincodeId != null){
                        PincodeRepository pincodeRepository = restAdapter.createRepository(PincodeRepository.class);
                            try{
                            PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(pincodeRepository.getDb() == null ){
                                                    pincodeRepository.addStorage(context);
                                                }

                                                if(context != null && pincodeRepository.getDb() != null){
                                                    pincodeRepository.addStorage(context);
                                                    Pincode pincode = (Pincode) pincodeRepository.getDb().get__db(pincodeId);
                                                    return pincode;
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
                                    public void get__pincode( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Pincode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__pincode( (String)that.getId(), refresh,  new ObjectCallback<Pincode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Pincode object) {
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
                    private transient State  state ;
                    private String stateId;

                    public String getStateId(){
                         return stateId;
                    }

                    public void setStateId(Object stateId){
                        if(stateId != null){
                          this.stateId = stateId.toString();
                        }
                    }

                    public State getState() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(state == null){
                                        PatientRepository patientRepository = (PatientRepository) getRepository();

                                        RestAdapter restAdapter = patientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          state = getState__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return state;
                    }

                    public void setState(State state) {
                        this.state = state;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setState(Map<String, Object> state) {
                        //First create a dummy Repo class object for customer.
                        StateRepository stateRepository = new StateRepository();
                        State state1 = stateRepository.createObject(state);
                        setState(state1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setState(HashMap<String, Object> state) {
                        //First create a dummy Repo class object for customer.
                        StateRepository stateRepository = new StateRepository();
                        State state1 = stateRepository.createObject(state);
                        setState(state1);
                    }

                    //Adding relation method..
                    public void addRelation(State state) {
                        that.setState(state);
                    }


                    //Fetch related data from local database if present a stateId identifier as property for belongsTo
                    public State getState__db(RestAdapter restAdapter){
                      if(stateId != null){
                        StateRepository stateRepository = restAdapter.createRepository(StateRepository.class);
                            try{
                            PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(stateRepository.getDb() == null ){
                                                    stateRepository.addStorage(context);
                                                }

                                                if(context != null && stateRepository.getDb() != null){
                                                    stateRepository.addStorage(context);
                                                    State state = (State) stateRepository.getDb().get__db(stateId);
                                                    return state;
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
                                    public void get__state( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<State> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__state( (String)that.getId(), refresh,  new ObjectCallback<State> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(State object) {
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
                    private transient Taluk  taluk ;
                    private String talukId;

                    public String getTalukId(){
                         return talukId;
                    }

                    public void setTalukId(Object talukId){
                        if(talukId != null){
                          this.talukId = talukId.toString();
                        }
                    }

                    public Taluk getTaluk() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(taluk == null){
                                        PatientRepository patientRepository = (PatientRepository) getRepository();

                                        RestAdapter restAdapter = patientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          taluk = getTaluk__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return taluk;
                    }

                    public void setTaluk(Taluk taluk) {
                        this.taluk = taluk;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTaluk(Map<String, Object> taluk) {
                        //First create a dummy Repo class object for customer.
                        TalukRepository talukRepository = new TalukRepository();
                        Taluk taluk1 = talukRepository.createObject(taluk);
                        setTaluk(taluk1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTaluk(HashMap<String, Object> taluk) {
                        //First create a dummy Repo class object for customer.
                        TalukRepository talukRepository = new TalukRepository();
                        Taluk taluk1 = talukRepository.createObject(taluk);
                        setTaluk(taluk1);
                    }

                    //Adding relation method..
                    public void addRelation(Taluk taluk) {
                        that.setTaluk(taluk);
                    }


                    //Fetch related data from local database if present a talukId identifier as property for belongsTo
                    public Taluk getTaluk__db(RestAdapter restAdapter){
                      if(talukId != null){
                        TalukRepository talukRepository = restAdapter.createRepository(TalukRepository.class);
                            try{
                            PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(talukRepository.getDb() == null ){
                                                    talukRepository.addStorage(context);
                                                }

                                                if(context != null && talukRepository.getDb() != null){
                                                    talukRepository.addStorage(context);
                                                    Taluk taluk = (Taluk) talukRepository.getDb().get__db(talukId);
                                                    return taluk;
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
                                    public void get__taluk( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Taluk> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__taluk( (String)that.getId(), refresh,  new ObjectCallback<Taluk> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Taluk object) {
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
                    private transient District  district ;
                    private String districtId;

                    public String getDistrictId(){
                         return districtId;
                    }

                    public void setDistrictId(Object districtId){
                        if(districtId != null){
                          this.districtId = districtId.toString();
                        }
                    }

                    public District getDistrict() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(district == null){
                                        PatientRepository patientRepository = (PatientRepository) getRepository();

                                        RestAdapter restAdapter = patientRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          district = getDistrict__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return district;
                    }

                    public void setDistrict(District district) {
                        this.district = district;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDistrict(Map<String, Object> district) {
                        //First create a dummy Repo class object for customer.
                        DistrictRepository districtRepository = new DistrictRepository();
                        District district1 = districtRepository.createObject(district);
                        setDistrict(district1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDistrict(HashMap<String, Object> district) {
                        //First create a dummy Repo class object for customer.
                        DistrictRepository districtRepository = new DistrictRepository();
                        District district1 = districtRepository.createObject(district);
                        setDistrict(district1);
                    }

                    //Adding relation method..
                    public void addRelation(District district) {
                        that.setDistrict(district);
                    }


                    //Fetch related data from local database if present a districtId identifier as property for belongsTo
                    public District getDistrict__db(RestAdapter restAdapter){
                      if(districtId != null){
                        DistrictRepository districtRepository = restAdapter.createRepository(DistrictRepository.class);
                            try{
                            PatientRepository lowercaseFirstLetterRepository = (PatientRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(districtRepository.getDb() == null ){
                                                    districtRepository.addStorage(context);
                                                }

                                                if(context != null && districtRepository.getDb() != null){
                                                    districtRepository.addStorage(context);
                                                    District district = (District) districtRepository.getDb().get__db(districtId);
                                                    return district;
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
                                    public void get__district( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<District> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__district( (String)that.getId(), refresh,  new ObjectCallback<District> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(District object) {
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
                    private transient DataList<Bill>  bills ;

                    public DataList< Bill > getBills() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            BillRepository billRepository = (BillRepository) getRepository();

                            if(that.getId() != null && billRepository.getDb() != null){

                                 //Fetch locally from db
                                 //bills = getBills__db(restAdapter);
                                 // Getting single cont
                                 bills = billRepository.getDb().getAll__db("patientId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return bills;
                    }

                    public void setBills(DataList<Bill> bills) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: bills){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setBills1(hashMaps);
                        }else{
                            this.bills = bills;
                            //TODO: Warning move this to new thread
                            for(Bill data: bills){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBills1(List<Map<String, Object>> bills) {
                        //First create a dummy Repo class object for ..
                        BillRepository billsRepository = new BillRepository();
                        List<Bill> result = new ArrayList<>();
                        for (Map<String, Object> obj : bills) {
                            //Also add relation to child type for two way communication..
                            Bill obj1 = billsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBills(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBills1(DataList<HashMap<String, Object>> bills) {
                        //First create a dummy Repo class object for ..
                        BillRepository billsRepository = new BillRepository();
                        DataList<Bill> result = new DataList<>();
                        for (HashMap<String, Object> obj : bills) {
                            //Also add relation to child type for two way communication..
                            Bill obj1 = billsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBills(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Bill> bills, Bill dummyClassInstance) {
                        that.setBills(bills);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Bill bills) {
                        try{
                            try{

                                  //Save to database..
                                  bills.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getBills().add(bills);
                        }catch(Exception e){
                            DataList< Bill> bills1 = new DataList();
                            //Now add this item to list..
                            bills1.add(bills);
                            //Now set data....
                            that.setBills(bills1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__bills( String fk,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.findById__bills( (String)that.getId(), fk,  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
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
                                    public void destroyById__bills( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.destroyById__bills( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__bills( String fk,  Bill data,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.updateById__bills( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
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
                                    public void get__bills( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.get__bills( (String)that.getId(), filter,  new DataListCallback<Bill> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Bill> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Bill obj = new Bill();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Bill obj : object) {
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
                                    public void create__bills( Bill data,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.create__bills( (String)that.getId(), data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
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
                                    public void delete__bills( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        



                                        patientRepo.delete__bills( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__bills( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientRepository  patientRepo = restAdapter.createRepository(PatientRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientRepo.count__bills( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
