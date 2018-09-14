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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.LogisticPartnerRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class LogisticPartner extends Model {


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

    private LogisticPartner that ;

    public LogisticPartner (){
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

            
            
        
    
        
            

            
                private String partnerName;
                /* Adding Getter and Setter methods */
                public String getPartnerName(){
                    return partnerName;
                }

                /* Adding Getter and Setter methods */
                public void setPartnerName(String partnerName){
                    this.partnerName = partnerName;
                    //Update hashMap value..
                    hashMap.put("partnerName", partnerName);
                }

            
            
        
    
        
            

            
                private double charges;
                /* Adding Getter and Setter methods */
                public double getCharges(){
                    return charges;
                }

                /* Adding Getter and Setter methods */
                public void setCharges(double charges){
                    this.charges = charges;
                    //Update hashMap value..
                    hashMap.put("charges", charges);
                }

            
            
        
    
        
            

            
                private double interstateCharges;
                /* Adding Getter and Setter methods */
                public double getInterstateCharges(){
                    return interstateCharges;
                }

                /* Adding Getter and Setter methods */
                public void setInterstateCharges(double interstateCharges){
                    this.interstateCharges = interstateCharges;
                    //Update hashMap value..
                    hashMap.put("interstateCharges", interstateCharges);
                }

            
            
        
    
        
            

            
                private double intrastateCharges;
                /* Adding Getter and Setter methods */
                public double getIntrastateCharges(){
                    return intrastateCharges;
                }

                /* Adding Getter and Setter methods */
                public void setIntrastateCharges(double intrastateCharges){
                    this.intrastateCharges = intrastateCharges;
                    //Update hashMap value..
                    hashMap.put("intrastateCharges", intrastateCharges);
                }

            
            
        
    
        
            

            
                private double interstateDeliveryTime;
                /* Adding Getter and Setter methods */
                public double getInterstateDeliveryTime(){
                    return interstateDeliveryTime;
                }

                /* Adding Getter and Setter methods */
                public void setInterstateDeliveryTime(double interstateDeliveryTime){
                    this.interstateDeliveryTime = interstateDeliveryTime;
                    //Update hashMap value..
                    hashMap.put("interstateDeliveryTime", interstateDeliveryTime);
                }

            
            
        
    
        
            

            
                private double intrastateDeliveryTime;
                /* Adding Getter and Setter methods */
                public double getIntrastateDeliveryTime(){
                    return intrastateDeliveryTime;
                }

                /* Adding Getter and Setter methods */
                public void setIntrastateDeliveryTime(double intrastateDeliveryTime){
                    this.intrastateDeliveryTime = intrastateDeliveryTime;
                    //Update hashMap value..
                    hashMap.put("intrastateDeliveryTime", intrastateDeliveryTime);
                }

            
            
        
    
        
            

            
                private String mobileNumber2;
                /* Adding Getter and Setter methods */
                public String getMobileNumber2(){
                    return mobileNumber2;
                }

                /* Adding Getter and Setter methods */
                public void setMobileNumber2(String mobileNumber2){
                    this.mobileNumber2 = mobileNumber2;
                    //Update hashMap value..
                    hashMap.put("mobileNumber2", mobileNumber2);
                }

            
            
        
    
        
            

            
                private String mobileNumber1;
                /* Adding Getter and Setter methods */
                public String getMobileNumber1(){
                    return mobileNumber1;
                }

                /* Adding Getter and Setter methods */
                public void setMobileNumber1(String mobileNumber1){
                    this.mobileNumber1 = mobileNumber1;
                    //Update hashMap value..
                    hashMap.put("mobileNumber1", mobileNumber1);
                }

            
            
        
    
        
            

            
                private String landline2;
                /* Adding Getter and Setter methods */
                public String getLandline2(){
                    return landline2;
                }

                /* Adding Getter and Setter methods */
                public void setLandline2(String landline2){
                    this.landline2 = landline2;
                    //Update hashMap value..
                    hashMap.put("landline2", landline2);
                }

            
            
        
    
        
            

            
                private String landline1;
                /* Adding Getter and Setter methods */
                public String getLandline1(){
                    return landline1;
                }

                /* Adding Getter and Setter methods */
                public void setLandline1(String landline1){
                    this.landline1 = landline1;
                    //Update hashMap value..
                    hashMap.put("landline1", landline1);
                }

            
            
        
    
        
            

            
                private String headOfficeAddress;
                /* Adding Getter and Setter methods */
                public String getHeadOfficeAddress(){
                    return headOfficeAddress;
                }

                /* Adding Getter and Setter methods */
                public void setHeadOfficeAddress(String headOfficeAddress){
                    this.headOfficeAddress = headOfficeAddress;
                    //Update hashMap value..
                    hashMap.put("headOfficeAddress", headOfficeAddress);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> deliveryState;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getDeliveryState(){
                    return deliveryState;
                }

                /* Adding Getter and Setter methods */
                public void setDeliveryState(DataList<Map<String, Object>> deliveryState){
                    this.deliveryState = deliveryState;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("deliveryState", deliveryState);
                }

            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      LogisticPartnerRepository lowercaseFirstLetterRepository = (LogisticPartnerRepository) getRepository();
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
      LogisticPartnerRepository lowercaseFirstLetterRepository = (LogisticPartnerRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      LogisticPartnerRepository lowercaseFirstLetterRepository = (LogisticPartnerRepository) getRepository();
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
