package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;
import android.util.Log;
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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.InvoiceRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AreaRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderSampleRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PauseSubscriptionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ExtraDeliveryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SubscriptionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NotificationDataRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Customer extends User {


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

    private Customer that ;

    public Customer (){
        that = this;
    }

    
        
            

            
                private String roadName;
                /* Adding Getter and Setter methods */
                public String getRoadName(){
                    return roadName;
                }

                /* Adding Getter and Setter methods */
                public void setRoadName(String roadName){
                    this.roadName = roadName;
                    //Update hashMap value..
                    hashMap.put("roadName", roadName);
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

            
            
        
    
        
            

            
                private boolean isEmailVerified;
                /* Adding Getter and Setter methods */
                public boolean getIsEmailVerified(){
                    return isEmailVerified;
                }

                /* Adding Getter and Setter methods */
                public void setIsEmailVerified(boolean isEmailVerified){
                    this.isEmailVerified = isEmailVerified;
                    //Update hashMap value..
                    hashMap.put("isEmailVerified", isEmailVerified);
                }

            
            
        
    
        
            

            
                private double discount;
                /* Adding Getter and Setter methods */
                public double getDiscount(){
                    return discount;
                }

                /* Adding Getter and Setter methods */
                public void setDiscount(double discount){
                    this.discount = discount;
                    //Update hashMap value..
                    hashMap.put("discount", discount);
                }

            
            
        
    
        
            

            
                private String collectionType;
                /* Adding Getter and Setter methods */
                public String getCollectionType(){
                    return collectionType;
                }

                /* Adding Getter and Setter methods */
                public void setCollectionType(String collectionType){
                    this.collectionType = collectionType;
                    //Update hashMap value..
                    hashMap.put("collectionType", collectionType);
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

            
            
        
    
        
            

            
                private String subscriptionType;
                /* Adding Getter and Setter methods */
                public String getSubscriptionType(){
                    return subscriptionType;
                }

                /* Adding Getter and Setter methods */
                public void setSubscriptionType(String subscriptionType){
                    this.subscriptionType = subscriptionType;
                    //Update hashMap value..
                    hashMap.put("subscriptionType", subscriptionType);
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

            
            
        
    
        
            

            
                private String time;
                /* Adding Getter and Setter methods */
                public String getTime(){
                    return time;
                }

                /* Adding Getter and Setter methods */
                public void setTime(String time){
                    this.time = time;
                    //Update hashMap value..
                    hashMap.put("time", time);
                }

            
            
        
    
        
            

            
                private String address;
                /* Adding Getter and Setter methods */
                public String getAddress(){
                    return address;
                }

                /* Adding Getter and Setter methods */
                public void setAddress(String address){
                    this.address = address;
                    //Update hashMap value..
                    hashMap.put("address", address);
                }

            
            
        
    
        
            

            
                private String product;
                /* Adding Getter and Setter methods */
                public String getProduct(){
                    return product;
                }

                /* Adding Getter and Setter methods */
                public void setProduct(String product){
                    this.product = product;
                    //Update hashMap value..
                    hashMap.put("product", product);
                }

            
            
        
    
        
            

            
                private double accountNumber;
                /* Adding Getter and Setter methods */
                public double getAccountNumber(){
                    return accountNumber;
                }

                /* Adding Getter and Setter methods */
                public void setAccountNumber(double accountNumber){
                    this.accountNumber = accountNumber;
                    //Update hashMap value..
                    hashMap.put("accountNumber", accountNumber);
                }

            
            
        
    
        
            

            
                private String reset_startDate;
                /* Adding Getter and Setter methods */
                public String getReset_startDate(){
                    return reset_startDate;
                }

                /* Adding Getter and Setter methods */
                public void setReset_startDate(String reset_startDate){
                    this.reset_startDate = reset_startDate;
                    //Update hashMap value..
                    hashMap.put("reset_startDate", reset_startDate);
                }

            
            
        
    
        
            

            
                private String subscription_startDate;
                /* Adding Getter and Setter methods */
                public String getSubscription_startDate(){
                    return subscription_startDate;
                }

                /* Adding Getter and Setter methods */
                public void setSubscription_startDate(String subscription_startDate){
                    this.subscription_startDate = subscription_startDate;
                    //Update hashMap value..
                    hashMap.put("subscription_startDate", subscription_startDate);
                }

            
            
        
    
        
            

            
                private String subscription_stopDate;
                /* Adding Getter and Setter methods */
                public String getSubscription_stopDate(){
                    return subscription_stopDate;
                }

                /* Adding Getter and Setter methods */
                public void setSubscription_stopDate(String subscription_stopDate){
                    this.subscription_stopDate = subscription_stopDate;
                    //Update hashMap value..
                    hashMap.put("subscription_stopDate", subscription_stopDate);
                }

            
            
        
    
        
            

            
                private String subscription_time;
                /* Adding Getter and Setter methods */
                public String getSubscription_time(){
                    return subscription_time;
                }

                /* Adding Getter and Setter methods */
                public void setSubscription_time(String subscription_time){
                    this.subscription_time = subscription_time;
                    //Update hashMap value..
                    hashMap.put("subscription_time", subscription_time);
                }

            
            
        
    
        
            

            
                private String phoneNumber;
                /* Adding Getter and Setter methods */
                public String getPhoneNumber(){
                    return phoneNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPhoneNumber(String phoneNumber){
                    this.phoneNumber = phoneNumber;
                    //Update hashMap value..
                    hashMap.put("phoneNumber", phoneNumber);
                }

            
            
        
    
        
            

            
                private String mobileNumber;
                /* Adding Getter and Setter methods */
                public String getMobileNumber(){
                    return mobileNumber;
                }

                /* Adding Getter and Setter methods */
                public void setMobileNumber(String mobileNumber){
                    this.mobileNumber = mobileNumber;
                    //Update hashMap value..
                    hashMap.put("mobileNumber", mobileNumber);
                }

            
            
        
    
        
            

            
                private String comment;
                /* Adding Getter and Setter methods */
                public String getComment(){
                    return comment;
                }

                /* Adding Getter and Setter methods */
                public void setComment(String comment){
                    this.comment = comment;
                    //Update hashMap value..
                    hashMap.put("comment", comment);
                }

            
            
        
    
        
            

            
                private double isOwing;
                /* Adding Getter and Setter methods */
                public double getIsOwing(){
                    return isOwing;
                }

                /* Adding Getter and Setter methods */
                public void setIsOwing(double isOwing){
                    this.isOwing = isOwing;
                    //Update hashMap value..
                    hashMap.put("isOwing", isOwing);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
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
      CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
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
                    private transient DataList<Invoice>  invoices ;

                    public DataList< Invoice > getInvoices() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            InvoiceRepository invoiceRepository = (InvoiceRepository) getRepository();

                            if(that.getId() != null && invoiceRepository.getDb() != null){

                                 //Fetch locally from db
                                 //invoices = getInvoices__db(restAdapter);
                                 // Getting single cont
                                 invoices = invoiceRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return invoices;
                    }

                    public void setInvoices(DataList<Invoice> invoices) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: invoices){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setInvoices1(hashMaps);
                        }else{
                            this.invoices = invoices;
                            //TODO: Warning move this to new thread
                            for(Invoice data: invoices){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setInvoices1(List<Map<String, Object>> invoices) {
                        //First create a dummy Repo class object for ..
                        InvoiceRepository invoicesRepository = new InvoiceRepository();
                        List<Invoice> result = new ArrayList<>();
                        for (Map<String, Object> obj : invoices) {
                            //Also add relation to child type for two way communication..
                            Invoice obj1 = invoicesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setInvoices(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setInvoices1(DataList<HashMap<String, Object>> invoices) {
                        //First create a dummy Repo class object for ..
                        InvoiceRepository invoicesRepository = new InvoiceRepository();
                        DataList<Invoice> result = new DataList<>();
                        for (HashMap<String, Object> obj : invoices) {
                            //Also add relation to child type for two way communication..
                            Invoice obj1 = invoicesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setInvoices(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Invoice> invoices, Invoice dummyClassInstance) {
                        that.setInvoices(invoices);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Invoice invoices) {
                        try{
                            try{

                                  //Save to database..
                                  invoices.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getInvoices().add(invoices);
                        }catch(Exception e){
                            DataList< Invoice> invoices1 = new DataList();
                            //Now add this item to list..
                            invoices1.add(invoices);
                            //Now set data....
                            that.setInvoices(invoices1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__invoices( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__invoices( (String)that.getId(), fk,  new ObjectCallback<Invoice> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Invoice object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void destroyById__invoices( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__invoices( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__invoices( String fk,  Invoice data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__invoices( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Invoice> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Invoice object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void get__invoices( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__invoices( (String)that.getId(), filter,  new DataListCallback<Invoice> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Invoice> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          Invoice obj = new Invoice();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (Invoice obj : object) {
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void create__invoices( Invoice data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__invoices( (String)that.getId(), data.convertMap(),  new ObjectCallback<Invoice> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Invoice object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void delete__invoices( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__invoices( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__invoices( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__invoices( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                      try{
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient City  city ;
                    private String cityId;

                    public String getCityId(){
                         return cityId;
                    }

                    public void setCityId(Object cityId){
                        if(cityId != null){
                          this.cityId = cityId.toString();
                        }
                    }

                    public City getCity() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(city == null){
                                        CustomerRepository customerRepository = (CustomerRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = customerRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          city = getCity__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return city;
                    }

                    public void setCity(City city) {
                        this.city = city;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCity(Map<String, Object> city) {
                        //First create a dummy Repo class object for customer.
                        CityRepository cityRepository = new CityRepository();
                        City city1 = cityRepository.createObject(city);
                        setCity(city1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCity(HashMap<String, Object> city) {
                        //First create a dummy Repo class object for customer.
                        CityRepository cityRepository = new CityRepository();
                        City city1 = cityRepository.createObject(city);
                        setCity(city1);
                    }

                    //Adding relation method..
                    public void addRelation(City city) {
                        that.setCity(city);
                    }


                    //Fetch related data from local database if present a cityId identifier as property for belongsTo
                    public City getCity__db(SnaphyRestAdapter restAdapter){
                      if(cityId != null){
                        CityRepository cityRepository = restAdapter.createRepository(CityRepository.class);
                            try{
                            CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(cityRepository.getDb() == null ){
                                                    cityRepository.addStorage(context);
                                                }

                                                if(context != null && cityRepository.getDb() != null){
                                                    cityRepository.addStorage(context);
                                                    City city = (City) cityRepository.getDb().get__db(cityId);
                                                    return city;
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
                                    public void get__city( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<City> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__city( (String)that.getId(), refresh,  new ObjectCallback<City> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(City object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                    private transient Area  area ;
                    private String areaId;

                    public String getAreaId(){
                         return areaId;
                    }

                    public void setAreaId(Object areaId){
                        if(areaId != null){
                          this.areaId = areaId.toString();
                        }
                    }

                    public Area getArea() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(area == null){
                                        CustomerRepository customerRepository = (CustomerRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = customerRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          area = getArea__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return area;
                    }

                    public void setArea(Area area) {
                        this.area = area;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setArea(Map<String, Object> area) {
                        //First create a dummy Repo class object for customer.
                        AreaRepository areaRepository = new AreaRepository();
                        Area area1 = areaRepository.createObject(area);
                        setArea(area1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setArea(HashMap<String, Object> area) {
                        //First create a dummy Repo class object for customer.
                        AreaRepository areaRepository = new AreaRepository();
                        Area area1 = areaRepository.createObject(area);
                        setArea(area1);
                    }

                    //Adding relation method..
                    public void addRelation(Area area) {
                        that.setArea(area);
                    }


                    //Fetch related data from local database if present a areaId identifier as property for belongsTo
                    public Area getArea__db(SnaphyRestAdapter restAdapter){
                      if(areaId != null){
                        AreaRepository areaRepository = restAdapter.createRepository(AreaRepository.class);
                            try{
                            CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(areaRepository.getDb() == null ){
                                                    areaRepository.addStorage(context);
                                                }

                                                if(context != null && areaRepository.getDb() != null){
                                                    areaRepository.addStorage(context);
                                                    Area area = (Area) areaRepository.getDb().get__db(areaId);
                                                    return area;
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
                                    public void get__area( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__area( (String)that.getId(), refresh,  new ObjectCallback<Area> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Area object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                    private transient DataList<OrderSample>  orderSamples ;

                    public DataList< OrderSample > getOrderSamples() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            OrderSampleRepository orderSampleRepository = (OrderSampleRepository) getRepository();

                            if(that.getId() != null && orderSampleRepository.getDb() != null){

                                 //Fetch locally from db
                                 //orderSamples = getOrderSamples__db(restAdapter);
                                 // Getting single cont
                                 orderSamples = orderSampleRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return orderSamples;
                    }

                    public void setOrderSamples(DataList<OrderSample> orderSamples) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: orderSamples){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setOrderSamples1(hashMaps);
                        }else{
                            this.orderSamples = orderSamples;
                            //TODO: Warning move this to new thread
                            for(OrderSample data: orderSamples){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setOrderSamples1(List<Map<String, Object>> orderSamples) {
                        //First create a dummy Repo class object for ..
                        OrderSampleRepository orderSamplesRepository = new OrderSampleRepository();
                        List<OrderSample> result = new ArrayList<>();
                        for (Map<String, Object> obj : orderSamples) {
                            //Also add relation to child type for two way communication..
                            OrderSample obj1 = orderSamplesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setOrderSamples(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setOrderSamples1(DataList<HashMap<String, Object>> orderSamples) {
                        //First create a dummy Repo class object for ..
                        OrderSampleRepository orderSamplesRepository = new OrderSampleRepository();
                        DataList<OrderSample> result = new DataList<>();
                        for (HashMap<String, Object> obj : orderSamples) {
                            //Also add relation to child type for two way communication..
                            OrderSample obj1 = orderSamplesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setOrderSamples(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<OrderSample> orderSamples, OrderSample dummyClassInstance) {
                        that.setOrderSamples(orderSamples);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(OrderSample orderSamples) {
                        try{
                            try{

                                  //Save to database..
                                  orderSamples.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getOrderSamples().add(orderSamples);
                        }catch(Exception e){
                            DataList< OrderSample> orderSamples1 = new DataList();
                            //Now add this item to list..
                            orderSamples1.add(orderSamples);
                            //Now set data....
                            that.setOrderSamples(orderSamples1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__orderSamples( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<OrderSample> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__orderSamples( (String)that.getId(), fk,  new ObjectCallback<OrderSample> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(OrderSample object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void destroyById__orderSamples( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__orderSamples( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__orderSamples( String fk,  OrderSample data,  SnaphyRestAdapter restAdapter, final ObjectCallback<OrderSample> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__orderSamples( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<OrderSample> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(OrderSample object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void get__orderSamples( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<OrderSample> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__orderSamples( (String)that.getId(), filter,  new DataListCallback<OrderSample> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<OrderSample> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          OrderSample obj = new OrderSample();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (OrderSample obj : object) {
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void create__orderSamples( OrderSample data,  SnaphyRestAdapter restAdapter, final ObjectCallback<OrderSample> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__orderSamples( (String)that.getId(), data.convertMap(),  new ObjectCallback<OrderSample> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(OrderSample object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void delete__orderSamples( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__orderSamples( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__orderSamples( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__orderSamples( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                      try{
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<PauseSubscription>  pauseSubscriptions ;

                    public DataList< PauseSubscription > getPauseSubscriptions() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PauseSubscriptionRepository pauseSubscriptionRepository = (PauseSubscriptionRepository) getRepository();

                            if(that.getId() != null && pauseSubscriptionRepository.getDb() != null){

                                 //Fetch locally from db
                                 //pauseSubscriptions = getPauseSubscriptions__db(restAdapter);
                                 // Getting single cont
                                 pauseSubscriptions = pauseSubscriptionRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return pauseSubscriptions;
                    }

                    public void setPauseSubscriptions(DataList<PauseSubscription> pauseSubscriptions) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: pauseSubscriptions){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPauseSubscriptions1(hashMaps);
                        }else{
                            this.pauseSubscriptions = pauseSubscriptions;
                            //TODO: Warning move this to new thread
                            for(PauseSubscription data: pauseSubscriptions){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPauseSubscriptions1(List<Map<String, Object>> pauseSubscriptions) {
                        //First create a dummy Repo class object for ..
                        PauseSubscriptionRepository pauseSubscriptionsRepository = new PauseSubscriptionRepository();
                        List<PauseSubscription> result = new ArrayList<>();
                        for (Map<String, Object> obj : pauseSubscriptions) {
                            //Also add relation to child type for two way communication..
                            PauseSubscription obj1 = pauseSubscriptionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPauseSubscriptions(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPauseSubscriptions1(DataList<HashMap<String, Object>> pauseSubscriptions) {
                        //First create a dummy Repo class object for ..
                        PauseSubscriptionRepository pauseSubscriptionsRepository = new PauseSubscriptionRepository();
                        DataList<PauseSubscription> result = new DataList<>();
                        for (HashMap<String, Object> obj : pauseSubscriptions) {
                            //Also add relation to child type for two way communication..
                            PauseSubscription obj1 = pauseSubscriptionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPauseSubscriptions(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PauseSubscription> pauseSubscriptions, PauseSubscription dummyClassInstance) {
                        that.setPauseSubscriptions(pauseSubscriptions);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PauseSubscription pauseSubscriptions) {
                        try{
                            try{

                                  //Save to database..
                                  pauseSubscriptions.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPauseSubscriptions().add(pauseSubscriptions);
                        }catch(Exception e){
                            DataList< PauseSubscription> pauseSubscriptions1 = new DataList();
                            //Now add this item to list..
                            pauseSubscriptions1.add(pauseSubscriptions);
                            //Now set data....
                            that.setPauseSubscriptions(pauseSubscriptions1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__pauseSubscriptions( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<PauseSubscription> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__pauseSubscriptions( (String)that.getId(), fk,  new ObjectCallback<PauseSubscription> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PauseSubscription object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void destroyById__pauseSubscriptions( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__pauseSubscriptions( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__pauseSubscriptions( String fk,  PauseSubscription data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PauseSubscription> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__pauseSubscriptions( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PauseSubscription> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PauseSubscription object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void get__pauseSubscriptions( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<PauseSubscription> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__pauseSubscriptions( (String)that.getId(), filter,  new DataListCallback<PauseSubscription> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PauseSubscription> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          PauseSubscription obj = new PauseSubscription();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (PauseSubscription obj : object) {
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void create__pauseSubscriptions( PauseSubscription data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PauseSubscription> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__pauseSubscriptions( (String)that.getId(), data.convertMap(),  new ObjectCallback<PauseSubscription> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PauseSubscription object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void delete__pauseSubscriptions( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__pauseSubscriptions( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__pauseSubscriptions( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__pauseSubscriptions( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                      try{
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<ExtraDelivery>  extraDeliveries ;

                    public DataList< ExtraDelivery > getExtraDeliveries() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ExtraDeliveryRepository extraDeliveryRepository = (ExtraDeliveryRepository) getRepository();

                            if(that.getId() != null && extraDeliveryRepository.getDb() != null){

                                 //Fetch locally from db
                                 //extraDeliveries = getExtraDeliveries__db(restAdapter);
                                 // Getting single cont
                                 extraDeliveries = extraDeliveryRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return extraDeliveries;
                    }

                    public void setExtraDeliveries(DataList<ExtraDelivery> extraDeliveries) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: extraDeliveries){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setExtraDeliveries1(hashMaps);
                        }else{
                            this.extraDeliveries = extraDeliveries;
                            //TODO: Warning move this to new thread
                            for(ExtraDelivery data: extraDeliveries){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setExtraDeliveries1(List<Map<String, Object>> extraDeliveries) {
                        //First create a dummy Repo class object for ..
                        ExtraDeliveryRepository extraDeliveriesRepository = new ExtraDeliveryRepository();
                        List<ExtraDelivery> result = new ArrayList<>();
                        for (Map<String, Object> obj : extraDeliveries) {
                            //Also add relation to child type for two way communication..
                            ExtraDelivery obj1 = extraDeliveriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setExtraDeliveries(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setExtraDeliveries1(DataList<HashMap<String, Object>> extraDeliveries) {
                        //First create a dummy Repo class object for ..
                        ExtraDeliveryRepository extraDeliveriesRepository = new ExtraDeliveryRepository();
                        DataList<ExtraDelivery> result = new DataList<>();
                        for (HashMap<String, Object> obj : extraDeliveries) {
                            //Also add relation to child type for two way communication..
                            ExtraDelivery obj1 = extraDeliveriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setExtraDeliveries(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<ExtraDelivery> extraDeliveries, ExtraDelivery dummyClassInstance) {
                        that.setExtraDeliveries(extraDeliveries);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(ExtraDelivery extraDeliveries) {
                        try{
                            try{

                                  //Save to database..
                                  extraDeliveries.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getExtraDeliveries().add(extraDeliveries);
                        }catch(Exception e){
                            DataList< ExtraDelivery> extraDeliveries1 = new DataList();
                            //Now add this item to list..
                            extraDeliveries1.add(extraDeliveries);
                            //Now set data....
                            that.setExtraDeliveries(extraDeliveries1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__extraDeliveries( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<ExtraDelivery> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__extraDeliveries( (String)that.getId(), fk,  new ObjectCallback<ExtraDelivery> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ExtraDelivery object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void destroyById__extraDeliveries( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__extraDeliveries( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__extraDeliveries( String fk,  ExtraDelivery data,  SnaphyRestAdapter restAdapter, final ObjectCallback<ExtraDelivery> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__extraDeliveries( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ExtraDelivery> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ExtraDelivery object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void get__extraDeliveries( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<ExtraDelivery> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__extraDeliveries( (String)that.getId(), filter,  new DataListCallback<ExtraDelivery> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<ExtraDelivery> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          ExtraDelivery obj = new ExtraDelivery();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (ExtraDelivery obj : object) {
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void create__extraDeliveries( ExtraDelivery data,  SnaphyRestAdapter restAdapter, final ObjectCallback<ExtraDelivery> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__extraDeliveries( (String)that.getId(), data.convertMap(),  new ObjectCallback<ExtraDelivery> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ExtraDelivery object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void delete__extraDeliveries( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__extraDeliveries( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__extraDeliveries( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__extraDeliveries( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                      try{
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Subscription>  subscriptions ;

                    public DataList< Subscription > getSubscriptions() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            SubscriptionRepository subscriptionRepository = (SubscriptionRepository) getRepository();

                            if(that.getId() != null && subscriptionRepository.getDb() != null){

                                 //Fetch locally from db
                                 //subscriptions = getSubscriptions__db(restAdapter);
                                 // Getting single cont
                                 subscriptions = subscriptionRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return subscriptions;
                    }

                    public void setSubscriptions(DataList<Subscription> subscriptions) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: subscriptions){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setSubscriptions1(hashMaps);
                        }else{
                            this.subscriptions = subscriptions;
                            //TODO: Warning move this to new thread
                            for(Subscription data: subscriptions){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSubscriptions1(List<Map<String, Object>> subscriptions) {
                        //First create a dummy Repo class object for ..
                        SubscriptionRepository subscriptionsRepository = new SubscriptionRepository();
                        List<Subscription> result = new ArrayList<>();
                        for (Map<String, Object> obj : subscriptions) {
                            //Also add relation to child type for two way communication..
                            Subscription obj1 = subscriptionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSubscriptions(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSubscriptions1(DataList<HashMap<String, Object>> subscriptions) {
                        //First create a dummy Repo class object for ..
                        SubscriptionRepository subscriptionsRepository = new SubscriptionRepository();
                        DataList<Subscription> result = new DataList<>();
                        for (HashMap<String, Object> obj : subscriptions) {
                            //Also add relation to child type for two way communication..
                            Subscription obj1 = subscriptionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSubscriptions(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Subscription> subscriptions, Subscription dummyClassInstance) {
                        that.setSubscriptions(subscriptions);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Subscription subscriptions) {
                        try{
                            try{

                                  //Save to database..
                                  subscriptions.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getSubscriptions().add(subscriptions);
                        }catch(Exception e){
                            DataList< Subscription> subscriptions1 = new DataList();
                            //Now add this item to list..
                            subscriptions1.add(subscriptions);
                            //Now set data....
                            that.setSubscriptions(subscriptions1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__subscriptions( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Subscription> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__subscriptions( (String)that.getId(), fk,  new ObjectCallback<Subscription> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Subscription object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void destroyById__subscriptions( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__subscriptions( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__subscriptions( String fk,  Subscription data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Subscription> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__subscriptions( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Subscription> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Subscription object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void get__subscriptions( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Subscription> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__subscriptions( (String)that.getId(), filter,  new DataListCallback<Subscription> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Subscription> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          Subscription obj = new Subscription();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (Subscription obj : object) {
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void create__subscriptions( Subscription data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Subscription> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__subscriptions( (String)that.getId(), data.convertMap(),  new ObjectCallback<Subscription> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Subscription object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void delete__subscriptions( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__subscriptions( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__subscriptions( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__subscriptions( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                      try{
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<NotificationData>  notificationData ;

                    public DataList< NotificationData > getNotificationData() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            NotificationDataRepository notificationDataRepository = (NotificationDataRepository) getRepository();

                            if(that.getId() != null && notificationDataRepository.getDb() != null){

                                 //Fetch locally from db
                                 //notificationData = getNotificationData__db(restAdapter);
                                 // Getting single cont
                                 notificationData = notificationDataRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return notificationData;
                    }

                    public void setNotificationData(DataList<NotificationData> notificationData) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: notificationData){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setNotificationData1(hashMaps);
                        }else{
                            this.notificationData = notificationData;
                            //TODO: Warning move this to new thread
                            for(NotificationData data: notificationData){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setNotificationData1(List<Map<String, Object>> notificationData) {
                        //First create a dummy Repo class object for ..
                        NotificationDataRepository notificationDataRepository = new NotificationDataRepository();
                        List<NotificationData> result = new ArrayList<>();
                        for (Map<String, Object> obj : notificationData) {
                            //Also add relation to child type for two way communication..
                            NotificationData obj1 = notificationDataRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setNotificationData(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setNotificationData1(DataList<HashMap<String, Object>> notificationData) {
                        //First create a dummy Repo class object for ..
                        NotificationDataRepository notificationDataRepository = new NotificationDataRepository();
                        DataList<NotificationData> result = new DataList<>();
                        for (HashMap<String, Object> obj : notificationData) {
                            //Also add relation to child type for two way communication..
                            NotificationData obj1 = notificationDataRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setNotificationData(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<NotificationData> notificationData, NotificationData dummyClassInstance) {
                        that.setNotificationData(notificationData);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(NotificationData notificationData) {
                        try{
                            try{

                                  //Save to database..
                                  notificationData.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getNotificationData().add(notificationData);
                        }catch(Exception e){
                            DataList< NotificationData> notificationData1 = new DataList();
                            //Now add this item to list..
                            notificationData1.add(notificationData);
                            //Now set data....
                            that.setNotificationData(notificationData1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__notificationData( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<NotificationData> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__notificationData( (String)that.getId(), fk,  new ObjectCallback<NotificationData> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(NotificationData object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void destroyById__notificationData( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__notificationData( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__notificationData( String fk,  NotificationData data,  SnaphyRestAdapter restAdapter, final ObjectCallback<NotificationData> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__notificationData( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<NotificationData> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(NotificationData object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void get__notificationData( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<NotificationData> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__notificationData( (String)that.getId(), filter,  new DataListCallback<NotificationData> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<NotificationData> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          NotificationData obj = new NotificationData();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (NotificationData obj : object) {
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void create__notificationData( NotificationData data,  SnaphyRestAdapter restAdapter, final ObjectCallback<NotificationData> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__notificationData( (String)that.getId(), data.convertMap(),  new ObjectCallback<NotificationData> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(NotificationData object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void delete__notificationData( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__notificationData( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__notificationData( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__notificationData( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                      try{
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
      

}
