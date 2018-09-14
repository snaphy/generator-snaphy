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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ReferRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Refer extends Model {


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

    private Refer that ;

    public Refer (){
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

            
            
        
    
        
            

            
                private String referCode;
                /* Adding Getter and Setter methods */
                public String getReferCode(){
                    return referCode;
                }

                /* Adding Getter and Setter methods */
                public void setReferCode(String referCode){
                    this.referCode = referCode;
                    //Update hashMap value..
                    hashMap.put("referCode", referCode);
                }

            
            
        
    
        
            

            
                private String points;
                /* Adding Getter and Setter methods */
                public String getPoints(){
                    return points;
                }

                /* Adding Getter and Setter methods */
                public void setPoints(String points){
                    this.points = points;
                    //Update hashMap value..
                    hashMap.put("points", points);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ReferRepository lowercaseFirstLetterRepository = (ReferRepository) getRepository();
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
      ReferRepository lowercaseFirstLetterRepository = (ReferRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ReferRepository lowercaseFirstLetterRepository = (ReferRepository) getRepository();
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
                    private transient Customer  referBy ;
                    private String customerId;

                    public String getCustomerId(){
                         return customerId;
                    }

                    public void setCustomerId(Object customerId){
                        if(customerId != null){
                          this.customerId = customerId.toString();
                        }
                    }

                    public Customer getReferBy() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(referBy == null){
                                        ReferRepository referRepository = (ReferRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = referRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          referBy = getReferBy__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return referBy;
                    }

                    public void setReferBy(Customer referBy) {
                        this.referBy = referBy;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setReferBy(Map<String, Object> referBy) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository referByRepository = new CustomerRepository();
                        Customer referBy1 = referByRepository.createObject(referBy);
                        setReferBy(referBy1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setReferBy(HashMap<String, Object> referBy) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository referByRepository = new CustomerRepository();
                        Customer referBy1 = referByRepository.createObject(referBy);
                        setReferBy(referBy1);
                    }

                    //Adding relation method..
                    public void addRelation(Customer referBy) {
                        that.setReferBy(referBy);
                    }


                    //Fetch related data from local database if present a customerId identifier as property for belongsTo
                    public Customer getReferBy__db(SnaphyRestAdapter restAdapter){
                      if(customerId != null){
                        CustomerRepository referByRepository = restAdapter.createRepository(CustomerRepository.class);
                            try{
                            ReferRepository lowercaseFirstLetterRepository = (ReferRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(referByRepository.getDb() == null ){
                                                    referByRepository.addStorage(context);
                                                }

                                                if(context != null && referByRepository.getDb() != null){
                                                    referByRepository.addStorage(context);
                                                    Customer referBy = (Customer) referByRepository.getDb().get__db(customerId);
                                                    return referBy;
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
                                    public void get__referBy( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ReferRepository  referRepo = restAdapter.createRepository(ReferRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        referRepo.get__referBy( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
                    private transient Customer  referTo ;
                    private String customerId;

                    public String getCustomerId(){
                         return customerId;
                    }

                    public void setCustomerId(Object customerId){
                        if(customerId != null){
                          this.customerId = customerId.toString();
                        }
                    }

                    public Customer getReferTo() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(referTo == null){
                                        ReferRepository referRepository = (ReferRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = referRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          referTo = getReferTo__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return referTo;
                    }

                    public void setReferTo(Customer referTo) {
                        this.referTo = referTo;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setReferTo(Map<String, Object> referTo) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository referToRepository = new CustomerRepository();
                        Customer referTo1 = referToRepository.createObject(referTo);
                        setReferTo(referTo1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setReferTo(HashMap<String, Object> referTo) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository referToRepository = new CustomerRepository();
                        Customer referTo1 = referToRepository.createObject(referTo);
                        setReferTo(referTo1);
                    }

                    //Adding relation method..
                    public void addRelation(Customer referTo) {
                        that.setReferTo(referTo);
                    }


                    //Fetch related data from local database if present a customerId identifier as property for belongsTo
                    public Customer getReferTo__db(SnaphyRestAdapter restAdapter){
                      if(customerId != null){
                        CustomerRepository referToRepository = restAdapter.createRepository(CustomerRepository.class);
                            try{
                            ReferRepository lowercaseFirstLetterRepository = (ReferRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(referToRepository.getDb() == null ){
                                                    referToRepository.addStorage(context);
                                                }

                                                if(context != null && referToRepository.getDb() != null){
                                                    referToRepository.addStorage(context);
                                                    Customer referTo = (Customer) referToRepository.getDb().get__db(customerId);
                                                    return referTo;
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
                                    public void get__referTo( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ReferRepository  referRepo = restAdapter.createRepository(ReferRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        referRepo.get__referTo( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
