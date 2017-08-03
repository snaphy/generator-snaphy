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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.QrCodeRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RetailerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DepartmentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TransactionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QrCodeGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.EarningHistoryRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class QrCode extends Model {


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

    private QrCode that ;

    public QrCode (){
        that = this;
    }

    
        
            

            
                private double serial_number;
                /* Adding Getter and Setter methods */
                public double getSerial_number(){
                    return serial_number;
                }

                /* Adding Getter and Setter methods */
                public void setSerial_number(double serial_number){
                    this.serial_number = serial_number;
                    //Update hashMap value..
                    hashMap.put("serial_number", serial_number);
                }

            
            
        
    
        
            

            
                private String activation_status;
                /* Adding Getter and Setter methods */
                public String getActivation_status(){
                    return activation_status;
                }

                /* Adding Getter and Setter methods */
                public void setActivation_status(String activation_status){
                    this.activation_status = activation_status;
                    //Update hashMap value..
                    hashMap.put("activation_status", activation_status);
                }

            
            
        
    
        
            

            
                private String active_on;
                /* Adding Getter and Setter methods */
                public String getActive_on(){
                    return active_on;
                }

                /* Adding Getter and Setter methods */
                public void setActive_on(String active_on){
                    this.active_on = active_on;
                    //Update hashMap value..
                    hashMap.put("active_on", active_on);
                }

            
            
        
    
        
            

            
                private String scan_status;
                /* Adding Getter and Setter methods */
                public String getScan_status(){
                    return scan_status;
                }

                /* Adding Getter and Setter methods */
                public void setScan_status(String scan_status){
                    this.scan_status = scan_status;
                    //Update hashMap value..
                    hashMap.put("scan_status", scan_status);
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

            
            
        
    
        
            

            
                private double points;
                /* Adding Getter and Setter methods */
                public double getPoints(){
                    return points;
                }

                /* Adding Getter and Setter methods */
                public void setPoints(double points){
                    this.points = points;
                    //Update hashMap value..
                    hashMap.put("points", points);
                }

            
            
        
    
        
            

            
                private String scanned_on;
                /* Adding Getter and Setter methods */
                public String getScanned_on(){
                    return scanned_on;
                }

                /* Adding Getter and Setter methods */
                public void setScanned_on(String scanned_on){
                    this.scanned_on = scanned_on;
                    //Update hashMap value..
                    hashMap.put("scanned_on", scanned_on);
                }

            
            
        
    
        
            

            
                private String redeemed_on;
                /* Adding Getter and Setter methods */
                public String getRedeemed_on(){
                    return redeemed_on;
                }

                /* Adding Getter and Setter methods */
                public void setRedeemed_on(String redeemed_on){
                    this.redeemed_on = redeemed_on;
                    //Update hashMap value..
                    hashMap.put("redeemed_on", redeemed_on);
                }

            
            
        
    
        
            

            
                private String redeemStatus;
                /* Adding Getter and Setter methods */
                public String getRedeemStatus(){
                    return redeemStatus;
                }

                /* Adding Getter and Setter methods */
                public void setRedeemStatus(String redeemStatus){
                    this.redeemStatus = redeemStatus;
                    //Update hashMap value..
                    hashMap.put("redeemStatus", redeemStatus);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      QrCodeRepository lowercaseFirstLetterRepository = (QrCodeRepository) getRepository();
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
      QrCodeRepository lowercaseFirstLetterRepository = (QrCodeRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      QrCodeRepository lowercaseFirstLetterRepository = (QrCodeRepository) getRepository();
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
                                        QrCodeRepository qrCodeRepository = (QrCodeRepository) getRepository();

                                        RestAdapter restAdapter = qrCodeRepository.getRestAdapter();
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
                            QrCodeRepository lowercaseFirstLetterRepository = (QrCodeRepository) getRepository();
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
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.get__retailer( (String)that.getId(), refresh,  new ObjectCallback<Retailer> (){
                                            

                                            
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
                                        QrCodeRepository qrCodeRepository = (QrCodeRepository) getRepository();

                                        RestAdapter restAdapter = qrCodeRepository.getRestAdapter();
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
                            QrCodeRepository lowercaseFirstLetterRepository = (QrCodeRepository) getRepository();
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
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.get__department( (String)that.getId(), refresh,  new ObjectCallback<Department> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Product  product ;
                    private String productId;

                    public String getProductId(){
                         return productId;
                    }

                    public void setProductId(Object productId){
                        if(productId != null){
                          this.productId = productId.toString();
                        }
                    }

                    public Product getProduct() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(product == null){
                                        QrCodeRepository qrCodeRepository = (QrCodeRepository) getRepository();

                                        RestAdapter restAdapter = qrCodeRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          product = getProduct__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return product;
                    }

                    public void setProduct(Product product) {
                        this.product = product;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setProduct(Map<String, Object> product) {
                        //First create a dummy Repo class object for customer.
                        ProductRepository productRepository = new ProductRepository();
                        Product product1 = productRepository.createObject(product);
                        setProduct(product1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setProduct(HashMap<String, Object> product) {
                        //First create a dummy Repo class object for customer.
                        ProductRepository productRepository = new ProductRepository();
                        Product product1 = productRepository.createObject(product);
                        setProduct(product1);
                    }

                    //Adding relation method..
                    public void addRelation(Product product) {
                        that.setProduct(product);
                    }


                    //Fetch related data from local database if present a productId identifier as property for belongsTo
                    public Product getProduct__db(RestAdapter restAdapter){
                      if(productId != null){
                        ProductRepository productRepository = restAdapter.createRepository(ProductRepository.class);
                            try{
                            QrCodeRepository lowercaseFirstLetterRepository = (QrCodeRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(productRepository.getDb() == null ){
                                                    productRepository.addStorage(context);
                                                }

                                                if(context != null && productRepository.getDb() != null){
                                                    productRepository.addStorage(context);
                                                    Product product = (Product) productRepository.getDb().get__db(productId);
                                                    return product;
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
                                    public void get__product( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.get__product( (String)that.getId(), refresh,  new ObjectCallback<Product> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Product object) {
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
                    private transient Transaction  transaction ;
                    private String transactionId;

                    public String getTransactionId(){
                         return transactionId;
                    }

                    public void setTransactionId(Object transactionId){
                        if(transactionId != null){
                          this.transactionId = transactionId.toString();
                        }
                    }

                    public Transaction getTransaction() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(transaction == null){
                                        QrCodeRepository qrCodeRepository = (QrCodeRepository) getRepository();

                                        RestAdapter restAdapter = qrCodeRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          transaction = getTransaction__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return transaction;
                    }

                    public void setTransaction(Transaction transaction) {
                        this.transaction = transaction;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTransaction(Map<String, Object> transaction) {
                        //First create a dummy Repo class object for customer.
                        TransactionRepository transactionRepository = new TransactionRepository();
                        Transaction transaction1 = transactionRepository.createObject(transaction);
                        setTransaction(transaction1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTransaction(HashMap<String, Object> transaction) {
                        //First create a dummy Repo class object for customer.
                        TransactionRepository transactionRepository = new TransactionRepository();
                        Transaction transaction1 = transactionRepository.createObject(transaction);
                        setTransaction(transaction1);
                    }

                    //Adding relation method..
                    public void addRelation(Transaction transaction) {
                        that.setTransaction(transaction);
                    }


                    //Fetch related data from local database if present a transactionId identifier as property for belongsTo
                    public Transaction getTransaction__db(RestAdapter restAdapter){
                      if(transactionId != null){
                        TransactionRepository transactionRepository = restAdapter.createRepository(TransactionRepository.class);
                            try{
                            QrCodeRepository lowercaseFirstLetterRepository = (QrCodeRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(transactionRepository.getDb() == null ){
                                                    transactionRepository.addStorage(context);
                                                }

                                                if(context != null && transactionRepository.getDb() != null){
                                                    transactionRepository.addStorage(context);
                                                    Transaction transaction = (Transaction) transactionRepository.getDb().get__db(transactionId);
                                                    return transaction;
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
                                    public void get__transaction( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.get__transaction( (String)that.getId(), refresh,  new ObjectCallback<Transaction> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Transaction object) {
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
                    private transient QrCodeGroup  qrCodeGroup ;
                    private String qrCodeGroupId;

                    public String getQrCodeGroupId(){
                         return qrCodeGroupId;
                    }

                    public void setQrCodeGroupId(Object qrCodeGroupId){
                        if(qrCodeGroupId != null){
                          this.qrCodeGroupId = qrCodeGroupId.toString();
                        }
                    }

                    public QrCodeGroup getQrCodeGroup() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(qrCodeGroup == null){
                                        QrCodeRepository qrCodeRepository = (QrCodeRepository) getRepository();

                                        RestAdapter restAdapter = qrCodeRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          qrCodeGroup = getQrCodeGroup__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return qrCodeGroup;
                    }

                    public void setQrCodeGroup(QrCodeGroup qrCodeGroup) {
                        this.qrCodeGroup = qrCodeGroup;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setQrCodeGroup(Map<String, Object> qrCodeGroup) {
                        //First create a dummy Repo class object for customer.
                        QrCodeGroupRepository qrCodeGroupRepository = new QrCodeGroupRepository();
                        QrCodeGroup qrCodeGroup1 = qrCodeGroupRepository.createObject(qrCodeGroup);
                        setQrCodeGroup(qrCodeGroup1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setQrCodeGroup(HashMap<String, Object> qrCodeGroup) {
                        //First create a dummy Repo class object for customer.
                        QrCodeGroupRepository qrCodeGroupRepository = new QrCodeGroupRepository();
                        QrCodeGroup qrCodeGroup1 = qrCodeGroupRepository.createObject(qrCodeGroup);
                        setQrCodeGroup(qrCodeGroup1);
                    }

                    //Adding relation method..
                    public void addRelation(QrCodeGroup qrCodeGroup) {
                        that.setQrCodeGroup(qrCodeGroup);
                    }


                    //Fetch related data from local database if present a qrCodeGroupId identifier as property for belongsTo
                    public QrCodeGroup getQrCodeGroup__db(RestAdapter restAdapter){
                      if(qrCodeGroupId != null){
                        QrCodeGroupRepository qrCodeGroupRepository = restAdapter.createRepository(QrCodeGroupRepository.class);
                            try{
                            QrCodeRepository lowercaseFirstLetterRepository = (QrCodeRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(qrCodeGroupRepository.getDb() == null ){
                                                    qrCodeGroupRepository.addStorage(context);
                                                }

                                                if(context != null && qrCodeGroupRepository.getDb() != null){
                                                    qrCodeGroupRepository.addStorage(context);
                                                    QrCodeGroup qrCodeGroup = (QrCodeGroup) qrCodeGroupRepository.getDb().get__db(qrCodeGroupId);
                                                    return qrCodeGroup;
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
                                    public void get__qrCodeGroup( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<QrCodeGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.get__qrCodeGroup( (String)that.getId(), refresh,  new ObjectCallback<QrCodeGroup> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCodeGroup object) {
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
                    private transient DataList<EarningHistory>  earningHistories ;

                    public DataList< EarningHistory > getEarningHistories() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            EarningHistoryRepository earningHistoryRepository = (EarningHistoryRepository) getRepository();

                            if(that.getId() != null && earningHistoryRepository.getDb() != null){

                                 //Fetch locally from db
                                 //earningHistories = getEarningHistories__db(restAdapter);
                                 // Getting single cont
                                 earningHistories = earningHistoryRepository.getDb().getAll__db("qrCodeId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return earningHistories;
                    }

                    public void setEarningHistories(DataList<EarningHistory> earningHistories) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: earningHistories){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setEarningHistories1(hashMaps);
                        }else{
                            this.earningHistories = earningHistories;
                            //TODO: Warning move this to new thread
                            for(EarningHistory data: earningHistories){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setEarningHistories1(List<Map<String, Object>> earningHistories) {
                        //First create a dummy Repo class object for ..
                        EarningHistoryRepository earningHistoriesRepository = new EarningHistoryRepository();
                        List<EarningHistory> result = new ArrayList<>();
                        for (Map<String, Object> obj : earningHistories) {
                            //Also add relation to child type for two way communication..
                            EarningHistory obj1 = earningHistoriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setEarningHistories(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setEarningHistories1(DataList<HashMap<String, Object>> earningHistories) {
                        //First create a dummy Repo class object for ..
                        EarningHistoryRepository earningHistoriesRepository = new EarningHistoryRepository();
                        DataList<EarningHistory> result = new DataList<>();
                        for (HashMap<String, Object> obj : earningHistories) {
                            //Also add relation to child type for two way communication..
                            EarningHistory obj1 = earningHistoriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setEarningHistories(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<EarningHistory> earningHistories, EarningHistory dummyClassInstance) {
                        that.setEarningHistories(earningHistories);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(EarningHistory earningHistories) {
                        try{
                            try{

                                  //Save to database..
                                  earningHistories.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getEarningHistories().add(earningHistories);
                        }catch(Exception e){
                            DataList< EarningHistory> earningHistories1 = new DataList();
                            //Now add this item to list..
                            earningHistories1.add(earningHistories);
                            //Now set data....
                            that.setEarningHistories(earningHistories1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__earningHistories( String fk,  RestAdapter restAdapter, final ObjectCallback<EarningHistory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.findById__earningHistories( (String)that.getId(), fk,  new ObjectCallback<EarningHistory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(EarningHistory object) {
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
                                    public void destroyById__earningHistories( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.destroyById__earningHistories( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__earningHistories( String fk,  EarningHistory data,  RestAdapter restAdapter, final ObjectCallback<EarningHistory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.updateById__earningHistories( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<EarningHistory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(EarningHistory object) {
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
                                    public void get__earningHistories( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<EarningHistory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.get__earningHistories( (String)that.getId(), filter,  new DataListCallback<EarningHistory> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<EarningHistory> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            EarningHistory obj = new EarningHistory();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (EarningHistory obj : object) {
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
                                    public void create__earningHistories( EarningHistory data,  RestAdapter restAdapter, final ObjectCallback<EarningHistory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.create__earningHistories( (String)that.getId(), data.convertMap(),  new ObjectCallback<EarningHistory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(EarningHistory object) {
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
                                    public void delete__earningHistories( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        



                                        qrCodeRepo.delete__earningHistories( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__earningHistories( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QrCodeRepository  qrCodeRepo = restAdapter.createRepository(QrCodeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        qrCodeRepo.count__earningHistories( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
