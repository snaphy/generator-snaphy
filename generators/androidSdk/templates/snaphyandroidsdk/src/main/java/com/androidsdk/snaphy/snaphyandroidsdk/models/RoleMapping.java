package com.androidsdk.snaphy.snaphyandroidsdk.models;







import org.json.JSONObject;
import org.json.JSONArray;

import java.util.List;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.remoting.adapters.Adapter;

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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.RoleMappingRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RoleRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class RoleMapping extends Model {


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

    private RoleMapping that ;

    public RoleMapping (){
        that = this;
    }

    
        
            

            
            
            
            

            

        
    
        
            

            
                private String principalType;
                /* Adding Getter and Setter methods */
                public String getPrincipalType(){
                    return principalType;
                }

                /* Adding Getter and Setter methods */
                public void setPrincipalType(String principalType){
                    this.principalType = principalType;
                    //Update hashMap value..
                    hashMap.put("principalType", principalType);
                }

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    
        
            

            
            
            
            

            

        
    


    



    //Now adding relations between related models
    
        
                
                    //Define belongsTo relation method here..
                    private transient Role  role ;

                    public Role getRole() {
                        return role;
                    }

                    public void setRole(Role role) {
                        this.role = role;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRole(Map<String, Object> role) {
                        //First create a dummy Repo class object for customer.
                        RoleRepository roleRepository = new RoleRepository();
                        Role role1 = roleRepository.createObject(role);
                        setRole(role1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setRole(HashMap<String, Object> role) {
                        //First create a dummy Repo class object for customer.
                        RoleRepository roleRepository = new RoleRepository();
                        Role role1 = roleRepository.createObject(role);
                        setRole(role1);
                    }

                    //Adding relation method..
                    public void addRelation(Role role) {
                        that.setRole(role);
                    }



                
                
                







                    //Now add instance methods to fetch the related belongsTo Model..
                    

                    

                                    //Write the method here..
                                    public void get__role( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Role> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final RoleMappingRepository  roleMappingRepo = restAdapter.createRepository(RoleMappingRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        roleMappingRepo.get__role( (String)that.getId(), refresh,  new ObjectCallback<Role> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Role object) {
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
