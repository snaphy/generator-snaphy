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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalBillRepository;

//Now import repository of related models..


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class HospitalBill extends Model {


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

    private HospitalBill that ;

    public HospitalBill (){
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

            
            
        
    
        
            

            
                private double totalPayment;
                /* Adding Getter and Setter methods */
                public double getTotalPayment(){
                    return totalPayment;
                }

                /* Adding Getter and Setter methods */
                public void setTotalPayment(double totalPayment){
                    this.totalPayment = totalPayment;
                    //Update hashMap value..
                    hashMap.put("totalPayment", totalPayment);
                }

            
            
        
    
        
            

            
                private double totalCharge;
                /* Adding Getter and Setter methods */
                public double getTotalCharge(){
                    return totalCharge;
                }

                /* Adding Getter and Setter methods */
                public void setTotalCharge(double totalCharge){
                    this.totalCharge = totalCharge;
                    //Update hashMap value..
                    hashMap.put("totalCharge", totalCharge);
                }

            
            
        
    
        
            

            
                private double totalDiscount;
                /* Adding Getter and Setter methods */
                public double getTotalDiscount(){
                    return totalDiscount;
                }

                /* Adding Getter and Setter methods */
                public void setTotalDiscount(double totalDiscount){
                    this.totalDiscount = totalDiscount;
                    //Update hashMap value..
                    hashMap.put("totalDiscount", totalDiscount);
                }

            
            
        
    
        
            

            
                private double totalOutstandingBalance;
                /* Adding Getter and Setter methods */
                public double getTotalOutstandingBalance(){
                    return totalOutstandingBalance;
                }

                /* Adding Getter and Setter methods */
                public void setTotalOutstandingBalance(double totalOutstandingBalance){
                    this.totalOutstandingBalance = totalOutstandingBalance;
                    //Update hashMap value..
                    hashMap.put("totalOutstandingBalance", totalOutstandingBalance);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      HospitalBillRepository lowercaseFirstLetterRepository = (HospitalBillRepository) getRepository();
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
      HospitalBillRepository lowercaseFirstLetterRepository = (HospitalBillRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      HospitalBillRepository lowercaseFirstLetterRepository = (HospitalBillRepository) getRepository();
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
