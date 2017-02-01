
(function(){
'use strict';
})();
var yeoman = require('yeoman-generator');
var chalk = require('chalk');
var yosay = require('yosay');
var mkdirp = require('mkdirp');
var fs  = require("fs");
var constants = require("./constants");
var dbMethods = require("./databaseUtilMethods")();
var helper = require("./helper");
var ejs = require('ejs');
var path = require('path');
var rimraf = require('rimraf');

//Returns the app object..
var startServer = function(){
    //starting the server..
    return require(path.resolve(constants.serverPath) );
};


//Generate Repository Class file in java..
var generateRepository = function(app, modelsRestDefinition){
    //Now compile the ejs template..
    var ModelTemplatePath      = path.join(__dirname, constants.javaTemplates, "ModelTemplate.ejs");
    var RepositoryTemplatePath      = path.join(__dirname, constants.javaTemplates, "RepositoryTemplate.ejs");
    var AndroidModelPath       = path.join(__dirname, constants.androidMainPath, "models");
    var AndroidRepositoryPath  = path.join(__dirname, constants.androidMainPath, "repository");

    //Clean Repository folder and rebuild..
    rimraf.sync(AndroidRepositoryPath);
    mkdirp.sync(AndroidRepositoryPath);

    //Loop through def..
    for(var modelName in modelsRestDefinition){
        if(modelsRestDefinition.hasOwnProperty(modelName)){
            //TODO THIS LATER FOR EXCLUDING USER REPO FROM LIST
            if(modelName !== "User"){
                var modelObj = app.models[modelName];
                var modelProperties = modelObj.definition.rawProperties;

                var model = {
                    name : modelName,
                    restDefinition: modelsRestDefinition[modelName],
                    properties: modelProperties,
                    base: modelObj.definition.settings.base,
                    relations: modelObj.definition.settings.relations,
                    allModels: app.models,
                    allDef: modelsRestDefinition
                };
                //Now compiler ejs and write..
                compileAndWrite(model, RepositoryTemplatePath, AndroidRepositoryPath, helper.capitalizeFirstLetter(modelName) + "Repository.java");
            }
        }
    }
};


/*Generate Database for all models..*/
var generateDbModel = function(app, modelsRestDefinition){
  //Now compile the ejs template..
  var ModelDBTemplatePath      = path.join(__dirname, constants.javaTemplates, "db", "CustomDb.ejs");
  var AndroidModelPath       = path.join(__dirname, constants.androidMainPath, "db");
  //Clean model folder and add new dir.
  rimraf.sync(AndroidModelPath);
  mkdirp.sync(AndroidModelPath);
  
  for(var modelName in app.models){
    if(app.models.hasOwnProperty(modelName)){
      var modelObj = app.models[modelName];
      var modelProperties = modelObj.definition.rawProperties;
      //TODO: THIS LATER FOR EXCLUDING USER FROM LIST
      if(modelsRestDefinition[modelName] !== undefined && modelName !== "User"){
        var model = {
          name : modelName,
          properties: modelProperties,
          base: modelObj.definition.settings.base,
          relations: modelObj.definition.settings.relations,
          allModels: app.models,
          restDefinition: modelsRestDefinition,
          methods: dbMethods.methods
        };
        //console.log(modelsRestDefinition);

        compileAndWrite(model, ModelDBTemplatePath, AndroidModelPath, helper.capitalizeFirstLetter(modelName) +"Db.java");
      }
    }
  }

};


//Generate models class file in java..
var generateModels = function(app, modelsRestDefinition){
    //Now compile the ejs template..
    var ModelTemplatePath      = path.join(__dirname, constants.javaTemplates, "ModelTemplate.ejs");
    var AndroidModelPath       = path.join(__dirname, constants.androidMainPath, "models");
    var AndroidRepositoryPath  = path.join(__dirname, constants.androidMainPath, "repository");

    //Clean model folder and add new dir.
    rimraf.sync(AndroidModelPath);
    mkdirp.sync(AndroidModelPath);


    for(var modelName in app.models){
        if(app.models.hasOwnProperty(modelName)){
            var modelObj = app.models[modelName];
            var modelProperties = modelObj.definition.rawProperties;
            //Print all the model def
            /*fs.writeFileSync(
                "/home/robins/models/" + modelName +".js" ,
                JSON.stringify( modelObj.definition),
                'utf8'
            );*/
            //TODO THIS LATER FOR EXCLUDING USER FROM LIST
            if(modelsRestDefinition[modelName] !== undefined && modelName !== "User"){
                var model = {
                    name : modelName,
                    properties: modelProperties,
                    base: modelObj.definition.settings.base,
                    relations: modelObj.definition.settings.relations,
                    allModels: app.models,
                    restDefinition: modelsRestDefinition
                };
                //console.log(modelsRestDefinition);

                compileAndWrite(model, ModelTemplatePath, AndroidModelPath, helper.capitalizeFirstLetter(modelName) +".java");
            }
        }
    }
};



