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



public class BrandDb extends DbHandler<Brand, BrandRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "Brand", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                    
    String CREATE_Brand_TABLE = "CREATE TABLE  Brand IF NOT EXISTS ( id TEXT PRIMARY KEY, added TEXT, updated TEXT, name TEXT, image TEXT, trending TEXT, facebookUrl TEXT, googleUrl TEXT, instagramUrl TEXT, status TEXT, associatedEmail TEXT, id TEXT)";
    db.execSQL(CREATE_Brand_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS Brand");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, Brand model) {

        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String addedData;
                        if(model.getAdded() != null){
                          addedData = model.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
                                                            String updatedData;
                        if(model.getUpdated() != null){
                          updatedData = model.getUpdated().toString();
                        }
                                                values.put("updated", updatedData);
                                
                                                            String nameData;
                        if(model.getName() != null){
                          nameData = model.getName().toString();
                        }
                                                values.put("name", nameData);
                                
                                                            String imageData;
                        if(model.getImage() != null){
                          imageData = new Gson().toJson(model.getImage(), HashMap.class);
                        }
                                                values.put("image", imageData);
                                
                                                            String trendingData;
                        if(model.getTrending() != null){
                          trendingData = model.getTrending().toString();
                        }
                                                values.put("trending", trendingData);
                                
                                                            String facebookUrlData;
                        if(model.getFacebookUrl() != null){
                          facebookUrlData = model.getFacebookUrl().toString();
                        }
                                                values.put("facebookUrl", facebookUrlData);
                                
                                                            String googleUrlData;
                        if(model.getGoogleUrl() != null){
                          googleUrlData = model.getGoogleUrl().toString();
                        }
                                                values.put("googleUrl", googleUrlData);
                                
                                                            String instagramUrlData;
                        if(model.getInstagramUrl() != null){
                          instagramUrlData = model.getInstagramUrl().toString();
                        }
                                                values.put("instagramUrl", instagramUrlData);
                                
                                                            String statusData;
                        if(model.getStatus() != null){
                          statusData = model.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
                                                            String associatedEmailData;
                        if(model.getAssociatedEmail() != null){
                          associatedEmailData = model.getAssociatedEmail().toString();
                        }
                                                values.put("associatedEmail", associatedEmailData);
                                
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
