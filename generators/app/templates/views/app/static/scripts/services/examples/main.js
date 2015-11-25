'use strict';

angular.module('templateAdminApp')


.factory('pageResize', [function(){
  return{

    /* PAGE ON RESIZE WITH TIMEOUT */
    onresize: function(timeout){
        // console.log('I am resizing');
        timeout = timeout ? timeout : 200;
        var that= this;
        setTimeout(function(){
            that.page_content_onresize();
        },timeout);
    },
    /* EOF PAGE ON RESIZE WITH TIMEOUT */


    page_content_onresize: function(){
        $(".page-content,.content-frame-body,.content-frame-right,.content-frame-left").css("width","").css("height","");

        var content_minus = 0;
        content_minus = ($(".page-container-boxed").length > 0) ? 40 : content_minus;
        content_minus += ($(".page-navigation-top-fixed").length > 0) ? 50 : 0;

        var content = $(".page-content");
        var sidebar = $(".page-sidebar");

        if(content.height() < $(document).height() - content_minus){
            content.height($(document).height() - content_minus);
        }

        if(sidebar.height() > content.height()){
            content.height(sidebar.height());
        }

        if($(window).width() > 1024){

            if($(".page-sidebar").hasClass("scroll")){
                if($("body").hasClass("page-container-boxed")){
                    var doc_height = $(document).height() - 40;
                }else{
                    var doc_height = $(window).height();
                }
               $(".page-sidebar").height(doc_height);

           }

            if($(".content-frame-body").height() < $(document).height()-162){
                $(".content-frame-body,.content-frame-right,.content-frame-left").height($(document).height()-162);
            }else{
                $(".content-frame-right,.content-frame-left").height($(".content-frame-body").height());
            }

            $(".content-frame-left").show();
            $(".content-frame-right").show();
        }else{
            $(".content-frame-body").height($(".content-frame").height()-80);

            if($(".page-sidebar").hasClass("scroll"))
               $(".page-sidebar").css("height","");
        }

        if($(window).width() < 1200){
            if($("body").hasClass("page-container-boxed")){
                $("body").removeClass("page-container-boxed").data("boxed","1");
            }
        }else{
            if($("body").data("boxed") === "1"){
                $("body").addClass("page-container-boxed").data("boxed","");
            }
        }
    } // page_content_onresize function ends..
  }; //Return END..
}]) //Resize factory ends


//Factory for creating CustomerServices
.factory('CustomerServices', [function(){
    return {
        getAge : function(birthday){
            var ageDifMs = Date.now() - birthday.getTime();
            var ageDate = new Date(ageDifMs); // miliseconds from epoch
            return Math.abs(ageDate.getUTCFullYear() - 1970);
        }, //End of getAge function..

        //Check if given date is equal to todays date or not...
        compareDate: function( createdDate ){
            var c = new Date(createdDate);
            var d = new Date;
            if(c.getDay() === d.getDay() && c.getMonth() === d.getMonth() && c.getFullYear() === d.getFullYear() ){
                return true;
            }
            else{
                return false;
            }
        }, //CompareDate


        getMonthName: function(date){
            var monthNames = ["Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"
            ];
            var d = new Date(date);
            var month = monthNames[d.getMonth()];
            return month;
        }, //getMonthName...


        getDayName: function(date){
            var dayName = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
            var d = new Date(date);
            //Sun to mon; 0-5
            var day = d.getDay();
            return dayName[day];
        }

    }; //End of return function..
}])



//Helpers function for handling errors...
.factory('Error', ['$state', function($state){
    return{
        //For handling strongloop  httpResponse..
        handleHttpResponse: function(response){

            //PAGE NOT FOUND ERROR..
            if(response.status === 404){

                //redirect to 404 page..
                $state.go('error404');
            }
        }


    }; //Return
}])






