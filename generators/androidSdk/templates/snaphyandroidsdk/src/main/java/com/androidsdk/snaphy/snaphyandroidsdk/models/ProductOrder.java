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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductOrderRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderSampleRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class ProductOrder extends Model {


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

    private ProductOrder that ;

    public ProductOrder (){
        that = this;
    }

    
        
            

            
                private double quantity;
                /* Adding Getter and Setter methods */
                public double getQuantity(){
                    return quantity;
                }

                /* Adding Getter and Setter methods */
                public void setQuantity(double quantity){
                    this.quantity = quantity;
                    //Update hashMap value..
                    hashMap.put("quantity", quantity);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ProductOrderRepository lowercaseFirstLetterRepository = (ProductOrderRepository) getRepository();
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
      ProductOrderRepository lowercaseFirstLetterRepository = (ProductOrderRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ProductOrderRepository lowercaseFirstLetterRepository = (ProductOrderRepository) getRepository();
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
                                        ProductOrderRepository productOrderRepository = (ProductOrderRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = productOrderRepository.getRestAdapter();
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
                    public Product getProduct__db(SnaphyRestAdapter restAdapter){
                      if(productId != null){
                        ProductRepository productRepository = restAdapter.createRepository(ProductRepository.class);
                            try{
                            ProductOrderRepository lowercaseFirstLetterRepository = (ProductOrderRepository) getRepository();
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
                                    public void get__product( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductOrderRepository  productOrderRepo = restAdapter.createRepository(ProductOrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productOrderRepo.get__product( (String)that.getId(), refresh,  new ObjectCallback<Product> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Product object) {
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
                    private transient OrderSample  orderSample ;
                    private String orderSampleId;

                    public String getOrderSampleId(){
                         return orderSampleId;
                    }

                    public void setOrderSampleId(Object orderSampleId){
                        if(orderSampleId != null){
                          this.orderSampleId = orderSampleId.toString();
                        }
                    }

                    public OrderSample getOrderSample() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(orderSample == null){
                                        ProductOrderRepository productOrderRepository = (ProductOrderRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = productOrderRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          orderSample = getOrderSample__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return orderSample;
                    }

                    public void setOrderSample(OrderSample orderSample) {
                        this.orderSample = orderSample;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOrderSample(Map<String, Object> orderSample) {
                        //First create a dummy Repo class object for customer.
                        OrderSampleRepository orderSampleRepository = new OrderSampleRepository();
                        OrderSample orderSample1 = orderSampleRepository.createObject(orderSample);
                        setOrderSample(orderSample1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOrderSample(HashMap<String, Object> orderSample) {
                        //First create a dummy Repo class object for customer.
                        OrderSampleRepository orderSampleRepository = new OrderSampleRepository();
                        OrderSample orderSample1 = orderSampleRepository.createObject(orderSample);
                        setOrderSample(orderSample1);
                    }

                    //Adding relation method..
                    public void addRelation(OrderSample orderSample) {
                        that.setOrderSample(orderSample);
                    }


                    //Fetch related data from local database if present a orderSampleId identifier as property for belongsTo
                    public OrderSample getOrderSample__db(SnaphyRestAdapter restAdapter){
                      if(orderSampleId != null){
                        OrderSampleRepository orderSampleRepository = restAdapter.createRepository(OrderSampleRepository.class);
                            try{
                            ProductOrderRepository lowercaseFirstLetterRepository = (ProductOrderRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(orderSampleRepository.getDb() == null ){
                                                    orderSampleRepository.addStorage(context);
                                                }

                                                if(context != null && orderSampleRepository.getDb() != null){
                                                    orderSampleRepository.addStorage(context);
                                                    OrderSample orderSample = (OrderSample) orderSampleRepository.getDb().get__db(orderSampleId);
                                                    return orderSample;
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
                                    public void get__orderSample( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<OrderSample> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductOrderRepository  productOrderRepo = restAdapter.createRepository(ProductOrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productOrderRepo.get__orderSample( (String)that.getId(), refresh,  new ObjectCallback<OrderSample> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
