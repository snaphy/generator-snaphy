'use strict';
var yeoman = require('yeoman-generator');
var chalk = require('chalk');
var yosay = require('yosay');
var mkdirp = require('mkdirp');
var fs  = require("fs");
const {join} = require("path");
const _ = require("lodash");

function validateEmail(email) {
    var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
    return re.test(email);
}

//Check the path of the main file..
var checkFilePath = function(path){
	return fs.existsSync(rootPath);
};



var rootPath = process.cwd() + '/' ;
//represents the main root path of the server..
const mainRootFolder = rootPath;

function checkDirectory(){
  	var packageObj;
  	//TODO Run a loop to facilitate running of plugin from any folder.
  	if(!checkFilePath(rootPath + "package.json")){
  		//Traverse back a little..
  		rootPath = process.cwd() + '/../' ;
  		if(!checkFilePath(rootPath + "package.json")){
  			throw chalk.red('>>Error:') + ' Cannot found the main ' + chalk.cyan('package.json') + ' file. \nPlease run it from the main root directory';
  		}
  	}//if

	//Now check if the package has PLUGIN_PATH set..
  packageObj = require(`${rootPath}common/settings/conf.js`)();
	if(!packageObj.PLUGIN_PATH){
		throw chalk.red('>>Error:') + ' Cannot found the `PLUGIN_PATH` entry in ' +  chalk.cyan(rootPath + 'common/settings/conf.js') + ' file.\nPlease run it from the main root directory';
	}

  	//Now change the directory to the PLUGIN_PATH
  	rootPath = packageObj.PLUGIN_PATH;
  	process.chdir(rootPath);
}


//Exectue the function
checkDirectory();


