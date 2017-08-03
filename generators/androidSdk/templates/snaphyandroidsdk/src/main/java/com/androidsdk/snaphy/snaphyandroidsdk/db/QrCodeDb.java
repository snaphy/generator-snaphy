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

import com.androidsdk.snaphy.snaphyandroidsdk.models.QrCode;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.QrCodeRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class QrCodeDb{

    // All Static variables
    RestAdapter restAdapter;

    private String TAG = "snaphy";
    private String KEY_ID = "ID";
    private String KEY_OBJECT = "OBJECT";
    private Context context;
    // Database Name
    private static String DATABASE_NAME;

    // Contacts table name
    private static String TABLE;

  public QrCodeDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "QrCode";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final QrCode modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("`QrCode`", null, values);
                //db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(QrCode modelData){
      ContentValues values = new ContentValues();
                       
                                                            double serial_numberData;
                        serial_numberData = (double)modelData.getSerial_number();
                        values.put("`serial_number`", serial_numberData);
                                  
                                
                                                            String activation_statusData = "";
                        if(modelData.getActivation_status() != null){
                          activation_statusData = modelData.getActivation_status().toString();
                          values.put("`activation_status`", activation_statusData);
                        }
                                  
                                
                                                            String active_onData = "";
                        if(modelData.getActive_on() != null){
                          active_onData = modelData.getActive_on().toString();
                          values.put("`active_on`", active_onData);
                        }
                                  
                                
                                                            String scan_statusData = "";
                        if(modelData.getScan_status() != null){
                          scan_statusData = modelData.getScan_status().toString();
                          values.put("`scan_status`", scan_statusData);
                        }
                                  
                                
                                                            String addedData = "";
                        if(modelData.getAdded() != null){
                          addedData = modelData.getAdded().toString();
                          values.put("`added`", addedData);
                        }
                                  
                                
                                                            String updatedData = "";
                        if(modelData.getUpdated() != null){
                          updatedData = modelData.getUpdated().toString();
                          values.put("`updated`", updatedData);
                        }
                                  
                                
                                                            double pointsData;
                        pointsData = (double)modelData.getPoints();
                        values.put("`points`", pointsData);
                                  
                                
                                                            String scanned_onData = "";
                        if(modelData.getScanned_on() != null){
                          scanned_onData = modelData.getScanned_on().toString();
                          values.put("`scanned_on`", scanned_onData);
                        }
                                  
                                
                                                            String redeemed_onData = "";
                        if(modelData.getRedeemed_on() != null){
                          redeemed_onData = modelData.getRedeemed_on().toString();
                          values.put("`redeemed_on`", redeemed_onData);
                        }
                                  
                                
                                                            String redeemStatusData = "";
                        if(modelData.getRedeemStatus() != null){
                          redeemStatusData = modelData.getRedeemStatus().toString();
                          values.put("`redeemStatus`", redeemStatusData);
                        }
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String is_deletedData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getIs_deleted");
                              if(method.invoke(modelData) != null){
                                //is_deletedData = modelData.getIs_deleted().toString();
                                is_deletedData = (String) method.invoke(modelData);
                                values.put("`is_deleted`", is_deletedData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String idData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getId");
                              if(method.invoke(modelData) != null){
                                //idData = modelData.getId().toString();
                                idData = (String) method.invoke(modelData);
                                values.put("`id`", idData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String retailerIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getRetailerId");
                              if(method.invoke(modelData) != null){
                                //retailerIdData = modelData.getRetailerId().toString();
                                retailerIdData = (String) method.invoke(modelData);
                                values.put("`retailerId`", retailerIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String departmentIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getDepartmentId");
                              if(method.invoke(modelData) != null){
                                //departmentIdData = modelData.getDepartmentId().toString();
                                departmentIdData = (String) method.invoke(modelData);
                                values.put("`departmentId`", departmentIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String productIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getProductId");
                              if(method.invoke(modelData) != null){
                                //productIdData = modelData.getProductId().toString();
                                productIdData = (String) method.invoke(modelData);
                                values.put("`productId`", productIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String transactionIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getTransactionId");
                              if(method.invoke(modelData) != null){
                                //transactionIdData = modelData.getTransactionId().toString();
                                transactionIdData = (String) method.invoke(modelData);
                                values.put("`transactionId`", transactionIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String qrCodeGroupIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getQrCodeGroupId");
                              if(method.invoke(modelData) != null){
                                //qrCodeGroupIdData = modelData.getQrCodeGroupId().toString();
                                qrCodeGroupIdData = (String) method.invoke(modelData);
                                values.put("`qrCodeGroupId`", qrCodeGroupIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   QrCode get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("QrCode", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        QrCodeRepository repo = restAdapter.createRepository(QrCodeRepository.class);
                        repo.addStorage(context);
                        return (QrCode)repo.createObject(hashMap);
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
    public   QrCode get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`QrCode`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        QrCodeRepository repo = restAdapter.createRepository(QrCodeRepository.class);
                        repo.addStorage(context);
                        return (QrCode)repo.createObject(hashMap);
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

                      
                                                            double serial_numberData = (double)0;
                          serial_numberData = cursor.getInt(0);
                          serial_numberData = (double)serial_numberData;
                          hashMap.put("serial_number", serial_numberData);


                                                
                                
                                                            String activation_statusData = "";
                        if(cursor.getString(1) != null){
                          activation_statusData = cursor.getString(1);
                          if(activation_statusData != null){
                            activation_statusData = (String)activation_statusData;
                            hashMap.put("activation_status", activation_statusData);
                          }
                        }
                                                
                                
                                                            String active_onData = "";
                        if(cursor.getString(2) != null){
                          active_onData = cursor.getString(2);
                          if(active_onData != null){
                            active_onData = (String)active_onData;
                            hashMap.put("active_on", active_onData);
                          }
                        }
                                                
                                
                                                            String scan_statusData = "";
                        if(cursor.getString(3) != null){
                          scan_statusData = cursor.getString(3);
                          if(scan_statusData != null){
                            scan_statusData = (String)scan_statusData;
                            hashMap.put("scan_status", scan_statusData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(4) != null){
                          addedData = cursor.getString(4);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(5) != null){
                          updatedData = cursor.getString(5);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            double pointsData = (double)0;
                          pointsData = cursor.getInt(6);
                          pointsData = (double)pointsData;
                          hashMap.put("points", pointsData);


                                                
                                
                                                            String scanned_onData = "";
                        if(cursor.getString(7) != null){
                          scanned_onData = cursor.getString(7);
                          if(scanned_onData != null){
                            scanned_onData = (String)scanned_onData;
                            hashMap.put("scanned_on", scanned_onData);
                          }
                        }
                                                
                                
                                                            String redeemed_onData = "";
                        if(cursor.getString(8) != null){
                          redeemed_onData = cursor.getString(8);
                          if(redeemed_onData != null){
                            redeemed_onData = (String)redeemed_onData;
                            hashMap.put("redeemed_on", redeemed_onData);
                          }
                        }
                                                
                                
                                                            String redeemStatusData = "";
                        if(cursor.getString(9) != null){
                          redeemStatusData = cursor.getString(9);
                          if(redeemStatusData != null){
                            redeemStatusData = (String)redeemStatusData;
                            hashMap.put("redeemStatus", redeemStatusData);
                          }
                        }
                                                
                                
                                                            String is_deletedData = "";
                        if(cursor.getString(10) != null){
                          is_deletedData = cursor.getString(10);
                          if(is_deletedData != null){
                            is_deletedData = is_deletedData.toString();
                            hashMap.put("is_deleted", is_deletedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(11) != null){
                          idData = cursor.getString(11);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String retailerIdData = "";
                        if(cursor.getString(12) != null){
                          retailerIdData = cursor.getString(12);
                          if(retailerIdData != null){
                            retailerIdData = retailerIdData.toString();
                            hashMap.put("retailerId", retailerIdData);
                          }
                        }
                                                
                                
                                                            String departmentIdData = "";
                        if(cursor.getString(13) != null){
                          departmentIdData = cursor.getString(13);
                          if(departmentIdData != null){
                            departmentIdData = departmentIdData.toString();
                            hashMap.put("departmentId", departmentIdData);
                          }
                        }
                                                
                                
                                                            String productIdData = "";
                        if(cursor.getString(14) != null){
                          productIdData = cursor.getString(14);
                          if(productIdData != null){
                            productIdData = productIdData.toString();
                            hashMap.put("productId", productIdData);
                          }
                        }
                                                
                                
                                                            String transactionIdData = "";
                        if(cursor.getString(15) != null){
                          transactionIdData = cursor.getString(15);
                          if(transactionIdData != null){
                            transactionIdData = transactionIdData.toString();
                            hashMap.put("transactionId", transactionIdData);
                          }
                        }
                                                
                                
                                                            String qrCodeGroupIdData = "";
                        if(cursor.getString(16) != null){
                          qrCodeGroupIdData = cursor.getString(16);
                          if(qrCodeGroupIdData != null){
                            qrCodeGroupIdData = qrCodeGroupIdData.toString();
                            hashMap.put("qrCodeGroupId", qrCodeGroupIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, QrCode model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<QrCode>  getAll__db() {
        DataList<QrCode> modelList = new DataList<QrCode>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `QrCode`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<QrCode>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    QrCodeRepository repo = restAdapter.createRepository(QrCodeRepository.class);
                    repo.addStorage(context);
                    modelList.add((QrCode)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<QrCode>) modelList;
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
    public DataList<QrCode>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<QrCode>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit) {
        DataList<QrCode> modelList = new DataList<QrCode>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `QrCode` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM QrCode " + whereQuery + " LIMIT " + limit;
            }else{
                selectQuery = "SELECT  * FROM QrCode " + whereQuery;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<QrCode>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    QrCodeRepository repo = restAdapter.createRepository(QrCodeRepository.class);
                    repo.addStorage(context);
                    modelList.add((QrCode)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<QrCode>) modelList;
    }


    // Getting All Data where
    public DataList<QrCode>  getAll__db(HashMap<String, Object> whereKeyValue, int limit) {
        return getAll__db(whereKeyValue, null,  limit);
    }





    /**
     * Check count of database.
     * @param whereKeyValue
     * @param orderBy
     * @param limit
     * @return
     */
    public int count__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(orderBy != null){
            countQuery = "SELECT  * FROM `QrCode` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `QrCode` " + whereQuery + " LIMIT " + limit;
            }else{
                countQuery = "SELECT  * FROM `QrCode` " + whereQuery;
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
    public int count__db(HashMap<String, Object> whereKeyValue, int limit){
        String whereQuery = getWhereQuery(whereKeyValue);
        String countQuery;
        if(limit != 0){
            countQuery = "SELECT  * FROM `QrCode` " + whereQuery + " LIMIT " + limit;
        }else{
            countQuery = "SELECT  * FROM `QrCode` " + whereQuery;
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
            return count__db(whereKeyValue, 0);
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final HashMap<String, Object> whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                String where = getWhere(whereKeyValue);
                // updating row
                db.update("`QrCode`", values, "_DATA_UPDATED = 1 AND " + where, null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("`QrCode`", "_DATA_UPDATED = 0 AND " + where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("`QrCode`", where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
            }
        }).start();
    }







    // Getting All Data where
    public DataList<QrCode>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<QrCode> modelList = new DataList<QrCode>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `QrCode` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<QrCode>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    QrCodeRepository repo = restAdapter.createRepository(QrCodeRepository.class);
                    repo.addStorage(context);
                    modelList.add((QrCode)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<QrCode>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM `QrCode` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("`QrCode`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("`QrCode`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final QrCode modelData ){
      new Thread(new Runnable(){
        @Override
        public void run(){
          SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
          db.beginTransaction();
          ContentValues values = getContentValues(modelData);
          String where = getWhere(whereKeyValue);
          db.update("`QrCode`", values, where, null);
          db.setTransactionSuccessful();
          db.endTransaction();
          //db.close();
        }

      }).start();
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();
    }



    // Updating single contact
    public void update__db(final String id,   final QrCode modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("`QrCode`", values, "id = ?",
                        new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("`QrCode`", values, "_DATA_UPDATED = 1", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    // Delete Old data
    public void deleteOldData__db() {
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("`QrCode`", "_DATA_UPDATED = 0", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

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
      new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, KEY_ID + " = ?",
                new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();
    }

    public void reset__db(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE,null,null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }

}
