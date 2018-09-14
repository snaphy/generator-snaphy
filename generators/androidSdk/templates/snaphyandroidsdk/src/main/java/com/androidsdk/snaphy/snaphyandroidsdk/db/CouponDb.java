package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.GsonBuilder;
import android.database.Cursor;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;


import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.GetUpdatedQuery;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.ObjectCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.OnParseCursor;
import com.androidsdk.snaphy.snaphyandroidsdk.list.LazyList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Coupon;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CouponRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class CouponDb{

    // All Static variables
    SnaphyRestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";
    private Context context;
    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;



    public SQLiteDatabase getInstance(){
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
        return db;
    }

  public CouponDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Coupon";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Coupon _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`Coupon`", null, values);
    }





    public ContentValues getContentValues(Coupon _modelData){
      ContentValues values = new ContentValues();
                       
                                                            String idData = "";
                        if(_modelData.getId() != null){
                          idData = _modelData.getId().toString();
                          values.put("`id`", idData);
                        }
                                  
                                
                                                            String addedData = "";
                        if(_modelData.getAdded() != null){
                          addedData = _modelData.getAdded().toString();
                          values.put("`added`", addedData);
                        }
                                  
                                
                                                            String updatedData = "";
                        if(_modelData.getUpdated() != null){
                          updatedData = _modelData.getUpdated().toString();
                          values.put("`updated`", updatedData);
                        }
                                  
                                
                                                            String couponCodeData = "";
                        if(_modelData.getCouponCode() != null){
                          couponCodeData = _modelData.getCouponCode().toString();
                          values.put("`couponCode`", couponCodeData);
                        }
                                  
                                
                                                            String couponTitleData = "";
                        if(_modelData.getCouponTitle() != null){
                          couponTitleData = _modelData.getCouponTitle().toString();
                          values.put("`couponTitle`", couponTitleData);
                        }
                                  
                                
                                                            String couponNameData = "";
                        if(_modelData.getCouponName() != null){
                          couponNameData = _modelData.getCouponName().toString();
                          values.put("`couponName`", couponNameData);
                        }
                                  
                                
                                                            String typeData = "";
                        if(_modelData.getType() != null){
                          typeData = _modelData.getType().toString();
                          values.put("`type`", typeData);
                        }
                                  
                                
                                                            String statusData = "";
                        if(_modelData.getStatus() != null){
                          statusData = _modelData.getStatus().toString();
                          values.put("`status`", statusData);
                        }
                                  
                                
                                                            String couponDescriptionData = "";
                        if(_modelData.getCouponDescription() != null){
                          couponDescriptionData = _modelData.getCouponDescription().toString();
                          values.put("`couponDescription`", couponDescriptionData);
                        }
                                  
                                
                                                            double priorityData;
                        priorityData = (double)_modelData.getPriority();
                        values.put("`priority`", priorityData);
                                  
                                
                                                            double discountPercentData;
                        discountPercentData = (double)_modelData.getDiscountPercent();
                        values.put("`discountPercent`", discountPercentData);
                                  
                                
                                                            double discountAmountData;
                        discountAmountData = (double)_modelData.getDiscountAmount();
                        values.put("`discountAmount`", discountAmountData);
                                  
                                
                                                            String expiryDateData = "";
                        if(_modelData.getExpiryDate() != null){
                          expiryDateData = _modelData.getExpiryDate().toString();
                          values.put("`expiryDate`", expiryDateData);
                        }
                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Coupon get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Coupon", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        CouponRepository repo = restAdapter.createRepository(CouponRepository.class);
                        repo.addStorage(context);
                        return (Coupon)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
                }

            } else {
                return null;
            }
        } else {
            return null;
        }

    } //get__db




    // Getting single cont
    public   Coupon get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`Coupon`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        CouponRepository repo = restAdapter.createRepository(CouponRepository.class);
                        repo.addStorage(context);
                        return (Coupon)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
                }

            } else {
                return null;
            }
        } else {
            return null;
        }

    } //get__db




    private HashMap<String, Object> parseCursor(Cursor cursor ){
      HashMap<String, Object> hashMap = new HashMap<>();

                      
                                                            String idData = "";
                        if(cursor.getString(0) != null){
                          idData = cursor.getString(0);
                          if(idData != null){
                            idData = (String)idData;
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(1) != null){
                          addedData = cursor.getString(1);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(2) != null){
                          updatedData = cursor.getString(2);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String couponCodeData = "";
                        if(cursor.getString(3) != null){
                          couponCodeData = cursor.getString(3);
                          if(couponCodeData != null){
                            couponCodeData = (String)couponCodeData;
                            hashMap.put("couponCode", couponCodeData);
                          }
                        }
                                                
                                
                                                            String couponTitleData = "";
                        if(cursor.getString(4) != null){
                          couponTitleData = cursor.getString(4);
                          if(couponTitleData != null){
                            couponTitleData = (String)couponTitleData;
                            hashMap.put("couponTitle", couponTitleData);
                          }
                        }
                                                
                                
                                                            String couponNameData = "";
                        if(cursor.getString(5) != null){
                          couponNameData = cursor.getString(5);
                          if(couponNameData != null){
                            couponNameData = (String)couponNameData;
                            hashMap.put("couponName", couponNameData);
                          }
                        }
                                                
                                
                                                            String typeData = "";
                        if(cursor.getString(6) != null){
                          typeData = cursor.getString(6);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            String statusData = "";
                        if(cursor.getString(7) != null){
                          statusData = cursor.getString(7);
                          if(statusData != null){
                            statusData = (String)statusData;
                            hashMap.put("status", statusData);
                          }
                        }
                                                
                                
                                                            String couponDescriptionData = "";
                        if(cursor.getString(8) != null){
                          couponDescriptionData = cursor.getString(8);
                          if(couponDescriptionData != null){
                            couponDescriptionData = (String)couponDescriptionData;
                            hashMap.put("couponDescription", couponDescriptionData);
                          }
                        }
                                                
                                
                                                            double priorityData = (double)0;
                          priorityData = cursor.getInt(9);
                          priorityData = (double)priorityData;
                          hashMap.put("priority", priorityData);


                                                
                                
                                                            double discountPercentData = (double)0;
                          discountPercentData = cursor.getInt(10);
                          discountPercentData = (double)discountPercentData;
                          hashMap.put("discountPercent", discountPercentData);


                                                
                                
                                                            double discountAmountData = (double)0;
                          discountAmountData = cursor.getInt(11);
                          discountAmountData = (double)discountAmountData;
                          hashMap.put("discountAmount", discountAmountData);


                                                
                                
                                                            String expiryDateData = "";
                        if(cursor.getString(12) != null){
                          expiryDateData = cursor.getString(12);
                          if(expiryDateData != null){
                            expiryDateData = (String)expiryDateData;
                            hashMap.put("expiryDate", expiryDateData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Coupon model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Coupon>  getAll__db() {
        DataList<Coupon> modelList = new DataList<Coupon>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Coupon`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Coupon>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    CouponRepository repo = restAdapter.createRepository(CouponRepository.class);
                    repo.addStorage(context);
                    modelList.add((Coupon)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Coupon>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<Coupon> getAll__lazy(final int limit, final int skip, ObjectCallback<Coupon> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final CouponRepository repo = restAdapter.createRepository(CouponRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<Coupon>() {
            @Override
            public Coupon create(Cursor cursor, int index) {
                Coupon data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (Coupon)repo.createObject(hashMap);
                return data;
            }
        }, callback, new LazyList.OnQueryChange(){
            @Override
            public String getUpdateQuery() {
                String orderBy = getUpdatedQuery.onOrderByChange();
                //Get Where Key Value..
                HashMap<String, Object> getWhereKeyValue = getUpdatedQuery.onQueryChange();

                String whereQuery = getWhereQuery(getWhereKeyValue);
                String selectQuery;
                if(orderBy != null){
                    selectQuery = "SELECT  * FROM `Coupon` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM Coupon " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM Coupon " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public Coupon get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Coupon", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        CouponRepository repo = restAdapter.createRepository(CouponRepository.class);
                        repo.addStorage(context);
                        return (Coupon)repo.createObject(hashMap);
                    } else {
                        return null;
                    }
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }




    public String getWhereQuery(HashMap<String, Object> whereKeyValue){
        //Prepare where key value
        String where = "";
        if(whereKeyValue.size() > 0){
            where = where +  " WHERE ";
        }
        where = where + getWhere(whereKeyValue);
        return where;
    }


     //Now also accept gt and lt values
     public String getWhere(HashMap<String, Object> whereKeyValue){
        String where = "";
        int i=0;
        for(String key : whereKeyValue.keySet()){
            Object o = whereKeyValue.get(key);
            DataList<String> keyValue = getKeyValue(key, o);
            if(keyValue != null){
                if(keyValue.size() != 0){
                    String returnedKey = keyValue.get(0);
                    try{
                        int value = Integer.parseInt(keyValue.get(1));
                        if(i==0){
                            if(returnedKey.equals("gt")){
                                where = where + " `" + key + "` > "+ value + "";
                            }else if(returnedKey.equals("lt")){
                                where = where + " `" + key + "` < "+ value + "";
                            }else{
                                where = where + " `" + key + "` = "+ value + "";
                            }
                        }else{
                            if(returnedKey.equals("gt")){
                                where = where + " AND `" + key + "` > "+ value + "";
                            }else if(returnedKey.equals("lt")){
                                where = where + " AND `" + key + "` < "+ value + "";
                            }else{
                                where = where + " AND `" + key + "` = "+ value + "";
                            }
                        }

                    }catch(Exception e){
                      String value = keyValue.get(1);
                      if(i==0){
                          if(returnedKey.equals("gt")){
                              where = where + " `" + key + "` > '"+ value + "'";
                          }else if(returnedKey.equals("lt")){
                              where = where + " `" + key + "` < '"+ value + "'";
                          }else{
                              where = where + " `" + key + "` = '"+ value + "'";
                          }
                      }else{
                          if(returnedKey.equals("gt")){
                              where = where + " AND `" + key + "` > '"+ value + "'";
                          }else if(returnedKey.equals("lt")){
                              where = where + " AND `" + key + "` < '"+ value + "'";
                          }else{
                              where = where + " AND `" + key + "` = '"+ value + "'";
                          }
                      }

                    }

                    i++;
                }
            }
        }
        return where;
     }




    //first argument is key and second is value
    public DataList<String> getKeyValue(String key, Object keyValue){
        DataList<String> returnVal = new DataList<>();
        try{
            //Converting to nested hashmap
            HashMap<String, Object> value = (HashMap<String, Object>)keyValue;
            for(String key_ : value.keySet()){
                Object o = value.get(key_);
                returnVal.add(key_);
                returnVal.add(o.toString());
                return returnVal;
            }
        }catch(Exception e){
            returnVal.add(key);
            returnVal.add(keyValue.toString());
            return returnVal;
        }
        return null;
    }



    // Getting All Data where
    public DataList<Coupon>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Coupon>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Coupon> modelList = new DataList<Coupon>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Coupon` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Coupon " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Coupon " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Coupon>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    CouponRepository repo = restAdapter.createRepository(CouponRepository.class);
                    repo.addStorage(context);
                    modelList.add((Coupon)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<Coupon>) modelList;
    }



    // Getting All Data where
    public DataList<Coupon>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
        return getAll__db(whereKeyValue, null,  limit, skip);
    }





    /**
     * Check count of database.
     * @param whereKeyValue
     * @param orderBy
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(orderBy != null){
            countQuery = "SELECT  * FROM `Coupon` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Coupon` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Coupon` " + whereQuery + " LIMIT -1 OFFSET " + skip;
            }
        }


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }



    /**
     * Check count of database.
     * @param whereKeyValue
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, int limit, int skip){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(limit != 0){
            countQuery = "SELECT  * FROM `Coupon` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Coupon` " + whereQuery + " LIMIT -1 OFFSET " + skip;
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    /**
     * Check count of database.
     * @param whereKeyValue
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue){
            return count__db(whereKeyValue, 0, 0);
    }



    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final HashMap<String, Object> whereKeyValue) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
            //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
            ContentValues values = new ContentValues();
            values.put("_DATA_UPDATED", 0);
            String where = getWhere(whereKeyValue);
            // updating row
            db.update("`Coupon`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Coupon`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Coupon`", where , null);
    }







    // Getting All Data where
    public DataList<Coupon>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Coupon> modelList = new DataList<Coupon>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Coupon` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Coupon>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    CouponRepository repo = restAdapter.createRepository(CouponRepository.class);
                    repo.addStorage(context);
                    modelList.add((Coupon)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<Coupon>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `Coupon` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
      Cursor cursor = db.rawQuery(countQuery, null);
      int count = cursor.getCount();
      cursor.close();
      return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Coupon`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Coupon`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Coupon _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`Coupon`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final Coupon _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`Coupon`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Coupon`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Coupon`", "_DATA_UPDATED = 0", null);
    }


    // Getting contacts Count
    public int count__db() {
        String countQuery = "SELECT  * FROM `" + TABLE + "`";
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }


    /**
     * Get count by Id..
     * @param id
     * @return
     */
    public int count__db(String id){
        String countQuery = "SELECT  * FROM `" + TABLE  + "` WHERE ID='" + id+"'";
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        // return count
        return count;
    }



    // Deleting by id
    public void delete__db(final String id) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, KEY_ID + " = ?",
      new String[] { id });
    }

    public void reset__db(){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE,null,null);
    }

}
