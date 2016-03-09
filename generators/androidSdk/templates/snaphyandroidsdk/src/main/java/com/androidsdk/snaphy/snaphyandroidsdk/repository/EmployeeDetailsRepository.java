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
import com.androidsdk.snaphy.snaphyandroidsdk.models.EmployeeDetails;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Employee;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;
            
        
    





public class EmployeeDetailsRepository extends ModelRepository<EmployeeDetails> {


    public EmployeeDetailsRepository(){
        super("EmployeeDetails", null, EmployeeDetails.class);
    }


    





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/:employeeDetailsId/employees", "GET"), "EmployeeDetails.prototype.__get__employees");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/:employeeDetailsId/employees", "POST"), "EmployeeDetails.prototype.__create__employees");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/:employeeDetailsId/employees", "PUT"), "EmployeeDetails.prototype.__update__employees");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/:employeeDetailsId/employees", "DELETE"), "EmployeeDetails.prototype.__destroy__employees");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/", "POST"), "EmployeeDetails.create");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/", "POST"), "EmployeeDetails.create");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/", "PUT"), "EmployeeDetails.upsert");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/:id/exists", "GET"), "EmployeeDetails.exists");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/:id", "GET"), "EmployeeDetails.findById");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/", "GET"), "EmployeeDetails.find");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/findOne", "GET"), "EmployeeDetails.findOne");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/update", "POST"), "EmployeeDetails.updateAll");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/:id", "DELETE"), "EmployeeDetails.deleteById");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/count", "GET"), "EmployeeDetails.count");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/:employeeDetailsId", "PUT"), "EmployeeDetails.prototype.updateAttributes");
                

            
        
            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/getSchema", "POST"), "EmployeeDetails.getSchema");
                

            
        
            

                

                    contract.addItem(new RestContractItem("/" + "EmployeeDetails"  + "/getAbsoluteSchema", "POST"), "EmployeeDetails.getAbsoluteSchema");
                

            
        
            
        
            
        
            
        
            
        
            
        
            
        
        return contract;
    }


    //override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            return "EmployeeDetails";
        
    }



    




    
        
            //Method get__employees definition
            public void get__employees(  String id,  Boolean refresh, final ObjectCallback<Employee> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("get__employees", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EmployeeRepository employeeRepo = getRestAdapter().createRepository(EmployeeRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    Employee employee = employeeRepo.createObject(result);
                                    callback.onSuccess(employee);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method get__employees definition ends here..

            

        
    
        
            //Method create__employees definition
            public void create__employees(  String id,  Map<String,  ? extends Object> data, final ObjectCallback<Employee> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("create__employees", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EmployeeRepository employeeRepo = getRestAdapter().createRepository(EmployeeRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    Employee employee = employeeRepo.createObject(result);
                                    callback.onSuccess(employee);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method create__employees definition ends here..

            

        
    
        
            //Method update__employees definition
            public void update__employees(  String id,  Map<String,  ? extends Object> data, final ObjectCallback<Employee> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("update__employees", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EmployeeRepository employeeRepo = getRestAdapter().createRepository(EmployeeRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    Employee employee = employeeRepo.createObject(result);
                                    callback.onSuccess(employee);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method update__employees definition ends here..

            

        
    
        
            //Method destroy__employees definition
            public void destroy__employees(  String id, final VoidCallback callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                
                    invokeStaticMethod("destroy__employees", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method destroy__employees definition ends here..

            

        
    
        
            //Method EmployeeDetails.create definition
            public void EmployeeDetails.create(  Map<String,  ? extends Object> data, final ObjectCallback<EmployeeDetails> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("EmployeeDetails.create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EmployeeDetailsRepository employeeDetailsRepo = getRestAdapter().createRepository(EmployeeDetailsRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EmployeeDetails employeeDetails = employeeDetailsRepo.createObject(result);
                                    callback.onSuccess(employeeDetails);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.create definition ends here..

            

        
    
        
            //Method EmployeeDetails.create definition
            public void EmployeeDetails.create(  Map<String,  ? extends Object> data, final ObjectCallback<EmployeeDetails> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("EmployeeDetails.create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EmployeeDetailsRepository employeeDetailsRepo = getRestAdapter().createRepository(EmployeeDetailsRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EmployeeDetails employeeDetails = employeeDetailsRepo.createObject(result);
                                    callback.onSuccess(employeeDetails);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.create definition ends here..

            

        
    
        
            //Method EmployeeDetails.upsert definition
            public void EmployeeDetails.upsert(  Map<String,  ? extends Object> data, final ObjectCallback<EmployeeDetails> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("EmployeeDetails.upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EmployeeDetailsRepository employeeDetailsRepo = getRestAdapter().createRepository(EmployeeDetailsRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EmployeeDetails employeeDetails = employeeDetailsRepo.createObject(result);
                                    callback.onSuccess(employeeDetails);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.upsert definition ends here..

            

        
    
        
            //Method EmployeeDetails.exists definition
            public void EmployeeDetails.exists(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("EmployeeDetails.exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.exists definition ends here..

            

        
    
        
            //Method EmployeeDetails.findById definition
            public void EmployeeDetails.findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<EmployeeDetails> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("EmployeeDetails.findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EmployeeDetailsRepository employeeDetailsRepo = getRestAdapter().createRepository(EmployeeDetailsRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EmployeeDetails employeeDetails = employeeDetailsRepo.createObject(result);
                                    callback.onSuccess(employeeDetails);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.findById definition ends here..

            

        
    
        
            //Method EmployeeDetails.find definition
            public void EmployeeDetails.find(  Map<String,  ? extends Object> filter, final ListCallback<EmployeeDetails> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("EmployeeDetails.find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    List<Map<String, Object>> result = (List) JsonUtil.fromJson(response);
                                    List<EmployeeDetails> employeeDetailsList = new ArrayList<EmployeeDetails>();
                                    EmployeeDetailsRepository employeeDetailsRepo = getRestAdapter().createRepository(EmployeeDetailsRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        EmployeeDetails employeeDetails = employeeDetailsRepo.createObject(obj);
                                        employeeDetailsList.add(employeeDetails);
                                    }
                                    callback.onSuccess(employeeDetailsList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

            }//Method EmployeeDetails.find definition ends here..

            

        
    
        
            //Method EmployeeDetails.findOne definition
            public void EmployeeDetails.findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<EmployeeDetails> callback){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("EmployeeDetails.findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    EmployeeDetailsRepository employeeDetailsRepo = getRestAdapter().createRepository(EmployeeDetailsRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EmployeeDetails employeeDetails = employeeDetailsRepo.createObject(result);
                                    callback.onSuccess(employeeDetails);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.findOne definition ends here..

            

        
    
        
            //Method EmployeeDetails.updateAll definition
            public void EmployeeDetails.updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("EmployeeDetails.updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.updateAll definition ends here..

            

        
    
        
            //Method EmployeeDetails.deleteById definition
            public void EmployeeDetails.deleteById(  String id, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("EmployeeDetails.deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.deleteById definition ends here..

            

        
    
        
            //Method EmployeeDetails.count definition
            public void EmployeeDetails.count(  Map<String,  ? extends Object> where, final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("EmployeeDetails.count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String id,  Map<String,  ? extends Object> data, final ObjectCallback<EmployeeDetails> callback){

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
                                    EmployeeDetailsRepository employeeDetailsRepo = getRestAdapter().createRepository(EmployeeDetailsRepository.class);
                                    Map<String, Object> result = JsonUtil.fromJson(response);
                                    EmployeeDetails employeeDetails = employeeDetailsRepo.createObject(result);
                                    callback.onSuccess(employeeDetails);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
            //Method EmployeeDetails.getSchema definition
            public void EmployeeDetails.getSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("EmployeeDetails.getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.getSchema definition ends here..

            

        
    
        
            //Method EmployeeDetails.getAbsoluteSchema definition
            public void EmployeeDetails.getAbsoluteSchema( final Adapter.JsonObjectCallback  callback ){

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("EmployeeDetails.getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                        }
                    });
                

                

            }//Method EmployeeDetails.getAbsoluteSchema definition ends here..

            

        
    
        
    
        
    
        
    
        
    
        
    
        
    



}
