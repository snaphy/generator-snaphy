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
        done();
      });
    	
      //console.log(this.props.pluginName);
      /*	try{
    		
    	}catch(err){
    		//Do nothing
    	}*/
    	
    	
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
      //Now add folders to client based ..
      //This is the new way..
      that.fs.copy(
        that.templatePath('client/style'),
        that.destinationPath('client/style')
      );

      that.fs.copy(
        that.templatePath('database-format'),
        that.destinationPath('database-format')
      );

      //Creating directories first..
      mkdirp.sync( 'client/scripts');
      mkdirp.sync( 'client/scripts/controllers');
      mkdirp.sync( 'client/scripts/directives');
      mkdirp.sync( 'client/scripts/filters');
      mkdirp.sync( 'client/scripts/routes');
      mkdirp.sync( 'client/scripts/services');
      mkdirp.sync( 'client/views');
      mkdirp.sync('client/scripts/directives');


      //Copying with templating..
      that.copy('client/scripts/controllers/exampleController.js', 'client/scripts/controllers/'  + that.props.pluginName + '.js')
      that.copy('client/scripts/filters/exampleFilter.js', 'client/scripts/filters/'  + that.props.pluginName + '.js')
      that.copy('client/scripts/routes/exampleRoute.js', 'client/scripts/routes/'  + that.props.pluginName + '.js')
      that.copy('client/scripts/services/exampleServices.js', 'client/scripts/services/'  + that.props.pluginName + '.js')
      that.copy('client/scripts/directives/exampleDirectives.js', 'client/scripts/directives/'  + that.props.pluginName + '.js')
      
      that.copy('client/settings.js', 'client/settings.js')
      that.copy('client/views/example.html', 'client/views/' + that.props.pluginName + '.html');
      

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
    this.copy('client/settings.js', 'client/settings.js');
  },

  install: function () {
    this.installDependencies();
  }
});
