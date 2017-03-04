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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AdminRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SchoolRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.EventRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.NoticeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.MessageRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QuestionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AnswerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BlogRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HomeWorkRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomEventRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CalendarRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AttendanceRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OtherRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ReminderRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Admin extends User {


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

    private Admin that ;

    public Admin (){
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

            
            
        
    
        
            

            
                private String password;
                /* Adding Getter and Setter methods */
                public String getPassword(){
                    return password;
                }

                /* Adding Getter and Setter methods */
                public void setPassword(String password){
                    this.password = password;
                    //Update hashMap value..
                    hashMap.put("password", password);
                }

            
            
        
    
        
            

            
                private String phoneNumber;
                /* Adding Getter and Setter methods */
                public String getPhoneNumber(){
                    return phoneNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPhoneNumber(String phoneNumber){
                    this.phoneNumber = phoneNumber;
                    //Update hashMap value..
                    hashMap.put("phoneNumber", phoneNumber);
                }

            
            
        
    
        
            

            
                private String email;
                /* Adding Getter and Setter methods */
                public String getEmail(){
                    return email;
                }

                /* Adding Getter and Setter methods */
                public void setEmail(String email){
                    this.email = email;
                    //Update hashMap value..
                    hashMap.put("email", email);
                }

            
            
        
    
        
            

            
                private String registrationId;
                /* Adding Getter and Setter methods */
                public String getRegistrationId(){
                    return registrationId;
                }

                /* Adding Getter and Setter methods */
                public void setRegistrationId(String registrationId){
                    this.registrationId = registrationId;
                    //Update hashMap value..
                    hashMap.put("registrationId", registrationId);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      AdminRepository lowercaseFirstLetterRepository = (AdminRepository) getRepository();
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
      AdminRepository lowercaseFirstLetterRepository = (AdminRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      AdminRepository lowercaseFirstLetterRepository = (AdminRepository) getRepository();
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
                    private transient School  school ;
                    private String schoolId;

                    public String getSchoolId(){
                         return schoolId;
                    }

                    public void setSchoolId(Object schoolId){
                        if(schoolId != null){
                          this.schoolId = schoolId.toString();
                        }
                    }

                    public School getSchool() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(school == null){
		                  AdminRepository adminRepository = (AdminRepository) getRepository();

		                  RestAdapter restAdapter = adminRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    school = getSchool__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return school;
                    }

                    public void setSchool(School school) {
                        this.school = school;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSchool(Map<String, Object> school) {
                        //First create a dummy Repo class object for customer.
                        SchoolRepository schoolRepository = new SchoolRepository();
                        School school1 = schoolRepository.createObject(school);
                        setSchool(school1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setSchool(HashMap<String, Object> school) {
                        //First create a dummy Repo class object for customer.
                        SchoolRepository schoolRepository = new SchoolRepository();
                        School school1 = schoolRepository.createObject(school);
                        setSchool(school1);
                    }

                    //Adding relation method..
                    public void addRelation(School school) {
                        that.setSchool(school);
                    }


                    //Fetch related data from local database if present a schoolId identifier as property for belongsTo
                    public School getSchool__db(RestAdapter restAdapter){
                      if(schoolId != null){
                        SchoolRepository schoolRepository = restAdapter.createRepository(SchoolRepository.class);
			  try{
				AdminRepository lowercaseFirstLetterRepository = (AdminRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(schoolRepository.getDb() == null ){
		                            schoolRepository.addStorage(context);
		                        }

		                        if(context != null && schoolRepository.getDb() != null){
		                            schoolRepository.addStorage(context);
		                            School school = (School) schoolRepository.getDb().get__db(schoolId);
		                            return school;
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
                                    public void get__school( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<School> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__school( (String)that.getId(), refresh,  new ObjectCallback<School> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(School object) {
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
                    private transient DataList<Event>  events ;

                    public DataList< Event > getEvents() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            EventRepository eventRepository = (EventRepository) getRepository();

                            if(that.getId() != null && eventRepository.getDb() != null){

                                 //Fetch locally from db
                                 //events = getEvents__db(restAdapter);
                                 // Getting single cont
                                 events = eventRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return events;
                    }

                    public void setEvents(DataList<Event> events) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: events){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setEvents1(hashMaps);
                        }else{
                            this.events = events;
                            //TODO: Warning move this to new thread
                            for(Event data: events){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setEvents1(List<Map<String, Object>> events) {
                        //First create a dummy Repo class object for ..
                        EventRepository eventsRepository = new EventRepository();
                        List<Event> result = new ArrayList<>();
                        for (Map<String, Object> obj : events) {
                            //Also add relation to child type for two way communication..
                            Event obj1 = eventsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setEvents(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setEvents1(DataList<HashMap<String, Object>> events) {
                        //First create a dummy Repo class object for ..
                        EventRepository eventsRepository = new EventRepository();
                        DataList<Event> result = new DataList<>();
                        for (HashMap<String, Object> obj : events) {
                            //Also add relation to child type for two way communication..
                            Event obj1 = eventsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setEvents(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Event> events, Event dummyClassInstance) {
                        that.setEvents(events);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Event events) {
                        try{
                            try{

                                  //Save to database..
                                  events.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getEvents().add(events);
                        }catch(Exception e){
                            DataList< Event> events1 = new DataList();
                            //Now add this item to list..
                            events1.add(events);
                            //Now set data....
                            that.setEvents(events1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__events( String fk,  RestAdapter restAdapter, final ObjectCallback<Event> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__events( (String)that.getId(), fk,  new ObjectCallback<Event> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Event object) {
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
                                    public void destroyById__events( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__events( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__events( String fk,  Event data,  RestAdapter restAdapter, final ObjectCallback<Event> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__events( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Event> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Event object) {
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
                                    public void get__events( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Event> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__events( (String)that.getId(), filter,  new DataListCallback<Event> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Event> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Event obj = new Event();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Event obj : object) {
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
                                    public void create__events( Event data,  RestAdapter restAdapter, final ObjectCallback<Event> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__events( (String)that.getId(), data.convertMap(),  new ObjectCallback<Event> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Event object) {
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
                                    public void delete__events( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__events( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__events( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__events( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Notice>  notices ;

                    public DataList< Notice > getNotices() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            NoticeRepository noticeRepository = (NoticeRepository) getRepository();

                            if(that.getId() != null && noticeRepository.getDb() != null){

                                 //Fetch locally from db
                                 //notices = getNotices__db(restAdapter);
                                 // Getting single cont
                                 notices = noticeRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return notices;
                    }

                    public void setNotices(DataList<Notice> notices) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: notices){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setNotices1(hashMaps);
                        }else{
                            this.notices = notices;
                            //TODO: Warning move this to new thread
                            for(Notice data: notices){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setNotices1(List<Map<String, Object>> notices) {
                        //First create a dummy Repo class object for ..
                        NoticeRepository noticesRepository = new NoticeRepository();
                        List<Notice> result = new ArrayList<>();
                        for (Map<String, Object> obj : notices) {
                            //Also add relation to child type for two way communication..
                            Notice obj1 = noticesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setNotices(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setNotices1(DataList<HashMap<String, Object>> notices) {
                        //First create a dummy Repo class object for ..
                        NoticeRepository noticesRepository = new NoticeRepository();
                        DataList<Notice> result = new DataList<>();
                        for (HashMap<String, Object> obj : notices) {
                            //Also add relation to child type for two way communication..
                            Notice obj1 = noticesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setNotices(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Notice> notices, Notice dummyClassInstance) {
                        that.setNotices(notices);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Notice notices) {
                        try{
                            try{

                                  //Save to database..
                                  notices.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getNotices().add(notices);
                        }catch(Exception e){
                            DataList< Notice> notices1 = new DataList();
                            //Now add this item to list..
                            notices1.add(notices);
                            //Now set data....
                            that.setNotices(notices1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__notices( String fk,  RestAdapter restAdapter, final ObjectCallback<Notice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__notices( (String)that.getId(), fk,  new ObjectCallback<Notice> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Notice object) {
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
                                    public void destroyById__notices( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__notices( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__notices( String fk,  Notice data,  RestAdapter restAdapter, final ObjectCallback<Notice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__notices( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Notice> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Notice object) {
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
                                    public void get__notices( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Notice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__notices( (String)that.getId(), filter,  new DataListCallback<Notice> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Notice> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Notice obj = new Notice();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Notice obj : object) {
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
                                    public void create__notices( Notice data,  RestAdapter restAdapter, final ObjectCallback<Notice> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__notices( (String)that.getId(), data.convertMap(),  new ObjectCallback<Notice> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Notice object) {
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
                                    public void delete__notices( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__notices( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__notices( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__notices( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Message>  messages ;

                    public DataList< Message > getMessages() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            MessageRepository messageRepository = (MessageRepository) getRepository();

                            if(that.getId() != null && messageRepository.getDb() != null){

                                 //Fetch locally from db
                                 //messages = getMessages__db(restAdapter);
                                 // Getting single cont
                                 messages = messageRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return messages;
                    }

                    public void setMessages(DataList<Message> messages) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: messages){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setMessages1(hashMaps);
                        }else{
                            this.messages = messages;
                            //TODO: Warning move this to new thread
                            for(Message data: messages){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setMessages1(List<Map<String, Object>> messages) {
                        //First create a dummy Repo class object for ..
                        MessageRepository messagesRepository = new MessageRepository();
                        List<Message> result = new ArrayList<>();
                        for (Map<String, Object> obj : messages) {
                            //Also add relation to child type for two way communication..
                            Message obj1 = messagesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setMessages(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setMessages1(DataList<HashMap<String, Object>> messages) {
                        //First create a dummy Repo class object for ..
                        MessageRepository messagesRepository = new MessageRepository();
                        DataList<Message> result = new DataList<>();
                        for (HashMap<String, Object> obj : messages) {
                            //Also add relation to child type for two way communication..
                            Message obj1 = messagesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setMessages(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Message> messages, Message dummyClassInstance) {
                        that.setMessages(messages);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Message messages) {
                        try{
                            try{

                                  //Save to database..
                                  messages.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getMessages().add(messages);
                        }catch(Exception e){
                            DataList< Message> messages1 = new DataList();
                            //Now add this item to list..
                            messages1.add(messages);
                            //Now set data....
                            that.setMessages(messages1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__messages( String fk,  RestAdapter restAdapter, final ObjectCallback<Message> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__messages( (String)that.getId(), fk,  new ObjectCallback<Message> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Message object) {
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
                                    public void destroyById__messages( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__messages( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__messages( String fk,  Message data,  RestAdapter restAdapter, final ObjectCallback<Message> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__messages( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Message> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Message object) {
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
                                    public void get__messages( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Message> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__messages( (String)that.getId(), filter,  new DataListCallback<Message> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Message> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Message obj = new Message();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Message obj : object) {
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
                                    public void create__messages( Message data,  RestAdapter restAdapter, final ObjectCallback<Message> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__messages( (String)that.getId(), data.convertMap(),  new ObjectCallback<Message> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Message object) {
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
                                    public void delete__messages( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__messages( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__messages( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__messages( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Question>  questions ;

                    public DataList< Question > getQuestions() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            QuestionRepository questionRepository = (QuestionRepository) getRepository();

                            if(that.getId() != null && questionRepository.getDb() != null){

                                 //Fetch locally from db
                                 //questions = getQuestions__db(restAdapter);
                                 // Getting single cont
                                 questions = questionRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return questions;
                    }

                    public void setQuestions(DataList<Question> questions) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: questions){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setQuestions1(hashMaps);
                        }else{
                            this.questions = questions;
                            //TODO: Warning move this to new thread
                            for(Question data: questions){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQuestions1(List<Map<String, Object>> questions) {
                        //First create a dummy Repo class object for ..
                        QuestionRepository questionsRepository = new QuestionRepository();
                        List<Question> result = new ArrayList<>();
                        for (Map<String, Object> obj : questions) {
                            //Also add relation to child type for two way communication..
                            Question obj1 = questionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQuestions(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setQuestions1(DataList<HashMap<String, Object>> questions) {
                        //First create a dummy Repo class object for ..
                        QuestionRepository questionsRepository = new QuestionRepository();
                        DataList<Question> result = new DataList<>();
                        for (HashMap<String, Object> obj : questions) {
                            //Also add relation to child type for two way communication..
                            Question obj1 = questionsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setQuestions(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Question> questions, Question dummyClassInstance) {
                        that.setQuestions(questions);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Question questions) {
                        try{
                            try{

                                  //Save to database..
                                  questions.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getQuestions().add(questions);
                        }catch(Exception e){
                            DataList< Question> questions1 = new DataList();
                            //Now add this item to list..
                            questions1.add(questions);
                            //Now set data....
                            that.setQuestions(questions1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__questions( String fk,  RestAdapter restAdapter, final ObjectCallback<Question> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__questions( (String)that.getId(), fk,  new ObjectCallback<Question> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Question object) {
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
                                    public void destroyById__questions( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__questions( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__questions( String fk,  Question data,  RestAdapter restAdapter, final ObjectCallback<Question> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__questions( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Question> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Question object) {
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
                                    public void get__questions( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Question> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__questions( (String)that.getId(), filter,  new DataListCallback<Question> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Question> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Question obj = new Question();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Question obj : object) {
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
                                    public void create__questions( Question data,  RestAdapter restAdapter, final ObjectCallback<Question> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__questions( (String)that.getId(), data.convertMap(),  new ObjectCallback<Question> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Question object) {
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
                                    public void delete__questions( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__questions( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__questions( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__questions( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Answer>  answers ;

                    public DataList< Answer > getAnswers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            AnswerRepository answerRepository = (AnswerRepository) getRepository();

                            if(that.getId() != null && answerRepository.getDb() != null){

                                 //Fetch locally from db
                                 //answers = getAnswers__db(restAdapter);
                                 // Getting single cont
                                 answers = answerRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return answers;
                    }

                    public void setAnswers(DataList<Answer> answers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: answers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setAnswers1(hashMaps);
                        }else{
                            this.answers = answers;
                            //TODO: Warning move this to new thread
                            for(Answer data: answers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAnswers1(List<Map<String, Object>> answers) {
                        //First create a dummy Repo class object for ..
                        AnswerRepository answersRepository = new AnswerRepository();
                        List<Answer> result = new ArrayList<>();
                        for (Map<String, Object> obj : answers) {
                            //Also add relation to child type for two way communication..
                            Answer obj1 = answersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAnswers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAnswers1(DataList<HashMap<String, Object>> answers) {
                        //First create a dummy Repo class object for ..
                        AnswerRepository answersRepository = new AnswerRepository();
                        DataList<Answer> result = new DataList<>();
                        for (HashMap<String, Object> obj : answers) {
                            //Also add relation to child type for two way communication..
                            Answer obj1 = answersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAnswers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Answer> answers, Answer dummyClassInstance) {
                        that.setAnswers(answers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Answer answers) {
                        try{
                            try{

                                  //Save to database..
                                  answers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getAnswers().add(answers);
                        }catch(Exception e){
                            DataList< Answer> answers1 = new DataList();
                            //Now add this item to list..
                            answers1.add(answers);
                            //Now set data....
                            that.setAnswers(answers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__answers( String fk,  RestAdapter restAdapter, final ObjectCallback<Answer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__answers( (String)that.getId(), fk,  new ObjectCallback<Answer> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Answer object) {
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
                                    public void destroyById__answers( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__answers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__answers( String fk,  Answer data,  RestAdapter restAdapter, final ObjectCallback<Answer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__answers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Answer> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Answer object) {
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
                                    public void get__answers( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Answer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__answers( (String)that.getId(), filter,  new DataListCallback<Answer> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Answer> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Answer obj = new Answer();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Answer obj : object) {
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
                                    public void create__answers( Answer data,  RestAdapter restAdapter, final ObjectCallback<Answer> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__answers( (String)that.getId(), data.convertMap(),  new ObjectCallback<Answer> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Answer object) {
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
                                    public void delete__answers( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__answers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__answers( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__answers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Blog>  blogs ;

                    public DataList< Blog > getBlogs() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            BlogRepository blogRepository = (BlogRepository) getRepository();

                            if(that.getId() != null && blogRepository.getDb() != null){

                                 //Fetch locally from db
                                 //blogs = getBlogs__db(restAdapter);
                                 // Getting single cont
                                 blogs = blogRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return blogs;
                    }

                    public void setBlogs(DataList<Blog> blogs) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: blogs){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setBlogs1(hashMaps);
                        }else{
                            this.blogs = blogs;
                            //TODO: Warning move this to new thread
                            for(Blog data: blogs){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBlogs1(List<Map<String, Object>> blogs) {
                        //First create a dummy Repo class object for ..
                        BlogRepository blogsRepository = new BlogRepository();
                        List<Blog> result = new ArrayList<>();
                        for (Map<String, Object> obj : blogs) {
                            //Also add relation to child type for two way communication..
                            Blog obj1 = blogsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBlogs(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setBlogs1(DataList<HashMap<String, Object>> blogs) {
                        //First create a dummy Repo class object for ..
                        BlogRepository blogsRepository = new BlogRepository();
                        DataList<Blog> result = new DataList<>();
                        for (HashMap<String, Object> obj : blogs) {
                            //Also add relation to child type for two way communication..
                            Blog obj1 = blogsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setBlogs(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Blog> blogs, Blog dummyClassInstance) {
                        that.setBlogs(blogs);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Blog blogs) {
                        try{
                            try{

                                  //Save to database..
                                  blogs.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getBlogs().add(blogs);
                        }catch(Exception e){
                            DataList< Blog> blogs1 = new DataList();
                            //Now add this item to list..
                            blogs1.add(blogs);
                            //Now set data....
                            that.setBlogs(blogs1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__blogs( String fk,  RestAdapter restAdapter, final ObjectCallback<Blog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__blogs( (String)that.getId(), fk,  new ObjectCallback<Blog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Blog object) {
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
                                    public void destroyById__blogs( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__blogs( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__blogs( String fk,  Blog data,  RestAdapter restAdapter, final ObjectCallback<Blog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__blogs( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Blog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Blog object) {
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
                                    public void get__blogs( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Blog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__blogs( (String)that.getId(), filter,  new DataListCallback<Blog> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Blog> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Blog obj = new Blog();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Blog obj : object) {
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
                                    public void create__blogs( Blog data,  RestAdapter restAdapter, final ObjectCallback<Blog> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__blogs( (String)that.getId(), data.convertMap(),  new ObjectCallback<Blog> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Blog object) {
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
                                    public void delete__blogs( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__blogs( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__blogs( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__blogs( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<HomeWork>  homeWork ;

                    public DataList< HomeWork > getHomeWork() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            HomeWorkRepository homeWorkRepository = (HomeWorkRepository) getRepository();

                            if(that.getId() != null && homeWorkRepository.getDb() != null){

                                 //Fetch locally from db
                                 //homeWork = getHomeWork__db(restAdapter);
                                 // Getting single cont
                                 homeWork = homeWorkRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return homeWork;
                    }

                    public void setHomeWork(DataList<HomeWork> homeWork) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: homeWork){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setHomeWork1(hashMaps);
                        }else{
                            this.homeWork = homeWork;
                            //TODO: Warning move this to new thread
                            for(HomeWork data: homeWork){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHomeWork1(List<Map<String, Object>> homeWork) {
                        //First create a dummy Repo class object for ..
                        HomeWorkRepository homeWorkRepository = new HomeWorkRepository();
                        List<HomeWork> result = new ArrayList<>();
                        for (Map<String, Object> obj : homeWork) {
                            //Also add relation to child type for two way communication..
                            HomeWork obj1 = homeWorkRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHomeWork(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setHomeWork1(DataList<HashMap<String, Object>> homeWork) {
                        //First create a dummy Repo class object for ..
                        HomeWorkRepository homeWorkRepository = new HomeWorkRepository();
                        DataList<HomeWork> result = new DataList<>();
                        for (HashMap<String, Object> obj : homeWork) {
                            //Also add relation to child type for two way communication..
                            HomeWork obj1 = homeWorkRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setHomeWork(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<HomeWork> homeWork, HomeWork dummyClassInstance) {
                        that.setHomeWork(homeWork);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(HomeWork homeWork) {
                        try{
                            try{

                                  //Save to database..
                                  homeWork.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getHomeWork().add(homeWork);
                        }catch(Exception e){
                            DataList< HomeWork> homeWork1 = new DataList();
                            //Now add this item to list..
                            homeWork1.add(homeWork);
                            //Now set data....
                            that.setHomeWork(homeWork1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__homeWork( String fk,  RestAdapter restAdapter, final ObjectCallback<HomeWork> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__homeWork( (String)that.getId(), fk,  new ObjectCallback<HomeWork> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HomeWork object) {
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
                                    public void destroyById__homeWork( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__homeWork( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__homeWork( String fk,  HomeWork data,  RestAdapter restAdapter, final ObjectCallback<HomeWork> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__homeWork( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<HomeWork> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HomeWork object) {
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
                                    public void get__homeWork( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<HomeWork> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__homeWork( (String)that.getId(), filter,  new DataListCallback<HomeWork> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<HomeWork> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            HomeWork obj = new HomeWork();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (HomeWork obj : object) {
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
                                    public void create__homeWork( HomeWork data,  RestAdapter restAdapter, final ObjectCallback<HomeWork> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__homeWork( (String)that.getId(), data.convertMap(),  new ObjectCallback<HomeWork> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HomeWork object) {
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
                                    public void delete__homeWork( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__homeWork( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__homeWork( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__homeWork( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<CustomEvent>  customEvents ;

                    public DataList< CustomEvent > getCustomEvents() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            CustomEventRepository customEventRepository = (CustomEventRepository) getRepository();

                            if(that.getId() != null && customEventRepository.getDb() != null){

                                 //Fetch locally from db
                                 //customEvents = getCustomEvents__db(restAdapter);
                                 // Getting single cont
                                 customEvents = customEventRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return customEvents;
                    }

                    public void setCustomEvents(DataList<CustomEvent> customEvents) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: customEvents){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setCustomEvents1(hashMaps);
                        }else{
                            this.customEvents = customEvents;
                            //TODO: Warning move this to new thread
                            for(CustomEvent data: customEvents){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCustomEvents1(List<Map<String, Object>> customEvents) {
                        //First create a dummy Repo class object for ..
                        CustomEventRepository customEventsRepository = new CustomEventRepository();
                        List<CustomEvent> result = new ArrayList<>();
                        for (Map<String, Object> obj : customEvents) {
                            //Also add relation to child type for two way communication..
                            CustomEvent obj1 = customEventsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCustomEvents(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCustomEvents1(DataList<HashMap<String, Object>> customEvents) {
                        //First create a dummy Repo class object for ..
                        CustomEventRepository customEventsRepository = new CustomEventRepository();
                        DataList<CustomEvent> result = new DataList<>();
                        for (HashMap<String, Object> obj : customEvents) {
                            //Also add relation to child type for two way communication..
                            CustomEvent obj1 = customEventsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCustomEvents(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<CustomEvent> customEvents, CustomEvent dummyClassInstance) {
                        that.setCustomEvents(customEvents);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(CustomEvent customEvents) {
                        try{
                            try{

                                  //Save to database..
                                  customEvents.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getCustomEvents().add(customEvents);
                        }catch(Exception e){
                            DataList< CustomEvent> customEvents1 = new DataList();
                            //Now add this item to list..
                            customEvents1.add(customEvents);
                            //Now set data....
                            that.setCustomEvents(customEvents1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__customEvents( String fk,  RestAdapter restAdapter, final ObjectCallback<CustomEvent> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__customEvents( (String)that.getId(), fk,  new ObjectCallback<CustomEvent> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CustomEvent object) {
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
                                    public void destroyById__customEvents( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__customEvents( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__customEvents( String fk,  CustomEvent data,  RestAdapter restAdapter, final ObjectCallback<CustomEvent> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__customEvents( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<CustomEvent> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CustomEvent object) {
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
                                    public void get__customEvents( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<CustomEvent> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__customEvents( (String)that.getId(), filter,  new DataListCallback<CustomEvent> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<CustomEvent> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            CustomEvent obj = new CustomEvent();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (CustomEvent obj : object) {
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
                                    public void create__customEvents( CustomEvent data,  RestAdapter restAdapter, final ObjectCallback<CustomEvent> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__customEvents( (String)that.getId(), data.convertMap(),  new ObjectCallback<CustomEvent> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(CustomEvent object) {
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
                                    public void delete__customEvents( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__customEvents( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__customEvents( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__customEvents( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Calendar>  calendars ;

                    public DataList< Calendar > getCalendars() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            CalendarRepository calendarRepository = (CalendarRepository) getRepository();

                            if(that.getId() != null && calendarRepository.getDb() != null){

                                 //Fetch locally from db
                                 //calendars = getCalendars__db(restAdapter);
                                 // Getting single cont
                                 calendars = calendarRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return calendars;
                    }

                    public void setCalendars(DataList<Calendar> calendars) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: calendars){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setCalendars1(hashMaps);
                        }else{
                            this.calendars = calendars;
                            //TODO: Warning move this to new thread
                            for(Calendar data: calendars){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCalendars1(List<Map<String, Object>> calendars) {
                        //First create a dummy Repo class object for ..
                        CalendarRepository calendarsRepository = new CalendarRepository();
                        List<Calendar> result = new ArrayList<>();
                        for (Map<String, Object> obj : calendars) {
                            //Also add relation to child type for two way communication..
                            Calendar obj1 = calendarsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCalendars(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setCalendars1(DataList<HashMap<String, Object>> calendars) {
                        //First create a dummy Repo class object for ..
                        CalendarRepository calendarsRepository = new CalendarRepository();
                        DataList<Calendar> result = new DataList<>();
                        for (HashMap<String, Object> obj : calendars) {
                            //Also add relation to child type for two way communication..
                            Calendar obj1 = calendarsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setCalendars(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Calendar> calendars, Calendar dummyClassInstance) {
                        that.setCalendars(calendars);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Calendar calendars) {
                        try{
                            try{

                                  //Save to database..
                                  calendars.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getCalendars().add(calendars);
                        }catch(Exception e){
                            DataList< Calendar> calendars1 = new DataList();
                            //Now add this item to list..
                            calendars1.add(calendars);
                            //Now set data....
                            that.setCalendars(calendars1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__calendars( String fk,  RestAdapter restAdapter, final ObjectCallback<Calendar> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__calendars( (String)that.getId(), fk,  new ObjectCallback<Calendar> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Calendar object) {
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
                                    public void destroyById__calendars( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__calendars( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__calendars( String fk,  Calendar data,  RestAdapter restAdapter, final ObjectCallback<Calendar> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__calendars( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Calendar> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Calendar object) {
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
                                    public void get__calendars( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Calendar> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__calendars( (String)that.getId(), filter,  new DataListCallback<Calendar> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Calendar> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Calendar obj = new Calendar();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Calendar obj : object) {
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
                                    public void create__calendars( Calendar data,  RestAdapter restAdapter, final ObjectCallback<Calendar> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__calendars( (String)that.getId(), data.convertMap(),  new ObjectCallback<Calendar> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Calendar object) {
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
                                    public void delete__calendars( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__calendars( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__calendars( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__calendars( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Attendance>  attendances ;

                    public DataList< Attendance > getAttendances() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            AttendanceRepository attendanceRepository = (AttendanceRepository) getRepository();

                            if(that.getId() != null && attendanceRepository.getDb() != null){

                                 //Fetch locally from db
                                 //attendances = getAttendances__db(restAdapter);
                                 // Getting single cont
                                 attendances = attendanceRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return attendances;
                    }

                    public void setAttendances(DataList<Attendance> attendances) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: attendances){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setAttendances1(hashMaps);
                        }else{
                            this.attendances = attendances;
                            //TODO: Warning move this to new thread
                            for(Attendance data: attendances){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAttendances1(List<Map<String, Object>> attendances) {
                        //First create a dummy Repo class object for ..
                        AttendanceRepository attendancesRepository = new AttendanceRepository();
                        List<Attendance> result = new ArrayList<>();
                        for (Map<String, Object> obj : attendances) {
                            //Also add relation to child type for two way communication..
                            Attendance obj1 = attendancesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAttendances(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setAttendances1(DataList<HashMap<String, Object>> attendances) {
                        //First create a dummy Repo class object for ..
                        AttendanceRepository attendancesRepository = new AttendanceRepository();
                        DataList<Attendance> result = new DataList<>();
                        for (HashMap<String, Object> obj : attendances) {
                            //Also add relation to child type for two way communication..
                            Attendance obj1 = attendancesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setAttendances(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Attendance> attendances, Attendance dummyClassInstance) {
                        that.setAttendances(attendances);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Attendance attendances) {
                        try{
                            try{

                                  //Save to database..
                                  attendances.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getAttendances().add(attendances);
                        }catch(Exception e){
                            DataList< Attendance> attendances1 = new DataList();
                            //Now add this item to list..
                            attendances1.add(attendances);
                            //Now set data....
                            that.setAttendances(attendances1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__attendances( String fk,  RestAdapter restAdapter, final ObjectCallback<Attendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__attendances( (String)that.getId(), fk,  new ObjectCallback<Attendance> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Attendance object) {
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
                                    public void destroyById__attendances( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__attendances( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__attendances( String fk,  Attendance data,  RestAdapter restAdapter, final ObjectCallback<Attendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__attendances( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Attendance> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Attendance object) {
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
                                    public void get__attendances( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Attendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__attendances( (String)that.getId(), filter,  new DataListCallback<Attendance> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Attendance> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Attendance obj = new Attendance();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Attendance obj : object) {
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
                                    public void create__attendances( Attendance data,  RestAdapter restAdapter, final ObjectCallback<Attendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__attendances( (String)that.getId(), data.convertMap(),  new ObjectCallback<Attendance> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Attendance object) {
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
                                    public void delete__attendances( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__attendances( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__attendances( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__attendances( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Other>  others ;

                    public DataList< Other > getOthers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            OtherRepository otherRepository = (OtherRepository) getRepository();

                            if(that.getId() != null && otherRepository.getDb() != null){

                                 //Fetch locally from db
                                 //others = getOthers__db(restAdapter);
                                 // Getting single cont
                                 others = otherRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return others;
                    }

                    public void setOthers(DataList<Other> others) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: others){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setOthers1(hashMaps);
                        }else{
                            this.others = others;
                            //TODO: Warning move this to new thread
                            for(Other data: others){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setOthers1(List<Map<String, Object>> others) {
                        //First create a dummy Repo class object for ..
                        OtherRepository othersRepository = new OtherRepository();
                        List<Other> result = new ArrayList<>();
                        for (Map<String, Object> obj : others) {
                            //Also add relation to child type for two way communication..
                            Other obj1 = othersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setOthers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setOthers1(DataList<HashMap<String, Object>> others) {
                        //First create a dummy Repo class object for ..
                        OtherRepository othersRepository = new OtherRepository();
                        DataList<Other> result = new DataList<>();
                        for (HashMap<String, Object> obj : others) {
                            //Also add relation to child type for two way communication..
                            Other obj1 = othersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setOthers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Other> others, Other dummyClassInstance) {
                        that.setOthers(others);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Other others) {
                        try{
                            try{

                                  //Save to database..
                                  others.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getOthers().add(others);
                        }catch(Exception e){
                            DataList< Other> others1 = new DataList();
                            //Now add this item to list..
                            others1.add(others);
                            //Now set data....
                            that.setOthers(others1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__others( String fk,  RestAdapter restAdapter, final ObjectCallback<Other> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__others( (String)that.getId(), fk,  new ObjectCallback<Other> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Other object) {
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
                                    public void destroyById__others( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__others( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__others( String fk,  Other data,  RestAdapter restAdapter, final ObjectCallback<Other> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__others( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Other> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Other object) {
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
                                    public void get__others( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Other> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__others( (String)that.getId(), filter,  new DataListCallback<Other> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Other> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Other obj = new Other();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Other obj : object) {
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
                                    public void create__others( Other data,  RestAdapter restAdapter, final ObjectCallback<Other> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__others( (String)that.getId(), data.convertMap(),  new ObjectCallback<Other> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Other object) {
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
                                    public void delete__others( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__others( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__others( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__others( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<Reminder>  reminders ;

                    public DataList< Reminder > getReminders() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            ReminderRepository reminderRepository = (ReminderRepository) getRepository();

                            if(that.getId() != null && reminderRepository.getDb() != null){

                                 //Fetch locally from db
                                 //reminders = getReminders__db(restAdapter);
                                 // Getting single cont
                                 reminders = reminderRepository.getDb().getAll__db("adminId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return reminders;
                    }

                    public void setReminders(DataList<Reminder> reminders) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: reminders){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setReminders1(hashMaps);
                        }else{
                            this.reminders = reminders;
                            //TODO: Warning move this to new thread
                            for(Reminder data: reminders){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setReminders1(List<Map<String, Object>> reminders) {
                        //First create a dummy Repo class object for ..
                        ReminderRepository remindersRepository = new ReminderRepository();
                        List<Reminder> result = new ArrayList<>();
                        for (Map<String, Object> obj : reminders) {
                            //Also add relation to child type for two way communication..
                            Reminder obj1 = remindersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setReminders(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setReminders1(DataList<HashMap<String, Object>> reminders) {
                        //First create a dummy Repo class object for ..
                        ReminderRepository remindersRepository = new ReminderRepository();
                        DataList<Reminder> result = new DataList<>();
                        for (HashMap<String, Object> obj : reminders) {
                            //Also add relation to child type for two way communication..
                            Reminder obj1 = remindersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setReminders(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Reminder> reminders, Reminder dummyClassInstance) {
                        that.setReminders(reminders);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Reminder reminders) {
                        try{
                            try{

                                  //Save to database..
                                  reminders.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getReminders().add(reminders);
                        }catch(Exception e){
                            DataList< Reminder> reminders1 = new DataList();
                            //Now add this item to list..
                            reminders1.add(reminders);
                            //Now set data....
                            that.setReminders(reminders1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__reminders( String fk,  RestAdapter restAdapter, final ObjectCallback<Reminder> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.findById__reminders( (String)that.getId(), fk,  new ObjectCallback<Reminder> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Reminder object) {
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
                                    public void destroyById__reminders( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.destroyById__reminders( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__reminders( String fk,  Reminder data,  RestAdapter restAdapter, final ObjectCallback<Reminder> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.updateById__reminders( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Reminder> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Reminder object) {
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
                                    public void get__reminders( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Reminder> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.get__reminders( (String)that.getId(), filter,  new DataListCallback<Reminder> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Reminder> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Reminder obj = new Reminder();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Reminder obj : object) {
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
                                    public void create__reminders( Reminder data,  RestAdapter restAdapter, final ObjectCallback<Reminder> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.create__reminders( (String)that.getId(), data.convertMap(),  new ObjectCallback<Reminder> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Reminder object) {
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
                                    public void delete__reminders( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        



                                        adminRepo.delete__reminders( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__reminders( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AdminRepository  adminRepo = restAdapter.createRepository(AdminRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        adminRepo.count__reminders( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
