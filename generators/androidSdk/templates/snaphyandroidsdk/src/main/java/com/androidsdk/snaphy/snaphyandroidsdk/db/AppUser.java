package com.androidsdk.snaphy.snaphyandroidsdk.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Chat;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.Repository;
//Import Model
import com.androidsdk.snaphy.snaphyandroidsdk.repository.;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/



public class AppUserDb extends DbHandler<AppUser, AppUserRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "AppUser", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    String CREATE_AppUser_TABLE = "CREATE TABLE  AppUser IF NOT EXISTS (  firstName TEXT, lastName TEXT, email TEXT, added TEXT, updated TEXT, registrationId TEXT, profilePic TEXT, realm TEXT, username TEXT, password TEXT, credentials TEXT, challenges TEXT, emailVerified TEXT, verificationToken TEXT, status TEXT, created TEXT, lastUpdated TEXT, id TEXT PRIMARY KEY)";
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


    public void insert__db (String id, AppUser modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(AppUser modelData){
      ContentValues values = new ContentValues();
                       
                                                            String firstNameData;
                        if(modelData.getFirstName() != null){
                          firstNameData = modelData.getFirstName().toString();
                        }
                                                values.put("firstName", firstNameData);
                                
                                                            String lastNameData;
                        if(modelData.getLastName() != null){
                          lastNameData = modelData.getLastName().toString();
                        }
                                                values.put("lastName", lastNameData);
                                
                                                            String emailData;
                        if(modelData.getEmail() != null){
                          emailData = modelData.getEmail().toString();
                        }
                                                values.put("email", emailData);
                                
                                                            String addedData;
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
                                                            String updatedData;
                        if(modelData.getUpdated() != null){
                          updatedData = modelData.getUpdated().toString();
                        }
                                                values.put("updated", updatedData);
                                
                                                            String registrationIdData;
                        if(modelData.getRegistrationId() != null){
                          registrationIdData = modelData.getRegistrationId().toString();
                        }
                                                values.put("registrationId", registrationIdData);
                                
                                                            String profilePicData;
                        if(modelData.getProfilePic() != null){
                          profilePicData = new Gson().toJson(modelData.getProfilePic(), HashMap.class);
                        }
                                                values.put("profilePic", profilePicData);
                                
                                                            String realmData;
                        if(modelData.getRealm() != null){
                          realmData =modelData.getRealm().toString();
                        }
                                                values.put("realm", realmData);
                                
                                                            String usernameData;
                        if(modelData.getUsername() != null){
                          usernameData =modelData.getUsername().toString();
                        }
                                                values.put("username", usernameData);
                                
                                                            String passwordData;
                        if(modelData.getPassword() != null){
                          passwordData =modelData.getPassword().toString();
                        }
                                                values.put("password", passwordData);
                                
                                                            String credentialsData;
                        if(modelData.getCredentials() != null){
                          credentialsData =modelData.getCredentials().toString();
                        }
                                                values.put("credentials", credentialsData);
                                
                                                            String challengesData;
                        if(modelData.getChallenges() != null){
                          challengesData =modelData.getChallenges().toString();
                        }
                                                values.put("challenges", challengesData);
                                
                                                            String emailVerifiedData;
                        if(modelData.getEmailVerified() != null){
                          emailVerifiedData =modelData.getEmailVerified().toString();
                        }
                                                values.put("emailVerified", emailVerifiedData);
                                
                                                            String verificationTokenData;
                        if(modelData.getVerificationToken() != null){
                          verificationTokenData =modelData.getVerificationToken().toString();
                        }
                                                values.put("verificationToken", verificationTokenData);
                                
                                                            String statusData;
                        if(modelData.getStatus() != null){
                          statusData =modelData.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
                                                            String createdData;
                        if(modelData.getCreated() != null){
                          createdData =modelData.getCreated().toString();
                        }
                                                values.put("created", createdData);
                                
                                                            String lastUpdatedData;
                        if(modelData.getLastUpdated() != null){
                          lastUpdatedData =modelData.getLastUpdated().toString();
                        }
                                                values.put("lastUpdated", lastUpdatedData);
                                
                                                            String idData;
                        if(modelData.getId() != null){
                          idData =modelData.getId().toString();
                        }
                                                values.put("id", idData);
                  
        return values;
    }



    // Getting single cont
    public   AppUser get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AppUser", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        AppUserRepository repo = restAdapter.createRepository(AppUserRepository.class);
                        return (AppUser)repo.createObject(chatHashMap);
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }

            } else {
                return null;
            }
        } else {
            return null;
        }

    } //get__db



    private HashMap<String, Object> parseCursor(Cursor cursor ){
      HashMap<String, Object> chatHashMap = new HashMap<>();

                      
                                                            String firstNameData;
                        if(cursor.getString(0) != null){
                          firstNameData = cursor.getString(0);
                          if(firstNameData != null){
                            firstNameData = (String)firstNameData;
                            chatHashMap.put("firstName", firstNameData);
                          }
                        }
                                                
                                
                                                            String lastNameData;
                        if(cursor.getString(1) != null){
                          lastNameData = cursor.getString(1);
                          if(lastNameData != null){
                            lastNameData = (String)lastNameData;
                            chatHashMap.put("lastName", lastNameData);
                          }
                        }
                                                
                                
                                                            String emailData;
                        if(cursor.getString(2) != null){
                          emailData = cursor.getString(2);
                          if(emailData != null){
                            emailData = (String)emailData;
                            chatHashMap.put("email", emailData);
                          }
                        }
                                                
                                
                                                            String addedData;
                        if(cursor.getString(3) != null){
                          addedData = cursor.getString(3);
                          if(addedData != null){
                            addedData = (String)addedData;
                            chatHashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData;
                        if(cursor.getString(4) != null){
                          updatedData = cursor.getString(4);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            chatHashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String registrationIdData;
                        if(cursor.getString(5) != null){
                          registrationIdData = cursor.getString(5);
                          if(registrationIdData != null){
                            registrationIdData = (String)registrationIdData;
                            chatHashMap.put("registrationId", registrationIdData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> profilePicData = new Map<>();
                        if(cursor.getString(6) != null){
                          profilePicData = new Gson().fromJson(cursor.getString(6), Map.class);
                          if(profilePicData != null){
                            profilePicData = (Map<String, Object>)profilePicData;
                            chatHashMap.put("profilePic", profilePicData);
                          }
                        }
                                                
                                
                                                            String realmData;
                        if(cursor.getString(7) != null){
                          realmData = cursor.getString(7);
                          if(realmData != null){
                            realmData = (Object)realmData;
                            chatHashMap.put("realm", realmData);
                          }
                        }
                                                
                                
                                                            String usernameData;
                        if(cursor.getString(8) != null){
                          usernameData = cursor.getString(8);
                          if(usernameData != null){
                            usernameData = (Object)usernameData;
                            chatHashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            String passwordData;
                        if(cursor.getString(9) != null){
                          passwordData = cursor.getString(9);
                          if(passwordData != null){
                            passwordData = (Object)passwordData;
                            chatHashMap.put("password", passwordData);
                          }
                        }
                                                
                                
                                                            String credentialsData;
                        if(cursor.getString(10) != null){
                          credentialsData = cursor.getString(10);
                          if(credentialsData != null){
                            credentialsData = (Object)credentialsData;
                            chatHashMap.put("credentials", credentialsData);
                          }
                        }
                                                
                                
                                                            String challengesData;
                        if(cursor.getString(11) != null){
                          challengesData = cursor.getString(11);
                          if(challengesData != null){
                            challengesData = (Object)challengesData;
                            chatHashMap.put("challenges", challengesData);
                          }
                        }
                                                
                                
                                                            String emailVerifiedData;
                        if(cursor.getString(12) != null){
                          emailVerifiedData = cursor.getString(12);
                          if(emailVerifiedData != null){
                            emailVerifiedData = (Object)emailVerifiedData;
                            chatHashMap.put("emailVerified", emailVerifiedData);
                          }
                        }
                                                
                                
                                                            String verificationTokenData;
                        if(cursor.getString(13) != null){
                          verificationTokenData = cursor.getString(13);
                          if(verificationTokenData != null){
                            verificationTokenData = (Object)verificationTokenData;
                            chatHashMap.put("verificationToken", verificationTokenData);
                          }
                        }
                                                
                                
                                                            String statusData;
                        if(cursor.getString(14) != null){
                          statusData = cursor.getString(14);
                          if(statusData != null){
                            statusData = (Object)statusData;
                            chatHashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String createdData;
                        if(cursor.getString(15) != null){
                          createdData = cursor.getString(15);
                          if(createdData != null){
                            createdData = (Object)createdData;
                            chatHashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String lastUpdatedData;
                        if(cursor.getString(16) != null){
                          lastUpdatedData = cursor.getString(16);
                          if(lastUpdatedData != null){
                            lastUpdatedData = (Object)lastUpdatedData;
                            chatHashMap.put("lastUpdated", lastUpdatedData);
                          }
                        }
                                                
                                
                                                            String idData;
                        if(cursor.getString(17) != null){
                          idData = cursor.getString(17);
                          if(idData != null){
                            idData = (Object)idData;
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                    
        return chatHashMap;
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

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    AppUserRepository repo = restAdapter.createRepository(AppUserRepository.class);
                    modelList.add((AppUser)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<AppUser>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   AppUser modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update(TABLE, values, KEY_ID + " = ?",
                new String[] { id });
    }








}
