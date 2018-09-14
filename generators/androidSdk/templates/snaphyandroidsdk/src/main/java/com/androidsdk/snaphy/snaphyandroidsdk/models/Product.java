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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ProductSubCategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SubCategoryGroupRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SKURepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ReviewRepository;
            

        
    


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

            
            
        
    
        
            

            
                private Map<String, Object> coverImage;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getCoverImage(){
                    return coverImage;
                }

                /* Adding Getter and Setter methods */
                public void setCoverImage(Map<String, Object> coverImage){
                    this.coverImage = coverImage;
                    //Update Map value..
                    hashMap.put("coverImage", coverImage);
                }

            
            
        
    
        
            

            
                private double inStock;
                /* Adding Getter and Setter methods */
                public double getInStock(){
                    return inStock;
                }

                /* Adding Getter and Setter methods */
                public void setInStock(double inStock){
                    this.inStock = inStock;
                    //Update hashMap value..
                    hashMap.put("inStock", inStock);
                }

            
            
        
    
        
            

            
                private double mrp;
                /* Adding Getter and Setter methods */
                public double getMrp(){
                    return mrp;
                }

                /* Adding Getter and Setter methods */
                public void setMrp(double mrp){
                    this.mrp = mrp;
                    //Update hashMap value..
                    hashMap.put("mrp", mrp);
                }

            
            
        
    
        
            

            
                private double discountedPrice;
                /* Adding Getter and Setter methods */
                public double getDiscountedPrice(){
                    return discountedPrice;
                }

                /* Adding Getter and Setter methods */
                public void setDiscountedPrice(double discountedPrice){
                    this.discountedPrice = discountedPrice;
                    //Update hashMap value..
                    hashMap.put("discountedPrice", discountedPrice);
                }

            
            
        
    
        
            

            
                private double minimumQuantity;
                /* Adding Getter and Setter methods */
                public double getMinimumQuantity(){
                    return minimumQuantity;
                }

                /* Adding Getter and Setter methods */
                public void setMinimumQuantity(double minimumQuantity){
                    this.minimumQuantity = minimumQuantity;
                    //Update hashMap value..
                    hashMap.put("minimumQuantity", minimumQuantity);
                }

            
            
        
    
        
            

            
                private double maximumQuantity;
                /* Adding Getter and Setter methods */
                public double getMaximumQuantity(){
                    return maximumQuantity;
                }

                /* Adding Getter and Setter methods */
                public void setMaximumQuantity(double maximumQuantity){
                    this.maximumQuantity = maximumQuantity;
                    //Update hashMap value..
                    hashMap.put("maximumQuantity", maximumQuantity);
                }

            
            
        
    
        
            

            
                private double minimumQuantityPrice;
                /* Adding Getter and Setter methods */
                public double getMinimumQuantityPrice(){
                    return minimumQuantityPrice;
                }

                /* Adding Getter and Setter methods */
                public void setMinimumQuantityPrice(double minimumQuantityPrice){
                    this.minimumQuantityPrice = minimumQuantityPrice;
                    //Update hashMap value..
                    hashMap.put("minimumQuantityPrice", minimumQuantityPrice);
                }

            
            
        
    
        
            

            
                private double maximumQuantityPrice;
                /* Adding Getter and Setter methods */
                public double getMaximumQuantityPrice(){
                    return maximumQuantityPrice;
                }

                /* Adding Getter and Setter methods */
                public void setMaximumQuantityPrice(double maximumQuantityPrice){
                    this.maximumQuantityPrice = maximumQuantityPrice;
                    //Update hashMap value..
                    hashMap.put("maximumQuantityPrice", maximumQuantityPrice);
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

            
            
        
    
        
            

            
                private double priority;
                /* Adding Getter and Setter methods */
                public double getPriority(){
                    return priority;
                }

                /* Adding Getter and Setter methods */
                public void setPriority(double priority){
                    this.priority = priority;
                    //Update hashMap value..
                    hashMap.put("priority", priority);
                }

            
            
        
    
        
            

            
                private boolean isTrending;
                /* Adding Getter and Setter methods */
                public boolean getIsTrending(){
                    return isTrending;
                }

                /* Adding Getter and Setter methods */
                public void setIsTrending(boolean isTrending){
                    this.isTrending = isTrending;
                    //Update hashMap value..
                    hashMap.put("isTrending", isTrending);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> otherImages;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getOtherImages(){
                    return otherImages;
                }

                /* Adding Getter and Setter methods */
                public void setOtherImages(DataList<Map<String, Object>> otherImages){
                    this.otherImages = otherImages;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("otherImages", otherImages);
                }

            

            
            
        
    
        
            

            
                private double weight;
                /* Adding Getter and Setter methods */
                public double getWeight(){
                    return weight;
                }

                /* Adding Getter and Setter methods */
                public void setWeight(double weight){
                    this.weight = weight;
                    //Update hashMap value..
                    hashMap.put("weight", weight);
                }

            
            
        
    
        
            

            
                private double size;
                /* Adding Getter and Setter methods */
                public double getSize(){
                    return size;
                }

                /* Adding Getter and Setter methods */
                public void setSize(double size){
                    this.size = size;
                    //Update hashMap value..
                    hashMap.put("size", size);
                }

            
            
        
    
        
            

            
                private String offerText;
                /* Adding Getter and Setter methods */
                public String getOfferText(){
                    return offerText;
                }

                /* Adding Getter and Setter methods */
                public void setOfferText(String offerText){
                    this.offerText = offerText;
                    //Update hashMap value..
                    hashMap.put("offerText", offerText);
                }

            
            
        
    
        
            

            
                private Map<String, Object> warehouseLocation;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getWarehouseLocation(){
                    return warehouseLocation;
                }

                /* Adding Getter and Setter methods */
                public void setWarehouseLocation(Map<String, Object> warehouseLocation){
                    this.warehouseLocation = warehouseLocation;
                    //Update Map value..
                    hashMap.put("warehouseLocation", warehouseLocation);
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

            
            
        
    
        
            

            
                private String brandName;
                /* Adding Getter and Setter methods */
                public String getBrandName(){
                    return brandName;
                }

                /* Adding Getter and Setter methods */
                public void setBrandName(String brandName){
                    this.brandName = brandName;
                    //Update hashMap value..
                    hashMap.put("brandName", brandName);
                }

            
            
        
    
        
            

            
                private String categoryName;
                /* Adding Getter and Setter methods */
                public String getCategoryName(){
                    return categoryName;
                }

                /* Adding Getter and Setter methods */
                public void setCategoryName(String categoryName){
                    this.categoryName = categoryName;
                    //Update hashMap value..
                    hashMap.put("categoryName", categoryName);
                }

            
            
        
    
        
            

            
                private String productSubCategoryName;
                /* Adding Getter and Setter methods */
                public String getProductSubCategoryName(){
                    return productSubCategoryName;
                }

                /* Adding Getter and Setter methods */
                public void setProductSubCategoryName(String productSubCategoryName){
                    this.productSubCategoryName = productSubCategoryName;
                    //Update hashMap value..
                    hashMap.put("productSubCategoryName", productSubCategoryName);
                }

            
            
        
    
        
            

            
                private String subCategoryGroupName;
                /* Adding Getter and Setter methods */
                public String getSubCategoryGroupName(){
                    return subCategoryGroupName;
                }

                /* Adding Getter and Setter methods */
                public void setSubCategoryGroupName(String subCategoryGroupName){
                    this.subCategoryGroupName = subCategoryGroupName;
                    //Update hashMap value..
                    hashMap.put("subCategoryGroupName", subCategoryGroupName);
                }

            
            
        
    
        
            

            
                private Map<String, Object> productState;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getProductState(){
                    return productState;
                }

                /* Adding Getter and Setter methods */
                public void setProductState(Map<String, Object> productState){
                    this.productState = productState;
                    //Update Map value..
                    hashMap.put("productState", productState);
                }

            
            
        
    
        
            

            
                private String productReviewList;
                /* Adding Getter and Setter methods */
                public String getProductReviewList(){
                    return productReviewList;
                }

                /* Adding Getter and Setter methods */
                public void setProductReviewList(String productReviewList){
                    this.productReviewList = productReviewList;
                    //Update hashMap value..
                    hashMap.put("productReviewList", productReviewList);
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

            
            
        
    
        
            

            
                private String productDetail;
                /* Adding Getter and Setter methods */
                public String getProductDetail(){
                    return productDetail;
                }

                /* Adding Getter and Setter methods */
                public void setProductDetail(String productDetail){
                    this.productDetail = productDetail;
                    //Update hashMap value..
                    hashMap.put("productDetail", productDetail);
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
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Brand  brand ;
                    private String brandId;

                    public String getBrandId(){
                         return brandId;
                    }

                    public void setBrandId(Object brandId){
                        if(brandId != null){
                          this.brandId = brandId.toString();
                        }
                    }

                    public Brand getBrand() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(brand == null){
                                        ProductRepository productRepository = (ProductRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = productRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          brand = getBrand__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return brand;
                    }

                    public void setBrand(Brand brand) {
                        this.brand = brand;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBrand(Map<String, Object> brand) {
                        //First create a dummy Repo class object for customer.
                        BrandRepository brandRepository = new BrandRepository();
                        Brand brand1 = brandRepository.createObject(brand);
                        setBrand(brand1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBrand(HashMap<String, Object> brand) {
                        //First create a dummy Repo class object for customer.
                        BrandRepository brandRepository = new BrandRepository();
                        Brand brand1 = brandRepository.createObject(brand);
                        setBrand(brand1);
                    }

                    //Adding relation method..
                    public void addRelation(Brand brand) {
                        that.setBrand(brand);
                    }


                    //Fetch related data from local database if present a brandId identifier as property for belongsTo
                    public Brand getBrand__db(SnaphyRestAdapter restAdapter){
                      if(brandId != null){
                        BrandRepository brandRepository = restAdapter.createRepository(BrandRepository.class);
                            try{
                            ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(brandRepository.getDb() == null ){
                                                    brandRepository.addStorage(context);
                                                }

                                                if(context != null && brandRepository.getDb() != null){
                                                    brandRepository.addStorage(context);
                                                    Brand brand = (Brand) brandRepository.getDb().get__db(brandId);
                                                    return brand;
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
                                    public void get__brand( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Brand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__brand( (String)that.getId(), refresh,  new ObjectCallback<Brand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Brand object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Category  category ;
                    private String categoryId;

                    public String getCategoryId(){
                         return categoryId;
                    }

                    public void setCategoryId(Object categoryId){
                        if(categoryId != null){
                          this.categoryId = categoryId.toString();
                        }
                    }

                    public Category getCategory() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(category == null){
                                        ProductRepository productRepository = (ProductRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = productRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          category = getCategory__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return category;
                    }

                    public void setCategory(Category category) {
                        this.category = category;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCategory(Map<String, Object> category) {
                        //First create a dummy Repo class object for customer.
                        CategoryRepository categoryRepository = new CategoryRepository();
                        Category category1 = categoryRepository.createObject(category);
                        setCategory(category1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCategory(HashMap<String, Object> category) {
                        //First create a dummy Repo class object for customer.
                        CategoryRepository categoryRepository = new CategoryRepository();
                        Category category1 = categoryRepository.createObject(category);
                        setCategory(category1);
                    }

                    //Adding relation method..
                    public void addRelation(Category category) {
                        that.setCategory(category);
                    }


                    //Fetch related data from local database if present a categoryId identifier as property for belongsTo
                    public Category getCategory__db(SnaphyRestAdapter restAdapter){
                      if(categoryId != null){
                        CategoryRepository categoryRepository = restAdapter.createRepository(CategoryRepository.class);
                            try{
                            ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(categoryRepository.getDb() == null ){
                                                    categoryRepository.addStorage(context);
                                                }

                                                if(context != null && categoryRepository.getDb() != null){
                                                    categoryRepository.addStorage(context);
                                                    Category category = (Category) categoryRepository.getDb().get__db(categoryId);
                                                    return category;
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
                                    public void get__category( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Category> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__category( (String)that.getId(), refresh,  new ObjectCallback<Category> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Category object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient ProductSubCategory  productSubCategory ;
                    private String productSubCategoryId;

                    public String getProductSubCategoryId(){
                         return productSubCategoryId;
                    }

                    public void setProductSubCategoryId(Object productSubCategoryId){
                        if(productSubCategoryId != null){
                          this.productSubCategoryId = productSubCategoryId.toString();
                        }
                    }

                    public ProductSubCategory getProductSubCategory() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(productSubCategory == null){
                                        ProductRepository productRepository = (ProductRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = productRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          productSubCategory = getProductSubCategory__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return productSubCategory;
                    }

                    public void setProductSubCategory(ProductSubCategory productSubCategory) {
                        this.productSubCategory = productSubCategory;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setProductSubCategory(Map<String, Object> productSubCategory) {
                        //First create a dummy Repo class object for customer.
                        ProductSubCategoryRepository productSubCategoryRepository = new ProductSubCategoryRepository();
                        ProductSubCategory productSubCategory1 = productSubCategoryRepository.createObject(productSubCategory);
                        setProductSubCategory(productSubCategory1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setProductSubCategory(HashMap<String, Object> productSubCategory) {
                        //First create a dummy Repo class object for customer.
                        ProductSubCategoryRepository productSubCategoryRepository = new ProductSubCategoryRepository();
                        ProductSubCategory productSubCategory1 = productSubCategoryRepository.createObject(productSubCategory);
                        setProductSubCategory(productSubCategory1);
                    }

                    //Adding relation method..
                    public void addRelation(ProductSubCategory productSubCategory) {
                        that.setProductSubCategory(productSubCategory);
                    }


                    //Fetch related data from local database if present a productSubCategoryId identifier as property for belongsTo
                    public ProductSubCategory getProductSubCategory__db(SnaphyRestAdapter restAdapter){
                      if(productSubCategoryId != null){
                        ProductSubCategoryRepository productSubCategoryRepository = restAdapter.createRepository(ProductSubCategoryRepository.class);
                            try{
                            ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(productSubCategoryRepository.getDb() == null ){
                                                    productSubCategoryRepository.addStorage(context);
                                                }

                                                if(context != null && productSubCategoryRepository.getDb() != null){
                                                    productSubCategoryRepository.addStorage(context);
                                                    ProductSubCategory productSubCategory = (ProductSubCategory) productSubCategoryRepository.getDb().get__db(productSubCategoryId);
                                                    return productSubCategory;
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
                                    public void get__productSubCategory( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<ProductSubCategory> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__productSubCategory( (String)that.getId(), refresh,  new ObjectCallback<ProductSubCategory> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ProductSubCategory object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient SubCategoryGroup  subCategoryGroup ;
                    private String subCategoryGroupId;

                    public String getSubCategoryGroupId(){
                         return subCategoryGroupId;
                    }

                    public void setSubCategoryGroupId(Object subCategoryGroupId){
                        if(subCategoryGroupId != null){
                          this.subCategoryGroupId = subCategoryGroupId.toString();
                        }
                    }

                    public SubCategoryGroup getSubCategoryGroup() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(subCategoryGroup == null){
                                        ProductRepository productRepository = (ProductRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = productRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          subCategoryGroup = getSubCategoryGroup__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return subCategoryGroup;
                    }

                    public void setSubCategoryGroup(SubCategoryGroup subCategoryGroup) {
                        this.subCategoryGroup = subCategoryGroup;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSubCategoryGroup(Map<String, Object> subCategoryGroup) {
                        //First create a dummy Repo class object for customer.
                        SubCategoryGroupRepository subCategoryGroupRepository = new SubCategoryGroupRepository();
                        SubCategoryGroup subCategoryGroup1 = subCategoryGroupRepository.createObject(subCategoryGroup);
                        setSubCategoryGroup(subCategoryGroup1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSubCategoryGroup(HashMap<String, Object> subCategoryGroup) {
                        //First create a dummy Repo class object for customer.
                        SubCategoryGroupRepository subCategoryGroupRepository = new SubCategoryGroupRepository();
                        SubCategoryGroup subCategoryGroup1 = subCategoryGroupRepository.createObject(subCategoryGroup);
                        setSubCategoryGroup(subCategoryGroup1);
                    }

                    //Adding relation method..
                    public void addRelation(SubCategoryGroup subCategoryGroup) {
                        that.setSubCategoryGroup(subCategoryGroup);
                    }


                    //Fetch related data from local database if present a subCategoryGroupId identifier as property for belongsTo
                    public SubCategoryGroup getSubCategoryGroup__db(SnaphyRestAdapter restAdapter){
                      if(subCategoryGroupId != null){
                        SubCategoryGroupRepository subCategoryGroupRepository = restAdapter.createRepository(SubCategoryGroupRepository.class);
                            try{
                            ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(subCategoryGroupRepository.getDb() == null ){
                                                    subCategoryGroupRepository.addStorage(context);
                                                }

                                                if(context != null && subCategoryGroupRepository.getDb() != null){
                                                    subCategoryGroupRepository.addStorage(context);
                                                    SubCategoryGroup subCategoryGroup = (SubCategoryGroup) subCategoryGroupRepository.getDb().get__db(subCategoryGroupId);
                                                    return subCategoryGroup;
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
                                    public void get__subCategoryGroup( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<SubCategoryGroup> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__subCategoryGroup( (String)that.getId(), refresh,  new ObjectCallback<SubCategoryGroup> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SubCategoryGroup object) {
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<SKU>  sKUs ;

                    public DataList< SKU > getSKUs() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            SKURepository sKURepository = (SKURepository) getRepository();

                            if(that.getId() != null && sKURepository.getDb() != null){

                                 //Fetch locally from db
                                 //sKUs = getSKUs__db(restAdapter);
                                 // Getting single cont
                                 sKUs = sKURepository.getDb().getAll__db("productId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return sKUs;
                    }

                    public void setSKUs(DataList<SKU> sKUs) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: sKUs){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setSKUs1(hashMaps);
                        }else{
                            this.sKUs = sKUs;
                            //TODO: Warning move this to new thread
                            for(SKU data: sKUs){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSKUs1(List<Map<String, Object>> sKUs) {
                        //First create a dummy Repo class object for ..
                        SKURepository sKUsRepository = new SKURepository();
                        List<SKU> result = new ArrayList<>();
                        for (Map<String, Object> obj : sKUs) {
                            //Also add relation to child type for two way communication..
                            SKU obj1 = sKUsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSKUs(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setSKUs1(DataList<HashMap<String, Object>> sKUs) {
                        //First create a dummy Repo class object for ..
                        SKURepository sKUsRepository = new SKURepository();
                        DataList<SKU> result = new DataList<>();
                        for (HashMap<String, Object> obj : sKUs) {
                            //Also add relation to child type for two way communication..
                            SKU obj1 = sKUsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setSKUs(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<SKU> sKUs, SKU dummyClassInstance) {
                        that.setSKUs(sKUs);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(SKU sKUs) {
                        try{
                            try{

                                  //Save to database..
                                  sKUs.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getSKUs().add(sKUs);
                        }catch(Exception e){
                            DataList< SKU> sKUs1 = new DataList();
                            //Now add this item to list..
                            sKUs1.add(sKUs);
                            //Now set data....
                            that.setSKUs(sKUs1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__sKUs( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<SKU> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.findById__sKUs( (String)that.getId(), fk,  new ObjectCallback<SKU> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SKU object) {
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
                                    public void destroyById__sKUs( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.destroyById__sKUs( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__sKUs( String fk,  SKU data,  SnaphyRestAdapter restAdapter, final ObjectCallback<SKU> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        productRepo.updateById__sKUs( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<SKU> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SKU object) {
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
                                    public void get__sKUs( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<SKU> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__sKUs( (String)that.getId(), filter,  new DataListCallback<SKU> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<SKU> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          SKU obj = new SKU();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (SKU obj : object) {
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
                                    public void create__sKUs( SKU data,  SnaphyRestAdapter restAdapter, final ObjectCallback<SKU> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.create__sKUs( (String)that.getId(), data.convertMap(),  new ObjectCallback<SKU> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SKU object) {
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
                                    public void delete__sKUs( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        



                                        productRepo.delete__sKUs( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__sKUs( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.count__sKUs( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Review>  reviews ;

                    public DataList< Review > getReviews() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ReviewRepository reviewRepository = (ReviewRepository) getRepository();

                            if(that.getId() != null && reviewRepository.getDb() != null){

                                 //Fetch locally from db
                                 //reviews = getReviews__db(restAdapter);
                                 // Getting single cont
                                 reviews = reviewRepository.getDb().getAll__db("productId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return reviews;
                    }

                    public void setReviews(DataList<Review> reviews) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: reviews){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setReviews1(hashMaps);
                        }else{
                            this.reviews = reviews;
                            //TODO: Warning move this to new thread
                            for(Review data: reviews){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setReviews1(List<Map<String, Object>> reviews) {
                        //First create a dummy Repo class object for ..
                        ReviewRepository reviewsRepository = new ReviewRepository();
                        List<Review> result = new ArrayList<>();
                        for (Map<String, Object> obj : reviews) {
                            //Also add relation to child type for two way communication..
                            Review obj1 = reviewsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setReviews(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setReviews1(DataList<HashMap<String, Object>> reviews) {
                        //First create a dummy Repo class object for ..
                        ReviewRepository reviewsRepository = new ReviewRepository();
                        DataList<Review> result = new DataList<>();
                        for (HashMap<String, Object> obj : reviews) {
                            //Also add relation to child type for two way communication..
                            Review obj1 = reviewsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setReviews(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Review> reviews, Review dummyClassInstance) {
                        that.setReviews(reviews);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Review reviews) {
                        try{
                            try{

                                  //Save to database..
                                  reviews.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getReviews().add(reviews);
                        }catch(Exception e){
                            DataList< Review> reviews1 = new DataList();
                            //Now add this item to list..
                            reviews1.add(reviews);
                            //Now set data....
                            that.setReviews(reviews1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__reviews( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Review> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.findById__reviews( (String)that.getId(), fk,  new ObjectCallback<Review> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Review object) {
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
                                    public void destroyById__reviews( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.destroyById__reviews( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__reviews( String fk,  Review data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Review> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        productRepo.updateById__reviews( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Review> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Review object) {
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
                                    public void get__reviews( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Review> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__reviews( (String)that.getId(), filter,  new DataListCallback<Review> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Review> object) {
                                                      try{
                                                        if(object != null){
                                                          //now add relation to this recipe.
                                                          Review obj = new Review();
                                                          addRelation(object, obj);
                                                          //Disabling two way communication for cyclic error..
                                                          /*for (Review obj : object) {
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
                                    public void create__reviews( Review data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Review> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.create__reviews( (String)that.getId(), data.convertMap(),  new ObjectCallback<Review> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Review object) {
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
                                    public void delete__reviews( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        



                                        productRepo.delete__reviews( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__reviews( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.count__reviews( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
