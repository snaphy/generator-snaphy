'use strict';
let yeoman = require('yeoman-generator');
let chalk = require('chalk');
let yosay = require('yosay');
let mkdirp = require('mkdirp');
let fs  = require("fs");
const {join} = require("path");
const _ = require("lodash");


const rootPath = process.cwd();

//console.log(rootPath);


module.exports = yeoman.extend({
  prompting: function () {
    let done = this.async();
    let that = this;
    // Have Yeoman greet the user.
    this.log(yosay(
      'To the nerd world of ' + chalk.red('Snaphy') + '!'
    ));

    let prompts = [
      {
        type: 'list',
        name: "npmInstall",
        choices: ["install", "update", "nothing"],
        default: "update",
        message: "Do you want to install npm or update?"
      },
      {
        when: (props)=>{
          //Dont ask if npm is being installed..
          if(props){
            if(props.npmInstall === "install"){
              return true;
            }
          }
          return false;
        },
        type: 'input',
        name: 'npmPlugin',
        message: 'Enter npm plugin name?',
        validate: function(input) {
          // Declare function as asynchronous, and save the done callback
          let done = that.async();
          if(input){
            //trim the input
            input = input.trim();
            if (input) {
              done(true);
            } else {
              done(chalk.red('Error:') + ' please enter npm plugin name')
            }
          }else{
            done(chalk.red('Error:') + ' please enter npm plugin name')
          }
        }//validate function
      }
    ];

    this.prompt(prompts, function (props) {
      this.props = props;
      done();
    }.bind(this));
  },


  install: function () {
    let that = this;
    const installNpmModule = function(moduleName, that){
      that.spawnCommandSync("npm", ["install", moduleName, "--prefix", "../../../", "--save"], {});
    };
    if(that.props.npmInstall === "update"){
      let packageFile = require(join(rootPath, "package.json"));
      if(packageFile){
        if(packageFile.dependencies){
          _.forEach(packageFile.dependencies, function(value, key) {
            if(key && value){
              let moduleName = `${key}@${value}`;
              console.info(`Installing plugin ${moduleName}`);
              installNpmModule(moduleName, that);
            }
          });
        }

        if(packageFile.optionalDependencies){
          _.forEach(packageFile.optionalDependencies, function(value, key) {
            if(key && value) {
              let moduleName = `${key}@${value}`;
              console.info(`Installing plugin ${moduleName}`);
              installNpmModule(moduleName, that);
            }
          });
        }
        if(packageFile.devDependencies){
          _.forEach(packageFile.devDependencies, function(value, key) {
            if(key && value) {
              let moduleName = `${key}@${value}`;
              console.info(`Installing plugin ${moduleName}`);
              installNpmModule(moduleName, that);
            }
          });
        }
      }//if packageFile
    } //if

    if(that.props.npmInstall === "install"){
      if(that.props.npmPlugin){
        installNpmModule(that.props.npmPlugin, that);
      }
    }
  }
});
