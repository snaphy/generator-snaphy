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

    
        
            

            
                private boolean to;
                /* Adding Getter and Setter methods */
                public Object getTo(){
                    return to;
                }

                /* Adding Getter and Setter methods */
                public void setTo(Object to){
                    this.to = to;
                }
             
        
    
        
            

            
                private boolean from;
                /* Adding Getter and Setter methods */
                public Object getFrom(){
                    return from;
                }

                /* Adding Getter and Setter methods */
                public void setFrom(Object from){
                    this.from = from;
                }
             
        
    
        
            

            
                private boolean subject;
                /* Adding Getter and Setter methods */
                public Object getSubject(){
                    return subject;
                }

                /* Adding Getter and Setter methods */
                public void setSubject(Object subject){
                    this.subject = subject;
                }
             
        
    
        
            

            
                private boolean text;
                /* Adding Getter and Setter methods */
                public Object getText(){
                    return text;
                }

                /* Adding Getter and Setter methods */
                public void setText(Object text){
                    this.text = text;
                }
             
        
    
        
            

            
                private boolean html;
                /* Adding Getter and Setter methods */
                public Object getHtml(){
                    return html;
                }

                /* Adding Getter and Setter methods */
                public void setHtml(Object html){
                    this.html = html;
                }
             
        
    
        
            

            
                private boolean id;
                /* Adding Getter and Setter methods */
                public Object getId(){
                    return id;
                }

                /* Adding Getter and Setter methods */
                public void setId(Object id){
                    this.id = id;
                }
             
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      AdminEmailRepository lowercaseFirstLetterRepository = (AdminEmailRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null){
             lowercaseFirstLetterRepository.getAdminEmailDb().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }



    public void save__db(String id){
      AdminEmailRepository lowercaseFirstLetterRepository = (AdminEmailRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null){
          lowercaseFirstLetterRepository.getAdminEmailDb().upsert__db(id, this);
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
