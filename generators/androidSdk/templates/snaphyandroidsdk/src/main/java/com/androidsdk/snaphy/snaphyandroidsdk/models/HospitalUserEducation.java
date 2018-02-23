package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.androidsdk.snaphy.snaphyandroidsdk.adapter.SnaphyRestAdapter;
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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserEducationRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.CollegeRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DegreeRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class HospitalUserEducation extends Model {


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

    private HospitalUserEducation that ;

    public HospitalUserEducation (){
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

            
            
        
    
        
            

            
                private String collegeName;
                /* Adding Getter and Setter methods */
                public String getCollegeName(){
                    return collegeName;
                }

                /* Adding Getter and Setter methods */
                public void setCollegeName(String collegeName){
                    this.collegeName = collegeName;
                    //Update hashMap value..
                    hashMap.put("collegeName", collegeName);
                }

            
            
        
    
        
            

            
                private String degreeName;
                /* Adding Getter and Setter methods */
                public String getDegreeName(){
                    return degreeName;
                }

                /* Adding Getter and Setter methods */
                public void setDegreeName(String degreeName){
                    this.degreeName = degreeName;
                    //Update hashMap value..
                    hashMap.put("degreeName", degreeName);
                }

            
            
        
    
        
            

            
                private double yearOfGraduation;
                /* Adding Getter and Setter methods */
                public double getYearOfGraduation(){
                    return yearOfGraduation;
                }

                /* Adding Getter and Setter methods */
                public void setYearOfGraduation(double yearOfGraduation){
                    this.yearOfGraduation = yearOfGraduation;
                    //Update hashMap value..
                    hashMap.put("yearOfGraduation", yearOfGraduation);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      HospitalUserEducationRepository lowercaseFirstLetterRepository = (HospitalUserEducationRepository) getRepository();
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
      HospitalUserEducationRepository lowercaseFirstLetterRepository = (HospitalUserEducationRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      HospitalUserEducationRepository lowercaseFirstLetterRepository = (HospitalUserEducationRepository) getRepository();
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
                    private transient HospitalUser  hospitalUser ;
                    private String hospitalUserId;

                    public String getHospitalUserId(){
                         return hospitalUserId;
                    }

                    public void setHospitalUserId(Object hospitalUserId){
                        if(hospitalUserId != null){
                          this.hospitalUserId = hospitalUserId.toString();
                        }
                    }

                    public HospitalUser getHospitalUser() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(hospitalUser == null){
                                        HospitalUserEducationRepository hospitalUserEducationRepository = (HospitalUserEducationRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = hospitalUserEducationRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          hospitalUser = getHospitalUser__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return hospitalUser;
                    }

                    public void setHospitalUser(HospitalUser hospitalUser) {
                        this.hospitalUser = hospitalUser;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospitalUser(Map<String, Object> hospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository hospitalUserRepository = new HospitalUserRepository();
                        HospitalUser hospitalUser1 = hospitalUserRepository.createObject(hospitalUser);
                        setHospitalUser(hospitalUser1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setHospitalUser(HashMap<String, Object> hospitalUser) {
                        //First create a dummy Repo class object for customer.
                        HospitalUserRepository hospitalUserRepository = new HospitalUserRepository();
                        HospitalUser hospitalUser1 = hospitalUserRepository.createObject(hospitalUser);
                        setHospitalUser(hospitalUser1);
                    }

                    //Adding relation method..
                    public void addRelation(HospitalUser hospitalUser) {
                        that.setHospitalUser(hospitalUser);
                    }


                    //Fetch related data from local database if present a hospitalUserId identifier as property for belongsTo
                    public HospitalUser getHospitalUser__db(SnaphyRestAdapter restAdapter){
                      if(hospitalUserId != null){
                        HospitalUserRepository hospitalUserRepository = restAdapter.createRepository(HospitalUserRepository.class);
                            try{
                            HospitalUserEducationRepository lowercaseFirstLetterRepository = (HospitalUserEducationRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(hospitalUserRepository.getDb() == null ){
                                                    hospitalUserRepository.addStorage(context);
                                                }

                                                if(context != null && hospitalUserRepository.getDb() != null){
                                                    hospitalUserRepository.addStorage(context);
                                                    HospitalUser hospitalUser = (HospitalUser) hospitalUserRepository.getDb().get__db(hospitalUserId);
                                                    return hospitalUser;
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
                                    public void get__hospitalUser( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<HospitalUser> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserEducationRepository  hospitalUserEducationRepo = restAdapter.createRepository(HospitalUserEducationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserEducationRepo.get__hospitalUser( (String)that.getId(), refresh,  new ObjectCallback<HospitalUser> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(HospitalUser object) {
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
                    private transient College  college ;
                    private String collegeId;

                    public String getCollegeId(){
                         return collegeId;
                    }

                    public void setCollegeId(Object collegeId){
                        if(collegeId != null){
                          this.collegeId = collegeId.toString();
                        }
                    }

                    public College getCollege() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(college == null){
                                        HospitalUserEducationRepository hospitalUserEducationRepository = (HospitalUserEducationRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = hospitalUserEducationRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          college = getCollege__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return college;
                    }

                    public void setCollege(College college) {
                        this.college = college;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCollege(Map<String, Object> college) {
                        //First create a dummy Repo class object for customer.
                        CollegeRepository collegeRepository = new CollegeRepository();
                        College college1 = collegeRepository.createObject(college);
                        setCollege(college1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setCollege(HashMap<String, Object> college) {
                        //First create a dummy Repo class object for customer.
                        CollegeRepository collegeRepository = new CollegeRepository();
                        College college1 = collegeRepository.createObject(college);
                        setCollege(college1);
                    }

                    //Adding relation method..
                    public void addRelation(College college) {
                        that.setCollege(college);
                    }


                    //Fetch related data from local database if present a collegeId identifier as property for belongsTo
                    public College getCollege__db(SnaphyRestAdapter restAdapter){
                      if(collegeId != null){
                        CollegeRepository collegeRepository = restAdapter.createRepository(CollegeRepository.class);
                            try{
                            HospitalUserEducationRepository lowercaseFirstLetterRepository = (HospitalUserEducationRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(collegeRepository.getDb() == null ){
                                                    collegeRepository.addStorage(context);
                                                }

                                                if(context != null && collegeRepository.getDb() != null){
                                                    collegeRepository.addStorage(context);
                                                    College college = (College) collegeRepository.getDb().get__db(collegeId);
                                                    return college;
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
                                    public void get__college( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<College> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserEducationRepository  hospitalUserEducationRepo = restAdapter.createRepository(HospitalUserEducationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserEducationRepo.get__college( (String)that.getId(), refresh,  new ObjectCallback<College> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(College object) {
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
                    private transient Degree  degree ;
                    private String degreeId;

                    public String getDegreeId(){
                         return degreeId;
                    }

                    public void setDegreeId(Object degreeId){
                        if(degreeId != null){
                          this.degreeId = degreeId.toString();
                        }
                    }

                    public Degree getDegree() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(degree == null){
                                        HospitalUserEducationRepository hospitalUserEducationRepository = (HospitalUserEducationRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = hospitalUserEducationRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          degree = getDegree__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return degree;
                    }

                    public void setDegree(Degree degree) {
                        this.degree = degree;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDegree(Map<String, Object> degree) {
                        //First create a dummy Repo class object for customer.
                        DegreeRepository degreeRepository = new DegreeRepository();
                        Degree degree1 = degreeRepository.createObject(degree);
                        setDegree(degree1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setDegree(HashMap<String, Object> degree) {
                        //First create a dummy Repo class object for customer.
                        DegreeRepository degreeRepository = new DegreeRepository();
                        Degree degree1 = degreeRepository.createObject(degree);
                        setDegree(degree1);
                    }

                    //Adding relation method..
                    public void addRelation(Degree degree) {
                        that.setDegree(degree);
                    }


                    //Fetch related data from local database if present a degreeId identifier as property for belongsTo
                    public Degree getDegree__db(SnaphyRestAdapter restAdapter){
                      if(degreeId != null){
                        DegreeRepository degreeRepository = restAdapter.createRepository(DegreeRepository.class);
                            try{
                            HospitalUserEducationRepository lowercaseFirstLetterRepository = (HospitalUserEducationRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(degreeRepository.getDb() == null ){
                                                    degreeRepository.addStorage(context);
                                                }

                                                if(context != null && degreeRepository.getDb() != null){
                                                    degreeRepository.addStorage(context);
                                                    Degree degree = (Degree) degreeRepository.getDb().get__db(degreeId);
                                                    return degree;
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
                                    public void get__degree( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Degree> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final HospitalUserEducationRepository  hospitalUserEducationRepo = restAdapter.createRepository(HospitalUserEducationRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        hospitalUserEducationRepo.get__degree( (String)that.getId(), refresh,  new ObjectCallback<Degree> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Degree object) {
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
