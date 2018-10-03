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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.DeliveryRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Delivery extends Model {


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

    private Delivery that ;

    public Delivery (){
        that = this;
    }

    
        
            

            
                private String delivery_date;
                /* Adding Getter and Setter methods */
                public String getDelivery_date(){
                    return delivery_date;
                }

                /* Adding Getter and Setter methods */
                public void setDelivery_date(String delivery_date){
                    this.delivery_date = delivery_date;
                    //Update hashMap value..
                    hashMap.put("delivery_date", delivery_date);
                }

            
            
        
    
        
            

            
                private String delivery_time;
                /* Adding Getter and Setter methods */
                public String getDelivery_time(){
                    return delivery_time;
                }

                /* Adding Getter and Setter methods */
                public void setDelivery_time(String delivery_time){
                    this.delivery_time = delivery_time;
                    //Update hashMap value..
                    hashMap.put("delivery_time", delivery_time);
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
      DeliveryRepository lowercaseFirstLetterRepository = (DeliveryRepository) getRepository();
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
      DeliveryRepository lowercaseFirstLetterRepository = (DeliveryRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      DeliveryRepository lowercaseFirstLetterRepository = (DeliveryRepository) getRepository();
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
                                        DeliveryRepository deliveryRepository = (DeliveryRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = deliveryRepository.getRestAdapter();
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
                            DeliveryRepository lowercaseFirstLetterRepository = (DeliveryRepository) getRepository();
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
                                        final DeliveryRepository  deliveryRepo = restAdapter.createRepository(DeliveryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        deliveryRepo.get__order( (String)that.getId(), refresh,  new ObjectCallback<Order> (){
                                            

                                            
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
