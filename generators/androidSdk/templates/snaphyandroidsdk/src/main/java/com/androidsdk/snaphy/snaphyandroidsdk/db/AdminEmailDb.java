package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
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
  public AdminEmailDb(Context context, RestAdapter restAdapter){
    super(context, "AdminEmail", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                          
    String CREATE_AdminEmail_TABLE = "CREATE TABLE  AdminEmail IF NOT EXISTS (  to TEXT, from TEXT, subject TEXT, text TEXT, html TEXT, id TEXT PRIMARY KEY)";
    db.execSQL(CREATE_AdminEmail_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS AdminEmail");
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
                       
                                                            String toData = "";
                        if(modelData.getTo() != null){
                          toData =modelData.getTo().toString();
                        }
                                                values.put("to", toData);
                                
                                                            String fromData = "";
                        if(modelData.getFrom() != null){
                          fromData =modelData.getFrom().toString();
                        }
                                                values.put("from", fromData);
                                
                                                            String subjectData = "";
                        if(modelData.getSubject() != null){
                          subjectData =modelData.getSubject().toString();
                        }
                                                values.put("subject", subjectData);
                                
                                                            String textData = "";
                        if(modelData.getText() != null){
                          textData =modelData.getText().toString();
                        }
                                                values.put("text", textData);
                                
                                                            String htmlData = "";
                        if(modelData.getHtml() != null){
                          htmlData =modelData.getHtml().toString();
                        }
                                                values.put("html", htmlData);
                                
                                                            String idData = "";
                        if(modelData.getId() != null){
                          idData =modelData.getId().toString();
                        }
                                                values.put("id", idData);
                  
        return values;
    }



    // Getting single cont
    public   AdminEmail get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AdminEmail", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                
                if (chatHashMap != null) {
                    AdminEmailRepository repo = restAdapter.createRepository(AdminEmailRepository.class);
                    return (AdminEmail)repo.createObject(chatHashMap);
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

                if (HashMap != null) {
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
      HashMap<String, Object> chatHashMap = new HashMap<>();

                      
                                                            String toData = "";
                        if(cursor.getString(0) != null){
                          toData = cursor.getString(0);
                          if(toData != null){
                            toData = toData.toString();
                            chatHashMap.put("to", toData);
                          }
                        }
                                                
                                
                                                            String fromData = "";
                        if(cursor.getString(1) != null){
                          fromData = cursor.getString(1);
                          if(fromData != null){
                            fromData = fromData.toString();
                            chatHashMap.put("from", fromData);
                          }
                        }
                                                
                                
                                                            String subjectData = "";
                        if(cursor.getString(2) != null){
                          subjectData = cursor.getString(2);
                          if(subjectData != null){
                            subjectData = subjectData.toString();
                            chatHashMap.put("subject", subjectData);
                          }
                        }
                                                
                                
                                                            String textData = "";
                        if(cursor.getString(3) != null){
                          textData = cursor.getString(3);
                          if(textData != null){
                            textData = textData.toString();
                            chatHashMap.put("text", textData);
                          }
                        }
                                                
                                
                                                            String htmlData = "";
                        if(cursor.getString(4) != null){
                          htmlData = cursor.getString(4);
                          if(htmlData != null){
                            htmlData = htmlData.toString();
                            chatHashMap.put("html", htmlData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(5) != null){
                          idData = cursor.getString(5);
                          if(idData != null){
                            idData = idData.toString();
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                    
        return chatHashMap;
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
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    AdminEmailRepository repo = restAdapter.createRepository(AdminEmailRepository.class);
                    modelList.add((AdminEmail)repo.createObject(chatHashMap));
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

}
