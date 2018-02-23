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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.MergeRequestRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class MergeRequest extends Model {


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

    private MergeRequest that ;

    public MergeRequest (){
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

            
            
        
    
        
            

            
                private String mergeNameOne;
                /* Adding Getter and Setter methods */
                public String getMergeNameOne(){
                    return mergeNameOne;
                }

                /* Adding Getter and Setter methods */
                public void setMergeNameOne(String mergeNameOne){
                    this.mergeNameOne = mergeNameOne;
                    //Update hashMap value..
                    hashMap.put("mergeNameOne", mergeNameOne);
                }

            
            
        
    
        
            

            
                private String mergeNameTwo;
                /* Adding Getter and Setter methods */
                public String getMergeNameTwo(){
                    return mergeNameTwo;
                }

                /* Adding Getter and Setter methods */
                public void setMergeNameTwo(String mergeNameTwo){
                    this.mergeNameTwo = mergeNameTwo;
                    //Update hashMap value..
                    hashMap.put("mergeNameTwo", mergeNameTwo);
                }

            
            
        
    
        
            

            
                private String mergePatientIdOne;
                /* Adding Getter and Setter methods */
                public String getMergePatientIdOne(){
                    return mergePatientIdOne;
                }

                /* Adding Getter and Setter methods */
                public void setMergePatientIdOne(String mergePatientIdOne){
                    this.mergePatientIdOne = mergePatientIdOne;
                    //Update hashMap value..
                    hashMap.put("mergePatientIdOne", mergePatientIdOne);
                }

            
            
        
    
        
            

            
                private String mergePatientIdTwo;
                /* Adding Getter and Setter methods */
                public String getMergePatientIdTwo(){
                    return mergePatientIdTwo;
                }

                /* Adding Getter and Setter methods */
                public void setMergePatientIdTwo(String mergePatientIdTwo){
                    this.mergePatientIdTwo = mergePatientIdTwo;
                    //Update hashMap value..
                    hashMap.put("mergePatientIdTwo", mergePatientIdTwo);
                }

            
            
        
    
        
            

            
                private Map<String, Object> backupData;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getBackupData(){
                    return backupData;
                }

                /* Adding Getter and Setter methods */
                public void setBackupData(Map<String, Object> backupData){
                    this.backupData = backupData;
                    //Update Map value..
                    hashMap.put("backupData", backupData);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      MergeRequestRepository lowercaseFirstLetterRepository = (MergeRequestRepository) getRepository();
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
      MergeRequestRepository lowercaseFirstLetterRepository = (MergeRequestRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      MergeRequestRepository lowercaseFirstLetterRepository = (MergeRequestRepository) getRepository();
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
