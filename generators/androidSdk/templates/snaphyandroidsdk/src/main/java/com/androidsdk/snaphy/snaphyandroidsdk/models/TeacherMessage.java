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
import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeacherMessageRepository;

//Now import repository of related models..

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.TeacherRepository;
            

        
    

    
            import com.androidsdk.snaphy.snaphyandroidsdk.repository.MessageRepository;
            

        
    


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class TeacherMessage extends Model {


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

    private TeacherMessage that ;

    public TeacherMessage (){
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
      TeacherMessageRepository lowercaseFirstLetterRepository = (TeacherMessageRepository) getRepository();
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
      TeacherMessageRepository lowercaseFirstLetterRepository = (TeacherMessageRepository) getRepository();

      if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
        if(id != null && lowercaseFirstLetterRepository.getDb() != null){
          lowercaseFirstLetterRepository.getDb().upsert__db(id, this);
        }
      }
    }


    public void delete__db(){
      TeacherMessageRepository lowercaseFirstLetterRepository = (TeacherMessageRepository) getRepository();
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
                    private transient Teacher  teacher ;
                    private String teacherId;

                    public String getTeacherId(){
                         return teacherId;
                    }

                    public void setTeacherId(Object teacherId){
                        if(teacherId != null){
                          this.teacherId = teacherId.toString();
                        }
                    }

                    public Teacher getTeacher() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(teacher == null){
		                  TeacherMessageRepository teacherMessageRepository = (TeacherMessageRepository) getRepository();

		                  RestAdapter restAdapter = teacherMessageRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    teacher = getTeacher__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return teacher;
                    }

                    public void setTeacher(Teacher teacher) {
                        this.teacher = teacher;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTeacher(Map<String, Object> teacher) {
                        //First create a dummy Repo class object for customer.
                        TeacherRepository teacherRepository = new TeacherRepository();
                        Teacher teacher1 = teacherRepository.createObject(teacher);
                        setTeacher(teacher1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setTeacher(HashMap<String, Object> teacher) {
                        //First create a dummy Repo class object for customer.
                        TeacherRepository teacherRepository = new TeacherRepository();
                        Teacher teacher1 = teacherRepository.createObject(teacher);
                        setTeacher(teacher1);
                    }

                    //Adding relation method..
                    public void addRelation(Teacher teacher) {
                        that.setTeacher(teacher);
                    }


                    //Fetch related data from local database if present a teacherId identifier as property for belongsTo
                    public Teacher getTeacher__db(RestAdapter restAdapter){
                      if(teacherId != null){
                        TeacherRepository teacherRepository = restAdapter.createRepository(TeacherRepository.class);
			  try{
				TeacherMessageRepository lowercaseFirstLetterRepository = (TeacherMessageRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(teacherRepository.getDb() == null ){
		                            teacherRepository.addStorage(context);
		                        }

		                        if(context != null && teacherRepository.getDb() != null){
		                            teacherRepository.addStorage(context);
		                            Teacher teacher = (Teacher) teacherRepository.getDb().get__db(teacherId);
		                            return teacher;
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
                                    public void get__teacher( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Teacher> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeacherMessageRepository  teacherMessageRepo = restAdapter.createRepository(TeacherMessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teacherMessageRepo.get__teacher( (String)that.getId(), refresh,  new ObjectCallback<Teacher> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Teacher object) {
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
                    private transient Message  message ;
                    private String messageId;

                    public String getMessageId(){
                         return messageId;
                    }

                    public void setMessageId(Object messageId){
                        if(messageId != null){
                          this.messageId = messageId.toString();
                        }
                    }

                    public Message getMessage() {
			try{
				//Adding database method for fetching from relation if not present..
		                if(message == null){
		                  TeacherMessageRepository teacherMessageRepository = (TeacherMessageRepository) getRepository();

		                  RestAdapter restAdapter = teacherMessageRepository.getRestAdapter();
		                  if(restAdapter != null){
		                    //Fetch locally from db
		                    message = getMessage__db(restAdapter);
		                  }
		                }
			}catch(Exception e){
				//Ignore
			}

                        return message;
                    }

                    public void setMessage(Message message) {
                        this.message = message;
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setMessage(Map<String, Object> message) {
                        //First create a dummy Repo class object for customer.
                        MessageRepository messageRepository = new MessageRepository();
                        Message message1 = messageRepository.createObject(message);
                        setMessage(message1);
                    }

                    //Adding related model automatically in case of include statement from server..
                    public void setMessage(HashMap<String, Object> message) {
                        //First create a dummy Repo class object for customer.
                        MessageRepository messageRepository = new MessageRepository();
                        Message message1 = messageRepository.createObject(message);
                        setMessage(message1);
                    }

                    //Adding relation method..
                    public void addRelation(Message message) {
                        that.setMessage(message);
                    }


                    //Fetch related data from local database if present a messageId identifier as property for belongsTo
                    public Message getMessage__db(RestAdapter restAdapter){
                      if(messageId != null){
                        MessageRepository messageRepository = restAdapter.createRepository(MessageRepository.class);
			  try{
				TeacherMessageRepository lowercaseFirstLetterRepository = (TeacherMessageRepository) getRepository();
		                  if(lowercaseFirstLetterRepository.isSTORE_LOCALLY()){
		                        Context context = lowercaseFirstLetterRepository.getContext();
		                        if(messageRepository.getDb() == null ){
		                            messageRepository.addStorage(context);
		                        }

		                        if(context != null && messageRepository.getDb() != null){
		                            messageRepository.addStorage(context);
		                            Message message = (Message) messageRepository.getDb().get__db(messageId);
		                            return message;
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
                                    public void get__message( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Message> callback) {
                                        //Call the onBefore callback method..
                                        callback.onBefore();

                                        //Define methods here..
                                        final TeacherMessageRepository  teacherMessageRepo = restAdapter.createRepository(TeacherMessageRepository.class);
                                        
                                        
                                        
                                        
                                        



                                        teacherMessageRepo.get__message( (String)that.getId(), refresh,  new ObjectCallback<Message> (){
                                            

                                            
                                                @Override
                                                
                                                    public void onSuccess(Message object) {
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
