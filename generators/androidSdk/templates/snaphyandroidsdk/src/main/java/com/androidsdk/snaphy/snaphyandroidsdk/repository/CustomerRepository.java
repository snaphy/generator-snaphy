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



//Replaced by Custom  Repo methods
// import com.strongloop.android.loopback.UserRepository;
import com.strongloop.android.loopback.AccessTokenRepository;
import com.strongloop.android.loopback.AccessToken;
import android.content.SharedPreferences;
import android.util.Log;
import org.json.JSONException;
import android.content.Context;



import org.json.JSONArray;
import org.json.JSONObject;

//Import its models too.
import com.androidsdk.snaphy.snaphyandroidsdk.models.Customer;

//Now import model of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.FacebookAccessToken;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FacebookAccessTokenRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Bookmark;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BookmarkRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.RecentItem;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecentItemRepository;
            
        
    





public class CustomerRepository extends UserRepository<Customer> {


    public CustomerRepository(){
        super("Customer", null, Customer.class);
    }


    
    		//Create public methods..
    		public Customer cachedCurrentUser;
            private Object currentUserId;
            private boolean isCurrentUserIdLoaded;
    		public Customer getCachedCurrentUser(){
    			return cachedCurrentUser;
    		}

    		public void setCachedCurrentUser(Customer user){
    			cachedCurrentUser = user;
    		}

    		/* public void setCurrentUserId(Object id){
    			super.setCurrentUserId(id);
    		} */

            public void findCurrentUser(final ObjectCallback<Customer> callback){
                //Call the onBefore method..
                callback.onBefore();

                if(getCurrentUserId() == null){
                    callback.onSuccess(null);
                    return;
                }

                HashMap<String, Object> hashMap = new HashMap<>();

                this.findById((String)getCurrentUserId(), hashMap, new ObjectCallback<Customer>() {
                    @Override
                    public void onSuccess(Customer user){
                        cachedCurrentUser = user;
                        callback.onSuccess(user);
                        //Call the finally method..
                        callback.onFinally();
                    }

                    @Override
                    public void onError(Throwable t){
                        callback.onError(t);
                        //Call the finally method..
                        callback.onFinally();
                    }
                });

            }

            public Object getCurrentUserId(){
                loadCurrentUserIdIfNotLoaded();
                return currentUserId;
            }

            public void setCurrentUserId(Object currentUserId){
                this.currentUserId = currentUserId;
                cachedCurrentUser = null;
                saveCurrentUserId();
            }

            private void saveCurrentUserId(){
                final SharedPreferences.Editor editor = getSharedPreferences().edit();
                final String json = new JSONArray().put(getCurrentUserId()).toString();
                editor.putString(PROPERTY_CURRENT_USER_ID, json);
                editor.commit();
            }


            //Add loadCurrentUserIdIfNotLoaded method..
            private void loadCurrentUserIdIfNotLoaded(){
                if(isCurrentUserIdLoaded) return;

                isCurrentUserIdLoaded = true;
                String json = getSharedPreferences().getString(PROPERTY_CURRENT_USER_ID, null);
                if(json == null){
                    return;
                }

                if(json.equals("[null]")){
                    return;
                }

                try{
                    Object id = new JSONArray(json).get(0);
                    setCurrentUserId(id);
                }catch(JSONException e){
                    String msg = "Cannot parse user id '" + json + "'";
                    Log.e("Snaphy", msg, e);
                }
            }

