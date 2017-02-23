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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.AinakClassAndSectionRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.SchoolRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StudentRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class AinakClassAndSection extends Model {


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

    private AinakClassAndSection that ;

    public AinakClassAndSection (){
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

            
            
        
    
        
            

            
                private String section;
                /* Adding Getter and Setter methods */
                public String getSection(){
                    return section;
                }

                /* Adding Getter and Setter methods */
                public void setSection(String section){
                    this.section = section;
                    //Update hashMap value..
                    hashMap.put("section", section);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      AinakClassAndSectionRepository lowercaseFirstLetterRepository = (AinakClassAndSectionRepository) getRepository();
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
      AinakClassAndSectionRepository lowercaseFirstLetterRepository = (AinakClassAndSectionRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      AinakClassAndSectionRepository lowercaseFirstLetterRepository = (AinakClassAndSectionRepository) getRepository();
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
		                  AinakClassAndSectionRepository ainakClassAndSectionRepository = (AinakClassAndSectionRepository) getRepository();

		                  RestAdapter restAdapter = ainakClassAndSectionRepository.getRestAdapter();
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
				AinakClassAndSectionRepository lowercaseFirstLetterRepository = (AinakClassAndSectionRepository) getRepository();
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
                                        final AinakClassAndSectionRepository  ainakClassAndSectionRepo = restAdapter.createRepository(AinakClassAndSectionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ainakClassAndSectionRepo.get__school( (String)that.getId(), refresh,  new ObjectCallback<School> (){
                                            

                                            
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
                    private transient DataList<Student>  students ;

                    public DataList< Student > getStudents() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            StudentRepository studentRepository = (StudentRepository) getRepository();

                            if(that.getId() != null && studentRepository.getDb() != null){

                                 //Fetch locally from db
                                 //students = getStudents__db(restAdapter);
                                 // Getting single cont
                                 students = studentRepository.getDb().getAll__db("ainakClassAndSectionId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){//Ignore}
                                                return students;
                    }

                    public void setStudents(DataList<Student> students) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: students){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setStudents1(hashMaps);
                        }else{
                            this.students = students;
                            //TODO: Warning move this to new thread
                            for(Student data: students){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudents1(List<Map<String, Object>> students) {
                        //First create a dummy Repo class object for ..
                        StudentRepository studentsRepository = new StudentRepository();
                        List<Student> result = new ArrayList<>();
                        for (Map<String, Object> obj : students) {
                            //Also add relation to child type for two way communication..
                            Student obj1 = studentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudents(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setStudents1(DataList<HashMap<String, Object>> students) {
                        //First create a dummy Repo class object for ..
                        StudentRepository studentsRepository = new StudentRepository();
                        DataList<Student> result = new DataList<>();
                        for (HashMap<String, Object> obj : students) {
                            //Also add relation to child type for two way communication..
                            Student obj1 = studentsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setStudents(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<Student> students, Student dummyClassInstance) {
                        that.setStudents(students);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(Student students) {
                        try{
                            try{

                                  //Save to database..
                                  students.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getStudents().add(students);
                        }catch(Exception e){
                            DataList< Student> students1 = new DataList();
                            //Now add this item to list..
                            students1.add(students);
                            //Now set data....
                            that.setStudents(students1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void findById__students( String fk,  RestAdapter restAdapter, final ObjectCallback<Student> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AinakClassAndSectionRepository  ainakClassAndSectionRepo = restAdapter.createRepository(AinakClassAndSectionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ainakClassAndSectionRepo.findById__students( (String)that.getId(), fk,  new ObjectCallback<Student> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void destroyById__students( String fk,  RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AinakClassAndSectionRepository  ainakClassAndSectionRepo = restAdapter.createRepository(AinakClassAndSectionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ainakClassAndSectionRepo.destroyById__students( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__students( String fk,  Student data,  RestAdapter restAdapter, final ObjectCallback<Student> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AinakClassAndSectionRepository  ainakClassAndSectionRepo = restAdapter.createRepository(AinakClassAndSectionRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        ainakClassAndSectionRepo.updateById__students( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<Student> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void get__students( Map<String,  ? extends Object> filter,  RestAdapter restAdapter, final DataListCallback<Student> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AinakClassAndSectionRepository  ainakClassAndSectionRepo = restAdapter.createRepository(AinakClassAndSectionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ainakClassAndSectionRepo.get__students( (String)that.getId(), filter,  new DataListCallback<Student> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<Student> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            Student obj = new Student();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (Student obj : object) {
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
                                    public void create__students( Student data,  RestAdapter restAdapter, final ObjectCallback<Student> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AinakClassAndSectionRepository  ainakClassAndSectionRepo = restAdapter.createRepository(AinakClassAndSectionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ainakClassAndSectionRepo.create__students( (String)that.getId(), data.convertMap(),  new ObjectCallback<Student> (){
                                            

                                            
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
                                 
                            
                        

                                    //Write the method here..
                                    public void delete__students( RestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AinakClassAndSectionRepository  ainakClassAndSectionRepo = restAdapter.createRepository(AinakClassAndSectionRepository.class);
                                        
                                        



                                        ainakClassAndSectionRepo.delete__students( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__students( Map<String,  ? extends Object> where,  RestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final AinakClassAndSectionRepository  ainakClassAndSectionRepo = restAdapter.createRepository(AinakClassAndSectionRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        ainakClassAndSectionRepo.count__students( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
