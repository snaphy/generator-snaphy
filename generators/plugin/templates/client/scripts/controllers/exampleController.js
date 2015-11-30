'use strict';

angular.module($snaphy.getModuleName())

//Controller for <%= props.pluginName %>Control ..
.controller('<%= props.pluginName %>Control', ['$scope', '$stateParams', 'Database',
    function($scope, $stateParams, Database) {
        //Controller defined here..
        <% if(props.defaultTemplate){ %>
        	//Set snaphy default template value to true..
        	$snaphy.template = true;
        <% }else{ %> 
        	$snaphy.template = false;
        <% } %>

        //Use Database.getDb(pluginName, PluginDatabaseName) to get the Database Resource.
        
    }//controller function..
]);