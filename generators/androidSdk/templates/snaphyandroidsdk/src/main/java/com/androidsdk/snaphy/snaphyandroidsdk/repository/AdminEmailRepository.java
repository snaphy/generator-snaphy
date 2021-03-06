package com.androidsdk.snaphy.snaphyandroidsdk.repository;



import com.google.common.collect.ImmutableMap;
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
import com.androidsdk.snaphy.snaphyandroidsdk.list.Util;

import com.strongloop.android.remoting.adapters.Adapter;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;
import android.util.Log;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;


//Replaced by Custom ModelRepository method
//import com.strongloop.android.loopback.ModelRepository;



import org.json.JSONArray;
import org.json.JSONObject;


//Import its models too.
import com.androidsdk.snaphy.snaphyandroidsdk.models.AdminEmail;
import android.content.Context;
import com.androidsdk.snaphy.snaphyandroidsdk.db.AdminEmailDb;

//Now import model of related models..





public class AdminEmailRepository extends ModelRepository<AdminEmail> {


    private Context context;
    private String METADATA_DATABASE_NAME_KEY = "snaphy.database.name";
    private static String DATABASE_NAME;

    public AdminEmailRepository(){
        super("AdminEmail", null, AdminEmail.class);

    }


    public Context getContext(){
        return context;
    }


    







    public AdminEmailDb getDb() {
      return adminEmailDb;
    }

    public void setAdminEmailDb(AdminEmailDb adminEmailDb) {
      this.adminEmailDb = adminEmailDb;
    }

    private AdminEmailDb adminEmailDb;



    //Flag to check either to store data locally or not..
    private boolean STORE_LOCALLY = true;

    public boolean isSTORE_LOCALLY() {
      return STORE_LOCALLY;
    }


    public void  persistData(boolean persist){
      STORE_LOCALLY = persist;
    }



    public void reset__db(){
      if(isSTORE_LOCALLY()){
          getDb().reset__db();
      }
    }



    public void addStorage(Context context){
         try{
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            DATABASE_NAME = (String) ai.metaData.get(METADATA_DATABASE_NAME_KEY);
         }
         catch (Exception e){
            Log.e("Snaphy", e.toString());
         }
         setAdminEmailDb(new AdminEmailDb(context, DATABASE_NAME, getRestAdapter()));
         //allow data storage locally..
         persistData(true);
         this.context = context;
    }


    public RestContract createContract() {
    RestContract contract = super.createContract();
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getSchema", "POST"), "adminEmail.getSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getAbsoluteSchema", "POST"), "adminEmail.getAbsoluteSchema");
    

    
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getDetailSchema", "POST"), "adminEmail.getDetailSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getModelRelationSchema", "POST"), "adminEmail.getModelRelationSchema");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/sendMail", "POST"), "adminEmail.sendMail");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/WelcomeMessage", "POST"), "adminEmail.WelcomeMessage");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/NewInvoice", "POST"), "adminEmail.NewInvoice");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/AccountPaused", "POST"), "adminEmail.AccountPaused");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/DailyProductCount", "POST"), "adminEmail.DailyProductCount");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/SummaryReport", "POST"), "adminEmail.SummaryReport");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/EmailVerification", "POST"), "adminEmail.EmailVerification");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/OrderSample", "POST"), "adminEmail.OrderSample");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/Subscription", "POST"), "adminEmail.Subscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/CustomerSubscription", "POST"), "adminEmail.CustomerSubscription");
    

    
    

    

    
    contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/getMailSchema", "POST"), "adminEmail.getMailSchema");
    

    
    
    return contract;
    }



//override getNameForRestUrlMethod
    public String  getNameForRestUrl() {
        
            //call super method instead..
            return super.getNameForRestUrl();
        
    }



    




    
        
            //Method sendMail definition
            public void sendMail(  DataList<String> to,  String subject,  String html, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("html", html);
                

                


                
                    
                    invokeStaticMethod("sendMail", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method sendMail definition ends here..

            

        
    
        
            //Method WelcomeMessage definition
            public void WelcomeMessage(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("WelcomeMessage", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method WelcomeMessage definition ends here..

            

        
    
        
            //Method NewInvoice definition
            public void NewInvoice(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("NewInvoice", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method NewInvoice definition ends here..

            

        
    
        
            //Method AccountPaused definition
            public void AccountPaused(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("AccountPaused", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method AccountPaused definition ends here..

            

        
    
        
            //Method DailyProductCount definition
            public void DailyProductCount(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("DailyProductCount", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method DailyProductCount definition ends here..

            

        
    
        
            //Method SummaryReport definition
            public void SummaryReport(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("SummaryReport", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method SummaryReport definition ends here..

            

        
    
        
            //Method EmailVerification definition
            public void EmailVerification(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("EmailVerification", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method EmailVerification definition ends here..

            

        
    
        
            //Method OrderSample definition
            public void OrderSample(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("OrderSample", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method OrderSample definition ends here..

            

        
    
        
            //Method Subscription definition
            public void Subscription(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("Subscription", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method Subscription definition ends here..

            

        
    
        
            //Method CustomerSubscription definition
            public void CustomerSubscription(  DataList<String> to,  String subject,  Map<String,  ? extends Object> templateOptions, final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                
                        hashMapObject.put("to", to);
                
                        hashMapObject.put("subject", subject);
                
                        hashMapObject.put("templateOptions", templateOptions);
                

                


                
                    
                    invokeStaticMethod("CustomerSubscription", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method CustomerSubscription definition ends here..

            

        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            //Method getSchema definition
            public void getSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getSchema definition ends here..

            

        
    
        
            //Method getAbsoluteSchema definition
            public void getAbsoluteSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getAbsoluteSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getAbsoluteSchema definition ends here..

            

        
    
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            //Method getDetailSchema definition
            public void getDetailSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getDetailSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getDetailSchema definition ends here..

            

        
    
        
            //Method getModelRelationSchema definition
            public void getModelRelationSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getModelRelationSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getModelRelationSchema definition ends here..

            

        
    
        
        
        
        
        
        
        
        
        
        
        
            //Method getMailSchema definition
            public void getMailSchema( final ObjectCallback<JSONObject>  callback ){

                /**
                Call the onBefore event
                */
                callback.onBefore();


                //Definging hashMap for data conversion
                Map<String, Object> hashMapObject = new HashMap<>();
                //Now add the arguments...
                

                


                
                    
                    invokeStaticMethod("getMailSchema", hashMapObject, new Adapter.JsonObjectCallback() {
                    
                    
                        @Override
                        public void onError(Throwable t) {
                            callback.onError(t);
                            //Call the finally method..
                            callback.onFinally();
                        }

                        @Override
                        public void onSuccess(JSONObject response) {
                          try{
                            
                                callback.onSuccess(response);
                            
                          }catch(Exception e){
                            Log.e("Snaphy", e.toString());
                          }

                            //Call the finally method..
                            callback.onFinally();
                        }
                    });
                

                

            }//Method getMailSchema definition ends here..

            

        
    



}
