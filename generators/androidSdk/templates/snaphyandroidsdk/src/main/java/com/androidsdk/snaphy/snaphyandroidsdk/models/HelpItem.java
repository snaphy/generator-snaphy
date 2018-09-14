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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.HelpItemRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class HelpItem extends Model {


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

    private HelpItem that ;

    public HelpItem (){
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

            
            
        
    
        
            

            
                private String message;
                /* Adding Getter and Setter methods */
                public String getMessage(){
                    return message;
                }

                /* Adding Getter and Setter methods */
                public void setMessage(String message){
                    this.message = message;
                    //Update hashMap value..
                    hashMap.put("message", message);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      HelpItemRepository lowercaseFirstLetterRepository = (HelpItemRepository) getRepository();
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
      HelpItemRepository lowercaseFirstLetterRepository = (HelpItemRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      HelpItemRepository lowercaseFirstLetterRepository = (HelpItemRepository) getRepository();
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
                    private transient Customer  to ;
                    private String customerId;

                    public String getCustomerId(){
                         return customerId;
                    }

                    public void setCustomerId(Object customerId){
                        if(customerId != null){
                          this.customerId = customerId.toString();
                        }
                    }

                    public Customer getTo() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(to == null){
                                        HelpItemRepository helpItemRepository = (HelpItemRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = helpItemRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          to = getTo__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return to;
                    }

                    public void setTo(Customer to) {
                        this.to = to;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTo(Map<String, Object> to) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository toRepository = new CustomerRepository();
                        Customer to1 = toRepository.createObject(to);
                        setTo(to1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTo(HashMap<String, Object> to) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository toRepository = new CustomerRepository();
                        Customer to1 = toRepository.createObject(to);
                        setTo(to1);
                    }

                    //Adding relation method..
                    public void addRelation(Customer to) {
                        that.setTo(to);
                    }


                    //Fetch related data from local database if present a customerId identifier as property for belongsTo
                    public Customer getTo__db(SnaphyRestAdapter restAdapter){
                      if(customerId != null){
                        CustomerRepository toRepository = restAdapter.createRepository(CustomerRepository.class);
                            try{
                            HelpItemRepository lowercaseFirstLetterRepository = (HelpItemRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(toRepository.getDb() == null ){
                                                    toRepository.addStorage(context);
                                                }

                                                if(context != null && toRepository.getDb() != null){
                                                    toRepository.addStorage(context);
                                                    Customer to = (Customer) toRepository.getDb().get__db(customerId);
                                                    return to;
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
                                    public void get__to( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HelpItemRepository  helpItemRepo = restAdapter.createRepository(HelpItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        helpItemRepo.get__to( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
                    private transient Customer  from ;
                    private String customerId;

                    public String getCustomerId(){
                         return customerId;
                    }

                    public void setCustomerId(Object customerId){
                        if(customerId != null){
                          this.customerId = customerId.toString();
                        }
                    }

                    public Customer getFrom() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(from == null){
                                        HelpItemRepository helpItemRepository = (HelpItemRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = helpItemRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          from = getFrom__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return from;
                    }

                    public void setFrom(Customer from) {
                        this.from = from;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setFrom(Map<String, Object> from) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository fromRepository = new CustomerRepository();
                        Customer from1 = fromRepository.createObject(from);
                        setFrom(from1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setFrom(HashMap<String, Object> from) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository fromRepository = new CustomerRepository();
                        Customer from1 = fromRepository.createObject(from);
                        setFrom(from1);
                    }

                    //Adding relation method..
                    public void addRelation(Customer from) {
                        that.setFrom(from);
                    }


                    //Fetch related data from local database if present a customerId identifier as property for belongsTo
                    public Customer getFrom__db(SnaphyRestAdapter restAdapter){
                      if(customerId != null){
                        CustomerRepository fromRepository = restAdapter.createRepository(CustomerRepository.class);
                            try{
                            HelpItemRepository lowercaseFirstLetterRepository = (HelpItemRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(fromRepository.getDb() == null ){
                                                    fromRepository.addStorage(context);
                                                }

                                                if(context != null && fromRepository.getDb() != null){
                                                    fromRepository.addStorage(context);
                                                    Customer from = (Customer) fromRepository.getDb().get__db(customerId);
                                                    return from;
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
                                    public void get__from( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HelpItemRepository  helpItemRepo = restAdapter.createRepository(HelpItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        helpItemRepo.get__from( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
                                        HelpItemRepository helpItemRepository = (HelpItemRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = helpItemRepository.getRestAdapter();
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
                            HelpItemRepository lowercaseFirstLetterRepository = (HelpItemRepository) getRepository();
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
                                        final HelpItemRepository  helpItemRepo = restAdapter.createRepository(HelpItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        helpItemRepo.get__order( (String)that.getId(), refresh,  new ObjectCallback<Order> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
