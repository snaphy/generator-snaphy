package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;


import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.adapters.Adapter;

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CuisinesRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PriorityRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentsRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeTagRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IngredientsRepository;
            
                import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeIngredientsRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.WishlistRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;



public class Recipe extends Model {


    private Recipe that ;

    public Recipe (){
        that = this;
    }

    
        
            
            
                private String name;
                /* Adding Getter and Setter methods */
                public String getName(){
                    return name;
                }

                /* Adding Getter and Setter methods */
                public void setName(String name){
                    this.name = name;
                }

            
            
            

        
    
        
            
            
                private String description;
                /* Adding Getter and Setter methods */
                public String getDescription(){
                    return description;
                }

                /* Adding Getter and Setter methods */
                public void setDescription(String description){
                    this.description = description;
                }

            
            
            

        
    
        
            
            
            
            
                private HashMap<String, Object> mainImage;
                /* Adding Getter and Setter methods */
                public HashMap<String, Object> getMainImage(){
                    return mainImage;
                }

                /* Adding Getter and Setter methods */
                public void setMainImage(HashMap<String, Object> mainImage){
                    this.mainImage = mainImage;
                }

            

        
    
        
            
            
                private String recipeType;
                /* Adding Getter and Setter methods */
                public String getRecipeType(){
                    return recipeType;
                }

                /* Adding Getter and Setter methods */
                public void setRecipeType(String recipeType){
                    this.recipeType = recipeType;
                }

            
            
            

        
    
        
            
            
            
                private Double servings;
                /* Adding Getter and Setter methods */
                public Double getServings(){
                    return servings;
                }

                /* Adding Getter and Setter methods */
                public void setServings(Double servings){
                    this.servings = servings;
                }

            
            

        
    
        
            
            
                private String added;
                /* Adding Getter and Setter methods */
                public String getAdded(){
                    return added;
                }

                /* Adding Getter and Setter methods */
                public void setAdded(String added){
                    this.added = added;
                }

            
            
            

        
    
        
            
            
                private String status;
                /* Adding Getter and Setter methods */
                public String getStatus(){
                    return status;
                }

                /* Adding Getter and Setter methods */
                public void setStatus(String status){
                    this.status = status;
                }

            
            
            

        
    
        
            
            
                private String youtubeVideoId;
                /* Adding Getter and Setter methods */
                public String getYoutubeVideoId(){
                    return youtubeVideoId;
                }

                /* Adding Getter and Setter methods */
                public void setYoutubeVideoId(String youtubeVideoId){
                    this.youtubeVideoId = youtubeVideoId;
                }

            
            
            

        
    
        
            

                private ArrayList<HashMap<String, Object>> stepsImage;
                /* Adding Getter and Setter methods */
                public ArrayList<HashMap<String, Object>> getStepsImage(){
                    return stepsImage;
                }

                /* Adding Getter and Setter methods */
                public void setStepsImage(ArrayList<HashMap<String, Object>> stepsImage){
                    this.stepsImage = stepsImage;
                }

            
            
            
            

        
    
        
            

                private ArrayList<HashMap<String, Object>> stepsDescription;
                /* Adding Getter and Setter methods */
                public ArrayList<HashMap<String, Object>> getStepsDescription(){
                    return stepsDescription;
                }

                /* Adding Getter and Setter methods */
                public void setStepsDescription(ArrayList<HashMap<String, Object>> stepsDescription){
                    this.stepsDescription = stepsDescription;
                }

            
            
            
            

        
    
        
            
            
            
            

        
    
        
            
            
            
            

        
    
        
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
                
                    //Define belongsTo relation method here..
                    private Customer  customer ;

                    public Customer getCustomer() {
                        return customer;
                    }

                    public void setCustomer(Customer customer) {
                        this.customer = customer;
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
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Customer object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
                                                    callback.onSuccess(object);
                                                }
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
                
                
                
                    //TODO ADD BACKWARD COMPATIBILITY FOR hasManyThrough relationship..warning backward compatibility may leads to cyclic error..
                    //Define belongsTo relation method here..
                    private List<Cuisines>  cuisines ;

