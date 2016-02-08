package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;



import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.adapters.Adapter;

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentsRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.WishlistRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;



public class Customer extends Model {


    private Customer that ;

    public Customer (){
        that = this;
    }

    
        
            
            
                private String date;
                /* Adding Getter and Setter methods */
                public String getDate(){
                    return date;
                }

                /* Adding Getter and Setter methods */
                public void setDate(String date){
                    this.date = date;
                }

            
            
            

        
    
        
            
            
                private String phoneNumber;
                /* Adding Getter and Setter methods */
                public String getPhoneNumber(){
                    return phoneNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPhoneNumber(String phoneNumber){
                    this.phoneNumber = phoneNumber;
                }

            
            
            

        
    
        
            
            
                private String email;
                /* Adding Getter and Setter methods */
                public String getEmail(){
                    return email;
                }

                /* Adding Getter and Setter methods */
                public void setEmail(String email){
                    this.email = email;
                }

            
            
            

        
    
        
            
            
                private String firstName;
                /* Adding Getter and Setter methods */
                public String getFirstName(){
                    return firstName;
                }

                /* Adding Getter and Setter methods */
                public void setFirstName(String firstName){
                    this.firstName = firstName;
                }

            
            
            

        
    
        
            
            
                private String lastName;
                /* Adding Getter and Setter methods */
                public String getLastName(){
                    return lastName;
                }

                /* Adding Getter and Setter methods */
                public void setLastName(String lastName){
                    this.lastName = lastName;
                }

            
            
            

        
    
        
            
            
                private String password;
                /* Adding Getter and Setter methods */
                public String getPassword(){
                    return password;
                }

                /* Adding Getter and Setter methods */
                public void setPassword(String password){
                    this.password = password;
                }

            
            
            

        
    
        
            
            
            
            
                private HashMap<String, Object> profilePic;
                /* Adding Getter and Setter methods */
                public HashMap<String, Object> getProfilePic(){
                    return profilePic;
                }

                /* Adding Getter and Setter methods */
                public void setProfilePic(HashMap<String, Object> profilePic){
                    this.profilePic = profilePic;
                }

            

        
    
        
            
            
            
            

        
    
        
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
                
                
                    
                    //Define hasMany relation method here..
                    private List<Recipe>  recipes ;

                    public List<Recipe> getRecipes() {
                        return recipes;
                    }

                    public void setRecipes(List<Recipe> recipes) {
                        this.recipes = recipes;
                        //Disabling backend compatibility for cyclic error
                        /*
                        //Now add backward compatibility for the relation belongsTo for hasMany..
                        for (Recipe obj : recipes) {
                            obj.addRelation(that);
                        }
                        */
                    }

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setRecipes1(List<HashMap<String, Object>> recipes) {
                        //First create a dummy Repo class object for ..
                        RecipeRepository recipesRepository = new RecipeRepository();
                        List<Recipe> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : recipes) {
                            //Also add relation to child type for two way communication..
                            Recipe obj1 = recipesRepository.createObject(obj);
                            //Disabling backend compatibility for cyclic error
                            /*//Now add backward compatibility for the relation belongsTo for hasMany..
                            obj1.addRelation(that);*/
                            result.add(obj1);
                        }
                        setRecipes(result);
                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(List<Recipe> recipes, Recipe dummyClassInstance) {
                        that.setRecipes(recipes);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Recipe recipes) {
                        try{
                            that.getRecipes().add(recipes);
                        }catch(Exception e){
                            List< Recipe> recipes1 = new ArrayList();
                            //Now add this item to list..
                            recipes1.add(recipes);
                            //Now set data....
                            that.setRecipes(recipes1);
                        }
                    }

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__recipes( String fk,  RestAdapter restAdapter, final ObjectCallback<Recipe> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.findById__recipes( (String)that.getId(), fk,  new ObjectCallback<Recipe> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Recipe object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__recipes( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.destroyById__recipes( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__recipes( String fk,  Recipe data,  RestAdapter restAdapter, final ObjectCallback<Recipe> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.updateById__recipes( (String)that.getId(), fk, data,  new ObjectCallback<Recipe> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Recipe object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__recipes( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<Recipe> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.get__recipes( (String)that.getId(), filter,  new ListCallback<Recipe> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(List<Recipe> object) {

                                                        //now add relation to this recipe.
                                                        Recipe obj = new Recipe();
                                                        addRelation(object, obj);
                                                        //Disabling two way communication for cyclic error..
                                                        /*for (Recipe obj : object) {
                                                            //Also add relation to child type for two way communication..
                                                            obj.addRelation(that);
                                                        }*/

                                                        callback.onSuccess(object);
                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__recipes( Recipe data,  RestAdapter restAdapter, final ObjectCallback<Recipe> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.create__recipes( (String)that.getId(), data,  new ObjectCallback<Recipe> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Recipe object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__recipes( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.delete__recipes( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__recipes( HashMap<String, Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.count__recipes( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
                
                
                    
                    //Define hasMany relation method here..
                    private List<Comments>  comments ;

                    public List<Comments> getComments() {
                        return comments;
                    }

                    public void setComments(List<Comments> comments) {
                        this.comments = comments;
                        //Disabling backend compatibility for cyclic error
                        /*
                        //Now add backward compatibility for the relation belongsTo for hasMany..
                        for (Comments obj : comments) {
                            obj.addRelation(that);
                        }
                        */
                    }

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(List<HashMap<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentsRepository commentsRepository = new CommentsRepository();
                        List<Comments> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comments obj1 = commentsRepository.createObject(obj);
                            //Disabling backend compatibility for cyclic error
                            /*//Now add backward compatibility for the relation belongsTo for hasMany..
                            obj1.addRelation(that);*/
                            result.add(obj1);
                        }
                        setComments(result);
                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(List<Comments> comments, Comments dummyClassInstance) {
                        that.setComments(comments);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Comments comments) {
                        try{
                            that.getComments().add(comments);
                        }catch(Exception e){
                            List< Comments> comments1 = new ArrayList();
                            //Now add this item to list..
                            comments1.add(comments);
                            //Now set data....
                            that.setComments(comments1);
                        }
                    }

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__comments( String fk,  RestAdapter restAdapter, final ObjectCallback<Comments> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.findById__comments( (String)that.getId(), fk,  new ObjectCallback<Comments> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comments object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__comments( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.destroyById__comments( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__comments( String fk,  Comments data,  RestAdapter restAdapter, final ObjectCallback<Comments> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.updateById__comments( (String)that.getId(), fk, data,  new ObjectCallback<Comments> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comments object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__comments( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<Comments> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.get__comments( (String)that.getId(), filter,  new ListCallback<Comments> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(List<Comments> object) {

                                                        //now add relation to this recipe.
                                                        Comments obj = new Comments();
                                                        addRelation(object, obj);
                                                        //Disabling two way communication for cyclic error..
                                                        /*for (Comments obj : object) {
                                                            //Also add relation to child type for two way communication..
                                                            obj.addRelation(that);
                                                        }*/

                                                        callback.onSuccess(object);
                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__comments( Comments data,  RestAdapter restAdapter, final ObjectCallback<Comments> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.create__comments( (String)that.getId(), data,  new ObjectCallback<Comments> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comments object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__comments( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.delete__comments( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__comments( HashMap<String, Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.count__comments( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
    
        
                
                    //Define belongsTo relation method here..
                    private Wishlist  wishlists ;

                    public Wishlist getWishlists() {
                        return wishlists;
                    }

                    public void setWishlists(Wishlist wishlists) {
                        this.wishlists = wishlists;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setWishlists(HashMap<String, Object> wishlists) {
                        //First create a dummy Repo class object for customer.
                        WishlistRepository wishlistsRepository = new WishlistRepository();
                        Wishlist wishlists1 = wishlistsRepository.createObject(wishlists);
                        setWishlists(wishlists1);
                    }

                    //Adding relation method..
                    public void addRelation(Wishlist wishlists) {
                        that.setWishlists(wishlists);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__wishlists( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.get__wishlists( (String)that.getId(), refresh,  new ObjectCallback<Wishlist> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Wishlist object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__wishlists( Wishlist data,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.create__wishlists( (String)that.getId(), data,  new ObjectCallback<Wishlist> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Wishlist object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void update__wishlists( Wishlist data,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.update__wishlists( (String)that.getId(), data,  new ObjectCallback<Wishlist> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Wishlist object) {
                                                        //now add relation to this recipe.
                                                        addRelation(object);
                                                        //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                        //object.addRelation(that);
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroy__wishlists( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final CustomerRepository  customerRepo = restAdapter.createRepository(CustomerRepository.class);
                                        


                                        

                                        

                                        customerRepo.destroy__wishlists( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
