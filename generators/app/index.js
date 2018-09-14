'use strict';
var yeoman = require('yeoman-generator');
var chalk = require('chalk');
var yosay = require('yosay');
var path = require('path');
var util = require('util');
var mkdirp = require('mkdirp');

module.exports = yeoman.extend({
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
        const done = this.async();
        //trim the input
        input = input.trim();
        const validationRule = /^[a-zA-Z_0-9]{3,}$/;
        const response = validationRule.test(input);
        if (response) {
          done(null, true);
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
      mkdirp.sync(this.props.applicationName);
      var elementDir = process.cwd() + '/' + this.props.applicationName;
      process.chdir(elementDir);

      this.log(yosay('\nDone! \nNow type ' + chalk.red('$ cd ' + this.props.applicationName + ' && slc run') + ' to start the application\n\n'));

      done(null, true);
    }.bind(this));
  },

  writing: function() {
    mkdirp.sync('server');
    mkdirp.sync('common');
    mkdirp.sync('.views');
    mkdirp.sync('server/boot');
    mkdirp.sync('common/helper');
    mkdirp.sync('common/models');
    mkdirp.sync('common/plugins');
    mkdirp.sync('common/table');
    mkdirp.sync('common/validations');
    mkdirp.sync('common/settings');

    mkdirp.sync('.views/static');
    mkdirp.sync('.views/static/assets');
    mkdirp.sync('.views/static/audio');
    mkdirp.sync('.views/static/images');
    mkdirp.sync('.views/static/scripts');
    mkdirp.sync('.views/static/views');



    //This is the new way..
    this.fs.copy(
      this.templatePath('common/plugins'),
      this.destinationPath('common/plugins')
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
      this.templatePath('views/static/style'),
      this.destinationPath('.views/static/style')
    );

    this.fs.copy(
      this.templatePath('views/partials'),
      this.destinationPath('.views/partials')
    );

    this.fs.copy(
      this.templatePath('server/boot'),
      this.destinationPath('server/boot')
    );

    this.fs.copy(
      this.templatePath('common/validations'),
      this.destinationPath('common/validations')
    );

    this.fs.copy(
      this.templatePath('common/table'),
      this.destinationPath('common/table')
    );

    this.fs.copy(
      this.templatePath('common/settings/dashboard'),
      this.destinationPath('common/settings/dashboard')
    );


    this.directory('views/static/assets', '.views/static/assets'); // script is folder name
    this.directory('views/static/audio', '.views/static/audio');
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
    this.copy('ecosystem.json', 'ecosystem.json');
    //write configuration file to the module..
    this.copy('common/settings/conf.js', 'common/settings/conf.js');
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
    this.copy('README.md', 'README.md');
  },


  install: function() {
    this.installDependencies();
  }


  //TODO Write test for the generator.
});
