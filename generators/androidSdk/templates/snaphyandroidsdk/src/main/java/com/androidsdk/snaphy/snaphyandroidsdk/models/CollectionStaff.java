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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CollectionStaffRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AreaRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class CollectionStaff extends User {


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

    private CollectionStaff that ;

    public CollectionStaff (){
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

            
            
        
    
        
            

                private DataList<String> areas;
                /* Adding Getter and Setter methods */
                public DataList<String> getAreas(){
                    return areas;
                }

                /* Adding Getter and Setter methods */
                public void setAreas(DataList<String> areas){
                    this.areas = areas;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("areas", areas);
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
      CollectionStaffRepository lowercaseFirstLetterRepository = (CollectionStaffRepository) getRepository();
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
      CollectionStaffRepository lowercaseFirstLetterRepository = (CollectionStaffRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CollectionStaffRepository lowercaseFirstLetterRepository = (CollectionStaffRepository) getRepository();
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
                                        CollectionStaffRepository collectionStaffRepository = (CollectionStaffRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = collectionStaffRepository.getRestAdapter();
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
                            CollectionStaffRepository lowercaseFirstLetterRepository = (CollectionStaffRepository) getRepository();
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
                                        final CollectionStaffRepository  collectionStaffRepo = restAdapter.createRepository(CollectionStaffRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collectionStaffRepo.get__city( (String)that.getId(), refresh,  new ObjectCallback<City> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Area>  areaList ;

                    public DataList< Area > getAreaList() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            AreaRepository areaRepository = (AreaRepository) getRepository();

                            if(that.getId() != null && areaRepository.getDb() != null){

                                 //Fetch locally from db
                                 //areaList = getAreaList__db(restAdapter);
                                 // Getting single cont
                                 areaList = areaRepository.getDb().getAll__db("collectionStaffId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return areaList;
                    }

                    public void setAreaList(DataList<Area> areaList) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: areaList){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setAreaList1(hashMaps);
                        }else{
                            this.areaList = areaList;
                            //TODO: Warning move this to new thread
                            for(Area data: areaList){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAreaList1(List<Map<String, Object>> areaList) {
                        //First create a dummy Repo class object for ..
                        AreaRepository areaListRepository = new AreaRepository();
                        List<Area> result = new ArrayList<>();
                        for (Map<String, Object> obj : areaList) {
                            //Also add relation to child type for two way communication..
                            Area obj1 = areaListRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAreaList(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAreaList1(DataList<HashMap<String, Object>> areaList) {
                        //First create a dummy Repo class object for ..
                        AreaRepository areaListRepository = new AreaRepository();
                        DataList<Area> result = new DataList<>();
                        for (HashMap<String, Object> obj : areaList) {
                            //Also add relation to child type for two way communication..
                            Area obj1 = areaListRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAreaList(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Area> areaList, Area dummyClassInstance) {
                        that.setAreaList(areaList);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Area areaList) {
                        try{
                            try{

                                  //Save to database..
                                  areaList.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getAreaList().add(areaList);
                        }catch(Exception e){
                            DataList< Area> areaList1 = new DataList();
                            //Now add this item to list..
                            areaList1.add(areaList);
                            //Now set data....
                            that.setAreaList(areaList1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__areaList( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollectionStaffRepository  collectionStaffRepo = restAdapter.createRepository(CollectionStaffRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collectionStaffRepo.findById__areaList( (String)that.getId(), fk,  new ObjectCallback<Area> (){
                                            

                                            
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
                                    public void destroyById__areaList( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollectionStaffRepository  collectionStaffRepo = restAdapter.createRepository(CollectionStaffRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collectionStaffRepo.destroyById__areaList( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__areaList( String fk,  Area data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollectionStaffRepository  collectionStaffRepo = restAdapter.createRepository(CollectionStaffRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        collectionStaffRepo.updateById__areaList( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Area> (){
                                            

                                            
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
                                    public void get__areaList( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollectionStaffRepository  collectionStaffRepo = restAdapter.createRepository(CollectionStaffRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collectionStaffRepo.get__areaList( (String)that.getId(), filter,  new DataListCallback<Area> (){
                                            

                                            


                                            
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
                                    public void create__areaList( Area data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Area> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollectionStaffRepository  collectionStaffRepo = restAdapter.createRepository(CollectionStaffRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collectionStaffRepo.create__areaList( (String)that.getId(), data.convertMap(),  new ObjectCallback<Area> (){
                                            

                                            
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
                                    public void delete__areaList( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollectionStaffRepository  collectionStaffRepo = restAdapter.createRepository(CollectionStaffRepository.class);
                                        
                                        



                                        collectionStaffRepo.delete__areaList( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__areaList( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollectionStaffRepository  collectionStaffRepo = restAdapter.createRepository(CollectionStaffRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collectionStaffRepo.count__areaList( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
