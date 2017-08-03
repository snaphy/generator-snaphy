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

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_RoleMapping_TABLE_3 = "CREATE TABLE IF NOT EXISTS `RoleMapping` (  `id` TEXT PRIMARY KEY, `principalType` TEXT, `principalId` TEXT, `roleId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_RoleMapping_TABLE_3);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Role_TABLE_4 = "CREATE TABLE IF NOT EXISTS `Role` (  `id` TEXT PRIMARY KEY, `name` TEXT, `description` TEXT, `created` TEXT, `modified` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Role_TABLE_4);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Employee_TABLE_6 = "CREATE TABLE IF NOT EXISTS `Employee` (  `employee_number` TEXT, `username` TEXT, `password` TEXT, `firstName` TEXT, `lastName` TEXT, `address` TEXT, `added` TEXT, `updated` TEXT, `email` TEXT, `contact` TEXT, `is_deleted` NUMBER, `isAdmin` NUMBER, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `departmentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Employee_TABLE_6);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Customer_TABLE_7 = "CREATE TABLE IF NOT EXISTS `Customer` (  `firstName` TEXT, `lastName` TEXT, `email` TEXT, `username` TEXT, `added` TEXT, `updated` TEXT, `registrationId` TEXT, `profilePic` TEXT, `googleRefreshToken` TEXT, `is_deleted` TEXT, `realm` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Customer_TABLE_7);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_adminEmail_TABLE_8 = "CREATE TABLE IF NOT EXISTS `adminEmail` (  `is_deleted` NUMBER, `to` TEXT, `from` TEXT, `subject` TEXT, `text` TEXT, `html` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_adminEmail_TABLE_8);


                                                                                                                                                    
                        

                        
                        String CREATE_container_TABLE_10 = "CREATE TABLE IF NOT EXISTS `container` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_container_TABLE_10);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_application_TABLE_12 = "CREATE TABLE IF NOT EXISTS `application` (  `id` TEXT PRIMARY KEY, `realm` TEXT, `name` TEXT, `description` TEXT, `icon` TEXT, `owner` TEXT, `collaborators` TEXT, `email` TEXT, `emailVerified` TEXT, `url` TEXT, `callbackUrls` TEXT, `permissions` TEXT, `clientKey` TEXT, `javaScriptKey` TEXT, `restApiKey` TEXT, `windowsKey` TEXT, `masterKey` TEXT, `pushSettings` TEXT, `authenticationEnabled` TEXT, `anonymousAllowed` TEXT, `authenticationSchemes` TEXT, `status` TEXT, `created` TEXT, `modified` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_application_TABLE_12);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_installation_TABLE_14 = "CREATE TABLE IF NOT EXISTS `installation` (  `status` TEXT, `appId` TEXT, `appVersion` TEXT, `badge` TEXT, `created` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `modified` TEXT, `subscriptions` TEXT, `timeZone` TEXT, `userId` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_installation_TABLE_14);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_notification_TABLE_16 = "CREATE TABLE IF NOT EXISTS `notification` (  `alert` TEXT, `badge` TEXT, `category` TEXT, `collapseKey` TEXT, `contentAvailable` TEXT, `created` TEXT, `delayWhileIdle` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `expirationInterval` TEXT, `expirationTime` TEXT, `modified` TEXT, `scheduledTime` TEXT, `sound` TEXT, `status` TEXT, `urlArgs` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_notification_TABLE_16);


                                                                                                                                                    
                        

                        
                        String CREATE_push_TABLE_18 = "CREATE TABLE IF NOT EXISTS `push` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_push_TABLE_18);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Retailer_TABLE_20 = "CREATE TABLE IF NOT EXISTS `Retailer` (  `retailer_number` TEXT, `name` TEXT, `email` TEXT, `shop_name` TEXT, `shop_address` TEXT, `contact_number` TEXT, `tin_number` TEXT, `verification_status` TEXT, `added` TEXT, `updated` TEXT, `status` TEXT, `shop_image` TEXT, `profile_pic` TEXT, `tin_image` TEXT, `departmentId` TEXT, `realm` TEXT, `username` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `stateId` TEXT, `cityId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Retailer_TABLE_20);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SnaphyBase_TABLE_21 = "CREATE TABLE IF NOT EXISTS `SnaphyBase` (  `is_deleted` NUMBER, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SnaphyBase_TABLE_21);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_CompanyInfo_TABLE_22 = "CREATE TABLE IF NOT EXISTS `CompanyInfo` (  `type` TEXT, `html` TEXT, `edited` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_CompanyInfo_TABLE_22);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_FacebookAccessToken_TABLE_23 = "CREATE TABLE IF NOT EXISTS `FacebookAccessToken` (  `FbUserId` TEXT, `token` TEXT, `expires` TEXT, `userId` TEXT, `type` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_FacebookAccessToken_TABLE_23);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_AmazonImage_TABLE_24 = "CREATE TABLE IF NOT EXISTS `AmazonImage` (  `name` TEXT, `container` TEXT, `type` TEXT, `url` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_AmazonImage_TABLE_24);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SnaphyNotification_TABLE_25 = "CREATE TABLE IF NOT EXISTS `SnaphyNotification` (  `title` TEXT, `description` TEXT, `onClick` TEXT, `added` TEXT, `updated` TEXT, `status` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SnaphyNotification_TABLE_25);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_QrCode_TABLE_26 = "CREATE TABLE IF NOT EXISTS `QrCode` (  `serial_number` NUMBER, `activation_status` TEXT, `active_on` TEXT, `scan_status` TEXT, `added` TEXT, `updated` TEXT, `points` NUMBER, `scanned_on` TEXT, `redeemed_on` TEXT, `redeemStatus` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, `retailerId` TEXT, `departmentId` TEXT, `productId` TEXT, `transactionId` TEXT, `qrCodeGroupId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_QrCode_TABLE_26);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Department_TABLE_27 = "CREATE TABLE IF NOT EXISTS `Department` (  `department_number` TEXT, `name` TEXT, `logo` TEXT, `added` TEXT, `updated` TEXT, `totalEarned` NUMBER, `totalRedeemed` NUMBER, `totalBalance` NUMBER, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, `retailerId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Department_TABLE_27);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Product_TABLE_28 = "CREATE TABLE IF NOT EXISTS `Product` (  `product_number` TEXT, `name` TEXT, `product_code` TEXT, `price` NUMBER, `comments` TEXT, `points` NUMBER, `image` TEXT, `added` TEXT, `updated` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, `departmentId` TEXT, `categoryId` TEXT, `subCategory1Id` TEXT, `subCategory2Id` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Product_TABLE_28);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Category_TABLE_29 = "CREATE TABLE IF NOT EXISTS `Category` (  `name` TEXT, `added` TEXT, `updated` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Category_TABLE_29);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SubCategory1_TABLE_30 = "CREATE TABLE IF NOT EXISTS `SubCategory1` (  `name` TEXT, `added` TEXT, `updated` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SubCategory1_TABLE_30);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SubCategory2_TABLE_31 = "CREATE TABLE IF NOT EXISTS `SubCategory2` (  `name` TEXT, `added` TEXT, `updated` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SubCategory2_TABLE_31);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_State_TABLE_32 = "CREATE TABLE IF NOT EXISTS `State` (  `name` TEXT, `added` TEXT, `updated` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_State_TABLE_32);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_City_TABLE_33 = "CREATE TABLE IF NOT EXISTS `City` (  `name` TEXT, `added` TEXT, `updated` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_City_TABLE_33);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Transaction_TABLE_34 = "CREATE TABLE IF NOT EXISTS `Transaction` (  `transactionStatus` TEXT, `transaction_number` TEXT, `paytm_transaction_id` TEXT, `total_points` NUMBER, `total_amount` NUMBER, `added` TEXT, `updated` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, `retailerId` TEXT, `departmentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Transaction_TABLE_34);


                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Counter_TABLE_35 = "CREATE TABLE IF NOT EXISTS `Counter` (  `value` NUMBER, `collection` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Counter_TABLE_35);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_QrCodeGroup_TABLE_36 = "CREATE TABLE IF NOT EXISTS `QrCodeGroup` (  `group_number` TEXT, `added` TEXT, `updated` TEXT, `total_generated` NUMBER, `active_on` TEXT, `activation_status` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, `departmentId` TEXT, `productId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_QrCodeGroup_TABLE_36);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_EarningHistory_TABLE_37 = "CREATE TABLE IF NOT EXISTS `EarningHistory` (  `added` TEXT, `status` TEXT, `reasonForFailure` TEXT, `earning_history_number` TEXT, `is_deleted` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `qrCodeId` TEXT, `retailerId` TEXT, `departmentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_EarningHistory_TABLE_37);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SnaphyAcl_TABLE_38 = "CREATE TABLE IF NOT EXISTS `SnaphyAcl` (  `added` TEXT, `updated` TEXT, `model` TEXT, `read` TEXT, `create` TEXT, `edit` TEXT, `delete` TEXT, `role` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SnaphyAcl_TABLE_38);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SnaphyAclProp_TABLE_39 = "CREATE TABLE IF NOT EXISTS `SnaphyAclProp` (  `name` TEXT, `read` TEXT, `write` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `snaphyAclId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SnaphyAclProp_TABLE_39);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SnaphyAclRelation_TABLE_40 = "CREATE TABLE IF NOT EXISTS `SnaphyAclRelation` (  `relation` TEXT, `execute` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `snaphyAclId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SnaphyAclRelation_TABLE_40);


            
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
                db.execSQL("DROP TABLE IF EXISTS `SnaphyUser`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Employee`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Customer`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `adminEmail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AdminEmail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `container`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Container`");
            
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
                db.execSQL("DROP TABLE IF EXISTS `Retailer`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyBase`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CompanyInfo`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `FacebookAccessToken`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AmazonImage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyNotification`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `QrCode`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Department`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Product`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Category`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SubCategory1`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SubCategory2`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `State`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `City`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Transaction`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Counter`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `QrCodeGroup`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `EarningHistory`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAcl`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAclProp`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAclRelation`");
            

            // Create tables again
            onCreate(db);
        }


        private DbHandler(Context context, String DATABASE_NAME) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
            onCreate(db);
        }
}
