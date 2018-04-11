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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.LabelRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Label extends Model {


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

    private Label that ;

    public Label (){
        that = this;
    }

    
        
            

            
                private String name;
                /* Adding Getter and Setter methods */
                public String getName(){
                    return name;
                }

                /* Adding Getter and Setter methods */
                public void setName(String name){
                    this.name = name;
                    //Update hashMap value..
                    hashMap.put("name", name);
                }

            
            
        
    
        
            

            
                private String type;
                /* Adding Getter and Setter methods */
                public String getType(){
                    return type;
                }

                /* Adding Getter and Setter methods */
                public void setType(String type){
                    this.type = type;
                    //Update hashMap value..
                    hashMap.put("type", type);
                }

            
            
        
    
        
            

            
                private double priority;
                /* Adding Getter and Setter methods */
                public double getPriority(){
                    return priority;
                }

                /* Adding Getter and Setter methods */
                public void setPriority(double priority){
                    this.priority = priority;
                    //Update hashMap value..
                    hashMap.put("priority", priority);
                }

            
            
        
    
        
            

            
                private String colourCode;
                /* Adding Getter and Setter methods */
                public String getColourCode(){
                    return colourCode;
                }

                /* Adding Getter and Setter methods */
                public void setColourCode(String colourCode){
                    this.colourCode = colourCode;
                    //Update hashMap value..
                    hashMap.put("colourCode", colourCode);
                }

            
            
        
    
        
            

            
                private String showAtHome;
                /* Adding Getter and Setter methods */
                public String getShowAtHome(){
                    return showAtHome;
                }

                /* Adding Getter and Setter methods */
                public void setShowAtHome(String showAtHome){
                    this.showAtHome = showAtHome;
                    //Update hashMap value..
                    hashMap.put("showAtHome", showAtHome);
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

            
            
        
    
        
            

            
                private String uniqueNumber;
                /* Adding Getter and Setter methods */
                public String getUniqueNumber(){
                    return uniqueNumber;
                }

                /* Adding Getter and Setter methods */
                public void setUniqueNumber(String uniqueNumber){
                    this.uniqueNumber = uniqueNumber;
                    //Update hashMap value..
                    hashMap.put("uniqueNumber", uniqueNumber);
                }

            
            
        
    
        
            

            
                private String slug;
                /* Adding Getter and Setter methods */
                public String getSlug(){
                    return slug;
                }

                /* Adding Getter and Setter methods */
                public void setSlug(String slug){
                    this.slug = slug;
                    //Update hashMap value..
                    hashMap.put("slug", slug);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      LabelRepository lowercaseFirstLetterRepository = (LabelRepository) getRepository();
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
      LabelRepository lowercaseFirstLetterRepository = (LabelRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      LabelRepository lowercaseFirstLetterRepository = (LabelRepository) getRepository();
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
