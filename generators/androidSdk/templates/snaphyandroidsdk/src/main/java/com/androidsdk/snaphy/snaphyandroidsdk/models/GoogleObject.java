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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.GoogleObjectRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class GoogleObject extends Model {


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

    private GoogleObject that ;

    public GoogleObject (){
        that = this;
    }

    
        
            

            
                private String url;
                /* Adding Getter and Setter methods */
                public String getUrl(){
                    return url;
                }

                /* Adding Getter and Setter methods */
                public void setUrl(String url){
                    this.url = url;
                    //Update hashMap value..
                    hashMap.put("url", url);
                }

            
            
        
    
        
            

            
                private Map<String, Object> replies;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getReplies(){
                    return replies;
                }

                /* Adding Getter and Setter methods */
                public void setReplies(Map<String, Object> replies){
                    this.replies = replies;
                    //Update Map value..
                    hashMap.put("replies", replies);
                }

            
            
        
    
        
            

            
                private Map<String, Object> plusoners;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getPlusoners(){
                    return plusoners;
                }

                /* Adding Getter and Setter methods */
                public void setPlusoners(Map<String, Object> plusoners){
                    this.plusoners = plusoners;
                    //Update Map value..
                    hashMap.put("plusoners", plusoners);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> attachments;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getAttachments(){
                    return attachments;
                }

                /* Adding Getter and Setter methods */
                public void setAttachments(DataList<Map<String, Object>> attachments){
                    this.attachments = attachments;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("attachments", attachments);
                }

            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      GoogleObjectRepository lowercaseFirstLetterRepository = (GoogleObjectRepository) getRepository();
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
      GoogleObjectRepository lowercaseFirstLetterRepository = (GoogleObjectRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      GoogleObjectRepository lowercaseFirstLetterRepository = (GoogleObjectRepository) getRepository();
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
