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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentOtherRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.OtherRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class StudentOther extends Model {


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

    private StudentOther that ;

    public StudentOther (){
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
      StudentOtherRepository lowercaseFirstLetterRepository = (StudentOtherRepository) getRepository();
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
      StudentOtherRepository lowercaseFirstLetterRepository = (StudentOtherRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      StudentOtherRepository lowercaseFirstLetterRepository = (StudentOtherRepository) getRepository();
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
		                  StudentOtherRepository studentOtherRepository = (StudentOtherRepository) getRepository();

		                  RestAdapter restAdapter = studentOtherRepository.getRestAdapter();
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
				StudentOtherRepository lowercaseFirstLetterRepository = (StudentOtherRepository) getRepository();
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
                                        final StudentOtherRepository  studentOtherRepo = restAdapter.createRepository(StudentOtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentOtherRepo.get__student( (String)that.getId(), refresh,  new ObjectCallback<Student> (){
                                            

                                            
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
                                 
                            
                         
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
    
        
        
                
                    //Define belongsTo relation method here..
                    private transient Other  other ;
                    private String otherId;

                    public String getOtherId(){
                         return otherId;
                    }

                    public void setOtherId(Object otherId){
                        if(otherId != null){
                          this.otherId = otherId.toString();
                        }
                    }

                    public Other getOther() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(other == null){
		                  StudentOtherRepository studentOtherRepository = (StudentOtherRepository) getRepository();

		                  RestAdapter restAdapter = studentOtherRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    other = getOther__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return other;
                    }

                    public void setOther(Other other) {
                        this.other = other;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOther(Map<String, Object> other) {
                        //First create a dummy Repo class object for customer.
                        OtherRepository otherRepository = new OtherRepository();
                        Other other1 = otherRepository.createObject(other);
                        setOther(other1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setOther(HashMap<String, Object> other) {
                        //First create a dummy Repo class object for customer.
                        OtherRepository otherRepository = new OtherRepository();
                        Other other1 = otherRepository.createObject(other);
                        setOther(other1);
                    }

                    //Adding relation method..
                    public void addRelation(Other other) {
                        that.setOther(other);
                    }


                    //Fetch related data from local database if present a otherId identifier as property for belongsTo
                    public Other getOther__db(RestAdapter restAdapter){
                      if(otherId != null){
                        OtherRepository otherRepository = restAdapter.createRepository(OtherRepository.class);
			  try{
				StudentOtherRepository lowercaseFirstLetterRepository = (StudentOtherRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(otherRepository.getDb() == null ){
		                            otherRepository.addStorage(context);
		                        }

		                        if(context != null && otherRepository.getDb() != null){
		                            otherRepository.addStorage(context);
		                            Other other = (Other) otherRepository.getDb().get__db(otherId);
		                            return other;
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
                                    public void get__other( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Other> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentOtherRepository  studentOtherRepo = restAdapter.createRepository(StudentOtherRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentOtherRepo.get__other( (String)that.getId(), refresh,  new ObjectCallback<Other> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
