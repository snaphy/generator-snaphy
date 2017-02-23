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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentAttendanceRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.AttendanceRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class StudentAttendance extends Model {


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

    private StudentAttendance that ;

    public StudentAttendance (){
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
      StudentAttendanceRepository lowercaseFirstLetterRepository = (StudentAttendanceRepository) getRepository();
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
      StudentAttendanceRepository lowercaseFirstLetterRepository = (StudentAttendanceRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      StudentAttendanceRepository lowercaseFirstLetterRepository = (StudentAttendanceRepository) getRepository();
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
		                  StudentAttendanceRepository studentAttendanceRepository = (StudentAttendanceRepository) getRepository();

		                  RestAdapter restAdapter = studentAttendanceRepository.getRestAdapter();
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
				StudentAttendanceRepository lowercaseFirstLetterRepository = (StudentAttendanceRepository) getRepository();
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
                                        final StudentAttendanceRepository  studentAttendanceRepo = restAdapter.createRepository(StudentAttendanceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentAttendanceRepo.get__student( (String)that.getId(), refresh,  new ObjectCallback<Student> (){
                                            

                                            
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
                    private transient Attendance  attendance ;
                    private String attendanceId;

                    public String getAttendanceId(){
                         return attendanceId;
                    }

                    public void setAttendanceId(Object attendanceId){
                        if(attendanceId != null){
                          this.attendanceId = attendanceId.toString();
                        }
                    }

                    public Attendance getAttendance() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(attendance == null){
		                  StudentAttendanceRepository studentAttendanceRepository = (StudentAttendanceRepository) getRepository();

		                  RestAdapter restAdapter = studentAttendanceRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    attendance = getAttendance__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return attendance;
                    }

                    public void setAttendance(Attendance attendance) {
                        this.attendance = attendance;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAttendance(Map<String, Object> attendance) {
                        //First create a dummy Repo class object for customer.
                        AttendanceRepository attendanceRepository = new AttendanceRepository();
                        Attendance attendance1 = attendanceRepository.createObject(attendance);
                        setAttendance(attendance1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setAttendance(HashMap<String, Object> attendance) {
                        //First create a dummy Repo class object for customer.
                        AttendanceRepository attendanceRepository = new AttendanceRepository();
                        Attendance attendance1 = attendanceRepository.createObject(attendance);
                        setAttendance(attendance1);
                    }

                    //Adding relation method..
                    public void addRelation(Attendance attendance) {
                        that.setAttendance(attendance);
                    }


                    //Fetch related data from local database if present a attendanceId identifier as property for belongsTo
                    public Attendance getAttendance__db(RestAdapter restAdapter){
                      if(attendanceId != null){
                        AttendanceRepository attendanceRepository = restAdapter.createRepository(AttendanceRepository.class);
			  try{
				StudentAttendanceRepository lowercaseFirstLetterRepository = (StudentAttendanceRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(attendanceRepository.getDb() == null ){
		                            attendanceRepository.addStorage(context);
		                        }

		                        if(context != null && attendanceRepository.getDb() != null){
		                            attendanceRepository.addStorage(context);
		                            Attendance attendance = (Attendance) attendanceRepository.getDb().get__db(attendanceId);
		                            return attendance;
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
                                    public void get__attendance( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Attendance> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final StudentAttendanceRepository  studentAttendanceRepo = restAdapter.createRepository(StudentAttendanceRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        studentAttendanceRepo.get__attendance( (String)that.getId(), refresh,  new ObjectCallback<Attendance> (){
                                            

                                            
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
                                 
                            
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    

                

                 
                 
             
          
      

}
