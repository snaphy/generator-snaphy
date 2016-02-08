package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;


import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.adapters.Adapter;

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.IngredientCategoryRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.IngredientsRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;



public class IngredientCategory extends Model {


    private IngredientCategory that ;

    public IngredientCategory (){
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
                                        final IngredientCategoryRepository  ingredientCategoryRepo = restAdapter.createRepository(IngredientCategoryRepository.class);
                                        


                                        

                                        

                                        ingredientCategoryRepo.findById__ingredients( (String)that.getId(), fk,  new ObjectCallback<Ingredients> (){
                                            

                                            
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
                                        final IngredientCategoryRepository  ingredientCategoryRepo = restAdapter.createRepository(IngredientCategoryRepository.class);
                                        


                                        

                                        

                                        ingredientCategoryRepo.destroyById__ingredients( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final IngredientCategoryRepository  ingredientCategoryRepo = restAdapter.createRepository(IngredientCategoryRepository.class);
                                        


                                        

                                        

                                        ingredientCategoryRepo.updateById__ingredients( (String)that.getId(), fk, data,  new ObjectCallback<Ingredients> (){
                                            

                                            
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
                                    public void get__ingredients( HashMap<String, Object> filter,  RestAdapter restAdapter, final ListCallback<Ingredients> callback) {
                                        //Define methods here..
                                        final IngredientCategoryRepository  ingredientCategoryRepo = restAdapter.createRepository(IngredientCategoryRepository.class);
                                        


                                        

                                        

                                        ingredientCategoryRepo.get__ingredients( (String)that.getId(), filter,  new ListCallback<Ingredients> (){
                                            

                                            


                                            
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
                                        final IngredientCategoryRepository  ingredientCategoryRepo = restAdapter.createRepository(IngredientCategoryRepository.class);
                                        


                                        

                                        

                                        ingredientCategoryRepo.create__ingredients( (String)that.getId(), data,  new ObjectCallback<Ingredients> (){
                                            

                                            
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
                                        final IngredientCategoryRepository  ingredientCategoryRepo = restAdapter.createRepository(IngredientCategoryRepository.class);
                                        


                                        

                                        

                                        ingredientCategoryRepo.delete__ingredients( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final IngredientCategoryRepository  ingredientCategoryRepo = restAdapter.createRepository(IngredientCategoryRepository.class);
                                        


                                        

                                        

                                        ingredientCategoryRepo.count__ingredients( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
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
