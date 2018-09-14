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
import com.androidsdk.snaphy.snaphyandroidsdk.models.SubCategoryGroup;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.SubCategoryGroupDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Category;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CategoryRepository;
            
        
    





public class SubCategoryGroupRepository extends ModelRepository<SubCategoryGroup> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public SubCategoryGroupRepository(){
        super("SubCategoryGroup", null, SubCategoryGroup.class);

    }


    public Context getContext(){
        return context;
    }


    







    public SubCategoryGroupDb getDb() {
      return subCategoryGroupDb;
    }

    public void setSubCategoryGroupDb(SubCategoryGroupDb subCategoryGroupDb) {
      this.subCategoryGroupDb = subCategoryGroupDb;
    }

    private SubCategoryGroupDb subCategoryGroupDb;



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
         setSubCategoryGroupDb(new SubCategoryGroupDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:subCategoryGroupId/category", "GET"), "SubCategoryGroup.prototype.__get__category");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "SubCategoryGroup.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "SubCategoryGroup.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "SubCategoryGroup.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "SubCategoryGroup.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "SubCategoryGroup.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "SubCategoryGroup.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "SubCategoryGroup.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "SubCategoryGroup.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "SubCategoryGroup.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "SubCategoryGroup.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:subCategoryGroupId", "PUT"), "SubCategoryGroup.prototype.updateAttributes");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "SubCategoryGroup.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "SubCategoryGroup.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "SubCategoryGroup.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "SubCategoryGroup.getModelRelationSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchSubCategoryList", "POST"), "SubCategoryGroup.fetchSubCategoryList");
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method get__category definition
            public void get__category(  String subCategoryGroupId,  Boolean refresh, final ObjectCallback<Category> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("subCategoryGroupId", subCategoryGroupId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__category", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                                    CategoryRepository categoryRepo = getRestAdapter().createRepository(CategoryRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = categoryRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(categoryRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //categoryRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Category category = categoryRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = category.getClass().getMethod("save__db");
                                                    method.invoke(category);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(category);
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
                

                

            }//Method get__category definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<SubCategoryGroup> callback){

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
                                    SubCategoryGroupRepository subCategoryGroupRepo = getRestAdapter().createRepository(SubCategoryGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subCategoryGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subCategoryGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subCategoryGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    SubCategoryGroup subCategoryGroup = subCategoryGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subCategoryGroup.getClass().getMethod("save__db");
                                                    method.invoke(subCategoryGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subCategoryGroup);
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
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<SubCategoryGroup> callback){

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
                                    SubCategoryGroupRepository subCategoryGroupRepo = getRestAdapter().createRepository(SubCategoryGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subCategoryGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subCategoryGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subCategoryGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    SubCategoryGroup subCategoryGroup = subCategoryGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subCategoryGroup.getClass().getMethod("save__db");
                                                    method.invoke(subCategoryGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subCategoryGroup);
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
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<SubCategoryGroup> callback){

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
                                    SubCategoryGroupRepository subCategoryGroupRepo = getRestAdapter().createRepository(SubCategoryGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subCategoryGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subCategoryGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subCategoryGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    SubCategoryGroup subCategoryGroup = subCategoryGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subCategoryGroup.getClass().getMethod("save__db");
                                                    method.invoke(subCategoryGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subCategoryGroup);
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
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<SubCategoryGroup> callback){

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
                                    DataList<SubCategoryGroup> subCategoryGroupList = new DataList<SubCategoryGroup>();
                                    SubCategoryGroupRepository subCategoryGroupRepo = getRestAdapter().createRepository(SubCategoryGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subCategoryGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subCategoryGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        SubCategoryGroup subCategoryGroup = subCategoryGroupRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = subCategoryGroup.getClass().getMethod("save__db");
                                                      method.invoke(subCategoryGroup);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        subCategoryGroupList.add(subCategoryGroup);
                                    }
                                    callback.onSuccess(subCategoryGroupList);
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
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<SubCategoryGroup> callback){

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
                                    SubCategoryGroupRepository subCategoryGroupRepo = getRestAdapter().createRepository(SubCategoryGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subCategoryGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subCategoryGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subCategoryGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    SubCategoryGroup subCategoryGroup = subCategoryGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subCategoryGroup.getClass().getMethod("save__db");
                                                    method.invoke(subCategoryGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subCategoryGroup);
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
            public void updateAttributes(  String subCategoryGroupId,  Map<String,  ? extends Object> data, final ObjectCallback<SubCategoryGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("subCategoryGroupId", subCategoryGroupId);
                
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
                                    SubCategoryGroupRepository subCategoryGroupRepo = getRestAdapter().createRepository(SubCategoryGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subCategoryGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subCategoryGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subCategoryGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    SubCategoryGroup subCategoryGroup = subCategoryGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subCategoryGroup.getClass().getMethod("save__db");
                                                    method.invoke(subCategoryGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subCategoryGroup);
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

            

        
    
        
            //Method fetchSubCategoryList definition
            public void fetchSubCategoryList(  String categoryId,  double limit,  double skip, final DataListCallback<SubCategoryGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("categoryId", categoryId);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("skip", skip);
                

                


                

                
                    invokeStaticMethod("fetchSubCategoryList", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<SubCategoryGroup> subCategoryGroupList = new DataList<SubCategoryGroup>();
                                    SubCategoryGroupRepository subCategoryGroupRepo = getRestAdapter().createRepository(SubCategoryGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subCategoryGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subCategoryGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        SubCategoryGroup subCategoryGroup = subCategoryGroupRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = subCategoryGroup.getClass().getMethod("save__db");
                                                      method.invoke(subCategoryGroup);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        subCategoryGroupList.add(subCategoryGroup);
                                    }
                                    callback.onSuccess(subCategoryGroupList);
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
                

            }//Method fetchSubCategoryList definition ends here..

            

        
    
        
    



}
