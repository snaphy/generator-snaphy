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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostSubscriberRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.LikePostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SavePostRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class PostSubscriber extends Model {


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

    private PostSubscriber that ;

    public PostSubscriber (){
        that = this;
    }

    
        
            

            
                private String type;
                /* Adding Getter and Setter methods */
                public String getType(){
                    return type;
                }

                /* Adding Getter and Setter methods */
                public void setType(String type){
                    this.type = type;
                    //Update hashMap value..
                    hashMap.put("type", type);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      PostSubscriberRepository lowercaseFirstLetterRepository = (PostSubscriberRepository) getRepository();
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
      PostSubscriberRepository lowercaseFirstLetterRepository = (PostSubscriberRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      PostSubscriberRepository lowercaseFirstLetterRepository = (PostSubscriberRepository) getRepository();
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
		                  PostSubscriberRepository postSubscriberRepository = (PostSubscriberRepository) getRepository();

		                  RestAdapter restAdapter = postSubscriberRepository.getRestAdapter();
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
				PostSubscriberRepository lowercaseFirstLetterRepository = (PostSubscriberRepository) getRepository();
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
                                        final PostSubscriberRepository  postSubscriberRepo = restAdapter.createRepository(PostSubscriberRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postSubscriberRepo.get__post( (String)that.getId(), refresh,  new ObjectCallback<Post> (){
                                            

                                            
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
		                  PostSubscriberRepository postSubscriberRepository = (PostSubscriberRepository) getRepository();

		                  RestAdapter restAdapter = postSubscriberRepository.getRestAdapter();
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
				PostSubscriberRepository lowercaseFirstLetterRepository = (PostSubscriberRepository) getRepository();
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
                                        final PostSubscriberRepository  postSubscriberRepo = restAdapter.createRepository(PostSubscriberRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postSubscriberRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
                    private transient Comment  comment ;
                    private String commentId;

                    public String getCommentId(){
                         return commentId;
                    }

                    public void setCommentId(Object commentId){
                        if(commentId != null){
                          this.commentId = commentId.toString();
                        }
                    }

                    public Comment getComment() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(comment == null){
		                  PostSubscriberRepository postSubscriberRepository = (PostSubscriberRepository) getRepository();

		                  RestAdapter restAdapter = postSubscriberRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    comment = getComment__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return comment;
                    }

                    public void setComment(Comment comment) {
                        this.comment = comment;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setComment(Map<String, Object> comment) {
                        //First create a dummy Repo class object for customer.
                        CommentRepository commentRepository = new CommentRepository();
                        Comment comment1 = commentRepository.createObject(comment);
                        setComment(comment1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setComment(HashMap<String, Object> comment) {
                        //First create a dummy Repo class object for customer.
                        CommentRepository commentRepository = new CommentRepository();
                        Comment comment1 = commentRepository.createObject(comment);
                        setComment(comment1);
                    }

                    //Adding relation method..
                    public void addRelation(Comment comment) {
                        that.setComment(comment);
                    }


                    //Fetch related data from local database if present a commentId identifier as property for belongsTo
                    public Comment getComment__db(RestAdapter restAdapter){
                      if(commentId != null){
                        CommentRepository commentRepository = restAdapter.createRepository(CommentRepository.class);
			  try{
				PostSubscriberRepository lowercaseFirstLetterRepository = (PostSubscriberRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(commentRepository.getDb() == null ){
		                            commentRepository.addStorage(context);
		                        }

		                        if(context != null && commentRepository.getDb() != null){
		                            commentRepository.addStorage(context);
		                            Comment comment = (Comment) commentRepository.getDb().get__db(commentId);
		                            return comment;
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
                                    public void get__comment( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostSubscriberRepository  postSubscriberRepo = restAdapter.createRepository(PostSubscriberRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postSubscriberRepo.get__comment( (String)that.getId(), refresh,  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                    private transient LikePost  likePost ;
                    private String likePostId;

                    public String getLikePostId(){
                         return likePostId;
                    }

                    public void setLikePostId(Object likePostId){
                        if(likePostId != null){
                          this.likePostId = likePostId.toString();
                        }
                    }

                    public LikePost getLikePost() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(likePost == null){
		                  PostSubscriberRepository postSubscriberRepository = (PostSubscriberRepository) getRepository();

		                  RestAdapter restAdapter = postSubscriberRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    likePost = getLikePost__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return likePost;
                    }

                    public void setLikePost(LikePost likePost) {
                        this.likePost = likePost;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setLikePost(Map<String, Object> likePost) {
                        //First create a dummy Repo class object for customer.
                        LikePostRepository likePostRepository = new LikePostRepository();
                        LikePost likePost1 = likePostRepository.createObject(likePost);
                        setLikePost(likePost1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setLikePost(HashMap<String, Object> likePost) {
                        //First create a dummy Repo class object for customer.
                        LikePostRepository likePostRepository = new LikePostRepository();
                        LikePost likePost1 = likePostRepository.createObject(likePost);
                        setLikePost(likePost1);
                    }

                    //Adding relation method..
                    public void addRelation(LikePost likePost) {
                        that.setLikePost(likePost);
                    }


                    //Fetch related data from local database if present a likePostId identifier as property for belongsTo
                    public LikePost getLikePost__db(RestAdapter restAdapter){
                      if(likePostId != null){
                        LikePostRepository likePostRepository = restAdapter.createRepository(LikePostRepository.class);
			  try{
				PostSubscriberRepository lowercaseFirstLetterRepository = (PostSubscriberRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(likePostRepository.getDb() == null ){
		                            likePostRepository.addStorage(context);
		                        }

		                        if(context != null && likePostRepository.getDb() != null){
		                            likePostRepository.addStorage(context);
		                            LikePost likePost = (LikePost) likePostRepository.getDb().get__db(likePostId);
		                            return likePost;
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
                                    public void get__likePost( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostSubscriberRepository  postSubscriberRepo = restAdapter.createRepository(PostSubscriberRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postSubscriberRepo.get__likePost( (String)that.getId(), refresh,  new ObjectCallback<LikePost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(LikePost object) {
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
                    private transient SavePost  savePost ;
                    private String savePostId;

                    public String getSavePostId(){
                         return savePostId;
                    }

                    public void setSavePostId(Object savePostId){
                        if(savePostId != null){
                          this.savePostId = savePostId.toString();
                        }
                    }

                    public SavePost getSavePost() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(savePost == null){
		                  PostSubscriberRepository postSubscriberRepository = (PostSubscriberRepository) getRepository();

		                  RestAdapter restAdapter = postSubscriberRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    savePost = getSavePost__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return savePost;
                    }

                    public void setSavePost(SavePost savePost) {
                        this.savePost = savePost;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSavePost(Map<String, Object> savePost) {
                        //First create a dummy Repo class object for customer.
                        SavePostRepository savePostRepository = new SavePostRepository();
                        SavePost savePost1 = savePostRepository.createObject(savePost);
                        setSavePost(savePost1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSavePost(HashMap<String, Object> savePost) {
                        //First create a dummy Repo class object for customer.
                        SavePostRepository savePostRepository = new SavePostRepository();
                        SavePost savePost1 = savePostRepository.createObject(savePost);
                        setSavePost(savePost1);
                    }

                    //Adding relation method..
                    public void addRelation(SavePost savePost) {
                        that.setSavePost(savePost);
                    }


                    //Fetch related data from local database if present a savePostId identifier as property for belongsTo
                    public SavePost getSavePost__db(RestAdapter restAdapter){
                      if(savePostId != null){
                        SavePostRepository savePostRepository = restAdapter.createRepository(SavePostRepository.class);
			  try{
				PostSubscriberRepository lowercaseFirstLetterRepository = (PostSubscriberRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(savePostRepository.getDb() == null ){
		                            savePostRepository.addStorage(context);
		                        }

		                        if(context != null && savePostRepository.getDb() != null){
		                            savePostRepository.addStorage(context);
		                            SavePost savePost = (SavePost) savePostRepository.getDb().get__db(savePostId);
		                            return savePost;
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
                                    public void get__savePost( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostSubscriberRepository  postSubscriberRepo = restAdapter.createRepository(PostSubscriberRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postSubscriberRepo.get__savePost( (String)that.getId(), refresh,  new ObjectCallback<SavePost> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SavePost object) {
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
