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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.SpecializationRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserSpecializationRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Specialization extends Model {


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

    private Specialization that ;

    public Specialization (){
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
      SpecializationRepository lowercaseFirstLetterRepository = (SpecializationRepository) getRepository();
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
      SpecializationRepository lowercaseFirstLetterRepository = (SpecializationRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      SpecializationRepository lowercaseFirstLetterRepository = (SpecializationRepository) getRepository();
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
                    private transient DataList<HospitalUserSpecialization>  hospitalUserSpecializations ;

                    public DataList< HospitalUserSpecialization > getHospitalUserSpecializations() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HospitalUserSpecializationRepository hospitalUserSpecializationRepository = (HospitalUserSpecializationRepository) getRepository();

                            if(that.getId() != null && hospitalUserSpecializationRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hospitalUserSpecializations = getHospitalUserSpecializations__db(restAdapter);
                                 // Getting single cont
                                 hospitalUserSpecializations = hospitalUserSpecializationRepository.getDb().getAll__db("specializationId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return hospitalUserSpecializations;
                    }

                    public void setHospitalUserSpecializations(DataList<HospitalUserSpecialization> hospitalUserSpecializations) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hospitalUserSpecializations){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHospitalUserSpecializations1(hashMaps);
                        }else{
                            this.hospitalUserSpecializations = hospitalUserSpecializations;
                            //TODO: Warning move this to new thread
                            for(HospitalUserSpecialization data: hospitalUserSpecializations){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserSpecializations1(List<Map<String, Object>> hospitalUserSpecializations) {
                        //First create a dummy Repo class object for ..
                        HospitalUserSpecializationRepository hospitalUserSpecializationsRepository = new HospitalUserSpecializationRepository();
                        List<HospitalUserSpecialization> result = new ArrayList<>();
                        for (Map<String, Object> obj : hospitalUserSpecializations) {
                            //Also add relation to child type for two way communication..
                            HospitalUserSpecialization obj1 = hospitalUserSpecializationsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserSpecializations(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUserSpecializations1(DataList<HashMap<String, Object>> hospitalUserSpecializations) {
                        //First create a dummy Repo class object for ..
                        HospitalUserSpecializationRepository hospitalUserSpecializationsRepository = new HospitalUserSpecializationRepository();
                        DataList<HospitalUserSpecialization> result = new DataList<>();
                        for (HashMap<String, Object> obj : hospitalUserSpecializations) {
                            //Also add relation to child type for two way communication..
                            HospitalUserSpecialization obj1 = hospitalUserSpecializationsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUserSpecializations(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HospitalUserSpecialization> hospitalUserSpecializations, HospitalUserSpecialization dummyClassInstance) {
                        that.setHospitalUserSpecializations(hospitalUserSpecializations);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HospitalUserSpecialization hospitalUserSpecializations) {
                        try{
                            try{

                                  //Save to database..
                                  hospitalUserSpecializations.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHospitalUserSpecializations().add(hospitalUserSpecializations);
                        }catch(Exception e){
                            DataList< HospitalUserSpecialization> hospitalUserSpecializations1 = new DataList();
                            //Now add this item to list..
                            hospitalUserSpecializations1.add(hospitalUserSpecializations);
                            //Now set data....
                            that.setHospitalUserSpecializations(hospitalUserSpecializations1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__hospitalUserSpecializations( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUserSpecialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SpecializationRepository  specializationRepo = restAdapter.createRepository(SpecializationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        specializationRepo.findById__hospitalUserSpecializations( (String)that.getId(), fk,  new ObjectCallback<HospitalUserSpecialization> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSpecialization object) {
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
                                    public void destroyById__hospitalUserSpecializations( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SpecializationRepository  specializationRepo = restAdapter.createRepository(SpecializationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        specializationRepo.destroyById__hospitalUserSpecializations( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitalUserSpecializations( String fk,  HospitalUserSpecialization data,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUserSpecialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SpecializationRepository  specializationRepo = restAdapter.createRepository(SpecializationRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        specializationRepo.updateById__hospitalUserSpecializations( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HospitalUserSpecialization> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSpecialization object) {
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
                                    public void get__hospitalUserSpecializations( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<HospitalUserSpecialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SpecializationRepository  specializationRepo = restAdapter.createRepository(SpecializationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        specializationRepo.get__hospitalUserSpecializations( (String)that.getId(), filter,  new DataListCallback<HospitalUserSpecialization> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HospitalUserSpecialization> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HospitalUserSpecialization obj = new HospitalUserSpecialization();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HospitalUserSpecialization obj : object) {
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
                                    public void create__hospitalUserSpecializations( HospitalUserSpecialization data,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUserSpecialization> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SpecializationRepository  specializationRepo = restAdapter.createRepository(SpecializationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        specializationRepo.create__hospitalUserSpecializations( (String)that.getId(), data.convertMap(),  new ObjectCallback<HospitalUserSpecialization> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUserSpecialization object) {
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
                                    public void delete__hospitalUserSpecializations( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SpecializationRepository  specializationRepo = restAdapter.createRepository(SpecializationRepository.class);
                                        
                                        



                                        specializationRepo.delete__hospitalUserSpecializations( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitalUserSpecializations( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SpecializationRepository  specializationRepo = restAdapter.createRepository(SpecializationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        specializationRepo.count__hospitalUserSpecializations( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
