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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Customer;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class CustomerDb{

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

  public CustomerDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Customer";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Customer _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`Customer`", null, values);
    }





    public ContentValues getContentValues(Customer _modelData){
      ContentValues values = new ContentValues();
                       
                                                            String addedData = "";
                        if(_modelData.getAdded() != null){
                          addedData = _modelData.getAdded().toString();
                          values.put("`added`", addedData);
                        }
                                  
                                
                                                            String idData = "";
                        if(_modelData.getId() != null){
                          idData = _modelData.getId().toString();
                          values.put("`id`", idData);
                        }
                                  
                                
                                  String interestedCatListData = "";
                  if(_modelData.getInterestedCatList() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    interestedCatListData = gson.toJson(_modelData.getInterestedCatList(), DataList.class);
                    values.put("`interestedCatList`", interestedCatListData);
                  }
              
                                
                                                            String updatedData = "";
                        if(_modelData.getUpdated() != null){
                          updatedData = _modelData.getUpdated().toString();
                          values.put("`updated`", updatedData);
                        }
                                  
                                
                                                            String nameData = "";
                        if(_modelData.getName() != null){
                          nameData = _modelData.getName().toString();
                          values.put("`name`", nameData);
                        }
                                  
                                
                                                            String mobileNumberData = "";
                        if(_modelData.getMobileNumber() != null){
                          mobileNumberData = _modelData.getMobileNumber().toString();
                          values.put("`mobileNumber`", mobileNumberData);
                        }
                                  
                                
                                                            String altContactNumberData = "";
                        if(_modelData.getAltContactNumber() != null){
                          altContactNumberData = _modelData.getAltContactNumber().toString();
                          values.put("`altContactNumber`", altContactNumberData);
                        }
                                  
                                
                                                            String whatsappNumberData = "";
                        if(_modelData.getWhatsappNumber() != null){
                          whatsappNumberData = _modelData.getWhatsappNumber().toString();
                          values.put("`whatsappNumber`", whatsappNumberData);
                        }
                                  
                                
                                                            String storeNameData = "";
                        if(_modelData.getStoreName() != null){
                          storeNameData = _modelData.getStoreName().toString();
                          values.put("`storeName`", storeNameData);
                        }
                                  
                                
                                                            String registeredFirmNameData = "";
                        if(_modelData.getRegisteredFirmName() != null){
                          registeredFirmNameData = _modelData.getRegisteredFirmName().toString();
                          values.put("`registeredFirmName`", registeredFirmNameData);
                        }
                                  
                                
                                                            String imageData = "";
                        if(_modelData.getImage() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          imageData = gson.toJson(_modelData.getImage(), HashMap.class);
                          values.put("`image`", imageData);
                        }
                                  
                                
                                                            String emailData = "";
                        if(_modelData.getEmail() != null){
                          emailData = _modelData.getEmail().toString();
                          values.put("`email`", emailData);
                        }
                                  
                                
                                                            String liscenceTypeData = "";
                        if(_modelData.getLiscenceType() != null){
                          liscenceTypeData = _modelData.getLiscenceType().toString();
                          values.put("`liscenceType`", liscenceTypeData);
                        }
                                  
                                
                                                            String gstNumberData = "";
                        if(_modelData.getGstNumber() != null){
                          gstNumberData = _modelData.getGstNumber().toString();
                          values.put("`gstNumber`", gstNumberData);
                        }
                                  
                                
                                                            String shopAddressData = "";
                        if(_modelData.getShopAddress() != null){
                          shopAddressData = _modelData.getShopAddress().toString();
                          values.put("`shopAddress`", shopAddressData);
                        }
                                  
                                
                                                            String pincodeData = "";
                        if(_modelData.getPincode() != null){
                          pincodeData = _modelData.getPincode().toString();
                          values.put("`pincode`", pincodeData);
                        }
                                  
                                
                                                            String cityData = "";
                        if(_modelData.getCity() != null){
                          cityData = _modelData.getCity().toString();
                          values.put("`city`", cityData);
                        }
                                  
                                
                                                            String stateData = "";
                        if(_modelData.getState() != null){
                          stateData = _modelData.getState().toString();
                          values.put("`state`", stateData);
                        }
                                  
                                
                                                            String totalPurchaseData = "";
                        if(_modelData.getTotalPurchase() != null){
                          totalPurchaseData = _modelData.getTotalPurchase().toString();
                          values.put("`totalPurchase`", totalPurchaseData);
                        }
                                  
                                
                                                            String verificationStatusData = "";
                        if(_modelData.getVerificationStatus() != null){
                          verificationStatusData = _modelData.getVerificationStatus().toString();
                          values.put("`verificationStatus`", verificationStatusData);
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
                        String employeeIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getEmployeeId");
                              if(method.invoke(_modelData) != null){
                                //employeeIdData = _modelData.getEmployeeId().toString();
                                employeeIdData = (String) method.invoke(_modelData);
                                values.put("`employeeId`", employeeIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String businessTypeIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getBusinessTypeId");
                              if(method.invoke(_modelData) != null){
                                //businessTypeIdData = _modelData.getBusinessTypeId().toString();
                                businessTypeIdData = (String) method.invoke(_modelData);
                                values.put("`businessTypeId`", businessTypeIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String industryIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getIndustryId");
                              if(method.invoke(_modelData) != null){
                                //industryIdData = _modelData.getIndustryId().toString();
                                industryIdData = (String) method.invoke(_modelData);
                                values.put("`industryId`", industryIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Customer get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Customer", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        CustomerRepository repo = restAdapter.createRepository(CustomerRepository.class);
                        repo.addStorage(context);
                        return (Customer)repo.createObject(hashMap);
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
    public   Customer get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`Customer`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        CustomerRepository repo = restAdapter.createRepository(CustomerRepository.class);
                        repo.addStorage(context);
                        return (Customer)repo.createObject(hashMap);
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
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(1) != null){
                          idData = cursor.getString(1);
                          if(idData != null){
                            idData = (String)idData;
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                  DataList<String> interestedCatListData = new DataList<>();
                  if(cursor.getString(2) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    interestedCatListData = gson.fromJson(cursor.getString(2), DataList.class);
                    if(interestedCatListData != null){
                      interestedCatListData = (DataList<String>)interestedCatListData;
                      hashMap.put("interestedCatList", interestedCatListData);
                    }
                  }
                            
                                
                                                            String updatedData = "";
                        if(cursor.getString(3) != null){
                          updatedData = cursor.getString(3);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
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
                                                
                                
                                                            String mobileNumberData = "";
                        if(cursor.getString(5) != null){
                          mobileNumberData = cursor.getString(5);
                          if(mobileNumberData != null){
                            mobileNumberData = (String)mobileNumberData;
                            hashMap.put("mobileNumber", mobileNumberData);
                          }
                        }
                                                
                                
                                                            String altContactNumberData = "";
                        if(cursor.getString(6) != null){
                          altContactNumberData = cursor.getString(6);
                          if(altContactNumberData != null){
                            altContactNumberData = (String)altContactNumberData;
                            hashMap.put("altContactNumber", altContactNumberData);
                          }
                        }
                                                
                                
                                                            String whatsappNumberData = "";
                        if(cursor.getString(7) != null){
                          whatsappNumberData = cursor.getString(7);
                          if(whatsappNumberData != null){
                            whatsappNumberData = (String)whatsappNumberData;
                            hashMap.put("whatsappNumber", whatsappNumberData);
                          }
                        }
                                                
                                
                                                            String storeNameData = "";
                        if(cursor.getString(8) != null){
                          storeNameData = cursor.getString(8);
                          if(storeNameData != null){
                            storeNameData = (String)storeNameData;
                            hashMap.put("storeName", storeNameData);
                          }
                        }
                                                
                                
                                                            String registeredFirmNameData = "";
                        if(cursor.getString(9) != null){
                          registeredFirmNameData = cursor.getString(9);
                          if(registeredFirmNameData != null){
                            registeredFirmNameData = (String)registeredFirmNameData;
                            hashMap.put("registeredFirmName", registeredFirmNameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> imageData = new HashMap<>();
                        if(cursor.getString(10) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           imageData = gson.fromJson(cursor.getString(10), Map.class);
                          if(imageData != null){
                            imageData = (Map<String, Object>)imageData;
                            hashMap.put("image", imageData);
                          }
                        }
                                                
                                
                                                            String emailData = "";
                        if(cursor.getString(11) != null){
                          emailData = cursor.getString(11);
                          if(emailData != null){
                            emailData = (String)emailData;
                            hashMap.put("email", emailData);
                          }
                        }
                                                
                                
                                                            String liscenceTypeData = "";
                        if(cursor.getString(12) != null){
                          liscenceTypeData = cursor.getString(12);
                          if(liscenceTypeData != null){
                            liscenceTypeData = (String)liscenceTypeData;
                            hashMap.put("liscenceType", liscenceTypeData);
                          }
                        }
                                                
                                
                                                            String gstNumberData = "";
                        if(cursor.getString(13) != null){
                          gstNumberData = cursor.getString(13);
                          if(gstNumberData != null){
                            gstNumberData = (String)gstNumberData;
                            hashMap.put("gstNumber", gstNumberData);
                          }
                        }
                                                
                                
                                                            String shopAddressData = "";
                        if(cursor.getString(14) != null){
                          shopAddressData = cursor.getString(14);
                          if(shopAddressData != null){
                            shopAddressData = (String)shopAddressData;
                            hashMap.put("shopAddress", shopAddressData);
                          }
                        }
                                                
                                
                                                            String pincodeData = "";
                        if(cursor.getString(15) != null){
                          pincodeData = cursor.getString(15);
                          if(pincodeData != null){
                            pincodeData = (String)pincodeData;
                            hashMap.put("pincode", pincodeData);
                          }
                        }
                                                
                                
                                                            String cityData = "";
                        if(cursor.getString(16) != null){
                          cityData = cursor.getString(16);
                          if(cityData != null){
                            cityData = (String)cityData;
                            hashMap.put("city", cityData);
                          }
                        }
                                                
                                
                                                            String stateData = "";
                        if(cursor.getString(17) != null){
                          stateData = cursor.getString(17);
                          if(stateData != null){
                            stateData = (String)stateData;
                            hashMap.put("state", stateData);
                          }
                        }
                                                
                                
                                                            String totalPurchaseData = "";
                        if(cursor.getString(18) != null){
                          totalPurchaseData = cursor.getString(18);
                          if(totalPurchaseData != null){
                            totalPurchaseData = (String)totalPurchaseData;
                            hashMap.put("totalPurchase", totalPurchaseData);
                          }
                        }
                                                
                                
                                                            String verificationStatusData = "";
                        if(cursor.getString(19) != null){
                          verificationStatusData = cursor.getString(19);
                          if(verificationStatusData != null){
                            verificationStatusData = (String)verificationStatusData;
                            hashMap.put("verificationStatus", verificationStatusData);
                          }
                        }
                                                
                                
                                                            String realmData = "";
                        if(cursor.getString(20) != null){
                          realmData = cursor.getString(20);
                          if(realmData != null){
                            realmData = realmData.toString();
                            hashMap.put("realm", realmData);
                          }
                        }
                                                
                                
                                                            String usernameData = "";
                        if(cursor.getString(21) != null){
                          usernameData = cursor.getString(21);
                          if(usernameData != null){
                            usernameData = usernameData.toString();
                            hashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            String passwordData = "";
                        if(cursor.getString(22) != null){
                          passwordData = cursor.getString(22);
                          if(passwordData != null){
                            passwordData = passwordData.toString();
                            hashMap.put("password", passwordData);
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
                                                
                                
                                                            String employeeIdData = "";
                        if(cursor.getString(30) != null){
                          employeeIdData = cursor.getString(30);
                          if(employeeIdData != null){
                            employeeIdData = employeeIdData.toString();
                            hashMap.put("employeeId", employeeIdData);
                          }
                        }
                                                
                                
                                                            String businessTypeIdData = "";
                        if(cursor.getString(31) != null){
                          businessTypeIdData = cursor.getString(31);
                          if(businessTypeIdData != null){
                            businessTypeIdData = businessTypeIdData.toString();
                            hashMap.put("businessTypeId", businessTypeIdData);
                          }
                        }
                                                
                                
                                                            String industryIdData = "";
                        if(cursor.getString(32) != null){
                          industryIdData = cursor.getString(32);
                          if(industryIdData != null){
                            industryIdData = industryIdData.toString();
                            hashMap.put("industryId", industryIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Customer model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Customer>  getAll__db() {
        DataList<Customer> modelList = new DataList<Customer>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Customer`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Customer>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    CustomerRepository repo = restAdapter.createRepository(CustomerRepository.class);
                    repo.addStorage(context);
                    modelList.add((Customer)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Customer>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<Customer> getAll__lazy(final int limit, final int skip, ObjectCallback<Customer> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final CustomerRepository repo = restAdapter.createRepository(CustomerRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<Customer>() {
            @Override
            public Customer create(Cursor cursor, int index) {
                Customer data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (Customer)repo.createObject(hashMap);
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
                    selectQuery = "SELECT  * FROM `Customer` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM Customer " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM Customer " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public Customer get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Customer", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        CustomerRepository repo = restAdapter.createRepository(CustomerRepository.class);
                        repo.addStorage(context);
                        return (Customer)repo.createObject(hashMap);
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
    public DataList<Customer>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Customer>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Customer> modelList = new DataList<Customer>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Customer` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Customer " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Customer " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Customer>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    CustomerRepository repo = restAdapter.createRepository(CustomerRepository.class);
                    repo.addStorage(context);
                    modelList.add((Customer)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<Customer>) modelList;
    }



    // Getting All Data where
    public DataList<Customer>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `Customer` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Customer` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Customer` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `Customer` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Customer` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            db.update("`Customer`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Customer`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Customer`", where , null);
    }







    // Getting All Data where
    public DataList<Customer>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Customer> modelList = new DataList<Customer>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Customer` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Customer>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    CustomerRepository repo = restAdapter.createRepository(CustomerRepository.class);
                    repo.addStorage(context);
                    modelList.add((Customer)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<Customer>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `Customer` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
      db.update("`Customer`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Customer`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Customer _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`Customer`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final Customer _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`Customer`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Customer`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Customer`", "_DATA_UPDATED = 0", null);
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
