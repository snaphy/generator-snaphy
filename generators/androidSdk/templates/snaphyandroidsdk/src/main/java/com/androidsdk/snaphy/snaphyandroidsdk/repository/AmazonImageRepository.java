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
import com.androidsdk.snaphy.snaphyandroidsdk.models.AmazonImage;

//Now import model of related models..





public class AmazonImageRepository extends ModelRepository<AmazonImage> {


    public AmazonImageRepository(){
        super("AmazonImage", null, AmazonImage.class);
    }


    





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "AmazonImage.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "AmazonImage.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "AmazonImage.upsert");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "AmazonImage.exists");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "AmazonImage.findById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "AmazonImage.find");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "AmazonImage.findOne");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "AmazonImage.updateAll");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "AmazonImage.deleteById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "AmazonImage.count");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:amazonImageId", "PUT"), "AmazonImage.prototype.updateAttributes");
                

            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "AmazonImage.getSchema");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "AmazonImage.getAbsoluteSchema");
                

            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getUrl", "POST"), "AmazonImage.getUrl");
                

            
        
        return contract;
    }


    //override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method AmazonImage.create definition
            public void AmazonImage.create(  Map<String,  ? extends Object> data, final ObjectCallback<AmazonImage> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("AmazonImage.create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AmazonImageRepository amazonImageRepo = getRestAdapter().createRepository(AmazonImageRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    AmazonImage amazonImage = amazonImageRepo.createObject(result);
                                    callback.onSuccess(amazonImage);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method AmazonImage.create definition ends here..

            

        
    
        
            //Method AmazonImage.create definition
            public void AmazonImage.create(  Map<String,  ? extends Object> data, final ObjectCallback<AmazonImage> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("AmazonImage.create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AmazonImageRepository amazonImageRepo = getRestAdapter().createRepository(AmazonImageRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    AmazonImage amazonImage = amazonImageRepo.createObject(result);
                                    callback.onSuccess(amazonImage);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method AmazonImage.create definition ends here..

            

        
    
        
            //Method AmazonImage.upsert definition
            public void AmazonImage.upsert(  Map<String,  ? extends Object> data, final ObjectCallback<AmazonImage> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("AmazonImage.upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AmazonImageRepository amazonImageRepo = getRestAdapter().createRepository(AmazonImageRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    AmazonImage amazonImage = amazonImageRepo.createObject(result);
                                    callback.onSuccess(amazonImage);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method AmazonImage.upsert definition ends here..

            

        
    
        
            //Method AmazonImage.exists definition
            public void AmazonImage.exists(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("AmazonImage.exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method AmazonImage.exists definition ends here..

            

        
    
        
            //Method AmazonImage.findById definition
            public void AmazonImage.findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<AmazonImage> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("AmazonImage.findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AmazonImageRepository amazonImageRepo = getRestAdapter().createRepository(AmazonImageRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    AmazonImage amazonImage = amazonImageRepo.createObject(result);
                                    callback.onSuccess(amazonImage);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method AmazonImage.findById definition ends here..

            

        
    
        
            //Method AmazonImage.find definition
            public void AmazonImage.find(  Map<String,  ? extends Object> filter, final ListCallback<AmazonImage> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("AmazonImage.find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    List<Map<String, Object>> result = (List) JsonUtil.fromJson(response);
                                    List<AmazonImage> amazonImageList = new ArrayList<AmazonImage>();
                                    AmazonImageRepository amazonImageRepo = getRestAdapter().createRepository(AmazonImageRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        AmazonImage amazonImage = amazonImageRepo.createObject(obj);
                                        amazonImageList.add(amazonImage);
                                    }
                                    callback.onSuccess(amazonImageList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

            }//Method AmazonImage.find definition ends here..

            

        
    
        
            //Method AmazonImage.findOne definition
            public void AmazonImage.findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<AmazonImage> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("AmazonImage.findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AmazonImageRepository amazonImageRepo = getRestAdapter().createRepository(AmazonImageRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    AmazonImage amazonImage = amazonImageRepo.createObject(result);
                                    callback.onSuccess(amazonImage);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method AmazonImage.findOne definition ends here..

            

        
    
        
            //Method AmazonImage.updateAll definition
            public void AmazonImage.updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("AmazonImage.updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method AmazonImage.updateAll definition ends here..

            

        
    
        
            //Method AmazonImage.deleteById definition
            public void AmazonImage.deleteById(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("AmazonImage.deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method AmazonImage.deleteById definition ends here..

            

        
    
        
            //Method AmazonImage.count definition
            public void AmazonImage.count(  Map<String,  ? extends Object> where, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("AmazonImage.count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method AmazonImage.count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String id,  Map<String,  ? extends Object> data, final ObjectCallback<AmazonImage> callback){

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
                                    AmazonImageRepository amazonImageRepo = getRestAdapter().createRepository(AmazonImageRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    AmazonImage amazonImage = amazonImageRepo.createObject(result);
                                    callback.onSuccess(amazonImage);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
            //Method AmazonImage.getSchema definition
            public void AmazonImage.getSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("AmazonImage.getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method AmazonImage.getSchema definition ends here..

            

        
    
        
            //Method AmazonImage.getAbsoluteSchema definition
            public void AmazonImage.getAbsoluteSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("AmazonImage.getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method AmazonImage.getAbsoluteSchema definition ends here..

            

        
    
        
    
        
            //Method AmazonImage.getUrl definition
            public void AmazonImage.getUrl(  String container,  String file,  Map<String,  ? extends Object> options, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("container", container);
                
                        hashMapObject.put("file", file);
                
                        hashMapObject.put("options", options);
                

                


                
                    
                    invokeStaticMethod("AmazonImage.getUrl", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method AmazonImage.getUrl definition ends here..

            

        
    



}
