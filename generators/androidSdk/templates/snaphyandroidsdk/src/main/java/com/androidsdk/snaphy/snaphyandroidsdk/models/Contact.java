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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ContactRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Contact extends Model {


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

    private Contact that ;

    public Contact (){
        that = this;
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

            
            
        
    
        
            

            
                private String findUs;
                /* Adding Getter and Setter methods */
                public String getFindUs(){
                    return findUs;
                }

                /* Adding Getter and Setter methods */
                public void setFindUs(String findUs){
                    this.findUs = findUs;
                    //Update hashMap value..
                    hashMap.put("findUs", findUs);
                }

            
            
        
    
        
            

            
                private String callUs;
                /* Adding Getter and Setter methods */
                public String getCallUs(){
                    return callUs;
                }

                /* Adding Getter and Setter methods */
                public void setCallUs(String callUs){
                    this.callUs = callUs;
                    //Update hashMap value..
                    hashMap.put("callUs", callUs);
                }

            
            
        
    
        
            

            
                private String emailUs;
                /* Adding Getter and Setter methods */
                public String getEmailUs(){
                    return emailUs;
                }

                /* Adding Getter and Setter methods */
                public void setEmailUs(String emailUs){
                    this.emailUs = emailUs;
                    //Update hashMap value..
                    hashMap.put("emailUs", emailUs);
                }

            
            
        
    
        
            

            
                private String connectWithUs;
                /* Adding Getter and Setter methods */
                public String getConnectWithUs(){
                    return connectWithUs;
                }

                /* Adding Getter and Setter methods */
                public void setConnectWithUs(String connectWithUs){
                    this.connectWithUs = connectWithUs;
                    //Update hashMap value..
                    hashMap.put("connectWithUs", connectWithUs);
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

            
            
        
    
        
            

            
                private Map<String, Object> location;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getLocation(){
                    return location;
                }

                /* Adding Getter and Setter methods */
                public void setLocation(Map<String, Object> location){
                    this.location = location;
                    //Update Map value..
                    hashMap.put("location", location);
                }

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ContactRepository lowercaseFirstLetterRepository = (ContactRepository) getRepository();
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
      ContactRepository lowercaseFirstLetterRepository = (ContactRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ContactRepository lowercaseFirstLetterRepository = (ContactRepository) getRepository();
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
      

}
