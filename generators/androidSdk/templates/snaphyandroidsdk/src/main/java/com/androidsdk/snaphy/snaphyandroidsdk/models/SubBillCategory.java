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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.SubBillCategoryRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class SubBillCategory extends Model {


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

    private SubBillCategory that ;

    public SubBillCategory (){
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      SubBillCategoryRepository lowercaseFirstLetterRepository = (SubBillCategoryRepository) getRepository();
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
      SubBillCategoryRepository lowercaseFirstLetterRepository = (SubBillCategoryRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      SubBillCategoryRepository lowercaseFirstLetterRepository = (SubBillCategoryRepository) getRepository();
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
                    private transient DataList<Bill>  bills ;

                    public DataList< Bill > getBills() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            BillRepository billRepository = (BillRepository) getRepository();

                            if(that.getId() != null && billRepository.getDb() != null){

                                 //Fetch locally from db
                                 //bills = getBills__db(restAdapter);
                                 // Getting single cont
                                 bills = billRepository.getDb().getAll__db("subBillCategoryId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return bills;
                    }

                    public void setBills(DataList<Bill> bills) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: bills){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setBills1(hashMaps);
                        }else{
                            this.bills = bills;
                            //TODO: Warning move this to new thread
                            for(Bill data: bills){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBills1(List<Map<String, Object>> bills) {
                        //First create a dummy Repo class object for ..
                        BillRepository billsRepository = new BillRepository();
                        List<Bill> result = new ArrayList<>();
                        for (Map<String, Object> obj : bills) {
                            //Also add relation to child type for two way communication..
                            Bill obj1 = billsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBills(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBills1(DataList<HashMap<String, Object>> bills) {
                        //First create a dummy Repo class object for ..
                        BillRepository billsRepository = new BillRepository();
                        DataList<Bill> result = new DataList<>();
                        for (HashMap<String, Object> obj : bills) {
                            //Also add relation to child type for two way communication..
                            Bill obj1 = billsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBills(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Bill> bills, Bill dummyClassInstance) {
                        that.setBills(bills);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Bill bills) {
                        try{
                            try{

                                  //Save to database..
                                  bills.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getBills().add(bills);
                        }catch(Exception e){
                            DataList< Bill> bills1 = new DataList();
                            //Now add this item to list..
                            bills1.add(bills);
                            //Now set data....
                            that.setBills(bills1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__bills( String fk,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        subBillCategoryRepo.findById__bills( (String)that.getId(), fk,  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
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
                                    public void destroyById__bills( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        subBillCategoryRepo.destroyById__bills( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__bills( String fk,  Bill data,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        subBillCategoryRepo.updateById__bills( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
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
                                    public void get__bills( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        subBillCategoryRepo.get__bills( (String)that.getId(), filter,  new DataListCallback<Bill> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Bill> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Bill obj = new Bill();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Bill obj : object) {
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
                                    public void create__bills( Bill data,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        subBillCategoryRepo.create__bills( (String)that.getId(), data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
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
                                    public void delete__bills( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        



                                        subBillCategoryRepo.delete__bills( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__bills( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        subBillCategoryRepo.count__bills( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient BillCategory  billCategory ;
                    private String billCategoryId;

                    public String getBillCategoryId(){
                         return billCategoryId;
                    }

                    public void setBillCategoryId(Object billCategoryId){
                        if(billCategoryId != null){
                          this.billCategoryId = billCategoryId.toString();
                        }
                    }

                    public BillCategory getBillCategory() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(billCategory == null){
                                        SubBillCategoryRepository subBillCategoryRepository = (SubBillCategoryRepository) getRepository();

                                        RestAdapter restAdapter = subBillCategoryRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          billCategory = getBillCategory__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return billCategory;
                    }

                    public void setBillCategory(BillCategory billCategory) {
                        this.billCategory = billCategory;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBillCategory(Map<String, Object> billCategory) {
                        //First create a dummy Repo class object for customer.
                        BillCategoryRepository billCategoryRepository = new BillCategoryRepository();
                        BillCategory billCategory1 = billCategoryRepository.createObject(billCategory);
                        setBillCategory(billCategory1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBillCategory(HashMap<String, Object> billCategory) {
                        //First create a dummy Repo class object for customer.
                        BillCategoryRepository billCategoryRepository = new BillCategoryRepository();
                        BillCategory billCategory1 = billCategoryRepository.createObject(billCategory);
                        setBillCategory(billCategory1);
                    }

                    //Adding relation method..
                    public void addRelation(BillCategory billCategory) {
                        that.setBillCategory(billCategory);
                    }


                    //Fetch related data from local database if present a billCategoryId identifier as property for belongsTo
                    public BillCategory getBillCategory__db(RestAdapter restAdapter){
                      if(billCategoryId != null){
                        BillCategoryRepository billCategoryRepository = restAdapter.createRepository(BillCategoryRepository.class);
                            try{
                            SubBillCategoryRepository lowercaseFirstLetterRepository = (SubBillCategoryRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(billCategoryRepository.getDb() == null ){
                                                    billCategoryRepository.addStorage(context);
                                                }

                                                if(context != null && billCategoryRepository.getDb() != null){
                                                    billCategoryRepository.addStorage(context);
                                                    BillCategory billCategory = (BillCategory) billCategoryRepository.getDb().get__db(billCategoryId);
                                                    return billCategory;
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
                                    public void get__billCategory( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<BillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        subBillCategoryRepo.get__billCategory( (String)that.getId(), refresh,  new ObjectCallback<BillCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BillCategory object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Hospital  hospital ;
                    private String hospitalId;

                    public String getHospitalId(){
                         return hospitalId;
                    }

                    public void setHospitalId(Object hospitalId){
                        if(hospitalId != null){
                          this.hospitalId = hospitalId.toString();
                        }
                    }

                    public Hospital getHospital() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(hospital == null){
                                        SubBillCategoryRepository subBillCategoryRepository = (SubBillCategoryRepository) getRepository();

                                        RestAdapter restAdapter = subBillCategoryRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          hospital = getHospital__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return hospital;
                    }

                    public void setHospital(Hospital hospital) {
                        this.hospital = hospital;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospital(Map<String, Object> hospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository hospitalRepository = new HospitalRepository();
                        Hospital hospital1 = hospitalRepository.createObject(hospital);
                        setHospital(hospital1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospital(HashMap<String, Object> hospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository hospitalRepository = new HospitalRepository();
                        Hospital hospital1 = hospitalRepository.createObject(hospital);
                        setHospital(hospital1);
                    }

                    //Adding relation method..
                    public void addRelation(Hospital hospital) {
                        that.setHospital(hospital);
                    }


                    //Fetch related data from local database if present a hospitalId identifier as property for belongsTo
                    public Hospital getHospital__db(RestAdapter restAdapter){
                      if(hospitalId != null){
                        HospitalRepository hospitalRepository = restAdapter.createRepository(HospitalRepository.class);
                            try{
                            SubBillCategoryRepository lowercaseFirstLetterRepository = (SubBillCategoryRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(hospitalRepository.getDb() == null ){
                                                    hospitalRepository.addStorage(context);
                                                }

                                                if(context != null && hospitalRepository.getDb() != null){
                                                    hospitalRepository.addStorage(context);
                                                    Hospital hospital = (Hospital) hospitalRepository.getDb().get__db(hospitalId);
                                                    return hospital;
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
                                    public void get__hospital( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SubBillCategoryRepository  subBillCategoryRepo = restAdapter.createRepository(SubBillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        subBillCategoryRepo.get__hospital( (String)that.getId(), refresh,  new ObjectCallback<Hospital> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Hospital object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
