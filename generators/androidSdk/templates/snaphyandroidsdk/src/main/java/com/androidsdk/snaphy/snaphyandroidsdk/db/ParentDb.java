package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Parent;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ParentRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class ParentDb{

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

  public ParentDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Parent";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Parent modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("Parent", null, values);
                //db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(Parent modelData){
      ContentValues values = new ContentValues();
                       
                                                            String addedData = "";
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                        }
                                                values.put("`added`", addedData);
                                
                                                            String updatedData = "";
                        if(modelData.getUpdated() != null){
                          updatedData = modelData.getUpdated().toString();
                        }
                                                values.put("`updated`", updatedData);
                                
                                                            String firstNameData = "";
                        if(modelData.getFirstName() != null){
                          firstNameData = modelData.getFirstName().toString();
                        }
                                                values.put("`firstName`", firstNameData);
                                
                                                            String lastNameData = "";
                        if(modelData.getLastName() != null){
                          lastNameData = modelData.getLastName().toString();
                        }
                                                values.put("`lastName`", lastNameData);
                                
                                                            String passwordData = "";
                        if(modelData.getPassword() != null){
                          passwordData = modelData.getPassword().toString();
                        }
                                                values.put("`password`", passwordData);
                                
                                                            String emailData = "";
                        if(modelData.getEmail() != null){
                          emailData = modelData.getEmail().toString();
                        }
                                                values.put("`email`", emailData);
                                
                                                            String phoneNumberData = "";
                        if(modelData.getPhoneNumber() != null){
                          phoneNumberData = modelData.getPhoneNumber().toString();
                        }
                                                values.put("`phoneNumber`", phoneNumberData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String realmData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getRealm");
                              if(method.invoke(modelData) != null){
                                //realmData = modelData.getRealm().toString();
                                realmData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`realm`", realmData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String usernameData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getUsername");
                              if(method.invoke(modelData) != null){
                                //usernameData = modelData.getUsername().toString();
                                usernameData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`username`", usernameData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String credentialsData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getCredentials");
                              if(method.invoke(modelData) != null){
                                //credentialsData = modelData.getCredentials().toString();
                                credentialsData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`credentials`", credentialsData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String challengesData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getChallenges");
                              if(method.invoke(modelData) != null){
                                //challengesData = modelData.getChallenges().toString();
                                challengesData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`challenges`", challengesData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String emailVerifiedData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getEmailVerified");
                              if(method.invoke(modelData) != null){
                                //emailVerifiedData = modelData.getEmailVerified().toString();
                                emailVerifiedData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`emailVerified`", emailVerifiedData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String verificationTokenData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getVerificationToken");
                              if(method.invoke(modelData) != null){
                                //verificationTokenData = modelData.getVerificationToken().toString();
                                verificationTokenData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`verificationToken`", verificationTokenData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String statusData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getStatus");
                              if(method.invoke(modelData) != null){
                                //statusData = modelData.getStatus().toString();
                                statusData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`status`", statusData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String createdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getCreated");
                              if(method.invoke(modelData) != null){
                                //createdData = modelData.getCreated().toString();
                                createdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`created`", createdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String lastUpdatedData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getLastUpdated");
                              if(method.invoke(modelData) != null){
                                //lastUpdatedData = modelData.getLastUpdated().toString();
                                lastUpdatedData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`lastUpdated`", lastUpdatedData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String idData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getId");
                              if(method.invoke(modelData) != null){
                                //idData = modelData.getId().toString();
                                idData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`id`", idData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String schoolIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getSchoolId");
                              if(method.invoke(modelData) != null){
                                //schoolIdData = modelData.getSchoolId().toString();
                                schoolIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("`schoolId`", schoolIdData);
                  

        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Parent get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Parent", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        ParentRepository repo = restAdapter.createRepository(ParentRepository.class);
                        repo.addStorage(context);
                        return (Parent)repo.createObject(hashMap);
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
    public   Parent get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Parent", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        ParentRepository repo = restAdapter.createRepository(ParentRepository.class);
                        repo.addStorage(context);
                        return (Parent)repo.createObject(hashMap);
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
                                                
                                
                                                            String firstNameData = "";
                        if(cursor.getString(2) != null){
                          firstNameData = cursor.getString(2);
                          if(firstNameData != null){
                            firstNameData = (String)firstNameData;
                            hashMap.put("firstName", firstNameData);
                          }
                        }
                                                
                                
                                                            String lastNameData = "";
                        if(cursor.getString(3) != null){
                          lastNameData = cursor.getString(3);
                          if(lastNameData != null){
                            lastNameData = (String)lastNameData;
                            hashMap.put("lastName", lastNameData);
                          }
                        }
                                                
                                
                                                            String passwordData = "";
                        if(cursor.getString(4) != null){
                          passwordData = cursor.getString(4);
                          if(passwordData != null){
                            passwordData = (String)passwordData;
                            hashMap.put("password", passwordData);
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
                                                
                                
                                                            String phoneNumberData = "";
                        if(cursor.getString(6) != null){
                          phoneNumberData = cursor.getString(6);
                          if(phoneNumberData != null){
                            phoneNumberData = (String)phoneNumberData;
                            hashMap.put("phoneNumber", phoneNumberData);
                          }
                        }
                                                
                                
                                                            String realmData = "";
                        if(cursor.getString(7) != null){
                          realmData = cursor.getString(7);
                          if(realmData != null){
                            realmData = realmData.toString();
                            hashMap.put("realm", realmData);
                          }
                        }
                                                
                                
                                                            String usernameData = "";
                        if(cursor.getString(8) != null){
                          usernameData = cursor.getString(8);
                          if(usernameData != null){
                            usernameData = usernameData.toString();
                            hashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            String credentialsData = "";
                        if(cursor.getString(9) != null){
                          credentialsData = cursor.getString(9);
                          if(credentialsData != null){
                            credentialsData = credentialsData.toString();
                            hashMap.put("credentials", credentialsData);
                          }
                        }
                                                
                                
                                                            String challengesData = "";
                        if(cursor.getString(10) != null){
                          challengesData = cursor.getString(10);
                          if(challengesData != null){
                            challengesData = challengesData.toString();
                            hashMap.put("challenges", challengesData);
                          }
                        }
                                                
                                
                                                            String emailVerifiedData = "";
                        if(cursor.getString(11) != null){
                          emailVerifiedData = cursor.getString(11);
                          if(emailVerifiedData != null){
                            emailVerifiedData = emailVerifiedData.toString();
                            hashMap.put("emailVerified", emailVerifiedData);
                          }
                        }
                                                
                                
                                                            String verificationTokenData = "";
                        if(cursor.getString(12) != null){
                          verificationTokenData = cursor.getString(12);
                          if(verificationTokenData != null){
                            verificationTokenData = verificationTokenData.toString();
                            hashMap.put("verificationToken", verificationTokenData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(13) != null){
                          statusData = cursor.getString(13);
                          if(statusData != null){
                            statusData = statusData.toString();
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(14) != null){
                          createdData = cursor.getString(14);
                          if(createdData != null){
                            createdData = createdData.toString();
                            hashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String lastUpdatedData = "";
                        if(cursor.getString(15) != null){
                          lastUpdatedData = cursor.getString(15);
                          if(lastUpdatedData != null){
                            lastUpdatedData = lastUpdatedData.toString();
                            hashMap.put("lastUpdated", lastUpdatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(16) != null){
                          idData = cursor.getString(16);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String schoolIdData = "";
                        if(cursor.getString(17) != null){
                          schoolIdData = cursor.getString(17);
                          if(schoolIdData != null){
                            schoolIdData = schoolIdData.toString();
                            hashMap.put("schoolId", schoolIdData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Parent model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Parent>  getAll__db() {
        DataList<Parent> modelList = new DataList<Parent>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Parent";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Parent>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ParentRepository repo = restAdapter.createRepository(ParentRepository.class);
                    repo.addStorage(context);
                    modelList.add((Parent)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Parent>) modelList;
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
    public DataList<Parent>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Parent>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit) {
        DataList<Parent> modelList = new DataList<Parent>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM Parent " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Parent " + whereQuery + " LIMIT " + limit;
            }else{
                selectQuery = "SELECT  * FROM Parent " + whereQuery;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Parent>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ParentRepository repo = restAdapter.createRepository(ParentRepository.class);
                    repo.addStorage(context);
                    modelList.add((Parent)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Parent>) modelList;
    }


    // Getting All Data where
    public DataList<Parent>  getAll__db(HashMap<String, Object> whereKeyValue, int limit) {
        return getAll__db(whereKeyValue, null,  limit);
    }





    /**
     * Check count of database.
     * @param whereKeyValue
     * @param orderBy
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(orderBy != null){
            countQuery = "SELECT  * FROM Parent " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM Parent " + whereQuery + " LIMIT " + limit;
            }else{
                countQuery = "SELECT  * FROM Parent " + whereQuery;
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
    public int count__db(HashMap<String, Object> whereKeyValue, int limit){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(limit != 0){
            countQuery = "SELECT  * FROM Parent " + whereQuery + " LIMIT " + limit;
        }else{
            countQuery = "SELECT  * FROM Parent " + whereQuery;
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
            return count__db(whereKeyValue, 0);
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final HashMap<String, Object> whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                String where = getWhere(whereKeyValue);
                // updating row
                db.update("Parent", values, "_DATA_UPDATED = 1 AND " + where, null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("Parent", "_DATA_UPDATED = 0 AND " + where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }





    // Getting All Data where
    public DataList<Parent>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Parent> modelList = new DataList<Parent>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Parent` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Parent>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ParentRepository repo = restAdapter.createRepository(ParentRepository.class);
                    repo.addStorage(context);
                    modelList.add((Parent)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Parent>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM `Parent` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("Parent", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("Parent", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Updating single contact
    public void update__db(final String id,   final Parent modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("Parent", values, "id = ?",
                        new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("Parent", values, "_DATA_UPDATED = 1", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Delete Old data
    public void deleteOldData__db() {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("Parent", "_DATA_UPDATED = 0", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

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
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, KEY_ID + " = ?",
                new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();
    }

    public void reset__db(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE,null,null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }

}