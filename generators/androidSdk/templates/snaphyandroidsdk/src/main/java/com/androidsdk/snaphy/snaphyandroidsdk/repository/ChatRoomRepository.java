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
import com.androidsdk.snaphy.snaphyandroidsdk.models.ChatRoom;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.ChatRoomDb;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Category;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CategoryRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.ChatItem;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.QuickMessage;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QuickMessageRepository;
            
        
    





public class ChatRoomRepository extends ModelRepository<ChatRoom> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public ChatRoomRepository(){
        super("ChatRoom", null, ChatRoom.class);

    }


    public Context getContext(){
        return context;
    }


    







    public ChatRoomDb getDb() {
      return chatRoomDb;
    }

    public void setChatRoomDb(ChatRoomDb chatRoomDb) {
      this.chatRoomDb = chatRoomDb;
    }

    private ChatRoomDb chatRoomDb;



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
         setChatRoomDb(new ChatRoomDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/quickMessages/:fk", "GET"), "ChatRoom.prototype.__findById__quickMessages");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/quickMessages/:fk", "DELETE"), "ChatRoom.prototype.__destroyById__quickMessages");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/quickMessages/:fk", "PUT"), "ChatRoom.prototype.__updateById__quickMessages");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/chatItems/:fk", "GET"), "ChatRoom.prototype.__findById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/chatItems/:fk", "DELETE"), "ChatRoom.prototype.__destroyById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/chatItems/:fk", "PUT"), "ChatRoom.prototype.__updateById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/category", "GET"), "ChatRoom.prototype.__get__category");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/quickMessages", "GET"), "ChatRoom.prototype.__get__quickMessages");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/quickMessages", "POST"), "ChatRoom.prototype.__create__quickMessages");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/quickMessages", "DELETE"), "ChatRoom.prototype.__delete__quickMessages");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/quickMessages/count", "GET"), "ChatRoom.prototype.__count__quickMessages");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/chatItems", "GET"), "ChatRoom.prototype.__get__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/chatItems", "POST"), "ChatRoom.prototype.__create__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/chatItems", "DELETE"), "ChatRoom.prototype.__delete__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId/chatItems/count", "GET"), "ChatRoom.prototype.__count__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "ChatRoom.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "ChatRoom.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "ChatRoom.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "ChatRoom.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "ChatRoom.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "ChatRoom.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "ChatRoom.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "ChatRoom.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "ChatRoom.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "ChatRoom.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:chatRoomId", "PUT"), "ChatRoom.prototype.updateAttributes");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "ChatRoom.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "ChatRoom.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getChatRoom", "POST"), "ChatRoom.getChatRoom");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "ChatRoom.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "ChatRoom.getModelRelationSchema");
    

    
    

    
    

    
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method findById__quickMessages definition
            public void findById__quickMessages(  String chatRoomId,  String fk, final ObjectCallback<QuickMessage> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__quickMessages", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    QuickMessageRepository quickMessageRepo = getRestAdapter().createRepository(QuickMessageRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = quickMessageRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(quickMessageRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //quickMessageRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    QuickMessage quickMessage = quickMessageRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = quickMessage.getClass().getMethod("save__db");
                                                    method.invoke(quickMessage);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(quickMessage);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__quickMessages definition ends here..

            

        
    
        
            //Method destroyById__quickMessages definition
            public void destroyById__quickMessages(  String chatRoomId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__quickMessages", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__quickMessages definition ends here..

            

        
    
        
            //Method updateById__quickMessages definition
            public void updateById__quickMessages(  String chatRoomId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<QuickMessage> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__quickMessages", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    QuickMessageRepository quickMessageRepo = getRestAdapter().createRepository(QuickMessageRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = quickMessageRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(quickMessageRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //quickMessageRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    QuickMessage quickMessage = quickMessageRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = quickMessage.getClass().getMethod("save__db");
                                                    method.invoke(quickMessage);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(quickMessage);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__quickMessages definition ends here..

            

        
    
        
            //Method findById__chatItems definition
            public void findById__chatItems(  String chatRoomId,  String fk, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__chatItems definition ends here..

            

        
    
        
            //Method destroyById__chatItems definition
            public void destroyById__chatItems(  String chatRoomId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__chatItems", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__chatItems definition ends here..

            

        
    
        
            //Method updateById__chatItems definition
            public void updateById__chatItems(  String chatRoomId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__chatItems definition ends here..

            

        
    
        
            //Method get__category definition
            public void get__category(  String chatRoomId,  Boolean refresh, final ObjectCallback<Category> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
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
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__category definition ends here..

            

        
    
        
            //Method get__quickMessages definition
            public void get__quickMessages(  String chatRoomId,  Map<String,  ? extends Object> filter, final DataListCallback<QuickMessage> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__quickMessages", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<QuickMessage> quickMessageList = new DataList<QuickMessage>();
                                    QuickMessageRepository quickMessageRepo = getRestAdapter().createRepository(QuickMessageRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = quickMessageRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(quickMessageRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        QuickMessage quickMessage = quickMessageRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = quickMessage.getClass().getMethod("save__db");
                                                      method.invoke(quickMessage);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        quickMessageList.add(quickMessage);
                                    }
                                    callback.onSuccess(quickMessageList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__quickMessages definition ends here..

            

        
    
        
            //Method create__quickMessages definition
            public void create__quickMessages(  String chatRoomId,  Map<String,  ? extends Object> data, final ObjectCallback<QuickMessage> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__quickMessages", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    QuickMessageRepository quickMessageRepo = getRestAdapter().createRepository(QuickMessageRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = quickMessageRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(quickMessageRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //quickMessageRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    QuickMessage quickMessage = quickMessageRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = quickMessage.getClass().getMethod("save__db");
                                                    method.invoke(quickMessage);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(quickMessage);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__quickMessages definition ends here..

            

        
    
        
            //Method delete__quickMessages definition
            public void delete__quickMessages(  String chatRoomId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                

                
                    invokeStaticMethod("prototype.__delete__quickMessages", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__quickMessages definition ends here..

            

        
    
        
            //Method count__quickMessages definition
            public void count__quickMessages(  String chatRoomId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__quickMessages", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method count__quickMessages definition ends here..

            

        
    
        
            //Method get__chatItems definition
            public void get__chatItems(  String chatRoomId,  Map<String,  ? extends Object> filter, final DataListCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__chatItems", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<ChatItem> chatItemList = new DataList<ChatItem>();
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        ChatItem chatItem = chatItemRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = chatItem.getClass().getMethod("save__db");
                                                      method.invoke(chatItem);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        chatItemList.add(chatItem);
                                    }
                                    callback.onSuccess(chatItemList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__chatItems definition ends here..

            

        
    
        
            //Method create__chatItems definition
            public void create__chatItems(  String chatRoomId,  Map<String,  ? extends Object> data, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__chatItems definition ends here..

            

        
    
        
            //Method delete__chatItems definition
            public void delete__chatItems(  String chatRoomId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                

                
                    invokeStaticMethod("prototype.__delete__chatItems", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__chatItems definition ends here..

            

        
    
        
            //Method count__chatItems definition
            public void count__chatItems(  String chatRoomId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method count__chatItems definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<ChatRoom> callback){

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
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<ChatRoom> callback){

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
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<ChatRoom> callback){

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
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<ChatRoom> callback){

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
                                    DataList<ChatRoom> chatRoomList = new DataList<ChatRoom>();
                                    ChatRoomRepository chatRoomRepo = getRestAdapter().createRepository(ChatRoomRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatRoomRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatRoomRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        ChatRoom chatRoom = chatRoomRepo.createObject(obj);

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

                                        chatRoomList.add(chatRoom);
                                    }
                                    callback.onSuccess(chatRoomList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<ChatRoom> callback){

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
            public void updateAttributes(  String chatRoomId,  Map<String,  ? extends Object> data, final ObjectCallback<ChatRoom> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("chatRoomId", chatRoomId);
                
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

            

        
    
        
    
        
            //Method getChatRoom definition
            public void getChatRoom(  String oriRoomId, final ObjectCallback<ChatRoom> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("oriRoomId", oriRoomId);
                

                


                
                    
                    
                    invokeStaticMethod("getChatRoom", hashMapObject, new Adapter.JsonObjectCallback() {
                    
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
                

                

            }//Method getChatRoom definition ends here..

            

        
    
        
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
