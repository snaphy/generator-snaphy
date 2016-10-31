package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
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
import com.androidsdk.snaphy.snaphyandroidsdk.list.Util;

import com.strongloop.android.remoting.adapters.Adapter;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



//Replaced by Custom ModelRepository method
//import com.strongloop.android.loopback.ModelRepository;



import org.json.JSONArray;
import org.json.JSONObject;

//Import its models too.
import com.androidsdk.snaphy.snaphyandroidsdk.models.Item;

//Now import model of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Carousel;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CarouselRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Item;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ItemRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.RecentItem;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecentItemRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Bookmark;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BookmarkRepository;
            
        
    





public class ItemRepository extends ModelRepository<Item> {


    public ItemRepository(){
        super("Item", null, Item.class);
    }


    





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/category", "GET"), "Item.prototype.__get__category");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/carousels", "GET"), "Item.prototype.__get__carousels");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/carousels", "POST"), "Item.prototype.__create__carousels");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/carousels", "PUT"), "Item.prototype.__update__carousels");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/carousels", "DELETE"), "Item.prototype.__destroy__carousels");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/bookmarks/:fk", "GET"), "Item.prototype.__findById__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/bookmarks/:fk", "DELETE"), "Item.prototype.__destroyById__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/bookmarks/:fk", "PUT"), "Item.prototype.__updateById__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/recentItems/:fk", "GET"), "Item.prototype.__findById__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/recentItems/:fk", "DELETE"), "Item.prototype.__destroyById__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/recentItems/:fk", "PUT"), "Item.prototype.__updateById__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/bookmarks", "GET"), "Item.prototype.__get__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/bookmarks", "POST"), "Item.prototype.__create__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/bookmarks", "DELETE"), "Item.prototype.__delete__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/bookmarks/count", "GET"), "Item.prototype.__count__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/recentItems", "GET"), "Item.prototype.__get__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/recentItems", "POST"), "Item.prototype.__create__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/recentItems", "DELETE"), "Item.prototype.__delete__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/recentItems/count", "GET"), "Item.prototype.__count__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Item.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Item.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "Item.upsert");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "Item.exists");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "Item.findById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "Item.find");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "Item.findOne");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "Item.updateAll");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "Item.deleteById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "Item.count");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId", "PUT"), "Item.prototype.updateAttributes");
                

            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "Item.getSchema");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "Item.getAbsoluteSchema");
                

            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchInitialSettings", "POST"), "Item.fetchInitialSettings");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchAllCategory", "POST"), "Item.fetchAllCategory");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:itemId/category", "GET"), "Item.prototype.__get__category");
                

            
        
            
        
            
        
            
        
        return contract;
    }


    //override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method get__category definition
            public void get__category(  String itemId,  Boolean refresh, final ObjectCallback<Item> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__category", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ItemRepository itemRepo = getRestAdapter().createRepository(ItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Item item = itemRepo.createObject(result);
                                    callback.onSuccess(item);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__category definition ends here..

            

        
    
        
            //Method get__carousels definition
            public void get__carousels(  String itemId,  Boolean refresh, final ObjectCallback<Carousel> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__carousels", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CarouselRepository carouselRepo = getRestAdapter().createRepository(CarouselRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Carousel carousel = carouselRepo.createObject(result);
                                    callback.onSuccess(carousel);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__carousels definition ends here..

            

        
    
        
            //Method create__carousels definition
            public void create__carousels(  String itemId,  Map<String,  ? extends Object> data, final ObjectCallback<Carousel> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__carousels", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CarouselRepository carouselRepo = getRestAdapter().createRepository(CarouselRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Carousel carousel = carouselRepo.createObject(result);
                                    callback.onSuccess(carousel);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__carousels definition ends here..

            

        
    
        
            //Method update__carousels definition
            public void update__carousels(  String itemId,  Map<String,  ? extends Object> data, final ObjectCallback<Carousel> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__update__carousels", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    CarouselRepository carouselRepo = getRestAdapter().createRepository(CarouselRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Carousel carousel = carouselRepo.createObject(result);
                                    callback.onSuccess(carousel);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method update__carousels definition ends here..

            

        
    
        
            //Method destroy__carousels definition
            public void destroy__carousels(  String itemId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                

                
                    invokeStaticMethod("prototype.__destroy__carousels", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroy__carousels definition ends here..

            

        
    
        
            //Method findById__bookmarks definition
            public void findById__bookmarks(  String itemId,  String fk, final ObjectCallback<Bookmark> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__bookmarks", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    BookmarkRepository bookmarkRepo = getRestAdapter().createRepository(BookmarkRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Bookmark bookmark = bookmarkRepo.createObject(result);
                                    callback.onSuccess(bookmark);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__bookmarks definition ends here..

            

        
    
        
            //Method destroyById__bookmarks definition
            public void destroyById__bookmarks(  String itemId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__bookmarks", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__bookmarks definition ends here..

            

        
    
        
            //Method updateById__bookmarks definition
            public void updateById__bookmarks(  String itemId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<Bookmark> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__bookmarks", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    BookmarkRepository bookmarkRepo = getRestAdapter().createRepository(BookmarkRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Bookmark bookmark = bookmarkRepo.createObject(result);
                                    callback.onSuccess(bookmark);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__bookmarks definition ends here..

            

        
    
        
            //Method findById__recentItems definition
            public void findById__recentItems(  String itemId,  String fk, final ObjectCallback<RecentItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__recentItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    RecentItemRepository recentItemRepo = getRestAdapter().createRepository(RecentItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    RecentItem recentItem = recentItemRepo.createObject(result);
                                    callback.onSuccess(recentItem);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__recentItems definition ends here..

            

        
    
        
            //Method destroyById__recentItems definition
            public void destroyById__recentItems(  String itemId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__recentItems", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__recentItems definition ends here..

            

        
    
        
            //Method updateById__recentItems definition
            public void updateById__recentItems(  String itemId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<RecentItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__recentItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    RecentItemRepository recentItemRepo = getRestAdapter().createRepository(RecentItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    RecentItem recentItem = recentItemRepo.createObject(result);
                                    callback.onSuccess(recentItem);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__recentItems definition ends here..

            

        
    
        
            //Method get__bookmarks definition
            public void get__bookmarks(  String itemId,  Map<String,  ? extends Object> filter, final DataListCallback<Bookmark> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__bookmarks", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<Bookmark> bookmarkList = new DataList<Bookmark>();
                                    BookmarkRepository bookmarkRepo = getRestAdapter().createRepository(BookmarkRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        Bookmark bookmark = bookmarkRepo.createObject(obj);
                                        bookmarkList.add(bookmark);
                                    }
                                    callback.onSuccess(bookmarkList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__bookmarks definition ends here..

            

        
    
        
            //Method create__bookmarks definition
            public void create__bookmarks(  String itemId,  Map<String,  ? extends Object> data, final ObjectCallback<Bookmark> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__bookmarks", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    BookmarkRepository bookmarkRepo = getRestAdapter().createRepository(BookmarkRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Bookmark bookmark = bookmarkRepo.createObject(result);
                                    callback.onSuccess(bookmark);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__bookmarks definition ends here..

            

        
    
        
            //Method delete__bookmarks definition
            public void delete__bookmarks(  String itemId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                

                
                    invokeStaticMethod("prototype.__delete__bookmarks", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__bookmarks definition ends here..

            

        
    
        
            //Method count__bookmarks definition
            public void count__bookmarks(  String itemId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__bookmarks", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__bookmarks definition ends here..

            

        
    
        
            //Method get__recentItems definition
            public void get__recentItems(  String itemId,  Map<String,  ? extends Object> filter, final DataListCallback<RecentItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__recentItems", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<RecentItem> recentItemList = new DataList<RecentItem>();
                                    RecentItemRepository recentItemRepo = getRestAdapter().createRepository(RecentItemRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        RecentItem recentItem = recentItemRepo.createObject(obj);
                                        recentItemList.add(recentItem);
                                    }
                                    callback.onSuccess(recentItemList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__recentItems definition ends here..

            

        
    
        
            //Method create__recentItems definition
            public void create__recentItems(  String itemId,  Map<String,  ? extends Object> data, final ObjectCallback<RecentItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__recentItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    RecentItemRepository recentItemRepo = getRestAdapter().createRepository(RecentItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    RecentItem recentItem = recentItemRepo.createObject(result);
                                    callback.onSuccess(recentItem);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__recentItems definition ends here..

            

        
    
        
            //Method delete__recentItems definition
            public void delete__recentItems(  String itemId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                

                
                    invokeStaticMethod("prototype.__delete__recentItems", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__recentItems definition ends here..

            

        
    
        
            //Method count__recentItems definition
            public void count__recentItems(  String itemId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__recentItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__recentItems definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<Item> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ItemRepository itemRepo = getRestAdapter().createRepository(ItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Item item = itemRepo.createObject(result);
                                    callback.onSuccess(item);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<Item> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ItemRepository itemRepo = getRestAdapter().createRepository(ItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Item item = itemRepo.createObject(result);
                                    callback.onSuccess(item);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method upsert definition ends here..

            

        
    
        
            //Method exists definition
            public void exists(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method exists definition ends here..

            

        
    
        
            //Method findById definition
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<Item> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ItemRepository itemRepo = getRestAdapter().createRepository(ItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Item item = itemRepo.createObject(result);
                                    callback.onSuccess(item);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<Item> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<Item> itemList = new DataList<Item>();
                                    ItemRepository itemRepo = getRestAdapter().createRepository(ItemRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        Item item = itemRepo.createObject(obj);
                                        itemList.add(item);
                                    }
                                    callback.onSuccess(itemList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<Item> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ItemRepository itemRepo = getRestAdapter().createRepository(ItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Item item = itemRepo.createObject(result);
                                    callback.onSuccess(item);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findOne definition ends here..

            

        
    
        
            //Method updateAll definition
            public void updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAll definition ends here..

            

        
    
        
            //Method deleteById definition
            public void deleteById(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method deleteById definition ends here..

            

        
    
        
            //Method count definition
            public void count(  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String itemId,  Map<String,  ? extends Object> data, final ObjectCallback<Item> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("itemId", itemId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.updateAttributes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ItemRepository itemRepo = getRestAdapter().createRepository(ItemRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Item item = itemRepo.createObject(result);
                                    callback.onSuccess(item);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
            //Method getSchema definition
            public void getSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
            //Method getAbsoluteSchema definition
            public void getAbsoluteSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getAbsoluteSchema definition ends here..

            

        
    
        
    
        
            //Method fetchInitialSettings definition
            public void fetchInitialSettings(  double skip,  double limit,  String country,  Boolean trending, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("skip", skip);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("country", country);
                
                        hashMapObject.put("trending", trending);
                

                


                
                    
                    invokeStaticMethod("fetchInitialSettings", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method fetchInitialSettings definition ends here..

            

        
    
        
            //Method fetchAllCategory definition
            public void fetchAllCategory(  double skip,  double limit,  String country, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("skip", skip);
                
                        hashMapObject.put("limit", limit);
                
                        hashMapObject.put("country", country);
                

                


                
                    
                    invokeStaticMethod("fetchAllCategory", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method fetchAllCategory definition ends here..

            

        
    
        
        
    
        
    
        
    



}
