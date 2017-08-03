package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.RetailerRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QrCodeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TransactionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DepartmentRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Retailer extends User {


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

    private Retailer that ;

    public Retailer (){
        that = this;
    }

    
        
            

            
                private String retailer_number;
                /* Adding Getter and Setter methods */
                public String getRetailer_number(){
                    return retailer_number;
                }

                /* Adding Getter and Setter methods */
                public void setRetailer_number(String retailer_number){
                    this.retailer_number = retailer_number;
                    //Update hashMap value..
                    hashMap.put("retailer_number", retailer_number);
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

            
            
        
    
        
            

            
                private String shop_name;
                /* Adding Getter and Setter methods */
                public String getShop_name(){
                    return shop_name;
                }

                /* Adding Getter and Setter methods */
                public void setShop_name(String shop_name){
                    this.shop_name = shop_name;
                    //Update hashMap value..
                    hashMap.put("shop_name", shop_name);
                }

            
            
        
    
        
            

            
                private String shop_address;
                /* Adding Getter and Setter methods */
                public String getShop_address(){
                    return shop_address;
                }

                /* Adding Getter and Setter methods */
                public void setShop_address(String shop_address){
                    this.shop_address = shop_address;
                    //Update hashMap value..
                    hashMap.put("shop_address", shop_address);
                }

            
            
        
    
        
            

            
                private String contact_number;
                /* Adding Getter and Setter methods */
                public String getContact_number(){
                    return contact_number;
                }

                /* Adding Getter and Setter methods */
                public void setContact_number(String contact_number){
                    this.contact_number = contact_number;
                    //Update hashMap value..
                    hashMap.put("contact_number", contact_number);
                }

            
            
        
    
        
            

            
                private String tin_number;
                /* Adding Getter and Setter methods */
                public String getTin_number(){
                    return tin_number;
                }

                /* Adding Getter and Setter methods */
                public void setTin_number(String tin_number){
                    this.tin_number = tin_number;
                    //Update hashMap value..
                    hashMap.put("tin_number", tin_number);
                }

            
            
        
    
        
            

            
                private String verification_status;
                /* Adding Getter and Setter methods */
                public String getVerification_status(){
                    return verification_status;
                }

                /* Adding Getter and Setter methods */
                public void setVerification_status(String verification_status){
                    this.verification_status = verification_status;
                    //Update hashMap value..
                    hashMap.put("verification_status", verification_status);
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

            
            
        
    
        
            

            
                private Map<String, Object> shop_image;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getShop_image(){
                    return shop_image;
                }

                /* Adding Getter and Setter methods */
                public void setShop_image(Map<String, Object> shop_image){
                    this.shop_image = shop_image;
                    //Update Map value..
                    hashMap.put("shop_image", shop_image);
                }

            
            
        
    
        
            

            
                private Map<String, Object> profile_pic;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getProfile_pic(){
                    return profile_pic;
                }

                /* Adding Getter and Setter methods */
                public void setProfile_pic(Map<String, Object> profile_pic){
                    this.profile_pic = profile_pic;
                    //Update Map value..
                    hashMap.put("profile_pic", profile_pic);
                }

            
            
        
    
        
            

            
                private Map<String, Object> tin_image;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getTin_image(){
                    return tin_image;
                }

                /* Adding Getter and Setter methods */
                public void setTin_image(Map<String, Object> tin_image){
                    this.tin_image = tin_image;
                    //Update Map value..
                    hashMap.put("tin_image", tin_image);
                }

            
            
        
    
        
            

                private DataList<String> departmentId;
                /* Adding Getter and Setter methods */
                public DataList<String> getDepartmentId(){
                    return departmentId;
                }

                /* Adding Getter and Setter methods */
                public void setDepartmentId(DataList<String> departmentId){
                    this.departmentId = departmentId;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("departmentId", departmentId);
                }

            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      RetailerRepository lowercaseFirstLetterRepository = (RetailerRepository) getRepository();
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
      RetailerRepository lowercaseFirstLetterRepository = (RetailerRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      RetailerRepository lowercaseFirstLetterRepository = (RetailerRepository) getRepository();
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
                                        RetailerRepository retailerRepository = (RetailerRepository) getRepository();

                                        RestAdapter restAdapter = retailerRepository.getRestAdapter();
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
                    public City getCity__db(RestAdapter restAdapter){
                      if(cityId != null){
                        CityRepository cityRepository = restAdapter.createRepository(CityRepository.class);
                            try{
                            RetailerRepository lowercaseFirstLetterRepository = (RetailerRepository) getRepository();
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
                                    public void get__city( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<City> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.get__city( (String)that.getId(), refresh,  new ObjectCallback<City> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(City object) {
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
                    private transient DataList<QrCode>  qrCodes ;

                    public DataList< QrCode > getQrCodes() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            QrCodeRepository qrCodeRepository = (QrCodeRepository) getRepository();

                            if(that.getId() != null && qrCodeRepository.getDb() != null){

                                 //Fetch locally from db
                                 //qrCodes = getQrCodes__db(restAdapter);
                                 // Getting single cont
                                 qrCodes = qrCodeRepository.getDb().getAll__db("retailerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return qrCodes;
                    }

                    public void setQrCodes(DataList<QrCode> qrCodes) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: qrCodes){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setQrCodes1(hashMaps);
                        }else{
                            this.qrCodes = qrCodes;
                            //TODO: Warning move this to new thread
                            for(QrCode data: qrCodes){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQrCodes1(List<Map<String, Object>> qrCodes) {
                        //First create a dummy Repo class object for ..
                        QrCodeRepository qrCodesRepository = new QrCodeRepository();
                        List<QrCode> result = new ArrayList<>();
                        for (Map<String, Object> obj : qrCodes) {
                            //Also add relation to child type for two way communication..
                            QrCode obj1 = qrCodesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQrCodes(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQrCodes1(DataList<HashMap<String, Object>> qrCodes) {
                        //First create a dummy Repo class object for ..
                        QrCodeRepository qrCodesRepository = new QrCodeRepository();
                        DataList<QrCode> result = new DataList<>();
                        for (HashMap<String, Object> obj : qrCodes) {
                            //Also add relation to child type for two way communication..
                            QrCode obj1 = qrCodesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQrCodes(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<QrCode> qrCodes, QrCode dummyClassInstance) {
                        that.setQrCodes(qrCodes);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(QrCode qrCodes) {
                        try{
                            try{

                                  //Save to database..
                                  qrCodes.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getQrCodes().add(qrCodes);
                        }catch(Exception e){
                            DataList< QrCode> qrCodes1 = new DataList();
                            //Now add this item to list..
                            qrCodes1.add(qrCodes);
                            //Now set data....
                            that.setQrCodes(qrCodes1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__qrCodes( String fk,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.findById__qrCodes( (String)that.getId(), fk,  new ObjectCallback<QrCode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCode object) {
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
                                    public void destroyById__qrCodes( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.destroyById__qrCodes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__qrCodes( String fk,  QrCode data,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.updateById__qrCodes( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<QrCode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCode object) {
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
                                    public void get__qrCodes( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.get__qrCodes( (String)that.getId(), filter,  new DataListCallback<QrCode> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<QrCode> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            QrCode obj = new QrCode();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (QrCode obj : object) {
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
                                    public void create__qrCodes( QrCode data,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.create__qrCodes( (String)that.getId(), data.convertMap(),  new ObjectCallback<QrCode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCode object) {
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
                                    public void delete__qrCodes( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        



                                        retailerRepo.delete__qrCodes( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__qrCodes( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.count__qrCodes( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Transaction>  transactions ;

                    public DataList< Transaction > getTransactions() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            TransactionRepository transactionRepository = (TransactionRepository) getRepository();

                            if(that.getId() != null && transactionRepository.getDb() != null){

                                 //Fetch locally from db
                                 //transactions = getTransactions__db(restAdapter);
                                 // Getting single cont
                                 transactions = transactionRepository.getDb().getAll__db("retailerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return transactions;
                    }

                    public void setTransactions(DataList<Transaction> transactions) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: transactions){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setTransactions1(hashMaps);
                        }else{
                            this.transactions = transactions;
                            //TODO: Warning move this to new thread
                            for(Transaction data: transactions){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTransactions1(List<Map<String, Object>> transactions) {
                        //First create a dummy Repo class object for ..
                        TransactionRepository transactionsRepository = new TransactionRepository();
                        List<Transaction> result = new ArrayList<>();
                        for (Map<String, Object> obj : transactions) {
                            //Also add relation to child type for two way communication..
                            Transaction obj1 = transactionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTransactions(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTransactions1(DataList<HashMap<String, Object>> transactions) {
                        //First create a dummy Repo class object for ..
                        TransactionRepository transactionsRepository = new TransactionRepository();
                        DataList<Transaction> result = new DataList<>();
                        for (HashMap<String, Object> obj : transactions) {
                            //Also add relation to child type for two way communication..
                            Transaction obj1 = transactionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTransactions(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Transaction> transactions, Transaction dummyClassInstance) {
                        that.setTransactions(transactions);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Transaction transactions) {
                        try{
                            try{

                                  //Save to database..
                                  transactions.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getTransactions().add(transactions);
                        }catch(Exception e){
                            DataList< Transaction> transactions1 = new DataList();
                            //Now add this item to list..
                            transactions1.add(transactions);
                            //Now set data....
                            that.setTransactions(transactions1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__transactions( String fk,  RestAdapter restAdapter, final ObjectCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.findById__transactions( (String)that.getId(), fk,  new ObjectCallback<Transaction> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Transaction object) {
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
                                    public void destroyById__transactions( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.destroyById__transactions( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__transactions( String fk,  Transaction data,  RestAdapter restAdapter, final ObjectCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.updateById__transactions( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Transaction> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Transaction object) {
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
                                    public void get__transactions( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.get__transactions( (String)that.getId(), filter,  new DataListCallback<Transaction> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Transaction> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Transaction obj = new Transaction();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Transaction obj : object) {
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
                                    public void create__transactions( Transaction data,  RestAdapter restAdapter, final ObjectCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.create__transactions( (String)that.getId(), data.convertMap(),  new ObjectCallback<Transaction> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Transaction object) {
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
                                    public void delete__transactions( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        



                                        retailerRepo.delete__transactions( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__transactions( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.count__transactions( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Department>  department ;

                    public DataList< Department > getDepartment() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            DepartmentRepository departmentRepository = (DepartmentRepository) getRepository();

                            if(that.getId() != null && departmentRepository.getDb() != null){

                                 //Fetch locally from db
                                 //department = getDepartment__db(restAdapter);
                                 // Getting single cont
                                 department = departmentRepository.getDb().getAll__db("retailerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return department;
                    }

                    public void setDepartment(DataList<Department> department) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: department){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setDepartment1(hashMaps);
                        }else{
                            this.department = department;
                            //TODO: Warning move this to new thread
                            for(Department data: department){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setDepartment1(List<Map<String, Object>> department) {
                        //First create a dummy Repo class object for ..
                        DepartmentRepository departmentRepository = new DepartmentRepository();
                        List<Department> result = new ArrayList<>();
                        for (Map<String, Object> obj : department) {
                            //Also add relation to child type for two way communication..
                            Department obj1 = departmentRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setDepartment(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setDepartment1(DataList<HashMap<String, Object>> department) {
                        //First create a dummy Repo class object for ..
                        DepartmentRepository departmentRepository = new DepartmentRepository();
                        DataList<Department> result = new DataList<>();
                        for (HashMap<String, Object> obj : department) {
                            //Also add relation to child type for two way communication..
                            Department obj1 = departmentRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setDepartment(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Department> department, Department dummyClassInstance) {
                        that.setDepartment(department);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Department department) {
                        try{
                            try{

                                  //Save to database..
                                  department.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getDepartment().add(department);
                        }catch(Exception e){
                            DataList< Department> department1 = new DataList();
                            //Now add this item to list..
                            department1.add(department);
                            //Now set data....
                            that.setDepartment(department1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__department( String fk,  RestAdapter restAdapter, final ObjectCallback<Department> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.findById__department( (String)that.getId(), fk,  new ObjectCallback<Department> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Department object) {
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
                                    public void destroyById__department( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.destroyById__department( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__department( String fk,  Department data,  RestAdapter restAdapter, final ObjectCallback<Department> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.updateById__department( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Department> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Department object) {
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
                                    public void get__department( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Department> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.get__department( (String)that.getId(), filter,  new DataListCallback<Department> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Department> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Department obj = new Department();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Department obj : object) {
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
                                    public void create__department( Department data,  RestAdapter restAdapter, final ObjectCallback<Department> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.create__department( (String)that.getId(), data.convertMap(),  new ObjectCallback<Department> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Department object) {
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
                                    public void delete__department( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        



                                        retailerRepo.delete__department( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__department( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RetailerRepository  retailerRepo = restAdapter.createRepository(RetailerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        retailerRepo.count__department( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
      

}
