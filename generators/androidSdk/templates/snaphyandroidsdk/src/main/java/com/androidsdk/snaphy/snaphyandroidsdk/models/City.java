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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CityRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AreaRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NotificationDataRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class City extends Model {


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

    private City that ;

    public City (){
        that = this;
    }

    
        
            

            
                private String name;
                /* Adding Getter and Setter methods */
                public String getName(){
                    return name;
                }

                /* Adding Getter and Setter methods */
                public void setName(String name){
                    this.name = name;
                    //Update hashMap value..
                    hashMap.put("name", name);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      CityRepository lowercaseFirstLetterRepository = (CityRepository) getRepository();
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
      CityRepository lowercaseFirstLetterRepository = (CityRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CityRepository lowercaseFirstLetterRepository = (CityRepository) getRepository();
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
                    private transient DataList<Customer>  customers ;

                    public DataList< Customer > getCustomers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            CustomerRepository customerRepository = (CustomerRepository) getRepository();

                            if(that.getId() != null && customerRepository.getDb() != null){

                                 //Fetch locally from db
                                 //customers = getCustomers__db(restAdapter);
                                 // Getting single cont
                                 customers = customerRepository.getDb().getAll__db("cityId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return customers;
                    }

                    public void setCustomers(DataList<Customer> customers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: customers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setCustomers1(hashMaps);
                        }else{
                            this.customers = customers;
                            //TODO: Warning move this to new thread
                            for(Customer data: customers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCustomers1(List<Map<String, Object>> customers) {
                        //First create a dummy Repo class object for ..
                        CustomerRepository customersRepository = new CustomerRepository();
                        List<Customer> result = new ArrayList<>();
                        for (Map<String, Object> obj : customers) {
                            //Also add relation to child type for two way communication..
                            Customer obj1 = customersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCustomers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCustomers1(DataList<HashMap<String, Object>> customers) {
                        //First create a dummy Repo class object for ..
                        CustomerRepository customersRepository = new CustomerRepository();
                        DataList<Customer> result = new DataList<>();
                        for (HashMap<String, Object> obj : customers) {
                            //Also add relation to child type for two way communication..
                            Customer obj1 = customersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCustomers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Customer> customers, Customer dummyClassInstance) {
                        that.setCustomers(customers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Customer customers) {
                        try{
                            try{

                                  //Save to database..
                                  customers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getCustomers().add(customers);
                        }catch(Exception e){
                            DataList< Customer> customers1 = new DataList();
                            //Now add this item to list..
                            customers1.add(customers);
                            //Now set data....
                            that.setCustomers(customers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__customers( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.findById__customers( (String)that.getId(), fk,  new ObjectCallback<Customer> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__customers( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.destroyById__customers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__customers( String fk,  Customer data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.updateById__customers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Customer> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__customers( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.get__customers( (String)that.getId(), filter,  new DataListCallback<Customer> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Customer> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          Customer obj = new Customer();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (Customer obj : object) {
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
                                    public void create__customers( Customer data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.create__customers( (String)that.getId(), data.convertMap(),  new ObjectCallback<Customer> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__customers( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        



                                        cityRepo.delete__customers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__customers( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.count__customers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Area>  areas ;

                    public DataList< Area > getAreas() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            AreaRepository areaRepository = (AreaRepository) getRepository();

                            if(that.getId() != null && areaRepository.getDb() != null){

                                 //Fetch locally from db
                                 //areas = getAreas__db(restAdapter);
                                 // Getting single cont
                                 areas = areaRepository.getDb().getAll__db("cityId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return areas;
                    }

                    public void setAreas(DataList<Area> areas) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: areas){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setAreas1(hashMaps);
                        }else{
                            this.areas = areas;
                            //TODO: Warning move this to new thread
                            for(Area data: areas){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAreas1(List<Map<String, Object>> areas) {
                        //First create a dummy Repo class object for ..
                        AreaRepository areasRepository = new AreaRepository();
                        List<Area> result = new ArrayList<>();
                        for (Map<String, Object> obj : areas) {
                            //Also add relation to child type for two way communication..
                            Area obj1 = areasRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAreas(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAreas1(DataList<HashMap<String, Object>> areas) {
                        //First create a dummy Repo class object for ..
                        AreaRepository areasRepository = new AreaRepository();
                        DataList<Area> result = new DataList<>();
                        for (HashMap<String, Object> obj : areas) {
                            //Also add relation to child type for two way communication..
                            Area obj1 = areasRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAreas(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Area> areas, Area dummyClassInstance) {
                        that.setAreas(areas);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Area areas) {
                        try{
                            try{

                                  //Save to database..
                                  areas.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getAreas().add(areas);
                        }catch(Exception e){
                            DataList< Area> areas1 = new DataList();
                            //Now add this item to list..
                            areas1.add(areas);
                            //Now set data....
                            that.setAreas(areas1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__areas( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.findById__areas( (String)that.getId(), fk,  new ObjectCallback<Area> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__areas( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.destroyById__areas( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__areas( String fk,  Area data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.updateById__areas( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Area> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__areas( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.get__areas( (String)that.getId(), filter,  new DataListCallback<Area> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Area> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          Area obj = new Area();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (Area obj : object) {
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
                                    public void create__areas( Area data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.create__areas( (String)that.getId(), data.convertMap(),  new ObjectCallback<Area> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__areas( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        



                                        cityRepo.delete__areas( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__areas( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.count__areas( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 notificationData = notificationDataRepository.getDb().getAll__db("cityId", that.getId().toString());

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
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.findById__notificationData( (String)that.getId(), fk,  new ObjectCallback<NotificationData> (){
                                            

                                            
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
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.destroyById__notificationData( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.updateById__notificationData( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<NotificationData> (){
                                            

                                            
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
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.get__notificationData( (String)that.getId(), filter,  new DataListCallback<NotificationData> (){
                                            

                                            


                                            
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
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.create__notificationData( (String)that.getId(), data.convertMap(),  new ObjectCallback<NotificationData> (){
                                            

                                            
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
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        



                                        cityRepo.delete__notificationData( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final CityRepository  cityRepo = restAdapter.createRepository(CityRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        cityRepo.count__notificationData( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
