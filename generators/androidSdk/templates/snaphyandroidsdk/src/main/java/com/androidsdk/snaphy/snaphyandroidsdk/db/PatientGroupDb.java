package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.GsonBuilder;
import android.database.Cursor;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.PatientGroup;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class PatientGroupDb{

    // All Static variables
    RestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";
    private Context context;
    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;

  public PatientGroupDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "PatientGroup";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final PatientGroup _modelData) {
        // new Thread(new Runnable() {
        //      @Override
        //      public void run() {
                    
                    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                    db.beginTransaction();
                    // Inserting Row
                    ContentValues values = getContentValues(_modelData);
                    db.insert("`PatientGroup`", null, values);
                    //db.close(); // Closing database connection
                    db.setTransactionSuccessful();
                    db.endTransaction();
        //      }
        // }).start();
    }





    public ContentValues getContentValues(PatientGroup _modelData){
      ContentValues values = new ContentValues();
                       
                                                            String addedData = "";
                        if(_modelData.getAdded() != null){
                          addedData = _modelData.getAdded().toString();
                          values.put("`added`", addedData);
                        }
                                  
                                
                                                            String updatedData = "";
                        if(_modelData.getUpdated() != null){
                          updatedData = _modelData.getUpdated().toString();
                          values.put("`updated`", updatedData);
                        }
                                  
                                
                                                            String unique_numberData = "";
                        if(_modelData.getUnique_number() != null){
                          unique_numberData = _modelData.getUnique_number().toString();
                          values.put("`unique_number`", unique_numberData);
                        }
                                  
                                
                                                            String patientContactNumberData = "";
                        if(_modelData.getPatientContactNumber() != null){
                          patientContactNumberData = _modelData.getPatientContactNumber().toString();
                          values.put("`patientContactNumber`", patientContactNumberData);
                        }
                                  
                                
                                                            String nameData = "";
                        if(_modelData.getName() != null){
                          nameData = _modelData.getName().toString();
                          values.put("`name`", nameData);
                        }
                                  
                                
                                                            int lamaData = 0;
                        if(_modelData.getLama()){
                          lamaData = 1;
                        }else{
                          lamaData = 0;
                        }
                        values.put("`lama`", lamaData);
                                  
                                
                                                            String statusData = "";
                        if(_modelData.getStatus() != null){
                          statusData = _modelData.getStatus().toString();
                          values.put("`status`", statusData);
                        }
                                  
                                
                                                            int hasDischargedData = 0;
                        if(_modelData.getHasDischarged()){
                          hasDischargedData = 1;
                        }else{
                          hasDischargedData = 0;
                        }
                        values.put("`hasDischarged`", hasDischargedData);
                                  
                                
                                                            int hasConsultedData = 0;
                        if(_modelData.getHasConsulted()){
                          hasConsultedData = 1;
                        }else{
                          hasConsultedData = 0;
                        }
                        values.put("`hasConsulted`", hasConsultedData);
                                  
                                
                                                            String facilityData = "";
                        if(_modelData.getFacility() != null){
                          facilityData = _modelData.getFacility().toString();
                          values.put("`facility`", facilityData);
                        }
                                  
                                
                                                            String relationLogsData = "";
                        if(_modelData.getRelationLogs() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          relationLogsData = gson.toJson(_modelData.getRelationLogs(), HashMap.class);
                          values.put("`relationLogs`", relationLogsData);
                        }
                                  
                                
                                                            String diagnosisData = "";
                        if(_modelData.getDiagnosis() != null){
                          diagnosisData = _modelData.getDiagnosis().toString();
                          values.put("`diagnosis`", diagnosisData);
                        }
                                  
                                
                                                            String admittedOnData = "";
                        if(_modelData.getAdmittedOn() != null){
                          admittedOnData = _modelData.getAdmittedOn().toString();
                          values.put("`admittedOn`", admittedOnData);
                        }
                                  
                                
                                                            String dischargedOnData = "";
                        if(_modelData.getDischargedOn() != null){
                          dischargedOnData = _modelData.getDischargedOn().toString();
                          values.put("`dischargedOn`", dischargedOnData);
                        }
                                  
                                
                                                            String consultedOnData = "";
                        if(_modelData.getConsultedOn() != null){
                          consultedOnData = _modelData.getConsultedOn().toString();
                          values.put("`consultedOn`", consultedOnData);
                        }
                                  
                                
                                  String patientOtherContactNumberData = "";
                  if(_modelData.getPatientOtherContactNumber() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    patientOtherContactNumberData = gson.toJson(_modelData.getPatientOtherContactNumber(), DataList.class);
                    values.put("`patientOtherContactNumber`", patientOtherContactNumberData);
                  }
              
                                
                                                            int flaggedInSameHospitalData = 0;
                        if(_modelData.getFlaggedInSameHospital()){
                          flaggedInSameHospitalData = 1;
                        }else{
                          flaggedInSameHospitalData = 0;
                        }
                        values.put("`flaggedInSameHospital`", flaggedInSameHospitalData);
                                  
                                
                                                            String bedNumberData = "";
                        if(_modelData.getBedNumber() != null){
                          bedNumberData = _modelData.getBedNumber().toString();
                          values.put("`bedNumber`", bedNumberData);
                        }
                                  
                                
                                                            String opdCodeData = "";
                        if(_modelData.getOpdCode() != null){
                          opdCodeData = _modelData.getOpdCode().toString();
                          values.put("`opdCode`", opdCodeData);
                        }
                                  
                                
                                                            double opdNumberData;
                        opdNumberData = (double)_modelData.getOpdNumber();
                        values.put("`opdNumber`", opdNumberData);
                                  
                                
                                                            String opdTokenNumberData = "";
                        if(_modelData.getOpdTokenNumber() != null){
                          opdTokenNumberData = _modelData.getOpdTokenNumber().toString();
                          values.put("`opdTokenNumber`", opdTokenNumberData);
                        }
                                  
                                
                                                            String addedByData = "";
                        if(_modelData.getAddedBy() != null){
                          addedByData = _modelData.getAddedBy().toString();
                          values.put("`addedBy`", addedByData);
                        }
                                  
                                
                                                            int isDocumentScannedData = 0;
                        if(_modelData.getIsDocumentScanned()){
                          isDocumentScannedData = 1;
                        }else{
                          isDocumentScannedData = 0;
                        }
                        values.put("`isDocumentScanned`", isDocumentScannedData);
                                  
                                
                                                            int isRepeatCustomerData = 0;
                        if(_modelData.getIsRepeatCustomer()){
                          isRepeatCustomerData = 1;
                        }else{
                          isRepeatCustomerData = 0;
                        }
                        values.put("`isRepeatCustomer`", isRepeatCustomerData);
                                  
                                
                                                            int isFollowUpData = 0;
                        if(_modelData.getIsFollowUp()){
                          isFollowUpData = 1;
                        }else{
                          isFollowUpData = 0;
                        }
                        values.put("`isFollowUp`", isFollowUpData);
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String lastFollowUpDateData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getLastFollowUpDate");
                              if(method.invoke(_modelData) != null){
                                //lastFollowUpDateData = _modelData.getLastFollowUpDate().toString();
                                lastFollowUpDateData = (String) method.invoke(_modelData);
                                values.put("`lastFollowUpDate`", lastFollowUpDateData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            double actualFollowUpData;
                        actualFollowUpData = (double)_modelData.getActualFollowUp();
                        values.put("`actualFollowUp`", actualFollowUpData);
                                  
                                
                                                            double consultationFeesData;
                        consultationFeesData = (double)_modelData.getConsultationFees();
                        values.put("`consultationFees`", consultationFeesData);
                                  
                                
                                                            double followUpFeesData;
                        followUpFeesData = (double)_modelData.getFollowUpFees();
                        values.put("`followUpFees`", followUpFeesData);
                                  
                                
                                                            double followUpDaysData;
                        followUpDaysData = (double)_modelData.getFollowUpDays();
                        values.put("`followUpDays`", followUpDaysData);
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String nextFollowUpDateData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getNextFollowUpDate");
                              if(method.invoke(_modelData) != null){
                                //nextFollowUpDateData = _modelData.getNextFollowUpDate().toString();
                                nextFollowUpDateData = (String) method.invoke(_modelData);
                                values.put("`nextFollowUpDate`", nextFollowUpDateData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            int isNewData = 0;
                        if(_modelData.getIsNew()){
                          isNewData = 1;
                        }else{
                          isNewData = 0;
                        }
                        values.put("`isNew`", isNewData);
                                  
                                
                                                            int isFlaggedData = 0;
                        if(_modelData.getIsFlagged()){
                          isFlaggedData = 1;
                        }else{
                          isFlaggedData = 0;
                        }
                        values.put("`isFlagged`", isFlaggedData);
                                  
                                
                                                            String flaggedForData = "";
                        if(_modelData.getFlaggedFor() != null){
                          flaggedForData = _modelData.getFlaggedFor().toString();
                          values.put("`flaggedFor`", flaggedForData);
                        }
                                  
                                
                                                            String pincodeNumberData = "";
                        if(_modelData.getPincodeNumber() != null){
                          pincodeNumberData = _modelData.getPincodeNumber().toString();
                          values.put("`pincodeNumber`", pincodeNumberData);
                        }
                                  
                                
                                                            String hashObjectData = "";
                        if(_modelData.getHashObject() != null){
                          hashObjectData = _modelData.getHashObject().toString();
                          values.put("`hashObject`", hashObjectData);
                        }
                                  
                                
                                                            String patientSecurityOfflineData = "";
                        if(_modelData.getPatientSecurityOffline() != null){
                          patientSecurityOfflineData = _modelData.getPatientSecurityOffline().toString();
                          values.put("`patientSecurityOffline`", patientSecurityOfflineData);
                        }
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String idData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getId");
                              if(method.invoke(_modelData) != null){
                                //idData = _modelData.getId().toString();
                                idData = (String) method.invoke(_modelData);
                                values.put("`id`", idData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String patientIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getPatientId");
                              if(method.invoke(_modelData) != null){
                                //patientIdData = _modelData.getPatientId().toString();
                                patientIdData = (String) method.invoke(_modelData);
                                values.put("`patientId`", patientIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String aadharIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getAadharId");
                              if(method.invoke(_modelData) != null){
                                //aadharIdData = _modelData.getAadharId().toString();
                                aadharIdData = (String) method.invoke(_modelData);
                                values.put("`aadharId`", aadharIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String hospitalIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getHospitalId");
                              if(method.invoke(_modelData) != null){
                                //hospitalIdData = _modelData.getHospitalId().toString();
                                hospitalIdData = (String) method.invoke(_modelData);
                                values.put("`hospitalId`", hospitalIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String ipdBedLogIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getIpdBedLogId");
                              if(method.invoke(_modelData) != null){
                                //ipdBedLogIdData = _modelData.getIpdBedLogId().toString();
                                ipdBedLogIdData = (String) method.invoke(_modelData);
                                values.put("`ipdBedLogId`", ipdBedLogIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String ipdBedIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getIpdBedId");
                              if(method.invoke(_modelData) != null){
                                //ipdBedIdData = _modelData.getIpdBedId().toString();
                                ipdBedIdData = (String) method.invoke(_modelData);
                                values.put("`ipdBedId`", ipdBedIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String opdTokenLogIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getOpdTokenLogId");
                              if(method.invoke(_modelData) != null){
                                //opdTokenLogIdData = _modelData.getOpdTokenLogId().toString();
                                opdTokenLogIdData = (String) method.invoke(_modelData);
                                values.put("`opdTokenLogId`", opdTokenLogIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String patientSecurityIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getPatientSecurityId");
                              if(method.invoke(_modelData) != null){
                                //patientSecurityIdData = _modelData.getPatientSecurityId().toString();
                                patientSecurityIdData = (String) method.invoke(_modelData);
                                values.put("`patientSecurityId`", patientSecurityIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String hospitalUserIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getHospitalUserId");
                              if(method.invoke(_modelData) != null){
                                //hospitalUserIdData = _modelData.getHospitalUserId().toString();
                                hospitalUserIdData = (String) method.invoke(_modelData);
                                values.put("`hospitalUserId`", hospitalUserIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String stateIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getStateId");
                              if(method.invoke(_modelData) != null){
                                //stateIdData = _modelData.getStateId().toString();
                                stateIdData = (String) method.invoke(_modelData);
                                values.put("`stateId`", stateIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String pincodeIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getPincodeId");
                              if(method.invoke(_modelData) != null){
                                //pincodeIdData = _modelData.getPincodeId().toString();
                                pincodeIdData = (String) method.invoke(_modelData);
                                values.put("`pincodeId`", pincodeIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String talukIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getTalukId");
                              if(method.invoke(_modelData) != null){
                                //talukIdData = _modelData.getTalukId().toString();
                                talukIdData = (String) method.invoke(_modelData);
                                values.put("`talukId`", talukIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String districtIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getDistrictId");
                              if(method.invoke(_modelData) != null){
                                //districtIdData = _modelData.getDistrictId().toString();
                                districtIdData = (String) method.invoke(_modelData);
                                values.put("`districtId`", districtIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   PatientGroup get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("PatientGroup", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        PatientGroupRepository repo = restAdapter.createRepository(PatientGroupRepository.class);
                        repo.addStorage(context);
                        return (PatientGroup)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
                }

            } else {
                return null;
            }
        } else {
            return null;
        }

    } //get__db




    // Getting single cont
    public   PatientGroup get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`PatientGroup`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        PatientGroupRepository repo = restAdapter.createRepository(PatientGroupRepository.class);
                        repo.addStorage(context);
                        return (PatientGroup)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
                }

            } else {
                return null;
            }
        } else {
            return null;
        }

    } //get__db




    private HashMap<String, Object> parseCursor(Cursor cursor ){
      HashMap<String, Object> hashMap = new HashMap<>();

                      
                                                            String addedData = "";
                        if(cursor.getString(0) != null){
                          addedData = cursor.getString(0);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(1) != null){
                          updatedData = cursor.getString(1);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String unique_numberData = "";
                        if(cursor.getString(2) != null){
                          unique_numberData = cursor.getString(2);
                          if(unique_numberData != null){
                            unique_numberData = (String)unique_numberData;
                            hashMap.put("unique_number", unique_numberData);
                          }
                        }
                                                
                                
                                                            String patientContactNumberData = "";
                        if(cursor.getString(3) != null){
                          patientContactNumberData = cursor.getString(3);
                          if(patientContactNumberData != null){
                            patientContactNumberData = (String)patientContactNumberData;
                            hashMap.put("patientContactNumber", patientContactNumberData);
                          }
                        }
                                                
                                
                                                            String nameData = "";
                        if(cursor.getString(4) != null){
                          nameData = cursor.getString(4);
                          if(nameData != null){
                            nameData = (String)nameData;
                            hashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            boolean lamaData = false;
                        int templamaData = cursor.getInt(5);
                        if( templamaData > 0){
                          lamaData = true;
                        }else{
                          lamaData = false;
                        }
                        hashMap.put("lama", lamaData);
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(6) != null){
                          statusData = cursor.getString(6);
                          if(statusData != null){
                            statusData = (String)statusData;
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            boolean hasDischargedData = false;
                        int temphasDischargedData = cursor.getInt(7);
                        if( temphasDischargedData > 0){
                          hasDischargedData = true;
                        }else{
                          hasDischargedData = false;
                        }
                        hashMap.put("hasDischarged", hasDischargedData);
                                                
                                
                                                            boolean hasConsultedData = false;
                        int temphasConsultedData = cursor.getInt(8);
                        if( temphasConsultedData > 0){
                          hasConsultedData = true;
                        }else{
                          hasConsultedData = false;
                        }
                        hashMap.put("hasConsulted", hasConsultedData);
                                                
                                
                                                            String facilityData = "";
                        if(cursor.getString(9) != null){
                          facilityData = cursor.getString(9);
                          if(facilityData != null){
                            facilityData = (String)facilityData;
                            hashMap.put("facility", facilityData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> relationLogsData = new HashMap<>();
                        if(cursor.getString(10) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           relationLogsData = gson.fromJson(cursor.getString(10), Map.class);
                          if(relationLogsData != null){
                            relationLogsData = (Map<String, Object>)relationLogsData;
                            hashMap.put("relationLogs", relationLogsData);
                          }
                        }
                                                
                                
                                                            String diagnosisData = "";
                        if(cursor.getString(11) != null){
                          diagnosisData = cursor.getString(11);
                          if(diagnosisData != null){
                            diagnosisData = (String)diagnosisData;
                            hashMap.put("diagnosis", diagnosisData);
                          }
                        }
                                                
                                
                                                            String admittedOnData = "";
                        if(cursor.getString(12) != null){
                          admittedOnData = cursor.getString(12);
                          if(admittedOnData != null){
                            admittedOnData = (String)admittedOnData;
                            hashMap.put("admittedOn", admittedOnData);
                          }
                        }
                                                
                                
                                                            String dischargedOnData = "";
                        if(cursor.getString(13) != null){
                          dischargedOnData = cursor.getString(13);
                          if(dischargedOnData != null){
                            dischargedOnData = (String)dischargedOnData;
                            hashMap.put("dischargedOn", dischargedOnData);
                          }
                        }
                                                
                                
                                                            String consultedOnData = "";
                        if(cursor.getString(14) != null){
                          consultedOnData = cursor.getString(14);
                          if(consultedOnData != null){
                            consultedOnData = (String)consultedOnData;
                            hashMap.put("consultedOn", consultedOnData);
                          }
                        }
                                                
                                
                                  DataList<Map<String, Object>> patientOtherContactNumberData = new DataList<>();
                  if(cursor.getString(15) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    patientOtherContactNumberData = gson.fromJson(cursor.getString(15), DataList.class);
                    if(patientOtherContactNumberData != null){
                      patientOtherContactNumberData = (DataList<Map<String, Object>>)patientOtherContactNumberData;
                      hashMap.put("patientOtherContactNumber", patientOtherContactNumberData);
                    }
                  }
                            
                                
                                                            boolean flaggedInSameHospitalData = false;
                        int tempflaggedInSameHospitalData = cursor.getInt(16);
                        if( tempflaggedInSameHospitalData > 0){
                          flaggedInSameHospitalData = true;
                        }else{
                          flaggedInSameHospitalData = false;
                        }
                        hashMap.put("flaggedInSameHospital", flaggedInSameHospitalData);
                                                
                                
                                                            String bedNumberData = "";
                        if(cursor.getString(17) != null){
                          bedNumberData = cursor.getString(17);
                          if(bedNumberData != null){
                            bedNumberData = (String)bedNumberData;
                            hashMap.put("bedNumber", bedNumberData);
                          }
                        }
                                                
                                
                                                            String opdCodeData = "";
                        if(cursor.getString(18) != null){
                          opdCodeData = cursor.getString(18);
                          if(opdCodeData != null){
                            opdCodeData = (String)opdCodeData;
                            hashMap.put("opdCode", opdCodeData);
                          }
                        }
                                                
                                
                                                            double opdNumberData = (double)0;
                          opdNumberData = cursor.getInt(19);
                          opdNumberData = (double)opdNumberData;
                          hashMap.put("opdNumber", opdNumberData);


                                                
                                
                                                            String opdTokenNumberData = "";
                        if(cursor.getString(20) != null){
                          opdTokenNumberData = cursor.getString(20);
                          if(opdTokenNumberData != null){
                            opdTokenNumberData = (String)opdTokenNumberData;
                            hashMap.put("opdTokenNumber", opdTokenNumberData);
                          }
                        }
                                                
                                
                                                            String addedByData = "";
                        if(cursor.getString(21) != null){
                          addedByData = cursor.getString(21);
                          if(addedByData != null){
                            addedByData = (String)addedByData;
                            hashMap.put("addedBy", addedByData);
                          }
                        }
                                                
                                
                                                            boolean isDocumentScannedData = false;
                        int tempisDocumentScannedData = cursor.getInt(22);
                        if( tempisDocumentScannedData > 0){
                          isDocumentScannedData = true;
                        }else{
                          isDocumentScannedData = false;
                        }
                        hashMap.put("isDocumentScanned", isDocumentScannedData);
                                                
                                
                                                            boolean isRepeatCustomerData = false;
                        int tempisRepeatCustomerData = cursor.getInt(23);
                        if( tempisRepeatCustomerData > 0){
                          isRepeatCustomerData = true;
                        }else{
                          isRepeatCustomerData = false;
                        }
                        hashMap.put("isRepeatCustomer", isRepeatCustomerData);
                                                
                                
                                                            boolean isFollowUpData = false;
                        int tempisFollowUpData = cursor.getInt(24);
                        if( tempisFollowUpData > 0){
                          isFollowUpData = true;
                        }else{
                          isFollowUpData = false;
                        }
                        hashMap.put("isFollowUp", isFollowUpData);
                                                
                                
                                                            String lastFollowUpDateData = "";
                        if(cursor.getString(25) != null){
                          lastFollowUpDateData = cursor.getString(25);
                          if(lastFollowUpDateData != null){
                            lastFollowUpDateData = lastFollowUpDateData.toString();
                            hashMap.put("lastFollowUpDate", lastFollowUpDateData);
                          }
                        }
                                                
                                
                                                            double actualFollowUpData = (double)0;
                          actualFollowUpData = cursor.getInt(26);
                          actualFollowUpData = (double)actualFollowUpData;
                          hashMap.put("actualFollowUp", actualFollowUpData);


                                                
                                
                                                            double consultationFeesData = (double)0;
                          consultationFeesData = cursor.getInt(27);
                          consultationFeesData = (double)consultationFeesData;
                          hashMap.put("consultationFees", consultationFeesData);


                                                
                                
                                                            double followUpFeesData = (double)0;
                          followUpFeesData = cursor.getInt(28);
                          followUpFeesData = (double)followUpFeesData;
                          hashMap.put("followUpFees", followUpFeesData);


                                                
                                
                                                            double followUpDaysData = (double)0;
                          followUpDaysData = cursor.getInt(29);
                          followUpDaysData = (double)followUpDaysData;
                          hashMap.put("followUpDays", followUpDaysData);


                                                
                                
                                                            String nextFollowUpDateData = "";
                        if(cursor.getString(30) != null){
                          nextFollowUpDateData = cursor.getString(30);
                          if(nextFollowUpDateData != null){
                            nextFollowUpDateData = nextFollowUpDateData.toString();
                            hashMap.put("nextFollowUpDate", nextFollowUpDateData);
                          }
                        }
                                                
                                
                                                            boolean isNewData = false;
                        int tempisNewData = cursor.getInt(31);
                        if( tempisNewData > 0){
                          isNewData = true;
                        }else{
                          isNewData = false;
                        }
                        hashMap.put("isNew", isNewData);
                                                
                                
                                                            boolean isFlaggedData = false;
                        int tempisFlaggedData = cursor.getInt(32);
                        if( tempisFlaggedData > 0){
                          isFlaggedData = true;
                        }else{
                          isFlaggedData = false;
                        }
                        hashMap.put("isFlagged", isFlaggedData);
                                                
                                
                                                            String flaggedForData = "";
                        if(cursor.getString(33) != null){
                          flaggedForData = cursor.getString(33);
                          if(flaggedForData != null){
                            flaggedForData = (String)flaggedForData;
                            hashMap.put("flaggedFor", flaggedForData);
                          }
                        }
                                                
                                
                                                            String pincodeNumberData = "";
                        if(cursor.getString(34) != null){
                          pincodeNumberData = cursor.getString(34);
                          if(pincodeNumberData != null){
                            pincodeNumberData = (String)pincodeNumberData;
                            hashMap.put("pincodeNumber", pincodeNumberData);
                          }
                        }
                                                
                                
                                                            String hashObjectData = "";
                        if(cursor.getString(35) != null){
                          hashObjectData = cursor.getString(35);
                          if(hashObjectData != null){
                            hashObjectData = (String)hashObjectData;
                            hashMap.put("hashObject", hashObjectData);
                          }
                        }
                                                
                                
                                                            String patientSecurityOfflineData = "";
                        if(cursor.getString(36) != null){
                          patientSecurityOfflineData = cursor.getString(36);
                          if(patientSecurityOfflineData != null){
                            patientSecurityOfflineData = (String)patientSecurityOfflineData;
                            hashMap.put("patientSecurityOffline", patientSecurityOfflineData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(37) != null){
                          idData = cursor.getString(37);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String patientIdData = "";
                        if(cursor.getString(38) != null){
                          patientIdData = cursor.getString(38);
                          if(patientIdData != null){
                            patientIdData = patientIdData.toString();
                            hashMap.put("patientId", patientIdData);
                          }
                        }
                                                
                                
                                                            String aadharIdData = "";
                        if(cursor.getString(39) != null){
                          aadharIdData = cursor.getString(39);
                          if(aadharIdData != null){
                            aadharIdData = aadharIdData.toString();
                            hashMap.put("aadharId", aadharIdData);
                          }
                        }
                                                
                                
                                                            String hospitalIdData = "";
                        if(cursor.getString(40) != null){
                          hospitalIdData = cursor.getString(40);
                          if(hospitalIdData != null){
                            hospitalIdData = hospitalIdData.toString();
                            hashMap.put("hospitalId", hospitalIdData);
                          }
                        }
                                                
                                
                                                            String ipdBedLogIdData = "";
                        if(cursor.getString(41) != null){
                          ipdBedLogIdData = cursor.getString(41);
                          if(ipdBedLogIdData != null){
                            ipdBedLogIdData = ipdBedLogIdData.toString();
                            hashMap.put("ipdBedLogId", ipdBedLogIdData);
                          }
                        }
                                                
                                
                                                            String ipdBedIdData = "";
                        if(cursor.getString(42) != null){
                          ipdBedIdData = cursor.getString(42);
                          if(ipdBedIdData != null){
                            ipdBedIdData = ipdBedIdData.toString();
                            hashMap.put("ipdBedId", ipdBedIdData);
                          }
                        }
                                                
                                
                                                            String opdTokenLogIdData = "";
                        if(cursor.getString(43) != null){
                          opdTokenLogIdData = cursor.getString(43);
                          if(opdTokenLogIdData != null){
                            opdTokenLogIdData = opdTokenLogIdData.toString();
                            hashMap.put("opdTokenLogId", opdTokenLogIdData);
                          }
                        }
                                                
                                
                                                            String patientSecurityIdData = "";
                        if(cursor.getString(44) != null){
                          patientSecurityIdData = cursor.getString(44);
                          if(patientSecurityIdData != null){
                            patientSecurityIdData = patientSecurityIdData.toString();
                            hashMap.put("patientSecurityId", patientSecurityIdData);
                          }
                        }
                                                
                                
                                                            String hospitalUserIdData = "";
                        if(cursor.getString(45) != null){
                          hospitalUserIdData = cursor.getString(45);
                          if(hospitalUserIdData != null){
                            hospitalUserIdData = hospitalUserIdData.toString();
                            hashMap.put("hospitalUserId", hospitalUserIdData);
                          }
                        }
                                                
                                
                                                            String stateIdData = "";
                        if(cursor.getString(46) != null){
                          stateIdData = cursor.getString(46);
                          if(stateIdData != null){
                            stateIdData = stateIdData.toString();
                            hashMap.put("stateId", stateIdData);
                          }
                        }
                                                
                                
                                                            String pincodeIdData = "";
                        if(cursor.getString(47) != null){
                          pincodeIdData = cursor.getString(47);
                          if(pincodeIdData != null){
                            pincodeIdData = pincodeIdData.toString();
                            hashMap.put("pincodeId", pincodeIdData);
                          }
                        }
                                                
                                
                                                            String talukIdData = "";
                        if(cursor.getString(48) != null){
                          talukIdData = cursor.getString(48);
                          if(talukIdData != null){
                            talukIdData = talukIdData.toString();
                            hashMap.put("talukId", talukIdData);
                          }
                        }
                                                
                                
                                                            String districtIdData = "";
                        if(cursor.getString(49) != null){
                          districtIdData = cursor.getString(49);
                          if(districtIdData != null){
                            districtIdData = districtIdData.toString();
                            hashMap.put("districtId", districtIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, PatientGroup model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<PatientGroup>  getAll__db() {
        DataList<PatientGroup> modelList = new DataList<PatientGroup>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `PatientGroup`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<PatientGroup>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PatientGroupRepository repo = restAdapter.createRepository(PatientGroupRepository.class);
                    repo.addStorage(context);
                    modelList.add((PatientGroup)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<PatientGroup>) modelList;
    }



    public String getWhereQuery(HashMap<String, Object> whereKeyValue){
        //Prepare where key value
        String where = "";
        if(whereKeyValue.size() > 0){
            where = where +  " WHERE ";
        }
        where = where + getWhere(whereKeyValue);
        return where;
    }


     //Now also accept gt and lt values
     public String getWhere(HashMap<String, Object> whereKeyValue){
        String where = "";
        int i=0;
        for(String key : whereKeyValue.keySet()){
            Object o = whereKeyValue.get(key);
            DataList<String> keyValue = getKeyValue(key, o);
            if(keyValue != null){
                if(keyValue.size() != 0){
                    String returnedKey = keyValue.get(0);
                    try{
                        int value = Integer.parseInt(keyValue.get(1));
                        if(i==0){
                            if(returnedKey.equals("gt")){
                                where = where + " `" + key + "` > "+ value + "";
                            }else if(returnedKey.equals("lt")){
                                where = where + " `" + key + "` < "+ value + "";
                            }else{
                                where = where + " `" + key + "` = "+ value + "";
                            }
                        }else{
                            if(returnedKey.equals("gt")){
                                where = where + " AND `" + key + "` > "+ value + "";
                            }else if(returnedKey.equals("lt")){
                                where = where + " AND `" + key + "` < "+ value + "";
                            }else{
                                where = where + " AND `" + key + "` = "+ value + "";
                            }
                        }

                    }catch(Exception e){
                      String value = keyValue.get(1);
                      if(i==0){
                          if(returnedKey.equals("gt")){
                              where = where + " `" + key + "` > '"+ value + "'";
                          }else if(returnedKey.equals("lt")){
                              where = where + " `" + key + "` < '"+ value + "'";
                          }else{
                              where = where + " `" + key + "` = '"+ value + "'";
                          }
                      }else{
                          if(returnedKey.equals("gt")){
                              where = where + " AND `" + key + "` > '"+ value + "'";
                          }else if(returnedKey.equals("lt")){
                              where = where + " AND `" + key + "` < '"+ value + "'";
                          }else{
                              where = where + " AND `" + key + "` = '"+ value + "'";
                          }
                      }

                    }

                    i++;
                }
            }
        }
        return where;
     }




    //first argument is key and second is value
    public DataList<String> getKeyValue(String key, Object keyValue){
        DataList<String> returnVal = new DataList<>();
        try{
            //Converting to nested hashmap
            HashMap<String, Object> value = (HashMap<String, Object>)keyValue;
            for(String key_ : value.keySet()){
                Object o = value.get(key_);
                returnVal.add(key_);
                returnVal.add(o.toString());
                return returnVal;
            }
        }catch(Exception e){
            returnVal.add(key);
            returnVal.add(keyValue.toString());
            return returnVal;
        }
        return null;
    }



    // Getting All Data where
    public DataList<PatientGroup>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<PatientGroup>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<PatientGroup> modelList = new DataList<PatientGroup>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `PatientGroup` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM PatientGroup " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM PatientGroup " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<PatientGroup>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PatientGroupRepository repo = restAdapter.createRepository(PatientGroupRepository.class);
                    repo.addStorage(context);
                    modelList.add((PatientGroup)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<PatientGroup>) modelList;
    }



    // Getting All Data where
    public DataList<PatientGroup>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
        return getAll__db(whereKeyValue, null,  limit, skip);
    }





    /**
     * Check count of database.
     * @param whereKeyValue
     * @param orderBy
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(orderBy != null){
            countQuery = "SELECT  * FROM `PatientGroup` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `PatientGroup` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `PatientGroup` " + whereQuery + " LIMIT -1 OFFSET " + skip;
            }
        }


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }



    /**
     * Check count of database.
     * @param whereKeyValue
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, int limit, int skip){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(limit != 0){
            countQuery = "SELECT  * FROM `PatientGroup` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `PatientGroup` " + whereQuery + " LIMIT -1 OFFSET " + skip;
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    /**
     * Check count of database.
     * @param whereKeyValue
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue){
            return count__db(whereKeyValue, 0, 0);
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final HashMap<String, Object> whereKeyValue) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                String where = getWhere(whereKeyValue);
                // updating row
                db.update("`PatientGroup`", values, "_DATA_UPDATED = 1 AND " + where, null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("`PatientGroup`", "_DATA_UPDATED = 0 AND " + where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
    //   new Thread(new Runnable() {
    //         @Override
    //         public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("`PatientGroup`", where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
        //     }
        // }).start();
    }







    // Getting All Data where
    public DataList<PatientGroup>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<PatientGroup> modelList = new DataList<PatientGroup>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `PatientGroup` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<PatientGroup>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PatientGroupRepository repo = restAdapter.createRepository(PatientGroupRepository.class);
                    repo.addStorage(context);
                    modelList.add((PatientGroup)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<PatientGroup>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM `PatientGroup` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("`PatientGroup`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("`PatientGroup`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final PatientGroup _modelData ){
    //   new Thread(new Runnable(){
    //     @Override
    //     public void run(){
          SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
          db.beginTransaction();
          ContentValues values = getContentValues(_modelData);
          String where = getWhere(whereKeyValue);
          db.update("`PatientGroup`", values, where, null);
          db.setTransactionSuccessful();
          db.endTransaction();
          //db.close();
    //     }

    //   }).start();
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
    //   new Thread(new Runnable() {
    //         @Override
    //         public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();
    }



    // Updating single contact
    public void update__db(final String id,   final PatientGroup _modelData) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(_modelData);
                // updating row
                db.update("`PatientGroup`", values, "id = ?",
                        new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("`PatientGroup`", values, "_DATA_UPDATED = 1", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }


    // Delete Old data
    public void deleteOldData__db() {
    //   new Thread(new Runnable() {
    //         @Override
    //         public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("`PatientGroup`", "_DATA_UPDATED = 0", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }


    // Getting contacts Count
    public int count__db() {
        String countQuery = "SELECT  * FROM `" + TABLE + "`";
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }


    /**
     * Get count by Id..
     * @param id
     * @return
     */
    public int count__db(String id){
        String countQuery = "SELECT  * FROM `" + TABLE  + "` WHERE ID='" + id+"'";
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }



    // Deleting by id
    public void delete__db(final String id) {
    //   new Thread(new Runnable() {
    //         @Override
    //         public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, KEY_ID + " = ?",
                new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();
    }

    public void reset__db(){
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE,null,null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }

}
