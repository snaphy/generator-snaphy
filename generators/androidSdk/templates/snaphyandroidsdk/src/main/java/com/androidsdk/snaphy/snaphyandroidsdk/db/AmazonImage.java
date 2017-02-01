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



public class AmazonImageDb extends DbHandler<AmazonImage, AmazonImageRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "AmazonImage", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                            
    String CREATE_AmazonImage_TABLE = "CREATE TABLE  AmazonImage IF NOT EXISTS ( id TEXT PRIMARY KEY, name TEXT, container TEXT, type TEXT, url TEXT, id TEXT)";
    db.execSQL(CREATE_AmazonImage_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS AmazonImage");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, AmazonImage model) {

        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String nameData;
                        if(model.getName() != null){
                          nameData = model.getName().toString();
                        }
                                                values.put("name", nameData);
                                
                                                            String containerData;
                        if(model.getContainer() != null){
                          containerData = model.getContainer().toString();
                        }
                                                values.put("container", containerData);
                                
                                                            String typeData;
                        if(model.getType() != null){
                          typeData = model.getType().toString();
                        }
                                                values.put("type", typeData);
                                
                                                            String urlData;
                        if(model.getUrl() != null){
                          urlData = new Gson().toJson(model.getUrl(), HashMap.class);
                        }
                                                values.put("url", urlData);
                                
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
