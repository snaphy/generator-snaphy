'use strict';

angular.module('templateAdminApp')

  //Directive for handling the enter key press
  /*For more info
  http://stackoverflow.com/questions/17470790/how-to-use-a-keypress-event-in-angularjs
  */

  .directive('dcFocus', [function () {
      return {
        restrict: 'A',
        link: function (scope, iElement, iAttrs) {

          $(iElement).focus();
        }
      };
    }])






  .directive('dcPreventBackspaceReload', [function () {
      return {
        restrict: 'A',
        link: function (scope, iElement, iAttrs) {
          // Prevent the backspace key from navigating back.
          $(document).unbind('keydown').bind('keydown', function (event) {
              var doPrevent = false;
              if (event.keyCode === 8) {
                  var d = event.srcElement || event.target;
                  if ((d.tagName.toUpperCase() === 'INPUT' &&
                       (
                           d.type.toUpperCase() === 'TEXT' ||
                           d.type.toUpperCase() === 'PASSWORD' ||
                           d.type.toUpperCase() === 'FILE' ||
                           d.type.toUpperCase() === 'EMAIL' ||
                           d.type.toUpperCase() === 'SEARCH' ||
                           d.type.toUpperCase() === 'DATE' )
                       ) ||
                       d.tagName.toUpperCase() === 'TEXTAREA') {
                      doPrevent = d.readOnly || d.disabled;
                  }
                  else {
                      doPrevent = true;
                  }
              }

              if (doPrevent) {
                  event.preventDefault();
              }
          });
        } //link
      };
    }])




  .directive('ngEnter', [function () {
        return function (scope, element, attrs) {
            element.bind("keydown keypress", function (event) {
                if(event.which === 13) {
                    scope.$apply(function (){
                        scope.$eval(attrs.ngEnter);
                    });

                    event.preventDefault();
                }
            }); //bind function
        }; //return
    }])


//Directive for handling the tab key press
  .directive('ngTab', [function () {
        return function (scope, element, attrs) {
            element.bind("keydown keypress", function (event) {
                if(event.which === 9) {
                    scope.$apply(function (){
                        scope.$eval(attrs.ngTab);
                    });

                    event.preventDefault();
                }
            }); //bind function
        }; //return
    }])



  .directive('dcClassRoute', ['$rootScope', 'LoginServices', function($rootScope, LoginServices) {

      return function(scope, elem, attr) {

        $rootScope.$on('$stateChangeSuccess',
          function(event, currentRoute) {
            var cls = 'body-full-height';

            if(LoginServices.isLogged()) {
               attr.$removeClass(cls);
            }
            else{
              attr.$addClass(cls);
            }

        });
      };
    }])



.directive('dcNavLoad', [function () {
  return {
    restrict: 'A',
    link: function (scope, iElement, iAttrs) {

      setTimeout(function(){
        x_navigation_onresize();
      }, 0)

      /* X-NAVIGATION CONTROL FUNCTIONS */
      function x_navigation_onresize(){

          var inner_port = window.innerWidth || $(document).width();

          if(inner_port < 1025){
              $(".page-sidebar .x-navigation").removeClass("x-navigation-minimized");
              $(".page-container").removeClass("page-container-wide");
              $(".page-sidebar .x-navigation li.active").removeClass("active");


              $(".x-navigation-horizontal").each(function(){
                  if(!$(this).hasClass("x-navigation-panel")){
                      $(".x-navigation-horizontal").addClass("x-navigation-h-holder").removeClass("x-navigation-horizontal");
                  }
              });


          }else{
              if($(".page-navigation-toggled").length > 0){
                  xNavigationMinimize("close");
              }

              $(".x-navigation-h-holder").addClass("x-navigation-horizontal").removeClass("x-navigation-h-holder");
          }

      }


      function xNavigationMinimize(action){

          if(action == 'open'){
              $(".page-container").removeClass("page-container-wide");
              $(".page-sidebar .x-navigation").removeClass("x-navigation-minimized");
              $(".x-navigation-minimize").find(".fa").removeClass("fa-indent").addClass("fa-dedent");
              $(".page-sidebar.scroll").mCustomScrollbar("update");
          }

          if(action == 'close'){
              $(".page-container").addClass("page-container-wide");
              $(".page-sidebar .x-navigation").addClass("x-navigation-minimized");
              $(".x-navigation-minimize").find(".fa").removeClass("fa-dedent").addClass("fa-indent");
              $(".page-sidebar.scroll").mCustomScrollbar("disable",true);
          }

          $(".x-navigation li.active").removeClass("active");

      }//xNavigationMinimize function

    }//Link
  };
}])





//SideBar and top nav bar  for showing drop down options ....
.directive('dcNavBar', ['$location', 'pageResize', function ($location, pageResize ) {
    return {
      restrict: 'A',
      link: function (scope, element, attrs) {
        //resizing the page..


         var a = $($(element).find('li > a'));
          $(a).click(function(){

            var li = $(this).parent('li');
            var ul = li.parent("ul");

            ul.find(" > li").not(li).removeClass("active");

        });
        var li = $($(element).find('li'));
        $(li).click(function(event){
          event.stopPropagation();
          var li = $(this);
          if(li.children("ul").length > 0 || li.children(".panel").length > 0 || $(this).hasClass("xn-profile") > 0){
              if(li.hasClass("active")){
                  li.removeClass("active");
                  li.find("li.active").removeClass("active");
              }else
                  li.addClass("active");

                  pageResize.onresize();

              if($(this).hasClass("xn-profile") > 0)
                  return true;
              else
                  return false;
          }  //End of li click event..
      });


      } //End of LINK function...
    };
 }])
