(function(){
'use strict';
})();
var yeoman = require('yeoman-generator');
var chalk = require('chalk');
var yosay = require('yosay');
var mkdirp = require('mkdirp');
var fs  = require("fs");
var constants = require("./constants");
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
            var modelObj = app.models[modelName];
            var modelProperties = modelObj.definition.rawProperties;

            var model = {
                name : modelName,
                restDefinition: modelsRestDefinition[modelName],
                properties: modelProperties,
                base: modelObj.definition.settings.base,
                relations: modelObj.definition.settings.relations,
                allModels: app.models
            };

            //Now compile each Repository and start writing it to the Repository directory..
            //First read the template file
            var repoTemplate = fs.readFileSync(
               RepositoryTemplatePath,
               { encoding: 'utf-8' }
            );

            var formattedRepo = ejs.render(repoTemplate, {model: model});
            console.log(chalk.red("\nCompiling Repository Class -> " + helper.capitalizeFirstLetter(modelName) + "Repository.java" ));
            //Now writing it to file and saving to model folder..

            fs.writeFileSync(
                path.join(AndroidRepositoryPath, helper.capitalizeFirstLetter(modelName) + "Repository.java") ,
                formattedRepo,
                'utf8'
            );
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
            // if(modelsRestDefinition[modelName] !== undefined){
                var model = {
                    name : modelName,
                    properties: modelProperties,
                    base: modelObj.definition.settings.base,
                    relations: modelObj.definition.settings.relations,
                    restDefinition: modelsRestDefinition
                };
                //console.log(modelsRestDefinition);


                //Now compile each models and start writing it to the models directory..
                //First read the template file
                var modelTemplate = fs.readFileSync(
                   ModelTemplatePath,
                   { encoding: 'utf-8' }
                );

                var formattedModel = ejs.render(modelTemplate, {model: model});
                console.log(chalk.blue("\nCompiling Model Class -> " + helper.capitalizeFirstLetter(modelName) +".java"));
                //Now writing it to file and saving to model folder..

                fs.writeFileSync(
                    path.join(AndroidModelPath, helper.capitalizeFirstLetter(modelName) + ".java") ,
                    formattedModel,
                    'utf8'
                );
            // }
        }
    }
};



//Now creating a constructor..
var init  = function(){
    //Start the server..
    var app = startServer();
    //Now get the description of the models..
    var modelsRestDefinition = helper.describeModels(app);
    //Now generate the models..
    generateModels(app, modelsRestDefinition);
    generateRepository(app, modelsRestDefinition);

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
