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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookAccessTokenRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class FacebookAccessToken extends Model {


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

    private FacebookAccessToken that ;

    public FacebookAccessToken (){
        that = this;
    }

    
        
            

            
                private String FbUserId;
                /* Adding Getter and Setter methods */
                public String getFbUserId(){
                    return FbUserId;
                }

                /* Adding Getter and Setter methods */
                public void setFbUserId(String FbUserId){
                    this.FbUserId = FbUserId;
                    //Update hashMap value..
                    hashMap.put("FbUserId", FbUserId);
                }

            
            
        
    
        
            

            
                private String token;
                /* Adding Getter and Setter methods */
                public String getToken(){
                    return token;
                }

                /* Adding Getter and Setter methods */
                public void setToken(String token){
                    this.token = token;
                    //Update hashMap value..
                    hashMap.put("token", token);
                }

            
            
        
    
        
            

            
                private String expires;
                /* Adding Getter and Setter methods */
                public String getExpires(){
                    return expires;
                }

                /* Adding Getter and Setter methods */
                public void setExpires(String expires){
                    this.expires = expires;
                    //Update hashMap value..
                    hashMap.put("expires", expires);
                }

            
            
        
    
        
            

            
                private String userId;
                /* Adding Getter and Setter methods */
                public String getUserId(){
                    return userId;
                }

                /* Adding Getter and Setter methods */
                public void setUserId(String userId){
                    this.userId = userId;
                    //Update hashMap value..
                    hashMap.put("userId", userId);
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

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      FacebookAccessTokenRepository lowercaseFirstLetterRepository = (FacebookAccessTokenRepository) getRepository();
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
      FacebookAccessTokenRepository lowercaseFirstLetterRepository = (FacebookAccessTokenRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      FacebookAccessTokenRepository lowercaseFirstLetterRepository = (FacebookAccessTokenRepository) getRepository();
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