            private SharedPreferences getSharedPreferences() {
                return getApplicationContext().getSharedPreferences(
                    SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
            }




    





    public RestContract createContract() {
        RestContract contract = super.createContract();
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/accessTokens/:fk", "GET"), "Customer.prototype.__findById__accessTokens");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/accessTokens/:fk", "DELETE"), "Customer.prototype.__destroyById__accessTokens");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/accessTokens/:fk", "PUT"), "Customer.prototype.__updateById__accessTokens");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/facebookAccessToken", "GET"), "Customer.prototype.__get__facebookAccessToken");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/facebookAccessToken", "POST"), "Customer.prototype.__create__facebookAccessToken");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/facebookAccessToken", "PUT"), "Customer.prototype.__update__facebookAccessToken");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/facebookAccessToken", "DELETE"), "Customer.prototype.__destroy__facebookAccessToken");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/bookmarks/:fk", "GET"), "Customer.prototype.__findById__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/bookmarks/:fk", "DELETE"), "Customer.prototype.__destroyById__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/bookmarks/:fk", "PUT"), "Customer.prototype.__updateById__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/recentItems/:fk", "GET"), "Customer.prototype.__findById__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/recentItems/:fk", "DELETE"), "Customer.prototype.__destroyById__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/recentItems/:fk", "PUT"), "Customer.prototype.__updateById__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/accessTokens", "GET"), "Customer.prototype.__get__accessTokens");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/accessTokens", "POST"), "Customer.prototype.__create__accessTokens");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/accessTokens", "DELETE"), "Customer.prototype.__delete__accessTokens");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/accessTokens/count", "GET"), "Customer.prototype.__count__accessTokens");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/bookmarks", "GET"), "Customer.prototype.__get__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/bookmarks", "POST"), "Customer.prototype.__create__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/bookmarks", "DELETE"), "Customer.prototype.__delete__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/bookmarks/count", "GET"), "Customer.prototype.__count__bookmarks");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/recentItems", "GET"), "Customer.prototype.__get__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/recentItems", "POST"), "Customer.prototype.__create__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/recentItems", "DELETE"), "Customer.prototype.__delete__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId/recentItems/count", "GET"), "Customer.prototype.__count__recentItems");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Customer.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "Customer.create");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "Customer.upsert");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "Customer.exists");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "Customer.findById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "Customer.find");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "Customer.findOne");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "Customer.updateAll");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "Customer.deleteById");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "Customer.count");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:customerId", "PUT"), "Customer.prototype.updateAttributes");
                

            
        
            
        
            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/confirm", "GET"), "Customer.confirm");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/reset", "POST"), "Customer.resetPassword");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "Customer.getSchema");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "Customer.getAbsoluteSchema");
                

            
        
            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/loginWithGoogle", "POST"), "Customer.loginWithGoogle");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/loginWithFb", "POST"), "Customer.loginWithFb");
                

            
        
            

                
                    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/loginWithEmail", "POST"), "Customer.loginWithEmail");
                

            
        
            
        
            
        
            
        
        return contract;
    }


    //override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method findById__accessTokens definition
            public void findById__accessTokens(  String customerId,  String fk, final ObjectCallback<AccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__accessTokens", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AccessTokenRepository accessTokenRepo = getRestAdapter().createRepository(AccessTokenRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    AccessToken accessToken = accessTokenRepo.createObject(result);
                                    callback.onSuccess(accessToken);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__accessTokens definition ends here..

            

        
    
        
            //Method destroyById__accessTokens definition
            public void destroyById__accessTokens(  String customerId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__accessTokens", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method destroyById__accessTokens definition ends here..

            

        
    
        
            //Method updateById__accessTokens definition
            public void updateById__accessTokens(  String customerId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<AccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__accessTokens", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AccessTokenRepository accessTokenRepo = getRestAdapter().createRepository(AccessTokenRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    AccessToken accessToken = accessTokenRepo.createObject(result);
                                    callback.onSuccess(accessToken);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__accessTokens definition ends here..

            

        
    
        
            //Method get__facebookAccessToken definition
            public void get__facebookAccessToken(  String customerId,  Boolean refresh, final ObjectCallback<FacebookAccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__facebookAccessToken", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    FacebookAccessTokenRepository facebookAccessTokenRepo = getRestAdapter().createRepository(FacebookAccessTokenRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    FacebookAccessToken facebookAccessToken = facebookAccessTokenRepo.createObject(result);
                                    callback.onSuccess(facebookAccessToken);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__facebookAccessToken definition ends here..

            

        
    
        
            //Method create__facebookAccessToken definition
            public void create__facebookAccessToken(  String customerId,  Map<String,  ? extends Object> data, final ObjectCallback<FacebookAccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__facebookAccessToken", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    FacebookAccessTokenRepository facebookAccessTokenRepo = getRestAdapter().createRepository(FacebookAccessTokenRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    FacebookAccessToken facebookAccessToken = facebookAccessTokenRepo.createObject(result);
                                    callback.onSuccess(facebookAccessToken);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__facebookAccessToken definition ends here..

            

        
    
        
            //Method update__facebookAccessToken definition
            public void update__facebookAccessToken(  String customerId,  Map<String,  ? extends Object> data, final ObjectCallback<FacebookAccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__update__facebookAccessToken", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    FacebookAccessTokenRepository facebookAccessTokenRepo = getRestAdapter().createRepository(FacebookAccessTokenRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    FacebookAccessToken facebookAccessToken = facebookAccessTokenRepo.createObject(result);
                                    callback.onSuccess(facebookAccessToken);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method update__facebookAccessToken definition ends here..

            

        
    
        
            //Method destroy__facebookAccessToken definition
            public void destroy__facebookAccessToken(  String customerId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                

                
                    invokeStaticMethod("prototype.__destroy__facebookAccessToken", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method destroy__facebookAccessToken definition ends here..

            

        
    
        
            //Method findById__bookmarks definition
            public void findById__bookmarks(  String customerId,  String fk, final ObjectCallback<Bookmark> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void destroyById__bookmarks(  String customerId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void updateById__bookmarks(  String customerId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<Bookmark> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void findById__recentItems(  String customerId,  String fk, final ObjectCallback<RecentItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void destroyById__recentItems(  String customerId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void updateById__recentItems(  String customerId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<RecentItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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

            

        
    
        
            //Method get__accessTokens definition
            public void get__accessTokens(  String customerId,  Map<String,  ? extends Object> filter, final DataListCallback<AccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__accessTokens", hashMapObject, new Adapter.JsonArrayCallback() {
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
                                    DataList<AccessToken> accessTokenList = new DataList<AccessToken>();
                                    AccessTokenRepository accessTokenRepo = getRestAdapter().createRepository(AccessTokenRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        AccessToken accessToken = accessTokenRepo.createObject(obj);
                                        accessTokenList.add(accessToken);
                                    }
                                    callback.onSuccess(accessTokenList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__accessTokens definition ends here..

            

        
    
        
            //Method create__accessTokens definition
            public void create__accessTokens(  String customerId,  Map<String,  ? extends Object> data, final ObjectCallback<AccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__accessTokens", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AccessTokenRepository accessTokenRepo = getRestAdapter().createRepository(AccessTokenRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    AccessToken accessToken = accessTokenRepo.createObject(result);
                                    callback.onSuccess(accessToken);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__accessTokens definition ends here..

            

        
    
        
            //Method delete__accessTokens definition
            public void delete__accessTokens(  String customerId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                

                
                    invokeStaticMethod("prototype.__delete__accessTokens", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method delete__accessTokens definition ends here..

            

        
    
        
            //Method count__accessTokens definition
            public void count__accessTokens(  String customerId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__accessTokens", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method count__accessTokens definition ends here..

            

        
    
        
            //Method get__bookmarks definition
            public void get__bookmarks(  String customerId,  Map<String,  ? extends Object> filter, final DataListCallback<Bookmark> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void create__bookmarks(  String customerId,  Map<String,  ? extends Object> data, final ObjectCallback<Bookmark> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void delete__bookmarks(  String customerId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                

                
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
            public void count__bookmarks(  String customerId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void get__recentItems(  String customerId,  Map<String,  ? extends Object> filter, final DataListCallback<RecentItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void create__recentItems(  String customerId,  Map<String,  ? extends Object> data, final ObjectCallback<RecentItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void delete__recentItems(  String customerId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                

                
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
            public void count__recentItems(  String customerId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<Customer> callback){

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
                                    CustomerRepository customerRepo = getRestAdapter().createRepository(CustomerRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Customer customer = customerRepo.createObject(result);
                                    callback.onSuccess(customer);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<Customer> callback){

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
                                    CustomerRepository customerRepo = getRestAdapter().createRepository(CustomerRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Customer customer = customerRepo.createObject(result);
                                    callback.onSuccess(customer);

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
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<Customer> callback){

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
                                    CustomerRepository customerRepo = getRestAdapter().createRepository(CustomerRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Customer customer = customerRepo.createObject(result);
                                    callback.onSuccess(customer);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<Customer> callback){

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
                                    DataList<Customer> customerList = new DataList<Customer>();
                                    CustomerRepository customerRepo = getRestAdapter().createRepository(CustomerRepository.class);

                                    for (Map<String, Object> obj : result) {
                                        Customer customer = customerRepo.createObject(obj);
                                        customerList.add(customer);
                                    }
                                    callback.onSuccess(customerList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<Customer> callback){

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
                                    CustomerRepository customerRepo = getRestAdapter().createRepository(CustomerRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Customer customer = customerRepo.createObject(result);
                                    callback.onSuccess(customer);

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
            public void updateAttributes(  String customerId,  Map<String,  ? extends Object> data, final ObjectCallback<Customer> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("customerId", customerId);
                
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
                                    CustomerRepository customerRepo = getRestAdapter().createRepository(CustomerRepository.class);
                                    Map<String, Object> result = Util.fromJson(response);
                                    Customer customer = customerRepo.createObject(result);
                                    callback.onSuccess(customer);

                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
    
        
    
        
            //Method confirm definition
            public void confirm(  String uid,  String token,  String redirect, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("uid", uid);
                
                        hashMapObject.put("token", token);
                
                        hashMapObject.put("redirect", redirect);
                

                
                    invokeStaticMethod("confirm", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method confirm definition ends here..

            

        
    
        
            //Method resetPassword definition
            public void resetPassword(  Map<String,  ? extends Object> options, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("options", options);
                

                
                    invokeStaticMethod("resetPassword", hashMapObject, new Adapter.Callback() {
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
                


                

                

            }//Method resetPassword definition ends here..

            

        
    
        
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

            

        
    
        
    
        
            //Method loginWithGoogle definition
            public void loginWithGoogle(  String accessToken, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("accessToken", accessToken);
                

                


                
                    
                    invokeStaticMethod("loginWithGoogle", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method loginWithGoogle definition ends here..

            

        
    
        
            //Method loginWithFb definition
            public void loginWithFb(  String external_access_token, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("external_access_token", external_access_token);
                

                


                
                    
                    invokeStaticMethod("loginWithFb", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method loginWithFb definition ends here..

            

        
    
        
            //Method loginWithEmail definition
            public void loginWithEmail(  String email, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();
                

                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("email", email);
                

                


                
                    
                    invokeStaticMethod("loginWithEmail", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
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
                

                

            }//Method loginWithEmail definition ends here..

            

        
    
        
    
        
    
        
    



}
