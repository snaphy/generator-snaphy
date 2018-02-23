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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PincodeRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StateRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TalukRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FeedRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Pincode extends Model {


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

    private Pincode that ;

    public Pincode (){
        that = this;
    }

    
        
            

            
                private String number;
                /* Adding Getter and Setter methods */
                public String getNumber(){
                    return number;
                }

                /* Adding Getter and Setter methods */
                public void setNumber(String number){
                    this.number = number;
                    //Update hashMap value..
                    hashMap.put("number", number);
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

            
            
        
    
        
            

            
                private String districtName;
                /* Adding Getter and Setter methods */
                public String getDistrictName(){
                    return districtName;
                }

                /* Adding Getter and Setter methods */
                public void setDistrictName(String districtName){
                    this.districtName = districtName;
                    //Update hashMap value..
                    hashMap.put("districtName", districtName);
                }

            
            
        
    
        
            

            
                private String talukName;
                /* Adding Getter and Setter methods */
                public String getTalukName(){
                    return talukName;
                }

                /* Adding Getter and Setter methods */
                public void setTalukName(String talukName){
                    this.talukName = talukName;
                    //Update hashMap value..
                    hashMap.put("talukName", talukName);
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
      PincodeRepository lowercaseFirstLetterRepository = (PincodeRepository) getRepository();
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
      PincodeRepository lowercaseFirstLetterRepository = (PincodeRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      PincodeRepository lowercaseFirstLetterRepository = (PincodeRepository) getRepository();
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
                                        PincodeRepository pincodeRepository = (PincodeRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = pincodeRepository.getRestAdapter();
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
                    public State getState__db(SnaphyRestAdapter restAdapter){
                      if(stateId != null){
                        StateRepository stateRepository = restAdapter.createRepository(StateRepository.class);
                            try{
                            PincodeRepository lowercaseFirstLetterRepository = (PincodeRepository) getRepository();
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
                                    public void get__state( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<State> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.get__state( (String)that.getId(), refresh,  new ObjectCallback<State> (){
                                            

                                            
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
                                        PincodeRepository pincodeRepository = (PincodeRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = pincodeRepository.getRestAdapter();
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
                    public Taluk getTaluk__db(SnaphyRestAdapter restAdapter){
                      if(talukId != null){
                        TalukRepository talukRepository = restAdapter.createRepository(TalukRepository.class);
                            try{
                            PincodeRepository lowercaseFirstLetterRepository = (PincodeRepository) getRepository();
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
                                    public void get__taluk( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Taluk> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.get__taluk( (String)that.getId(), refresh,  new ObjectCallback<Taluk> (){
                                            

                                            
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
                                 patients = patientRepository.getDb().getAll__db("pincodeId", that.getId().toString());

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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.findById__patients( (String)that.getId(), fk,  new ObjectCallback<Patient> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.destroyById__patients( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.updateById__patients( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Patient> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.get__patients( (String)that.getId(), filter,  new DataListCallback<Patient> (){
                                            

                                            


                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.create__patients( (String)that.getId(), data.convertMap(),  new ObjectCallback<Patient> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        



                                        pincodeRepo.delete__patients( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.count__patients( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 patientGroups = patientGroupRepository.getDb().getAll__db("pincodeId", that.getId().toString());

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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.findById__patientGroups( (String)that.getId(), fk,  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.destroyById__patientGroups( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.updateById__patientGroups( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.get__patientGroups( (String)that.getId(), filter,  new DataListCallback<PatientGroup> (){
                                            

                                            


                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.create__patientGroups( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        



                                        pincodeRepo.delete__patientGroups( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.count__patientGroups( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                        PincodeRepository pincodeRepository = (PincodeRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = pincodeRepository.getRestAdapter();
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
                    public District getDistrict__db(SnaphyRestAdapter restAdapter){
                      if(districtId != null){
                        DistrictRepository districtRepository = restAdapter.createRepository(DistrictRepository.class);
                            try{
                            PincodeRepository lowercaseFirstLetterRepository = (PincodeRepository) getRepository();
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
                                    public void get__district( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<District> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.get__district( (String)that.getId(), refresh,  new ObjectCallback<District> (){
                                            

                                            
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
                                 feeds = feedRepository.getDb().getAll__db("pincodeId", that.getId().toString());

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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.findById__feeds( (String)that.getId(), fk,  new ObjectCallback<Feed> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.destroyById__feeds( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.updateById__feeds( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Feed> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.get__feeds( (String)that.getId(), filter,  new DataListCallback<Feed> (){
                                            

                                            


                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.create__feeds( (String)that.getId(), data.convertMap(),  new ObjectCallback<Feed> (){
                                            

                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        



                                        pincodeRepo.delete__feeds( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final PincodeRepository  pincodeRepo = restAdapter.createRepository(PincodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        pincodeRepo.count__feeds( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
