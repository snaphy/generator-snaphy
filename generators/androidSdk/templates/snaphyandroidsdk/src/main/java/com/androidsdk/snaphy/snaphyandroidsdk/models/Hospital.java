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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserSettingRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientSecurityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PincodeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StateRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TalukRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientDocumentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ReferPatientRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ZoneRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Hospital extends Model {


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

    private Hospital that ;

    public Hospital (){
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

            
            
        
    
        
            

            
                private String typeOfFacility;
                /* Adding Getter and Setter methods */
                public String getTypeOfFacility(){
                    return typeOfFacility;
                }

                /* Adding Getter and Setter methods */
                public void setTypeOfFacility(String typeOfFacility){
                    this.typeOfFacility = typeOfFacility;
                    //Update hashMap value..
                    hashMap.put("typeOfFacility", typeOfFacility);
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

            
            
        
    
        
            

            
                private String hospitalEmail;
                /* Adding Getter and Setter methods */
                public String getHospitalEmail(){
                    return hospitalEmail;
                }

                /* Adding Getter and Setter methods */
                public void setHospitalEmail(String hospitalEmail){
                    this.hospitalEmail = hospitalEmail;
                    //Update hashMap value..
                    hashMap.put("hospitalEmail", hospitalEmail);
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

            
            
        
    
        
            

            
                private Map<String, Object> address;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getAddress(){
                    return address;
                }

                /* Adding Getter and Setter methods */
                public void setAddress(Map<String, Object> address){
                    this.address = address;
                    //Update Map value..
                    hashMap.put("address", address);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();
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
      HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();
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
                                 patientGroups = patientGroupRepository.getDb().getAll__db("hospitalId", that.getId().toString());

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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.findById__patientGroups( (String)that.getId(), fk,  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.destroyById__patientGroups( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.updateById__patientGroups( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__patientGroups( (String)that.getId(), filter,  new DataListCallback<PatientGroup> (){
                                            

                                            


                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.create__patientGroups( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        



                                        hospitalRepo.delete__patientGroups( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.count__patientGroups( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 hospitalUserSettings = hospitalUserSettingRepository.getDb().getAll__db("hospitalId", that.getId().toString());

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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.findById__hospitalUserSettings( (String)that.getId(), fk,  new ObjectCallback<HospitalUserSetting> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.destroyById__hospitalUserSettings( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.updateById__hospitalUserSettings( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HospitalUserSetting> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__hospitalUserSettings( (String)that.getId(), filter,  new DataListCallback<HospitalUserSetting> (){
                                            

                                            


                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.create__hospitalUserSettings( (String)that.getId(), data.convertMap(),  new ObjectCallback<HospitalUserSetting> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        



                                        hospitalRepo.delete__hospitalUserSettings( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.count__hospitalUserSettings( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 patientSecurities = patientSecurityRepository.getDb().getAll__db("hospitalId", that.getId().toString());

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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.findById__patientSecurities( (String)that.getId(), fk,  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.destroyById__patientSecurities( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.updateById__patientSecurities( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__patientSecurities( (String)that.getId(), filter,  new DataListCallback<PatientSecurity> (){
                                            

                                            


                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.create__patientSecurities( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        



                                        hospitalRepo.delete__patientSecurities( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.count__patientSecurities( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                        HospitalRepository hospitalRepository = (HospitalRepository) getRepository();

                                        RestAdapter restAdapter = hospitalRepository.getRestAdapter();
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
                    public HospitalUser getHospitalUser__db(RestAdapter restAdapter){
                      if(hospitalUserId != null){
                        HospitalUserRepository hospitalUserRepository = restAdapter.createRepository(HospitalUserRepository.class);
                            try{
                            HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();
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
                                    public void get__hospitalUser( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__hospitalUser( (String)that.getId(), refresh,  new ObjectCallback<HospitalUser> (){
                                            

                                            
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
                                        HospitalRepository hospitalRepository = (HospitalRepository) getRepository();

                                        RestAdapter restAdapter = hospitalRepository.getRestAdapter();
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
                            HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__pincode( (String)that.getId(), refresh,  new ObjectCallback<Pincode> (){
                                            

                                            
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
                                        HospitalRepository hospitalRepository = (HospitalRepository) getRepository();

                                        RestAdapter restAdapter = hospitalRepository.getRestAdapter();
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
                            HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__state( (String)that.getId(), refresh,  new ObjectCallback<State> (){
                                            

                                            
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
                                        HospitalRepository hospitalRepository = (HospitalRepository) getRepository();

                                        RestAdapter restAdapter = hospitalRepository.getRestAdapter();
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
                            HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__taluk( (String)that.getId(), refresh,  new ObjectCallback<Taluk> (){
                                            

                                            
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
                                        HospitalRepository hospitalRepository = (HospitalRepository) getRepository();

                                        RestAdapter restAdapter = hospitalRepository.getRestAdapter();
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
                            HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__district( (String)that.getId(), refresh,  new ObjectCallback<District> (){
                                            

                                            
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
                                 patientDocuments = patientDocumentRepository.getDb().getAll__db("hospitalId", that.getId().toString());

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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.findById__patientDocuments( (String)that.getId(), fk,  new ObjectCallback<PatientDocument> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.destroyById__patientDocuments( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.updateById__patientDocuments( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientDocument> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__patientDocuments( (String)that.getId(), filter,  new DataListCallback<PatientDocument> (){
                                            

                                            


                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.create__patientDocuments( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientDocument> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        



                                        hospitalRepo.delete__patientDocuments( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.count__patientDocuments( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<IpdCategory>  ipdCategories ;

                    public DataList< IpdCategory > getIpdCategories() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            IpdCategoryRepository ipdCategoryRepository = (IpdCategoryRepository) getRepository();

                            if(that.getId() != null && ipdCategoryRepository.getDb() != null){

                                 //Fetch locally from db
                                 //ipdCategories = getIpdCategories__db(restAdapter);
                                 // Getting single cont
                                 ipdCategories = ipdCategoryRepository.getDb().getAll__db("hospitalId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return ipdCategories;
                    }

                    public void setIpdCategories(DataList<IpdCategory> ipdCategories) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: ipdCategories){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setIpdCategories1(hashMaps);
                        }else{
                            this.ipdCategories = ipdCategories;
                            //TODO: Warning move this to new thread
                            for(IpdCategory data: ipdCategories){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setIpdCategories1(List<Map<String, Object>> ipdCategories) {
                        //First create a dummy Repo class object for ..
                        IpdCategoryRepository ipdCategoriesRepository = new IpdCategoryRepository();
                        List<IpdCategory> result = new ArrayList<>();
                        for (Map<String, Object> obj : ipdCategories) {
                            //Also add relation to child type for two way communication..
                            IpdCategory obj1 = ipdCategoriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setIpdCategories(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setIpdCategories1(DataList<HashMap<String, Object>> ipdCategories) {
                        //First create a dummy Repo class object for ..
                        IpdCategoryRepository ipdCategoriesRepository = new IpdCategoryRepository();
                        DataList<IpdCategory> result = new DataList<>();
                        for (HashMap<String, Object> obj : ipdCategories) {
                            //Also add relation to child type for two way communication..
                            IpdCategory obj1 = ipdCategoriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setIpdCategories(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<IpdCategory> ipdCategories, IpdCategory dummyClassInstance) {
                        that.setIpdCategories(ipdCategories);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(IpdCategory ipdCategories) {
                        try{
                            try{

                                  //Save to database..
                                  ipdCategories.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getIpdCategories().add(ipdCategories);
                        }catch(Exception e){
                            DataList< IpdCategory> ipdCategories1 = new DataList();
                            //Now add this item to list..
                            ipdCategories1.add(ipdCategories);
                            //Now set data....
                            that.setIpdCategories(ipdCategories1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__ipdCategories( String fk,  RestAdapter restAdapter, final ObjectCallback<IpdCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.findById__ipdCategories( (String)that.getId(), fk,  new ObjectCallback<IpdCategory> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__ipdCategories( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.destroyById__ipdCategories( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__ipdCategories( String fk,  IpdCategory data,  RestAdapter restAdapter, final ObjectCallback<IpdCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.updateById__ipdCategories( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<IpdCategory> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__ipdCategories( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<IpdCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__ipdCategories( (String)that.getId(), filter,  new DataListCallback<IpdCategory> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<IpdCategory> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            IpdCategory obj = new IpdCategory();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (IpdCategory obj : object) {
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
                                    public void create__ipdCategories( IpdCategory data,  RestAdapter restAdapter, final ObjectCallback<IpdCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.create__ipdCategories( (String)that.getId(), data.convertMap(),  new ObjectCallback<IpdCategory> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__ipdCategories( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        



                                        hospitalRepo.delete__ipdCategories( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__ipdCategories( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.count__ipdCategories( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<BillCategory>  billCategories ;

                    public DataList< BillCategory > getBillCategories() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            BillCategoryRepository billCategoryRepository = (BillCategoryRepository) getRepository();

                            if(that.getId() != null && billCategoryRepository.getDb() != null){

                                 //Fetch locally from db
                                 //billCategories = getBillCategories__db(restAdapter);
                                 // Getting single cont
                                 billCategories = billCategoryRepository.getDb().getAll__db("hospitalId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return billCategories;
                    }

                    public void setBillCategories(DataList<BillCategory> billCategories) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: billCategories){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setBillCategories1(hashMaps);
                        }else{
                            this.billCategories = billCategories;
                            //TODO: Warning move this to new thread
                            for(BillCategory data: billCategories){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBillCategories1(List<Map<String, Object>> billCategories) {
                        //First create a dummy Repo class object for ..
                        BillCategoryRepository billCategoriesRepository = new BillCategoryRepository();
                        List<BillCategory> result = new ArrayList<>();
                        for (Map<String, Object> obj : billCategories) {
                            //Also add relation to child type for two way communication..
                            BillCategory obj1 = billCategoriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBillCategories(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBillCategories1(DataList<HashMap<String, Object>> billCategories) {
                        //First create a dummy Repo class object for ..
                        BillCategoryRepository billCategoriesRepository = new BillCategoryRepository();
                        DataList<BillCategory> result = new DataList<>();
                        for (HashMap<String, Object> obj : billCategories) {
                            //Also add relation to child type for two way communication..
                            BillCategory obj1 = billCategoriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBillCategories(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<BillCategory> billCategories, BillCategory dummyClassInstance) {
                        that.setBillCategories(billCategories);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(BillCategory billCategories) {
                        try{
                            try{

                                  //Save to database..
                                  billCategories.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getBillCategories().add(billCategories);
                        }catch(Exception e){
                            DataList< BillCategory> billCategories1 = new DataList();
                            //Now add this item to list..
                            billCategories1.add(billCategories);
                            //Now set data....
                            that.setBillCategories(billCategories1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__billCategories( String fk,  RestAdapter restAdapter, final ObjectCallback<BillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.findById__billCategories( (String)that.getId(), fk,  new ObjectCallback<BillCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BillCategory object) {
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
                                    public void destroyById__billCategories( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.destroyById__billCategories( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__billCategories( String fk,  BillCategory data,  RestAdapter restAdapter, final ObjectCallback<BillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.updateById__billCategories( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<BillCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BillCategory object) {
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
                                    public void get__billCategories( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<BillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__billCategories( (String)that.getId(), filter,  new DataListCallback<BillCategory> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<BillCategory> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            BillCategory obj = new BillCategory();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (BillCategory obj : object) {
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
                                    public void create__billCategories( BillCategory data,  RestAdapter restAdapter, final ObjectCallback<BillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.create__billCategories( (String)that.getId(), data.convertMap(),  new ObjectCallback<BillCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BillCategory object) {
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
                                    public void delete__billCategories( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        



                                        hospitalRepo.delete__billCategories( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__billCategories( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.count__billCategories( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 referPatients = referPatientRepository.getDb().getAll__db("hospitalId", that.getId().toString());

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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.findById__referPatients( (String)that.getId(), fk,  new ObjectCallback<ReferPatient> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.destroyById__referPatients( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.updateById__referPatients( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ReferPatient> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__referPatients( (String)that.getId(), filter,  new DataListCallback<ReferPatient> (){
                                            

                                            


                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.create__referPatients( (String)that.getId(), data.convertMap(),  new ObjectCallback<ReferPatient> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        



                                        hospitalRepo.delete__referPatients( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.count__referPatients( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient Zone  zone ;
                    private String zoneId;

                    public String getZoneId(){
                         return zoneId;
                    }

                    public void setZoneId(Object zoneId){
                        if(zoneId != null){
                          this.zoneId = zoneId.toString();
                        }
                    }

                    public Zone getZone() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(zone == null){
                                        HospitalRepository hospitalRepository = (HospitalRepository) getRepository();

                                        RestAdapter restAdapter = hospitalRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          zone = getZone__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return zone;
                    }

                    public void setZone(Zone zone) {
                        this.zone = zone;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setZone(Map<String, Object> zone) {
                        //First create a dummy Repo class object for customer.
                        ZoneRepository zoneRepository = new ZoneRepository();
                        Zone zone1 = zoneRepository.createObject(zone);
                        setZone(zone1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setZone(HashMap<String, Object> zone) {
                        //First create a dummy Repo class object for customer.
                        ZoneRepository zoneRepository = new ZoneRepository();
                        Zone zone1 = zoneRepository.createObject(zone);
                        setZone(zone1);
                    }

                    //Adding relation method..
                    public void addRelation(Zone zone) {
                        that.setZone(zone);
                    }


                    //Fetch related data from local database if present a zoneId identifier as property for belongsTo
                    public Zone getZone__db(RestAdapter restAdapter){
                      if(zoneId != null){
                        ZoneRepository zoneRepository = restAdapter.createRepository(ZoneRepository.class);
                            try{
                            HospitalRepository lowercaseFirstLetterRepository = (HospitalRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(zoneRepository.getDb() == null ){
                                                    zoneRepository.addStorage(context);
                                                }

                                                if(context != null && zoneRepository.getDb() != null){
                                                    zoneRepository.addStorage(context);
                                                    Zone zone = (Zone) zoneRepository.getDb().get__db(zoneId);
                                                    return zone;
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
                                    public void get__zone( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Zone> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__zone( (String)that.getId(), refresh,  new ObjectCallback<Zone> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Zone object) {
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
                                 bills = billRepository.getDb().getAll__db("hospitalId", that.getId().toString());

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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.findById__bills( (String)that.getId(), fk,  new ObjectCallback<Bill> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.destroyById__bills( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.updateById__bills( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.get__bills( (String)that.getId(), filter,  new DataListCallback<Bill> (){
                                            

                                            


                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.create__bills( (String)that.getId(), data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        



                                        hospitalRepo.delete__bills( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final HospitalRepository  hospitalRepo = restAdapter.createRepository(HospitalRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalRepo.count__bills( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
