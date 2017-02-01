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



public class HotDealDb extends DbHandler<HotDeal, HotDealRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "HotDeal", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                                                                                                                                                        
    String CREATE_HotDeal_TABLE = "CREATE TABLE  HotDeal IF NOT EXISTS ( id TEXT PRIMARY KEY, title TEXT, description TEXT, image TEXT, url TEXT, price NUMBER, status TEXT, expiryDate TEXT, added TEXT, updated TEXT, id TEXT, categoryId TEXT, brandId TEXT)";
    db.execSQL(CREATE_HotDeal_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS HotDeal");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, HotDeal model) {

        SQLiteDatabase db = this.getWritableDatabase();
    /*    HashMap<String, Object> hashMap = (HashMap<String, Object>) chat.convertMap();
        String object = toJsonString(hashMap);
        ContentValues values = new ContentValues();
        values.put("ID", chat.getId().toString()); // Contact Name
        values.put("OBJECT", object); // Contact Phone Number*/

        // Inserting Row
        ContentValues values = new ContentValues();
                       
                                                            String titleData;
                        if(model.getTitle() != null){
                          titleData = model.getTitle().toString();
                        }
                                                values.put("title", titleData);
                                
                                                            String descriptionData;
                        if(model.getDescription() != null){
                          descriptionData = model.getDescription().toString();
                        }
                                                values.put("description", descriptionData);
                                
                                                            String imageData;
                        if(model.getImage() != null){
                          imageData = new Gson().toJson(model.getImage(), HashMap.class);
                        }
                                                values.put("image", imageData);
                                
                                                            String urlData;
                        if(model.getUrl() != null){
                          urlData = model.getUrl().toString();
                        }
                                                values.put("url", urlData);
                                
                                                            double priceData;
                        if(model.getPrice() != null){
                          priceData = (double)model.getPrice();
                        }
                                                values.put("price", priceData);
                                
                                                            String statusData;
                        if(model.getStatus() != null){
                          statusData = model.getStatus().toString();
                        }
                                                values.put("status", statusData);
                                
                                                            String expiryDateData;
                        if(model.getExpiryDate() != null){
                          expiryDateData = model.getExpiryDate().toString();
                        }
                                                values.put("expiryDate", expiryDateData);
                                
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
                                
                                                            String idData;
                        if(model.getId() != null){
                          idData = model.getId().toString();
                        }
                                                values.put("id", idData);
                                
                                                            String categoryIdData;
                        if(model.getCategoryId() != null){
                          categoryIdData = model.getCategoryId().toString();
                        }
                                                values.put("categoryId", categoryIdData);
                                
                                                            String brandIdData;
                        if(model.getBrandId() != null){
                          brandIdData = model.getBrandId().toString();
                        }
                                                values.put("brandId", brandIdData);
                  
        if(model.getId() != null){
            values.put("id", model.getId().toString());
        }
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



}
