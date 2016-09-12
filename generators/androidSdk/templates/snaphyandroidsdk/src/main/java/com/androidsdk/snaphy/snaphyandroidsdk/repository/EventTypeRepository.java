package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.JsonUtil;
import com.strongloop.android.remoting.adapters.Adapter;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



import com.strongloop.android.loopback.ModelRepository;



import org.json.JSONArray;
import org.json.JSONObject;

//Import its models too.
import com.androidsdk.snaphy.snaphyandroidsdk.models.EventType;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Track;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TrackRepository;
            
        
    





public class EventTypeRepository extends ModelRepository<EventType> {


    public EventTypeRepository(){
        super("EventType", null, EventType.class);
    }


    





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:eventTypeId/tracks/:fk", "GET"), "EventType.prototype.__findById__tracks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:eventTypeId/tracks/:fk", "DELETE"), "EventType.prototype.__destroyById__tracks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:eventTypeId/tracks/:fk", "PUT"), "EventType.prototype.__updateById__tracks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:eventTypeId/tracks", "GET"), "EventType.prototype.__get__tracks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:eventTypeId/tracks", "POST"), "EventType.prototype.__create__tracks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:eventTypeId/tracks", "DELETE"), "EventType.prototype.__delete__tracks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:eventTypeId/tracks/count", "GET"), "EventType.prototype.__count__tracks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "EventType.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "EventType.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "EventType.upsert");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "EventType.exists");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "EventType.findById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "EventType.find");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "EventType.findOne");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "EventType.updateAll");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "EventType.deleteById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "EventType.count");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:eventTypeId", "PUT"), "EventType.prototype.updateAttributes");
                

            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "EventType.getSchema");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "EventType.getAbsoluteSchema");
                

            
        
            
        
            
        
        return contract;
    }


    //override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method findById__tracks definition
            public void findById__tracks(  String eventTypeId,  String fk, final ObjectCallback<Track> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("eventTypeId", eventTypeId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__tracks", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    TrackRepository trackRepo = getRestAdapter().createRepository(TrackRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    Track track = trackRepo.createObject(result);
                                    callback.onSuccess(track);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method findById__tracks definition ends here..

            

        
    
        
            //Method destroyById__tracks definition
            public void destroyById__tracks(  String eventTypeId,  String fk, final VoidCallback callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("eventTypeId", eventTypeId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__tracks", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method destroyById__tracks definition ends here..

            

        
    
        
            //Method updateById__tracks definition
            public void updateById__tracks(  String eventTypeId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<Track> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("eventTypeId", eventTypeId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__tracks", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    TrackRepository trackRepo = getRestAdapter().createRepository(TrackRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    Track track = trackRepo.createObject(result);
                                    callback.onSuccess(track);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method updateById__tracks definition ends here..

            

        
    
        
            //Method get__tracks definition
            public void get__tracks(  String eventTypeId,  Map<String,  ? extends Object> filter, final ListCallback<Track> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("eventTypeId", eventTypeId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__tracks", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    List<Map<String, Object>> result = (List) JsonUtil.fromJson(response);
                                    List<Track> trackList = new ArrayList<Track>();
                                    TrackRepository trackRepo = getRestAdapter().createRepository(TrackRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        Track track = trackRepo.createObject(obj);
                                        trackList.add(track);
                                    }
                                    callback.onSuccess(trackList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

            }//Method get__tracks definition ends here..

            

        
    
        
            //Method create__tracks definition
            public void create__tracks(  String eventTypeId,  Map<String,  ? extends Object> data, final ObjectCallback<Track> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("eventTypeId", eventTypeId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__tracks", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    TrackRepository trackRepo = getRestAdapter().createRepository(TrackRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    Track track = trackRepo.createObject(result);
                                    callback.onSuccess(track);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method create__tracks definition ends here..

            

        
    
        
            //Method delete__tracks definition
            public void delete__tracks(  String eventTypeId, final VoidCallback callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("eventTypeId", eventTypeId);
                

                
                    invokeStaticMethod("prototype.__delete__tracks", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method delete__tracks definition ends here..

            

        
    
        
            //Method count__tracks definition
            public void count__tracks(  String eventTypeId,  Map<String,  ? extends Object> where, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("eventTypeId", eventTypeId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__tracks", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method count__tracks definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<EventType> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EventTypeRepository eventTypeRepo = getRestAdapter().createRepository(EventTypeRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EventType eventType = eventTypeRepo.createObject(result);
                                    callback.onSuccess(eventType);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<EventType> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EventTypeRepository eventTypeRepo = getRestAdapter().createRepository(EventTypeRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EventType eventType = eventTypeRepo.createObject(result);
                                    callback.onSuccess(eventType);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method upsert definition ends here..

            

        
    
        
            //Method exists definition
            public void exists(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method exists definition ends here..

            

        
    
        
            //Method findById definition
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<EventType> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EventTypeRepository eventTypeRepo = getRestAdapter().createRepository(EventTypeRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EventType eventType = eventTypeRepo.createObject(result);
                                    callback.onSuccess(eventType);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final ListCallback<EventType> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    List<Map<String, Object>> result = (List) JsonUtil.fromJson(response);
                                    List<EventType> eventTypeList = new ArrayList<EventType>();
                                    EventTypeRepository eventTypeRepo = getRestAdapter().createRepository(EventTypeRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        EventType eventType = eventTypeRepo.createObject(obj);
                                        eventTypeList.add(eventType);
                                    }
                                    callback.onSuccess(eventTypeList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<EventType> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EventTypeRepository eventTypeRepo = getRestAdapter().createRepository(EventTypeRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EventType eventType = eventTypeRepo.createObject(result);
                                    callback.onSuccess(eventType);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method findOne definition ends here..

            

        
    
        
            //Method updateAll definition
            public void updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method updateAll definition ends here..

            

        
    
        
            //Method deleteById definition
            public void deleteById(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method deleteById definition ends here..

            

        
    
        
            //Method count definition
            public void count(  Map<String,  ? extends Object> where, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String eventTypeId,  Map<String,  ? extends Object> data, final ObjectCallback<EventType> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("eventTypeId", eventTypeId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.updateAttributes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EventTypeRepository eventTypeRepo = getRestAdapter().createRepository(EventTypeRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EventType eventType = eventTypeRepo.createObject(result);
                                    callback.onSuccess(eventType);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
            //Method getSchema definition
            public void getSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
            //Method getAbsoluteSchema definition
            public void getAbsoluteSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method getAbsoluteSchema definition ends here..

            

        
    
        
    
        
    



}
