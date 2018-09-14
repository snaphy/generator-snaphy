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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IndustryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BusinessTypeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AddressRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.InvoiceRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecentSearchRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Customer extends User {


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

    private Customer that ;

    public Customer (){
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

            
            
        
    
        
            

            
            
        
    
        
            

                private DataList<String> interestedCatList;
                /* Adding Getter and Setter methods */
                public DataList<String> getInterestedCatList(){
                    return interestedCatList;
                }

                /* Adding Getter and Setter methods */
                public void setInterestedCatList(DataList<String> interestedCatList){
                    this.interestedCatList = interestedCatList;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("interestedCatList", interestedCatList);
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

            
            
        
    
        
            

            
                private String contactNumber;
                /* Adding Getter and Setter methods */
                public String getContactNumber(){
                    return contactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setContactNumber(String contactNumber){
                    this.contactNumber = contactNumber;
                    //Update hashMap value..
                    hashMap.put("contactNumber", contactNumber);
                }

            
            
        
    
        
            

            
                private String altContactNumber;
                /* Adding Getter and Setter methods */
                public String getAltContactNumber(){
                    return altContactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setAltContactNumber(String altContactNumber){
                    this.altContactNumber = altContactNumber;
                    //Update hashMap value..
                    hashMap.put("altContactNumber", altContactNumber);
                }

            
            
        
    
        
            

            
                private String whatsappNumber;
                /* Adding Getter and Setter methods */
                public String getWhatsappNumber(){
                    return whatsappNumber;
                }

                /* Adding Getter and Setter methods */
                public void setWhatsappNumber(String whatsappNumber){
                    this.whatsappNumber = whatsappNumber;
                    //Update hashMap value..
                    hashMap.put("whatsappNumber", whatsappNumber);
                }

            
            
        
    
        
            

            
                private String storeName;
                /* Adding Getter and Setter methods */
                public String getStoreName(){
                    return storeName;
                }

                /* Adding Getter and Setter methods */
                public void setStoreName(String storeName){
                    this.storeName = storeName;
                    //Update hashMap value..
                    hashMap.put("storeName", storeName);
                }

            
            
        
    
        
            

            
                private String registeredFirmName;
                /* Adding Getter and Setter methods */
                public String getRegisteredFirmName(){
                    return registeredFirmName;
                }

                /* Adding Getter and Setter methods */
                public void setRegisteredFirmName(String registeredFirmName){
                    this.registeredFirmName = registeredFirmName;
                    //Update hashMap value..
                    hashMap.put("registeredFirmName", registeredFirmName);
                }

            
            
        
    
        
            

            
                private Map<String, Object> image;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getImage(){
                    return image;
                }

                /* Adding Getter and Setter methods */
                public void setImage(Map<String, Object> image){
                    this.image = image;
                    //Update Map value..
                    hashMap.put("image", image);
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

            
            
        
    
        
            

            
                private String liscenceType;
                /* Adding Getter and Setter methods */
                public String getLiscenceType(){
                    return liscenceType;
                }

                /* Adding Getter and Setter methods */
                public void setLiscenceType(String liscenceType){
                    this.liscenceType = liscenceType;
                    //Update hashMap value..
                    hashMap.put("liscenceType", liscenceType);
                }

            
            
        
    
        
            

            
                private String gstNumber;
                /* Adding Getter and Setter methods */
                public String getGstNumber(){
                    return gstNumber;
                }

                /* Adding Getter and Setter methods */
                public void setGstNumber(String gstNumber){
                    this.gstNumber = gstNumber;
                    //Update hashMap value..
                    hashMap.put("gstNumber", gstNumber);
                }

            
            
        
    
        
            

            
                private String shopAddress;
                /* Adding Getter and Setter methods */
                public String getShopAddress(){
                    return shopAddress;
                }

                /* Adding Getter and Setter methods */
                public void setShopAddress(String shopAddress){
                    this.shopAddress = shopAddress;
                    //Update hashMap value..
                    hashMap.put("shopAddress", shopAddress);
                }

            
            
        
    
        
            

            
                private String pincode;
                /* Adding Getter and Setter methods */
                public String getPincode(){
                    return pincode;
                }

                /* Adding Getter and Setter methods */
                public void setPincode(String pincode){
                    this.pincode = pincode;
                    //Update hashMap value..
                    hashMap.put("pincode", pincode);
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

            
            
        
    
        
            

            
                private String totalPurchase;
                /* Adding Getter and Setter methods */
                public String getTotalPurchase(){
                    return totalPurchase;
                }

                /* Adding Getter and Setter methods */
                public void setTotalPurchase(String totalPurchase){
                    this.totalPurchase = totalPurchase;
                    //Update hashMap value..
                    hashMap.put("totalPurchase", totalPurchase);
                }

            
            
        
    
        
            

            
                private String verificationStatus;
                /* Adding Getter and Setter methods */
                public String getVerificationStatus(){
                    return verificationStatus;
                }

                /* Adding Getter and Setter methods */
                public void setVerificationStatus(String verificationStatus){
                    this.verificationStatus = verificationStatus;
                    //Update hashMap value..
                    hashMap.put("verificationStatus", verificationStatus);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
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
      CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
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
                    private transient Industry  industry ;
                    private String industryId;

                    public String getIndustryId(){
                         return industryId;
                    }

                    public void setIndustryId(Object industryId){
                        if(industryId != null){
                          this.industryId = industryId.toString();
                        }
                    }

                    public Industry getIndustry() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(industry == null){
                                        CustomerRepository customerRepository = (CustomerRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = customerRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          industry = getIndustry__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return industry;
                    }

                    public void setIndustry(Industry industry) {
                        this.industry = industry;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIndustry(Map<String, Object> industry) {
                        //First create a dummy Repo class object for customer.
                        IndustryRepository industryRepository = new IndustryRepository();
                        Industry industry1 = industryRepository.createObject(industry);
                        setIndustry(industry1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIndustry(HashMap<String, Object> industry) {
                        //First create a dummy Repo class object for customer.
                        IndustryRepository industryRepository = new IndustryRepository();
                        Industry industry1 = industryRepository.createObject(industry);
                        setIndustry(industry1);
                    }

                    //Adding relation method..
                    public void addRelation(Industry industry) {
                        that.setIndustry(industry);
                    }


                    //Fetch related data from local database if present a industryId identifier as property for belongsTo
                    public Industry getIndustry__db(SnaphyRestAdapter restAdapter){
                      if(industryId != null){
                        IndustryRepository industryRepository = restAdapter.createRepository(IndustryRepository.class);
                            try{
                            CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(industryRepository.getDb() == null ){
                                                    industryRepository.addStorage(context);
                                                }

                                                if(context != null && industryRepository.getDb() != null){
                                                    industryRepository.addStorage(context);
                                                    Industry industry = (Industry) industryRepository.getDb().get__db(industryId);
                                                    return industry;
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
                                    public void get__industry( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Industry> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__industry( (String)that.getId(), refresh,  new ObjectCallback<Industry> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Industry object) {
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
                    private transient BusinessType  businessType ;
                    private String businessTypeId;

                    public String getBusinessTypeId(){
                         return businessTypeId;
                    }

                    public void setBusinessTypeId(Object businessTypeId){
                        if(businessTypeId != null){
                          this.businessTypeId = businessTypeId.toString();
                        }
                    }

                    public BusinessType getBusinessType() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(businessType == null){
                                        CustomerRepository customerRepository = (CustomerRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = customerRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          businessType = getBusinessType__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return businessType;
                    }

                    public void setBusinessType(BusinessType businessType) {
                        this.businessType = businessType;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBusinessType(Map<String, Object> businessType) {
                        //First create a dummy Repo class object for customer.
                        BusinessTypeRepository businessTypeRepository = new BusinessTypeRepository();
                        BusinessType businessType1 = businessTypeRepository.createObject(businessType);
                        setBusinessType(businessType1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBusinessType(HashMap<String, Object> businessType) {
                        //First create a dummy Repo class object for customer.
                        BusinessTypeRepository businessTypeRepository = new BusinessTypeRepository();
                        BusinessType businessType1 = businessTypeRepository.createObject(businessType);
                        setBusinessType(businessType1);
                    }

                    //Adding relation method..
                    public void addRelation(BusinessType businessType) {
                        that.setBusinessType(businessType);
                    }


                    //Fetch related data from local database if present a businessTypeId identifier as property for belongsTo
                    public BusinessType getBusinessType__db(SnaphyRestAdapter restAdapter){
                      if(businessTypeId != null){
                        BusinessTypeRepository businessTypeRepository = restAdapter.createRepository(BusinessTypeRepository.class);
                            try{
                            CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(businessTypeRepository.getDb() == null ){
                                                    businessTypeRepository.addStorage(context);
                                                }

                                                if(context != null && businessTypeRepository.getDb() != null){
                                                    businessTypeRepository.addStorage(context);
                                                    BusinessType businessType = (BusinessType) businessTypeRepository.getDb().get__db(businessTypeId);
                                                    return businessType;
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
                                    public void get__businessType( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<BusinessType> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__businessType( (String)that.getId(), refresh,  new ObjectCallback<BusinessType> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BusinessType object) {
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
                    private transient Employee  employee ;
                    private String employeeId;

                    public String getEmployeeId(){
                         return employeeId;
                    }

                    public void setEmployeeId(Object employeeId){
                        if(employeeId != null){
                          this.employeeId = employeeId.toString();
                        }
                    }

                    public Employee getEmployee() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(employee == null){
                                        CustomerRepository customerRepository = (CustomerRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = customerRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          employee = getEmployee__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return employee;
                    }

                    public void setEmployee(Employee employee) {
                        this.employee = employee;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setEmployee(Map<String, Object> employee) {
                        //First create a dummy Repo class object for customer.
                        EmployeeRepository employeeRepository = new EmployeeRepository();
                        Employee employee1 = employeeRepository.createObject(employee);
                        setEmployee(employee1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setEmployee(HashMap<String, Object> employee) {
                        //First create a dummy Repo class object for customer.
                        EmployeeRepository employeeRepository = new EmployeeRepository();
                        Employee employee1 = employeeRepository.createObject(employee);
                        setEmployee(employee1);
                    }

                    //Adding relation method..
                    public void addRelation(Employee employee) {
                        that.setEmployee(employee);
                    }


                    //Fetch related data from local database if present a employeeId identifier as property for belongsTo
                    public Employee getEmployee__db(SnaphyRestAdapter restAdapter){
                      if(employeeId != null){
                        EmployeeRepository employeeRepository = restAdapter.createRepository(EmployeeRepository.class);
                            try{
                            CustomerRepository lowercaseFirstLetterRepository = (CustomerRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(employeeRepository.getDb() == null ){
                                                    employeeRepository.addStorage(context);
                                                }

                                                if(context != null && employeeRepository.getDb() != null){
                                                    employeeRepository.addStorage(context);
                                                    Employee employee = (Employee) employeeRepository.getDb().get__db(employeeId);
                                                    return employee;
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
                                    public void get__employee( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Employee> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__employee( (String)that.getId(), refresh,  new ObjectCallback<Employee> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Employee object) {
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
                    private transient DataList<Address>  addresses ;

                    public DataList< Address > getAddresses() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            AddressRepository addressRepository = (AddressRepository) getRepository();

                            if(that.getId() != null && addressRepository.getDb() != null){

                                 //Fetch locally from db
                                 //addresses = getAddresses__db(restAdapter);
                                 // Getting single cont
                                 addresses = addressRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return addresses;
                    }

                    public void setAddresses(DataList<Address> addresses) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: addresses){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setAddresses1(hashMaps);
                        }else{
                            this.addresses = addresses;
                            //TODO: Warning move this to new thread
                            for(Address data: addresses){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAddresses1(List<Map<String, Object>> addresses) {
                        //First create a dummy Repo class object for ..
                        AddressRepository addressesRepository = new AddressRepository();
                        List<Address> result = new ArrayList<>();
                        for (Map<String, Object> obj : addresses) {
                            //Also add relation to child type for two way communication..
                            Address obj1 = addressesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAddresses(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAddresses1(DataList<HashMap<String, Object>> addresses) {
                        //First create a dummy Repo class object for ..
                        AddressRepository addressesRepository = new AddressRepository();
                        DataList<Address> result = new DataList<>();
                        for (HashMap<String, Object> obj : addresses) {
                            //Also add relation to child type for two way communication..
                            Address obj1 = addressesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAddresses(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Address> addresses, Address dummyClassInstance) {
                        that.setAddresses(addresses);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Address addresses) {
                        try{
                            try{

                                  //Save to database..
                                  addresses.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getAddresses().add(addresses);
                        }catch(Exception e){
                            DataList< Address> addresses1 = new DataList();
                            //Now add this item to list..
                            addresses1.add(addresses);
                            //Now set data....
                            that.setAddresses(addresses1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__addresses( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Address> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__addresses( (String)that.getId(), fk,  new ObjectCallback<Address> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Address object) {
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
                                    public void destroyById__addresses( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__addresses( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__addresses( String fk,  Address data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Address> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__addresses( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Address> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Address object) {
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
                                    public void get__addresses( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Address> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__addresses( (String)that.getId(), filter,  new DataListCallback<Address> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Address> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          Address obj = new Address();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (Address obj : object) {
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
                                    public void create__addresses( Address data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Address> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__addresses( (String)that.getId(), data.convertMap(),  new ObjectCallback<Address> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Address object) {
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
                                    public void delete__addresses( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__addresses( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__addresses( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__addresses( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Invoice>  invoices ;

                    public DataList< Invoice > getInvoices() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            InvoiceRepository invoiceRepository = (InvoiceRepository) getRepository();

                            if(that.getId() != null && invoiceRepository.getDb() != null){

                                 //Fetch locally from db
                                 //invoices = getInvoices__db(restAdapter);
                                 // Getting single cont
                                 invoices = invoiceRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return invoices;
                    }

                    public void setInvoices(DataList<Invoice> invoices) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: invoices){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setInvoices1(hashMaps);
                        }else{
                            this.invoices = invoices;
                            //TODO: Warning move this to new thread
                            for(Invoice data: invoices){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setInvoices1(List<Map<String, Object>> invoices) {
                        //First create a dummy Repo class object for ..
                        InvoiceRepository invoicesRepository = new InvoiceRepository();
                        List<Invoice> result = new ArrayList<>();
                        for (Map<String, Object> obj : invoices) {
                            //Also add relation to child type for two way communication..
                            Invoice obj1 = invoicesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setInvoices(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setInvoices1(DataList<HashMap<String, Object>> invoices) {
                        //First create a dummy Repo class object for ..
                        InvoiceRepository invoicesRepository = new InvoiceRepository();
                        DataList<Invoice> result = new DataList<>();
                        for (HashMap<String, Object> obj : invoices) {
                            //Also add relation to child type for two way communication..
                            Invoice obj1 = invoicesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setInvoices(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Invoice> invoices, Invoice dummyClassInstance) {
                        that.setInvoices(invoices);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Invoice invoices) {
                        try{
                            try{

                                  //Save to database..
                                  invoices.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getInvoices().add(invoices);
                        }catch(Exception e){
                            DataList< Invoice> invoices1 = new DataList();
                            //Now add this item to list..
                            invoices1.add(invoices);
                            //Now set data....
                            that.setInvoices(invoices1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__invoices( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__invoices( (String)that.getId(), fk,  new ObjectCallback<Invoice> (){
                                            

                                            
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
                                    public void destroyById__invoices( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__invoices( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__invoices( String fk,  Invoice data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__invoices( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Invoice> (){
                                            

                                            
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
                                    public void get__invoices( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__invoices( (String)that.getId(), filter,  new DataListCallback<Invoice> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Invoice> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          Invoice obj = new Invoice();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (Invoice obj : object) {
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
                                    public void create__invoices( Invoice data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__invoices( (String)that.getId(), data.convertMap(),  new ObjectCallback<Invoice> (){
                                            

                                            
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
                                    public void delete__invoices( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__invoices( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__invoices( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__invoices( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<RecentSearch>  recentSearches ;

                    public DataList< RecentSearch > getRecentSearches() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            RecentSearchRepository recentSearchRepository = (RecentSearchRepository) getRepository();

                            if(that.getId() != null && recentSearchRepository.getDb() != null){

                                 //Fetch locally from db
                                 //recentSearches = getRecentSearches__db(restAdapter);
                                 // Getting single cont
                                 recentSearches = recentSearchRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return recentSearches;
                    }

                    public void setRecentSearches(DataList<RecentSearch> recentSearches) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: recentSearches){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setRecentSearches1(hashMaps);
                        }else{
                            this.recentSearches = recentSearches;
                            //TODO: Warning move this to new thread
                            for(RecentSearch data: recentSearches){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setRecentSearches1(List<Map<String, Object>> recentSearches) {
                        //First create a dummy Repo class object for ..
                        RecentSearchRepository recentSearchesRepository = new RecentSearchRepository();
                        List<RecentSearch> result = new ArrayList<>();
                        for (Map<String, Object> obj : recentSearches) {
                            //Also add relation to child type for two way communication..
                            RecentSearch obj1 = recentSearchesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setRecentSearches(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setRecentSearches1(DataList<HashMap<String, Object>> recentSearches) {
                        //First create a dummy Repo class object for ..
                        RecentSearchRepository recentSearchesRepository = new RecentSearchRepository();
                        DataList<RecentSearch> result = new DataList<>();
                        for (HashMap<String, Object> obj : recentSearches) {
                            //Also add relation to child type for two way communication..
                            RecentSearch obj1 = recentSearchesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setRecentSearches(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<RecentSearch> recentSearches, RecentSearch dummyClassInstance) {
                        that.setRecentSearches(recentSearches);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(RecentSearch recentSearches) {
                        try{
                            try{

                                  //Save to database..
                                  recentSearches.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getRecentSearches().add(recentSearches);
                        }catch(Exception e){
                            DataList< RecentSearch> recentSearches1 = new DataList();
                            //Now add this item to list..
                            recentSearches1.add(recentSearches);
                            //Now set data....
                            that.setRecentSearches(recentSearches1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__recentSearches( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<RecentSearch> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__recentSearches( (String)that.getId(), fk,  new ObjectCallback<RecentSearch> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(RecentSearch object) {
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
                                    public void destroyById__recentSearches( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__recentSearches( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__recentSearches( String fk,  RecentSearch data,  SnaphyRestAdapter restAdapter, final ObjectCallback<RecentSearch> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__recentSearches( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<RecentSearch> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(RecentSearch object) {
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
                                    public void get__recentSearches( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<RecentSearch> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__recentSearches( (String)that.getId(), filter,  new DataListCallback<RecentSearch> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<RecentSearch> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          RecentSearch obj = new RecentSearch();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (RecentSearch obj : object) {
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
                                    public void create__recentSearches( RecentSearch data,  SnaphyRestAdapter restAdapter, final ObjectCallback<RecentSearch> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__recentSearches( (String)that.getId(), data.convertMap(),  new ObjectCallback<RecentSearch> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(RecentSearch object) {
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
                                    public void delete__recentSearches( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__recentSearches( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__recentSearches( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__recentSearches( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
