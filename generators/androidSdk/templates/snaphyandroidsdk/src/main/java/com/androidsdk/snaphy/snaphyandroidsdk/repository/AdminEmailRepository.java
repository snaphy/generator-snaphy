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





public class AdminEmailRepository extends ModelRepository<AdminEmail> {


    public AdminEmailRepository(){
        super("AdminEmail", null, AdminEmail.class);
    }





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "adminEmail.getSchema");
            
        
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendNotice", "POST"), "adminEmail.sendNotice");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getMailSchema", "POST"), "adminEmail.getMailSchema");
            
        
        return contract;
    }



    




    
        
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

            

        
    
        
    
        
            //Method sendMail definition
            public void sendMail(  ArrayList<String> to,  String subject,  String html, final ObjectCallback<String> callback){
                


                
                    invokeStaticMethod("sendMail", ImmutableMap.of("to", to, "subject", subject, "html", html), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, String> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method sendMail definition ends here..

            

        
    
        
            //Method sendNotice definition
            public void sendNotice(  ArrayList<String> to,  String subject,  HashMap<String, Object> templateOptions, final ObjectCallback<String> callback){
                


                
                    invokeStaticMethod("sendNotice", ImmutableMap.of("to", to, "subject", subject, "templateOptions", templateOptions), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, String> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method sendNotice definition ends here..

            

        
    
        
            //Method getMailSchema definition
            public void getMailSchema( final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("getMailSchema", ImmutableMap.of(), new Adapter.JsonObjectCallback() {
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
                

                

            }//Method getMailSchema definition ends here..

            

        
    



}
