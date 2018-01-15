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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SubBillCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
            

        
    


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

                                        RestAdapter restAdapter = billRepository.getRestAdapter();
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
                    public BillCategory getBillCategory__db(RestAdapter restAdapter){
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
                                    public void get__billCategory( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<BillCategory> callback) {
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

                                        RestAdapter restAdapter = billRepository.getRestAdapter();
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
                    public SubBillCategory getSubBillCategory__db(RestAdapter restAdapter){
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
                                    public void get__subBillCategory( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<SubBillCategory> callback) {
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

                                        RestAdapter restAdapter = billRepository.getRestAdapter();
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
                                    public void get__patientGroup( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<PatientGroup> callback) {
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
                                        BillRepository billRepository = (BillRepository) getRepository();

                                        RestAdapter restAdapter = billRepository.getRestAdapter();
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
                            BillRepository lowercaseFirstLetterRepository = (BillRepository) getRepository();
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
                                        final BillRepository  billRepo = restAdapter.createRepository(BillRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billRepo.get__patient( (String)that.getId(), refresh,  new ObjectCallback<Patient> (){
                                            

                                            
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
