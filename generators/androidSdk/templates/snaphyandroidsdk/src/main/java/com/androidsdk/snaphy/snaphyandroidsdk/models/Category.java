package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.remoting.adapters.Adapter;

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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CategoryRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HotDealRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Category extends Model {


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

    private Category that ;

    public Category (){
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
      CategoryRepository lowercaseFirstLetterRepository = (CategoryRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null){
             lowercaseFirstLetterRepository.getCategoryDb().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }



    public void save__db(String id){
      CategoryRepository lowercaseFirstLetterRepository = (CategoryRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null){
          lowercaseFirstLetterRepository.getCategoryDb().upsert__db(id, this);
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
                    private transient DataList<HotDeal>  hotDeals ;

                    public DataList< HotDeal > getHotDeals() {
                        //Check for pure case of hasMany
                                                    if(that.getId() != null){
                                   //TODO: Modify foreign key name..
                                   CategoryRepository categoryRepository = (CategoryRepository) getRepository();
                                 
                                 //Fetch locally from db
                                 //hotDeals = getHotDeals__db(restAdapter);
                                 // Getting single cont
                                 hotDeals = categoryRepository.getCategoryDb().get__db("categoryId", that.getId().toString());
                              
                                   //lowercaseFirstLetter(modelName)
                            }
                                                return hotDeals;
                    }

                    public void setHotDeals(DataList<HotDeal> hotDeals) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hotDeals){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHotDeals1(hashMaps);
                        }else{
                            this.hotDeals = hotDeals;
                            //TODO: Warning move this to new thread
                            for(HotDeal data: hotDeals){
                                data.save__db();
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHotDeals1(List<Map<String, Object>> hotDeals) {
                        //First create a dummy Repo class object for ..
                        HotDealRepository hotDealsRepository = new HotDealRepository();
                        List<HotDeal> result = new ArrayList<>();
                        for (Map<String, Object> obj : hotDeals) {
                            //Also add relation to child type for two way communication..
                            HotDeal obj1 = hotDealsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHotDeals(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHotDeals1(DataList<HashMap<String, Object>> hotDeals) {
                        //First create a dummy Repo class object for ..
                        HotDealRepository hotDealsRepository = new HotDealRepository();
                        DataList<HotDeal> result = new DataList<>();
                        for (HashMap<String, Object> obj : hotDeals) {
                            //Also add relation to child type for two way communication..
                            HotDeal obj1 = hotDealsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHotDeals(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HotDeal> hotDeals, HotDeal dummyClassInstance) {
                        that.setHotDeals(hotDeals);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HotDeal hotDeals) {
                        try{
                            //Save to database..
                            hotDeals.save__db();
                            that.getHotDeals().add(hotDeals);
                        }catch(Exception e){
                            DataList< HotDeal> hotDeals1 = new DataList();
                            //Now add this item to list..
                            hotDeals1.add(hotDeals);
                            //Now set data....
                            that.setHotDeals(hotDeals1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__hotDeals( String fk,  RestAdapter restAdapter, final ObjectCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CategoryRepository  categoryRepo = restAdapter.createRepository(CategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        categoryRepo.findById__hotDeals( (String)that.getId(), fk,  new ObjectCallback<HotDeal> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HotDeal object) {
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
                                    public void destroyById__hotDeals( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CategoryRepository  categoryRepo = restAdapter.createRepository(CategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        categoryRepo.destroyById__hotDeals( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hotDeals( String fk,  HotDeal data,  RestAdapter restAdapter, final ObjectCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CategoryRepository  categoryRepo = restAdapter.createRepository(CategoryRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        categoryRepo.updateById__hotDeals( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HotDeal> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HotDeal object) {
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
                                    public void get__hotDeals( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CategoryRepository  categoryRepo = restAdapter.createRepository(CategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        categoryRepo.get__hotDeals( (String)that.getId(), filter,  new DataListCallback<HotDeal> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HotDeal> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HotDeal obj = new HotDeal();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HotDeal obj : object) {
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
                                    public void create__hotDeals( HotDeal data,  RestAdapter restAdapter, final ObjectCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CategoryRepository  categoryRepo = restAdapter.createRepository(CategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        categoryRepo.create__hotDeals( (String)that.getId(), data.convertMap(),  new ObjectCallback<HotDeal> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HotDeal object) {
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
                                    public void delete__hotDeals( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CategoryRepository  categoryRepo = restAdapter.createRepository(CategoryRepository.class);
                                        
                                        



                                        categoryRepo.delete__hotDeals( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hotDeals( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CategoryRepository  categoryRepo = restAdapter.createRepository(CategoryRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        categoryRepo.count__hotDeals( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
