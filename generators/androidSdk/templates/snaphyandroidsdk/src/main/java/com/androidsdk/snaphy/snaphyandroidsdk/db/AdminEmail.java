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
                                                                                                                                
    String CREATE_AdminEmail_TABLE = "CREATE TABLE  AdminEmail IF NOT EXISTS ( id TEXT PRIMARY KEY, to TEXT, from TEXT, subject TEXT, text TEXT, html TEXT, id TEXT)";
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
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

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
                  
        if(model.getId() != null){
            values.put("id", model.getId().toString());
        }
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



}
