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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Student extends User {


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

    private Student that ;

    public Student (){
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

            
        
    
        
            

            
                private String realm;
                /* Adding Getter and Setter methods */
                public String getRealm(){
                    return realm;
                }

                /* Adding Getter and Setter methods */
                public void setRealm(String realm){
                    this.realm = realm;
                }
             
        
    
        
            

            
                private String username;
                /* Adding Getter and Setter methods */
                public String getUsername(){
                    return username;
                }

                /* Adding Getter and Setter methods */
                public void setUsername(String username){
                    this.username = username;
                }
             
        
    
        
            

            
                private String password;
                /* Adding Getter and Setter methods */
                public String getPassword(){
                    return password;
                }

                /* Adding Getter and Setter methods */
                public void setPassword(String password){
                    this.password = password;
                }
             
        
    
        
            

            
                private Object credentials;
                /* Adding Getter and Setter methods */
                public Object getCredentials(){
                    return credentials;
                }

                /* Adding Getter and Setter methods */
                public void setCredentials(Object credentials){
                    this.credentials = credentials;
                }
             
        
    
        
            

            
                private Object challenges;
                /* Adding Getter and Setter methods */
                public Object getChallenges(){
                    return challenges;
                }

                /* Adding Getter and Setter methods */
                public void setChallenges(Object challenges){
                    this.challenges = challenges;
                }
             
        
    
        
            

            
                private String email;
                /* Adding Getter and Setter methods */
                public String getEmail(){
                    return email;
                }

                /* Adding Getter and Setter methods */
                public void setEmail(String email){
                    this.email = email;
                }
             
        
    
        
            

            
                private Boolean emailVerified;
                /* Adding Getter and Setter methods */
                public Boolean getEmailVerified(){
                    return emailVerified;
                }

                /* Adding Getter and Setter methods */
                public void setEmailVerified(Boolean emailVerified){
                    this.emailVerified = emailVerified;
                }
             
        
    
        
            

            
                private String verificationToken;
                /* Adding Getter and Setter methods */
                public String getVerificationToken(){
                    return verificationToken;
                }

                /* Adding Getter and Setter methods */
                public void setVerificationToken(String verificationToken){
                    this.verificationToken = verificationToken;
                }
             
        
    
        
            

            
                private String status;
                /* Adding Getter and Setter methods */
                public String getStatus(){
                    return status;
                }

                /* Adding Getter and Setter methods */
                public void setStatus(String status){
                    this.status = status;
                }
             
        
    
        
            

            
                private String created;
                /* Adding Getter and Setter methods */
                public String getCreated(){
                    return created;
                }

                /* Adding Getter and Setter methods */
                public void setCreated(String created){
                    this.created = created;
                }
             
        
    
        
            

            
                private String lastUpdated;
                /* Adding Getter and Setter methods */
                public String getLastUpdated(){
                    return lastUpdated;
                }

                /* Adding Getter and Setter methods */
                public void setLastUpdated(String lastUpdated){
                    this.lastUpdated = lastUpdated;
                }
             
        
    
        
            

            
                private Object id;
                /* Adding Getter and Setter methods */
                public Object getId(){
                    return id;
                }

                /* Adding Getter and Setter methods */
                public void setId(Object id){
                    this.id = id;
                }
             
        
    
        
            

            
                private Object brandId;
                /* Adding Getter and Setter methods */
                public Object getBrandId(){
                    return brandId;
                }

                /* Adding Getter and Setter methods */
                public void setBrandId(Object brandId){
                    this.brandId = brandId;
                }
             
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      StudentRepository lowercaseFirstLetterRepository = (StudentRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null){
             lowercaseFirstLetterRepository.getStudentDb().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }



    public void save__db(String id){
      StudentRepository lowercaseFirstLetterRepository = (StudentRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null){
          lowercaseFirstLetterRepository.getStudentDb().upsert__db(id, this);
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
                    private transient Brand  brand ;
                    private String brandId;

                    public String getBrandId(){
                         return brandId;
                    }

                    public void setBrandId(Object brandId){
                        if(brandId != null){
                          this.brandId = brandId.toString();
                        }
                    }

                    public Brand getBrand() {
                        //Adding database method for fetching from relation if not present..
                        if(brand == null){
                          StudentRepository studentRepository = (StudentRepository) getRepository();
                          RestAdapter restAdapter = studentRepository.getRestAdapter();
                          if(restAdapter != null){
                            //Fetch locally from db
                            brand = getBrand__db(restAdapter);
                          }
                        }
                        return brand;
                    }

                    public void setBrand(Brand brand) {
                        this.brand = brand;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBrand(Map<String, Object> brand) {
                        //First create a dummy Repo class object for customer.
                        BrandRepository brandRepository = new BrandRepository();
                        Brand brand1 = brandRepository.createObject(brand);
                        setBrand(brand1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBrand(HashMap<String, Object> brand) {
                        //First create a dummy Repo class object for customer.
                        BrandRepository brandRepository = new BrandRepository();
                        Brand brand1 = brandRepository.createObject(brand);
                        setBrand(brand1);
                    }

                    //Adding relation method..
                    public void addRelation(Brand brand) {
                        that.setBrand(brand);
                    }


                    //Fetch related data from local database if present a brandId identifier as property for belongsTo
                    public Brand getBrand__db(RestAdapter restAdapter){
                      if(brandId != null){
                        BrandRepository brandRepository = restAdapter.createRepository(BrandRepository.class);
                        Brand brand = (Brand) brandRepository.getBrandDb().get__db(brandId);
                        if(brand != null){
                          return brand;
                        }else{
                          return null;
                        }
                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__brand( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Brand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__brand( (String)that.getId(), refresh,  new ObjectCallback<Brand> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}