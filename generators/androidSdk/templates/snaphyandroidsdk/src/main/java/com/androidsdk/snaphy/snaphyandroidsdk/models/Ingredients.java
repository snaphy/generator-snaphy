package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;


import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.adapters.Adapter;

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.IngredientsRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IngredientCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeRepository;
            
                import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeIngredientsRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;



public class Ingredients extends Model {


    private Ingredients that ;

    public Ingredients (){
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

            
            
            

        
    
        
            
            
                private String sellingMetrics;
                /* Adding Getter and Setter methods */
                public String getSellingMetrics(){
                    return sellingMetrics;
                }

                /* Adding Getter and Setter methods */
                public void setSellingMetrics(String sellingMetrics){
                    this.sellingMetrics = sellingMetrics;
                }

            
            
            

        
    
        
            
            
            
                private Double minimumQuantity;
                /* Adding Getter and Setter methods */
                public Double getMinimumQuantity(){
                    return minimumQuantity;
                }

                /* Adding Getter and Setter methods */
                public void setMinimumQuantity(Double minimumQuantity){
                    this.minimumQuantity = minimumQuantity;
                }

            
            

        
    
        
            
            
            
                private Double price;
                /* Adding Getter and Setter methods */
                public Double getPrice(){
                    return price;
                }

                /* Adding Getter and Setter methods */
                public void setPrice(Double price){
                    this.price = price;
                }

            
            

        
    
        
            

                private ArrayList<HashMap<String, Object>> tags;
                /* Adding Getter and Setter methods */
                public ArrayList<HashMap<String, Object>> getTags(){
                    return tags;
                }

                /* Adding Getter and Setter methods */
                public void setTags(ArrayList<HashMap<String, Object>> tags){
                    this.tags = tags;
                }

            
            
            
            

        
    
        
            
            
            
            

        
    
        
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
                
                    //Define belongsTo relation method here..
                    private IngredientCategory  ingredientCategory ;

                    public IngredientCategory getIngredientCategory() {
                        return ingredientCategory;
                    }

                    public void setIngredientCategory(IngredientCategory ingredientCategory) {
                        this.ingredientCategory = ingredientCategory;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setIngredientCategory(HashMap<String, Object> ingredientCategory) {
                        //First create a dummy Repo class object for customer.
                        IngredientCategoryRepository ingredientCategoryRepository = new IngredientCategoryRepository();
                        IngredientCategory ingredientCategory1 = ingredientCategoryRepository.createObject(ingredientCategory);
                        setIngredientCategory(ingredientCategory1);
                    }

                    //Adding relation method..
                    public void addRelation(IngredientCategory ingredientCategory) {
                        that.setIngredientCategory(ingredientCategory);
                    }

                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__ingredientCategory( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<IngredientCategory> callback) {
                                        //Define methods here..
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.get__ingredientCategory( (String)that.getId(), refresh,  new ObjectCallback<IngredientCategory> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(IngredientCategory object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
                
                
                    
                    //Define belongsTo relation method here..
                    private List<Recipe>  recipes ;

                    public List<Recipe> getRecipes() {
                        return recipes;
                    }

                    public void setRecipes(List<Recipe> recipes) {
                        this.recipes = recipes;
                        //Now add backward compatibility for the relation belongsTo for hasMany..
                        for (Recipe obj : recipes) {
                            obj.addRelation(that);
                        }
                    }

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setRecipes1(List<HashMap<String, Object>> recipes) {
                        //First create a dummy Repo class object for ..
                        RecipeRepository recipesRepository = new RecipeRepository();
                        List<Recipe> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : recipes) {
                            //Also add relation to child type for two way communication..
                            Recipe obj1 = recipesRepository.createObject(obj);
                            //Now add backward compatibility for the relation belongsTo for hasMany..
                            obj1.addRelation(that);
                            result.add(obj1);
                        }
                        setRecipe(result);
                    }


                    //Adding relation method..
                    public void addRelation(List<Recipe> recipes) {
                        that.setRecipes(recipes);

                    }

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void findById__recipes( String fk,  RestAdapter restAdapter, final ObjectCallback<Recipe> callback) {
                                        //Define methods here..
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.findById__recipes( (String)that.getId(), fk,  new ObjectCallback<Recipe> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Recipe object) {
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
                                    public void destroyById__recipes( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.destroyById__recipes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.updateById__recipes( (String)that.getId(), fk, data,  new ObjectCallback<Recipe> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Recipe object) {
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
                                    public void link__recipes( String fk,  RecipeIngredients data,  RestAdapter restAdapter, final ObjectCallback<RecipeIngredients> callback) {
                                        //Define methods here..
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.link__recipes( (String)that.getId(), fk, data,  new ObjectCallback<RecipeIngredients> (){
                                            

                                            
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
                                    public void unlink__recipes( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.unlink__recipes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__recipes( String fk,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.exists__recipes( (String)that.getId(), fk,  new Adapter.JsonObjectCallback(){
                                            

                                            
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
                                    public void get__recipes( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<Recipe> callback) {
                                        //Define methods here..
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.get__recipes( (String)that.getId(), filter,  new ListCallback<Recipe> (){
                                            

                                            


                                            
                                                @Override
                                                public void onSuccess(ArrayList<Recipe> object) {

                                                    //now add relation to this recipe.
                                                    addRelation(object);
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
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.create__recipes( (String)that.getId(), data,  new ObjectCallback<Recipe> (){
                                            

                                            
                                                @Override
                                                public void onSuccess(Recipe object) {
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
                                    public void delete__recipes( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.delete__recipes( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final IngredientsRepository  ingredientsRepo = restAdapter.createRepository(IngredientsRepository.class);
                                        


                                        

                                        

                                        ingredientsRepo.count__recipes( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
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

                 
                 
             
          
      

}
