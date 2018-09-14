package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductStateRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class ProductState extends Model {


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

    private ProductState that ;

    public ProductState (){
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

            
            
        
    
        
            

            
            
        
    
        
            

            
                private double oneStar;
                /* Adding Getter and Setter methods */
                public double getOneStar(){
                    return oneStar;
                }

                /* Adding Getter and Setter methods */
                public void setOneStar(double oneStar){
                    this.oneStar = oneStar;
                    //Update hashMap value..
                    hashMap.put("oneStar", oneStar);
                }

            
            
        
    
        
            

            
                private double twoStar;
                /* Adding Getter and Setter methods */
                public double getTwoStar(){
                    return twoStar;
                }

                /* Adding Getter and Setter methods */
                public void setTwoStar(double twoStar){
                    this.twoStar = twoStar;
                    //Update hashMap value..
                    hashMap.put("twoStar", twoStar);
                }

            
            
        
    
        
            

            
                private double threeStar;
                /* Adding Getter and Setter methods */
                public double getThreeStar(){
                    return threeStar;
                }

                /* Adding Getter and Setter methods */
                public void setThreeStar(double threeStar){
                    this.threeStar = threeStar;
                    //Update hashMap value..
                    hashMap.put("threeStar", threeStar);
                }

            
            
        
    
        
            

            
                private double fourStar;
                /* Adding Getter and Setter methods */
                public double getFourStar(){
                    return fourStar;
                }

                /* Adding Getter and Setter methods */
                public void setFourStar(double fourStar){
                    this.fourStar = fourStar;
                    //Update hashMap value..
                    hashMap.put("fourStar", fourStar);
                }

            
            
        
    
        
            

            
                private double fiveStar;
                /* Adding Getter and Setter methods */
                public double getFiveStar(){
                    return fiveStar;
                }

                /* Adding Getter and Setter methods */
                public void setFiveStar(double fiveStar){
                    this.fiveStar = fiveStar;
                    //Update hashMap value..
                    hashMap.put("fiveStar", fiveStar);
                }

            
            
        
    
        
            

            
                private double totalOrder;
                /* Adding Getter and Setter methods */
                public double getTotalOrder(){
                    return totalOrder;
                }

                /* Adding Getter and Setter methods */
                public void setTotalOrder(double totalOrder){
                    this.totalOrder = totalOrder;
                    //Update hashMap value..
                    hashMap.put("totalOrder", totalOrder);
                }

            
            
        
    
        
            

            
                private double totalRecommonded;
                /* Adding Getter and Setter methods */
                public double getTotalRecommonded(){
                    return totalRecommonded;
                }

                /* Adding Getter and Setter methods */
                public void setTotalRecommonded(double totalRecommonded){
                    this.totalRecommonded = totalRecommonded;
                    //Update hashMap value..
                    hashMap.put("totalRecommonded", totalRecommonded);
                }

            
            
        
    
        
            

            
                private double totalReview;
                /* Adding Getter and Setter methods */
                public double getTotalReview(){
                    return totalReview;
                }

                /* Adding Getter and Setter methods */
                public void setTotalReview(double totalReview){
                    this.totalReview = totalReview;
                    //Update hashMap value..
                    hashMap.put("totalReview", totalReview);
                }

            
            
        
    
        
            

            
                private double totalRatingAvg;
                /* Adding Getter and Setter methods */
                public double getTotalRatingAvg(){
                    return totalRatingAvg;
                }

                /* Adding Getter and Setter methods */
                public void setTotalRatingAvg(double totalRatingAvg){
                    this.totalRatingAvg = totalRatingAvg;
                    //Update hashMap value..
                    hashMap.put("totalRatingAvg", totalRatingAvg);
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

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ProductStateRepository lowercaseFirstLetterRepository = (ProductStateRepository) getRepository();
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
      ProductStateRepository lowercaseFirstLetterRepository = (ProductStateRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ProductStateRepository lowercaseFirstLetterRepository = (ProductStateRepository) getRepository();
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
                                        ProductStateRepository productStateRepository = (ProductStateRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = productStateRepository.getRestAdapter();
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
                            ProductStateRepository lowercaseFirstLetterRepository = (ProductStateRepository) getRepository();
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
                                        final ProductStateRepository  productStateRepo = restAdapter.createRepository(ProductStateRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productStateRepo.get__product( (String)that.getId(), refresh,  new ObjectCallback<Product> (){
                                            

                                            
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
