package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
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

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SubCategory1Repository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SubCategory2Repository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QrCodeRepository;
            

        
    


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

    
        
            

            
                private String product_number;
                /* Adding Getter and Setter methods */
                public String getProduct_number(){
                    return product_number;
                }

                /* Adding Getter and Setter methods */
                public void setProduct_number(String product_number){
                    this.product_number = product_number;
                    //Update hashMap value..
                    hashMap.put("product_number", product_number);
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

            
            
        
    
        
            

            
                private String product_code;
                /* Adding Getter and Setter methods */
                public String getProduct_code(){
                    return product_code;
                }

                /* Adding Getter and Setter methods */
                public void setProduct_code(String product_code){
                    this.product_code = product_code;
                    //Update hashMap value..
                    hashMap.put("product_code", product_code);
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

            
            
        
    
        
            

            
                private String comments;
                /* Adding Getter and Setter methods */
                public String getComments(){
                    return comments;
                }

                /* Adding Getter and Setter methods */
                public void setComments(String comments){
                    this.comments = comments;
                    //Update hashMap value..
                    hashMap.put("comments", comments);
                }

            
            
        
    
        
            

            
                private double points;
                /* Adding Getter and Setter methods */
                public double getPoints(){
                    return points;
                }

                /* Adding Getter and Setter methods */
                public void setPoints(double points){
                    this.points = points;
                    //Update hashMap value..
                    hashMap.put("points", points);
                }

            
            
        
    
        
            

            
                private Map<String, Object> image;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getImage(){
                    return image;
                }

                /* Adding Getter and Setter methods */
                public void setImage(Map<String, Object> image){
                    this.image = image;
                    //Update Map value..
                    hashMap.put("image", image);
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

                                        RestAdapter restAdapter = productRepository.getRestAdapter();
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
                    public Category getCategory__db(RestAdapter restAdapter){
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
                                    public void get__category( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Category> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__category( (String)that.getId(), refresh,  new ObjectCallback<Category> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Category object) {
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
                    private transient SubCategory1  subCategory1 ;
                    private String subCategory1Id;

                    public String getSubCategory1Id(){
                         return subCategory1Id;
                    }

                    public void setSubCategory1Id(Object subCategory1Id){
                        if(subCategory1Id != null){
                          this.subCategory1Id = subCategory1Id.toString();
                        }
                    }

                    public SubCategory1 getSubCategory1() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(subCategory1 == null){
                                        ProductRepository productRepository = (ProductRepository) getRepository();

                                        RestAdapter restAdapter = productRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          subCategory1 = getSubCategory1__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return subCategory1;
                    }

                    public void setSubCategory1(SubCategory1 subCategory1) {
                        this.subCategory1 = subCategory1;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSubCategory1(Map<String, Object> subCategory1) {
                        //First create a dummy Repo class object for customer.
                        SubCategory1Repository subCategory1Repository = new SubCategory1Repository();
                        SubCategory1 subCategory11 = subCategory1Repository.createObject(subCategory1);
                        setSubCategory1(subCategory11);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSubCategory1(HashMap<String, Object> subCategory1) {
                        //First create a dummy Repo class object for customer.
                        SubCategory1Repository subCategory1Repository = new SubCategory1Repository();
                        SubCategory1 subCategory11 = subCategory1Repository.createObject(subCategory1);
                        setSubCategory1(subCategory11);
                    }

                    //Adding relation method..
                    public void addRelation(SubCategory1 subCategory1) {
                        that.setSubCategory1(subCategory1);
                    }


                    //Fetch related data from local database if present a subCategory1Id identifier as property for belongsTo
                    public SubCategory1 getSubCategory1__db(RestAdapter restAdapter){
                      if(subCategory1Id != null){
                        SubCategory1Repository subCategory1Repository = restAdapter.createRepository(SubCategory1Repository.class);
                            try{
                            ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(subCategory1Repository.getDb() == null ){
                                                    subCategory1Repository.addStorage(context);
                                                }

                                                if(context != null && subCategory1Repository.getDb() != null){
                                                    subCategory1Repository.addStorage(context);
                                                    SubCategory1 subCategory1 = (SubCategory1) subCategory1Repository.getDb().get__db(subCategory1Id);
                                                    return subCategory1;
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
                                    public void get__subCategory1( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<SubCategory1> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__subCategory1( (String)that.getId(), refresh,  new ObjectCallback<SubCategory1> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SubCategory1 object) {
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
                    private transient SubCategory2  subCategory2 ;
                    private String subCategory2Id;

                    public String getSubCategory2Id(){
                         return subCategory2Id;
                    }

                    public void setSubCategory2Id(Object subCategory2Id){
                        if(subCategory2Id != null){
                          this.subCategory2Id = subCategory2Id.toString();
                        }
                    }

                    public SubCategory2 getSubCategory2() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(subCategory2 == null){
                                        ProductRepository productRepository = (ProductRepository) getRepository();

                                        RestAdapter restAdapter = productRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          subCategory2 = getSubCategory2__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return subCategory2;
                    }

                    public void setSubCategory2(SubCategory2 subCategory2) {
                        this.subCategory2 = subCategory2;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSubCategory2(Map<String, Object> subCategory2) {
                        //First create a dummy Repo class object for customer.
                        SubCategory2Repository subCategory2Repository = new SubCategory2Repository();
                        SubCategory2 subCategory21 = subCategory2Repository.createObject(subCategory2);
                        setSubCategory2(subCategory21);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSubCategory2(HashMap<String, Object> subCategory2) {
                        //First create a dummy Repo class object for customer.
                        SubCategory2Repository subCategory2Repository = new SubCategory2Repository();
                        SubCategory2 subCategory21 = subCategory2Repository.createObject(subCategory2);
                        setSubCategory2(subCategory21);
                    }

                    //Adding relation method..
                    public void addRelation(SubCategory2 subCategory2) {
                        that.setSubCategory2(subCategory2);
                    }


                    //Fetch related data from local database if present a subCategory2Id identifier as property for belongsTo
                    public SubCategory2 getSubCategory2__db(RestAdapter restAdapter){
                      if(subCategory2Id != null){
                        SubCategory2Repository subCategory2Repository = restAdapter.createRepository(SubCategory2Repository.class);
                            try{
                            ProductRepository lowercaseFirstLetterRepository = (ProductRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(subCategory2Repository.getDb() == null ){
                                                    subCategory2Repository.addStorage(context);
                                                }

                                                if(context != null && subCategory2Repository.getDb() != null){
                                                    subCategory2Repository.addStorage(context);
                                                    SubCategory2 subCategory2 = (SubCategory2) subCategory2Repository.getDb().get__db(subCategory2Id);
                                                    return subCategory2;
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
                                    public void get__subCategory2( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<SubCategory2> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__subCategory2( (String)that.getId(), refresh,  new ObjectCallback<SubCategory2> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(SubCategory2 object) {
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
                    private transient DataList<QrCode>  qrCodes ;

                    public DataList< QrCode > getQrCodes() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            QrCodeRepository qrCodeRepository = (QrCodeRepository) getRepository();

                            if(that.getId() != null && qrCodeRepository.getDb() != null){

                                 //Fetch locally from db
                                 //qrCodes = getQrCodes__db(restAdapter);
                                 // Getting single cont
                                 qrCodes = qrCodeRepository.getDb().getAll__db("productId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return qrCodes;
                    }

                    public void setQrCodes(DataList<QrCode> qrCodes) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: qrCodes){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setQrCodes1(hashMaps);
                        }else{
                            this.qrCodes = qrCodes;
                            //TODO: Warning move this to new thread
                            for(QrCode data: qrCodes){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQrCodes1(List<Map<String, Object>> qrCodes) {
                        //First create a dummy Repo class object for ..
                        QrCodeRepository qrCodesRepository = new QrCodeRepository();
                        List<QrCode> result = new ArrayList<>();
                        for (Map<String, Object> obj : qrCodes) {
                            //Also add relation to child type for two way communication..
                            QrCode obj1 = qrCodesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQrCodes(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQrCodes1(DataList<HashMap<String, Object>> qrCodes) {
                        //First create a dummy Repo class object for ..
                        QrCodeRepository qrCodesRepository = new QrCodeRepository();
                        DataList<QrCode> result = new DataList<>();
                        for (HashMap<String, Object> obj : qrCodes) {
                            //Also add relation to child type for two way communication..
                            QrCode obj1 = qrCodesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQrCodes(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<QrCode> qrCodes, QrCode dummyClassInstance) {
                        that.setQrCodes(qrCodes);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(QrCode qrCodes) {
                        try{
                            try{

                                  //Save to database..
                                  qrCodes.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getQrCodes().add(qrCodes);
                        }catch(Exception e){
                            DataList< QrCode> qrCodes1 = new DataList();
                            //Now add this item to list..
                            qrCodes1.add(qrCodes);
                            //Now set data....
                            that.setQrCodes(qrCodes1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__qrCodes( String fk,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.findById__qrCodes( (String)that.getId(), fk,  new ObjectCallback<QrCode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCode object) {
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
                                    public void destroyById__qrCodes( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.destroyById__qrCodes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__qrCodes( String fk,  QrCode data,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        productRepo.updateById__qrCodes( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<QrCode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCode object) {
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
                                    public void get__qrCodes( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.get__qrCodes( (String)that.getId(), filter,  new DataListCallback<QrCode> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<QrCode> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            QrCode obj = new QrCode();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (QrCode obj : object) {
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
                                    public void create__qrCodes( QrCode data,  RestAdapter restAdapter, final ObjectCallback<QrCode> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.create__qrCodes( (String)that.getId(), data.convertMap(),  new ObjectCallback<QrCode> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QrCode object) {
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
                                    public void delete__qrCodes( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        



                                        productRepo.delete__qrCodes( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__qrCodes( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ProductRepository  productRepo = restAdapter.createRepository(ProductRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        productRepo.count__qrCodes( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
      

}
