package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
import com.strongloop.android.loopback.ModelRepository;
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



import com.strongloop.android.loopback.ModelRepository;


import org.json.JSONObject;


//Now import model of related models..





public class ContainerRepository extends ModelRepository<Container> {


    public ContainerRepository(){
        super("Container", null, Container.class);
    }





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "container.getContainers");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "container.createContainer");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:container", "DELETE"), "container.destroyContainer");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:container", "GET"), "container.getContainer");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:container/files", "GET"), "container.getFiles");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:container/files/:file", "GET"), "container.getFile");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:container/files/:file", "DELETE"), "container.removeFile");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:container/upload", "POST"), "container.upload");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:container/download/:file", "GET"), "container.download");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "container.getSchema");
            
        
            
        
        return contract;
    }



    




    
        
            //Method getContainers definition
            public void getContainers( final ListCallback<String> callback){
                


                

                
                    invokeStaticMethod("getContainers", ImmutableMap.of(), new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                //If error happens then change it to Object type..
                                ArrayList<String> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

            }//Method getContainers definition ends here..

            

        
    
        
            //Method createContainer definition
            public void createContainer(  HashMap<String, Object> options, final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("createContainer", ImmutableMap.of("options", options), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method createContainer definition ends here..

            

        
    
        
            //Method destroyContainer definition
            public void destroyContainer(  String container, final VoidCallback callback){
                
                    invokeStaticMethod("destroyContainer", ImmutableMap.of("container", container), new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method destroyContainer definition ends here..

            

        
    
        
            //Method getContainer definition
            public void getContainer(  String container, final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("getContainer", ImmutableMap.of("container", container), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method getContainer definition ends here..

            

        
    
        
            //Method getFiles definition
            public void getFiles(  String container, final ListCallback<String> callback){
                


                

                
                    invokeStaticMethod("getFiles", ImmutableMap.of("container", container), new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                //If error happens then change it to Object type..
                                ArrayList<String> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

            }//Method getFiles definition ends here..

            

        
    
        
            //Method getFile definition
            public void getFile(  String container,  String file, final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("getFile", ImmutableMap.of("container", container, "file", file), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method getFile definition ends here..

            

        
    
        
            //Method removeFile definition
            public void removeFile(  String container,  String file, final VoidCallback callback){
                
                    invokeStaticMethod("removeFile", ImmutableMap.of("container", container, "file", file), new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method removeFile definition ends here..

            

        
    
        
            //Method upload definition
            public void upload(  HashMap<String, Object> req,  HashMap<String, Object> res, final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("upload", ImmutableMap.of("req", req, "res", res), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method upload definition ends here..

            

        
    
        
            //Method download definition
            public void download(  String container,  String file,  HashMap<String, Object> req,  HashMap<String, Object> res, final VoidCallback callback){
                
                    invokeStaticMethod("download", ImmutableMap.of("container", container, "file", file, "req", req, "res", res), new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method download definition ends here..

            

        
    
        
            //Method getSchema definition
            public void getSchema( final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("getSchema", ImmutableMap.of(), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
    



}