var generateDataList = function(app, modelsRestDefinition){
    //Compile the EJS template..
    var ListTemplatePath        = path.join(__dirname, constants.javaTemplates, "DataListTemplate.ejs");
    var ListenTemplatePath      = path.join(__dirname, constants.javaTemplates, "ListenTemplate.ejs");
    var UtilTemplatePath      = path.join(__dirname, constants.javaTemplates, "Util.ejs");
    //List path for adding list and subscribers..
    var AndroidListPath       = path.join(__dirname, constants.androidMainPath, "list");
    //Clean model folder and add new dir.
    rimraf.sync(AndroidListPath);
    mkdirp.sync(AndroidListPath);
    //Now write DataList.java to the file..
    compileAndWrite({}, ListTemplatePath, AndroidListPath, helper.capitalizeFirstLetter("DataList") +".java");
    //Add the listen template..
    compileAndWrite({}, ListenTemplatePath, AndroidListPath, helper.capitalizeFirstLetter("Listen") +".java");
    compileAndWrite({}, UtilTemplatePath, AndroidListPath, helper.capitalizeFirstLetter("Util") +".java");

};





var generateCustomCallbacks = function(app, modelsRestDefinition){
    //Compile the EJS template..
    var DataListCallback             = path.join(__dirname, constants.javaTemplates, "callbacks", "DataListCallback.ejs");
    var DataListCallbackInterface    = path.join(__dirname, constants.javaTemplates, "callbacks", "DataListCallbackInterface.ejs");

    var ObjectCallback               = path.join(__dirname, constants.javaTemplates, "callbacks", "ObjectCallback.ejs");
    var ObjectCallbackInterface      = path.join(__dirname, constants.javaTemplates, "callbacks", "ObjectCallbackInterface.ejs");

    var VoidCallback               = path.join(__dirname, constants.javaTemplates, "callbacks", "VoidCallback.ejs");
    var VoidCallbackInterface      = path.join(__dirname, constants.javaTemplates, "callbacks", "VoidCallbackInterface.ejs");

    //List path for adding list and subscribers..
    var AndroidListPath       = path.join(__dirname, constants.androidMainPath, "callbacks");
    //Clean model folder and add new dir.
    rimraf.sync(AndroidListPath);
    mkdirp.sync(AndroidListPath);

    //Now write DataListCallback.java to the file..
    compileAndWrite({}, DataListCallback, AndroidListPath, helper.capitalizeFirstLetter("DataListCallback") +".java");
    //Add the listen template..
    compileAndWrite({}, DataListCallbackInterface, AndroidListPath, helper.capitalizeFirstLetter("DataListCallbackInterface") +".java");

    //Now write DataListCallback.java to the file..
    compileAndWrite({}, ObjectCallback, AndroidListPath, helper.capitalizeFirstLetter("ObjectCallback") +".java");
    //Add the listen template..
    compileAndWrite({}, ObjectCallbackInterface, AndroidListPath, helper.capitalizeFirstLetter("ObjectCallbackInterface") +".java");

    //Now write DataListCallback.java to the file..
    compileAndWrite({}, VoidCallback, AndroidListPath, helper.capitalizeFirstLetter("VoidCallback") +".java");
    //Add the listen template..
    compileAndWrite({}, VoidCallbackInterface, AndroidListPath, helper.capitalizeFirstLetter("VoidCallbackInterface") +".java");


};





/*Generate the preenter file.*/
var generatePresenter = function(app, modelsRestDefinition){
    //Compile the EJS template..
    var PresenterTemplatePath = path.join(__dirname, constants.javaTemplates, "presenter", "Presenter.ejs");
    //List path for adding list and subscribers..
    var AndroidBaseModelPath       = path.join(__dirname, constants.androidMainPath, "presenter");
    //Create folder if not present..
    mkdirp.sync(AndroidBaseModelPath);
    //Now write Model.java to the file..
    compileAndWrite({}, PresenterTemplatePath, AndroidBaseModelPath, helper.capitalizeFirstLetter("Presenter") +".java");
};



