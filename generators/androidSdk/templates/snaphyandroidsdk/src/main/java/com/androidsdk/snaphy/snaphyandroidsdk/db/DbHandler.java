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


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_CompanyInfo_TABLE_5 = "CREATE TABLE IF NOT EXISTS `CompanyInfo` (  `type` TEXT, `html` TEXT, `edited` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_CompanyInfo_TABLE_5);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Employee_TABLE_6 = "CREATE TABLE IF NOT EXISTS `Employee` (  `username` TEXT, `firstName` TEXT, `lastName` TEXT, `added` TEXT, `updated` TEXT, `email` TEXT, `password` TEXT, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Employee_TABLE_6);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_AmazonImage_TABLE_7 = "CREATE TABLE IF NOT EXISTS `AmazonImage` (  `name` TEXT, `container` TEXT, `type` TEXT, `url` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_AmazonImage_TABLE_7);


                                                                                                                                                    
                        
                        String CREATE_container_TABLE_8 = "CREATE TABLE IF NOT EXISTS `container` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_container_TABLE_8);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_adminEmail_TABLE_10 = "CREATE TABLE IF NOT EXISTS `adminEmail` (  `to` TEXT, `from` TEXT, `subject` TEXT, `text` TEXT, `html` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_adminEmail_TABLE_10);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_School_TABLE_13 = "CREATE TABLE IF NOT EXISTS `School` (  `name` TEXT, `logo` TEXT, `address` TEXT, `city` TEXT, `email` TEXT, `state` TEXT, `phoneNumber` TEXT, `comment` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_School_TABLE_13);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Admin_TABLE_14 = "CREATE TABLE IF NOT EXISTS `Admin` (  `added` TEXT, `updated` TEXT, `name` TEXT, `username` TEXT, `password` TEXT, `phoneNumber` TEXT, `email` TEXT, `registrationId` TEXT, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `teacherId` TEXT, `parentId` TEXT, `guestId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Admin_TABLE_14);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Teacher_TABLE_15 = "CREATE TABLE IF NOT EXISTS `Teacher` (  `added` TEXT, `updated` TEXT, `name` TEXT, `username` TEXT, `email` TEXT, `password` TEXT, `phoneNumber` TEXT, `alternatePhoneNumber` TEXT, `teacherClass` TEXT, `teacherSection` TEXT, `registrationId` TEXT, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Teacher_TABLE_15);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Student_TABLE_16 = "CREATE TABLE IF NOT EXISTS `Student` (  `added` TEXT, `updated` TEXT, `name` TEXT, `username` TEXT, `password` TEXT, `rollNumber` TEXT, `email` TEXT, `address` TEXT, `phoneNumber` TEXT, `studentOccupation` TEXT, `registrationId` TEXT, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `parentId` TEXT, `ainakClassAndSectionId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Student_TABLE_16);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Parent_TABLE_17 = "CREATE TABLE IF NOT EXISTS `Parent` (  `added` TEXT, `updated` TEXT, `name` TEXT, `username` TEXT, `password` TEXT, `email` TEXT, `address` TEXT, `phoneNumber` TEXT, `occupation` TEXT, `registrationId` TEXT, `realm` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Parent_TABLE_17);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Guest_TABLE_18 = "CREATE TABLE IF NOT EXISTS `Guest` (  `realm` TEXT, `username` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `email` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Guest_TABLE_18);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Event_TABLE_19 = "CREATE TABLE IF NOT EXISTS `Event` (  `added` TEXT, `updated` TEXT, `title` TEXT, `description` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Event_TABLE_19);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Notice_TABLE_20 = "CREATE TABLE IF NOT EXISTS `Notice` (  `added` TEXT, `updated` TEXT, `title` TEXT, `description` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Notice_TABLE_20);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Message_TABLE_21 = "CREATE TABLE IF NOT EXISTS `Message` (  `added` TEXT, `updated` TEXT, `description` TEXT, `to` TEXT, `from` TEXT, `sendSms` NUMBER, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, `ainakClassAndSectionId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Message_TABLE_21);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Question_TABLE_22 = "CREATE TABLE IF NOT EXISTS `Question` (  `title` TEXT, `added` TEXT, `updated` TEXT, `from` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `parentId` TEXT, `teacherId` TEXT, `studentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Question_TABLE_22);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Answer_TABLE_23 = "CREATE TABLE IF NOT EXISTS `Answer` (  `added` TEXT, `updated` TEXT, `description` TEXT, `from` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, `studentId` TEXT, `parentId` TEXT, `questionId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Answer_TABLE_23);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Blog_TABLE_24 = "CREATE TABLE IF NOT EXISTS `Blog` (  `title` TEXT, `description` TEXT, `added` TEXT, `updated` TEXT, `from` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, `studentId` TEXT, `parentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Blog_TABLE_24);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_HomeWork_TABLE_25 = "CREATE TABLE IF NOT EXISTS `HomeWork` (  `added` TEXT, `updated` TEXT, `title` TEXT, `description` TEXT, `attachment` TEXT, `from` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, `ainakClassAndSectionId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_HomeWork_TABLE_25);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Calendar_TABLE_26 = "CREATE TABLE IF NOT EXISTS `Calendar` (  `added` TEXT, `updated` TEXT, `date` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Calendar_TABLE_26);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Attendance_TABLE_27 = "CREATE TABLE IF NOT EXISTS `Attendance` (  `date` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, `ainakClassAndSectionId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Attendance_TABLE_27);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Reminder_TABLE_28 = "CREATE TABLE IF NOT EXISTS `Reminder` (  `added` TEXT, `updated` TEXT, `name` TEXT, `time` TEXT, `date` TEXT, `from` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, `studentId` TEXT, `parentId` TEXT, `calendarId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Reminder_TABLE_28);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_CustomEvent_TABLE_29 = "CREATE TABLE IF NOT EXISTS `CustomEvent` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `adminId` TEXT, `teacherId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_CustomEvent_TABLE_29);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Other_TABLE_30 = "CREATE TABLE IF NOT EXISTS `Other` (  `title` TEXT, `description` TEXT, `added` TEXT, `updated` TEXT, `type` TEXT, `from` TEXT, `to` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, `calendarId` TEXT, `customEventId` TEXT, `adminId` TEXT, `teacherId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Other_TABLE_30);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Setting_TABLE_31 = "CREATE TABLE IF NOT EXISTS `Setting` (  `removeBlog` NUMBER, `removeAskAndAnswer` NUMBER, `removeAttendance` NUMBER, `totalSmsSent` NUMBER, `id` TEXT PRIMARY KEY, `schoolId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Setting_TABLE_31);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_AinakClassAndSection_TABLE_32 = "CREATE TABLE IF NOT EXISTS `AinakClassAndSection` (  `added` TEXT, `updated` TEXT, `name` TEXT, `section` TEXT, `id` TEXT PRIMARY KEY, `schoolId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_AinakClassAndSection_TABLE_32);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_TeacherMessage_TABLE_33 = "CREATE TABLE IF NOT EXISTS `TeacherMessage` (  `added` TEXT, `id` TEXT PRIMARY KEY, `teacherId` TEXT, `messageId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_TeacherMessage_TABLE_33);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_StudentMessage_TABLE_34 = "CREATE TABLE IF NOT EXISTS `StudentMessage` (  `added` TEXT, `id` TEXT PRIMARY KEY, `messageId` TEXT, `studentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_StudentMessage_TABLE_34);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_StudentAttendance_TABLE_35 = "CREATE TABLE IF NOT EXISTS `StudentAttendance` (  `added` TEXT, `id` TEXT PRIMARY KEY, `studentId` TEXT, `attendanceId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_StudentAttendance_TABLE_35);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_StudentHomework_TABLE_36 = "CREATE TABLE IF NOT EXISTS `StudentHomework` (  `added` TEXT, `id` TEXT PRIMARY KEY, `homeWorkId` TEXT, `studentId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_StudentHomework_TABLE_36);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_TeacherOther_TABLE_37 = "CREATE TABLE IF NOT EXISTS `TeacherOther` (  `added` TEXT, `date` TEXT, `id` TEXT PRIMARY KEY, `teacherId` TEXT, `otherId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_TeacherOther_TABLE_37);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_StudentOther_TABLE_38 = "CREATE TABLE IF NOT EXISTS `StudentOther` (  `added` TEXT, `date` TEXT, `id` TEXT PRIMARY KEY, `studentId` TEXT, `otherId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_StudentOther_TABLE_38);


                                                                                                                                                    
                        
                        String CREATE_ImportData_TABLE_39 = "CREATE TABLE IF NOT EXISTS `ImportData` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_ImportData_TABLE_39);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_installation_TABLE_42 = "CREATE TABLE IF NOT EXISTS `installation` (  `status` TEXT, `appId` TEXT, `appVersion` TEXT, `badge` TEXT, `created` TEXT, `deviceToken` TEXT, `deviceType` TEXT, `modified` TEXT, `subscriptions` TEXT, `timeZone` TEXT, `userId` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_installation_TABLE_42);


            
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
                db.execSQL("DROP TABLE IF EXISTS `AmazonImage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `container`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Container`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `adminEmail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AdminEmail`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ResetPassword`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `School`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Admin`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Teacher`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Student`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Parent`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Guest`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Event`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Notice`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Message`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Question`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Answer`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Blog`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `HomeWork`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Calendar`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Attendance`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Reminder`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `CustomEvent`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Other`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Setting`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `AinakClassAndSection`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `TeacherMessage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `StudentMessage`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `StudentAttendance`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `StudentHomework`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `TeacherOther`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `StudentOther`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ImportData`");
            
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
            

            // Create tables again
            onCreate(db);
        }


        private DbHandler(Context context, String DATABASE_NAME) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
            onCreate(db);
        }
}
