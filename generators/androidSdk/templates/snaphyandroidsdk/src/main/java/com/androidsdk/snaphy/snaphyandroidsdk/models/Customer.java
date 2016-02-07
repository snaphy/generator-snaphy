package com.androidsdk.snaphy.snaphyandroidsdk.models;




import com.strongloop.android.loopback.Model;


import com.strongloop.android.loopback.Model;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.loopback.callbacks.ListCallback;
import com.strongloop.android.loopback.callbacks.ObjectCallback;
import com.strongloop.android.loopback.callbacks.VoidCallback;

//Now import repository of related models..

    
        import com.androidsdk.snaphy.snaphyandroidsdk.repository.RecipeRepository;

    

    
        import com.androidsdk.snaphy.snaphyandroidsdk.repository.CommentsRepository;

    

    
        import com.androidsdk.snaphy.snaphyandroidsdk.repository.WishlistRepository;

    


import java.util.ArrayList;
import java.util.HashMap;



public class Customer extends Model {



    
        
            
            
                private String date;
                /* Adding Getter and Setter methods */
                public String getDate(){
                    return date;
                }

                /* Adding Getter and Setter methods */
                public void setDate(String date){
                    this.date = date;
                }

            
            
            

        
    
        
            
            
                private String phoneNumber;
                /* Adding Getter and Setter methods */
                public String getPhoneNumber(){
                    return phoneNumber;
                }

                /* Adding Getter and Setter methods */
                public void setPhoneNumber(String phoneNumber){
                    this.phoneNumber = phoneNumber;
                }

            
            
            

        
    
        
            
            
                private String email;
                /* Adding Getter and Setter methods */
                public String getEmail(){
                    return email;
                }

                /* Adding Getter and Setter methods */
                public void setEmail(String email){
                    this.email = email;
                }

            
            
            

        
    
        
            
            
                private String firstName;
                /* Adding Getter and Setter methods */
                public String getFirstName(){
                    return firstName;
                }

                /* Adding Getter and Setter methods */
                public void setFirstName(String firstName){
                    this.firstName = firstName;
                }

            
            
            

        
    
        
            
            
                private String lastName;
                /* Adding Getter and Setter methods */
                public String getLastName(){
                    return lastName;
                }

                /* Adding Getter and Setter methods */
                public void setLastName(String lastName){
                    this.lastName = lastName;
                }

            
            
            

        
    
        
            
            
                private String password;
                /* Adding Getter and Setter methods */
                public String getPassword(){
                    return password;
                }

                /* Adding Getter and Setter methods */
                public void setPassword(String password){
                    this.password = password;
                }

            
            
            

        
    
        
            
            
            
            
                private HashMap<String, Object> profilePic;
                /* Adding Getter and Setter methods */
                public HashMap<String, Object> getProfilePic(){
                    return profilePic;
                }

                /* Adding Getter and Setter methods */
                public void setProfilePic(HashMap<String, Object> profilePic){
                    this.profilePic = profilePic;
                }

            

        
    
        
            
            
            
            

        
    
        
            
            
            
            

        
    


    



    //Now adding relations between related models
    
        
            
            
                //Define hasMany, hasManyThrough method here..

            
            
        
    
        
            
            
                //Define hasMany, hasManyThrough method here..

            
            
        
    
        
            
                //Define belongsTo relation method here..
                private Wishlist  wishlist ;

                public Wishlist getWishlist() {
                    return wishlist;
                }

                public void setWishlist(Wishlist wishlist) {
                    this.wishlist = wishlist;
                }

                //Adding related model automatically in case of include statement from server..
                public void setWishlist(HashMap<String, Object> lowercaseRelatedModelName) {
                    //First create a dummy Repo class object for customer.
                    WishlistRepository wishlistRepository = new WishlistRepository();
                    Wishlist wishlist1 = wishlistRepository.createObject(wishlist);
                    setWishlist(wishlist1);
                }

                //Adding relation method..
                public void addRelation(Wishlist wishlist) {
                    this.setCustomer(wishlist);
                }


                //Now add instance methods to fetch the related belongsTo Model..
                

                
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                                //Write the methods here..
                                public void get__wishlists( Boolean refresh,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void create__wishlists( Wishlist data,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void update__wishlists( Wishlist data,  RestAdapter restAdapter, final ObjectCallback<Wishlist> callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                                //Write the methods here..
                                public void destroy__wishlists( RestAdapter restAdapter, final VoidCallback callback) {
                                    //Define methods here..


                                }
                            
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                        
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                     

            
            
            
        
    

}
