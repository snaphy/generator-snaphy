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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BookRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Book extends Model {


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

    private Book that ;

    public Book (){
        that = this;
    }

    
        
            

            
                private String title;
                /* Adding Getter and Setter methods */
                public String getTitle(){
                    return title;
                }

                /* Adding Getter and Setter methods */
                public void setTitle(String title){
                    this.title = title;
                    //Update hashMap value..
                    hashMap.put("title", title);
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

            
            
            
            

            

        
    
        
            

            
            
            
                private Map<String, Object> frontCover;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getFrontCover(){
                    return frontCover;
                }

                /* Adding Getter and Setter methods */
                public void setFrontCover(Map<String, Object> frontCover){
                    this.frontCover = frontCover;
                    //Update Map value..
                    hashMap.put("frontCover", frontCover);
                }

            
            

            

        
    
        
            

            
            
            
                private Map<String, Object> backCover;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getBackCover(){
                    return backCover;
                }

                /* Adding Getter and Setter methods */
                public void setBackCover(Map<String, Object> backCover){
                    this.backCover = backCover;
                    //Update Map value..
                    hashMap.put("backCover", backCover);
                }

            
            

            

        
    
        
            

            
            
            
                private Map<String, Object> uploadBook;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getUploadBook(){
                    return uploadBook;
                }

                /* Adding Getter and Setter methods */
                public void setUploadBook(Map<String, Object> uploadBook){
                    this.uploadBook = uploadBook;
                    //Update Map value..
                    hashMap.put("uploadBook", uploadBook);
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

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    


    



    //Now adding relations between related models
      

}
