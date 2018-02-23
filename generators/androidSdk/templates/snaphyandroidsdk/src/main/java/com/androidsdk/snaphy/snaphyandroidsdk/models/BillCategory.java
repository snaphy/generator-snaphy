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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillCategoryRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SubBillCategoryRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class BillCategory extends Model {


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

    private BillCategory that ;

    public BillCategory (){
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

            
            
        
    
        
            

            
                private String facility;
                /* Adding Getter and Setter methods */
                public String getFacility(){
                    return facility;
                }

                /* Adding Getter and Setter methods */
                public void setFacility(String facility){
                    this.facility = facility;
                    //Update hashMap value..
                    hashMap.put("facility", facility);
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

            
            
        
    
        
            

            
                private String uniqueNumber;
                /* Adding Getter and Setter methods */
                public String getUniqueNumber(){
                    return uniqueNumber;
                }

                /* Adding Getter and Setter methods */
                public void setUniqueNumber(String uniqueNumber){
                    this.uniqueNumber = uniqueNumber;
                    //Update hashMap value..
                    hashMap.put("uniqueNumber", uniqueNumber);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      BillCategoryRepository lowercaseFirstLetterRepository = (BillCategoryRepository) getRepository();
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
      BillCategoryRepository lowercaseFirstLetterRepository = (BillCategoryRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      BillCategoryRepository lowercaseFirstLetterRepository = (BillCategoryRepository) getRepository();
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
                                 bills = billRepository.getDb().getAll__db("billCategoryId", that.getId().toString());

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
                                    public void findById__bills( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.findById__bills( (String)that.getId(), fk,  new ObjectCallback<Bill> (){
                                            

                                            
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
                                    public void destroyById__bills( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.destroyById__bills( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__bills( String fk,  Bill data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.updateById__bills( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
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
                                    public void get__bills( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.get__bills( (String)that.getId(), filter,  new DataListCallback<Bill> (){
                                            

                                            


                                            
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
                                    public void create__bills( Bill data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.create__bills( (String)that.getId(), data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
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
                                    public void delete__bills( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        



                                        billCategoryRepo.delete__bills( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__bills( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.count__bills( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<SubBillCategory>  subBillCategories ;

                    public DataList< SubBillCategory > getSubBillCategories() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            SubBillCategoryRepository subBillCategoryRepository = (SubBillCategoryRepository) getRepository();

                            if(that.getId() != null && subBillCategoryRepository.getDb() != null){

                                 //Fetch locally from db
                                 //subBillCategories = getSubBillCategories__db(restAdapter);
                                 // Getting single cont
                                 subBillCategories = subBillCategoryRepository.getDb().getAll__db("billCategoryId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return subBillCategories;
                    }

                    public void setSubBillCategories(DataList<SubBillCategory> subBillCategories) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: subBillCategories){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setSubBillCategories1(hashMaps);
                        }else{
                            this.subBillCategories = subBillCategories;
                            //TODO: Warning move this to new thread
                            for(SubBillCategory data: subBillCategories){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSubBillCategories1(List<Map<String, Object>> subBillCategories) {
                        //First create a dummy Repo class object for ..
                        SubBillCategoryRepository subBillCategoriesRepository = new SubBillCategoryRepository();
                        List<SubBillCategory> result = new ArrayList<>();
                        for (Map<String, Object> obj : subBillCategories) {
                            //Also add relation to child type for two way communication..
                            SubBillCategory obj1 = subBillCategoriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSubBillCategories(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSubBillCategories1(DataList<HashMap<String, Object>> subBillCategories) {
                        //First create a dummy Repo class object for ..
                        SubBillCategoryRepository subBillCategoriesRepository = new SubBillCategoryRepository();
                        DataList<SubBillCategory> result = new DataList<>();
                        for (HashMap<String, Object> obj : subBillCategories) {
                            //Also add relation to child type for two way communication..
                            SubBillCategory obj1 = subBillCategoriesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSubBillCategories(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<SubBillCategory> subBillCategories, SubBillCategory dummyClassInstance) {
                        that.setSubBillCategories(subBillCategories);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(SubBillCategory subBillCategories) {
                        try{
                            try{

                                  //Save to database..
                                  subBillCategories.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getSubBillCategories().add(subBillCategories);
                        }catch(Exception e){
                            DataList< SubBillCategory> subBillCategories1 = new DataList();
                            //Now add this item to list..
                            subBillCategories1.add(subBillCategories);
                            //Now set data....
                            that.setSubBillCategories(subBillCategories1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__subBillCategories( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<SubBillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.findById__subBillCategories( (String)that.getId(), fk,  new ObjectCallback<SubBillCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SubBillCategory object) {
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
                                    public void destroyById__subBillCategories( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.destroyById__subBillCategories( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__subBillCategories( String fk,  SubBillCategory data,  SnaphyRestAdapter restAdapter, final ObjectCallback<SubBillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.updateById__subBillCategories( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<SubBillCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SubBillCategory object) {
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
                                    public void get__subBillCategories( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<SubBillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.get__subBillCategories( (String)that.getId(), filter,  new DataListCallback<SubBillCategory> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<SubBillCategory> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            SubBillCategory obj = new SubBillCategory();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (SubBillCategory obj : object) {
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
                                    public void create__subBillCategories( SubBillCategory data,  SnaphyRestAdapter restAdapter, final ObjectCallback<SubBillCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.create__subBillCategories( (String)that.getId(), data.convertMap(),  new ObjectCallback<SubBillCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SubBillCategory object) {
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
                                    public void delete__subBillCategories( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        



                                        billCategoryRepo.delete__subBillCategories( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__subBillCategories( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BillCategoryRepository  billCategoryRepo = restAdapter.createRepository(BillCategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        billCategoryRepo.count__subBillCategories( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
