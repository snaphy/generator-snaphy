import loopback from "loopback";
import chalk from "chalk";
import SETTINGS from "../settings/conf";
import {readdirSync, statSync, existsSync} from "fs";
import {kebabCase} from "lodash";
import {join} from "path";


/*global require, module*/

module.exports = function(server) {

  //Contains all the helper methods inside this object..
  const helper = {};


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
    modelName = kebabCase(modelName);
    const modelJsonFile = modelName + '.json';
    //Now get the model path..
    return join(MODEL_PATH, modelJsonFile );
  }

  /**
   *  Retrives the path of the table of admin of file..
   * @param modelName Model Name is the Original Model Name of the model
   */
  function getTablePath(modelName){
    //convert to camel case..
    modelName = kebabCase(modelName);
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
    modelName = kebabCase(modelName);
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
  const getSettingPath = function(pluginName){
    const CONF = "conf.json";
    const DATABASE = "database.json";
    const STATIC = "static.json";

    const confPath = join(SETTING_PATH, pluginName, CONF);
    const databasePath = join(SETTING_PATH, pluginName, DATABASE);
    const staticPath = join(SETTING_PATH, pluginName, STATIC);

    const setting = {};

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
  const getDatabase = function(app, sampleDatabase, pluginName){
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
  const getLoopbackObj = function(){
    return loopback;
  };




  //Add static routes for the database..
  const setStaticRoute = function(app, rootExposure, PluginName, pluginContainerPath){
    //Replace the '/' with ''
    rootExposure = rootExposure.replace(/^\//, "");
    rootExposure = '/' + rootExposure;
    //cache control
    const oneDay = 86400000;
    app.use(rootExposure, loopback.static( join(pluginContainerPath, PluginName.trim(), '/client'), { maxAge: oneDay }));
    console.log("Static Routes " + rootExposure);
  };






  function loadPluginsInMemory(pluginName, pluginContainerPath){
    console.log(
      `
      Loading plugin ${pluginName} in memory
      `
    );

    //Get the settings of the plugin..
    const {adminSetting, confPath, databasePath, staticPath} = getSettingPath(pluginName);
    //if settings has configuration path defined...
    if(confPath){
      const pluginSettings = readPackageJsonFile(confPath);
      if(pluginSettings.activate){
        if(staticPath){
          const pluginStaticFiles = readPackageJsonFile(staticPath);
          try{
            if(pluginStaticFiles.css || pluginStaticFiles.js || pluginStaticFiles.moduleDependencies){
              let rootExposure =  pluginSettings.routeExposure || pluginSettings.name;
              //Now load it static route..
              setStaticRoute(server, rootExposure, pluginSettings.name, pluginContainerPath);
            }
          }catch (err){
            //Do nothing in this case
            console.log(chalk.red(" >> Error: ") + "In exposing plugin " + pluginName + " . Please edit info in package.json for property staticFiles carefully");
          }
        }

        if(databasePath){
          const pluginDatabases = readPackageJsonFile(databasePath);
          //Now add the database..
          const databaseObj = getDatabase(server, pluginDatabases, pluginName);
          const pluginValue = require( join(pluginContainerPath, pluginName.trim()))(server, databaseObj, helper, pluginSettings );

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
    }
  }



  const loadValidationPlugin = function(){
    "use strict";
    console.log(
      `
      Loading models validations
      `
    );

    let models = server.models();
    if(models){
      models.forEach(function(Model) {
        //Now check if the validation file related to the given model is present..
        //if present load the file..
        const modelName = Model.modelName;
        const validationPath = getValidationPath(modelName);
        if(validationPath.js){
          //Now load the file in memory..
          const reqirePath = validationPath.replace(/\.js$/, "");
          //Now require the file..
          require(reqirePath)(Model, server, helper);
        }
      });
    }
  };





  //This function is called on function load.
  //Initialize all the plugins and add it to the memory..
  const initPlugins = function(){
    loadValidationPlugin();
    console.log(
      `
      Loading snaphy plugins
      `
    );

    const pluginContainerPath = PLUGIN_PATH;
    const pluginList = getDirectories(pluginContainerPath);
    for(let i=0; i<pluginList.length; i++){
      loadPluginsInMemory(pluginList[i].trim(), pluginContainerPath);
    }//for loop
  };


  //Require by plugins..
  //Act as a require for plugins..
  const loadPlugin = function(pluginName){
    //Get the settings of the plugin..
    const {confPath, databasePath} = getSettingPath(pluginName);
    //if settings has configuration path defined...
    if(confPath){
      const pluginSettings = readPackageJsonFile(confPath);
      if(pluginSettings.activate){
        let databaseObj = {};
        if(databasePath){
          const pluginDatabases = readPackageJsonFile(databasePath);
          //Now add the database..
          databaseObj = getDatabase(server, pluginDatabases, pluginName);

        }
        return require(getPluginRootDir(pluginName))(server, databaseObj, helper, pluginSettings );
      }
    }

    return null;
  };//loadPlugin



  //ADD ALL THE REQUIRED METHOD TO HELPERS VARIABLE OBJ.

  helper.initPlugins = initPlugins;
  helper.readPackageJsonFile = readPackageJsonFile;
  helper.getDirectories = getDirectories;
  helper.getServerPath = getServerPath;
  helper.loadPlugin = loadPlugin;
  helper.getLoopbackObj = getLoopbackObj;
  helper.getPluginRootDir = getPluginRootDir;
  helper.getModelPath = getModelPath;
  helper.getServerFolder = getServerFolder;
  helper.getSettingPath = getSettingPath;
  helper.getTablePath = getTablePath;
  helper.getValidationPath = getValidationPath;

  return helper;
};
