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


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Customer_TABLE_8 = "CREATE TABLE IF NOT EXISTS `Customer` (  `firstName` TEXT, `lastName` TEXT, `email` TEXT, `username` TEXT, `added` TEXT, `updated` TEXT, `registrationId` TEXT, `profilePic` TEXT, `googleRefreshToken` TEXT, `realm` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Customer_TABLE_8);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_AmazonImage_TABLE_9 = "CREATE TABLE IF NOT EXISTS `AmazonImage` (  `name` TEXT, `container` TEXT, `type` TEXT, `url` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_AmazonImage_TABLE_9);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_adminEmail_TABLE_10 = "CREATE TABLE IF NOT EXISTS `adminEmail` (  `to` TEXT, `from` TEXT, `subject` TEXT, `text` TEXT, `html` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_adminEmail_TABLE_10);


                                                                                                                                                                            
                            

                            
                            String CREATE_container_TABLE_12 = "CREATE TABLE IF NOT EXISTS `container` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_container_TABLE_12);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_application_TABLE_14 = "CREATE TABLE IF NOT EXISTS `application` (  `id` TEXT PRIMARY KEY, `realm` TEXT, `name` TEXT, `description` TEXT, `icon` TEXT, `owner` TEXT, `collaborators` TEXT, `email` TEXT, `emailVerified` TEXT, `url` TEXT, `callbackUrls` TEXT, `permissions` TEXT, `clientKey` TEXT, `javaScriptKey` TEXT, `restApiKey` TEXT, `windowsKey` TEXT, `masterKey` TEXT, `pushSettings` TEXT, `authenticationEnabled` TEXT, `anonymousAllowed` TEXT, `authenticationSchemes` TEXT, `status` TEXT, `created` TEXT, `modified` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_application_TABLE_14);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_installation_TABLE_16 = "CREATE TABLE IF NOT EXISTS `installation` (  `status` TEXT, `appId` TEXT, `appVersion` TEXT, `badge` TEXT, `created` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `modified` TEXT, `subscriptions` TEXT, `timeZone` TEXT, `userId` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_installation_TABLE_16);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_notification_TABLE_18 = "CREATE TABLE IF NOT EXISTS `notification` (  `alert` TEXT, `badge` TEXT, `category` TEXT, `collapseKey` TEXT, `contentAvailable` TEXT, `created` TEXT, `delayWhileIdle` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `expirationInterval` TEXT, `expirationTime` TEXT, `modified` TEXT, `scheduledTime` TEXT, `sound` TEXT, `status` TEXT, `urlArgs` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_notification_TABLE_18);


                                                                                                                                                                            
                            

                            
                            String CREATE_push_TABLE_20 = "CREATE TABLE IF NOT EXISTS `push` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_push_TABLE_20);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyBase_TABLE_22 = "CREATE TABLE IF NOT EXISTS `SnaphyBase` (  `is_deleted` NUMBER, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyBase_TABLE_22);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyNotification_TABLE_23 = "CREATE TABLE IF NOT EXISTS `SnaphyNotification` (  `title` TEXT, `description` TEXT, `onClick` TEXT, `options` TEXT, `added` TEXT, `updated` TEXT, `status` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyNotification_TABLE_23);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAcl_TABLE_25 = "CREATE TABLE IF NOT EXISTS `SnaphyAcl` (  `added` TEXT, `updated` TEXT, `model` TEXT, `read` TEXT, `create` TEXT, `edit` TEXT, `delete` TEXT, `role` TEXT, `is_deleted` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAcl_TABLE_25);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAclProp_TABLE_26 = "CREATE TABLE IF NOT EXISTS `SnaphyAclProp` (  `name` TEXT, `read` TEXT, `write` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `snaphyAclId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAclProp_TABLE_26);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SnaphyAclRelation_TABLE_27 = "CREATE TABLE IF NOT EXISTS `SnaphyAclRelation` (  `relation` TEXT, `execute` TEXT, `is_deleted` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `snaphyAclId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SnaphyAclRelation_TABLE_27);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_AppUser_TABLE_28 = "CREATE TABLE IF NOT EXISTS `AppUser` (  `firstName` TEXT, `lastName` TEXT, `email` TEXT, `password` TEXT, `username` TEXT, `profilePic` TEXT, `added` TEXT, `updated` TEXT, `oriUserId` TEXT, `cricUserId` NUMBER, `status` TEXT, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_AppUser_TABLE_28);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Subscriber_TABLE_29 = "CREATE TABLE IF NOT EXISTS `Subscriber` (  `added` TEXT, `updated` TEXT, `oriUserId` TEXT, `subscriberId` NUMBER, `notify` TEXT, `id` TEXT PRIMARY KEY, `appUserId` TEXT, `chatRoomId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Subscriber_TABLE_29);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_ChatRoom_TABLE_30 = "CREATE TABLE IF NOT EXISTS `ChatRoom` (  `roomName` TEXT, `shortName` TEXT, `title` TEXT, `image` TEXT, `status` TEXT, `startTime` TEXT, `startDate` TEXT, `closingDate` TEXT, `matchDate` TEXT, `added` TEXT, `updated` TEXT, `uniqueKey` TEXT, `oriRoomId` TEXT, `type` TEXT, `id` TEXT PRIMARY KEY, `categoryId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ChatRoom_TABLE_30);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_QuickMessage_TABLE_31 = "CREATE TABLE IF NOT EXISTS `QuickMessage` (  `title` TEXT, `added` TEXT, `updated` TEXT, `uniqueNumber` NUMBER, `id` TEXT PRIMARY KEY, `chatRoomId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_QuickMessage_TABLE_31);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_ChatItem_TABLE_32 = "CREATE TABLE IF NOT EXISTS `ChatItem` (  `username` TEXT, `profilePic` TEXT, `message` TEXT, `image` TEXT, `type` TEXT, `readStatus` TEXT, `guid` TEXT, `added` TEXT, `updated` TEXT, `oriUserId` TEXT, `isMarkedInsensitive` NUMBER, `displayMessage` TEXT, `replyTo` TEXT, `from` TEXT, `status` TEXT, `chatUserId` NUMBER, `id` TEXT PRIMARY KEY, `chatRoomId` TEXT, `appUserId` TEXT, `chatItemId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ChatItem_TABLE_32);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Category_TABLE_33 = "CREATE TABLE IF NOT EXISTS `Category` (  `categoryName` TEXT, `logo` TEXT, `priority` NUMBER, `status` TEXT, `added` TEXT, `updated` TEXT, `slug` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Category_TABLE_33);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Post_TABLE_34 = "CREATE TABLE IF NOT EXISTS `Post` (  `uniqueNumber` TEXT, `title` TEXT, `profilePic` TEXT, `isLiked` NUMBER, `username` TEXT, `image` TEXT, `type` TEXT, `score` NUMBER, `tweet` TEXT, `totalLikes` NUMBER, `totalComments` NUMBER, `isAdmin` TEXT, `status` TEXT, `isMarkedInsensitive` NUMBER, `isFollowed` NUMBER, `priorityTime` NUMBER, `postUserId` NUMBER, `added` TEXT, `tweetId` TEXT, `updated` TEXT, `totalShares` NUMBER, `priority` NUMBER, `onClick` TEXT, `twitterUser` TEXT, `twitterUserProfilePic` TEXT, `data_raw` TEXT, `twitterUserId` TEXT, `id` TEXT PRIMARY KEY, `appUserId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Post_TABLE_34);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_PostLike_TABLE_35 = "CREATE TABLE IF NOT EXISTS `PostLike` (  `username` TEXT, `added` TEXT, `updated` TEXT, `type` TEXT, `oriUserId` TEXT, `likerId` NUMBER, `id` TEXT PRIMARY KEY, `postId` TEXT, `appUserId` TEXT, `newsId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_PostLike_TABLE_35);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Comment_TABLE_36 = "CREATE TABLE IF NOT EXISTS `Comment` (  `uniqueNumber` TEXT, `message` TEXT, `username` TEXT, `status` TEXT, `totalResponses` NUMBER, `added` TEXT, `updated` TEXT, `commentorId` NUMBER, `type` TEXT, `oriUserId` TEXT, `id` TEXT PRIMARY KEY, `postId` TEXT, `appUserId` TEXT, `newsId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Comment_TABLE_36);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_CommentResponse_TABLE_37 = "CREATE TABLE IF NOT EXISTS `CommentResponse` (  `profilePic` TEXT, `message` TEXT, `username` TEXT, `added` TEXT, `cricUserId` NUMBER, `updated` TEXT, `oriUserId` TEXT, `status` TEXT, `uniqueNumber` TEXT, `id` TEXT PRIMARY KEY, `postId` TEXT, `commentId` TEXT, `appUserId` TEXT, `newsId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_CommentResponse_TABLE_37);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_SpamWord_TABLE_38 = "CREATE TABLE IF NOT EXISTS `SpamWord` (  `word` TEXT, `status` TEXT, `added` TEXT, `updated` TEXT, `uniqueNumber` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_SpamWord_TABLE_38);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_PostShare_TABLE_39 = "CREATE TABLE IF NOT EXISTS `PostShare` (  `oriUserId` TEXT, `shareUserId` NUMBER, `username` TEXT, `shareUsername` TEXT, `type` TEXT, `status` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `postId` TEXT, `appUserId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_PostShare_TABLE_39);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_RuleBook_TABLE_40 = "CREATE TABLE IF NOT EXISTS `RuleBook` (  `title` TEXT, `uniqueNumber` TEXT, `message` TEXT, `status` TEXT, `type` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_RuleBook_TABLE_40);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_News_TABLE_41 = "CREATE TABLE IF NOT EXISTS `News` (  `id` TEXT PRIMARY KEY, `title` TEXT, `mainImage` TEXT, `shortDescription` TEXT, `fullStory` TEXT, `status` TEXT, `isLiked` NUMBER, `totalLikes` NUMBER, `totalReads` NUMBER, `totalComments` NUMBER, `priority` NUMBER, `tagPriority` NUMBER, `onClick` TEXT, `newsLabels` TEXT, `newsCategories` TEXT, `containsGraphics` NUMBER, `added` TEXT, `updated` TEXT, `uniqueNumber` TEXT, `slug` TEXT, `isRead` NUMBER, `setImageAsCover` TEXT, `coins` NUMBER, `containsVideo` NUMBER, `newsSourceId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_News_TABLE_41);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_NewsRead_TABLE_42 = "CREATE TABLE IF NOT EXISTS `NewsRead` (  `added` TEXT, `updated` TEXT, `oriUserId` TEXT, `readerId` NUMBER, `id` TEXT PRIMARY KEY, `appUserId` TEXT, `newsId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_NewsRead_TABLE_42);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Label_TABLE_43 = "CREATE TABLE IF NOT EXISTS `Label` (  `name` TEXT, `type` TEXT, `priority` NUMBER, `colourCode` TEXT, `showAtHome` TEXT, `description` TEXT, `added` TEXT, `updated` TEXT, `uniqueNumber` TEXT, `slug` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Label_TABLE_43);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_NewsSource_TABLE_44 = "CREATE TABLE IF NOT EXISTS `NewsSource` (  `name` TEXT, `image` TEXT, `url` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_NewsSource_TABLE_44);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_ProfanityRecord_TABLE_45 = "CREATE TABLE IF NOT EXISTS `ProfanityRecord` (  `username` TEXT, `profilePic` TEXT, `profanityCount` NUMBER, `cricUserId` NUMBER, `type` TEXT, `oriUserId` TEXT, `isBanned` TEXT, `added` TEXT, `updated` TEXT, `uniqueNumber` TEXT, `id` TEXT PRIMARY KEY, `appUserId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_ProfanityRecord_TABLE_45);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_WelcomeMessage_TABLE_46 = "CREATE TABLE IF NOT EXISTS `WelcomeMessage` (  `message` TEXT, `added` TEXT, `updated` TEXT, `uniqueNumber` TEXT, `id` TEXT PRIMARY KEY, `chatRoomId` TEXT, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_WelcomeMessage_TABLE_46);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                            

                            
                            String CREATE_Image_TABLE_47 = "CREATE TABLE IF NOT EXISTS `Image` (  `imageName` TEXT, `image` TEXT, `uniqueNumber` TEXT, `imageUrl` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                            db.execSQL(CREATE_Image_TABLE_47);


                
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
                db.execSQL("DROP TABLE IF EXISTS `Customer`");
            
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
                db.execSQL("DROP TABLE IF EXISTS `AppUser`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Subscriber`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ChatRoom`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `QuickMessage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ChatItem`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Category`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Post`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PostLike`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Comment`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CommentResponse`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SpamWord`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PostShare`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `RuleBook`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `News`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `NewsRead`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Label`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `NewsSource`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ProfanityRecord`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `WelcomeMessage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Image`");
            

            // Create tables again
            onCreate(db);
        }


        private DbHandler(Context context, String DATABASE_NAME) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
            onCreate(db);
        }
}
