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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PincodeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StateRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TalukRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdBedRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AadharRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientDocumentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupLogRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OpdTokenLogRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdBedLogRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientSecurityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class PatientGroup extends Model {


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

    private PatientGroup that ;

    public PatientGroup (){
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

            
            
        
    
        
            

            
                private String unique_number;
                /* Adding Getter and Setter methods */
                public String getUnique_number(){
                    return unique_number;
                }

                /* Adding Getter and Setter methods */
                public void setUnique_number(String unique_number){
                    this.unique_number = unique_number;
                    //Update hashMap value..
                    hashMap.put("unique_number", unique_number);
                }

            
            
        
    
        
            

            
                private String patientContactNumber;
                /* Adding Getter and Setter methods */
                public String getPatientContactNumber(){
                    return patientContactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPatientContactNumber(String patientContactNumber){
                    this.patientContactNumber = patientContactNumber;
                    //Update hashMap value..
                    hashMap.put("patientContactNumber", patientContactNumber);
                }

            
            
        
    
        
            

            
                private String name;
                /* Adding Getter and Setter methods */
                public String getName(){
                    return name;
                }

                /* Adding Getter and Setter methods */
                public void setName(String name){
                    this.name = name;
                    //Update hashMap value..
                    hashMap.put("name", name);
                }

            
            
        
    
        
            

            
                private boolean lama;
                /* Adding Getter and Setter methods */
                public boolean getLama(){
                    return lama;
                }

                /* Adding Getter and Setter methods */
                public void setLama(boolean lama){
                    this.lama = lama;
                    //Update hashMap value..
                    hashMap.put("lama", lama);
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

            
            
        
    
        
            

            
                private boolean hasDischarged;
                /* Adding Getter and Setter methods */
                public boolean getHasDischarged(){
                    return hasDischarged;
                }

                /* Adding Getter and Setter methods */
                public void setHasDischarged(boolean hasDischarged){
                    this.hasDischarged = hasDischarged;
                    //Update hashMap value..
                    hashMap.put("hasDischarged", hasDischarged);
                }

            
            
        
    
        
            

            
                private boolean hasConsulted;
                /* Adding Getter and Setter methods */
                public boolean getHasConsulted(){
                    return hasConsulted;
                }

                /* Adding Getter and Setter methods */
                public void setHasConsulted(boolean hasConsulted){
                    this.hasConsulted = hasConsulted;
                    //Update hashMap value..
                    hashMap.put("hasConsulted", hasConsulted);
                }

            
            
        
    
        
            

            
                private String facility;
                /* Adding Getter and Setter methods */
                public String getFacility(){
                    return facility;
                }

                /* Adding Getter and Setter methods */
                public void setFacility(String facility){
                    this.facility = facility;
                    //Update hashMap value..
                    hashMap.put("facility", facility);
                }

            
            
        
    
        
            

            
                private Map<String, Object> relationLogs;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getRelationLogs(){
                    return relationLogs;
                }

                /* Adding Getter and Setter methods */
                public void setRelationLogs(Map<String, Object> relationLogs){
                    this.relationLogs = relationLogs;
                    //Update Map value..
                    hashMap.put("relationLogs", relationLogs);
                }

            
            
        
    
        
            

            
                private String diagnosis;
                /* Adding Getter and Setter methods */
                public String getDiagnosis(){
                    return diagnosis;
                }

                /* Adding Getter and Setter methods */
                public void setDiagnosis(String diagnosis){
                    this.diagnosis = diagnosis;
                    //Update hashMap value..
                    hashMap.put("diagnosis", diagnosis);
                }

            
            
        
    
        
            

            
                private String admittedOn;
                /* Adding Getter and Setter methods */
                public String getAdmittedOn(){
                    return admittedOn;
                }

                /* Adding Getter and Setter methods */
                public void setAdmittedOn(String admittedOn){
                    this.admittedOn = admittedOn;
                    //Update hashMap value..
                    hashMap.put("admittedOn", admittedOn);
                }

            
            
        
    
        
            

            
                private String dischargedOn;
                /* Adding Getter and Setter methods */
                public String getDischargedOn(){
                    return dischargedOn;
                }

                /* Adding Getter and Setter methods */
                public void setDischargedOn(String dischargedOn){
                    this.dischargedOn = dischargedOn;
                    //Update hashMap value..
                    hashMap.put("dischargedOn", dischargedOn);
                }

            
            
        
    
        
            

            
                private String consultedOn;
                /* Adding Getter and Setter methods */
                public String getConsultedOn(){
                    return consultedOn;
                }

                /* Adding Getter and Setter methods */
                public void setConsultedOn(String consultedOn){
                    this.consultedOn = consultedOn;
                    //Update hashMap value..
                    hashMap.put("consultedOn", consultedOn);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> patientOtherContactNumber;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getPatientOtherContactNumber(){
                    return patientOtherContactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPatientOtherContactNumber(DataList<Map<String, Object>> patientOtherContactNumber){
                    this.patientOtherContactNumber = patientOtherContactNumber;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("patientOtherContactNumber", patientOtherContactNumber);
                }

            

            
            
        
    
        
            

            
                private boolean flaggedInSameHospital;
                /* Adding Getter and Setter methods */
                public boolean getFlaggedInSameHospital(){
                    return flaggedInSameHospital;
                }

                /* Adding Getter and Setter methods */
                public void setFlaggedInSameHospital(boolean flaggedInSameHospital){
                    this.flaggedInSameHospital = flaggedInSameHospital;
                    //Update hashMap value..
                    hashMap.put("flaggedInSameHospital", flaggedInSameHospital);
                }

            
            
        
    
        
            

            
                private String bedNumber;
                /* Adding Getter and Setter methods */
                public String getBedNumber(){
                    return bedNumber;
                }

                /* Adding Getter and Setter methods */
                public void setBedNumber(String bedNumber){
                    this.bedNumber = bedNumber;
                    //Update hashMap value..
                    hashMap.put("bedNumber", bedNumber);
                }

            
            
        
    
        
            

            
                private String opdCode;
                /* Adding Getter and Setter methods */
                public String getOpdCode(){
                    return opdCode;
                }

                /* Adding Getter and Setter methods */
                public void setOpdCode(String opdCode){
                    this.opdCode = opdCode;
                    //Update hashMap value..
                    hashMap.put("opdCode", opdCode);
                }

            
            
        
    
        
            

            
                private double opdNumber;
                /* Adding Getter and Setter methods */
                public double getOpdNumber(){
                    return opdNumber;
                }

                /* Adding Getter and Setter methods */
                public void setOpdNumber(double opdNumber){
                    this.opdNumber = opdNumber;
                    //Update hashMap value..
                    hashMap.put("opdNumber", opdNumber);
                }

            
            
        
    
        
            

            
                private String opdTokenNumber;
                /* Adding Getter and Setter methods */
                public String getOpdTokenNumber(){
                    return opdTokenNumber;
                }

                /* Adding Getter and Setter methods */
                public void setOpdTokenNumber(String opdTokenNumber){
                    this.opdTokenNumber = opdTokenNumber;
                    //Update hashMap value..
                    hashMap.put("opdTokenNumber", opdTokenNumber);
                }

            
            
        
    
        
            

            
                private String addedBy;
                /* Adding Getter and Setter methods */
                public String getAddedBy(){
                    return addedBy;
                }

                /* Adding Getter and Setter methods */
                public void setAddedBy(String addedBy){
                    this.addedBy = addedBy;
                    //Update hashMap value..
                    hashMap.put("addedBy", addedBy);
                }

            
            
        
    
        
            

            
                private boolean isDocumentScanned;
                /* Adding Getter and Setter methods */
                public boolean getIsDocumentScanned(){
                    return isDocumentScanned;
                }

                /* Adding Getter and Setter methods */
                public void setIsDocumentScanned(boolean isDocumentScanned){
                    this.isDocumentScanned = isDocumentScanned;
                    //Update hashMap value..
                    hashMap.put("isDocumentScanned", isDocumentScanned);
                }

            
            
        
    
        
            

            
                private boolean isRepeatCustomer;
                /* Adding Getter and Setter methods */
                public boolean getIsRepeatCustomer(){
                    return isRepeatCustomer;
                }

                /* Adding Getter and Setter methods */
                public void setIsRepeatCustomer(boolean isRepeatCustomer){
                    this.isRepeatCustomer = isRepeatCustomer;
                    //Update hashMap value..
                    hashMap.put("isRepeatCustomer", isRepeatCustomer);
                }

            
            
        
    
        
            

            
                private boolean isFollowUp;
                /* Adding Getter and Setter methods */
                public boolean getIsFollowUp(){
                    return isFollowUp;
                }

                /* Adding Getter and Setter methods */
                public void setIsFollowUp(boolean isFollowUp){
                    this.isFollowUp = isFollowUp;
                    //Update hashMap value..
                    hashMap.put("isFollowUp", isFollowUp);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
                private double actualFollowUp;
                /* Adding Getter and Setter methods */
                public double getActualFollowUp(){
                    return actualFollowUp;
                }

                /* Adding Getter and Setter methods */
                public void setActualFollowUp(double actualFollowUp){
                    this.actualFollowUp = actualFollowUp;
                    //Update hashMap value..
                    hashMap.put("actualFollowUp", actualFollowUp);
                }

            
            
        
    
        
            

            
                private double consultationFees;
                /* Adding Getter and Setter methods */
                public double getConsultationFees(){
                    return consultationFees;
                }

                /* Adding Getter and Setter methods */
                public void setConsultationFees(double consultationFees){
                    this.consultationFees = consultationFees;
                    //Update hashMap value..
                    hashMap.put("consultationFees", consultationFees);
                }

            
            
        
    
        
            

            
                private double followUpFees;
                /* Adding Getter and Setter methods */
                public double getFollowUpFees(){
                    return followUpFees;
                }

                /* Adding Getter and Setter methods */
                public void setFollowUpFees(double followUpFees){
                    this.followUpFees = followUpFees;
                    //Update hashMap value..
                    hashMap.put("followUpFees", followUpFees);
                }

            
            
        
    
        
            

            
                private double followUpDays;
                /* Adding Getter and Setter methods */
                public double getFollowUpDays(){
                    return followUpDays;
                }

                /* Adding Getter and Setter methods */
                public void setFollowUpDays(double followUpDays){
                    this.followUpDays = followUpDays;
                    //Update hashMap value..
                    hashMap.put("followUpDays", followUpDays);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
                private boolean isNew;
                /* Adding Getter and Setter methods */
                public boolean getIsNew(){
                    return isNew;
                }

                /* Adding Getter and Setter methods */
                public void setIsNew(boolean isNew){
                    this.isNew = isNew;
                    //Update hashMap value..
                    hashMap.put("isNew", isNew);
                }

            
            
        
    
        
            

            
                private boolean isFlagged;
                /* Adding Getter and Setter methods */
                public boolean getIsFlagged(){
                    return isFlagged;
                }

                /* Adding Getter and Setter methods */
                public void setIsFlagged(boolean isFlagged){
                    this.isFlagged = isFlagged;
                    //Update hashMap value..
                    hashMap.put("isFlagged", isFlagged);
                }

            
            
        
    
        
            

            
                private String flaggedFor;
                /* Adding Getter and Setter methods */
                public String getFlaggedFor(){
                    return flaggedFor;
                }

                /* Adding Getter and Setter methods */
                public void setFlaggedFor(String flaggedFor){
                    this.flaggedFor = flaggedFor;
                    //Update hashMap value..
                    hashMap.put("flaggedFor", flaggedFor);
                }

            
            
        
    
        
            

            
                private String pincodeNumber;
                /* Adding Getter and Setter methods */
                public String getPincodeNumber(){
                    return pincodeNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPincodeNumber(String pincodeNumber){
                    this.pincodeNumber = pincodeNumber;
                    //Update hashMap value..
                    hashMap.put("pincodeNumber", pincodeNumber);
                }

            
            
        
    
        
            

            
                private String hashObject;
                /* Adding Getter and Setter methods */
                public String getHashObject(){
                    return hashObject;
                }

                /* Adding Getter and Setter methods */
                public void setHashObject(String hashObject){
                    this.hashObject = hashObject;
                    //Update hashMap value..
                    hashMap.put("hashObject", hashObject);
                }

            
            
        
    
        
            

            
                private String patientSecurityOffline;
                /* Adding Getter and Setter methods */
                public String getPatientSecurityOffline(){
                    return patientSecurityOffline;
                }

                /* Adding Getter and Setter methods */
                public void setPatientSecurityOffline(String patientSecurityOffline){
                    this.patientSecurityOffline = patientSecurityOffline;
                    //Update hashMap value..
                    hashMap.put("patientSecurityOffline", patientSecurityOffline);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
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
      PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
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
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Hospital  hospital ;
                    private String hospitalId;

                    public String getHospitalId(){
                         return hospitalId;
                    }

                    public void setHospitalId(Object hospitalId){
                        if(hospitalId != null){
                          this.hospitalId = hospitalId.toString();
                        }
                    }

                    public Hospital getHospital() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(hospital == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          hospital = getHospital__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return hospital;
                    }

                    public void setHospital(Hospital hospital) {
                        this.hospital = hospital;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospital(Map<String, Object> hospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository hospitalRepository = new HospitalRepository();
                        Hospital hospital1 = hospitalRepository.createObject(hospital);
                        setHospital(hospital1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospital(HashMap<String, Object> hospital) {
                        //First create a dummy Repo class object for customer.
                        HospitalRepository hospitalRepository = new HospitalRepository();
                        Hospital hospital1 = hospitalRepository.createObject(hospital);
                        setHospital(hospital1);
                    }

                    //Adding relation method..
                    public void addRelation(Hospital hospital) {
                        that.setHospital(hospital);
                    }


                    //Fetch related data from local database if present a hospitalId identifier as property for belongsTo
                    public Hospital getHospital__db(RestAdapter restAdapter){
                      if(hospitalId != null){
                        HospitalRepository hospitalRepository = restAdapter.createRepository(HospitalRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(hospitalRepository.getDb() == null ){
                                                    hospitalRepository.addStorage(context);
                                                }

                                                if(context != null && hospitalRepository.getDb() != null){
                                                    hospitalRepository.addStorage(context);
                                                    Hospital hospital = (Hospital) hospitalRepository.getDb().get__db(hospitalId);
                                                    return hospital;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__hospital( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Hospital> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__hospital( (String)that.getId(), refresh,  new ObjectCallback<Hospital> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Hospital object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Pincode  pincode ;
                    private String pincodeId;

                    public String getPincodeId(){
                         return pincodeId;
                    }

                    public void setPincodeId(Object pincodeId){
                        if(pincodeId != null){
                          this.pincodeId = pincodeId.toString();
                        }
                    }

                    public Pincode getPincode() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(pincode == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          pincode = getPincode__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return pincode;
                    }

                    public void setPincode(Pincode pincode) {
                        this.pincode = pincode;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPincode(Map<String, Object> pincode) {
                        //First create a dummy Repo class object for customer.
                        PincodeRepository pincodeRepository = new PincodeRepository();
                        Pincode pincode1 = pincodeRepository.createObject(pincode);
                        setPincode(pincode1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPincode(HashMap<String, Object> pincode) {
                        //First create a dummy Repo class object for customer.
                        PincodeRepository pincodeRepository = new PincodeRepository();
                        Pincode pincode1 = pincodeRepository.createObject(pincode);
                        setPincode(pincode1);
                    }

                    //Adding relation method..
                    public void addRelation(Pincode pincode) {
                        that.setPincode(pincode);
                    }


                    //Fetch related data from local database if present a pincodeId identifier as property for belongsTo
                    public Pincode getPincode__db(RestAdapter restAdapter){
                      if(pincodeId != null){
                        PincodeRepository pincodeRepository = restAdapter.createRepository(PincodeRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(pincodeRepository.getDb() == null ){
                                                    pincodeRepository.addStorage(context);
                                                }

                                                if(context != null && pincodeRepository.getDb() != null){
                                                    pincodeRepository.addStorage(context);
                                                    Pincode pincode = (Pincode) pincodeRepository.getDb().get__db(pincodeId);
                                                    return pincode;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__pincode( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Pincode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__pincode( (String)that.getId(), refresh,  new ObjectCallback<Pincode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Pincode object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient District  district ;
                    private String districtId;

                    public String getDistrictId(){
                         return districtId;
                    }

                    public void setDistrictId(Object districtId){
                        if(districtId != null){
                          this.districtId = districtId.toString();
                        }
                    }

                    public District getDistrict() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(district == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          district = getDistrict__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return district;
                    }

                    public void setDistrict(District district) {
                        this.district = district;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDistrict(Map<String, Object> district) {
                        //First create a dummy Repo class object for customer.
                        DistrictRepository districtRepository = new DistrictRepository();
                        District district1 = districtRepository.createObject(district);
                        setDistrict(district1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDistrict(HashMap<String, Object> district) {
                        //First create a dummy Repo class object for customer.
                        DistrictRepository districtRepository = new DistrictRepository();
                        District district1 = districtRepository.createObject(district);
                        setDistrict(district1);
                    }

                    //Adding relation method..
                    public void addRelation(District district) {
                        that.setDistrict(district);
                    }


                    //Fetch related data from local database if present a districtId identifier as property for belongsTo
                    public District getDistrict__db(RestAdapter restAdapter){
                      if(districtId != null){
                        DistrictRepository districtRepository = restAdapter.createRepository(DistrictRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(districtRepository.getDb() == null ){
                                                    districtRepository.addStorage(context);
                                                }

                                                if(context != null && districtRepository.getDb() != null){
                                                    districtRepository.addStorage(context);
                                                    District district = (District) districtRepository.getDb().get__db(districtId);
                                                    return district;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__district( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<District> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__district( (String)that.getId(), refresh,  new ObjectCallback<District> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(District object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient State  state ;
                    private String stateId;

                    public String getStateId(){
                         return stateId;
                    }

                    public void setStateId(Object stateId){
                        if(stateId != null){
                          this.stateId = stateId.toString();
                        }
                    }

                    public State getState() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(state == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          state = getState__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return state;
                    }

                    public void setState(State state) {
                        this.state = state;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setState(Map<String, Object> state) {
                        //First create a dummy Repo class object for customer.
                        StateRepository stateRepository = new StateRepository();
                        State state1 = stateRepository.createObject(state);
                        setState(state1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setState(HashMap<String, Object> state) {
                        //First create a dummy Repo class object for customer.
                        StateRepository stateRepository = new StateRepository();
                        State state1 = stateRepository.createObject(state);
                        setState(state1);
                    }

                    //Adding relation method..
                    public void addRelation(State state) {
                        that.setState(state);
                    }


                    //Fetch related data from local database if present a stateId identifier as property for belongsTo
                    public State getState__db(RestAdapter restAdapter){
                      if(stateId != null){
                        StateRepository stateRepository = restAdapter.createRepository(StateRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(stateRepository.getDb() == null ){
                                                    stateRepository.addStorage(context);
                                                }

                                                if(context != null && stateRepository.getDb() != null){
                                                    stateRepository.addStorage(context);
                                                    State state = (State) stateRepository.getDb().get__db(stateId);
                                                    return state;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__state( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<State> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__state( (String)that.getId(), refresh,  new ObjectCallback<State> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(State object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Taluk  taluk ;
                    private String talukId;

                    public String getTalukId(){
                         return talukId;
                    }

                    public void setTalukId(Object talukId){
                        if(talukId != null){
                          this.talukId = talukId.toString();
                        }
                    }

                    public Taluk getTaluk() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(taluk == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          taluk = getTaluk__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return taluk;
                    }

                    public void setTaluk(Taluk taluk) {
                        this.taluk = taluk;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTaluk(Map<String, Object> taluk) {
                        //First create a dummy Repo class object for customer.
                        TalukRepository talukRepository = new TalukRepository();
                        Taluk taluk1 = talukRepository.createObject(taluk);
                        setTaluk(taluk1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTaluk(HashMap<String, Object> taluk) {
                        //First create a dummy Repo class object for customer.
                        TalukRepository talukRepository = new TalukRepository();
                        Taluk taluk1 = talukRepository.createObject(taluk);
                        setTaluk(taluk1);
                    }

                    //Adding relation method..
                    public void addRelation(Taluk taluk) {
                        that.setTaluk(taluk);
                    }


                    //Fetch related data from local database if present a talukId identifier as property for belongsTo
                    public Taluk getTaluk__db(RestAdapter restAdapter){
                      if(talukId != null){
                        TalukRepository talukRepository = restAdapter.createRepository(TalukRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(talukRepository.getDb() == null ){
                                                    talukRepository.addStorage(context);
                                                }

                                                if(context != null && talukRepository.getDb() != null){
                                                    talukRepository.addStorage(context);
                                                    Taluk taluk = (Taluk) talukRepository.getDb().get__db(talukId);
                                                    return taluk;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__taluk( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Taluk> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__taluk( (String)that.getId(), refresh,  new ObjectCallback<Taluk> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Taluk object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Patient  patient ;
                    private String patientId;

                    public String getPatientId(){
                         return patientId;
                    }

                    public void setPatientId(Object patientId){
                        if(patientId != null){
                          this.patientId = patientId.toString();
                        }
                    }

                    public Patient getPatient() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(patient == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          patient = getPatient__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return patient;
                    }

                    public void setPatient(Patient patient) {
                        this.patient = patient;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatient(Map<String, Object> patient) {
                        //First create a dummy Repo class object for customer.
                        PatientRepository patientRepository = new PatientRepository();
                        Patient patient1 = patientRepository.createObject(patient);
                        setPatient(patient1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatient(HashMap<String, Object> patient) {
                        //First create a dummy Repo class object for customer.
                        PatientRepository patientRepository = new PatientRepository();
                        Patient patient1 = patientRepository.createObject(patient);
                        setPatient(patient1);
                    }

                    //Adding relation method..
                    public void addRelation(Patient patient) {
                        that.setPatient(patient);
                    }


                    //Fetch related data from local database if present a patientId identifier as property for belongsTo
                    public Patient getPatient__db(RestAdapter restAdapter){
                      if(patientId != null){
                        PatientRepository patientRepository = restAdapter.createRepository(PatientRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(patientRepository.getDb() == null ){
                                                    patientRepository.addStorage(context);
                                                }

                                                if(context != null && patientRepository.getDb() != null){
                                                    patientRepository.addStorage(context);
                                                    Patient patient = (Patient) patientRepository.getDb().get__db(patientId);
                                                    return patient;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__patient( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Patient> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__patient( (String)that.getId(), refresh,  new ObjectCallback<Patient> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Patient object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient IpdBed  ipdBed ;
                    private String ipdBedId;

                    public String getIpdBedId(){
                         return ipdBedId;
                    }

                    public void setIpdBedId(Object ipdBedId){
                        if(ipdBedId != null){
                          this.ipdBedId = ipdBedId.toString();
                        }
                    }

                    public IpdBed getIpdBed() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(ipdBed == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          ipdBed = getIpdBed__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return ipdBed;
                    }

                    public void setIpdBed(IpdBed ipdBed) {
                        this.ipdBed = ipdBed;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIpdBed(Map<String, Object> ipdBed) {
                        //First create a dummy Repo class object for customer.
                        IpdBedRepository ipdBedRepository = new IpdBedRepository();
                        IpdBed ipdBed1 = ipdBedRepository.createObject(ipdBed);
                        setIpdBed(ipdBed1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIpdBed(HashMap<String, Object> ipdBed) {
                        //First create a dummy Repo class object for customer.
                        IpdBedRepository ipdBedRepository = new IpdBedRepository();
                        IpdBed ipdBed1 = ipdBedRepository.createObject(ipdBed);
                        setIpdBed(ipdBed1);
                    }

                    //Adding relation method..
                    public void addRelation(IpdBed ipdBed) {
                        that.setIpdBed(ipdBed);
                    }


                    //Fetch related data from local database if present a ipdBedId identifier as property for belongsTo
                    public IpdBed getIpdBed__db(RestAdapter restAdapter){
                      if(ipdBedId != null){
                        IpdBedRepository ipdBedRepository = restAdapter.createRepository(IpdBedRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(ipdBedRepository.getDb() == null ){
                                                    ipdBedRepository.addStorage(context);
                                                }

                                                if(context != null && ipdBedRepository.getDb() != null){
                                                    ipdBedRepository.addStorage(context);
                                                    IpdBed ipdBed = (IpdBed) ipdBedRepository.getDb().get__db(ipdBedId);
                                                    return ipdBed;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__ipdBed( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<IpdBed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__ipdBed( (String)that.getId(), refresh,  new ObjectCallback<IpdBed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdBed object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient HospitalUser  hospitalUser ;
                    private String hospitalUserId;

                    public String getHospitalUserId(){
                         return hospitalUserId;
                    }

                    public void setHospitalUserId(Object hospitalUserId){
                        if(hospitalUserId != null){
                          this.hospitalUserId = hospitalUserId.toString();
                        }
                    }

                    public HospitalUser getHospitalUser() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(hospitalUser == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          hospitalUser = getHospitalUser__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return hospitalUser;
                    }

                    public void setHospitalUser(HospitalUser hospitalUser) {
                        this.hospitalUser = hospitalUser;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospitalUser(Map<String, Object> hospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository hospitalUserRepository = new HospitalUserRepository();
                        HospitalUser hospitalUser1 = hospitalUserRepository.createObject(hospitalUser);
                        setHospitalUser(hospitalUser1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospitalUser(HashMap<String, Object> hospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository hospitalUserRepository = new HospitalUserRepository();
                        HospitalUser hospitalUser1 = hospitalUserRepository.createObject(hospitalUser);
                        setHospitalUser(hospitalUser1);
                    }

                    //Adding relation method..
                    public void addRelation(HospitalUser hospitalUser) {
                        that.setHospitalUser(hospitalUser);
                    }


                    //Fetch related data from local database if present a hospitalUserId identifier as property for belongsTo
                    public HospitalUser getHospitalUser__db(RestAdapter restAdapter){
                      if(hospitalUserId != null){
                        HospitalUserRepository hospitalUserRepository = restAdapter.createRepository(HospitalUserRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(hospitalUserRepository.getDb() == null ){
                                                    hospitalUserRepository.addStorage(context);
                                                }

                                                if(context != null && hospitalUserRepository.getDb() != null){
                                                    hospitalUserRepository.addStorage(context);
                                                    HospitalUser hospitalUser = (HospitalUser) hospitalUserRepository.getDb().get__db(hospitalUserId);
                                                    return hospitalUser;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__hospitalUser( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__hospitalUser( (String)that.getId(), refresh,  new ObjectCallback<HospitalUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUser object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Aadhar  aadhar ;
                    private String aadharId;

                    public String getAadharId(){
                         return aadharId;
                    }

                    public void setAadharId(Object aadharId){
                        if(aadharId != null){
                          this.aadharId = aadharId.toString();
                        }
                    }

                    public Aadhar getAadhar() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(aadhar == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          aadhar = getAadhar__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return aadhar;
                    }

                    public void setAadhar(Aadhar aadhar) {
                        this.aadhar = aadhar;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAadhar(Map<String, Object> aadhar) {
                        //First create a dummy Repo class object for customer.
                        AadharRepository aadharRepository = new AadharRepository();
                        Aadhar aadhar1 = aadharRepository.createObject(aadhar);
                        setAadhar(aadhar1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAadhar(HashMap<String, Object> aadhar) {
                        //First create a dummy Repo class object for customer.
                        AadharRepository aadharRepository = new AadharRepository();
                        Aadhar aadhar1 = aadharRepository.createObject(aadhar);
                        setAadhar(aadhar1);
                    }

                    //Adding relation method..
                    public void addRelation(Aadhar aadhar) {
                        that.setAadhar(aadhar);
                    }


                    //Fetch related data from local database if present a aadharId identifier as property for belongsTo
                    public Aadhar getAadhar__db(RestAdapter restAdapter){
                      if(aadharId != null){
                        AadharRepository aadharRepository = restAdapter.createRepository(AadharRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(aadharRepository.getDb() == null ){
                                                    aadharRepository.addStorage(context);
                                                }

                                                if(context != null && aadharRepository.getDb() != null){
                                                    aadharRepository.addStorage(context);
                                                    Aadhar aadhar = (Aadhar) aadharRepository.getDb().get__db(aadharId);
                                                    return aadhar;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void get__aadhar( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Aadhar> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__aadhar( (String)that.getId(), refresh,  new ObjectCallback<Aadhar> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Aadhar object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<PatientDocument>  patientDocuments ;

                    public DataList< PatientDocument > getPatientDocuments() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PatientDocumentRepository patientDocumentRepository = (PatientDocumentRepository) getRepository();

                            if(that.getId() != null && patientDocumentRepository.getDb() != null){

                                 //Fetch locally from db
                                 //patientDocuments = getPatientDocuments__db(restAdapter);
                                 // Getting single cont
                                 patientDocuments = patientDocumentRepository.getDb().getAll__db("patientGroupId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return patientDocuments;
                    }

                    public void setPatientDocuments(DataList<PatientDocument> patientDocuments) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: patientDocuments){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPatientDocuments1(hashMaps);
                        }else{
                            this.patientDocuments = patientDocuments;
                            //TODO: Warning move this to new thread
                            for(PatientDocument data: patientDocuments){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientDocuments1(List<Map<String, Object>> patientDocuments) {
                        //First create a dummy Repo class object for ..
                        PatientDocumentRepository patientDocumentsRepository = new PatientDocumentRepository();
                        List<PatientDocument> result = new ArrayList<>();
                        for (Map<String, Object> obj : patientDocuments) {
                            //Also add relation to child type for two way communication..
                            PatientDocument obj1 = patientDocumentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientDocuments(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientDocuments1(DataList<HashMap<String, Object>> patientDocuments) {
                        //First create a dummy Repo class object for ..
                        PatientDocumentRepository patientDocumentsRepository = new PatientDocumentRepository();
                        DataList<PatientDocument> result = new DataList<>();
                        for (HashMap<String, Object> obj : patientDocuments) {
                            //Also add relation to child type for two way communication..
                            PatientDocument obj1 = patientDocumentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientDocuments(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PatientDocument> patientDocuments, PatientDocument dummyClassInstance) {
                        that.setPatientDocuments(patientDocuments);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PatientDocument patientDocuments) {
                        try{
                            try{

                                  //Save to database..
                                  patientDocuments.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPatientDocuments().add(patientDocuments);
                        }catch(Exception e){
                            DataList< PatientDocument> patientDocuments1 = new DataList();
                            //Now add this item to list..
                            patientDocuments1.add(patientDocuments);
                            //Now set data....
                            that.setPatientDocuments(patientDocuments1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__patientDocuments( String fk,  RestAdapter restAdapter, final ObjectCallback<PatientDocument> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.findById__patientDocuments( (String)that.getId(), fk,  new ObjectCallback<PatientDocument> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientDocument object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__patientDocuments( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.destroyById__patientDocuments( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__patientDocuments( String fk,  PatientDocument data,  RestAdapter restAdapter, final ObjectCallback<PatientDocument> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.updateById__patientDocuments( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientDocument> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientDocument object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__patientDocuments( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<PatientDocument> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__patientDocuments( (String)that.getId(), filter,  new DataListCallback<PatientDocument> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PatientDocument> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PatientDocument obj = new PatientDocument();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PatientDocument obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__patientDocuments( PatientDocument data,  RestAdapter restAdapter, final ObjectCallback<PatientDocument> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.create__patientDocuments( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientDocument> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientDocument object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__patientDocuments( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        



                                        patientGroupRepo.delete__patientDocuments( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__patientDocuments( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.count__patientDocuments( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<PatientGroupLog>  patientGroupLogs ;

                    public DataList< PatientGroupLog > getPatientGroupLogs() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PatientGroupLogRepository patientGroupLogRepository = (PatientGroupLogRepository) getRepository();

                            if(that.getId() != null && patientGroupLogRepository.getDb() != null){

                                 //Fetch locally from db
                                 //patientGroupLogs = getPatientGroupLogs__db(restAdapter);
                                 // Getting single cont
                                 patientGroupLogs = patientGroupLogRepository.getDb().getAll__db("patientGroupId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return patientGroupLogs;
                    }

                    public void setPatientGroupLogs(DataList<PatientGroupLog> patientGroupLogs) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: patientGroupLogs){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPatientGroupLogs1(hashMaps);
                        }else{
                            this.patientGroupLogs = patientGroupLogs;
                            //TODO: Warning move this to new thread
                            for(PatientGroupLog data: patientGroupLogs){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientGroupLogs1(List<Map<String, Object>> patientGroupLogs) {
                        //First create a dummy Repo class object for ..
                        PatientGroupLogRepository patientGroupLogsRepository = new PatientGroupLogRepository();
                        List<PatientGroupLog> result = new ArrayList<>();
                        for (Map<String, Object> obj : patientGroupLogs) {
                            //Also add relation to child type for two way communication..
                            PatientGroupLog obj1 = patientGroupLogsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientGroupLogs(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientGroupLogs1(DataList<HashMap<String, Object>> patientGroupLogs) {
                        //First create a dummy Repo class object for ..
                        PatientGroupLogRepository patientGroupLogsRepository = new PatientGroupLogRepository();
                        DataList<PatientGroupLog> result = new DataList<>();
                        for (HashMap<String, Object> obj : patientGroupLogs) {
                            //Also add relation to child type for two way communication..
                            PatientGroupLog obj1 = patientGroupLogsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientGroupLogs(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PatientGroupLog> patientGroupLogs, PatientGroupLog dummyClassInstance) {
                        that.setPatientGroupLogs(patientGroupLogs);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PatientGroupLog patientGroupLogs) {
                        try{
                            try{

                                  //Save to database..
                                  patientGroupLogs.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPatientGroupLogs().add(patientGroupLogs);
                        }catch(Exception e){
                            DataList< PatientGroupLog> patientGroupLogs1 = new DataList();
                            //Now add this item to list..
                            patientGroupLogs1.add(patientGroupLogs);
                            //Now set data....
                            that.setPatientGroupLogs(patientGroupLogs1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__patientGroupLogs( String fk,  RestAdapter restAdapter, final ObjectCallback<PatientGroupLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.findById__patientGroupLogs( (String)that.getId(), fk,  new ObjectCallback<PatientGroupLog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientGroupLog object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__patientGroupLogs( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.destroyById__patientGroupLogs( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__patientGroupLogs( String fk,  PatientGroupLog data,  RestAdapter restAdapter, final ObjectCallback<PatientGroupLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.updateById__patientGroupLogs( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientGroupLog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientGroupLog object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__patientGroupLogs( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<PatientGroupLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__patientGroupLogs( (String)that.getId(), filter,  new DataListCallback<PatientGroupLog> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PatientGroupLog> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PatientGroupLog obj = new PatientGroupLog();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PatientGroupLog obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__patientGroupLogs( PatientGroupLog data,  RestAdapter restAdapter, final ObjectCallback<PatientGroupLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.create__patientGroupLogs( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientGroupLog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientGroupLog object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__patientGroupLogs( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        



                                        patientGroupRepo.delete__patientGroupLogs( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__patientGroupLogs( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.count__patientGroupLogs( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient OpdTokenLog  opdTokenLog ;
                    private String opdTokenLogId;

                    public String getOpdTokenLogId(){
                         return opdTokenLogId;
                    }

                    public void setOpdTokenLogId(Object opdTokenLogId){
                        if(opdTokenLogId != null){
                          this.opdTokenLogId = opdTokenLogId.toString();
                        }
                    }

                    public OpdTokenLog getOpdTokenLog() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(opdTokenLog == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          opdTokenLog = getOpdTokenLog__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return opdTokenLog;
                    }

                    public void setOpdTokenLog(OpdTokenLog opdTokenLog) {
                        this.opdTokenLog = opdTokenLog;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOpdTokenLog(Map<String, Object> opdTokenLog) {
                        //First create a dummy Repo class object for customer.
                        OpdTokenLogRepository opdTokenLogRepository = new OpdTokenLogRepository();
                        OpdTokenLog opdTokenLog1 = opdTokenLogRepository.createObject(opdTokenLog);
                        setOpdTokenLog(opdTokenLog1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOpdTokenLog(HashMap<String, Object> opdTokenLog) {
                        //First create a dummy Repo class object for customer.
                        OpdTokenLogRepository opdTokenLogRepository = new OpdTokenLogRepository();
                        OpdTokenLog opdTokenLog1 = opdTokenLogRepository.createObject(opdTokenLog);
                        setOpdTokenLog(opdTokenLog1);
                    }

                    //Adding relation method..
                    public void addRelation(OpdTokenLog opdTokenLog) {
                        that.setOpdTokenLog(opdTokenLog);
                    }


                    //Fetch related data from local database if present a opdTokenLogId identifier as property for belongsTo
                    public OpdTokenLog getOpdTokenLog__db(RestAdapter restAdapter){
                      if(opdTokenLogId != null){
                        OpdTokenLogRepository opdTokenLogRepository = restAdapter.createRepository(OpdTokenLogRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(opdTokenLogRepository.getDb() == null ){
                                                    opdTokenLogRepository.addStorage(context);
                                                }

                                                if(context != null && opdTokenLogRepository.getDb() != null){
                                                    opdTokenLogRepository.addStorage(context);
                                                    OpdTokenLog opdTokenLog = (OpdTokenLog) opdTokenLogRepository.getDb().get__db(opdTokenLogId);
                                                    return opdTokenLog;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__opdTokenLog( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<OpdTokenLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__opdTokenLog( (String)that.getId(), refresh,  new ObjectCallback<OpdTokenLog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(OpdTokenLog object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient IpdBedLog  ipdBedLog ;
                    private String ipdBedLogId;

                    public String getIpdBedLogId(){
                         return ipdBedLogId;
                    }

                    public void setIpdBedLogId(Object ipdBedLogId){
                        if(ipdBedLogId != null){
                          this.ipdBedLogId = ipdBedLogId.toString();
                        }
                    }

                    public IpdBedLog getIpdBedLog() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(ipdBedLog == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          ipdBedLog = getIpdBedLog__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return ipdBedLog;
                    }

                    public void setIpdBedLog(IpdBedLog ipdBedLog) {
                        this.ipdBedLog = ipdBedLog;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIpdBedLog(Map<String, Object> ipdBedLog) {
                        //First create a dummy Repo class object for customer.
                        IpdBedLogRepository ipdBedLogRepository = new IpdBedLogRepository();
                        IpdBedLog ipdBedLog1 = ipdBedLogRepository.createObject(ipdBedLog);
                        setIpdBedLog(ipdBedLog1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIpdBedLog(HashMap<String, Object> ipdBedLog) {
                        //First create a dummy Repo class object for customer.
                        IpdBedLogRepository ipdBedLogRepository = new IpdBedLogRepository();
                        IpdBedLog ipdBedLog1 = ipdBedLogRepository.createObject(ipdBedLog);
                        setIpdBedLog(ipdBedLog1);
                    }

                    //Adding relation method..
                    public void addRelation(IpdBedLog ipdBedLog) {
                        that.setIpdBedLog(ipdBedLog);
                    }


                    //Fetch related data from local database if present a ipdBedLogId identifier as property for belongsTo
                    public IpdBedLog getIpdBedLog__db(RestAdapter restAdapter){
                      if(ipdBedLogId != null){
                        IpdBedLogRepository ipdBedLogRepository = restAdapter.createRepository(IpdBedLogRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(ipdBedLogRepository.getDb() == null ){
                                                    ipdBedLogRepository.addStorage(context);
                                                }

                                                if(context != null && ipdBedLogRepository.getDb() != null){
                                                    ipdBedLogRepository.addStorage(context);
                                                    IpdBedLog ipdBedLog = (IpdBedLog) ipdBedLogRepository.getDb().get__db(ipdBedLogId);
                                                    return ipdBedLog;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__ipdBedLog( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<IpdBedLog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__ipdBedLog( (String)that.getId(), refresh,  new ObjectCallback<IpdBedLog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(IpdBedLog object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient PatientSecurity  patientSecurity ;
                    private String patientSecurityId;

                    public String getPatientSecurityId(){
                         return patientSecurityId;
                    }

                    public void setPatientSecurityId(Object patientSecurityId){
                        if(patientSecurityId != null){
                          this.patientSecurityId = patientSecurityId.toString();
                        }
                    }

                    public PatientSecurity getPatientSecurity() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(patientSecurity == null){
                                        PatientGroupRepository patientGroupRepository = (PatientGroupRepository) getRepository();

                                        RestAdapter restAdapter = patientGroupRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          patientSecurity = getPatientSecurity__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return patientSecurity;
                    }

                    public void setPatientSecurity(PatientSecurity patientSecurity) {
                        this.patientSecurity = patientSecurity;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatientSecurity(Map<String, Object> patientSecurity) {
                        //First create a dummy Repo class object for customer.
                        PatientSecurityRepository patientSecurityRepository = new PatientSecurityRepository();
                        PatientSecurity patientSecurity1 = patientSecurityRepository.createObject(patientSecurity);
                        setPatientSecurity(patientSecurity1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPatientSecurity(HashMap<String, Object> patientSecurity) {
                        //First create a dummy Repo class object for customer.
                        PatientSecurityRepository patientSecurityRepository = new PatientSecurityRepository();
                        PatientSecurity patientSecurity1 = patientSecurityRepository.createObject(patientSecurity);
                        setPatientSecurity(patientSecurity1);
                    }

                    //Adding relation method..
                    public void addRelation(PatientSecurity patientSecurity) {
                        that.setPatientSecurity(patientSecurity);
                    }


                    //Fetch related data from local database if present a patientSecurityId identifier as property for belongsTo
                    public PatientSecurity getPatientSecurity__db(RestAdapter restAdapter){
                      if(patientSecurityId != null){
                        PatientSecurityRepository patientSecurityRepository = restAdapter.createRepository(PatientSecurityRepository.class);
                            try{
                            PatientGroupRepository lowercaseFirstLetterRepository = (PatientGroupRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(patientSecurityRepository.getDb() == null ){
                                                    patientSecurityRepository.addStorage(context);
                                                }

                                                if(context != null && patientSecurityRepository.getDb() != null){
                                                    patientSecurityRepository.addStorage(context);
                                                    PatientSecurity patientSecurity = (PatientSecurity) patientSecurityRepository.getDb().get__db(patientSecurityId);
                                                    return patientSecurity;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__patientSecurity( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<PatientSecurity> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__patientSecurity( (String)that.getId(), refresh,  new ObjectCallback<PatientSecurity> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientSecurity object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Bill>  bills ;

                    public DataList< Bill > getBills() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            BillRepository billRepository = (BillRepository) getRepository();

                            if(that.getId() != null && billRepository.getDb() != null){

                                 //Fetch locally from db
                                 //bills = getBills__db(restAdapter);
                                 // Getting single cont
                                 bills = billRepository.getDb().getAll__db("patientGroupId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return bills;
                    }

                    public void setBills(DataList<Bill> bills) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: bills){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setBills1(hashMaps);
                        }else{
                            this.bills = bills;
                            //TODO: Warning move this to new thread
                            for(Bill data: bills){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBills1(List<Map<String, Object>> bills) {
                        //First create a dummy Repo class object for ..
                        BillRepository billsRepository = new BillRepository();
                        List<Bill> result = new ArrayList<>();
                        for (Map<String, Object> obj : bills) {
                            //Also add relation to child type for two way communication..
                            Bill obj1 = billsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBills(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBills1(DataList<HashMap<String, Object>> bills) {
                        //First create a dummy Repo class object for ..
                        BillRepository billsRepository = new BillRepository();
                        DataList<Bill> result = new DataList<>();
                        for (HashMap<String, Object> obj : bills) {
                            //Also add relation to child type for two way communication..
                            Bill obj1 = billsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBills(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Bill> bills, Bill dummyClassInstance) {
                        that.setBills(bills);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Bill bills) {
                        try{
                            try{

                                  //Save to database..
                                  bills.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getBills().add(bills);
                        }catch(Exception e){
                            DataList< Bill> bills1 = new DataList();
                            //Now add this item to list..
                            bills1.add(bills);
                            //Now set data....
                            that.setBills(bills1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__bills( String fk,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.findById__bills( (String)that.getId(), fk,  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__bills( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.destroyById__bills( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__bills( String fk,  Bill data,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.updateById__bills( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__bills( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__bills( (String)that.getId(), filter,  new DataListCallback<Bill> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Bill> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Bill obj = new Bill();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Bill obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__bills( Bill data,  RestAdapter restAdapter, final ObjectCallback<Bill> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.create__bills( (String)that.getId(), data.convertMap(),  new ObjectCallback<Bill> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bill object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__bills( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        



                                        patientGroupRepo.delete__bills( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__bills( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.count__bills( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<ChatItem>  chatItems ;

                    public DataList< ChatItem > getChatItems() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ChatItemRepository chatItemRepository = (ChatItemRepository) getRepository();

                            if(that.getId() != null && chatItemRepository.getDb() != null){

                                 //Fetch locally from db
                                 //chatItems = getChatItems__db(restAdapter);
                                 // Getting single cont
                                 chatItems = chatItemRepository.getDb().getAll__db("patientGroupId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return chatItems;
                    }

                    public void setChatItems(DataList<ChatItem> chatItems) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: chatItems){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setChatItems1(hashMaps);
                        }else{
                            this.chatItems = chatItems;
                            //TODO: Warning move this to new thread
                            for(ChatItem data: chatItems){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChatItems1(List<Map<String, Object>> chatItems) {
                        //First create a dummy Repo class object for ..
                        ChatItemRepository chatItemsRepository = new ChatItemRepository();
                        List<ChatItem> result = new ArrayList<>();
                        for (Map<String, Object> obj : chatItems) {
                            //Also add relation to child type for two way communication..
                            ChatItem obj1 = chatItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChatItems(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChatItems1(DataList<HashMap<String, Object>> chatItems) {
                        //First create a dummy Repo class object for ..
                        ChatItemRepository chatItemsRepository = new ChatItemRepository();
                        DataList<ChatItem> result = new DataList<>();
                        for (HashMap<String, Object> obj : chatItems) {
                            //Also add relation to child type for two way communication..
                            ChatItem obj1 = chatItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChatItems(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<ChatItem> chatItems, ChatItem dummyClassInstance) {
                        that.setChatItems(chatItems);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(ChatItem chatItems) {
                        try{
                            try{

                                  //Save to database..
                                  chatItems.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getChatItems().add(chatItems);
                        }catch(Exception e){
                            DataList< ChatItem> chatItems1 = new DataList();
                            //Now add this item to list..
                            chatItems1.add(chatItems);
                            //Now set data....
                            that.setChatItems(chatItems1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__chatItems( String fk,  RestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.findById__chatItems( (String)that.getId(), fk,  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__chatItems( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.destroyById__chatItems( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__chatItems( String fk,  ChatItem data,  RestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.updateById__chatItems( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__chatItems( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.get__chatItems( (String)that.getId(), filter,  new DataListCallback<ChatItem> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<ChatItem> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            ChatItem obj = new ChatItem();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (ChatItem obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__chatItems( ChatItem data,  RestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.create__chatItems( (String)that.getId(), data.convertMap(),  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__chatItems( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        



                                        patientGroupRepo.delete__chatItems( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__chatItems( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PatientGroupRepository  patientGroupRepo = restAdapter.createRepository(PatientGroupRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        patientGroupRepo.count__chatItems( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
      

}
