package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
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
import com.androidsdk.snaphy.snaphyandroidsdk.list.Util;

import com.strongloop.android.remoting.adapters.Adapter;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;
import android.util.Log;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;


//Replaced by Custom  Repo methods
// import com.strongloop.android.loopback.UserRepository;
import com.strongloop.android.loopback.AccessTokenRepository;
import com.strongloop.android.loopback.AccessToken;
import android.content.SharedPreferences;
import org.json.JSONException;
import android.content.Context;



import org.json.JSONArray;
import org.json.JSONObject;


//Import its models too.
import com.androidsdk.snaphy.snaphyandroidsdk.models.HospitalUser;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.HospitalUserDb;

//Now import model of related models..

    
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.PatientGroup;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientGroupRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.UserInvite;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.UserInviteRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.PatientSecurity;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PatientSecurityRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.RegistrationCouncil;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.RegistrationCouncilRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.HospitalUserSpecialization;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserSpecializationRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.HospitalUserSetting;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserSettingRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.HospitalUserEducation;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalUserEducationRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Hospital;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.HospitalRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Pincode;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.PincodeRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.State;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.StateRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.Taluk;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TalukRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.District;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.DistrictRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.ReferPatient;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ReferPatientRepository;
            
        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.models.ChatItem;
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatItemRepository;
            
        
    





