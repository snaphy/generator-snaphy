package com.androidsdk.snaphy.snaphyandroidsdk.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by robins on 16/2/17.
 */



public class DbHandler extends SQLiteOpenHelper {
        private static DbHandler sInstance;
        public static synchronized DbHandler getInstance(Context context, String DATABASE_NAME, int DATABASE_VERSION){
            // Use the application context, which will ensure that you don't accidentally leak an Activity's context.
            if (sInstance == null) {
                sInstance = new DbHandler(context.getApplicationContext(), DATABASE_NAME, DATABASE_VERSION);
            }
            return sInstance;
        }


        // Creating Tables
        @Override
        public void onCreate(SQLiteDatabase db) {

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_RoleMapping_TABLE_3 = "CREATE TABLE IF NOT EXISTS RoleMapping(  id TEXT PRIMARY KEY, principalType TEXT, principalId TEXT, roleId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_RoleMapping_TABLE_3);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Role_TABLE_4 = "CREATE TABLE IF NOT EXISTS Role(  id TEXT PRIMARY KEY, name TEXT, description TEXT, created TEXT, modified TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Role_TABLE_4);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_CompanyInfo_TABLE_5 = "CREATE TABLE IF NOT EXISTS CompanyInfo(  type TEXT, html TEXT, edited TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_CompanyInfo_TABLE_5);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Employee_TABLE_6 = "CREATE TABLE IF NOT EXISTS Employee(  username TEXT, firstName TEXT, lastName TEXT, added TEXT, updated TEXT, email TEXT, password TEXT, realm TEXT, credentials TEXT, challenges TEXT, emailVerified TEXT, verificationToken TEXT, status TEXT, created TEXT, lastUpdated TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Employee_TABLE_6);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_FacebookAccessToken_TABLE_7 = "CREATE TABLE IF NOT EXISTS FacebookAccessToken(  FbUserId TEXT, token TEXT, expires TEXT, userId TEXT, type TEXT, appUserId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_FacebookAccessToken_TABLE_7);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_AppUser_TABLE_8 = "CREATE TABLE IF NOT EXISTS AppUser(  firstName TEXT, lastName TEXT, email TEXT, added TEXT, updated TEXT, registrationId TEXT, profilePic TEXT, realm TEXT, username TEXT, password TEXT, credentials TEXT, challenges TEXT, emailVerified TEXT, verificationToken TEXT, status TEXT, created TEXT, lastUpdated TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_AppUser_TABLE_8);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_AmazonImage_TABLE_9 = "CREATE TABLE IF NOT EXISTS AmazonImage(  name TEXT, container TEXT, type TEXT, url TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_AmazonImage_TABLE_9);


                                                                                                                                                    
                        
                        String CREATE_container_TABLE_10 = "CREATE TABLE IF NOT EXISTS container(  id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_container_TABLE_10);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_HotDeal_TABLE_12 = "CREATE TABLE IF NOT EXISTS HotDeal(  title TEXT, description TEXT, image TEXT, url TEXT, price NUMBER, status TEXT, expiryDate TEXT, added TEXT, updated TEXT, id TEXT PRIMARY KEY, categoryId TEXT, brandId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_HotDeal_TABLE_12);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Category_TABLE_13 = "CREATE TABLE IF NOT EXISTS Category(  name TEXT, added TEXT, updated TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Category_TABLE_13);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Chat_TABLE_14 = "CREATE TABLE IF NOT EXISTS Chat(  added TEXT, updated TEXT, message TEXT, type TEXT, image TEXT, from TEXT, guid TEXT, status TEXT, id TEXT PRIMARY KEY, appUserId TEXT, brandId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Chat_TABLE_14);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Brand_TABLE_15 = "CREATE TABLE IF NOT EXISTS Brand(  added TEXT, updated TEXT, name TEXT, image TEXT, trending TEXT, facebookUrl TEXT, googleUrl TEXT, instagramUrl TEXT, status TEXT, associatedEmail TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Brand_TABLE_15);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_DailyFeed_TABLE_16 = "CREATE TABLE IF NOT EXISTS DailyFeed(  added TEXT, updated TEXT, title TEXT, description TEXT, image TEXT, id TEXT PRIMARY KEY, brandId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_DailyFeed_TABLE_16);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_BrandManager_TABLE_17 = "CREATE TABLE IF NOT EXISTS BrandManager(  firstName TEXT, lastName TEXT, email TEXT, password TEXT, restrictHotDeal TEXT, status TEXT, added TEXT, updated TEXT, realm TEXT, username TEXT, credentials TEXT, challenges TEXT, emailVerified TEXT, verificationToken TEXT, created TEXT, lastUpdated TEXT, id TEXT PRIMARY KEY, brandId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_BrandManager_TABLE_17);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_adminEmail_TABLE_18 = "CREATE TABLE IF NOT EXISTS adminEmail(  to TEXT, from TEXT, subject TEXT, text TEXT, html TEXT, id TEXT PRIMARY KEY, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_adminEmail_TABLE_18);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_BrandVerification_TABLE_20 = "CREATE TABLE IF NOT EXISTS BrandVerification(  code TEXT, added TEXT, updated TEXT, id TEXT PRIMARY KEY, brandId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_BrandVerification_TABLE_20);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_Student_TABLE_22 = "CREATE TABLE IF NOT EXISTS Student(  firstName TEXT, lastName TEXT, realm TEXT, username TEXT, password TEXT, credentials TEXT, challenges TEXT, email TEXT, emailVerified TEXT, verificationToken TEXT, status TEXT, created TEXT, lastUpdated TEXT, id TEXT PRIMARY KEY, brandId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_Student_TABLE_22);


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        
                        String CREATE_FollowBrand_TABLE_23 = "CREATE TABLE IF NOT EXISTS FollowBrand(  added TEXT, id TEXT PRIMARY KEY, appUserId TEXT, brandId TEXT, _DATA_UPDATED NUMBER )";
                        db.execSQL(CREATE_FollowBrand_TABLE_23);


            
            String CREATE_FollowBrand_TABLE = "CREATE TABLE IF NOT EXISTS FollowBrand(  added TEXT, id TEXT PRIMARY KEY, appUserId TEXT, brandId TEXT, _DATA_UPDATED NUMBER )";
            db.execSQL(CREATE_FollowBrand_TABLE);
        }

        // Upgrading database
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS User");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS AccessToken");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS ACL");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS RoleMapping");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS Role");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS CompanyInfo");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS Employee");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS FacebookAccessToken");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS AppUser");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS AmazonImage");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS container");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS Container");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS HotDeal");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS Category");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS Chat");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS Brand");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS DailyFeed");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS BrandManager");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS adminEmail");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS AdminEmail");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS BrandVerification");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS ResetPassword");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS Student");
            
                // Drop older table if existed
                db.execSQL("DROP TABLE IF EXISTS FollowBrand");
            

            // Create tables again
            onCreate(db);
        }


        private DbHandler(Context context, String DATABASE_NAME, int DATABASE_VERSION) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            SQLiteDatabase db = this.getWritableDatabase();
            onCreate(db);
        }
}
