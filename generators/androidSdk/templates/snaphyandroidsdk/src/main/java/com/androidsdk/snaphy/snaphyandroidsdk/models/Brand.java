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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HotDealRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DailyFeedRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandManagerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandVerificationRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.FollowBrandRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Brand extends Model {


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

    private Brand that ;

    public Brand (){
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

            
            
        
    
        
            

            
                private String facebookUrl;
                /* Adding Getter and Setter methods */
                public String getFacebookUrl(){
                    return facebookUrl;
                }

                /* Adding Getter and Setter methods */
                public void setFacebookUrl(String facebookUrl){
                    this.facebookUrl = facebookUrl;
                    //Update hashMap value..
                    hashMap.put("facebookUrl", facebookUrl);
                }

            
            
        
    
        
            

            
                private String googleUrl;
                /* Adding Getter and Setter methods */
                public String getGoogleUrl(){
                    return googleUrl;
                }

                /* Adding Getter and Setter methods */
                public void setGoogleUrl(String googleUrl){
                    this.googleUrl = googleUrl;
                    //Update hashMap value..
                    hashMap.put("googleUrl", googleUrl);
                }

            
            
        
    
        
            

            
                private String instagramUrl;
                /* Adding Getter and Setter methods */
                public String getInstagramUrl(){
                    return instagramUrl;
                }

                /* Adding Getter and Setter methods */
                public void setInstagramUrl(String instagramUrl){
                    this.instagramUrl = instagramUrl;
                    //Update hashMap value..
                    hashMap.put("instagramUrl", instagramUrl);
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

            
            
        
    
        
            

            
                private String associatedEmail;
                /* Adding Getter and Setter methods */
                public String getAssociatedEmail(){
                    return associatedEmail;
                }

                /* Adding Getter and Setter methods */
                public void setAssociatedEmail(String associatedEmail){
                    this.associatedEmail = associatedEmail;
                    //Update hashMap value..
                    hashMap.put("associatedEmail", associatedEmail);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      BrandRepository lowercaseFirstLetterRepository = (BrandRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
          //Delete from database..
          String id = getId().toString();
          if(id != null && lowercaseFirstLetterRepository.getDb() != null){
             lowercaseFirstLetterRepository.getDb().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }



    public void save__db(String id){
      BrandRepository lowercaseFirstLetterRepository = (BrandRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      BrandRepository lowercaseFirstLetterRepository = (BrandRepository) getRepository();
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
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<HotDeal>  hotDeals ;

                    public DataList< HotDeal > getHotDeals() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                            HotDealRepository hotDealRepository = (HotDealRepository) getRepository();

                            if(that.getId() != null && hotDealRepository.getDb() != null){

                                 //Fetch locally from db
                                 //hotDeals = getHotDeals__db(restAdapter);
                                 // Getting single cont
                                 hotDeals = hotDealRepository.getDb().getAll__db("brandId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                                                return hotDeals;
                    }

                    public void setHotDeals(DataList<HotDeal> hotDeals) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: hotDeals){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHotDeals1(hashMaps);
                        }else{
                            this.hotDeals = hotDeals;
                            //TODO: Warning move this to new thread
                            for(HotDeal data: hotDeals){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHotDeals1(List<Map<String, Object>> hotDeals) {
                        //First create a dummy Repo class object for ..
                        HotDealRepository hotDealsRepository = new HotDealRepository();
                        List<HotDeal> result = new ArrayList<>();
                        for (Map<String, Object> obj : hotDeals) {
                            //Also add relation to child type for two way communication..
                            HotDeal obj1 = hotDealsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHotDeals(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHotDeals1(DataList<HashMap<String, Object>> hotDeals) {
                        //First create a dummy Repo class object for ..
                        HotDealRepository hotDealsRepository = new HotDealRepository();
                        DataList<HotDeal> result = new DataList<>();
                        for (HashMap<String, Object> obj : hotDeals) {
                            //Also add relation to child type for two way communication..
                            HotDeal obj1 = hotDealsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHotDeals(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HotDeal> hotDeals, HotDeal dummyClassInstance) {
                        that.setHotDeals(hotDeals);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HotDeal hotDeals) {
                        try{
                            try{

                                  //Save to database..
                                  hotDeals.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHotDeals().add(hotDeals);
                        }catch(Exception e){
                            DataList< HotDeal> hotDeals1 = new DataList();
                            //Now add this item to list..
                            hotDeals1.add(hotDeals);
                            //Now set data....
                            that.setHotDeals(hotDeals1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__hotDeals( String fk,  RestAdapter restAdapter, final ObjectCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.findById__hotDeals( (String)that.getId(), fk,  new ObjectCallback<HotDeal> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HotDeal object) {
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
                                    public void destroyById__hotDeals( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.destroyById__hotDeals( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__hotDeals( String fk,  HotDeal data,  RestAdapter restAdapter, final ObjectCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.updateById__hotDeals( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HotDeal> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HotDeal object) {
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
                                    public void get__hotDeals( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.get__hotDeals( (String)that.getId(), filter,  new DataListCallback<HotDeal> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HotDeal> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HotDeal obj = new HotDeal();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HotDeal obj : object) {
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
                                    public void create__hotDeals( HotDeal data,  RestAdapter restAdapter, final ObjectCallback<HotDeal> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.create__hotDeals( (String)that.getId(), data.convertMap(),  new ObjectCallback<HotDeal> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HotDeal object) {
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
                                    public void delete__hotDeals( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        



                                        brandRepo.delete__hotDeals( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__hotDeals( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.count__hotDeals( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Chat>  chats ;

                    public DataList< Chat > getChats() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                            ChatRepository chatRepository = (ChatRepository) getRepository();

                            if(that.getId() != null && chatRepository.getDb() != null){

                                 //Fetch locally from db
                                 //chats = getChats__db(restAdapter);
                                 // Getting single cont
                                 chats = chatRepository.getDb().getAll__db("brandId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                                                return chats;
                    }

                    public void setChats(DataList<Chat> chats) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: chats){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setChats1(hashMaps);
                        }else{
                            this.chats = chats;
                            //TODO: Warning move this to new thread
                            for(Chat data: chats){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChats1(List<Map<String, Object>> chats) {
                        //First create a dummy Repo class object for ..
                        ChatRepository chatsRepository = new ChatRepository();
                        List<Chat> result = new ArrayList<>();
                        for (Map<String, Object> obj : chats) {
                            //Also add relation to child type for two way communication..
                            Chat obj1 = chatsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChats(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setChats1(DataList<HashMap<String, Object>> chats) {
                        //First create a dummy Repo class object for ..
                        ChatRepository chatsRepository = new ChatRepository();
                        DataList<Chat> result = new DataList<>();
                        for (HashMap<String, Object> obj : chats) {
                            //Also add relation to child type for two way communication..
                            Chat obj1 = chatsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setChats(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Chat> chats, Chat dummyClassInstance) {
                        that.setChats(chats);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Chat chats) {
                        try{
                            try{

                                  //Save to database..
                                  chats.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getChats().add(chats);
                        }catch(Exception e){
                            DataList< Chat> chats1 = new DataList();
                            //Now add this item to list..
                            chats1.add(chats);
                            //Now set data....
                            that.setChats(chats1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__chats( String fk,  RestAdapter restAdapter, final ObjectCallback<Chat> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.findById__chats( (String)that.getId(), fk,  new ObjectCallback<Chat> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Chat object) {
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
                                    public void destroyById__chats( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.destroyById__chats( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__chats( String fk,  Chat data,  RestAdapter restAdapter, final ObjectCallback<Chat> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.updateById__chats( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Chat> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Chat object) {
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
                                    public void get__chats( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Chat> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.get__chats( (String)that.getId(), filter,  new DataListCallback<Chat> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Chat> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Chat obj = new Chat();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Chat obj : object) {
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
                                    public void create__chats( Chat data,  RestAdapter restAdapter, final ObjectCallback<Chat> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.create__chats( (String)that.getId(), data.convertMap(),  new ObjectCallback<Chat> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Chat object) {
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
                                    public void delete__chats( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        



                                        brandRepo.delete__chats( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__chats( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.count__chats( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<DailyFeed>  dailyFeeds ;

                    public DataList< DailyFeed > getDailyFeeds() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                            DailyFeedRepository dailyFeedRepository = (DailyFeedRepository) getRepository();

                            if(that.getId() != null && dailyFeedRepository.getDb() != null){

                                 //Fetch locally from db
                                 //dailyFeeds = getDailyFeeds__db(restAdapter);
                                 // Getting single cont
                                 dailyFeeds = dailyFeedRepository.getDb().getAll__db("brandId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                                                return dailyFeeds;
                    }

                    public void setDailyFeeds(DataList<DailyFeed> dailyFeeds) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: dailyFeeds){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setDailyFeeds1(hashMaps);
                        }else{
                            this.dailyFeeds = dailyFeeds;
                            //TODO: Warning move this to new thread
                            for(DailyFeed data: dailyFeeds){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setDailyFeeds1(List<Map<String, Object>> dailyFeeds) {
                        //First create a dummy Repo class object for ..
                        DailyFeedRepository dailyFeedsRepository = new DailyFeedRepository();
                        List<DailyFeed> result = new ArrayList<>();
                        for (Map<String, Object> obj : dailyFeeds) {
                            //Also add relation to child type for two way communication..
                            DailyFeed obj1 = dailyFeedsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setDailyFeeds(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setDailyFeeds1(DataList<HashMap<String, Object>> dailyFeeds) {
                        //First create a dummy Repo class object for ..
                        DailyFeedRepository dailyFeedsRepository = new DailyFeedRepository();
                        DataList<DailyFeed> result = new DataList<>();
                        for (HashMap<String, Object> obj : dailyFeeds) {
                            //Also add relation to child type for two way communication..
                            DailyFeed obj1 = dailyFeedsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setDailyFeeds(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<DailyFeed> dailyFeeds, DailyFeed dummyClassInstance) {
                        that.setDailyFeeds(dailyFeeds);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(DailyFeed dailyFeeds) {
                        try{
                            try{

                                  //Save to database..
                                  dailyFeeds.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getDailyFeeds().add(dailyFeeds);
                        }catch(Exception e){
                            DataList< DailyFeed> dailyFeeds1 = new DataList();
                            //Now add this item to list..
                            dailyFeeds1.add(dailyFeeds);
                            //Now set data....
                            that.setDailyFeeds(dailyFeeds1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__dailyFeeds( String fk,  RestAdapter restAdapter, final ObjectCallback<DailyFeed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.findById__dailyFeeds( (String)that.getId(), fk,  new ObjectCallback<DailyFeed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(DailyFeed object) {
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
                                    public void destroyById__dailyFeeds( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.destroyById__dailyFeeds( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__dailyFeeds( String fk,  DailyFeed data,  RestAdapter restAdapter, final ObjectCallback<DailyFeed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.updateById__dailyFeeds( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<DailyFeed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(DailyFeed object) {
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
                                    public void get__dailyFeeds( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<DailyFeed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.get__dailyFeeds( (String)that.getId(), filter,  new DataListCallback<DailyFeed> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<DailyFeed> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            DailyFeed obj = new DailyFeed();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (DailyFeed obj : object) {
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
                                    public void create__dailyFeeds( DailyFeed data,  RestAdapter restAdapter, final ObjectCallback<DailyFeed> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.create__dailyFeeds( (String)that.getId(), data.convertMap(),  new ObjectCallback<DailyFeed> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(DailyFeed object) {
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
                                    public void delete__dailyFeeds( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        



                                        brandRepo.delete__dailyFeeds( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__dailyFeeds( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.count__dailyFeeds( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<BrandManager>  brandManagers ;

                    public DataList< BrandManager > getBrandManagers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                            BrandManagerRepository brandManagerRepository = (BrandManagerRepository) getRepository();

                            if(that.getId() != null && brandManagerRepository.getDb() != null){

                                 //Fetch locally from db
                                 //brandManagers = getBrandManagers__db(restAdapter);
                                 // Getting single cont
                                 brandManagers = brandManagerRepository.getDb().getAll__db("brandId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                                                return brandManagers;
                    }

                    public void setBrandManagers(DataList<BrandManager> brandManagers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: brandManagers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setBrandManagers1(hashMaps);
                        }else{
                            this.brandManagers = brandManagers;
                            //TODO: Warning move this to new thread
                            for(BrandManager data: brandManagers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBrandManagers1(List<Map<String, Object>> brandManagers) {
                        //First create a dummy Repo class object for ..
                        BrandManagerRepository brandManagersRepository = new BrandManagerRepository();
                        List<BrandManager> result = new ArrayList<>();
                        for (Map<String, Object> obj : brandManagers) {
                            //Also add relation to child type for two way communication..
                            BrandManager obj1 = brandManagersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBrandManagers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBrandManagers1(DataList<HashMap<String, Object>> brandManagers) {
                        //First create a dummy Repo class object for ..
                        BrandManagerRepository brandManagersRepository = new BrandManagerRepository();
                        DataList<BrandManager> result = new DataList<>();
                        for (HashMap<String, Object> obj : brandManagers) {
                            //Also add relation to child type for two way communication..
                            BrandManager obj1 = brandManagersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBrandManagers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<BrandManager> brandManagers, BrandManager dummyClassInstance) {
                        that.setBrandManagers(brandManagers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(BrandManager brandManagers) {
                        try{
                            try{

                                  //Save to database..
                                  brandManagers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getBrandManagers().add(brandManagers);
                        }catch(Exception e){
                            DataList< BrandManager> brandManagers1 = new DataList();
                            //Now add this item to list..
                            brandManagers1.add(brandManagers);
                            //Now set data....
                            that.setBrandManagers(brandManagers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__brandManagers( String fk,  RestAdapter restAdapter, final ObjectCallback<BrandManager> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.findById__brandManagers( (String)that.getId(), fk,  new ObjectCallback<BrandManager> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BrandManager object) {
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
                                    public void destroyById__brandManagers( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.destroyById__brandManagers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__brandManagers( String fk,  BrandManager data,  RestAdapter restAdapter, final ObjectCallback<BrandManager> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.updateById__brandManagers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<BrandManager> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BrandManager object) {
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
                                    public void get__brandManagers( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<BrandManager> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.get__brandManagers( (String)that.getId(), filter,  new DataListCallback<BrandManager> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<BrandManager> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            BrandManager obj = new BrandManager();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (BrandManager obj : object) {
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
                                    public void create__brandManagers( BrandManager data,  RestAdapter restAdapter, final ObjectCallback<BrandManager> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.create__brandManagers( (String)that.getId(), data.convertMap(),  new ObjectCallback<BrandManager> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BrandManager object) {
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
                                    public void delete__brandManagers( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        



                                        brandRepo.delete__brandManagers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__brandManagers( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.count__brandManagers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient BrandVerification  brandVerifications ;
                    private String brandVerificationId;

                    public String getBrandVerificationId(){
                         return brandVerificationId;
                    }

                    public void setBrandVerificationId(Object brandVerificationId){
                        if(brandVerificationId != null){
                          this.brandVerificationId = brandVerificationId.toString();
                        }
                    }

                    public BrandVerification getBrandVerifications() {
                        //Adding database method for fetching from relation if not present..
                        if(brandVerifications == null){
                          BrandRepository brandRepository = (BrandRepository) getRepository();

                          RestAdapter restAdapter = brandRepository.getRestAdapter();
                          if(restAdapter != null){
                            //Fetch locally from db
                            brandVerifications = getBrandVerifications__db(restAdapter);
                          }
                        }
                        return brandVerifications;
                    }

                    public void setBrandVerifications(BrandVerification brandVerifications) {
                        this.brandVerifications = brandVerifications;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBrandVerifications(Map<String, Object> brandVerifications) {
                        //First create a dummy Repo class object for customer.
                        BrandVerificationRepository brandVerificationsRepository = new BrandVerificationRepository();
                        BrandVerification brandVerifications1 = brandVerificationsRepository.createObject(brandVerifications);
                        setBrandVerifications(brandVerifications1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setBrandVerifications(HashMap<String, Object> brandVerifications) {
                        //First create a dummy Repo class object for customer.
                        BrandVerificationRepository brandVerificationsRepository = new BrandVerificationRepository();
                        BrandVerification brandVerifications1 = brandVerificationsRepository.createObject(brandVerifications);
                        setBrandVerifications(brandVerifications1);
                    }

                    //Adding relation method..
                    public void addRelation(BrandVerification brandVerifications) {
                        that.setBrandVerifications(brandVerifications);
                    }


                    //Fetch related data from local database if present a brandVerificationId identifier as property for belongsTo
                    public BrandVerification getBrandVerifications__db(RestAdapter restAdapter){
                      if(brandVerificationId != null){
                        BrandVerificationRepository brandVerificationsRepository = restAdapter.createRepository(BrandVerificationRepository.class);
                           BrandRepository lowercaseFirstLetterRepository = (BrandRepository) getRepository();
                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                Context context = lowercaseFirstLetterRepository.getContext();
                                if(context != null && brandVerificationsRepository.getDb() != null){
                                    brandVerificationsRepository.addStorage(context);
                                    BrandVerification brandVerifications = (BrandVerification) brandVerificationsRepository.getDb().get__db(brandVerificationId);
                                    return brandVerifications;
                                }else{
                                    return null;
                                }
                          }else{
                            return null;
                          }
                        }else{
                          return null;
                      }
                    }
                

                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__brandVerifications( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<BrandVerification> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.get__brandVerifications( (String)that.getId(), refresh,  new ObjectCallback<BrandVerification> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BrandVerification object) {
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
                                    public void create__brandVerifications( BrandVerification data,  RestAdapter restAdapter, final ObjectCallback<BrandVerification> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.create__brandVerifications( (String)that.getId(), data.convertMap(),  new ObjectCallback<BrandVerification> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BrandVerification object) {
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
                                    public void update__brandVerifications( BrandVerification data,  RestAdapter restAdapter, final ObjectCallback<BrandVerification> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.update__brandVerifications( (String)that.getId(), data.convertMap(),  new ObjectCallback<BrandVerification> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(BrandVerification object) {
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
                                    public void destroy__brandVerifications( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        



                                        brandRepo.destroy__brandVerifications( (String)that.getId(),  new VoidCallback (){
                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<FollowBrand>  followBrands ;

                    public DataList< FollowBrand > getFollowBrands() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                            FollowBrandRepository followBrandRepository = (FollowBrandRepository) getRepository();

                            if(that.getId() != null && followBrandRepository.getDb() != null){

                                 //Fetch locally from db
                                 //followBrands = getFollowBrands__db(restAdapter);
                                 // Getting single cont
                                 followBrands = followBrandRepository.getDb().getAll__db("brandId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                                                return followBrands;
                    }

                    public void setFollowBrands(DataList<FollowBrand> followBrands) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: followBrands){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setFollowBrands1(hashMaps);
                        }else{
                            this.followBrands = followBrands;
                            //TODO: Warning move this to new thread
                            for(FollowBrand data: followBrands){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setFollowBrands1(List<Map<String, Object>> followBrands) {
                        //First create a dummy Repo class object for ..
                        FollowBrandRepository followBrandsRepository = new FollowBrandRepository();
                        List<FollowBrand> result = new ArrayList<>();
                        for (Map<String, Object> obj : followBrands) {
                            //Also add relation to child type for two way communication..
                            FollowBrand obj1 = followBrandsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setFollowBrands(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setFollowBrands1(DataList<HashMap<String, Object>> followBrands) {
                        //First create a dummy Repo class object for ..
                        FollowBrandRepository followBrandsRepository = new FollowBrandRepository();
                        DataList<FollowBrand> result = new DataList<>();
                        for (HashMap<String, Object> obj : followBrands) {
                            //Also add relation to child type for two way communication..
                            FollowBrand obj1 = followBrandsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setFollowBrands(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<FollowBrand> followBrands, FollowBrand dummyClassInstance) {
                        that.setFollowBrands(followBrands);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(FollowBrand followBrands) {
                        try{
                            try{

                                  //Save to database..
                                  followBrands.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getFollowBrands().add(followBrands);
                        }catch(Exception e){
                            DataList< FollowBrand> followBrands1 = new DataList();
                            //Now add this item to list..
                            followBrands1.add(followBrands);
                            //Now set data....
                            that.setFollowBrands(followBrands1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__followBrands( String fk,  RestAdapter restAdapter, final ObjectCallback<FollowBrand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.findById__followBrands( (String)that.getId(), fk,  new ObjectCallback<FollowBrand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FollowBrand object) {
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
                                    public void destroyById__followBrands( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.destroyById__followBrands( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__followBrands( String fk,  FollowBrand data,  RestAdapter restAdapter, final ObjectCallback<FollowBrand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.updateById__followBrands( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<FollowBrand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FollowBrand object) {
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
                                    public void get__followBrands( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<FollowBrand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.get__followBrands( (String)that.getId(), filter,  new DataListCallback<FollowBrand> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<FollowBrand> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            FollowBrand obj = new FollowBrand();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (FollowBrand obj : object) {
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
                                    public void create__followBrands( FollowBrand data,  RestAdapter restAdapter, final ObjectCallback<FollowBrand> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.create__followBrands( (String)that.getId(), data.convertMap(),  new ObjectCallback<FollowBrand> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(FollowBrand object) {
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
                                    public void delete__followBrands( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        



                                        brandRepo.delete__followBrands( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__followBrands( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.count__followBrands( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
