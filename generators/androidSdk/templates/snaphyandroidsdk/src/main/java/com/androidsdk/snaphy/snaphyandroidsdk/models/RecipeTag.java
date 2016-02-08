package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;


import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.adapters.Adapter;

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeTagRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;



public class RecipeTag extends Model {


    private RecipeTag that ;

    public RecipeTag (){
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

            
            
            

        
    
        
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
                
                
                
                    //TODO ADD BACKWARD COMPATIBILITY FOR hasManyThrough relationship..warning backward compatibility may leads to cyclic error..
                    //Define belongsTo relation method here..
                    private List<Recipe>  recipes ;

                    public List<Recipe> getRecipes() {
                        return recipes;
                    }

                    public void setRecipes(List<Recipe> recipes) {
                        this.recipes = recipes;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRecipes1(List<HashMap<String, Object>> recipes) {
                        //First create a dummy Repo class object for ..
                        RecipeRepository recipesRepository = new RecipeRepository();
                        List<Recipe> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : recipes) {
                            //Also add relation to child type for two way communication..
                            Recipe obj1 = recipesRepository.createObject(obj);
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
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.findById__recipes( (String)that.getId(), fk,  new ObjectCallback<Recipe> (){
                                            

                                            
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
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.destroyById__recipes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.updateById__recipes( (String)that.getId(), fk, data,  new ObjectCallback<Recipe> (){
                                            

                                            
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
                                    public void link__recipes( String fk,  Recipe data,  RestAdapter restAdapter, final ObjectCallback<Recipe> callback) {
                                        //Define methods here..
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.link__recipes( (String)that.getId(), fk, data,  new ObjectCallback<Recipe> (){
                                            

                                            
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
                                    public void unlink__recipes( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.unlink__recipes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.exists__recipes( (String)that.getId(), fk,  new Adapter.JsonObjectCallback(){
                                            

                                            
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
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.get__recipes( (String)that.getId(), filter,  new ListCallback<Recipe> (){
                                            

                                            


                                            
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
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.create__recipes( (String)that.getId(), data,  new ObjectCallback<Recipe> (){
                                            

                                            
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
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.delete__recipes( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final RecipeTagRepository  recipeTagRepo = restAdapter.createRepository(RecipeTagRepository.class);
                                        


                                        

                                        

                                        recipeTagRepo.count__recipes( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
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
