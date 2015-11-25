'use strict';

angular.module('templateAdminApp')


  .directive('snaphyLoadTemplate', [function () {
      return {
        restrict: 'A',
        link: function (scope, iElement, iAttrs) {
          // Initialize app when page loads
          jQuery(function(){ App.init(); });

        }
      };
    }])
