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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.NoticeRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SchoolRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AdminRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeacherRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Notice extends Model {


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

    private Notice that ;

    public Notice (){
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      NoticeRepository lowercaseFirstLetterRepository = (NoticeRepository) getRepository();
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
      NoticeRepository lowercaseFirstLetterRepository = (NoticeRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      NoticeRepository lowercaseFirstLetterRepository = (NoticeRepository) getRepository();
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
		                  NoticeRepository noticeRepository = (NoticeRepository) getRepository();

		                  RestAdapter restAdapter = noticeRepository.getRestAdapter();
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
				NoticeRepository lowercaseFirstLetterRepository = (NoticeRepository) getRepository();
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
                                        final NoticeRepository  noticeRepo = restAdapter.createRepository(NoticeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        noticeRepo.get__school( (String)that.getId(), refresh,  new ObjectCallback<School> (){
                                            

                                            
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
		                  NoticeRepository noticeRepository = (NoticeRepository) getRepository();

		                  RestAdapter restAdapter = noticeRepository.getRestAdapter();
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
				NoticeRepository lowercaseFirstLetterRepository = (NoticeRepository) getRepository();
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
                                        final NoticeRepository  noticeRepo = restAdapter.createRepository(NoticeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        noticeRepo.get__admin( (String)that.getId(), refresh,  new ObjectCallback<Admin> (){
                                            

                                            
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
		                  NoticeRepository noticeRepository = (NoticeRepository) getRepository();

		                  RestAdapter restAdapter = noticeRepository.getRestAdapter();
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
				NoticeRepository lowercaseFirstLetterRepository = (NoticeRepository) getRepository();
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
                                        final NoticeRepository  noticeRepo = restAdapter.createRepository(NoticeRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        noticeRepo.get__teacher( (String)that.getId(), refresh,  new ObjectCallback<Teacher> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
