package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;


import com.strongloop.android.loopback.Model;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;

//Now import repository of related models..

    
        import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;

    

    
        import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeRepository;

    


import java.util.ArrayList;
import java.util.HashMap;



public class Wishlist extends Model {



    
        
            
            
            
            

        
    
        
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
            
                //Define belongsTo relation method here..
                private Customer  customer ;

                public Customer getCustomer() {
                    return customer;
                }

                public void setCustomer(Customer customer) {
                    this.customer = customer;
                }

                //Adding related model automatically in case of include statement from server..
                public void setCustomer(HashMap<String, Object> lowercaseRelatedModelName) {
                    //First create a dummy Repo class object for customer.
                    CustomerRepository customerRepository = new CustomerRepository();
                    Customer customer1 = customerRepository.createObject(customer);
                    setCustomer(customer1);
                }

                //Adding relation method..
                public void addRelation(Customer customer) {
                    this.setCustomer(customer);
                }


                //Now add instance methods to fetch the related belongsTo Model..
                

                
                                //Write the methods here..
                                public void get__customers( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void create__customers( Customer data,  RestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void update__customers( Customer data,  RestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void destroy__customers( RestAdapter restAdapter, final VoidCallback callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                     

            
            
            
        
    
        
            
            
            
                //Define hasAndBelongsToMany..

            
        
    

}
