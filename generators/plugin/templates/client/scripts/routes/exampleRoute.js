'use strict';
/*jslint browser: true*/
/*global $, jQuery, $snaphy, angular*/
angular.module($snaphy.getModuleName())
  //Routes are defined using ui.routes 
  .config(['$locationProvider', '$stateProvider', '$urlRouterProvider',
    function ($locationProvider, $stateProvider, $urlRouterProvider) {
      $locationProvider.html5Mode(false);
      //$urlRouterProvider.otherwise('/');

      $stateProvider
        //Provide routes in this way..
        .state('<%= props.pluginName %>', {
          url: '/<%= props.pluginName %>',
          templateUrl: '<%= props.routeExposure %>/views/example.html',
          controller: '<%= props.pluginName %>Control'
        });

    }]); //config
