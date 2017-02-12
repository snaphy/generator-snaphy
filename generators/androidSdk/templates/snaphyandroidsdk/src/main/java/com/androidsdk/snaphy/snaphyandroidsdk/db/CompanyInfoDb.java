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

import com.androidsdk.snaphy.snaphyandroidsdk.models.CompanyInfo;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CompanyInfoRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class CompanyInfoDb extends DbHandler<CompanyInfo, String DATABASE_NAME, CompanyInfoRepository> {
  public CompanyInfoDb(Context context, RestAdapter restAdapter){
    super(context, "CompanyInfo", DATABASE_NAME, restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                    
    String CREATE_CompanyInfo_TABLE = "CREATE TABLE IF NOT EXISTS CompanyInfo (  type TEXT, html TEXT, edited TEXT, id TEXT PRIMARY KEY)";
    db.execSQL(CREATE_CompanyInfo_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS CompanyInfo");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, CompanyInfo modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("CompanyInfo", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(CompanyInfo modelData){
      ContentValues values = new ContentValues();
                       
                                                            String typeData = "";
                        if(modelData.getType() != null){
                          typeData = modelData.getType().toString();
                        }
                                                values.put("type", typeData);
                                
                                                            String htmlData = "";
                        if(modelData.getHtml() != null){
                          htmlData = modelData.getHtml().toString();
                        }
                                                values.put("html", htmlData);
                                
                                                            String editedData = "";
                        if(modelData.getEdited() != null){
                          editedData = modelData.getEdited().toString();
                        }
                                                values.put("edited", editedData);
                                
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
                  
        return values;
    }



    // Getting single c
    public   CompanyInfo get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("CompanyInfo", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    CompanyInfoRepository repo = restAdapter.createRepository(CompanyInfoRepository.class);
                    return (CompanyInfo)repo.createObject(hashMap);
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
    public   CompanyInfo get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("CompanyInfo", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    CompanyInfoRepository repo = restAdapter.createRepository(CompanyInfoRepository.class);
                    return (CompanyInfo)repo.createObject(hashMap);
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

                      
                                                            String typeData = "";
                        if(cursor.getString(0) != null){
                          typeData = cursor.getString(0);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            String htmlData = "";
                        if(cursor.getString(1) != null){
                          htmlData = cursor.getString(1);
                          if(htmlData != null){
                            htmlData = (String)htmlData;
                            hashMap.put("html", htmlData);
                          }
                        }
                                                
                                
                                                            String editedData = "";
                        if(cursor.getString(2) != null){
                          editedData = cursor.getString(2);
                          if(editedData != null){
                            editedData = (String)editedData;
                            hashMap.put("edited", editedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(3) != null){
                          idData = cursor.getString(3);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, CompanyInfo model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<CompanyInfo>  getAll__db() {
        DataList<CompanyInfo> modelList = new DataList<CompanyInfo>();
        // Select All Query
        String selectQuery = "SELECT  * FROM CompanyInfo";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    CompanyInfoRepository repo = restAdapter.createRepository(CompanyInfoRepository.class);
                    modelList.add((CompanyInfo)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<CompanyInfo>) modelList;
    }


    // Getting All Data where
    public DataList<CompanyInfo>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<CompanyInfo> modelList = new DataList<CompanyInfo>();
        // Select All Query
        String selectQuery = "SELECT  * FROM CompanyInfo WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    CompanyInfoRepository repo = restAdapter.createRepository(CompanyInfoRepository.class);
                    modelList.add((CompanyInfo)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<CompanyInfo>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   CompanyInfo modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("CompanyInfo", values, "id = ?",
                new String[] { id });
    }

}
