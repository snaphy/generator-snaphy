'use strict';

angular.module($snaphy.getModuleName())

//Controller for <%= props.pluginName %>Control ..
.controller('<%= props.pluginName %>Control', ['$scope', '$stateParams', 'Database',
    function($scope, $stateParams, Database) {
        //Checking if default templating feature is enabled..
        var defaultTemplate = $snaphy.loadSettings('<%= props.pluginName %>', "defaultTemplate");
        $snaphy.setDefaultTemplate(defaultTemplate);
        //Use Database.getDb(pluginName, PluginDatabaseName) to get the Database Resource.
    }//controller function..
]);