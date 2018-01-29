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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Patient;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class PatientDb{

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

  public PatientDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Patient";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Patient _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`Patient`", null, values);
    }





    public ContentValues getContentValues(Patient _modelData){
      ContentValues values = new ContentValues();
                       
                                                            String unique_numberData = "";
                        if(_modelData.getUnique_number() != null){
                          unique_numberData = _modelData.getUnique_number().toString();
                          values.put("`unique_number`", unique_numberData);
                        }
                                  
                                
                                                            String nameData = "";
                        if(_modelData.getName() != null){
                          nameData = _modelData.getName().toString();
                          values.put("`name`", nameData);
                        }
                                  
                                
                                                            String fatherNameData = "";
                        if(_modelData.getFatherName() != null){
                          fatherNameData = _modelData.getFatherName().toString();
                          values.put("`fatherName`", fatherNameData);
                        }
                                  
                                
                                                            String profilePicData = "";
                        if(_modelData.getProfilePic() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          profilePicData = gson.toJson(_modelData.getProfilePic(), HashMap.class);
                          values.put("`profilePic`", profilePicData);
                        }
                                  
                                
                                                            String idProofData = "";
                        if(_modelData.getIdProof() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          idProofData = gson.toJson(_modelData.getIdProof(), HashMap.class);
                          values.put("`idProof`", idProofData);
                        }
                                  
                                
                                                            double yearOfBirthData;
                        yearOfBirthData = (double)_modelData.getYearOfBirth();
                        values.put("`yearOfBirth`", yearOfBirthData);
                                  
                                
                                                            String aadharLastNumberData = "";
                        if(_modelData.getAadharLastNumber() != null){
                          aadharLastNumberData = _modelData.getAadharLastNumber().toString();
                          values.put("`aadharLastNumber`", aadharLastNumberData);
                        }
                                  
                                
                                                            String patientContactNumberData = "";
                        if(_modelData.getPatientContactNumber() != null){
                          patientContactNumberData = _modelData.getPatientContactNumber().toString();
                          values.put("`patientContactNumber`", patientContactNumberData);
                        }
                                  
                                
                                                            String emailData = "";
                        if(_modelData.getEmail() != null){
                          emailData = _modelData.getEmail().toString();
                          values.put("`email`", emailData);
                        }
                                  
                                
                                  String patientOtherAddressData = "";
                  if(_modelData.getPatientOtherAddress() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    patientOtherAddressData = gson.toJson(_modelData.getPatientOtherAddress(), DataList.class);
                    values.put("`patientOtherAddress`", patientOtherAddressData);
                  }
              
                                
                                  String patientOtherContactNumberData = "";
                  if(_modelData.getPatientOtherContactNumber() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    patientOtherContactNumberData = gson.toJson(_modelData.getPatientOtherContactNumber(), DataList.class);
                    values.put("`patientOtherContactNumber`", patientOtherContactNumberData);
                  }
              
                                
                                  String otherEmailData = "";
                  if(_modelData.getOtherEmail() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    otherEmailData = gson.toJson(_modelData.getOtherEmail(), DataList.class);
                    values.put("`otherEmail`", otherEmailData);
                  }
              
                                
                                                            String genderData = "";
                        if(_modelData.getGender() != null){
                          genderData = _modelData.getGender().toString();
                          values.put("`gender`", genderData);
                        }
                                  
                                
                                                            String relationLogsData = "";
                        if(_modelData.getRelationLogs() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          relationLogsData = gson.toJson(_modelData.getRelationLogs(), HashMap.class);
                          values.put("`relationLogs`", relationLogsData);
                        }
                                  
                                
                                                            String statusData = "";
                        if(_modelData.getStatus() != null){
                          statusData = _modelData.getStatus().toString();
                          values.put("`status`", statusData);
                        }
                                  
                                
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
                                  
                                
                                                            String ageData = "";
                        if(_modelData.getAge() != null){
                          ageData = _modelData.getAge().toString();
                          values.put("`age`", ageData);
                        }
                                  
                                
                                  String relatedPatientsData = "";
                  if(_modelData.getRelatedPatients() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    relatedPatientsData = gson.toJson(_modelData.getRelatedPatients(), DataList.class);
                    values.put("`relatedPatients`", relatedPatientsData);
                  }
              
                                
                                                            String addressData = "";
                        if(_modelData.getAddress() != null){
                          addressData = _modelData.getAddress().toString();
                          values.put("`address`", addressData);
                        }
                                  
                                
                                  String otherAddressData = "";
                  if(_modelData.getOtherAddress() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    otherAddressData = gson.toJson(_modelData.getOtherAddress(), DataList.class);
                    values.put("`otherAddress`", otherAddressData);
                  }
              
                                
                                                            String pincodeNumberData = "";
                        if(_modelData.getPincodeNumber() != null){
                          pincodeNumberData = _modelData.getPincodeNumber().toString();
                          values.put("`pincodeNumber`", pincodeNumberData);
                        }
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String realmData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getRealm");
                              if(method.invoke(_modelData) != null){
                                //realmData = _modelData.getRealm().toString();
                                realmData = (String) method.invoke(_modelData);
                                values.put("`realm`", realmData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String usernameData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getUsername");
                              if(method.invoke(_modelData) != null){
                                //usernameData = _modelData.getUsername().toString();
                                usernameData = (String) method.invoke(_modelData);
                                values.put("`username`", usernameData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String passwordData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getPassword");
                              if(method.invoke(_modelData) != null){
                                //passwordData = _modelData.getPassword().toString();
                                passwordData = (String) method.invoke(_modelData);
                                values.put("`password`", passwordData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String credentialsData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getCredentials");
                              if(method.invoke(_modelData) != null){
                                //credentialsData = _modelData.getCredentials().toString();
                                credentialsData = (String) method.invoke(_modelData);
                                values.put("`credentials`", credentialsData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String challengesData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getChallenges");
                              if(method.invoke(_modelData) != null){
                                //challengesData = _modelData.getChallenges().toString();
                                challengesData = (String) method.invoke(_modelData);
                                values.put("`challenges`", challengesData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String emailVerifiedData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getEmailVerified");
                              if(method.invoke(_modelData) != null){
                                //emailVerifiedData = _modelData.getEmailVerified().toString();
                                emailVerifiedData = (String) method.invoke(_modelData);
                                values.put("`emailVerified`", emailVerifiedData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String verificationTokenData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getVerificationToken");
                              if(method.invoke(_modelData) != null){
                                //verificationTokenData = _modelData.getVerificationToken().toString();
                                verificationTokenData = (String) method.invoke(_modelData);
                                values.put("`verificationToken`", verificationTokenData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String createdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getCreated");
                              if(method.invoke(_modelData) != null){
                                //createdData = _modelData.getCreated().toString();
                                createdData = (String) method.invoke(_modelData);
                                values.put("`created`", createdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String lastUpdatedData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getLastUpdated");
                              if(method.invoke(_modelData) != null){
                                //lastUpdatedData = _modelData.getLastUpdated().toString();
                                lastUpdatedData = (String) method.invoke(_modelData);
                                values.put("`lastUpdated`", lastUpdatedData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
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
                        String mergedWithIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getMergedWithId");
                              if(method.invoke(_modelData) != null){
                                //mergedWithIdData = _modelData.getMergedWithId().toString();
                                mergedWithIdData = (String) method.invoke(_modelData);
                                values.put("`mergedWithId`", mergedWithIdData);
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
    public   Patient get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Patient", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        PatientRepository repo = restAdapter.createRepository(PatientRepository.class);
                        repo.addStorage(context);
                        return (Patient)repo.createObject(hashMap);
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
    public   Patient get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`Patient`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        PatientRepository repo = restAdapter.createRepository(PatientRepository.class);
                        repo.addStorage(context);
                        return (Patient)repo.createObject(hashMap);
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

                      
                                                            String unique_numberData = "";
                        if(cursor.getString(0) != null){
                          unique_numberData = cursor.getString(0);
                          if(unique_numberData != null){
                            unique_numberData = (String)unique_numberData;
                            hashMap.put("unique_number", unique_numberData);
                          }
                        }
                                                
                                
                                                            String nameData = "";
                        if(cursor.getString(1) != null){
                          nameData = cursor.getString(1);
                          if(nameData != null){
                            nameData = (String)nameData;
                            hashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            String fatherNameData = "";
                        if(cursor.getString(2) != null){
                          fatherNameData = cursor.getString(2);
                          if(fatherNameData != null){
                            fatherNameData = (String)fatherNameData;
                            hashMap.put("fatherName", fatherNameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> profilePicData = new HashMap<>();
                        if(cursor.getString(3) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           profilePicData = gson.fromJson(cursor.getString(3), Map.class);
                          if(profilePicData != null){
                            profilePicData = (Map<String, Object>)profilePicData;
                            hashMap.put("profilePic", profilePicData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> idProofData = new HashMap<>();
                        if(cursor.getString(4) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           idProofData = gson.fromJson(cursor.getString(4), Map.class);
                          if(idProofData != null){
                            idProofData = (Map<String, Object>)idProofData;
                            hashMap.put("idProof", idProofData);
                          }
                        }
                                                
                                
                                                            double yearOfBirthData = (double)0;
                          yearOfBirthData = cursor.getInt(5);
                          yearOfBirthData = (double)yearOfBirthData;
                          hashMap.put("yearOfBirth", yearOfBirthData);


                                                
                                
                                                            String aadharLastNumberData = "";
                        if(cursor.getString(6) != null){
                          aadharLastNumberData = cursor.getString(6);
                          if(aadharLastNumberData != null){
                            aadharLastNumberData = (String)aadharLastNumberData;
                            hashMap.put("aadharLastNumber", aadharLastNumberData);
                          }
                        }
                                                
                                
                                                            String patientContactNumberData = "";
                        if(cursor.getString(7) != null){
                          patientContactNumberData = cursor.getString(7);
                          if(patientContactNumberData != null){
                            patientContactNumberData = (String)patientContactNumberData;
                            hashMap.put("patientContactNumber", patientContactNumberData);
                          }
                        }
                                                
                                
                                                            String emailData = "";
                        if(cursor.getString(8) != null){
                          emailData = cursor.getString(8);
                          if(emailData != null){
                            emailData = (String)emailData;
                            hashMap.put("email", emailData);
                          }
                        }
                                                
                                
                                  DataList<Map<String, Object>> patientOtherAddressData = new DataList<>();
                  if(cursor.getString(9) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    patientOtherAddressData = gson.fromJson(cursor.getString(9), DataList.class);
                    if(patientOtherAddressData != null){
                      patientOtherAddressData = (DataList<Map<String, Object>>)patientOtherAddressData;
                      hashMap.put("patientOtherAddress", patientOtherAddressData);
                    }
                  }
                            
                                
                                  DataList<Map<String, Object>> patientOtherContactNumberData = new DataList<>();
                  if(cursor.getString(10) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    patientOtherContactNumberData = gson.fromJson(cursor.getString(10), DataList.class);
                    if(patientOtherContactNumberData != null){
                      patientOtherContactNumberData = (DataList<Map<String, Object>>)patientOtherContactNumberData;
                      hashMap.put("patientOtherContactNumber", patientOtherContactNumberData);
                    }
                  }
                            
                                
                                  DataList<Map<String, Object>> otherEmailData = new DataList<>();
                  if(cursor.getString(11) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    otherEmailData = gson.fromJson(cursor.getString(11), DataList.class);
                    if(otherEmailData != null){
                      otherEmailData = (DataList<Map<String, Object>>)otherEmailData;
                      hashMap.put("otherEmail", otherEmailData);
                    }
                  }
                            
                                
                                                            String genderData = "";
                        if(cursor.getString(12) != null){
                          genderData = cursor.getString(12);
                          if(genderData != null){
                            genderData = (String)genderData;
                            hashMap.put("gender", genderData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> relationLogsData = new HashMap<>();
                        if(cursor.getString(13) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           relationLogsData = gson.fromJson(cursor.getString(13), Map.class);
                          if(relationLogsData != null){
                            relationLogsData = (Map<String, Object>)relationLogsData;
                            hashMap.put("relationLogs", relationLogsData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(14) != null){
                          statusData = cursor.getString(14);
                          if(statusData != null){
                            statusData = (String)statusData;
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(15) != null){
                          addedData = cursor.getString(15);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(16) != null){
                          updatedData = cursor.getString(16);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String ageData = "";
                        if(cursor.getString(17) != null){
                          ageData = cursor.getString(17);
                          if(ageData != null){
                            ageData = (String)ageData;
                            hashMap.put("age", ageData);
                          }
                        }
                                                
                                
                                  DataList<Object> relatedPatientsData = new DataList<>();
                  if(cursor.getString(18) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    relatedPatientsData = gson.fromJson(cursor.getString(18), DataList.class);
                    if(relatedPatientsData != null){
                      relatedPatientsData = (DataList<Object>)relatedPatientsData;
                      hashMap.put("relatedPatients", relatedPatientsData);
                    }
                  }
                            
                                
                                                            String addressData = "";
                        if(cursor.getString(19) != null){
                          addressData = cursor.getString(19);
                          if(addressData != null){
                            addressData = (String)addressData;
                            hashMap.put("address", addressData);
                          }
                        }
                                                
                                
                                  DataList<Map<String, Object>> otherAddressData = new DataList<>();
                  if(cursor.getString(20) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    otherAddressData = gson.fromJson(cursor.getString(20), DataList.class);
                    if(otherAddressData != null){
                      otherAddressData = (DataList<Map<String, Object>>)otherAddressData;
                      hashMap.put("otherAddress", otherAddressData);
                    }
                  }
                            
                                
                                                            String pincodeNumberData = "";
                        if(cursor.getString(21) != null){
                          pincodeNumberData = cursor.getString(21);
                          if(pincodeNumberData != null){
                            pincodeNumberData = (String)pincodeNumberData;
                            hashMap.put("pincodeNumber", pincodeNumberData);
                          }
                        }
                                                
                                
                                                            String realmData = "";
                        if(cursor.getString(22) != null){
                          realmData = cursor.getString(22);
                          if(realmData != null){
                            realmData = realmData.toString();
                            hashMap.put("realm", realmData);
                          }
                        }
                                                
                                
                                                            String usernameData = "";
                        if(cursor.getString(23) != null){
                          usernameData = cursor.getString(23);
                          if(usernameData != null){
                            usernameData = usernameData.toString();
                            hashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            String passwordData = "";
                        if(cursor.getString(24) != null){
                          passwordData = cursor.getString(24);
                          if(passwordData != null){
                            passwordData = passwordData.toString();
                            hashMap.put("password", passwordData);
                          }
                        }
                                                
                                
                                                            String credentialsData = "";
                        if(cursor.getString(25) != null){
                          credentialsData = cursor.getString(25);
                          if(credentialsData != null){
                            credentialsData = credentialsData.toString();
                            hashMap.put("credentials", credentialsData);
                          }
                        }
                                                
                                
                                                            String challengesData = "";
                        if(cursor.getString(26) != null){
                          challengesData = cursor.getString(26);
                          if(challengesData != null){
                            challengesData = challengesData.toString();
                            hashMap.put("challenges", challengesData);
                          }
                        }
                                                
                                
                                                            String emailVerifiedData = "";
                        if(cursor.getString(27) != null){
                          emailVerifiedData = cursor.getString(27);
                          if(emailVerifiedData != null){
                            emailVerifiedData = emailVerifiedData.toString();
                            hashMap.put("emailVerified", emailVerifiedData);
                          }
                        }
                                                
                                
                                                            String verificationTokenData = "";
                        if(cursor.getString(28) != null){
                          verificationTokenData = cursor.getString(28);
                          if(verificationTokenData != null){
                            verificationTokenData = verificationTokenData.toString();
                            hashMap.put("verificationToken", verificationTokenData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(29) != null){
                          createdData = cursor.getString(29);
                          if(createdData != null){
                            createdData = createdData.toString();
                            hashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String lastUpdatedData = "";
                        if(cursor.getString(30) != null){
                          lastUpdatedData = cursor.getString(30);
                          if(lastUpdatedData != null){
                            lastUpdatedData = lastUpdatedData.toString();
                            hashMap.put("lastUpdated", lastUpdatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(31) != null){
                          idData = cursor.getString(31);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String mergedWithIdData = "";
                        if(cursor.getString(32) != null){
                          mergedWithIdData = cursor.getString(32);
                          if(mergedWithIdData != null){
                            mergedWithIdData = mergedWithIdData.toString();
                            hashMap.put("mergedWithId", mergedWithIdData);
                          }
                        }
                                                
                                
                                                            String aadharIdData = "";
                        if(cursor.getString(33) != null){
                          aadharIdData = cursor.getString(33);
                          if(aadharIdData != null){
                            aadharIdData = aadharIdData.toString();
                            hashMap.put("aadharId", aadharIdData);
                          }
                        }
                                                
                                
                                                            String stateIdData = "";
                        if(cursor.getString(34) != null){
                          stateIdData = cursor.getString(34);
                          if(stateIdData != null){
                            stateIdData = stateIdData.toString();
                            hashMap.put("stateId", stateIdData);
                          }
                        }
                                                
                                
                                                            String pincodeIdData = "";
                        if(cursor.getString(35) != null){
                          pincodeIdData = cursor.getString(35);
                          if(pincodeIdData != null){
                            pincodeIdData = pincodeIdData.toString();
                            hashMap.put("pincodeId", pincodeIdData);
                          }
                        }
                                                
                                
                                                            String talukIdData = "";
                        if(cursor.getString(36) != null){
                          talukIdData = cursor.getString(36);
                          if(talukIdData != null){
                            talukIdData = talukIdData.toString();
                            hashMap.put("talukId", talukIdData);
                          }
                        }
                                                
                                
                                                            String districtIdData = "";
                        if(cursor.getString(37) != null){
                          districtIdData = cursor.getString(37);
                          if(districtIdData != null){
                            districtIdData = districtIdData.toString();
                            hashMap.put("districtId", districtIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Patient model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Patient>  getAll__db() {
        DataList<Patient> modelList = new DataList<Patient>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Patient`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Patient>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PatientRepository repo = restAdapter.createRepository(PatientRepository.class);
                    repo.addStorage(context);
                    modelList.add((Patient)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Patient>) modelList;
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
    public DataList<Patient>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Patient>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Patient> modelList = new DataList<Patient>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Patient` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Patient " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Patient " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Patient>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PatientRepository repo = restAdapter.createRepository(PatientRepository.class);
                    repo.addStorage(context);
                    modelList.add((Patient)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<Patient>) modelList;
    }



    // Getting All Data where
    public DataList<Patient>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `Patient` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Patient` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Patient` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `Patient` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Patient` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
            //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
            ContentValues values = new ContentValues();
            values.put("_DATA_UPDATED", 0);
            String where = getWhere(whereKeyValue);
            // updating row
            db.update("`Patient`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Patient`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Patient`", where , null);
    }







    // Getting All Data where
    public DataList<Patient>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Patient> modelList = new DataList<Patient>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Patient` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Patient>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    PatientRepository repo = restAdapter.createRepository(PatientRepository.class);
                    repo.addStorage(context);
                    modelList.add((Patient)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<Patient>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `Patient` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
      Cursor cursor = db.rawQuery(countQuery, null);
      int count = cursor.getCount();
      cursor.close();
      return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Patient`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Patient`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Patient _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`Patient`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final Patient _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`Patient`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Patient`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Patient`", "_DATA_UPDATED = 0", null);
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
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, KEY_ID + " = ?",
      new String[] { id });
    }

    public void reset__db(){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE,null,null);
    }

}
