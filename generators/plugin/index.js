'use strict';
var yeoman = require('yeoman-generator');
var chalk = require('chalk');
var yosay = require('yosay');
var mkdirp = require('mkdirp');
var fs  = require("fs");

function validateEmail(email) {
    var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
    return re.test(email);
}

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
          done(true);
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
        var response = patt.test(input)
        if (response) {
          done(true);
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
          done(true);
        } else {
          done(chalk.red('Error:') + ' please provide a correct email!');
        }
      },
      {
      type: 'confirm',
      name: 'defaultTemplate',
      message: 'Should we proceed with the ' + chalk.red('default template') +  ' design? ',
      default: true
    ];

    this.prompt(prompts, function (props) {
    	this.props = props;
    	

      	//Now create a folder 
      	mkdirp(this.props.pluginName);
      	var rootPath = process.cwd() + '/' ;
      	//Check the path of the main file..
      	var checkFilePath = function(path){
      		return fs.existsSync(rootPath)
      	}

      	//TODO Run a loop to facilitate running of plugin from any folder.
      	if(!checkFilePath(rootPath + "package.json")){
      		//Traverse back a little..
      		rootPath = process.cwd() + '/../' ;
      		if(!checkFilePath(rootPath + "package.json")){
      			console.error(chalk.red('>>Error:') + ' Cannot found the root directory. Please run it from the main root directory');
      		}else{
      			//Now check if the package has pluginPath set..
      			var packageObj = require(rootPath +  "package.json");
      		}
      	}






      	process.chdir(elementDir);

      	this.log(yosay('\nDone! \nNow type ' + chalk.red('$ cd ' + this.props.applicationName + ' && slc run') + ' to start the application\n\n'));

      	done();
    }.bind(this));
  },

  writing: function () {
    this.fs.copy(
      this.templatePath('dummyfile.txt'),
      this.destinationPath('dummyfile.txt')
    );
  },

  install: function () {
    this.installDependencies();
  }
});
