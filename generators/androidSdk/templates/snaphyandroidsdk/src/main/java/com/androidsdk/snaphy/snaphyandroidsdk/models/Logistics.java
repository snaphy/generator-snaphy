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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.LogisticsRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.LogisticPartnerRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Logistics extends Model {


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

    private Logistics that ;

    public Logistics (){
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

            
            
        
    
        
            

            
                private String courierInfo;
                /* Adding Getter and Setter methods */
                public String getCourierInfo(){
                    return courierInfo;
                }

                /* Adding Getter and Setter methods */
                public void setCourierInfo(String courierInfo){
                    this.courierInfo = courierInfo;
                    //Update hashMap value..
                    hashMap.put("courierInfo", courierInfo);
                }

            
            
        
    
        
            

            
                private String reasonforCancellation;
                /* Adding Getter and Setter methods */
                public String getReasonforCancellation(){
                    return reasonforCancellation;
                }

                /* Adding Getter and Setter methods */
                public void setReasonforCancellation(String reasonforCancellation){
                    this.reasonforCancellation = reasonforCancellation;
                    //Update hashMap value..
                    hashMap.put("reasonforCancellation", reasonforCancellation);
                }

            
            
        
    
        
            

            
                private String internalHandler;
                /* Adding Getter and Setter methods */
                public String getInternalHandler(){
                    return internalHandler;
                }

                /* Adding Getter and Setter methods */
                public void setInternalHandler(String internalHandler){
                    this.internalHandler = internalHandler;
                    //Update hashMap value..
                    hashMap.put("internalHandler", internalHandler);
                }

            
            
        
    
        
            

            
                private String remarks;
                /* Adding Getter and Setter methods */
                public String getRemarks(){
                    return remarks;
                }

                /* Adding Getter and Setter methods */
                public void setRemarks(String remarks){
                    this.remarks = remarks;
                    //Update hashMap value..
                    hashMap.put("remarks", remarks);
                }

            
            
        
    
        
            

            
                private String estimatedTime;
                /* Adding Getter and Setter methods */
                public String getEstimatedTime(){
                    return estimatedTime;
                }

                /* Adding Getter and Setter methods */
                public void setEstimatedTime(String estimatedTime){
                    this.estimatedTime = estimatedTime;
                    //Update hashMap value..
                    hashMap.put("estimatedTime", estimatedTime);
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      LogisticsRepository lowercaseFirstLetterRepository = (LogisticsRepository) getRepository();
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
      LogisticsRepository lowercaseFirstLetterRepository = (LogisticsRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      LogisticsRepository lowercaseFirstLetterRepository = (LogisticsRepository) getRepository();
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
                    private transient Order  order ;
                    private String orderId;

                    public String getOrderId(){
                         return orderId;
                    }

                    public void setOrderId(Object orderId){
                        if(orderId != null){
                          this.orderId = orderId.toString();
                        }
                    }

                    public Order getOrder() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(order == null){
                                        LogisticsRepository logisticsRepository = (LogisticsRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = logisticsRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          order = getOrder__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return order;
                    }

                    public void setOrder(Order order) {
                        this.order = order;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOrder(Map<String, Object> order) {
                        //First create a dummy Repo class object for customer.
                        OrderRepository orderRepository = new OrderRepository();
                        Order order1 = orderRepository.createObject(order);
                        setOrder(order1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOrder(HashMap<String, Object> order) {
                        //First create a dummy Repo class object for customer.
                        OrderRepository orderRepository = new OrderRepository();
                        Order order1 = orderRepository.createObject(order);
                        setOrder(order1);
                    }

                    //Adding relation method..
                    public void addRelation(Order order) {
                        that.setOrder(order);
                    }


                    //Fetch related data from local database if present a orderId identifier as property for belongsTo
                    public Order getOrder__db(SnaphyRestAdapter restAdapter){
                      if(orderId != null){
                        OrderRepository orderRepository = restAdapter.createRepository(OrderRepository.class);
                            try{
                            LogisticsRepository lowercaseFirstLetterRepository = (LogisticsRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(orderRepository.getDb() == null ){
                                                    orderRepository.addStorage(context);
                                                }

                                                if(context != null && orderRepository.getDb() != null){
                                                    orderRepository.addStorage(context);
                                                    Order order = (Order) orderRepository.getDb().get__db(orderId);
                                                    return order;
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
                                    public void get__order( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Order> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final LogisticsRepository  logisticsRepo = restAdapter.createRepository(LogisticsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        logisticsRepo.get__order( (String)that.getId(), refresh,  new ObjectCallback<Order> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Order object) {
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
                    private transient LogisticPartner  logisticPartner ;
                    private String logisticPartnerId;

                    public String getLogisticPartnerId(){
                         return logisticPartnerId;
                    }

                    public void setLogisticPartnerId(Object logisticPartnerId){
                        if(logisticPartnerId != null){
                          this.logisticPartnerId = logisticPartnerId.toString();
                        }
                    }

                    public LogisticPartner getLogisticPartner() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(logisticPartner == null){
                                        LogisticsRepository logisticsRepository = (LogisticsRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = logisticsRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          logisticPartner = getLogisticPartner__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return logisticPartner;
                    }

                    public void setLogisticPartner(LogisticPartner logisticPartner) {
                        this.logisticPartner = logisticPartner;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setLogisticPartner(Map<String, Object> logisticPartner) {
                        //First create a dummy Repo class object for customer.
                        LogisticPartnerRepository logisticPartnerRepository = new LogisticPartnerRepository();
                        LogisticPartner logisticPartner1 = logisticPartnerRepository.createObject(logisticPartner);
                        setLogisticPartner(logisticPartner1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setLogisticPartner(HashMap<String, Object> logisticPartner) {
                        //First create a dummy Repo class object for customer.
                        LogisticPartnerRepository logisticPartnerRepository = new LogisticPartnerRepository();
                        LogisticPartner logisticPartner1 = logisticPartnerRepository.createObject(logisticPartner);
                        setLogisticPartner(logisticPartner1);
                    }

                    //Adding relation method..
                    public void addRelation(LogisticPartner logisticPartner) {
                        that.setLogisticPartner(logisticPartner);
                    }


                    //Fetch related data from local database if present a logisticPartnerId identifier as property for belongsTo
                    public LogisticPartner getLogisticPartner__db(SnaphyRestAdapter restAdapter){
                      if(logisticPartnerId != null){
                        LogisticPartnerRepository logisticPartnerRepository = restAdapter.createRepository(LogisticPartnerRepository.class);
                            try{
                            LogisticsRepository lowercaseFirstLetterRepository = (LogisticsRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(logisticPartnerRepository.getDb() == null ){
                                                    logisticPartnerRepository.addStorage(context);
                                                }

                                                if(context != null && logisticPartnerRepository.getDb() != null){
                                                    logisticPartnerRepository.addStorage(context);
                                                    LogisticPartner logisticPartner = (LogisticPartner) logisticPartnerRepository.getDb().get__db(logisticPartnerId);
                                                    return logisticPartner;
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
                                    public void get__logisticPartner( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<LogisticPartner> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final LogisticsRepository  logisticsRepo = restAdapter.createRepository(LogisticsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        logisticsRepo.get__logisticPartner( (String)that.getId(), refresh,  new ObjectCallback<LogisticPartner> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(LogisticPartner object) {
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
