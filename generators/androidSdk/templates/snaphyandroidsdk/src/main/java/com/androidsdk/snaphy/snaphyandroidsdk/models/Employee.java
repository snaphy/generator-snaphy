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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;

//Now import repository of related models..

    
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Employee extends User {


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

    private Employee that ;

    public Employee (){
        that = this;
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

            
        
    
        
            

            
                private String realm;
                /* Adding Getter and Setter methods */
                public String getRealm(){
                    return realm;
                }

                /* Adding Getter and Setter methods */
                public void setRealm(String realm){
                    this.realm = realm;
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
             
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null){
             lowercaseFirstLetterRepository.getEmployeeDb().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }



    public void save__db(String id){
      EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null){
          lowercaseFirstLetterRepository.getEmployeeDb().upsert__db(id, this);
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
    
         
          
      

}
