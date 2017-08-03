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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.EarningHistoryRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QrCodeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RetailerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DepartmentRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class EarningHistory extends Model {


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

    private EarningHistory that ;

    public EarningHistory (){
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

            
            
        
    
        
            

            
                private String reasonForFailure;
                /* Adding Getter and Setter methods */
                public String getReasonForFailure(){
                    return reasonForFailure;
                }

                /* Adding Getter and Setter methods */
                public void setReasonForFailure(String reasonForFailure){
                    this.reasonForFailure = reasonForFailure;
                    //Update hashMap value..
                    hashMap.put("reasonForFailure", reasonForFailure);
                }

            
            
        
    
        
            

            
                private String earning_history_number;
                /* Adding Getter and Setter methods */
                public String getEarning_history_number(){
                    return earning_history_number;
                }

                /* Adding Getter and Setter methods */
                public void setEarning_history_number(String earning_history_number){
                    this.earning_history_number = earning_history_number;
                    //Update hashMap value..
                    hashMap.put("earning_history_number", earning_history_number);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      EarningHistoryRepository lowercaseFirstLetterRepository = (EarningHistoryRepository) getRepository();
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
      EarningHistoryRepository lowercaseFirstLetterRepository = (EarningHistoryRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      EarningHistoryRepository lowercaseFirstLetterRepository = (EarningHistoryRepository) getRepository();
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
                    private transient QrCode  qrCode ;
                    private String qrCodeId;

                    public String getQrCodeId(){
                         return qrCodeId;
                    }

                    public void setQrCodeId(Object qrCodeId){
                        if(qrCodeId != null){
                          this.qrCodeId = qrCodeId.toString();
                        }
                    }

                    public QrCode getQrCode() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(qrCode == null){
                                        EarningHistoryRepository earningHistoryRepository = (EarningHistoryRepository) getRepository();

                                        RestAdapter restAdapter = earningHistoryRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          qrCode = getQrCode__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return qrCode;
                    }

                    public void setQrCode(QrCode qrCode) {
                        this.qrCode = qrCode;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setQrCode(Map<String, Object> qrCode) {
                        //First create a dummy Repo class object for customer.
                        QrCodeRepository qrCodeRepository = new QrCodeRepository();
                        QrCode qrCode1 = qrCodeRepository.createObject(qrCode);
                        setQrCode(qrCode1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setQrCode(HashMap<String, Object> qrCode) {
                        //First create a dummy Repo class object for customer.
                        QrCodeRepository qrCodeRepository = new QrCodeRepository();
                        QrCode qrCode1 = qrCodeRepository.createObject(qrCode);
                        setQrCode(qrCode1);
                    }

                    //Adding relation method..
                    public void addRelation(QrCode qrCode) {
                        that.setQrCode(qrCode);
                    }


                    //Fetch related data from local database if present a qrCodeId identifier as property for belongsTo
                    public QrCode getQrCode__db(RestAdapter restAdapter){
                      if(qrCodeId != null){
                        QrCodeRepository qrCodeRepository = restAdapter.createRepository(QrCodeRepository.class);
                            try{
                            EarningHistoryRepository lowercaseFirstLetterRepository = (EarningHistoryRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(qrCodeRepository.getDb() == null ){
                                                    qrCodeRepository.addStorage(context);
                                                }

                                                if(context != null && qrCodeRepository.getDb() != null){
                                                    qrCodeRepository.addStorage(context);
                                                    QrCode qrCode = (QrCode) qrCodeRepository.getDb().get__db(qrCodeId);
                                                    return qrCode;
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
                                    public void get__qrCode( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final EarningHistoryRepository  earningHistoryRepo = restAdapter.createRepository(EarningHistoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        earningHistoryRepo.get__qrCode( (String)that.getId(), refresh,  new ObjectCallback<QrCode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCode object) {
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
                    private transient Retailer  retailer ;
                    private String retailerId;

                    public String getRetailerId(){
                         return retailerId;
                    }

                    public void setRetailerId(Object retailerId){
                        if(retailerId != null){
                          this.retailerId = retailerId.toString();
                        }
                    }

                    public Retailer getRetailer() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(retailer == null){
                                        EarningHistoryRepository earningHistoryRepository = (EarningHistoryRepository) getRepository();

                                        RestAdapter restAdapter = earningHistoryRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          retailer = getRetailer__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return retailer;
                    }

                    public void setRetailer(Retailer retailer) {
                        this.retailer = retailer;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRetailer(Map<String, Object> retailer) {
                        //First create a dummy Repo class object for customer.
                        RetailerRepository retailerRepository = new RetailerRepository();
                        Retailer retailer1 = retailerRepository.createObject(retailer);
                        setRetailer(retailer1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRetailer(HashMap<String, Object> retailer) {
                        //First create a dummy Repo class object for customer.
                        RetailerRepository retailerRepository = new RetailerRepository();
                        Retailer retailer1 = retailerRepository.createObject(retailer);
                        setRetailer(retailer1);
                    }

                    //Adding relation method..
                    public void addRelation(Retailer retailer) {
                        that.setRetailer(retailer);
                    }


                    //Fetch related data from local database if present a retailerId identifier as property for belongsTo
                    public Retailer getRetailer__db(RestAdapter restAdapter){
                      if(retailerId != null){
                        RetailerRepository retailerRepository = restAdapter.createRepository(RetailerRepository.class);
                            try{
                            EarningHistoryRepository lowercaseFirstLetterRepository = (EarningHistoryRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(retailerRepository.getDb() == null ){
                                                    retailerRepository.addStorage(context);
                                                }

                                                if(context != null && retailerRepository.getDb() != null){
                                                    retailerRepository.addStorage(context);
                                                    Retailer retailer = (Retailer) retailerRepository.getDb().get__db(retailerId);
                                                    return retailer;
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
                                    public void get__retailer( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Retailer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final EarningHistoryRepository  earningHistoryRepo = restAdapter.createRepository(EarningHistoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        earningHistoryRepo.get__retailer( (String)that.getId(), refresh,  new ObjectCallback<Retailer> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Retailer object) {
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
                    private transient Department  department ;
                    private String departmentId;

                    public String getDepartmentId(){
                         return departmentId;
                    }

                    public void setDepartmentId(Object departmentId){
                        if(departmentId != null){
                          this.departmentId = departmentId.toString();
                        }
                    }

                    public Department getDepartment() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(department == null){
                                        EarningHistoryRepository earningHistoryRepository = (EarningHistoryRepository) getRepository();

                                        RestAdapter restAdapter = earningHistoryRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          department = getDepartment__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return department;
                    }

                    public void setDepartment(Department department) {
                        this.department = department;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDepartment(Map<String, Object> department) {
                        //First create a dummy Repo class object for customer.
                        DepartmentRepository departmentRepository = new DepartmentRepository();
                        Department department1 = departmentRepository.createObject(department);
                        setDepartment(department1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDepartment(HashMap<String, Object> department) {
                        //First create a dummy Repo class object for customer.
                        DepartmentRepository departmentRepository = new DepartmentRepository();
                        Department department1 = departmentRepository.createObject(department);
                        setDepartment(department1);
                    }

                    //Adding relation method..
                    public void addRelation(Department department) {
                        that.setDepartment(department);
                    }


                    //Fetch related data from local database if present a departmentId identifier as property for belongsTo
                    public Department getDepartment__db(RestAdapter restAdapter){
                      if(departmentId != null){
                        DepartmentRepository departmentRepository = restAdapter.createRepository(DepartmentRepository.class);
                            try{
                            EarningHistoryRepository lowercaseFirstLetterRepository = (EarningHistoryRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(departmentRepository.getDb() == null ){
                                                    departmentRepository.addStorage(context);
                                                }

                                                if(context != null && departmentRepository.getDb() != null){
                                                    departmentRepository.addStorage(context);
                                                    Department department = (Department) departmentRepository.getDb().get__db(departmentId);
                                                    return department;
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
                                    public void get__department( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Department> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final EarningHistoryRepository  earningHistoryRepo = restAdapter.createRepository(EarningHistoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        earningHistoryRepo.get__department( (String)that.getId(), refresh,  new ObjectCallback<Department> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Department object) {
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
