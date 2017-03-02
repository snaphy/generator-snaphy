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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentRepository;

//Now import repository of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SchoolRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AinakClassAndSectionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ParentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.QuestionRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AnswerRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.BlogRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ReminderRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentMessageRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentAttendanceRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentHomeworkRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentOtherRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Student extends User {


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

    private Student that ;

    public Student (){
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

            
            
        
    
        
            

            
                private String rollNumber;
                /* Adding Getter and Setter methods */
                public String getRollNumber(){
                    return rollNumber;
                }

                /* Adding Getter and Setter methods */
                public void setRollNumber(String rollNumber){
                    this.rollNumber = rollNumber;
                    //Update hashMap value..
                    hashMap.put("rollNumber", rollNumber);
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

            
            
        
    
        
            

            
                private String studentOccupation;
                /* Adding Getter and Setter methods */
                public String getStudentOccupation(){
                    return studentOccupation;
                }

                /* Adding Getter and Setter methods */
                public void setStudentOccupation(String studentOccupation){
                    this.studentOccupation = studentOccupation;
                    //Update hashMap value..
                    hashMap.put("studentOccupation", studentOccupation);
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
      StudentRepository lowercaseFirstLetterRepository = (StudentRepository) getRepository();
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
      StudentRepository lowercaseFirstLetterRepository = (StudentRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      StudentRepository lowercaseFirstLetterRepository = (StudentRepository) getRepository();
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
		                  StudentRepository studentRepository = (StudentRepository) getRepository();

		                  RestAdapter restAdapter = studentRepository.getRestAdapter();
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
				StudentRepository lowercaseFirstLetterRepository = (StudentRepository) getRepository();
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__school( (String)that.getId(), refresh,  new ObjectCallback<School> (){
                                            

                                            
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
		                  StudentRepository studentRepository = (StudentRepository) getRepository();

		                  RestAdapter restAdapter = studentRepository.getRestAdapter();
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
				StudentRepository lowercaseFirstLetterRepository = (StudentRepository) getRepository();
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__ainakClassAndSection( (String)that.getId(), refresh,  new ObjectCallback<AinakClassAndSection> (){
                                            

                                            
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
		                  StudentRepository studentRepository = (StudentRepository) getRepository();

		                  RestAdapter restAdapter = studentRepository.getRestAdapter();
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
				StudentRepository lowercaseFirstLetterRepository = (StudentRepository) getRepository();
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__parent( (String)that.getId(), refresh,  new ObjectCallback<Parent> (){
                                            

                                            
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
                                 questions = questionRepository.getDb().getAll__db("studentId", that.getId().toString());

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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.findById__questions( (String)that.getId(), fk,  new ObjectCallback<Question> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.destroyById__questions( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.updateById__questions( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Question> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__questions( (String)that.getId(), filter,  new DataListCallback<Question> (){
                                            

                                            


                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.create__questions( (String)that.getId(), data.convertMap(),  new ObjectCallback<Question> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        



                                        studentRepo.delete__questions( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.count__questions( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 answers = answerRepository.getDb().getAll__db("studentId", that.getId().toString());

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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.findById__answers( (String)that.getId(), fk,  new ObjectCallback<Answer> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.destroyById__answers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.updateById__answers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Answer> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__answers( (String)that.getId(), filter,  new DataListCallback<Answer> (){
                                            

                                            


                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.create__answers( (String)that.getId(), data.convertMap(),  new ObjectCallback<Answer> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        



                                        studentRepo.delete__answers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.count__answers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 blogs = blogRepository.getDb().getAll__db("studentId", that.getId().toString());

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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.findById__blogs( (String)that.getId(), fk,  new ObjectCallback<Blog> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.destroyById__blogs( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.updateById__blogs( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Blog> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__blogs( (String)that.getId(), filter,  new DataListCallback<Blog> (){
                                            

                                            


                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.create__blogs( (String)that.getId(), data.convertMap(),  new ObjectCallback<Blog> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        



                                        studentRepo.delete__blogs( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.count__blogs( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 reminders = reminderRepository.getDb().getAll__db("studentId", that.getId().toString());

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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.findById__reminders( (String)that.getId(), fk,  new ObjectCallback<Reminder> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.destroyById__reminders( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.updateById__reminders( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Reminder> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__reminders( (String)that.getId(), filter,  new DataListCallback<Reminder> (){
                                            

                                            


                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.create__reminders( (String)that.getId(), data.convertMap(),  new ObjectCallback<Reminder> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        



                                        studentRepo.delete__reminders( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.count__reminders( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 studentMessages = studentMessageRepository.getDb().getAll__db("studentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.findById__studentMessages( (String)that.getId(), fk,  new ObjectCallback<StudentMessage> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.destroyById__studentMessages( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.updateById__studentMessages( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<StudentMessage> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__studentMessages( (String)that.getId(), filter,  new DataListCallback<StudentMessage> (){
                                            

                                            


                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.create__studentMessages( (String)that.getId(), data.convertMap(),  new ObjectCallback<StudentMessage> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        



                                        studentRepo.delete__studentMessages( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.count__studentMessages( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<StudentAttendance>  studentAttendances ;

                    public DataList< StudentAttendance > getStudentAttendances() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            StudentAttendanceRepository studentAttendanceRepository = (StudentAttendanceRepository) getRepository();

                            if(that.getId() != null && studentAttendanceRepository.getDb() != null){

                                 //Fetch locally from db
                                 //studentAttendances = getStudentAttendances__db(restAdapter);
                                 // Getting single cont
                                 studentAttendances = studentAttendanceRepository.getDb().getAll__db("studentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return studentAttendances;
                    }

                    public void setStudentAttendances(DataList<StudentAttendance> studentAttendances) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: studentAttendances){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setStudentAttendances1(hashMaps);
                        }else{
                            this.studentAttendances = studentAttendances;
                            //TODO: Warning move this to new thread
                            for(StudentAttendance data: studentAttendances){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudentAttendances1(List<Map<String, Object>> studentAttendances) {
                        //First create a dummy Repo class object for ..
                        StudentAttendanceRepository studentAttendancesRepository = new StudentAttendanceRepository();
                        List<StudentAttendance> result = new ArrayList<>();
                        for (Map<String, Object> obj : studentAttendances) {
                            //Also add relation to child type for two way communication..
                            StudentAttendance obj1 = studentAttendancesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudentAttendances(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudentAttendances1(DataList<HashMap<String, Object>> studentAttendances) {
                        //First create a dummy Repo class object for ..
                        StudentAttendanceRepository studentAttendancesRepository = new StudentAttendanceRepository();
                        DataList<StudentAttendance> result = new DataList<>();
                        for (HashMap<String, Object> obj : studentAttendances) {
                            //Also add relation to child type for two way communication..
                            StudentAttendance obj1 = studentAttendancesRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudentAttendances(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<StudentAttendance> studentAttendances, StudentAttendance dummyClassInstance) {
                        that.setStudentAttendances(studentAttendances);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(StudentAttendance studentAttendances) {
                        try{
                            try{

                                  //Save to database..
                                  studentAttendances.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getStudentAttendances().add(studentAttendances);
                        }catch(Exception e){
                            DataList< StudentAttendance> studentAttendances1 = new DataList();
                            //Now add this item to list..
                            studentAttendances1.add(studentAttendances);
                            //Now set data....
                            that.setStudentAttendances(studentAttendances1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__studentAttendances( String fk,  RestAdapter restAdapter, final ObjectCallback<StudentAttendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.findById__studentAttendances( (String)that.getId(), fk,  new ObjectCallback<StudentAttendance> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentAttendance object) {
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
                                    public void destroyById__studentAttendances( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.destroyById__studentAttendances( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__studentAttendances( String fk,  StudentAttendance data,  RestAdapter restAdapter, final ObjectCallback<StudentAttendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.updateById__studentAttendances( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<StudentAttendance> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentAttendance object) {
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
                                    public void get__studentAttendances( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<StudentAttendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__studentAttendances( (String)that.getId(), filter,  new DataListCallback<StudentAttendance> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<StudentAttendance> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            StudentAttendance obj = new StudentAttendance();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (StudentAttendance obj : object) {
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
                                    public void create__studentAttendances( StudentAttendance data,  RestAdapter restAdapter, final ObjectCallback<StudentAttendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.create__studentAttendances( (String)that.getId(), data.convertMap(),  new ObjectCallback<StudentAttendance> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentAttendance object) {
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
                                    public void delete__studentAttendances( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        



                                        studentRepo.delete__studentAttendances( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__studentAttendances( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.count__studentAttendances( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                    private transient DataList<StudentHomework>  studentHomeworks ;

                    public DataList< StudentHomework > getStudentHomeworks() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            StudentHomeworkRepository studentHomeworkRepository = (StudentHomeworkRepository) getRepository();

                            if(that.getId() != null && studentHomeworkRepository.getDb() != null){

                                 //Fetch locally from db
                                 //studentHomeworks = getStudentHomeworks__db(restAdapter);
                                 // Getting single cont
                                 studentHomeworks = studentHomeworkRepository.getDb().getAll__db("studentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return studentHomeworks;
                    }

                    public void setStudentHomeworks(DataList<StudentHomework> studentHomeworks) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: studentHomeworks){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setStudentHomeworks1(hashMaps);
                        }else{
                            this.studentHomeworks = studentHomeworks;
                            //TODO: Warning move this to new thread
                            for(StudentHomework data: studentHomeworks){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudentHomeworks1(List<Map<String, Object>> studentHomeworks) {
                        //First create a dummy Repo class object for ..
                        StudentHomeworkRepository studentHomeworksRepository = new StudentHomeworkRepository();
                        List<StudentHomework> result = new ArrayList<>();
                        for (Map<String, Object> obj : studentHomeworks) {
                            //Also add relation to child type for two way communication..
                            StudentHomework obj1 = studentHomeworksRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudentHomeworks(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudentHomeworks1(DataList<HashMap<String, Object>> studentHomeworks) {
                        //First create a dummy Repo class object for ..
                        StudentHomeworkRepository studentHomeworksRepository = new StudentHomeworkRepository();
                        DataList<StudentHomework> result = new DataList<>();
                        for (HashMap<String, Object> obj : studentHomeworks) {
                            //Also add relation to child type for two way communication..
                            StudentHomework obj1 = studentHomeworksRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudentHomeworks(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<StudentHomework> studentHomeworks, StudentHomework dummyClassInstance) {
                        that.setStudentHomeworks(studentHomeworks);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(StudentHomework studentHomeworks) {
                        try{
                            try{

                                  //Save to database..
                                  studentHomeworks.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getStudentHomeworks().add(studentHomeworks);
                        }catch(Exception e){
                            DataList< StudentHomework> studentHomeworks1 = new DataList();
                            //Now add this item to list..
                            studentHomeworks1.add(studentHomeworks);
                            //Now set data....
                            that.setStudentHomeworks(studentHomeworks1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                         
                            
                        

                                    //Write the method here..
                                    public void findById__studentHomeworks( String fk,  RestAdapter restAdapter, final ObjectCallback<StudentHomework> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.findById__studentHomeworks( (String)that.getId(), fk,  new ObjectCallback<StudentHomework> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentHomework object) {
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
                                    public void destroyById__studentHomeworks( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.destroyById__studentHomeworks( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__studentHomeworks( String fk,  StudentHomework data,  RestAdapter restAdapter, final ObjectCallback<StudentHomework> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.updateById__studentHomeworks( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<StudentHomework> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentHomework object) {
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
                                    public void get__studentHomeworks( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<StudentHomework> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__studentHomeworks( (String)that.getId(), filter,  new DataListCallback<StudentHomework> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<StudentHomework> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            StudentHomework obj = new StudentHomework();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (StudentHomework obj : object) {
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
                                    public void create__studentHomeworks( StudentHomework data,  RestAdapter restAdapter, final ObjectCallback<StudentHomework> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.create__studentHomeworks( (String)that.getId(), data.convertMap(),  new ObjectCallback<StudentHomework> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(StudentHomework object) {
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
                                    public void delete__studentHomeworks( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        



                                        studentRepo.delete__studentHomeworks( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__studentHomeworks( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.count__studentHomeworks( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
                                 studentOthers = studentOtherRepository.getDb().getAll__db("studentId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.findById__studentOthers( (String)that.getId(), fk,  new ObjectCallback<StudentOther> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.destroyById__studentOthers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.updateById__studentOthers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<StudentOther> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.get__studentOthers( (String)that.getId(), filter,  new DataListCallback<StudentOther> (){
                                            

                                            


                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.create__studentOthers( (String)that.getId(), data.convertMap(),  new ObjectCallback<StudentOther> (){
                                            

                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        



                                        studentRepo.delete__studentOthers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                        final StudentRepository  studentRepo = restAdapter.createRepository(StudentRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentRepo.count__studentOthers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
