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
        public void onCreate(final SQLiteDatabase db) {
            new Thread(new Runnable() {
              @Override
              public void run() {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_CompanyInfo_TABLE_5 = "CREATE TABLE IF NOT EXISTS `CompanyInfo` (  `type` TEXT, `html` TEXT, `edited` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_CompanyInfo_TABLE_5);


                                                                                                                                                                            
                            

                            
                            String CREATE_ImportData_TABLE_6 = "CREATE TABLE IF NOT EXISTS `ImportData` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ImportData_TABLE_6);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Employee_TABLE_7 = "CREATE TABLE IF NOT EXISTS `Employee` (  `firstName` TEXT, `lastName` TEXT, `city` TEXT, `added` TEXT, `updated` TEXT, `email` TEXT, `password` TEXT, `type` TEXT, `mobileNumber` TEXT, `franchiseCode` TEXT, `franchiseAddress` TEXT, `area` TEXT, `gtinNumber` TEXT, `cinNumber` TEXT, `accountName` TEXT, `accountNumber` TEXT, `bankName` TEXT, `branchName` TEXT, `bankAddress` TEXT, `ifscCode` TEXT, `franchiseOrderSettings` TEXT, `realm` TEXT, `username` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `cityId` TEXT, `areaId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Employee_TABLE_7);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Customer_TABLE_8 = "CREATE TABLE IF NOT EXISTS `Customer` (  `roadName` TEXT, `firstName` TEXT, `lastName` TEXT, `email` TEXT, `isEmailVerified` NUMBER, `discount` NUMBER, `collectionType` TEXT, `type` TEXT, `subscriptionType` TEXT, `added` TEXT, `updated` TEXT, `time` TEXT, `address` TEXT, `product` TEXT, `accountNumber` NUMBER, `reset_startDate` TEXT, `subscription_startDate` TEXT, `subscription_stopDate` TEXT, `subscription_time` TEXT, `phoneNumber` TEXT, `mobileNumber` TEXT, `comment` TEXT, `isOwing` NUMBER, `realm` TEXT, `username` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `cityId` TEXT, `areaId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Customer_TABLE_8);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Product_TABLE_9 = "CREATE TABLE IF NOT EXISTS `Product` (  `name` TEXT, `shortName` TEXT, `gms` NUMBER, `price` NUMBER, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Product_TABLE_9);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Order_TABLE_10 = "CREATE TABLE IF NOT EXISTS `Order` (  `orderNumber` NUMBER, `added` TEXT, `updated` TEXT, `status` TEXT, `special_information` TEXT, `id` TEXT PRIMARY KEY, `customerId` TEXT, deliveryId TEXT, invoiceId TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Order_TABLE_10);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Invoice_TABLE_11 = "CREATE TABLE IF NOT EXISTS `Invoice` (  `paymentMode` TEXT, `chequeNumber` TEXT, `total_amount` NUMBER, `previousMonthAmount` NUMBER, `previousMonthPaid` NUMBER, `previousMonthPending` NUMBER, `previousMonthCarryForward` NUMBER, `currentMonthAmount` NUMBER, `netCurrentAmount` NUMBER, `currentPaid` NUMBER, `paidAt` TEXT, `discountedCurrentMonthAmount` NUMBER, `reports` TEXT, `month` NUMBER, `invoiceDate` TEXT, `lastMonthInvoiceDate` TEXT, `invoiceAddress` TEXT, `invoiceNumber` NUMBER, `note` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `customerId` TEXT, `previousMonthInvoiceId` TEXT, `employeeId` TEXT, `orderId` TEXT, `companySettingId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Invoice_TABLE_11);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Delivery_TABLE_12 = "CREATE TABLE IF NOT EXISTS `Delivery` (  `delivery_date` TEXT, `delivery_time` TEXT, `status` TEXT, `id` TEXT PRIMARY KEY, `orderId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Delivery_TABLE_12);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Subscription_TABLE_13 = "CREATE TABLE IF NOT EXISTS `Subscription` (  `type` TEXT, `dates` TEXT, `days` TEXT, `quantity` NUMBER, `id` TEXT PRIMARY KEY, `customerId` TEXT, `productId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Subscription_TABLE_13);


                                                                                                                                                                            
                            

                            
                            String CREATE_container_TABLE_14 = "CREATE TABLE IF NOT EXISTS `container` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_container_TABLE_14);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_ProductOrder_TABLE_16 = "CREATE TABLE IF NOT EXISTS `ProductOrder` (  `quantity` NUMBER, `id` TEXT PRIMARY KEY, `productId` TEXT, `orderSampleId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ProductOrder_TABLE_16);


                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_OrderCounter_TABLE_17 = "CREATE TABLE IF NOT EXISTS `OrderCounter` (  `value` NUMBER, `collection` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_OrderCounter_TABLE_17);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_PauseSubscription_TABLE_18 = "CREATE TABLE IF NOT EXISTS `PauseSubscription` (  `pauseDate` TEXT, `resumeDate` TEXT, `allPause` NUMBER, `pauseType` TEXT, `productIdList` TEXT, `added` TEXT, `pauseRecord` TEXT, `id` TEXT PRIMARY KEY, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_PauseSubscription_TABLE_18);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_ExtraDelivery_TABLE_19 = "CREATE TABLE IF NOT EXISTS `ExtraDelivery` (  `date` TEXT, `quantity` NUMBER, `added` TEXT, `pauseId` TEXT, `id` TEXT PRIMARY KEY, `productId` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ExtraDelivery_TABLE_19);


                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_City_TABLE_20 = "CREATE TABLE IF NOT EXISTS `City` (  `name` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_City_TABLE_20);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Area_TABLE_21 = "CREATE TABLE IF NOT EXISTS `Area` (  `name` TEXT, `id` TEXT PRIMARY KEY, `cityId` TEXT, `collectionStaffId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Area_TABLE_21);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_OrderSample_TABLE_22 = "CREATE TABLE IF NOT EXISTS `OrderSample` (  `delivery_date` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_OrderSample_TABLE_22);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_ProductCityPrice_TABLE_24 = "CREATE TABLE IF NOT EXISTS `ProductCityPrice` (  `currentPrice` NUMBER, `previousMonthPrice` NUMBER, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `productId` TEXT, `cityId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ProductCityPrice_TABLE_24);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_CompanySetting_TABLE_25 = "CREATE TABLE IF NOT EXISTS `CompanySetting` (  `address` TEXT, `added` TEXT, `updated` TEXT, `email` TEXT, `mobileNumber` TEXT, `logo` TEXT, `termsAndCondition` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_CompanySetting_TABLE_25);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_AmazonImage_TABLE_26 = "CREATE TABLE IF NOT EXISTS `AmazonImage` (  `name` TEXT, `container` TEXT, `type` TEXT, `url` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_AmazonImage_TABLE_26);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_adminEmail_TABLE_27 = "CREATE TABLE IF NOT EXISTS `adminEmail` (  `to` TEXT, `from` TEXT, `subject` TEXT, `text` TEXT, `html` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_adminEmail_TABLE_27);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_NotificationData_TABLE_29 = "CREATE TABLE IF NOT EXISTS `NotificationData` (  `added` TEXT, `updated` TEXT, `type` TEXT, `notificationType` TEXT, `id` TEXT PRIMARY KEY, `cityId` TEXT, `customerId` TEXT, `employeeId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_NotificationData_TABLE_29);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_CollectionStaff_TABLE_30 = "CREATE TABLE IF NOT EXISTS `CollectionStaff` (  `name` TEXT, `mobileNumber` TEXT, `added` TEXT, `areas` TEXT, `updated` TEXT, `realm` TEXT, `username` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `email` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `cityId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_CollectionStaff_TABLE_30);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_CollectionStaffArea_TABLE_31 = "CREATE TABLE IF NOT EXISTS `CollectionStaffArea` (  `id` TEXT PRIMARY KEY, `collectionStaffId` TEXT, `areaId` TEXT, `cityId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_CollectionStaffArea_TABLE_31);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_DeliveryReport_TABLE_32 = "CREATE TABLE IF NOT EXISTS `DeliveryReport` (  `added` TEXT, `updated` TEXT, `reportDate` TEXT, `subscription` TEXT, `products` TEXT, `areaWiseProductBreakup` TEXT, `deliveries` TEXT, `invoices` TEXT, `areaId` TEXT, `cityId` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_DeliveryReport_TABLE_32);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAcl_TABLE_33 = "CREATE TABLE IF NOT EXISTS `SnaphyAcl` (  `added` TEXT, `updated` TEXT, `model` TEXT, `read` TEXT, `create` TEXT, `edit` TEXT, `delete` TEXT, `role` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAcl_TABLE_33);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAclProp_TABLE_34 = "CREATE TABLE IF NOT EXISTS `SnaphyAclProp` (  `name` TEXT, `read` TEXT, `write` TEXT, `id` TEXT PRIMARY KEY, `snaphyAclId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAclProp_TABLE_34);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAclRelation_TABLE_35 = "CREATE TABLE IF NOT EXISTS `SnaphyAclRelation` (  `relation` TEXT, `execute` TEXT, `id` TEXT PRIMARY KEY, `snaphyAclId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAclRelation_TABLE_35);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_CustomerDelivery_TABLE_36 = "CREATE TABLE IF NOT EXISTS `CustomerDelivery` (  `added` TEXT, `updated` TEXT, `dateOfDelivery` TEXT, `orderList` TEXT, `id` TEXT PRIMARY KEY, `customerId` TEXT, `cityId` TEXT, `areaId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_CustomerDelivery_TABLE_36);


                
              }
          }).start();
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
                db.execSQL("DROP TABLE IF EXISTS `CompanyInfo`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ImportData`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Employee`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Customer`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Product`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Order`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Invoice`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Delivery`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Subscription`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `container`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Container`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ProductOrder`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `OrderCounter`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PauseSubscription`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ExtraDelivery`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `City`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Area`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `OrderSample`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `InvoiceCounter`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ProductCityPrice`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CompanySetting`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AmazonImage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `adminEmail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AdminEmail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `NotificationData`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CollectionStaff`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CollectionStaffArea`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `DeliveryReport`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAcl`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAclProp`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAclRelation`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CustomerDelivery`");
            

            // Create tables again
            onCreate(db);
        }


        private DbHandler(Context context, String DATABASE_NAME) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
            onCreate(db);
        }
}
