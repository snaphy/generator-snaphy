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

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;
            
                import com.androidsdk.snaphy.snaphyandroidsdk.models.ProductOrder;
                import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductOrderRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DeliveryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.InvoiceRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    


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

    
        
            

            
                private double orderNumber;
                /* Adding Getter and Setter methods */
                public double getOrderNumber(){
                    return orderNumber;
                }

                /* Adding Getter and Setter methods */
                public void setOrderNumber(double orderNumber){
                    this.orderNumber = orderNumber;
                    //Update hashMap value..
                    hashMap.put("orderNumber", orderNumber);
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

            
            
        
    
        
            

            
                private String special_information;
                /* Adding Getter and Setter methods */
                public String getSpecial_information(){
                    return special_information;
                }

                /* Adding Getter and Setter methods */
                public void setSpecial_information(String special_information){
                    this.special_information = special_information;
                    //Update hashMap value..
                    hashMap.put("special_information", special_information);
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
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Product>  products ;

                    public DataList< Product > getProducts() {
                        //Check for pure case of hasMany
                                                return products;
                    }

                    public void setProducts(DataList<Product> products) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: products){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setProducts1(hashMaps);
                        }else{
                            this.products = products;
                            //TODO: Warning move this to new thread
                            for(Product data: products){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setProducts1(List<Map<String, Object>> products) {
                        //First create a dummy Repo class object for ..
                        ProductRepository productsRepository = new ProductRepository();
                        List<Product> result = new ArrayList<>();
                        for (Map<String, Object> obj : products) {
                            //Also add relation to child type for two way communication..
                            Product obj1 = productsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setProducts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setProducts1(DataList<HashMap<String, Object>> products) {
                        //First create a dummy Repo class object for ..
                        ProductRepository productsRepository = new ProductRepository();
                        DataList<Product> result = new DataList<>();
                        for (HashMap<String, Object> obj : products) {
                            //Also add relation to child type for two way communication..
                            Product obj1 = productsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setProducts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Product> products, Product dummyClassInstance) {
                        that.setProducts(products);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Product products) {
                        try{
                            try{

                                  //Save to database..
                                  products.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getProducts().add(products);
                        }catch(Exception e){
                            DataList< Product> products1 = new DataList();
                            //Now add this item to list..
                            products1.add(products);
                            //Now set data....
                            that.setProducts(products1);
                        }
                    }




                    
                        //Write hasManyThrough def too..
                        private transient DataList<ProductOrder>  productOrder ;

                        public DataList<ProductOrder> getProductOrder() {
                            return productOrder;
                        }

                        public void setProductOrder(DataList<ProductOrder> productOrder) {
                            this.productOrder = productOrder;

                        }

                        //Adding throughRelation method..
                        //Add a dummy class Name object to seperate data..
                        public void addRelation(DataList<ProductOrder> productOrder, ProductOrder dummyClassInstance) {
                            that.setProductOrder(productOrder);

                        }

                        //Adding throughRelation method..
                        //This will add a new data to the list throughRelation object..
                        public void addRelation(ProductOrder productOrder) {
                            try{
                                that.getProductOrder().add(productOrder);
                            }catch(Exception e){
                                DataList< ProductOrder> productOrder1 = new DataList();
                                //Now add this item to list..
                                productOrder1.add(productOrder);
                                //Now set data....
                                that.setProductOrder(productOrder1);
                            }
                        }


                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__products( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.findById__products( (String)that.getId(), fk,  new ObjectCallback<Product> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__products( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.destroyById__products( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__products( String fk,  Product data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.updateById__products( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Product> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void link__products( String fk,  ProductOrder data,  SnaphyRestAdapter restAdapter, final ObjectCallback<ProductOrder> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.link__products( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ProductOrder> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ProductOrder object) {
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
                                    public void unlink__products( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.unlink__products( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__products( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.exists__products( (String)that.getId(), fk,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void get__products( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.get__products( (String)that.getId(), filter,  new DataListCallback<Product> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Product> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          Product obj = new Product();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (Product obj : object) {
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
                                    public void create__products( Product data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.create__products( (String)that.getId(), data.convertMap(),  new ObjectCallback<Product> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__products( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        



                                        orderRepo.delete__products( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__products( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.count__products( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient Delivery  deliveries ;
                    private String deliveryId;

                    public String getDeliveryId(){
                         return deliveryId;
                    }

                    public void setDeliveryId(Object deliveryId){
                        if(deliveryId != null){
                          this.deliveryId = deliveryId.toString();
                        }
                    }

                    public Delivery getDeliveries() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(deliveries == null){
                                        OrderRepository orderRepository = (OrderRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = orderRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          deliveries = getDeliveries__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return deliveries;
                    }

                    public void setDeliveries(Delivery deliveries) {
                        this.deliveries = deliveries;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDeliveries(Map<String, Object> deliveries) {
                        //First create a dummy Repo class object for customer.
                        DeliveryRepository deliveriesRepository = new DeliveryRepository();
                        Delivery deliveries1 = deliveriesRepository.createObject(deliveries);
                        setDeliveries(deliveries1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDeliveries(HashMap<String, Object> deliveries) {
                        //First create a dummy Repo class object for customer.
                        DeliveryRepository deliveriesRepository = new DeliveryRepository();
                        Delivery deliveries1 = deliveriesRepository.createObject(deliveries);
                        setDeliveries(deliveries1);
                    }

                    //Adding relation method..
                    public void addRelation(Delivery deliveries) {
                        that.setDeliveries(deliveries);
                    }


                    //Fetch related data from local database if present a deliveryId identifier as property for belongsTo
                    public Delivery getDeliveries__db(SnaphyRestAdapter restAdapter){
                      if(deliveryId != null){
                        DeliveryRepository deliveriesRepository = restAdapter.createRepository(DeliveryRepository.class);
                            try{
                            OrderRepository lowercaseFirstLetterRepository = (OrderRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(deliveriesRepository.getDb() == null ){
                                                    deliveriesRepository.addStorage(context);
                                                }

                                                if(context != null && deliveriesRepository.getDb() != null){
                                                    deliveriesRepository.addStorage(context);
                                                    Delivery deliveries = (Delivery) deliveriesRepository.getDb().get__db(deliveryId);
                                                    return deliveries;
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
                                    public void get__deliveries( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Delivery> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.get__deliveries( (String)that.getId(), refresh,  new ObjectCallback<Delivery> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Delivery object) {
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
                                    public void create__deliveries( Delivery data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Delivery> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.create__deliveries( (String)that.getId(), data.convertMap(),  new ObjectCallback<Delivery> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Delivery object) {
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
                                    public void update__deliveries( Delivery data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Delivery> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.update__deliveries( (String)that.getId(), data.convertMap(),  new ObjectCallback<Delivery> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Delivery object) {
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
                                    public void destroy__deliveries( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        



                                        orderRepo.destroy__deliveries( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Invoice  invoices ;
                    private String invoiceId;

                    public String getInvoiceId(){
                         return invoiceId;
                    }

                    public void setInvoiceId(Object invoiceId){
                        if(invoiceId != null){
                          this.invoiceId = invoiceId.toString();
                        }
                    }

                    public Invoice getInvoices() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(invoices == null){
                                        OrderRepository orderRepository = (OrderRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = orderRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          invoices = getInvoices__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return invoices;
                    }

                    public void setInvoices(Invoice invoices) {
                        this.invoices = invoices;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setInvoices(Map<String, Object> invoices) {
                        //First create a dummy Repo class object for customer.
                        InvoiceRepository invoicesRepository = new InvoiceRepository();
                        Invoice invoices1 = invoicesRepository.createObject(invoices);
                        setInvoices(invoices1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setInvoices(HashMap<String, Object> invoices) {
                        //First create a dummy Repo class object for customer.
                        InvoiceRepository invoicesRepository = new InvoiceRepository();
                        Invoice invoices1 = invoicesRepository.createObject(invoices);
                        setInvoices(invoices1);
                    }

                    //Adding relation method..
                    public void addRelation(Invoice invoices) {
                        that.setInvoices(invoices);
                    }


                    //Fetch related data from local database if present a invoiceId identifier as property for belongsTo
                    public Invoice getInvoices__db(SnaphyRestAdapter restAdapter){
                      if(invoiceId != null){
                        InvoiceRepository invoicesRepository = restAdapter.createRepository(InvoiceRepository.class);
                            try{
                            OrderRepository lowercaseFirstLetterRepository = (OrderRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(invoicesRepository.getDb() == null ){
                                                    invoicesRepository.addStorage(context);
                                                }

                                                if(context != null && invoicesRepository.getDb() != null){
                                                    invoicesRepository.addStorage(context);
                                                    Invoice invoices = (Invoice) invoicesRepository.getDb().get__db(invoiceId);
                                                    return invoices;
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
                                    public void get__invoices( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.get__invoices( (String)that.getId(), refresh,  new ObjectCallback<Invoice> (){
                                            

                                            
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
                                    public void create__invoices( Invoice data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.create__invoices( (String)that.getId(), data.convertMap(),  new ObjectCallback<Invoice> (){
                                            

                                            
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
                                    public void update__invoices( Invoice data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        orderRepo.update__invoices( (String)that.getId(), data.convertMap(),  new ObjectCallback<Invoice> (){
                                            

                                            
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
                                    public void destroy__invoices( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OrderRepository  orderRepo = restAdapter.createRepository(OrderRepository.class);
                                        
                                        



                                        orderRepo.destroy__invoices( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
