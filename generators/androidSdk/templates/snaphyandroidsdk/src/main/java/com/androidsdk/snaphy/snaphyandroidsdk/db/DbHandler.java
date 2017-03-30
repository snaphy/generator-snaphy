package com.androidsdk.snaphy.snaphyandroidsdk.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by robins on 16/2/17.
 */



public class DbHandler extends SQLiteOpenHelper {
        private static DbHandler sInstance;
        // Database Version
        private static final int DATABASE_VERSION = 1;
        public static synchronized DbHandler getInstance(Context context, String DATABASE_NAME){
            // Use the application context, which will ensure that you don't accidentally leak an Activity's context.
            if (sInstance == null) {
                sInstance = new DbHandler(context.getApplicationContext(), DATABASE_NAME);
            }
            return sInstance;
        }


        // Creating Tables
        @Override
        public void onCreate(SQLiteDatabase db) {

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_AmazonImage_TABLE_5 = "CREATE TABLE IF NOT EXISTS `AmazonImage` (  `name` TEXT, `container` TEXT, `type` TEXT, `url` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_AmazonImage_TABLE_5);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_CompanyInfo_TABLE_6 = "CREATE TABLE IF NOT EXISTS `CompanyInfo` (  `type` TEXT, `html` TEXT, `edited` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_CompanyInfo_TABLE_6);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_adminEmail_TABLE_7 = "CREATE TABLE IF NOT EXISTS `adminEmail` (  `to` TEXT, `from` TEXT, `subject` TEXT, `text` TEXT, `html` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_adminEmail_TABLE_7);


                                                                                                                                                    
                        

                        
                        String CREATE_container_TABLE_9 = "CREATE TABLE IF NOT EXISTS `container` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_container_TABLE_9);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Employee_TABLE_11 = "CREATE TABLE IF NOT EXISTS `Employee` (  `username` TEXT, `firstName` TEXT, `lastName` TEXT, `date` TEXT, `updated` TEXT, `email` TEXT, `password` TEXT, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Employee_TABLE_11);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Customer_TABLE_12 = "CREATE TABLE IF NOT EXISTS `Customer` (  `date` TEXT, `lastModified` TEXT, `email` TEXT, `firstName` TEXT, `lastName` TEXT, `mciNumber` TEXT, `phoneNumber` TEXT, `status` TEXT, `registrationId` TEXT, `profilePic` TEXT, `currentCity` TEXT, `workExperience` NUMBER, `realm` TEXT, `username` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, facebookAccessTokenId TEXT , _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Customer_TABLE_12);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_FacebookAccessToken_TABLE_13 = "CREATE TABLE IF NOT EXISTS `FacebookAccessToken` (  `FbUserId` TEXT, `token` TEXT, `expires` TEXT, `userId` TEXT, `type` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_FacebookAccessToken_TABLE_13);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_application_TABLE_14 = "CREATE TABLE IF NOT EXISTS `application` (  `id` TEXT PRIMARY KEY, `realm` TEXT, `name` TEXT, `description` TEXT, `icon` TEXT, `owner` TEXT, `collaborators` TEXT, `email` TEXT, `emailVerified` TEXT, `url` TEXT, `callbackUrls` TEXT, `permissions` TEXT, `clientKey` TEXT, `javaScriptKey` TEXT, `restApiKey` TEXT, `windowsKey` TEXT, `masterKey` TEXT, `pushSettings` TEXT, `authenticationEnabled` TEXT, `anonymousAllowed` TEXT, `authenticationSchemes` TEXT, `status` TEXT, `created` TEXT, `modified` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_application_TABLE_14);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_installation_TABLE_16 = "CREATE TABLE IF NOT EXISTS `installation` (  `status` TEXT, `appId` TEXT, `appVersion` TEXT, `badge` TEXT, `created` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `modified` TEXT, `subscriptions` TEXT, `timeZone` TEXT, `userId` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_installation_TABLE_16);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_notification_TABLE_18 = "CREATE TABLE IF NOT EXISTS `notification` (  `alert` TEXT, `badge` TEXT, `category` TEXT, `collapseKey` TEXT, `contentAvailable` TEXT, `created` TEXT, `delayWhileIdle` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `expirationInterval` TEXT, `expirationTime` TEXT, `modified` TEXT, `scheduledTime` TEXT, `sound` TEXT, `status` TEXT, `urlArgs` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_notification_TABLE_18);


                                                                                                                                                    
                        

                        
                        String CREATE_push_TABLE_20 = "CREATE TABLE IF NOT EXISTS `push` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_push_TABLE_20);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Post_TABLE_22 = "CREATE TABLE IF NOT EXISTS `Post` (  `heading` TEXT, `description` TEXT, `added` TEXT, `postImages` TEXT, `anonymous` NUMBER, `status` TEXT, `latest` TEXT, `unsolved` TEXT, `trending` TEXT, `posted` TEXT, `saved` TEXT, `id` TEXT PRIMARY KEY, `customerId` TEXT, postDetailsId TEXT , _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Post_TABLE_22);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_PostDetail_TABLE_23 = "CREATE TABLE IF NOT EXISTS `PostDetail` (  `totalLike` NUMBER, `hasAcceptedAnswer` NUMBER, `totalSave` NUMBER, `added` TEXT, `updated` TEXT, `type` TEXT, `status` TEXT, `id` TEXT PRIMARY KEY, `postId` TEXT, `commentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_PostDetail_TABLE_23);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Comment_TABLE_24 = "CREATE TABLE IF NOT EXISTS `Comment` (  `answer` TEXT, `status` TEXT, `id` TEXT PRIMARY KEY, `postId` TEXT, `customerId` TEXT, commentDetailsId TEXT , postSubscribersId TEXT , postDetailsId TEXT , _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Comment_TABLE_24);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_CommentDetail_TABLE_25 = "CREATE TABLE IF NOT EXISTS `CommentDetail` (  `totalLike` NUMBER, `added` TEXT, `updated` TEXT, `status` TEXT, `id` TEXT PRIMARY KEY, `commentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_CommentDetail_TABLE_25);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_News_TABLE_26 = "CREATE TABLE IF NOT EXISTS `News` (  `title` TEXT, `description` TEXT, `url` TEXT, `status` TEXT, `type` TEXT, `image` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_News_TABLE_26);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Book_TABLE_27 = "CREATE TABLE IF NOT EXISTS `Book` (  `title` TEXT, `description` TEXT, `status` TEXT, `frontCover` TEXT, `backCover` TEXT, `uploadBook` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `bookCategoryId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Book_TABLE_27);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SavePost_TABLE_28 = "CREATE TABLE IF NOT EXISTS `SavePost` (  `added` TEXT, `id` TEXT PRIMARY KEY, `postId` TEXT, `customerId` TEXT, postSubscribersId TEXT , _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SavePost_TABLE_28);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_LikePost_TABLE_29 = "CREATE TABLE IF NOT EXISTS `LikePost` (  `added` TEXT, `id` TEXT PRIMARY KEY, `postId` TEXT, `customerId` TEXT, postSubscribersId TEXT , _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_LikePost_TABLE_29);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_AmazonPdf_TABLE_30 = "CREATE TABLE IF NOT EXISTS `AmazonPdf` (  `name` TEXT, `container` TEXT, `type` TEXT, `url` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_AmazonPdf_TABLE_30);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_PostSubscriber_TABLE_31 = "CREATE TABLE IF NOT EXISTS `PostSubscriber` (  `type` TEXT, `id` TEXT PRIMARY KEY, `postId` TEXT, `customerId` TEXT, `commentId` TEXT, `likePostId` TEXT, `savePostId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_PostSubscriber_TABLE_31);


                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Speciality_TABLE_32 = "CREATE TABLE IF NOT EXISTS `Speciality` (  `name` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Speciality_TABLE_32);


                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Qualification_TABLE_33 = "CREATE TABLE IF NOT EXISTS `Qualification` (  `name` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Qualification_TABLE_33);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_BookCategory_TABLE_34 = "CREATE TABLE IF NOT EXISTS `BookCategory` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_BookCategory_TABLE_34);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Payment_TABLE_35 = "CREATE TABLE IF NOT EXISTS `Payment` (  `bookDetail` TEXT, `address` TEXT, `phoneNumber` TEXT, `email` TEXT, `amount` NUMBER, `id` TEXT PRIMARY KEY, `bookId` TEXT, `customerId` TEXT, `orderId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Payment_TABLE_35);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Order_TABLE_36 = "CREATE TABLE IF NOT EXISTS `Order` (  `orderNumber` TEXT, `transactionId` TEXT, `orderStatus` TEXT, `paymentStatus` TEXT, `errorMessage` TEXT, `amount` NUMBER, `type` TEXT, `id` TEXT PRIMARY KEY, `bookId` TEXT, `customerId` TEXT, `paymentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Order_TABLE_36);


            
        }

        // Upgrading database
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `User`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AccessToken`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ACL`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `RoleMapping`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Role`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AmazonImage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CompanyInfo`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `adminEmail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AdminEmail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `container`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Container`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Employee`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Customer`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `FacebookAccessToken`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `application`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Application`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `installation`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Installation`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `notification`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Notification`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `push`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Push`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Post`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PostDetail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Comment`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CommentDetail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `News`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Book`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SavePost`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `LikePost`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AmazonPdf`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PostSubscriber`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Speciality`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Qualification`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `BookCategory`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Payment`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Order`");
            

            // Create tables again
            onCreate(db);
        }


        private DbHandler(Context context, String DATABASE_NAME) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
            onCreate(db);
        }
}
