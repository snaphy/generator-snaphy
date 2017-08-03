package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.remoting.adapters.Adapter;
import android.content.Context;

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

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.DepartmentRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TransactionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QrCodeGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Department extends Model {


    //For converting all model values to hashMap
    private  transient Map<String, Object> hashMap = new HashMap<>();

    public Map<String,  ? extends Object> convertMap(){
        if(that.getId() != null){
            return hashMap;
        }else{
            hashMap.put("id", that.getId());
            return hashMap;
        }
    }

    private Department that ;

    public Department (){
        that = this;
    }

    
        
            

            
                private String department_number;
                /* Adding Getter and Setter methods */
                public String getDepartment_number(){
                    return department_number;
                }

                /* Adding Getter and Setter methods */
                public void setDepartment_number(String department_number){
                    this.department_number = department_number;
                    //Update hashMap value..
                    hashMap.put("department_number", department_number);
                }

            
            
        
    
        
            

            
                private String name;
                /* Adding Getter and Setter methods */
                public String getName(){
                    return name;
                }

                /* Adding Getter and Setter methods */
                public void setName(String name){
                    this.name = name;
                    //Update hashMap value..
                    hashMap.put("name", name);
                }

            
            
        
    
        
            

            
                private Map<String, Object> logo;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getLogo(){
                    return logo;
                }

                /* Adding Getter and Setter methods */
                public void setLogo(Map<String, Object> logo){
                    this.logo = logo;
                    //Update Map value..
                    hashMap.put("logo", logo);
                }

            
            
        
    
        
            

            
                private String added;
                /* Adding Getter and Setter methods */
                public String getAdded(){
                    return added;
                }

                /* Adding Getter and Setter methods */
                public void setAdded(String added){
                    this.added = added;
                    //Update hashMap value..
                    hashMap.put("added", added);
                }

            
            
        
    
        
            

            
                private String updated;
                /* Adding Getter and Setter methods */
                public String getUpdated(){
                    return updated;
                }

                /* Adding Getter and Setter methods */
                public void setUpdated(String updated){
                    this.updated = updated;
                    //Update hashMap value..
                    hashMap.put("updated", updated);
                }

            
            
        
    
        
            

            
                private double totalEarned;
                /* Adding Getter and Setter methods */
                public double getTotalEarned(){
                    return totalEarned;
                }

                /* Adding Getter and Setter methods */
                public void setTotalEarned(double totalEarned){
                    this.totalEarned = totalEarned;
                    //Update hashMap value..
                    hashMap.put("totalEarned", totalEarned);
                }

            
            
        
    
        
            

            
                private double totalRedeemed;
                /* Adding Getter and Setter methods */
                public double getTotalRedeemed(){
                    return totalRedeemed;
                }

                /* Adding Getter and Setter methods */
                public void setTotalRedeemed(double totalRedeemed){
                    this.totalRedeemed = totalRedeemed;
                    //Update hashMap value..
                    hashMap.put("totalRedeemed", totalRedeemed);
                }

            
            
        
    
        
            

            
                private double totalBalance;
                /* Adding Getter and Setter methods */
                public double getTotalBalance(){
                    return totalBalance;
                }

                /* Adding Getter and Setter methods */
                public void setTotalBalance(double totalBalance){
                    this.totalBalance = totalBalance;
                    //Update hashMap value..
                    hashMap.put("totalBalance", totalBalance);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      DepartmentRepository lowercaseFirstLetterRepository = (DepartmentRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null && lowercaseFirstLetterRepository.getDb() != null){
             lowercaseFirstLetterRepository.getDb().delete__db(id);
          }
      }
      //Also save to database..
      super.destroy(callback);
    }



    public void save__db(String id){
      DepartmentRepository lowercaseFirstLetterRepository = (DepartmentRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      DepartmentRepository lowercaseFirstLetterRepository = (DepartmentRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){

        if(getId() != null && lowercaseFirstLetterRepository.getDb() != null){
            String id = getId().toString();
          lowercaseFirstLetterRepository.getDb().delete__db(id);
        }
      }
    }


    public void save__db(){
      if(getId() == null){
        return;
      }
      String id = getId().toString();
      save__db(id);
    }



//-----------------------------------END Database Methods------------------------------------------------


    




    //Now adding relations between related models
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Employee>  employees ;

                    public DataList< Employee > getEmployees() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            EmployeeRepository employeeRepository = (EmployeeRepository) getRepository();

                            if(that.getId() != null && employeeRepository.getDb() != null){

                                 //Fetch locally from db
                                 //employees = getEmployees__db(restAdapter);
                                 // Getting single cont
                                 employees = employeeRepository.getDb().getAll__db("departmentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return employees;
                    }

                    public void setEmployees(DataList<Employee> employees) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: employees){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setEmployees1(hashMaps);
                        }else{
                            this.employees = employees;
                            //TODO: Warning move this to new thread
                            for(Employee data: employees){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setEmployees1(List<Map<String, Object>> employees) {
                        //First create a dummy Repo class object for ..
                        EmployeeRepository employeesRepository = new EmployeeRepository();
                        List<Employee> result = new ArrayList<>();
                        for (Map<String, Object> obj : employees) {
                            //Also add relation to child type for two way communication..
                            Employee obj1 = employeesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setEmployees(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setEmployees1(DataList<HashMap<String, Object>> employees) {
                        //First create a dummy Repo class object for ..
                        EmployeeRepository employeesRepository = new EmployeeRepository();
                        DataList<Employee> result = new DataList<>();
                        for (HashMap<String, Object> obj : employees) {
                            //Also add relation to child type for two way communication..
                            Employee obj1 = employeesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setEmployees(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Employee> employees, Employee dummyClassInstance) {
                        that.setEmployees(employees);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Employee employees) {
                        try{
                            try{

                                  //Save to database..
                                  employees.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getEmployees().add(employees);
                        }catch(Exception e){
                            DataList< Employee> employees1 = new DataList();
                            //Now add this item to list..
                            employees1.add(employees);
                            //Now set data....
                            that.setEmployees(employees1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__employees( String fk,  RestAdapter restAdapter, final ObjectCallback<Employee> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.findById__employees( (String)that.getId(), fk,  new ObjectCallback<Employee> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Employee object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__employees( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.destroyById__employees( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__employees( String fk,  Employee data,  RestAdapter restAdapter, final ObjectCallback<Employee> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.updateById__employees( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Employee> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Employee object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__employees( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Employee> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.get__employees( (String)that.getId(), filter,  new DataListCallback<Employee> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Employee> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Employee obj = new Employee();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Employee obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__employees( Employee data,  RestAdapter restAdapter, final ObjectCallback<Employee> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.create__employees( (String)that.getId(), data.convertMap(),  new ObjectCallback<Employee> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Employee object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__employees( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        



                                        departmentRepo.delete__employees( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__employees( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.count__employees( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Transaction>  transactions ;

                    public DataList< Transaction > getTransactions() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            TransactionRepository transactionRepository = (TransactionRepository) getRepository();

                            if(that.getId() != null && transactionRepository.getDb() != null){

                                 //Fetch locally from db
                                 //transactions = getTransactions__db(restAdapter);
                                 // Getting single cont
                                 transactions = transactionRepository.getDb().getAll__db("departmentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return transactions;
                    }

                    public void setTransactions(DataList<Transaction> transactions) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: transactions){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setTransactions1(hashMaps);
                        }else{
                            this.transactions = transactions;
                            //TODO: Warning move this to new thread
                            for(Transaction data: transactions){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTransactions1(List<Map<String, Object>> transactions) {
                        //First create a dummy Repo class object for ..
                        TransactionRepository transactionsRepository = new TransactionRepository();
                        List<Transaction> result = new ArrayList<>();
                        for (Map<String, Object> obj : transactions) {
                            //Also add relation to child type for two way communication..
                            Transaction obj1 = transactionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTransactions(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTransactions1(DataList<HashMap<String, Object>> transactions) {
                        //First create a dummy Repo class object for ..
                        TransactionRepository transactionsRepository = new TransactionRepository();
                        DataList<Transaction> result = new DataList<>();
                        for (HashMap<String, Object> obj : transactions) {
                            //Also add relation to child type for two way communication..
                            Transaction obj1 = transactionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTransactions(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Transaction> transactions, Transaction dummyClassInstance) {
                        that.setTransactions(transactions);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Transaction transactions) {
                        try{
                            try{

                                  //Save to database..
                                  transactions.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getTransactions().add(transactions);
                        }catch(Exception e){
                            DataList< Transaction> transactions1 = new DataList();
                            //Now add this item to list..
                            transactions1.add(transactions);
                            //Now set data....
                            that.setTransactions(transactions1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__transactions( String fk,  RestAdapter restAdapter, final ObjectCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.findById__transactions( (String)that.getId(), fk,  new ObjectCallback<Transaction> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Transaction object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__transactions( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.destroyById__transactions( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__transactions( String fk,  Transaction data,  RestAdapter restAdapter, final ObjectCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.updateById__transactions( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Transaction> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Transaction object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__transactions( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.get__transactions( (String)that.getId(), filter,  new DataListCallback<Transaction> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Transaction> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Transaction obj = new Transaction();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Transaction obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__transactions( Transaction data,  RestAdapter restAdapter, final ObjectCallback<Transaction> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.create__transactions( (String)that.getId(), data.convertMap(),  new ObjectCallback<Transaction> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Transaction object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__transactions( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        



                                        departmentRepo.delete__transactions( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__transactions( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.count__transactions( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<QrCodeGroup>  qrCodeGroups ;

                    public DataList< QrCodeGroup > getQrCodeGroups() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            QrCodeGroupRepository qrCodeGroupRepository = (QrCodeGroupRepository) getRepository();

                            if(that.getId() != null && qrCodeGroupRepository.getDb() != null){

                                 //Fetch locally from db
                                 //qrCodeGroups = getQrCodeGroups__db(restAdapter);
                                 // Getting single cont
                                 qrCodeGroups = qrCodeGroupRepository.getDb().getAll__db("departmentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return qrCodeGroups;
                    }

                    public void setQrCodeGroups(DataList<QrCodeGroup> qrCodeGroups) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: qrCodeGroups){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setQrCodeGroups1(hashMaps);
                        }else{
                            this.qrCodeGroups = qrCodeGroups;
                            //TODO: Warning move this to new thread
                            for(QrCodeGroup data: qrCodeGroups){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQrCodeGroups1(List<Map<String, Object>> qrCodeGroups) {
                        //First create a dummy Repo class object for ..
                        QrCodeGroupRepository qrCodeGroupsRepository = new QrCodeGroupRepository();
                        List<QrCodeGroup> result = new ArrayList<>();
                        for (Map<String, Object> obj : qrCodeGroups) {
                            //Also add relation to child type for two way communication..
                            QrCodeGroup obj1 = qrCodeGroupsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQrCodeGroups(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQrCodeGroups1(DataList<HashMap<String, Object>> qrCodeGroups) {
                        //First create a dummy Repo class object for ..
                        QrCodeGroupRepository qrCodeGroupsRepository = new QrCodeGroupRepository();
                        DataList<QrCodeGroup> result = new DataList<>();
                        for (HashMap<String, Object> obj : qrCodeGroups) {
                            //Also add relation to child type for two way communication..
                            QrCodeGroup obj1 = qrCodeGroupsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQrCodeGroups(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<QrCodeGroup> qrCodeGroups, QrCodeGroup dummyClassInstance) {
                        that.setQrCodeGroups(qrCodeGroups);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(QrCodeGroup qrCodeGroups) {
                        try{
                            try{

                                  //Save to database..
                                  qrCodeGroups.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getQrCodeGroups().add(qrCodeGroups);
                        }catch(Exception e){
                            DataList< QrCodeGroup> qrCodeGroups1 = new DataList();
                            //Now add this item to list..
                            qrCodeGroups1.add(qrCodeGroups);
                            //Now set data....
                            that.setQrCodeGroups(qrCodeGroups1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__qrCodeGroups( String fk,  RestAdapter restAdapter, final ObjectCallback<QrCodeGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.findById__qrCodeGroups( (String)that.getId(), fk,  new ObjectCallback<QrCodeGroup> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCodeGroup object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__qrCodeGroups( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.destroyById__qrCodeGroups( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__qrCodeGroups( String fk,  QrCodeGroup data,  RestAdapter restAdapter, final ObjectCallback<QrCodeGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.updateById__qrCodeGroups( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<QrCodeGroup> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCodeGroup object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__qrCodeGroups( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<QrCodeGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.get__qrCodeGroups( (String)that.getId(), filter,  new DataListCallback<QrCodeGroup> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<QrCodeGroup> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            QrCodeGroup obj = new QrCodeGroup();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (QrCodeGroup obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__qrCodeGroups( QrCodeGroup data,  RestAdapter restAdapter, final ObjectCallback<QrCodeGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.create__qrCodeGroups( (String)that.getId(), data.convertMap(),  new ObjectCallback<QrCodeGroup> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCodeGroup object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__qrCodeGroups( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        



                                        departmentRepo.delete__qrCodeGroups( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__qrCodeGroups( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.count__qrCodeGroups( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Product>  products ;

                    public DataList< Product > getProducts() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ProductRepository productRepository = (ProductRepository) getRepository();

                            if(that.getId() != null && productRepository.getDb() != null){

                                 //Fetch locally from db
                                 //products = getProducts__db(restAdapter);
                                 // Getting single cont
                                 products = productRepository.getDb().getAll__db("departmentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return products;
                    }

                    public void setProducts(DataList<Product> products) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: products){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setProducts1(hashMaps);
                        }else{
                            this.products = products;
                            //TODO: Warning move this to new thread
                            for(Product data: products){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setProducts1(List<Map<String, Object>> products) {
                        //First create a dummy Repo class object for ..
                        ProductRepository productsRepository = new ProductRepository();
                        List<Product> result = new ArrayList<>();
                        for (Map<String, Object> obj : products) {
                            //Also add relation to child type for two way communication..
                            Product obj1 = productsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setProducts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setProducts1(DataList<HashMap<String, Object>> products) {
                        //First create a dummy Repo class object for ..
                        ProductRepository productsRepository = new ProductRepository();
                        DataList<Product> result = new DataList<>();
                        for (HashMap<String, Object> obj : products) {
                            //Also add relation to child type for two way communication..
                            Product obj1 = productsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setProducts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Product> products, Product dummyClassInstance) {
                        that.setProducts(products);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Product products) {
                        try{
                            try{

                                  //Save to database..
                                  products.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getProducts().add(products);
                        }catch(Exception e){
                            DataList< Product> products1 = new DataList();
                            //Now add this item to list..
                            products1.add(products);
                            //Now set data....
                            that.setProducts(products1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__products( String fk,  RestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.findById__products( (String)that.getId(), fk,  new ObjectCallback<Product> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Product object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__products( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.destroyById__products( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__products( String fk,  Product data,  RestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.updateById__products( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Product> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Product object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__products( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.get__products( (String)that.getId(), filter,  new DataListCallback<Product> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Product> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Product obj = new Product();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Product obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__products( Product data,  RestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.create__products( (String)that.getId(), data.convertMap(),  new ObjectCallback<Product> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Product object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }else{
                                                            callback.onSuccess(null);
                                                            //Calling the finally..callback
                                                            callback.onFinally();
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__products( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        



                                        departmentRepo.delete__products( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                    //Calling the finally..callback
                                                    callback.onFinally();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__products( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final DepartmentRepository  departmentRepo = restAdapter.createRepository(DepartmentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        departmentRepo.count__products( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                                //Calling the finally..callback
                                                callback.onFinally();
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
      

}
