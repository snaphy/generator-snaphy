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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CollegeRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserEducationRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class College extends Model {


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

    private College that ;

    public College (){
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
      CollegeRepository lowercaseFirstLetterRepository = (CollegeRepository) getRepository();
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
      CollegeRepository lowercaseFirstLetterRepository = (CollegeRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CollegeRepository lowercaseFirstLetterRepository = (CollegeRepository) getRepository();
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
                    private transient DataList<HospitalUserEducation>  hospitalUserEducations ;

                    public DataList< HospitalUserEducation > getHospitalUserEducations() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HospitalUserEducationRepository hospitalUserEducationRepository = (HospitalUserEducationRepository) getRepository();

                            if(that.getId() != null && hospitalUserEducationRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hospitalUserEducations = getHospitalUserEducations__db(restAdapter);
                                 // Getting single cont
                                 hospitalUserEducations = hospitalUserEducationRepository.getDb().getAll__db("collegeId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return hospitalUserEducations;
                    }

                    public void setHospitalUserEducations(DataList<HospitalUserEducation> hospitalUserEducations) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hospitalUserEducations){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHospitalUserEducations1(hashMaps);
                        }else{
                            this.hospitalUserEducations = hospitalUserEducations;
                            //TODO: Warning move this to new thread
                            for(HospitalUserEducation data: hospitalUserEducations){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserEducations1(List<Map<String, Object>> hospitalUserEducations) {
                        //First create a dummy Repo class object for ..
                        HospitalUserEducationRepository hospitalUserEducationsRepository = new HospitalUserEducationRepository();
                        List<HospitalUserEducation> result = new ArrayList<>();
                        for (Map<String, Object> obj : hospitalUserEducations) {
                            //Also add relation to child type for two way communication..
                            HospitalUserEducation obj1 = hospitalUserEducationsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserEducations(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserEducations1(DataList<HashMap<String, Object>> hospitalUserEducations) {
                        //First create a dummy Repo class object for ..
                        HospitalUserEducationRepository hospitalUserEducationsRepository = new HospitalUserEducationRepository();
                        DataList<HospitalUserEducation> result = new DataList<>();
                        for (HashMap<String, Object> obj : hospitalUserEducations) {
                            //Also add relation to child type for two way communication..
                            HospitalUserEducation obj1 = hospitalUserEducationsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserEducations(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HospitalUserEducation> hospitalUserEducations, HospitalUserEducation dummyClassInstance) {
                        that.setHospitalUserEducations(hospitalUserEducations);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HospitalUserEducation hospitalUserEducations) {
                        try{
                            try{

                                  //Save to database..
                                  hospitalUserEducations.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHospitalUserEducations().add(hospitalUserEducations);
                        }catch(Exception e){
                            DataList< HospitalUserEducation> hospitalUserEducations1 = new DataList();
                            //Now add this item to list..
                            hospitalUserEducations1.add(hospitalUserEducations);
                            //Now set data....
                            that.setHospitalUserEducations(hospitalUserEducations1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__hospitalUserEducations( String fk,  RestAdapter restAdapter, final ObjectCallback<HospitalUserEducation> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollegeRepository  collegeRepo = restAdapter.createRepository(CollegeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collegeRepo.findById__hospitalUserEducations( (String)that.getId(), fk,  new ObjectCallback<HospitalUserEducation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserEducation object) {
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
                                    public void destroyById__hospitalUserEducations( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollegeRepository  collegeRepo = restAdapter.createRepository(CollegeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collegeRepo.destroyById__hospitalUserEducations( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitalUserEducations( String fk,  HospitalUserEducation data,  RestAdapter restAdapter, final ObjectCallback<HospitalUserEducation> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollegeRepository  collegeRepo = restAdapter.createRepository(CollegeRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        collegeRepo.updateById__hospitalUserEducations( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HospitalUserEducation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserEducation object) {
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
                                    public void get__hospitalUserEducations( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<HospitalUserEducation> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollegeRepository  collegeRepo = restAdapter.createRepository(CollegeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collegeRepo.get__hospitalUserEducations( (String)that.getId(), filter,  new DataListCallback<HospitalUserEducation> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HospitalUserEducation> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HospitalUserEducation obj = new HospitalUserEducation();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HospitalUserEducation obj : object) {
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
                                    public void create__hospitalUserEducations( HospitalUserEducation data,  RestAdapter restAdapter, final ObjectCallback<HospitalUserEducation> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollegeRepository  collegeRepo = restAdapter.createRepository(CollegeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collegeRepo.create__hospitalUserEducations( (String)that.getId(), data.convertMap(),  new ObjectCallback<HospitalUserEducation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserEducation object) {
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
                                    public void delete__hospitalUserEducations( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollegeRepository  collegeRepo = restAdapter.createRepository(CollegeRepository.class);
                                        
                                        



                                        collegeRepo.delete__hospitalUserEducations( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitalUserEducations( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CollegeRepository  collegeRepo = restAdapter.createRepository(CollegeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        collegeRepo.count__hospitalUserEducations( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
