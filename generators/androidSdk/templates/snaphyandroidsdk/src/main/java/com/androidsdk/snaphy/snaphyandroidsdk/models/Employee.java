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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AreaRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NotificationDataRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Employee extends User {


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

    private Employee that ;

    public Employee (){
        that = this;
    }

    
        
            

            
                private String firstName;
                /* Adding Getter and Setter methods */
                public String getFirstName(){
                    return firstName;
                }

                /* Adding Getter and Setter methods */
                public void setFirstName(String firstName){
                    this.firstName = firstName;
                    //Update hashMap value..
                    hashMap.put("firstName", firstName);
                }

            
            
        
    
        
            

            
                private String lastName;
                /* Adding Getter and Setter methods */
                public String getLastName(){
                    return lastName;
                }

                /* Adding Getter and Setter methods */
                public void setLastName(String lastName){
                    this.lastName = lastName;
                    //Update hashMap value..
                    hashMap.put("lastName", lastName);
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

            
            
        
    
        
            

            
                private String email;
                /* Adding Getter and Setter methods */
                public String getEmail(){
                    return email;
                }

                /* Adding Getter and Setter methods */
                public void setEmail(String email){
                    this.email = email;
                    //Update hashMap value..
                    hashMap.put("email", email);
                }

            
            
        
    
        
            

            
                private String password;
                /* Adding Getter and Setter methods */
                public String getPassword(){
                    return password;
                }

                /* Adding Getter and Setter methods */
                public void setPassword(String password){
                    this.password = password;
                    //Update hashMap value..
                    hashMap.put("password", password);
                }

            
            
        
    
        
            

            
                private String type;
                /* Adding Getter and Setter methods */
                public String getType(){
                    return type;
                }

                /* Adding Getter and Setter methods */
                public void setType(String type){
                    this.type = type;
                    //Update hashMap value..
                    hashMap.put("type", type);
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

            
            
        
    
        
            

            
                private String franchiseCode;
                /* Adding Getter and Setter methods */
                public String getFranchiseCode(){
                    return franchiseCode;
                }

                /* Adding Getter and Setter methods */
                public void setFranchiseCode(String franchiseCode){
                    this.franchiseCode = franchiseCode;
                    //Update hashMap value..
                    hashMap.put("franchiseCode", franchiseCode);
                }

            
            
        
    
        
            

            
                private String franchiseAddress;
                /* Adding Getter and Setter methods */
                public String getFranchiseAddress(){
                    return franchiseAddress;
                }

                /* Adding Getter and Setter methods */
                public void setFranchiseAddress(String franchiseAddress){
                    this.franchiseAddress = franchiseAddress;
                    //Update hashMap value..
                    hashMap.put("franchiseAddress", franchiseAddress);
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

            
            
        
    
        
            

            
                private String gtinNumber;
                /* Adding Getter and Setter methods */
                public String getGtinNumber(){
                    return gtinNumber;
                }

                /* Adding Getter and Setter methods */
                public void setGtinNumber(String gtinNumber){
                    this.gtinNumber = gtinNumber;
                    //Update hashMap value..
                    hashMap.put("gtinNumber", gtinNumber);
                }

            
            
        
    
        
            

            
                private String cinNumber;
                /* Adding Getter and Setter methods */
                public String getCinNumber(){
                    return cinNumber;
                }

                /* Adding Getter and Setter methods */
                public void setCinNumber(String cinNumber){
                    this.cinNumber = cinNumber;
                    //Update hashMap value..
                    hashMap.put("cinNumber", cinNumber);
                }

            
            
        
    
        
            

            
                private String accountName;
                /* Adding Getter and Setter methods */
                public String getAccountName(){
                    return accountName;
                }

                /* Adding Getter and Setter methods */
                public void setAccountName(String accountName){
                    this.accountName = accountName;
                    //Update hashMap value..
                    hashMap.put("accountName", accountName);
                }

            
            
        
    
        
            

            
                private String accountNumber;
                /* Adding Getter and Setter methods */
                public String getAccountNumber(){
                    return accountNumber;
                }

                /* Adding Getter and Setter methods */
                public void setAccountNumber(String accountNumber){
                    this.accountNumber = accountNumber;
                    //Update hashMap value..
                    hashMap.put("accountNumber", accountNumber);
                }

            
            
        
    
        
            

            
                private String bankName;
                /* Adding Getter and Setter methods */
                public String getBankName(){
                    return bankName;
                }

                /* Adding Getter and Setter methods */
                public void setBankName(String bankName){
                    this.bankName = bankName;
                    //Update hashMap value..
                    hashMap.put("bankName", bankName);
                }

            
            
        
    
        
            

            
                private String branchName;
                /* Adding Getter and Setter methods */
                public String getBranchName(){
                    return branchName;
                }

                /* Adding Getter and Setter methods */
                public void setBranchName(String branchName){
                    this.branchName = branchName;
                    //Update hashMap value..
                    hashMap.put("branchName", branchName);
                }

            
            
        
    
        
            

            
                private String bankAddress;
                /* Adding Getter and Setter methods */
                public String getBankAddress(){
                    return bankAddress;
                }

                /* Adding Getter and Setter methods */
                public void setBankAddress(String bankAddress){
                    this.bankAddress = bankAddress;
                    //Update hashMap value..
                    hashMap.put("bankAddress", bankAddress);
                }

            
            
        
    
        
            

            
                private String ifscCode;
                /* Adding Getter and Setter methods */
                public String getIfscCode(){
                    return ifscCode;
                }

                /* Adding Getter and Setter methods */
                public void setIfscCode(String ifscCode){
                    this.ifscCode = ifscCode;
                    //Update hashMap value..
                    hashMap.put("ifscCode", ifscCode);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> franchiseOrderSettings;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getFranchiseOrderSettings(){
                    return franchiseOrderSettings;
                }

                /* Adding Getter and Setter methods */
                public void setFranchiseOrderSettings(DataList<Map<String, Object>> franchiseOrderSettings){
                    this.franchiseOrderSettings = franchiseOrderSettings;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("franchiseOrderSettings", franchiseOrderSettings);
                }

            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
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
      EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
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
                                        EmployeeRepository employeeRepository = (EmployeeRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = employeeRepository.getRestAdapter();
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
                            EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.get__city( (String)that.getId(), refresh,  new ObjectCallback<City> (){
                                            

                                            
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
                                        EmployeeRepository employeeRepository = (EmployeeRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = employeeRepository.getRestAdapter();
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
                            EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.get__area( (String)that.getId(), refresh,  new ObjectCallback<Area> (){
                                            

                                            
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
                                 notificationData = notificationDataRepository.getDb().getAll__db("employeeId", that.getId().toString());

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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.findById__notificationData( (String)that.getId(), fk,  new ObjectCallback<NotificationData> (){
                                            

                                            
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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.destroyById__notificationData( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.updateById__notificationData( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<NotificationData> (){
                                            

                                            
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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.get__notificationData( (String)that.getId(), filter,  new DataListCallback<NotificationData> (){
                                            

                                            


                                            
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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.create__notificationData( (String)that.getId(), data.convertMap(),  new ObjectCallback<NotificationData> (){
                                            

                                            
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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        



                                        employeeRepo.delete__notificationData( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.count__notificationData( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
