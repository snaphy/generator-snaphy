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

//Check the path of the main file..
var checkFilePath = function(path){
	return fs.existsSync(rootPath)
}


var rootPath = process.cwd() + '/' ;

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

	//Now check if the package has pluginPath set..
	packageObj = require(rootPath +  "package.json");
	if(!packageObj.pluginPath){
		throw chalk.red('>>Error:') + ' Cannot found the `pluginPath` entry in  ' + chalk.cyan('package.json') + ' file.\nPlease run it from the main root directory';
	
	}

  	//Now change the directory to the pluginPath
  	rootPath = rootPath + packageObj.pluginPath;
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
    	
      	//Now create a the plugins folder 
      	mkdirp(this.props.pluginName);
      	process.chdir(rootPath + this.props.pluginName);
      	console.info('\nDone! \nNow use ' + chalk.red('' + this.props.pluginName + '/client') + ' folder to design the User Interface.\n Use ' + chalk.red('' + this.props.pluginName + '/backend') + ' folder to write the backend logic!.' );

      	done();
    }.bind(this));
  },

  writing: function () {
    //This is the new way..
    this.fs.copy(
      this.templatePath('backend'),
      this.destinationPath('backend')
    );

    mkdirp('client');
    mkdirp('views');
    //Now add folders to client based ..
    //This is the new way..
    this.fs.copy(
      this.templatePath('client/style'),
      this.destinationPath('client/style')
    );

    //Copying with templating..
    this.directory('client/scripts', 'client/scripts')
    this.directory('client/views/example.html', 'client/views/example.html')
    

    console.info(chalk.red('TODO') + ' Work needs to be done for default Template.' );
    //Now choose the scaffolding according to the defaultTemplate option
    if(this.props.defaultTemplate){
    	//Use hooks here

    }else{
    	//Provide the angular scaffolding here..

    }

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
    this.installDependencies();
  }
});
