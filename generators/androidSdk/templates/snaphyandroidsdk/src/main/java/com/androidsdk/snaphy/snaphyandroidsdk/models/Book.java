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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BookRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BookCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PaymentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OrderRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Book extends Model {


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

    private Book that ;

    public Book (){
        that = this;
    }

    
        
            

            
                private String title;
                /* Adding Getter and Setter methods */
                public String getTitle(){
                    return title;
                }

                /* Adding Getter and Setter methods */
                public void setTitle(String title){
                    this.title = title;
                    //Update hashMap value..
                    hashMap.put("title", title);
                }

            
            
        
    
        
            

            
                private String description;
                /* Adding Getter and Setter methods */
                public String getDescription(){
                    return description;
                }

                /* Adding Getter and Setter methods */
                public void setDescription(String description){
                    this.description = description;
                    //Update hashMap value..
                    hashMap.put("description", description);
                }

            
            
        
    
        
            

            
                private String status;
                /* Adding Getter and Setter methods */
                public String getStatus(){
                    return status;
                }

                /* Adding Getter and Setter methods */
                public void setStatus(String status){
                    this.status = status;
                    //Update hashMap value..
                    hashMap.put("status", status);
                }

            
            
        
    
        
            

            
                private Map<String, Object> frontCover;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getFrontCover(){
                    return frontCover;
                }

                /* Adding Getter and Setter methods */
                public void setFrontCover(Map<String, Object> frontCover){
                    this.frontCover = frontCover;
                    //Update Map value..
                    hashMap.put("frontCover", frontCover);
                }

            
            
        
    
        
            

            
                private Map<String, Object> backCover;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getBackCover(){
                    return backCover;
                }

                /* Adding Getter and Setter methods */
                public void setBackCover(Map<String, Object> backCover){
                    this.backCover = backCover;
                    //Update Map value..
                    hashMap.put("backCover", backCover);
                }

            
            
        
    
        
            

            
                private Map<String, Object> uploadBook;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getUploadBook(){
                    return uploadBook;
                }

                /* Adding Getter and Setter methods */
                public void setUploadBook(Map<String, Object> uploadBook){
                    this.uploadBook = uploadBook;
                    //Update Map value..
                    hashMap.put("uploadBook", uploadBook);
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

            
            
        
    
        
            

            
                private String savedCategoryId;
                /* Adding Getter and Setter methods */
                public String getSavedCategoryId(){
                    return savedCategoryId;
                }

                /* Adding Getter and Setter methods */
                public void setSavedCategoryId(String savedCategoryId){
                    this.savedCategoryId = savedCategoryId;
                    //Update hashMap value..
                    hashMap.put("savedCategoryId", savedCategoryId);
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
      BookRepository lowercaseFirstLetterRepository = (BookRepository) getRepository();
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
      BookRepository lowercaseFirstLetterRepository = (BookRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      BookRepository lowercaseFirstLetterRepository = (BookRepository) getRepository();
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
                    private transient BookCategory  bookCategory ;
                    private String bookCategoryId;

                    public String getBookCategoryId(){
                         return bookCategoryId;
                    }

                    public void setBookCategoryId(Object bookCategoryId){
                        if(bookCategoryId != null){
                          this.bookCategoryId = bookCategoryId.toString();
                        }
                    }

                    public BookCategory getBookCategory() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(bookCategory == null){
                                        BookRepository bookRepository = (BookRepository) getRepository();

                                        RestAdapter restAdapter = bookRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          bookCategory = getBookCategory__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return bookCategory;
                    }

                    public void setBookCategory(BookCategory bookCategory) {
                        this.bookCategory = bookCategory;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBookCategory(Map<String, Object> bookCategory) {
                        //First create a dummy Repo class object for customer.
                        BookCategoryRepository bookCategoryRepository = new BookCategoryRepository();
                        BookCategory bookCategory1 = bookCategoryRepository.createObject(bookCategory);
                        setBookCategory(bookCategory1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBookCategory(HashMap<String, Object> bookCategory) {
                        //First create a dummy Repo class object for customer.
                        BookCategoryRepository bookCategoryRepository = new BookCategoryRepository();
                        BookCategory bookCategory1 = bookCategoryRepository.createObject(bookCategory);
                        setBookCategory(bookCategory1);
                    }

                    //Adding relation method..
                    public void addRelation(BookCategory bookCategory) {
                        that.setBookCategory(bookCategory);
                    }


                    //Fetch related data from local database if present a bookCategoryId identifier as property for belongsTo
                    public BookCategory getBookCategory__db(RestAdapter restAdapter){
                      if(bookCategoryId != null){
                        BookCategoryRepository bookCategoryRepository = restAdapter.createRepository(BookCategoryRepository.class);
                            try{
                            BookRepository lowercaseFirstLetterRepository = (BookRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(bookCategoryRepository.getDb() == null ){
                                                    bookCategoryRepository.addStorage(context);
                                                }

                                                if(context != null && bookCategoryRepository.getDb() != null){
                                                    bookCategoryRepository.addStorage(context);
                                                    BookCategory bookCategory = (BookCategory) bookCategoryRepository.getDb().get__db(bookCategoryId);
                                                    return bookCategory;
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
                                    public void get__bookCategory( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<BookCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.get__bookCategory( (String)that.getId(), refresh,  new ObjectCallback<BookCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BookCategory object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Payment>  payments ;

                    public DataList< Payment > getPayments() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PaymentRepository paymentRepository = (PaymentRepository) getRepository();

                            if(that.getId() != null && paymentRepository.getDb() != null){

                                 //Fetch locally from db
                                 //payments = getPayments__db(restAdapter);
                                 // Getting single cont
                                 payments = paymentRepository.getDb().getAll__db("bookId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return payments;
                    }

                    public void setPayments(DataList<Payment> payments) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: payments){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPayments1(hashMaps);
                        }else{
                            this.payments = payments;
                            //TODO: Warning move this to new thread
                            for(Payment data: payments){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPayments1(List<Map<String, Object>> payments) {
                        //First create a dummy Repo class object for ..
                        PaymentRepository paymentsRepository = new PaymentRepository();
                        List<Payment> result = new ArrayList<>();
                        for (Map<String, Object> obj : payments) {
                            //Also add relation to child type for two way communication..
                            Payment obj1 = paymentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPayments(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPayments1(DataList<HashMap<String, Object>> payments) {
                        //First create a dummy Repo class object for ..
                        PaymentRepository paymentsRepository = new PaymentRepository();
                        DataList<Payment> result = new DataList<>();
                        for (HashMap<String, Object> obj : payments) {
                            //Also add relation to child type for two way communication..
                            Payment obj1 = paymentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPayments(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Payment> payments, Payment dummyClassInstance) {
                        that.setPayments(payments);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Payment payments) {
                        try{
                            try{

                                  //Save to database..
                                  payments.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPayments().add(payments);
                        }catch(Exception e){
                            DataList< Payment> payments1 = new DataList();
                            //Now add this item to list..
                            payments1.add(payments);
                            //Now set data....
                            that.setPayments(payments1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void findById__payments( String fk,  RestAdapter restAdapter, final ObjectCallback<Payment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.findById__payments( (String)that.getId(), fk,  new ObjectCallback<Payment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Payment object) {
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
                                    public void destroyById__payments( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.destroyById__payments( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__payments( String fk,  Payment data,  RestAdapter restAdapter, final ObjectCallback<Payment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.updateById__payments( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Payment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Payment object) {
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
                                    public void get__payments( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Payment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.get__payments( (String)that.getId(), filter,  new DataListCallback<Payment> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Payment> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Payment obj = new Payment();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Payment obj : object) {
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
                                    public void create__payments( Payment data,  RestAdapter restAdapter, final ObjectCallback<Payment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.create__payments( (String)that.getId(), data.convertMap(),  new ObjectCallback<Payment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Payment object) {
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
                                    public void delete__payments( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        



                                        bookRepo.delete__payments( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__payments( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.count__payments( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Order>  orders ;

                    public DataList< Order > getOrders() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            OrderRepository orderRepository = (OrderRepository) getRepository();

                            if(that.getId() != null && orderRepository.getDb() != null){

                                 //Fetch locally from db
                                 //orders = getOrders__db(restAdapter);
                                 // Getting single cont
                                 orders = orderRepository.getDb().getAll__db("bookId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return orders;
                    }

                    public void setOrders(DataList<Order> orders) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: orders){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setOrders1(hashMaps);
                        }else{
                            this.orders = orders;
                            //TODO: Warning move this to new thread
                            for(Order data: orders){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setOrders1(List<Map<String, Object>> orders) {
                        //First create a dummy Repo class object for ..
                        OrderRepository ordersRepository = new OrderRepository();
                        List<Order> result = new ArrayList<>();
                        for (Map<String, Object> obj : orders) {
                            //Also add relation to child type for two way communication..
                            Order obj1 = ordersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setOrders(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setOrders1(DataList<HashMap<String, Object>> orders) {
                        //First create a dummy Repo class object for ..
                        OrderRepository ordersRepository = new OrderRepository();
                        DataList<Order> result = new DataList<>();
                        for (HashMap<String, Object> obj : orders) {
                            //Also add relation to child type for two way communication..
                            Order obj1 = ordersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setOrders(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Order> orders, Order dummyClassInstance) {
                        that.setOrders(orders);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Order orders) {
                        try{
                            try{

                                  //Save to database..
                                  orders.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getOrders().add(orders);
                        }catch(Exception e){
                            DataList< Order> orders1 = new DataList();
                            //Now add this item to list..
                            orders1.add(orders);
                            //Now set data....
                            that.setOrders(orders1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__orders( String fk,  RestAdapter restAdapter, final ObjectCallback<Order> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.findById__orders( (String)that.getId(), fk,  new ObjectCallback<Order> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__orders( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.destroyById__orders( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__orders( String fk,  Order data,  RestAdapter restAdapter, final ObjectCallback<Order> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.updateById__orders( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Order> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__orders( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Order> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.get__orders( (String)that.getId(), filter,  new DataListCallback<Order> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Order> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Order obj = new Order();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Order obj : object) {
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
                                    public void create__orders( Order data,  RestAdapter restAdapter, final ObjectCallback<Order> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.create__orders( (String)that.getId(), data.convertMap(),  new ObjectCallback<Order> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__orders( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        



                                        bookRepo.delete__orders( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__orders( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BookRepository  bookRepo = restAdapter.createRepository(BookRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        bookRepo.count__orders( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
