'use strict';

/**
 * @ngdoc function
 * @name templateAdminApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the templateAdminApp
 */
angular.module($snaphy.getModuleName())
  .controller('bodyCtrl', ['$scope', '$window', function($scope, $window){
    $scope.defaultTemplate = $window.$snaphy.template;

  }]); //controller..
