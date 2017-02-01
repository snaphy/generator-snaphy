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



public class CompanyInfoDb extends DbHandler<CompanyInfo, CompanyInfoRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "CompanyInfo", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                        
    String CREATE_CompanyInfo_TABLE = "CREATE TABLE  CompanyInfo IF NOT EXISTS ( id TEXT PRIMARY KEY, type TEXT, html TEXT, edited TEXT, id TEXT)";
    db.execSQL(CREATE_CompanyInfo_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS CompanyInfo");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, CompanyInfo model) {

        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String typeData;
                        if(model.getType() != null){
                          typeData = model.getType().toString();
                        }
                                                values.put("type", typeData);
                                
                                                            String htmlData;
                        if(model.getHtml() != null){
                          htmlData = model.getHtml().toString();
                        }
                                                values.put("html", htmlData);
                                
                                                            String editedData;
                        if(model.getEdited() != null){
                          editedData = model.getEdited().toString();
                        }
                                                values.put("edited", editedData);
                                
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
