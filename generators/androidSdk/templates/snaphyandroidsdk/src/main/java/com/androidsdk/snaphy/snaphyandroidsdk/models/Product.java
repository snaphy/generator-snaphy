package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;
import android.util.Log;
import java.util.List;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;
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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CityRepository;
            
                import com.androidsdk.snaphy.snaphyandroidsdk.models.ProductCityPrice;
                import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductCityPriceRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Product extends Model {


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

    private Product that ;

    public Product (){
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
                    //Update hashMap value..
                    hashMap.put("name", name);
                }

            
            
        
    
        
            

            
                private String shortName;
                /* Adding Getter and Setter methods */
                public String getShortName(){
                    return shortName;
                }

                /* Adding Getter and Setter methods */
                public void setShortName(String shortName){
                    this.shortName = shortName;
                    //Update hashMap value..
                    hashMap.put("shortName", shortName);
                }

            
            
        
    
        
            

            
                private double gms;
                /* Adding Getter and Setter methods */
                public double getGms(){
                    return gms;
                }

                /* Adding Getter and Setter methods */
                public void setGms(double gms){
                    this.gms = gms;
                    //Update hashMap value..
                    hashMap.put("gms", gms);
                }

            
            
        
    
        
            

            
                private double price;
                /* Adding Getter and Setter methods */
                public double getPrice(){
                    return price;
                }

                /* Adding Getter and Setter methods */
                public void setPrice(double price){
                    this.price = price;
                    //Update hashMap value..
                    hashMap.put("price", price);
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

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();
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
      ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();
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
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<City>  cities ;

                    public DataList< City > getCities() {
                        //Check for pure case of hasMany
                                                return cities;
                    }

                    public void setCities(DataList<City> cities) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: cities){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setCities1(hashMaps);
                        }else{
                            this.cities = cities;
                            //TODO: Warning move this to new thread
                            for(City data: cities){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCities1(List<Map<String, Object>> cities) {
                        //First create a dummy Repo class object for ..
                        CityRepository citiesRepository = new CityRepository();
                        List<City> result = new ArrayList<>();
                        for (Map<String, Object> obj : cities) {
                            //Also add relation to child type for two way communication..
                            City obj1 = citiesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCities(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCities1(DataList<HashMap<String, Object>> cities) {
                        //First create a dummy Repo class object for ..
                        CityRepository citiesRepository = new CityRepository();
                        DataList<City> result = new DataList<>();
                        for (HashMap<String, Object> obj : cities) {
                            //Also add relation to child type for two way communication..
                            City obj1 = citiesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCities(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<City> cities, City dummyClassInstance) {
                        that.setCities(cities);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(City cities) {
                        try{
                            try{

                                  //Save to database..
                                  cities.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getCities().add(cities);
                        }catch(Exception e){
                            DataList< City> cities1 = new DataList();
                            //Now add this item to list..
                            cities1.add(cities);
                            //Now set data....
                            that.setCities(cities1);
                        }
                    }




                    
                        //Write hasManyThrough def too..
                        private transient DataList<ProductCityPrice>  productCityPrice ;

                        public DataList<ProductCityPrice> getProductCityPrice() {
                            return productCityPrice;
                        }

                        public void setProductCityPrice(DataList<ProductCityPrice> productCityPrice) {
                            this.productCityPrice = productCityPrice;

                        }

                        //Adding throughRelation method..
                        //Add a dummy class Name object to seperate data..
                        public void addRelation(DataList<ProductCityPrice> productCityPrice, ProductCityPrice dummyClassInstance) {
                            that.setProductCityPrice(productCityPrice);

                        }

                        //Adding throughRelation method..
                        //This will add a new data to the list throughRelation object..
                        public void addRelation(ProductCityPrice productCityPrice) {
                            try{
                                that.getProductCityPrice().add(productCityPrice);
                            }catch(Exception e){
                                DataList< ProductCityPrice> productCityPrice1 = new DataList();
                                //Now add this item to list..
                                productCityPrice1.add(productCityPrice);
                                //Now set data....
                                that.setProductCityPrice(productCityPrice1);
                            }
                        }


                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__cities( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<City> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.findById__cities( (String)that.getId(), fk,  new ObjectCallback<City> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(City object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void destroyById__cities( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.destroyById__cities( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__cities( String fk,  City data,  SnaphyRestAdapter restAdapter, final ObjectCallback<City> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        productRepo.updateById__cities( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<City> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(City object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void link__cities( String fk,  ProductCityPrice data,  SnaphyRestAdapter restAdapter, final ObjectCallback<ProductCityPrice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        productRepo.link__cities( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ProductCityPrice> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ProductCityPrice object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void unlink__cities( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.unlink__cities( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__cities( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.exists__cities( (String)that.getId(), fk,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                      try{
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void get__cities( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<City> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__cities( (String)that.getId(), filter,  new DataListCallback<City> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<City> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          City obj = new City();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (City obj : object) {
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void create__cities( City data,  SnaphyRestAdapter restAdapter, final ObjectCallback<City> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.create__cities( (String)that.getId(), data.convertMap(),  new ObjectCallback<City> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(City object) {
                                                      try{
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
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                    public void delete__cities( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        



                                        productRepo.delete__cities( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__cities( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.count__cities( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                      try{
                                                        callback.onSuccess(object);
                                                        //Calling the finally..callback
                                                        callback.onFinally();
                                                      }catch(Exception e){
                                                        Log.e("Snaphy", e.toString());
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
      

}
