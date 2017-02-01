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



public class AdminEmailDb extends DbHandler<AdminEmail, AdminEmailRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
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


    public void insert__db (String id, AdminEmail model) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String toData;
                        if(model.getTo() != null){
                          toData = model.getTo().toString();
                        }
                                                values.put("to", toData);
                                
                                                            String fromData;
                        if(model.getFrom() != null){
                          fromData = model.getFrom().toString();
                        }
                                                values.put("from", fromData);
                                
                                                            String subjectData;
                        if(model.getSubject() != null){
                          subjectData = model.getSubject().toString();
                        }
                                                values.put("subject", subjectData);
                                
                                                            String textData;
                        if(model.getText() != null){
                          textData = model.getText().toString();
                        }
                                                values.put("text", textData);
                                
                                                            String htmlData;
                        if(model.getHtml() != null){
                          htmlData = model.getHtml().toString();
                        }
                                                values.put("html", htmlData);
                                
                                                            String idData;
                        if(model.getId() != null){
                          idData = model.getId().toString();
                        }
                                                values.put("id", idData);
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   AdminEmail get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AdminEmail", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = new HashMap<>();

                                      
                                                                                    String toData;
                                if(cursor.getString(0) != null){
                                  toData = cursor.getString(0);
                                  if(toData != null){
                                    toData = (Object)toData;
                                    chatHashMap.put("to", toData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String fromData;
                                if(cursor.getString(1) != null){
                                  fromData = cursor.getString(1);
                                  if(fromData != null){
                                    fromData = (Object)fromData;
                                    chatHashMap.put("from", fromData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String subjectData;
                                if(cursor.getString(2) != null){
                                  subjectData = cursor.getString(2);
                                  if(subjectData != null){
                                    subjectData = (Object)subjectData;
                                    chatHashMap.put("subject", subjectData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String textData;
                                if(cursor.getString(3) != null){
                                  textData = cursor.getString(3);
                                  if(textData != null){
                                    textData = (Object)textData;
                                    chatHashMap.put("text", textData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String htmlData;
                                if(cursor.getString(4) != null){
                                  htmlData = cursor.getString(4);
                                  if(htmlData != null){
                                    htmlData = (Object)htmlData;
                                    chatHashMap.put("html", htmlData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String idData;
                                if(cursor.getString(5) != null){
                                  idData = cursor.getString(5);
                                  if(idData != null){
                                    idData = (Object)idData;
                                    chatHashMap.put("id", idData);
                                  }
                                }
                                                                        
                                    

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
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
        } else {
            return null;
        }

    }




}
