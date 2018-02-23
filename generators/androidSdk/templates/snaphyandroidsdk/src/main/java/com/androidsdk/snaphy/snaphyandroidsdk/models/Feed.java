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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.FeedRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientSecurityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StateRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CompanyRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Feed extends Model {


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

    private Feed that ;

    public Feed (){
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

            
            
        
    
        
            

            
                private String title;
                /* Adding Getter and Setter methods */
                public String getTitle(){
                    return title;
                }

                /* Adding Getter and Setter methods */
                public void setTitle(String title){
                    this.title = title;
                    //Update hashMap value..
                    hashMap.put("title", title);
                }

            
            
        
    
        
            

            
                private String subTitle;
                /* Adding Getter and Setter methods */
                public String getSubTitle(){
                    return subTitle;
                }

                /* Adding Getter and Setter methods */
                public void setSubTitle(String subTitle){
                    this.subTitle = subTitle;
                    //Update hashMap value..
                    hashMap.put("subTitle", subTitle);
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

            
            
        
    
        
            

            
                private Map<String, Object> feedImage;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getFeedImage(){
                    return feedImage;
                }

                /* Adding Getter and Setter methods */
                public void setFeedImage(Map<String, Object> feedImage){
                    this.feedImage = feedImage;
                    //Update Map value..
                    hashMap.put("feedImage", feedImage);
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

            
            
        
    
        
            

                private DataList<Map<String, Object>> flagCount;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getFlagCount(){
                    return flagCount;
                }

                /* Adding Getter and Setter methods */
                public void setFlagCount(DataList<Map<String, Object>> flagCount){
                    this.flagCount = flagCount;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("flagCount", flagCount);
                }

            

            
            
        
    
        
            

            
                private String doctorFirstName;
                /* Adding Getter and Setter methods */
                public String getDoctorFirstName(){
                    return doctorFirstName;
                }

                /* Adding Getter and Setter methods */
                public void setDoctorFirstName(String doctorFirstName){
                    this.doctorFirstName = doctorFirstName;
                    //Update hashMap value..
                    hashMap.put("doctorFirstName", doctorFirstName);
                }

            
            
        
    
        
            

            
                private String doctorLastName;
                /* Adding Getter and Setter methods */
                public String getDoctorLastName(){
                    return doctorLastName;
                }

                /* Adding Getter and Setter methods */
                public void setDoctorLastName(String doctorLastName){
                    this.doctorLastName = doctorLastName;
                    //Update hashMap value..
                    hashMap.put("doctorLastName", doctorLastName);
                }

            
            
        
    
        
            

            
                private Map<String, Object> doctorProfilePic;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getDoctorProfilePic(){
                    return doctorProfilePic;
                }

                /* Adding Getter and Setter methods */
                public void setDoctorProfilePic(Map<String, Object> doctorProfilePic){
                    this.doctorProfilePic = doctorProfilePic;
                    //Update Map value..
                    hashMap.put("doctorProfilePic", doctorProfilePic);
                }

            
            
        
    
        
            

            
                private String patientFirstName;
                /* Adding Getter and Setter methods */
                public String getPatientFirstName(){
                    return patientFirstName;
                }

                /* Adding Getter and Setter methods */
                public void setPatientFirstName(String patientFirstName){
                    this.patientFirstName = patientFirstName;
                    //Update hashMap value..
                    hashMap.put("patientFirstName", patientFirstName);
                }

            
            
        
    
        
            

            
                private String patientLastName;
                /* Adding Getter and Setter methods */
                public String getPatientLastName(){
                    return patientLastName;
                }

                /* Adding Getter and Setter methods */
                public void setPatientLastName(String patientLastName){
                    this.patientLastName = patientLastName;
                    //Update hashMap value..
                    hashMap.put("patientLastName", patientLastName);
                }

            
            
        
    
        
            

            
                private Map<String, Object> patientProfilePic;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getPatientProfilePic(){
                    return patientProfilePic;
                }

                /* Adding Getter and Setter methods */
                public void setPatientProfilePic(Map<String, Object> patientProfilePic){
                    this.patientProfilePic = patientProfilePic;
                    //Update Map value..
                    hashMap.put("patientProfilePic", patientProfilePic);
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      FeedRepository lowercaseFirstLetterRepository = (FeedRepository) getRepository();
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
      FeedRepository lowercaseFirstLetterRepository = (FeedRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      FeedRepository lowercaseFirstLetterRepository = (FeedRepository) getRepository();
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
                                        FeedRepository feedRepository = (FeedRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = feedRepository.getRestAdapter();
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
                    public PatientSecurity getPatientSecurity__db(SnaphyRestAdapter restAdapter){
                      if(patientSecurityId != null){
                        PatientSecurityRepository patientSecurityRepository = restAdapter.createRepository(PatientSecurityRepository.class);
                            try{
                            FeedRepository lowercaseFirstLetterRepository = (FeedRepository) getRepository();
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
                                    public void get__patientSecurity( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<PatientSecurity> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FeedRepository  feedRepo = restAdapter.createRepository(FeedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        feedRepo.get__patientSecurity( (String)that.getId(), refresh,  new ObjectCallback<PatientSecurity> (){
                                            

                                            
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
                                        FeedRepository feedRepository = (FeedRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = feedRepository.getRestAdapter();
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
                            FeedRepository lowercaseFirstLetterRepository = (FeedRepository) getRepository();
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
                                        final FeedRepository  feedRepo = restAdapter.createRepository(FeedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        feedRepo.get__state( (String)that.getId(), refresh,  new ObjectCallback<State> (){
                                            

                                            
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
                    private transient Company  company ;
                    private String companyId;

                    public String getCompanyId(){
                         return companyId;
                    }

                    public void setCompanyId(Object companyId){
                        if(companyId != null){
                          this.companyId = companyId.toString();
                        }
                    }

                    public Company getCompany() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(company == null){
                                        FeedRepository feedRepository = (FeedRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = feedRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          company = getCompany__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return company;
                    }

                    public void setCompany(Company company) {
                        this.company = company;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCompany(Map<String, Object> company) {
                        //First create a dummy Repo class object for customer.
                        CompanyRepository companyRepository = new CompanyRepository();
                        Company company1 = companyRepository.createObject(company);
                        setCompany(company1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCompany(HashMap<String, Object> company) {
                        //First create a dummy Repo class object for customer.
                        CompanyRepository companyRepository = new CompanyRepository();
                        Company company1 = companyRepository.createObject(company);
                        setCompany(company1);
                    }

                    //Adding relation method..
                    public void addRelation(Company company) {
                        that.setCompany(company);
                    }


                    //Fetch related data from local database if present a companyId identifier as property for belongsTo
                    public Company getCompany__db(SnaphyRestAdapter restAdapter){
                      if(companyId != null){
                        CompanyRepository companyRepository = restAdapter.createRepository(CompanyRepository.class);
                            try{
                            FeedRepository lowercaseFirstLetterRepository = (FeedRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(companyRepository.getDb() == null ){
                                                    companyRepository.addStorage(context);
                                                }

                                                if(context != null && companyRepository.getDb() != null){
                                                    companyRepository.addStorage(context);
                                                    Company company = (Company) companyRepository.getDb().get__db(companyId);
                                                    return company;
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
                                    public void get__company( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Company> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FeedRepository  feedRepo = restAdapter.createRepository(FeedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        feedRepo.get__company( (String)that.getId(), refresh,  new ObjectCallback<Company> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Company object) {
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
                                        FeedRepository feedRepository = (FeedRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = feedRepository.getRestAdapter();
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
                            FeedRepository lowercaseFirstLetterRepository = (FeedRepository) getRepository();
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
                                        final FeedRepository  feedRepo = restAdapter.createRepository(FeedRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        feedRepo.get__district( (String)that.getId(), refresh,  new ObjectCallback<District> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
