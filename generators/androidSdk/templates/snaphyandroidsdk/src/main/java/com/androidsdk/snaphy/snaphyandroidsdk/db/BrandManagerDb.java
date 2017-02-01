package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.BrandManager;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandManagerRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class BrandManagerDb extends DbHandler<BrandManager, BrandManagerRepository> {
  public BrandManagerDb(Context context, RestAdapter restAdapter){
    super(context, "BrandManager", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    String CREATE_BrandManager_TABLE = "CREATE TABLE  BrandManager IF NOT EXISTS (  firstName TEXT, lastName TEXT, email TEXT, password TEXT, restrictHotDeal TEXT, status TEXT, added TEXT, updated TEXT, realm TEXT, username TEXT, credentials TEXT, challenges TEXT, emailVerified TEXT, verificationToken TEXT, created TEXT, lastUpdated TEXT, id TEXT PRIMARY KEY, brandId TEXT)";
    db.execSQL(CREATE_BrandManager_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS BrandManager");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, BrandManager modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("BrandManager", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(BrandManager modelData){
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
                                
                                                            String passwordData = "";
                        if(modelData.getPassword() != null){
                          passwordData = modelData.getPassword().toString();
                        }
                                                values.put("password", passwordData);
                                
                                                            String restrictHotDealData = "";
                        if(modelData.getRestrictHotDeal() != null){
                          restrictHotDealData = modelData.getRestrictHotDeal().toString();
                        }
                                                values.put("restrictHotDeal", restrictHotDealData);
                                
                                                            String statusData = "";
                        if(modelData.getStatus() != null){
                          statusData = modelData.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
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
                                
                                                            String realmData = "";
                        if(modelData.getRealm() != null){
                          realmData =modelData.getRealm().toString();
                        }
                                                values.put("realm", realmData);
                                
                                                            String usernameData = "";
                        if(modelData.getUsername() != null){
                          usernameData =modelData.getUsername().toString();
                        }
                                                values.put("username", usernameData);
                                
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
                                
                                                            String brandIdData = "";
                        if(modelData.getBrandId() != null){
                          brandIdData =modelData.getBrandId().toString();
                        }
                                                values.put("brandId", brandIdData);
                  
        return values;
    }



    // Getting single cont
    public   BrandManager get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("BrandManager", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                
                if (chatHashMap != null) {
                    BrandManagerRepository repo = restAdapter.createRepository(BrandManagerRepository.class);
                    return (BrandManager)repo.createObject(chatHashMap);
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

                      
                                                            String firstNameData = "";
                        if(cursor.getString(0) != null){
                          firstNameData = cursor.getString(0);
                          if(firstNameData != null){
                            firstNameData = (String)firstNameData;
                            chatHashMap.put("firstName", firstNameData);
                          }
                        }
                                                
                                
                                                            String lastNameData = "";
                        if(cursor.getString(1) != null){
                          lastNameData = cursor.getString(1);
                          if(lastNameData != null){
                            lastNameData = (String)lastNameData;
                            chatHashMap.put("lastName", lastNameData);
                          }
                        }
                                                
                                
                                                            String emailData = "";
                        if(cursor.getString(2) != null){
                          emailData = cursor.getString(2);
                          if(emailData != null){
                            emailData = (String)emailData;
                            chatHashMap.put("email", emailData);
                          }
                        }
                                                
                                
                                                            String passwordData = "";
                        if(cursor.getString(3) != null){
                          passwordData = cursor.getString(3);
                          if(passwordData != null){
                            passwordData = (String)passwordData;
                            chatHashMap.put("password", passwordData);
                          }
                        }
                                                
                                
                                                            String restrictHotDealData = "";
                        if(cursor.getString(4) != null){
                          restrictHotDealData = cursor.getString(4);
                          if(restrictHotDealData != null){
                            restrictHotDealData = (String)restrictHotDealData;
                            chatHashMap.put("restrictHotDeal", restrictHotDealData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(5) != null){
                          statusData = cursor.getString(5);
                          if(statusData != null){
                            statusData = (String)statusData;
                            chatHashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(6) != null){
                          addedData = cursor.getString(6);
                          if(addedData != null){
                            addedData = (String)addedData;
                            chatHashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(7) != null){
                          updatedData = cursor.getString(7);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            chatHashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String realmData = "";
                        if(cursor.getString(8) != null){
                          realmData = cursor.getString(8);
                          if(realmData != null){
                            realmData = realmData.toString();
                            chatHashMap.put("realm", realmData);
                          }
                        }
                                                
                                
                                                            String usernameData = "";
                        if(cursor.getString(9) != null){
                          usernameData = cursor.getString(9);
                          if(usernameData != null){
                            usernameData = usernameData.toString();
                            chatHashMap.put("username", usernameData);
                          }
                        }
                                                
                                
                                                            String credentialsData = "";
                        if(cursor.getString(10) != null){
                          credentialsData = cursor.getString(10);
                          if(credentialsData != null){
                            credentialsData = credentialsData.toString();
                            chatHashMap.put("credentials", credentialsData);
                          }
                        }
                                                
                                
                                                            String challengesData = "";
                        if(cursor.getString(11) != null){
                          challengesData = cursor.getString(11);
                          if(challengesData != null){
                            challengesData = challengesData.toString();
                            chatHashMap.put("challenges", challengesData);
                          }
                        }
                                                
                                
                                                            String emailVerifiedData = "";
                        if(cursor.getString(12) != null){
                          emailVerifiedData = cursor.getString(12);
                          if(emailVerifiedData != null){
                            emailVerifiedData = emailVerifiedData.toString();
                            chatHashMap.put("emailVerified", emailVerifiedData);
                          }
                        }
                                                
                                
                                                            String verificationTokenData = "";
                        if(cursor.getString(13) != null){
                          verificationTokenData = cursor.getString(13);
                          if(verificationTokenData != null){
                            verificationTokenData = verificationTokenData.toString();
                            chatHashMap.put("verificationToken", verificationTokenData);
                          }
                        }
                                                
                                
                                                            String createdData = "";
                        if(cursor.getString(14) != null){
                          createdData = cursor.getString(14);
                          if(createdData != null){
                            createdData = createdData.toString();
                            chatHashMap.put("created", createdData);
                          }
                        }
                                                
                                
                                                            String lastUpdatedData = "";
                        if(cursor.getString(15) != null){
                          lastUpdatedData = cursor.getString(15);
                          if(lastUpdatedData != null){
                            lastUpdatedData = lastUpdatedData.toString();
                            chatHashMap.put("lastUpdated", lastUpdatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(16) != null){
                          idData = cursor.getString(16);
                          if(idData != null){
                            idData = idData.toString();
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String brandIdData = "";
                        if(cursor.getString(17) != null){
                          brandIdData = cursor.getString(17);
                          if(brandIdData != null){
                            brandIdData = brandIdData.toString();
                            chatHashMap.put("brandId", brandIdData);
                          }
                        }
                                                
                    
        return chatHashMap;
    }//parseCursor



    public void upsert__db(String id, BrandManager model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<BrandManager>  getAll__db() {
        DataList<BrandManager> modelList = new DataList<BrandManager>();
        // Select All Query
        String selectQuery = "SELECT  * FROM BrandManager";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    BrandManagerRepository repo = restAdapter.createRepository(BrandManagerRepository.class);
                    modelList.add((BrandManager)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<BrandManager>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   BrandManager modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("BrandManager", values, "id = ?",
                new String[] { id });
    }

}
