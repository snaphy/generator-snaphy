package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.remoting.adapters.Adapter;

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

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    


    



    //Now adding relations between related models
    
        
                
                    //Define belongsTo relation method here..
                    private transient Post  post ;

                    public Post getPost() {
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

                    public Customer getCustomer() {
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

                    public CommentDetail getCommentDetails() {
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

                    public PostSubscriber getPostSubscribers() {
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

                    public PostDetail getPostDetails() {
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
