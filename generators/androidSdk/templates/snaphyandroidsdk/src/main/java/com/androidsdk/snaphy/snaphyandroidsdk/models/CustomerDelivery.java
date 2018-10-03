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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerDeliveryRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AreaRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class CustomerDelivery extends Model {


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

    private CustomerDelivery that ;

    public CustomerDelivery (){
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

            
            
        
    
        
            

            
                private String dateOfDelivery;
                /* Adding Getter and Setter methods */
                public String getDateOfDelivery(){
                    return dateOfDelivery;
                }

                /* Adding Getter and Setter methods */
                public void setDateOfDelivery(String dateOfDelivery){
                    this.dateOfDelivery = dateOfDelivery;
                    //Update hashMap value..
                    hashMap.put("dateOfDelivery", dateOfDelivery);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> orderList;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getOrderList(){
                    return orderList;
                }

                /* Adding Getter and Setter methods */
                public void setOrderList(DataList<Map<String, Object>> orderList){
                    this.orderList = orderList;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("orderList", orderList);
                }

            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      CustomerDeliveryRepository lowercaseFirstLetterRepository = (CustomerDeliveryRepository) getRepository();
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
      CustomerDeliveryRepository lowercaseFirstLetterRepository = (CustomerDeliveryRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CustomerDeliveryRepository lowercaseFirstLetterRepository = (CustomerDeliveryRepository) getRepository();
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
                                        CustomerDeliveryRepository customerDeliveryRepository = (CustomerDeliveryRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = customerDeliveryRepository.getRestAdapter();
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
                            CustomerDeliveryRepository lowercaseFirstLetterRepository = (CustomerDeliveryRepository) getRepository();
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
                                        final CustomerDeliveryRepository  customerDeliveryRepo = restAdapter.createRepository(CustomerDeliveryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerDeliveryRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
                                        CustomerDeliveryRepository customerDeliveryRepository = (CustomerDeliveryRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = customerDeliveryRepository.getRestAdapter();
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
                            CustomerDeliveryRepository lowercaseFirstLetterRepository = (CustomerDeliveryRepository) getRepository();
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
                                        final CustomerDeliveryRepository  customerDeliveryRepo = restAdapter.createRepository(CustomerDeliveryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerDeliveryRepo.get__city( (String)that.getId(), refresh,  new ObjectCallback<City> (){
                                            

                                            
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
                                        CustomerDeliveryRepository customerDeliveryRepository = (CustomerDeliveryRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = customerDeliveryRepository.getRestAdapter();
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
                            CustomerDeliveryRepository lowercaseFirstLetterRepository = (CustomerDeliveryRepository) getRepository();
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
                                        final CustomerDeliveryRepository  customerDeliveryRepo = restAdapter.createRepository(CustomerDeliveryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerDeliveryRepo.get__area( (String)that.getId(), refresh,  new ObjectCallback<Area> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
