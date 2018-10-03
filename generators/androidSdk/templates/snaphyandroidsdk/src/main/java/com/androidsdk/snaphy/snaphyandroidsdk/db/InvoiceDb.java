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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Invoice;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.InvoiceRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class InvoiceDb{

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

  public InvoiceDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Invoice";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Invoice _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`Invoice`", null, values);
    }





    public ContentValues getContentValues(Invoice _modelData){
      ContentValues values = new ContentValues();
                       
                                                            String paymentModeData = "";
                        if(_modelData.getPaymentMode() != null){
                          paymentModeData = _modelData.getPaymentMode().toString();
                          values.put("`paymentMode`", paymentModeData);
                        }
                                  
                                
                                                            String chequeNumberData = "";
                        if(_modelData.getChequeNumber() != null){
                          chequeNumberData = _modelData.getChequeNumber().toString();
                          values.put("`chequeNumber`", chequeNumberData);
                        }
                                  
                                
                                                            double total_amountData;
                        total_amountData = (double)_modelData.getTotal_amount();
                        values.put("`total_amount`", total_amountData);
                                  
                                
                                                            double previousMonthAmountData;
                        previousMonthAmountData = (double)_modelData.getPreviousMonthAmount();
                        values.put("`previousMonthAmount`", previousMonthAmountData);
                                  
                                
                                                            double previousMonthPaidData;
                        previousMonthPaidData = (double)_modelData.getPreviousMonthPaid();
                        values.put("`previousMonthPaid`", previousMonthPaidData);
                                  
                                
                                                            double previousMonthPendingData;
                        previousMonthPendingData = (double)_modelData.getPreviousMonthPending();
                        values.put("`previousMonthPending`", previousMonthPendingData);
                                  
                                
                                                            double previousMonthCarryForwardData;
                        previousMonthCarryForwardData = (double)_modelData.getPreviousMonthCarryForward();
                        values.put("`previousMonthCarryForward`", previousMonthCarryForwardData);
                                  
                                
                                                            double currentMonthAmountData;
                        currentMonthAmountData = (double)_modelData.getCurrentMonthAmount();
                        values.put("`currentMonthAmount`", currentMonthAmountData);
                                  
                                
                                                            double netCurrentAmountData;
                        netCurrentAmountData = (double)_modelData.getNetCurrentAmount();
                        values.put("`netCurrentAmount`", netCurrentAmountData);
                                  
                                
                                                            double currentPaidData;
                        currentPaidData = (double)_modelData.getCurrentPaid();
                        values.put("`currentPaid`", currentPaidData);
                                  
                                
                                                            String paidAtData = "";
                        if(_modelData.getPaidAt() != null){
                          paidAtData = _modelData.getPaidAt().toString();
                          values.put("`paidAt`", paidAtData);
                        }
                                  
                                
                                                            double discountedCurrentMonthAmountData;
                        discountedCurrentMonthAmountData = (double)_modelData.getDiscountedCurrentMonthAmount();
                        values.put("`discountedCurrentMonthAmount`", discountedCurrentMonthAmountData);
                                  
                                
                                                            String reportsData = "";
                        if(_modelData.getReports() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          reportsData = gson.toJson(_modelData.getReports(), HashMap.class);
                          values.put("`reports`", reportsData);
                        }
                                  
                                
                                                            double monthData;
                        monthData = (double)_modelData.getMonth();
                        values.put("`month`", monthData);
                                  
                                
                                                            String invoiceDateData = "";
                        if(_modelData.getInvoiceDate() != null){
                          invoiceDateData = _modelData.getInvoiceDate().toString();
                          values.put("`invoiceDate`", invoiceDateData);
                        }
                                  
                                
                                                            String lastMonthInvoiceDateData = "";
                        if(_modelData.getLastMonthInvoiceDate() != null){
                          lastMonthInvoiceDateData = _modelData.getLastMonthInvoiceDate().toString();
                          values.put("`lastMonthInvoiceDate`", lastMonthInvoiceDateData);
                        }
                                  
                                
                                                            String invoiceAddressData = "";
                        if(_modelData.getInvoiceAddress() != null){
                          invoiceAddressData = _modelData.getInvoiceAddress().toString();
                          values.put("`invoiceAddress`", invoiceAddressData);
                        }
                                  
                                
                                                            double invoiceNumberData;
                        invoiceNumberData = (double)_modelData.getInvoiceNumber();
                        values.put("`invoiceNumber`", invoiceNumberData);
                                  
                                
                                                            String noteData = "";
                        if(_modelData.getNote() != null){
                          noteData = _modelData.getNote().toString();
                          values.put("`note`", noteData);
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
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String idData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getId");
                              if(method.invoke(_modelData) != null){
                                //idData = _modelData.getId().toString();
                                idData = (String) method.invoke(_modelData);
                                values.put("`id`", idData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
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
                        String previousMonthInvoiceIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getPreviousMonthInvoiceId");
                              if(method.invoke(_modelData) != null){
                                //previousMonthInvoiceIdData = _modelData.getPreviousMonthInvoiceId().toString();
                                previousMonthInvoiceIdData = (String) method.invoke(_modelData);
                                values.put("`previousMonthInvoiceId`", previousMonthInvoiceIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String employeeIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getEmployeeId");
                              if(method.invoke(_modelData) != null){
                                //employeeIdData = _modelData.getEmployeeId().toString();
                                employeeIdData = (String) method.invoke(_modelData);
                                values.put("`employeeId`", employeeIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String orderIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getOrderId");
                              if(method.invoke(_modelData) != null){
                                //orderIdData = _modelData.getOrderId().toString();
                                orderIdData = (String) method.invoke(_modelData);
                                values.put("`orderId`", orderIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String companySettingIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getCompanySettingId");
                              if(method.invoke(_modelData) != null){
                                //companySettingIdData = _modelData.getCompanySettingId().toString();
                                companySettingIdData = (String) method.invoke(_modelData);
                                values.put("`companySettingId`", companySettingIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Invoice get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Invoice", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        InvoiceRepository repo = restAdapter.createRepository(InvoiceRepository.class);
                        repo.addStorage(context);
                        return (Invoice)repo.createObject(hashMap);
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
    public   Invoice get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`Invoice`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        InvoiceRepository repo = restAdapter.createRepository(InvoiceRepository.class);
                        repo.addStorage(context);
                        return (Invoice)repo.createObject(hashMap);
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

                      
                                                            String paymentModeData = "";
                        if(cursor.getString(0) != null){
                          paymentModeData = cursor.getString(0);
                          if(paymentModeData != null){
                            paymentModeData = (String)paymentModeData;
                            hashMap.put("paymentMode", paymentModeData);
                          }
                        }
                                                
                                
                                                            String chequeNumberData = "";
                        if(cursor.getString(1) != null){
                          chequeNumberData = cursor.getString(1);
                          if(chequeNumberData != null){
                            chequeNumberData = (String)chequeNumberData;
                            hashMap.put("chequeNumber", chequeNumberData);
                          }
                        }
                                                
                                
                                                            double total_amountData = (double)0;
                          total_amountData = cursor.getInt(2);
                          total_amountData = (double)total_amountData;
                          hashMap.put("total_amount", total_amountData);


                                                
                                
                                                            double previousMonthAmountData = (double)0;
                          previousMonthAmountData = cursor.getInt(3);
                          previousMonthAmountData = (double)previousMonthAmountData;
                          hashMap.put("previousMonthAmount", previousMonthAmountData);


                                                
                                
                                                            double previousMonthPaidData = (double)0;
                          previousMonthPaidData = cursor.getInt(4);
                          previousMonthPaidData = (double)previousMonthPaidData;
                          hashMap.put("previousMonthPaid", previousMonthPaidData);


                                                
                                
                                                            double previousMonthPendingData = (double)0;
                          previousMonthPendingData = cursor.getInt(5);
                          previousMonthPendingData = (double)previousMonthPendingData;
                          hashMap.put("previousMonthPending", previousMonthPendingData);


                                                
                                
                                                            double previousMonthCarryForwardData = (double)0;
                          previousMonthCarryForwardData = cursor.getInt(6);
                          previousMonthCarryForwardData = (double)previousMonthCarryForwardData;
                          hashMap.put("previousMonthCarryForward", previousMonthCarryForwardData);


                                                
                                
                                                            double currentMonthAmountData = (double)0;
                          currentMonthAmountData = cursor.getInt(7);
                          currentMonthAmountData = (double)currentMonthAmountData;
                          hashMap.put("currentMonthAmount", currentMonthAmountData);


                                                
                                
                                                            double netCurrentAmountData = (double)0;
                          netCurrentAmountData = cursor.getInt(8);
                          netCurrentAmountData = (double)netCurrentAmountData;
                          hashMap.put("netCurrentAmount", netCurrentAmountData);


                                                
                                
                                                            double currentPaidData = (double)0;
                          currentPaidData = cursor.getInt(9);
                          currentPaidData = (double)currentPaidData;
                          hashMap.put("currentPaid", currentPaidData);


                                                
                                
                                                            String paidAtData = "";
                        if(cursor.getString(10) != null){
                          paidAtData = cursor.getString(10);
                          if(paidAtData != null){
                            paidAtData = (String)paidAtData;
                            hashMap.put("paidAt", paidAtData);
                          }
                        }
                                                
                                
                                                            double discountedCurrentMonthAmountData = (double)0;
                          discountedCurrentMonthAmountData = cursor.getInt(11);
                          discountedCurrentMonthAmountData = (double)discountedCurrentMonthAmountData;
                          hashMap.put("discountedCurrentMonthAmount", discountedCurrentMonthAmountData);


                                                
                                
                                                            Map<String, Object> reportsData = new HashMap<>();
                        if(cursor.getString(12) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           reportsData = gson.fromJson(cursor.getString(12), Map.class);
                          if(reportsData != null){
                            reportsData = (Map<String, Object>)reportsData;
                            hashMap.put("reports", reportsData);
                          }
                        }
                                                
                                
                                                            double monthData = (double)0;
                          monthData = cursor.getInt(13);
                          monthData = (double)monthData;
                          hashMap.put("month", monthData);


                                                
                                
                                                            String invoiceDateData = "";
                        if(cursor.getString(14) != null){
                          invoiceDateData = cursor.getString(14);
                          if(invoiceDateData != null){
                            invoiceDateData = (String)invoiceDateData;
                            hashMap.put("invoiceDate", invoiceDateData);
                          }
                        }
                                                
                                
                                                            String lastMonthInvoiceDateData = "";
                        if(cursor.getString(15) != null){
                          lastMonthInvoiceDateData = cursor.getString(15);
                          if(lastMonthInvoiceDateData != null){
                            lastMonthInvoiceDateData = (String)lastMonthInvoiceDateData;
                            hashMap.put("lastMonthInvoiceDate", lastMonthInvoiceDateData);
                          }
                        }
                                                
                                
                                                            String invoiceAddressData = "";
                        if(cursor.getString(16) != null){
                          invoiceAddressData = cursor.getString(16);
                          if(invoiceAddressData != null){
                            invoiceAddressData = (String)invoiceAddressData;
                            hashMap.put("invoiceAddress", invoiceAddressData);
                          }
                        }
                                                
                                
                                                            double invoiceNumberData = (double)0;
                          invoiceNumberData = cursor.getInt(17);
                          invoiceNumberData = (double)invoiceNumberData;
                          hashMap.put("invoiceNumber", invoiceNumberData);


                                                
                                
                                                            String noteData = "";
                        if(cursor.getString(18) != null){
                          noteData = cursor.getString(18);
                          if(noteData != null){
                            noteData = (String)noteData;
                            hashMap.put("note", noteData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(19) != null){
                          addedData = cursor.getString(19);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(20) != null){
                          updatedData = cursor.getString(20);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(21) != null){
                          idData = cursor.getString(21);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String customerIdData = "";
                        if(cursor.getString(22) != null){
                          customerIdData = cursor.getString(22);
                          if(customerIdData != null){
                            customerIdData = customerIdData.toString();
                            hashMap.put("customerId", customerIdData);
                          }
                        }
                                                
                                
                                                            String previousMonthInvoiceIdData = "";
                        if(cursor.getString(23) != null){
                          previousMonthInvoiceIdData = cursor.getString(23);
                          if(previousMonthInvoiceIdData != null){
                            previousMonthInvoiceIdData = previousMonthInvoiceIdData.toString();
                            hashMap.put("previousMonthInvoiceId", previousMonthInvoiceIdData);
                          }
                        }
                                                
                                
                                                            String employeeIdData = "";
                        if(cursor.getString(24) != null){
                          employeeIdData = cursor.getString(24);
                          if(employeeIdData != null){
                            employeeIdData = employeeIdData.toString();
                            hashMap.put("employeeId", employeeIdData);
                          }
                        }
                                                
                                
                                                            String orderIdData = "";
                        if(cursor.getString(25) != null){
                          orderIdData = cursor.getString(25);
                          if(orderIdData != null){
                            orderIdData = orderIdData.toString();
                            hashMap.put("orderId", orderIdData);
                          }
                        }
                                                
                                
                                                            String companySettingIdData = "";
                        if(cursor.getString(26) != null){
                          companySettingIdData = cursor.getString(26);
                          if(companySettingIdData != null){
                            companySettingIdData = companySettingIdData.toString();
                            hashMap.put("companySettingId", companySettingIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Invoice model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Invoice>  getAll__db() {
        DataList<Invoice> modelList = new DataList<Invoice>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Invoice`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Invoice>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    InvoiceRepository repo = restAdapter.createRepository(InvoiceRepository.class);
                    repo.addStorage(context);
                    modelList.add((Invoice)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Invoice>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<Invoice> getAll__lazy(final int limit, final int skip, ObjectCallback<Invoice> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final InvoiceRepository repo = restAdapter.createRepository(InvoiceRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<Invoice>() {
            @Override
            public Invoice create(Cursor cursor, int index) {
                Invoice data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (Invoice)repo.createObject(hashMap);
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
                    selectQuery = "SELECT  * FROM `Invoice` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM Invoice " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM Invoice " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public Invoice get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Invoice", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        InvoiceRepository repo = restAdapter.createRepository(InvoiceRepository.class);
                        repo.addStorage(context);
                        return (Invoice)repo.createObject(hashMap);
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
    public DataList<Invoice>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Invoice>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Invoice> modelList = new DataList<Invoice>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Invoice` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Invoice " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Invoice " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Invoice>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    InvoiceRepository repo = restAdapter.createRepository(InvoiceRepository.class);
                    repo.addStorage(context);
                    modelList.add((Invoice)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<Invoice>) modelList;
    }



    // Getting All Data where
    public DataList<Invoice>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `Invoice` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Invoice` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Invoice` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `Invoice` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Invoice` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            db.update("`Invoice`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Invoice`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Invoice`", where , null);
    }







    // Getting All Data where
    public DataList<Invoice>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Invoice> modelList = new DataList<Invoice>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Invoice` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Invoice>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    InvoiceRepository repo = restAdapter.createRepository(InvoiceRepository.class);
                    repo.addStorage(context);
                    modelList.add((Invoice)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<Invoice>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `Invoice` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
      db.update("`Invoice`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Invoice`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Invoice _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`Invoice`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final Invoice _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`Invoice`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Invoice`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Invoice`", "_DATA_UPDATED = 0", null);
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
