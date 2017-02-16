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
import android.database.sqlite.SQLiteOpenHelper;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.AppUser;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class AppUserDb extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    RestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";
    private Context context;
    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;

  public AppUserDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "AppUser";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = this.getWritableDatabase();
    onCreate(db);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    
    String CREATE_AppUser_TABLE = "CREATE TABLE IF NOT EXISTS AppUser(  firstName TEXT, lastName TEXT, email TEXT, added TEXT, updated TEXT, registrationId TEXT, profilePic TEXT, realm TEXT, username TEXT, password TEXT, credentials TEXT, challenges TEXT, emailVerified TEXT, verificationToken TEXT, status TEXT, created TEXT, lastUpdated TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_AppUser_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS AppUser");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (final String id, final AppUser modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("AppUser", null, values);
                db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(AppUser modelData){
      ContentValues values = new ContentValues();
                       
                                                            String firstNameData = "";
                        if(modelData.getFirstName() != null){
                          firstNameData = modelData.getFirstName().toString();
                        }
                                                values.put("firstName", firstNameData);
                                
                                                            String lastNameData = "";
                        if(modelData.getLastName() != null){
                          lastNameData = modelData.getLastName().toString();
                        }
                                                values.put("lastName", lastNameData);
                                
                                                            String emailData = "";
                        if(modelData.getEmail() != null){
                          emailData = modelData.getEmail().toString();
                        }
                                                values.put("email", emailData);
                                
                                                            String addedData = "";
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
                                                            String updatedData = "";
                        if(modelData.getUpdated() != null){
                          updatedData = modelData.getUpdated().toString();
                        }
                                                values.put("updated", updatedData);
                                
                                                            String registrationIdData = "";
                        if(modelData.getRegistrationId() != null){
                          registrationIdData = modelData.getRegistrationId().toString();
                        }
                                                values.put("registrationId", registrationIdData);
                                
                                                            String profilePicData = "";
                        if(modelData.getProfilePic() != null){
                          profilePicData = new Gson().toJson(modelData.getProfilePic(), HashMap.class);
                        }
                                                values.put("profilePic", profilePicData);
                                
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

                                                values.put("realm", realmData);
                                
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

                                                values.put("username", usernameData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String passwordData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getPassword");
                              if(method.invoke(modelData) != null){
                                //passwordData = modelData.getPassword().toString();
                                passwordData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("password", passwordData);
                                
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

                                                values.put("credentials", credentialsData);
                                
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

                                                values.put("challenges", challengesData);
                                
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

                                                values.put("emailVerified", emailVerifiedData);
                                
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

                                                values.put("verificationToken", verificationTokenData);
                                
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

                                                values.put("status", statusData);
                                
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

                                                values.put("created", createdData);
                                
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

                                                values.put("lastUpdated", lastUpdatedData);
                                
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

                                                values.put("id", idData);
                  

        //Add the updated data property value to be 1
        values.put("_DATA_UPDATED", 1);
        return values;
    }



    // Getting single c
    public   AppUser get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AppUser", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    db.close(); // Closing database connection
                    if (hashMap != null) {
                        AppUserRepository repo = restAdapter.createRepository(AppUserRepository.class);
                        repo.addStorage(context);
                        return (AppUser)repo.createObject(hashMap);
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
    public   AppUser get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AppUser", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    db.close(); // Closing database connection

                    if (hashMap != null) {
                        AppUserRepository repo = restAdapter.createRepository(AppUserRepository.class);
                        repo.addStorage(context);
                        return (AppUser)repo.createObject(hashMap);
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
                                                
                                
                                                            String emailData = "";
                        if(cursor.getString(2) != null){
                          emailData = cursor.getString(2);
                          if(emailData != null){
                            emailData = (String)emailData;
                            hashMap.put("email", emailData);
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
                                                
                                
                                                            String registrationIdData = "";
                        if(cursor.getString(5) != null){
                          registrationIdData = cursor.getString(5);
                          if(registrationIdData != null){
                            registrationIdData = (String)registrationIdData;
                            hashMap.put("registrationId", registrationIdData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> profilePicData = new HashMap<>();
                        if(cursor.getString(6) != null){
                          profilePicData = new Gson().fromJson(cursor.getString(6), Map.class);
                          if(profilePicData != null){
                            profilePicData = (Map<String, Object>)profilePicData;
                            hashMap.put("profilePic", profilePicData);
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
                                                
                                
                                                            String passwordData = "";
                        if(cursor.getString(9) != null){
                          passwordData = cursor.getString(9);
                          if(passwordData != null){
                            passwordData = passwordData.toString();
                            hashMap.put("password", passwordData);
                          }
                        }
                                                
                                
                                                            String credentialsData = "";
                        if(cursor.getString(10) != null){
                          credentialsData = cursor.getString(10);
                          if(credentialsData != null){
                            credentialsData = credentialsData.toString();
                            hashMap.put("credentials", credentialsData);
                          }
                        }
                                                
                                
                                                            String challengesData = "";
                        if(cursor.getString(11) != null){
                          challengesData = cursor.getString(11);
                          if(challengesData != null){
                            challengesData = challengesData.toString();
                            hashMap.put("challenges", challengesData);
                          }
                        }
                                                
                                
                                                            String emailVerifiedData = "";
                        if(cursor.getString(12) != null){
                          emailVerifiedData = cursor.getString(12);
                          if(emailVerifiedData != null){
                            emailVerifiedData = emailVerifiedData.toString();
                            hashMap.put("emailVerified", emailVerifiedData);
                          }
                        }
                                                
                                
                                                            String verificationTokenData = "";
                        if(cursor.getString(13) != null){
                          verificationTokenData = cursor.getString(13);
                          if(verificationTokenData != null){
                            verificationTokenData = verificationTokenData.toString();
                            hashMap.put("verificationToken", verificationTokenData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(14) != null){
                          statusData = cursor.getString(14);
                          if(statusData != null){
                            statusData = statusData.toString();
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(15) != null){
                          createdData = cursor.getString(15);
                          if(createdData != null){
                            createdData = createdData.toString();
                            hashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String lastUpdatedData = "";
                        if(cursor.getString(16) != null){
                          lastUpdatedData = cursor.getString(16);
                          if(lastUpdatedData != null){
                            lastUpdatedData = lastUpdatedData.toString();
                            hashMap.put("lastUpdated", lastUpdatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(17) != null){
                          idData = cursor.getString(17);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, AppUser model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<AppUser>  getAll__db() {
        DataList<AppUser> modelList = new DataList<AppUser>();
        // Select All Query
        String selectQuery = "SELECT  * FROM AppUser";

        SQLiteDatabase db = this.getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
            return (DataList<AppUser>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    AppUserRepository repo = restAdapter.createRepository(AppUserRepository.class);
                    repo.addStorage(context);
                    modelList.add((AppUser)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        // return contact list
        return (DataList<AppUser>) modelList;
    }


    // Getting All Data where
    public DataList<AppUser>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<AppUser> modelList = new DataList<AppUser>();
        // Select All Query
        String selectQuery = "SELECT  * FROM AppUser WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
            return (DataList<AppUser>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    AppUserRepository repo = restAdapter.createRepository(AppUserRepository.class);
                    repo.addStorage(context);
                    modelList.add((AppUser)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        // return contact list
        return (DataList<AppUser>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM AppUser WHERE " + whereKey +"='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = this.getReadableDatabase();
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
                SQLiteDatabase db = getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("AppUser", values, "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = getWritableDatabase();
                db.beginTransaction();
                db.delete("AppUser", "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Updating single contact
    public void update__db(final String id,   final AppUser modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("AppUser", values, "id = ?",
                        new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = getWritableDatabase();
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("AppUser", values, "_DATA_UPDATED = 1", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Delete Old data
    public void deleteOldData__db() {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = getWritableDatabase();
                db.beginTransaction();
                db.delete("AppUser", "_DATA_UPDATED = 0", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Getting contacts Count
    public int count__db() {
        String countQuery = "SELECT  * FROM " + TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
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
        String countQuery = "SELECT  * FROM " + TABLE  + " WHERE ID='" + id+"'";
        SQLiteDatabase db = this.getReadableDatabase();
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
                SQLiteDatabase db = getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, KEY_ID + " = ?",
                new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();
    }

    public void reset__db(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE,null,null);
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }

}
