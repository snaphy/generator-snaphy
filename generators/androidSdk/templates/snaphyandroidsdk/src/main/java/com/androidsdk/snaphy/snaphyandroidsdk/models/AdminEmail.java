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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AdminEmailRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class AdminEmail extends Model {


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

    private AdminEmail that ;

    public AdminEmail (){
        that = this;
    }

    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    


    //------------------------------------Database Method---------------------------------------------------

    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      AdminEmailRepository adminEmailRepository = (AdminEmailRepository) getRepository();
      if(adminEmailRepository.getDbHandler().isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null){
             adminEmailRepository.getDbHandler().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }


    public void save__db(String id){
      AdminEmailRepository adminEmailRepository = (AdminEmailRepository) getRepository();
      if(adminEmailRepository.getDbHandler().isSTORE_LOCALLY()){
        if(id != null){
          HashMap<String, Object> hashMap = (HashMap<String, Object>) convertMap();
          String object = adminEmailRepository.getDbHandler().toJsonString(hashMap);
          ContentValues values = new ContentValues();
          values.put("ID", id); // Contact Name
          values.put("OBJECT", object); // Contact Phone Number*/
          adminEmailRepository.getDbHandler().upsert__db(id, object);
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
