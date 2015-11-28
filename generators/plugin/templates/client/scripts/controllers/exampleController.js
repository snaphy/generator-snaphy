'use strict';

angular.module($snaphy.getModuleName())

//Controller for <%= props.pluginName %>Control ..
.controller('<%= props.pluginName %>Control', ['$scope', '$stateParams',
    function($scope, $stateParams) {
        //Controller defined here..
        <% if(props.defaultTemplate){ %>
        	//Set snaphy default template value to true..
        	$snaphy.template = true;
        <% }else{ %> 
        	$snaphy.template = false;
        <% } %>

    }//controller function..
]);