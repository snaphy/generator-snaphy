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



public class EmployeeDb extends DbHandler<Employee, EmployeeRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "Employee", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                                                                                                                        
    String CREATE_Employee_TABLE = "CREATE TABLE  Employee IF NOT EXISTS ( id TEXT PRIMARY KEY, username TEXT, firstName TEXT, lastName TEXT, added TEXT, updated TEXT, email TEXT, password TEXT, realm TEXT, credentials TEXT, challenges TEXT, emailVerified TEXT, verificationToken TEXT, status TEXT, created TEXT, lastUpdated TEXT, id TEXT)";
    db.execSQL(CREATE_Employee_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS Employee");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, Employee model) {

        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String usernameData;
                        if(model.getUsername() != null){
                          usernameData = model.getUsername().toString();
                        }
                                                values.put("username", usernameData);
                                
                                                            String firstNameData;
                        if(model.getFirstName() != null){
                          firstNameData = model.getFirstName().toString();
                        }
                                                values.put("firstName", firstNameData);
                                
                                                            String lastNameData;
                        if(model.getLastName() != null){
                          lastNameData = model.getLastName().toString();
                        }
                                                values.put("lastName", lastNameData);
                                
                                                            String addedData;
                        if(model.getAdded() != null){
                          addedData = model.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
                                                            String updatedData;
                        if(model.getUpdated() != null){
                          updatedData = model.getUpdated().toString();
                        }
                                                values.put("updated", updatedData);
                                
                                                            String emailData;
                        if(model.getEmail() != null){
                          emailData = model.getEmail().toString();
                        }
                                                values.put("email", emailData);
                                
                                                            String passwordData;
                        if(model.getPassword() != null){
                          passwordData = model.getPassword().toString();
                        }
                                                values.put("password", passwordData);
                                
                                                            String realmData;
                        if(model.getRealm() != null){
                          realmData = model.getRealm().toString();
                        }
                                                values.put("realm", realmData);
                                
                                                            String credentialsData;
                        if(model.getCredentials() != null){
                          credentialsData = model.getCredentials().toString();
                        }
                                                values.put("credentials", credentialsData);
                                
                                                            String challengesData;
                        if(model.getChallenges() != null){
                          challengesData = model.getChallenges().toString();
                        }
                                                values.put("challenges", challengesData);
                                
                                                            String emailVerifiedData;
                        if(model.getEmailVerified() != null){
                          emailVerifiedData = model.getEmailVerified().toString();
                        }
                                                values.put("emailVerified", emailVerifiedData);
                                
                                                            String verificationTokenData;
                        if(model.getVerificationToken() != null){
                          verificationTokenData = model.getVerificationToken().toString();
                        }
                                                values.put("verificationToken", verificationTokenData);
                                
                                                            String statusData;
                        if(model.getStatus() != null){
                          statusData = model.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
                                                            String createdData;
                        if(model.getCreated() != null){
                          createdData = model.getCreated().toString();
                        }
                                                values.put("created", createdData);
                                
                                                            String lastUpdatedData;
                        if(model.getLastUpdated() != null){
                          lastUpdatedData = model.getLastUpdated().toString();
                        }
                                                values.put("lastUpdated", lastUpdatedData);
                                
                                                            String idData;
                        if(model.getId() != null){
                          idData = model.getId().toString();
                        }
                                                values.put("id", idData);
                  
        if(model.getId() != null){
            values.put("id", model.getId().toString());
        }
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



}
