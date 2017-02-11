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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HotDealRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DailyFeedRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandManagerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AppUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BrandVerificationRepository;
            

        
    


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

            
        
    
        
            

            
                private boolean id;
                /* Adding Getter and Setter methods */
                public Object getId(){
                    return id;
                }

                /* Adding Getter and Setter methods */
                public void setId(Object id){
                    this.id = id;
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
          if(id != null){
             lowercaseFirstLetterRepository.getBrandDb().delete__db(id);
          }
      }
      //Also save to database..
      super.save(callback);
    }



    public void save__db(String id){
      BrandRepository lowercaseFirstLetterRepository = (BrandRepository) getRepository();
      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null){
          lowercaseFirstLetterRepository.getBrandDb().upsert__db(id, this);
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
                                                    if(that.getId() != null){
                                   //TODO: Modify foreign key name..
                                   HotDealRepository hotDealRepository = (HotDealRepository) getRepository();

                                 //Fetch locally from db
                                 //hotDeals = getHotDeals__db(restAdapter);
                                 // Getting single cont
                                 hotDeals = hotDealRepository.getHotDealDb().getAll__db("brandId", that.getId().toString());

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
                                data.save__db();
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
                            //Save to database..
                            hotDeals.save__db();
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
                                                    if(that.getId() != null){
                                   //TODO: Modify foreign key name..
                                   ChatRepository chatRepository = (ChatRepository) getRepository();

                                 //Fetch locally from db
                                 //chats = getChats__db(restAdapter);
                                 // Getting single cont
                                 chats = chatRepository.getChatDb().getAll__db("brandId", that.getId().toString());

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
                                data.save__db();
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
                            //Save to database..
                            chats.save__db();
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
                                                    if(that.getId() != null){
                                   //TODO: Modify foreign key name..
                                   DailyFeedRepository dailyFeedRepository = (DailyFeedRepository) getRepository();

                                 //Fetch locally from db
                                 //dailyFeeds = getDailyFeeds__db(restAdapter);
                                 // Getting single cont
                                 dailyFeeds = dailyFeedRepository.getDailyFeedDb().getAll__db("brandId", that.getId().toString());

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
                                data.save__db();
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
                            //Save to database..
                            dailyFeeds.save__db();
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
                                                    if(that.getId() != null){
                                   //TODO: Modify foreign key name..
                                   BrandManagerRepository brandManagerRepository = (BrandManagerRepository) getRepository();

                                 //Fetch locally from db
                                 //brandManagers = getBrandManagers__db(restAdapter);
                                 // Getting single cont
                                 brandManagers = brandManagerRepository.getBrandManagerDb().getAll__db("brandId", that.getId().toString());

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
                                data.save__db();
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
                            //Save to database..
                            brandManagers.save__db();
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

                 
                 
             
          
    
        
        
                

                
                
                    //TODO ADD BACKWARD COMPATIBILITY FOR hasManyThrough relationship..warning backward compatibility may leads to cyclic error..
                    //Define belongsTo relation method here..
                    private transient DataList<AppUser>  appUsers ;

                    public DataList<AppUser> getAppUsers() {
                        return appUsers;
                    }


                    public void setAppUsers(DataList<AppUser> appUsers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: appUsers){
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
                            setAppUsers1(hashMaps);
                        }else{
                            this.appUsers = appUsers;
                        }
                    }

                    /*

                    //Adding related model automatically in case of include statement from server..
                    public void setAppUsers1(List<Map<String, Object>> appUsers) {
                        //First create a dummy Repo class object for ..
                        AppUserRepository appUsersRepository = new AppUserRepository();
                        List<AppUser> result = new ArrayList<>();
                        for (Map<String, Object> obj : appUsers) {
                            //Also add relation to child type for two way communication..
                            AppUser obj1 = appUsersRepository.createObject(obj);
                            result.add(obj1);
                        }
                        setAppUsers(result);
                    }

                    */

                    //Adding related model automatically in case of include statement from server..
                    public void setAppUsers1(DataList<HashMap<String, Object>> appUsers) {
                        //First create a dummy Repo class object for ..
                        AppUserRepository appUsersRepository = new AppUserRepository();
                        DataList<AppUser> result = new DataList<>();
                        for (HashMap<String, Object> obj : appUsers) {
                            //Also add relation to child type for two way communication..
                            AppUser obj1 = appUsersRepository.createObject(obj);
                            result.add(obj1);
                        }
                        setAppUsers(result);
                    }


                    //Adding relation method..
                    public void addRelation(DataList<AppUser> appUsers, AppUser dummyClassInstance) {
                        that.setAppUsers(appUsers);
                    }


                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(AppUser appUsers) {
                        try{
                            that.getAppUsers().add(appUsers);
                        }catch(Exception e){
                            DataList< AppUser> appUsers1 = new DataList();
                            //Now add this item to list..
                            appUsers1.add(appUsers);
                            //Now set data....
                            that.setAppUsers(appUsers1);
                        }
                    }

                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__appUsers( String fk,  RestAdapter restAdapter, final ObjectCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.findById__appUsers( (String)that.getId(), fk,  new ObjectCallback<AppUser> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__appUsers( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.destroyById__appUsers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__appUsers( String fk,  AppUser data,  RestAdapter restAdapter, final ObjectCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.updateById__appUsers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<AppUser> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void link__appUsers( String fk,  RestAdapter restAdapter, final ObjectCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.link__appUsers( (String)that.getId(), fk,  new ObjectCallback<AppUser> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void unlink__appUsers( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.unlink__appUsers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void exists__appUsers( String fk,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.exists__appUsers( (String)that.getId(), fk,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void get__appUsers( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.get__appUsers( (String)that.getId(), filter,  new DataListCallback<AppUser> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<AppUser> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            AppUser obj = new AppUser();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (AppUser obj : object) {
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
                                    public void create__appUsers( AppUser data,  RestAdapter restAdapter, final ObjectCallback<AppUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.create__appUsers( (String)that.getId(), data.convertMap(),  new ObjectCallback<AppUser> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__appUsers( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        



                                        brandRepo.delete__appUsers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__appUsers( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final BrandRepository  brandRepo = restAdapter.createRepository(BrandRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        brandRepo.count__appUsers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                
                    //Define hasAndBelongsToMany..

                 
             
          
    
         
          
      

}
