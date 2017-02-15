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

import com.androidsdk.snaphy.snaphyandroidsdk.models.FacebookAccessToken;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookAccessTokenRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class FacebookAccessTokenDb extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    RestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";

    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;

  public FacebookAccessTokenDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.restAdapter = restAdapter;
    TABLE = "FacebookAccessToken";
    this.DATABASE_NAME = DATABASE_NAME;
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                      
    
    String CREATE_FacebookAccessToken_TABLE = "CREATE TABLE IF NOT EXISTS FacebookAccessToken (  FbUserId TEXT, token TEXT, expires TEXT, userId TEXT, type TEXT, appUserId TEXT, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_FacebookAccessToken_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS FacebookAccessToken");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, FacebookAccessToken modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("FacebookAccessToken", null, values);
        db.close(); // Closing database connection
    }





    public ContentValues getContentValues(FacebookAccessToken modelData){
      ContentValues values = new ContentValues();
                       
                                                            String FbUserIdData = "";
                        if(modelData.getFbUserId() != null){
                          FbUserIdData = modelData.getFbUserId().toString();
                        }
                                                values.put("FbUserId", FbUserIdData);
                                
                                                            String tokenData = "";
                        if(modelData.getToken() != null){
                          tokenData = modelData.getToken().toString();
                        }
                                                values.put("token", tokenData);
                                
                                                            String expiresData = "";
                        if(modelData.getExpires() != null){
                          expiresData = modelData.getExpires().toString();
                        }
                                                values.put("expires", expiresData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String userIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getUserId");
                              if(method.invoke(modelData) != null){
                                //userIdData = modelData.getUserId().toString();
                                userIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("userId", userIdData);
                                
                                                            String typeData = "";
                        if(modelData.getType() != null){
                          typeData = modelData.getType().toString();
                        }
                                                values.put("type", typeData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String appUserIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getAppUserId");
                              if(method.invoke(modelData) != null){
                                //appUserIdData = modelData.getAppUserId().toString();
                                appUserIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("appUserId", appUserIdData);
                  

        //Add the updated data property value to be 1
        values.put("_DATA_UPDATED", 1);
        return values;
    }



    // Getting single c
    public   FacebookAccessToken get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("FacebookAccessToken", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    FacebookAccessTokenRepository repo = restAdapter.createRepository(FacebookAccessTokenRepository.class);
                    return (FacebookAccessToken)repo.createObject(hashMap);
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




    // Getting single cont
    public   FacebookAccessToken get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("FacebookAccessToken", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    FacebookAccessTokenRepository repo = restAdapter.createRepository(FacebookAccessTokenRepository.class);
                    return (FacebookAccessToken)repo.createObject(hashMap);
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
      HashMap<String, Object> hashMap = new HashMap<>();

                      
                                                            String FbUserIdData = "";
                        if(cursor.getString(0) != null){
                          FbUserIdData = cursor.getString(0);
                          if(FbUserIdData != null){
                            FbUserIdData = (String)FbUserIdData;
                            hashMap.put("FbUserId", FbUserIdData);
                          }
                        }
                                                
                                
                                                            String tokenData = "";
                        if(cursor.getString(1) != null){
                          tokenData = cursor.getString(1);
                          if(tokenData != null){
                            tokenData = (String)tokenData;
                            hashMap.put("token", tokenData);
                          }
                        }
                                                
                                
                                                            String expiresData = "";
                        if(cursor.getString(2) != null){
                          expiresData = cursor.getString(2);
                          if(expiresData != null){
                            expiresData = (String)expiresData;
                            hashMap.put("expires", expiresData);
                          }
                        }
                                                
                                
                                                            String userIdData = "";
                        if(cursor.getString(3) != null){
                          userIdData = cursor.getString(3);
                          if(userIdData != null){
                            userIdData = userIdData.toString();
                            hashMap.put("userId", userIdData);
                          }
                        }
                                                
                                
                                                            String typeData = "";
                        if(cursor.getString(4) != null){
                          typeData = cursor.getString(4);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            String appUserIdData = "";
                        if(cursor.getString(5) != null){
                          appUserIdData = cursor.getString(5);
                          if(appUserIdData != null){
                            appUserIdData = appUserIdData.toString();
                            hashMap.put("appUserId", appUserIdData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, FacebookAccessToken model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<FacebookAccessToken>  getAll__db() {
        DataList<FacebookAccessToken> modelList = new DataList<FacebookAccessToken>();
        // Select All Query
        String selectQuery = "SELECT  * FROM FacebookAccessToken";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    FacebookAccessTokenRepository repo = restAdapter.createRepository(FacebookAccessTokenRepository.class);
                    modelList.add((FacebookAccessToken)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<FacebookAccessToken>) modelList;
    }


    // Getting All Data where
    public DataList<FacebookAccessToken>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<FacebookAccessToken> modelList = new DataList<FacebookAccessToken>();
        // Select All Query
        String selectQuery = "SELECT  * FROM FacebookAccessToken WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    FacebookAccessTokenRepository repo = restAdapter.createRepository(FacebookAccessTokenRepository.class);
                    modelList.add((FacebookAccessToken)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<FacebookAccessToken>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM FacebookAccessToken WHERE " + whereKey +"='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(String whereKey, String whereKeyValue) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        db.update("FacebookAccessToken", values, "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(String whereKey, String whereKeyValue) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("FacebookAccessToken", "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
        db.close();
    }


    // Updating single contact
    public void update__db(String id,   FacebookAccessToken modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        db.update("FacebookAccessToken", values, "id = ?",
                new String[] { id });
        db.close();
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        db.update("FacebookAccessToken", values, "_DATA_UPDATED = 1", null);
        db.close();
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete("FacebookAccessToken", "_DATA_UPDATED = 0", null);
      db.close();
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
    public void delete__db(String id) {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete(TABLE, KEY_ID + " = ?",
      new String[] { id });
      db.close();
    }

    public void reset__db(){
       SQLiteDatabase db = this.getWritableDatabase();
       db.delete(TABLE,null,null);
       db.close();
    }

}
