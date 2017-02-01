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
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
                           
        
    String CREATE_HotDeal_TABLE = "CREATE TABLE  HotDeal IF NOT EXISTS (  title TEXT, description TEXT, image TEXT, url TEXT, price NUMBER, status TEXT, expiryDate TEXT, added TEXT, updated TEXT, id TEXT PRIMARY KEY, categoryId TEXT, brandId TEXT)";
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
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   HotDeal get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("HotDeal", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = new HashMap<>();

                                      
                                                                                    String titleData;
                                if(cursor.getString(0) != null){
                                  titleData = cursor.getString(0);
                                  if(titleData != null){
                                    titleData = (String)titleData;
                                    chatHashMap.put("title", titleData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String descriptionData;
                                if(cursor.getString(1) != null){
                                  descriptionData = cursor.getString(1);
                                  if(descriptionData != null){
                                    descriptionData = (String)descriptionData;
                                    chatHashMap.put("description", descriptionData);
                                  }
                                }
                                                                        
                                                        
                                                                                    Map<String, Object> imageData = new Map<>();
                                if(cursor.getString(2) != null){
                                  imageData = new Gson().fromJson(cursor.getString(2), Map.class);
                                  if(imageData != null){
                                    imageData = (Map<String, Object>)imageData;
                                    chatHashMap.put("image", imageData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String urlData;
                                if(cursor.getString(3) != null){
                                  urlData = cursor.getString(3);
                                  if(urlData != null){
                                    urlData = (String)urlData;
                                    chatHashMap.put("url", urlData);
                                  }
                                }
                                                                        
                                                        
                                                                                    double priceData;  
                                  priceData = cursor.getInt(4);
                                  priceData = (double)priceData;
                                  chatHashMap.put("price", priceData);
                              
                              
                                                                        
                                                        
                                                                                    String statusData;
                                if(cursor.getString(5) != null){
                                  statusData = cursor.getString(5);
                                  if(statusData != null){
                                    statusData = (String)statusData;
                                    chatHashMap.put("status", statusData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String expiryDateData;
                                if(cursor.getString(6) != null){
                                  expiryDateData = cursor.getString(6);
                                  if(expiryDateData != null){
                                    expiryDateData = (String)expiryDateData;
                                    chatHashMap.put("expiryDate", expiryDateData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String addedData;
                                if(cursor.getString(7) != null){
                                  addedData = cursor.getString(7);
                                  if(addedData != null){
                                    addedData = (String)addedData;
                                    chatHashMap.put("added", addedData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String updatedData;
                                if(cursor.getString(8) != null){
                                  updatedData = cursor.getString(8);
                                  if(updatedData != null){
                                    updatedData = (String)updatedData;
                                    chatHashMap.put("updated", updatedData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String idData;
                                if(cursor.getString(9) != null){
                                  idData = cursor.getString(9);
                                  if(idData != null){
                                    idData = (Object)idData;
                                    chatHashMap.put("id", idData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String categoryIdData;
                                if(cursor.getString(10) != null){
                                  categoryIdData = cursor.getString(10);
                                  if(categoryIdData != null){
                                    categoryIdData = (Object)categoryIdData;
                                    chatHashMap.put("categoryId", categoryIdData);
                                  }
                                }
                                                                        
                                                        
                                                                                    String brandIdData;
                                if(cursor.getString(11) != null){
                                  brandIdData = cursor.getString(11);
                                  if(brandIdData != null){
                                    brandIdData = (Object)brandIdData;
                                    chatHashMap.put("brandId", brandIdData);
                                  }
                                }
                                                                        
                                    

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        HotDealRepository repo = restAdapter.createRepository(HotDealRepository.class);
                        return (HotDeal)repo.createObject(chatHashMap);
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
