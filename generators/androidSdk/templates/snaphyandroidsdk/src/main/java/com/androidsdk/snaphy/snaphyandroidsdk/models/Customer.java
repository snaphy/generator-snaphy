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

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookAccessTokenRepository;
            

        
    


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

            
            
        
    
        
            

            
                private String username;
                /* Adding Getter and Setter methods */
                public String getUsername(){
                    return username;
                }

                /* Adding Getter and Setter methods */
                public void setUsername(String username){
                    this.username = username;
                    //Update hashMap value..
                    hashMap.put("username", username);
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

            
            
        
    
        
            

            
                private String registrationId;
                /* Adding Getter and Setter methods */
                public String getRegistrationId(){
                    return registrationId;
                }

                /* Adding Getter and Setter methods */
                public void setRegistrationId(String registrationId){
                    this.registrationId = registrationId;
                    //Update hashMap value..
                    hashMap.put("registrationId", registrationId);
                }

            
            
        
    
        
            

            
                private Map<String, Object> profilePic;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getProfilePic(){
                    return profilePic;
                }

                /* Adding Getter and Setter methods */
                public void setProfilePic(Map<String, Object> profilePic){
                    this.profilePic = profilePic;
                    //Update Map value..
                    hashMap.put("profilePic", profilePic);
                }

            
            
        
    
        
            

            
                private String googleRefreshToken;
                /* Adding Getter and Setter methods */
                public String getGoogleRefreshToken(){
                    return googleRefreshToken;
                }

                /* Adding Getter and Setter methods */
                public void setGoogleRefreshToken(String googleRefreshToken){
                    this.googleRefreshToken = googleRefreshToken;
                    //Update hashMap value..
                    hashMap.put("googleRefreshToken", googleRefreshToken);
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
    
         
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<FacebookAccessToken>  facebookAccessToken ;

                    public DataList< FacebookAccessToken > getFacebookAccessToken() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            FacebookAccessTokenRepository facebookAccessTokenRepository = (FacebookAccessTokenRepository) getRepository();

                            if(that.getId() != null && facebookAccessTokenRepository.getDb() != null){

                                 //Fetch locally from db
                                 //facebookAccessToken = getFacebookAccessToken__db(restAdapter);
                                 // Getting single cont
                                 facebookAccessToken = facebookAccessTokenRepository.getDb().getAll__db("customerId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return facebookAccessToken;
                    }

                    public void setFacebookAccessToken(DataList<FacebookAccessToken> facebookAccessToken) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: facebookAccessToken){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setFacebookAccessToken1(hashMaps);
                        }else{
                            this.facebookAccessToken = facebookAccessToken;
                            //TODO: Warning move this to new thread
                            for(FacebookAccessToken data: facebookAccessToken){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setFacebookAccessToken1(List<Map<String, Object>> facebookAccessToken) {
                        //First create a dummy Repo class object for ..
                        FacebookAccessTokenRepository facebookAccessTokenRepository = new FacebookAccessTokenRepository();
                        List<FacebookAccessToken> result = new ArrayList<>();
                        for (Map<String, Object> obj : facebookAccessToken) {
                            //Also add relation to child type for two way communication..
                            FacebookAccessToken obj1 = facebookAccessTokenRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setFacebookAccessToken(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setFacebookAccessToken1(DataList<HashMap<String, Object>> facebookAccessToken) {
                        //First create a dummy Repo class object for ..
                        FacebookAccessTokenRepository facebookAccessTokenRepository = new FacebookAccessTokenRepository();
                        DataList<FacebookAccessToken> result = new DataList<>();
                        for (HashMap<String, Object> obj : facebookAccessToken) {
                            //Also add relation to child type for two way communication..
                            FacebookAccessToken obj1 = facebookAccessTokenRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setFacebookAccessToken(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<FacebookAccessToken> facebookAccessToken, FacebookAccessToken dummyClassInstance) {
                        that.setFacebookAccessToken(facebookAccessToken);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(FacebookAccessToken facebookAccessToken) {
                        try{
                            try{

                                  //Save to database..
                                  facebookAccessToken.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getFacebookAccessToken().add(facebookAccessToken);
                        }catch(Exception e){
                            DataList< FacebookAccessToken> facebookAccessToken1 = new DataList();
                            //Now add this item to list..
                            facebookAccessToken1.add(facebookAccessToken);
                            //Now set data....
                            that.setFacebookAccessToken(facebookAccessToken1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__facebookAccessToken( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__facebookAccessToken( (String)that.getId(), fk,  new ObjectCallback<FacebookAccessToken> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FacebookAccessToken object) {
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
                                    public void destroyById__facebookAccessToken( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__facebookAccessToken( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__facebookAccessToken( String fk,  FacebookAccessToken data,  SnaphyRestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__facebookAccessToken( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<FacebookAccessToken> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FacebookAccessToken object) {
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
                                    public void get__facebookAccessToken( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__facebookAccessToken( (String)that.getId(), filter,  new DataListCallback<FacebookAccessToken> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<FacebookAccessToken> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            FacebookAccessToken obj = new FacebookAccessToken();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (FacebookAccessToken obj : object) {
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
                                    public void create__facebookAccessToken( FacebookAccessToken data,  SnaphyRestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__facebookAccessToken( (String)that.getId(), data.convertMap(),  new ObjectCallback<FacebookAccessToken> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FacebookAccessToken object) {
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
                                    public void delete__facebookAccessToken( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__facebookAccessToken( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__facebookAccessToken( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__facebookAccessToken( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
