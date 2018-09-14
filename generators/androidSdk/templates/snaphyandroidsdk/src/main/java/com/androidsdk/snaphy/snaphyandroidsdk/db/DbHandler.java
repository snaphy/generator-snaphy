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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_RoleMapping_TABLE_3 = "CREATE TABLE IF NOT EXISTS `RoleMapping` (  `id` TEXT PRIMARY KEY, `principalType` TEXT, `principalId` TEXT, `roleId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_RoleMapping_TABLE_3);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Role_TABLE_4 = "CREATE TABLE IF NOT EXISTS `Role` (  `id` TEXT PRIMARY KEY, `name` TEXT, `description` TEXT, `created` TEXT, `modified` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Role_TABLE_4);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_CompanyInfo_TABLE_5 = "CREATE TABLE IF NOT EXISTS `CompanyInfo` (  `type` TEXT, `html` TEXT, `edited` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_CompanyInfo_TABLE_5);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Employee_TABLE_6 = "CREATE TABLE IF NOT EXISTS `Employee` (  `username` TEXT, `firstName` TEXT, `lastName` TEXT, `added` TEXT, `updated` TEXT, `email` TEXT, `password` TEXT, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Employee_TABLE_6);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_FacebookAccessToken_TABLE_7 = "CREATE TABLE IF NOT EXISTS `FacebookAccessToken` (  `FbUserId` TEXT, `token` TEXT, `expires` TEXT, `userId` TEXT, `type` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_FacebookAccessToken_TABLE_7);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_AmazonImage_TABLE_8 = "CREATE TABLE IF NOT EXISTS `AmazonImage` (  `name` TEXT, `container` TEXT, `type` TEXT, `url` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_AmazonImage_TABLE_8);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_adminEmail_TABLE_9 = "CREATE TABLE IF NOT EXISTS `adminEmail` (  `to` TEXT, `from` TEXT, `subject` TEXT, `text` TEXT, `html` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_adminEmail_TABLE_9);


                                                                                                                                                                            
                            

                            
                            String CREATE_container_TABLE_11 = "CREATE TABLE IF NOT EXISTS `container` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_container_TABLE_11);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_application_TABLE_13 = "CREATE TABLE IF NOT EXISTS `application` (  `id` TEXT PRIMARY KEY, `realm` TEXT, `name` TEXT, `description` TEXT, `icon` TEXT, `owner` TEXT, `collaborators` TEXT, `email` TEXT, `emailVerified` TEXT, `url` TEXT, `callbackUrls` TEXT, `permissions` TEXT, `clientKey` TEXT, `javaScriptKey` TEXT, `restApiKey` TEXT, `windowsKey` TEXT, `masterKey` TEXT, `pushSettings` TEXT, `authenticationEnabled` TEXT, `anonymousAllowed` TEXT, `authenticationSchemes` TEXT, `status` TEXT, `created` TEXT, `modified` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_application_TABLE_13);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_installation_TABLE_15 = "CREATE TABLE IF NOT EXISTS `installation` (  `status` TEXT, `appId` TEXT, `appVersion` TEXT, `badge` TEXT, `created` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `modified` TEXT, `subscriptions` TEXT, `timeZone` TEXT, `userId` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_installation_TABLE_15);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_notification_TABLE_17 = "CREATE TABLE IF NOT EXISTS `notification` (  `alert` TEXT, `badge` TEXT, `category` TEXT, `collapseKey` TEXT, `contentAvailable` TEXT, `created` TEXT, `delayWhileIdle` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `expirationInterval` TEXT, `expirationTime` TEXT, `modified` TEXT, `scheduledTime` TEXT, `sound` TEXT, `status` TEXT, `urlArgs` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_notification_TABLE_17);


                                                                                                                                                                            
                            

                            
                            String CREATE_push_TABLE_19 = "CREATE TABLE IF NOT EXISTS `push` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_push_TABLE_19);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyBase_TABLE_21 = "CREATE TABLE IF NOT EXISTS `SnaphyBase` (  `is_deleted` NUMBER, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyBase_TABLE_21);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyNotification_TABLE_22 = "CREATE TABLE IF NOT EXISTS `SnaphyNotification` (  `title` TEXT, `description` TEXT, `onClick` TEXT, `options` TEXT, `added` TEXT, `updated` TEXT, `status` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyNotification_TABLE_22);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAcl_TABLE_24 = "CREATE TABLE IF NOT EXISTS `SnaphyAcl` (  `added` TEXT, `updated` TEXT, `model` TEXT, `read` TEXT, `create` TEXT, `edit` TEXT, `delete` TEXT, `role` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAcl_TABLE_24);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAclProp_TABLE_25 = "CREATE TABLE IF NOT EXISTS `SnaphyAclProp` (  `name` TEXT, `read` TEXT, `write` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `snaphyAclId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAclProp_TABLE_25);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAclRelation_TABLE_26 = "CREATE TABLE IF NOT EXISTS `SnaphyAclRelation` (  `relation` TEXT, `execute` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `snaphyAclId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAclRelation_TABLE_26);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Category_TABLE_27 = "CREATE TABLE IF NOT EXISTS `Category` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `name` TEXT, `isTrending` NUMBER, `status` TEXT, `priority` NUMBER, `identifier` TEXT, `description` TEXT, `image` TEXT, `homeIcon` TEXT, `defaultIcon` TEXT, `isSelected` NUMBER, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Category_TABLE_27);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SubCategoryGroup_TABLE_28 = "CREATE TABLE IF NOT EXISTS `SubCategoryGroup` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `name` TEXT, `priority` NUMBER, `image` TEXT, `description` TEXT, `identifier` TEXT, `productSubCategory` TEXT, `isTrending` NUMBER, `categoryId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SubCategoryGroup_TABLE_28);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_ProductSubCategory_TABLE_29 = "CREATE TABLE IF NOT EXISTS `ProductSubCategory` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `name` TEXT, `isTrending` NUMBER, `description` TEXT, `priority` NUMBER, `identifier` TEXT, `image` TEXT, `categoryId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ProductSubCategory_TABLE_29);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Product_TABLE_30 = "CREATE TABLE IF NOT EXISTS `Product` (  `id` TEXT PRIMARY KEY, `name` TEXT, `coverImage` TEXT, `inStock` NUMBER, `mrp` NUMBER, `discountedPrice` NUMBER, `minimumQuantity` NUMBER, `maximumQuantity` NUMBER, `minimumQuantityPrice` NUMBER, `maximumQuantityPrice` NUMBER, `identifier` TEXT, `priority` NUMBER, `isTrending` NUMBER, `otherImages` TEXT, `weight` NUMBER, `size` NUMBER, `offerText` TEXT, `warehouseLocation` TEXT, `added` TEXT, `updated` TEXT, `brandName` TEXT, `categoryName` TEXT, `productSubCategoryName` TEXT, `subCategoryGroupName` TEXT, `productState` TEXT, `productReviewList` TEXT, `description` TEXT, `productDetail` TEXT, `categoryId` TEXT, `productSubCategoryId` TEXT, `subCategoryGroupId` TEXT, `brandId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Product_TABLE_30);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Review_TABLE_31 = "CREATE TABLE IF NOT EXISTS `Review` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `rating` NUMBER, `title` TEXT, `images` TEXT, `review` TEXT, `isPublished` NUMBER, `productId` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Review_TABLE_31);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Recommendation_TABLE_32 = "CREATE TABLE IF NOT EXISTS `Recommendation` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `isRecommended` NUMBER, `productId` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Recommendation_TABLE_32);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_OrderItem_TABLE_33 = "CREATE TABLE IF NOT EXISTS `OrderItem` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `quantity` NUMBER, `mrp` NUMBER, `discountedPrice` NUMBER, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_OrderItem_TABLE_33);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Order_TABLE_34 = "CREATE TABLE IF NOT EXISTS `Order` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `amount` NUMBER, `estimatedMRPPrice` NUMBER, `moneySaved` NUMBER, `itemIds` TEXT, `itemObjectList` TEXT, `orderStatus` TEXT, `estimatedWeight` NUMBER, `nearestWarehouse` TEXT, `dateOfOrder` TEXT, `deliveryDate` TEXT, `estimatedShipmentDate` TEXT, `customerId` TEXT, `logisticsId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Order_TABLE_34);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Address_TABLE_35 = "CREATE TABLE IF NOT EXISTS `Address` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `shopNumber` NUMBER, `shopName` TEXT, `isDefault` TEXT, `mobileNumber` TEXT, `area` TEXT, `locality` TEXT, `city` TEXT, `pincode` NUMBER, `state` TEXT, `location` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Address_TABLE_35);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Wishlist_TABLE_36 = "CREATE TABLE IF NOT EXISTS `Wishlist` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `name` TEXT, `description` TEXT, `estimatedPrice` NUMBER, `image` TEXT, `productId` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Wishlist_TABLE_36);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Chat_TABLE_37 = "CREATE TABLE IF NOT EXISTS `Chat` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `from` TEXT, `to` TEXT, `message` TEXT, `image` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Chat_TABLE_37);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Brand_TABLE_38 = "CREATE TABLE IF NOT EXISTS `Brand` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `name` TEXT, `websiteLink` TEXT, `description` TEXT, `image` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Brand_TABLE_38);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_AboutUs_TABLE_39 = "CREATE TABLE IF NOT EXISTS `AboutUs` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `videoLink` TEXT, `mapLat` NUMBER, `mapLong` NUMBER, `description` TEXT, `ourMissionDescription` TEXT, `whereYouCanFindUsDescription` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_AboutUs_TABLE_39);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Offer_TABLE_40 = "CREATE TABLE IF NOT EXISTS `Offer` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `offerType` TEXT, `redirectedLinkPage` TEXT, `image` TEXT, `offerText` TEXT, `categoryId` TEXT, `productId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Offer_TABLE_40);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_TermCondition_TABLE_41 = "CREATE TABLE IF NOT EXISTS `TermCondition` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `title` TEXT, `status` TEXT, `description` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_TermCondition_TABLE_41);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Invoice_TABLE_42 = "CREATE TABLE IF NOT EXISTS `Invoice` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `invoiceNumber` NUMBER, `invoiceTerms` TEXT, `gst` NUMBER, `gstinNumber` NUMBER, `invoiceAmount` NUMBER, `invoiceDate` TEXT, `placeOfSupply` TEXT, `invoiceFrom` TEXT, `invoiceTo` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Invoice_TABLE_42);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Transaction_TABLE_43 = "CREATE TABLE IF NOT EXISTS `Transaction` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `status` TEXT, `payUTransactionId` TEXT, `bankIFSCCode` TEXT, `transactionAmount` NUMBER, `transactionType` TEXT, `paymentType` TEXT, `paymentPercent` NUMBER, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Transaction_TABLE_43);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Coupon_TABLE_44 = "CREATE TABLE IF NOT EXISTS `Coupon` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `couponCode` TEXT, `couponTitle` TEXT, `couponName` TEXT, `type` TEXT, `status` TEXT, `couponDescription` TEXT, `priority` NUMBER, `discountPercent` NUMBER, `discountAmount` NUMBER, `expiryDate` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Coupon_TABLE_44);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Contact_TABLE_45 = "CREATE TABLE IF NOT EXISTS `Contact` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `findUs` TEXT, `callUs` TEXT, `emailUs` TEXT, `connectWithUs` TEXT, `status` TEXT, `location` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Contact_TABLE_45);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_DraphantNotification_TABLE_46 = "CREATE TABLE IF NOT EXISTS `DraphantNotification` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `title` TEXT, `description` TEXT, `isRead` NUMBER, `image` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_DraphantNotification_TABLE_46);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_LogisticPartner_TABLE_47 = "CREATE TABLE IF NOT EXISTS `LogisticPartner` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `partnerName` TEXT, `charges` NUMBER, `interstateCharges` NUMBER, `intrastateCharges` NUMBER, `interstateDeliveryTime` NUMBER, `intrastateDeliveryTime` NUMBER, `mobileNumber2` TEXT, `mobileNumber1` TEXT, `landline2` TEXT, `landline1` TEXT, `headOfficeAddress` TEXT, `deliveryState` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_LogisticPartner_TABLE_47);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Cart_TABLE_48 = "CREATE TABLE IF NOT EXISTS `Cart` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `itemIds` TEXT, `itemDetails` TEXT, `estimatedWeight` NUMBER, `estimatedShipmentDate` TEXT, `moneySaved` NUMBER, `suggestedMRP` NUMBER, `totalPrice` NUMBER, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Cart_TABLE_48);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Setting_TABLE_49 = "CREATE TABLE IF NOT EXISTS `Setting` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `activateOfferNotification` NUMBER, `activateCouponNotification` NUMBER, `activateOrderNotification` NUMBER, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Setting_TABLE_49);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Refer_TABLE_50 = "CREATE TABLE IF NOT EXISTS `Refer` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `referCode` TEXT, `points` TEXT, `referById` TEXT, `referToId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Refer_TABLE_50);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Remark_TABLE_51 = "CREATE TABLE IF NOT EXISTS `Remark` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `issue` TEXT, `reason` TEXT, `solution` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Remark_TABLE_51);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Caraosel_TABLE_52 = "CREATE TABLE IF NOT EXISTS `Caraosel` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `text` TEXT, `type` TEXT, `status` TEXT, `redirectedLinkPage` TEXT, `image` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Caraosel_TABLE_52);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_OfferImage_TABLE_53 = "CREATE TABLE IF NOT EXISTS `OfferImage` (  `added` TEXT, `updated` TEXT, `image` TEXT, `title` TEXT, `description` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_OfferImage_TABLE_53);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_ProductState_TABLE_54 = "CREATE TABLE IF NOT EXISTS `ProductState` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `productId` TEXT, `oneStar` NUMBER, `twoStar` NUMBER, `threeStar` NUMBER, `fourStar` NUMBER, `fiveStar` NUMBER, `totalOrder` NUMBER, `totalRecommonded` NUMBER, `totalReview` NUMBER, `totalRatingAvg` NUMBER, `description` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ProductState_TABLE_54);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Customer_TABLE_55 = "CREATE TABLE IF NOT EXISTS `Customer` (  `added` TEXT, `id` TEXT PRIMARY KEY, `interestedCatList` TEXT, `updated` TEXT, `name` TEXT, `contactNumber` TEXT, `altContactNumber` TEXT, `whatsappNumber` TEXT, `storeName` TEXT, `registeredFirmName` TEXT, `image` TEXT, `email` TEXT, `liscenceType` TEXT, `gstNumber` TEXT, `shopAddress` TEXT, `pincode` TEXT, `city` TEXT, `state` TEXT, `totalPurchase` TEXT, `verificationStatus` TEXT, `realm` TEXT, `username` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `employeeId` TEXT, `businessTypeId` TEXT, `industryId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Customer_TABLE_55);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_QuotationRequest_TABLE_56 = "CREATE TABLE IF NOT EXISTS `QuotationRequest` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `productName` TEXT, `productImage` TEXT, `quantity` NUMBER, `estimatePrice` NUMBER, `description` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_QuotationRequest_TABLE_56);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SKU_TABLE_57 = "CREATE TABLE IF NOT EXISTS `SKU` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `propAKey` TEXT, `propAValue` TEXT, `propBKey` TEXT, `availQuant` NUMBER, `propBValue` TEXT, `SKUsName` TEXT, `SKUWeight` NUMBER, `SKUColor` TEXT, `Category` TEXT, `pricePerUnit` NUMBER, `identifier` TEXT, `productId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SKU_TABLE_57);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_RecentSearch_TABLE_58 = "CREATE TABLE IF NOT EXISTS `RecentSearch` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `keyword` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_RecentSearch_TABLE_58);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Item_TABLE_59 = "CREATE TABLE IF NOT EXISTS `Item` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `spu` TEXT, `itemDetail` TEXT, `totalWeight` NUMBER, `totalMRP` NUMBER, `totalDiscount` NUMBER, `totalQuantity` NUMBER, `customerId` TEXT, `orderId` TEXT, `productId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Item_TABLE_59);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_TopSearch_TABLE_60 = "CREATE TABLE IF NOT EXISTS `TopSearch` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `keyword` TEXT, `count` NUMBER, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_TopSearch_TABLE_60);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_FAQ_TABLE_61 = "CREATE TABLE IF NOT EXISTS `FAQ` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `title` TEXT, `description` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_FAQ_TABLE_61);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Legal_TABLE_62 = "CREATE TABLE IF NOT EXISTS `Legal` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `title` TEXT, `status` TEXT, `description` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Legal_TABLE_62);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_HelpItem_TABLE_63 = "CREATE TABLE IF NOT EXISTS `HelpItem` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `message` TEXT, `toId` TEXT, `fromId` TEXT, `orderId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_HelpItem_TABLE_63);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_BusinessType_TABLE_64 = "CREATE TABLE IF NOT EXISTS `BusinessType` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `title` TEXT, `status` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_BusinessType_TABLE_64);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Industry_TABLE_65 = "CREATE TABLE IF NOT EXISTS `Industry` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `title` TEXT, `status` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Industry_TABLE_65);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Pincode_TABLE_66 = "CREATE TABLE IF NOT EXISTS `Pincode` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `pincode` NUMBER, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Pincode_TABLE_66);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_InterestedCategory_TABLE_67 = "CREATE TABLE IF NOT EXISTS `InterestedCategory` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `categoryIds` TEXT, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_InterestedCategory_TABLE_67);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_GroupBuying_TABLE_68 = "CREATE TABLE IF NOT EXISTS `GroupBuying` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `expiryDate` TEXT, `priority` NUMBER, `productId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_GroupBuying_TABLE_68);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Guide_TABLE_69 = "CREATE TABLE IF NOT EXISTS `Guide` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `heading` TEXT, `status` TEXT, `description` TEXT, `image` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Guide_TABLE_69);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_DraphantPoint_TABLE_70 = "CREATE TABLE IF NOT EXISTS `DraphantPoint` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `points` NUMBER, `isAddedOrSubtracted` NUMBER, `customerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_DraphantPoint_TABLE_70);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Logistics_TABLE_71 = "CREATE TABLE IF NOT EXISTS `Logistics` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `courierInfo` TEXT, `reasonforCancellation` TEXT, `internalHandler` TEXT, `remarks` TEXT, `estimatedTime` TEXT, `status` TEXT, `orderId` TEXT, `logisticPartnerId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Logistics_TABLE_71);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_VisitExhibition_TABLE_72 = "CREATE TABLE IF NOT EXISTS `VisitExhibition` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `image` TEXT, `images` TEXT, `description` TEXT, `description1` TEXT, `location` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_VisitExhibition_TABLE_72);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_VisitBooking_TABLE_73 = "CREATE TABLE IF NOT EXISTS `VisitBooking` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `name` TEXT, `contactNumber` TEXT, `status` TEXT, `visitDate` TEXT, `visitTime` TEXT, `description` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_VisitBooking_TABLE_73);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_area_TABLE_74 = "CREATE TABLE IF NOT EXISTS `area` (  `id` TEXT PRIMARY KEY, `added` TEXT, `updated` TEXT, `name` TEXT, `pincode` NUMBER, `city` TEXT, `state` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_area_TABLE_74);


                
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
                db.execSQL("DROP TABLE IF EXISTS `Employee`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `FacebookAccessToken`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AmazonImage`");
            
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
                db.execSQL("DROP TABLE IF EXISTS `SnaphyBase`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyNotification`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyUser`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAcl`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAclProp`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SnaphyAclRelation`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Category`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SubCategoryGroup`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ProductSubCategory`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Product`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Review`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Recommendation`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `OrderItem`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Order`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Address`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Wishlist`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Chat`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Brand`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AboutUs`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Offer`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `TermCondition`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Invoice`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Transaction`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Coupon`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Contact`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `DraphantNotification`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `LogisticPartner`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Cart`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Setting`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Refer`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Remark`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Caraosel`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `OfferImage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ProductState`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Customer`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `QuotationRequest`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SKU`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `RecentSearch`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Item`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `TopSearch`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `FAQ`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Legal`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `HelpItem`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `BusinessType`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Industry`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Pincode`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `InterestedCategory`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `GroupBuying`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Guide`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `DraphantPoint`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Logistics`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `VisitExhibition`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `VisitBooking`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `area`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Area`");
            

            // Create tables again
            onCreate(db);
        }


        private DbHandler(Context context, String DATABASE_NAME) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
            onCreate(db);
        }
}
