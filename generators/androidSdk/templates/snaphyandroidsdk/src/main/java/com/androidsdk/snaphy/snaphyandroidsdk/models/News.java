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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsReadRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PostLikeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentResponseRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsSourceRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class News extends Model {


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

    private News that ;

    public News (){
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

            
            
        
    
        
            

            
                private Map<String, Object> mainImage;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getMainImage(){
                    return mainImage;
                }

                /* Adding Getter and Setter methods */
                public void setMainImage(Map<String, Object> mainImage){
                    this.mainImage = mainImage;
                    //Update Map value..
                    hashMap.put("mainImage", mainImage);
                }

            
            
        
    
        
            

            
                private String shortDescription;
                /* Adding Getter and Setter methods */
                public String getShortDescription(){
                    return shortDescription;
                }

                /* Adding Getter and Setter methods */
                public void setShortDescription(String shortDescription){
                    this.shortDescription = shortDescription;
                    //Update hashMap value..
                    hashMap.put("shortDescription", shortDescription);
                }

            
            
        
    
        
            

            
                private String fullStory;
                /* Adding Getter and Setter methods */
                public String getFullStory(){
                    return fullStory;
                }

                /* Adding Getter and Setter methods */
                public void setFullStory(String fullStory){
                    this.fullStory = fullStory;
                    //Update hashMap value..
                    hashMap.put("fullStory", fullStory);
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

            
            
        
    
        
            

            
                private boolean isLiked;
                /* Adding Getter and Setter methods */
                public boolean getIsLiked(){
                    return isLiked;
                }

                /* Adding Getter and Setter methods */
                public void setIsLiked(boolean isLiked){
                    this.isLiked = isLiked;
                    //Update hashMap value..
                    hashMap.put("isLiked", isLiked);
                }

            
            
        
    
        
            

            
                private double totalLikes;
                /* Adding Getter and Setter methods */
                public double getTotalLikes(){
                    return totalLikes;
                }

                /* Adding Getter and Setter methods */
                public void setTotalLikes(double totalLikes){
                    this.totalLikes = totalLikes;
                    //Update hashMap value..
                    hashMap.put("totalLikes", totalLikes);
                }

            
            
        
    
        
            

            
                private double totalReads;
                /* Adding Getter and Setter methods */
                public double getTotalReads(){
                    return totalReads;
                }

                /* Adding Getter and Setter methods */
                public void setTotalReads(double totalReads){
                    this.totalReads = totalReads;
                    //Update hashMap value..
                    hashMap.put("totalReads", totalReads);
                }

            
            
        
    
        
            

            
                private double totalComments;
                /* Adding Getter and Setter methods */
                public double getTotalComments(){
                    return totalComments;
                }

                /* Adding Getter and Setter methods */
                public void setTotalComments(double totalComments){
                    this.totalComments = totalComments;
                    //Update hashMap value..
                    hashMap.put("totalComments", totalComments);
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

            
            
        
    
        
            

            
                private double tagPriority;
                /* Adding Getter and Setter methods */
                public double getTagPriority(){
                    return tagPriority;
                }

                /* Adding Getter and Setter methods */
                public void setTagPriority(double tagPriority){
                    this.tagPriority = tagPriority;
                    //Update hashMap value..
                    hashMap.put("tagPriority", tagPriority);
                }

            
            
        
    
        
            

            
                private Map<String, Object> onClick;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getOnClick(){
                    return onClick;
                }

                /* Adding Getter and Setter methods */
                public void setOnClick(Map<String, Object> onClick){
                    this.onClick = onClick;
                    //Update Map value..
                    hashMap.put("onClick", onClick);
                }

            
            
        
    
        
            

                private DataList<Map<String, Object>> newsLabels;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getNewsLabels(){
                    return newsLabels;
                }

                /* Adding Getter and Setter methods */
                public void setNewsLabels(DataList<Map<String, Object>> newsLabels){
                    this.newsLabels = newsLabels;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("newsLabels", newsLabels);
                }

            

            
            
        
    
        
            

                private DataList<Map<String, Object>> newsCategories;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getNewsCategories(){
                    return newsCategories;
                }

                /* Adding Getter and Setter methods */
                public void setNewsCategories(DataList<Map<String, Object>> newsCategories){
                    this.newsCategories = newsCategories;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("newsCategories", newsCategories);
                }

            

            
            
        
    
        
            

            
                private boolean containsGraphics;
                /* Adding Getter and Setter methods */
                public boolean getContainsGraphics(){
                    return containsGraphics;
                }

                /* Adding Getter and Setter methods */
                public void setContainsGraphics(boolean containsGraphics){
                    this.containsGraphics = containsGraphics;
                    //Update hashMap value..
                    hashMap.put("containsGraphics", containsGraphics);
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

            
            
        
    
        
            

            
                private String uniqueNumber;
                /* Adding Getter and Setter methods */
                public String getUniqueNumber(){
                    return uniqueNumber;
                }

                /* Adding Getter and Setter methods */
                public void setUniqueNumber(String uniqueNumber){
                    this.uniqueNumber = uniqueNumber;
                    //Update hashMap value..
                    hashMap.put("uniqueNumber", uniqueNumber);
                }

            
            
        
    
        
            

            
                private String slug;
                /* Adding Getter and Setter methods */
                public String getSlug(){
                    return slug;
                }

                /* Adding Getter and Setter methods */
                public void setSlug(String slug){
                    this.slug = slug;
                    //Update hashMap value..
                    hashMap.put("slug", slug);
                }

            
            
        
    
        
            

            
                private boolean isRead;
                /* Adding Getter and Setter methods */
                public boolean getIsRead(){
                    return isRead;
                }

                /* Adding Getter and Setter methods */
                public void setIsRead(boolean isRead){
                    this.isRead = isRead;
                    //Update hashMap value..
                    hashMap.put("isRead", isRead);
                }

            
            
        
    
        
            

            
                private String setImageAsCover;
                /* Adding Getter and Setter methods */
                public String getSetImageAsCover(){
                    return setImageAsCover;
                }

                /* Adding Getter and Setter methods */
                public void setSetImageAsCover(String setImageAsCover){
                    this.setImageAsCover = setImageAsCover;
                    //Update hashMap value..
                    hashMap.put("setImageAsCover", setImageAsCover);
                }

            
            
        
    
        
            

            
                private double coins;
                /* Adding Getter and Setter methods */
                public double getCoins(){
                    return coins;
                }

                /* Adding Getter and Setter methods */
                public void setCoins(double coins){
                    this.coins = coins;
                    //Update hashMap value..
                    hashMap.put("coins", coins);
                }

            
            
        
    
        
            

            
                private boolean containsVideo;
                /* Adding Getter and Setter methods */
                public boolean getContainsVideo(){
                    return containsVideo;
                }

                /* Adding Getter and Setter methods */
                public void setContainsVideo(boolean containsVideo){
                    this.containsVideo = containsVideo;
                    //Update hashMap value..
                    hashMap.put("containsVideo", containsVideo);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      NewsRepository lowercaseFirstLetterRepository = (NewsRepository) getRepository();
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
      NewsRepository lowercaseFirstLetterRepository = (NewsRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      NewsRepository lowercaseFirstLetterRepository = (NewsRepository) getRepository();
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
                    private transient DataList<NewsRead>  newsReads ;

                    public DataList< NewsRead > getNewsReads() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            NewsReadRepository newsReadRepository = (NewsReadRepository) getRepository();

                            if(that.getId() != null && newsReadRepository.getDb() != null){

                                 //Fetch locally from db
                                 //newsReads = getNewsReads__db(restAdapter);
                                 // Getting single cont
                                 newsReads = newsReadRepository.getDb().getAll__db("newsId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return newsReads;
                    }

                    public void setNewsReads(DataList<NewsRead> newsReads) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: newsReads){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setNewsReads1(hashMaps);
                        }else{
                            this.newsReads = newsReads;
                            //TODO: Warning move this to new thread
                            for(NewsRead data: newsReads){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setNewsReads1(List<Map<String, Object>> newsReads) {
                        //First create a dummy Repo class object for ..
                        NewsReadRepository newsReadsRepository = new NewsReadRepository();
                        List<NewsRead> result = new ArrayList<>();
                        for (Map<String, Object> obj : newsReads) {
                            //Also add relation to child type for two way communication..
                            NewsRead obj1 = newsReadsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setNewsReads(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setNewsReads1(DataList<HashMap<String, Object>> newsReads) {
                        //First create a dummy Repo class object for ..
                        NewsReadRepository newsReadsRepository = new NewsReadRepository();
                        DataList<NewsRead> result = new DataList<>();
                        for (HashMap<String, Object> obj : newsReads) {
                            //Also add relation to child type for two way communication..
                            NewsRead obj1 = newsReadsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setNewsReads(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<NewsRead> newsReads, NewsRead dummyClassInstance) {
                        that.setNewsReads(newsReads);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(NewsRead newsReads) {
                        try{
                            try{

                                  //Save to database..
                                  newsReads.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getNewsReads().add(newsReads);
                        }catch(Exception e){
                            DataList< NewsRead> newsReads1 = new DataList();
                            //Now add this item to list..
                            newsReads1.add(newsReads);
                            //Now set data....
                            that.setNewsReads(newsReads1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__newsReads( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<NewsRead> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.findById__newsReads( (String)that.getId(), fk,  new ObjectCallback<NewsRead> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(NewsRead object) {
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
                                    public void destroyById__newsReads( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.destroyById__newsReads( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__newsReads( String fk,  NewsRead data,  SnaphyRestAdapter restAdapter, final ObjectCallback<NewsRead> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.updateById__newsReads( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<NewsRead> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(NewsRead object) {
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
                                    public void get__newsReads( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<NewsRead> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.get__newsReads( (String)that.getId(), filter,  new DataListCallback<NewsRead> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<NewsRead> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            NewsRead obj = new NewsRead();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (NewsRead obj : object) {
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
                                    public void create__newsReads( NewsRead data,  SnaphyRestAdapter restAdapter, final ObjectCallback<NewsRead> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.create__newsReads( (String)that.getId(), data.convertMap(),  new ObjectCallback<NewsRead> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(NewsRead object) {
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
                                    public void delete__newsReads( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        



                                        newsRepo.delete__newsReads( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__newsReads( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.count__newsReads( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<PostLike>  postLikes ;

                    public DataList< PostLike > getPostLikes() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PostLikeRepository postLikeRepository = (PostLikeRepository) getRepository();

                            if(that.getId() != null && postLikeRepository.getDb() != null){

                                 //Fetch locally from db
                                 //postLikes = getPostLikes__db(restAdapter);
                                 // Getting single cont
                                 postLikes = postLikeRepository.getDb().getAll__db("newsId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return postLikes;
                    }

                    public void setPostLikes(DataList<PostLike> postLikes) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: postLikes){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPostLikes1(hashMaps);
                        }else{
                            this.postLikes = postLikes;
                            //TODO: Warning move this to new thread
                            for(PostLike data: postLikes){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostLikes1(List<Map<String, Object>> postLikes) {
                        //First create a dummy Repo class object for ..
                        PostLikeRepository postLikesRepository = new PostLikeRepository();
                        List<PostLike> result = new ArrayList<>();
                        for (Map<String, Object> obj : postLikes) {
                            //Also add relation to child type for two way communication..
                            PostLike obj1 = postLikesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostLikes(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPostLikes1(DataList<HashMap<String, Object>> postLikes) {
                        //First create a dummy Repo class object for ..
                        PostLikeRepository postLikesRepository = new PostLikeRepository();
                        DataList<PostLike> result = new DataList<>();
                        for (HashMap<String, Object> obj : postLikes) {
                            //Also add relation to child type for two way communication..
                            PostLike obj1 = postLikesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPostLikes(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PostLike> postLikes, PostLike dummyClassInstance) {
                        that.setPostLikes(postLikes);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PostLike postLikes) {
                        try{
                            try{

                                  //Save to database..
                                  postLikes.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPostLikes().add(postLikes);
                        }catch(Exception e){
                            DataList< PostLike> postLikes1 = new DataList();
                            //Now add this item to list..
                            postLikes1.add(postLikes);
                            //Now set data....
                            that.setPostLikes(postLikes1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__postLikes( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostLike> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.findById__postLikes( (String)that.getId(), fk,  new ObjectCallback<PostLike> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostLike object) {
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
                                    public void destroyById__postLikes( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.destroyById__postLikes( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__postLikes( String fk,  PostLike data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostLike> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.updateById__postLikes( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PostLike> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostLike object) {
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
                                    public void get__postLikes( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<PostLike> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.get__postLikes( (String)that.getId(), filter,  new DataListCallback<PostLike> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PostLike> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PostLike obj = new PostLike();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PostLike obj : object) {
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
                                    public void create__postLikes( PostLike data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PostLike> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.create__postLikes( (String)that.getId(), data.convertMap(),  new ObjectCallback<PostLike> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PostLike object) {
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
                                    public void delete__postLikes( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        



                                        newsRepo.delete__postLikes( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__postLikes( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.count__postLikes( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Comment>  comments ;

                    public DataList< Comment > getComments() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            CommentRepository commentRepository = (CommentRepository) getRepository();

                            if(that.getId() != null && commentRepository.getDb() != null){

                                 //Fetch locally from db
                                 //comments = getComments__db(restAdapter);
                                 // Getting single cont
                                 comments = commentRepository.getDb().getAll__db("newsId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return comments;
                    }

                    public void setComments(DataList<Comment> comments) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: comments){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setComments1(hashMaps);
                        }else{
                            this.comments = comments;
                            //TODO: Warning move this to new thread
                            for(Comment data: comments){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(List<Map<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentRepository commentsRepository = new CommentRepository();
                        List<Comment> result = new ArrayList<>();
                        for (Map<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comment obj1 = commentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setComments(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setComments1(DataList<HashMap<String, Object>> comments) {
                        //First create a dummy Repo class object for ..
                        CommentRepository commentsRepository = new CommentRepository();
                        DataList<Comment> result = new DataList<>();
                        for (HashMap<String, Object> obj : comments) {
                            //Also add relation to child type for two way communication..
                            Comment obj1 = commentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setComments(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Comment> comments, Comment dummyClassInstance) {
                        that.setComments(comments);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Comment comments) {
                        try{
                            try{

                                  //Save to database..
                                  comments.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getComments().add(comments);
                        }catch(Exception e){
                            DataList< Comment> comments1 = new DataList();
                            //Now add this item to list..
                            comments1.add(comments);
                            //Now set data....
                            that.setComments(comments1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__comments( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.findById__comments( (String)that.getId(), fk,  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void destroyById__comments( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.destroyById__comments( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__comments( String fk,  Comment data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.updateById__comments( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void get__comments( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.get__comments( (String)that.getId(), filter,  new DataListCallback<Comment> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Comment> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Comment obj = new Comment();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Comment obj : object) {
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
                                    public void create__comments( Comment data,  SnaphyRestAdapter restAdapter, final ObjectCallback<Comment> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.create__comments( (String)that.getId(), data.convertMap(),  new ObjectCallback<Comment> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Comment object) {
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
                                    public void delete__comments( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        



                                        newsRepo.delete__comments( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__comments( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.count__comments( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<CommentResponse>  commentResponses ;

                    public DataList< CommentResponse > getCommentResponses() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            CommentResponseRepository commentResponseRepository = (CommentResponseRepository) getRepository();

                            if(that.getId() != null && commentResponseRepository.getDb() != null){

                                 //Fetch locally from db
                                 //commentResponses = getCommentResponses__db(restAdapter);
                                 // Getting single cont
                                 commentResponses = commentResponseRepository.getDb().getAll__db("newsId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return commentResponses;
                    }

                    public void setCommentResponses(DataList<CommentResponse> commentResponses) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: commentResponses){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setCommentResponses1(hashMaps);
                        }else{
                            this.commentResponses = commentResponses;
                            //TODO: Warning move this to new thread
                            for(CommentResponse data: commentResponses){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCommentResponses1(List<Map<String, Object>> commentResponses) {
                        //First create a dummy Repo class object for ..
                        CommentResponseRepository commentResponsesRepository = new CommentResponseRepository();
                        List<CommentResponse> result = new ArrayList<>();
                        for (Map<String, Object> obj : commentResponses) {
                            //Also add relation to child type for two way communication..
                            CommentResponse obj1 = commentResponsesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCommentResponses(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCommentResponses1(DataList<HashMap<String, Object>> commentResponses) {
                        //First create a dummy Repo class object for ..
                        CommentResponseRepository commentResponsesRepository = new CommentResponseRepository();
                        DataList<CommentResponse> result = new DataList<>();
                        for (HashMap<String, Object> obj : commentResponses) {
                            //Also add relation to child type for two way communication..
                            CommentResponse obj1 = commentResponsesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCommentResponses(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<CommentResponse> commentResponses, CommentResponse dummyClassInstance) {
                        that.setCommentResponses(commentResponses);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(CommentResponse commentResponses) {
                        try{
                            try{

                                  //Save to database..
                                  commentResponses.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getCommentResponses().add(commentResponses);
                        }catch(Exception e){
                            DataList< CommentResponse> commentResponses1 = new DataList();
                            //Now add this item to list..
                            commentResponses1.add(commentResponses);
                            //Now set data....
                            that.setCommentResponses(commentResponses1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__commentResponses( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<CommentResponse> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.findById__commentResponses( (String)that.getId(), fk,  new ObjectCallback<CommentResponse> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentResponse object) {
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
                                    public void destroyById__commentResponses( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.destroyById__commentResponses( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__commentResponses( String fk,  CommentResponse data,  SnaphyRestAdapter restAdapter, final ObjectCallback<CommentResponse> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.updateById__commentResponses( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<CommentResponse> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentResponse object) {
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
                                    public void get__commentResponses( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<CommentResponse> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.get__commentResponses( (String)that.getId(), filter,  new DataListCallback<CommentResponse> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<CommentResponse> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            CommentResponse obj = new CommentResponse();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (CommentResponse obj : object) {
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
                                    public void create__commentResponses( CommentResponse data,  SnaphyRestAdapter restAdapter, final ObjectCallback<CommentResponse> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.create__commentResponses( (String)that.getId(), data.convertMap(),  new ObjectCallback<CommentResponse> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CommentResponse object) {
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
                                    public void delete__commentResponses( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        



                                        newsRepo.delete__commentResponses( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__commentResponses( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.count__commentResponses( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient NewsSource  newsSource ;
                    private String newsSourceId;

                    public String getNewsSourceId(){
                         return newsSourceId;
                    }

                    public void setNewsSourceId(Object newsSourceId){
                        if(newsSourceId != null){
                          this.newsSourceId = newsSourceId.toString();
                        }
                    }

                    public NewsSource getNewsSource() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(newsSource == null){
                                        NewsRepository newsRepository = (NewsRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = newsRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          newsSource = getNewsSource__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return newsSource;
                    }

                    public void setNewsSource(NewsSource newsSource) {
                        this.newsSource = newsSource;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setNewsSource(Map<String, Object> newsSource) {
                        //First create a dummy Repo class object for customer.
                        NewsSourceRepository newsSourceRepository = new NewsSourceRepository();
                        NewsSource newsSource1 = newsSourceRepository.createObject(newsSource);
                        setNewsSource(newsSource1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setNewsSource(HashMap<String, Object> newsSource) {
                        //First create a dummy Repo class object for customer.
                        NewsSourceRepository newsSourceRepository = new NewsSourceRepository();
                        NewsSource newsSource1 = newsSourceRepository.createObject(newsSource);
                        setNewsSource(newsSource1);
                    }

                    //Adding relation method..
                    public void addRelation(NewsSource newsSource) {
                        that.setNewsSource(newsSource);
                    }


                    //Fetch related data from local database if present a newsSourceId identifier as property for belongsTo
                    public NewsSource getNewsSource__db(SnaphyRestAdapter restAdapter){
                      if(newsSourceId != null){
                        NewsSourceRepository newsSourceRepository = restAdapter.createRepository(NewsSourceRepository.class);
                            try{
                            NewsRepository lowercaseFirstLetterRepository = (NewsRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(newsSourceRepository.getDb() == null ){
                                                    newsSourceRepository.addStorage(context);
                                                }

                                                if(context != null && newsSourceRepository.getDb() != null){
                                                    newsSourceRepository.addStorage(context);
                                                    NewsSource newsSource = (NewsSource) newsSourceRepository.getDb().get__db(newsSourceId);
                                                    return newsSource;
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
                                    public void get__newsSource( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<NewsSource> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsRepository  newsRepo = restAdapter.createRepository(NewsRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsRepo.get__newsSource( (String)that.getId(), refresh,  new ObjectCallback<NewsSource> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(NewsSource object) {
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
