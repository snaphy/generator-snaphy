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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentDetailRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class CommentDetail extends Model {


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

    private CommentDetail that ;

    public CommentDetail (){
        that = this;
    }

    
        
            

            
            
                private double totalLike;
                /* Adding Getter and Setter methods */
                public double getTotalLike(){
                    return totalLike;
                }

                /* Adding Getter and Setter methods */
                public void setTotalLike(double totalLike){
                    this.totalLike = totalLike;
                    //Update hashMap value..
                    hashMap.put("totalLike", totalLike);
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
                    private transient Comment  comment ;

                    public Comment getComment() {
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



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__comment( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CommentDetailRepository  commentDetailRepo = restAdapter.createRepository(CommentDetailRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        commentDetailRepo.get__comment( (String)that.getId(), refresh,  new ObjectCallback<Comment> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
