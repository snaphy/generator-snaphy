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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PaymentRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BookRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Payment extends Model {


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

    private Payment that ;

    public Payment (){
        that = this;
    }

    
        
            

            
                private Map<String, Object> bookDetail;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getBookDetail(){
                    return bookDetail;
                }

                /* Adding Getter and Setter methods */
                public void setBookDetail(Map<String, Object> bookDetail){
                    this.bookDetail = bookDetail;
                    //Update Map value..
                    hashMap.put("bookDetail", bookDetail);
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

            
            
        
    
        
            

            
                private String phoneNumber;
                /* Adding Getter and Setter methods */
                public String getPhoneNumber(){
                    return phoneNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPhoneNumber(String phoneNumber){
                    this.phoneNumber = phoneNumber;
                    //Update hashMap value..
                    hashMap.put("phoneNumber", phoneNumber);
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

            
            
        
    
        
            

            
                private double amount;
                /* Adding Getter and Setter methods */
                public double getAmount(){
                    return amount;
                }

                /* Adding Getter and Setter methods */
                public void setAmount(double amount){
                    this.amount = amount;
                    //Update hashMap value..
                    hashMap.put("amount", amount);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      PaymentRepository lowercaseFirstLetterRepository = (PaymentRepository) getRepository();
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
      PaymentRepository lowercaseFirstLetterRepository = (PaymentRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      PaymentRepository lowercaseFirstLetterRepository = (PaymentRepository) getRepository();
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
                    private transient Book  book ;
                    private String bookId;

                    public String getBookId(){
                         return bookId;
                    }

                    public void setBookId(Object bookId){
                        if(bookId != null){
                          this.bookId = bookId.toString();
                        }
                    }

                    public Book getBook() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(book == null){
                                        PaymentRepository paymentRepository = (PaymentRepository) getRepository();

                                        RestAdapter restAdapter = paymentRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          book = getBook__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return book;
                    }

                    public void setBook(Book book) {
                        this.book = book;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBook(Map<String, Object> book) {
                        //First create a dummy Repo class object for customer.
                        BookRepository bookRepository = new BookRepository();
                        Book book1 = bookRepository.createObject(book);
                        setBook(book1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBook(HashMap<String, Object> book) {
                        //First create a dummy Repo class object for customer.
                        BookRepository bookRepository = new BookRepository();
                        Book book1 = bookRepository.createObject(book);
                        setBook(book1);
                    }

                    //Adding relation method..
                    public void addRelation(Book book) {
                        that.setBook(book);
                    }


                    //Fetch related data from local database if present a bookId identifier as property for belongsTo
                    public Book getBook__db(RestAdapter restAdapter){
                      if(bookId != null){
                        BookRepository bookRepository = restAdapter.createRepository(BookRepository.class);
                            try{
                            PaymentRepository lowercaseFirstLetterRepository = (PaymentRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(bookRepository.getDb() == null ){
                                                    bookRepository.addStorage(context);
                                                }

                                                if(context != null && bookRepository.getDb() != null){
                                                    bookRepository.addStorage(context);
                                                    Book book = (Book) bookRepository.getDb().get__db(bookId);
                                                    return book;
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
                                    public void get__book( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Book> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PaymentRepository  paymentRepo = restAdapter.createRepository(PaymentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        paymentRepo.get__book( (String)that.getId(), refresh,  new ObjectCallback<Book> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Book object) {
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
                                 
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Customer  customer ;
                    private String customerId;

                    public String getCustomerId(){
                         return customerId;
                    }

                    public void setCustomerId(Object customerId){
                        if(customerId != null){
                          this.customerId = customerId.toString();
                        }
                    }

                    public Customer getCustomer() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(customer == null){
                                        PaymentRepository paymentRepository = (PaymentRepository) getRepository();

                                        RestAdapter restAdapter = paymentRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          customer = getCustomer__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return customer;
                    }

                    public void setCustomer(Customer customer) {
                        this.customer = customer;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCustomer(Map<String, Object> customer) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository customerRepository = new CustomerRepository();
                        Customer customer1 = customerRepository.createObject(customer);
                        setCustomer(customer1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCustomer(HashMap<String, Object> customer) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository customerRepository = new CustomerRepository();
                        Customer customer1 = customerRepository.createObject(customer);
                        setCustomer(customer1);
                    }

                    //Adding relation method..
                    public void addRelation(Customer customer) {
                        that.setCustomer(customer);
                    }


                    //Fetch related data from local database if present a customerId identifier as property for belongsTo
                    public Customer getCustomer__db(RestAdapter restAdapter){
                      if(customerId != null){
                        CustomerRepository customerRepository = restAdapter.createRepository(CustomerRepository.class);
                            try{
                            PaymentRepository lowercaseFirstLetterRepository = (PaymentRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(customerRepository.getDb() == null ){
                                                    customerRepository.addStorage(context);
                                                }

                                                if(context != null && customerRepository.getDb() != null){
                                                    customerRepository.addStorage(context);
                                                    Customer customer = (Customer) customerRepository.getDb().get__db(customerId);
                                                    return customer;
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
                                    public void get__customer( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PaymentRepository  paymentRepo = restAdapter.createRepository(PaymentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        paymentRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Customer object) {
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
                                 
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Order  order ;
                    private String orderId;

                    public String getOrderId(){
                         return orderId;
                    }

                    public void setOrderId(Object orderId){
                        if(orderId != null){
                          this.orderId = orderId.toString();
                        }
                    }

                    public Order getOrder() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(order == null){
                                        PaymentRepository paymentRepository = (PaymentRepository) getRepository();

                                        RestAdapter restAdapter = paymentRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          order = getOrder__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return order;
                    }

                    public void setOrder(Order order) {
                        this.order = order;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOrder(Map<String, Object> order) {
                        //First create a dummy Repo class object for customer.
                        OrderRepository orderRepository = new OrderRepository();
                        Order order1 = orderRepository.createObject(order);
                        setOrder(order1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOrder(HashMap<String, Object> order) {
                        //First create a dummy Repo class object for customer.
                        OrderRepository orderRepository = new OrderRepository();
                        Order order1 = orderRepository.createObject(order);
                        setOrder(order1);
                    }

                    //Adding relation method..
                    public void addRelation(Order order) {
                        that.setOrder(order);
                    }


                    //Fetch related data from local database if present a orderId identifier as property for belongsTo
                    public Order getOrder__db(RestAdapter restAdapter){
                      if(orderId != null){
                        OrderRepository orderRepository = restAdapter.createRepository(OrderRepository.class);
                            try{
                            PaymentRepository lowercaseFirstLetterRepository = (PaymentRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(orderRepository.getDb() == null ){
                                                    orderRepository.addStorage(context);
                                                }

                                                if(context != null && orderRepository.getDb() != null){
                                                    orderRepository.addStorage(context);
                                                    Order order = (Order) orderRepository.getDb().get__db(orderId);
                                                    return order;
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
                                    public void get__order( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Order> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PaymentRepository  paymentRepo = restAdapter.createRepository(PaymentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        paymentRepo.get__order( (String)that.getId(), refresh,  new ObjectCallback<Order> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Order object) {
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
