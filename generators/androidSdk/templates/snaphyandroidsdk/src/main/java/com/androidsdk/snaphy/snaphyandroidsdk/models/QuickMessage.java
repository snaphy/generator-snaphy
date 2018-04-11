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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.QuickMessageRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRoomRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class QuickMessage extends Model {


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

    private QuickMessage that ;

    public QuickMessage (){
        that = this;
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

            
            
        
    
        
            

            
                private double uniqueNumber;
                /* Adding Getter and Setter methods */
                public double getUniqueNumber(){
                    return uniqueNumber;
                }

                /* Adding Getter and Setter methods */
                public void setUniqueNumber(double uniqueNumber){
                    this.uniqueNumber = uniqueNumber;
                    //Update hashMap value..
                    hashMap.put("uniqueNumber", uniqueNumber);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      QuickMessageRepository lowercaseFirstLetterRepository = (QuickMessageRepository) getRepository();
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
      QuickMessageRepository lowercaseFirstLetterRepository = (QuickMessageRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      QuickMessageRepository lowercaseFirstLetterRepository = (QuickMessageRepository) getRepository();
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
                                        QuickMessageRepository quickMessageRepository = (QuickMessageRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = quickMessageRepository.getRestAdapter();
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
                            QuickMessageRepository lowercaseFirstLetterRepository = (QuickMessageRepository) getRepository();
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
                                        final QuickMessageRepository  quickMessageRepo = restAdapter.createRepository(QuickMessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        quickMessageRepo.get__chatRoom( (String)that.getId(), refresh,  new ObjectCallback<ChatRoom> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
