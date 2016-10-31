package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.remoting.adapters.Adapter;

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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ItemRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CarouselRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ItemRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecentItemRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BookmarkRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Item extends Model {


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

    private Item that ;

    public Item (){
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

            
            
            
            

            

        
    
        
            

            
                private String type;
                /* Adding Getter and Setter methods */
                public String getType(){
                    return type;
                }

                /* Adding Getter and Setter methods */
                public void setType(String type){
                    this.type = type;
                    //Update hashMap value..
                    hashMap.put("type", type);
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

            
            
            

            

        
    
        
            

            
            
            
                private Map<String, Object> icon;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getIcon(){
                    return icon;
                }

                /* Adding Getter and Setter methods */
                public void setIcon(Map<String, Object> icon){
                    this.icon = icon;
                    //Update Map value..
                    hashMap.put("icon", icon);
                }

            
            

            

        
    
        
            

            
                private String trending;
                /* Adding Getter and Setter methods */
                public String getTrending(){
                    return trending;
                }

                /* Adding Getter and Setter methods */
                public void setTrending(String trending){
                    this.trending = trending;
                    //Update hashMap value..
                    hashMap.put("trending", trending);
                }

            
            
            
            

            

        
    
        
            

            
                private String url;
                /* Adding Getter and Setter methods */
                public String getUrl(){
                    return url;
                }

                /* Adding Getter and Setter methods */
                public void setUrl(String url){
                    this.url = url;
                    //Update hashMap value..
                    hashMap.put("url", url);
                }

            
            
            
            

            

        
    
        
            

            
                private String transactionUrl;
                /* Adding Getter and Setter methods */
                public String getTransactionUrl(){
                    return transactionUrl;
                }

                /* Adding Getter and Setter methods */
                public void setTransactionUrl(String transactionUrl){
                    this.transactionUrl = transactionUrl;
                    //Update hashMap value..
                    hashMap.put("transactionUrl", transactionUrl);
                }

            
            
            
            

            

        
    
        
            

            
                private String convertAffiliated;
                /* Adding Getter and Setter methods */
                public String getConvertAffiliated(){
                    return convertAffiliated;
                }

                /* Adding Getter and Setter methods */
                public void setConvertAffiliated(String convertAffiliated){
                    this.convertAffiliated = convertAffiliated;
                    //Update hashMap value..
                    hashMap.put("convertAffiliated", convertAffiliated);
                }

            
            
            
            

            

        
    
        
            

            
                private String country;
                /* Adding Getter and Setter methods */
                public String getCountry(){
                    return country;
                }

                /* Adding Getter and Setter methods */
                public void setCountry(String country){
                    this.country = country;
                    //Update hashMap value..
                    hashMap.put("country", country);
                }

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    


    



    //Now adding relations between related models
    
        
                
                    //Define belongsTo relation method here..
                    private transient Carousel  carousels ;

                    public Carousel getCarousels() {
                        return carousels;
                    }

                    public void setCarousels(Carousel carousels) {
                        this.carousels = carousels;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCarousels(Map<String, Object> carousels) {
                        //First create a dummy Repo class object for customer.
                        CarouselRepository carouselsRepository = new CarouselRepository();
                        Carousel carousels1 = carouselsRepository.createObject(carousels);
                        setCarousels(carousels1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCarousels(HashMap<String, Object> carousels) {
                        //First create a dummy Repo class object for customer.
                        CarouselRepository carouselsRepository = new CarouselRepository();
                        Carousel carousels1 = carouselsRepository.createObject(carousels);
                        setCarousels(carousels1);
                    }

                    //Adding relation method..
                    public void addRelation(Carousel carousels) {
                        that.setCarousels(carousels);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void get__carousels( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Carousel> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.get__carousels( (String)that.getId(), refresh,  new ObjectCallback<Carousel> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Carousel object) {
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
                                    public void create__carousels( Carousel data,  RestAdapter restAdapter, final ObjectCallback<Carousel> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.create__carousels( (String)that.getId(), data.convertMap(),  new ObjectCallback<Carousel> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Carousel object) {
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
                                    public void update__carousels( Carousel data,  RestAdapter restAdapter, final ObjectCallback<Carousel> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.update__carousels( (String)that.getId(), data.convertMap(),  new ObjectCallback<Carousel> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Carousel object) {
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
                                    public void destroy__carousels( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        



                                        itemRepo.destroy__carousels( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
                
                    //Define belongsTo relation method here..
                    private transient Item  category ;

                    public Item getCategory() {
                        return category;
                    }

                    public void setCategory(Item category) {
                        this.category = category;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCategory(Map<String, Object> category) {
                        //First create a dummy Repo class object for customer.
                        ItemRepository categoryRepository = new ItemRepository();
                        Item category1 = categoryRepository.createObject(category);
                        setCategory(category1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCategory(HashMap<String, Object> category) {
                        //First create a dummy Repo class object for customer.
                        ItemRepository categoryRepository = new ItemRepository();
                        Item category1 = categoryRepository.createObject(category);
                        setCategory(category1);
                    }

                    //Adding relation method..
                    public void addRelation(Item category) {
                        that.setCategory(category);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__category( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Item> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.get__category( (String)that.getId(), refresh,  new ObjectCallback<Item> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Item object) {
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
                    private transient DataList<RecentItem>  recentItems ;

                    public DataList<RecentItem> getRecentItems() {
                        return recentItems;
                    }

                    public void setRecentItems(DataList<RecentItem> recentItems) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: recentItems){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }else if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setRecentItems1(hashMaps);
                        }else{
                            this.recentItems = recentItems;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setRecentItems1(List<Map<String, Object>> recentItems) {
                        //First create a dummy Repo class object for ..
                        RecentItemRepository recentItemsRepository = new RecentItemRepository();
                        List<RecentItem> result = new ArrayList<>();
                        for (Map<String, Object> obj : recentItems) {
                            //Also add relation to child type for two way communication..
                            RecentItem obj1 = recentItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setRecentItems(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setRecentItems1(DataList<HashMap<String, Object>> recentItems) {
                        //First create a dummy Repo class object for ..
                        RecentItemRepository recentItemsRepository = new RecentItemRepository();
                        DataList<RecentItem> result = new DataList<>();
                        for (HashMap<String, Object> obj : recentItems) {
                            //Also add relation to child type for two way communication..
                            RecentItem obj1 = recentItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setRecentItems(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<RecentItem> recentItems, RecentItem dummyClassInstance) {
                        that.setRecentItems(recentItems);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(RecentItem recentItems) {
                        try{
                            that.getRecentItems().add(recentItems);
                        }catch(Exception e){
                            DataList< RecentItem> recentItems1 = new DataList();
                            //Now add this item to list..
                            recentItems1.add(recentItems);
                            //Now set data....
                            that.setRecentItems(recentItems1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__recentItems( String fk,  RestAdapter restAdapter, final ObjectCallback<RecentItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.findById__recentItems( (String)that.getId(), fk,  new ObjectCallback<RecentItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(RecentItem object) {
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
                                    public void destroyById__recentItems( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.destroyById__recentItems( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__recentItems( String fk,  RecentItem data,  RestAdapter restAdapter, final ObjectCallback<RecentItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.updateById__recentItems( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<RecentItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(RecentItem object) {
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
                                    public void get__recentItems( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<RecentItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.get__recentItems( (String)that.getId(), filter,  new DataListCallback<RecentItem> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<RecentItem> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            RecentItem obj = new RecentItem();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (RecentItem obj : object) {
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
                                    public void create__recentItems( RecentItem data,  RestAdapter restAdapter, final ObjectCallback<RecentItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.create__recentItems( (String)that.getId(), data.convertMap(),  new ObjectCallback<RecentItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(RecentItem object) {
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
                                    public void delete__recentItems( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        



                                        itemRepo.delete__recentItems( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__recentItems( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.count__recentItems( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
                
                
                    
                    //Define hasMany relation method here..
                    private transient DataList<Bookmark>  bookmarks ;

                    public DataList<Bookmark> getBookmarks() {
                        return bookmarks;
                    }

                    public void setBookmarks(DataList<Bookmark> bookmarks) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: bookmarks){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }else if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setBookmarks1(hashMaps);
                        }else{
                            this.bookmarks = bookmarks;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBookmarks1(List<Map<String, Object>> bookmarks) {
                        //First create a dummy Repo class object for ..
                        BookmarkRepository bookmarksRepository = new BookmarkRepository();
                        List<Bookmark> result = new ArrayList<>();
                        for (Map<String, Object> obj : bookmarks) {
                            //Also add relation to child type for two way communication..
                            Bookmark obj1 = bookmarksRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBookmarks(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBookmarks1(DataList<HashMap<String, Object>> bookmarks) {
                        //First create a dummy Repo class object for ..
                        BookmarkRepository bookmarksRepository = new BookmarkRepository();
                        DataList<Bookmark> result = new DataList<>();
                        for (HashMap<String, Object> obj : bookmarks) {
                            //Also add relation to child type for two way communication..
                            Bookmark obj1 = bookmarksRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBookmarks(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Bookmark> bookmarks, Bookmark dummyClassInstance) {
                        that.setBookmarks(bookmarks);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Bookmark bookmarks) {
                        try{
                            that.getBookmarks().add(bookmarks);
                        }catch(Exception e){
                            DataList< Bookmark> bookmarks1 = new DataList();
                            //Now add this item to list..
                            bookmarks1.add(bookmarks);
                            //Now set data....
                            that.setBookmarks(bookmarks1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__bookmarks( String fk,  RestAdapter restAdapter, final ObjectCallback<Bookmark> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.findById__bookmarks( (String)that.getId(), fk,  new ObjectCallback<Bookmark> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bookmark object) {
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
                                    public void destroyById__bookmarks( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.destroyById__bookmarks( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__bookmarks( String fk,  Bookmark data,  RestAdapter restAdapter, final ObjectCallback<Bookmark> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.updateById__bookmarks( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Bookmark> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bookmark object) {
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
                                    public void get__bookmarks( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Bookmark> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.get__bookmarks( (String)that.getId(), filter,  new DataListCallback<Bookmark> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Bookmark> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Bookmark obj = new Bookmark();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Bookmark obj : object) {
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
                                    public void create__bookmarks( Bookmark data,  RestAdapter restAdapter, final ObjectCallback<Bookmark> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.create__bookmarks( (String)that.getId(), data.convertMap(),  new ObjectCallback<Bookmark> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Bookmark object) {
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
                                    public void delete__bookmarks( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        



                                        itemRepo.delete__bookmarks( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__bookmarks( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ItemRepository  itemRepo = restAdapter.createRepository(ItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        itemRepo.count__bookmarks( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
