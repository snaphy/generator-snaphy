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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.CarouselRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ItemRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Carousel extends Model {


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

    private Carousel that ;

    public Carousel (){
        that = this;
    }

    
        
            

                private DataList<Map<String, Object>> images;
                /* Adding Getter and Setter methods */
                public DataList<Map<String, Object>> getImages(){
                    return images;
                }

                /* Adding Getter and Setter methods */
                public void setImages(DataList<Map<String, Object>> images){
                    this.images = images;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("images", images);
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
                    private transient Item  item ;

                    public Item getItem() {
                        return item;
                    }

                    public void setItem(Item item) {
                        this.item = item;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setItem(Map<String, Object> item) {
                        //First create a dummy Repo class object for customer.
                        ItemRepository itemRepository = new ItemRepository();
                        Item item1 = itemRepository.createObject(item);
                        setItem(item1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setItem(HashMap<String, Object> item) {
                        //First create a dummy Repo class object for customer.
                        ItemRepository itemRepository = new ItemRepository();
                        Item item1 = itemRepository.createObject(item);
                        setItem(item1);
                    }

                    //Adding relation method..
                    public void addRelation(Item item) {
                        that.setItem(item);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__item( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Item> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final CarouselRepository  carouselRepo = restAdapter.createRepository(CarouselRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        carouselRepo.get__item( (String)that.getId(), refresh,  new ObjectCallback<Item> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
