package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Employee;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;
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


    public void insert__db (String id, Employee modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("Employee", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(Employee modelData){
      ContentValues values = new ContentValues();
                       
                                                            String usernameData = "";
                        if(modelData.getUsername() != null){
                          usernameData = modelData.getUsername().toString();
                        }
                                                values.put("username", usernameData);
                                
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
                                
                                                            String emailData = "";
                        if(modelData.getEmail() != null){
                          emailData = modelData.getEmail().toString();
                        }
                                                values.put("email", emailData);
                                
                                                            String passwordData = "";
                        if(modelData.getPassword() != null){
                          passwordData = modelData.getPassword().toString();
                        }
                                                values.put("password", passwordData);
                                
                                                            String realmData = "";
                        if(modelData.getRealm() != null){
                          realmData =modelData.getRealm().toString();
                        }
                                                values.put("realm", realmData);
                                
                                                            String credentialsData = "";
                        if(modelData.getCredentials() != null){
                          credentialsData =modelData.getCredentials().toString();
                        }
                                                values.put("credentials", credentialsData);
                                
                                                            String challengesData = "";
                        if(modelData.getChallenges() != null){
                          challengesData =modelData.getChallenges().toString();
                        }
                                                values.put("challenges", challengesData);
                                
                                                            String emailVerifiedData = "";
                        if(modelData.getEmailVerified() != null){
                          emailVerifiedData =modelData.getEmailVerified().toString();
                        }
                                                values.put("emailVerified", emailVerifiedData);
                                
                                                            String verificationTokenData = "";
                        if(modelData.getVerificationToken() != null){
                          verificationTokenData =modelData.getVerificationToken().toString();
                        }
                                                values.put("verificationToken", verificationTokenData);
                                
                                                            String statusData = "";
                        if(modelData.getStatus() != null){
                          statusData =modelData.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
                                                            String createdData = "";
                        if(modelData.getCreated() != null){
                          createdData =modelData.getCreated().toString();
                        }
                                                values.put("created", createdData);
                                
                                                            String lastUpdatedData = "";
                        if(modelData.getLastUpdated() != null){
                          lastUpdatedData =modelData.getLastUpdated().toString();
                        }
                                                values.put("lastUpdated", lastUpdatedData);
                                
                                                            String idData = "";
                        if(modelData.getId() != null){
                          idData =modelData.getId().toString();
                        }
                                                values.put("id", idData);
                  
        return values;
    }



    // Getting single cont
    public   Employee get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Employee", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                
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

    } //get__db



    private HashMap<String, Object> parseCursor(Cursor cursor ){
      HashMap<String, Object> chatHashMap = new HashMap<>();

                      
                                                            String usernameData = "";
                        if(cursor.getString(0) != null){
                          usernameData = cursor.getString(0);
                          if(usernameData != null){
                            usernameData = (String)usernameData;
                            chatHashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            String firstNameData = "";
                        if(cursor.getString(1) != null){
                          firstNameData = cursor.getString(1);
                          if(firstNameData != null){
                            firstNameData = (String)firstNameData;
                            chatHashMap.put("firstName", firstNameData);
                          }
                        }
                                                
                                
                                                            String lastNameData = "";
                        if(cursor.getString(2) != null){
                          lastNameData = cursor.getString(2);
                          if(lastNameData != null){
                            lastNameData = (String)lastNameData;
                            chatHashMap.put("lastName", lastNameData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(3) != null){
                          addedData = cursor.getString(3);
                          if(addedData != null){
                            addedData = (String)addedData;
                            chatHashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(4) != null){
                          updatedData = cursor.getString(4);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            chatHashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String emailData = "";
                        if(cursor.getString(5) != null){
                          emailData = cursor.getString(5);
                          if(emailData != null){
                            emailData = (String)emailData;
                            chatHashMap.put("email", emailData);
                          }
                        }
                                                
                                
                                                            String passwordData = "";
                        if(cursor.getString(6) != null){
                          passwordData = cursor.getString(6);
                          if(passwordData != null){
                            passwordData = (String)passwordData;
                            chatHashMap.put("password", passwordData);
                          }
                        }
                                                
                                
                                                            String realmData = "";
                        if(cursor.getString(7) != null){
                          realmData = cursor.getString(7);
                          if(realmData != null){
                            realmData = realmData.toString();
                            chatHashMap.put("realm", realmData);
                          }
                        }
                                                
                                
                                                            String credentialsData = "";
                        if(cursor.getString(8) != null){
                          credentialsData = cursor.getString(8);
                          if(credentialsData != null){
                            credentialsData = credentialsData.toString();
                            chatHashMap.put("credentials", credentialsData);
                          }
                        }
                                                
                                
                                                            String challengesData = "";
                        if(cursor.getString(9) != null){
                          challengesData = cursor.getString(9);
                          if(challengesData != null){
                            challengesData = challengesData.toString();
                            chatHashMap.put("challenges", challengesData);
                          }
                        }
                                                
                                
                                                            String emailVerifiedData = "";
                        if(cursor.getString(10) != null){
                          emailVerifiedData = cursor.getString(10);
                          if(emailVerifiedData != null){
                            emailVerifiedData = emailVerifiedData.toString();
                            chatHashMap.put("emailVerified", emailVerifiedData);
                          }
                        }
                                                
                                
                                                            String verificationTokenData = "";
                        if(cursor.getString(11) != null){
                          verificationTokenData = cursor.getString(11);
                          if(verificationTokenData != null){
                            verificationTokenData = verificationTokenData.toString();
                            chatHashMap.put("verificationToken", verificationTokenData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(12) != null){
                          statusData = cursor.getString(12);
                          if(statusData != null){
                            statusData = statusData.toString();
                            chatHashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(13) != null){
                          createdData = cursor.getString(13);
                          if(createdData != null){
                            createdData = createdData.toString();
                            chatHashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String lastUpdatedData = "";
                        if(cursor.getString(14) != null){
                          lastUpdatedData = cursor.getString(14);
                          if(lastUpdatedData != null){
                            lastUpdatedData = lastUpdatedData.toString();
                            chatHashMap.put("lastUpdated", lastUpdatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(15) != null){
                          idData = cursor.getString(15);
                          if(idData != null){
                            idData = idData.toString();
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                    
        return chatHashMap;
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
        String selectQuery = "SELECT  * FROM Employee";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    EmployeeRepository repo = restAdapter.createRepository(EmployeeRepository.class);
                    modelList.add((Employee)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Employee>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   Employee modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("Employee", values, "id = ?",
                new String[] { id });
    }

}
