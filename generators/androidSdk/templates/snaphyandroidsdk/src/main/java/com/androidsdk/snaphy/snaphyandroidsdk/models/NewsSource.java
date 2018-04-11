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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsSourceRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NewsRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class NewsSource extends Model {


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

    private NewsSource that ;

    public NewsSource (){
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

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      NewsSourceRepository lowercaseFirstLetterRepository = (NewsSourceRepository) getRepository();
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
      NewsSourceRepository lowercaseFirstLetterRepository = (NewsSourceRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      NewsSourceRepository lowercaseFirstLetterRepository = (NewsSourceRepository) getRepository();
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
                    private transient DataList<News>  news ;

                    public DataList< News > getNews() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            NewsRepository newsRepository = (NewsRepository) getRepository();

                            if(that.getId() != null && newsRepository.getDb() != null){

                                 //Fetch locally from db
                                 //news = getNews__db(restAdapter);
                                 // Getting single cont
                                 news = newsRepository.getDb().getAll__db("newsSourceId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return news;
                    }

                    public void setNews(DataList<News> news) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: news){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setNews1(hashMaps);
                        }else{
                            this.news = news;
                            //TODO: Warning move this to new thread
                            for(News data: news){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setNews1(List<Map<String, Object>> news) {
                        //First create a dummy Repo class object for ..
                        NewsRepository newsRepository = new NewsRepository();
                        List<News> result = new ArrayList<>();
                        for (Map<String, Object> obj : news) {
                            //Also add relation to child type for two way communication..
                            News obj1 = newsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setNews(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setNews1(DataList<HashMap<String, Object>> news) {
                        //First create a dummy Repo class object for ..
                        NewsRepository newsRepository = new NewsRepository();
                        DataList<News> result = new DataList<>();
                        for (HashMap<String, Object> obj : news) {
                            //Also add relation to child type for two way communication..
                            News obj1 = newsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setNews(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<News> news, News dummyClassInstance) {
                        that.setNews(news);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(News news) {
                        try{
                            try{

                                  //Save to database..
                                  news.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getNews().add(news);
                        }catch(Exception e){
                            DataList< News> news1 = new DataList();
                            //Now add this item to list..
                            news1.add(news);
                            //Now set data....
                            that.setNews(news1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__news( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<News> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsSourceRepository  newsSourceRepo = restAdapter.createRepository(NewsSourceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsSourceRepo.findById__news( (String)that.getId(), fk,  new ObjectCallback<News> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(News object) {
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
                                    public void destroyById__news( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsSourceRepository  newsSourceRepo = restAdapter.createRepository(NewsSourceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsSourceRepo.destroyById__news( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__news( String fk,  News data,  SnaphyRestAdapter restAdapter, final ObjectCallback<News> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsSourceRepository  newsSourceRepo = restAdapter.createRepository(NewsSourceRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        newsSourceRepo.updateById__news( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<News> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(News object) {
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
                                    public void get__news( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<News> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsSourceRepository  newsSourceRepo = restAdapter.createRepository(NewsSourceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsSourceRepo.get__news( (String)that.getId(), filter,  new DataListCallback<News> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<News> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            News obj = new News();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (News obj : object) {
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
                                    public void create__news( News data,  SnaphyRestAdapter restAdapter, final ObjectCallback<News> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsSourceRepository  newsSourceRepo = restAdapter.createRepository(NewsSourceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsSourceRepo.create__news( (String)that.getId(), data.convertMap(),  new ObjectCallback<News> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(News object) {
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
                                    public void delete__news( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsSourceRepository  newsSourceRepo = restAdapter.createRepository(NewsSourceRepository.class);
                                        
                                        



                                        newsSourceRepo.delete__news( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__news( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final NewsSourceRepository  newsSourceRepo = restAdapter.createRepository(NewsSourceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        newsSourceRepo.count__news( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
