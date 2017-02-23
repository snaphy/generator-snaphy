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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.MessageRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SchoolRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AdminRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AinakClassAndSectionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeacherRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeacherMessageRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentMessageRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Message extends Model {


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

    private Message that ;

    public Message (){
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      MessageRepository lowercaseFirstLetterRepository = (MessageRepository) getRepository();
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
      MessageRepository lowercaseFirstLetterRepository = (MessageRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      MessageRepository lowercaseFirstLetterRepository = (MessageRepository) getRepository();
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
		                  MessageRepository messageRepository = (MessageRepository) getRepository();

		                  RestAdapter restAdapter = messageRepository.getRestAdapter();
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
				MessageRepository lowercaseFirstLetterRepository = (MessageRepository) getRepository();
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
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.get__school( (String)that.getId(), refresh,  new ObjectCallback<School> (){
                                            

                                            
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
		                  MessageRepository messageRepository = (MessageRepository) getRepository();

		                  RestAdapter restAdapter = messageRepository.getRestAdapter();
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
				MessageRepository lowercaseFirstLetterRepository = (MessageRepository) getRepository();
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
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.get__admin( (String)that.getId(), refresh,  new ObjectCallback<Admin> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient AinakClassAndSection  ainakClassAndSection ;
                    private String ainakClassAndSectionId;

                    public String getAinakClassAndSectionId(){
                         return ainakClassAndSectionId;
                    }

                    public void setAinakClassAndSectionId(Object ainakClassAndSectionId){
                        if(ainakClassAndSectionId != null){
                          this.ainakClassAndSectionId = ainakClassAndSectionId.toString();
                        }
                    }

                    public AinakClassAndSection getAinakClassAndSection() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(ainakClassAndSection == null){
		                  MessageRepository messageRepository = (MessageRepository) getRepository();

		                  RestAdapter restAdapter = messageRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    ainakClassAndSection = getAinakClassAndSection__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return ainakClassAndSection;
                    }

                    public void setAinakClassAndSection(AinakClassAndSection ainakClassAndSection) {
                        this.ainakClassAndSection = ainakClassAndSection;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAinakClassAndSection(Map<String, Object> ainakClassAndSection) {
                        //First create a dummy Repo class object for customer.
                        AinakClassAndSectionRepository ainakClassAndSectionRepository = new AinakClassAndSectionRepository();
                        AinakClassAndSection ainakClassAndSection1 = ainakClassAndSectionRepository.createObject(ainakClassAndSection);
                        setAinakClassAndSection(ainakClassAndSection1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAinakClassAndSection(HashMap<String, Object> ainakClassAndSection) {
                        //First create a dummy Repo class object for customer.
                        AinakClassAndSectionRepository ainakClassAndSectionRepository = new AinakClassAndSectionRepository();
                        AinakClassAndSection ainakClassAndSection1 = ainakClassAndSectionRepository.createObject(ainakClassAndSection);
                        setAinakClassAndSection(ainakClassAndSection1);
                    }

                    //Adding relation method..
                    public void addRelation(AinakClassAndSection ainakClassAndSection) {
                        that.setAinakClassAndSection(ainakClassAndSection);
                    }


                    //Fetch related data from local database if present a ainakClassAndSectionId identifier as property for belongsTo
                    public AinakClassAndSection getAinakClassAndSection__db(RestAdapter restAdapter){
                      if(ainakClassAndSectionId != null){
                        AinakClassAndSectionRepository ainakClassAndSectionRepository = restAdapter.createRepository(AinakClassAndSectionRepository.class);
			  try{
				MessageRepository lowercaseFirstLetterRepository = (MessageRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(ainakClassAndSectionRepository.getDb() == null ){
		                            ainakClassAndSectionRepository.addStorage(context);
		                        }

		                        if(context != null && ainakClassAndSectionRepository.getDb() != null){
		                            ainakClassAndSectionRepository.addStorage(context);
		                            AinakClassAndSection ainakClassAndSection = (AinakClassAndSection) ainakClassAndSectionRepository.getDb().get__db(ainakClassAndSectionId);
		                            return ainakClassAndSection;
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
                                    public void get__ainakClassAndSection( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<AinakClassAndSection> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.get__ainakClassAndSection( (String)that.getId(), refresh,  new ObjectCallback<AinakClassAndSection> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(AinakClassAndSection object) {
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
                    private transient Teacher  teacher ;
                    private String teacherId;

                    public String getTeacherId(){
                         return teacherId;
                    }

                    public void setTeacherId(Object teacherId){
                        if(teacherId != null){
                          this.teacherId = teacherId.toString();
                        }
                    }

                    public Teacher getTeacher() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(teacher == null){
		                  MessageRepository messageRepository = (MessageRepository) getRepository();

		                  RestAdapter restAdapter = messageRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    teacher = getTeacher__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return teacher;
                    }

                    public void setTeacher(Teacher teacher) {
                        this.teacher = teacher;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTeacher(Map<String, Object> teacher) {
                        //First create a dummy Repo class object for customer.
                        TeacherRepository teacherRepository = new TeacherRepository();
                        Teacher teacher1 = teacherRepository.createObject(teacher);
                        setTeacher(teacher1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTeacher(HashMap<String, Object> teacher) {
                        //First create a dummy Repo class object for customer.
                        TeacherRepository teacherRepository = new TeacherRepository();
                        Teacher teacher1 = teacherRepository.createObject(teacher);
                        setTeacher(teacher1);
                    }

                    //Adding relation method..
                    public void addRelation(Teacher teacher) {
                        that.setTeacher(teacher);
                    }


                    //Fetch related data from local database if present a teacherId identifier as property for belongsTo
                    public Teacher getTeacher__db(RestAdapter restAdapter){
                      if(teacherId != null){
                        TeacherRepository teacherRepository = restAdapter.createRepository(TeacherRepository.class);
			  try{
				MessageRepository lowercaseFirstLetterRepository = (MessageRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(teacherRepository.getDb() == null ){
		                            teacherRepository.addStorage(context);
		                        }

		                        if(context != null && teacherRepository.getDb() != null){
		                            teacherRepository.addStorage(context);
		                            Teacher teacher = (Teacher) teacherRepository.getDb().get__db(teacherId);
		                            return teacher;
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
                                    public void get__teacher( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Teacher> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.get__teacher( (String)that.getId(), refresh,  new ObjectCallback<Teacher> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Teacher object) {
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
                    private transient DataList<TeacherMessage>  teacherMessages ;

                    public DataList< TeacherMessage > getTeacherMessages() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            TeacherMessageRepository teacherMessageRepository = (TeacherMessageRepository) getRepository();

                            if(that.getId() != null && teacherMessageRepository.getDb() != null){

                                 //Fetch locally from db
                                 //teacherMessages = getTeacherMessages__db(restAdapter);
                                 // Getting single cont
                                 teacherMessages = teacherMessageRepository.getDb().getAll__db("messageId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){//Ignore}
                                                return teacherMessages;
                    }

                    public void setTeacherMessages(DataList<TeacherMessage> teacherMessages) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: teacherMessages){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setTeacherMessages1(hashMaps);
                        }else{
                            this.teacherMessages = teacherMessages;
                            //TODO: Warning move this to new thread
                            for(TeacherMessage data: teacherMessages){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTeacherMessages1(List<Map<String, Object>> teacherMessages) {
                        //First create a dummy Repo class object for ..
                        TeacherMessageRepository teacherMessagesRepository = new TeacherMessageRepository();
                        List<TeacherMessage> result = new ArrayList<>();
                        for (Map<String, Object> obj : teacherMessages) {
                            //Also add relation to child type for two way communication..
                            TeacherMessage obj1 = teacherMessagesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTeacherMessages(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTeacherMessages1(DataList<HashMap<String, Object>> teacherMessages) {
                        //First create a dummy Repo class object for ..
                        TeacherMessageRepository teacherMessagesRepository = new TeacherMessageRepository();
                        DataList<TeacherMessage> result = new DataList<>();
                        for (HashMap<String, Object> obj : teacherMessages) {
                            //Also add relation to child type for two way communication..
                            TeacherMessage obj1 = teacherMessagesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTeacherMessages(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<TeacherMessage> teacherMessages, TeacherMessage dummyClassInstance) {
                        that.setTeacherMessages(teacherMessages);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(TeacherMessage teacherMessages) {
                        try{
                            try{

                                  //Save to database..
                                  teacherMessages.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getTeacherMessages().add(teacherMessages);
                        }catch(Exception e){
                            DataList< TeacherMessage> teacherMessages1 = new DataList();
                            //Now add this item to list..
                            teacherMessages1.add(teacherMessages);
                            //Now set data....
                            that.setTeacherMessages(teacherMessages1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__teacherMessages( String fk,  RestAdapter restAdapter, final ObjectCallback<TeacherMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.findById__teacherMessages( (String)that.getId(), fk,  new ObjectCallback<TeacherMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeacherMessage object) {
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
                                    public void destroyById__teacherMessages( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.destroyById__teacherMessages( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__teacherMessages( String fk,  TeacherMessage data,  RestAdapter restAdapter, final ObjectCallback<TeacherMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.updateById__teacherMessages( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<TeacherMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeacherMessage object) {
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
                                    public void get__teacherMessages( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<TeacherMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.get__teacherMessages( (String)that.getId(), filter,  new DataListCallback<TeacherMessage> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<TeacherMessage> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            TeacherMessage obj = new TeacherMessage();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (TeacherMessage obj : object) {
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
                                    public void create__teacherMessages( TeacherMessage data,  RestAdapter restAdapter, final ObjectCallback<TeacherMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.create__teacherMessages( (String)that.getId(), data.convertMap(),  new ObjectCallback<TeacherMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeacherMessage object) {
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
                                    public void delete__teacherMessages( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        



                                        messageRepo.delete__teacherMessages( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__teacherMessages( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.count__teacherMessages( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<StudentMessage>  studentMessages ;

                    public DataList< StudentMessage > getStudentMessages() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            StudentMessageRepository studentMessageRepository = (StudentMessageRepository) getRepository();

                            if(that.getId() != null && studentMessageRepository.getDb() != null){

                                 //Fetch locally from db
                                 //studentMessages = getStudentMessages__db(restAdapter);
                                 // Getting single cont
                                 studentMessages = studentMessageRepository.getDb().getAll__db("messageId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){//Ignore}
                                                return studentMessages;
                    }

                    public void setStudentMessages(DataList<StudentMessage> studentMessages) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: studentMessages){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setStudentMessages1(hashMaps);
                        }else{
                            this.studentMessages = studentMessages;
                            //TODO: Warning move this to new thread
                            for(StudentMessage data: studentMessages){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudentMessages1(List<Map<String, Object>> studentMessages) {
                        //First create a dummy Repo class object for ..
                        StudentMessageRepository studentMessagesRepository = new StudentMessageRepository();
                        List<StudentMessage> result = new ArrayList<>();
                        for (Map<String, Object> obj : studentMessages) {
                            //Also add relation to child type for two way communication..
                            StudentMessage obj1 = studentMessagesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudentMessages(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudentMessages1(DataList<HashMap<String, Object>> studentMessages) {
                        //First create a dummy Repo class object for ..
                        StudentMessageRepository studentMessagesRepository = new StudentMessageRepository();
                        DataList<StudentMessage> result = new DataList<>();
                        for (HashMap<String, Object> obj : studentMessages) {
                            //Also add relation to child type for two way communication..
                            StudentMessage obj1 = studentMessagesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudentMessages(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<StudentMessage> studentMessages, StudentMessage dummyClassInstance) {
                        that.setStudentMessages(studentMessages);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(StudentMessage studentMessages) {
                        try{
                            try{

                                  //Save to database..
                                  studentMessages.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getStudentMessages().add(studentMessages);
                        }catch(Exception e){
                            DataList< StudentMessage> studentMessages1 = new DataList();
                            //Now add this item to list..
                            studentMessages1.add(studentMessages);
                            //Now set data....
                            that.setStudentMessages(studentMessages1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__studentMessages( String fk,  RestAdapter restAdapter, final ObjectCallback<StudentMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.findById__studentMessages( (String)that.getId(), fk,  new ObjectCallback<StudentMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentMessage object) {
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
                                    public void destroyById__studentMessages( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.destroyById__studentMessages( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__studentMessages( String fk,  StudentMessage data,  RestAdapter restAdapter, final ObjectCallback<StudentMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.updateById__studentMessages( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<StudentMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentMessage object) {
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
                                    public void get__studentMessages( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<StudentMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.get__studentMessages( (String)that.getId(), filter,  new DataListCallback<StudentMessage> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<StudentMessage> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            StudentMessage obj = new StudentMessage();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (StudentMessage obj : object) {
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
                                    public void create__studentMessages( StudentMessage data,  RestAdapter restAdapter, final ObjectCallback<StudentMessage> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.create__studentMessages( (String)that.getId(), data.convertMap(),  new ObjectCallback<StudentMessage> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentMessage object) {
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
                                    public void delete__studentMessages( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        



                                        messageRepo.delete__studentMessages( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__studentMessages( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final MessageRepository  messageRepo = restAdapter.createRepository(MessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        messageRepo.count__studentMessages( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
