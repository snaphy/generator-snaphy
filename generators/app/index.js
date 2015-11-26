'use strict';
var yeoman = require('yeoman-generator');
var chalk = require('chalk');
var yosay = require('yosay');
var path = require('path');
var util = require('util');
var mkdirp = require('mkdirp');

module.exports = yeoman.generators.Base.extend({
  prompting: function() {
    var done = this.async();

    // Have Yeoman greet the user.
    this.log(yosay(
      'Welcome to the superb world of ' + chalk.red('Snaphy') + '\n Sit tight with us for few minutes!'
    ));

    var prompts = [{
      type: 'input',
      name: 'applicationName',
      message: 'What will be the name of your Application?',
      default: "snaphyDemo",
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
    }, {
      type: 'input',
      name: 'applicationTitle',
      message: 'A short title for your Application',
      default: "Welcome to Snaphy"
    }];

    this.prompt(prompts, function(props) {
      this.props = props;
      // To access props later use this.props.someOption;
      //Now create a folder 
      mkdirp(this.props.applicationName);
      var elementDir = process.cwd() + '/' + this.props.applicationName;
      process.chdir(elementDir);

      this.log(yosay('\nDone! \nNow type ' + chalk.red('$ cd ' + this.props.applicationName + ' && slc run') + ' to start the application\n\n'));

      done();
    }.bind(this));
  },

  writing: function() {
    mkdirp('server');
    mkdirp('common');
    mkdirp('.views');
    mkdirp('server/boot');
    mkdirp('common/helper');
    mkdirp('common/models');
    mkdirp('common/plugins');

    mkdirp('.views/static');
    mkdirp('.views/static/assets');
    mkdirp('.views/static/audio');
    mkdirp('.views/static/images');
    mkdirp('.views/static/scripts');
    mkdirp('.views/static/views');


    //This is the new way..
    this.fs.copy(
      this.templatePath('views/static/views'),
      this.destinationPath('.views/static/views')
    );

    this.fs.copy(
      this.templatePath('views/index.ejs'),
      this.destinationPath('.views/index.ejs')
    );

    this.fs.copy(
      this.templatePath('views/static/scripts'),
      this.destinationPath('.views/static/scripts')
    );

    this.fs.copy(
      this.templatePath('server/boot'),
      this.destinationPath('server/boot')
    );


    this.directory('views/static/assets', '.views/static/assets'); // script is folder name
    this.directory('views/static/audio', '.views/static/audio');
    this.directory('views/static/images', '.views/static/images');
    this.copy('views/robots.txt', '.views/robots.txt');

    this.copy('server/config.json', 'server/config.json');
    this.copy('server/datasources.json', 'server/datasources.json');
    this.copy('server/middleware.json', 'server/middleware.json');
    this.copy('server/model-config.json', 'server/model-config.json');
    this.copy('server/server.js', 'server/server.js');

    this.copy('common/helper/index.js', 'common/helper/index.js');

  },

  projectfiles: function() {
    this.copy('_package.json', 'package.json');
    this.copy('_Gruntfile.js', 'Gruntfile.js');
    //Copy all of the bower specific files.
    this.copy('bowerrc', '.bowerrc');
    this.copy('_bower.json', 'bower.json');
    //Copy all files that handle code editing.
    this.copy('editorconfig', '.editorconfig');
    this.copy('jshintrc', '.jshintrc');
    //Copy all files that handle git repositorys
    this.copy('gitignore', '.gitignore');
    this.copy('gitattributes', '.gitattributes');
    //Copy files for Travis CI.
    this.copy('travis.yml', '.travis.yml');
  },



  app: function() {



  },

  install: function() {
    this.installDependencies();
  }
});