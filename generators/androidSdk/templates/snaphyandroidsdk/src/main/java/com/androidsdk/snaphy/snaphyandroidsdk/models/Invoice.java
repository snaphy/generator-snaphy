package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;
import android.util.Log;
import java.util.List;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;
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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.InvoiceRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.InvoiceRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.EmployeeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CompanySettingRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Invoice extends Model {


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

    private Invoice that ;

    public Invoice (){
        that = this;
    }

    
        
            

            
                private String paymentMode;
                /* Adding Getter and Setter methods */
                public String getPaymentMode(){
                    return paymentMode;
                }

                /* Adding Getter and Setter methods */
                public void setPaymentMode(String paymentMode){
                    this.paymentMode = paymentMode;
                    //Update hashMap value..
                    hashMap.put("paymentMode", paymentMode);
                }

            
            
        
    
        
            

            
                private String chequeNumber;
                /* Adding Getter and Setter methods */
                public String getChequeNumber(){
                    return chequeNumber;
                }

                /* Adding Getter and Setter methods */
                public void setChequeNumber(String chequeNumber){
                    this.chequeNumber = chequeNumber;
                    //Update hashMap value..
                    hashMap.put("chequeNumber", chequeNumber);
                }

            
            
        
    
        
            

            
                private double total_amount;
                /* Adding Getter and Setter methods */
                public double getTotal_amount(){
                    return total_amount;
                }

                /* Adding Getter and Setter methods */
                public void setTotal_amount(double total_amount){
                    this.total_amount = total_amount;
                    //Update hashMap value..
                    hashMap.put("total_amount", total_amount);
                }

            
            
        
    
        
            

            
                private double previousMonthAmount;
                /* Adding Getter and Setter methods */
                public double getPreviousMonthAmount(){
                    return previousMonthAmount;
                }

                /* Adding Getter and Setter methods */
                public void setPreviousMonthAmount(double previousMonthAmount){
                    this.previousMonthAmount = previousMonthAmount;
                    //Update hashMap value..
                    hashMap.put("previousMonthAmount", previousMonthAmount);
                }

            
            
        
    
        
            

            
                private double previousMonthPaid;
                /* Adding Getter and Setter methods */
                public double getPreviousMonthPaid(){
                    return previousMonthPaid;
                }

                /* Adding Getter and Setter methods */
                public void setPreviousMonthPaid(double previousMonthPaid){
                    this.previousMonthPaid = previousMonthPaid;
                    //Update hashMap value..
                    hashMap.put("previousMonthPaid", previousMonthPaid);
                }

            
            
        
    
        
            

            
                private double previousMonthPending;
                /* Adding Getter and Setter methods */
                public double getPreviousMonthPending(){
                    return previousMonthPending;
                }

                /* Adding Getter and Setter methods */
                public void setPreviousMonthPending(double previousMonthPending){
                    this.previousMonthPending = previousMonthPending;
                    //Update hashMap value..
                    hashMap.put("previousMonthPending", previousMonthPending);
                }

            
            
        
    
        
            

            
                private double previousMonthCarryForward;
                /* Adding Getter and Setter methods */
                public double getPreviousMonthCarryForward(){
                    return previousMonthCarryForward;
                }

                /* Adding Getter and Setter methods */
                public void setPreviousMonthCarryForward(double previousMonthCarryForward){
                    this.previousMonthCarryForward = previousMonthCarryForward;
                    //Update hashMap value..
                    hashMap.put("previousMonthCarryForward", previousMonthCarryForward);
                }

            
            
        
    
        
            

            
                private double currentMonthAmount;
                /* Adding Getter and Setter methods */
                public double getCurrentMonthAmount(){
                    return currentMonthAmount;
                }

                /* Adding Getter and Setter methods */
                public void setCurrentMonthAmount(double currentMonthAmount){
                    this.currentMonthAmount = currentMonthAmount;
                    //Update hashMap value..
                    hashMap.put("currentMonthAmount", currentMonthAmount);
                }

            
            
        
    
        
            

            
                private double netCurrentAmount;
                /* Adding Getter and Setter methods */
                public double getNetCurrentAmount(){
                    return netCurrentAmount;
                }

                /* Adding Getter and Setter methods */
                public void setNetCurrentAmount(double netCurrentAmount){
                    this.netCurrentAmount = netCurrentAmount;
                    //Update hashMap value..
                    hashMap.put("netCurrentAmount", netCurrentAmount);
                }

            
            
        
    
        
            

            
                private double currentPaid;
                /* Adding Getter and Setter methods */
                public double getCurrentPaid(){
                    return currentPaid;
                }

                /* Adding Getter and Setter methods */
                public void setCurrentPaid(double currentPaid){
                    this.currentPaid = currentPaid;
                    //Update hashMap value..
                    hashMap.put("currentPaid", currentPaid);
                }

            
            
        
    
        
            

            
                private String paidAt;
                /* Adding Getter and Setter methods */
                public String getPaidAt(){
                    return paidAt;
                }

                /* Adding Getter and Setter methods */
                public void setPaidAt(String paidAt){
                    this.paidAt = paidAt;
                    //Update hashMap value..
                    hashMap.put("paidAt", paidAt);
                }

            
            
        
    
        
            

            
                private double discountedCurrentMonthAmount;
                /* Adding Getter and Setter methods */
                public double getDiscountedCurrentMonthAmount(){
                    return discountedCurrentMonthAmount;
                }

                /* Adding Getter and Setter methods */
                public void setDiscountedCurrentMonthAmount(double discountedCurrentMonthAmount){
                    this.discountedCurrentMonthAmount = discountedCurrentMonthAmount;
                    //Update hashMap value..
                    hashMap.put("discountedCurrentMonthAmount", discountedCurrentMonthAmount);
                }

            
            
        
    
        
            

            
                private Map<String, Object> reports;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getReports(){
                    return reports;
                }

                /* Adding Getter and Setter methods */
                public void setReports(Map<String, Object> reports){
                    this.reports = reports;
                    //Update Map value..
                    hashMap.put("reports", reports);
                }

            
            
        
    
        
            

            
                private double month;
                /* Adding Getter and Setter methods */
                public double getMonth(){
                    return month;
                }

                /* Adding Getter and Setter methods */
                public void setMonth(double month){
                    this.month = month;
                    //Update hashMap value..
                    hashMap.put("month", month);
                }

            
            
        
    
        
            

            
                private String invoiceDate;
                /* Adding Getter and Setter methods */
                public String getInvoiceDate(){
                    return invoiceDate;
                }

                /* Adding Getter and Setter methods */
                public void setInvoiceDate(String invoiceDate){
                    this.invoiceDate = invoiceDate;
                    //Update hashMap value..
                    hashMap.put("invoiceDate", invoiceDate);
                }

            
            
        
    
        
            

            
                private String lastMonthInvoiceDate;
                /* Adding Getter and Setter methods */
                public String getLastMonthInvoiceDate(){
                    return lastMonthInvoiceDate;
                }

                /* Adding Getter and Setter methods */
                public void setLastMonthInvoiceDate(String lastMonthInvoiceDate){
                    this.lastMonthInvoiceDate = lastMonthInvoiceDate;
                    //Update hashMap value..
                    hashMap.put("lastMonthInvoiceDate", lastMonthInvoiceDate);
                }

            
            
        
    
        
            

            
                private String invoiceAddress;
                /* Adding Getter and Setter methods */
                public String getInvoiceAddress(){
                    return invoiceAddress;
                }

                /* Adding Getter and Setter methods */
                public void setInvoiceAddress(String invoiceAddress){
                    this.invoiceAddress = invoiceAddress;
                    //Update hashMap value..
                    hashMap.put("invoiceAddress", invoiceAddress);
                }

            
            
        
    
        
            

            
                private double invoiceNumber;
                /* Adding Getter and Setter methods */
                public double getInvoiceNumber(){
                    return invoiceNumber;
                }

                /* Adding Getter and Setter methods */
                public void setInvoiceNumber(double invoiceNumber){
                    this.invoiceNumber = invoiceNumber;
                    //Update hashMap value..
                    hashMap.put("invoiceNumber", invoiceNumber);
                }

            
            
        
    
        
            

            
                private String note;
                /* Adding Getter and Setter methods */
                public String getNote(){
                    return note;
                }

                /* Adding Getter and Setter methods */
                public void setNote(String note){
                    this.note = note;
                    //Update hashMap value..
                    hashMap.put("note", note);
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      InvoiceRepository lowercaseFirstLetterRepository = (InvoiceRepository) getRepository();
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
      InvoiceRepository lowercaseFirstLetterRepository = (InvoiceRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      InvoiceRepository lowercaseFirstLetterRepository = (InvoiceRepository) getRepository();
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
                                        InvoiceRepository invoiceRepository = (InvoiceRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = invoiceRepository.getRestAdapter();
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
                    public Customer getCustomer__db(SnaphyRestAdapter restAdapter){
                      if(customerId != null){
                        CustomerRepository customerRepository = restAdapter.createRepository(CustomerRepository.class);
                            try{
                            InvoiceRepository lowercaseFirstLetterRepository = (InvoiceRepository) getRepository();
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
                                    public void get__customer( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InvoiceRepository  invoiceRepo = restAdapter.createRepository(InvoiceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        invoiceRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Customer object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                    private transient Invoice  previousMonthInvoice ;
                    private String invoiceId;

                    public String getInvoiceId(){
                         return invoiceId;
                    }

                    public void setInvoiceId(Object invoiceId){
                        if(invoiceId != null){
                          this.invoiceId = invoiceId.toString();
                        }
                    }

                    public Invoice getPreviousMonthInvoice() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(previousMonthInvoice == null){
                                        InvoiceRepository invoiceRepository = (InvoiceRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = invoiceRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          previousMonthInvoice = getPreviousMonthInvoice__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return previousMonthInvoice;
                    }

                    public void setPreviousMonthInvoice(Invoice previousMonthInvoice) {
                        this.previousMonthInvoice = previousMonthInvoice;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPreviousMonthInvoice(Map<String, Object> previousMonthInvoice) {
                        //First create a dummy Repo class object for customer.
                        InvoiceRepository previousMonthInvoiceRepository = new InvoiceRepository();
                        Invoice previousMonthInvoice1 = previousMonthInvoiceRepository.createObject(previousMonthInvoice);
                        setPreviousMonthInvoice(previousMonthInvoice1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPreviousMonthInvoice(HashMap<String, Object> previousMonthInvoice) {
                        //First create a dummy Repo class object for customer.
                        InvoiceRepository previousMonthInvoiceRepository = new InvoiceRepository();
                        Invoice previousMonthInvoice1 = previousMonthInvoiceRepository.createObject(previousMonthInvoice);
                        setPreviousMonthInvoice(previousMonthInvoice1);
                    }

                    //Adding relation method..
                    public void addRelation(Invoice previousMonthInvoice) {
                        that.setPreviousMonthInvoice(previousMonthInvoice);
                    }


                    //Fetch related data from local database if present a invoiceId identifier as property for belongsTo
                    public Invoice getPreviousMonthInvoice__db(SnaphyRestAdapter restAdapter){
                      if(invoiceId != null){
                        InvoiceRepository previousMonthInvoiceRepository = restAdapter.createRepository(InvoiceRepository.class);
                            try{
                            InvoiceRepository lowercaseFirstLetterRepository = (InvoiceRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(previousMonthInvoiceRepository.getDb() == null ){
                                                    previousMonthInvoiceRepository.addStorage(context);
                                                }

                                                if(context != null && previousMonthInvoiceRepository.getDb() != null){
                                                    previousMonthInvoiceRepository.addStorage(context);
                                                    Invoice previousMonthInvoice = (Invoice) previousMonthInvoiceRepository.getDb().get__db(invoiceId);
                                                    return previousMonthInvoice;
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
                                    public void get__previousMonthInvoice( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Invoice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InvoiceRepository  invoiceRepo = restAdapter.createRepository(InvoiceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        invoiceRepo.get__previousMonthInvoice( (String)that.getId(), refresh,  new ObjectCallback<Invoice> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Invoice object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                    private transient Employee  employee ;
                    private String employeeId;

                    public String getEmployeeId(){
                         return employeeId;
                    }

                    public void setEmployeeId(Object employeeId){
                        if(employeeId != null){
                          this.employeeId = employeeId.toString();
                        }
                    }

                    public Employee getEmployee() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(employee == null){
                                        InvoiceRepository invoiceRepository = (InvoiceRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = invoiceRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          employee = getEmployee__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return employee;
                    }

                    public void setEmployee(Employee employee) {
                        this.employee = employee;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setEmployee(Map<String, Object> employee) {
                        //First create a dummy Repo class object for customer.
                        EmployeeRepository employeeRepository = new EmployeeRepository();
                        Employee employee1 = employeeRepository.createObject(employee);
                        setEmployee(employee1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setEmployee(HashMap<String, Object> employee) {
                        //First create a dummy Repo class object for customer.
                        EmployeeRepository employeeRepository = new EmployeeRepository();
                        Employee employee1 = employeeRepository.createObject(employee);
                        setEmployee(employee1);
                    }

                    //Adding relation method..
                    public void addRelation(Employee employee) {
                        that.setEmployee(employee);
                    }


                    //Fetch related data from local database if present a employeeId identifier as property for belongsTo
                    public Employee getEmployee__db(SnaphyRestAdapter restAdapter){
                      if(employeeId != null){
                        EmployeeRepository employeeRepository = restAdapter.createRepository(EmployeeRepository.class);
                            try{
                            InvoiceRepository lowercaseFirstLetterRepository = (InvoiceRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(employeeRepository.getDb() == null ){
                                                    employeeRepository.addStorage(context);
                                                }

                                                if(context != null && employeeRepository.getDb() != null){
                                                    employeeRepository.addStorage(context);
                                                    Employee employee = (Employee) employeeRepository.getDb().get__db(employeeId);
                                                    return employee;
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
                                    public void get__employee( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Employee> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InvoiceRepository  invoiceRepo = restAdapter.createRepository(InvoiceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        invoiceRepo.get__employee( (String)that.getId(), refresh,  new ObjectCallback<Employee> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Employee object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                    private transient CompanySetting  companySetting ;
                    private String companySettingId;

                    public String getCompanySettingId(){
                         return companySettingId;
                    }

                    public void setCompanySettingId(Object companySettingId){
                        if(companySettingId != null){
                          this.companySettingId = companySettingId.toString();
                        }
                    }

                    public CompanySetting getCompanySetting() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(companySetting == null){
                                        InvoiceRepository invoiceRepository = (InvoiceRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = invoiceRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          companySetting = getCompanySetting__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return companySetting;
                    }

                    public void setCompanySetting(CompanySetting companySetting) {
                        this.companySetting = companySetting;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCompanySetting(Map<String, Object> companySetting) {
                        //First create a dummy Repo class object for customer.
                        CompanySettingRepository companySettingRepository = new CompanySettingRepository();
                        CompanySetting companySetting1 = companySettingRepository.createObject(companySetting);
                        setCompanySetting(companySetting1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCompanySetting(HashMap<String, Object> companySetting) {
                        //First create a dummy Repo class object for customer.
                        CompanySettingRepository companySettingRepository = new CompanySettingRepository();
                        CompanySetting companySetting1 = companySettingRepository.createObject(companySetting);
                        setCompanySetting(companySetting1);
                    }

                    //Adding relation method..
                    public void addRelation(CompanySetting companySetting) {
                        that.setCompanySetting(companySetting);
                    }


                    //Fetch related data from local database if present a companySettingId identifier as property for belongsTo
                    public CompanySetting getCompanySetting__db(SnaphyRestAdapter restAdapter){
                      if(companySettingId != null){
                        CompanySettingRepository companySettingRepository = restAdapter.createRepository(CompanySettingRepository.class);
                            try{
                            InvoiceRepository lowercaseFirstLetterRepository = (InvoiceRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(companySettingRepository.getDb() == null ){
                                                    companySettingRepository.addStorage(context);
                                                }

                                                if(context != null && companySettingRepository.getDb() != null){
                                                    companySettingRepository.addStorage(context);
                                                    CompanySetting companySetting = (CompanySetting) companySettingRepository.getDb().get__db(companySettingId);
                                                    return companySetting;
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
                                    public void get__companySetting( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<CompanySetting> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final InvoiceRepository  invoiceRepo = restAdapter.createRepository(InvoiceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        invoiceRepo.get__companySetting( (String)that.getId(), refresh,  new ObjectCallback<CompanySetting> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CompanySetting object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