public class HospitalUserRepository extends UserRepository<HospitalUser> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public HospitalUserRepository(){
        super("HospitalUser", null, HospitalUser.class);

    }


    public Context getContext(){
        return context;
    }


    
    		//Create public methods..
    		public HospitalUser cachedCurrentUser;
            private Object currentUserId;
            private boolean isCurrentUserIdLoaded;

    		public HospitalUser getCachedCurrentUser(){
    			return cachedCurrentUser;
    		}

    		public void setCachedCurrentUser(HospitalUser user){
    			cachedCurrentUser = user;
    		}

    		/* public void setCurrentUserId(Object id){
    			super.setCurrentUserId(id);
    		} */

            public void findCurrentUser(final ObjectCallback<HospitalUser> callback){
                //Call the onBefore method..
                callback.onBefore();

                if(getCurrentUserId() == null){
                    callback.onSuccess(null);
                    return;
                }

                HashMap<String, Object> hashMap = new HashMap<>();
                this.findById((String)getCurrentUserId(), hashMap, new ObjectCallback<HospitalUser>() {
                    @Override
                    public void onSuccess(HospitalUser user){
                        cachedCurrentUser = user;
                        callback.onSuccess(user);
                        //Call the finally method..
                        callback.onFinally();
                    }

                    @Override
                    public void onError(Throwable t){
                        callback.onError(t);
                        //Call the finally method..
                        callback.onFinally();
                    }
                });
            }

            public Object getCurrentUserId(){
                if(currentUserId != null){
                  return currentUserId;
                }
                else{
                  String json = getSharedPreferences().getString(PROPERTY_CURRENT_USER_ID, null);
                  if(json == null){
                      return null;
                  }

                  if(json.equals("[null]")){
                      return null;
                  }

                  try{
                      Object id = new JSONArray(json).get(0);
                      return id;
                  }catch(JSONException e){
                      String msg = "Cannot parse user id '" + json + "'";
                      Log.e("Snaphy", msg, e);
                  }
                }
                return null;
            }

            public void setCurrentUserId(Object currentUserId){
                this.currentUserId = currentUserId;
                cachedCurrentUser = null;
                saveCurrentUserId();
            }

            private void saveCurrentUserId(){
                final SharedPreferences.Editor editor = getSharedPreferences().edit();
                final String json = new JSONArray().put(getCurrentUserId()).toString();
                editor.putString(PROPERTY_CURRENT_USER_ID, json);
                editor.commit();
            }


            private SharedPreferences getSharedPreferences() {
                return getApplicationContext().getSharedPreferences(
                    SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
            }




    







    public HospitalUserDb getDb() {
      return hospitalUserDb;
    }

    public void setHospitalUserDb(HospitalUserDb hospitalUserDb) {
      this.hospitalUserDb = hospitalUserDb;
    }

    private HospitalUserDb hospitalUserDb;



    //Flag to check either to store data locally or not..
    private boolean STORE_LOCALLY = true;

    public boolean isSTORE_LOCALLY() {
      return STORE_LOCALLY;
    }


    public void  persistData(boolean persist){
      STORE_LOCALLY = persist;
    }



    public void reset__db(){
      if(isSTORE_LOCALLY()){
          getDb().reset__db();
      }
    }



    public void addStorage(Context context){
         try{
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            DATABASE_NAME = (String) ai.metaData.get(METADATA_DATABASE_NAME_KEY);
         }
         catch (Exception e){
            Log.e("Snaphy", e.toString());
         }
         setHospitalUserDb(new HospitalUserDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/accessTokens/:fk", "GET"), "HospitalUser.prototype.__findById__accessTokens");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/accessTokens/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__accessTokens");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/accessTokens/:fk", "PUT"), "HospitalUser.prototype.__updateById__accessTokens");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientGroups/:fk", "GET"), "HospitalUser.prototype.__findById__patientGroups");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientGroups/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__patientGroups");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientGroups/:fk", "PUT"), "HospitalUser.prototype.__updateById__patientGroups");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/userInvites/:fk", "GET"), "HospitalUser.prototype.__findById__userInvites");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/userInvites/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__userInvites");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/userInvites/:fk", "PUT"), "HospitalUser.prototype.__updateById__userInvites");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientSecurities/:fk", "GET"), "HospitalUser.prototype.__findById__patientSecurities");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientSecurities/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__patientSecurities");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientSecurities/:fk", "PUT"), "HospitalUser.prototype.__updateById__patientSecurities");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitals/:fk", "GET"), "HospitalUser.prototype.__findById__hospitals");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitals/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__hospitals");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitals/:fk", "PUT"), "HospitalUser.prototype.__updateById__hospitals");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSpecializations/:fk", "GET"), "HospitalUser.prototype.__findById__hospitalUserSpecializations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSpecializations/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__hospitalUserSpecializations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSpecializations/:fk", "PUT"), "HospitalUser.prototype.__updateById__hospitalUserSpecializations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSettings/:fk", "GET"), "HospitalUser.prototype.__findById__hospitalUserSettings");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSettings/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__hospitalUserSettings");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSettings/:fk", "PUT"), "HospitalUser.prototype.__updateById__hospitalUserSettings");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserEducations/:fk", "GET"), "HospitalUser.prototype.__findById__hospitalUserEducations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserEducations/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__hospitalUserEducations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserEducations/:fk", "PUT"), "HospitalUser.prototype.__updateById__hospitalUserEducations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/registrationCouncil", "GET"), "HospitalUser.prototype.__get__registrationCouncil");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/state", "GET"), "HospitalUser.prototype.__get__state");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/pincode", "GET"), "HospitalUser.prototype.__get__pincode");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/taluk", "GET"), "HospitalUser.prototype.__get__taluk");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/district", "GET"), "HospitalUser.prototype.__get__district");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/referPatients/:fk", "GET"), "HospitalUser.prototype.__findById__referPatients");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/referPatients/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__referPatients");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/referPatients/:fk", "PUT"), "HospitalUser.prototype.__updateById__referPatients");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/chatItems/:fk", "GET"), "HospitalUser.prototype.__findById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/chatItems/:fk", "DELETE"), "HospitalUser.prototype.__destroyById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/chatItems/:fk", "PUT"), "HospitalUser.prototype.__updateById__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/accessTokens", "GET"), "HospitalUser.prototype.__get__accessTokens");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/accessTokens", "POST"), "HospitalUser.prototype.__create__accessTokens");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/accessTokens", "DELETE"), "HospitalUser.prototype.__delete__accessTokens");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/accessTokens/count", "GET"), "HospitalUser.prototype.__count__accessTokens");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientGroups", "GET"), "HospitalUser.prototype.__get__patientGroups");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientGroups", "POST"), "HospitalUser.prototype.__create__patientGroups");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientGroups", "DELETE"), "HospitalUser.prototype.__delete__patientGroups");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientGroups/count", "GET"), "HospitalUser.prototype.__count__patientGroups");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/userInvites", "GET"), "HospitalUser.prototype.__get__userInvites");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/userInvites", "POST"), "HospitalUser.prototype.__create__userInvites");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/userInvites", "DELETE"), "HospitalUser.prototype.__delete__userInvites");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/userInvites/count", "GET"), "HospitalUser.prototype.__count__userInvites");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientSecurities", "GET"), "HospitalUser.prototype.__get__patientSecurities");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientSecurities", "POST"), "HospitalUser.prototype.__create__patientSecurities");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientSecurities", "DELETE"), "HospitalUser.prototype.__delete__patientSecurities");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/patientSecurities/count", "GET"), "HospitalUser.prototype.__count__patientSecurities");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitals", "GET"), "HospitalUser.prototype.__get__hospitals");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitals", "POST"), "HospitalUser.prototype.__create__hospitals");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitals", "DELETE"), "HospitalUser.prototype.__delete__hospitals");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitals/count", "GET"), "HospitalUser.prototype.__count__hospitals");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSpecializations", "GET"), "HospitalUser.prototype.__get__hospitalUserSpecializations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSpecializations", "POST"), "HospitalUser.prototype.__create__hospitalUserSpecializations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSpecializations", "DELETE"), "HospitalUser.prototype.__delete__hospitalUserSpecializations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSpecializations/count", "GET"), "HospitalUser.prototype.__count__hospitalUserSpecializations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSettings", "GET"), "HospitalUser.prototype.__get__hospitalUserSettings");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSettings", "POST"), "HospitalUser.prototype.__create__hospitalUserSettings");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSettings", "DELETE"), "HospitalUser.prototype.__delete__hospitalUserSettings");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserSettings/count", "GET"), "HospitalUser.prototype.__count__hospitalUserSettings");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserEducations", "GET"), "HospitalUser.prototype.__get__hospitalUserEducations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserEducations", "POST"), "HospitalUser.prototype.__create__hospitalUserEducations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserEducations", "DELETE"), "HospitalUser.prototype.__delete__hospitalUserEducations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/hospitalUserEducations/count", "GET"), "HospitalUser.prototype.__count__hospitalUserEducations");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/referPatients", "GET"), "HospitalUser.prototype.__get__referPatients");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/referPatients", "POST"), "HospitalUser.prototype.__create__referPatients");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/referPatients", "DELETE"), "HospitalUser.prototype.__delete__referPatients");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/referPatients/count", "GET"), "HospitalUser.prototype.__count__referPatients");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/chatItems", "GET"), "HospitalUser.prototype.__get__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/chatItems", "POST"), "HospitalUser.prototype.__create__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/chatItems", "DELETE"), "HospitalUser.prototype.__delete__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId/chatItems/count", "GET"), "HospitalUser.prototype.__count__chatItems");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "HospitalUser.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "POST"), "HospitalUser.create");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "PUT"), "HospitalUser.upsert");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id/exists", "GET"), "HospitalUser.exists");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "GET"), "HospitalUser.findById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/", "GET"), "HospitalUser.find");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findOne", "GET"), "HospitalUser.findOne");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/update", "POST"), "HospitalUser.updateAll");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:id", "DELETE"), "HospitalUser.deleteById");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/count", "GET"), "HospitalUser.count");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/:hospitalUserId", "PUT"), "HospitalUser.prototype.updateAttributes");
    

    
    

    
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/confirm", "GET"), "HospitalUser.confirm");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/reset", "POST"), "HospitalUser.resetPassword");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "HospitalUser.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "HospitalUser.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "HospitalUser.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "HospitalUser.getModelRelationSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/requestOtp", "POST"), "HospitalUser.requestOtp");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/retryOtp", "POST"), "HospitalUser.retryOtp");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/loginWithOtp", "POST"), "HospitalUser.loginWithOtp");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/joinHospital", "POST"), "HospitalUser.joinHospital");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/registerHospitalUser", "POST"), "HospitalUser.registerHospitalUser");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/findHospitalAndDoctors", "POST"), "HospitalUser.findHospitalAndDoctors");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchingManageUser", "POST"), "HospitalUser.fetchingManageUser");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/checkPendingInvitation", "POST"), "HospitalUser.checkPendingInvitation");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/fetchHospitalUserProfile", "POST"), "HospitalUser.fetchHospitalUserProfile");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/searchForDocterHospital", "POST"), "HospitalUser.searchForDocterHospital");
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method findById__accessTokens definition
            public void findById__accessTokens(  String hospitalUserId,  String fk, final ObjectCallback<AccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__accessTokens", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AccessTokenRepository accessTokenRepo = getRestAdapter().createRepository(AccessTokenRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = accessTokenRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(accessTokenRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //accessTokenRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    AccessToken accessToken = accessTokenRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = accessToken.getClass().getMethod("save__db");
                                                    method.invoke(accessToken);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(accessToken);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__accessTokens definition ends here..

            

        
    
        
            //Method destroyById__accessTokens definition
            public void destroyById__accessTokens(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__accessTokens", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__accessTokens definition ends here..

            

        
    
        
            //Method updateById__accessTokens definition
            public void updateById__accessTokens(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<AccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__accessTokens", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AccessTokenRepository accessTokenRepo = getRestAdapter().createRepository(AccessTokenRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = accessTokenRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(accessTokenRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //accessTokenRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    AccessToken accessToken = accessTokenRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = accessToken.getClass().getMethod("save__db");
                                                    method.invoke(accessToken);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(accessToken);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__accessTokens definition ends here..

            

        
    
        
            //Method findById__patientGroups definition
            public void findById__patientGroups(  String hospitalUserId,  String fk, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__patientGroups", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__patientGroups definition ends here..

            

        
    
        
            //Method destroyById__patientGroups definition
            public void destroyById__patientGroups(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__patientGroups", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__patientGroups definition ends here..

            

        
    
        
            //Method updateById__patientGroups definition
            public void updateById__patientGroups(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__patientGroups", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__patientGroups definition ends here..

            

        
    
        
            //Method findById__userInvites definition
            public void findById__userInvites(  String hospitalUserId,  String fk, final ObjectCallback<UserInvite> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__userInvites", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    UserInviteRepository userInviteRepo = getRestAdapter().createRepository(UserInviteRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = userInviteRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(userInviteRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //userInviteRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    UserInvite userInvite = userInviteRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = userInvite.getClass().getMethod("save__db");
                                                    method.invoke(userInvite);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(userInvite);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__userInvites definition ends here..

            

        
    
        
            //Method destroyById__userInvites definition
            public void destroyById__userInvites(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__userInvites", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__userInvites definition ends here..

            

        
    
        
            //Method updateById__userInvites definition
            public void updateById__userInvites(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<UserInvite> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__userInvites", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    UserInviteRepository userInviteRepo = getRestAdapter().createRepository(UserInviteRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = userInviteRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(userInviteRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //userInviteRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    UserInvite userInvite = userInviteRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = userInvite.getClass().getMethod("save__db");
                                                    method.invoke(userInvite);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(userInvite);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__userInvites definition ends here..

            

        
    
        
            //Method findById__patientSecurities definition
            public void findById__patientSecurities(  String hospitalUserId,  String fk, final ObjectCallback<PatientSecurity> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__patientSecurities", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientSecurityRepository patientSecurityRepo = getRestAdapter().createRepository(PatientSecurityRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientSecurityRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientSecurityRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientSecurityRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientSecurity patientSecurity = patientSecurityRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientSecurity.getClass().getMethod("save__db");
                                                    method.invoke(patientSecurity);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientSecurity);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__patientSecurities definition ends here..

            

        
    
        
            //Method destroyById__patientSecurities definition
            public void destroyById__patientSecurities(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__patientSecurities", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__patientSecurities definition ends here..

            

        
    
        
            //Method updateById__patientSecurities definition
            public void updateById__patientSecurities(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<PatientSecurity> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__patientSecurities", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientSecurityRepository patientSecurityRepo = getRestAdapter().createRepository(PatientSecurityRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientSecurityRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientSecurityRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientSecurityRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientSecurity patientSecurity = patientSecurityRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientSecurity.getClass().getMethod("save__db");
                                                    method.invoke(patientSecurity);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientSecurity);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__patientSecurities definition ends here..

            

        
    
        
            //Method findById__hospitals definition
            public void findById__hospitals(  String hospitalUserId,  String fk, final ObjectCallback<Hospital> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__hospitals", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalRepository hospitalRepo = getRestAdapter().createRepository(HospitalRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Hospital hospital = hospitalRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospital.getClass().getMethod("save__db");
                                                    method.invoke(hospital);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospital);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__hospitals definition ends here..

            

        
    
        
            //Method destroyById__hospitals definition
            public void destroyById__hospitals(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__hospitals", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__hospitals definition ends here..

            

        
    
        
            //Method updateById__hospitals definition
            public void updateById__hospitals(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<Hospital> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__hospitals", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalRepository hospitalRepo = getRestAdapter().createRepository(HospitalRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Hospital hospital = hospitalRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospital.getClass().getMethod("save__db");
                                                    method.invoke(hospital);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospital);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__hospitals definition ends here..

            

        
    
        
            //Method findById__hospitalUserSpecializations definition
            public void findById__hospitalUserSpecializations(  String hospitalUserId,  String fk, final ObjectCallback<HospitalUserSpecialization> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__hospitalUserSpecializations", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserSpecializationRepository hospitalUserSpecializationRepo = getRestAdapter().createRepository(HospitalUserSpecializationRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserSpecializationRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserSpecializationRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserSpecializationRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserSpecialization hospitalUserSpecialization = hospitalUserSpecializationRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserSpecialization.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserSpecialization);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserSpecialization);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__hospitalUserSpecializations definition ends here..

            

        
    
        
            //Method destroyById__hospitalUserSpecializations definition
            public void destroyById__hospitalUserSpecializations(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__hospitalUserSpecializations", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__hospitalUserSpecializations definition ends here..

            

        
    
        
            //Method updateById__hospitalUserSpecializations definition
            public void updateById__hospitalUserSpecializations(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUserSpecialization> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__hospitalUserSpecializations", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserSpecializationRepository hospitalUserSpecializationRepo = getRestAdapter().createRepository(HospitalUserSpecializationRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserSpecializationRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserSpecializationRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserSpecializationRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserSpecialization hospitalUserSpecialization = hospitalUserSpecializationRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserSpecialization.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserSpecialization);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserSpecialization);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__hospitalUserSpecializations definition ends here..

            

        
    
        
            //Method findById__hospitalUserSettings definition
            public void findById__hospitalUserSettings(  String hospitalUserId,  String fk, final ObjectCallback<HospitalUserSetting> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__hospitalUserSettings", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserSettingRepository hospitalUserSettingRepo = getRestAdapter().createRepository(HospitalUserSettingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserSettingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserSettingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserSettingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserSetting hospitalUserSetting = hospitalUserSettingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserSetting.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserSetting);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserSetting);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__hospitalUserSettings definition ends here..

            

        
    
        
            //Method destroyById__hospitalUserSettings definition
            public void destroyById__hospitalUserSettings(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__hospitalUserSettings", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__hospitalUserSettings definition ends here..

            

        
    
        
            //Method updateById__hospitalUserSettings definition
            public void updateById__hospitalUserSettings(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUserSetting> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__hospitalUserSettings", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserSettingRepository hospitalUserSettingRepo = getRestAdapter().createRepository(HospitalUserSettingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserSettingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserSettingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserSettingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserSetting hospitalUserSetting = hospitalUserSettingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserSetting.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserSetting);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserSetting);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__hospitalUserSettings definition ends here..

            

        
    
        
            //Method findById__hospitalUserEducations definition
            public void findById__hospitalUserEducations(  String hospitalUserId,  String fk, final ObjectCallback<HospitalUserEducation> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__hospitalUserEducations", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserEducationRepository hospitalUserEducationRepo = getRestAdapter().createRepository(HospitalUserEducationRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserEducationRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserEducationRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserEducationRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserEducation hospitalUserEducation = hospitalUserEducationRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserEducation.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserEducation);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserEducation);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__hospitalUserEducations definition ends here..

            

        
    
        
            //Method destroyById__hospitalUserEducations definition
            public void destroyById__hospitalUserEducations(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__hospitalUserEducations", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__hospitalUserEducations definition ends here..

            

        
    
        
            //Method updateById__hospitalUserEducations definition
            public void updateById__hospitalUserEducations(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUserEducation> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__hospitalUserEducations", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserEducationRepository hospitalUserEducationRepo = getRestAdapter().createRepository(HospitalUserEducationRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserEducationRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserEducationRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserEducationRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserEducation hospitalUserEducation = hospitalUserEducationRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserEducation.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserEducation);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserEducation);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__hospitalUserEducations definition ends here..

            

        
    
        
            //Method get__registrationCouncil definition
            public void get__registrationCouncil(  String hospitalUserId,  Boolean refresh, final ObjectCallback<RegistrationCouncil> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__registrationCouncil", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    RegistrationCouncilRepository registrationCouncilRepo = getRestAdapter().createRepository(RegistrationCouncilRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = registrationCouncilRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(registrationCouncilRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //registrationCouncilRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    RegistrationCouncil registrationCouncil = registrationCouncilRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = registrationCouncil.getClass().getMethod("save__db");
                                                    method.invoke(registrationCouncil);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(registrationCouncil);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__registrationCouncil definition ends here..

            

        
    
        
            //Method get__state definition
            public void get__state(  String hospitalUserId,  Boolean refresh, final ObjectCallback<State> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__state", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    StateRepository stateRepo = getRestAdapter().createRepository(StateRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = stateRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(stateRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //stateRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    State state = stateRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = state.getClass().getMethod("save__db");
                                                    method.invoke(state);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(state);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__state definition ends here..

            

        
    
        
            //Method get__pincode definition
            public void get__pincode(  String hospitalUserId,  Boolean refresh, final ObjectCallback<Pincode> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__pincode", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PincodeRepository pincodeRepo = getRestAdapter().createRepository(PincodeRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = pincodeRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(pincodeRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //pincodeRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Pincode pincode = pincodeRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = pincode.getClass().getMethod("save__db");
                                                    method.invoke(pincode);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(pincode);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__pincode definition ends here..

            

        
    
        
            //Method get__taluk definition
            public void get__taluk(  String hospitalUserId,  Boolean refresh, final ObjectCallback<Taluk> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__taluk", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    TalukRepository talukRepo = getRestAdapter().createRepository(TalukRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = talukRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(talukRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //talukRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Taluk taluk = talukRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = taluk.getClass().getMethod("save__db");
                                                    method.invoke(taluk);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(taluk);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__taluk definition ends here..

            

        
    
        
            //Method get__district definition
            public void get__district(  String hospitalUserId,  Boolean refresh, final ObjectCallback<District> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("refresh", refresh);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__get__district", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    DistrictRepository districtRepo = getRestAdapter().createRepository(DistrictRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = districtRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(districtRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //districtRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    District district = districtRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = district.getClass().getMethod("save__db");
                                                    method.invoke(district);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(district);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method get__district definition ends here..

            

        
    
        
            //Method findById__referPatients definition
            public void findById__referPatients(  String hospitalUserId,  String fk, final ObjectCallback<ReferPatient> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__referPatients", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ReferPatientRepository referPatientRepo = getRestAdapter().createRepository(ReferPatientRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = referPatientRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(referPatientRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //referPatientRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ReferPatient referPatient = referPatientRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = referPatient.getClass().getMethod("save__db");
                                                    method.invoke(referPatient);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(referPatient);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__referPatients definition ends here..

            

        
    
        
            //Method destroyById__referPatients definition
            public void destroyById__referPatients(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__referPatients", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__referPatients definition ends here..

            

        
    
        
            //Method updateById__referPatients definition
            public void updateById__referPatients(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<ReferPatient> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__referPatients", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ReferPatientRepository referPatientRepo = getRestAdapter().createRepository(ReferPatientRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = referPatientRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(referPatientRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //referPatientRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ReferPatient referPatient = referPatientRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = referPatient.getClass().getMethod("save__db");
                                                    method.invoke(referPatient);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(referPatient);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__referPatients definition ends here..

            

        
    
        
            //Method findById__chatItems definition
            public void findById__chatItems(  String hospitalUserId,  String fk, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__findById__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById__chatItems definition ends here..

            

        
    
        
            //Method destroyById__chatItems definition
            public void destroyById__chatItems(  String hospitalUserId,  String fk, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                

                
                    invokeStaticMethod("prototype.__destroyById__chatItems", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method destroyById__chatItems definition ends here..

            

        
    
        
            //Method updateById__chatItems definition
            public void updateById__chatItems(  String hospitalUserId,  String fk,  Map<String,  ? extends Object> data, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("fk", fk);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__updateById__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateById__chatItems definition ends here..

            

        
    
        
            //Method get__accessTokens definition
            public void get__accessTokens(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<AccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__accessTokens", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<AccessToken> accessTokenList = new DataList<AccessToken>();
                                    AccessTokenRepository accessTokenRepo = getRestAdapter().createRepository(AccessTokenRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = accessTokenRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(accessTokenRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        AccessToken accessToken = accessTokenRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = accessToken.getClass().getMethod("save__db");
                                                      method.invoke(accessToken);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        accessTokenList.add(accessToken);
                                    }
                                    callback.onSuccess(accessTokenList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__accessTokens definition ends here..

            

        
    
        
            //Method create__accessTokens definition
            public void create__accessTokens(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<AccessToken> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__accessTokens", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    AccessTokenRepository accessTokenRepo = getRestAdapter().createRepository(AccessTokenRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = accessTokenRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(accessTokenRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //accessTokenRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    AccessToken accessToken = accessTokenRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = accessToken.getClass().getMethod("save__db");
                                                    method.invoke(accessToken);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(accessToken);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__accessTokens definition ends here..

            

        
    
        
            //Method delete__accessTokens definition
            public void delete__accessTokens(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__accessTokens", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__accessTokens definition ends here..

            

        
    
        
            //Method count__accessTokens definition
            public void count__accessTokens(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__accessTokens", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__accessTokens definition ends here..

            

        
    
        
            //Method get__patientGroups definition
            public void get__patientGroups(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__patientGroups", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<PatientGroup> patientGroupList = new DataList<PatientGroup>();
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        PatientGroup patientGroup = patientGroupRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = patientGroup.getClass().getMethod("save__db");
                                                      method.invoke(patientGroup);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        patientGroupList.add(patientGroup);
                                    }
                                    callback.onSuccess(patientGroupList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__patientGroups definition ends here..

            

        
    
        
            //Method create__patientGroups definition
            public void create__patientGroups(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<PatientGroup> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__patientGroups", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientGroupRepository patientGroupRepo = getRestAdapter().createRepository(PatientGroupRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientGroupRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientGroupRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientGroupRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientGroup patientGroup = patientGroupRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientGroup.getClass().getMethod("save__db");
                                                    method.invoke(patientGroup);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientGroup);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__patientGroups definition ends here..

            

        
    
        
            //Method delete__patientGroups definition
            public void delete__patientGroups(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__patientGroups", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__patientGroups definition ends here..

            

        
    
        
            //Method count__patientGroups definition
            public void count__patientGroups(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__patientGroups", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__patientGroups definition ends here..

            

        
    
        
            //Method get__userInvites definition
            public void get__userInvites(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<UserInvite> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__userInvites", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<UserInvite> userInviteList = new DataList<UserInvite>();
                                    UserInviteRepository userInviteRepo = getRestAdapter().createRepository(UserInviteRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = userInviteRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(userInviteRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        UserInvite userInvite = userInviteRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = userInvite.getClass().getMethod("save__db");
                                                      method.invoke(userInvite);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        userInviteList.add(userInvite);
                                    }
                                    callback.onSuccess(userInviteList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__userInvites definition ends here..

            

        
    
        
            //Method create__userInvites definition
            public void create__userInvites(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<UserInvite> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__userInvites", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    UserInviteRepository userInviteRepo = getRestAdapter().createRepository(UserInviteRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = userInviteRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(userInviteRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //userInviteRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    UserInvite userInvite = userInviteRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = userInvite.getClass().getMethod("save__db");
                                                    method.invoke(userInvite);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(userInvite);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__userInvites definition ends here..

            

        
    
        
            //Method delete__userInvites definition
            public void delete__userInvites(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__userInvites", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__userInvites definition ends here..

            

        
    
        
            //Method count__userInvites definition
            public void count__userInvites(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__userInvites", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__userInvites definition ends here..

            

        
    
        
            //Method get__patientSecurities definition
            public void get__patientSecurities(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<PatientSecurity> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__patientSecurities", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<PatientSecurity> patientSecurityList = new DataList<PatientSecurity>();
                                    PatientSecurityRepository patientSecurityRepo = getRestAdapter().createRepository(PatientSecurityRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientSecurityRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientSecurityRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        PatientSecurity patientSecurity = patientSecurityRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = patientSecurity.getClass().getMethod("save__db");
                                                      method.invoke(patientSecurity);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        patientSecurityList.add(patientSecurity);
                                    }
                                    callback.onSuccess(patientSecurityList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__patientSecurities definition ends here..

            

        
    
        
            //Method create__patientSecurities definition
            public void create__patientSecurities(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<PatientSecurity> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__patientSecurities", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    PatientSecurityRepository patientSecurityRepo = getRestAdapter().createRepository(PatientSecurityRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = patientSecurityRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(patientSecurityRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //patientSecurityRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    PatientSecurity patientSecurity = patientSecurityRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = patientSecurity.getClass().getMethod("save__db");
                                                    method.invoke(patientSecurity);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(patientSecurity);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__patientSecurities definition ends here..

            

        
    
        
            //Method delete__patientSecurities definition
            public void delete__patientSecurities(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__patientSecurities", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__patientSecurities definition ends here..

            

        
    
        
            //Method count__patientSecurities definition
            public void count__patientSecurities(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__patientSecurities", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__patientSecurities definition ends here..

            

        
    
        
            //Method get__hospitals definition
            public void get__hospitals(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<Hospital> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__hospitals", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<Hospital> hospitalList = new DataList<Hospital>();
                                    HospitalRepository hospitalRepo = getRestAdapter().createRepository(HospitalRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        Hospital hospital = hospitalRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = hospital.getClass().getMethod("save__db");
                                                      method.invoke(hospital);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        hospitalList.add(hospital);
                                    }
                                    callback.onSuccess(hospitalList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__hospitals definition ends here..

            

        
    
        
            //Method create__hospitals definition
            public void create__hospitals(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<Hospital> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__hospitals", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalRepository hospitalRepo = getRestAdapter().createRepository(HospitalRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    Hospital hospital = hospitalRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospital.getClass().getMethod("save__db");
                                                    method.invoke(hospital);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospital);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__hospitals definition ends here..

            

        
    
        
            //Method delete__hospitals definition
            public void delete__hospitals(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__hospitals", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__hospitals definition ends here..

            

        
    
        
            //Method count__hospitals definition
            public void count__hospitals(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__hospitals", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__hospitals definition ends here..

            

        
    
        
            //Method get__hospitalUserSpecializations definition
            public void get__hospitalUserSpecializations(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<HospitalUserSpecialization> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__hospitalUserSpecializations", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<HospitalUserSpecialization> hospitalUserSpecializationList = new DataList<HospitalUserSpecialization>();
                                    HospitalUserSpecializationRepository hospitalUserSpecializationRepo = getRestAdapter().createRepository(HospitalUserSpecializationRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserSpecializationRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserSpecializationRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        HospitalUserSpecialization hospitalUserSpecialization = hospitalUserSpecializationRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = hospitalUserSpecialization.getClass().getMethod("save__db");
                                                      method.invoke(hospitalUserSpecialization);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        hospitalUserSpecializationList.add(hospitalUserSpecialization);
                                    }
                                    callback.onSuccess(hospitalUserSpecializationList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__hospitalUserSpecializations definition ends here..

            

        
    
        
            //Method create__hospitalUserSpecializations definition
            public void create__hospitalUserSpecializations(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUserSpecialization> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__hospitalUserSpecializations", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserSpecializationRepository hospitalUserSpecializationRepo = getRestAdapter().createRepository(HospitalUserSpecializationRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserSpecializationRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserSpecializationRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserSpecializationRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserSpecialization hospitalUserSpecialization = hospitalUserSpecializationRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserSpecialization.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserSpecialization);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserSpecialization);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__hospitalUserSpecializations definition ends here..

            

        
    
        
            //Method delete__hospitalUserSpecializations definition
            public void delete__hospitalUserSpecializations(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__hospitalUserSpecializations", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__hospitalUserSpecializations definition ends here..

            

        
    
        
            //Method count__hospitalUserSpecializations definition
            public void count__hospitalUserSpecializations(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__hospitalUserSpecializations", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__hospitalUserSpecializations definition ends here..

            

        
    
        
            //Method get__hospitalUserSettings definition
            public void get__hospitalUserSettings(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<HospitalUserSetting> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__hospitalUserSettings", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<HospitalUserSetting> hospitalUserSettingList = new DataList<HospitalUserSetting>();
                                    HospitalUserSettingRepository hospitalUserSettingRepo = getRestAdapter().createRepository(HospitalUserSettingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserSettingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserSettingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        HospitalUserSetting hospitalUserSetting = hospitalUserSettingRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = hospitalUserSetting.getClass().getMethod("save__db");
                                                      method.invoke(hospitalUserSetting);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        hospitalUserSettingList.add(hospitalUserSetting);
                                    }
                                    callback.onSuccess(hospitalUserSettingList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__hospitalUserSettings definition ends here..

            

        
    
        
            //Method create__hospitalUserSettings definition
            public void create__hospitalUserSettings(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUserSetting> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__hospitalUserSettings", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserSettingRepository hospitalUserSettingRepo = getRestAdapter().createRepository(HospitalUserSettingRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserSettingRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserSettingRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserSettingRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserSetting hospitalUserSetting = hospitalUserSettingRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserSetting.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserSetting);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserSetting);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__hospitalUserSettings definition ends here..

            

        
    
        
            //Method delete__hospitalUserSettings definition
            public void delete__hospitalUserSettings(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__hospitalUserSettings", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__hospitalUserSettings definition ends here..

            

        
    
        
            //Method count__hospitalUserSettings definition
            public void count__hospitalUserSettings(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__hospitalUserSettings", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__hospitalUserSettings definition ends here..

            

        
    
        
            //Method get__hospitalUserEducations definition
            public void get__hospitalUserEducations(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<HospitalUserEducation> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__hospitalUserEducations", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<HospitalUserEducation> hospitalUserEducationList = new DataList<HospitalUserEducation>();
                                    HospitalUserEducationRepository hospitalUserEducationRepo = getRestAdapter().createRepository(HospitalUserEducationRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserEducationRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserEducationRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        HospitalUserEducation hospitalUserEducation = hospitalUserEducationRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = hospitalUserEducation.getClass().getMethod("save__db");
                                                      method.invoke(hospitalUserEducation);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        hospitalUserEducationList.add(hospitalUserEducation);
                                    }
                                    callback.onSuccess(hospitalUserEducationList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__hospitalUserEducations definition ends here..

            

        
    
        
            //Method create__hospitalUserEducations definition
            public void create__hospitalUserEducations(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUserEducation> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__hospitalUserEducations", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserEducationRepository hospitalUserEducationRepo = getRestAdapter().createRepository(HospitalUserEducationRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserEducationRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserEducationRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserEducationRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUserEducation hospitalUserEducation = hospitalUserEducationRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUserEducation.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUserEducation);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUserEducation);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__hospitalUserEducations definition ends here..

            

        
    
        
            //Method delete__hospitalUserEducations definition
            public void delete__hospitalUserEducations(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__hospitalUserEducations", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__hospitalUserEducations definition ends here..

            

        
    
        
            //Method count__hospitalUserEducations definition
            public void count__hospitalUserEducations(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__hospitalUserEducations", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__hospitalUserEducations definition ends here..

            

        
    
        
            //Method get__referPatients definition
            public void get__referPatients(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<ReferPatient> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__referPatients", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<ReferPatient> referPatientList = new DataList<ReferPatient>();
                                    ReferPatientRepository referPatientRepo = getRestAdapter().createRepository(ReferPatientRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = referPatientRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(referPatientRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        ReferPatient referPatient = referPatientRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = referPatient.getClass().getMethod("save__db");
                                                      method.invoke(referPatient);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        referPatientList.add(referPatient);
                                    }
                                    callback.onSuccess(referPatientList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__referPatients definition ends here..

            

        
    
        
            //Method create__referPatients definition
            public void create__referPatients(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<ReferPatient> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__referPatients", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ReferPatientRepository referPatientRepo = getRestAdapter().createRepository(ReferPatientRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = referPatientRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(referPatientRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //referPatientRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ReferPatient referPatient = referPatientRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = referPatient.getClass().getMethod("save__db");
                                                    method.invoke(referPatient);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(referPatient);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__referPatients definition ends here..

            

        
    
        
            //Method delete__referPatients definition
            public void delete__referPatients(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__referPatients", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__referPatients definition ends here..

            

        
    
        
            //Method count__referPatients definition
            public void count__referPatients(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__referPatients", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__referPatients definition ends here..

            

        
    
        
            //Method get__chatItems definition
            public void get__chatItems(  String hospitalUserId,  Map<String,  ? extends Object> filter, final DataListCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("prototype.__get__chatItems", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<ChatItem> chatItemList = new DataList<ChatItem>();
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        ChatItem chatItem = chatItemRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = chatItem.getClass().getMethod("save__db");
                                                      method.invoke(chatItem);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        chatItemList.add(chatItem);
                                    }
                                    callback.onSuccess(chatItemList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method get__chatItems definition ends here..

            

        
    
        
            //Method create__chatItems definition
            public void create__chatItems(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<ChatItem> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.__create__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    ChatItemRepository chatItemRepo = getRestAdapter().createRepository(ChatItemRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = chatItemRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(chatItemRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //chatItemRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    ChatItem chatItem = chatItemRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = chatItem.getClass().getMethod("save__db");
                                                    method.invoke(chatItem);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(chatItem);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create__chatItems definition ends here..

            

        
    
        
            //Method delete__chatItems definition
            public void delete__chatItems(  String hospitalUserId, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                
                    invokeStaticMethod("prototype.__delete__chatItems", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method delete__chatItems definition ends here..

            

        
    
        
            //Method count__chatItems definition
            public void count__chatItems(  String hospitalUserId,  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("prototype.__count__chatItems", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count__chatItems definition ends here..

            

        
    
        
            //Method create definition
            public void create(  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("create", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUser hospitalUser = hospitalUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUser.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method create definition ends here..

            

        
    
        
        
            //Method upsert definition
            public void upsert(  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("upsert", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUser hospitalUser = hospitalUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUser.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method upsert definition ends here..

            

        
    
        
            //Method exists definition
            public void exists(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("exists", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method exists definition ends here..

            

        
    
        
            //Method findById definition
            public void findById(  String id,  Map<String,  ? extends Object> filter, final ObjectCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUser hospitalUser = hospitalUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUser.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findById definition ends here..

            

        
    
        
            //Method find definition
            public void find(  Map<String,  ? extends Object> filter, final DataListCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                

                
                    invokeStaticMethod("find", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                if(response != null){
                                    //Now converting jsonObject to list
                                    DataList<Map<String, Object>> result = (DataList) Util.fromJson(response);
                                    DataList<HospitalUser> hospitalUserList = new DataList<HospitalUser>();
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }
                                    }
                                    for (Map<String, Object> obj : result) {

                                        HospitalUser hospitalUser = hospitalUserRepo.createObject(obj);

                                        //Add to database if persistent storage required..
                                        if(isSTORE_LOCALLY()){
                                            //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                            try {
                                                      Method method = hospitalUser.getClass().getMethod("save__db");
                                                      method.invoke(hospitalUser);

                                            } catch (Exception e) {
                                                Log.e("Database Error", e.toString());
                                            }
                                        }

                                        hospitalUserList.add(hospitalUser);
                                    }
                                    callback.onSuccess(hospitalUserList);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method find definition ends here..

            

        
    
        
            //Method findOne definition
            public void findOne(  Map<String,  ? extends Object> filter, final ObjectCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("filter", filter);
                

                


                
                    
                    
                    invokeStaticMethod("findOne", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUser hospitalUser = hospitalUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUser.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method findOne definition ends here..

            

        
    
        
            //Method updateAll definition
            public void updateAll(  Map<String,  ? extends Object> where,  Map<String,  ? extends Object> data, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    invokeStaticMethod("updateAll", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAll definition ends here..

            

        
    
        
            //Method deleteById definition
            public void deleteById(  String id, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("id", id);
                

                


                
                    
                    invokeStaticMethod("deleteById", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method deleteById definition ends here..

            

        
    
        
            //Method count definition
            public void count(  Map<String,  ? extends Object> where, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("where", where);
                

                


                
                    
                    invokeStaticMethod("count", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method count definition ends here..

            

        
    
        
            //Method updateAttributes definition
            public void updateAttributes(  String hospitalUserId,  Map<String,  ? extends Object> data, final ObjectCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                
                        hashMapObject.putAll(data);
                

                


                
                    
                    
                    invokeStaticMethod("prototype.updateAttributes", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUser hospitalUser = hospitalUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUser.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method updateAttributes definition ends here..

            

        
    
        
    
        
    
        
    
        
            //Method confirm definition
            public void confirm(  String uid,  String token,  String redirect, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("uid", uid);
                
                        hashMapObject.put("token", token);
                
                        hashMapObject.put("redirect", redirect);
                

                
                    invokeStaticMethod("confirm", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method confirm definition ends here..

            

        
    
        
            //Method resetPassword definition
            public void resetPassword(  Map<String,  ? extends Object> options, final VoidCallback callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("options", options);
                

                
                    invokeStaticMethod("resetPassword", hashMapObject, new Adapter.Callback() {
                        @Override
                        public void onError(Throwable t) {
                                callback.onError(t);
                                //Call the finally method..
                                callback.onFinally();
                        }

                        @Override
                        public void onSuccess(String response) {
                            callback.onSuccess();
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                


                

                

            }//Method resetPassword definition ends here..

            

        
    
        
            //Method getSchema definition
            public void getSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
            //Method getAbsoluteSchema definition
            public void getAbsoluteSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getAbsoluteSchema definition ends here..

            

        
    
        
    
        
            //Method getDetailSchema definition
            public void getDetailSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getDetailSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getDetailSchema definition ends here..

            

        
    
        
            //Method getModelRelationSchema definition
            public void getModelRelationSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getModelRelationSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getModelRelationSchema definition ends here..

            

        
    
        
            //Method requestOtp definition
            public void requestOtp(  String number, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("number", number);
                

                


                
                    
                    invokeStaticMethod("requestOtp", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method requestOtp definition ends here..

            

        
    
        
            //Method retryOtp definition
            public void retryOtp(  String number, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("number", number);
                

                


                
                    
                    invokeStaticMethod("retryOtp", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method retryOtp definition ends here..

            

        
    
        
            //Method loginWithOtp definition
            public void loginWithOtp(  String number,  String otp, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("number", number);
                
                        hashMapObject.put("otp", otp);
                

                


                
                    
                    invokeStaticMethod("loginWithOtp", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method loginWithOtp definition ends here..

            

        
    
        
            //Method joinHospital definition
            public void joinHospital(  Map<String,  ? extends Object> ctx,  String userInviteCode, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("userInviteCode", userInviteCode);
                

                


                
                    
                    invokeStaticMethod("joinHospital", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method joinHospital definition ends here..

            

        
    
        
            //Method registerHospitalUser definition
            public void registerHospitalUser(  Map<String,  ? extends Object> ctx,  Map<String,  ? extends Object> hospitalUserObj,  DataList<String> specialityIds, final ObjectCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("hospitalUserObj", hospitalUserObj);
                
                        hashMapObject.put("specialityIds", specialityIds);
                

                


                
                    
                    
                    invokeStaticMethod("registerHospitalUser", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUser hospitalUser = hospitalUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUser.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method registerHospitalUser definition ends here..

            

        
    
        
            //Method findHospitalAndDoctors definition
            public void findHospitalAndDoctors(  Map<String,  ? extends Object> ctx, final ObjectCallback<JSONArray> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                

                


                

                
                    invokeStaticMethod("findHospitalAndDoctors", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method findHospitalAndDoctors definition ends here..

            

        
    
        
            //Method fetchingManageUser definition
            public void fetchingManageUser(  String roleType,  String hospitalId, final ObjectCallback<JSONArray> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("roleType", roleType);
                
                        hashMapObject.put("hospitalId", hospitalId);
                

                


                

                
                    invokeStaticMethod("fetchingManageUser", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method fetchingManageUser definition ends here..

            

        
    
        
            //Method checkPendingInvitation definition
            public void checkPendingInvitation(  String hospitalUserId, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                


                
                    
                    invokeStaticMethod("checkPendingInvitation", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method checkPendingInvitation definition ends here..

            

        
    
        
            //Method fetchHospitalUserProfile definition
            public void fetchHospitalUserProfile(  Map<String,  ? extends Object> ctx,  String hospitalUserId, final ObjectCallback<HospitalUser> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("hospitalUserId", hospitalUserId);
                

                


                
                    
                    
                    invokeStaticMethod("fetchHospitalUserProfile", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                            
                                if(response != null){
                                    HospitalUserRepository hospitalUserRepo = getRestAdapter().createRepository(HospitalUserRepository.class);
                                    if(context != null){
                                        try {
                                            Method method = hospitalUserRepo.getClass().getMethod("addStorage", Context.class);
                                            method.invoke(hospitalUserRepo, context);

                                        } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                        }

                                        //hospitalUserRepo.addStorage(context);
                                    }
                                    Map<String, Object> result = Util.fromJson(response);
                                    HospitalUser hospitalUser = hospitalUserRepo.createObject(result);

                                      //Add to database if persistent storage required..
                                      if(isSTORE_LOCALLY()){
                                          //http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
                                          try {
                                                    Method method = hospitalUser.getClass().getMethod("save__db");
                                                    method.invoke(hospitalUser);

                                          } catch (Exception e) {
                                            Log.e("Database Error", e.toString());
                                          }

                                      }

                                    callback.onSuccess(hospitalUser);
                                }else{
                                    callback.onSuccess(null);
                                }
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method fetchHospitalUserProfile definition ends here..

            

        
    
        
            //Method searchForDocterHospital definition
            public void searchForDocterHospital(  Map<String,  ? extends Object> ctx,  String searchName, final ObjectCallback<JSONArray> callback){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("ctx", ctx);
                
                        hashMapObject.put("searchName", searchName);
                

                


                

                
                    invokeStaticMethod("searchForDocterHospital", hashMapObject, new Adapter.JsonArrayCallback() {
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONArray response) {
                            
                                callback.onSuccess(response);
                            
                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

            }//Method searchForDocterHospital definition ends here..

            

        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    
        
    



}
