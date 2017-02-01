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
                                                                                                                                               
    String CREATE_AmazonImage_TABLE = "CREATE TABLE  AmazonImage IF NOT EXISTS (  name TEXT, container TEXT, type TEXT, url TEXT, id TEXT PRIMARY KEY)";
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
                  
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }


    // Getting single cont
    public   AmazonImage get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("AmazonImage", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        AmazonImageRepository repo = restAdapter.createRepository(AmazonImageRepository.class);
                        return (AmazonImage)repo.createObject(chatHashMap);
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

                      
                                                            String nameData;
                        if(cursor.getString(0) != null){
                          nameData = cursor.getString(0);
                          if(nameData != null){
                            nameData = (String)nameData;
                            chatHashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            String containerData;
                        if(cursor.getString(1) != null){
                          containerData = cursor.getString(1);
                          if(containerData != null){
                            containerData = (String)containerData;
                            chatHashMap.put("container", containerData);
                          }
                        }
                                                
                                
                                                            String typeData;
                        if(cursor.getString(2) != null){
                          typeData = cursor.getString(2);
                          if(typeData != null){
                            typeData = (String)typeData;
                            chatHashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> urlData = new Map<>();
                        if(cursor.getString(3) != null){
                          urlData = new Gson().fromJson(cursor.getString(3), Map.class);
                          if(urlData != null){
                            urlData = (Map<String, Object>)urlData;
                            chatHashMap.put("url", urlData);
                          }
                        }
                                                
                                
                                                            String idData;
                        if(cursor.getString(4) != null){
                          idData = cursor.getString(4);
                          if(idData != null){
                            idData = (Object)idData;
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                    
        return chatHashMap;
    }//parseCursor



    public void upsert__db(String id, AmazonImage model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<AmazonImage>  getAll__db() {
        DataList<AmazonImage> modelList = new DataList<AmazonImage>();
        // Select All Query
        String selectQuery = "SELECT  * FROM AmazonImage";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    AmazonImageRepository repo = restAdapter.createRepository(AmazonImageRepository.class);
                    modelList.add((AmazonImage)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<AmazonImage>) modelList;
    }








}
