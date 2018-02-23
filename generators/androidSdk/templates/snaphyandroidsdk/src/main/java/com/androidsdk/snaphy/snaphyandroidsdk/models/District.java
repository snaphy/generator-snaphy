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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PincodeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FeedRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class District extends Model {


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

    private District that ;

    public District (){
        that = this;
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
      DistrictRepository lowercaseFirstLetterRepository = (DistrictRepository) getRepository();
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
      DistrictRepository lowercaseFirstLetterRepository = (DistrictRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      DistrictRepository lowercaseFirstLetterRepository = (DistrictRepository) getRepository();
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
                                 hospitals = hospitalRepository.getDb().getAll__db("districtId", that.getId().toString());

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
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.findById__hospitals( (String)that.getId(), fk,  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.destroyById__hospitals( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.updateById__hospitals( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.get__hospitals( (String)that.getId(), filter,  new DataListCallback<Hospital> (){
                                            

                                            


                                            
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
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.create__hospitals( (String)that.getId(), data.convertMap(),  new ObjectCallback<Hospital> (){
                                            

                                            
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
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        



                                        districtRepo.delete__hospitals( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.count__hospitals( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Patient>  patients ;

                    public DataList< Patient > getPatients() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PatientRepository patientRepository = (PatientRepository) getRepository();

                            if(that.getId() != null && patientRepository.getDb() != null){

                                 //Fetch locally from db
                                 //patients = getPatients__db(restAdapter);
                                 // Getting single cont
                                 patients = patientRepository.getDb().getAll__db("districtId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return patients;
                    }

                    public void setPatients(DataList<Patient> patients) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: patients){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPatients1(hashMaps);
                        }else{
                            this.patients = patients;
                            //TODO: Warning move this to new thread
                            for(Patient data: patients){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatients1(List<Map<String, Object>> patients) {
                        //First create a dummy Repo class object for ..
                        PatientRepository patientsRepository = new PatientRepository();
                        List<Patient> result = new ArrayList<>();
                        for (Map<String, Object> obj : patients) {
                            //Also add relation to child type for two way communication..
                            Patient obj1 = patientsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatients(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatients1(DataList<HashMap<String, Object>> patients) {
                        //First create a dummy Repo class object for ..
                        PatientRepository patientsRepository = new PatientRepository();
                        DataList<Patient> result = new DataList<>();
                        for (HashMap<String, Object> obj : patients) {
                            //Also add relation to child type for two way communication..
                            Patient obj1 = patientsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatients(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Patient> patients, Patient dummyClassInstance) {
                        that.setPatients(patients);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Patient patients) {
                        try{
                            try{

                                  //Save to database..
                                  patients.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPatients().add(patients);
                        }catch(Exception e){
                            DataList< Patient> patients1 = new DataList();
                            //Now add this item to list..
                            patients1.add(patients);
                            //Now set data....
                            that.setPatients(patients1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__patients( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Patient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.findById__patients( (String)that.getId(), fk,  new ObjectCallback<Patient> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__patients( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.destroyById__patients( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__patients( String fk,  Patient data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Patient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.updateById__patients( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Patient> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__patients( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Patient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.get__patients( (String)that.getId(), filter,  new DataListCallback<Patient> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Patient> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Patient obj = new Patient();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Patient obj : object) {
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
                                    public void create__patients( Patient data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Patient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.create__patients( (String)that.getId(), data.convertMap(),  new ObjectCallback<Patient> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__patients( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        



                                        districtRepo.delete__patients( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__patients( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.count__patients( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<HospitalUser>  hospitalUsers ;

                    public DataList< HospitalUser > getHospitalUsers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HospitalUserRepository hospitalUserRepository = (HospitalUserRepository) getRepository();

                            if(that.getId() != null && hospitalUserRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hospitalUsers = getHospitalUsers__db(restAdapter);
                                 // Getting single cont
                                 hospitalUsers = hospitalUserRepository.getDb().getAll__db("districtId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return hospitalUsers;
                    }

                    public void setHospitalUsers(DataList<HospitalUser> hospitalUsers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hospitalUsers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHospitalUsers1(hashMaps);
                        }else{
                            this.hospitalUsers = hospitalUsers;
                            //TODO: Warning move this to new thread
                            for(HospitalUser data: hospitalUsers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUsers1(List<Map<String, Object>> hospitalUsers) {
                        //First create a dummy Repo class object for ..
                        HospitalUserRepository hospitalUsersRepository = new HospitalUserRepository();
                        List<HospitalUser> result = new ArrayList<>();
                        for (Map<String, Object> obj : hospitalUsers) {
                            //Also add relation to child type for two way communication..
                            HospitalUser obj1 = hospitalUsersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUsers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUsers1(DataList<HashMap<String, Object>> hospitalUsers) {
                        //First create a dummy Repo class object for ..
                        HospitalUserRepository hospitalUsersRepository = new HospitalUserRepository();
                        DataList<HospitalUser> result = new DataList<>();
                        for (HashMap<String, Object> obj : hospitalUsers) {
                            //Also add relation to child type for two way communication..
                            HospitalUser obj1 = hospitalUsersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUsers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HospitalUser> hospitalUsers, HospitalUser dummyClassInstance) {
                        that.setHospitalUsers(hospitalUsers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HospitalUser hospitalUsers) {
                        try{
                            try{

                                  //Save to database..
                                  hospitalUsers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHospitalUsers().add(hospitalUsers);
                        }catch(Exception e){
                            DataList< HospitalUser> hospitalUsers1 = new DataList();
                            //Now add this item to list..
                            hospitalUsers1.add(hospitalUsers);
                            //Now set data....
                            that.setHospitalUsers(hospitalUsers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__hospitalUsers( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.findById__hospitalUsers( (String)that.getId(), fk,  new ObjectCallback<HospitalUser> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__hospitalUsers( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.destroyById__hospitalUsers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitalUsers( String fk,  HospitalUser data,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.updateById__hospitalUsers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HospitalUser> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__hospitalUsers( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.get__hospitalUsers( (String)that.getId(), filter,  new DataListCallback<HospitalUser> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HospitalUser> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HospitalUser obj = new HospitalUser();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HospitalUser obj : object) {
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
                                    public void create__hospitalUsers( HospitalUser data,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.create__hospitalUsers( (String)that.getId(), data.convertMap(),  new ObjectCallback<HospitalUser> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__hospitalUsers( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        



                                        districtRepo.delete__hospitalUsers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitalUsers( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.count__hospitalUsers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Pincode>  pincodes ;

                    public DataList< Pincode > getPincodes() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PincodeRepository pincodeRepository = (PincodeRepository) getRepository();

                            if(that.getId() != null && pincodeRepository.getDb() != null){

                                 //Fetch locally from db
                                 //pincodes = getPincodes__db(restAdapter);
                                 // Getting single cont
                                 pincodes = pincodeRepository.getDb().getAll__db("districtId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return pincodes;
                    }

                    public void setPincodes(DataList<Pincode> pincodes) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: pincodes){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPincodes1(hashMaps);
                        }else{
                            this.pincodes = pincodes;
                            //TODO: Warning move this to new thread
                            for(Pincode data: pincodes){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPincodes1(List<Map<String, Object>> pincodes) {
                        //First create a dummy Repo class object for ..
                        PincodeRepository pincodesRepository = new PincodeRepository();
                        List<Pincode> result = new ArrayList<>();
                        for (Map<String, Object> obj : pincodes) {
                            //Also add relation to child type for two way communication..
                            Pincode obj1 = pincodesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPincodes(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPincodes1(DataList<HashMap<String, Object>> pincodes) {
                        //First create a dummy Repo class object for ..
                        PincodeRepository pincodesRepository = new PincodeRepository();
                        DataList<Pincode> result = new DataList<>();
                        for (HashMap<String, Object> obj : pincodes) {
                            //Also add relation to child type for two way communication..
                            Pincode obj1 = pincodesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPincodes(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Pincode> pincodes, Pincode dummyClassInstance) {
                        that.setPincodes(pincodes);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Pincode pincodes) {
                        try{
                            try{

                                  //Save to database..
                                  pincodes.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPincodes().add(pincodes);
                        }catch(Exception e){
                            DataList< Pincode> pincodes1 = new DataList();
                            //Now add this item to list..
                            pincodes1.add(pincodes);
                            //Now set data....
                            that.setPincodes(pincodes1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__pincodes( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Pincode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.findById__pincodes( (String)that.getId(), fk,  new ObjectCallback<Pincode> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__pincodes( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.destroyById__pincodes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__pincodes( String fk,  Pincode data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Pincode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.updateById__pincodes( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Pincode> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__pincodes( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Pincode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.get__pincodes( (String)that.getId(), filter,  new DataListCallback<Pincode> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Pincode> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Pincode obj = new Pincode();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Pincode obj : object) {
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
                                    public void create__pincodes( Pincode data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Pincode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.create__pincodes( (String)that.getId(), data.convertMap(),  new ObjectCallback<Pincode> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__pincodes( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        



                                        districtRepo.delete__pincodes( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__pincodes( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.count__pincodes( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Feed>  feeds ;

                    public DataList< Feed > getFeeds() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            FeedRepository feedRepository = (FeedRepository) getRepository();

                            if(that.getId() != null && feedRepository.getDb() != null){

                                 //Fetch locally from db
                                 //feeds = getFeeds__db(restAdapter);
                                 // Getting single cont
                                 feeds = feedRepository.getDb().getAll__db("districtId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return feeds;
                    }

                    public void setFeeds(DataList<Feed> feeds) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: feeds){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setFeeds1(hashMaps);
                        }else{
                            this.feeds = feeds;
                            //TODO: Warning move this to new thread
                            for(Feed data: feeds){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setFeeds1(List<Map<String, Object>> feeds) {
                        //First create a dummy Repo class object for ..
                        FeedRepository feedsRepository = new FeedRepository();
                        List<Feed> result = new ArrayList<>();
                        for (Map<String, Object> obj : feeds) {
                            //Also add relation to child type for two way communication..
                            Feed obj1 = feedsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setFeeds(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setFeeds1(DataList<HashMap<String, Object>> feeds) {
                        //First create a dummy Repo class object for ..
                        FeedRepository feedsRepository = new FeedRepository();
                        DataList<Feed> result = new DataList<>();
                        for (HashMap<String, Object> obj : feeds) {
                            //Also add relation to child type for two way communication..
                            Feed obj1 = feedsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setFeeds(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Feed> feeds, Feed dummyClassInstance) {
                        that.setFeeds(feeds);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Feed feeds) {
                        try{
                            try{

                                  //Save to database..
                                  feeds.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getFeeds().add(feeds);
                        }catch(Exception e){
                            DataList< Feed> feeds1 = new DataList();
                            //Now add this item to list..
                            feeds1.add(feeds);
                            //Now set data....
                            that.setFeeds(feeds1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__feeds( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Feed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.findById__feeds( (String)that.getId(), fk,  new ObjectCallback<Feed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Feed object) {
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
                                    public void destroyById__feeds( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.destroyById__feeds( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__feeds( String fk,  Feed data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Feed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.updateById__feeds( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Feed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Feed object) {
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
                                    public void get__feeds( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Feed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.get__feeds( (String)that.getId(), filter,  new DataListCallback<Feed> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Feed> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Feed obj = new Feed();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Feed obj : object) {
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
                                    public void create__feeds( Feed data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Feed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.create__feeds( (String)that.getId(), data.convertMap(),  new ObjectCallback<Feed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Feed object) {
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
                                    public void delete__feeds( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        



                                        districtRepo.delete__feeds( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__feeds( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.count__feeds( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 patientGroups = patientGroupRepository.getDb().getAll__db("districtId", that.getId().toString());

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
                                    public void findById__patientGroups( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.findById__patientGroups( (String)that.getId(), fk,  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                    public void destroyById__patientGroups( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.destroyById__patientGroups( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__patientGroups( String fk,  PatientGroup data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.updateById__patientGroups( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                    public void get__patientGroups( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.get__patientGroups( (String)that.getId(), filter,  new DataListCallback<PatientGroup> (){
                                            

                                            


                                            
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
                                    public void create__patientGroups( PatientGroup data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.create__patientGroups( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                    public void delete__patientGroups( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        



                                        districtRepo.delete__patientGroups( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__patientGroups( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DistrictRepository  districtRepo = restAdapter.createRepository(DistrictRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        districtRepo.count__patientGroups( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
