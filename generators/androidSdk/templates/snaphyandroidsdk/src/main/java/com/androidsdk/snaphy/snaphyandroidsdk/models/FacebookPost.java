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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookPostRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class FacebookPost extends Model {


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

    private FacebookPost that ;

    public FacebookPost (){
        that = this;
    }

    
        
            

            
                private String message;
                /* Adding Getter and Setter methods */
                public String getMessage(){
                    return message;
                }

                /* Adding Getter and Setter methods */
                public void setMessage(String message){
                    this.message = message;
                    //Update hashMap value..
                    hashMap.put("message", message);
                }

            
            
        
    
        
            

            
                private String link;
                /* Adding Getter and Setter methods */
                public String getLink(){
                    return link;
                }

                /* Adding Getter and Setter methods */
                public void setLink(String link){
                    this.link = link;
                    //Update hashMap value..
                    hashMap.put("link", link);
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

            
            
        
    
        
            

            
                private Map<String, Object> from;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getFrom(){
                    return from;
                }

                /* Adding Getter and Setter methods */
                public void setFrom(Map<String, Object> from){
                    this.from = from;
                    //Update Map value..
                    hashMap.put("from", from);
                }

            
            
        
    
        
            

            
                private Map<String, Object> likes;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getLikes(){
                    return likes;
                }

                /* Adding Getter and Setter methods */
                public void setLikes(Map<String, Object> likes){
                    this.likes = likes;
                    //Update Map value..
                    hashMap.put("likes", likes);
                }

            
            
        
    
        
            

            
                private Map<String, Object> attachments;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getAttachments(){
                    return attachments;
                }

                /* Adding Getter and Setter methods */
                public void setAttachments(Map<String, Object> attachments){
                    this.attachments = attachments;
                    //Update Map value..
                    hashMap.put("attachments", attachments);
                }

            
            
        
    
        
            

            
                private double like;
                /* Adding Getter and Setter methods */
                public double getLike(){
                    return like;
                }

                /* Adding Getter and Setter methods */
                public void setLike(double like){
                    this.like = like;
                    //Update hashMap value..
                    hashMap.put("like", like);
                }

            
            
        
    
        
            

            
                private double comment;
                /* Adding Getter and Setter methods */
                public double getComment(){
                    return comment;
                }

                /* Adding Getter and Setter methods */
                public void setComment(double comment){
                    this.comment = comment;
                    //Update hashMap value..
                    hashMap.put("comment", comment);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      FacebookPostRepository lowercaseFirstLetterRepository = (FacebookPostRepository) getRepository();
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
      FacebookPostRepository lowercaseFirstLetterRepository = (FacebookPostRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      FacebookPostRepository lowercaseFirstLetterRepository = (FacebookPostRepository) getRepository();
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
