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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.UserInviteRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientSecurityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RegistrationCouncilRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserSpecializationRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserSettingRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserEducationRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PincodeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StateRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TalukRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ReferPatientRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class HospitalUser extends User {


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

    private HospitalUser that ;

    public HospitalUser (){
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

            
            
        
    
        
            

            
                private String firstName;
                /* Adding Getter and Setter methods */
                public String getFirstName(){
                    return firstName;
                }

                /* Adding Getter and Setter methods */
                public void setFirstName(String firstName){
                    this.firstName = firstName;
                    //Update hashMap value..
                    hashMap.put("firstName", firstName);
                }

            
            
        
    
        
            

            
                private String lastName;
                /* Adding Getter and Setter methods */
                public String getLastName(){
                    return lastName;
                }

                /* Adding Getter and Setter methods */
                public void setLastName(String lastName){
                    this.lastName = lastName;
                    //Update hashMap value..
                    hashMap.put("lastName", lastName);
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

            
            
        
    
        
            

            
                private String contactNumber;
                /* Adding Getter and Setter methods */
                public String getContactNumber(){
                    return contactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setContactNumber(String contactNumber){
                    this.contactNumber = contactNumber;
                    //Update hashMap value..
                    hashMap.put("contactNumber", contactNumber);
                }

            
            
        
    
        
            

            
                private String designation;
                /* Adding Getter and Setter methods */
                public String getDesignation(){
                    return designation;
                }

                /* Adding Getter and Setter methods */
                public void setDesignation(String designation){
                    this.designation = designation;
                    //Update hashMap value..
                    hashMap.put("designation", designation);
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

            
            
        
    
        
            

            
                private boolean isDoctor;
                /* Adding Getter and Setter methods */
                public boolean getIsDoctor(){
                    return isDoctor;
                }

                /* Adding Getter and Setter methods */
                public void setIsDoctor(boolean isDoctor){
                    this.isDoctor = isDoctor;
                    //Update hashMap value..
                    hashMap.put("isDoctor", isDoctor);
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

            
            
        
    
        
            

            
                private String registrationNumber;
                /* Adding Getter and Setter methods */
                public String getRegistrationNumber(){
                    return registrationNumber;
                }

                /* Adding Getter and Setter methods */
                public void setRegistrationNumber(String registrationNumber){
                    this.registrationNumber = registrationNumber;
                    //Update hashMap value..
                    hashMap.put("registrationNumber", registrationNumber);
                }

            
            
        
    
        
            

            
                private double registrationYear;
                /* Adding Getter and Setter methods */
                public double getRegistrationYear(){
                    return registrationYear;
                }

                /* Adding Getter and Setter methods */
                public void setRegistrationYear(double registrationYear){
                    this.registrationYear = registrationYear;
                    //Update hashMap value..
                    hashMap.put("registrationYear", registrationYear);
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

            
            
        
    
        
            

            
                private Map<String, Object> image;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getImage(){
                    return image;
                }

                /* Adding Getter and Setter methods */
                public void setImage(Map<String, Object> image){
                    this.image = image;
                    //Update Map value..
                    hashMap.put("image", image);
                }

            
            
        
    
        
            

            
                private double yearOfExperience;
                /* Adding Getter and Setter methods */
                public double getYearOfExperience(){
                    return yearOfExperience;
                }

                /* Adding Getter and Setter methods */
                public void setYearOfExperience(double yearOfExperience){
                    this.yearOfExperience = yearOfExperience;
                    //Update hashMap value..
                    hashMap.put("yearOfExperience", yearOfExperience);
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

            
            
        
    
        
            

            
                private String registeredStatus;
                /* Adding Getter and Setter methods */
                public String getRegisteredStatus(){
                    return registeredStatus;
                }

                /* Adding Getter and Setter methods */
                public void setRegisteredStatus(String registeredStatus){
                    this.registeredStatus = registeredStatus;
                    //Update hashMap value..
                    hashMap.put("registeredStatus", registeredStatus);
                }

            
            
        
    
        
            

            
                private String authenticationStatus;
                /* Adding Getter and Setter methods */
                public String getAuthenticationStatus(){
                    return authenticationStatus;
                }

                /* Adding Getter and Setter methods */
                public void setAuthenticationStatus(String authenticationStatus){
                    this.authenticationStatus = authenticationStatus;
                    //Update hashMap value..
                    hashMap.put("authenticationStatus", authenticationStatus);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      HospitalUserRepository lowercaseFirstLetterRepository = (HospitalUserRepository) getRepository();
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
      HospitalUserRepository lowercaseFirstLetterRepository = (HospitalUserRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      HospitalUserRepository lowercaseFirstLetterRepository = (HospitalUserRepository) getRepository();
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
                                 patientGroups = patientGroupRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__patientGroups( (String)that.getId(), fk,  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__patientGroups( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__patientGroups( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__patientGroups( (String)that.getId(), filter,  new DataListCallback<PatientGroup> (){
                                            

                                            


                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__patientGroups( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__patientGroups( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__patientGroups( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<UserInvite>  userInvites ;

                    public DataList< UserInvite > getUserInvites() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            UserInviteRepository userInviteRepository = (UserInviteRepository) getRepository();

                            if(that.getId() != null && userInviteRepository.getDb() != null){

                                 //Fetch locally from db
                                 //userInvites = getUserInvites__db(restAdapter);
                                 // Getting single cont
                                 userInvites = userInviteRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return userInvites;
                    }

                    public void setUserInvites(DataList<UserInvite> userInvites) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: userInvites){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setUserInvites1(hashMaps);
                        }else{
                            this.userInvites = userInvites;
                            //TODO: Warning move this to new thread
                            for(UserInvite data: userInvites){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setUserInvites1(List<Map<String, Object>> userInvites) {
                        //First create a dummy Repo class object for ..
                        UserInviteRepository userInvitesRepository = new UserInviteRepository();
                        List<UserInvite> result = new ArrayList<>();
                        for (Map<String, Object> obj : userInvites) {
                            //Also add relation to child type for two way communication..
                            UserInvite obj1 = userInvitesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setUserInvites(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setUserInvites1(DataList<HashMap<String, Object>> userInvites) {
                        //First create a dummy Repo class object for ..
                        UserInviteRepository userInvitesRepository = new UserInviteRepository();
                        DataList<UserInvite> result = new DataList<>();
                        for (HashMap<String, Object> obj : userInvites) {
                            //Also add relation to child type for two way communication..
                            UserInvite obj1 = userInvitesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setUserInvites(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<UserInvite> userInvites, UserInvite dummyClassInstance) {
                        that.setUserInvites(userInvites);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(UserInvite userInvites) {
                        try{
                            try{

                                  //Save to database..
                                  userInvites.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getUserInvites().add(userInvites);
                        }catch(Exception e){
                            DataList< UserInvite> userInvites1 = new DataList();
                            //Now add this item to list..
                            userInvites1.add(userInvites);
                            //Now set data....
                            that.setUserInvites(userInvites1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__userInvites( String fk,  RestAdapter restAdapter, final ObjectCallback<UserInvite> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__userInvites( (String)that.getId(), fk,  new ObjectCallback<UserInvite> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(UserInvite object) {
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
                                    public void destroyById__userInvites( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__userInvites( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__userInvites( String fk,  UserInvite data,  RestAdapter restAdapter, final ObjectCallback<UserInvite> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__userInvites( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<UserInvite> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(UserInvite object) {
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
                                    public void get__userInvites( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<UserInvite> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__userInvites( (String)that.getId(), filter,  new DataListCallback<UserInvite> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<UserInvite> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            UserInvite obj = new UserInvite();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (UserInvite obj : object) {
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
                                    public void create__userInvites( UserInvite data,  RestAdapter restAdapter, final ObjectCallback<UserInvite> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__userInvites( (String)that.getId(), data.convertMap(),  new ObjectCallback<UserInvite> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(UserInvite object) {
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
                                    public void delete__userInvites( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__userInvites( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__userInvites( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__userInvites( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 patientSecurities = patientSecurityRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__patientSecurities( (String)that.getId(), fk,  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__patientSecurities( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__patientSecurities( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__patientSecurities( (String)that.getId(), filter,  new DataListCallback<PatientSecurity> (){
                                            

                                            


                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__patientSecurities( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__patientSecurities( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__patientSecurities( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient RegistrationCouncil  registrationCouncil ;
                    private String registrationCouncilId;

                    public String getRegistrationCouncilId(){
                         return registrationCouncilId;
                    }

                    public void setRegistrationCouncilId(Object registrationCouncilId){
                        if(registrationCouncilId != null){
                          this.registrationCouncilId = registrationCouncilId.toString();
                        }
                    }

                    public RegistrationCouncil getRegistrationCouncil() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(registrationCouncil == null){
                                        HospitalUserRepository hospitalUserRepository = (HospitalUserRepository) getRepository();

                                        RestAdapter restAdapter = hospitalUserRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          registrationCouncil = getRegistrationCouncil__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return registrationCouncil;
                    }

                    public void setRegistrationCouncil(RegistrationCouncil registrationCouncil) {
                        this.registrationCouncil = registrationCouncil;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRegistrationCouncil(Map<String, Object> registrationCouncil) {
                        //First create a dummy Repo class object for customer.
                        RegistrationCouncilRepository registrationCouncilRepository = new RegistrationCouncilRepository();
                        RegistrationCouncil registrationCouncil1 = registrationCouncilRepository.createObject(registrationCouncil);
                        setRegistrationCouncil(registrationCouncil1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRegistrationCouncil(HashMap<String, Object> registrationCouncil) {
                        //First create a dummy Repo class object for customer.
                        RegistrationCouncilRepository registrationCouncilRepository = new RegistrationCouncilRepository();
                        RegistrationCouncil registrationCouncil1 = registrationCouncilRepository.createObject(registrationCouncil);
                        setRegistrationCouncil(registrationCouncil1);
                    }

                    //Adding relation method..
                    public void addRelation(RegistrationCouncil registrationCouncil) {
                        that.setRegistrationCouncil(registrationCouncil);
                    }


                    //Fetch related data from local database if present a registrationCouncilId identifier as property for belongsTo
                    public RegistrationCouncil getRegistrationCouncil__db(RestAdapter restAdapter){
                      if(registrationCouncilId != null){
                        RegistrationCouncilRepository registrationCouncilRepository = restAdapter.createRepository(RegistrationCouncilRepository.class);
                            try{
                            HospitalUserRepository lowercaseFirstLetterRepository = (HospitalUserRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(registrationCouncilRepository.getDb() == null ){
                                                    registrationCouncilRepository.addStorage(context);
                                                }

                                                if(context != null && registrationCouncilRepository.getDb() != null){
                                                    registrationCouncilRepository.addStorage(context);
                                                    RegistrationCouncil registrationCouncil = (RegistrationCouncil) registrationCouncilRepository.getDb().get__db(registrationCouncilId);
                                                    return registrationCouncil;
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
                                    public void get__registrationCouncil( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<RegistrationCouncil> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__registrationCouncil( (String)that.getId(), refresh,  new ObjectCallback<RegistrationCouncil> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(RegistrationCouncil object) {
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
                    private transient DataList<HospitalUserSpecialization>  hospitalUserSpecializations ;

                    public DataList< HospitalUserSpecialization > getHospitalUserSpecializations() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HospitalUserSpecializationRepository hospitalUserSpecializationRepository = (HospitalUserSpecializationRepository) getRepository();

                            if(that.getId() != null && hospitalUserSpecializationRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hospitalUserSpecializations = getHospitalUserSpecializations__db(restAdapter);
                                 // Getting single cont
                                 hospitalUserSpecializations = hospitalUserSpecializationRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return hospitalUserSpecializations;
                    }

                    public void setHospitalUserSpecializations(DataList<HospitalUserSpecialization> hospitalUserSpecializations) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hospitalUserSpecializations){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHospitalUserSpecializations1(hashMaps);
                        }else{
                            this.hospitalUserSpecializations = hospitalUserSpecializations;
                            //TODO: Warning move this to new thread
                            for(HospitalUserSpecialization data: hospitalUserSpecializations){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserSpecializations1(List<Map<String, Object>> hospitalUserSpecializations) {
                        //First create a dummy Repo class object for ..
                        HospitalUserSpecializationRepository hospitalUserSpecializationsRepository = new HospitalUserSpecializationRepository();
                        List<HospitalUserSpecialization> result = new ArrayList<>();
                        for (Map<String, Object> obj : hospitalUserSpecializations) {
                            //Also add relation to child type for two way communication..
                            HospitalUserSpecialization obj1 = hospitalUserSpecializationsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserSpecializations(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserSpecializations1(DataList<HashMap<String, Object>> hospitalUserSpecializations) {
                        //First create a dummy Repo class object for ..
                        HospitalUserSpecializationRepository hospitalUserSpecializationsRepository = new HospitalUserSpecializationRepository();
                        DataList<HospitalUserSpecialization> result = new DataList<>();
                        for (HashMap<String, Object> obj : hospitalUserSpecializations) {
                            //Also add relation to child type for two way communication..
                            HospitalUserSpecialization obj1 = hospitalUserSpecializationsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserSpecializations(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HospitalUserSpecialization> hospitalUserSpecializations, HospitalUserSpecialization dummyClassInstance) {
                        that.setHospitalUserSpecializations(hospitalUserSpecializations);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HospitalUserSpecialization hospitalUserSpecializations) {
                        try{
                            try{

                                  //Save to database..
                                  hospitalUserSpecializations.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHospitalUserSpecializations().add(hospitalUserSpecializations);
                        }catch(Exception e){
                            DataList< HospitalUserSpecialization> hospitalUserSpecializations1 = new DataList();
                            //Now add this item to list..
                            hospitalUserSpecializations1.add(hospitalUserSpecializations);
                            //Now set data....
                            that.setHospitalUserSpecializations(hospitalUserSpecializations1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__hospitalUserSpecializations( String fk,  RestAdapter restAdapter, final ObjectCallback<HospitalUserSpecialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__hospitalUserSpecializations( (String)that.getId(), fk,  new ObjectCallback<HospitalUserSpecialization> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSpecialization object) {
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
                                    public void destroyById__hospitalUserSpecializations( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__hospitalUserSpecializations( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitalUserSpecializations( String fk,  HospitalUserSpecialization data,  RestAdapter restAdapter, final ObjectCallback<HospitalUserSpecialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__hospitalUserSpecializations( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HospitalUserSpecialization> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSpecialization object) {
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
                                    public void get__hospitalUserSpecializations( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<HospitalUserSpecialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__hospitalUserSpecializations( (String)that.getId(), filter,  new DataListCallback<HospitalUserSpecialization> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HospitalUserSpecialization> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HospitalUserSpecialization obj = new HospitalUserSpecialization();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HospitalUserSpecialization obj : object) {
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
                                    public void create__hospitalUserSpecializations( HospitalUserSpecialization data,  RestAdapter restAdapter, final ObjectCallback<HospitalUserSpecialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__hospitalUserSpecializations( (String)that.getId(), data.convertMap(),  new ObjectCallback<HospitalUserSpecialization> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSpecialization object) {
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
                                    public void delete__hospitalUserSpecializations( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__hospitalUserSpecializations( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitalUserSpecializations( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__hospitalUserSpecializations( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<HospitalUserSetting>  hospitalUserSettings ;

                    public DataList< HospitalUserSetting > getHospitalUserSettings() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HospitalUserSettingRepository hospitalUserSettingRepository = (HospitalUserSettingRepository) getRepository();

                            if(that.getId() != null && hospitalUserSettingRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hospitalUserSettings = getHospitalUserSettings__db(restAdapter);
                                 // Getting single cont
                                 hospitalUserSettings = hospitalUserSettingRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return hospitalUserSettings;
                    }

                    public void setHospitalUserSettings(DataList<HospitalUserSetting> hospitalUserSettings) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hospitalUserSettings){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHospitalUserSettings1(hashMaps);
                        }else{
                            this.hospitalUserSettings = hospitalUserSettings;
                            //TODO: Warning move this to new thread
                            for(HospitalUserSetting data: hospitalUserSettings){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserSettings1(List<Map<String, Object>> hospitalUserSettings) {
                        //First create a dummy Repo class object for ..
                        HospitalUserSettingRepository hospitalUserSettingsRepository = new HospitalUserSettingRepository();
                        List<HospitalUserSetting> result = new ArrayList<>();
                        for (Map<String, Object> obj : hospitalUserSettings) {
                            //Also add relation to child type for two way communication..
                            HospitalUserSetting obj1 = hospitalUserSettingsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserSettings(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserSettings1(DataList<HashMap<String, Object>> hospitalUserSettings) {
                        //First create a dummy Repo class object for ..
                        HospitalUserSettingRepository hospitalUserSettingsRepository = new HospitalUserSettingRepository();
                        DataList<HospitalUserSetting> result = new DataList<>();
                        for (HashMap<String, Object> obj : hospitalUserSettings) {
                            //Also add relation to child type for two way communication..
                            HospitalUserSetting obj1 = hospitalUserSettingsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserSettings(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HospitalUserSetting> hospitalUserSettings, HospitalUserSetting dummyClassInstance) {
                        that.setHospitalUserSettings(hospitalUserSettings);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HospitalUserSetting hospitalUserSettings) {
                        try{
                            try{

                                  //Save to database..
                                  hospitalUserSettings.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHospitalUserSettings().add(hospitalUserSettings);
                        }catch(Exception e){
                            DataList< HospitalUserSetting> hospitalUserSettings1 = new DataList();
                            //Now add this item to list..
                            hospitalUserSettings1.add(hospitalUserSettings);
                            //Now set data....
                            that.setHospitalUserSettings(hospitalUserSettings1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__hospitalUserSettings( String fk,  RestAdapter restAdapter, final ObjectCallback<HospitalUserSetting> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__hospitalUserSettings( (String)that.getId(), fk,  new ObjectCallback<HospitalUserSetting> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSetting object) {
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
                                    public void destroyById__hospitalUserSettings( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__hospitalUserSettings( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitalUserSettings( String fk,  HospitalUserSetting data,  RestAdapter restAdapter, final ObjectCallback<HospitalUserSetting> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__hospitalUserSettings( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HospitalUserSetting> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSetting object) {
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
                                    public void get__hospitalUserSettings( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<HospitalUserSetting> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__hospitalUserSettings( (String)that.getId(), filter,  new DataListCallback<HospitalUserSetting> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HospitalUserSetting> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HospitalUserSetting obj = new HospitalUserSetting();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HospitalUserSetting obj : object) {
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
                                    public void create__hospitalUserSettings( HospitalUserSetting data,  RestAdapter restAdapter, final ObjectCallback<HospitalUserSetting> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__hospitalUserSettings( (String)that.getId(), data.convertMap(),  new ObjectCallback<HospitalUserSetting> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSetting object) {
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
                                    public void delete__hospitalUserSettings( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__hospitalUserSettings( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitalUserSettings( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__hospitalUserSettings( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<HospitalUserEducation>  hospitalUserEducations ;

                    public DataList< HospitalUserEducation > getHospitalUserEducations() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HospitalUserEducationRepository hospitalUserEducationRepository = (HospitalUserEducationRepository) getRepository();

                            if(that.getId() != null && hospitalUserEducationRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hospitalUserEducations = getHospitalUserEducations__db(restAdapter);
                                 // Getting single cont
                                 hospitalUserEducations = hospitalUserEducationRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return hospitalUserEducations;
                    }

                    public void setHospitalUserEducations(DataList<HospitalUserEducation> hospitalUserEducations) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hospitalUserEducations){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHospitalUserEducations1(hashMaps);
                        }else{
                            this.hospitalUserEducations = hospitalUserEducations;
                            //TODO: Warning move this to new thread
                            for(HospitalUserEducation data: hospitalUserEducations){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserEducations1(List<Map<String, Object>> hospitalUserEducations) {
                        //First create a dummy Repo class object for ..
                        HospitalUserEducationRepository hospitalUserEducationsRepository = new HospitalUserEducationRepository();
                        List<HospitalUserEducation> result = new ArrayList<>();
                        for (Map<String, Object> obj : hospitalUserEducations) {
                            //Also add relation to child type for two way communication..
                            HospitalUserEducation obj1 = hospitalUserEducationsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserEducations(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserEducations1(DataList<HashMap<String, Object>> hospitalUserEducations) {
                        //First create a dummy Repo class object for ..
                        HospitalUserEducationRepository hospitalUserEducationsRepository = new HospitalUserEducationRepository();
                        DataList<HospitalUserEducation> result = new DataList<>();
                        for (HashMap<String, Object> obj : hospitalUserEducations) {
                            //Also add relation to child type for two way communication..
                            HospitalUserEducation obj1 = hospitalUserEducationsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserEducations(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HospitalUserEducation> hospitalUserEducations, HospitalUserEducation dummyClassInstance) {
                        that.setHospitalUserEducations(hospitalUserEducations);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HospitalUserEducation hospitalUserEducations) {
                        try{
                            try{

                                  //Save to database..
                                  hospitalUserEducations.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHospitalUserEducations().add(hospitalUserEducations);
                        }catch(Exception e){
                            DataList< HospitalUserEducation> hospitalUserEducations1 = new DataList();
                            //Now add this item to list..
                            hospitalUserEducations1.add(hospitalUserEducations);
                            //Now set data....
                            that.setHospitalUserEducations(hospitalUserEducations1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__hospitalUserEducations( String fk,  RestAdapter restAdapter, final ObjectCallback<HospitalUserEducation> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__hospitalUserEducations( (String)that.getId(), fk,  new ObjectCallback<HospitalUserEducation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserEducation object) {
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
                                    public void destroyById__hospitalUserEducations( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__hospitalUserEducations( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitalUserEducations( String fk,  HospitalUserEducation data,  RestAdapter restAdapter, final ObjectCallback<HospitalUserEducation> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__hospitalUserEducations( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HospitalUserEducation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserEducation object) {
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
                                    public void get__hospitalUserEducations( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<HospitalUserEducation> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__hospitalUserEducations( (String)that.getId(), filter,  new DataListCallback<HospitalUserEducation> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HospitalUserEducation> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HospitalUserEducation obj = new HospitalUserEducation();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HospitalUserEducation obj : object) {
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
                                    public void create__hospitalUserEducations( HospitalUserEducation data,  RestAdapter restAdapter, final ObjectCallback<HospitalUserEducation> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__hospitalUserEducations( (String)that.getId(), data.convertMap(),  new ObjectCallback<HospitalUserEducation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserEducation object) {
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
                                    public void delete__hospitalUserEducations( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__hospitalUserEducations( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitalUserEducations( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__hospitalUserEducations( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 hospitals = hospitalRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

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
                                    public void findById__hospitals( String fk,  RestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__hospitals( (String)that.getId(), fk,  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                    public void destroyById__hospitals( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__hospitals( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitals( String fk,  Hospital data,  RestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__hospitals( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                    public void get__hospitals( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__hospitals( (String)that.getId(), filter,  new DataListCallback<Hospital> (){
                                            

                                            


                                            
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
                                    public void create__hospitals( Hospital data,  RestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__hospitals( (String)that.getId(), data.convertMap(),  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                    public void delete__hospitals( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__hospitals( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitals( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__hospitals( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                        HospitalUserRepository hospitalUserRepository = (HospitalUserRepository) getRepository();

                                        RestAdapter restAdapter = hospitalUserRepository.getRestAdapter();
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
                            HospitalUserRepository lowercaseFirstLetterRepository = (HospitalUserRepository) getRepository();
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__pincode( (String)that.getId(), refresh,  new ObjectCallback<Pincode> (){
                                            

                                            
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
                                        HospitalUserRepository hospitalUserRepository = (HospitalUserRepository) getRepository();

                                        RestAdapter restAdapter = hospitalUserRepository.getRestAdapter();
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
                            HospitalUserRepository lowercaseFirstLetterRepository = (HospitalUserRepository) getRepository();
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__state( (String)that.getId(), refresh,  new ObjectCallback<State> (){
                                            

                                            
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
                                        HospitalUserRepository hospitalUserRepository = (HospitalUserRepository) getRepository();

                                        RestAdapter restAdapter = hospitalUserRepository.getRestAdapter();
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
                            HospitalUserRepository lowercaseFirstLetterRepository = (HospitalUserRepository) getRepository();
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__taluk( (String)that.getId(), refresh,  new ObjectCallback<Taluk> (){
                                            

                                            
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
                                        HospitalUserRepository hospitalUserRepository = (HospitalUserRepository) getRepository();

                                        RestAdapter restAdapter = hospitalUserRepository.getRestAdapter();
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
                            HospitalUserRepository lowercaseFirstLetterRepository = (HospitalUserRepository) getRepository();
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
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__district( (String)that.getId(), refresh,  new ObjectCallback<District> (){
                                            

                                            
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
                    private transient DataList<ReferPatient>  referPatients ;

                    public DataList< ReferPatient > getReferPatients() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ReferPatientRepository referPatientRepository = (ReferPatientRepository) getRepository();

                            if(that.getId() != null && referPatientRepository.getDb() != null){

                                 //Fetch locally from db
                                 //referPatients = getReferPatients__db(restAdapter);
                                 // Getting single cont
                                 referPatients = referPatientRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return referPatients;
                    }

                    public void setReferPatients(DataList<ReferPatient> referPatients) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: referPatients){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setReferPatients1(hashMaps);
                        }else{
                            this.referPatients = referPatients;
                            //TODO: Warning move this to new thread
                            for(ReferPatient data: referPatients){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setReferPatients1(List<Map<String, Object>> referPatients) {
                        //First create a dummy Repo class object for ..
                        ReferPatientRepository referPatientsRepository = new ReferPatientRepository();
                        List<ReferPatient> result = new ArrayList<>();
                        for (Map<String, Object> obj : referPatients) {
                            //Also add relation to child type for two way communication..
                            ReferPatient obj1 = referPatientsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setReferPatients(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setReferPatients1(DataList<HashMap<String, Object>> referPatients) {
                        //First create a dummy Repo class object for ..
                        ReferPatientRepository referPatientsRepository = new ReferPatientRepository();
                        DataList<ReferPatient> result = new DataList<>();
                        for (HashMap<String, Object> obj : referPatients) {
                            //Also add relation to child type for two way communication..
                            ReferPatient obj1 = referPatientsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setReferPatients(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<ReferPatient> referPatients, ReferPatient dummyClassInstance) {
                        that.setReferPatients(referPatients);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(ReferPatient referPatients) {
                        try{
                            try{

                                  //Save to database..
                                  referPatients.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getReferPatients().add(referPatients);
                        }catch(Exception e){
                            DataList< ReferPatient> referPatients1 = new DataList();
                            //Now add this item to list..
                            referPatients1.add(referPatients);
                            //Now set data....
                            that.setReferPatients(referPatients1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__referPatients( String fk,  RestAdapter restAdapter, final ObjectCallback<ReferPatient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__referPatients( (String)that.getId(), fk,  new ObjectCallback<ReferPatient> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ReferPatient object) {
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
                                    public void destroyById__referPatients( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__referPatients( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__referPatients( String fk,  ReferPatient data,  RestAdapter restAdapter, final ObjectCallback<ReferPatient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__referPatients( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ReferPatient> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ReferPatient object) {
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
                                    public void get__referPatients( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<ReferPatient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__referPatients( (String)that.getId(), filter,  new DataListCallback<ReferPatient> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<ReferPatient> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            ReferPatient obj = new ReferPatient();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (ReferPatient obj : object) {
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
                                    public void create__referPatients( ReferPatient data,  RestAdapter restAdapter, final ObjectCallback<ReferPatient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__referPatients( (String)that.getId(), data.convertMap(),  new ObjectCallback<ReferPatient> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ReferPatient object) {
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
                                    public void delete__referPatients( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__referPatients( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__referPatients( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__referPatients( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<ChatItem>  chatItems ;

                    public DataList< ChatItem > getChatItems() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ChatItemRepository chatItemRepository = (ChatItemRepository) getRepository();

                            if(that.getId() != null && chatItemRepository.getDb() != null){

                                 //Fetch locally from db
                                 //chatItems = getChatItems__db(restAdapter);
                                 // Getting single cont
                                 chatItems = chatItemRepository.getDb().getAll__db("hospitalUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return chatItems;
                    }

                    public void setChatItems(DataList<ChatItem> chatItems) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: chatItems){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setChatItems1(hashMaps);
                        }else{
                            this.chatItems = chatItems;
                            //TODO: Warning move this to new thread
                            for(ChatItem data: chatItems){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChatItems1(List<Map<String, Object>> chatItems) {
                        //First create a dummy Repo class object for ..
                        ChatItemRepository chatItemsRepository = new ChatItemRepository();
                        List<ChatItem> result = new ArrayList<>();
                        for (Map<String, Object> obj : chatItems) {
                            //Also add relation to child type for two way communication..
                            ChatItem obj1 = chatItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChatItems(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChatItems1(DataList<HashMap<String, Object>> chatItems) {
                        //First create a dummy Repo class object for ..
                        ChatItemRepository chatItemsRepository = new ChatItemRepository();
                        DataList<ChatItem> result = new DataList<>();
                        for (HashMap<String, Object> obj : chatItems) {
                            //Also add relation to child type for two way communication..
                            ChatItem obj1 = chatItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChatItems(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<ChatItem> chatItems, ChatItem dummyClassInstance) {
                        that.setChatItems(chatItems);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(ChatItem chatItems) {
                        try{
                            try{

                                  //Save to database..
                                  chatItems.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getChatItems().add(chatItems);
                        }catch(Exception e){
                            DataList< ChatItem> chatItems1 = new DataList();
                            //Now add this item to list..
                            chatItems1.add(chatItems);
                            //Now set data....
                            that.setChatItems(chatItems1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__chatItems( String fk,  RestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.findById__chatItems( (String)that.getId(), fk,  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void destroyById__chatItems( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.destroyById__chatItems( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__chatItems( String fk,  ChatItem data,  RestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.updateById__chatItems( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void get__chatItems( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.get__chatItems( (String)that.getId(), filter,  new DataListCallback<ChatItem> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<ChatItem> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            ChatItem obj = new ChatItem();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (ChatItem obj : object) {
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
                                    public void create__chatItems( ChatItem data,  RestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.create__chatItems( (String)that.getId(), data.convertMap(),  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void delete__chatItems( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        



                                        hospitalUserRepo.delete__chatItems( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__chatItems( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserRepository  hospitalUserRepo = restAdapter.createRepository(HospitalUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserRepo.count__chatItems( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
