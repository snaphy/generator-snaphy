'use strict';

angular.module($snaphy.getModuleName())

//Controller for dashboardControl ..
.controller('dashboardControl', ['$scope', '$stateParams','Database', 
    function($scope, $stateParams, Database) {
        //Set snaphy default template value to true..
        $snaphy.getDefaultTemplate(true);
    }//controller function..
]);