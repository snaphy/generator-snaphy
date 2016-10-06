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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ApplicationRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Application extends Model {


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

    private Application that ;

    public Application (){
        that = this;
    }

    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            

                private List<Object> collaborators;
                /* Adding Getter and Setter methods */
                public List<Object> getCollaborators(){
                    return collaborators;
                }

                /* Adding Getter and Setter methods */
                public void setCollaborators(List<Object> collaborators){
                    this.collaborators = collaborators;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("collaborators", collaborators);
                }

            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            

                private List<Object> callbackUrls;
                /* Adding Getter and Setter methods */
                public List<Object> getCallbackUrls(){
                    return callbackUrls;
                }

                /* Adding Getter and Setter methods */
                public void setCallbackUrls(List<Object> callbackUrls){
                    this.callbackUrls = callbackUrls;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("callbackUrls", callbackUrls);
                }

            
            
            
            
            

        
    
        
            

                private List<Object> permissions;
                /* Adding Getter and Setter methods */
                public List<Object> getPermissions(){
                    return permissions;
                }

                /* Adding Getter and Setter methods */
                public void setPermissions(List<Object> permissions){
                    this.permissions = permissions;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("permissions", permissions);
                }

            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            

                private List<Object> authenticationSchemes;
                /* Adding Getter and Setter methods */
                public List<Object> getAuthenticationSchemes(){
                    return authenticationSchemes;
                }

                /* Adding Getter and Setter methods */
                public void setAuthenticationSchemes(List<Object> authenticationSchemes){
                    this.authenticationSchemes = authenticationSchemes;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("authenticationSchemes", authenticationSchemes);
                }

            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    


    



    //Now adding relations between related models
      

}
