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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AboutUsRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class AboutUs extends Model {


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

    private AboutUs that ;

    public AboutUs (){
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

            
            
        
    
        
            

            
                private String videoLink;
                /* Adding Getter and Setter methods */
                public String getVideoLink(){
                    return videoLink;
                }

                /* Adding Getter and Setter methods */
                public void setVideoLink(String videoLink){
                    this.videoLink = videoLink;
                    //Update hashMap value..
                    hashMap.put("videoLink", videoLink);
                }

            
            
        
    
        
            

            
                private double mapLat;
                /* Adding Getter and Setter methods */
                public double getMapLat(){
                    return mapLat;
                }

                /* Adding Getter and Setter methods */
                public void setMapLat(double mapLat){
                    this.mapLat = mapLat;
                    //Update hashMap value..
                    hashMap.put("mapLat", mapLat);
                }

            
            
        
    
        
            

            
                private double mapLong;
                /* Adding Getter and Setter methods */
                public double getMapLong(){
                    return mapLong;
                }

                /* Adding Getter and Setter methods */
                public void setMapLong(double mapLong){
                    this.mapLong = mapLong;
                    //Update hashMap value..
                    hashMap.put("mapLong", mapLong);
                }

            
            
        
    
        
            

            
                private String description;
                /* Adding Getter and Setter methods */
                public String getDescription(){
                    return description;
                }

                /* Adding Getter and Setter methods */
                public void setDescription(String description){
                    this.description = description;
                    //Update hashMap value..
                    hashMap.put("description", description);
                }

            
            
        
    
        
            

            
                private String ourMissionDescription;
                /* Adding Getter and Setter methods */
                public String getOurMissionDescription(){
                    return ourMissionDescription;
                }

                /* Adding Getter and Setter methods */
                public void setOurMissionDescription(String ourMissionDescription){
                    this.ourMissionDescription = ourMissionDescription;
                    //Update hashMap value..
                    hashMap.put("ourMissionDescription", ourMissionDescription);
                }

            
            
        
    
        
            

            
                private String whereYouCanFindUsDescription;
                /* Adding Getter and Setter methods */
                public String getWhereYouCanFindUsDescription(){
                    return whereYouCanFindUsDescription;
                }

                /* Adding Getter and Setter methods */
                public void setWhereYouCanFindUsDescription(String whereYouCanFindUsDescription){
                    this.whereYouCanFindUsDescription = whereYouCanFindUsDescription;
                    //Update hashMap value..
                    hashMap.put("whereYouCanFindUsDescription", whereYouCanFindUsDescription);
                }

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      AboutUsRepository lowercaseFirstLetterRepository = (AboutUsRepository) getRepository();
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
      AboutUsRepository lowercaseFirstLetterRepository = (AboutUsRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      AboutUsRepository lowercaseFirstLetterRepository = (AboutUsRepository) getRepository();
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
