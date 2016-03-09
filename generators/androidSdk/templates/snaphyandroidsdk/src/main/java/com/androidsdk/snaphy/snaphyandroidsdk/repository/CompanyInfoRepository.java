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
import com.androidsdk.snaphy.snaphyandroidsdk.models.CompanyInfo;

//Now import model of related models..





public class CompanyInfoRepository extends ModelRepository<CompanyInfo> {


    public CompanyInfoRepository(){
        super("CompanyInfo", null, CompanyInfo.class);
    }


    





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "CompanyInfo.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "CompanyInfo.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "CompanyInfo.upsert");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "CompanyInfo.exists");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "CompanyInfo.findById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "CompanyInfo.find");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "CompanyInfo.findOne");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "CompanyInfo.updateAll");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "CompanyInfo.deleteById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "CompanyInfo.count");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:companyInfoId", "PUT"), "CompanyInfo.prototype.updateAttributes");
                

            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "CompanyInfo.getSchema");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "CompanyInfo.getAbsoluteSchema");
                

            
        
            
        
        return contract;
    }


    //override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
                return "CompanyInfos";
            
    }



    




    
        
            //Method CompanyInfo.create definition
            public void CompanyInfo.create(  Map<String,  ? extends Object> data, final ObjectCallback<CompanyInfo> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("CompanyInfo.create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CompanyInfoRepository companyInfoRepo = getRestAdapter().createRepository(CompanyInfoRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    CompanyInfo companyInfo = companyInfoRepo.createObject(result);
                                    callback.onSuccess(companyInfo);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method CompanyInfo.create definition ends here..

            

        
    
        
            //Method CompanyInfo.create definition
            public void CompanyInfo.create(  Map<String,  ? extends Object> data, final ObjectCallback<CompanyInfo> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("CompanyInfo.create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CompanyInfoRepository companyInfoRepo = getRestAdapter().createRepository(CompanyInfoRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    CompanyInfo companyInfo = companyInfoRepo.createObject(result);
                                    callback.onSuccess(companyInfo);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method CompanyInfo.create definition ends here..

            

        
    
        
            //Method CompanyInfo.upsert definition
            public void CompanyInfo.upsert(  Map<String,  ? extends Object> data, final ObjectCallback<CompanyInfo> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("CompanyInfo.upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CompanyInfoRepository companyInfoRepo = getRestAdapter().createRepository(CompanyInfoRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    CompanyInfo companyInfo = companyInfoRepo.createObject(result);
                                    callback.onSuccess(companyInfo);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method CompanyInfo.upsert definition ends here..

            

        
    
        
            //Method CompanyInfo.exists definition
            public void CompanyInfo.exists(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("CompanyInfo.exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method CompanyInfo.exists definition ends here..

            

        
    
        
            //Method CompanyInfo.findById definition
            public void CompanyInfo.findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<CompanyInfo> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("CompanyInfo.findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CompanyInfoRepository companyInfoRepo = getRestAdapter().createRepository(CompanyInfoRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    CompanyInfo companyInfo = companyInfoRepo.createObject(result);
                                    callback.onSuccess(companyInfo);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method CompanyInfo.findById definition ends here..

            

        
    
        
            //Method CompanyInfo.find definition
            public void CompanyInfo.find(  Map<String,  ? extends Object> filter, final ListCallback<CompanyInfo> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("CompanyInfo.find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    List<Map<String, Object>> result = (List) JsonUtil.fromJson(response);
                                    List<CompanyInfo> companyInfoList = new ArrayList<CompanyInfo>();
                                    CompanyInfoRepository companyInfoRepo = getRestAdapter().createRepository(CompanyInfoRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        CompanyInfo companyInfo = companyInfoRepo.createObject(obj);
                                        companyInfoList.add(companyInfo);
                                    }
                                    callback.onSuccess(companyInfoList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

            }//Method CompanyInfo.find definition ends here..

            

        
    
        
            //Method CompanyInfo.findOne definition
            public void CompanyInfo.findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<CompanyInfo> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("CompanyInfo.findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CompanyInfoRepository companyInfoRepo = getRestAdapter().createRepository(CompanyInfoRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    CompanyInfo companyInfo = companyInfoRepo.createObject(result);
                                    callback.onSuccess(companyInfo);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method CompanyInfo.findOne definition ends here..

            

        
    
        
            //Method CompanyInfo.updateAll definition
            public void CompanyInfo.updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("CompanyInfo.updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method CompanyInfo.updateAll definition ends here..

            

        
    
        
            //Method CompanyInfo.deleteById definition
            public void CompanyInfo.deleteById(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("CompanyInfo.deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method CompanyInfo.deleteById definition ends here..

            

        
    
        
            //Method CompanyInfo.count definition
            public void CompanyInfo.count(  Map<String,  ? extends Object> where, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("CompanyInfo.count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method CompanyInfo.count definition ends here..

            

        
    
        
            //Method CompanyInfo.updateAttributes definition
            public void CompanyInfo.updateAttributes(  String companyInfoId,  Map<String,  ? extends Object> data, final ObjectCallback<CompanyInfo> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("companyInfoId", companyInfoId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("CompanyInfo.updateAttributes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CompanyInfoRepository companyInfoRepo = getRestAdapter().createRepository(CompanyInfoRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    CompanyInfo companyInfo = companyInfoRepo.createObject(result);
                                    callback.onSuccess(companyInfo);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method CompanyInfo.updateAttributes definition ends here..

            

        
    
        
    
        
            //Method CompanyInfo.getSchema definition
            public void CompanyInfo.getSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("CompanyInfo.getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method CompanyInfo.getSchema definition ends here..

            

        
    
        
            //Method CompanyInfo.getAbsoluteSchema definition
            public void CompanyInfo.getAbsoluteSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("CompanyInfo.getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method CompanyInfo.getAbsoluteSchema definition ends here..

            

        
    
        
    



}
