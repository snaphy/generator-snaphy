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

import com.androidsdk.snaphy.snaphyandroidsdk.models.Feed;
//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.FeedRepository;
import com.strongloop.android.loopback.RestAdapter;

/**
* Created by snaphy on 1/2/2017.
*/

public class FeedDb{

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

  public FeedDb(Context context, String DATABASE_NAME, RestAdapter restAdapter){
    //super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
    this.restAdapter = restAdapter;
    TABLE = "Feed";
    this.DATABASE_NAME = DATABASE_NAME;
    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
    DbHandler.getInstance(context, DATABASE_NAME).onCreate(db);
  }


    public void insert__db (final String id, final Feed _modelData) {
        // new Thread(new Runnable() {
        //      @Override
        //      public void run() {
                    
                    SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                    db.beginTransaction();
                    // Inserting Row
                    ContentValues values = getContentValues(_modelData);
                    db.insert("`Feed`", null, values);
                    //db.close(); // Closing database connection
                    db.setTransactionSuccessful();
                    db.endTransaction();
        //      }
        // }).start();
    }





    public ContentValues getContentValues(Feed _modelData){
      ContentValues values = new ContentValues();
                       
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
                                  
                                
                                                            String unique_numberData = "";
                        if(_modelData.getUnique_number() != null){
                          unique_numberData = _modelData.getUnique_number().toString();
                          values.put("`unique_number`", unique_numberData);
                        }
                                  
                                
                                                            String titleData = "";
                        if(_modelData.getTitle() != null){
                          titleData = _modelData.getTitle().toString();
                          values.put("`title`", titleData);
                        }
                                  
                                
                                                            String subTitleData = "";
                        if(_modelData.getSubTitle() != null){
                          subTitleData = _modelData.getSubTitle().toString();
                          values.put("`subTitle`", subTitleData);
                        }
                                  
                                
                                                            String descriptionData = "";
                        if(_modelData.getDescription() != null){
                          descriptionData = _modelData.getDescription().toString();
                          values.put("`description`", descriptionData);
                        }
                                  
                                
                                                            String feedImageData = "";
                        if(_modelData.getFeedImage() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          feedImageData = gson.toJson(_modelData.getFeedImage(), HashMap.class);
                          values.put("`feedImage`", feedImageData);
                        }
                                  
                                
                                                            String typeData = "";
                        if(_modelData.getType() != null){
                          typeData = _modelData.getType().toString();
                          values.put("`type`", typeData);
                        }
                                  
                                
                                  String flagCountData = "";
                  if(_modelData.getFlagCount() != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    flagCountData = gson.toJson(_modelData.getFlagCount(), DataList.class);
                    values.put("`flagCount`", flagCountData);
                  }
              
                                
                                                            String doctorFirstNameData = "";
                        if(_modelData.getDoctorFirstName() != null){
                          doctorFirstNameData = _modelData.getDoctorFirstName().toString();
                          values.put("`doctorFirstName`", doctorFirstNameData);
                        }
                                  
                                
                                                            String doctorLastNameData = "";
                        if(_modelData.getDoctorLastName() != null){
                          doctorLastNameData = _modelData.getDoctorLastName().toString();
                          values.put("`doctorLastName`", doctorLastNameData);
                        }
                                  
                                
                                                            String doctorProfilePicData = "";
                        if(_modelData.getDoctorProfilePic() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          doctorProfilePicData = gson.toJson(_modelData.getDoctorProfilePic(), HashMap.class);
                          values.put("`doctorProfilePic`", doctorProfilePicData);
                        }
                                  
                                
                                                            String patientFirstNameData = "";
                        if(_modelData.getPatientFirstName() != null){
                          patientFirstNameData = _modelData.getPatientFirstName().toString();
                          values.put("`patientFirstName`", patientFirstNameData);
                        }
                                  
                                
                                                            String patientLastNameData = "";
                        if(_modelData.getPatientLastName() != null){
                          patientLastNameData = _modelData.getPatientLastName().toString();
                          values.put("`patientLastName`", patientLastNameData);
                        }
                                  
                                
                                                            String patientProfilePicData = "";
                        if(_modelData.getPatientProfilePic() != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                          patientProfilePicData = gson.toJson(_modelData.getPatientProfilePic(), HashMap.class);
                          values.put("`patientProfilePic`", patientProfilePicData);
                        }
                                  
                                
                                                            String hospitalNameData = "";
                        if(_modelData.getHospitalName() != null){
                          hospitalNameData = _modelData.getHospitalName().toString();
                          values.put("`hospitalName`", hospitalNameData);
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
                        String patientSecurityIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getPatientSecurityId");
                              if(method.invoke(_modelData) != null){
                                //patientSecurityIdData = _modelData.getPatientSecurityId().toString();
                                patientSecurityIdData = (String) method.invoke(_modelData);
                                values.put("`patientSecurityId`", patientSecurityIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String stateIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getStateId");
                              if(method.invoke(_modelData) != null){
                                //stateIdData = _modelData.getStateId().toString();
                                stateIdData = (String) method.invoke(_modelData);
                                values.put("`stateId`", stateIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String companyIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getCompanyId");
                              if(method.invoke(_modelData) != null){
                                //companyIdData = _modelData.getCompanyId().toString();
                                companyIdData = (String) method.invoke(_modelData);
                                values.put("`companyId`", companyIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String pincodeIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getPincodeId");
                              if(method.invoke(_modelData) != null){
                                //pincodeIdData = _modelData.getPincodeId().toString();
                                pincodeIdData = (String) method.invoke(_modelData);
                                values.put("`pincodeId`", pincodeIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                                
                                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                        String districtIdData = "";
                        try {
                              Method method = _modelData.getClass().getMethod("getDistrictId");
                              if(method.invoke(_modelData) != null){
                                //districtIdData = _modelData.getDistrictId().toString();
                                districtIdData = (String) method.invoke(_modelData);
                                values.put("`districtId`", districtIdData);
                              }
                        } catch (Exception e) {
                          Log.e("Database Error", e.toString());
                        }

                                  
                  
        
          
        //Add the updated data property value to be 1
        values.put("`_DATA_UPDATED`", 1);
        return values;
    }



    // Getting single c
    public   Feed get__db(String id) {
        if (id != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("Feed", null, "id=?", new String[]{id}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);
                    cursor.close();
                    //db.close(); // Closing database connection
                    if (hashMap != null) {
                        FeedRepository repo = restAdapter.createRepository(FeedRepository.class);
                        repo.addStorage(context);
                        return (Feed)repo.createObject(hashMap);
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
    public   Feed get__db(String whereKey, String whereKeyValue) {
        if (whereKeyValue != null) {
            SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
            Cursor cursor = db.query("`Feed`", null, "`" + whereKey + "` =?", new String[]{whereKeyValue}, null, null, null, null);
            if (cursor != null) {
                if (!cursor.moveToFirst() || cursor.getCount() == 0){
                    return null;
                }else{
                    HashMap<String, Object> hashMap = parseCursor(cursor);

                    cursor.close();
                    //db.close(); // Closing database connection

                    if (hashMap != null) {
                        FeedRepository repo = restAdapter.createRepository(FeedRepository.class);
                        repo.addStorage(context);
                        return (Feed)repo.createObject(hashMap);
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

                      
                                                            String addedData = "";
                        if(cursor.getString(0) != null){
                          addedData = cursor.getString(0);
                          if(addedData != null){
                            addedData = (String)addedData;
                            hashMap.put("added", addedData);
                          }
                        }
                                                
                                
                                                            String updatedData = "";
                        if(cursor.getString(1) != null){
                          updatedData = cursor.getString(1);
                          if(updatedData != null){
                            updatedData = (String)updatedData;
                            hashMap.put("updated", updatedData);
                          }
                        }
                                                
                                
                                                            String unique_numberData = "";
                        if(cursor.getString(2) != null){
                          unique_numberData = cursor.getString(2);
                          if(unique_numberData != null){
                            unique_numberData = (String)unique_numberData;
                            hashMap.put("unique_number", unique_numberData);
                          }
                        }
                                                
                                
                                                            String titleData = "";
                        if(cursor.getString(3) != null){
                          titleData = cursor.getString(3);
                          if(titleData != null){
                            titleData = (String)titleData;
                            hashMap.put("title", titleData);
                          }
                        }
                                                
                                
                                                            String subTitleData = "";
                        if(cursor.getString(4) != null){
                          subTitleData = cursor.getString(4);
                          if(subTitleData != null){
                            subTitleData = (String)subTitleData;
                            hashMap.put("subTitle", subTitleData);
                          }
                        }
                                                
                                
                                                            String descriptionData = "";
                        if(cursor.getString(5) != null){
                          descriptionData = cursor.getString(5);
                          if(descriptionData != null){
                            descriptionData = (String)descriptionData;
                            hashMap.put("description", descriptionData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> feedImageData = new HashMap<>();
                        if(cursor.getString(6) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           feedImageData = gson.fromJson(cursor.getString(6), Map.class);
                          if(feedImageData != null){
                            feedImageData = (Map<String, Object>)feedImageData;
                            hashMap.put("feedImage", feedImageData);
                          }
                        }
                                                
                                
                                                            String typeData = "";
                        if(cursor.getString(7) != null){
                          typeData = cursor.getString(7);
                          if(typeData != null){
                            typeData = (String)typeData;
                            hashMap.put("type", typeData);
                          }
                        }
                                                
                                
                                  DataList<Map<String, Object>> flagCountData = new DataList<>();
                  if(cursor.getString(8) != null){
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                    Gson gson = gsonBuilder.create();
                    flagCountData = gson.fromJson(cursor.getString(8), DataList.class);
                    if(flagCountData != null){
                      flagCountData = (DataList<Map<String, Object>>)flagCountData;
                      hashMap.put("flagCount", flagCountData);
                    }
                  }
                            
                                
                                                            String doctorFirstNameData = "";
                        if(cursor.getString(9) != null){
                          doctorFirstNameData = cursor.getString(9);
                          if(doctorFirstNameData != null){
                            doctorFirstNameData = (String)doctorFirstNameData;
                            hashMap.put("doctorFirstName", doctorFirstNameData);
                          }
                        }
                                                
                                
                                                            String doctorLastNameData = "";
                        if(cursor.getString(10) != null){
                          doctorLastNameData = cursor.getString(10);
                          if(doctorLastNameData != null){
                            doctorLastNameData = (String)doctorLastNameData;
                            hashMap.put("doctorLastName", doctorLastNameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> doctorProfilePicData = new HashMap<>();
                        if(cursor.getString(11) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           doctorProfilePicData = gson.fromJson(cursor.getString(11), Map.class);
                          if(doctorProfilePicData != null){
                            doctorProfilePicData = (Map<String, Object>)doctorProfilePicData;
                            hashMap.put("doctorProfilePic", doctorProfilePicData);
                          }
                        }
                                                
                                
                                                            String patientFirstNameData = "";
                        if(cursor.getString(12) != null){
                          patientFirstNameData = cursor.getString(12);
                          if(patientFirstNameData != null){
                            patientFirstNameData = (String)patientFirstNameData;
                            hashMap.put("patientFirstName", patientFirstNameData);
                          }
                        }
                                                
                                
                                                            String patientLastNameData = "";
                        if(cursor.getString(13) != null){
                          patientLastNameData = cursor.getString(13);
                          if(patientLastNameData != null){
                            patientLastNameData = (String)patientLastNameData;
                            hashMap.put("patientLastName", patientLastNameData);
                          }
                        }
                                                
                                
                                                            Map<String, Object> patientProfilePicData = new HashMap<>();
                        if(cursor.getString(14) != null){
                          GsonBuilder gsonBuilder = new GsonBuilder();
                          gsonBuilder.setLongSerializationPolicy(LongSerializationPolicy.STRING);
                          Gson gson = gsonBuilder.create();
                           patientProfilePicData = gson.fromJson(cursor.getString(14), Map.class);
                          if(patientProfilePicData != null){
                            patientProfilePicData = (Map<String, Object>)patientProfilePicData;
                            hashMap.put("patientProfilePic", patientProfilePicData);
                          }
                        }
                                                
                                
                                                            String hospitalNameData = "";
                        if(cursor.getString(15) != null){
                          hospitalNameData = cursor.getString(15);
                          if(hospitalNameData != null){
                            hospitalNameData = (String)hospitalNameData;
                            hashMap.put("hospitalName", hospitalNameData);
                          }
                        }
                                                
                                
                                                            String idData = "";
                        if(cursor.getString(16) != null){
                          idData = cursor.getString(16);
                          if(idData != null){
                            idData = idData.toString();
                            hashMap.put("id", idData);
                          }
                        }
                                                
                                
                                                            String patientSecurityIdData = "";
                        if(cursor.getString(17) != null){
                          patientSecurityIdData = cursor.getString(17);
                          if(patientSecurityIdData != null){
                            patientSecurityIdData = patientSecurityIdData.toString();
                            hashMap.put("patientSecurityId", patientSecurityIdData);
                          }
                        }
                                                
                                
                                                            String stateIdData = "";
                        if(cursor.getString(18) != null){
                          stateIdData = cursor.getString(18);
                          if(stateIdData != null){
                            stateIdData = stateIdData.toString();
                            hashMap.put("stateId", stateIdData);
                          }
                        }
                                                
                                
                                                            String companyIdData = "";
                        if(cursor.getString(19) != null){
                          companyIdData = cursor.getString(19);
                          if(companyIdData != null){
                            companyIdData = companyIdData.toString();
                            hashMap.put("companyId", companyIdData);
                          }
                        }
                                                
                                
                                                            String pincodeIdData = "";
                        if(cursor.getString(20) != null){
                          pincodeIdData = cursor.getString(20);
                          if(pincodeIdData != null){
                            pincodeIdData = pincodeIdData.toString();
                            hashMap.put("pincodeId", pincodeIdData);
                          }
                        }
                                                
                                
                                                            String districtIdData = "";
                        if(cursor.getString(21) != null){
                          districtIdData = cursor.getString(21);
                          if(districtIdData != null){
                            districtIdData = districtIdData.toString();
                            hashMap.put("districtId", districtIdData);
                          }
                        }
                                                
                  //End for loop
         
          

        return hashMap;
    }//parseCursor



    public void upsert__db(String id, Feed model){
        if(count__db(id) != 0){
            update__db(id, model);
        }else{
            insert__db(id, model);
        }
    } //upsert__db



    // Getting All Contacts
    public DataList<Feed>  getAll__db() {
        DataList<Feed> modelList = new DataList<Feed>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Feed`";

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Feed>) modelList;
        }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    FeedRepository repo = restAdapter.createRepository(FeedRepository.class);
                    repo.addStorage(context);
                    modelList.add((Feed)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
        }
        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Feed>) modelList;
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
    public DataList<Feed>  getAll__db(HashMap<String, Object> whereKeyValue) {
        return getAll__db(whereKeyValue, null, 0, 0);
    }



    // Getting All Data where and sort column according to date wise..
    public DataList<Feed>  getAll__db(HashMap<String, Object> whereKeyValue, String orderBy, int limit, int skip) {
        DataList<Feed> modelList = new DataList<Feed>();
        String whereQuery = getWhereQuery(whereKeyValue);
        String selectQuery;
        if(orderBy != null){
            selectQuery = "SELECT  * FROM `Feed` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                selectQuery = selectQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = selectQuery +  " " + " LIMIT -1 OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                selectQuery = "SELECT  * FROM Feed " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                selectQuery = "SELECT  * FROM Feed " + whereQuery  + " LIMIT -1 OFFSET " + skip;
            }
        }

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Feed>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    FeedRepository repo = restAdapter.createRepository(FeedRepository.class);
                    repo.addStorage(context);
                    modelList.add((Feed)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Feed>) modelList;
    }



    // Getting All Data where
    public DataList<Feed>  getAll__db(HashMap<String, Object> whereKeyValue, int limit, int skip) {
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
            countQuery = "SELECT  * FROM `Feed` " + whereQuery  + " ORDER BY " + orderBy ;
            if(limit != 0){
                // Select All Query
                countQuery = countQuery +  " " + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = countQuery + " LIMIT -1  OFFSET " + skip;
            }
        }else{
            if(limit != 0){
                // Select All Query
                countQuery = "SELECT  * FROM `Feed` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
            }else{
                countQuery = "SELECT  * FROM `Feed` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
            countQuery = "SELECT  * FROM `Feed` " + whereQuery + " LIMIT " + limit + " OFFSET " + skip;
        }else{
            countQuery = "SELECT  * FROM `Feed` " + whereQuery + " LIMIT -1 OFFSET " + skip;
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
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                String where = getWhere(whereKeyValue);
                // updating row
                db.update("`Feed`", values, "_DATA_UPDATED = 1 AND " + where, null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final HashMap<String, Object> whereKeyValue) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("`Feed`", "_DATA_UPDATED = 0 AND " + where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }





    // Deleting by whereKeyValue filter data present..
    public void delete__db(final HashMap<String, Object> whereKeyValue) {
    //   new Thread(new Runnable() {
    //         @Override
    //         public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                String where = getWhere(whereKeyValue);
                db.delete("`Feed`", where , null);
                db.setTransactionSuccessful();
                db.endTransaction();
        //     }
        // }).start();
    }







    // Getting All Data where
    public DataList<Feed>  getAll__db(String whereKey, String whereKeyValue) {
        DataList<Feed> modelList = new DataList<Feed>();
        // Select All Query
        String selectQuery = "SELECT  * FROM `Feed` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;

        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
        db.beginTransaction();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
         if (!cursor.moveToFirst() || cursor.getCount() == 0){
            return (DataList<Feed>) modelList;
         }else{
            do {

                HashMap<String, Object> hashMap = parseCursor(cursor);
                if(hashMap != null){
                    FeedRepository repo = restAdapter.createRepository(FeedRepository.class);
                    repo.addStorage(context);
                    modelList.add((Feed)repo.createObject(hashMap));
                }
            } while (cursor.moveToNext());
         }

        db.setTransactionSuccessful();
        db.endTransaction();
        cursor.close();
        //db.close();
        // return contact list
        return (DataList<Feed>) modelList;
    }



    /**
     * Check count of database.
     * @param whereKey
     * @param whereKeyValue
     * @return
     */
    public int count__db(String whereKey, String whereKeyValue){
        String countQuery = "SELECT  * FROM `Feed` WHERE `" + whereKey +"` ='"+ whereKeyValue + "'" ;
        SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // Updating updated data property to new contact with where clause..
    public void checkOldData__db(final String whereKey, final String whereKeyValue) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                //http://www.tothenew.com/blog/sqlite-locking-and-transaction-handling-in-android/
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("`Feed`", values, "_DATA_UPDATED = 1 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();
    }


    // Delete Old data with where clause
    public void deleteOldData__db(final String whereKey, final String whereKeyValue) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("`Feed`", "_DATA_UPDATED = 0 AND `" + whereKey + "` = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }


    //Update multiple data at once..
    public void updateAll__db(final HashMap<String, Object> whereKeyValue, final Feed _modelData ){
    //   new Thread(new Runnable(){
    //     @Override
    //     public void run(){
          SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
          db.beginTransaction();
          ContentValues values = getContentValues(_modelData);
          String where = getWhere(whereKeyValue);
          db.update("`Feed`", values, where, null);
          db.setTransactionSuccessful();
          db.endTransaction();
          //db.close();
    //     }

    //   }).start();
    }




    // Deleting by whereKey and whereKeyValue
    public void delete__db(final String whereKey, final String whereKeyValue) {
    //   new Thread(new Runnable() {
    //         @Override
    //         public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, whereKey + " = ?", new String[]{whereKeyValue});
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();
    }



    // Updating single contact
    public void update__db(final String id,   final Feed _modelData) {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = getContentValues(_modelData);
                // updating row
                db.update("`Feed`", values, "id = ?",
                        new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }


    // Updating updated data property to new contact
    public void checkOldData__db() {
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                ContentValues values = new ContentValues();
                values.put("_DATA_UPDATED", 0);
                // updating row
                db.update("`Feed`", values, "_DATA_UPDATED = 1", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }


    // Delete Old data
    public void deleteOldData__db() {
    //   new Thread(new Runnable() {
    //         @Override
    //         public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete("`Feed`", "_DATA_UPDATED = 0", null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

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
    //   new Thread(new Runnable() {
    //         @Override
    //         public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE, KEY_ID + " = ?",
                new String[] { id });
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();
    }

    public void reset__db(){
        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
                SQLiteDatabase db = DbHandler.getInstance(context, DATABASE_NAME).getWritableDatabase();
                db.beginTransaction();
                db.delete(TABLE,null,null);
                db.setTransactionSuccessful();
                db.endTransaction();
                //db.close();
        //     }
        // }).start();

    }

}
