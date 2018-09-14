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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.LogisticsRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Order extends Model {


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

    private Order that ;

    public Order (){
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

            
            
        
    
        
            

            
                private double estimatedMRPPrice;
                /* Adding Getter and Setter methods */
                public double getEstimatedMRPPrice(){
                    return estimatedMRPPrice;
                }

                /* Adding Getter and Setter methods */
                public void setEstimatedMRPPrice(double estimatedMRPPrice){
                    this.estimatedMRPPrice = estimatedMRPPrice;
                    //Update hashMap value..
                    hashMap.put("estimatedMRPPrice", estimatedMRPPrice);
                }

            
            
        
    
        
            

            
                private double moneySaved;
                /* Adding Getter and Setter methods */
                public double getMoneySaved(){
                    return moneySaved;
                }

                /* Adding Getter and Setter methods */
                public void setMoneySaved(double moneySaved){
                    this.moneySaved = moneySaved;
                    //Update hashMap value..
                    hashMap.put("moneySaved", moneySaved);
                }

            
            
        
    
        
            

                private DataList<Object> itemIds;
                /* Adding Getter and Setter methods */
                public DataList<Object> getItemIds(){
                    return itemIds;
                }

                /* Adding Getter and Setter methods */
                public void setItemIds(DataList<Object> itemIds){
                    this.itemIds = itemIds;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("itemIds", itemIds);
                }

            

            
            
        
    
        
            

                private DataList<Map<String, Object>> itemObjectList;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getItemObjectList(){
                    return itemObjectList;
                }

                /* Adding Getter and Setter methods */
                public void setItemObjectList(DataList<Map<String, Object>> itemObjectList){
                    this.itemObjectList = itemObjectList;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("itemObjectList", itemObjectList);
                }

            

            
            
        
    
        
            

            
                private String orderStatus;
                /* Adding Getter and Setter methods */
                public String getOrderStatus(){
                    return orderStatus;
                }

                /* Adding Getter and Setter methods */
                public void setOrderStatus(String orderStatus){
                    this.orderStatus = orderStatus;
                    //Update hashMap value..
                    hashMap.put("orderStatus", orderStatus);
                }

            
            
        
    
        
            

            
                private double estimatedWeight;
                /* Adding Getter and Setter methods */
                public double getEstimatedWeight(){
                    return estimatedWeight;
                }

                /* Adding Getter and Setter methods */
                public void setEstimatedWeight(double estimatedWeight){
                    this.estimatedWeight = estimatedWeight;
                    //Update hashMap value..
                    hashMap.put("estimatedWeight", estimatedWeight);
                }

            
            
        
    
        
            

            
                private String nearestWarehouse;
                /* Adding Getter and Setter methods */
                public String getNearestWarehouse(){
                    return nearestWarehouse;
                }

                /* Adding Getter and Setter methods */
                public void setNearestWarehouse(String nearestWarehouse){
                    this.nearestWarehouse = nearestWarehouse;
                    //Update hashMap value..
                    hashMap.put("nearestWarehouse", nearestWarehouse);
                }

            
            
        
    
        
            

            
                private String dateOfOrder;
                /* Adding Getter and Setter methods */
                public String getDateOfOrder(){
                    return dateOfOrder;
                }

                /* Adding Getter and Setter methods */
                public void setDateOfOrder(String dateOfOrder){
                    this.dateOfOrder = dateOfOrder;
                    //Update hashMap value..
                    hashMap.put("dateOfOrder", dateOfOrder);
                }

            
            
        
    
        
            

            
                private String deliveryDate;
                /* Adding Getter and Setter methods */
                public String getDeliveryDate(){
                    return deliveryDate;
                }

                /* Adding Getter and Setter methods */
                public void setDeliveryDate(String deliveryDate){
                    this.deliveryDate = deliveryDate;
                    //Update hashMap value..
                    hashMap.put("deliveryDate", deliveryDate);
                }

            
            
        
    
        
            

            
                private String estimatedShipmentDate;
                /* Adding Getter and Setter methods */
                public String getEstimatedShipmentDate(){
                    return estimatedShipmentDate;
                }

                /* Adding Getter and Setter methods */
                public void setEstimatedShipmentDate(String estimatedShipmentDate){
                    this.estimatedShipmentDate = estimatedShipmentDate;
                    //Update hashMap value..
                    hashMap.put("estimatedShipmentDate", estimatedShipmentDate);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      OrderRepository lowercaseFirstLetterRepository = (OrderRepository) getRepository();
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
      OrderRepository lowercaseFirstLetterRepository = (OrderRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      OrderRepository lowercaseFirstLetterRepository = (OrderRepository) getRepository();
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
                    private transient Customer  customer ;
                    private String customerId;

                    public String getCustomerId(){
                         return customerId;
                    }

                    public void setCustomerId(Object customerId){
                        if(customerId != null){
                          this.customerId = customerId.toString();
                        }
                    }

                    public Customer getCustomer() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(customer == null){
                                        OrderRepository orderRepository = (OrderRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = orderRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          customer = getCustomer__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return customer;
                    }

                    public void setCustomer(Customer customer) {
                        this.customer = customer;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCustomer(Map<String, Object> customer) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository customerRepository = new CustomerRepository();
                        Customer customer1 = customerRepository.createObject(customer);
                        setCustomer(customer1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCustomer(HashMap<String, Object> customer) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository customerRepository = new CustomerRepository();
                        Customer customer1 = customerRepository.createObject(customer);
                        setCustomer(customer1);
                    }

                    //Adding relation method..
                    public void addRelation(Customer customer) {
                        that.setCustomer(customer);
                    }


                    //Fetch related data from local database if present a customerId identifier as property for belongsTo
                    public Customer getCustomer__db(SnaphyRestAdapter restAdapter){
                      if(customerId != null){
                        CustomerRepository customerRepository = restAdapter.createRepository(CustomerRepository.class);
                            try{
                            OrderRepository lowercaseFirstLetterRepository = (OrderRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(customerRepository.getDb() == null ){
                                                    customerRepository.addStorage(context);
                                                }

                                                if(context != null && customerRepository.getDb() != null){
                                                    customerRepository.addStorage(context);
                                                    Customer customer = (Customer) customerRepository.getDb().get__db(customerId);
                                                    return customer;
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
                                    public void get__customer( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Customer object) {
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
                    private transient Logistics  logistics ;
                    private String logisticsId;

                    public String getLogisticsId(){
                         return logisticsId;
                    }

                    public void setLogisticsId(Object logisticsId){
                        if(logisticsId != null){
                          this.logisticsId = logisticsId.toString();
                        }
                    }

                    public Logistics getLogistics() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(logistics == null){
                                        OrderRepository orderRepository = (OrderRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = orderRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          logistics = getLogistics__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return logistics;
                    }

                    public void setLogistics(Logistics logistics) {
                        this.logistics = logistics;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setLogistics(Map<String, Object> logistics) {
                        //First create a dummy Repo class object for customer.
                        LogisticsRepository logisticsRepository = new LogisticsRepository();
                        Logistics logistics1 = logisticsRepository.createObject(logistics);
                        setLogistics(logistics1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setLogistics(HashMap<String, Object> logistics) {
                        //First create a dummy Repo class object for customer.
                        LogisticsRepository logisticsRepository = new LogisticsRepository();
                        Logistics logistics1 = logisticsRepository.createObject(logistics);
                        setLogistics(logistics1);
                    }

                    //Adding relation method..
                    public void addRelation(Logistics logistics) {
                        that.setLogistics(logistics);
                    }


                    //Fetch related data from local database if present a logisticsId identifier as property for belongsTo
                    public Logistics getLogistics__db(SnaphyRestAdapter restAdapter){
                      if(logisticsId != null){
                        LogisticsRepository logisticsRepository = restAdapter.createRepository(LogisticsRepository.class);
                            try{
                            OrderRepository lowercaseFirstLetterRepository = (OrderRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(logisticsRepository.getDb() == null ){
                                                    logisticsRepository.addStorage(context);
                                                }

                                                if(context != null && logisticsRepository.getDb() != null){
                                                    logisticsRepository.addStorage(context);
                                                    Logistics logistics = (Logistics) logisticsRepository.getDb().get__db(logisticsId);
                                                    return logistics;
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
                                    public void get__logistics( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Logistics> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.get__logistics( (String)that.getId(), refresh,  new ObjectCallback<Logistics> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Logistics object) {
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
