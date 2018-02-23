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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.RegistrationCouncilRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class RegistrationCouncil extends Model {


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

    private RegistrationCouncil that ;

    public RegistrationCouncil (){
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
      RegistrationCouncilRepository lowercaseFirstLetterRepository = (RegistrationCouncilRepository) getRepository();
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
      RegistrationCouncilRepository lowercaseFirstLetterRepository = (RegistrationCouncilRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      RegistrationCouncilRepository lowercaseFirstLetterRepository = (RegistrationCouncilRepository) getRepository();
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
                    private transient DataList<HospitalUser>  hospitalUsers ;

                    public DataList< HospitalUser > getHospitalUsers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HospitalUserRepository hospitalUserRepository = (HospitalUserRepository) getRepository();

                            if(that.getId() != null && hospitalUserRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hospitalUsers = getHospitalUsers__db(restAdapter);
                                 // Getting single cont
                                 hospitalUsers = hospitalUserRepository.getDb().getAll__db("registrationCouncilId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return hospitalUsers;
                    }

                    public void setHospitalUsers(DataList<HospitalUser> hospitalUsers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hospitalUsers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHospitalUsers1(hashMaps);
                        }else{
                            this.hospitalUsers = hospitalUsers;
                            //TODO: Warning move this to new thread
                            for(HospitalUser data: hospitalUsers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUsers1(List<Map<String, Object>> hospitalUsers) {
                        //First create a dummy Repo class object for ..
                        HospitalUserRepository hospitalUsersRepository = new HospitalUserRepository();
                        List<HospitalUser> result = new ArrayList<>();
                        for (Map<String, Object> obj : hospitalUsers) {
                            //Also add relation to child type for two way communication..
                            HospitalUser obj1 = hospitalUsersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUsers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHospitalUsers1(DataList<HashMap<String, Object>> hospitalUsers) {
                        //First create a dummy Repo class object for ..
                        HospitalUserRepository hospitalUsersRepository = new HospitalUserRepository();
                        DataList<HospitalUser> result = new DataList<>();
                        for (HashMap<String, Object> obj : hospitalUsers) {
                            //Also add relation to child type for two way communication..
                            HospitalUser obj1 = hospitalUsersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHospitalUsers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HospitalUser> hospitalUsers, HospitalUser dummyClassInstance) {
                        that.setHospitalUsers(hospitalUsers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HospitalUser hospitalUsers) {
                        try{
                            try{

                                  //Save to database..
                                  hospitalUsers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHospitalUsers().add(hospitalUsers);
                        }catch(Exception e){
                            DataList< HospitalUser> hospitalUsers1 = new DataList();
                            //Now add this item to list..
                            hospitalUsers1.add(hospitalUsers);
                            //Now set data....
                            that.setHospitalUsers(hospitalUsers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__hospitalUsers( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RegistrationCouncilRepository  registrationCouncilRepo = restAdapter.createRepository(RegistrationCouncilRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        registrationCouncilRepo.findById__hospitalUsers( (String)that.getId(), fk,  new ObjectCallback<HospitalUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUser object) {
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
                                    public void destroyById__hospitalUsers( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RegistrationCouncilRepository  registrationCouncilRepo = restAdapter.createRepository(RegistrationCouncilRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        registrationCouncilRepo.destroyById__hospitalUsers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hospitalUsers( String fk,  HospitalUser data,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RegistrationCouncilRepository  registrationCouncilRepo = restAdapter.createRepository(RegistrationCouncilRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        registrationCouncilRepo.updateById__hospitalUsers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HospitalUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUser object) {
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
                                    public void get__hospitalUsers( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RegistrationCouncilRepository  registrationCouncilRepo = restAdapter.createRepository(RegistrationCouncilRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        registrationCouncilRepo.get__hospitalUsers( (String)that.getId(), filter,  new DataListCallback<HospitalUser> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HospitalUser> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HospitalUser obj = new HospitalUser();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HospitalUser obj : object) {
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
                                    public void create__hospitalUsers( HospitalUser data,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RegistrationCouncilRepository  registrationCouncilRepo = restAdapter.createRepository(RegistrationCouncilRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        registrationCouncilRepo.create__hospitalUsers( (String)that.getId(), data.convertMap(),  new ObjectCallback<HospitalUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUser object) {
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
                                    public void delete__hospitalUsers( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RegistrationCouncilRepository  registrationCouncilRepo = restAdapter.createRepository(RegistrationCouncilRepository.class);
                                        
                                        



                                        registrationCouncilRepo.delete__hospitalUsers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hospitalUsers( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RegistrationCouncilRepository  registrationCouncilRepo = restAdapter.createRepository(RegistrationCouncilRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        registrationCouncilRepo.count__hospitalUsers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
