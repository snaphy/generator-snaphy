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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeamRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ZoneRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeamMemberRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Team extends Model {


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

    private Team that ;

    public Team (){
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

            
            
        
    
        
            

            
                private String contactNumber;
                /* Adding Getter and Setter methods */
                public String getContactNumber(){
                    return contactNumber;
                }

                /* Adding Getter and Setter methods */
                public void setContactNumber(String contactNumber){
                    this.contactNumber = contactNumber;
                    //Update hashMap value..
                    hashMap.put("contactNumber", contactNumber);
                }

            
            
        
    
        
            

            
                private String unique_number;
                /* Adding Getter and Setter methods */
                public String getUnique_number(){
                    return unique_number;
                }

                /* Adding Getter and Setter methods */
                public void setUnique_number(String unique_number){
                    this.unique_number = unique_number;
                    //Update hashMap value..
                    hashMap.put("unique_number", unique_number);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      TeamRepository lowercaseFirstLetterRepository = (TeamRepository) getRepository();
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
      TeamRepository lowercaseFirstLetterRepository = (TeamRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      TeamRepository lowercaseFirstLetterRepository = (TeamRepository) getRepository();
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
                    private transient Zone  zone ;
                    private String zoneId;

                    public String getZoneId(){
                         return zoneId;
                    }

                    public void setZoneId(Object zoneId){
                        if(zoneId != null){
                          this.zoneId = zoneId.toString();
                        }
                    }

                    public Zone getZone() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(zone == null){
                                        TeamRepository teamRepository = (TeamRepository) getRepository();

                                        SnaphyRestAdapter restAdapter = teamRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          zone = getZone__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return zone;
                    }

                    public void setZone(Zone zone) {
                        this.zone = zone;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setZone(Map<String, Object> zone) {
                        //First create a dummy Repo class object for customer.
                        ZoneRepository zoneRepository = new ZoneRepository();
                        Zone zone1 = zoneRepository.createObject(zone);
                        setZone(zone1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setZone(HashMap<String, Object> zone) {
                        //First create a dummy Repo class object for customer.
                        ZoneRepository zoneRepository = new ZoneRepository();
                        Zone zone1 = zoneRepository.createObject(zone);
                        setZone(zone1);
                    }

                    //Adding relation method..
                    public void addRelation(Zone zone) {
                        that.setZone(zone);
                    }


                    //Fetch related data from local database if present a zoneId identifier as property for belongsTo
                    public Zone getZone__db(SnaphyRestAdapter restAdapter){
                      if(zoneId != null){
                        ZoneRepository zoneRepository = restAdapter.createRepository(ZoneRepository.class);
                            try{
                            TeamRepository lowercaseFirstLetterRepository = (TeamRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(zoneRepository.getDb() == null ){
                                                    zoneRepository.addStorage(context);
                                                }

                                                if(context != null && zoneRepository.getDb() != null){
                                                    zoneRepository.addStorage(context);
                                                    Zone zone = (Zone) zoneRepository.getDb().get__db(zoneId);
                                                    return zone;
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
                                    public void get__zone( Boolean refresh,  SnaphyRestAdapter restAdapter, final ObjectCallback<Zone> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamRepository  teamRepo = restAdapter.createRepository(TeamRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teamRepo.get__zone( (String)that.getId(), refresh,  new ObjectCallback<Zone> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Zone object) {
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
                    private transient DataList<TeamMember>  teamMembers ;

                    public DataList< TeamMember > getTeamMembers() {
                        //Check for pure case of hasMany
                                                    //TODO: Modify foreign key name..
                          try{
                            TeamMemberRepository teamMemberRepository = (TeamMemberRepository) getRepository();

                            if(that.getId() != null && teamMemberRepository.getDb() != null){

                                 //Fetch locally from db
                                 //teamMembers = getTeamMembers__db(restAdapter);
                                 // Getting single cont
                                 teamMembers = teamMemberRepository.getDb().getAll__db("teamId", that.getId().toString());

                                 //lowercaseFirstLetter(modelName)
                            }
                          }catch(Exception e){
                                //Ignore
                          }
                                                return teamMembers;
                    }

                    public void setTeamMembers(DataList<TeamMember> teamMembers) {
                        boolean hashType = false;
                        DataList<HashMap<String, Object>> hashMaps = new DataList<>();
                        for(Object o: teamMembers){
                            if(o.getClass().equals(HashMap.class)){
                                hashType = true;
                                HashMap<String, Object> dataObj = (HashMap<String, Object>)o;
                                hashMaps.add(dataObj);
                            }
                        }

                        if(hashType){
                            setTeamMembers1(hashMaps);
                        }else{
                            this.teamMembers = teamMembers;
                            //TODO: Warning move this to new thread
                            for(TeamMember data: teamMembers){
                              try{
                                data.save__db();
                              } catch (NoSuchMethodError e) {
                                // ignore
                              }
                            }
                        }
                    }

                /*    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTeamMembers1(List<Map<String, Object>> teamMembers) {
                        //First create a dummy Repo class object for ..
                        TeamMemberRepository teamMembersRepository = new TeamMemberRepository();
                        List<TeamMember> result = new ArrayList<>();
                        for (Map<String, Object> obj : teamMembers) {
                            //Also add relation to child type for two way communication..
                            TeamMember obj1 = teamMembersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTeamMembers(result);

                    }

                */

                    //Adding related model automatically in case of include statement from server.. Adding 1 for removing same name error..
                    public void setTeamMembers1(DataList<HashMap<String, Object>> teamMembers) {
                        //First create a dummy Repo class object for ..
                        TeamMemberRepository teamMembersRepository = new TeamMemberRepository();
                        DataList<TeamMember> result = new DataList<>();
                        for (HashMap<String, Object> obj : teamMembers) {
                            //Also add relation to child type for two way communication..
                            TeamMember obj1 = teamMembersRepository.createObject(obj);
                            result.add(obj1);

                        }
                        setTeamMembers(result);

                    }


                    //Adding relation method..
                    //Add a dummy class Name object to seperate data..
                    public void addRelation(DataList<TeamMember> teamMembers, TeamMember dummyClassInstance) {
                        that.setTeamMembers(teamMembers);

                    }

                    //Adding relation method..
                    //This will add a new data to the list relation object..
                    public void addRelation(TeamMember teamMembers) {
                        try{
                            try{

                                  //Save to database..
                                  teamMembers.save__db();
                            }catch (NoSuchMethodError e) {
                              // ignore
                            }
                            that.getTeamMembers().add(teamMembers);
                        }catch(Exception e){
                            DataList< TeamMember> teamMembers1 = new DataList();
                            //Now add this item to list..
                            teamMembers1.add(teamMembers);
                            //Now set data....
                            that.setTeamMembers(teamMembers1);
                        }
                    }




                    
                        //Implement logic for pure hasMany methods here....

                    
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                     
                            
                        

                                    //Write the method here..
                                    public void findById__teamMembers( String fk,  SnaphyRestAdapter restAdapter, final ObjectCallback<TeamMember> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamRepository  teamRepo = restAdapter.createRepository(TeamRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teamRepo.findById__teamMembers( (String)that.getId(), fk,  new ObjectCallback<TeamMember> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeamMember object) {
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
                                    public void destroyById__teamMembers( String fk,  SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamRepository  teamRepo = restAdapter.createRepository(TeamRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teamRepo.destroyById__teamMembers( (String)that.getId(), fk,  new VoidCallback (){
                                            
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
                                    public void updateById__teamMembers( String fk,  TeamMember data,  SnaphyRestAdapter restAdapter, final ObjectCallback<TeamMember> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamRepository  teamRepo = restAdapter.createRepository(TeamRepository.class);
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        



                                        teamRepo.updateById__teamMembers( (String)that.getId(), fk, data.convertMap(),  new ObjectCallback<TeamMember> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeamMember object) {
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
                                    public void get__teamMembers( Map<String,  ? extends Object> filter,  SnaphyRestAdapter restAdapter, final DataListCallback<TeamMember> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamRepository  teamRepo = restAdapter.createRepository(TeamRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teamRepo.get__teamMembers( (String)that.getId(), filter,  new DataListCallback<TeamMember> (){
                                            

                                            


                                            
                                                @Override
                                                
                                                    public void onSuccess(DataList<TeamMember> object) {
                                                        if(object != null){
                                                            //now add relation to this recipe.
                                                            TeamMember obj = new TeamMember();
                                                            addRelation(object, obj);
                                                            //Disabling two way communication for cyclic error..
                                                            /*for (TeamMember obj : object) {
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
                                    public void create__teamMembers( TeamMember data,  SnaphyRestAdapter restAdapter, final ObjectCallback<TeamMember> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamRepository  teamRepo = restAdapter.createRepository(TeamRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teamRepo.create__teamMembers( (String)that.getId(), data.convertMap(),  new ObjectCallback<TeamMember> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(TeamMember object) {
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
                                    public void delete__teamMembers( SnaphyRestAdapter restAdapter, final VoidCallback callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamRepository  teamRepo = restAdapter.createRepository(TeamRepository.class);
                                        
                                        



                                        teamRepo.delete__teamMembers( (String)that.getId(),  new VoidCallback (){
                                            
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
                                    public void count__teamMembers( Map<String,  ? extends Object> where,  SnaphyRestAdapter restAdapter, final ObjectCallback<JSONObject>  callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamRepository  teamRepo = restAdapter.createRepository(TeamRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teamRepo.count__teamMembers( (String)that.getId(), where,  new ObjectCallback<JSONObject>(){
                                            

                                            
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
