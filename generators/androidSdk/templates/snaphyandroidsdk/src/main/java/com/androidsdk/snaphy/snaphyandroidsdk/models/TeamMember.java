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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeamMemberRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeamRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class TeamMember extends Model {


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

    private TeamMember that ;

    public TeamMember (){
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

            
            
        
    
        
            

            
                private String status;
                /* Adding Getter and Setter methods */
                public String getStatus(){
                    return status;
                }

                /* Adding Getter and Setter methods */
                public void setStatus(String status){
                    this.status = status;
                    //Update hashMap value..
                    hashMap.put("status", status);
                }

            
            
        
    
        
            

            
            
        
    
        
            

            
            
        
    


    //------------------------------------Database Method---------------------------------------------------


    public void save(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      //Save to database..
      save__db();
      //Also save to database..
      super.save(callback);
    }

    public void destroy(final com.strongloop.android.loopback.callbacks.VoidCallback callback){
      TeamMemberRepository lowercaseFirstLetterRepository = (TeamMemberRepository) getRepository();
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
      TeamMemberRepository lowercaseFirstLetterRepository = (TeamMemberRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      TeamMemberRepository lowercaseFirstLetterRepository = (TeamMemberRepository) getRepository();
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
                    private transient Team  team ;
                    private String teamId;

                    public String getTeamId(){
                         return teamId;
                    }

                    public void setTeamId(Object teamId){
                        if(teamId != null){
                          this.teamId = teamId.toString();
                        }
                    }

                    public Team getTeam() {
                        try{
                          //Adding database method for fetching from relation if not present..
                                      if(team == null){
                                        TeamMemberRepository teamMemberRepository = (TeamMemberRepository) getRepository();

                                        RestAdapter restAdapter = teamMemberRepository.getRestAdapter();
                                        if(restAdapter != null){
                                          //Fetch locally from db
                                          team = getTeam__db(restAdapter);
                                        }
                                      }
                        }catch(Exception e){
                          //Ignore
                        }

                        return team;
                    }

                    public void setTeam(Team team) {
                        this.team = team;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTeam(Map<String, Object> team) {
                        //First create a dummy Repo class object for customer.
                        TeamRepository teamRepository = new TeamRepository();
                        Team team1 = teamRepository.createObject(team);
                        setTeam(team1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTeam(HashMap<String, Object> team) {
                        //First create a dummy Repo class object for customer.
                        TeamRepository teamRepository = new TeamRepository();
                        Team team1 = teamRepository.createObject(team);
                        setTeam(team1);
                    }

                    //Adding relation method..
                    public void addRelation(Team team) {
                        that.setTeam(team);
                    }


                    //Fetch related data from local database if present a teamId identifier as property for belongsTo
                    public Team getTeam__db(RestAdapter restAdapter){
                      if(teamId != null){
                        TeamRepository teamRepository = restAdapter.createRepository(TeamRepository.class);
                            try{
                            TeamMemberRepository lowercaseFirstLetterRepository = (TeamMemberRepository) getRepository();
                                          if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
                                                Context context = lowercaseFirstLetterRepository.getContext();
                                                if(teamRepository.getDb() == null ){
                                                    teamRepository.addStorage(context);
                                                }

                                                if(context != null && teamRepository.getDb() != null){
                                                    teamRepository.addStorage(context);
                                                    Team team = (Team) teamRepository.getDb().get__db(teamId);
                                                    return team;
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
                                    public void get__team( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Team> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeamMemberRepository  teamMemberRepo = restAdapter.createRepository(TeamMemberRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teamMemberRepo.get__team( (String)that.getId(), refresh,  new ObjectCallback<Team> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Team object) {
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
