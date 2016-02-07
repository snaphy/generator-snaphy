package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;


import com.strongloop.android.loopback.Model;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;

//Now import repository of related models..

    
        import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;

    


import java.util.ArrayList;
import java.util.HashMap;



public class EmployeeDetails extends Model {



    
        
            
            
                private String address;
                /* Adding Getter and Setter methods */
                public String getAddress(){
                    return address;
                }

                /* Adding Getter and Setter methods */
                public void setAddress(String address){
                    this.address = address;
                }

            
            
            

        
    
        
            
            
            
                private Double contactNumber;
                /* Adding Getter and Setter methods */
                public Double getContactNumber(){
                    return contactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setContactNumber(Double contactNumber){
                    this.contactNumber = contactNumber;
                }

            
            

        
    
        
            
            
            
            

        
    
        
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
            
                //Define belongsTo relation method here..
                private Employee  employee ;

                public Employee getEmployee() {
                    return employee;
                }

                public void setEmployee(Employee employee) {
                    this.employee = employee;
                }

                //Adding related model automatically in case of include statement from server..
                public void setEmployee(HashMap<String, Object> lowercaseRelatedModelName) {
                    //First create a dummy Repo class object for customer.
                    EmployeeRepository employeeRepository = new EmployeeRepository();
                    Employee employee1 = employeeRepository.createObject(employee);
                    setEmployee(employee1);
                }

                //Adding relation method..
                public void addRelation(Employee employee) {
                    this.setCustomer(employee);
                }


                //Now add instance methods to fetch the related belongsTo Model..
                

                
                                //Write the methods here..
                                public void get__employees( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Employee> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void create__employees( Employee data,  RestAdapter restAdapter, final ObjectCallback<Employee> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void update__employees( Employee data,  RestAdapter restAdapter, final ObjectCallback<Employee> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void destroy__employees( RestAdapter restAdapter, final VoidCallback callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                     

            
            
            
        
    

}
