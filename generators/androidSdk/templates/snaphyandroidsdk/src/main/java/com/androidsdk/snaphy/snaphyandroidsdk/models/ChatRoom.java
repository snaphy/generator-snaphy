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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRoomRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CategoryRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QuickMessageRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class ChatRoom extends Model {


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

    private ChatRoom that ;

    public ChatRoom (){
        that = this;
    }

    
        
            

            
                private String roomName;
                /* Adding Getter and Setter methods */
                public String getRoomName(){
                    return roomName;
                }

                /* Adding Getter and Setter methods */
                public void setRoomName(String roomName){
                    this.roomName = roomName;
                    //Update hashMap value..
                    hashMap.put("roomName", roomName);
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

            
            
        
    
        
            

            
                private String title;
                /* Adding Getter and Setter methods */
                public String getTitle(){
                    return title;
                }

                /* Adding Getter and Setter methods */
                public void setTitle(String title){
                    this.title = title;
                    //Update hashMap value..
                    hashMap.put("title", title);
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

            
            
        
    
        
            

            
                private String status;
                /* Adding Getter and Setter methods */
                public String getStatus(){
                    return status;
                }

                /* Adding Getter and Setter methods */
                public void setStatus(String status){
                    this.status = status;
                    //Update hashMap value..
                    hashMap.put("status", status);
                }

            
            
        
    
        
            

            
                private Map<String, Object> startTime;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getStartTime(){
                    return startTime;
                }

                /* Adding Getter and Setter methods */
                public void setStartTime(Map<String, Object> startTime){
                    this.startTime = startTime;
                    //Update Map value..
                    hashMap.put("startTime", startTime);
                }

            
            
        
    
        
            

            
                private String startDate;
                /* Adding Getter and Setter methods */
                public String getStartDate(){
                    return startDate;
                }

                /* Adding Getter and Setter methods */
                public void setStartDate(String startDate){
                    this.startDate = startDate;
                    //Update hashMap value..
                    hashMap.put("startDate", startDate);
                }

            
            
        
    
        
            

            
                private String closingDate;
                /* Adding Getter and Setter methods */
                public String getClosingDate(){
                    return closingDate;
                }

                /* Adding Getter and Setter methods */
                public void setClosingDate(String closingDate){
                    this.closingDate = closingDate;
                    //Update hashMap value..
                    hashMap.put("closingDate", closingDate);
                }

            
            
        
    
        
            

            
                private String matchDate;
                /* Adding Getter and Setter methods */
                public String getMatchDate(){
                    return matchDate;
                }

                /* Adding Getter and Setter methods */
                public void setMatchDate(String matchDate){
                    this.matchDate = matchDate;
                    //Update hashMap value..
                    hashMap.put("matchDate", matchDate);
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

            
            
        
    
        
            

            
                private String uniqueKey;
                /* Adding Getter and Setter methods */
                public String getUniqueKey(){
                    return uniqueKey;
                }

                /* Adding Getter and Setter methods */
                public void setUniqueKey(String uniqueKey){
                    this.uniqueKey = uniqueKey;
                    //Update hashMap value..
                    hashMap.put("uniqueKey", uniqueKey);
                }

            
            
        
    
        
            

            
                private String oriRoomId;
                /* Adding Getter and Setter methods */
                public String getOriRoomId(){
                    return oriRoomId;
                }

                /* Adding Getter and Setter methods */
                public void setOriRoomId(String oriRoomId){
                    this.oriRoomId = oriRoomId;
                    //Update hashMap value..
                    hashMap.put("oriRoomId", oriRoomId);
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ChatRoomRepository lowercaseFirstLetterRepository = (ChatRoomRepository) getRepository();
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
      ChatRoomRepository lowercaseFirstLetterRepository = (ChatRoomRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ChatRoomRepository lowercaseFirstLetterRepository = (ChatRoomRepository) getRepository();
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
                                        ChatRoomRepository chatRoomRepository = (ChatRoomRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = chatRoomRepository.getRestAdapter();
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
                            ChatRoomRepository lowercaseFirstLetterRepository = (ChatRoomRepository) getRepository();
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
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.get__category( (String)that.getId(), refresh,  new ObjectCallback<Category> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<ChatItem>  chatItems ;

                    public DataList< ChatItem > getChatItems() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ChatItemRepository chatItemRepository = (ChatItemRepository) getRepository();

                            if(that.getId() != null && chatItemRepository.getDb() != null){

                                 //Fetch locally from db
                                 //chatItems = getChatItems__db(restAdapter);
                                 // Getting single cont
                                 chatItems = chatItemRepository.getDb().getAll__db("chatRoomId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return chatItems;
                    }

                    public void setChatItems(DataList<ChatItem> chatItems) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: chatItems){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setChatItems1(hashMaps);
                        }else{
                            this.chatItems = chatItems;
                            //TODO: Warning move this to new thread
                            for(ChatItem data: chatItems){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChatItems1(List<Map<String, Object>> chatItems) {
                        //First create a dummy Repo class object for ..
                        ChatItemRepository chatItemsRepository = new ChatItemRepository();
                        List<ChatItem> result = new ArrayList<>();
                        for (Map<String, Object> obj : chatItems) {
                            //Also add relation to child type for two way communication..
                            ChatItem obj1 = chatItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChatItems(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChatItems1(DataList<HashMap<String, Object>> chatItems) {
                        //First create a dummy Repo class object for ..
                        ChatItemRepository chatItemsRepository = new ChatItemRepository();
                        DataList<ChatItem> result = new DataList<>();
                        for (HashMap<String, Object> obj : chatItems) {
                            //Also add relation to child type for two way communication..
                            ChatItem obj1 = chatItemsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChatItems(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<ChatItem> chatItems, ChatItem dummyClassInstance) {
                        that.setChatItems(chatItems);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(ChatItem chatItems) {
                        try{
                            try{

                                  //Save to database..
                                  chatItems.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getChatItems().add(chatItems);
                        }catch(Exception e){
                            DataList< ChatItem> chatItems1 = new DataList();
                            //Now add this item to list..
                            chatItems1.add(chatItems);
                            //Now set data....
                            that.setChatItems(chatItems1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__chatItems( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.findById__chatItems( (String)that.getId(), fk,  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void destroyById__chatItems( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.destroyById__chatItems( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__chatItems( String fk,  ChatItem data,  SnaphyRestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.updateById__chatItems( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void get__chatItems( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.get__chatItems( (String)that.getId(), filter,  new DataListCallback<ChatItem> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<ChatItem> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            ChatItem obj = new ChatItem();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (ChatItem obj : object) {
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
                                    public void create__chatItems( ChatItem data,  SnaphyRestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.create__chatItems( (String)that.getId(), data.convertMap(),  new ObjectCallback<ChatItem> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatItem object) {
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
                                    public void delete__chatItems( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        



                                        chatRoomRepo.delete__chatItems( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__chatItems( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.count__chatItems( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<QuickMessage>  quickMessages ;

                    public DataList< QuickMessage > getQuickMessages() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            QuickMessageRepository quickMessageRepository = (QuickMessageRepository) getRepository();

                            if(that.getId() != null && quickMessageRepository.getDb() != null){

                                 //Fetch locally from db
                                 //quickMessages = getQuickMessages__db(restAdapter);
                                 // Getting single cont
                                 quickMessages = quickMessageRepository.getDb().getAll__db("chatRoomId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return quickMessages;
                    }

                    public void setQuickMessages(DataList<QuickMessage> quickMessages) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: quickMessages){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setQuickMessages1(hashMaps);
                        }else{
                            this.quickMessages = quickMessages;
                            //TODO: Warning move this to new thread
                            for(QuickMessage data: quickMessages){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQuickMessages1(List<Map<String, Object>> quickMessages) {
                        //First create a dummy Repo class object for ..
                        QuickMessageRepository quickMessagesRepository = new QuickMessageRepository();
                        List<QuickMessage> result = new ArrayList<>();
                        for (Map<String, Object> obj : quickMessages) {
                            //Also add relation to child type for two way communication..
                            QuickMessage obj1 = quickMessagesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQuickMessages(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQuickMessages1(DataList<HashMap<String, Object>> quickMessages) {
                        //First create a dummy Repo class object for ..
                        QuickMessageRepository quickMessagesRepository = new QuickMessageRepository();
                        DataList<QuickMessage> result = new DataList<>();
                        for (HashMap<String, Object> obj : quickMessages) {
                            //Also add relation to child type for two way communication..
                            QuickMessage obj1 = quickMessagesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQuickMessages(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<QuickMessage> quickMessages, QuickMessage dummyClassInstance) {
                        that.setQuickMessages(quickMessages);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(QuickMessage quickMessages) {
                        try{
                            try{

                                  //Save to database..
                                  quickMessages.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getQuickMessages().add(quickMessages);
                        }catch(Exception e){
                            DataList< QuickMessage> quickMessages1 = new DataList();
                            //Now add this item to list..
                            quickMessages1.add(quickMessages);
                            //Now set data....
                            that.setQuickMessages(quickMessages1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__quickMessages( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<QuickMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.findById__quickMessages( (String)that.getId(), fk,  new ObjectCallback<QuickMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QuickMessage object) {
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
                                    public void destroyById__quickMessages( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.destroyById__quickMessages( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__quickMessages( String fk,  QuickMessage data,  SnaphyRestAdapter restAdapter, final ObjectCallback<QuickMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.updateById__quickMessages( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<QuickMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QuickMessage object) {
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
                                    public void get__quickMessages( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<QuickMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.get__quickMessages( (String)that.getId(), filter,  new DataListCallback<QuickMessage> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<QuickMessage> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            QuickMessage obj = new QuickMessage();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (QuickMessage obj : object) {
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
                                    public void create__quickMessages( QuickMessage data,  SnaphyRestAdapter restAdapter, final ObjectCallback<QuickMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.create__quickMessages( (String)that.getId(), data.convertMap(),  new ObjectCallback<QuickMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(QuickMessage object) {
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
                                    public void delete__quickMessages( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        



                                        chatRoomRepo.delete__quickMessages( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__quickMessages( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatRoomRepository  chatRoomRepo = restAdapter.createRepository(ChatRoomRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatRoomRepo.count__quickMessages( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
