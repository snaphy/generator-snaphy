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

//Returns the app object..
var startServer = function(){
    //starting the server..
    return require(path.resolve(constants.serverPath) );
};



var generateModels = function(app){

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
            var model = {
                name : modelName,
                properties: modelProperties,
                base: modelObj.definition.settings.base
            };
            //Now compile the ejs template..
            var ModelTemplatePath = path.join(__dirname, constants.javaTemplates, "ModelTemplate.ejs");
            var AndroidModelPath  = path.join(__dirname, constants.androidMainPath, "models");

            //Now compile each models and start writing it to the models directory..
            //First read the template file
            var modelTemplate = fs.readFileSync(
               ModelTemplatePath,
               { encoding: 'utf-8' }
            );

            var formattedModel = ejs.render(modelTemplate, {model: model});
            console.log(chalk.blue("\nCompiling Model Class -> " + helper.capitalizeFirstLetter(modelName) ));
            //Now writing it to file and saving to model folder..

            fs.writeFileSync(
                path.join(AndroidModelPath, helper.capitalizeFirstLetter(modelName) + ".java") ,
                formattedModel,
                'utf8'
            );
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
    generateModels(app);

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
      this.templatePath('SnaphySdk'),
      this.destinationPath('SnaphySdk')
    );
  },

  projectfiles: function() {

  },

  install: function () {
    //this.installDependencies();
    process.exit();
  }
});
