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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentHomeworkRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HomeWorkRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class StudentHomework extends Model {


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

    private StudentHomework that ;

    public StudentHomework (){
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

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      StudentHomeworkRepository lowercaseFirstLetterRepository = (StudentHomeworkRepository) getRepository();
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
      StudentHomeworkRepository lowercaseFirstLetterRepository = (StudentHomeworkRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      StudentHomeworkRepository lowercaseFirstLetterRepository = (StudentHomeworkRepository) getRepository();
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
                    private transient HomeWork  homeWork ;
                    private String homeWorkId;

                    public String getHomeWorkId(){
                         return homeWorkId;
                    }

                    public void setHomeWorkId(Object homeWorkId){
                        if(homeWorkId != null){
                          this.homeWorkId = homeWorkId.toString();
                        }
                    }

                    public HomeWork getHomeWork() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(homeWork == null){
		                  StudentHomeworkRepository studentHomeworkRepository = (StudentHomeworkRepository) getRepository();

		                  RestAdapter restAdapter = studentHomeworkRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    homeWork = getHomeWork__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return homeWork;
                    }

                    public void setHomeWork(HomeWork homeWork) {
                        this.homeWork = homeWork;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHomeWork(Map<String, Object> homeWork) {
                        //First create a dummy Repo class object for customer.
                        HomeWorkRepository homeWorkRepository = new HomeWorkRepository();
                        HomeWork homeWork1 = homeWorkRepository.createObject(homeWork);
                        setHomeWork(homeWork1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHomeWork(HashMap<String, Object> homeWork) {
                        //First create a dummy Repo class object for customer.
                        HomeWorkRepository homeWorkRepository = new HomeWorkRepository();
                        HomeWork homeWork1 = homeWorkRepository.createObject(homeWork);
                        setHomeWork(homeWork1);
                    }

                    //Adding relation method..
                    public void addRelation(HomeWork homeWork) {
                        that.setHomeWork(homeWork);
                    }


                    //Fetch related data from local database if present a homeWorkId identifier as property for belongsTo
                    public HomeWork getHomeWork__db(RestAdapter restAdapter){
                      if(homeWorkId != null){
                        HomeWorkRepository homeWorkRepository = restAdapter.createRepository(HomeWorkRepository.class);
			  try{
				StudentHomeworkRepository lowercaseFirstLetterRepository = (StudentHomeworkRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(homeWorkRepository.getDb() == null ){
		                            homeWorkRepository.addStorage(context);
		                        }

		                        if(context != null && homeWorkRepository.getDb() != null){
		                            homeWorkRepository.addStorage(context);
		                            HomeWork homeWork = (HomeWork) homeWorkRepository.getDb().get__db(homeWorkId);
		                            return homeWork;
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
                                    public void get__homeWork( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<HomeWork> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentHomeworkRepository  studentHomeworkRepo = restAdapter.createRepository(StudentHomeworkRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentHomeworkRepo.get__homeWork( (String)that.getId(), refresh,  new ObjectCallback<HomeWork> (){
                                            

                                            
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
		                  StudentHomeworkRepository studentHomeworkRepository = (StudentHomeworkRepository) getRepository();

		                  RestAdapter restAdapter = studentHomeworkRepository.getRestAdapter();
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
				StudentHomeworkRepository lowercaseFirstLetterRepository = (StudentHomeworkRepository) getRepository();
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
                                        final StudentHomeworkRepository  studentHomeworkRepo = restAdapter.createRepository(StudentHomeworkRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentHomeworkRepo.get__student( (String)that.getId(), refresh,  new ObjectCallback<Student> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
