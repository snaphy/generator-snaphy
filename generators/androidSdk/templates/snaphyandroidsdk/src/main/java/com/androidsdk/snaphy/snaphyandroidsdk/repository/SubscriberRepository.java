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
import com.androidsdk.snaphy.snaphyandroidsdk.models.Subscriber;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.SubscriberDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.AppUser;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.ChatRoom;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRoomRepository;
            
        
    





public class SubscriberRepository extends ModelRepository<Subscriber> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public SubscriberRepository(){
        super("Subscriber", null, Subscriber.class);

    }


    public Context getContext(){
        return context;
    }


    







    public SubscriberDb getDb() {
      return subscriberDb;
    }

    public void setSubscriberDb(SubscriberDb subscriberDb) {
      this.subscriberDb = subscriberDb;
    }

    private SubscriberDb subscriberDb;



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
         setSubscriberDb(new SubscriberDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:subscriberId/appUser", "GET"), "Subscriber.prototype.__get__appUser");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:subscriberId/chatRoom", "GET"), "Subscriber.prototype.__get__chatRoom");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Subscriber.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Subscriber.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "Subscriber.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "Subscriber.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "Subscriber.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "Subscriber.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "Subscriber.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "Subscriber.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "Subscriber.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "Subscriber.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:subscriberId", "PUT"), "Subscriber.prototype.updateAttributes");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "Subscriber.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "Subscriber.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/toggleNotify", "POST"), "Subscriber.toggleNotify");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSubscribedUser", "POST"), "Subscriber.getSubscribedUser");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "Subscriber.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "Subscriber.getModelRelationSchema");
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method get__appUser definition
            public void get__appUser(  String subscriberId,  Boolean refresh, final ObjectCallback<AppUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("subscriberId", subscriberId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__appUser", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AppUserRepository appUserRepo = getRestAdapter().createRepository(AppUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = appUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(appUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //appUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    AppUser appUser = appUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = appUser.getClass().getMethod("save__db");
                                                    method.invoke(appUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(appUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__appUser definition ends here..

            

        
    
        
            //Method get__chatRoom definition
            public void get__chatRoom(  String subscriberId,  Boolean refresh, final ObjectCallback<ChatRoom> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("subscriberId", subscriberId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__chatRoom", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatRoomRepository chatRoomRepo = getRestAdapter().createRepository(ChatRoomRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatRoomRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatRoomRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatRoomRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatRoom chatRoom = chatRoomRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatRoom.getClass().getMethod("save__db");
                                                    method.invoke(chatRoom);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatRoom);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__chatRoom definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<Subscriber> callback){

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
                            
                                if(response != null){
                                    SubscriberRepository subscriberRepo = getRestAdapter().createRepository(SubscriberRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subscriberRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subscriberRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subscriberRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Subscriber subscriber = subscriberRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subscriber.getClass().getMethod("save__db");
                                                    method.invoke(subscriber);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subscriber);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<Subscriber> callback){

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
                            
                                if(response != null){
                                    SubscriberRepository subscriberRepo = getRestAdapter().createRepository(SubscriberRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subscriberRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subscriberRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subscriberRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Subscriber subscriber = subscriberRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subscriber.getClass().getMethod("save__db");
                                                    method.invoke(subscriber);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subscriber);
                                }else{
                                    callback.onSuccess(null);
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
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method exists definition ends here..

            

        
    
        
            //Method findById definition
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<Subscriber> callback){

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
                            
                                if(response != null){
                                    SubscriberRepository subscriberRepo = getRestAdapter().createRepository(SubscriberRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subscriberRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subscriberRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subscriberRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Subscriber subscriber = subscriberRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subscriber.getClass().getMethod("save__db");
                                                    method.invoke(subscriber);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subscriber);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<Subscriber> callback){

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
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<Subscriber> subscriberList = new DataList<Subscriber>();
                                    SubscriberRepository subscriberRepo = getRestAdapter().createRepository(SubscriberRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subscriberRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subscriberRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Subscriber subscriber = subscriberRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = subscriber.getClass().getMethod("save__db");
                                                      method.invoke(subscriber);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        subscriberList.add(subscriber);
                                    }
                                    callback.onSuccess(subscriberList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<Subscriber> callback){

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
                            
                                if(response != null){
                                    SubscriberRepository subscriberRepo = getRestAdapter().createRepository(SubscriberRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subscriberRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subscriberRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subscriberRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Subscriber subscriber = subscriberRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subscriber.getClass().getMethod("save__db");
                                                    method.invoke(subscriber);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subscriber);
                                }else{
                                    callback.onSuccess(null);
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
                            
                                callback.onSuccess(response);
                            
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
                            
                                callback.onSuccess(response);
                            
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
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String subscriberId,  Map<String,  ? extends Object> data, final ObjectCallback<Subscriber> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("subscriberId", subscriberId);
                
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
                            
                                if(response != null){
                                    SubscriberRepository subscriberRepo = getRestAdapter().createRepository(SubscriberRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subscriberRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subscriberRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subscriberRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Subscriber subscriber = subscriberRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subscriber.getClass().getMethod("save__db");
                                                    method.invoke(subscriber);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subscriber);
                                }else{
                                    callback.onSuccess(null);
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
                            
                                callback.onSuccess(response);
                            
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
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getAbsoluteSchema definition ends here..

            

        
    
        
    
        
            //Method toggleNotify definition
            public void toggleNotify(  String subscriberId,  String isEnabled, final ObjectCallback<Subscriber> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("subscriberId", subscriberId);
                
                        hashMapObject.put("isEnabled", isEnabled);
                

                


                
                    
                    
                    invokeStaticMethod("toggleNotify", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    SubscriberRepository subscriberRepo = getRestAdapter().createRepository(SubscriberRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = subscriberRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(subscriberRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //subscriberRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Subscriber subscriber = subscriberRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = subscriber.getClass().getMethod("save__db");
                                                    method.invoke(subscriber);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(subscriber);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method toggleNotify definition ends here..

            

        
    
        
            //Method getSubscribedUser definition
            public void getSubscribedUser(  double subscriberId,  String chatRoomId, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("subscriberId", subscriberId);
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                

                


                
                    
                    invokeStaticMethod("getSubscribedUser", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getSubscribedUser definition ends here..

            

        
    
        
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
                            
                                callback.onSuccess(response);
                            
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
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getModelRelationSchema definition ends here..

            

        
    



}
