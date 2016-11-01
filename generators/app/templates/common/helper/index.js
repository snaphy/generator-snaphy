(function(){
    'use strict';
})();

/*global require, module*/

module.exports = function(server) {
  import loopback from "loopback";
  import chalk from "chalk";
  import SETTINGS from "../settings/conf";
  import {readdirSync, statSync, existsSync} from "fs";
  import {snakeCase} from "lodash";
  import {join} from "path";


  /**
   * Contains all settings adn basic configuration of file..
   * @type {{MAIN_PLUGIN_FOLDER, DESCRIPTION, ANGULAR_MODULE, SERVER_PATH, SERVER_FOLDER, MODEL_PATH}}
     */
  const {
    PLUGIN_PATH,
    SERVER_PATH,
    SERVER_FOLDER,
    MODEL_PATH,
    VALIDATION_PATH,
    TABLE_PATH,
    SETTING_PATH
  } = SETTINGS(server);


  /**
    * Method for getting all the directores
    * @param  {string} srcpath parent directory within which search is to be performed
    * @return {array}           [Array of directories names retrived]
    */
   function getDirectories(srcpath) {
    return readdirSync(srcpath).filter(function(file) {
      return statSync(join(srcpath, file)).isDirectory();
    });
  }




  /**
   * For getting the absolute plugin root path of a plugin.
   * @param pluginName
   * @returns {string}
   */
  function getPluginRootDir(pluginName){
      return join(PLUGIN_PATH, pluginName.trim());
  }



  /**
   * Retrives the path of the model.json file..
    * @param modelName Model Name is the Original Model Name of the model
   */
  function getModelPath(modelName){
      //convert to camel case..
      modelName = snakeCase(modelName);
      var modelJsonFile = modelName + '.json';
      //Now get the model path..
      return join(MODEL_PATH, modelJsonFile );
  }

  /**
   *  Retrives the path of the table of admin of file..
   * @param modelName Model Name is the Original Model Name of the model
   */
  function getTablePath(modelName){
    //convert to camel case..
    modelName = snakeCase(modelName);
    const modelJsonFile = modelName + '.json';
    //Now get the model path..
    const tablePath = join(TABLE_PATH, modelJsonFile );

    const tableObj = {};
    if(existsSync(tablePath)){
      tableObj.json = tablePath
    }

    return tableObj;

  }


  /**
   * Get Model Validation Path...
   * @param modelName
   * @returns {{json, js}} json file and js file path
     */
  function getValidationPath(modelName){
    //convert to camel case..
    const modelName = snakeCase(modelName);
    const modelJSONPath = modelName + ".json";
    const modelJSPath = modelName + ".js";
    const validation = {};
    const jsonPath = join(VALIDATION_PATH, modelJSONPath);
    const jsPath = join(VALIDATION_PATH, modelJSPath);

    if(existsSync(jsonPath)){
      validation.json = jsonPath
    }

    if(existsSync(jsPath)){
      validation.js = jsPath;
    }

    return validation;
  }


  /**
   * Get the plugins settings file path..
   *
   */
  const getSettingPath = function(modelName){
    //convert to camel case..
    const modelName = snakeCase(modelName);
    const ADMIN_SETTING = "admin-setting.js";
    const CONF = "conf.json";
    const DATABASE = "database.json";
    const STATIC = "static.json";

    const adminPath = join(SETTING_PATH, modelName, ADMIN_SETTING);
    const confPath = join(SETTING_PATH, modelName, CONF);
    const databasePath = join(SETTING_PATH, modelName, DATABASE);
    const staticPath = join(SETTING_PATH, modelName, STATIC);

    const setting = {};
    if(existsSync(adminPath)){
      setting.adminSetting = adminPath;
    }

    if(existsSync(confPath)){
      setting.confPath = confPath;
    }

    if(existsSync(databasePath)){
      setting.databasePath = databasePath;
    }

    if(existsSync(staticPath)){
      setting.staticPath = staticPath;
    }

    return setting;
  };


  /**
   * [method for reading package file]
   * @param  {string} pluginPath Path of the plugin inside plugin folder
   * @return {object}           returns the object of file package.json
   */
  function readPackageJsonFile(pluginPath){
    return require(pluginPath);
  }

  //Return the path of the main server file
  function getServerPath(){
    return SERVER_PATH;
  }


  function getServerFolder(){
      return SERVER_FOLDER;
  }


  /**
   * Find the database from the model-config.json and return the database with it datasource attached.
   * @param app Application object of loopback.
   * @param sampleDatabase Database object which needs to be searched
   * @param pluginName Database object with datasource attached.
   * @returns {{}}
   */
  var getDatabase = function(app, sampleDatabase, pluginName){
    //var modelConfig = require('../../server/model-config.json');
    var requiredDatabase = {};
    var key;
    for ( key in sampleDatabase) {
      if (sampleDatabase.hasOwnProperty(key)) {
        //Now find the database in model-config with given key.
        var databaseVal = sampleDatabase[key];
        if(databaseVal){
          requiredDatabase[key] = app.models[databaseVal];
          //var modelProp = modelConfig[databaseVal];
        }else{
          throw 'Please provide a value to the '+ key + ' model property. in Plugin ' + pluginName.trim() + ' model';
        }

      }//if
    }//for
    return requiredDatabase;
  };



  /**
   * Method to getting the loopback object..
   */
  var getLoopbackObj = function(){
    return loopback;
  };




  //Add static routes for the database..
  var setStaticRoute = function(app, rootExposure, PluginName, pluginContainerPath){
    //Replace the '/' with ''
    rootExposure = rootExposure.replace(/^\//, "");
    rootExposure = '/' + rootExposure;
    //cache control
    var oneDay = 86400000;
    app.use(rootExposure, loopback.static( join(pluginContainerPath, PluginName.trim(), '/client'), { maxAge: oneDay }));
    console.log("Static Routes " + rootExposure);
  };



  function loadPluginsInMemory(pluginName, pluginContainerPath){
    console.log("Loading plugin " + pluginName + " in memory");
    //Now read the package  files...
    var pluginPath = join(pluginContainerPath, pluginName.trim(), '/package.json');
    console.log(pluginPath);
    var packageObj = readPackageJsonFile(pluginPath);
    if( packageObj.activate ){
      try{
        if(packageObj.staticFiles.css || packageObj.staticFiles.js || packageObj.moduleDependencies){
          var rootExposure =  packageObj.routeExposure || packageObj.name;
          //Now load it static route..
          setStaticRoute(server, rootExposure, packageObj.name, pluginContainerPath);
        }
      }catch (err){
        //Do nothing in this case
        console.log(chalk.red(" >> Error: ") + "In exposing plugin " + pluginName + " . Please edit info in package.json for property staticFiles carefully");
      }


      var databaseObj = getDatabase(server, packageObj.databases , pluginName);
      var pluginValue = require( join(pluginContainerPath, pluginName.trim()))(server, databaseObj, helper, packageObj );

      if(pluginValue){
        //Now load the corresponding plugins to the memory...
        /*try{
          server.plugins[packageObj.name] = pluginValue;
        }catch (err){
          //TODO Check why error occurs here in this case..
          console.error(chalk.red(">> Error: ") + "Error occured while adding plugin value to server variable.");
        }*/

        if(pluginValue.init){
          //TODO check whether to show warning when init variable is not present inside the plugins.
          //Now initialize the plugins..
          pluginValue.init();
        }
      }//if pluginValue
    }
  }





  //This function is called on function load.
  //Initialize all the plugins and add it to the memory..
  var initPlugins = function(){
    console.log("Loading this plugin");
    var pluginContainerPath = PLUGIN_PATH;
    var pluginList = getDirectories(pluginContainerPath);
    var i;
    for(i=0; i<pluginList.length; i++){
      loadPluginsInMemory(pluginList[i].trim(), pluginContainerPath);
    }//for loop
  };


  //Require by plugins..
  //Act as a require for plugins..
  var loadPlugin = function(pluginName){
    var pluginValue = {};
    var pluginPath = join(PLUGIN_PATH, pluginName.trim() , '/package.json');
    var packageObj = readPackageJsonFile(pluginPath);
    if( packageObj.activate ){
      var databaseObj = getDatabase(server, packageObj.databases , pluginName);
      pluginValue = require(join(PLUGIN_PATH, pluginName.trim()) )(server, databaseObj, helper, packageObj );
    }
    return pluginValue;
  };//loadPlugin



  //ADD ALL THE REQUIRED METHOD TO HELPERS VARIABLE OBJ.
  const helper =  {
    initPlugins: initPlugins,
    readPackageJsonFile: readPackageJsonFile,
    getDirectories: getDirectories,
    getServerPath: getServerPath,
    loadPlugin: loadPlugin,
    getLoopbackObj: getLoopbackObj,
    getPluginRootDir: getPluginRootDir,
    getModelPath: getModelPath,
    getServerFolder: getServerFolder,
    getSettingPath: getSettingPath,
    getTablePath: getTablePath,
    getValidationPath: getValidationPath
  };

  return helper;
};
