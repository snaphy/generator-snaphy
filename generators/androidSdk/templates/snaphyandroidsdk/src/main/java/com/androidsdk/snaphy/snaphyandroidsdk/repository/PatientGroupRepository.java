package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
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
import com.androidsdk.snaphy.snaphyandroidsdk.list.Util;

import com.strongloop.android.remoting.adapters.Adapter;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;
import android.util.Log;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;


//Replaced by Custom ModelRepository method
//import com.strongloop.android.loopback.ModelRepository;



import org.json.JSONArray;
import org.json.JSONObject;


//Import its models too.
import com.androidsdk.snaphy.snaphyandroidsdk.models.PatientGroup;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.PatientGroupDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Hospital;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Pincode;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PincodeRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.District;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.State;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StateRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Taluk;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TalukRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Patient;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.IpdBed;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdBedRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.HospitalUser;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Aadhar;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AadharRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.PatientDocument;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientDocumentRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.PatientGroupLog;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupLogRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.OpdTokenLog;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OpdTokenLogRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.IpdBedLog;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IpdBedLogRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.PatientSecurity;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientSecurityRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Bill;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BillRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.ChatItem;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;
            
        
    





public class PatientGroupRepository extends ModelRepository<PatientGroup> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public PatientGroupRepository(){
        super("PatientGroup", null, PatientGroup.class);

    }


    public Context getContext(){
        return context;
    }


    







    public PatientGroupDb getDb() {
      return patientGroupDb;
    }

    public void setPatientGroupDb(PatientGroupDb patientGroupDb) {
      this.patientGroupDb = patientGroupDb;
    }

    private PatientGroupDb patientGroupDb;



    //Flag to check either to store data locally or not..
    private boolean STORE_LOCALLY = true;

    public boolean isSTORE_LOCALLY() {
      return STORE_LOCALLY;
    }


    public void  persistData(boolean persist){
      STORE_LOCALLY = persist;
    }



    public void reset__db(){
      if(isSTORE_LOCALLY()){
          getDb().reset__db();
      }
    }



    public void addStorage(Context context){
         try{
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            DATABASE_NAME = (String) ai.metaData.get(METADATA_DATABASE_NAME_KEY);
         }
         catch (Exception e){
            Log.e("Snaphy", e.toString());
         }
         setPatientGroupDb(new PatientGroupDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patient", "GET"), "PatientGroup.prototype.__get__patient");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/aadhar", "GET"), "PatientGroup.prototype.__get__aadhar");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/hospital", "GET"), "PatientGroup.prototype.__get__hospital");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/ipdBedLog", "GET"), "PatientGroup.prototype.__get__ipdBedLog");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/ipdBed", "GET"), "PatientGroup.prototype.__get__ipdBed");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/opdTokenLog", "GET"), "PatientGroup.prototype.__get__opdTokenLog");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientSecurity", "GET"), "PatientGroup.prototype.__get__patientSecurity");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientDocuments/:fk", "GET"), "PatientGroup.prototype.__findById__patientDocuments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientDocuments/:fk", "DELETE"), "PatientGroup.prototype.__destroyById__patientDocuments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientDocuments/:fk", "PUT"), "PatientGroup.prototype.__updateById__patientDocuments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/hospitalUser", "GET"), "PatientGroup.prototype.__get__hospitalUser");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/state", "GET"), "PatientGroup.prototype.__get__state");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientGroupLogs/:fk", "GET"), "PatientGroup.prototype.__findById__patientGroupLogs");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientGroupLogs/:fk", "DELETE"), "PatientGroup.prototype.__destroyById__patientGroupLogs");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientGroupLogs/:fk", "PUT"), "PatientGroup.prototype.__updateById__patientGroupLogs");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/pincode", "GET"), "PatientGroup.prototype.__get__pincode");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/taluk", "GET"), "PatientGroup.prototype.__get__taluk");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/district", "GET"), "PatientGroup.prototype.__get__district");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/bills/:fk", "GET"), "PatientGroup.prototype.__findById__bills");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/bills/:fk", "DELETE"), "PatientGroup.prototype.__destroyById__bills");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/bills/:fk", "PUT"), "PatientGroup.prototype.__updateById__bills");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/chatItems/:fk", "GET"), "PatientGroup.prototype.__findById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/chatItems/:fk", "DELETE"), "PatientGroup.prototype.__destroyById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/chatItems/:fk", "PUT"), "PatientGroup.prototype.__updateById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientDocuments", "GET"), "PatientGroup.prototype.__get__patientDocuments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientDocuments", "POST"), "PatientGroup.prototype.__create__patientDocuments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientDocuments", "DELETE"), "PatientGroup.prototype.__delete__patientDocuments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientDocuments/count", "GET"), "PatientGroup.prototype.__count__patientDocuments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientGroupLogs", "GET"), "PatientGroup.prototype.__get__patientGroupLogs");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientGroupLogs", "POST"), "PatientGroup.prototype.__create__patientGroupLogs");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientGroupLogs", "DELETE"), "PatientGroup.prototype.__delete__patientGroupLogs");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/patientGroupLogs/count", "GET"), "PatientGroup.prototype.__count__patientGroupLogs");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/bills", "GET"), "PatientGroup.prototype.__get__bills");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/bills", "POST"), "PatientGroup.prototype.__create__bills");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/bills", "DELETE"), "PatientGroup.prototype.__delete__bills");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/bills/count", "GET"), "PatientGroup.prototype.__count__bills");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/chatItems", "GET"), "PatientGroup.prototype.__get__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/chatItems", "POST"), "PatientGroup.prototype.__create__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/chatItems", "DELETE"), "PatientGroup.prototype.__delete__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId/chatItems/count", "GET"), "PatientGroup.prototype.__count__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "PatientGroup.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "PatientGroup.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "PatientGroup.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "PatientGroup.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "PatientGroup.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "PatientGroup.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "PatientGroup.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "PatientGroup.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "PatientGroup.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "PatientGroup.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:patientGroupId", "PUT"), "PatientGroup.prototype.updateAttributes");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "PatientGroup.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "PatientGroup.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "PatientGroup.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "PatientGroup.getModelRelationSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/subscribe", "POST"), "PatientGroup.subscribe");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findAdmittedPatients", "POST"), "PatientGroup.findAdmittedPatients");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getOpdSummary", "POST"), "PatientGroup.getOpdSummary");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getIpdSummary", "POST"), "PatientGroup.getIpdSummary");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/markForAdmission", "POST"), "PatientGroup.markForAdmission");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getRecentlyAddedPatient", "POST"), "PatientGroup.getRecentlyAddedPatient");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/dischargePatientGroup", "POST"), "PatientGroup.dischargePatientGroup");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/revenueCollection", "POST"), "PatientGroup.revenueCollection");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/createPatientLike", "POST"), "PatientGroup.createPatientLike");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/savePatientScannedDocuments", "POST"), "PatientGroup.savePatientScannedDocuments");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findAllPatientsOfPatientGroup", "POST"), "PatientGroup.findAllPatientsOfPatientGroup");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchPatientById", "POST"), "PatientGroup.fetchPatientById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/savePatientScannedDocumentDetails", "POST"), "PatientGroup.savePatientScannedDocumentDetails");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getRecentlyAddedPatient_", "POST"), "PatientGroup.getRecentlyAddedPatient_");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/changeBedNumber", "POST"), "PatientGroup.changeBedNumber");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findAdmittedPatientsOfflineFinal", "POST"), "PatientGroup.findAdmittedPatientsOfflineFinal");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findAdmittedPatientsOffline", "POST"), "PatientGroup.findAdmittedPatientsOffline");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchPatientByIdOffline", "POST"), "PatientGroup.fetchPatientByIdOffline");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchPatientByIdFinalOffline", "POST"), "PatientGroup.fetchPatientByIdFinalOffline");
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method get__patient definition
            public void get__patient(  String patientGroupId,  Boolean refresh, final ObjectCallback<Patient> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__patient", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientRepository patientRepo = getRestAdapter().createRepository(PatientRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Patient patient = patientRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patient.getClass().getMethod("save__db");
                                                    method.invoke(patient);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patient);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__patient definition ends here..

            

        
    
        
            //Method get__aadhar definition
            public void get__aadhar(  String patientGroupId,  Boolean refresh, final ObjectCallback<Aadhar> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__aadhar", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AadharRepository aadharRepo = getRestAdapter().createRepository(AadharRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = aadharRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(aadharRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //aadharRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Aadhar aadhar = aadharRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = aadhar.getClass().getMethod("save__db");
                                                    method.invoke(aadhar);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(aadhar);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__aadhar definition ends here..

            

        
    
        
            //Method get__hospital definition
            public void get__hospital(  String patientGroupId,  Boolean refresh, final ObjectCallback<Hospital> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__hospital", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalRepository hospitalRepo = getRestAdapter().createRepository(HospitalRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Hospital hospital = hospitalRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospital.getClass().getMethod("save__db");
                                                    method.invoke(hospital);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospital);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__hospital definition ends here..

            

        
    
        
            //Method get__ipdBedLog definition
            public void get__ipdBedLog(  String patientGroupId,  Boolean refresh, final ObjectCallback<IpdBedLog> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__ipdBedLog", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    IpdBedLogRepository ipdBedLogRepo = getRestAdapter().createRepository(IpdBedLogRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = ipdBedLogRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(ipdBedLogRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //ipdBedLogRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    IpdBedLog ipdBedLog = ipdBedLogRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = ipdBedLog.getClass().getMethod("save__db");
                                                    method.invoke(ipdBedLog);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(ipdBedLog);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__ipdBedLog definition ends here..

            

        
    
        
            //Method get__ipdBed definition
            public void get__ipdBed(  String patientGroupId,  Boolean refresh, final ObjectCallback<IpdBed> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__ipdBed", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    IpdBedRepository ipdBedRepo = getRestAdapter().createRepository(IpdBedRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = ipdBedRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(ipdBedRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //ipdBedRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    IpdBed ipdBed = ipdBedRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = ipdBed.getClass().getMethod("save__db");
                                                    method.invoke(ipdBed);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(ipdBed);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__ipdBed definition ends here..

            

        
    
        
            //Method get__opdTokenLog definition
            public void get__opdTokenLog(  String patientGroupId,  Boolean refresh, final ObjectCallback<OpdTokenLog> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__opdTokenLog", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    OpdTokenLogRepository opdTokenLogRepo = getRestAdapter().createRepository(OpdTokenLogRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = opdTokenLogRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(opdTokenLogRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //opdTokenLogRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    OpdTokenLog opdTokenLog = opdTokenLogRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = opdTokenLog.getClass().getMethod("save__db");
                                                    method.invoke(opdTokenLog);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(opdTokenLog);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__opdTokenLog definition ends here..

            

        
    
        
            //Method get__patientSecurity definition
            public void get__patientSecurity(  String patientGroupId,  Boolean refresh, final ObjectCallback<PatientSecurity> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__patientSecurity", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientSecurityRepository patientSecurityRepo = getRestAdapter().createRepository(PatientSecurityRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientSecurityRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientSecurityRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientSecurityRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientSecurity patientSecurity = patientSecurityRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientSecurity.getClass().getMethod("save__db");
                                                    method.invoke(patientSecurity);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientSecurity);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__patientSecurity definition ends here..

            

        
    
        
            //Method findById__patientDocuments definition
            public void findById__patientDocuments(  String patientGroupId,  String fk, final ObjectCallback<PatientDocument> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__patientDocuments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientDocumentRepository patientDocumentRepo = getRestAdapter().createRepository(PatientDocumentRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientDocumentRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientDocumentRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientDocumentRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientDocument patientDocument = patientDocumentRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientDocument.getClass().getMethod("save__db");
                                                    method.invoke(patientDocument);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientDocument);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__patientDocuments definition ends here..

            

        
    
        
            //Method destroyById__patientDocuments definition
            public void destroyById__patientDocuments(  String patientGroupId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__patientDocuments", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__patientDocuments definition ends here..

            

        
    
        
            //Method updateById__patientDocuments definition
            public void updateById__patientDocuments(  String patientGroupId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<PatientDocument> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__patientDocuments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientDocumentRepository patientDocumentRepo = getRestAdapter().createRepository(PatientDocumentRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientDocumentRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientDocumentRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientDocumentRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientDocument patientDocument = patientDocumentRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientDocument.getClass().getMethod("save__db");
                                                    method.invoke(patientDocument);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientDocument);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__patientDocuments definition ends here..

            

        
    
        
            //Method get__hospitalUser definition
            public void get__hospitalUser(  String patientGroupId,  Boolean refresh, final ObjectCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__hospitalUser", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUser hospitalUser = hospitalUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUser.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__hospitalUser definition ends here..

            

        
    
        
            //Method get__state definition
            public void get__state(  String patientGroupId,  Boolean refresh, final ObjectCallback<State> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__state", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    StateRepository stateRepo = getRestAdapter().createRepository(StateRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = stateRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(stateRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //stateRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    State state = stateRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = state.getClass().getMethod("save__db");
                                                    method.invoke(state);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(state);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__state definition ends here..

            

        
    
        
            //Method findById__patientGroupLogs definition
            public void findById__patientGroupLogs(  String patientGroupId,  String fk, final ObjectCallback<PatientGroupLog> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__patientGroupLogs", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupLogRepository patientGroupLogRepo = getRestAdapter().createRepository(PatientGroupLogRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupLogRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupLogRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupLogRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroupLog patientGroupLog = patientGroupLogRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroupLog.getClass().getMethod("save__db");
                                                    method.invoke(patientGroupLog);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroupLog);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__patientGroupLogs definition ends here..

            

        
    
        
            //Method destroyById__patientGroupLogs definition
            public void destroyById__patientGroupLogs(  String patientGroupId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__patientGroupLogs", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__patientGroupLogs definition ends here..

            

        
    
        
            //Method updateById__patientGroupLogs definition
            public void updateById__patientGroupLogs(  String patientGroupId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<PatientGroupLog> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__patientGroupLogs", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupLogRepository patientGroupLogRepo = getRestAdapter().createRepository(PatientGroupLogRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupLogRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupLogRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupLogRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroupLog patientGroupLog = patientGroupLogRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroupLog.getClass().getMethod("save__db");
                                                    method.invoke(patientGroupLog);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroupLog);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__patientGroupLogs definition ends here..

            

        
    
        
            //Method get__pincode definition
            public void get__pincode(  String patientGroupId,  Boolean refresh, final ObjectCallback<Pincode> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__pincode", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PincodeRepository pincodeRepo = getRestAdapter().createRepository(PincodeRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = pincodeRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(pincodeRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //pincodeRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Pincode pincode = pincodeRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = pincode.getClass().getMethod("save__db");
                                                    method.invoke(pincode);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(pincode);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__pincode definition ends here..

            

        
    
        
            //Method get__taluk definition
            public void get__taluk(  String patientGroupId,  Boolean refresh, final ObjectCallback<Taluk> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__taluk", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    TalukRepository talukRepo = getRestAdapter().createRepository(TalukRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = talukRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(talukRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //talukRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Taluk taluk = talukRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = taluk.getClass().getMethod("save__db");
                                                    method.invoke(taluk);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(taluk);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__taluk definition ends here..

            

        
    
        
            //Method get__district definition
            public void get__district(  String patientGroupId,  Boolean refresh, final ObjectCallback<District> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__district", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    DistrictRepository districtRepo = getRestAdapter().createRepository(DistrictRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = districtRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(districtRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //districtRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    District district = districtRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = district.getClass().getMethod("save__db");
                                                    method.invoke(district);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(district);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__district definition ends here..

            

        
    
        
            //Method findById__bills definition
            public void findById__bills(  String patientGroupId,  String fk, final ObjectCallback<Bill> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__bills", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    BillRepository billRepo = getRestAdapter().createRepository(BillRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = billRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(billRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //billRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Bill bill = billRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = bill.getClass().getMethod("save__db");
                                                    method.invoke(bill);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(bill);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__bills definition ends here..

            

        
    
        
            //Method destroyById__bills definition
            public void destroyById__bills(  String patientGroupId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__bills", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__bills definition ends here..

            

        
    
        
            //Method updateById__bills definition
            public void updateById__bills(  String patientGroupId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<Bill> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__bills", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    BillRepository billRepo = getRestAdapter().createRepository(BillRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = billRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(billRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //billRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Bill bill = billRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = bill.getClass().getMethod("save__db");
                                                    method.invoke(bill);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(bill);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__bills definition ends here..

            

        
    
        
            //Method findById__chatItems definition
            public void findById__chatItems(  String patientGroupId,  String fk, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__chatItems definition ends here..

            

        
    
        
            //Method destroyById__chatItems definition
            public void destroyById__chatItems(  String patientGroupId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__chatItems", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__chatItems definition ends here..

            

        
    
        
            //Method updateById__chatItems definition
            public void updateById__chatItems(  String patientGroupId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__chatItems definition ends here..

            

        
    
        
            //Method get__patientDocuments definition
            public void get__patientDocuments(  String patientGroupId,  Map<String,  ? extends Object> filter, final DataListCallback<PatientDocument> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__patientDocuments", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<PatientDocument> patientDocumentList = new DataList<PatientDocument>();
                                    PatientDocumentRepository patientDocumentRepo = getRestAdapter().createRepository(PatientDocumentRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientDocumentRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientDocumentRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        PatientDocument patientDocument = patientDocumentRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = patientDocument.getClass().getMethod("save__db");
                                                      method.invoke(patientDocument);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        patientDocumentList.add(patientDocument);
                                    }
                                    callback.onSuccess(patientDocumentList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__patientDocuments definition ends here..

            

        
    
        
            //Method create__patientDocuments definition
            public void create__patientDocuments(  String patientGroupId,  Map<String,  ? extends Object> data, final ObjectCallback<PatientDocument> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__patientDocuments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientDocumentRepository patientDocumentRepo = getRestAdapter().createRepository(PatientDocumentRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientDocumentRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientDocumentRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientDocumentRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientDocument patientDocument = patientDocumentRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientDocument.getClass().getMethod("save__db");
                                                    method.invoke(patientDocument);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientDocument);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__patientDocuments definition ends here..

            

        
    
        
            //Method delete__patientDocuments definition
            public void delete__patientDocuments(  String patientGroupId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                

                
                    invokeStaticMethod("prototype.__delete__patientDocuments", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__patientDocuments definition ends here..

            

        
    
        
            //Method count__patientDocuments definition
            public void count__patientDocuments(  String patientGroupId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__patientDocuments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__patientDocuments definition ends here..

            

        
    
        
            //Method get__patientGroupLogs definition
            public void get__patientGroupLogs(  String patientGroupId,  Map<String,  ? extends Object> filter, final DataListCallback<PatientGroupLog> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__patientGroupLogs", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<PatientGroupLog> patientGroupLogList = new DataList<PatientGroupLog>();
                                    PatientGroupLogRepository patientGroupLogRepo = getRestAdapter().createRepository(PatientGroupLogRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupLogRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupLogRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        PatientGroupLog patientGroupLog = patientGroupLogRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = patientGroupLog.getClass().getMethod("save__db");
                                                      method.invoke(patientGroupLog);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        patientGroupLogList.add(patientGroupLog);
                                    }
                                    callback.onSuccess(patientGroupLogList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__patientGroupLogs definition ends here..

            

        
    
        
            //Method create__patientGroupLogs definition
            public void create__patientGroupLogs(  String patientGroupId,  Map<String,  ? extends Object> data, final ObjectCallback<PatientGroupLog> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__patientGroupLogs", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupLogRepository patientGroupLogRepo = getRestAdapter().createRepository(PatientGroupLogRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupLogRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupLogRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupLogRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroupLog patientGroupLog = patientGroupLogRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroupLog.getClass().getMethod("save__db");
                                                    method.invoke(patientGroupLog);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroupLog);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__patientGroupLogs definition ends here..

            

        
    
        
            //Method delete__patientGroupLogs definition
            public void delete__patientGroupLogs(  String patientGroupId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                

                
                    invokeStaticMethod("prototype.__delete__patientGroupLogs", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__patientGroupLogs definition ends here..

            

        
    
        
            //Method count__patientGroupLogs definition
            public void count__patientGroupLogs(  String patientGroupId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__patientGroupLogs", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__patientGroupLogs definition ends here..

            

        
    
        
            //Method get__bills definition
            public void get__bills(  String patientGroupId,  Map<String,  ? extends Object> filter, final DataListCallback<Bill> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__bills", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<Bill> billList = new DataList<Bill>();
                                    BillRepository billRepo = getRestAdapter().createRepository(BillRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = billRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(billRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Bill bill = billRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = bill.getClass().getMethod("save__db");
                                                      method.invoke(bill);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        billList.add(bill);
                                    }
                                    callback.onSuccess(billList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__bills definition ends here..

            

        
    
        
            //Method create__bills definition
            public void create__bills(  String patientGroupId,  Map<String,  ? extends Object> data, final ObjectCallback<Bill> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__bills", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    BillRepository billRepo = getRestAdapter().createRepository(BillRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = billRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(billRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //billRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Bill bill = billRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = bill.getClass().getMethod("save__db");
                                                    method.invoke(bill);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(bill);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__bills definition ends here..

            

        
    
        
            //Method delete__bills definition
            public void delete__bills(  String patientGroupId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                

                
                    invokeStaticMethod("prototype.__delete__bills", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__bills definition ends here..

            

        
    
        
            //Method count__bills definition
            public void count__bills(  String patientGroupId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__bills", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__bills definition ends here..

            

        
    
        
            //Method get__chatItems definition
            public void get__chatItems(  String patientGroupId,  Map<String,  ? extends Object> filter, final DataListCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__chatItems", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<ChatItem> chatItemList = new DataList<ChatItem>();
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        ChatItem chatItem = chatItemRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = chatItem.getClass().getMethod("save__db");
                                                      method.invoke(chatItem);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        chatItemList.add(chatItem);
                                    }
                                    callback.onSuccess(chatItemList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__chatItems definition ends here..

            

        
    
        
            //Method create__chatItems definition
            public void create__chatItems(  String patientGroupId,  Map<String,  ? extends Object> data, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__chatItems definition ends here..

            

        
    
        
            //Method delete__chatItems definition
            public void delete__chatItems(  String patientGroupId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                

                
                    invokeStaticMethod("prototype.__delete__chatItems", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__chatItems definition ends here..

            

        
    
        
            //Method count__chatItems definition
            public void count__chatItems(  String patientGroupId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__chatItems definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method upsert definition ends here..

            

        
    
        
            //Method exists definition
            public void exists(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method exists definition ends here..

            

        
    
        
            //Method findById definition
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<PatientGroup> patientGroupList = new DataList<PatientGroup>();
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        PatientGroup patientGroup = patientGroupRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = patientGroup.getClass().getMethod("save__db");
                                                      method.invoke(patientGroup);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        patientGroupList.add(patientGroup);
                                    }
                                    callback.onSuccess(patientGroupList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findOne definition ends here..

            

        
    
        
            //Method updateAll definition
            public void updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAll definition ends here..

            

        
    
        
            //Method deleteById definition
            public void deleteById(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method deleteById definition ends here..

            

        
    
        
            //Method count definition
            public void count(  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String patientGroupId,  Map<String,  ? extends Object> data, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.updateAttributes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
            //Method getSchema definition
            public void getSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
            //Method getAbsoluteSchema definition
            public void getAbsoluteSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getAbsoluteSchema definition ends here..

            

        
    
        
    
        
            //Method getDetailSchema definition
            public void getDetailSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getDetailSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getDetailSchema definition ends here..

            

        
    
        
            //Method getModelRelationSchema definition
            public void getModelRelationSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getModelRelationSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getModelRelationSchema definition ends here..

            

        
    
        
            //Method subscribe definition
            public void subscribe(  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("subscribe", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method subscribe definition ends here..

            

        
    
        
            //Method findAdmittedPatients definition
            public void findAdmittedPatients(  String hospitalId,  String hospitalUserId,  String facility,  String searchQuery,  double skip,  double limit,  String filterType, final ObjectCallback<JSONArray> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalId", hospitalId);
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("facility", facility);
                
                        hashMapObject.put("searchQuery", searchQuery);
                
                        hashMapObject.put("skip", skip);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("filterType", filterType);
                

                


                

                
                    invokeStaticMethod("findAdmittedPatients", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method findAdmittedPatients definition ends here..

            

        
    
        
            //Method getOpdSummary definition
            public void getOpdSummary(  String hospitalUserId,  String hospitalId, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("hospitalId", hospitalId);
                

                


                
                    
                    invokeStaticMethod("getOpdSummary", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getOpdSummary definition ends here..

            

        
    
        
            //Method getIpdSummary definition
            public void getIpdSummary(  String hospitalId, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalId", hospitalId);
                

                


                
                    
                    invokeStaticMethod("getIpdSummary", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getIpdSummary definition ends here..

            

        
    
        
            //Method markForAdmission definition
            public void markForAdmission(  String patientId,  String hospitalId,  String ipdBedId,  String diagnosis, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientId", patientId);
                
                        hashMapObject.put("hospitalId", hospitalId);
                
                        hashMapObject.put("ipdBedId", ipdBedId);
                
                        hashMapObject.put("diagnosis", diagnosis);
                

                


                
                    
                    invokeStaticMethod("markForAdmission", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method markForAdmission definition ends here..

            

        
    
        
            //Method getRecentlyAddedPatient definition
            public void getRecentlyAddedPatient(  Map<String,  ? extends Object> ctx,  String facility, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("facility", facility);
                

                


                
                    
                    invokeStaticMethod("getRecentlyAddedPatient", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getRecentlyAddedPatient definition ends here..

            

        
    
        
            //Method dischargePatientGroup definition
            public void dischargePatientGroup(  String patientGroupId,  Boolean lama, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("lama", lama);
                

                


                
                    
                    invokeStaticMethod("dischargePatientGroup", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method dischargePatientGroup definition ends here..

            

        
    
        
            //Method revenueCollection definition
            public void revenueCollection(  String hospitalId,  String hospitalUserId,  String facilityType,  String date, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalId", hospitalId);
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("facilityType", facilityType);
                
                        hashMapObject.put("date", date);
                

                


                
                    
                    invokeStaticMethod("revenueCollection", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method revenueCollection definition ends here..

            

        
    
        
            //Method createPatientLike definition
            public void createPatientLike(  Map<String,  ? extends Object> ctx,  Map<String,  ? extends Object> patientLikeObj,  Map<String,  ? extends Object> patientGroupObj, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("patientLikeObj", patientLikeObj);
                
                        hashMapObject.put("patientGroupObj", patientGroupObj);
                

                


                
                    
                    
                    invokeStaticMethod("createPatientLike", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method createPatientLike definition ends here..

            

        
    
        
            //Method savePatientScannedDocuments definition
            public void savePatientScannedDocuments(  Map<String,  ? extends Object> ctx,  DataList<Map<String,  ? extends Object>> documentList,  String patientId,  String patientGroupId, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("documentList", documentList);
                
                        hashMapObject.put("patientId", patientId);
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                

                


                
                    
                    
                    invokeStaticMethod("savePatientScannedDocuments", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method savePatientScannedDocuments definition ends here..

            

        
    
        
            //Method findAllPatientsOfPatientGroup definition
            public void findAllPatientsOfPatientGroup(  Map<String,  ? extends Object> ctx,  DataList<String> patientIdList, final DataListCallback<Patient> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("patientIdList", patientIdList);
                

                


                

                
                    invokeStaticMethod("findAllPatientsOfPatientGroup", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<Patient> patientList = new DataList<Patient>();
                                    PatientRepository patientRepo = getRestAdapter().createRepository(PatientRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Patient patient = patientRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = patient.getClass().getMethod("save__db");
                                                      method.invoke(patient);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        patientList.add(patient);
                                    }
                                    callback.onSuccess(patientList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method findAllPatientsOfPatientGroup definition ends here..

            

        
    
        
            //Method fetchPatientById definition
            public void fetchPatientById(  String patientGroupId, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                

                


                
                    
                    
                    invokeStaticMethod("fetchPatientById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method fetchPatientById definition ends here..

            

        
    
        
            //Method savePatientScannedDocumentDetails definition
            public void savePatientScannedDocumentDetails(  Map<String,  ? extends Object> ctx,  DataList<Map<String,  ? extends Object>> documentList,  String patientId,  String patientGroupId,  String hospitalId, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("documentList", documentList);
                
                        hashMapObject.put("patientId", patientId);
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("hospitalId", hospitalId);
                

                


                
                    
                    
                    invokeStaticMethod("savePatientScannedDocumentDetails", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method savePatientScannedDocumentDetails definition ends here..

            

        
    
        
            //Method getRecentlyAddedPatient_ definition
            public void getRecentlyAddedPatient_(  Map<String,  ? extends Object> ctx,  String hospitalId,  String facility, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("hospitalId", hospitalId);
                
                        hashMapObject.put("facility", facility);
                

                


                
                    
                    invokeStaticMethod("getRecentlyAddedPatient_", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getRecentlyAddedPatient_ definition ends here..

            

        
    
        
            //Method changeBedNumber definition
            public void changeBedNumber(  Map<String,  ? extends Object> ctx,  String patientGroupId,  String ipdBedId,  String oldIpdBedId,  String hospitalId, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("ipdBedId", ipdBedId);
                
                        hashMapObject.put("oldIpdBedId", oldIpdBedId);
                
                        hashMapObject.put("hospitalId", hospitalId);
                

                


                
                    
                    
                    invokeStaticMethod("changeBedNumber", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method changeBedNumber definition ends here..

            

        
    
        
            //Method findAdmittedPatientsOfflineFinal definition
            public void findAdmittedPatientsOfflineFinal(  String hospitalId,  String hospitalUserId,  String facility,  String searchQuery,  double skip,  double limit,  String filterType,  String lastSyncDate, final DataListCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalId", hospitalId);
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("facility", facility);
                
                        hashMapObject.put("searchQuery", searchQuery);
                
                        hashMapObject.put("skip", skip);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("filterType", filterType);
                
                        hashMapObject.put("lastSyncDate", lastSyncDate);
                

                


                

                
                    invokeStaticMethod("findAdmittedPatientsOfflineFinal", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<PatientGroup> patientGroupList = new DataList<PatientGroup>();
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        PatientGroup patientGroup = patientGroupRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = patientGroup.getClass().getMethod("save__db");
                                                      method.invoke(patientGroup);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        patientGroupList.add(patientGroup);
                                    }
                                    callback.onSuccess(patientGroupList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method findAdmittedPatientsOfflineFinal definition ends here..

            

        
    
        
            //Method findAdmittedPatientsOffline definition
            public void findAdmittedPatientsOffline(  String hospitalId,  String hospitalUserId,  String facility,  String searchQuery,  double skip,  double limit,  String filterType,  Map<String,  ? extends Object> hashObject, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalId", hospitalId);
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("facility", facility);
                
                        hashMapObject.put("searchQuery", searchQuery);
                
                        hashMapObject.put("skip", skip);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("filterType", filterType);
                
                        hashMapObject.put("hashObject", hashObject);
                

                


                
                    
                    invokeStaticMethod("findAdmittedPatientsOffline", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findAdmittedPatientsOffline definition ends here..

            

        
    
        
            //Method fetchPatientByIdOffline definition
            public void fetchPatientByIdOffline(  String patientGroupId,  Map<String,  ? extends Object> hashObject, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                
                        hashMapObject.put("hashObject", hashObject);
                

                


                
                    
                    invokeStaticMethod("fetchPatientByIdOffline", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method fetchPatientByIdOffline definition ends here..

            

        
    
        
            //Method fetchPatientByIdFinalOffline definition
            public void fetchPatientByIdFinalOffline(  String patientGroupId, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("patientGroupId", patientGroupId);
                

                


                
                    
                    
                    invokeStaticMethod("fetchPatientByIdFinalOffline", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method fetchPatientByIdFinalOffline definition ends here..

            

        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    



}
