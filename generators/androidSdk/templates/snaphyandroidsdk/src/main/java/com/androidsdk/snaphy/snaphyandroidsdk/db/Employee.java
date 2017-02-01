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
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
        
    String CREATE_Employee_TABLE = "CREATE TABLE  Employee IF NOT EXISTS (  username TEXT, firstName TEXT, lastName TEXT, added TEXT, updated TEXT, email TEXT, password TEXT, realm TEXT, credentials TEXT, challenges TEXT, emailVerified TEXT, verificationToken TEXT, status TEXT, created TEXT, lastUpdated TEXT, id TEXT PRIMARY KEY)";
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
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   Employee get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Employee", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = new HashMap<>();

                                      
                                                                                    String usernameData;
                                if(cursor.getString(0) != null){
                                  usernameData = cursor.getString(0);
                                  if(usernameData != null){
                                    usernameData = (String)usernameData;
                                    chatHashMap.put("username", usernameData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String firstNameData;
                                if(cursor.getString(1) != null){
                                  firstNameData = cursor.getString(1);
                                  if(firstNameData != null){
                                    firstNameData = (String)firstNameData;
                                    chatHashMap.put("firstName", firstNameData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String lastNameData;
                                if(cursor.getString(2) != null){
                                  lastNameData = cursor.getString(2);
                                  if(lastNameData != null){
                                    lastNameData = (String)lastNameData;
                                    chatHashMap.put("lastName", lastNameData);
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
                                                                        
                                                        
                                                                                    String emailData;
                                if(cursor.getString(5) != null){
                                  emailData = cursor.getString(5);
                                  if(emailData != null){
                                    emailData = (String)emailData;
                                    chatHashMap.put("email", emailData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String passwordData;
                                if(cursor.getString(6) != null){
                                  passwordData = cursor.getString(6);
                                  if(passwordData != null){
                                    passwordData = (String)passwordData;
                                    chatHashMap.put("password", passwordData);
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
                                                                        
                                                        
                                                                                    String credentialsData;
                                if(cursor.getString(8) != null){
                                  credentialsData = cursor.getString(8);
                                  if(credentialsData != null){
                                    credentialsData = (Object)credentialsData;
                                    chatHashMap.put("credentials", credentialsData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String challengesData;
                                if(cursor.getString(9) != null){
                                  challengesData = cursor.getString(9);
                                  if(challengesData != null){
                                    challengesData = (Object)challengesData;
                                    chatHashMap.put("challenges", challengesData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String emailVerifiedData;
                                if(cursor.getString(10) != null){
                                  emailVerifiedData = cursor.getString(10);
                                  if(emailVerifiedData != null){
                                    emailVerifiedData = (Object)emailVerifiedData;
                                    chatHashMap.put("emailVerified", emailVerifiedData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String verificationTokenData;
                                if(cursor.getString(11) != null){
                                  verificationTokenData = cursor.getString(11);
                                  if(verificationTokenData != null){
                                    verificationTokenData = (Object)verificationTokenData;
                                    chatHashMap.put("verificationToken", verificationTokenData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String statusData;
                                if(cursor.getString(12) != null){
                                  statusData = cursor.getString(12);
                                  if(statusData != null){
                                    statusData = (Object)statusData;
                                    chatHashMap.put("status", statusData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String createdData;
                                if(cursor.getString(13) != null){
                                  createdData = cursor.getString(13);
                                  if(createdData != null){
                                    createdData = (Object)createdData;
                                    chatHashMap.put("created", createdData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String lastUpdatedData;
                                if(cursor.getString(14) != null){
                                  lastUpdatedData = cursor.getString(14);
                                  if(lastUpdatedData != null){
                                    lastUpdatedData = (Object)lastUpdatedData;
                                    chatHashMap.put("lastUpdated", lastUpdatedData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String idData;
                                if(cursor.getString(15) != null){
                                  idData = cursor.getString(15);
                                  if(idData != null){
                                    idData = (Object)idData;
                                    chatHashMap.put("id", idData);
                                  }
                                }
                                                                        
                                    

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
                        return (Employee)repo.createObject(chatHashMap);
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

    }




}
