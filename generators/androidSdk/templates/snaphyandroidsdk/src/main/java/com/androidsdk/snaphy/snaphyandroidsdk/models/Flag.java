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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.FlagRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientFlagRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Flag extends Model {


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

    private Flag that ;

    public Flag (){
        that = this;
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

            
            
        
    
        
            

            
                private String colorCode;
                /* Adding Getter and Setter methods */
                public String getColorCode(){
                    return colorCode;
                }

                /* Adding Getter and Setter methods */
                public void setColorCode(String colorCode){
                    this.colorCode = colorCode;
                    //Update hashMap value..
                    hashMap.put("colorCode", colorCode);
                }

            
            
        
    
        
            

            
                private double severityPoints;
                /* Adding Getter and Setter methods */
                public double getSeverityPoints(){
                    return severityPoints;
                }

                /* Adding Getter and Setter methods */
                public void setSeverityPoints(double severityPoints){
                    this.severityPoints = severityPoints;
                    //Update hashMap value..
                    hashMap.put("severityPoints", severityPoints);
                }

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      FlagRepository lowercaseFirstLetterRepository = (FlagRepository) getRepository();
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
      FlagRepository lowercaseFirstLetterRepository = (FlagRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      FlagRepository lowercaseFirstLetterRepository = (FlagRepository) getRepository();
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
    
        
        
                

                
                    
                    //Define hasMany relation method here..
                    private transient DataList<PatientFlag>  patientFlags ;

                    public DataList< PatientFlag > getPatientFlags() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            PatientFlagRepository patientFlagRepository = (PatientFlagRepository) getRepository();

                            if(that.getId() != null && patientFlagRepository.getDb() != null){

                                 //Fetch locally from db
                                 //patientFlags = getPatientFlags__db(restAdapter);
                                 // Getting single cont
                                 patientFlags = patientFlagRepository.getDb().getAll__db("flagId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return patientFlags;
                    }

                    public void setPatientFlags(DataList<PatientFlag> patientFlags) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: patientFlags){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setPatientFlags1(hashMaps);
                        }else{
                            this.patientFlags = patientFlags;
                            //TODO: Warning move this to new thread
                            for(PatientFlag data: patientFlags){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientFlags1(List<Map<String, Object>> patientFlags) {
                        //First create a dummy Repo class object for ..
                        PatientFlagRepository patientFlagsRepository = new PatientFlagRepository();
                        List<PatientFlag> result = new ArrayList<>();
                        for (Map<String, Object> obj : patientFlags) {
                            //Also add relation to child type for two way communication..
                            PatientFlag obj1 = patientFlagsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientFlags(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setPatientFlags1(DataList<HashMap<String, Object>> patientFlags) {
                        //First create a dummy Repo class object for ..
                        PatientFlagRepository patientFlagsRepository = new PatientFlagRepository();
                        DataList<PatientFlag> result = new DataList<>();
                        for (HashMap<String, Object> obj : patientFlags) {
                            //Also add relation to child type for two way communication..
                            PatientFlag obj1 = patientFlagsRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setPatientFlags(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<PatientFlag> patientFlags, PatientFlag dummyClassInstance) {
                        that.setPatientFlags(patientFlags);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(PatientFlag patientFlags) {
                        try{
                            try{

                                  //Save to database..
                                  patientFlags.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getPatientFlags().add(patientFlags);
                        }catch(Exception e){
                            DataList< PatientFlag> patientFlags1 = new DataList();
                            //Now add this item to list..
                            patientFlags1.add(patientFlags);
                            //Now set data....
                            that.setPatientFlags(patientFlags1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void findById__patientFlags( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<PatientFlag> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FlagRepository  flagRepo = restAdapter.createRepository(FlagRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        flagRepo.findById__patientFlags( (String)that.getId(), fk,  new ObjectCallback<PatientFlag> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientFlag object) {
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
                                    public void destroyById__patientFlags( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FlagRepository  flagRepo = restAdapter.createRepository(FlagRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        flagRepo.destroyById__patientFlags( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__patientFlags( String fk,  PatientFlag data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PatientFlag> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FlagRepository  flagRepo = restAdapter.createRepository(FlagRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        flagRepo.updateById__patientFlags( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<PatientFlag> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientFlag object) {
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
                                    public void get__patientFlags( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<PatientFlag> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FlagRepository  flagRepo = restAdapter.createRepository(FlagRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        flagRepo.get__patientFlags( (String)that.getId(), filter,  new DataListCallback<PatientFlag> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<PatientFlag> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            PatientFlag obj = new PatientFlag();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (PatientFlag obj : object) {
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
                                    public void create__patientFlags( PatientFlag data,  SnaphyRestAdapter restAdapter, final ObjectCallback<PatientFlag> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FlagRepository  flagRepo = restAdapter.createRepository(FlagRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        flagRepo.create__patientFlags( (String)that.getId(), data.convertMap(),  new ObjectCallback<PatientFlag> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(PatientFlag object) {
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
                                    public void delete__patientFlags( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FlagRepository  flagRepo = restAdapter.createRepository(FlagRepository.class);
                                        
                                        



                                        flagRepo.delete__patientFlags( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__patientFlags( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final FlagRepository  flagRepo = restAdapter.createRepository(FlagRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        flagRepo.count__patientFlags( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
