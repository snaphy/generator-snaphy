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
import com.androidsdk.snaphy.snaphyandroidsdk.models.LastUpdatedLocation;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Customer;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            
        
    





public class LastUpdatedLocationRepository extends ModelRepository<LastUpdatedLocation> {


    public LastUpdatedLocationRepository(){
        super("LastUpdatedLocation", null, LastUpdatedLocation.class);
    }


    





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:lastUpdatedLocationId/customer", "GET"), "LastUpdatedLocation.prototype.__get__customer");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "LastUpdatedLocation.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "LastUpdatedLocation.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "LastUpdatedLocation.upsert");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "LastUpdatedLocation.exists");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "LastUpdatedLocation.findById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "LastUpdatedLocation.find");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "LastUpdatedLocation.findOne");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "LastUpdatedLocation.updateAll");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "LastUpdatedLocation.deleteById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "LastUpdatedLocation.count");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:lastUpdatedLocationId", "PUT"), "LastUpdatedLocation.prototype.updateAttributes");
                

            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "LastUpdatedLocation.getSchema");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "LastUpdatedLocation.getAbsoluteSchema");
                

            
        
            
        
        return contract;
    }


    //override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method get__customer definition
            public void get__customer(  String id,  Boolean refresh, final ObjectCallback<Customer> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("get__customer", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CustomerRepository customerRepo = getRestAdapter().createRepository(CustomerRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    Customer customer = customerRepo.createObject(result);
                                    callback.onSuccess(customer);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method get__customer definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.create definition
            public void LastUpdatedLocation.create(  Map<String,  ? extends Object> data, final ObjectCallback<LastUpdatedLocation> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("LastUpdatedLocation.create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    LastUpdatedLocationRepository lastUpdatedLocationRepo = getRestAdapter().createRepository(LastUpdatedLocationRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    LastUpdatedLocation lastUpdatedLocation = lastUpdatedLocationRepo.createObject(result);
                                    callback.onSuccess(lastUpdatedLocation);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.create definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.create definition
            public void LastUpdatedLocation.create(  Map<String,  ? extends Object> data, final ObjectCallback<LastUpdatedLocation> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("LastUpdatedLocation.create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    LastUpdatedLocationRepository lastUpdatedLocationRepo = getRestAdapter().createRepository(LastUpdatedLocationRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    LastUpdatedLocation lastUpdatedLocation = lastUpdatedLocationRepo.createObject(result);
                                    callback.onSuccess(lastUpdatedLocation);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.create definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.upsert definition
            public void LastUpdatedLocation.upsert(  Map<String,  ? extends Object> data, final ObjectCallback<LastUpdatedLocation> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("LastUpdatedLocation.upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    LastUpdatedLocationRepository lastUpdatedLocationRepo = getRestAdapter().createRepository(LastUpdatedLocationRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    LastUpdatedLocation lastUpdatedLocation = lastUpdatedLocationRepo.createObject(result);
                                    callback.onSuccess(lastUpdatedLocation);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.upsert definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.exists definition
            public void LastUpdatedLocation.exists(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("LastUpdatedLocation.exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.exists definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.findById definition
            public void LastUpdatedLocation.findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<LastUpdatedLocation> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("LastUpdatedLocation.findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    LastUpdatedLocationRepository lastUpdatedLocationRepo = getRestAdapter().createRepository(LastUpdatedLocationRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    LastUpdatedLocation lastUpdatedLocation = lastUpdatedLocationRepo.createObject(result);
                                    callback.onSuccess(lastUpdatedLocation);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.findById definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.find definition
            public void LastUpdatedLocation.find(  Map<String,  ? extends Object> filter, final ListCallback<LastUpdatedLocation> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("LastUpdatedLocation.find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    List<Map<String, Object>> result = (List) JsonUtil.fromJson(response);
                                    List<LastUpdatedLocation> lastUpdatedLocationList = new ArrayList<LastUpdatedLocation>();
                                    LastUpdatedLocationRepository lastUpdatedLocationRepo = getRestAdapter().createRepository(LastUpdatedLocationRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        LastUpdatedLocation lastUpdatedLocation = lastUpdatedLocationRepo.createObject(obj);
                                        lastUpdatedLocationList.add(lastUpdatedLocation);
                                    }
                                    callback.onSuccess(lastUpdatedLocationList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

            }//Method LastUpdatedLocation.find definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.findOne definition
            public void LastUpdatedLocation.findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<LastUpdatedLocation> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("LastUpdatedLocation.findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    LastUpdatedLocationRepository lastUpdatedLocationRepo = getRestAdapter().createRepository(LastUpdatedLocationRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    LastUpdatedLocation lastUpdatedLocation = lastUpdatedLocationRepo.createObject(result);
                                    callback.onSuccess(lastUpdatedLocation);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.findOne definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.updateAll definition
            public void LastUpdatedLocation.updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("LastUpdatedLocation.updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.updateAll definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.deleteById definition
            public void LastUpdatedLocation.deleteById(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("LastUpdatedLocation.deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.deleteById definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.count definition
            public void LastUpdatedLocation.count(  Map<String,  ? extends Object> where, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("LastUpdatedLocation.count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String id,  Map<String,  ? extends Object> data, final ObjectCallback<LastUpdatedLocation> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("updateAttributes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    LastUpdatedLocationRepository lastUpdatedLocationRepo = getRestAdapter().createRepository(LastUpdatedLocationRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    LastUpdatedLocation lastUpdatedLocation = lastUpdatedLocationRepo.createObject(result);
                                    callback.onSuccess(lastUpdatedLocation);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
            //Method LastUpdatedLocation.getSchema definition
            public void LastUpdatedLocation.getSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("LastUpdatedLocation.getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.getSchema definition ends here..

            

        
    
        
            //Method LastUpdatedLocation.getAbsoluteSchema definition
            public void LastUpdatedLocation.getAbsoluteSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("LastUpdatedLocation.getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method LastUpdatedLocation.getAbsoluteSchema definition ends here..

            

        
    
        
    



}
