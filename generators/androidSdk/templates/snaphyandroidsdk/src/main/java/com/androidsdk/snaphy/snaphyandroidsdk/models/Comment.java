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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentDetailRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostSubscriberRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostDetailRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Comment extends Model {


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

    private Comment that ;

    public Comment (){
        that = this;
    }

    
        
            

            
                private String answer;
                /* Adding Getter and Setter methods */
                public String getAnswer(){
                    return answer;
                }

                /* Adding Getter and Setter methods */
                public void setAnswer(String answer){
                    this.answer = answer;
                    //Update hashMap value..
                    hashMap.put("answer", answer);
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
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
      CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
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
                                        CommentRepository commentRepository = (CommentRepository) getRepository();

                                        RestAdapter restAdapter = commentRepository.getRestAdapter();
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
                            CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
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
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__post( (String)that.getId(), refresh,  new ObjectCallback<Post> (){
                                            

                                            
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
                                        CommentRepository commentRepository = (CommentRepository) getRepository();

                                        RestAdapter restAdapter = commentRepository.getRestAdapter();
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
                            CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
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
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
                    private transient CommentDetail  commentDetails ;
                    private String commentDetailId;

                    public String getCommentDetailId(){
                         return commentDetailId;
                    }

                    public void setCommentDetailId(Object commentDetailId){
                        if(commentDetailId != null){
                          this.commentDetailId = commentDetailId.toString();
                        }
                    }

                    public CommentDetail getCommentDetails() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(commentDetails == null){
                                        CommentRepository commentRepository = (CommentRepository) getRepository();

                                        RestAdapter restAdapter = commentRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          commentDetails = getCommentDetails__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return commentDetails;
                    }

                    public void setCommentDetails(CommentDetail commentDetails) {
                        this.commentDetails = commentDetails;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCommentDetails(Map<String, Object> commentDetails) {
                        //First create a dummy Repo class object for customer.
                        CommentDetailRepository commentDetailsRepository = new CommentDetailRepository();
                        CommentDetail commentDetails1 = commentDetailsRepository.createObject(commentDetails);
                        setCommentDetails(commentDetails1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCommentDetails(HashMap<String, Object> commentDetails) {
                        //First create a dummy Repo class object for customer.
                        CommentDetailRepository commentDetailsRepository = new CommentDetailRepository();
                        CommentDetail commentDetails1 = commentDetailsRepository.createObject(commentDetails);
                        setCommentDetails(commentDetails1);
                    }

                    //Adding relation method..
                    public void addRelation(CommentDetail commentDetails) {
                        that.setCommentDetails(commentDetails);
                    }


                    //Fetch related data from local database if present a commentDetailId identifier as property for belongsTo
                    public CommentDetail getCommentDetails__db(RestAdapter restAdapter){
                      if(commentDetailId != null){
                        CommentDetailRepository commentDetailsRepository = restAdapter.createRepository(CommentDetailRepository.class);
                            try{
                            CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(commentDetailsRepository.getDb() == null ){
                                                    commentDetailsRepository.addStorage(context);
                                                }

                                                if(context != null && commentDetailsRepository.getDb() != null){
                                                    commentDetailsRepository.addStorage(context);
                                                    CommentDetail commentDetails = (CommentDetail) commentDetailsRepository.getDb().get__db(commentDetailId);
                                                    return commentDetails;
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
                                    public void get__commentDetails( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<CommentDetail> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__commentDetails( (String)that.getId(), refresh,  new ObjectCallback<CommentDetail> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentDetail object) {
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
                                    public void create__commentDetails( CommentDetail data,  RestAdapter restAdapter, final ObjectCallback<CommentDetail> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.create__commentDetails( (String)that.getId(), data.convertMap(),  new ObjectCallback<CommentDetail> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentDetail object) {
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
                                    public void update__commentDetails( CommentDetail data,  RestAdapter restAdapter, final ObjectCallback<CommentDetail> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.update__commentDetails( (String)that.getId(), data.convertMap(),  new ObjectCallback<CommentDetail> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentDetail object) {
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
                                    public void destroy__commentDetails( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        



                                        commentRepo.destroy__commentDetails( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        CommentRepository commentRepository = (CommentRepository) getRepository();

                                        RestAdapter restAdapter = commentRepository.getRestAdapter();
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
                            CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
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
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__postSubscribers( (String)that.getId(), refresh,  new ObjectCallback<PostSubscriber> (){
                                            

                                            
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
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.create__postSubscribers( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostSubscriber> (){
                                            

                                            
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
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.update__postSubscribers( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostSubscriber> (){
                                            

                                            
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
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        



                                        commentRepo.destroy__postSubscribers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient PostDetail  postDetails ;
                    private String postDetailId;

                    public String getPostDetailId(){
                         return postDetailId;
                    }

                    public void setPostDetailId(Object postDetailId){
                        if(postDetailId != null){
                          this.postDetailId = postDetailId.toString();
                        }
                    }

                    public PostDetail getPostDetails() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(postDetails == null){
                                        CommentRepository commentRepository = (CommentRepository) getRepository();

                                        RestAdapter restAdapter = commentRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          postDetails = getPostDetails__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return postDetails;
                    }

                    public void setPostDetails(PostDetail postDetails) {
                        this.postDetails = postDetails;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPostDetails(Map<String, Object> postDetails) {
                        //First create a dummy Repo class object for customer.
                        PostDetailRepository postDetailsRepository = new PostDetailRepository();
                        PostDetail postDetails1 = postDetailsRepository.createObject(postDetails);
                        setPostDetails(postDetails1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPostDetails(HashMap<String, Object> postDetails) {
                        //First create a dummy Repo class object for customer.
                        PostDetailRepository postDetailsRepository = new PostDetailRepository();
                        PostDetail postDetails1 = postDetailsRepository.createObject(postDetails);
                        setPostDetails(postDetails1);
                    }

                    //Adding relation method..
                    public void addRelation(PostDetail postDetails) {
                        that.setPostDetails(postDetails);
                    }


                    //Fetch related data from local database if present a postDetailId identifier as property for belongsTo
                    public PostDetail getPostDetails__db(RestAdapter restAdapter){
                      if(postDetailId != null){
                        PostDetailRepository postDetailsRepository = restAdapter.createRepository(PostDetailRepository.class);
                            try{
                            CommentRepository lowercaseFirstLetterRepository = (CommentRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(postDetailsRepository.getDb() == null ){
                                                    postDetailsRepository.addStorage(context);
                                                }

                                                if(context != null && postDetailsRepository.getDb() != null){
                                                    postDetailsRepository.addStorage(context);
                                                    PostDetail postDetails = (PostDetail) postDetailsRepository.getDb().get__db(postDetailId);
                                                    return postDetails;
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
                                    public void get__postDetails( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<PostDetail> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.get__postDetails( (String)that.getId(), refresh,  new ObjectCallback<PostDetail> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostDetail object) {
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
                                    public void create__postDetails( PostDetail data,  RestAdapter restAdapter, final ObjectCallback<PostDetail> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.create__postDetails( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostDetail> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostDetail object) {
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
                                    public void update__postDetails( PostDetail data,  RestAdapter restAdapter, final ObjectCallback<PostDetail> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentRepo.update__postDetails( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostDetail> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostDetail object) {
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
                                    public void destroy__postDetails( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentRepository  commentRepo = restAdapter.createRepository(CommentRepository.class);
                                        
                                        



                                        commentRepo.destroy__postDetails( (String)that.getId(),  new VoidCallback (){
                                            
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
