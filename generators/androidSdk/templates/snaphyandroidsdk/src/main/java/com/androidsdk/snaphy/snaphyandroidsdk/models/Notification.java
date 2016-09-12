package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;



import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.adapters.Adapter;

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.NotificationRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Notification extends Model {


    //For converting all model values to hashMap
    private Map<String, Object> hashMap = new HashMap<>();

    public Map<String,  ? extends Object> convertMap(){
        if(that.getId() != null){
            return hashMap;
        }else{
            hashMap.put("id", that.getId());
            return hashMap;
        }
    }

    private Notification that ;

    public Notification (){
        that = this;
    }

    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            

                private List<Object> urlArgs;
                /* Adding Getter and Setter methods */
                public List<Object> getUrlArgs(){
                    return urlArgs;
                }

                /* Adding Getter and Setter methods */
                public void setUrlArgs(List<Object> urlArgs){
                    this.urlArgs = urlArgs;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("urlArgs", urlArgs);
                }

            
            
            
            
            

        
    
        
            
            
            
            
            

        
    


    



    //Now adding relations between related models
      

}
