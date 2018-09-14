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

import com.androidsdk.snaphy.snaphyandroidsdk.models.LogisticPartner;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.LogisticPartnerRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class LogisticPartnerDb{

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

  public LogisticPartnerDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "LogisticPartner";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final LogisticPartner _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`LogisticPartner`", null, values);
    }





    public ContentValues getContentValues(LogisticPartner _modelData){
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
                                  
                                
                                                            String partnerNameData = "";
                        if(_modelData.getPartnerName() != null){
                          partnerNameData = _modelData.getPartnerName().toString();
                          values.put("`partnerName`", partnerNameData);
                        }
                                  
                                
                                                            double chargesData;
                        chargesData = (double)_modelData.getCharges();
                        values.put("`charges`", chargesData);
                                  
                                
                                                            double interstateChargesData;
                        interstateChargesData = (double)_modelData.getInterstateCharges();
                        values.put("`interstateCharges`", interstateChargesData);
                                  
                                
                                                            double intrastateChargesData;
                        intrastateChargesData = (double)_modelData.getIntrastateCharges();
                        values.put("`intrastateCharges`", intrastateChargesData);
                                  
                                
                                                            double interstateDeliveryTimeData;
                        interstateDeliveryTimeData = (double)_modelData.getInterstateDeliveryTime();
                        values.put("`interstateDeliveryTime`", interstateDeliveryTimeData);
                                  
                                
                                                            double intrastateDeliveryTimeData;
                        intrastateDeliveryTimeData = (double)_modelData.getIntrastateDeliveryTime();
                        values.put("`intrastateDeliveryTime`", intrastateDeliveryTimeData);
                                  
                                
                                                            String mobileNumber2Data = "";
                        if(_modelData.getMobileNumber2() != null){
                          mobileNumber2Data = _modelData.getMobileNumber2().toString();
                          values.put("`mobileNumber2`", mobileNumber2Data);
                        }
                                  
                                
                                                            String mobileNumber1Data = "";
                        if(_modelData.getMobileNumber1() != null){
                          mobileNumber1Data = _modelData.getMobileNumber1().toString();
                          values.put("`mobileNumber1`", mobileNumber1Data);
                        }
                                  
                                
                                                            String landline2Data = "";
                        if(_modelData.getLandline2() != null){
                          landline2Data = _modelData.getLandline2().toString();
                          values.put("`landline2`", landline2Data);
                        }
                                  
                                
                                                            String landline1Data = "";
                        if(_modelData.getLandline1() != null){
                          landline1Data = _modelData.getLandline1().toString();
                          values.put("`landline1`", landline1Data);
                        }
                                  
                                
                                                            String headOfficeAddressData = "";
                        if(_modelData.getHeadOfficeAddress() != null){
                          headOfficeAddressData = _modelData.getHeadOfficeAddress().toString();
                          values.put("`headOfficeAddress`", headOfficeAddressData);
                        }
                                  
                                
                                  String deliveryStateData = "";
                  if(_modelData.getDeliveryState() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    deliveryStateData = gson.toJson(_modelData.getDeliveryState(), DataList.class);
                    values.put("`deliveryState`", deliveryStateData);
                  }
              
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   LogisticPartner get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("LogisticPartner", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        LogisticPartnerRepository repo = restAdapter.createRepository(LogisticPartnerRepository.class);
                        repo.addStorage(context);
                        return (LogisticPartner)repo.createObject(hashMap);
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
    public   LogisticPartner get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`LogisticPartner`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        LogisticPartnerRepository repo = restAdapter.createRepository(LogisticPartnerRepository.class);
                        repo.addStorage(context);
                        return (LogisticPartner)repo.createObject(hashMap);
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
                                                
                                
                                                            String partnerNameData = "";
                        if(cursor.getString(3) != null){
                          partnerNameData = cursor.getString(3);
                          if(partnerNameData != null){
                            partnerNameData = (String)partnerNameData;
                            hashMap.put("partnerName", partnerNameData);
                          }
                        }
                                                
                                
                                                            double chargesData = (double)0;
                          chargesData = cursor.getInt(4);
                          chargesData = (double)chargesData;
                          hashMap.put("charges", chargesData);


                                                
                                
                                                            double interstateChargesData = (double)0;
                          interstateChargesData = cursor.getInt(5);
                          interstateChargesData = (double)interstateChargesData;
                          hashMap.put("interstateCharges", interstateChargesData);


                                                
                                
                                                            double intrastateChargesData = (double)0;
                          intrastateChargesData = cursor.getInt(6);
                          intrastateChargesData = (double)intrastateChargesData;
                          hashMap.put("intrastateCharges", intrastateChargesData);


                                                
                                
                                                            double interstateDeliveryTimeData = (double)0;
                          interstateDeliveryTimeData = cursor.getInt(7);
                          interstateDeliveryTimeData = (double)interstateDeliveryTimeData;
                          hashMap.put("interstateDeliveryTime", interstateDeliveryTimeData);


                                                
                                
                                                            double intrastateDeliveryTimeData = (double)0;
                          intrastateDeliveryTimeData = cursor.getInt(8);
                          intrastateDeliveryTimeData = (double)intrastateDeliveryTimeData;
                          hashMap.put("intrastateDeliveryTime", intrastateDeliveryTimeData);


                                                
                                
                                                            String mobileNumber2Data = "";
                        if(cursor.getString(9) != null){
                          mobileNumber2Data = cursor.getString(9);
                          if(mobileNumber2Data != null){
                            mobileNumber2Data = (String)mobileNumber2Data;
                            hashMap.put("mobileNumber2", mobileNumber2Data);
                          }
                        }
                                                
                                
                                                            String mobileNumber1Data = "";
                        if(cursor.getString(10) != null){
                          mobileNumber1Data = cursor.getString(10);
                          if(mobileNumber1Data != null){
                            mobileNumber1Data = (String)mobileNumber1Data;
                            hashMap.put("mobileNumber1", mobileNumber1Data);
                          }
                        }
                                                
                                
                                                            String landline2Data = "";
                        if(cursor.getString(11) != null){
                          landline2Data = cursor.getString(11);
                          if(landline2Data != null){
                            landline2Data = (String)landline2Data;
                            hashMap.put("landline2", landline2Data);
                          }
                        }
                                                
                                
                                                            String landline1Data = "";
                        if(cursor.getString(12) != null){
                          landline1Data = cursor.getString(12);
                          if(landline1Data != null){
                            landline1Data = (String)landline1Data;
                            hashMap.put("landline1", landline1Data);
                          }
                        }
                                                
                                
                                                            String headOfficeAddressData = "";
                        if(cursor.getString(13) != null){
                          headOfficeAddressData = cursor.getString(13);
                          if(headOfficeAddressData != null){
                            headOfficeAddressData = (String)headOfficeAddressData;
                            hashMap.put("headOfficeAddress", headOfficeAddressData);
                          }
                        }
                                                
                                
                                  DataList<Map<String, Object>> deliveryStateData = new DataList<>();
                  if(cursor.getString(14) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    deliveryStateData = gson.fromJson(cursor.getString(14), DataList.class);
                    if(deliveryStateData != null){
                      deliveryStateData = (DataList<Map<String, Object>>)deliveryStateData;
                      hashMap.put("deliveryState", deliveryStateData);
                    }
                  }
                            
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, LogisticPartner model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<LogisticPartner>  getAll__db() {
        DataList<LogisticPartner> modelList = new DataList<LogisticPartner>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `LogisticPartner`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<LogisticPartner>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    LogisticPartnerRepository repo = restAdapter.createRepository(LogisticPartnerRepository.class);
                    repo.addStorage(context);
                    modelList.add((LogisticPartner)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<LogisticPartner>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<LogisticPartner> getAll__lazy(final int limit, final int skip, ObjectCallback<LogisticPartner> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final LogisticPartnerRepository repo = restAdapter.createRepository(LogisticPartnerRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<LogisticPartner>() {
            @Override
            public LogisticPartner create(Cursor cursor, int index) {
                LogisticPartner data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (LogisticPartner)repo.createObject(hashMap);
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
                    selectQuery = "SELECT  * FROM `LogisticPartner` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM LogisticPartner " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM LogisticPartner " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public LogisticPartner get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("LogisticPartner", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        LogisticPartnerRepository repo = restAdapter.createRepository(LogisticPartnerRepository.class);
                        repo.addStorage(context);
                        return (LogisticPartner)repo.createObject(hashMap);
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
    public DataList<LogisticPartner>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<LogisticPartner>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<LogisticPartner> modelList = new DataList<LogisticPartner>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `LogisticPartner` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM LogisticPartner " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM LogisticPartner " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<LogisticPartner>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    LogisticPartnerRepository repo = restAdapter.createRepository(LogisticPartnerRepository.class);
                    repo.addStorage(context);
                    modelList.add((LogisticPartner)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<LogisticPartner>) modelList;
    }



    // Getting All Data where
    public DataList<LogisticPartner>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `LogisticPartner` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `LogisticPartner` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `LogisticPartner` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `LogisticPartner` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `LogisticPartner` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            db.update("`LogisticPartner`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`LogisticPartner`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`LogisticPartner`", where , null);
    }







    // Getting All Data where
    public DataList<LogisticPartner>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<LogisticPartner> modelList = new DataList<LogisticPartner>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `LogisticPartner` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<LogisticPartner>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    LogisticPartnerRepository repo = restAdapter.createRepository(LogisticPartnerRepository.class);
                    repo.addStorage(context);
                    modelList.add((LogisticPartner)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<LogisticPartner>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `LogisticPartner` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
      db.update("`LogisticPartner`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`LogisticPartner`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final LogisticPartner _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`LogisticPartner`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final LogisticPartner _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`LogisticPartner`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`LogisticPartner`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`LogisticPartner`", "_DATA_UPDATED = 0", null);
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
