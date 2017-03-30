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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.SavePostRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostSubscriberRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class SavePost extends Model {


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

    private SavePost that ;

    public SavePost (){
        that = this;
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      SavePostRepository lowercaseFirstLetterRepository = (SavePostRepository) getRepository();
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
      SavePostRepository lowercaseFirstLetterRepository = (SavePostRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      SavePostRepository lowercaseFirstLetterRepository = (SavePostRepository) getRepository();
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
                    private transient Post  post ;
                    private String postId;

                    public String getPostId(){
                         return postId;
                    }

                    public void setPostId(Object postId){
                        if(postId != null){
                          this.postId = postId.toString();
                        }
                    }

                    public Post getPost() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(post == null){
                                        SavePostRepository savePostRepository = (SavePostRepository) getRepository();

                                        RestAdapter restAdapter = savePostRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          post = getPost__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return post;
                    }

                    public void setPost(Post post) {
                        this.post = post;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPost(Map<String, Object> post) {
                        //First create a dummy Repo class object for customer.
                        PostRepository postRepository = new PostRepository();
                        Post post1 = postRepository.createObject(post);
                        setPost(post1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPost(HashMap<String, Object> post) {
                        //First create a dummy Repo class object for customer.
                        PostRepository postRepository = new PostRepository();
                        Post post1 = postRepository.createObject(post);
                        setPost(post1);
                    }

                    //Adding relation method..
                    public void addRelation(Post post) {
                        that.setPost(post);
                    }


                    //Fetch related data from local database if present a postId identifier as property for belongsTo
                    public Post getPost__db(RestAdapter restAdapter){
                      if(postId != null){
                        PostRepository postRepository = restAdapter.createRepository(PostRepository.class);
                            try{
                            SavePostRepository lowercaseFirstLetterRepository = (SavePostRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(postRepository.getDb() == null ){
                                                    postRepository.addStorage(context);
                                                }

                                                if(context != null && postRepository.getDb() != null){
                                                    postRepository.addStorage(context);
                                                    Post post = (Post) postRepository.getDb().get__db(postId);
                                                    return post;
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
                                    public void get__post( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Post> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SavePostRepository  savePostRepo = restAdapter.createRepository(SavePostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        savePostRepo.get__post( (String)that.getId(), refresh,  new ObjectCallback<Post> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Post object) {
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
                                        SavePostRepository savePostRepository = (SavePostRepository) getRepository();

                                        RestAdapter restAdapter = savePostRepository.getRestAdapter();
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
                            SavePostRepository lowercaseFirstLetterRepository = (SavePostRepository) getRepository();
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
                                        final SavePostRepository  savePostRepo = restAdapter.createRepository(SavePostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        savePostRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
                    private transient PostSubscriber  postSubscribers ;
                    private String postSubscriberId;

                    public String getPostSubscriberId(){
                         return postSubscriberId;
                    }

                    public void setPostSubscriberId(Object postSubscriberId){
                        if(postSubscriberId != null){
                          this.postSubscriberId = postSubscriberId.toString();
                        }
                    }

                    public PostSubscriber getPostSubscribers() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(postSubscribers == null){
                                        SavePostRepository savePostRepository = (SavePostRepository) getRepository();

                                        RestAdapter restAdapter = savePostRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          postSubscribers = getPostSubscribers__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return postSubscribers;
                    }

                    public void setPostSubscribers(PostSubscriber postSubscribers) {
                        this.postSubscribers = postSubscribers;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPostSubscribers(Map<String, Object> postSubscribers) {
                        //First create a dummy Repo class object for customer.
                        PostSubscriberRepository postSubscribersRepository = new PostSubscriberRepository();
                        PostSubscriber postSubscribers1 = postSubscribersRepository.createObject(postSubscribers);
                        setPostSubscribers(postSubscribers1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPostSubscribers(HashMap<String, Object> postSubscribers) {
                        //First create a dummy Repo class object for customer.
                        PostSubscriberRepository postSubscribersRepository = new PostSubscriberRepository();
                        PostSubscriber postSubscribers1 = postSubscribersRepository.createObject(postSubscribers);
                        setPostSubscribers(postSubscribers1);
                    }

                    //Adding relation method..
                    public void addRelation(PostSubscriber postSubscribers) {
                        that.setPostSubscribers(postSubscribers);
                    }


                    //Fetch related data from local database if present a postSubscriberId identifier as property for belongsTo
                    public PostSubscriber getPostSubscribers__db(RestAdapter restAdapter){
                      if(postSubscriberId != null){
                        PostSubscriberRepository postSubscribersRepository = restAdapter.createRepository(PostSubscriberRepository.class);
                            try{
                            SavePostRepository lowercaseFirstLetterRepository = (SavePostRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(postSubscribersRepository.getDb() == null ){
                                                    postSubscribersRepository.addStorage(context);
                                                }

                                                if(context != null && postSubscribersRepository.getDb() != null){
                                                    postSubscribersRepository.addStorage(context);
                                                    PostSubscriber postSubscribers = (PostSubscriber) postSubscribersRepository.getDb().get__db(postSubscriberId);
                                                    return postSubscribers;
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
                                    public void get__postSubscribers( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SavePostRepository  savePostRepo = restAdapter.createRepository(SavePostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        savePostRepo.get__postSubscribers( (String)that.getId(), refresh,  new ObjectCallback<PostSubscriber> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostSubscriber object) {
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
                                    public void create__postSubscribers( PostSubscriber data,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SavePostRepository  savePostRepo = restAdapter.createRepository(SavePostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        savePostRepo.create__postSubscribers( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostSubscriber> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostSubscriber object) {
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
                                    public void update__postSubscribers( PostSubscriber data,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SavePostRepository  savePostRepo = restAdapter.createRepository(SavePostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        savePostRepo.update__postSubscribers( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostSubscriber> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostSubscriber object) {
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
                                    public void destroy__postSubscribers( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SavePostRepository  savePostRepo = restAdapter.createRepository(SavePostRepository.class);
                                        
                                        



                                        savePostRepo.destroy__postSubscribers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
