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


import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.GetUpdatedQuery;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.ObjectCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.OnParseCursor;
import com.androidsdk.snaphy.snaphyandroidsdk.list.LazyList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Employee;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class EmployeeDb{

    // All Static variables
    SnaphyRestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";
    private Context context;
    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;



    public SQLiteDatabase getInstance(){
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
        return db;
    }

  public EmployeeDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Employee";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Employee _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`Employee`", null, values);
    }





    public ContentValues getContentValues(Employee _modelData){
      ContentValues values = new ContentValues();
                       
                                                            String firstNameData = "";
                        if(_modelData.getFirstName() != null){
                          firstNameData = _modelData.getFirstName().toString();
                          values.put("`firstName`", firstNameData);
                        }
                                  
                                
                                                            String lastNameData = "";
                        if(_modelData.getLastName() != null){
                          lastNameData = _modelData.getLastName().toString();
                          values.put("`lastName`", lastNameData);
                        }
                                  
                                
                                                            String cityData = "";
                        if(_modelData.getCity() != null){
                          cityData = _modelData.getCity().toString();
                          values.put("`city`", cityData);
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
                                  
                                
                                                            String emailData = "";
                        if(_modelData.getEmail() != null){
                          emailData = _modelData.getEmail().toString();
                          values.put("`email`", emailData);
                        }
                                  
                                
                                                            String passwordData = "";
                        if(_modelData.getPassword() != null){
                          passwordData = _modelData.getPassword().toString();
                          values.put("`password`", passwordData);
                        }
                                  
                                
                                                            String typeData = "";
                        if(_modelData.getType() != null){
                          typeData = _modelData.getType().toString();
                          values.put("`type`", typeData);
                        }
                                  
                                
                                                            String mobileNumberData = "";
                        if(_modelData.getMobileNumber() != null){
                          mobileNumberData = _modelData.getMobileNumber().toString();
                          values.put("`mobileNumber`", mobileNumberData);
                        }
                                  
                                
                                                            String franchiseCodeData = "";
                        if(_modelData.getFranchiseCode() != null){
                          franchiseCodeData = _modelData.getFranchiseCode().toString();
                          values.put("`franchiseCode`", franchiseCodeData);
                        }
                                  
                                
                                                            String franchiseAddressData = "";
                        if(_modelData.getFranchiseAddress() != null){
                          franchiseAddressData = _modelData.getFranchiseAddress().toString();
                          values.put("`franchiseAddress`", franchiseAddressData);
                        }
                                  
                                
                                                            String areaData = "";
                        if(_modelData.getArea() != null){
                          areaData = _modelData.getArea().toString();
                          values.put("`area`", areaData);
                        }
                                  
                                
                                                            String gtinNumberData = "";
                        if(_modelData.getGtinNumber() != null){
                          gtinNumberData = _modelData.getGtinNumber().toString();
                          values.put("`gtinNumber`", gtinNumberData);
                        }
                                  
                                
                                                            String cinNumberData = "";
                        if(_modelData.getCinNumber() != null){
                          cinNumberData = _modelData.getCinNumber().toString();
                          values.put("`cinNumber`", cinNumberData);
                        }
                                  
                                
                                                            String accountNameData = "";
                        if(_modelData.getAccountName() != null){
                          accountNameData = _modelData.getAccountName().toString();
                          values.put("`accountName`", accountNameData);
                        }
                                  
                                
                                                            String accountNumberData = "";
                        if(_modelData.getAccountNumber() != null){
                          accountNumberData = _modelData.getAccountNumber().toString();
                          values.put("`accountNumber`", accountNumberData);
                        }
                                  
                                
                                                            String bankNameData = "";
                        if(_modelData.getBankName() != null){
                          bankNameData = _modelData.getBankName().toString();
                          values.put("`bankName`", bankNameData);
                        }
                                  
                                
                                                            String branchNameData = "";
                        if(_modelData.getBranchName() != null){
                          branchNameData = _modelData.getBranchName().toString();
                          values.put("`branchName`", branchNameData);
                        }
                                  
                                
                                                            String bankAddressData = "";
                        if(_modelData.getBankAddress() != null){
                          bankAddressData = _modelData.getBankAddress().toString();
                          values.put("`bankAddress`", bankAddressData);
                        }
                                  
                                
                                                            String ifscCodeData = "";
                        if(_modelData.getIfscCode() != null){
                          ifscCodeData = _modelData.getIfscCode().toString();
                          values.put("`ifscCode`", ifscCodeData);
                        }
                                  
                                
                                  String franchiseOrderSettingsData = "";
                  if(_modelData.getFranchiseOrderSettings() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    franchiseOrderSettingsData = gson.toJson(_modelData.getFranchiseOrderSettings(), DataList.class);
                    values.put("`franchiseOrderSettings`", franchiseOrderSettingsData);
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
                        String statusData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getStatus");
                              if(method.invoke(_modelData) != null){
                                //statusData = _modelData.getStatus().toString();
                                statusData = (String) method.invoke(_modelData);
                                values.put("`status`", statusData);
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
                        String cityIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getCityId");
                              if(method.invoke(_modelData) != null){
                                //cityIdData = _modelData.getCityId().toString();
                                cityIdData = (String) method.invoke(_modelData);
                                values.put("`cityId`", cityIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String areaIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getAreaId");
                              if(method.invoke(_modelData) != null){
                                //areaIdData = _modelData.getAreaId().toString();
                                areaIdData = (String) method.invoke(_modelData);
                                values.put("`areaId`", areaIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Employee get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Employee", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
                        repo.addStorage(context);
                        return (Employee)repo.createObject(hashMap);
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
    public   Employee get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`Employee`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
                        repo.addStorage(context);
                        return (Employee)repo.createObject(hashMap);
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

                      
                                                            String firstNameData = "";
                        if(cursor.getString(0) != null){
                          firstNameData = cursor.getString(0);
                          if(firstNameData != null){
                            firstNameData = (String)firstNameData;
                            hashMap.put("firstName", firstNameData);
                          }
                        }
                                                
                                
                                                            String lastNameData = "";
                        if(cursor.getString(1) != null){
                          lastNameData = cursor.getString(1);
                          if(lastNameData != null){
                            lastNameData = (String)lastNameData;
                            hashMap.put("lastName", lastNameData);
                          }
                        }
                                                
                                
                                                            String cityData = "";
                        if(cursor.getString(2) != null){
                          cityData = cursor.getString(2);
                          if(cityData != null){
                            cityData = (String)cityData;
                            hashMap.put("city", cityData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(3) != null){
                          addedData = cursor.getString(3);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(4) != null){
                          updatedData = cursor.getString(4);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String emailData = "";
                        if(cursor.getString(5) != null){
                          emailData = cursor.getString(5);
                          if(emailData != null){
                            emailData = (String)emailData;
                            hashMap.put("email", emailData);
                          }
                        }
                                                
                                
                                                            String passwordData = "";
                        if(cursor.getString(6) != null){
                          passwordData = cursor.getString(6);
                          if(passwordData != null){
                            passwordData = (String)passwordData;
                            hashMap.put("password", passwordData);
                          }
                        }
                                                
                                
                                                            String typeData = "";
                        if(cursor.getString(7) != null){
                          typeData = cursor.getString(7);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            String mobileNumberData = "";
                        if(cursor.getString(8) != null){
                          mobileNumberData = cursor.getString(8);
                          if(mobileNumberData != null){
                            mobileNumberData = (String)mobileNumberData;
                            hashMap.put("mobileNumber", mobileNumberData);
                          }
                        }
                                                
                                
                                                            String franchiseCodeData = "";
                        if(cursor.getString(9) != null){
                          franchiseCodeData = cursor.getString(9);
                          if(franchiseCodeData != null){
                            franchiseCodeData = (String)franchiseCodeData;
                            hashMap.put("franchiseCode", franchiseCodeData);
                          }
                        }
                                                
                                
                                                            String franchiseAddressData = "";
                        if(cursor.getString(10) != null){
                          franchiseAddressData = cursor.getString(10);
                          if(franchiseAddressData != null){
                            franchiseAddressData = (String)franchiseAddressData;
                            hashMap.put("franchiseAddress", franchiseAddressData);
                          }
                        }
                                                
                                
                                                            String areaData = "";
                        if(cursor.getString(11) != null){
                          areaData = cursor.getString(11);
                          if(areaData != null){
                            areaData = (String)areaData;
                            hashMap.put("area", areaData);
                          }
                        }
                                                
                                
                                                            String gtinNumberData = "";
                        if(cursor.getString(12) != null){
                          gtinNumberData = cursor.getString(12);
                          if(gtinNumberData != null){
                            gtinNumberData = (String)gtinNumberData;
                            hashMap.put("gtinNumber", gtinNumberData);
                          }
                        }
                                                
                                
                                                            String cinNumberData = "";
                        if(cursor.getString(13) != null){
                          cinNumberData = cursor.getString(13);
                          if(cinNumberData != null){
                            cinNumberData = (String)cinNumberData;
                            hashMap.put("cinNumber", cinNumberData);
                          }
                        }
                                                
                                
                                                            String accountNameData = "";
                        if(cursor.getString(14) != null){
                          accountNameData = cursor.getString(14);
                          if(accountNameData != null){
                            accountNameData = (String)accountNameData;
                            hashMap.put("accountName", accountNameData);
                          }
                        }
                                                
                                
                                                            String accountNumberData = "";
                        if(cursor.getString(15) != null){
                          accountNumberData = cursor.getString(15);
                          if(accountNumberData != null){
                            accountNumberData = (String)accountNumberData;
                            hashMap.put("accountNumber", accountNumberData);
                          }
                        }
                                                
                                
                                                            String bankNameData = "";
                        if(cursor.getString(16) != null){
                          bankNameData = cursor.getString(16);
                          if(bankNameData != null){
                            bankNameData = (String)bankNameData;
                            hashMap.put("bankName", bankNameData);
                          }
                        }
                                                
                                
                                                            String branchNameData = "";
                        if(cursor.getString(17) != null){
                          branchNameData = cursor.getString(17);
                          if(branchNameData != null){
                            branchNameData = (String)branchNameData;
                            hashMap.put("branchName", branchNameData);
                          }
                        }
                                                
                                
                                                            String bankAddressData = "";
                        if(cursor.getString(18) != null){
                          bankAddressData = cursor.getString(18);
                          if(bankAddressData != null){
                            bankAddressData = (String)bankAddressData;
                            hashMap.put("bankAddress", bankAddressData);
                          }
                        }
                                                
                                
                                                            String ifscCodeData = "";
                        if(cursor.getString(19) != null){
                          ifscCodeData = cursor.getString(19);
                          if(ifscCodeData != null){
                            ifscCodeData = (String)ifscCodeData;
                            hashMap.put("ifscCode", ifscCodeData);
                          }
                        }
                                                
                                
                                  DataList<Map<String, Object>> franchiseOrderSettingsData = new DataList<>();
                  if(cursor.getString(20) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    franchiseOrderSettingsData = gson.fromJson(cursor.getString(20), DataList.class);
                    if(franchiseOrderSettingsData != null){
                      franchiseOrderSettingsData = (DataList<Map<String, Object>>)franchiseOrderSettingsData;
                      hashMap.put("franchiseOrderSettings", franchiseOrderSettingsData);
                    }
                  }
                            
                                
                                                            String realmData = "";
                        if(cursor.getString(21) != null){
                          realmData = cursor.getString(21);
                          if(realmData != null){
                            realmData = realmData.toString();
                            hashMap.put("realm", realmData);
                          }
                        }
                                                
                                
                                                            String usernameData = "";
                        if(cursor.getString(22) != null){
                          usernameData = cursor.getString(22);
                          if(usernameData != null){
                            usernameData = usernameData.toString();
                            hashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            String credentialsData = "";
                        if(cursor.getString(23) != null){
                          credentialsData = cursor.getString(23);
                          if(credentialsData != null){
                            credentialsData = credentialsData.toString();
                            hashMap.put("credentials", credentialsData);
                          }
                        }
                                                
                                
                                                            String challengesData = "";
                        if(cursor.getString(24) != null){
                          challengesData = cursor.getString(24);
                          if(challengesData != null){
                            challengesData = challengesData.toString();
                            hashMap.put("challenges", challengesData);
                          }
                        }
                                                
                                
                                                            String emailVerifiedData = "";
                        if(cursor.getString(25) != null){
                          emailVerifiedData = cursor.getString(25);
                          if(emailVerifiedData != null){
                            emailVerifiedData = emailVerifiedData.toString();
                            hashMap.put("emailVerified", emailVerifiedData);
                          }
                        }
                                                
                                
                                                            String verificationTokenData = "";
                        if(cursor.getString(26) != null){
                          verificationTokenData = cursor.getString(26);
                          if(verificationTokenData != null){
                            verificationTokenData = verificationTokenData.toString();
                            hashMap.put("verificationToken", verificationTokenData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(27) != null){
                          statusData = cursor.getString(27);
                          if(statusData != null){
                            statusData = statusData.toString();
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(28) != null){
                          createdData = cursor.getString(28);
                          if(createdData != null){
                            createdData = createdData.toString();
                            hashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String lastUpdatedData = "";
                        if(cursor.getString(29) != null){
                          lastUpdatedData = cursor.getString(29);
                          if(lastUpdatedData != null){
                            lastUpdatedData = lastUpdatedData.toString();
                            hashMap.put("lastUpdated", lastUpdatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(30) != null){
                          idData = cursor.getString(30);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String cityIdData = "";
                        if(cursor.getString(31) != null){
                          cityIdData = cursor.getString(31);
                          if(cityIdData != null){
                            cityIdData = cityIdData.toString();
                            hashMap.put("cityId", cityIdData);
                          }
                        }
                                                
                                
                                                            String areaIdData = "";
                        if(cursor.getString(32) != null){
                          areaIdData = cursor.getString(32);
                          if(areaIdData != null){
                            areaIdData = areaIdData.toString();
                            hashMap.put("areaId", areaIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Employee model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Employee>  getAll__db() {
        DataList<Employee> modelList = new DataList<Employee>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Employee`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Employee>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
                    repo.addStorage(context);
                    modelList.add((Employee)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Employee>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<Employee> getAll__lazy(final int limit, final int skip, ObjectCallback<Employee> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<Employee>() {
            @Override
            public Employee create(Cursor cursor, int index) {
                Employee data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (Employee)repo.createObject(hashMap);
                return data;
            }
        }, callback, new LazyList.OnQueryChange(){
            @Override
            public String getUpdateQuery() {
                String orderBy = getUpdatedQuery.onOrderByChange();
                //Get Where Key Value..
                HashMap<String, Object> getWhereKeyValue = getUpdatedQuery.onQueryChange();

                String whereQuery = getWhereQuery(getWhereKeyValue);
                String selectQuery;
                if(orderBy != null){
                    selectQuery = "SELECT  * FROM `Employee` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM Employee " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM Employee " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public Employee get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Employee", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
                        repo.addStorage(context);
                        return (Employee)repo.createObject(hashMap);
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
    public DataList<Employee>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Employee>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Employee> modelList = new DataList<Employee>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Employee` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Employee " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Employee " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Employee>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
                    repo.addStorage(context);
                    modelList.add((Employee)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<Employee>) modelList;
    }



    // Getting All Data where
    public DataList<Employee>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `Employee` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Employee` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Employee` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `Employee` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Employee` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            db.update("`Employee`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Employee`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Employee`", where , null);
    }







    // Getting All Data where
    public DataList<Employee>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Employee> modelList = new DataList<Employee>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Employee` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Employee>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
                    repo.addStorage(context);
                    modelList.add((Employee)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<Employee>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `Employee` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
      db.update("`Employee`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Employee`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Employee _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`Employee`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final Employee _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`Employee`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Employee`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Employee`", "_DATA_UPDATED = 0", null);
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
