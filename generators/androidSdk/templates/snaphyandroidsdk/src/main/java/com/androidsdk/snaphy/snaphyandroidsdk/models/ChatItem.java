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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRoomRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class ChatItem extends Model {


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

    private ChatItem that ;

    public ChatItem (){
        that = this;
    }

    
        
            

            
                private String username;
                /* Adding Getter and Setter methods */
                public String getUsername(){
                    return username;
                }

                /* Adding Getter and Setter methods */
                public void setUsername(String username){
                    this.username = username;
                    //Update hashMap value..
                    hashMap.put("username", username);
                }

            
            
        
    
        
            

            
                private Map<String, Object> profilePic;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getProfilePic(){
                    return profilePic;
                }

                /* Adding Getter and Setter methods */
                public void setProfilePic(Map<String, Object> profilePic){
                    this.profilePic = profilePic;
                    //Update Map value..
                    hashMap.put("profilePic", profilePic);
                }

            
            
        
    
        
            

            
                private String message;
                /* Adding Getter and Setter methods */
                public String getMessage(){
                    return message;
                }

                /* Adding Getter and Setter methods */
                public void setMessage(String message){
                    this.message = message;
                    //Update hashMap value..
                    hashMap.put("message", message);
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

            
            
        
    
        
            

            
                private String readStatus;
                /* Adding Getter and Setter methods */
                public String getReadStatus(){
                    return readStatus;
                }

                /* Adding Getter and Setter methods */
                public void setReadStatus(String readStatus){
                    this.readStatus = readStatus;
                    //Update hashMap value..
                    hashMap.put("readStatus", readStatus);
                }

            
            
        
    
        
            

            
                private String guid;
                /* Adding Getter and Setter methods */
                public String getGuid(){
                    return guid;
                }

                /* Adding Getter and Setter methods */
                public void setGuid(String guid){
                    this.guid = guid;
                    //Update hashMap value..
                    hashMap.put("guid", guid);
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

            
            
        
    
        
            

            
                private String oriUserId;
                /* Adding Getter and Setter methods */
                public String getOriUserId(){
                    return oriUserId;
                }

                /* Adding Getter and Setter methods */
                public void setOriUserId(String oriUserId){
                    this.oriUserId = oriUserId;
                    //Update hashMap value..
                    hashMap.put("oriUserId", oriUserId);
                }

            
            
        
    
        
            

            
                private boolean isMarkedInsensitive;
                /* Adding Getter and Setter methods */
                public boolean getIsMarkedInsensitive(){
                    return isMarkedInsensitive;
                }

                /* Adding Getter and Setter methods */
                public void setIsMarkedInsensitive(boolean isMarkedInsensitive){
                    this.isMarkedInsensitive = isMarkedInsensitive;
                    //Update hashMap value..
                    hashMap.put("isMarkedInsensitive", isMarkedInsensitive);
                }

            
            
        
    
        
            

            
                private String displayMessage;
                /* Adding Getter and Setter methods */
                public String getDisplayMessage(){
                    return displayMessage;
                }

                /* Adding Getter and Setter methods */
                public void setDisplayMessage(String displayMessage){
                    this.displayMessage = displayMessage;
                    //Update hashMap value..
                    hashMap.put("displayMessage", displayMessage);
                }

            
            
        
    
        
            

            
                private Map<String, Object> replyTo;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getReplyTo(){
                    return replyTo;
                }

                /* Adding Getter and Setter methods */
                public void setReplyTo(Map<String, Object> replyTo){
                    this.replyTo = replyTo;
                    //Update Map value..
                    hashMap.put("replyTo", replyTo);
                }

            
            
        
    
        
            

            
                private String from;
                /* Adding Getter and Setter methods */
                public String getFrom(){
                    return from;
                }

                /* Adding Getter and Setter methods */
                public void setFrom(String from){
                    this.from = from;
                    //Update hashMap value..
                    hashMap.put("from", from);
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

            
            
        
    
        
            

            
                private double chatUserId;
                /* Adding Getter and Setter methods */
                public double getChatUserId(){
                    return chatUserId;
                }

                /* Adding Getter and Setter methods */
                public void setChatUserId(double chatUserId){
                    this.chatUserId = chatUserId;
                    //Update hashMap value..
                    hashMap.put("chatUserId", chatUserId);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      ChatItemRepository lowercaseFirstLetterRepository = (ChatItemRepository) getRepository();
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
      ChatItemRepository lowercaseFirstLetterRepository = (ChatItemRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      ChatItemRepository lowercaseFirstLetterRepository = (ChatItemRepository) getRepository();
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
                    private transient ChatRoom  chatRoom ;
                    private String chatRoomId;

                    public String getChatRoomId(){
                         return chatRoomId;
                    }

                    public void setChatRoomId(Object chatRoomId){
                        if(chatRoomId != null){
                          this.chatRoomId = chatRoomId.toString();
                        }
                    }

                    public ChatRoom getChatRoom() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(chatRoom == null){
                                        ChatItemRepository chatItemRepository = (ChatItemRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = chatItemRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          chatRoom = getChatRoom__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return chatRoom;
                    }

                    public void setChatRoom(ChatRoom chatRoom) {
                        this.chatRoom = chatRoom;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setChatRoom(Map<String, Object> chatRoom) {
                        //First create a dummy Repo class object for customer.
                        ChatRoomRepository chatRoomRepository = new ChatRoomRepository();
                        ChatRoom chatRoom1 = chatRoomRepository.createObject(chatRoom);
                        setChatRoom(chatRoom1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setChatRoom(HashMap<String, Object> chatRoom) {
                        //First create a dummy Repo class object for customer.
                        ChatRoomRepository chatRoomRepository = new ChatRoomRepository();
                        ChatRoom chatRoom1 = chatRoomRepository.createObject(chatRoom);
                        setChatRoom(chatRoom1);
                    }

                    //Adding relation method..
                    public void addRelation(ChatRoom chatRoom) {
                        that.setChatRoom(chatRoom);
                    }


                    //Fetch related data from local database if present a chatRoomId identifier as property for belongsTo
                    public ChatRoom getChatRoom__db(SnaphyRestAdapter restAdapter){
                      if(chatRoomId != null){
                        ChatRoomRepository chatRoomRepository = restAdapter.createRepository(ChatRoomRepository.class);
                            try{
                            ChatItemRepository lowercaseFirstLetterRepository = (ChatItemRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(chatRoomRepository.getDb() == null ){
                                                    chatRoomRepository.addStorage(context);
                                                }

                                                if(context != null && chatRoomRepository.getDb() != null){
                                                    chatRoomRepository.addStorage(context);
                                                    ChatRoom chatRoom = (ChatRoom) chatRoomRepository.getDb().get__db(chatRoomId);
                                                    return chatRoom;
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
                                    public void get__chatRoom( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<ChatRoom> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatItemRepository  chatItemRepo = restAdapter.createRepository(ChatItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatItemRepo.get__chatRoom( (String)that.getId(), refresh,  new ObjectCallback<ChatRoom> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(ChatRoom object) {
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
                    private transient AppUser  appUser ;
                    private String appUserId;

                    public String getAppUserId(){
                         return appUserId;
                    }

                    public void setAppUserId(Object appUserId){
                        if(appUserId != null){
                          this.appUserId = appUserId.toString();
                        }
                    }

                    public AppUser getAppUser() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(appUser == null){
                                        ChatItemRepository chatItemRepository = (ChatItemRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = chatItemRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          appUser = getAppUser__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return appUser;
                    }

                    public void setAppUser(AppUser appUser) {
                        this.appUser = appUser;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAppUser(Map<String, Object> appUser) {
                        //First create a dummy Repo class object for customer.
                        AppUserRepository appUserRepository = new AppUserRepository();
                        AppUser appUser1 = appUserRepository.createObject(appUser);
                        setAppUser(appUser1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAppUser(HashMap<String, Object> appUser) {
                        //First create a dummy Repo class object for customer.
                        AppUserRepository appUserRepository = new AppUserRepository();
                        AppUser appUser1 = appUserRepository.createObject(appUser);
                        setAppUser(appUser1);
                    }

                    //Adding relation method..
                    public void addRelation(AppUser appUser) {
                        that.setAppUser(appUser);
                    }


                    //Fetch related data from local database if present a appUserId identifier as property for belongsTo
                    public AppUser getAppUser__db(SnaphyRestAdapter restAdapter){
                      if(appUserId != null){
                        AppUserRepository appUserRepository = restAdapter.createRepository(AppUserRepository.class);
                            try{
                            ChatItemRepository lowercaseFirstLetterRepository = (ChatItemRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(appUserRepository.getDb() == null ){
                                                    appUserRepository.addStorage(context);
                                                }

                                                if(context != null && appUserRepository.getDb() != null){
                                                    appUserRepository.addStorage(context);
                                                    AppUser appUser = (AppUser) appUserRepository.getDb().get__db(appUserId);
                                                    return appUser;
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
                                    public void get__appUser( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatItemRepository  chatItemRepo = restAdapter.createRepository(ChatItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatItemRepo.get__appUser( (String)that.getId(), refresh,  new ObjectCallback<AppUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(AppUser object) {
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
                    private transient ChatItem  chatItem ;
                    private String chatItemId;

                    public String getChatItemId(){
                         return chatItemId;
                    }

                    public void setChatItemId(Object chatItemId){
                        if(chatItemId != null){
                          this.chatItemId = chatItemId.toString();
                        }
                    }

                    public ChatItem getChatItem() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(chatItem == null){
                                        ChatItemRepository chatItemRepository = (ChatItemRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = chatItemRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          chatItem = getChatItem__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return chatItem;
                    }

                    public void setChatItem(ChatItem chatItem) {
                        this.chatItem = chatItem;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setChatItem(Map<String, Object> chatItem) {
                        //First create a dummy Repo class object for customer.
                        ChatItemRepository chatItemRepository = new ChatItemRepository();
                        ChatItem chatItem1 = chatItemRepository.createObject(chatItem);
                        setChatItem(chatItem1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setChatItem(HashMap<String, Object> chatItem) {
                        //First create a dummy Repo class object for customer.
                        ChatItemRepository chatItemRepository = new ChatItemRepository();
                        ChatItem chatItem1 = chatItemRepository.createObject(chatItem);
                        setChatItem(chatItem1);
                    }

                    //Adding relation method..
                    public void addRelation(ChatItem chatItem) {
                        that.setChatItem(chatItem);
                    }


                    //Fetch related data from local database if present a chatItemId identifier as property for belongsTo
                    public ChatItem getChatItem__db(SnaphyRestAdapter restAdapter){
                      if(chatItemId != null){
                        ChatItemRepository chatItemRepository = restAdapter.createRepository(ChatItemRepository.class);
                            try{
                            ChatItemRepository lowercaseFirstLetterRepository = (ChatItemRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(chatItemRepository.getDb() == null ){
                                                    chatItemRepository.addStorage(context);
                                                }

                                                if(context != null && chatItemRepository.getDb() != null){
                                                    chatItemRepository.addStorage(context);
                                                    ChatItem chatItem = (ChatItem) chatItemRepository.getDb().get__db(chatItemId);
                                                    return chatItem;
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
                                    public void get__chatItem( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<ChatItem> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final ChatItemRepository  chatItemRepo = restAdapter.createRepository(ChatItemRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        chatItemRepo.get__chatItem( (String)that.getId(), refresh,  new ObjectCallback<ChatItem> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
