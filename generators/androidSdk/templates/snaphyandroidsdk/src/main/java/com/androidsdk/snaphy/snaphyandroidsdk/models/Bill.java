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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SubBillCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Bill extends Model {


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

    private Bill that ;

    public Bill (){
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

            
            
        
    
        
            

            
                private String subBillCategoryName;
                /* Adding Getter and Setter methods */
                public String getSubBillCategoryName(){
                    return subBillCategoryName;
                }

                /* Adding Getter and Setter methods */
                public void setSubBillCategoryName(String subBillCategoryName){
                    this.subBillCategoryName = subBillCategoryName;
                    //Update hashMap value..
                    hashMap.put("subBillCategoryName", subBillCategoryName);
                }

            
            
        
    
        
            

            
                private String facility;
                /* Adding Getter and Setter methods */
                public String getFacility(){
                    return facility;
                }

                /* Adding Getter and Setter methods */
                public void setFacility(String facility){
                    this.facility = facility;
                    //Update hashMap value..
                    hashMap.put("facility", facility);
                }

            
            
        
    
        
            

            
                private double amount;
                /* Adding Getter and Setter methods */
                public double getAmount(){
                    return amount;
                }

                /* Adding Getter and Setter methods */
                public void setAmount(double amount){
                    this.amount = amount;
                    //Update hashMap value..
                    hashMap.put("amount", amount);
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

            
            
        
    
        
            

            
                private String loggedInUser;
                /* Adding Getter and Setter methods */
                public String getLoggedInUser(){
                    return loggedInUser;
                }

                /* Adding Getter and Setter methods */
                public void setLoggedInUser(String loggedInUser){
                    this.loggedInUser = loggedInUser;
                    //Update hashMap value..
                    hashMap.put("loggedInUser", loggedInUser);
                }

            
            
        
    
        
            

            
                private String loggedInUserName;
                /* Adding Getter and Setter methods */
                public String getLoggedInUserName(){
                    return loggedInUserName;
                }

                /* Adding Getter and Setter methods */
                public void setLoggedInUserName(String loggedInUserName){
                    this.loggedInUserName = loggedInUserName;
                    //Update hashMap value..
                    hashMap.put("loggedInUserName", loggedInUserName);
                }

            
            
        
    
        
            

            
                private Map<String, Object> loggedInUserProfilePic;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getLoggedInUserProfilePic(){
                    return loggedInUserProfilePic;
                }

                /* Adding Getter and Setter methods */
                public void setLoggedInUserProfilePic(Map<String, Object> loggedInUserProfilePic){
                    this.loggedInUserProfilePic = loggedInUserProfilePic;
                    //Update Map value..
                    hashMap.put("loggedInUserProfilePic", loggedInUserProfilePic);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();
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
      BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();
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
                    private transient BillCategory  billCategory ;
                    private String billCategoryId;

                    public String getBillCategoryId(){
                         return billCategoryId;
                    }

                    public void setBillCategoryId(Object billCategoryId){
                        if(billCategoryId != null){
                          this.billCategoryId = billCategoryId.toString();
                        }
                    }

                    public BillCategory getBillCategory() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(billCategory == null){
                                        BillRepository billRepository = (BillRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = billRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          billCategory = getBillCategory__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return billCategory;
                    }

                    public void setBillCategory(BillCategory billCategory) {
                        this.billCategory = billCategory;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBillCategory(Map<String, Object> billCategory) {
                        //First create a dummy Repo class object for customer.
                        BillCategoryRepository billCategoryRepository = new BillCategoryRepository();
                        BillCategory billCategory1 = billCategoryRepository.createObject(billCategory);
                        setBillCategory(billCategory1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBillCategory(HashMap<String, Object> billCategory) {
                        //First create a dummy Repo class object for customer.
                        BillCategoryRepository billCategoryRepository = new BillCategoryRepository();
                        BillCategory billCategory1 = billCategoryRepository.createObject(billCategory);
                        setBillCategory(billCategory1);
                    }

                    //Adding relation method..
                    public void addRelation(BillCategory billCategory) {
                        that.setBillCategory(billCategory);
                    }


                    //Fetch related data from local database if present a billCategoryId identifier as property for belongsTo
                    public BillCategory getBillCategory__db(SnaphyRestAdapter restAdapter){
                      if(billCategoryId != null){
                        BillCategoryRepository billCategoryRepository = restAdapter.createRepository(BillCategoryRepository.class);
                            try{
                            BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(billCategoryRepository.getDb() == null ){
                                                    billCategoryRepository.addStorage(context);
                                                }

                                                if(context != null && billCategoryRepository.getDb() != null){
                                                    billCategoryRepository.addStorage(context);
                                                    BillCategory billCategory = (BillCategory) billCategoryRepository.getDb().get__db(billCategoryId);
                                                    return billCategory;
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
                                    public void get__billCategory( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<BillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillRepository  billRepo = restAdapter.createRepository(BillRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billRepo.get__billCategory( (String)that.getId(), refresh,  new ObjectCallback<BillCategory> (){
                                            

                                            
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
                                 
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient SubBillCategory  subBillCategory ;
                    private String subBillCategoryId;

                    public String getSubBillCategoryId(){
                         return subBillCategoryId;
                    }

                    public void setSubBillCategoryId(Object subBillCategoryId){
                        if(subBillCategoryId != null){
                          this.subBillCategoryId = subBillCategoryId.toString();
                        }
                    }

                    public SubBillCategory getSubBillCategory() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(subBillCategory == null){
                                        BillRepository billRepository = (BillRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = billRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          subBillCategory = getSubBillCategory__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return subBillCategory;
                    }

                    public void setSubBillCategory(SubBillCategory subBillCategory) {
                        this.subBillCategory = subBillCategory;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSubBillCategory(Map<String, Object> subBillCategory) {
                        //First create a dummy Repo class object for customer.
                        SubBillCategoryRepository subBillCategoryRepository = new SubBillCategoryRepository();
                        SubBillCategory subBillCategory1 = subBillCategoryRepository.createObject(subBillCategory);
                        setSubBillCategory(subBillCategory1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSubBillCategory(HashMap<String, Object> subBillCategory) {
                        //First create a dummy Repo class object for customer.
                        SubBillCategoryRepository subBillCategoryRepository = new SubBillCategoryRepository();
                        SubBillCategory subBillCategory1 = subBillCategoryRepository.createObject(subBillCategory);
                        setSubBillCategory(subBillCategory1);
                    }

                    //Adding relation method..
                    public void addRelation(SubBillCategory subBillCategory) {
                        that.setSubBillCategory(subBillCategory);
                    }


                    //Fetch related data from local database if present a subBillCategoryId identifier as property for belongsTo
                    public SubBillCategory getSubBillCategory__db(SnaphyRestAdapter restAdapter){
                      if(subBillCategoryId != null){
                        SubBillCategoryRepository subBillCategoryRepository = restAdapter.createRepository(SubBillCategoryRepository.class);
                            try{
                            BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(subBillCategoryRepository.getDb() == null ){
                                                    subBillCategoryRepository.addStorage(context);
                                                }

                                                if(context != null && subBillCategoryRepository.getDb() != null){
                                                    subBillCategoryRepository.addStorage(context);
                                                    SubBillCategory subBillCategory = (SubBillCategory) subBillCategoryRepository.getDb().get__db(subBillCategoryId);
                                                    return subBillCategory;
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
                                    public void get__subBillCategory( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<SubBillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillRepository  billRepo = restAdapter.createRepository(BillRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billRepo.get__subBillCategory( (String)that.getId(), refresh,  new ObjectCallback<SubBillCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SubBillCategory object) {
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
                                        BillRepository billRepository = (BillRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = billRepository.getRestAdapter();
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
                    public PatientGroup getPatientGroup__db(SnaphyRestAdapter restAdapter){
                      if(patientGroupId != null){
                        PatientGroupRepository patientGroupRepository = restAdapter.createRepository(PatientGroupRepository.class);
                            try{
                            BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();
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
                                    public void get__patientGroup( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillRepository  billRepo = restAdapter.createRepository(BillRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billRepo.get__patientGroup( (String)that.getId(), refresh,  new ObjectCallback<PatientGroup> (){
                                            

                                            
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
                                        BillRepository billRepository = (BillRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = billRepository.getRestAdapter();
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
                    public HospitalUser getHospitalUser__db(SnaphyRestAdapter restAdapter){
                      if(hospitalUserId != null){
                        HospitalUserRepository hospitalUserRepository = restAdapter.createRepository(HospitalUserRepository.class);
                            try{
                            BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();
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
                                    public void get__hospitalUser( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillRepository  billRepo = restAdapter.createRepository(BillRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billRepo.get__hospitalUser( (String)that.getId(), refresh,  new ObjectCallback<HospitalUser> (){
                                            

                                            
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
                                        BillRepository billRepository = (BillRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = billRepository.getRestAdapter();
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
                    public Hospital getHospital__db(SnaphyRestAdapter restAdapter){
                      if(hospitalId != null){
                        HospitalRepository hospitalRepository = restAdapter.createRepository(HospitalRepository.class);
                            try{
                            BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();
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
                                    public void get__hospital( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillRepository  billRepo = restAdapter.createRepository(BillRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billRepo.get__hospital( (String)that.getId(), refresh,  new ObjectCallback<Hospital> (){
                                            

                                            
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
