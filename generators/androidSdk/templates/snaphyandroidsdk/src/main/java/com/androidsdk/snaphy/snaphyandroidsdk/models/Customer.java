package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.User;



import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.adapters.Adapter;

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookAccessTokenRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TrackRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.LastUpdatedLocationRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Customer extends com.strongloop.android.loopback.User {


    //For converting all model values to hashMap
    private Map<String, Object> hashMap = new HashMap<>();

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

    
        
            
            
                private String date;
                /* Adding Getter and Setter methods */
                public String getDate(){
                    return date;
                }

                /* Adding Getter and Setter methods */
                public void setDate(String date){
                    this.date = date;
                    //Update hashMap value..
                    hashMap.put("date", date);
                }

            
            
            
            

        
    
        
            
            
                private String lastModified;
                /* Adding Getter and Setter methods */
                public String getLastModified(){
                    return lastModified;
                }

                /* Adding Getter and Setter methods */
                public void setLastModified(String lastModified){
                    this.lastModified = lastModified;
                    //Update hashMap value..
                    hashMap.put("lastModified", lastModified);
                }

            
            
            
            

        
    
        
            
            
                private String phoneNumber;
                /* Adding Getter and Setter methods */
                public String getPhoneNumber(){
                    return phoneNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPhoneNumber(String phoneNumber){
                    this.phoneNumber = phoneNumber;
                    //Update hashMap value..
                    hashMap.put("phoneNumber", phoneNumber);
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

            
            
            
            

        
    
        
            
            
                private String password;
                /* Adding Getter and Setter methods */
                public String getPassword(){
                    return password;
                }

                /* Adding Getter and Setter methods */
                public void setPassword(String password){
                    this.password = password;
                    //Update hashMap value..
                    hashMap.put("password", password);
                }

            
            
            
            

        
    
        
            
            
            
            
            
                private Map<String, Object> lastUpdatedLocation = new HashMap();
                /* Adding Getter and Setter methods */
                public Map<String, Object> getLastUpdatedLocation(){
                    return lastUpdatedLocation;
                }
                /* Adding Getter and Setter methods */
                public double getLastUpdatedLocationLatitide(){
                    if(lastUpdatedLocation != null){
                        return (Double)lastUpdatedLocation.get("lat");
                    }else{
                        return 0;
                    }
                }

                /* Adding Getter and Setter methods */
                public double getLastUpdatedLocationLongitude(){
                    if(lastUpdatedLocation != null){
                        return (Double)lastUpdatedLocation.get("lng");
                    }else{
                        return 0;
                    }

                }

                /* Adding Getter and Setter methods */
                public void setLastUpdatedLocation(Map<String, Object> lastUpdatedLocation){
                    this.lastUpdatedLocation.putAll(lastUpdatedLocation);
                    //Update Map value..
                    hashMap.put("lastUpdatedLocation", lastUpdatedLocation);
                }

                /* Adding Getter and Setter methods */
                public void setLastUpdatedLocation(double lat, double lng){
                    this.lastUpdatedLocation.put("lat", lat);
                    this.lastUpdatedLocation.put("lng", lng);
                    //Update Map value..
                    hashMap.put("lastUpdatedLocation", lastUpdatedLocation);
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

            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    


    



    //Now adding relations between related models
    
         
          
    
        
                
                    //Define belongsTo relation method here..
                    private FacebookAccessToken  facebookAccessToken ;

                    public FacebookAccessToken getFacebookAccessToken() {
                        return facebookAccessToken;
                    }

                    public void setFacebookAccessToken(FacebookAccessToken facebookAccessToken) {
                        this.facebookAccessToken = facebookAccessToken;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setFacebookAccessToken(Map<String, Object> facebookAccessToken) {
                        //First create a dummy Repo class object for customer.
                        FacebookAccessTokenRepository facebookAccessTokenRepository = new FacebookAccessTokenRepository();
                        FacebookAccessToken facebookAccessToken1 = facebookAccessTokenRepository.createObject(facebookAccessToken);
                        setFacebookAccessToken(facebookAccessToken1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setFacebookAccessToken(HashMap<String, Object> facebookAccessToken) {
                        //First create a dummy Repo class object for customer.
                        FacebookAccessTokenRepository facebookAccessTokenRepository = new FacebookAccessTokenRepository();
                        FacebookAccessToken facebookAccessToken1 = facebookAccessTokenRepository.createObject(facebookAccessToken);
                        setFacebookAccessToken(facebookAccessToken1);
                    }

                    //Adding relation method..
                    public void addRelation(FacebookAccessToken facebookAccessToken) {
                        that.setFacebookAccessToken(facebookAccessToken);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__facebookAccessToken( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__facebookAccessToken( (String)that.getId(), refresh,  new ObjectCallback<FacebookAccessToken> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FacebookAccessToken object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__facebookAccessToken( FacebookAccessToken data,  RestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
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
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void update__facebookAccessToken( FacebookAccessToken data,  RestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.update__facebookAccessToken( (String)that.getId(), data.convertMap(),  new ObjectCallback<FacebookAccessToken> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FacebookAccessToken object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroy__facebookAccessToken( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.destroy__facebookAccessToken( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
                
                
                    
                    //Define hasMany relation method here..
                    private List<Track>  track ;

                    public List<Track> getTrack() {
                        return track;
                    }

                    public void setTrack(List<Track> track) {
                        boolean hashType = false;
                        List<HashMap<String, Object>> hashMaps = new ArrayList<>();
                        for(Object o: track){
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
                            setTrack1(hashMaps);
                        }else{
                            this.track = track;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTrack1(List<Map<String, Object>> track) {
                        //First create a dummy Repo class object for ..
                        TrackRepository trackRepository = new TrackRepository();
                        List<Track> result = new ArrayList<>();
                        for (Map<String, Object> obj : track) {
                            //Also add relation to child type for two way communication..
                            Track obj1 = trackRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTrack(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTrack1(List<HashMap<String, Object>> track) {
                        //First create a dummy Repo class object for ..
                        TrackRepository trackRepository = new TrackRepository();
                        List<Track> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : track) {
                            //Also add relation to child type for two way communication..
                            Track obj1 = trackRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTrack(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(List<Track> track, Track dummyClassInstance) {
                        that.setTrack(track);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Track track) {
                        try{
                            that.getTrack().add(track);
                        }catch(Exception e){
                            List< Track> track1 = new ArrayList();
                            //Now add this item to list..
                            track1.add(track);
                            //Now set data....
                            that.setTrack(track1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__track( String fk,  RestAdapter restAdapter, final ObjectCallback<Track> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__track( (String)that.getId(), fk,  new ObjectCallback<Track> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Track object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__track( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__track( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__track( String fk,  Track data,  RestAdapter restAdapter, final ObjectCallback<Track> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__track( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Track> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Track object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__track( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final ListCallback<Track> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__track( (String)that.getId(), filter,  new ListCallback<Track> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(List<Track> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Track obj = new Track();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Track obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__track( Track data,  RestAdapter restAdapter, final ObjectCallback<Track> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__track( (String)that.getId(), data.convertMap(),  new ObjectCallback<Track> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Track object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__track( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__track( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__track( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__track( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
                
                    //Define belongsTo relation method here..
                    private LastUpdatedLocation  lastUpdatedLocations ;

                    public LastUpdatedLocation getLastUpdatedLocations() {
                        return lastUpdatedLocations;
                    }

                    public void setLastUpdatedLocations(LastUpdatedLocation lastUpdatedLocations) {
                        this.lastUpdatedLocations = lastUpdatedLocations;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setLastUpdatedLocations(Map<String, Object> lastUpdatedLocations) {
                        //First create a dummy Repo class object for customer.
                        LastUpdatedLocationRepository lastUpdatedLocationsRepository = new LastUpdatedLocationRepository();
                        LastUpdatedLocation lastUpdatedLocations1 = lastUpdatedLocationsRepository.createObject(lastUpdatedLocations);
                        setLastUpdatedLocations(lastUpdatedLocations1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setLastUpdatedLocations(HashMap<String, Object> lastUpdatedLocations) {
                        //First create a dummy Repo class object for customer.
                        LastUpdatedLocationRepository lastUpdatedLocationsRepository = new LastUpdatedLocationRepository();
                        LastUpdatedLocation lastUpdatedLocations1 = lastUpdatedLocationsRepository.createObject(lastUpdatedLocations);
                        setLastUpdatedLocations(lastUpdatedLocations1);
                    }

                    //Adding relation method..
                    public void addRelation(LastUpdatedLocation lastUpdatedLocations) {
                        that.setLastUpdatedLocations(lastUpdatedLocations);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__lastUpdatedLocations( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<LastUpdatedLocation> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__lastUpdatedLocations( (String)that.getId(), refresh,  new ObjectCallback<LastUpdatedLocation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(LastUpdatedLocation object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__lastUpdatedLocations( LastUpdatedLocation data,  RestAdapter restAdapter, final ObjectCallback<LastUpdatedLocation> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__lastUpdatedLocations( (String)that.getId(), data.convertMap(),  new ObjectCallback<LastUpdatedLocation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(LastUpdatedLocation object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void update__lastUpdatedLocations( LastUpdatedLocation data,  RestAdapter restAdapter, final ObjectCallback<LastUpdatedLocation> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.update__lastUpdatedLocations( (String)that.getId(), data.convertMap(),  new ObjectCallback<LastUpdatedLocation> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(LastUpdatedLocation object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroy__lastUpdatedLocations( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.destroy__lastUpdatedLocations( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
