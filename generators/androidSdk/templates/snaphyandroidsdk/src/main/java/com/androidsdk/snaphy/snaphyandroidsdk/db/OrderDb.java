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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Order;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class OrderDb{

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

  public OrderDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Order";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Order _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`Order`", null, values);
    }





    public ContentValues getContentValues(Order _modelData){
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
                                  
                                
                                                            double amountData;
                        amountData = (double)_modelData.getAmount();
                        values.put("`amount`", amountData);
                                  
                                
                                                            double estimatedMRPPriceData;
                        estimatedMRPPriceData = (double)_modelData.getEstimatedMRPPrice();
                        values.put("`estimatedMRPPrice`", estimatedMRPPriceData);
                                  
                                
                                                            double moneySavedData;
                        moneySavedData = (double)_modelData.getMoneySaved();
                        values.put("`moneySaved`", moneySavedData);
                                  
                                
                                  String itemIdsData = "";
                  if(_modelData.getItemIds() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    itemIdsData = gson.toJson(_modelData.getItemIds(), DataList.class);
                    values.put("`itemIds`", itemIdsData);
                  }
              
                                
                                  String itemObjectListData = "";
                  if(_modelData.getItemObjectList() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    itemObjectListData = gson.toJson(_modelData.getItemObjectList(), DataList.class);
                    values.put("`itemObjectList`", itemObjectListData);
                  }
              
                                
                                                            String orderStatusData = "";
                        if(_modelData.getOrderStatus() != null){
                          orderStatusData = _modelData.getOrderStatus().toString();
                          values.put("`orderStatus`", orderStatusData);
                        }
                                  
                                
                                                            double estimatedWeightData;
                        estimatedWeightData = (double)_modelData.getEstimatedWeight();
                        values.put("`estimatedWeight`", estimatedWeightData);
                                  
                                
                                                            String nearestWarehouseData = "";
                        if(_modelData.getNearestWarehouse() != null){
                          nearestWarehouseData = _modelData.getNearestWarehouse().toString();
                          values.put("`nearestWarehouse`", nearestWarehouseData);
                        }
                                  
                                
                                                            String dateOfOrderData = "";
                        if(_modelData.getDateOfOrder() != null){
                          dateOfOrderData = _modelData.getDateOfOrder().toString();
                          values.put("`dateOfOrder`", dateOfOrderData);
                        }
                                  
                                
                                                            String deliveryDateData = "";
                        if(_modelData.getDeliveryDate() != null){
                          deliveryDateData = _modelData.getDeliveryDate().toString();
                          values.put("`deliveryDate`", deliveryDateData);
                        }
                                  
                                
                                                            String estimatedShipmentDateData = "";
                        if(_modelData.getEstimatedShipmentDate() != null){
                          estimatedShipmentDateData = _modelData.getEstimatedShipmentDate().toString();
                          values.put("`estimatedShipmentDate`", estimatedShipmentDateData);
                        }
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String customerIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getCustomerId");
                              if(method.invoke(_modelData) != null){
                                //customerIdData = _modelData.getCustomerId().toString();
                                customerIdData = (String) method.invoke(_modelData);
                                values.put("`customerId`", customerIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String logisticsIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getLogisticsId");
                              if(method.invoke(_modelData) != null){
                                //logisticsIdData = _modelData.getLogisticsId().toString();
                                logisticsIdData = (String) method.invoke(_modelData);
                                values.put("`logisticsId`", logisticsIdData);
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
            Cursor cursor = db.query("`Order`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
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
                                                
                                
                                                            double amountData = (double)0;
                          amountData = cursor.getInt(3);
                          amountData = (double)amountData;
                          hashMap.put("amount", amountData);


                                                
                                
                                                            double estimatedMRPPriceData = (double)0;
                          estimatedMRPPriceData = cursor.getInt(4);
                          estimatedMRPPriceData = (double)estimatedMRPPriceData;
                          hashMap.put("estimatedMRPPrice", estimatedMRPPriceData);


                                                
                                
                                                            double moneySavedData = (double)0;
                          moneySavedData = cursor.getInt(5);
                          moneySavedData = (double)moneySavedData;
                          hashMap.put("moneySaved", moneySavedData);


                                                
                                
                                  DataList<Object> itemIdsData = new DataList<>();
                  if(cursor.getString(6) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    itemIdsData = gson.fromJson(cursor.getString(6), DataList.class);
                    if(itemIdsData != null){
                      itemIdsData = (DataList<Object>)itemIdsData;
                      hashMap.put("itemIds", itemIdsData);
                    }
                  }
                            
                                
                                  DataList<Map<String, Object>> itemObjectListData = new DataList<>();
                  if(cursor.getString(7) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    itemObjectListData = gson.fromJson(cursor.getString(7), DataList.class);
                    if(itemObjectListData != null){
                      itemObjectListData = (DataList<Map<String, Object>>)itemObjectListData;
                      hashMap.put("itemObjectList", itemObjectListData);
                    }
                  }
                            
                                
                                                            String orderStatusData = "";
                        if(cursor.getString(8) != null){
                          orderStatusData = cursor.getString(8);
                          if(orderStatusData != null){
                            orderStatusData = (String)orderStatusData;
                            hashMap.put("orderStatus", orderStatusData);
                          }
                        }
                                                
                                
                                                            double estimatedWeightData = (double)0;
                          estimatedWeightData = cursor.getInt(9);
                          estimatedWeightData = (double)estimatedWeightData;
                          hashMap.put("estimatedWeight", estimatedWeightData);


                                                
                                
                                                            String nearestWarehouseData = "";
                        if(cursor.getString(10) != null){
                          nearestWarehouseData = cursor.getString(10);
                          if(nearestWarehouseData != null){
                            nearestWarehouseData = (String)nearestWarehouseData;
                            hashMap.put("nearestWarehouse", nearestWarehouseData);
                          }
                        }
                                                
                                
                                                            String dateOfOrderData = "";
                        if(cursor.getString(11) != null){
                          dateOfOrderData = cursor.getString(11);
                          if(dateOfOrderData != null){
                            dateOfOrderData = (String)dateOfOrderData;
                            hashMap.put("dateOfOrder", dateOfOrderData);
                          }
                        }
                                                
                                
                                                            String deliveryDateData = "";
                        if(cursor.getString(12) != null){
                          deliveryDateData = cursor.getString(12);
                          if(deliveryDateData != null){
                            deliveryDateData = (String)deliveryDateData;
                            hashMap.put("deliveryDate", deliveryDateData);
                          }
                        }
                                                
                                
                                                            String estimatedShipmentDateData = "";
                        if(cursor.getString(13) != null){
                          estimatedShipmentDateData = cursor.getString(13);
                          if(estimatedShipmentDateData != null){
                            estimatedShipmentDateData = (String)estimatedShipmentDateData;
                            hashMap.put("estimatedShipmentDate", estimatedShipmentDateData);
                          }
                        }
                                                
                                
                                                            String customerIdData = "";
                        if(cursor.getString(14) != null){
                          customerIdData = cursor.getString(14);
                          if(customerIdData != null){
                            customerIdData = customerIdData.toString();
                            hashMap.put("customerId", customerIdData);
                          }
                        }
                                                
                                
                                                            String logisticsIdData = "";
                        if(cursor.getString(15) != null){
                          logisticsIdData = cursor.getString(15);
                          if(logisticsIdData != null){
                            logisticsIdData = logisticsIdData.toString();
                            hashMap.put("logisticsId", logisticsIdData);
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
        String selectQuery = "SELECT  * FROM `Order`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
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
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Order>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<Order> getAll__lazy(final int limit, final int skip, ObjectCallback<Order> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final OrderRepository repo = restAdapter.createRepository(OrderRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<Order>() {
            @Override
            public Order create(Cursor cursor, int index) {
                Order data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (Order)repo.createObject(hashMap);
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
                    selectQuery = "SELECT  * FROM `Order` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM Order " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM Order " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public Order get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Order", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
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
    public DataList<Order>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Order>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Order> modelList = new DataList<Order>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Order` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Order " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Order " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
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
        cursor.close();
        // return contact list
        return (DataList<Order>) modelList;
    }



    // Getting All Data where
    public DataList<Order>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `Order` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Order` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Order` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `Order` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Order` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            db.update("`Order`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Order`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Order`", where , null);
    }







    // Getting All Data where
    public DataList<Order>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Order> modelList = new DataList<Order>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Order` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
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
        cursor.close();
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
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Order`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Order`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Order _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`Order`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final Order _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`Order`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Order`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Order`", "_DATA_UPDATED = 0", null);
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
