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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookAccessTokenRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FollowBrandRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class AppUser extends User {


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

    private AppUser that ;

    public AppUser (){
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      AppUserRepository lowercaseFirstLetterRepository = (AppUserRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null & lowercaseFirstLetterRepository.getDb() != null){
             lowercaseFirstLetterRepository.getDb().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }



    public void save__db(String id){
      AppUserRepository lowercaseFirstLetterRepository = (AppUserRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null & lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      AppUserRepository lowercaseFirstLetterRepository = (AppUserRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){

        if(getId() != null & lowercaseFirstLetterRepository.getDb() != null){
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
                            FacebookAccessTokenRepository facebookAccessTokenRepository = (FacebookAccessTokenRepository) getRepository();

                            if(that.getId() != null & facebookAccessTokenRepository.getDb() != null){

                                 //Fetch locally from db
                                 //facebookAccessToken = getFacebookAccessToken__db(restAdapter);
                                 // Getting single cont
                                 facebookAccessToken = facebookAccessTokenRepository.getDb().getAll__db("appUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
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
                                    public void findById__facebookAccessToken( String fk,  RestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__facebookAccessToken( (String)that.getId(), fk,  new ObjectCallback<FacebookAccessToken> (){
                                            

                                            
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
                                    public void destroyById__facebookAccessToken( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__facebookAccessToken( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__facebookAccessToken( String fk,  FacebookAccessToken data,  RestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__facebookAccessToken( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<FacebookAccessToken> (){
                                            

                                            
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
                                    public void get__facebookAccessToken( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__facebookAccessToken( (String)that.getId(), filter,  new DataListCallback<FacebookAccessToken> (){
                                            

                                            


                                            
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
                                    public void create__facebookAccessToken( FacebookAccessToken data,  RestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__facebookAccessToken( (String)that.getId(), data.convertMap(),  new ObjectCallback<FacebookAccessToken> (){
                                            

                                            
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
                                    public void delete__facebookAccessToken( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__facebookAccessToken( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__facebookAccessToken( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__facebookAccessToken( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Chat>  chats ;

                    public DataList< Chat > getChats() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                            ChatRepository chatRepository = (ChatRepository) getRepository();

                            if(that.getId() != null & chatRepository.getDb() != null){

                                 //Fetch locally from db
                                 //chats = getChats__db(restAdapter);
                                 // Getting single cont
                                 chats = chatRepository.getDb().getAll__db("appUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                                                return chats;
                    }

                    public void setChats(DataList<Chat> chats) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: chats){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setChats1(hashMaps);
                        }else{
                            this.chats = chats;
                            //TODO: Warning move this to new thread
                            for(Chat data: chats){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChats1(List<Map<String, Object>> chats) {
                        //First create a dummy Repo class object for ..
                        ChatRepository chatsRepository = new ChatRepository();
                        List<Chat> result = new ArrayList<>();
                        for (Map<String, Object> obj : chats) {
                            //Also add relation to child type for two way communication..
                            Chat obj1 = chatsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChats(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChats1(DataList<HashMap<String, Object>> chats) {
                        //First create a dummy Repo class object for ..
                        ChatRepository chatsRepository = new ChatRepository();
                        DataList<Chat> result = new DataList<>();
                        for (HashMap<String, Object> obj : chats) {
                            //Also add relation to child type for two way communication..
                            Chat obj1 = chatsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChats(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Chat> chats, Chat dummyClassInstance) {
                        that.setChats(chats);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Chat chats) {
                        try{
                            try{

                                  //Save to database..
                                  chats.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getChats().add(chats);
                        }catch(Exception e){
                            DataList< Chat> chats1 = new DataList();
                            //Now add this item to list..
                            chats1.add(chats);
                            //Now set data....
                            that.setChats(chats1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__chats( String fk,  RestAdapter restAdapter, final ObjectCallback<Chat> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__chats( (String)that.getId(), fk,  new ObjectCallback<Chat> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Chat object) {
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
                                    public void destroyById__chats( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__chats( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__chats( String fk,  Chat data,  RestAdapter restAdapter, final ObjectCallback<Chat> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__chats( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Chat> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Chat object) {
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
                                    public void get__chats( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Chat> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__chats( (String)that.getId(), filter,  new DataListCallback<Chat> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Chat> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Chat obj = new Chat();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Chat obj : object) {
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
                                    public void create__chats( Chat data,  RestAdapter restAdapter, final ObjectCallback<Chat> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__chats( (String)that.getId(), data.convertMap(),  new ObjectCallback<Chat> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Chat object) {
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
                                    public void delete__chats( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__chats( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__chats( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__chats( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<FollowBrand>  followBrands ;

                    public DataList< FollowBrand > getFollowBrands() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                            FollowBrandRepository followBrandRepository = (FollowBrandRepository) getRepository();

                            if(that.getId() != null & followBrandRepository.getDb() != null){

                                 //Fetch locally from db
                                 //followBrands = getFollowBrands__db(restAdapter);
                                 // Getting single cont
                                 followBrands = followBrandRepository.getDb().getAll__db("appUserId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                                                return followBrands;
                    }

                    public void setFollowBrands(DataList<FollowBrand> followBrands) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: followBrands){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setFollowBrands1(hashMaps);
                        }else{
                            this.followBrands = followBrands;
                            //TODO: Warning move this to new thread
                            for(FollowBrand data: followBrands){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setFollowBrands1(List<Map<String, Object>> followBrands) {
                        //First create a dummy Repo class object for ..
                        FollowBrandRepository followBrandsRepository = new FollowBrandRepository();
                        List<FollowBrand> result = new ArrayList<>();
                        for (Map<String, Object> obj : followBrands) {
                            //Also add relation to child type for two way communication..
                            FollowBrand obj1 = followBrandsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setFollowBrands(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setFollowBrands1(DataList<HashMap<String, Object>> followBrands) {
                        //First create a dummy Repo class object for ..
                        FollowBrandRepository followBrandsRepository = new FollowBrandRepository();
                        DataList<FollowBrand> result = new DataList<>();
                        for (HashMap<String, Object> obj : followBrands) {
                            //Also add relation to child type for two way communication..
                            FollowBrand obj1 = followBrandsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setFollowBrands(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<FollowBrand> followBrands, FollowBrand dummyClassInstance) {
                        that.setFollowBrands(followBrands);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(FollowBrand followBrands) {
                        try{
                            try{

                                  //Save to database..
                                  followBrands.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getFollowBrands().add(followBrands);
                        }catch(Exception e){
                            DataList< FollowBrand> followBrands1 = new DataList();
                            //Now add this item to list..
                            followBrands1.add(followBrands);
                            //Now set data....
                            that.setFollowBrands(followBrands1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__followBrands( String fk,  RestAdapter restAdapter, final ObjectCallback<FollowBrand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__followBrands( (String)that.getId(), fk,  new ObjectCallback<FollowBrand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FollowBrand object) {
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
                                    public void destroyById__followBrands( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__followBrands( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__followBrands( String fk,  FollowBrand data,  RestAdapter restAdapter, final ObjectCallback<FollowBrand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__followBrands( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<FollowBrand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FollowBrand object) {
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
                                    public void get__followBrands( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<FollowBrand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__followBrands( (String)that.getId(), filter,  new DataListCallback<FollowBrand> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<FollowBrand> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            FollowBrand obj = new FollowBrand();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (FollowBrand obj : object) {
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
                                    public void create__followBrands( FollowBrand data,  RestAdapter restAdapter, final ObjectCallback<FollowBrand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__followBrands( (String)that.getId(), data.convertMap(),  new ObjectCallback<FollowBrand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FollowBrand object) {
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
                                    public void delete__followBrands( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__followBrands( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__followBrands( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__followBrands( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                

                
                
                    //TODO ADD BACKWARD COMPATIBILITY FOR hasManyThrough relationship..warning backward compatibility may leads to cyclic error..
                    //Define belongsTo relation method here..
                    private transient DataList<Brand>  brands ;

                    public DataList<Brand> getBrands() {
                        return brands;
                    }


                    public void setBrands(DataList<Brand> brands) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: brands){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }else if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setBrands1(hashMaps);
                        }else{
                            this.brands = brands;
                        }
                    }

                    /*

                    //Adding related model automatically in case of include statement from server..
                    public void setBrands1(List<Map<String, Object>> brands) {
                        //First create a dummy Repo class object for ..
                        BrandRepository brandsRepository = new BrandRepository();
                        List<Brand> result = new ArrayList<>();
                        for (Map<String, Object> obj : brands) {
                            //Also add relation to child type for two way communication..
                            Brand obj1 = brandsRepository.createObject(obj);
                            result.add(obj1);
                        }
                        setBrands(result);
                    }

                    */

                    //Adding related model automatically in case of include statement from server..
                    public void setBrands1(DataList<HashMap<String, Object>> brands) {
                        //First create a dummy Repo class object for ..
                        BrandRepository brandsRepository = new BrandRepository();
                        DataList<Brand> result = new DataList<>();
                        for (HashMap<String, Object> obj : brands) {
                            //Also add relation to child type for two way communication..
                            Brand obj1 = brandsRepository.createObject(obj);
                            result.add(obj1);
                        }
                        setBrands(result);
                    }


                    //Adding relation method..
                    public void addRelation(DataList<Brand> brands, Brand dummyClassInstance) {
                        that.setBrands(brands);
                    }


                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Brand brands) {
                        try{
                            that.getBrands().add(brands);
                        }catch(Exception e){
                            DataList< Brand> brands1 = new DataList();
                            //Now add this item to list..
                            brands1.add(brands);
                            //Now set data....
                            that.setBrands(brands1);
                        }
                    }

                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__brands( String fk,  RestAdapter restAdapter, final ObjectCallback<Brand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.findById__brands( (String)that.getId(), fk,  new ObjectCallback<Brand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Brand object) {
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
                                    public void destroyById__brands( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.destroyById__brands( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__brands( String fk,  Brand data,  RestAdapter restAdapter, final ObjectCallback<Brand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.updateById__brands( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Brand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Brand object) {
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
                                    public void link__brands( String fk,  RestAdapter restAdapter, final ObjectCallback<Brand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.link__brands( (String)that.getId(), fk,  new ObjectCallback<Brand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Brand object) {
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
                                    public void unlink__brands( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.unlink__brands( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__brands( String fk,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.exists__brands( (String)that.getId(), fk,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__brands( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Brand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.get__brands( (String)that.getId(), filter,  new DataListCallback<Brand> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Brand> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Brand obj = new Brand();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Brand obj : object) {
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
                                    public void create__brands( Brand data,  RestAdapter restAdapter, final ObjectCallback<Brand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.create__brands( (String)that.getId(), data.convertMap(),  new ObjectCallback<Brand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Brand object) {
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
                                    public void delete__brands( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        



                                        appUserRepo.delete__brands( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__brands( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AppUserRepository  appUserRepo = restAdapter.createRepository(AppUserRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        appUserRepo.count__brands( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                
                    //Define hasAndBelongsToMany..

                 
             
          
      

}
