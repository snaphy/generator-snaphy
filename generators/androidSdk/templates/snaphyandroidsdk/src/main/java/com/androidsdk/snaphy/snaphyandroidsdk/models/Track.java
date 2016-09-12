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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.TrackRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.EventTypeRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Track extends Model {


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

    private Track that ;

    public Track (){
        that = this;
    }

    
        
            
            
            
            
                private Map<String, Object> picture;
                /* Adding Getter and Setter methods */
                public Map<String, Object> getPicture(){
                    return picture;
                }

                /* Adding Getter and Setter methods */
                public void setPicture(Map<String, Object> picture){
                    this.picture = picture;
                    //Update Map value..
                    hashMap.put("picture", picture);
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

            
            
            
            

        
    
        
            
            
                private String description;
                /* Adding Getter and Setter methods */
                public String getDescription(){
                    return description;
                }

                /* Adding Getter and Setter methods */
                public void setDescription(String description){
                    this.description = description;
                    //Update hashMap value..
                    hashMap.put("description", description);
                }

            
            
            
            

        
    
        
            
            
            
                private double uniqueCode;
                /* Adding Getter and Setter methods */
                public double getUniqueCode(){
                    return uniqueCode;
                }

                /* Adding Getter and Setter methods */
                public void setUniqueCode(double uniqueCode){
                    this.uniqueCode = uniqueCode;
                    //Update hashMap value..
                    hashMap.put("uniqueCode", uniqueCode);
                }

            
            
            

        
    
        
            
            
                private String isPublic;
                /* Adding Getter and Setter methods */
                public String getIsPublic(){
                    return isPublic;
                }

                /* Adding Getter and Setter methods */
                public void setIsPublic(String isPublic){
                    this.isPublic = isPublic;
                    //Update hashMap value..
                    hashMap.put("isPublic", isPublic);
                }

            
            
            
            

        
    
        
            
            
                private String address;
                /* Adding Getter and Setter methods */
                public String getAddress(){
                    return address;
                }

                /* Adding Getter and Setter methods */
                public void setAddress(String address){
                    this.address = address;
                    //Update hashMap value..
                    hashMap.put("address", address);
                }

            
            
            
            

        
    
        
            
            
            
            
            
                private Map<String, Object> geolocation = new HashMap();
                /* Adding Getter and Setter methods */
                public Map<String, Object> getGeolocation(){
                    return geolocation;
                }
                /* Adding Getter and Setter methods */
                public double getGeolocationLatitide(){
                    if(geolocation != null){
                        return (Double)geolocation.get("lat");
                    }else{
                        return 0;
                    }
                }

                /* Adding Getter and Setter methods */
                public double getGeolocationLongitude(){
                    if(geolocation != null){
                        return (Double)geolocation.get("lng");
                    }else{
                        return 0;
                    }

                }

                /* Adding Getter and Setter methods */
                public void setGeolocation(Map<String, Object> geolocation){
                    this.geolocation.putAll(geolocation);
                    //Update Map value..
                    hashMap.put("geolocation", geolocation);
                }

                /* Adding Getter and Setter methods */
                public void setGeolocation(double lat, double lng){
                    this.geolocation.put("lat", lat);
                    this.geolocation.put("lng", lng);
                    //Update Map value..
                    hashMap.put("geolocation", geolocation);
                }

            

        
    
        
            

                private List<Map<String, Object>> friends;
                /* Adding Getter and Setter methods */
                public List<Map<String, Object>> getFriends(){
                    return friends;
                }

                /* Adding Getter and Setter methods */
                public void setFriends(List<Map<String, Object>> friends){
                    this.friends = friends;

                    //TODO change this to custom array with double quotes escaped if error occured when sending to server..
                    hashMap.put("friends", friends);
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

            
            
            
            

        
    
        
            
            
                private String locationId;
                /* Adding Getter and Setter methods */
                public String getLocationId(){
                    return locationId;
                }

                /* Adding Getter and Setter methods */
                public void setLocationId(String locationId){
                    this.locationId = locationId;
                    //Update hashMap value..
                    hashMap.put("locationId", locationId);
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

            
            
            
            

        
    
        
            
            
                private String lastModified;
                /* Adding Getter and Setter methods */
                public String getLastModified(){
                    return lastModified;
                }

                /* Adding Getter and Setter methods */
                public void setLastModified(String lastModified){
                    this.lastModified = lastModified;
                    //Update hashMap value..
                    hashMap.put("lastModified", lastModified);
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

            
            
            
            

        
    
        
            
            
                private String eventDate;
                /* Adding Getter and Setter methods */
                public String getEventDate(){
                    return eventDate;
                }

                /* Adding Getter and Setter methods */
                public void setEventDate(String eventDate){
                    this.eventDate = eventDate;
                    //Update hashMap value..
                    hashMap.put("eventDate", eventDate);
                }

            
            
            
            

        
    
        
            
            
                private String eventTime;
                /* Adding Getter and Setter methods */
                public String getEventTime(){
                    return eventTime;
                }

                /* Adding Getter and Setter methods */
                public void setEventTime(String eventTime){
                    this.eventTime = eventTime;
                    //Update hashMap value..
                    hashMap.put("eventTime", eventTime);
                }

            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    
        
            
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
                
                    //Define belongsTo relation method here..
                    private Customer  customer ;

                    public Customer getCustomer() {
                        return customer;
                    }

                    public void setCustomer(Customer customer) {
                        this.customer = customer;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCustomer(Map<String, Object> customer) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository customerRepository = new CustomerRepository();
                        Customer customer1 = customerRepository.createObject(customer);
                        setCustomer(customer1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCustomer(HashMap<String, Object> customer) {
                        //First create a dummy Repo class object for customer.
                        CustomerRepository customerRepository = new CustomerRepository();
                        Customer customer1 = customerRepository.createObject(customer);
                        setCustomer(customer1);
                    }

                    //Adding relation method..
                    public void addRelation(Customer customer) {
                        that.setCustomer(customer);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__customer( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Customer> callback) {
                                        //Define methods here..
                                        final TrackRepository  trackRepo = restAdapter.createRepository(TrackRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        trackRepo.get__customer( (String)that.getId(), refresh,  new ObjectCallback<Customer> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Customer object) {
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
                                 
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
                
                    //Define belongsTo relation method here..
                    private EventType  eventType ;

                    public EventType getEventType() {
                        return eventType;
                    }

                    public void setEventType(EventType eventType) {
                        this.eventType = eventType;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setEventType(Map<String, Object> eventType) {
                        //First create a dummy Repo class object for customer.
                        EventTypeRepository eventTypeRepository = new EventTypeRepository();
                        EventType eventType1 = eventTypeRepository.createObject(eventType);
                        setEventType(eventType1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setEventType(HashMap<String, Object> eventType) {
                        //First create a dummy Repo class object for customer.
                        EventTypeRepository eventTypeRepository = new EventTypeRepository();
                        EventType eventType1 = eventTypeRepository.createObject(eventType);
                        setEventType(eventType1);
                    }

                    //Adding relation method..
                    public void addRelation(EventType eventType) {
                        that.setEventType(eventType);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void get__eventType( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<EventType> callback) {
                                        //Define methods here..
                                        final TrackRepository  trackRepo = restAdapter.createRepository(TrackRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        trackRepo.get__eventType( (String)that.getId(), refresh,  new ObjectCallback<EventType> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(EventType object) {
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
