package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
import com.strongloop.android.loopback.ModelRepository;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.JsonUtil;
import com.strongloop.android.remoting.adapters.Adapter;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



import com.strongloop.android.loopback.ModelRepository;


import org.json.JSONObject;


//Now import model of related models..

    
        import com.androidsdk.snaphy.snaphyandroidsdk.models.Recipe;

    





public class CuisinesRepository extends ModelRepository<Cuisines> {


    public CuisinesRepository(){
        super("Cuisines", null, Cuisines.class);
    }





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes/:fk", "GET"), "Cuisines.prototype.__findById__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes/:fk", "DELETE"), "Cuisines.prototype.__destroyById__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes/:fk", "PUT"), "Cuisines.prototype.__updateById__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes/rel/:fk", "PUT"), "Cuisines.prototype.__link__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes/rel/:fk", "DELETE"), "Cuisines.prototype.__unlink__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes/rel/:fk", "HEAD"), "Cuisines.prototype.__exists__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes", "GET"), "Cuisines.prototype.__get__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes", "POST"), "Cuisines.prototype.__create__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes", "DELETE"), "Cuisines.prototype.__delete__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/recipes/count", "GET"), "Cuisines.prototype.__count__recipes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Cuisines.create");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Cuisines.create");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "Cuisines.upsert");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "Cuisines.exists");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "Cuisines.findById");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "Cuisines.find");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "Cuisines.findOne");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "Cuisines.updateAll");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DEL"), "Cuisines.deleteById");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "Cuisines.count");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "PUT"), "Cuisines.prototype.updateAttributes");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/change-stream", "POST"), "Cuisines.createChangeStream");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "ALL"), "Cuisines.getSchema");
            
        
            
                contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/save", "ALL"), "Cuisines.save");
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
            
        
        return contract;
    }



    




    
        
            //Method findById__recipes definition
            public void findById__recipes(  String id,  String fk, final ObjectCallback<Recipe> callback){
                


                
                    invokeStaticMethod("prototype.__findById__recipes", ImmutableMap.of("id", id, "fk", fk), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                RecipeRepository recipeRepo = getRestAdapter().createRepository(RecipeRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Recipe recipe = recipeRepo.createObject(result);
                                callback.onSuccess(recipe);
                            
                        }
                    });
                

                

            }//Method findById__recipes definition ends here..

            

        
    
        
            //Method destroyById__recipes definition
            public void destroyById__recipes(  String id,  String fk, final VoidCallback callback){
                
                    invokeStaticMethod("prototype.__destroyById__recipes", ImmutableMap.of("id", id, "fk", fk), new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method destroyById__recipes definition ends here..

            

        
    
        
            //Method updateById__recipes definition
            public void updateById__recipes(  String id,  String fk,  Recipe data, final ObjectCallback<Recipe> callback){
                


                
                    invokeStaticMethod("prototype.__updateById__recipes", ImmutableMap.of("id", id, "fk", fk, "data", data), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                RecipeRepository recipeRepo = getRestAdapter().createRepository(RecipeRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Recipe recipe = recipeRepo.createObject(result);
                                callback.onSuccess(recipe);
                            
                        }
                    });
                

                

            }//Method updateById__recipes definition ends here..

            

        
    
        
            //Method link__recipes definition
            public void link__recipes(  String id,  String fk,  CuisinesRecipe data, final ObjectCallback<CuisinesRecipe> callback){
                


                
                    invokeStaticMethod("prototype.__link__recipes", ImmutableMap.of("id", id, "fk", fk, "data", data), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, CuisinesRecipe> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method link__recipes definition ends here..

            

        
    
        
            //Method unlink__recipes definition
            public void unlink__recipes(  String id,  String fk, final VoidCallback callback){
                
                    invokeStaticMethod("prototype.__unlink__recipes", ImmutableMap.of("id", id, "fk", fk), new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method unlink__recipes definition ends here..

            

        
    
        
            //Method exists__recipes definition
            public void exists__recipes(  String id,  String fk, final ObjectCallback<Boolean> callback){
                


                
                    invokeStaticMethod("prototype.__exists__recipes", ImmutableMap.of("id", id, "fk", fk), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, Boolean> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method exists__recipes definition ends here..

            

        
    
        
            //Method get__recipes definition
            public void get__recipes(  String id,  HashMap<String, Object> filter, final ListCallback<Recipe> callback){
                


                

                
                    invokeStaticMethod("prototype.__get__recipes", ImmutableMap.of("id", id, "filter", filter), new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                RecipeRepository recipeRepo = getRestAdapter().createRepository(RecipeRepository.class);
                                //Now converting jsonObject to list
                                List<Map<String, Object>> result = (List) JsonUtil.fromJson(response);
                                List<Recipe> recipeList = new ArrayList<Recipe>();
                                RecipeRepository recipeRepo = getRestAdapter().createRepository(RecipeRepository.class);

                                for (Map<String, Object> obj : result) {
                                    Recipe recipe = recipeRepo.createObject(obj);
                                    recipeList.add(recipe);
                                }
                                callback.onSuccess(recipeList);
                            
                        }
                    });
                

            }//Method get__recipes definition ends here..

            

        
    
        
            //Method create__recipes definition
            public void create__recipes(  String id,  Recipe data, final ObjectCallback<Recipe> callback){
                


                
                    invokeStaticMethod("prototype.__create__recipes", ImmutableMap.of("id", id, "data", data), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                RecipeRepository recipeRepo = getRestAdapter().createRepository(RecipeRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Recipe recipe = recipeRepo.createObject(result);
                                callback.onSuccess(recipe);
                            
                        }
                    });
                

                

            }//Method create__recipes definition ends here..

            

        
    
        
            //Method delete__recipes definition
            public void delete__recipes(  String id, final VoidCallback callback){
                
                    invokeStaticMethod("prototype.__delete__recipes", ImmutableMap.of("id", id), new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                        }
                    });
                


                

                

            }//Method delete__recipes definition ends here..

            

        
    
        
            //Method count__recipes definition
            public void count__recipes(  String id,  HashMap<String, Object> where, final ObjectCallback<Double> callback){
                


                
                    invokeStaticMethod("prototype.__count__recipes", ImmutableMap.of("id", id, "where", where), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, Double> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method count__recipes definition ends here..

            

        
    
        
            //Method create definition
            public void create(  HashMap<String, Object> data, final ObjectCallback<Cuisines> callback){
                


                
                    invokeStaticMethod("create", ImmutableMap.of("data", data), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                CuisinesRepository cuisinesRepo = getRestAdapter().createRepository(CuisinesRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Cuisines cuisines = cuisinesRepo.createObject(result);
                                callback.onSuccess(cuisines);
                            
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
            //Method createMany definition
            public void createMany(  HashMap<String, Object> data, final ObjectCallback<Cuisines> callback){
                


                
                    invokeStaticMethod("createMany", ImmutableMap.of("data", data), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                CuisinesRepository cuisinesRepo = getRestAdapter().createRepository(CuisinesRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Cuisines cuisines = cuisinesRepo.createObject(result);
                                callback.onSuccess(cuisines);
                            
                        }
                    });
                

                

            }//Method createMany definition ends here..

            

        
    
        
            //Method upsert definition
            public void upsert(  HashMap<String, Object> data, final ObjectCallback<Cuisines> callback){
                


                
                    invokeStaticMethod("upsert", ImmutableMap.of("data", data), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                CuisinesRepository cuisinesRepo = getRestAdapter().createRepository(CuisinesRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Cuisines cuisines = cuisinesRepo.createObject(result);
                                callback.onSuccess(cuisines);
                            
                        }
                    });
                

                

            }//Method upsert definition ends here..

            

        
    
        
            //Method exists definition
            public void exists(  String id, final ObjectCallback<Boolean> callback){
                


                
                    invokeStaticMethod("exists", ImmutableMap.of("id", id), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, Boolean> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method exists definition ends here..

            

        
    
        
            //Method findById definition
            public void findById(  String id,  HashMap<String, Object> filter, final ObjectCallback<Cuisines> callback){
                


                
                    invokeStaticMethod("findById", ImmutableMap.of("id", id, "filter", filter), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                CuisinesRepository cuisinesRepo = getRestAdapter().createRepository(CuisinesRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Cuisines cuisines = cuisinesRepo.createObject(result);
                                callback.onSuccess(cuisines);
                            
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  HashMap<String, Object> filter, final ListCallback<Cuisines> callback){
                


                

                
                    invokeStaticMethod("find", ImmutableMap.of("filter", filter), new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                CuisinesRepository cuisinesRepo = getRestAdapter().createRepository(CuisinesRepository.class);
                                //Now converting jsonObject to list
                                List<Map<String, Object>> result = (List) JsonUtil.fromJson(response);
                                List<Cuisines> cuisinesList = new ArrayList<Cuisines>();
                                CuisinesRepository cuisinesRepo = getRestAdapter().createRepository(CuisinesRepository.class);

                                for (Map<String, Object> obj : result) {
                                    Cuisines cuisines = cuisinesRepo.createObject(obj);
                                    cuisinesList.add(cuisines);
                                }
                                callback.onSuccess(cuisinesList);
                            
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  HashMap<String, Object> filter, final ObjectCallback<Cuisines> callback){
                


                
                    invokeStaticMethod("findOne", ImmutableMap.of("filter", filter), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                CuisinesRepository cuisinesRepo = getRestAdapter().createRepository(CuisinesRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Cuisines cuisines = cuisinesRepo.createObject(result);
                                callback.onSuccess(cuisines);
                            
                        }
                    });
                

                

            }//Method findOne definition ends here..

            

        
    
        
            //Method updateAll definition
            public void updateAll(  HashMap<String, Object> where,  HashMap<String, Object> data, final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("updateAll", ImmutableMap.of("where", where, "data", data), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method updateAll definition ends here..

            

        
    
        
            //Method deleteById definition
            public void deleteById(  String id, final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("deleteById", ImmutableMap.of("id", id), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method deleteById definition ends here..

            

        
    
        
            //Method count definition
            public void count(  HashMap<String, Object> where, final ObjectCallback<Double> callback){
                


                
                    invokeStaticMethod("count", ImmutableMap.of("where", where), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, Double> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method count definition ends here..

            

        
    
        
            //Method prototype.updateAttributes definition
            public void prototype.updateAttributes(  String id,  HashMap<String, Object> data, final ObjectCallback<Cuisines> callback){
                


                
                    invokeStaticMethod("prototype.updateAttributes", ImmutableMap.of("id", id, "data", data), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                CuisinesRepository cuisinesRepo = getRestAdapter().createRepository(CuisinesRepository.class);
                                Map<String, Object> result = JsonUtil.fromJson(response);
                                Cuisines cuisines = cuisinesRepo.createObject(result);
                                callback.onSuccess(cuisines);
                            
                        }
                    });
                

                

            }//Method prototype.updateAttributes definition ends here..

            

        
    
        
    
        
            //Method getSchema definition
            public void getSchema( final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("getSchema", ImmutableMap.of(), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
            //Method save definition
            public void save(  HashMap<String, Object> data,  HashMap<String, Object> schema, final ObjectCallback<HashMap<String, Object>> callback){
                


                
                    invokeStaticMethod("save", ImmutableMap.of("data", data, "schema", schema), new Adapter.JsonObjectCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                //If error happens then change it to Object type..
                                Map<String, HashMap<String, Object>> result = JsonUtil.fromJson(response);
                                callback.onSuccess(result);
                            
                        }
                    });
                

                

            }//Method save definition ends here..

            

        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    



}
