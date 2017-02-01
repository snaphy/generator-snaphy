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
                                                                                                                                                                                                                                                                                                                 
    String CREATE_Brand_TABLE = "CREATE TABLE  Brand IF NOT EXISTS (  added TEXT, updated TEXT, name TEXT, image TEXT, trending TEXT, facebookUrl TEXT, googleUrl TEXT, instagramUrl TEXT, status TEXT, associatedEmail TEXT, id TEXT PRIMARY KEY)";
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
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   Brand get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Brand", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        BrandRepository repo = restAdapter.createRepository(BrandRepository.class);
                        return (Brand)repo.createObject(chatHashMap);
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

    } //get__db



    private HashMap<String, Object> parseCursor(Cursor cursor ){
      HashMap<String, Object> chatHashMap = new HashMap<>();

                      
                                                            String addedData;
                        if(cursor.getString(0) != null){
                          addedData = cursor.getString(0);
                          if(addedData != null){
                            addedData = (String)addedData;
                            chatHashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData;
                        if(cursor.getString(1) != null){
                          updatedData = cursor.getString(1);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            chatHashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String nameData;
                        if(cursor.getString(2) != null){
                          nameData = cursor.getString(2);
                          if(nameData != null){
                            nameData = (String)nameData;
                            chatHashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> imageData = new Map<>();
                        if(cursor.getString(3) != null){
                          imageData = new Gson().fromJson(cursor.getString(3), Map.class);
                          if(imageData != null){
                            imageData = (Map<String, Object>)imageData;
                            chatHashMap.put("image", imageData);
                          }
                        }
                                                
                                
                                                            String trendingData;
                        if(cursor.getString(4) != null){
                          trendingData = cursor.getString(4);
                          if(trendingData != null){
                            trendingData = (String)trendingData;
                            chatHashMap.put("trending", trendingData);
                          }
                        }
                                                
                                
                                                            String facebookUrlData;
                        if(cursor.getString(5) != null){
                          facebookUrlData = cursor.getString(5);
                          if(facebookUrlData != null){
                            facebookUrlData = (String)facebookUrlData;
                            chatHashMap.put("facebookUrl", facebookUrlData);
                          }
                        }
                                                
                                
                                                            String googleUrlData;
                        if(cursor.getString(6) != null){
                          googleUrlData = cursor.getString(6);
                          if(googleUrlData != null){
                            googleUrlData = (String)googleUrlData;
                            chatHashMap.put("googleUrl", googleUrlData);
                          }
                        }
                                                
                                
                                                            String instagramUrlData;
                        if(cursor.getString(7) != null){
                          instagramUrlData = cursor.getString(7);
                          if(instagramUrlData != null){
                            instagramUrlData = (String)instagramUrlData;
                            chatHashMap.put("instagramUrl", instagramUrlData);
                          }
                        }
                                                
                                
                                                            String statusData;
                        if(cursor.getString(8) != null){
                          statusData = cursor.getString(8);
                          if(statusData != null){
                            statusData = (String)statusData;
                            chatHashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String associatedEmailData;
                        if(cursor.getString(9) != null){
                          associatedEmailData = cursor.getString(9);
                          if(associatedEmailData != null){
                            associatedEmailData = (String)associatedEmailData;
                            chatHashMap.put("associatedEmail", associatedEmailData);
                          }
                        }
                                                
                                
                                                            String idData;
                        if(cursor.getString(10) != null){
                          idData = cursor.getString(10);
                          if(idData != null){
                            idData = (Object)idData;
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                    
        return chatHashMap;
    }//parseCursor



    public void upsert__db(String id, Brand model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Brand>  getAll__db() {
        DataList<Brand> modelList = new DataList<Brand>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Brand";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    BrandRepository repo = restAdapter.createRepository(BrandRepository.class);
                    modelList.add((Brand)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Brand>) modelList;
    }








}
