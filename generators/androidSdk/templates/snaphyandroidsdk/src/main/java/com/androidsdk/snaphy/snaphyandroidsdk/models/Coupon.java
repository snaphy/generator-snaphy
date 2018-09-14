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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CouponRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Coupon extends Model {


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

    private Coupon that ;

    public Coupon (){
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

            
            
        
    
        
            

            
                private String couponCode;
                /* Adding Getter and Setter methods */
                public String getCouponCode(){
                    return couponCode;
                }

                /* Adding Getter and Setter methods */
                public void setCouponCode(String couponCode){
                    this.couponCode = couponCode;
                    //Update hashMap value..
                    hashMap.put("couponCode", couponCode);
                }

            
            
        
    
        
            

            
                private String couponTitle;
                /* Adding Getter and Setter methods */
                public String getCouponTitle(){
                    return couponTitle;
                }

                /* Adding Getter and Setter methods */
                public void setCouponTitle(String couponTitle){
                    this.couponTitle = couponTitle;
                    //Update hashMap value..
                    hashMap.put("couponTitle", couponTitle);
                }

            
            
        
    
        
            

            
                private String couponName;
                /* Adding Getter and Setter methods */
                public String getCouponName(){
                    return couponName;
                }

                /* Adding Getter and Setter methods */
                public void setCouponName(String couponName){
                    this.couponName = couponName;
                    //Update hashMap value..
                    hashMap.put("couponName", couponName);
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

            
            
        
    
        
            

            
                private String couponDescription;
                /* Adding Getter and Setter methods */
                public String getCouponDescription(){
                    return couponDescription;
                }

                /* Adding Getter and Setter methods */
                public void setCouponDescription(String couponDescription){
                    this.couponDescription = couponDescription;
                    //Update hashMap value..
                    hashMap.put("couponDescription", couponDescription);
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

            
            
        
    
        
            

            
                private double discountPercent;
                /* Adding Getter and Setter methods */
                public double getDiscountPercent(){
                    return discountPercent;
                }

                /* Adding Getter and Setter methods */
                public void setDiscountPercent(double discountPercent){
                    this.discountPercent = discountPercent;
                    //Update hashMap value..
                    hashMap.put("discountPercent", discountPercent);
                }

            
            
        
    
        
            

            
                private double discountAmount;
                /* Adding Getter and Setter methods */
                public double getDiscountAmount(){
                    return discountAmount;
                }

                /* Adding Getter and Setter methods */
                public void setDiscountAmount(double discountAmount){
                    this.discountAmount = discountAmount;
                    //Update hashMap value..
                    hashMap.put("discountAmount", discountAmount);
                }

            
            
        
    
        
            

            
                private String expiryDate;
                /* Adding Getter and Setter methods */
                public String getExpiryDate(){
                    return expiryDate;
                }

                /* Adding Getter and Setter methods */
                public void setExpiryDate(String expiryDate){
                    this.expiryDate = expiryDate;
                    //Update hashMap value..
                    hashMap.put("expiryDate", expiryDate);
                }

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      CouponRepository lowercaseFirstLetterRepository = (CouponRepository) getRepository();
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
      CouponRepository lowercaseFirstLetterRepository = (CouponRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CouponRepository lowercaseFirstLetterRepository = (CouponRepository) getRepository();
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
