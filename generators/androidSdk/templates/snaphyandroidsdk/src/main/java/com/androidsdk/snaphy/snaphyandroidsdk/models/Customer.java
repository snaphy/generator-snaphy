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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookAccessTokenRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SavePostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.LikePostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostSubscriberRepository;
            

        
    


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

            
            
            
            

            

        
    
        
            

            
                private String mciNumber;
                /* Adding Getter and Setter methods */
                public String getMciNumber(){
                    return mciNumber;
                }

                /* Adding Getter and Setter methods */
                public void setMciNumber(String mciNumber){
                    this.mciNumber = mciNumber;
                    //Update hashMap value..
                    hashMap.put("mciNumber", mciNumber);
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
                    private transient FacebookAccessToken  facebookAccessToken ;

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
                                        //Call the onBefore callback method..
                                        callback.onBefore();

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
                                    public void update__facebookAccessToken( FacebookAccessToken data,  RestAdapter restAdapter, final ObjectCallback<FacebookAccessToken> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

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
                                    public void destroy__facebookAccessToken( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.destroy__facebookAccessToken( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
                
                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Comment>  comments ;

                    public DataList<Comment> getComments() {
                        return comments;
                    }

                    public void setComments(DataList<Comment> comments) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: comments){
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
                            setComments1(hashMaps);
                        }else{
                            this.comments = comments;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(List<Map<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentRepository commentsRepository = new CommentRepository();
                        List<Comment> result = new ArrayList<>();
                        for (Map<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comment obj1 = commentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setComments(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(DataList<HashMap<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentRepository commentsRepository = new CommentRepository();
                        DataList<Comment> result = new DataList<>();
                        for (HashMap<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comment obj1 = commentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setComments(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Comment> comments, Comment dummyClassInstance) {
                        that.setComments(comments);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Comment comments) {
                        try{
                            that.getComments().add(comments);
                        }catch(Exception e){
                            DataList< Comment> comments1 = new DataList();
                            //Now add this item to list..
                            comments1.add(comments);
                            //Now set data....
                            that.setComments(comments1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__comments( String fk,  RestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__comments( (String)that.getId(), fk,  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void destroyById__comments( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__comments( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__comments( String fk,  Comment data,  RestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__comments( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void get__comments( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__comments( (String)that.getId(), filter,  new DataListCallback<Comment> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Comment> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Comment obj = new Comment();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Comment obj : object) {
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
                                    public void create__comments( Comment data,  RestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__comments( (String)that.getId(), data.convertMap(),  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void delete__comments( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__comments( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__comments( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__comments( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Post>  posts ;

                    public DataList<Post> getPosts() {
                        return posts;
                    }

                    public void setPosts(DataList<Post> posts) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: posts){
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
                            setPosts1(hashMaps);
                        }else{
                            this.posts = posts;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPosts1(List<Map<String, Object>> posts) {
                        //First create a dummy Repo class object for ..
                        PostRepository postsRepository = new PostRepository();
                        List<Post> result = new ArrayList<>();
                        for (Map<String, Object> obj : posts) {
                            //Also add relation to child type for two way communication..
                            Post obj1 = postsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPosts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPosts1(DataList<HashMap<String, Object>> posts) {
                        //First create a dummy Repo class object for ..
                        PostRepository postsRepository = new PostRepository();
                        DataList<Post> result = new DataList<>();
                        for (HashMap<String, Object> obj : posts) {
                            //Also add relation to child type for two way communication..
                            Post obj1 = postsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPosts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Post> posts, Post dummyClassInstance) {
                        that.setPosts(posts);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Post posts) {
                        try{
                            that.getPosts().add(posts);
                        }catch(Exception e){
                            DataList< Post> posts1 = new DataList();
                            //Now add this item to list..
                            posts1.add(posts);
                            //Now set data....
                            that.setPosts(posts1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__posts( String fk,  RestAdapter restAdapter, final ObjectCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__posts( (String)that.getId(), fk,  new ObjectCallback<Post> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Post object) {
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
                                    public void destroyById__posts( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__posts( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__posts( String fk,  Post data,  RestAdapter restAdapter, final ObjectCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__posts( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Post> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Post object) {
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
                                    public void get__posts( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__posts( (String)that.getId(), filter,  new DataListCallback<Post> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Post> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Post obj = new Post();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Post obj : object) {
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
                                    public void create__posts( Post data,  RestAdapter restAdapter, final ObjectCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__posts( (String)that.getId(), data.convertMap(),  new ObjectCallback<Post> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Post object) {
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
                                    public void delete__posts( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__posts( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__posts( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__posts( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<SavePost>  savePosts ;

                    public DataList<SavePost> getSavePosts() {
                        return savePosts;
                    }

                    public void setSavePosts(DataList<SavePost> savePosts) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: savePosts){
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
                            setSavePosts1(hashMaps);
                        }else{
                            this.savePosts = savePosts;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSavePosts1(List<Map<String, Object>> savePosts) {
                        //First create a dummy Repo class object for ..
                        SavePostRepository savePostsRepository = new SavePostRepository();
                        List<SavePost> result = new ArrayList<>();
                        for (Map<String, Object> obj : savePosts) {
                            //Also add relation to child type for two way communication..
                            SavePost obj1 = savePostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSavePosts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSavePosts1(DataList<HashMap<String, Object>> savePosts) {
                        //First create a dummy Repo class object for ..
                        SavePostRepository savePostsRepository = new SavePostRepository();
                        DataList<SavePost> result = new DataList<>();
                        for (HashMap<String, Object> obj : savePosts) {
                            //Also add relation to child type for two way communication..
                            SavePost obj1 = savePostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSavePosts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<SavePost> savePosts, SavePost dummyClassInstance) {
                        that.setSavePosts(savePosts);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(SavePost savePosts) {
                        try{
                            that.getSavePosts().add(savePosts);
                        }catch(Exception e){
                            DataList< SavePost> savePosts1 = new DataList();
                            //Now add this item to list..
                            savePosts1.add(savePosts);
                            //Now set data....
                            that.setSavePosts(savePosts1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__savePosts( String fk,  RestAdapter restAdapter, final ObjectCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__savePosts( (String)that.getId(), fk,  new ObjectCallback<SavePost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SavePost object) {
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
                                    public void destroyById__savePosts( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__savePosts( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__savePosts( String fk,  SavePost data,  RestAdapter restAdapter, final ObjectCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__savePosts( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<SavePost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SavePost object) {
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
                                    public void get__savePosts( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__savePosts( (String)that.getId(), filter,  new DataListCallback<SavePost> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<SavePost> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            SavePost obj = new SavePost();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (SavePost obj : object) {
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
                                    public void create__savePosts( SavePost data,  RestAdapter restAdapter, final ObjectCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__savePosts( (String)that.getId(), data.convertMap(),  new ObjectCallback<SavePost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SavePost object) {
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
                                    public void delete__savePosts( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__savePosts( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__savePosts( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__savePosts( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<LikePost>  likePosts ;

                    public DataList<LikePost> getLikePosts() {
                        return likePosts;
                    }

                    public void setLikePosts(DataList<LikePost> likePosts) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: likePosts){
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
                            setLikePosts1(hashMaps);
                        }else{
                            this.likePosts = likePosts;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setLikePosts1(List<Map<String, Object>> likePosts) {
                        //First create a dummy Repo class object for ..
                        LikePostRepository likePostsRepository = new LikePostRepository();
                        List<LikePost> result = new ArrayList<>();
                        for (Map<String, Object> obj : likePosts) {
                            //Also add relation to child type for two way communication..
                            LikePost obj1 = likePostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setLikePosts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setLikePosts1(DataList<HashMap<String, Object>> likePosts) {
                        //First create a dummy Repo class object for ..
                        LikePostRepository likePostsRepository = new LikePostRepository();
                        DataList<LikePost> result = new DataList<>();
                        for (HashMap<String, Object> obj : likePosts) {
                            //Also add relation to child type for two way communication..
                            LikePost obj1 = likePostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setLikePosts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<LikePost> likePosts, LikePost dummyClassInstance) {
                        that.setLikePosts(likePosts);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(LikePost likePosts) {
                        try{
                            that.getLikePosts().add(likePosts);
                        }catch(Exception e){
                            DataList< LikePost> likePosts1 = new DataList();
                            //Now add this item to list..
                            likePosts1.add(likePosts);
                            //Now set data....
                            that.setLikePosts(likePosts1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__likePosts( String fk,  RestAdapter restAdapter, final ObjectCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__likePosts( (String)that.getId(), fk,  new ObjectCallback<LikePost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(LikePost object) {
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
                                    public void destroyById__likePosts( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__likePosts( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__likePosts( String fk,  LikePost data,  RestAdapter restAdapter, final ObjectCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__likePosts( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<LikePost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(LikePost object) {
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
                                    public void get__likePosts( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__likePosts( (String)that.getId(), filter,  new DataListCallback<LikePost> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<LikePost> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            LikePost obj = new LikePost();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (LikePost obj : object) {
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
                                    public void create__likePosts( LikePost data,  RestAdapter restAdapter, final ObjectCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__likePosts( (String)that.getId(), data.convertMap(),  new ObjectCallback<LikePost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(LikePost object) {
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
                                    public void delete__likePosts( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__likePosts( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__likePosts( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__likePosts( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<PostSubscriber>  postSubscribers ;

                    public DataList<PostSubscriber> getPostSubscribers() {
                        return postSubscribers;
                    }

                    public void setPostSubscribers(DataList<PostSubscriber> postSubscribers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: postSubscribers){
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
                            setPostSubscribers1(hashMaps);
                        }else{
                            this.postSubscribers = postSubscribers;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostSubscribers1(List<Map<String, Object>> postSubscribers) {
                        //First create a dummy Repo class object for ..
                        PostSubscriberRepository postSubscribersRepository = new PostSubscriberRepository();
                        List<PostSubscriber> result = new ArrayList<>();
                        for (Map<String, Object> obj : postSubscribers) {
                            //Also add relation to child type for two way communication..
                            PostSubscriber obj1 = postSubscribersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostSubscribers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostSubscribers1(DataList<HashMap<String, Object>> postSubscribers) {
                        //First create a dummy Repo class object for ..
                        PostSubscriberRepository postSubscribersRepository = new PostSubscriberRepository();
                        DataList<PostSubscriber> result = new DataList<>();
                        for (HashMap<String, Object> obj : postSubscribers) {
                            //Also add relation to child type for two way communication..
                            PostSubscriber obj1 = postSubscribersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostSubscribers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PostSubscriber> postSubscribers, PostSubscriber dummyClassInstance) {
                        that.setPostSubscribers(postSubscribers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PostSubscriber postSubscribers) {
                        try{
                            that.getPostSubscribers().add(postSubscribers);
                        }catch(Exception e){
                            DataList< PostSubscriber> postSubscribers1 = new DataList();
                            //Now add this item to list..
                            postSubscribers1.add(postSubscribers);
                            //Now set data....
                            that.setPostSubscribers(postSubscribers1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__postSubscribers( String fk,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.findById__postSubscribers( (String)that.getId(), fk,  new ObjectCallback<PostSubscriber> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostSubscriber object) {
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
                                    public void destroyById__postSubscribers( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.destroyById__postSubscribers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__postSubscribers( String fk,  PostSubscriber data,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.updateById__postSubscribers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PostSubscriber> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostSubscriber object) {
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
                                    public void get__postSubscribers( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.get__postSubscribers( (String)that.getId(), filter,  new DataListCallback<PostSubscriber> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PostSubscriber> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PostSubscriber obj = new PostSubscriber();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PostSubscriber obj : object) {
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
                                    public void create__postSubscribers( PostSubscriber data,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.create__postSubscribers( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostSubscriber> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostSubscriber object) {
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
                                    public void delete__postSubscribers( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        



                                        customerRepo.delete__postSubscribers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__postSubscribers( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        customerRepo.count__postSubscribers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
