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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Product;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class ProductDb{

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

  public ProductDb(Context context, String DATABASE_NAME, SnaphyRestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Product";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Product _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      // Inserting Row
      ContentValues values = getContentValues(_modelData);
      db.insert("`Product`", null, values);
    }





    public ContentValues getContentValues(Product _modelData){
      ContentValues values = new ContentValues();
                       
                                                            String idData = "";
                        if(_modelData.getId() != null){
                          idData = _modelData.getId().toString();
                          values.put("`id`", idData);
                        }
                                  
                                
                                                            String nameData = "";
                        if(_modelData.getName() != null){
                          nameData = _modelData.getName().toString();
                          values.put("`name`", nameData);
                        }
                                  
                                
                                                            String coverImageData = "";
                        if(_modelData.getCoverImage() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          coverImageData = gson.toJson(_modelData.getCoverImage(), HashMap.class);
                          values.put("`coverImage`", coverImageData);
                        }
                                  
                                
                                                            double inStockData;
                        inStockData = (double)_modelData.getInStock();
                        values.put("`inStock`", inStockData);
                                  
                                
                                                            double mrpData;
                        mrpData = (double)_modelData.getMrp();
                        values.put("`mrp`", mrpData);
                                  
                                
                                                            double discountedPriceData;
                        discountedPriceData = (double)_modelData.getDiscountedPrice();
                        values.put("`discountedPrice`", discountedPriceData);
                                  
                                
                                                            double minimumQuantityData;
                        minimumQuantityData = (double)_modelData.getMinimumQuantity();
                        values.put("`minimumQuantity`", minimumQuantityData);
                                  
                                
                                                            double maximumQuantityData;
                        maximumQuantityData = (double)_modelData.getMaximumQuantity();
                        values.put("`maximumQuantity`", maximumQuantityData);
                                  
                                
                                                            double minimumQuantityPriceData;
                        minimumQuantityPriceData = (double)_modelData.getMinimumQuantityPrice();
                        values.put("`minimumQuantityPrice`", minimumQuantityPriceData);
                                  
                                
                                                            double maximumQuantityPriceData;
                        maximumQuantityPriceData = (double)_modelData.getMaximumQuantityPrice();
                        values.put("`maximumQuantityPrice`", maximumQuantityPriceData);
                                  
                                
                                                            String identifierData = "";
                        if(_modelData.getIdentifier() != null){
                          identifierData = _modelData.getIdentifier().toString();
                          values.put("`identifier`", identifierData);
                        }
                                  
                                
                                                            double priorityData;
                        priorityData = (double)_modelData.getPriority();
                        values.put("`priority`", priorityData);
                                  
                                
                                                            int isTrendingData = 0;
                        if(_modelData.getIsTrending()){
                          isTrendingData = 1;
                        }else{
                          isTrendingData = 0;
                        }
                        values.put("`isTrending`", isTrendingData);
                                  
                                
                                  String otherImagesData = "";
                  if(_modelData.getOtherImages() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    otherImagesData = gson.toJson(_modelData.getOtherImages(), DataList.class);
                    values.put("`otherImages`", otherImagesData);
                  }
              
                                
                                                            double weightData;
                        weightData = (double)_modelData.getWeight();
                        values.put("`weight`", weightData);
                                  
                                
                                                            double sizeData;
                        sizeData = (double)_modelData.getSize();
                        values.put("`size`", sizeData);
                                  
                                
                                                            String offerTextData = "";
                        if(_modelData.getOfferText() != null){
                          offerTextData = _modelData.getOfferText().toString();
                          values.put("`offerText`", offerTextData);
                        }
                                  
                                
                                                            String warehouseLocationData = "";
                        if(_modelData.getWarehouseLocation() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          warehouseLocationData = gson.toJson(_modelData.getWarehouseLocation(), HashMap.class);
                          values.put("`warehouseLocation`", warehouseLocationData);
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
                                  
                                
                                                            String brandNameData = "";
                        if(_modelData.getBrandName() != null){
                          brandNameData = _modelData.getBrandName().toString();
                          values.put("`brandName`", brandNameData);
                        }
                                  
                                
                                                            String categoryNameData = "";
                        if(_modelData.getCategoryName() != null){
                          categoryNameData = _modelData.getCategoryName().toString();
                          values.put("`categoryName`", categoryNameData);
                        }
                                  
                                
                                                            String productSubCategoryNameData = "";
                        if(_modelData.getProductSubCategoryName() != null){
                          productSubCategoryNameData = _modelData.getProductSubCategoryName().toString();
                          values.put("`productSubCategoryName`", productSubCategoryNameData);
                        }
                                  
                                
                                                            String subCategoryGroupNameData = "";
                        if(_modelData.getSubCategoryGroupName() != null){
                          subCategoryGroupNameData = _modelData.getSubCategoryGroupName().toString();
                          values.put("`subCategoryGroupName`", subCategoryGroupNameData);
                        }
                                  
                                
                                                            String productStateData = "";
                        if(_modelData.getProductState() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          productStateData = gson.toJson(_modelData.getProductState(), HashMap.class);
                          values.put("`productState`", productStateData);
                        }
                                  
                                
                                                            String productReviewListData = "";
                        if(_modelData.getProductReviewList() != null){
                          productReviewListData = _modelData.getProductReviewList().toString();
                          values.put("`productReviewList`", productReviewListData);
                        }
                                  
                                
                                                            String descriptionData = "";
                        if(_modelData.getDescription() != null){
                          descriptionData = _modelData.getDescription().toString();
                          values.put("`description`", descriptionData);
                        }
                                  
                                
                                                            String productDetailData = "";
                        if(_modelData.getProductDetail() != null){
                          productDetailData = _modelData.getProductDetail().toString();
                          values.put("`productDetail`", productDetailData);
                        }
                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String categoryIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getCategoryId");
                              if(method.invoke(_modelData) != null){
                                //categoryIdData = _modelData.getCategoryId().toString();
                                categoryIdData = (String) method.invoke(_modelData);
                                values.put("`categoryId`", categoryIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String productSubCategoryIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getProductSubCategoryId");
                              if(method.invoke(_modelData) != null){
                                //productSubCategoryIdData = _modelData.getProductSubCategoryId().toString();
                                productSubCategoryIdData = (String) method.invoke(_modelData);
                                values.put("`productSubCategoryId`", productSubCategoryIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String subCategoryGroupIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getSubCategoryGroupId");
                              if(method.invoke(_modelData) != null){
                                //subCategoryGroupIdData = _modelData.getSubCategoryGroupId().toString();
                                subCategoryGroupIdData = (String) method.invoke(_modelData);
                                values.put("`subCategoryGroupId`", subCategoryGroupIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String brandIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getBrandId");
                              if(method.invoke(_modelData) != null){
                                //brandIdData = _modelData.getBrandId().toString();
                                brandIdData = (String) method.invoke(_modelData);
                                values.put("`brandId`", brandIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Product get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Product", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        ProductRepository repo = restAdapter.createRepository(ProductRepository.class);
                        repo.addStorage(context);
                        return (Product)repo.createObject(hashMap);
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
    public   Product get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`Product`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        ProductRepository repo = restAdapter.createRepository(ProductRepository.class);
                        repo.addStorage(context);
                        return (Product)repo.createObject(hashMap);
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
                                                
                                
                                                            String nameData = "";
                        if(cursor.getString(1) != null){
                          nameData = cursor.getString(1);
                          if(nameData != null){
                            nameData = (String)nameData;
                            hashMap.put("name", nameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> coverImageData = new HashMap<>();
                        if(cursor.getString(2) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           coverImageData = gson.fromJson(cursor.getString(2), Map.class);
                          if(coverImageData != null){
                            coverImageData = (Map<String, Object>)coverImageData;
                            hashMap.put("coverImage", coverImageData);
                          }
                        }
                                                
                                
                                                            double inStockData = (double)0;
                          inStockData = cursor.getInt(3);
                          inStockData = (double)inStockData;
                          hashMap.put("inStock", inStockData);


                                                
                                
                                                            double mrpData = (double)0;
                          mrpData = cursor.getInt(4);
                          mrpData = (double)mrpData;
                          hashMap.put("mrp", mrpData);


                                                
                                
                                                            double discountedPriceData = (double)0;
                          discountedPriceData = cursor.getInt(5);
                          discountedPriceData = (double)discountedPriceData;
                          hashMap.put("discountedPrice", discountedPriceData);


                                                
                                
                                                            double minimumQuantityData = (double)0;
                          minimumQuantityData = cursor.getInt(6);
                          minimumQuantityData = (double)minimumQuantityData;
                          hashMap.put("minimumQuantity", minimumQuantityData);


                                                
                                
                                                            double maximumQuantityData = (double)0;
                          maximumQuantityData = cursor.getInt(7);
                          maximumQuantityData = (double)maximumQuantityData;
                          hashMap.put("maximumQuantity", maximumQuantityData);


                                                
                                
                                                            double minimumQuantityPriceData = (double)0;
                          minimumQuantityPriceData = cursor.getInt(8);
                          minimumQuantityPriceData = (double)minimumQuantityPriceData;
                          hashMap.put("minimumQuantityPrice", minimumQuantityPriceData);


                                                
                                
                                                            double maximumQuantityPriceData = (double)0;
                          maximumQuantityPriceData = cursor.getInt(9);
                          maximumQuantityPriceData = (double)maximumQuantityPriceData;
                          hashMap.put("maximumQuantityPrice", maximumQuantityPriceData);


                                                
                                
                                                            String identifierData = "";
                        if(cursor.getString(10) != null){
                          identifierData = cursor.getString(10);
                          if(identifierData != null){
                            identifierData = (String)identifierData;
                            hashMap.put("identifier", identifierData);
                          }
                        }
                                                
                                
                                                            double priorityData = (double)0;
                          priorityData = cursor.getInt(11);
                          priorityData = (double)priorityData;
                          hashMap.put("priority", priorityData);


                                                
                                
                                                            boolean isTrendingData = false;
                        int tempisTrendingData = cursor.getInt(12);
                        if( tempisTrendingData > 0){
                          isTrendingData = true;
                        }else{
                          isTrendingData = false;
                        }
                        hashMap.put("isTrending", isTrendingData);
                                                
                                
                                  DataList<Map<String, Object>> otherImagesData = new DataList<>();
                  if(cursor.getString(13) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    otherImagesData = gson.fromJson(cursor.getString(13), DataList.class);
                    if(otherImagesData != null){
                      otherImagesData = (DataList<Map<String, Object>>)otherImagesData;
                      hashMap.put("otherImages", otherImagesData);
                    }
                  }
                            
                                
                                                            double weightData = (double)0;
                          weightData = cursor.getInt(14);
                          weightData = (double)weightData;
                          hashMap.put("weight", weightData);


                                                
                                
                                                            double sizeData = (double)0;
                          sizeData = cursor.getInt(15);
                          sizeData = (double)sizeData;
                          hashMap.put("size", sizeData);


                                                
                                
                                                            String offerTextData = "";
                        if(cursor.getString(16) != null){
                          offerTextData = cursor.getString(16);
                          if(offerTextData != null){
                            offerTextData = (String)offerTextData;
                            hashMap.put("offerText", offerTextData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> warehouseLocationData = new HashMap<>();
                        if(cursor.getString(17) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           warehouseLocationData = gson.fromJson(cursor.getString(17), Map.class);
                          if(warehouseLocationData != null){
                            warehouseLocationData = (Map<String, Object>)warehouseLocationData;
                            hashMap.put("warehouseLocation", warehouseLocationData);
                          }
                        }
                                                
                                
                                                            String addedData = "";
                        if(cursor.getString(18) != null){
                          addedData = cursor.getString(18);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(19) != null){
                          updatedData = cursor.getString(19);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String brandNameData = "";
                        if(cursor.getString(20) != null){
                          brandNameData = cursor.getString(20);
                          if(brandNameData != null){
                            brandNameData = (String)brandNameData;
                            hashMap.put("brandName", brandNameData);
                          }
                        }
                                                
                                
                                                            String categoryNameData = "";
                        if(cursor.getString(21) != null){
                          categoryNameData = cursor.getString(21);
                          if(categoryNameData != null){
                            categoryNameData = (String)categoryNameData;
                            hashMap.put("categoryName", categoryNameData);
                          }
                        }
                                                
                                
                                                            String productSubCategoryNameData = "";
                        if(cursor.getString(22) != null){
                          productSubCategoryNameData = cursor.getString(22);
                          if(productSubCategoryNameData != null){
                            productSubCategoryNameData = (String)productSubCategoryNameData;
                            hashMap.put("productSubCategoryName", productSubCategoryNameData);
                          }
                        }
                                                
                                
                                                            String subCategoryGroupNameData = "";
                        if(cursor.getString(23) != null){
                          subCategoryGroupNameData = cursor.getString(23);
                          if(subCategoryGroupNameData != null){
                            subCategoryGroupNameData = (String)subCategoryGroupNameData;
                            hashMap.put("subCategoryGroupName", subCategoryGroupNameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> productStateData = new HashMap<>();
                        if(cursor.getString(24) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           productStateData = gson.fromJson(cursor.getString(24), Map.class);
                          if(productStateData != null){
                            productStateData = (Map<String, Object>)productStateData;
                            hashMap.put("productState", productStateData);
                          }
                        }
                                                
                                
                                                            String productReviewListData = "";
                        if(cursor.getString(25) != null){
                          productReviewListData = cursor.getString(25);
                          if(productReviewListData != null){
                            productReviewListData = (String)productReviewListData;
                            hashMap.put("productReviewList", productReviewListData);
                          }
                        }
                                                
                                
                                                            String descriptionData = "";
                        if(cursor.getString(26) != null){
                          descriptionData = cursor.getString(26);
                          if(descriptionData != null){
                            descriptionData = (String)descriptionData;
                            hashMap.put("description", descriptionData);
                          }
                        }
                                                
                                
                                                            String productDetailData = "";
                        if(cursor.getString(27) != null){
                          productDetailData = cursor.getString(27);
                          if(productDetailData != null){
                            productDetailData = (String)productDetailData;
                            hashMap.put("productDetail", productDetailData);
                          }
                        }
                                                
                                
                                                            String categoryIdData = "";
                        if(cursor.getString(28) != null){
                          categoryIdData = cursor.getString(28);
                          if(categoryIdData != null){
                            categoryIdData = categoryIdData.toString();
                            hashMap.put("categoryId", categoryIdData);
                          }
                        }
                                                
                                
                                                            String productSubCategoryIdData = "";
                        if(cursor.getString(29) != null){
                          productSubCategoryIdData = cursor.getString(29);
                          if(productSubCategoryIdData != null){
                            productSubCategoryIdData = productSubCategoryIdData.toString();
                            hashMap.put("productSubCategoryId", productSubCategoryIdData);
                          }
                        }
                                                
                                
                                                            String subCategoryGroupIdData = "";
                        if(cursor.getString(30) != null){
                          subCategoryGroupIdData = cursor.getString(30);
                          if(subCategoryGroupIdData != null){
                            subCategoryGroupIdData = subCategoryGroupIdData.toString();
                            hashMap.put("subCategoryGroupId", subCategoryGroupIdData);
                          }
                        }
                                                
                                
                                                            String brandIdData = "";
                        if(cursor.getString(31) != null){
                          brandIdData = cursor.getString(31);
                          if(brandIdData != null){
                            brandIdData = brandIdData.toString();
                            hashMap.put("brandId", brandIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Product model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Product>  getAll__db() {
        DataList<Product> modelList = new DataList<Product>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Product`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Product>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ProductRepository repo = restAdapter.createRepository(ProductRepository.class);
                    repo.addStorage(context);
                    modelList.add((Product)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Product>) modelList;
    }


    //https://dmytrodanylyk.com/articles/lazy-sqlite/
    // Getting All Data where and sort column according to date wise..
    /**
     * Fetch the patient group by lazy data..
     * @param limit
     * @param skip
     * @return
     */
    public LazyList<Product> getAll__lazy(final int limit, final int skip, ObjectCallback<Product> callback, final GetUpdatedQuery getUpdatedQuery, final OnParseCursor onParseCursor) {


        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();

        final ProductRepository repo = restAdapter.createRepository(ProductRepository.class);
        repo.addStorage(context);
        return new LazyList<>(db, new LazyList.ItemFactory<Product>() {
            @Override
            public Product create(Cursor cursor, int index) {
                Product data;
                cursor.moveToPosition(index);
                HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                data = (Product)repo.createObject(hashMap);
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
                    selectQuery = "SELECT  * FROM `Product` " + whereQuery  + " ORDER BY " + orderBy ;
                    if(limit != 0){
                        // Select All Query
                        selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
                    }
                }else{
                    if(limit != 0){
                        // Select All Query
                        selectQuery = "SELECT  * FROM Product " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
                    }else{
                        selectQuery = "SELECT  * FROM Product " + whereQuery  + " LIMIT -1 OFFSET " + skip;
                    }
                }

                return selectQuery;
            }
        });
    }




    public Product get__db(String id, OnParseCursor onParseCursor){
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Product", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = onParseCursor.parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        ProductRepository repo = restAdapter.createRepository(ProductRepository.class);
                        repo.addStorage(context);
                        return (Product)repo.createObject(hashMap);
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
    public DataList<Product>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Product>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Product> modelList = new DataList<Product>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Product` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Product " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Product " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Product>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ProductRepository repo = restAdapter.createRepository(ProductRepository.class);
                    repo.addStorage(context);
                    modelList.add((Product)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        // return contact list
        return (DataList<Product>) modelList;
    }



    // Getting All Data where
    public DataList<Product>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `Product` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Product` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Product` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `Product` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Product` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            db.update("`Product`", values, "_DATA_UPDATED = 1 AND " + where, null);
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Product`", "_DATA_UPDATED = 0 AND " + where , null);
    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      String where = getWhere(whereKeyValue);
      db.delete("`Product`", where , null);
    }







    // Getting All Data where
    public DataList<Product>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Product> modelList = new DataList<Product>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Product` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Product>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    ProductRepository repo = restAdapter.createRepository(ProductRepository.class);
                    repo.addStorage(context);
                    modelList.add((Product)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }
        cursor.close();
        return (DataList<Product>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
      String countQuery = "SELECT  * FROM `Product` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
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
      db.update("`Product`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Product`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Product _modelData ){
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      String where = getWhere(whereKeyValue);
      db.update("`Product`", values, where, null);
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
    }



    // Updating single contact
    public void update__db(final String id,   final Product _modelData) {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = getContentValues(_modelData);
      // updating row
      db.update("`Product`", values, "id = ?", new String[] { id });
    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      ContentValues values = new ContentValues();
      values.put("_DATA_UPDATED", 0);
      // updating row
      db.update("`Product`", values, "_DATA_UPDATED = 1", null);
    }


    // Delete Old data
    public void deleteOldData__db() {
      SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
      db.delete("`Product`", "_DATA_UPDATED = 0", null);
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