                    public List<Cuisines> getCuisines() {
                        return cuisines;
                    }

                    public void setCuisines(List<Cuisines> cuisines) {
                        this.cuisines = cuisines;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCuisines1(List<HashMap<String, Object>> cuisines) {
                        //First create a dummy Repo class object for ..
                        CuisinesRepository cuisinesRepository = new CuisinesRepository();
                        List<Cuisines> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : cuisines) {
                            //Also add relation to child type for two way communication..
                            Cuisines obj1 = cuisinesRepository.createObject(obj);
                            result.add(obj1);
                        }
                        setCuisines(result);
                    }


                    //Adding relation method..
                    public void addRelation(List<Cuisines> cuisines) {
                        that.setCuisines(cuisines);
                    }

                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void findById__cuisines( String fk,  RestAdapter restAdapter, final ObjectCallback<Cuisines> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.findById__cuisines( (String)that.getId(), fk,  new ObjectCallback<Cuisines> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Cuisines object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void destroyById__cuisines( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.destroyById__cuisines( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__cuisines( String fk,  Cuisines data,  RestAdapter restAdapter, final ObjectCallback<Cuisines> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.updateById__cuisines( (String)that.getId(), fk, data,  new ObjectCallback<Cuisines> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Cuisines object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void link__cuisines( String fk,  Cuisines data,  RestAdapter restAdapter, final ObjectCallback<Cuisines> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.link__cuisines( (String)that.getId(), fk, data,  new ObjectCallback<Cuisines> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Cuisines object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void unlink__cuisines( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.unlink__cuisines( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__cuisines( String fk,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.exists__cuisines( (String)that.getId(), fk,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Boolean object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void get__cuisines( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<Cuisines> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.get__cuisines( (String)that.getId(), filter,  new ListCallback<Cuisines> (){
                                            

                                            


                                            
                                                @Override
                                                public void onSuccess(ArrayList<Cuisines> object) {

                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Disabling two way communication for cyclic error..
                                                    /*for (Cuisines obj : object) {
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
                                    public void create__cuisines( Cuisines data,  RestAdapter restAdapter, final ObjectCallback<Cuisines> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.create__cuisines( (String)that.getId(), data,  new ObjectCallback<Cuisines> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Cuisines object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void delete__cuisines( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.delete__cuisines( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__cuisines( HashMap<String, Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.count__cuisines( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Double object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
                                                    callback.onSuccess(object);
                                                }
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                
                    //Define hasAndBelongsToMany..

                 
             
          
    
        
                
                    //Define belongsTo relation method here..
                    private Priority  priorities ;

                    public Priority getPriorities() {
                        return priorities;
                    }

                    public void setPriorities(Priority priorities) {
                        this.priorities = priorities;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setPriorities(HashMap<String, Object> priorities) {
                        //First create a dummy Repo class object for customer.
                        PriorityRepository prioritiesRepository = new PriorityRepository();
                        Priority priorities1 = prioritiesRepository.createObject(priorities);
                        setPriority(priorities1);
                    }

                    //Adding relation method..
                    public void addRelation(Priority priorities) {
                        that.setPriorities(priorities);
                    }

                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__priorities( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Priority> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.get__priorities( (String)that.getId(), refresh,  new ObjectCallback<Priority> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Priority object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void create__priorities( Priority data,  RestAdapter restAdapter, final ObjectCallback<Priority> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.create__priorities( (String)that.getId(), data,  new ObjectCallback<Priority> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Priority object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void update__priorities( Priority data,  RestAdapter restAdapter, final ObjectCallback<Priority> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.update__priorities( (String)that.getId(), data,  new ObjectCallback<Priority> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Priority object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void destroy__priorities( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.destroy__priorities( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
                
                
                
                    //TODO ADD BACKWARD COMPATIBILITY FOR hasManyThrough relationship..warning backward compatibility may leads to cyclic error..
                    //Define belongsTo relation method here..
                    private List<Category>  category ;

                    public List<Category> getCategory() {
                        return category;
                    }

                    public void setCategory(List<Category> category) {
                        this.category = category;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCategory1(List<HashMap<String, Object>> category) {
                        //First create a dummy Repo class object for ..
                        CategoryRepository categoryRepository = new CategoryRepository();
                        List<Category> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : category) {
                            //Also add relation to child type for two way communication..
                            Category obj1 = categoryRepository.createObject(obj);
                            result.add(obj1);
                        }
                        setCategory(result);
                    }


                    //Adding relation method..
                    public void addRelation(List<Category> category) {
                        that.setCategory(category);
                    }

                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__category( String fk,  RestAdapter restAdapter, final ObjectCallback<Category> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.findById__category( (String)that.getId(), fk,  new ObjectCallback<Category> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Category object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void destroyById__category( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.destroyById__category( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__category( String fk,  Category data,  RestAdapter restAdapter, final ObjectCallback<Category> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.updateById__category( (String)that.getId(), fk, data,  new ObjectCallback<Category> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Category object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void link__category( String fk,  Category data,  RestAdapter restAdapter, final ObjectCallback<Category> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.link__category( (String)that.getId(), fk, data,  new ObjectCallback<Category> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Category object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void unlink__category( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.unlink__category( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__category( String fk,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.exists__category( (String)that.getId(), fk,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Boolean object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void get__category( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<Category> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.get__category( (String)that.getId(), filter,  new ListCallback<Category> (){
                                            

                                            


                                            
                                                @Override
                                                public void onSuccess(ArrayList<Category> object) {

                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Disabling two way communication for cyclic error..
                                                    /*for (Category obj : object) {
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
                                    public void create__category( Category data,  RestAdapter restAdapter, final ObjectCallback<Category> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.create__category( (String)that.getId(), data,  new ObjectCallback<Category> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Category object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void delete__category( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.delete__category( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__category( HashMap<String, Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.count__category( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Double object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
                                                    callback.onSuccess(object);
                                                }
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                
                    //Define hasAndBelongsToMany..

                 
             
          
    
        
                
                
                    
                    //Define belongsTo relation method here..
                    private List<Comments>  comments ;

                    public List<Comments> getComments() {
                        return comments;
                    }

                    public void setComments(List<Comments> comments) {
                        this.comments = comments;
                        //Now add backward compatibility for the relation belongsTo for hasMany..
                        for (Comments obj : comments) {
                            obj.addRelation(that);
                        }
                    }

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(List<HashMap<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentsRepository commentsRepository = new CommentsRepository();
                        List<Comments> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comments obj1 = commentsRepository.createObject(obj);
                            //Now add backward compatibility for the relation belongsTo for hasMany..
                            obj1.addRelation(that);
                            result.add(obj1);
                        }
                        setComments(result);
                    }


                    //Adding relation method..
                    public void addRelation(List<Comments> comments) {
                        that.setComments(comments);

                    }

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__comments( String fk,  RestAdapter restAdapter, final ObjectCallback<Comments> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.findById__comments( (String)that.getId(), fk,  new ObjectCallback<Comments> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Comments object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.destroyById__comments( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.updateById__comments( (String)that.getId(), fk, data,  new ObjectCallback<Comments> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Comments object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.get__comments( (String)that.getId(), filter,  new ListCallback<Comments> (){
                                            

                                            


                                            
                                                @Override
                                                public void onSuccess(ArrayList<Comments> object) {

                                                    //now add relation to this recipe.
                                                    addRelation(object);
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
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.create__comments( (String)that.getId(), data,  new ObjectCallback<Comments> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Comments object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.delete__comments( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.count__comments( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Double object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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

                 
                 
             
          
    
        
                
                
                
                    //TODO ADD BACKWARD COMPATIBILITY FOR hasManyThrough relationship..warning backward compatibility may leads to cyclic error..
                    //Define belongsTo relation method here..
                    private List<RecipeTag>  recipeTags ;

                    public List<RecipeTag> getRecipeTags() {
                        return recipeTags;
                    }

                    public void setRecipeTags(List<RecipeTag> recipeTags) {
                        this.recipeTags = recipeTags;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRecipeTags1(List<HashMap<String, Object>> recipeTags) {
                        //First create a dummy Repo class object for ..
                        RecipeTagRepository recipeTagsRepository = new RecipeTagRepository();
                        List<RecipeTag> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : recipeTags) {
                            //Also add relation to child type for two way communication..
                            RecipeTag obj1 = recipeTagsRepository.createObject(obj);
                            result.add(obj1);
                        }
                        setRecipeTag(result);
                    }


                    //Adding relation method..
                    public void addRelation(List<RecipeTag> recipeTags) {
                        that.setRecipeTags(recipeTags);
                    }

                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__recipeTags( String fk,  RestAdapter restAdapter, final ObjectCallback<RecipeTag> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.findById__recipeTags( (String)that.getId(), fk,  new ObjectCallback<RecipeTag> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(RecipeTag object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void destroyById__recipeTags( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.destroyById__recipeTags( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__recipeTags( String fk,  RecipeTag data,  RestAdapter restAdapter, final ObjectCallback<RecipeTag> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.updateById__recipeTags( (String)that.getId(), fk, data,  new ObjectCallback<RecipeTag> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(RecipeTag object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void link__recipeTags( String fk,  RecipeTag data,  RestAdapter restAdapter, final ObjectCallback<RecipeTag> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.link__recipeTags( (String)that.getId(), fk, data,  new ObjectCallback<RecipeTag> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(RecipeTag object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void unlink__recipeTags( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.unlink__recipeTags( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__recipeTags( String fk,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.exists__recipeTags( (String)that.getId(), fk,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Boolean object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void get__recipeTags( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<RecipeTag> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.get__recipeTags( (String)that.getId(), filter,  new ListCallback<RecipeTag> (){
                                            

                                            


                                            
                                                @Override
                                                public void onSuccess(ArrayList<RecipeTag> object) {

                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Disabling two way communication for cyclic error..
                                                    /*for (RecipeTag obj : object) {
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
                                    public void create__recipeTags( RecipeTag data,  RestAdapter restAdapter, final ObjectCallback<RecipeTag> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.create__recipeTags( (String)that.getId(), data,  new ObjectCallback<RecipeTag> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(RecipeTag object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void delete__recipeTags( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.delete__recipeTags( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__recipeTags( HashMap<String, Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.count__recipeTags( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Double object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
                                                    callback.onSuccess(object);
                                                }
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                
                    //Define hasAndBelongsToMany..

                 
             
          
    
        
                
                
                    
                    //Define belongsTo relation method here..
                    private List<Ingredients>  ingredients ;

                    public List<Ingredients> getIngredients() {
                        return ingredients;
                    }

                    public void setIngredients(List<Ingredients> ingredients) {
                        this.ingredients = ingredients;
                        //Now add backward compatibility for the relation belongsTo for hasMany..
                        for (Ingredients obj : ingredients) {
                            obj.addRelation(that);
                        }
                    }

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setIngredients1(List<HashMap<String, Object>> ingredients) {
                        //First create a dummy Repo class object for ..
                        IngredientsRepository ingredientsRepository = new IngredientsRepository();
                        List<Ingredients> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : ingredients) {
                            //Also add relation to child type for two way communication..
                            Ingredients obj1 = ingredientsRepository.createObject(obj);
                            //Now add backward compatibility for the relation belongsTo for hasMany..
                            obj1.addRelation(that);
                            result.add(obj1);
                        }
                        setIngredients(result);
                    }


                    //Adding relation method..
                    public void addRelation(List<Ingredients> ingredients) {
                        that.setIngredients(ingredients);

                    }

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__ingredients( String fk,  RestAdapter restAdapter, final ObjectCallback<Ingredients> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.findById__ingredients( (String)that.getId(), fk,  new ObjectCallback<Ingredients> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Ingredients object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void destroyById__ingredients( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.destroyById__ingredients( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__ingredients( String fk,  Ingredients data,  RestAdapter restAdapter, final ObjectCallback<Ingredients> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.updateById__ingredients( (String)that.getId(), fk, data,  new ObjectCallback<Ingredients> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Ingredients object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void link__ingredients( String fk,  RecipeIngredients data,  RestAdapter restAdapter, final ObjectCallback<RecipeIngredients> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.link__ingredients( (String)that.getId(), fk, data,  new ObjectCallback<RecipeIngredients> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(RecipeIngredients object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void unlink__ingredients( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.unlink__ingredients( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__ingredients( String fk,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.exists__ingredients( (String)that.getId(), fk,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Boolean object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void get__ingredients( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<Ingredients> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.get__ingredients( (String)that.getId(), filter,  new ListCallback<Ingredients> (){
                                            

                                            


                                            
                                                @Override
                                                public void onSuccess(ArrayList<Ingredients> object) {

                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Disabling two way communication for cyclic error..
                                                    /*for (Ingredients obj : object) {
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
                                    public void create__ingredients( Ingredients data,  RestAdapter restAdapter, final ObjectCallback<Ingredients> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.create__ingredients( (String)that.getId(), data,  new ObjectCallback<Ingredients> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Ingredients object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void delete__ingredients( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.delete__ingredients( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__ingredients( HashMap<String, Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.count__ingredients( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Double object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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

                 
                 
             
          
    
        
                
                
                
                    //TODO ADD BACKWARD COMPATIBILITY FOR hasManyThrough relationship..warning backward compatibility may leads to cyclic error..
                    //Define belongsTo relation method here..
                    private List<Wishlist>  wishlists ;

                    public List<Wishlist> getWishlists() {
                        return wishlists;
                    }

                    public void setWishlists(List<Wishlist> wishlists) {
                        this.wishlists = wishlists;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setWishlists1(List<HashMap<String, Object>> wishlists) {
                        //First create a dummy Repo class object for ..
                        WishlistRepository wishlistsRepository = new WishlistRepository();
                        List<Wishlist> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : wishlists) {
                            //Also add relation to child type for two way communication..
                            Wishlist obj1 = wishlistsRepository.createObject(obj);
                            result.add(obj1);
                        }
                        setWishlist(result);
                    }


                    //Adding relation method..
                    public void addRelation(List<Wishlist> wishlists) {
                        that.setWishlists(wishlists);
                    }

                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__wishlists( String fk,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.findById__wishlists( (String)that.getId(), fk,  new ObjectCallback<Wishlist> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Wishlist object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void destroyById__wishlists( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.destroyById__wishlists( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__wishlists( String fk,  Wishlist data,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.updateById__wishlists( (String)that.getId(), fk, data,  new ObjectCallback<Wishlist> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Wishlist object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void link__wishlists( String fk,  Wishlist data,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.link__wishlists( (String)that.getId(), fk, data,  new ObjectCallback<Wishlist> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Wishlist object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void unlink__wishlists( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.unlink__wishlists( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__wishlists( String fk,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.exists__wishlists( (String)that.getId(), fk,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Boolean object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void get__wishlists( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<Wishlist> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.get__wishlists( (String)that.getId(), filter,  new ListCallback<Wishlist> (){
                                            

                                            


                                            
                                                @Override
                                                public void onSuccess(ArrayList<Wishlist> object) {

                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Disabling two way communication for cyclic error..
                                                    /*for (Wishlist obj : object) {
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
                                    public void create__wishlists( Wishlist data,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.create__wishlists( (String)that.getId(), data,  new ObjectCallback<Wishlist> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Wishlist object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
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
                                    public void delete__wishlists( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.delete__wishlists( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__wishlists( HashMap<String, Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final RecipeRepository  recipeRepo = restAdapter.createRepository(RecipeRepository.class);
                                        


                                        

                                        

                                        recipeRepo.count__wishlists( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                public void onSuccess(Double object) {
                                                    //now add relation to this recipe.
                                                    addRelation(object);
                                                    //Also add relation to child type for two way communication..
                                                    object.addRelation(that);
                                                    callback.onSuccess(object);
                                                }
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                
                    //Define hasAndBelongsToMany..

                 
             
          
      

}
