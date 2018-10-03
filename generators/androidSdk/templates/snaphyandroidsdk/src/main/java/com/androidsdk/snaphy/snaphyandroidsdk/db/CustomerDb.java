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
                       
                                                            String roadNameData = "";
                        if(_modelData.getRoadName() != null){
                          roadNameData = _modelData.getRoadName().toString();
                          values.put("`roadName`", roadNameData);
                        }
                                  
                                
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
                                  
                                
                                                            String emailData = "";
                        if(_modelData.getEmail() != null){
                          emailData = _modelData.getEmail().toString();
                          values.put("`email`", emailData);
                        }
                                  
                                
                                                            int isEmailVerifiedData = 0;
                        if(_modelData.getIsEmailVerified()){
                          isEmailVerifiedData = 1;
                        }else{
                          isEmailVerifiedData = 0;
                        }
                        values.put("`isEmailVerified`", isEmailVerifiedData);
                                  
                                
                                                            double discountData;
                        discountData = (double)_modelData.getDiscount();
                        values.put("`discount`", discountData);
                                  
                                
                                                            String collectionTypeData = "";
                        if(_modelData.getCollectionType() != null){
                          collectionTypeData = _modelData.getCollectionType().toString();
                          values.put("`collectionType`", collectionTypeData);
                        }
                                  
                                
                                                            String typeData = "";
                        if(_modelData.getType() != null){
                          typeData = _modelData.getType().toString();
                          values.put("`type`", typeData);
                        }
                                  
                                
                                                            String subscriptionTypeData = "";
                        if(_modelData.getSubscriptionType() != null){
                          subscriptionTypeData = _modelData.getSubscriptionType().toString();
                          values.put("`subscriptionType`", subscriptionTypeData);
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
                                  
                                
                                                            String timeData = "";
                        if(_modelData.getTime() != null){
                          timeData = _modelData.getTime().toString();
                          values.put("`time`", timeData);
                        }
                                  
                                
                                                            String addressData = "";
                        if(_modelData.getAddress() != null){
                          addressData = _modelData.getAddress().toString();
                          values.put("`address`", addressData);
                        }
                                  
                                
                                                            String productData = "";
                        if(_modelData.getProduct() != null){
                          productData = _modelData.getProduct().toString();
                          values.put("`product`", productData);
                        }
                                  
                                
                                                            double accountNumberData;
                        accountNumberData = (double)_modelData.getAccountNumber();
                        values.put("`accountNumber`", accountNumberData);
                                  
                                
                                                            String reset_startDateData = "";
                        if(_modelData.getReset_startDate() != null){
                          reset_startDateData = _modelData.getReset_startDate().toString();
                          values.put("`reset_startDate`", reset_startDateData);
                        }
                                  
                                
                                                            String subscription_startDateData = "";
                        if(_modelData.getSubscription_startDate() != null){
                          subscription_startDateData = _modelData.getSubscription_startDate().toString();
                          values.put("`subscription_startDate`", subscription_startDateData);
                        }
                                  
                                
                                                            String subscription_stopDateData = "";
                        if(_modelData.getSubscription_stopDate() != null){
                          subscription_stopDateData = _modelData.getSubscription_stopDate().toString();
                          values.put("`subscription_stopDate`", subscription_stopDateData);
                        }
                                  
                                
                                                            String subscription_timeData = "";
                        if(_modelData.getSubscription_time() != null){
                          subscription_timeData = _modelData.getSubscription_time().toString();
                          values.put("`subscription_time`", subscription_timeData);
                        }
                                  
                                
                                                            String phoneNumberData = "";
                        if(_modelData.getPhoneNumber() != null){
                          phoneNumberData = _modelData.getPhoneNumber().toString();
                          values.put("`phoneNumber`", phoneNumberData);
                        }
                                  
                                
                                                            String mobileNumberData = "";
                        if(_modelData.getMobileNumber() != null){
                          mobileNumberData = _modelData.getMobileNumber().toString();
                          values.put("`mobileNumber`", mobileNumberData);
                        }
                                  
                                
                                                            String commentData = "";
                        if(_modelData.getComment() != null){
                          commentData = _modelData.getComment().toString();
                          values.put("`comment`", commentData);
                        }
                                  
                                
                                                            double isOwingData;
                        isOwingData = (double)_modelData.getIsOwing();
                        values.put("`isOwing`", isOwingData);
                                  
                                
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

                      
                                                            String roadNameData = "";
                        if(cursor.getString(0) != null){
                          roadNameData = cursor.getString(0);
                          if(roadNameData != null){
                            roadNameData = (String)roadNameData;
                            hashMap.put("roadName", roadNameData);
                          }
                        }
                                                
                                
                                                            String firstNameData = "";
                        if(cursor.getString(1) != null){
                          firstNameData = cursor.getString(1);
                          if(firstNameData != null){
                            firstNameData = (String)firstNameData;
                            hashMap.put("firstName", firstNameData);
                          }
                        }
                                                
                                
                                                            String lastNameData = "";
                        if(cursor.getString(2) != null){
                          lastNameData = cursor.getString(2);
                          if(lastNameData != null){
                            lastNameData = (String)lastNameData;
                            hashMap.put("lastName", lastNameData);
                          }
                        }
                                                
                                
                                                            String emailData = "";
                        if(cursor.getString(3) != null){
                          emailData = cursor.getString(3);
                          if(emailData != null){
                            emailData = (String)emailData;
                            hashMap.put("email", emailData);
                          }
                        }
                                                
                                
                                                            boolean isEmailVerifiedData = false;
                        int tempisEmailVerifiedData = cursor.getInt(4);
                        if( tempisEmailVerifiedData > 0){
                          isEmailVerifiedData = true;
                        }else{
                          isEmailVerifiedData = false;
                        }
                        hashMap.put("isEmailVerified", isEmailVerifiedData);
                                                
                                
                                                            double discountData = (double)0;
                          discountData = cursor.getInt(5);
                          discountData = (double)discountData;
                          hashMap.put("discount", discountData);


                                                
                                
                                                            String collectionTypeData = "";
                        if(cursor.getString(6) != null){
                          collectionTypeData = cursor.getString(6);
                          if(collectionTypeData != null){
                            collectionTypeData = (String)collectionTypeData;
                            hashMap.put("collectionType", collectionTypeData);
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
                                                
                                
                                                            String subscriptionTypeData = "";
                        if(cursor.getString(8) != null){
                          subscriptionTypeData = cursor.getString(8);
                          if(subscriptionTypeData != null){
                            subscriptionTypeData = (String)subscriptionTypeData;
                            hashMap.put("subscriptionType", subscriptionTypeData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(9) != null){
                          addedData = cursor.getString(9);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(10) != null){
                          updatedData = cursor.getString(10);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String timeData = "";
                        if(cursor.getString(11) != null){
                          timeData = cursor.getString(11);
                          if(timeData != null){
                            timeData = (String)timeData;
                            hashMap.put("time", timeData);
                          }
                        }
                                                
                                
                                                            String addressData = "";
                        if(cursor.getString(12) != null){
                          addressData = cursor.getString(12);
                          if(addressData != null){
                            addressData = (String)addressData;
                            hashMap.put("address", addressData);
                          }
                        }
                                                
                                
                                                            String productData = "";
                        if(cursor.getString(13) != null){
                          productData = cursor.getString(13);
                          if(productData != null){
                            productData = (String)productData;
                            hashMap.put("product", productData);
                          }
                        }
                                                
                                
                                                            double accountNumberData = (double)0;
                          accountNumberData = cursor.getInt(14);
                          accountNumberData = (double)accountNumberData;
                          hashMap.put("accountNumber", accountNumberData);


                                                
                                
                                                            String reset_startDateData = "";
                        if(cursor.getString(15) != null){
                          reset_startDateData = cursor.getString(15);
                          if(reset_startDateData != null){
                            reset_startDateData = (String)reset_startDateData;
                            hashMap.put("reset_startDate", reset_startDateData);
                          }
                        }
                                                
                                
                                                            String subscription_startDateData = "";
                        if(cursor.getString(16) != null){
                          subscription_startDateData = cursor.getString(16);
                          if(subscription_startDateData != null){
                            subscription_startDateData = (String)subscription_startDateData;
                            hashMap.put("subscription_startDate", subscription_startDateData);
                          }
                        }
                                                
                                
                                                            String subscription_stopDateData = "";
                        if(cursor.getString(17) != null){
                          subscription_stopDateData = cursor.getString(17);
                          if(subscription_stopDateData != null){
                            subscription_stopDateData = (String)subscription_stopDateData;
                            hashMap.put("subscription_stopDate", subscription_stopDateData);
                          }
                        }
                                                
                                
                                                            String subscription_timeData = "";
                        if(cursor.getString(18) != null){
                          subscription_timeData = cursor.getString(18);
                          if(subscription_timeData != null){
                            subscription_timeData = (String)subscription_timeData;
                            hashMap.put("subscription_time", subscription_timeData);
                          }
                        }
                                                
                                
                                                            String phoneNumberData = "";
                        if(cursor.getString(19) != null){
                          phoneNumberData = cursor.getString(19);
                          if(phoneNumberData != null){
                            phoneNumberData = (String)phoneNumberData;
                            hashMap.put("phoneNumber", phoneNumberData);
                          }
                        }
                                                
                                
                                                            String mobileNumberData = "";
                        if(cursor.getString(20) != null){
                          mobileNumberData = cursor.getString(20);
                          if(mobileNumberData != null){
                            mobileNumberData = (String)mobileNumberData;
                            hashMap.put("mobileNumber", mobileNumberData);
                          }
                        }
                                                
                                
                                                            String commentData = "";
                        if(cursor.getString(21) != null){
                          commentData = cursor.getString(21);
                          if(commentData != null){
                            commentData = (String)commentData;
                            hashMap.put("comment", commentData);
                          }
                        }
                                                
                                
                                                            double isOwingData = (double)0;
                          isOwingData = cursor.getInt(22);
                          isOwingData = (double)isOwingData;
                          hashMap.put("isOwing", isOwingData);


                                                
                                
                                                            String realmData = "";
                        if(cursor.getString(23) != null){
                          realmData = cursor.getString(23);
                          if(realmData != null){
                            realmData = realmData.toString();
                            hashMap.put("realm", realmData);
                          }
                        }
                                                
                                
                                                            String usernameData = "";
                        if(cursor.getString(24) != null){
                          usernameData = cursor.getString(24);
                          if(usernameData != null){
                            usernameData = usernameData.toString();
                            hashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            String passwordData = "";
                        if(cursor.getString(25) != null){
                          passwordData = cursor.getString(25);
                          if(passwordData != null){
                            passwordData = passwordData.toString();
                            hashMap.put("password", passwordData);
                          }
                        }
                                                
                                
                                                            String credentialsData = "";
                        if(cursor.getString(26) != null){
                          credentialsData = cursor.getString(26);
                          if(credentialsData != null){
                            credentialsData = credentialsData.toString();
                            hashMap.put("credentials", credentialsData);
                          }
                        }
                                                
                                
                                                            String challengesData = "";
                        if(cursor.getString(27) != null){
                          challengesData = cursor.getString(27);
                          if(challengesData != null){
                            challengesData = challengesData.toString();
                            hashMap.put("challenges", challengesData);
                          }
                        }
                                                
                                
                                                            String emailVerifiedData = "";
                        if(cursor.getString(28) != null){
                          emailVerifiedData = cursor.getString(28);
                          if(emailVerifiedData != null){
                            emailVerifiedData = emailVerifiedData.toString();
                            hashMap.put("emailVerified", emailVerifiedData);
                          }
                        }
                                                
                                
                                                            String verificationTokenData = "";
                        if(cursor.getString(29) != null){
                          verificationTokenData = cursor.getString(29);
                          if(verificationTokenData != null){
                            verificationTokenData = verificationTokenData.toString();
                            hashMap.put("verificationToken", verificationTokenData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(30) != null){
                          statusData = cursor.getString(30);
                          if(statusData != null){
                            statusData = statusData.toString();
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(31) != null){
                          createdData = cursor.getString(31);
                          if(createdData != null){
                            createdData = createdData.toString();
                            hashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String lastUpdatedData = "";
                        if(cursor.getString(32) != null){
                          lastUpdatedData = cursor.getString(32);
                          if(lastUpdatedData != null){
                            lastUpdatedData = lastUpdatedData.toString();
                            hashMap.put("lastUpdated", lastUpdatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(33) != null){
                          idData = cursor.getString(33);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String cityIdData = "";
                        if(cursor.getString(34) != null){
                          cityIdData = cursor.getString(34);
                          if(cityIdData != null){
                            cityIdData = cityIdData.toString();
                            hashMap.put("cityId", cityIdData);
                          }
                        }
                                                
                                
                                                            String areaIdData = "";
                        if(cursor.getString(35) != null){
                          areaIdData = cursor.getString(35);
                          if(areaIdData != null){
                            areaIdData = areaIdData.toString();
                            hashMap.put("areaId", areaIdData);
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