/**
 * Add the database file for adding sqlite local storage of android device..
 * @param app
 * @param modelsRestDefinition
 */
var generateDatabase = function(app, modelsRestDefinition){
    //Compile the EJS template..
    var PresenterTemplatePath = path.join(__dirname, constants.javaTemplates, "db", "DbHandler.ejs");
    //List path for adding list and subscribers..
    var AndroidBaseModelPath = path.join(__dirname, constants.androidMainPath, "db");
    //Create folder if not present..
    mkdirp.sync(AndroidBaseModelPath);
    //Now write Model.java to the file..
    compileAndWrite({}, PresenterTemplatePath, AndroidBaseModelPath, helper.capitalizeFirstLetter("DbHandler") +".java");
};



var generateImagePresenter = function(app, modelsRestDefinition){
    //Compile the EJS template..
    var CustomFileRepository = path.join(__dirname, constants.javaTemplates, "repository", "CustomFileRepository.ejs");
    //List path for adding list and subscribers..
    var repository       = path.join(__dirname, constants.androidMainPath, "repository");
    //Create folder if not present..
    mkdirp.sync(repository);
    //Now write Model.java to the file..
    compileAndWrite({}, CustomFileRepository, repository, helper.capitalizeFirstLetter("CustomFileRepository") +".java");

    /*CustomContainerRepository*/
    //Compile the EJS template..
    var CustomContainerRepository = path.join(__dirname, constants.javaTemplates, "repository", "CustomContainerRepository.ejs");
    //List path for adding list and subscribers..
    var repository       = path.join(__dirname, constants.androidMainPath, "repository");
    //Create folder if not present..
    mkdirp.sync(repository);
    //Now write Model.java to the file..
    compileAndWrite({}, CustomContainerRepository, repository, helper.capitalizeFirstLetter("CustomContainerRepository") +".java");



    //Compile the EJS template..
    var ImageModelRepository = path.join(__dirname, constants.javaTemplates, "repository", "ImageModelRepository.ejs");
    //Now write Model.java to the file..
    compileAndWrite({}, ImageModelRepository, repository, helper.capitalizeFirstLetter("ImageModelRepository") +".java");

    //Compile the EJS template..
    var CustomContainer = path.join(__dirname, constants.javaTemplates, "models", "CustomContainer.ejs");
    //List path for adding list and subscribers..
    var models       = path.join(__dirname, constants.androidMainPath, "models");
    //Create folder if not present..
    mkdirp.sync(models);
    //Now write Model.java to the file..
    compileAndWrite({}, CustomContainer, models, helper.capitalizeFirstLetter("CustomContainer") +".java");

    //Compile the EJS template..
    var ImageModel = path.join(__dirname, constants.javaTemplates, "models", "ImageModel.ejs");
    //Now write Model.java to the file..
    compileAndWrite({}, ImageModel, models, helper.capitalizeFirstLetter("ImageModel") +".java");


    //Compile the EJS template..
    var JsonArrayParser = path.join(__dirname, constants.javaTemplates, "callbacks", "JsonArrayParser.ejs");
    //List path for adding list and subscribers..
    var callbacks       = path.join(__dirname, constants.androidMainPath, "callbacks");
    //Create folder if not present..
    mkdirp.sync(callbacks);
    //Now write Model.java to the file..
    compileAndWrite({}, JsonArrayParser, callbacks, helper.capitalizeFirstLetter("JsonArrayParser") +".java");

    //Compile the EJS template..
    var JsonObjectParser = path.join(__dirname, constants.javaTemplates, "callbacks", "JsonObjectParser.ejs");
    //Now write Model.java to the file..
    compileAndWrite({}, JsonObjectParser, callbacks, helper.capitalizeFirstLetter("JsonObjectParser") +".java");
}


