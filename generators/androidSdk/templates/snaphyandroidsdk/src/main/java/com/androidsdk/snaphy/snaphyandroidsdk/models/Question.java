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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.QuestionRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SchoolRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AdminRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ParentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeacherRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AnswerRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Question extends Model {


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

    private Question that ;

    public Question (){
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
      QuestionRepository lowercaseFirstLetterRepository = (QuestionRepository) getRepository();
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
      QuestionRepository lowercaseFirstLetterRepository = (QuestionRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      QuestionRepository lowercaseFirstLetterRepository = (QuestionRepository) getRepository();
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
		                  QuestionRepository questionRepository = (QuestionRepository) getRepository();

		                  RestAdapter restAdapter = questionRepository.getRestAdapter();
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
				QuestionRepository lowercaseFirstLetterRepository = (QuestionRepository) getRepository();
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.get__school( (String)that.getId(), refresh,  new ObjectCallback<School> (){
                                            

                                            
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
		                  QuestionRepository questionRepository = (QuestionRepository) getRepository();

		                  RestAdapter restAdapter = questionRepository.getRestAdapter();
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
				QuestionRepository lowercaseFirstLetterRepository = (QuestionRepository) getRepository();
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.get__admin( (String)that.getId(), refresh,  new ObjectCallback<Admin> (){
                                            

                                            
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
                    private transient Parent  parent ;
                    private String parentId;

                    public String getParentId(){
                         return parentId;
                    }

                    public void setParentId(Object parentId){
                        if(parentId != null){
                          this.parentId = parentId.toString();
                        }
                    }

                    public Parent getParent() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(parent == null){
		                  QuestionRepository questionRepository = (QuestionRepository) getRepository();

		                  RestAdapter restAdapter = questionRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    parent = getParent__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return parent;
                    }

                    public void setParent(Parent parent) {
                        this.parent = parent;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setParent(Map<String, Object> parent) {
                        //First create a dummy Repo class object for customer.
                        ParentRepository parentRepository = new ParentRepository();
                        Parent parent1 = parentRepository.createObject(parent);
                        setParent(parent1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setParent(HashMap<String, Object> parent) {
                        //First create a dummy Repo class object for customer.
                        ParentRepository parentRepository = new ParentRepository();
                        Parent parent1 = parentRepository.createObject(parent);
                        setParent(parent1);
                    }

                    //Adding relation method..
                    public void addRelation(Parent parent) {
                        that.setParent(parent);
                    }


                    //Fetch related data from local database if present a parentId identifier as property for belongsTo
                    public Parent getParent__db(RestAdapter restAdapter){
                      if(parentId != null){
                        ParentRepository parentRepository = restAdapter.createRepository(ParentRepository.class);
			  try{
				QuestionRepository lowercaseFirstLetterRepository = (QuestionRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(parentRepository.getDb() == null ){
		                            parentRepository.addStorage(context);
		                        }

		                        if(context != null && parentRepository.getDb() != null){
		                            parentRepository.addStorage(context);
		                            Parent parent = (Parent) parentRepository.getDb().get__db(parentId);
		                            return parent;
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
                                    public void get__parent( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Parent> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.get__parent( (String)that.getId(), refresh,  new ObjectCallback<Parent> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Parent object) {
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
		                  QuestionRepository questionRepository = (QuestionRepository) getRepository();

		                  RestAdapter restAdapter = questionRepository.getRestAdapter();
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
				QuestionRepository lowercaseFirstLetterRepository = (QuestionRepository) getRepository();
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.get__teacher( (String)that.getId(), refresh,  new ObjectCallback<Teacher> (){
                                            

                                            
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
                                 
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Student  student ;
                    private String studentId;

                    public String getStudentId(){
                         return studentId;
                    }

                    public void setStudentId(Object studentId){
                        if(studentId != null){
                          this.studentId = studentId.toString();
                        }
                    }

                    public Student getStudent() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(student == null){
		                  QuestionRepository questionRepository = (QuestionRepository) getRepository();

		                  RestAdapter restAdapter = questionRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    student = getStudent__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return student;
                    }

                    public void setStudent(Student student) {
                        this.student = student;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setStudent(Map<String, Object> student) {
                        //First create a dummy Repo class object for customer.
                        StudentRepository studentRepository = new StudentRepository();
                        Student student1 = studentRepository.createObject(student);
                        setStudent(student1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setStudent(HashMap<String, Object> student) {
                        //First create a dummy Repo class object for customer.
                        StudentRepository studentRepository = new StudentRepository();
                        Student student1 = studentRepository.createObject(student);
                        setStudent(student1);
                    }

                    //Adding relation method..
                    public void addRelation(Student student) {
                        that.setStudent(student);
                    }


                    //Fetch related data from local database if present a studentId identifier as property for belongsTo
                    public Student getStudent__db(RestAdapter restAdapter){
                      if(studentId != null){
                        StudentRepository studentRepository = restAdapter.createRepository(StudentRepository.class);
			  try{
				QuestionRepository lowercaseFirstLetterRepository = (QuestionRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(studentRepository.getDb() == null ){
		                            studentRepository.addStorage(context);
		                        }

		                        if(context != null && studentRepository.getDb() != null){
		                            studentRepository.addStorage(context);
		                            Student student = (Student) studentRepository.getDb().get__db(studentId);
		                            return student;
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
                                    public void get__student( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Student> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.get__student( (String)that.getId(), refresh,  new ObjectCallback<Student> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Student object) {
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
                                 answers = answerRepository.getDb().getAll__db("questionId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){//Ignore}
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.findById__answers( (String)that.getId(), fk,  new ObjectCallback<Answer> (){
                                            

                                            
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.destroyById__answers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.updateById__answers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Answer> (){
                                            

                                            
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.get__answers( (String)that.getId(), filter,  new DataListCallback<Answer> (){
                                            

                                            


                                            
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.create__answers( (String)that.getId(), data.convertMap(),  new ObjectCallback<Answer> (){
                                            

                                            
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        



                                        questionRepo.delete__answers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final QuestionRepository  questionRepo = restAdapter.createRepository(QuestionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        questionRepo.count__answers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
