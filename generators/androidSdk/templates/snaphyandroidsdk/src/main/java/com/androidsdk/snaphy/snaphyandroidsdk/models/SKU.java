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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.SKURepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class SKU extends Model {


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

    private SKU that ;

    public SKU (){
        that = this;
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

            
            
        
    
        
            

            
                private String propAKey;
                /* Adding Getter and Setter methods */
                public String getPropAKey(){
                    return propAKey;
                }

                /* Adding Getter and Setter methods */
                public void setPropAKey(String propAKey){
                    this.propAKey = propAKey;
                    //Update hashMap value..
                    hashMap.put("propAKey", propAKey);
                }

            
            
        
    
        
            

            
                private String propAValue;
                /* Adding Getter and Setter methods */
                public String getPropAValue(){
                    return propAValue;
                }

                /* Adding Getter and Setter methods */
                public void setPropAValue(String propAValue){
                    this.propAValue = propAValue;
                    //Update hashMap value..
                    hashMap.put("propAValue", propAValue);
                }

            
            
        
    
        
            

            
                private String propBKey;
                /* Adding Getter and Setter methods */
                public String getPropBKey(){
                    return propBKey;
                }

                /* Adding Getter and Setter methods */
                public void setPropBKey(String propBKey){
                    this.propBKey = propBKey;
                    //Update hashMap value..
                    hashMap.put("propBKey", propBKey);
                }

            
            
        
    
        
            

            
                private double availQuant;
                /* Adding Getter and Setter methods */
                public double getAvailQuant(){
                    return availQuant;
                }

                /* Adding Getter and Setter methods */
                public void setAvailQuant(double availQuant){
                    this.availQuant = availQuant;
                    //Update hashMap value..
                    hashMap.put("availQuant", availQuant);
                }

            
            
        
    
        
            

            
                private String propBValue;
                /* Adding Getter and Setter methods */
                public String getPropBValue(){
                    return propBValue;
                }

                /* Adding Getter and Setter methods */
                public void setPropBValue(String propBValue){
                    this.propBValue = propBValue;
                    //Update hashMap value..
                    hashMap.put("propBValue", propBValue);
                }

            
            
        
    
        
            

            
                private String SKUsName;
                /* Adding Getter and Setter methods */
                public String getSKUsName(){
                    return SKUsName;
                }

                /* Adding Getter and Setter methods */
                public void setSKUsName(String SKUsName){
                    this.SKUsName = SKUsName;
                    //Update hashMap value..
                    hashMap.put("SKUsName", SKUsName);
                }

            
            
        
    
        
            

            
                private double SKUWeight;
                /* Adding Getter and Setter methods */
                public double getSKUWeight(){
                    return SKUWeight;
                }

                /* Adding Getter and Setter methods */
                public void setSKUWeight(double SKUWeight){
                    this.SKUWeight = SKUWeight;
                    //Update hashMap value..
                    hashMap.put("SKUWeight", SKUWeight);
                }

            
            
        
    
        
            

            
                private String SKUColor;
                /* Adding Getter and Setter methods */
                public String getSKUColor(){
                    return SKUColor;
                }

                /* Adding Getter and Setter methods */
                public void setSKUColor(String SKUColor){
                    this.SKUColor = SKUColor;
                    //Update hashMap value..
                    hashMap.put("SKUColor", SKUColor);
                }

            
            
        
    
        
            

            
                private String Category;
                /* Adding Getter and Setter methods */
                public String getCategory(){
                    return Category;
                }

                /* Adding Getter and Setter methods */
                public void setCategory(String Category){
                    this.Category = Category;
                    //Update hashMap value..
                    hashMap.put("Category", Category);
                }

            
            
        
    
        
            

            
                private double pricePerUnit;
                /* Adding Getter and Setter methods */
                public double getPricePerUnit(){
                    return pricePerUnit;
                }

                /* Adding Getter and Setter methods */
                public void setPricePerUnit(double pricePerUnit){
                    this.pricePerUnit = pricePerUnit;
                    //Update hashMap value..
                    hashMap.put("pricePerUnit", pricePerUnit);
                }

            
            
        
    
        
            

            
                private String identifier;
                /* Adding Getter and Setter methods */
                public String getIdentifier(){
                    return identifier;
                }

                /* Adding Getter and Setter methods */
                public void setIdentifier(String identifier){
                    this.identifier = identifier;
                    //Update hashMap value..
                    hashMap.put("identifier", identifier);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      SKURepository lowercaseFirstLetterRepository = (SKURepository) getRepository();
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
      SKURepository lowercaseFirstLetterRepository = (SKURepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      SKURepository lowercaseFirstLetterRepository = (SKURepository) getRepository();
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
                    private transient Product  product ;
                    private String productId;

                    public String getProductId(){
                         return productId;
                    }

                    public void setProductId(Object productId){
                        if(productId != null){
                          this.productId = productId.toString();
                        }
                    }

                    public Product getProduct() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(product == null){
                                        SKURepository sKURepository = (SKURepository) getRepository();

                                        SnaphyRestAdapter restAdapter = sKURepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          product = getProduct__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return product;
                    }

                    public void setProduct(Product product) {
                        this.product = product;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setProduct(Map<String, Object> product) {
                        //First create a dummy Repo class object for customer.
                        ProductRepository productRepository = new ProductRepository();
                        Product product1 = productRepository.createObject(product);
                        setProduct(product1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setProduct(HashMap<String, Object> product) {
                        //First create a dummy Repo class object for customer.
                        ProductRepository productRepository = new ProductRepository();
                        Product product1 = productRepository.createObject(product);
                        setProduct(product1);
                    }

                    //Adding relation method..
                    public void addRelation(Product product) {
                        that.setProduct(product);
                    }


                    //Fetch related data from local database if present a productId identifier as property for belongsTo
                    public Product getProduct__db(SnaphyRestAdapter restAdapter){
                      if(productId != null){
                        ProductRepository productRepository = restAdapter.createRepository(ProductRepository.class);
                            try{
                            SKURepository lowercaseFirstLetterRepository = (SKURepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(productRepository.getDb() == null ){
                                                    productRepository.addStorage(context);
                                                }

                                                if(context != null && productRepository.getDb() != null){
                                                    productRepository.addStorage(context);
                                                    Product product = (Product) productRepository.getDb().get__db(productId);
                                                    return product;
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
                                    public void get__product( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Product> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final SKURepository  sKURepo = restAdapter.createRepository(SKURepository.class);
                                        
                                        
                                        
                                        
                                        



                                        sKURepo.get__product( (String)that.getId(), refresh,  new ObjectCallback<Product> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Product object) {
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
