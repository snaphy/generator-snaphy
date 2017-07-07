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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.TransactionRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RetailerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DepartmentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QrCodeRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Transaction extends Model {


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

    private Transaction that ;

    public Transaction (){
        that = this;
    }

    
        
            

            
                private String transaction_number;
                /* Adding Getter and Setter methods */
                public String getTransaction_number(){
                    return transaction_number;
                }

                /* Adding Getter and Setter methods */
                public void setTransaction_number(String transaction_number){
                    this.transaction_number = transaction_number;
                    //Update hashMap value..
                    hashMap.put("transaction_number", transaction_number);
                }

            
            
        
    
        
            

            
                private String paytm_transaction_id;
                /* Adding Getter and Setter methods */
                public String getPaytm_transaction_id(){
                    return paytm_transaction_id;
                }

                /* Adding Getter and Setter methods */
                public void setPaytm_transaction_id(String paytm_transaction_id){
                    this.paytm_transaction_id = paytm_transaction_id;
                    //Update hashMap value..
                    hashMap.put("paytm_transaction_id", paytm_transaction_id);
                }

            
            
        
    
        
            

            
                private double total_points;
                /* Adding Getter and Setter methods */
                public double getTotal_points(){
                    return total_points;
                }

                /* Adding Getter and Setter methods */
                public void setTotal_points(double total_points){
                    this.total_points = total_points;
                    //Update hashMap value..
                    hashMap.put("total_points", total_points);
                }

            
            
        
    
        
            

            
                private double total_amount;
                /* Adding Getter and Setter methods */
                public double getTotal_amount(){
                    return total_amount;
                }

                /* Adding Getter and Setter methods */
                public void setTotal_amount(double total_amount){
                    this.total_amount = total_amount;
                    //Update hashMap value..
                    hashMap.put("total_amount", total_amount);
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
      TransactionRepository lowercaseFirstLetterRepository = (TransactionRepository) getRepository();
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
      TransactionRepository lowercaseFirstLetterRepository = (TransactionRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      TransactionRepository lowercaseFirstLetterRepository = (TransactionRepository) getRepository();
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
                                        TransactionRepository transactionRepository = (TransactionRepository) getRepository();

                                        RestAdapter restAdapter = transactionRepository.getRestAdapter();
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
                            TransactionRepository lowercaseFirstLetterRepository = (TransactionRepository) getRepository();
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
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        transactionRepo.get__retailer( (String)that.getId(), refresh,  new ObjectCallback<Retailer> (){
                                            

                                            
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
                                        TransactionRepository transactionRepository = (TransactionRepository) getRepository();

                                        RestAdapter restAdapter = transactionRepository.getRestAdapter();
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
                            TransactionRepository lowercaseFirstLetterRepository = (TransactionRepository) getRepository();
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
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        transactionRepo.get__department( (String)that.getId(), refresh,  new ObjectCallback<Department> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<QrCode>  qrCodes ;

                    public DataList< QrCode > getQrCodes() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            QrCodeRepository qrCodeRepository = (QrCodeRepository) getRepository();

                            if(that.getId() != null && qrCodeRepository.getDb() != null){

                                 //Fetch locally from db
                                 //qrCodes = getQrCodes__db(restAdapter);
                                 // Getting single cont
                                 qrCodes = qrCodeRepository.getDb().getAll__db("transactionId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return qrCodes;
                    }

                    public void setQrCodes(DataList<QrCode> qrCodes) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: qrCodes){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setQrCodes1(hashMaps);
                        }else{
                            this.qrCodes = qrCodes;
                            //TODO: Warning move this to new thread
                            for(QrCode data: qrCodes){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQrCodes1(List<Map<String, Object>> qrCodes) {
                        //First create a dummy Repo class object for ..
                        QrCodeRepository qrCodesRepository = new QrCodeRepository();
                        List<QrCode> result = new ArrayList<>();
                        for (Map<String, Object> obj : qrCodes) {
                            //Also add relation to child type for two way communication..
                            QrCode obj1 = qrCodesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQrCodes(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQrCodes1(DataList<HashMap<String, Object>> qrCodes) {
                        //First create a dummy Repo class object for ..
                        QrCodeRepository qrCodesRepository = new QrCodeRepository();
                        DataList<QrCode> result = new DataList<>();
                        for (HashMap<String, Object> obj : qrCodes) {
                            //Also add relation to child type for two way communication..
                            QrCode obj1 = qrCodesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQrCodes(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<QrCode> qrCodes, QrCode dummyClassInstance) {
                        that.setQrCodes(qrCodes);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(QrCode qrCodes) {
                        try{
                            try{

                                  //Save to database..
                                  qrCodes.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getQrCodes().add(qrCodes);
                        }catch(Exception e){
                            DataList< QrCode> qrCodes1 = new DataList();
                            //Now add this item to list..
                            qrCodes1.add(qrCodes);
                            //Now set data....
                            that.setQrCodes(qrCodes1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__qrCodes( String fk,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        transactionRepo.findById__qrCodes( (String)that.getId(), fk,  new ObjectCallback<QrCode> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__qrCodes( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        transactionRepo.destroyById__qrCodes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__qrCodes( String fk,  QrCode data,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        transactionRepo.updateById__qrCodes( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<QrCode> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void get__qrCodes( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        transactionRepo.get__qrCodes( (String)that.getId(), filter,  new DataListCallback<QrCode> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<QrCode> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            QrCode obj = new QrCode();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (QrCode obj : object) {
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
                                    public void create__qrCodes( QrCode data,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        transactionRepo.create__qrCodes( (String)that.getId(), data.convertMap(),  new ObjectCallback<QrCode> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__qrCodes( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        



                                        transactionRepo.delete__qrCodes( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__qrCodes( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TransactionRepository  transactionRepo = restAdapter.createRepository(TransactionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        transactionRepo.count__qrCodes( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
