package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
/*
Replacing with custom Snaphy callback methods
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
*/
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.ObjectCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.DataListCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.callbacks.VoidCallback;
import com.androidsdk.snaphy.snaphyandroidsdk.list.DataList;
import com.androidsdk.snaphy.snaphyandroidsdk.list.Util;

import com.strongloop.android.remoting.adapters.Adapter;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;
import android.util.Log;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;


//Replaced by Custom ModelRepository method
//import com.strongloop.android.loopback.ModelRepository;



import org.json.JSONArray;
import org.json.JSONObject;


//Import its models too.
import com.androidsdk.snaphy.snaphyandroidsdk.models.Logistics;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.LogisticsDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Order;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.LogisticPartner;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.LogisticPartnerRepository;
            
        
    





public class LogisticsRepository extends ModelRepository<Logistics> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public LogisticsRepository(){
        super("Logistics", null, Logistics.class);

    }


    public Context getContext(){
        return context;
    }


    







    public LogisticsDb getDb() {
      return logisticsDb;
    }

    public void setLogisticsDb(LogisticsDb logisticsDb) {
      this.logisticsDb = logisticsDb;
    }

    private LogisticsDb logisticsDb;



    //Flag to check either to store data locally or not..
    private boolean STORE_LOCALLY = true;

    public boolean isSTORE_LOCALLY() {
      return STORE_LOCALLY;
    }


    public void  persistData(boolean persist){
      STORE_LOCALLY = persist;
    }



    public void reset__db(){
      if(isSTORE_LOCALLY()){
          getDb().reset__db();
      }
    }



    public void addStorage(Context context){
         try{
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            DATABASE_NAME = (String) ai.metaData.get(METADATA_DATABASE_NAME_KEY);
         }
         catch (Exception e){
            Log.e("Snaphy", e.toString());
         }
         setLogisticsDb(new LogisticsDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/:logisticsId/order", "GET"), "Logistics.prototype.__get__order");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/:logisticsId/logisticPartner", "GET"), "Logistics.prototype.__get__logisticPartner");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/", "POST"), "Logistics.create");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/", "POST"), "Logistics.create");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/", "PUT"), "Logistics.upsert");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/:id/exists", "GET"), "Logistics.exists");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/:id", "GET"), "Logistics.findById");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/", "GET"), "Logistics.find");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/findOne", "GET"), "Logistics.findOne");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/update", "POST"), "Logistics.updateAll");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/:id", "DELETE"), "Logistics.deleteById");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/count", "GET"), "Logistics.count");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/:logisticsId", "PUT"), "Logistics.prototype.updateAttributes");
    

    
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/getSchema", "POST"), "Logistics.getSchema");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/getAbsoluteSchema", "POST"), "Logistics.getAbsoluteSchema");
    

    
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/getDetailSchema", "POST"), "Logistics.getDetailSchema");
    

    
    

    

    

    contract.addItem(new RestContractItem("/" + "Logistics"  + "/getModelRelationSchema", "POST"), "Logistics.getModelRelationSchema");
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            return "Logistics";
        
    }



    




    
        
            //Method get__order definition
            public void get__order(  String logisticsId,  Boolean refresh, final ObjectCallback<Order> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("logisticsId", logisticsId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__order", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                if(response != null){
                                    OrderRepository orderRepo = getRestAdapter().createRepository(OrderRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = orderRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(orderRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //orderRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Order order = orderRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = order.getClass().getMethod("save__db");
                                                    method.invoke(order);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(order);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__order definition ends here..

            

        
    
        
            //Method get__logisticPartner definition
            public void get__logisticPartner(  String logisticsId,  Boolean refresh, final ObjectCallback<LogisticPartner> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("logisticsId", logisticsId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__logisticPartner", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                if(response != null){
                                    LogisticPartnerRepository logisticPartnerRepo = getRestAdapter().createRepository(LogisticPartnerRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = logisticPartnerRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(logisticPartnerRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //logisticPartnerRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    LogisticPartner logisticPartner = logisticPartnerRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = logisticPartner.getClass().getMethod("save__db");
                                                    method.invoke(logisticPartner);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(logisticPartner);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__logisticPartner definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<Logistics> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                if(response != null){
                                    LogisticsRepository logisticsRepo = getRestAdapter().createRepository(LogisticsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = logisticsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(logisticsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //logisticsRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Logistics logistics = logisticsRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = logistics.getClass().getMethod("save__db");
                                                    method.invoke(logistics);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(logistics);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<Logistics> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                if(response != null){
                                    LogisticsRepository logisticsRepo = getRestAdapter().createRepository(LogisticsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = logisticsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(logisticsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //logisticsRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Logistics logistics = logisticsRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = logistics.getClass().getMethod("save__db");
                                                    method.invoke(logistics);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(logistics);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method upsert definition ends here..

            

        
    
        
            //Method exists definition
            public void exists(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method exists definition ends here..

            

        
    
        
            //Method findById definition
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<Logistics> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                if(response != null){
                                    LogisticsRepository logisticsRepo = getRestAdapter().createRepository(LogisticsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = logisticsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(logisticsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //logisticsRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Logistics logistics = logisticsRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = logistics.getClass().getMethod("save__db");
                                                    method.invoke(logistics);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(logistics);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<Logistics> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                          try{
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<Logistics> logisticsList = new DataList<Logistics>();
                                    LogisticsRepository logisticsRepo = getRestAdapter().createRepository(LogisticsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = logisticsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(logisticsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Logistics logistics = logisticsRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = logistics.getClass().getMethod("save__db");
                                                      method.invoke(logistics);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        logisticsList.add(logistics);
                                    }
                                    callback.onSuccess(logisticsList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                          }catch(Exception e){
                            Log.e("Snaphy",e.toString());
                          }
                          //Call the finally method..
                          callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<Logistics> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                if(response != null){
                                    LogisticsRepository logisticsRepo = getRestAdapter().createRepository(LogisticsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = logisticsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(logisticsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //logisticsRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Logistics logistics = logisticsRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = logistics.getClass().getMethod("save__db");
                                                    method.invoke(logistics);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(logistics);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findOne definition ends here..

            

        
    
        
            //Method updateAll definition
            public void updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAll definition ends here..

            

        
    
        
            //Method deleteById definition
            public void deleteById(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method deleteById definition ends here..

            

        
    
        
            //Method count definition
            public void count(  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String logisticsId,  Map<String,  ? extends Object> data, final ObjectCallback<Logistics> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("logisticsId", logisticsId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.updateAttributes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                if(response != null){
                                    LogisticsRepository logisticsRepo = getRestAdapter().createRepository(LogisticsRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = logisticsRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(logisticsRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //logisticsRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Logistics logistics = logisticsRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = logistics.getClass().getMethod("save__db");
                                                    method.invoke(logistics);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(logistics);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
            //Method getSchema definition
            public void getSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
            //Method getAbsoluteSchema definition
            public void getAbsoluteSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getAbsoluteSchema definition ends here..

            

        
    
        
    
        
            //Method getDetailSchema definition
            public void getDetailSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getDetailSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getDetailSchema definition ends here..

            

        
    
        
            //Method getModelRelationSchema definition
            public void getModelRelationSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getModelRelationSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getModelRelationSchema definition ends here..

            

        
    
        
    



}