module.exports = yeoman.generators.Base.extend({
  prompting: function () {
    var done = this.async();

    // Have Yeoman greet the user.
    this.log(yosay(
      'To the nerd world of ' + chalk.red('Snaphy') + '!'
    ));

    var prompts = [{
      type: 'input',
      name: 'pluginName',
      message: 'What will be the name of your Plugin?',
      default: "testPlugin",
      validate: function(input) {
        // Declare function as asynchronous, and save the done callback
        var done = this.async();
        //trim the input
        input = input.trim();
        var validationRule = /^[a-zA-Z_0-9]{3,}$/;
        var response = validationRule.test(input);
        if (response) {
          done(null, true);
        } else {
          done(chalk.red('Error:') + ' Spaces and special characters are not allowed!');
        }
      } //validate
    },
    {
      type: 'input',
      name: 'routeExposure',
      message: 'Please provide us a root at which this plugin methods will get expose.',
      default: "/testPlugin",
      validate: function(input) {
        // Declare function as asynchronous, and save the done callback
        var done = this.async();
        //trim the input
        input = input.trim();
        var patt = /^\/[A-Z_0-9a-z]{0}/;
        var response = patt.test(input);
        if (response) {
          done(null, true);
        } else {
          done(chalk.red('Error:') + ' please provide a correct route path!');
        }
      } //validate
    },
    {
      type: 'input',
      name: 'pluginTitle',
      message: 'Please describe what your plugin will do.',
      default: "A plugin for improving backend security"
    },
    {
      type: 'input',
      name: 'authorName',
      message: 'May I know your name?',
      default: "Robins Gupta"
    },
    {
      type: 'input',
      name: 'authorEmail',
      message: 'Do you mind us giving your email',
      default: "robinskumar73@gmail",
      validate: function(input) {
        // Declare function as asynchronous, and save the done callback
        var done = this.async();
        //trim the input
        input = input.trim();
        var response = validateEmail(input);
        if (response) {
          done(null, true);
        } else {
          done(chalk.red('Error:') + ' please provide a correct email!');
        }
       }//validate function
      },
      {
      type: 'confirm',
      name: 'defaultTemplate',
      message: 'Should we proceed with the ' + chalk.red('default template') +  ' design? ',
      default: true
      }
    ];

    this.prompt(prompts, function (props) {
  	   this.props = props;
  	   //console.log("Main plugin paths");
       //console.log(rootPath);
       //console.log(rootPath + '/' +this.props.pluginName);
    	//Now create a the plugins folder
    	var that = this;
    	this.props.pluginName = this.props.pluginName.trim();
      mkdirp(this.props.pluginName, function (err) {
        if (err) throw err;
        process.chdir(rootPath + '/' + that.props.pluginName);
        console.info('\nDone! \nUse ' + chalk.red('' + that.props.pluginName + '/client') + ' folder to design the User Interface.\nUse ' + chalk.red('' + that.props.pluginName + '/backend') + ' folder to write the backend logic!.\n\n' );
        done(null, true);
      });

      var serverFile = "server/server.js";
      //Add the root path..
      this.props.mainServerFile = join(mainRootFolder, serverFile);


    }.bind(this));
  },


  writing: function () {
    //This is the new way..
    this.fs.copy(
      this.templatePath('backend'),
      this.destinationPath('backend')
    );

    var that = this;
    mkdirp('client', function(){

      that.fs.copy(
        that.templatePath('database-format'),
        that.destinationPath('database-format')
      );

      //Creating directories first..
      mkdirp.sync( 'client/scripts');
      mkdirp.sync( 'client/style');
      mkdirp.sync( 'client/scripts/controllers');
      mkdirp.sync( 'client/scripts/directives');
      mkdirp.sync( 'client/scripts/filters');
      mkdirp.sync( 'client/scripts/routes');
      mkdirp.sync( 'client/scripts/services');
      mkdirp.sync( 'client/views');
      mkdirp.sync('client/scripts/directives');

      //Now create the folder containing settings file..
      //sample-settings directives will be replaced by plugin name
      mkdirp.sync(that.props.pluginName);


      //Copying with templating..
      that.copy('client/scripts/controllers/exampleController.js', 'client/scripts/controllers/'  + that.props.pluginName + '.js');
      that.copy('client/scripts/filters/exampleFilter.js', 'client/scripts/filters/'  + that.props.pluginName + '.js');
      that.copy('client/scripts/routes/exampleRoute.js', 'client/scripts/routes/'  + that.props.pluginName + '.js');
      that.copy('client/scripts/services/exampleServices.js', 'client/scripts/services/'  + that.props.pluginName + '.js');
      that.copy('client/scripts/directives/exampleDirectives.js', 'client/scripts/directives/'  + that.props.pluginName + '.js');
      const settingDirectory = "sample-settings";
      that.copy(`${settingDirectory}/admin-panel-setting.js`, `${that.props.pluginName}/admin-panel-setting.js`);
      that.copy(`${settingDirectory}/conf.json`, `${that.props.pluginName}/conf.json`);
      that.copy(`${settingDirectory}/database.json`, `${that.props.pluginName}/database.json`);
      that.copy(`${settingDirectory}/static.json`, `${that.props.pluginName}/static.json`);

      that.copy('client/views/example.html', 'client/views/' + that.props.pluginName + '.html');
      that.copy('client/style/example.css', 'client/style/' + that.props.pluginName + '.css');


      console.info(chalk.red('TODO') + ' Work needs to be done for default Template.' );
      //Now choose the scaffolding according to the defaultTemplate option
      if(that.props.defaultTemplate){
        //Us e hooks here

       }else{
        //Provide the angular scaffolding here..

      }
    });//mkdirp function..
  },

  projectfiles: function() {
    this.copy('_package.json', 'package.json');
    //Copy all of the bower specific files.
    this.copy('bowerrc', '.bowerrc');
    this.copy('_bower.json', 'bower.json');
    //Copy all files that handle git repositorys
    this.copy('gitignore', '.gitignore');
    this.copy('readMe.md', 'readMe.md');
  },



  install: function () {
    var that = this;
    var installNpmModule = function(moduleName, that){
     /* that.npmInstall(moduleName, ["install"], {
        "prefix": "../../../",
        "save": true
      });*/
      that.spawnCommandSync("npm", ["install", moduleName, "--prefix", "../../../", "--save"], {});
    };


    var packageFile = require(join(__dirname, "templates/_package.json"));
    if(packageFile){
      if(packageFile.dependencies){
        _.forEach(packageFile.dependencies, function(value, key) {
          let moduleName = `${key}@${value}`;
          installNpmModule(moduleName, that);
        });
      }

      if(packageFile.optionalDependencies){

        _.forEach(packageFile.optionalDependencies, function(value, key) {
          let moduleName = `${key}@${value}`;
          installNpmModule(moduleName, that);
        });
      }
      if(packageFile.devDependencies){
        _.forEach(packageFile.devDependencies, function(value, key) {
          let moduleName = `${key}@${value}`;
          installNpmModule(moduleName, that);
        });
      }

    }
    this.bowerInstall();
  }
});
