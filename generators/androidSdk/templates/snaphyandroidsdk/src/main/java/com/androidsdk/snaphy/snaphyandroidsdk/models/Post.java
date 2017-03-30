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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostDetailRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.LikePostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SavePostRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostSubscriberRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Post extends Model {


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

    private Post that ;

    public Post (){
        that = this;
    }

    
        
            

            
                private String heading;
                /* Adding Getter and Setter methods */
                public String getHeading(){
                    return heading;
                }

                /* Adding Getter and Setter methods */
                public void setHeading(String heading){
                    this.heading = heading;
                    //Update hashMap value..
                    hashMap.put("heading", heading);
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

            
            
        
    
        
            

                private DataList<Map<String, Object>> postImages;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getPostImages(){
                    return postImages;
                }

                /* Adding Getter and Setter methods */
                public void setPostImages(DataList<Map<String, Object>> postImages){
                    this.postImages = postImages;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("postImages", postImages);
                }

            

            
            
        
    
        
            

            
                private boolean anonymous;
                /* Adding Getter and Setter methods */
                public boolean getAnonymous(){
                    return anonymous;
                }

                /* Adding Getter and Setter methods */
                public void setAnonymous(boolean anonymous){
                    this.anonymous = anonymous;
                    //Update hashMap value..
                    hashMap.put("anonymous", anonymous);
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

            
            
        
    
        
            

            
                private boolean latest;
                /* Adding Getter and Setter methods */
                public boolean getLatest(){
                    return latest;
                }

                /* Adding Getter and Setter methods */
                public void setLatest(boolean latest){
                    this.latest = latest;
                    //Update hashMap value..
                    hashMap.put("latest", latest);
                }

            
            
        
    
        
            

            
                private boolean unsolved;
                /* Adding Getter and Setter methods */
                public boolean getUnsolved(){
                    return unsolved;
                }

                /* Adding Getter and Setter methods */
                public void setUnsolved(boolean unsolved){
                    this.unsolved = unsolved;
                    //Update hashMap value..
                    hashMap.put("unsolved", unsolved);
                }

            
            
        
    
        
            

            
                private boolean trending;
                /* Adding Getter and Setter methods */
                public boolean getTrending(){
                    return trending;
                }

                /* Adding Getter and Setter methods */
                public void setTrending(boolean trending){
                    this.trending = trending;
                    //Update hashMap value..
                    hashMap.put("trending", trending);
                }

            
            
        
    
        
            

            
                private boolean posted;
                /* Adding Getter and Setter methods */
                public boolean getPosted(){
                    return posted;
                }

                /* Adding Getter and Setter methods */
                public void setPosted(boolean posted){
                    this.posted = posted;
                    //Update hashMap value..
                    hashMap.put("posted", posted);
                }

            
            
        
    
        
            

            
                private boolean saved;
                /* Adding Getter and Setter methods */
                public boolean getSaved(){
                    return saved;
                }

                /* Adding Getter and Setter methods */
                public void setSaved(boolean saved){
                    this.saved = saved;
                    //Update hashMap value..
                    hashMap.put("saved", saved);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      PostRepository lowercaseFirstLetterRepository = (PostRepository) getRepository();
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
      PostRepository lowercaseFirstLetterRepository = (PostRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      PostRepository lowercaseFirstLetterRepository = (PostRepository) getRepository();
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
		                  PostRepository postRepository = (PostRepository) getRepository();

		                  RestAdapter restAdapter = postRepository.getRestAdapter();
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
				PostRepository lowercaseFirstLetterRepository = (PostRepository) getRepository();
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
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
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
		                  PostRepository postRepository = (PostRepository) getRepository();

		                  RestAdapter restAdapter = postRepository.getRestAdapter();
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
				PostRepository lowercaseFirstLetterRepository = (PostRepository) getRepository();
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
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.get__postDetails( (String)that.getId(), refresh,  new ObjectCallback<PostDetail> (){
                                            

                                            
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
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.create__postDetails( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostDetail> (){
                                            

                                            
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
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.update__postDetails( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostDetail> (){
                                            

                                            
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
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        



                                        postRepo.destroy__postDetails( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Comment>  comments ;

                    public DataList< Comment > getComments() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            CommentRepository commentRepository = (CommentRepository) getRepository();

                            if(that.getId() != null && commentRepository.getDb() != null){

                                 //Fetch locally from db
                                 //comments = getComments__db(restAdapter);
                                 // Getting single cont
                                 comments = commentRepository.getDb().getAll__db("postId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return comments;
                    }

                    public void setComments(DataList<Comment> comments) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: comments){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setComments1(hashMaps);
                        }else{
                            this.comments = comments;
                            //TODO: Warning move this to new thread
                            for(Comment data: comments){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(List<Map<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentRepository commentsRepository = new CommentRepository();
                        List<Comment> result = new ArrayList<>();
                        for (Map<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comment obj1 = commentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setComments(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(DataList<HashMap<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentRepository commentsRepository = new CommentRepository();
                        DataList<Comment> result = new DataList<>();
                        for (HashMap<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comment obj1 = commentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setComments(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Comment> comments, Comment dummyClassInstance) {
                        that.setComments(comments);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Comment comments) {
                        try{
                            try{

                                  //Save to database..
                                  comments.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getComments().add(comments);
                        }catch(Exception e){
                            DataList< Comment> comments1 = new DataList();
                            //Now add this item to list..
                            comments1.add(comments);
                            //Now set data....
                            that.setComments(comments1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__comments( String fk,  RestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.findById__comments( (String)that.getId(), fk,  new ObjectCallback<Comment> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__comments( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.destroyById__comments( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__comments( String fk,  Comment data,  RestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        postRepo.updateById__comments( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Comment> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__comments( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.get__comments( (String)that.getId(), filter,  new DataListCallback<Comment> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Comment> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Comment obj = new Comment();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Comment obj : object) {
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
                                    public void create__comments( Comment data,  RestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.create__comments( (String)that.getId(), data.convertMap(),  new ObjectCallback<Comment> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__comments( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        



                                        postRepo.delete__comments( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__comments( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.count__comments( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<LikePost>  likePosts ;

                    public DataList< LikePost > getLikePosts() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            LikePostRepository likePostRepository = (LikePostRepository) getRepository();

                            if(that.getId() != null && likePostRepository.getDb() != null){

                                 //Fetch locally from db
                                 //likePosts = getLikePosts__db(restAdapter);
                                 // Getting single cont
                                 likePosts = likePostRepository.getDb().getAll__db("postId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return likePosts;
                    }

                    public void setLikePosts(DataList<LikePost> likePosts) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: likePosts){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setLikePosts1(hashMaps);
                        }else{
                            this.likePosts = likePosts;
                            //TODO: Warning move this to new thread
                            for(LikePost data: likePosts){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setLikePosts1(List<Map<String, Object>> likePosts) {
                        //First create a dummy Repo class object for ..
                        LikePostRepository likePostsRepository = new LikePostRepository();
                        List<LikePost> result = new ArrayList<>();
                        for (Map<String, Object> obj : likePosts) {
                            //Also add relation to child type for two way communication..
                            LikePost obj1 = likePostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setLikePosts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setLikePosts1(DataList<HashMap<String, Object>> likePosts) {
                        //First create a dummy Repo class object for ..
                        LikePostRepository likePostsRepository = new LikePostRepository();
                        DataList<LikePost> result = new DataList<>();
                        for (HashMap<String, Object> obj : likePosts) {
                            //Also add relation to child type for two way communication..
                            LikePost obj1 = likePostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setLikePosts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<LikePost> likePosts, LikePost dummyClassInstance) {
                        that.setLikePosts(likePosts);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(LikePost likePosts) {
                        try{
                            try{

                                  //Save to database..
                                  likePosts.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getLikePosts().add(likePosts);
                        }catch(Exception e){
                            DataList< LikePost> likePosts1 = new DataList();
                            //Now add this item to list..
                            likePosts1.add(likePosts);
                            //Now set data....
                            that.setLikePosts(likePosts1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__likePosts( String fk,  RestAdapter restAdapter, final ObjectCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.findById__likePosts( (String)that.getId(), fk,  new ObjectCallback<LikePost> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__likePosts( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.destroyById__likePosts( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__likePosts( String fk,  LikePost data,  RestAdapter restAdapter, final ObjectCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        postRepo.updateById__likePosts( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<LikePost> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__likePosts( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.get__likePosts( (String)that.getId(), filter,  new DataListCallback<LikePost> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<LikePost> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            LikePost obj = new LikePost();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (LikePost obj : object) {
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
                                    public void create__likePosts( LikePost data,  RestAdapter restAdapter, final ObjectCallback<LikePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.create__likePosts( (String)that.getId(), data.convertMap(),  new ObjectCallback<LikePost> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__likePosts( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        



                                        postRepo.delete__likePosts( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__likePosts( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.count__likePosts( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<SavePost>  savePosts ;

                    public DataList< SavePost > getSavePosts() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            SavePostRepository savePostRepository = (SavePostRepository) getRepository();

                            if(that.getId() != null && savePostRepository.getDb() != null){

                                 //Fetch locally from db
                                 //savePosts = getSavePosts__db(restAdapter);
                                 // Getting single cont
                                 savePosts = savePostRepository.getDb().getAll__db("postId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return savePosts;
                    }

                    public void setSavePosts(DataList<SavePost> savePosts) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: savePosts){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setSavePosts1(hashMaps);
                        }else{
                            this.savePosts = savePosts;
                            //TODO: Warning move this to new thread
                            for(SavePost data: savePosts){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSavePosts1(List<Map<String, Object>> savePosts) {
                        //First create a dummy Repo class object for ..
                        SavePostRepository savePostsRepository = new SavePostRepository();
                        List<SavePost> result = new ArrayList<>();
                        for (Map<String, Object> obj : savePosts) {
                            //Also add relation to child type for two way communication..
                            SavePost obj1 = savePostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSavePosts(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSavePosts1(DataList<HashMap<String, Object>> savePosts) {
                        //First create a dummy Repo class object for ..
                        SavePostRepository savePostsRepository = new SavePostRepository();
                        DataList<SavePost> result = new DataList<>();
                        for (HashMap<String, Object> obj : savePosts) {
                            //Also add relation to child type for two way communication..
                            SavePost obj1 = savePostsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSavePosts(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<SavePost> savePosts, SavePost dummyClassInstance) {
                        that.setSavePosts(savePosts);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(SavePost savePosts) {
                        try{
                            try{

                                  //Save to database..
                                  savePosts.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getSavePosts().add(savePosts);
                        }catch(Exception e){
                            DataList< SavePost> savePosts1 = new DataList();
                            //Now add this item to list..
                            savePosts1.add(savePosts);
                            //Now set data....
                            that.setSavePosts(savePosts1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__savePosts( String fk,  RestAdapter restAdapter, final ObjectCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.findById__savePosts( (String)that.getId(), fk,  new ObjectCallback<SavePost> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__savePosts( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.destroyById__savePosts( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__savePosts( String fk,  SavePost data,  RestAdapter restAdapter, final ObjectCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        postRepo.updateById__savePosts( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<SavePost> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__savePosts( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.get__savePosts( (String)that.getId(), filter,  new DataListCallback<SavePost> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<SavePost> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            SavePost obj = new SavePost();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (SavePost obj : object) {
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
                                    public void create__savePosts( SavePost data,  RestAdapter restAdapter, final ObjectCallback<SavePost> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.create__savePosts( (String)that.getId(), data.convertMap(),  new ObjectCallback<SavePost> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__savePosts( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        



                                        postRepo.delete__savePosts( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__savePosts( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.count__savePosts( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<PostSubscriber>  postSubscribers ;

                    public DataList< PostSubscriber > getPostSubscribers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PostSubscriberRepository postSubscriberRepository = (PostSubscriberRepository) getRepository();

                            if(that.getId() != null && postSubscriberRepository.getDb() != null){

                                 //Fetch locally from db
                                 //postSubscribers = getPostSubscribers__db(restAdapter);
                                 // Getting single cont
                                 postSubscribers = postSubscriberRepository.getDb().getAll__db("postId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return postSubscribers;
                    }

                    public void setPostSubscribers(DataList<PostSubscriber> postSubscribers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: postSubscribers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPostSubscribers1(hashMaps);
                        }else{
                            this.postSubscribers = postSubscribers;
                            //TODO: Warning move this to new thread
                            for(PostSubscriber data: postSubscribers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostSubscribers1(List<Map<String, Object>> postSubscribers) {
                        //First create a dummy Repo class object for ..
                        PostSubscriberRepository postSubscribersRepository = new PostSubscriberRepository();
                        List<PostSubscriber> result = new ArrayList<>();
                        for (Map<String, Object> obj : postSubscribers) {
                            //Also add relation to child type for two way communication..
                            PostSubscriber obj1 = postSubscribersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostSubscribers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostSubscribers1(DataList<HashMap<String, Object>> postSubscribers) {
                        //First create a dummy Repo class object for ..
                        PostSubscriberRepository postSubscribersRepository = new PostSubscriberRepository();
                        DataList<PostSubscriber> result = new DataList<>();
                        for (HashMap<String, Object> obj : postSubscribers) {
                            //Also add relation to child type for two way communication..
                            PostSubscriber obj1 = postSubscribersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostSubscribers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PostSubscriber> postSubscribers, PostSubscriber dummyClassInstance) {
                        that.setPostSubscribers(postSubscribers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PostSubscriber postSubscribers) {
                        try{
                            try{

                                  //Save to database..
                                  postSubscribers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPostSubscribers().add(postSubscribers);
                        }catch(Exception e){
                            DataList< PostSubscriber> postSubscribers1 = new DataList();
                            //Now add this item to list..
                            postSubscribers1.add(postSubscribers);
                            //Now set data....
                            that.setPostSubscribers(postSubscribers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__postSubscribers( String fk,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.findById__postSubscribers( (String)that.getId(), fk,  new ObjectCallback<PostSubscriber> (){
                                            

                                            
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
                                    public void destroyById__postSubscribers( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.destroyById__postSubscribers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__postSubscribers( String fk,  PostSubscriber data,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        postRepo.updateById__postSubscribers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PostSubscriber> (){
                                            

                                            
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
                                    public void get__postSubscribers( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.get__postSubscribers( (String)that.getId(), filter,  new DataListCallback<PostSubscriber> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PostSubscriber> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PostSubscriber obj = new PostSubscriber();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PostSubscriber obj : object) {
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
                                    public void create__postSubscribers( PostSubscriber data,  RestAdapter restAdapter, final ObjectCallback<PostSubscriber> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.create__postSubscribers( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostSubscriber> (){
                                            

                                            
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
                                    public void delete__postSubscribers( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        



                                        postRepo.delete__postSubscribers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__postSubscribers( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final PostRepository  postRepo = restAdapter.createRepository(PostRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        postRepo.count__postSubscribers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
