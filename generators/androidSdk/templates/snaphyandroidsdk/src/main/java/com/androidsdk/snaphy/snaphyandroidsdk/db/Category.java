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



public class CategoryDb extends DbHandler<Category, CategoryRepository> {
  public ChatDb(Context context, RestAdapter restAdapter){
    super(context, "Category", restAdapter);
  }

  // Creating Tables
  @Override
  public void onCreate(SQLiteDatabase db) {
                                                                                                                    
    String CREATE_Category_TABLE = "CREATE TABLE  Category IF NOT EXISTS (  name TEXT, added TEXT, updated TEXT, id TEXT PRIMARY KEY)";
    db.execSQL(CREATE_Category_TABLE);
  }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS Category");
            // Create tables again
            onCreate(db);
    }


    public void insert__db (String id, Category modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Inserting Row
        ContentValues values = getContentValues(modelData);
        db.insert(TABLE, null, values);
        db.close(); // Closing database connection
    }



    public ContentValues getContentValues(Category modelData){
      ContentValues values = new ContentValues();
                       
                                                            String nameData;
                        if(modelData.getName() != null){
                          nameData = modelData.getName().toString();
                        }
                                                values.put("name", nameData);
                                
                                                            String addedData;
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                        }
                                                values.put("added", addedData);
                                
                                                            String updatedData;
                        if(modelData.getUpdated() != null){
                          updatedData = modelData.getUpdated().toString();
                        }
                                                values.put("updated", updatedData);
                                
                                                            String idData;
                        if(modelData.getId() != null){
                          idData =modelData.getId().toString();
                        }
                                                values.put("id", idData);
                  
        return values;
    }



    // Getting single cont
    public   Category get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query("Category", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                HashMap<String, Object> chatHashMap = parseCursor(cursor);

                cursor.close();
                db.close(); // Closing database connection
                if (object != null) {
                    if (chatHashMap != null) {
                        CategoryRepository repo = restAdapter.createRepository(CategoryRepository.class);
                        return (Category)repo.createObject(chatHashMap);
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
                                                
                                
                                                            String addedData;
                        if(cursor.getString(1) != null){
                          addedData = cursor.getString(1);
                          if(addedData != null){
                            addedData = (String)addedData;
                            chatHashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData;
                        if(cursor.getString(2) != null){
                          updatedData = cursor.getString(2);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            chatHashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String idData;
                        if(cursor.getString(3) != null){
                          idData = cursor.getString(3);
                          if(idData != null){
                            idData = (Object)idData;
                            chatHashMap.put("id", idData);
                          }
                        }
                                                
                    
        return chatHashMap;
    }//parseCursor



    public void upsert__db(String id, Category model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Category>  getAll__db() {
        DataList<Category> modelList = new DataList<Category>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Category";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
               
                HashMap<String, Object> chatHashMap = parseCursor(cursor);
                if(chatHashMap != null){
                    CategoryRepository repo = restAdapter.createRepository(CategoryRepository.class);
                    modelList.add((Category)repo.createObject(chatHashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        // return contact list
        return (DataList<Category>) modelList;
    }


    // Updating single contact
    public int update__db(String id,   Category modelData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = getContentValues(modelData);
        // updating row
        return db.update(TABLE, values, KEY_ID + " = ?",
                new String[] { id });
    }








}
