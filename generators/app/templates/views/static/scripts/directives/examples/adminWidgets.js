'use strict';

angular.module('templateAdminApp')

  .constant('moment', (typeof global !== 'undefined' ? global : this).moment)


  .directive('dcNotify', [function () {
    return {
      restrict: 'E',
      replace: true,
      transclude : true,

      template: '<li class="xn-icon-button ng-transclude pull-right">  </li>',

      link: function(scope, element, attrs){

        // Finding draggable element..
        var draggableElem = $($(element).find('.xn-panel-dragging'));
        // XN PANEL DRAGGING
        var html_click_avail = true;
        $( draggableElem ).draggable({

            containment: ".page-content", handle: ".panel-heading", scroll: false,
            start: function(event,ui){
                html_click_avail = false;
                $(this).addClass("dragged");
            },
            stop: function( event, ui ) {
                $(this).resizable({
                    maxHeight: 400,
                    maxWidth: 600,
                    minHeight: 200,
                    minWidth: 200,
                    helper: "resizable-helper",
                    start: function( event, ui ) {
                        html_click_avail = false;
                    },
                    stop: function( event, ui ) {
                        $(this).find(".panel-body").height(ui.size.height - 82);
                        $(this).find(".scroll").mCustomScrollbar("update");

                        setTimeout(function(){
                            html_click_avail = true;
                        },1000);

                    }
                })

                setTimeout(function(){
                    html_click_avail = true;
                },1000);
            }
        });


         // END XN PANEL DRAGGING
        var scrollElem = $($(element).find('.panel-body'));
        //Now adding scroabble effects...
        $(scrollElem).addClass("scroll").mCustomScrollbar({scrollInertia:50, autoHideScrollbar: true });

      } //End of Link function..

    };
  }])



  //For disabling the anchor tag
  //http://stackoverflow.com/questions/23425254/enable-disable-anchor-tag-using-angularjs
  .directive('aDisabled', [function() {
    return {
        compile: function(tElement, tAttrs, transclude) {
            //Disable ngClick
            tAttrs["ngClick"] = "!("+tAttrs["aDisabled"]+") && ("+tAttrs["ngClick"]+")";

            //return a link function
            return function (scope, iElement, iAttrs) {

                //Toggle "disabled" to class when aDisabled becomes true
                scope.$watch(iAttrs["aDisabled"], function(newValue) {
                    if (newValue !== undefined) {
                        iElement.toggleClass("disabled", newValue);
                    }
                });

                //Disable href on click
                iElement.on("click", function(e) {
                    if (scope.$eval(iAttrs["aDisabled"])) {
                        e.preventDefault();
                    }
                });
            };
        }
    };
  }])



  //Writing my logout directive here..
  //Using dc prefix for DrugCorner
  .directive('dcLogout', [ function(  ) {

    return {
      restrict: 'E',
      replace: true,
      scope: true,

      template:
        '<li ng-class="\'xn-icon-button pull-right\'">' +
          '<a  ng-href="#" ng-class="\'mb-control cursor\'"  data-box="#mb-signout">' +
             '<span ng-class="\'fa fa-sign-out\'"></span>' +
          '</a>' +
            '<!-- MESSAGE BOX-->' +
            '<div   ng-class="\'message-box animated fadeIn\'" data-sound="alert" id="mb-signout">' +
                '<div ng-class="\'mb-container\'">'+
                    '<div ng-class="\'mb-middle\'">' +
                        '<div ng-class="\'mb-title\'"><span ng-class="\'fa fa-sign-out\'"></span> Log <strong>Out</strong> ?</div>' +
                        '<div ng-class="\'mb-content\'">' +
                            '<p>Are you sure you want to log out?</p>' +
                            '<p>Press No if you want to continue work. Press Yes to logout current user.</p>' +
                        '</div>' +
                        '<div ng-class="\'mb-footer\'">'+
                            '<div ng-class="\'pull-right\'">' +
                                '<a  style="margin-right:5px;" ng-click="logOut()"  class="btn btn-success btn-lg">Yes</a>'+
                                '<button  class="btn btn-default btn-lg mb-control-close">No</button>'+
                             '</div>' +
                        '</div>' +
                    '</div>' +
                '</div>' +
            '</div>' +
            '<!-- END MESSAGE BOX-->' +
        '</li>',


        link: function(scope, element, attrs){
          scope.showMenu=false;

          //Logout from here on clicking yes...
          scope.logOut = function(){

              LoginServices.logout();
          }


          var thisElem = $($(element).children()[0]);
          $(thisElem).on("click",function(){
              var box = $($(this).data("box"));
              if(box.length > 0){
                  box.toggleClass("open");

                  var sound = box.data("sound");

                  if(sound === 'alert')
                      playAudio('alert');

                  if(sound === 'fail')
                      playAudio('fail');

              }
              return false;
          });

          $(".mb-control-close").on("click",function(){
             $(this).parents(".message-box").removeClass("open");
             return false;
          });
          /* END MESSAGE BOX */

      }//End of link function..
    }; //End of return

  }])




  //Directive to be placed on the toggle button ul element to make the siidebar toggle..
  .directive('dcToggle', ['$location', 'pageResize', function ($location, pageResize ) {
    return {
      restrict: 'E',
      replace:true,
      template:
        '<li  class="xn-icon-button">' +
        '<a dc-prevent-default  href="#" class="x-navigation-minimize"><span class="fa fa-dedent"></span></a>' +
        '</li>' ,


      link: function (scope, element, attrs) {

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
                //Disable the scroll of sidebar
                $(".page-sidebar.scroll").mCustomScrollbar("disable",true);
                //But enable the scroll of the notification bar..
                $(".scroll").mCustomScrollbar("update");
            }

            $(".x-navigation li.active").removeClass("active");


        }

        $(".x-navigation-control").click(function(){
            $(this).parents(".x-navigation").toggleClass("x-navigation-open");

            //Now resizing the page..
            pageResize.onresize();

            return false;
        });

        if($(".page-navigation-toggled").length > 0){
            xNavigationMinimize("close");
        }

        $(".x-navigation-minimize").click(function(){

            if($(".page-sidebar .x-navigation").hasClass("x-navigation-minimized")){
                $(".page-container").removeClass("page-navigation-toggled");
                xNavigationMinimize("open");
            }else{
                $(".page-container").addClass("page-navigation-toggled");
                xNavigationMinimize("close");
            }

            pageResize.onresize();

            return false;
        });

      } //End of Link button
    };
  }])






  .directive('dcPreventDefault', [function () {
      return {
        restrict: 'A',
        link: function (scope, element, attrs) {
          $(element).on("click", function (event){
              event.preventDefault();
          });
        }
      };
    }])




  .directive('dcKnob', [function () {
      return {
        restrict: 'E',
        template: '<input class="knob" />',
        replace: true,
        link: function (scope, iElement, iAttrs) {
          //Initilizing the knob..
          if($(".knob").length > 0){
                  $(".knob").knob();
              }
        }
      };
    }])




  .directive('dcDatepicker', [function () {
      var date = new Date();
      date.setMonth(date.getMonth() + 1);
      var year = date.getFullYear();
      var month = date.getMonth() + 1;
      var days = date.getDate();
      return {
        restrict: 'E',

        template: '<input type="text"  value="' +year+ '-'+ month+'-'+days+ '" >',
        replace: true,
        link: function (scope, iElement, iAttrs) {
            $(iElement).datepicker({
              format: 'yyyy-mm-dd',
              orientation:"right",
              autoclose:true
            });

        }//End of link function
      };
    }])



  /*Timepicker showing only time in AM and PM for 24 hour timepicker use another timepicker*/
  //For default time use "defaultTime" attr
  .directive('dcTimepicker', [function () {
      return {
        restrict: 'E',
        scope:{
          initTime: "@initTime",
          model: "=model"
        },
        template: '<div class="input-group bootstrap-timepicker ">' +
                    '<input type="text" ng-model="model" class="form-control timepicker"/>'+
                      '<span class="input-group-addon"><span class="glyphicon glyphicon-time"></span></span>'+
                  '</div>',
        replace: true,
        link: function (scope, iElement, iAttrs) {
            var defaultTime = scope.initTime;
            var inputElement = $(iElement).find('input');
            if(defaultTime){
              // Default timepicker
              $(inputElement).timepicker({
                defaultTime: defaultTime
              });
            }else{
              // Default timepicker
              $(inputElement).timepicker({
                defaultTime: "10:30 AM"
              });
            }

        }//End of link function
      };
    }])



  .directive('dcCheckbox', [function () {
      return {
        restrict: 'E',
        replace:true,
        template: '<input type="checkbox" />',
        link: function (scope, iElement, iAttrs) {
          if($(iElement).length > 0){
            $(iElement).iCheck({checkboxClass: 'icheckbox_minimal-grey',radioClass: 'iradio_minimal-grey'});
          }


        }
      };
    }])




  .directive('dcRadio', [function () {
      return {
        restrict: 'E',
        replace: true,
        template: '<input type="radio" class="iradio" />',
        link: function (scope, iElement, iAttrs) {
          $(".iradio").iCheck({checkboxClass: 'icheckbox_minimal-grey',radioClass: 'iradio_minimal-grey'});
        }
      };
    }])



  .directive('dcTagInput', [function(){
      return{
        restrict: 'E',
        replace: true,
        template: '<input type="text"/>',
        link: function(scope, iElement, iAttrs){

              if($(iElement).length > 0){

                  $(iElement).each(function(){

                      if($(this).data("placeholder") != ''){
                          var dt = $(this).data("placeholder");
                      }else
                          var dt = 'add a tag';

                      $(this).tagsInput({width: '100%',height:'auto',defaultText: dt});
                  });

              } //END IF..

          //Call the function..

        } //END OF LINK FUNCTION..
      };// END OF RETURN DIRECTIVE..
    }]) //dcTagInput directive...





  .directive('dcDaterangepicker', [function () {
      return {
        restrict: 'E',
        scope:{
          //For setting the dropdown feature ... value 'up' and 'down'
          drops: '@dcDrops'
        },
        replace: true,
        template: '<div class="pull-left" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc"> '+
                  ' <i class="glyphicon glyphicon-calendar fa fa-calendar"></i> ' +
                  ' <span></span> <b class="caret"></b>' +
                  '</div>',

        link: function (scope, iElement, iAttrs) {
          //Settings..
          //Setting few variable.. by default it opens up..
          var drops = scope.drops? scope.drops : 'up' ;

          $(function() {
              var spanElem = $(iElement).find('span')[0];

              $(spanElem).html(moment().subtract(29, 'days').format('MMMM D, YYYY') + ' - ' + moment().format('MMMM D, YYYY'));
              $(iElement).daterangepicker({
                  format: 'MM/DD/YYYY',
                  startDate: moment().subtract(29, 'days'),
                  endDate: moment(),
                  minDate: '01/01/2012',
                  maxDate: '12/31/2015',
                  dateLimit: { days: 60 },
                  showDropdowns: true,
                  showWeekNumbers: true,
                  timePicker: false,
                  timePickerIncrement: 1,
                  timePicker12Hour: true,
                  ranges: {
                     'Today': [moment(), moment()],
                     'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                     'Last 7 Days': [moment().subtract(6, 'days'), moment()],
                     'Last 30 Days': [moment().subtract(29, 'days'), moment()],
                     'This Month': [moment().startOf('month'), moment().endOf('month')],
                     'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                  },
                  opens: 'left',
                  //Setting the up or down dropdown feature...
                  drops: drops,
                  buttonClasses: ['btn', 'btn-sm'],
                  applyClass: 'btn-primary',
                  cancelClass: 'btn-default',
                  separator: ' to ',
                  locale: {
                      applyLabel: 'Submit',
                      cancelLabel: 'Cancel',
                      fromLabel: 'From',
                      toLabel: 'To',
                      customRangeLabel: 'Custom',
                      daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr','Sa'],
                      monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
                      firstDay: 1
                  }
              }, function(start, end, label) {
                  //console.log(start.toISOString(), end.toISOString(), label);
                  $(spanElem).html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
              });

          });//End of function
        }//End of link function
      };
    }])



  //Directive for sliders..
  .directive('dcSlider', [function () {
      return {
        restrict: 'E',
        template: '<div ></div>',
        replace: true,


        scope: {
              step  : "=dcStep"
        },


        link: function (scope, iElement, iAttrs) {

          // setting the default values...
          var step = scope.step ? scope.step : 50;

          //Initializing the sliders......
          //Default Slider with start value
          if($(".defaultSlider").length > 0){
              $(".defaultSlider").each(function(){
                  var rsMin = $(this).data("min");
                  var rsMax = $(this).data("max");

                  //Set range default value...
                  //scope.dcRangeMin
                  //scope.dcRangeMax
                  $(this).rangeSlider({
                      bounds: {min: 0, max: rsMax},
                      defaultValues: {min: rsMin, max: 100}
                  });
              });
          }//End Default

          //Date range slider
          if($(".dateSlider").length > 0){
              var date = new Date()
              var maxDate = new Date();
              maxDate.setMonth(date.getMonth() + 3);
              var defaultMaxMonth = new Date();
              defaultMaxMonth.setMonth(date.getMonth() + 1);
              $(".dateSlider").each(function(){
                  var slider = $(this).dateRangeSlider({
                      bounds: {min: date, max: maxDate},
                      defaultValues:{min: date, max: defaultMaxMonth}
                  });
              });
          }//End date range slider

          //Range slider with predefinde range
          if($(".rangeSlider").length > 0){
              $(".rangeSlider").each(function(){
                  var rsMin = $(this).data("min");
                  var rsMax = $(this).data("max");

                  $(this).rangeSlider({
                      bounds: {min: 0, max: 200},
                      range: {min: 20, max: 40},
                      defaultValues: {min: rsMin, max: rsMax}
                  });
              });
          }//End

          //Range Slider with custom step
          if($(".stepSlider").length > 0){

              $(".stepSlider").each(function(){
                  var rsMin = $(this).data("min");
                  var rsMax = $(this).data("max");


                  $(this).rangeSlider({
                      bounds: {min: 0, max: rsMax},
                      defaultValues: {min: rsMin, max: rsMax},
                      step: step
                  });
              });
          }//End

        }//End of Link function...
      };
    }])






  .directive('dcDatatable', [function () {
      return {
        restrict: 'A',
        link: function (scope, iElement, iAttrs) {

           //Modifying the table search....
            if($(".datatable").length > 0){
                $(".datatable").dataTable();
                $(".datatable").on('page.dt',function () {
                    onresize(100);
                });
            }

            if($(".datatable_simple").length > 0){
                $(".datatable_simple").dataTable({"ordering": false, "info": false, "lengthChange": false,"searching": false});
                $(".datatable_simple").on('page.dt',function () {
                    onresize(100);
                });
            }


        } //End of link function..
      }; //End of return
    }])




  //Directive for panel..
  .directive('dcPanel', [function () {
      return {
        restrict: 'E',
        transclude: true,
        template: '<div ng-transclude class="panel panel-default"></div>',
        replace: true,
        link: function (scope, iElement, iAttrs) {

          $(".panel-fullscreen").on("click",function(){
              panel_fullscreen($(this).parents(".panel"));
              return false;
          });

          $(".panel-collapse").on("click",function(){
              panel_collapse($(this).parents(".panel"));
              $(this).parents(".dropdown").removeClass("open");
              return false;
          });
          $(".panel-remove").on("click",function(){
              panel_remove($(this).parents(".panel"));
              $(this).parents(".dropdown").removeClass("open");
              return false;
          });
          $(".panel-refresh").on("click",function(){
              var panel = $(this).parents(".panel");
              panel_refresh(panel);

              setTimeout(function(){
                  panel_refresh(panel);
              },3000);

              $(this).parents(".dropdown").removeClass("open");
              return false;
          });


        }//End of link function...
      };
    }])
