package com.androidsdk.snaphy.snaphyandroidsdk.db;





import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.util.HashMap;
import com.google.gson.Gson;
import android.database.Cursor;
import java.lang.reflect.Method;
import android.util.Log;
import java.util.Map;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;

import com.androidsdk.snaphy.snaphyandroidsdk.models.Order;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class OrderDb{

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

  public OrderDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Order";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Order modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                // Inserting Row
                ContentValues values = getContentValues(modelData);
                db.insert("Order", null, values);
                //db.close(); // Closing database connection
            }
        }).start();

    }





    public ContentValues getContentValues(Order modelData){
      ContentValues values = new ContentValues();
                       
                                                            String orderNumberData = "";
                        if(modelData.getOrderNumber() != null){
                          orderNumberData = modelData.getOrderNumber().toString();
                          values.put("`orderNumber`", orderNumberData);
                        }
                                  
                                
                                                            String transactionIdData = "";
                        if(modelData.getTransactionId() != null){
                          transactionIdData = modelData.getTransactionId().toString();
                          values.put("`transactionId`", transactionIdData);
                        }
                                  
                                
                                                            String orderStatusData = "";
                        if(modelData.getOrderStatus() != null){
                          orderStatusData = modelData.getOrderStatus().toString();
                          values.put("`orderStatus`", orderStatusData);
                        }
                                  
                                
                                                            String paymentStatusData = "";
                        if(modelData.getPaymentStatus() != null){
                          paymentStatusData = modelData.getPaymentStatus().toString();
                          values.put("`paymentStatus`", paymentStatusData);
                        }
                                  
                                
                                                            String errorMessageData = "";
                        if(modelData.getErrorMessage() != null){
                          errorMessageData = modelData.getErrorMessage().toString();
                          values.put("`errorMessage`", errorMessageData);
                        }
                                  
                                
                                                            double amountData;
                        amountData = (double)modelData.getAmount();
                        values.put("`amount`", amountData);
                                  
                                
                                                            String typeData = "";
                        if(modelData.getType() != null){
                          typeData = modelData.getType().toString();
                          values.put("`type`", typeData);
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
                        String bookIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getBookId");
                              if(method.invoke(modelData) != null){
                                //bookIdData = modelData.getBookId().toString();
                                bookIdData = (String) method.invoke(modelData);
                                values.put("`bookId`", bookIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String customerIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getCustomerId");
                              if(method.invoke(modelData) != null){
                                //customerIdData = modelData.getCustomerId().toString();
                                customerIdData = (String) method.invoke(modelData);
                                values.put("`customerId`", customerIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String paymentIdData = "";
                        try {
                              Method method = modelData.getClass().getMethod("getPaymentId");
                              if(method.invoke(modelData) != null){
                                //paymentIdData = modelData.getPaymentId().toString();
                                paymentIdData = (String) method.invoke(modelData);
                                values.put("`paymentId`", paymentIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Order get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Order", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        OrderRepository repo = restAdapter.createRepository(OrderRepository.class);
                        repo.addStorage(context);
                        return (Order)repo.createObject(hashMap);
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
    public   Order get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Order", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        OrderRepository repo = restAdapter.createRepository(OrderRepository.class);
                        repo.addStorage(context);
                        return (Order)repo.createObject(hashMap);
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

                      
                                                            String orderNumberData = "";
                        if(cursor.getString(0) != null){
                          orderNumberData = cursor.getString(0);
                          if(orderNumberData != null){
                            orderNumberData = (String)orderNumberData;
                            hashMap.put("orderNumber", orderNumberData);
                          }
                        }
                                                
                                
                                                            String transactionIdData = "";
                        if(cursor.getString(1) != null){
                          transactionIdData = cursor.getString(1);
                          if(transactionIdData != null){
                            transactionIdData = (String)transactionIdData;
                            hashMap.put("transactionId", transactionIdData);
                          }
                        }
                                                
                                
                                                            String orderStatusData = "";
                        if(cursor.getString(2) != null){
                          orderStatusData = cursor.getString(2);
                          if(orderStatusData != null){
                            orderStatusData = (String)orderStatusData;
                            hashMap.put("orderStatus", orderStatusData);
                          }
                        }
                                                
                                
                                                            String paymentStatusData = "";
                        if(cursor.getString(3) != null){
                          paymentStatusData = cursor.getString(3);
                          if(paymentStatusData != null){
                            paymentStatusData = (String)paymentStatusData;
                            hashMap.put("paymentStatus", paymentStatusData);
                          }
                        }
                                                
                                
                                                            String errorMessageData = "";
                        if(cursor.getString(4) != null){
                          errorMessageData = cursor.getString(4);
                          if(errorMessageData != null){
                            errorMessageData = (String)errorMessageData;
                            hashMap.put("errorMessage", errorMessageData);
                          }
                        }
                                                
                                
                                                            double amountData = (double)0;
                          amountData = cursor.getInt(5);
                          amountData = (double)amountData;
                          hashMap.put("amount", amountData);


                                                
                                
                                                            String typeData = "";
                        if(cursor.getString(6) != null){
                          typeData = cursor.getString(6);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(7) != null){
                          idData = cursor.getString(7);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String bookIdData = "";
                        if(cursor.getString(8) != null){
                          bookIdData = cursor.getString(8);
                          if(bookIdData != null){
                            bookIdData = bookIdData.toString();
                            hashMap.put("bookId", bookIdData);
                          }
                        }
                                                
                                
                                                            String customerIdData = "";
                        if(cursor.getString(9) != null){
                          customerIdData = cursor.getString(9);
                          if(customerIdData != null){
                            customerIdData = customerIdData.toString();
                            hashMap.put("customerId", customerIdData);
                          }
                        }
                                                
                                
                                                            String paymentIdData = "";
                        if(cursor.getString(10) != null){
                          paymentIdData = cursor.getString(10);
                          if(paymentIdData != null){
                            paymentIdData = paymentIdData.toString();
                            hashMap.put("paymentId", paymentIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Order model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Order>  getAll__db() {
        DataList<Order> modelList = new DataList<Order>();
        // Select All Query
        String selectQuery = "SELECT  * FROM Order";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Order>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    OrderRepository repo = restAdapter.createRepository(OrderRepository.class);
                    repo.addStorage(context);
                    modelList.add((Order)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Order>) modelList;
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
    public DataList<Order>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Order>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit) {
        DataList<Order> modelList = new DataList<Order>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM Order " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Order " + whereQuery + " LIMIT " + limit;
            }else{
                selectQuery = "SELECT  * FROM Order " + whereQuery;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Order>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    OrderRepository repo = restAdapter.createRepository(OrderRepository.class);
                    repo.addStorage(context);
                    modelList.add((Order)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Order>) modelList;
    }


    // Getting All Data where
    public DataList<Order>  getAll__db(HashMap<String, Object> whereKeyValue, int limit) {
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
            countQuery = "SELECT  * FROM Order " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM Order " + whereQuery + " LIMIT " + limit;
            }else{
                countQuery = "SELECT  * FROM Order " + whereQuery;
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
            countQuery = "SELECT  * FROM Order " + whereQuery + " LIMIT " + limit;
        }else{
            countQuery = "SELECT  * FROM Order " + whereQuery;
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
                db.update("Order", values, "_DATA_UPDATED = 1 AND " + where, null);
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
                db.delete("Order", "_DATA_UPDATED = 0 AND " + where , null);
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
                db.delete("Order", where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
            }
        }).start();
    }







    // Getting All Data where
    public DataList<Order>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Order> modelList = new DataList<Order>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Order` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Order>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    OrderRepository repo = restAdapter.createRepository(OrderRepository.class);
                    repo.addStorage(context);
                    modelList.add((Order)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Order>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM `Order` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
                db.update("Order", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
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
                db.delete("Order", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
            }
        }).start();

    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Order modelData ){
      new Thread(new Runnable(){
        @Override
        public void run(){
          SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
          db.beginTransaction();
          ContentValues values = getContentValues(modelData);
          String where = getWhere(whereKeyValue);
          db.update("Order", values, where, null);
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
    public void update__db(final String id,   final Order modelData) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(modelData);
                // updating row
                db.update("Order", values, "id = ?",
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
                db.update("Order", values, "_DATA_UPDATED = 1", null);
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
                db.delete("Order", "_DATA_UPDATED = 0", null);
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
