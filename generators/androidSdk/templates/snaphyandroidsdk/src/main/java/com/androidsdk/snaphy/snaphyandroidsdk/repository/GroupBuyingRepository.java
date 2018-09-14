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
import com.androidsdk.snaphy.snaphyandroidsdk.models.GroupBuying;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.GroupBuyingDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Product;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;
            
        
    





public class GroupBuyingRepository extends ModelRepository<GroupBuying> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public GroupBuyingRepository(){
        super("GroupBuying", null, GroupBuying.class);

    }


    public Context getContext(){
        return context;
    }


    







    public GroupBuyingDb getDb() {
      return groupBuyingDb;
    }

    public void setGroupBuyingDb(GroupBuyingDb groupBuyingDb) {
      this.groupBuyingDb = groupBuyingDb;
    }

    private GroupBuyingDb groupBuyingDb;



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
         setGroupBuyingDb(new GroupBuyingDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:groupBuyingId/product", "GET"), "GroupBuying.prototype.__get__product");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "GroupBuying.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "GroupBuying.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "GroupBuying.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "GroupBuying.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "GroupBuying.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "GroupBuying.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "GroupBuying.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "GroupBuying.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "GroupBuying.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "GroupBuying.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:groupBuyingId", "PUT"), "GroupBuying.prototype.updateAttributes");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "GroupBuying.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "GroupBuying.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "GroupBuying.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "GroupBuying.getModelRelationSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchGroupBuyProductList", "POST"), "GroupBuying.fetchGroupBuyProductList");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchGroupBuyingProductDetail", "POST"), "GroupBuying.fetchGroupBuyingProductDetail");
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method get__product definition
            public void get__product(  String groupBuyingId,  Boolean refresh, final ObjectCallback<Product> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("groupBuyingId", groupBuyingId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__product", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                                    ProductRepository productRepo = getRestAdapter().createRepository(ProductRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = productRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(productRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //productRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Product product = productRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = product.getClass().getMethod("save__db");
                                                    method.invoke(product);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(product);
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
                

                

            }//Method get__product definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<GroupBuying> callback){

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
                                    GroupBuyingRepository groupBuyingRepo = getRestAdapter().createRepository(GroupBuyingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = groupBuyingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(groupBuyingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //groupBuyingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    GroupBuying groupBuying = groupBuyingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = groupBuying.getClass().getMethod("save__db");
                                                    method.invoke(groupBuying);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(groupBuying);
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
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<GroupBuying> callback){

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
                                    GroupBuyingRepository groupBuyingRepo = getRestAdapter().createRepository(GroupBuyingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = groupBuyingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(groupBuyingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //groupBuyingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    GroupBuying groupBuying = groupBuyingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = groupBuying.getClass().getMethod("save__db");
                                                    method.invoke(groupBuying);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(groupBuying);
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
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<GroupBuying> callback){

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
                                    GroupBuyingRepository groupBuyingRepo = getRestAdapter().createRepository(GroupBuyingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = groupBuyingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(groupBuyingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //groupBuyingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    GroupBuying groupBuying = groupBuyingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = groupBuying.getClass().getMethod("save__db");
                                                    method.invoke(groupBuying);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(groupBuying);
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
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<GroupBuying> callback){

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
                                    DataList<GroupBuying> groupBuyingList = new DataList<GroupBuying>();
                                    GroupBuyingRepository groupBuyingRepo = getRestAdapter().createRepository(GroupBuyingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = groupBuyingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(groupBuyingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        GroupBuying groupBuying = groupBuyingRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = groupBuying.getClass().getMethod("save__db");
                                                      method.invoke(groupBuying);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        groupBuyingList.add(groupBuying);
                                    }
                                    callback.onSuccess(groupBuyingList);
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
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<GroupBuying> callback){

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
                                    GroupBuyingRepository groupBuyingRepo = getRestAdapter().createRepository(GroupBuyingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = groupBuyingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(groupBuyingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //groupBuyingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    GroupBuying groupBuying = groupBuyingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = groupBuying.getClass().getMethod("save__db");
                                                    method.invoke(groupBuying);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(groupBuying);
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
            public void updateAttributes(  String groupBuyingId,  Map<String,  ? extends Object> data, final ObjectCallback<GroupBuying> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("groupBuyingId", groupBuyingId);
                
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
                                    GroupBuyingRepository groupBuyingRepo = getRestAdapter().createRepository(GroupBuyingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = groupBuyingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(groupBuyingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //groupBuyingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    GroupBuying groupBuying = groupBuyingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = groupBuying.getClass().getMethod("save__db");
                                                    method.invoke(groupBuying);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(groupBuying);
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

            

        
    
        
            //Method fetchGroupBuyProductList definition
            public void fetchGroupBuyProductList(  double limit,  double skip, final DataListCallback<GroupBuying> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("fetchGroupBuyProductList", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<GroupBuying> groupBuyingList = new DataList<GroupBuying>();
                                    GroupBuyingRepository groupBuyingRepo = getRestAdapter().createRepository(GroupBuyingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = groupBuyingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(groupBuyingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        GroupBuying groupBuying = groupBuyingRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = groupBuying.getClass().getMethod("save__db");
                                                      method.invoke(groupBuying);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        groupBuyingList.add(groupBuying);
                                    }
                                    callback.onSuccess(groupBuyingList);
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
                

            }//Method fetchGroupBuyProductList definition ends here..

            

        
    
        
            //Method fetchGroupBuyingProductDetail definition
            public void fetchGroupBuyingProductDetail(  String productId, final ObjectCallback<GroupBuying> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("productId", productId);
                

                


                
                    
                    
                    invokeStaticMethod("fetchGroupBuyingProductDetail", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                                    GroupBuyingRepository groupBuyingRepo = getRestAdapter().createRepository(GroupBuyingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = groupBuyingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(groupBuyingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //groupBuyingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    GroupBuying groupBuying = groupBuyingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = groupBuying.getClass().getMethod("save__db");
                                                    method.invoke(groupBuying);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(groupBuying);
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
                

                

            }//Method fetchGroupBuyingProductDetail definition ends here..

            

        
    



}