//Factory for checking the object properties..
.factory('objProp', [function(){
    return {
        //Function for checking if obj or array is empty..
        //For more info..
        //http://stackoverflow.com/questions/4994201/is-object-empty
        // Speed up calls to hasOwnProperty

        isEmpty:function (obj) {
            var hasOwnProperty = Object.prototype.hasOwnProperty;
            // null and undefined are "empty"
            if (obj == null) return true;

            // Assume if it has a length property with a non-zero value
            // that that property is correct.
            if (obj.length > 0)    return false;
            if (obj.length === 0)  return true;

            // Otherwise, does it have any properties of its own?
            // Note that this doesn't handle
            // toString and valueOf enumeration bugs in IE < 9
            for (var key in obj) {
                if (this.hasOwnProperty.call(obj, key)) return false;
            }

            return true;
        } //isEmpty function..

    }; //Return
}])



//for writing global function services..
.factory('globalServices', ['$location', function ($location) {
    return {

        //For getting location next after login value....
        getNextAfterLoginPath : function(){
            if($location.path() === '/login' || $location.path() === '/register')
            {
                return '/';
            }
            return $location.path();
        }

    };
}])


//Services for getting the prescription URI
.factory('PrescriptionServices', [function () {
    return {
        getDownloadURI: function(customerId, fileName){
            return {
                "image" : '/api/containers/' + customerId + '/download/' + fileName,
                "thumb" : '/api/containers/' + customerId + '/download/' + fileName
            };
        }, //getDownloadURI
        getUploadURI: function(customerId){
            return '/api/containers/' + customerId + '/upload'
        }
    };
}])





//Defign the constant string for location routes...
.factory('RouteServices', [function () {
    var routes = {
        loginPage      : '#/login',
        homePage       : '#/',
        registerPage   : '#/register',
        retailerPage   : '#/retailer',

        // Yet to implemented routes.
        resetPassword  : '#/resetPassword',
        help           : '#/help',
        settings       : '#/settings',
        profile        : '#/profile',
        copyrightPage  : '#/copyright',
        employeePage   : '#/employees',
        customerPage   : '#/customers',
        delieveryPage  : '#/delievery',
        orderPage      : '#/order',
        salesPage      : '#/sales',
        areaPage       : '#/areas',
        invoicePage    : '#/invoice',
        expenditurePage: '#/expenditure',
        blogPage       : '#/blogs',
        slotPage       : '#/slots'
    }


    return routes;

}])

//Defigning constant string name and their values..
.factory('constantValues', [function () {
    return {
        logo                : 'DRUGCORNER',
        title               : 'DRUGCORNER',
        description         : 'Admin website for DrugCorner',
        accounts            : 'Account',
        settings            : 'Settings',
        help                : 'Help',
        profile             : 'Profile',
        logout              : 'Logout',
        copyrightYear       : '2015',
        dashboard           : 'Dashboard',
        navigation          : 'Navigation',


        loginPage:{
            register    : 'Don\'t have an account',
            home        : 'Back to Homepage',
            login       : 'Member Login',
            details     : 'Please provide your details',
            rememberMe  : 'Keep me signed in',
            signIn      : 'Sign In',
            resetPassword:'Reset Password'
        },

        registerPage:{
            login              : 'Already have an account? Login now',
            haveAccount        : 'Already have an account?',
            signUp             : 'Signup for Free Account',
            createAccount      : 'Create your free account:',
            firstName          : 'First Name:',
            lastName           : 'Last Name:',
            email              : 'Email:',
            password           : 'Password:',
            confirmPassword    : 'Confirm Password:',
            terms              : 'Agree with the Terms & Conditions.',
            registerButton     : 'Register',
            loginNow           : 'Login to your account'

        },

        subNavBar: {
            dashboard          : 'Dashboard',
            retailers          : 'Retailers',

            customers          : 'Customers',
            delievery          : 'Delievery',
            employee           : 'Employees',
            orders             : 'Orders',
            sales              : 'Sales',
            areas              : 'Areas',
            invoice            : 'Invoice Settings',
            other              : 'Other Options',
            expenditure        : 'Expenditure',
            blog               : 'Blog',
            slots              : 'Slots',
            dailyOrders        : 'Daily Orders',
            office             : 'Office',
            addRetailers       : 'Add Retailer'
        },

        error:{
            '404': '404 Error'
        },

        retailerProfile: {

            name          : 'Profile',
            home          : 'Home'
        }


    };
}]);
