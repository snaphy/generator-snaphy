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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AddressRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Address extends Model {


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

    private Address that ;

    public Address (){
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

            
            
        
    
        
            

            
                private double shopNumber;
                /* Adding Getter and Setter methods */
                public double getShopNumber(){
                    return shopNumber;
                }

                /* Adding Getter and Setter methods */
                public void setShopNumber(double shopNumber){
                    this.shopNumber = shopNumber;
                    //Update hashMap value..
                    hashMap.put("shopNumber", shopNumber);
                }

            
            
        
    
        
            

            
                private String shopName;
                /* Adding Getter and Setter methods */
                public String getShopName(){
                    return shopName;
                }

                /* Adding Getter and Setter methods */
                public void setShopName(String shopName){
                    this.shopName = shopName;
                    //Update hashMap value..
                    hashMap.put("shopName", shopName);
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

            
            
        
    
        
            

            
                private String area;
                /* Adding Getter and Setter methods */
                public String getArea(){
                    return area;
                }

                /* Adding Getter and Setter methods */
                public void setArea(String area){
                    this.area = area;
                    //Update hashMap value..
                    hashMap.put("area", area);
                }

            
            
        
    
        
            

            
                private String locality;
                /* Adding Getter and Setter methods */
                public String getLocality(){
                    return locality;
                }

                /* Adding Getter and Setter methods */
                public void setLocality(String locality){
                    this.locality = locality;
                    //Update hashMap value..
                    hashMap.put("locality", locality);
                }

            
            
        
    
        
            

            
                private String city;
                /* Adding Getter and Setter methods */
                public String getCity(){
                    return city;
                }

                /* Adding Getter and Setter methods */
                public void setCity(String city){
                    this.city = city;
                    //Update hashMap value..
                    hashMap.put("city", city);
                }

            
            
        
    
        
            

            
                private double pincode;
                /* Adding Getter and Setter methods */
                public double getPincode(){
                    return pincode;
                }

                /* Adding Getter and Setter methods */
                public void setPincode(double pincode){
                    this.pincode = pincode;
                    //Update hashMap value..
                    hashMap.put("pincode", pincode);
                }

            
            
        
    
        
            

            
                private String state;
                /* Adding Getter and Setter methods */
                public String getState(){
                    return state;
                }

                /* Adding Getter and Setter methods */
                public void setState(String state){
                    this.state = state;
                    //Update hashMap value..
                    hashMap.put("state", state);
                }

            
            
        
    
        
            

            
                private Map<String, Object> location;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getLocation(){
                    return location;
                }

                /* Adding Getter and Setter methods */
                public void setLocation(Map<String, Object> location){
                    this.location = location;
                    //Update Map value..
                    hashMap.put("location", location);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      AddressRepository lowercaseFirstLetterRepository = (AddressRepository) getRepository();
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
      AddressRepository lowercaseFirstLetterRepository = (AddressRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      AddressRepository lowercaseFirstLetterRepository = (AddressRepository) getRepository();
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
                                        AddressRepository addressRepository = (AddressRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = addressRepository.getRestAdapter();
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
                            AddressRepository lowercaseFirstLetterRepository = (AddressRepository) getRepository();
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
                                        final AddressRepository  addressRepo = restAdapter.createRepository(AddressRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        addressRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