//Custom Base Model.java and User.java
var generateCustomModel = function(app, modelsRestDefinition){
    //Compile the EJS template..
    var BaseModelTemplatePath = path.join(__dirname, constants.javaTemplates, "predefinedModels", "BaseModelTemplate.ejs");
    //List path for adding list and subscribers..
    var AndroidBaseModelPath       = path.join(__dirname, constants.androidMainPath, "models");
    //Create folder if not present..
    mkdirp.sync(AndroidBaseModelPath);
    //Now write Model.java to the file..
    compileAndWrite({}, BaseModelTemplatePath, AndroidBaseModelPath, helper.capitalizeFirstLetter("Model") +".java");

    //Compile the EJS template..
    var BaseUserModelTemplatePath = path.join(__dirname, constants.javaTemplates, "predefinedModels", "BaseUserTemplate.ejs");
    //List path for adding list and subscribers..
    var AndroidBaseModelPath       = path.join(__dirname, constants.androidMainPath, "models");
    //Create folder if not present..
    mkdirp.sync(AndroidBaseModelPath);
    //Now write Model.java to the file..
    compileAndWrite({}, BaseUserModelTemplatePath, AndroidBaseModelPath, helper.capitalizeFirstLetter("User") +".java");

    //Compile the EJS template..
    var BaseModelRepoTemplatePath = path.join(__dirname, constants.javaTemplates, "predefinedModels", "BaseModelRepository.ejs");
    //List path for adding list and subscribers..
    var AndroidBaseModelPath       = path.join(__dirname, constants.androidMainPath, "repository");
    //Create folder if not present..
    mkdirp.sync(AndroidBaseModelPath);
    //Now write Model.java to the file..
    compileAndWrite({}, BaseModelRepoTemplatePath, AndroidBaseModelPath, helper.capitalizeFirstLetter("ModelRepository") +".java");

    //Compile the EJS template..
    var UserRepoTemplatePath = path.join(__dirname, constants.javaTemplates, "predefinedModels", "UserRepository.ejs");
    //List path for adding list and subscribers..
    var AndroidBaseModelPath       = path.join(__dirname, constants.androidMainPath, "repository");
    //Create folder if not present..
    mkdirp.sync(AndroidBaseModelPath);
    //Now write Model.java to the file..
    compileAndWrite({}, UserRepoTemplatePath, AndroidBaseModelPath, helper.capitalizeFirstLetter("UserRepository") +".java");
};



//Compile the EJS templates and write to destination..
var compileAndWrite = function(model, templatePath, destinationFolder, fileName){
    //Now compile each models and start writing it to the models directory..
    //First read the template file
    var modelTemplate = fs.readFileSync(
       templatePath,
       { encoding: 'utf-8' }
    );

    var formattedModel = ejs.render(modelTemplate, {model: model});
    console.log(chalk.blue("\nCompiling Model Class -> " + fileName));
    //Now writing it to file and saving to model folder..
    writeFile(path.join(destinationFolder, fileName), formattedModel);


};

//Write file synronously..
var writeFile = function(filePath, data){
    fs.writeFileSync(filePath, data, 'utf8'
    );
}



//Now creating a constructor..
var init  = function(){
    //Start the server..
    var app = startServer();
    //Now get the description of the models..
    var modelsRestDefinition = helper.describeModels(app);
    //Now generate the models..
    generateModels(app, modelsRestDefinition);
    generateRepository(app, modelsRestDefinition);
    generateDbModel(app, modelsRestDefinition);
    generateDataList(app, modelsRestDefinition);
    //Creating custom loopback models base java class..Model.java
    generateCustomModel(app, modelsRestDefinition);
    //Generate Custom Callbacks
    generateCustomCallbacks(app, modelsRestDefinition);
    //Generate Presenter..
    generatePresenter(app, modelsRestDefinition);
    //Generate database..Db Handler always call this method after  generateDbModel
    generateDatabase(app, modelsRestDefinition);
    //Generate Image model and Repository..
    generateImagePresenter(app, modelsRestDefinition);

};

//Run the constructor..
init();


module.exports = yeoman.generators.Base.extend({
  prompting: function () {
    // Have Yeoman greet the user.
    this.log(yosay(
      'To the nerd world of ' + chalk.red('Snaphy') + '!'
    ));
    console.log("Lets generate androidSdk for " + chalk.red("snaphy"));
  },

  writing: function () {
    //This is the new way..
    this.fs.copy(
      this.templatePath('snaphyandroidsdk'),
      this.destinationPath('snaphyandroidsdk')
    );
  },

  projectfiles: function() {

  },

  install: function () {
    //this.installDependencies();
    process.exit();
  }
});
