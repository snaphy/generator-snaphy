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


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_FacebookAccessToken_TABLE_7 = "CREATE TABLE IF NOT EXISTS `FacebookAccessToken` (  `FbUserId` TEXT, `token` TEXT, `expires` TEXT, `userId` TEXT, `type` TEXT, _DATA_UPDATED NUMBER )";
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


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Patient_TABLE_27 = "CREATE TABLE IF NOT EXISTS `Patient` (  `unique_number` TEXT, `name` TEXT, `profilePic` TEXT, `idProof` TEXT, `fatherName` TEXT, `yearOfBirth` NUMBER, `aadharLastNumber` TEXT, `patientContactNumber` TEXT, `email` TEXT, `patientOtherAddress` TEXT, `patientOtherContactNumber` TEXT, `otherEmail` TEXT, `gender` TEXT, `relationLogs` TEXT, `status` TEXT, `added` TEXT, `updated` TEXT, `age` TEXT, `relatedPatients` TEXT, `address` TEXT, `otherAddress` TEXT, `pincodeNumber` TEXT, `realm` TEXT, `username` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `mergedWithId` TEXT, `aadharId` TEXT, `stateId` TEXT, `pincodeId` TEXT, `talukId` TEXT, `districtId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Patient_TABLE_27);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_PatientGroup_TABLE_28 = "CREATE TABLE IF NOT EXISTS `PatientGroup` (  `unique_number` TEXT, `patientContactNumber` TEXT, `name` TEXT, `lama` NUMBER, `status` TEXT, `hasDischarged` NUMBER, `hasConsulted` NUMBER, `facility` TEXT, `relationLogs` TEXT, `diagnosis` TEXT, `admittedOn` TEXT, `added` TEXT, `updated` TEXT, `dischargedOn` TEXT, `consultedOn` TEXT, `patientOtherContactNumber` TEXT, `flaggedInSameHospital` NUMBER, `bedNumber` TEXT, `opdCode` TEXT, `opdNumber` NUMBER, `opdTokenNumber` TEXT, `addedBy` TEXT, `isDocumentScanned` NUMBER, `isRepeatCustomer` NUMBER, `isFollowUp` NUMBER, `lastFollowUpDate` TEXT, `actualFollowUp` NUMBER, `consultationFees` NUMBER, `followUpFees` NUMBER, `followUpDays` NUMBER, `nextFollowUpDate` TEXT, `isNew` NUMBER, `isFlagged` NUMBER, `flaggedFor` TEXT, `pincodeNumber` TEXT, `hashObject` TEXT, `id` TEXT PRIMARY KEY, `patientId` TEXT, `aadharId` TEXT, `hospitalId` TEXT, `ipdBedLogId` TEXT, `ipdBedId` TEXT, `opdTokenLogId` TEXT, `patientSecurityId` TEXT, `hospitalUserId` TEXT, `stateId` TEXT, `pincodeId` TEXT, `talukId` TEXT, `districtId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_PatientGroup_TABLE_28);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Aadhar_TABLE_29 = "CREATE TABLE IF NOT EXISTS `Aadhar` (  `unique_number` TEXT, `aadharNumber` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Aadhar_TABLE_29);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Hospital_TABLE_30 = "CREATE TABLE IF NOT EXISTS `Hospital` (  `unique_number` TEXT, `name` TEXT, `contactNumber` TEXT, `typeOfFacility` TEXT, `status` TEXT, `image` TEXT, `hospitalEmail` TEXT, `added` TEXT, `updated` TEXT, `address` TEXT, `id` TEXT PRIMARY KEY, `hospitalUserId` TEXT, `stateId` TEXT, `pincodeId` TEXT, `talukId` TEXT, `districtId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Hospital_TABLE_30);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_IpdBedLog_TABLE_31 = "CREATE TABLE IF NOT EXISTS `IpdBedLog` (  `added` TEXT, `updated` TEXT, `dischargedOn` TEXT, `hasDischarged` NUMBER, `id` TEXT PRIMARY KEY, `patientGroupId` TEXT, `hospitalId` TEXT, `ipdBedId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_IpdBedLog_TABLE_31);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_IpdBed_TABLE_32 = "CREATE TABLE IF NOT EXISTS `IpdBed` (  `bedNumber` TEXT, `added` TEXT, `updated` TEXT, `type` TEXT, `id` TEXT PRIMARY KEY, `ipdCategoryId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_IpdBed_TABLE_32);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_UserInvite_TABLE_33 = "CREATE TABLE IF NOT EXISTS `UserInvite` (  `code` TEXT, `expiryDate` TEXT, `role` TEXT, `contactNumber` TEXT, `added` TEXT, `status` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `hospitalId` TEXT, `hospitalUserId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_UserInvite_TABLE_33);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_OpdTokenLog_TABLE_34 = "CREATE TABLE IF NOT EXISTS `OpdTokenLog` (  `added` TEXT, `updated` TEXT, `unique_number` NUMBER, `code` TEXT, `number` NUMBER, `id` TEXT PRIMARY KEY, `hospitalId` TEXT, `hospitalUserId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_OpdTokenLog_TABLE_34);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_UserSetting_TABLE_35 = "CREATE TABLE IF NOT EXISTS `UserSetting` (  `added` TEXT, `updated` TEXT, `notification` TEXT, `id` TEXT PRIMARY KEY, `hospitalUserId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_UserSetting_TABLE_35);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Feed_TABLE_36 = "CREATE TABLE IF NOT EXISTS `Feed` (  `added` TEXT, `updated` TEXT, `unique_number` TEXT, `title` TEXT, `subTitle` TEXT, `description` TEXT, `feedImage` TEXT, `type` TEXT, `flagCount` TEXT, `doctorFirstName` TEXT, `doctorLastName` TEXT, `doctorProfilePic` TEXT, `patientFirstName` TEXT, `patientLastName` TEXT, `patientProfilePic` TEXT, `hospitalName` TEXT, `id` TEXT PRIMARY KEY, `patientSecurityId` TEXT, `stateId` TEXT, `companyId` TEXT, `pincodeId` TEXT, `districtId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Feed_TABLE_36);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Flag_TABLE_37 = "CREATE TABLE IF NOT EXISTS `Flag` (  `name` TEXT, `added` TEXT, `updated` TEXT, `type` TEXT, `colorCode` TEXT, `severityPoints` NUMBER, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Flag_TABLE_37);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_PatientFlag_TABLE_38 = "CREATE TABLE IF NOT EXISTS `PatientFlag` (  `added` TEXT, `updated` TEXT, `severityPoints` NUMBER, `id` TEXT PRIMARY KEY, `flagId` TEXT, `patientId` TEXT, `patientSecurityId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_PatientFlag_TABLE_38);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_PatientSecurity_TABLE_39 = "CREATE TABLE IF NOT EXISTS `PatientSecurity` (  `unique_number` TEXT, `unpaidAmount` NUMBER, `title` TEXT, `description` TEXT, `added` TEXT, `updated` TEXT, `highestSeverity` NUMBER, `relatedPatient` TEXT, `totalFlags` NUMBER, `flagCount` TEXT, `id` TEXT PRIMARY KEY, `patientGroupId` TEXT, `hospitalId` TEXT, `patientId` TEXT, `hospitalUserId` TEXT, feedId TEXT , _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_PatientSecurity_TABLE_39);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_PatientDocument_TABLE_40 = "CREATE TABLE IF NOT EXISTS `PatientDocument` (  `document` TEXT, `added` TEXT, `updated` TEXT, `tag` TEXT, `backupPatientId` TEXT, `id` TEXT PRIMARY KEY, `patientId` TEXT, `patientGroupId` TEXT, `hospitalId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_PatientDocument_TABLE_40);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_HospitalUser_TABLE_41 = "CREATE TABLE IF NOT EXISTS `HospitalUser` (  `unique_number` TEXT, `profilePic` TEXT, `firstName` TEXT, `lastName` TEXT, `gender` TEXT, `contactNumber` TEXT, `designation` TEXT, `registrationNumber` TEXT, `registrationYear` NUMBER, `email` TEXT, `yearOfExperience` NUMBER, `yearOfBirth` NUMBER, `added` TEXT, `updated` TEXT, `isDoctor` NUMBER, `image` TEXT, `registeredStatus` TEXT, `authenticationStatus` TEXT, `realm` TEXT, `username` TEXT, `password` TEXT, `credentials` TEXT, `challenges` TEXT, `emailVerified` TEXT, `verificationToken` TEXT, `status` TEXT, `created` TEXT, `lastUpdated` TEXT, `id` TEXT PRIMARY KEY, `registrationCouncilId` TEXT, `stateId` TEXT, `pincodeId` TEXT, `talukId` TEXT, `districtId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_HospitalUser_TABLE_41);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Specialization_TABLE_42 = "CREATE TABLE IF NOT EXISTS `Specialization` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Specialization_TABLE_42);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_HospitalUserSpecialization_TABLE_43 = "CREATE TABLE IF NOT EXISTS `HospitalUserSpecialization` (  `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `hospitalUserId` TEXT, `specializationId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_HospitalUserSpecialization_TABLE_43);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_HospitalUserSetting_TABLE_44 = "CREATE TABLE IF NOT EXISTS `HospitalUserSetting` (  `added` TEXT, `updated` TEXT, `userRole` TEXT, `relationshipWithHospital` TEXT, `code` TEXT, `consultationFees` NUMBER, `followUpFees` NUMBER, `followUpDays` NUMBER, `id` TEXT PRIMARY KEY, `hospitalUserId` TEXT, `hospitalId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_HospitalUserSetting_TABLE_44);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_HospitalUserEducation_TABLE_45 = "CREATE TABLE IF NOT EXISTS `HospitalUserEducation` (  `added` TEXT, `updated` TEXT, `yearOfGraduation` NUMBER, `degreeName` TEXT, `collegeName` TEXT, `id` TEXT PRIMARY KEY, `hospitalUserId` TEXT, `collegeId` TEXT, `degreeId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_HospitalUserEducation_TABLE_45);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_College_TABLE_46 = "CREATE TABLE IF NOT EXISTS `College` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_College_TABLE_46);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Degree_TABLE_47 = "CREATE TABLE IF NOT EXISTS `Degree` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Degree_TABLE_47);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_RegistrationCouncil_TABLE_48 = "CREATE TABLE IF NOT EXISTS `RegistrationCouncil` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_RegistrationCouncil_TABLE_48);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_State_TABLE_49 = "CREATE TABLE IF NOT EXISTS `State` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_State_TABLE_49);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_MergeRequest_TABLE_50 = "CREATE TABLE IF NOT EXISTS `MergeRequest` (  `added` TEXT, `updated` TEXT, `status` TEXT, `mergeNameOne` TEXT, `mergeNameTwo` TEXT, `mergePatientIdOne` TEXT, `mergePatientIdTwo` TEXT, `backupData` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_MergeRequest_TABLE_50);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_PatientGroupLog_TABLE_51 = "CREATE TABLE IF NOT EXISTS `PatientGroupLog` (  `stage` TEXT, `status` TEXT, `added` TEXT, `flaggedInSameHospital` NUMBER, `updated` TEXT, `hospitalName` TEXT, `doctorName` TEXT, `lastVisitedOn` TEXT, `lastDischargedOn` TEXT, `internalStatus` TEXT, `externalStatus` TEXT, `id` TEXT PRIMARY KEY, `patientGroupId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_PatientGroupLog_TABLE_51);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Company_TABLE_52 = "CREATE TABLE IF NOT EXISTS `Company` (  `name` TEXT, `logo` TEXT, `address` TEXT, `contactNumber` TEXT, `note` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Company_TABLE_52);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_PatientLike_TABLE_53 = "CREATE TABLE IF NOT EXISTS `PatientLike` (  `value` TEXT, `id` TEXT PRIMARY KEY, `patientGroupId` TEXT, `patientId` TEXT, `hospitalUserId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_PatientLike_TABLE_53);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Pincode_TABLE_54 = "CREATE TABLE IF NOT EXISTS `Pincode` (  `number` TEXT, `added` TEXT, `districtName` TEXT, `talukName` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, `stateId` TEXT, `talukId` TEXT, `districtId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Pincode_TABLE_54);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Taluk_TABLE_55 = "CREATE TABLE IF NOT EXISTS `Taluk` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Taluk_TABLE_55);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_District_TABLE_56 = "CREATE TABLE IF NOT EXISTS `District` (  `name` TEXT, `added` TEXT, `updated` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_District_TABLE_56);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Faq_TABLE_57 = "CREATE TABLE IF NOT EXISTS `Faq` (  `added` TEXT, `updated` TEXT, `title` TEXT, `description` TEXT, `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Faq_TABLE_57);


                                                                                                                                                    
                        

                        
                        String CREATE_ImportData_TABLE_58 = "CREATE TABLE IF NOT EXISTS `ImportData` (  `id` TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_ImportData_TABLE_58);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_ReferPatient_TABLE_59 = "CREATE TABLE IF NOT EXISTS `ReferPatient` (  `reason` TEXT, `unique_number` TEXT, `isRefered` NUMBER, `isConsulted` NUMBER, `listOfRecords` TEXT, `added` TEXT, `updated` TEXT, `description` TEXT, `id` TEXT PRIMARY KEY, `patientGroupId` TEXT, `patientId` TEXT, `referedHospitalId` TEXT, `referedHospitalUserId` TEXT, `repliedHospitalId` TEXT, `repliedHospitalUserId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_ReferPatient_TABLE_59);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_Bill_TABLE_60 = "CREATE TABLE IF NOT EXISTS `Bill` (  `added` TEXT, `updated` TEXT, `type` TEXT, `amount` NUMBER, `description` TEXT, `id` TEXT PRIMARY KEY, `patientGroupId` TEXT, `patientId` TEXT, `billCategoryId` TEXT, `subBillCategoryId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Bill_TABLE_60);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_BillCategory_TABLE_61 = "CREATE TABLE IF NOT EXISTS `BillCategory` (  `added` TEXT, `updated` TEXT, `name` TEXT, `id` TEXT PRIMARY KEY, `hospitalId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_BillCategory_TABLE_61);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_SubBillCategory_TABLE_62 = "CREATE TABLE IF NOT EXISTS `SubBillCategory` (  `added` TEXT, `updated` TEXT, `name` TEXT, `id` TEXT PRIMARY KEY, `billCategoryId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_SubBillCategory_TABLE_62);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        

                        
                        String CREATE_IpdCategory_TABLE_63 = "CREATE TABLE IF NOT EXISTS `IpdCategory` (  `added` TEXT, `updated` TEXT, `name` TEXT, `id` TEXT PRIMARY KEY, `hospitalId` TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_IpdCategory_TABLE_63);


            
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
                db.execSQL("DROP TABLE IF EXISTS `Patient`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PatientGroup`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Aadhar`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Hospital`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `IpdBedLog`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `IpdBed`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `UserInvite`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `OpdTokenLog`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `UserSetting`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Feed`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Flag`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PatientFlag`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PatientSecurity`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PatientDocument`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `HospitalUser`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Specialization`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `HospitalUserSpecialization`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `HospitalUserSetting`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `HospitalUserEducation`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `College`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Degree`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `RegistrationCouncil`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `State`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `MergeRequest`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PatientGroupLog`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Company`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `PatientLike`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Pincode`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Taluk`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `District`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Faq`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ImportData`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `ReferPatient`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `Bill`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `BillCategory`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `SubBillCategory`");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS `IpdCategory`");
            

            // Create tables again
            onCreate(db);
        }


        private DbHandler(Context context, String DATABASE_NAME) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
            onCreate(db);
        }
}
