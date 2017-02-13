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

import com.androidsdk.snaphy.snaphyandroidsdk.models.AdminEmail;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AdminEmailRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class AdminEmailDb extends DbHandler<AdminEmail, AdminEmailRepository> {
  public AdminEmailDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    super(context, "AdminEmail", DATABASE_NAME, restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                      
    
    String CREATE_AdminEmail_TABLE = "CREATE TABLE IF NOT EXISTS AdminEmail (  to TEXT, from TEXT, subject TEXT, text TEXT, html TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
    db.execSQL(CREATE_AdminEmail_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            //db.execSQL("DROP TABLE IF EXISTS AdminEmail");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, AdminEmail modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert("AdminEmail", null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(AdminEmail modelData){
      ContentValues values = new ContentValues();
                       
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String toData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getTo");
                              if(method.invoke(modelData) != null){
                                //toData = modelData.getTo().toString();
                                toData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("to", toData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String fromData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getFrom");
                              if(method.invoke(modelData) != null){
                                //fromData = modelData.getFrom().toString();
                                fromData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("from", fromData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String subjectData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getSubject");
                              if(method.invoke(modelData) != null){
                                //subjectData = modelData.getSubject().toString();
                                subjectData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("subject", subjectData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String textData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getText");
                              if(method.invoke(modelData) != null){
                                //textData = modelData.getText().toString();
                                textData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("text", textData);
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String htmlData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getHtml");
                              if(method.invoke(modelData) != null){
                                //htmlData = modelData.getHtml().toString();
                                htmlData = (String) method.invoke(modelData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                                values.put("html", htmlData);
                                
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
        value.put(_DATA_UPDATED, 1);
        return values;
    }



    // Getting single c
    public   AdminEmail get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AdminEmail", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    AdminEmailRepository repo = restAdapter.createRepository(AdminEmailRepository.class);
                    return (AdminEmail)repo.createObject(hashMap);
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
    public   AdminEmail get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AdminEmail", null, whereKey + "=?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> hashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection

                if (hashMap != null) {
                    AdminEmailRepository repo = restAdapter.createRepository(AdminEmailRepository.class);
                    return (AdminEmail)repo.createObject(hashMap);
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

                      
                                                            String toData = "";
                        if(cursor.getString(0) != null){
                          toData = cursor.getString(0);
                          if(toData != null){
                            toData = toData.toString();
                            hashMap.put("to", toData);
                          }
                        }
                                                
                                
                                                            String fromData = "";
                        if(cursor.getString(1) != null){
                          fromData = cursor.getString(1);
                          if(fromData != null){
                            fromData = fromData.toString();
                            hashMap.put("from", fromData);
                          }
                        }
                                                
                                
                                                            String subjectData = "";
                        if(cursor.getString(2) != null){
                          subjectData = cursor.getString(2);
                          if(subjectData != null){
                            subjectData = subjectData.toString();
                            hashMap.put("subject", subjectData);
                          }
                        }
                                                
                                
                                                            String textData = "";
                        if(cursor.getString(3) != null){
                          textData = cursor.getString(3);
                          if(textData != null){
                            textData = textData.toString();
                            hashMap.put("text", textData);
                          }
                        }
                                                
                                
                                                            String htmlData = "";
                        if(cursor.getString(4) != null){
                          htmlData = cursor.getString(4);
                          if(htmlData != null){
                            htmlData = htmlData.toString();
                            hashMap.put("html", htmlData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(5) != null){
                          idData = cursor.getString(5);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                  
        return hashMap;
    }//parseCursor



    public void upsert__db(String id, AdminEmail model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<AdminEmail>  getAll__db() {
        DataList<AdminEmail> modelList = new DataList<AdminEmail>();
        // Select All Query
        String selectQuery = "SELECT  * FROM AdminEmail";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    AdminEmailRepository repo = restAdapter.createRepository(AdminEmailRepository.class);
                    modelList.add((AdminEmail)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<AdminEmail>) modelList;
    }


    // Getting All Data where
    public DataList<AdminEmail>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<AdminEmail> modelList = new DataList<AdminEmail>();
        // Select All Query
        String selectQuery = "SELECT  * FROM AdminEmail WHERE " + whereKey +"='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    AdminEmailRepository repo = restAdapter.createRepository(AdminEmailRepository.class);
                    modelList.add((AdminEmail)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<AdminEmail>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   AdminEmail modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update("AdminEmail", values, "id = ?",
                new String[] { id });
    }


    // Updating updated data property to new contact
    public int checkOldData__db() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("_DATA_UPDATED", 0);
        // updating row
        return db.update("AdminEmail", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = this.getWritableDatabase();
      db.delete("AdminEmail", "_DATA_UPDATED = 0", null);
      db.close();
    }

}
