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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DepartmentRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Employee extends Model {


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

    private Employee that ;

    public Employee (){
        that = this;
    }

    
        
            

            
                private String employee_number;
                /* Adding Getter and Setter methods */
                public String getEmployee_number(){
                    return employee_number;
                }

                /* Adding Getter and Setter methods */
                public void setEmployee_number(String employee_number){
                    this.employee_number = employee_number;
                    //Update hashMap value..
                    hashMap.put("employee_number", employee_number);
                }

            
            
        
    
        
            

            
                private String username;
                /* Adding Getter and Setter methods */
                public String getUsername(){
                    return username;
                }

                /* Adding Getter and Setter methods */
                public void setUsername(String username){
                    this.username = username;
                    //Update hashMap value..
                    hashMap.put("username", username);
                }

            
            
        
    
        
            

            
                private String password;
                /* Adding Getter and Setter methods */
                public String getPassword(){
                    return password;
                }

                /* Adding Getter and Setter methods */
                public void setPassword(String password){
                    this.password = password;
                    //Update hashMap value..
                    hashMap.put("password", password);
                }

            
            
        
    
        
            

            
                private String firstName;
                /* Adding Getter and Setter methods */
                public String getFirstName(){
                    return firstName;
                }

                /* Adding Getter and Setter methods */
                public void setFirstName(String firstName){
                    this.firstName = firstName;
                    //Update hashMap value..
                    hashMap.put("firstName", firstName);
                }

            
            
        
    
        
            

            
                private String lastName;
                /* Adding Getter and Setter methods */
                public String getLastName(){
                    return lastName;
                }

                /* Adding Getter and Setter methods */
                public void setLastName(String lastName){
                    this.lastName = lastName;
                    //Update hashMap value..
                    hashMap.put("lastName", lastName);
                }

            
            
        
    
        
            

            
                private String address;
                /* Adding Getter and Setter methods */
                public String getAddress(){
                    return address;
                }

                /* Adding Getter and Setter methods */
                public void setAddress(String address){
                    this.address = address;
                    //Update hashMap value..
                    hashMap.put("address", address);
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

            
            
        
    
        
            

            
                private String email;
                /* Adding Getter and Setter methods */
                public String getEmail(){
                    return email;
                }

                /* Adding Getter and Setter methods */
                public void setEmail(String email){
                    this.email = email;
                    //Update hashMap value..
                    hashMap.put("email", email);
                }

            
            
        
    
        
            

            
                private String contact;
                /* Adding Getter and Setter methods */
                public String getContact(){
                    return contact;
                }

                /* Adding Getter and Setter methods */
                public void setContact(String contact){
                    this.contact = contact;
                    //Update hashMap value..
                    hashMap.put("contact", contact);
                }

            
            
        
    
        
            

            
                private boolean is_deleted;
                /* Adding Getter and Setter methods */
                public boolean getIs_deleted(){
                    return is_deleted;
                }

                /* Adding Getter and Setter methods */
                public void setIs_deleted(boolean is_deleted){
                    this.is_deleted = is_deleted;
                    //Update hashMap value..
                    hashMap.put("is_deleted", is_deleted);
                }

            
            
        
    
        
            

            
                private boolean isAdmin;
                /* Adding Getter and Setter methods */
                public boolean getIsAdmin(){
                    return isAdmin;
                }

                /* Adding Getter and Setter methods */
                public void setIsAdmin(boolean isAdmin){
                    this.isAdmin = isAdmin;
                    //Update hashMap value..
                    hashMap.put("isAdmin", isAdmin);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
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
      EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
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
    
         
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Department  department ;
                    private String departmentId;

                    public String getDepartmentId(){
                         return departmentId;
                    }

                    public void setDepartmentId(Object departmentId){
                        if(departmentId != null){
                          this.departmentId = departmentId.toString();
                        }
                    }

                    public Department getDepartment() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(department == null){
                                        EmployeeRepository employeeRepository = (EmployeeRepository) getRepository();

                                        RestAdapter restAdapter = employeeRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          department = getDepartment__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return department;
                    }

                    public void setDepartment(Department department) {
                        this.department = department;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDepartment(Map<String, Object> department) {
                        //First create a dummy Repo class object for customer.
                        DepartmentRepository departmentRepository = new DepartmentRepository();
                        Department department1 = departmentRepository.createObject(department);
                        setDepartment(department1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDepartment(HashMap<String, Object> department) {
                        //First create a dummy Repo class object for customer.
                        DepartmentRepository departmentRepository = new DepartmentRepository();
                        Department department1 = departmentRepository.createObject(department);
                        setDepartment(department1);
                    }

                    //Adding relation method..
                    public void addRelation(Department department) {
                        that.setDepartment(department);
                    }


                    //Fetch related data from local database if present a departmentId identifier as property for belongsTo
                    public Department getDepartment__db(RestAdapter restAdapter){
                      if(departmentId != null){
                        DepartmentRepository departmentRepository = restAdapter.createRepository(DepartmentRepository.class);
                            try{
                            EmployeeRepository lowercaseFirstLetterRepository = (EmployeeRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(departmentRepository.getDb() == null ){
                                                    departmentRepository.addStorage(context);
                                                }

                                                if(context != null && departmentRepository.getDb() != null){
                                                    departmentRepository.addStorage(context);
                                                    Department department = (Department) departmentRepository.getDb().get__db(departmentId);
                                                    return department;
                                                }else{
                                                    return null;
                                                }
                                          }else{
                                            return null;
                                          }
                            }catch(Exception e){
                            //Ignore exception..
                            return null;
                            }

                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__department( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Department> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final EmployeeRepository  employeeRepo = restAdapter.createRepository(EmployeeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        employeeRepo.get__department( (String)that.getId(), refresh,  new ObjectCallback<Department> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Department object) {
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
