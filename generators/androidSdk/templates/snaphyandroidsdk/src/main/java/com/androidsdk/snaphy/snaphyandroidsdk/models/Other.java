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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.OtherRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SchoolRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CalendarRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CustomEventRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AdminRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeacherOtherRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentOtherRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Other extends Model {


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

    private Other that ;

    public Other (){
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

            
            
        
    
        
            

            
                private String to;
                /* Adding Getter and Setter methods */
                public String getTo(){
                    return to;
                }

                /* Adding Getter and Setter methods */
                public void setTo(String to){
                    this.to = to;
                    //Update hashMap value..
                    hashMap.put("to", to);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      OtherRepository lowercaseFirstLetterRepository = (OtherRepository) getRepository();
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
      OtherRepository lowercaseFirstLetterRepository = (OtherRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      OtherRepository lowercaseFirstLetterRepository = (OtherRepository) getRepository();
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
		                  OtherRepository otherRepository = (OtherRepository) getRepository();

		                  RestAdapter restAdapter = otherRepository.getRestAdapter();
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
				OtherRepository lowercaseFirstLetterRepository = (OtherRepository) getRepository();
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
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.get__school( (String)that.getId(), refresh,  new ObjectCallback<School> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Calendar  calendar ;
                    private String calendarId;

                    public String getCalendarId(){
                         return calendarId;
                    }

                    public void setCalendarId(Object calendarId){
                        if(calendarId != null){
                          this.calendarId = calendarId.toString();
                        }
                    }

                    public Calendar getCalendar() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(calendar == null){
		                  OtherRepository otherRepository = (OtherRepository) getRepository();

		                  RestAdapter restAdapter = otherRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    calendar = getCalendar__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return calendar;
                    }

                    public void setCalendar(Calendar calendar) {
                        this.calendar = calendar;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCalendar(Map<String, Object> calendar) {
                        //First create a dummy Repo class object for customer.
                        CalendarRepository calendarRepository = new CalendarRepository();
                        Calendar calendar1 = calendarRepository.createObject(calendar);
                        setCalendar(calendar1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCalendar(HashMap<String, Object> calendar) {
                        //First create a dummy Repo class object for customer.
                        CalendarRepository calendarRepository = new CalendarRepository();
                        Calendar calendar1 = calendarRepository.createObject(calendar);
                        setCalendar(calendar1);
                    }

                    //Adding relation method..
                    public void addRelation(Calendar calendar) {
                        that.setCalendar(calendar);
                    }


                    //Fetch related data from local database if present a calendarId identifier as property for belongsTo
                    public Calendar getCalendar__db(RestAdapter restAdapter){
                      if(calendarId != null){
                        CalendarRepository calendarRepository = restAdapter.createRepository(CalendarRepository.class);
			  try{
				OtherRepository lowercaseFirstLetterRepository = (OtherRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(calendarRepository.getDb() == null ){
		                            calendarRepository.addStorage(context);
		                        }

		                        if(context != null && calendarRepository.getDb() != null){
		                            calendarRepository.addStorage(context);
		                            Calendar calendar = (Calendar) calendarRepository.getDb().get__db(calendarId);
		                            return calendar;
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
                                    public void get__calendar( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Calendar> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.get__calendar( (String)that.getId(), refresh,  new ObjectCallback<Calendar> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient CustomEvent  customEvent ;
                    private String customEventId;

                    public String getCustomEventId(){
                         return customEventId;
                    }

                    public void setCustomEventId(Object customEventId){
                        if(customEventId != null){
                          this.customEventId = customEventId.toString();
                        }
                    }

                    public CustomEvent getCustomEvent() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(customEvent == null){
		                  OtherRepository otherRepository = (OtherRepository) getRepository();

		                  RestAdapter restAdapter = otherRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    customEvent = getCustomEvent__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return customEvent;
                    }

                    public void setCustomEvent(CustomEvent customEvent) {
                        this.customEvent = customEvent;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCustomEvent(Map<String, Object> customEvent) {
                        //First create a dummy Repo class object for customer.
                        CustomEventRepository customEventRepository = new CustomEventRepository();
                        CustomEvent customEvent1 = customEventRepository.createObject(customEvent);
                        setCustomEvent(customEvent1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCustomEvent(HashMap<String, Object> customEvent) {
                        //First create a dummy Repo class object for customer.
                        CustomEventRepository customEventRepository = new CustomEventRepository();
                        CustomEvent customEvent1 = customEventRepository.createObject(customEvent);
                        setCustomEvent(customEvent1);
                    }

                    //Adding relation method..
                    public void addRelation(CustomEvent customEvent) {
                        that.setCustomEvent(customEvent);
                    }


                    //Fetch related data from local database if present a customEventId identifier as property for belongsTo
                    public CustomEvent getCustomEvent__db(RestAdapter restAdapter){
                      if(customEventId != null){
                        CustomEventRepository customEventRepository = restAdapter.createRepository(CustomEventRepository.class);
			  try{
				OtherRepository lowercaseFirstLetterRepository = (OtherRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(customEventRepository.getDb() == null ){
		                            customEventRepository.addStorage(context);
		                        }

		                        if(context != null && customEventRepository.getDb() != null){
		                            customEventRepository.addStorage(context);
		                            CustomEvent customEvent = (CustomEvent) customEventRepository.getDb().get__db(customEventId);
		                            return customEvent;
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
                                    public void get__customEvent( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<CustomEvent> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.get__customEvent( (String)that.getId(), refresh,  new ObjectCallback<CustomEvent> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Admin  admin ;
                    private String adminId;

                    public String getAdminId(){
                         return adminId;
                    }

                    public void setAdminId(Object adminId){
                        if(adminId != null){
                          this.adminId = adminId.toString();
                        }
                    }

                    public Admin getAdmin() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(admin == null){
		                  OtherRepository otherRepository = (OtherRepository) getRepository();

		                  RestAdapter restAdapter = otherRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    admin = getAdmin__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return admin;
                    }

                    public void setAdmin(Admin admin) {
                        this.admin = admin;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAdmin(Map<String, Object> admin) {
                        //First create a dummy Repo class object for customer.
                        AdminRepository adminRepository = new AdminRepository();
                        Admin admin1 = adminRepository.createObject(admin);
                        setAdmin(admin1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAdmin(HashMap<String, Object> admin) {
                        //First create a dummy Repo class object for customer.
                        AdminRepository adminRepository = new AdminRepository();
                        Admin admin1 = adminRepository.createObject(admin);
                        setAdmin(admin1);
                    }

                    //Adding relation method..
                    public void addRelation(Admin admin) {
                        that.setAdmin(admin);
                    }


                    //Fetch related data from local database if present a adminId identifier as property for belongsTo
                    public Admin getAdmin__db(RestAdapter restAdapter){
                      if(adminId != null){
                        AdminRepository adminRepository = restAdapter.createRepository(AdminRepository.class);
			  try{
				OtherRepository lowercaseFirstLetterRepository = (OtherRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(adminRepository.getDb() == null ){
		                            adminRepository.addStorage(context);
		                        }

		                        if(context != null && adminRepository.getDb() != null){
		                            adminRepository.addStorage(context);
		                            Admin admin = (Admin) adminRepository.getDb().get__db(adminId);
		                            return admin;
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
                                    public void get__admin( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Admin> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.get__admin( (String)that.getId(), refresh,  new ObjectCallback<Admin> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Admin object) {
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
                    private transient DataList<TeacherOther>  teacherOthers ;

                    public DataList< TeacherOther > getTeacherOthers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            TeacherOtherRepository teacherOtherRepository = (TeacherOtherRepository) getRepository();

                            if(that.getId() != null && teacherOtherRepository.getDb() != null){

                                 //Fetch locally from db
                                 //teacherOthers = getTeacherOthers__db(restAdapter);
                                 // Getting single cont
                                 teacherOthers = teacherOtherRepository.getDb().getAll__db("otherId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){//Ignore}
                                                return teacherOthers;
                    }

                    public void setTeacherOthers(DataList<TeacherOther> teacherOthers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: teacherOthers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setTeacherOthers1(hashMaps);
                        }else{
                            this.teacherOthers = teacherOthers;
                            //TODO: Warning move this to new thread
                            for(TeacherOther data: teacherOthers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTeacherOthers1(List<Map<String, Object>> teacherOthers) {
                        //First create a dummy Repo class object for ..
                        TeacherOtherRepository teacherOthersRepository = new TeacherOtherRepository();
                        List<TeacherOther> result = new ArrayList<>();
                        for (Map<String, Object> obj : teacherOthers) {
                            //Also add relation to child type for two way communication..
                            TeacherOther obj1 = teacherOthersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTeacherOthers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTeacherOthers1(DataList<HashMap<String, Object>> teacherOthers) {
                        //First create a dummy Repo class object for ..
                        TeacherOtherRepository teacherOthersRepository = new TeacherOtherRepository();
                        DataList<TeacherOther> result = new DataList<>();
                        for (HashMap<String, Object> obj : teacherOthers) {
                            //Also add relation to child type for two way communication..
                            TeacherOther obj1 = teacherOthersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTeacherOthers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<TeacherOther> teacherOthers, TeacherOther dummyClassInstance) {
                        that.setTeacherOthers(teacherOthers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(TeacherOther teacherOthers) {
                        try{
                            try{

                                  //Save to database..
                                  teacherOthers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getTeacherOthers().add(teacherOthers);
                        }catch(Exception e){
                            DataList< TeacherOther> teacherOthers1 = new DataList();
                            //Now add this item to list..
                            teacherOthers1.add(teacherOthers);
                            //Now set data....
                            that.setTeacherOthers(teacherOthers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__teacherOthers( String fk,  RestAdapter restAdapter, final ObjectCallback<TeacherOther> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.findById__teacherOthers( (String)that.getId(), fk,  new ObjectCallback<TeacherOther> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeacherOther object) {
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
                                    public void destroyById__teacherOthers( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.destroyById__teacherOthers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__teacherOthers( String fk,  TeacherOther data,  RestAdapter restAdapter, final ObjectCallback<TeacherOther> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.updateById__teacherOthers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<TeacherOther> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeacherOther object) {
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
                                    public void get__teacherOthers( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<TeacherOther> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.get__teacherOthers( (String)that.getId(), filter,  new DataListCallback<TeacherOther> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<TeacherOther> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            TeacherOther obj = new TeacherOther();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (TeacherOther obj : object) {
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
                                    public void create__teacherOthers( TeacherOther data,  RestAdapter restAdapter, final ObjectCallback<TeacherOther> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.create__teacherOthers( (String)that.getId(), data.convertMap(),  new ObjectCallback<TeacherOther> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeacherOther object) {
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
                                    public void delete__teacherOthers( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        



                                        otherRepo.delete__teacherOthers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__teacherOthers( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.count__teacherOthers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<StudentOther>  studentOthers ;

                    public DataList< StudentOther > getStudentOthers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            StudentOtherRepository studentOtherRepository = (StudentOtherRepository) getRepository();

                            if(that.getId() != null && studentOtherRepository.getDb() != null){

                                 //Fetch locally from db
                                 //studentOthers = getStudentOthers__db(restAdapter);
                                 // Getting single cont
                                 studentOthers = studentOtherRepository.getDb().getAll__db("otherId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){//Ignore}
                                                return studentOthers;
                    }

                    public void setStudentOthers(DataList<StudentOther> studentOthers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: studentOthers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setStudentOthers1(hashMaps);
                        }else{
                            this.studentOthers = studentOthers;
                            //TODO: Warning move this to new thread
                            for(StudentOther data: studentOthers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudentOthers1(List<Map<String, Object>> studentOthers) {
                        //First create a dummy Repo class object for ..
                        StudentOtherRepository studentOthersRepository = new StudentOtherRepository();
                        List<StudentOther> result = new ArrayList<>();
                        for (Map<String, Object> obj : studentOthers) {
                            //Also add relation to child type for two way communication..
                            StudentOther obj1 = studentOthersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudentOthers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudentOthers1(DataList<HashMap<String, Object>> studentOthers) {
                        //First create a dummy Repo class object for ..
                        StudentOtherRepository studentOthersRepository = new StudentOtherRepository();
                        DataList<StudentOther> result = new DataList<>();
                        for (HashMap<String, Object> obj : studentOthers) {
                            //Also add relation to child type for two way communication..
                            StudentOther obj1 = studentOthersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudentOthers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<StudentOther> studentOthers, StudentOther dummyClassInstance) {
                        that.setStudentOthers(studentOthers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(StudentOther studentOthers) {
                        try{
                            try{

                                  //Save to database..
                                  studentOthers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getStudentOthers().add(studentOthers);
                        }catch(Exception e){
                            DataList< StudentOther> studentOthers1 = new DataList();
                            //Now add this item to list..
                            studentOthers1.add(studentOthers);
                            //Now set data....
                            that.setStudentOthers(studentOthers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__studentOthers( String fk,  RestAdapter restAdapter, final ObjectCallback<StudentOther> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.findById__studentOthers( (String)that.getId(), fk,  new ObjectCallback<StudentOther> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentOther object) {
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
                                    public void destroyById__studentOthers( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.destroyById__studentOthers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__studentOthers( String fk,  StudentOther data,  RestAdapter restAdapter, final ObjectCallback<StudentOther> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.updateById__studentOthers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<StudentOther> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentOther object) {
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
                                    public void get__studentOthers( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<StudentOther> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.get__studentOthers( (String)that.getId(), filter,  new DataListCallback<StudentOther> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<StudentOther> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            StudentOther obj = new StudentOther();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (StudentOther obj : object) {
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
                                    public void create__studentOthers( StudentOther data,  RestAdapter restAdapter, final ObjectCallback<StudentOther> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.create__studentOthers( (String)that.getId(), data.convertMap(),  new ObjectCallback<StudentOther> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentOther object) {
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
                                    public void delete__studentOthers( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        



                                        otherRepo.delete__studentOthers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__studentOthers( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final OtherRepository  otherRepo = restAdapter.createRepository(OtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        otherRepo.count__studentOthers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
