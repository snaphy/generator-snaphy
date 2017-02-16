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

import com.androidsdk.snaphy.snaphyandroidsdk.models.RoleMapping;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.RoleMappingRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class RoleMappingDb extends SQLiteOpenHelper {

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

  public RoleMappingDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "RoleMapping";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = this.getWritableDatabase();
    onCreate(db);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                
    
    String CREATE_RoleMapping_TABLE = "CREATE TABLE IF NOT EXISTS RoleMapping(  id TEXT PRIMARY KEY, principalType TEXT, principalId TEXT, roleId TEXT, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_RoleMapping_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS RoleMapping");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (final String id, final RoleMapping modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("RoleMapping", null, values);
                db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(RoleMapping modelData){
      ContentValues values = new ContentValues();
                       
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
                                
                                                            String principalTypeData = "";
                        if(modelData.getPrincipalType() != null){
                          principalTypeData = modelData.getPrincipalType().toString();
                        }
                                                values.put("principalType", principalTypeData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String principalIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getPrincipalId");
                              if(method.invoke(modelData) != null){
                                //principalIdData = modelData.getPrincipalId().toString();
                                principalIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("principalId", principalIdData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String roleIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getRoleId");
                              if(method.invoke(modelData) != null){
                                //roleIdData = modelData.getRoleId().toString();
                                roleIdData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("roleId", roleIdData);
                  

        //Add the updated data property value to be 1
        values.put("_DATA_UPDATED", 1);
        return values;
    }



    // Getting single c
    public   RoleMapping get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("RoleMapping", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    db.close(); // Closing database connection
                    if (hashMap != null) {
                        RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                        repo.addStorage(context);
                        return (RoleMapping)repo.createObject(hashMap);
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
    public   RoleMapping get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("RoleMapping", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    db.close(); // Closing database connection

                    if (hashMap != null) {
                        RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                        repo.addStorage(context);
                        return (RoleMapping)repo.createObject(hashMap);
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

                      
                                                            String idData = "";
                        if(cursor.getString(0) != null){
                          idData = cursor.getString(0);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String principalTypeData = "";
                        if(cursor.getString(1) != null){
                          principalTypeData = cursor.getString(1);
                          if(principalTypeData != null){
                            principalTypeData = (String)principalTypeData;
                            hashMap.put("principalType", principalTypeData);
                          }
                        }
                                                
                                
                                                            String principalIdData = "";
                        if(cursor.getString(2) != null){
                          principalIdData = cursor.getString(2);
                          if(principalIdData != null){
                            principalIdData = principalIdData.toString();
                            hashMap.put("principalId", principalIdData);
                          }
                        }
                                                
                                
                                                            String roleIdData = "";
                        if(cursor.getString(3) != null){
                          roleIdData = cursor.getString(3);
                          if(roleIdData != null){
                            roleIdData = roleIdData.toString();
                            hashMap.put("roleId", roleIdData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, RoleMapping model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<RoleMapping>  getAll__db() {
        DataList<RoleMapping> modelList = new DataList<RoleMapping>();
        // Select All Query
        String selectQuery = "SELECT  * FROM RoleMapping";

        SQLiteDatabase db = this.getWritableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
            return (DataList<RoleMapping>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                    repo.addStorage(context);
                    modelList.add((RoleMapping)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        // return contact list
        return (DataList<RoleMapping>) modelList;
    }


    // Getting All Data where
    public DataList<RoleMapping>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<RoleMapping> modelList = new DataList<RoleMapping>();
        // Select All Query
        String selectQuery = "SELECT  * FROM RoleMapping WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!(cursor.moveToFirst()) || cursor.getCount() == 0){
            return (DataList<RoleMapping>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    RoleMappingRepository repo = restAdapter.createRepository(RoleMappingRepository.class);
                    repo.addStorage(context);
                    modelList.add((RoleMapping)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        db.close();
        // return contact list
        return (DataList<RoleMapping>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM RoleMapping WHERE " + whereKey +"='"+ whereKeyValue + "'" ;
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
                db.update("RoleMapping", values, "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
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
                db.delete("RoleMapping", "_DATA_UPDATED = 1 AND " + whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                db.close();
            }
        }).start();

    }


    // Updating single contact
    public void update__db(final String id,   final RoleMapping modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("RoleMapping", values, "id = ?",
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
                db.update("RoleMapping", values, "_DATA_UPDATED = 1", null);
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
                db.delete("RoleMapping", "_DATA_UPDATED = 0", null);
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
