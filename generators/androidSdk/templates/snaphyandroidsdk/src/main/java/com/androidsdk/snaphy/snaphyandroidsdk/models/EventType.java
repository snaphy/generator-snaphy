package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;



import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;
import com.strongloop.android.remoting.adapters.Adapter;

//Import self repository..
import com.androidsdk.snaphy.snaphyandroidsdk.repository.EventTypeRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TrackRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class EventType extends Model {


    //For converting all model values to hashMap
    private Map<String, Object> hashMap = new HashMap<>();

    public Map<String,  ? extends Object> convertMap(){
        if(that.getId() != null){
            return hashMap;
        }else{
            hashMap.put("id", that.getId());
            return hashMap;
        }
    }

    private EventType that ;

    public EventType (){
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

            
            
            
            

        
    
        
            
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
                
                
                    
                    //Define hasMany relation method here..
                    private List<Track>  tracks ;

                    public List<Track> getTracks() {
                        return tracks;
                    }

                    public void setTracks(List<Track> tracks) {
                        boolean hashType = false;
                        List<HashMap<String, Object>> hashMaps = new ArrayList<>();
                        for(Object o: tracks){
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
                            setTracks1(hashMaps);
                        }else{
                            this.tracks = tracks;
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTracks1(List<Map<String, Object>> tracks) {
                        //First create a dummy Repo class object for ..
                        TrackRepository tracksRepository = new TrackRepository();
                        List<Track> result = new ArrayList<>();
                        for (Map<String, Object> obj : tracks) {
                            //Also add relation to child type for two way communication..
                            Track obj1 = tracksRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTracks(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTracks1(List<HashMap<String, Object>> tracks) {
                        //First create a dummy Repo class object for ..
                        TrackRepository tracksRepository = new TrackRepository();
                        List<Track> result = new ArrayList<>();
                        for (HashMap<String, Object> obj : tracks) {
                            //Also add relation to child type for two way communication..
                            Track obj1 = tracksRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTracks(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(List<Track> tracks, Track dummyClassInstance) {
                        that.setTracks(tracks);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Track tracks) {
                        try{
                            that.getTracks().add(tracks);
                        }catch(Exception e){
                            List< Track> tracks1 = new ArrayList();
                            //Now add this item to list..
                            tracks1.add(tracks);
                            //Now set data....
                            that.setTracks(tracks1);
                        }
                    }

                    


                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__tracks( String fk,  RestAdapter restAdapter, final ObjectCallback<Track> callback) {
                                        //Define methods here..
                                        final EventTypeRepository  eventTypeRepo = restAdapter.createRepository(EventTypeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        eventTypeRepo.findById__tracks( (String)that.getId(), fk,  new ObjectCallback<Track> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Track object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__tracks( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final EventTypeRepository  eventTypeRepo = restAdapter.createRepository(EventTypeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        eventTypeRepo.destroyById__tracks( (String)that.getId(), fk,  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void updateById__tracks( String fk,  Track data,  RestAdapter restAdapter, final ObjectCallback<Track> callback) {
                                        //Define methods here..
                                        final EventTypeRepository  eventTypeRepo = restAdapter.createRepository(EventTypeRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        eventTypeRepo.updateById__tracks( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Track> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Track object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void get__tracks( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final ListCallback<Track> callback) {
                                        //Define methods here..
                                        final EventTypeRepository  eventTypeRepo = restAdapter.createRepository(EventTypeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        eventTypeRepo.get__tracks( (String)that.getId(), filter,  new ListCallback<Track> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(List<Track> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Track obj = new Track();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Track obj : object) {
                                                                //Also add relation to child type for two way communication..
                                                                obj.addRelation(that);
                                                            }*/

                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void create__tracks( Track data,  RestAdapter restAdapter, final ObjectCallback<Track> callback) {
                                        //Define methods here..
                                        final EventTypeRepository  eventTypeRepo = restAdapter.createRepository(EventTypeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        eventTypeRepo.create__tracks( (String)that.getId(), data.convertMap(),  new ObjectCallback<Track> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Track object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            addRelation(object);
                                                            //Also add relation to child type for two way communication..Removing two way communication for cyclic error
                                                            //object.addRelation(that);
                                                            callback.onSuccess(object);
                                                        }else{
                                                            callback.onSuccess(null);
                                                        }

                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__tracks( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Define methods here..
                                        final EventTypeRepository  eventTypeRepo = restAdapter.createRepository(EventTypeRepository.class);
                                        
                                        



                                        eventTypeRepo.delete__tracks( (String)that.getId(),  new VoidCallback (){
                                            
                                                @Override
                                                public void onSuccess() {
                                                    callback.onSuccess();
                                                }
                                            

                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        

                                    //Write the method here..
                                    public void count__tracks( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final Adapter.JsonObjectCallback  callback ) {
                                        //Define methods here..
                                        final EventTypeRepository  eventTypeRepo = restAdapter.createRepository(EventTypeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        eventTypeRepo.count__tracks( (String)that.getId(), where,  new Adapter.JsonObjectCallback(){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(JSONObject object) {
                                                        callback.onSuccess(object);
                                                    }
                                                
                                            


                                            

                                            @Override
                                            public void onError(Throwable t) {
                                                //Now calling the callback
                                                callback.onError(t);
                                            }

                                        });
                                    } //method def ends here.
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                
                    //Define hasMany, hasManyThrough method here..

                 
                 
             
          
      

}
