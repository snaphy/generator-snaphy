(function(){
'use strict';
})();
var yeoman = require('yeoman-generator');
var chalk = require('chalk');
var yosay = require('yosay');
var mkdirp = require('mkdirp');
var fs  = require("fs");
var constants = require("./constants");
var helper = require("/helper");

//Returns the app object..
var startServer = function(){
    //starting the server..
    return require(constants.serverPath);
};



//Now creating a constructor..
var init  = function(){
    //Start the server..
    var app = startServer();
    //Now get the description of the models..
    var models = helper.describeModels(app);

};
