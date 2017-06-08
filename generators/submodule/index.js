/**
 * Created by robins on 8/6/17.
 */
(function () {
  'use strict';
  let yeoman = require('yeoman-generator');
  let chalk = require('chalk');
  let yosay = require('yosay');
  let mkdirp = require('mkdirp');
  let fs  = require("fs");
  const {join} = require("path");
  const _ = require("lodash");
  const ini = require('node-ini');

  const rootPath = process.cwd();

  console.log(rootPath);

  module.exports = yeoman.generators.Base.extend({
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
          name: "submodule",
          choices: ["install", "update", "nothing"],
          default: "update",
          message: "Do you want to install npm or update?"
        }
      ];

      this.prompt(prompts, function (props) {
        this.props = props;
        done(null, true);
      }.bind(this));
    },


    install: function () {
      let that = this;
      const installUpdateSubmodule = function(moduleUrl, path, that){
        that.spawnCommandSync("git", ["submodule", "add",  "--force", moduleUrl, path], {});
      };
      if(that.props.submodule === "update"){
        const gitModulePath = join(rootPath, ".gitmodules");

        var cfg = ini.parseSync(gitModulePath);
        console.log(cfg);
        for(const submoduleName in cfg){
          if(cfg.hasOwnProperty(submoduleName)){
            const submodule = cfg[submoduleName];
            console.info(`Installing submodule ${submodule.url}`);
            installUpdateSubmodule(submodule.url, submodule.path, that);
          }
        }
          /*if(packageFile.dependencies){
            _.forEach(packageFile.dependencies, function(value, key) {
              if(key && value){
                let moduleName = `${key}@${value}`;
                console.info(`Installing plugin ${moduleName}`);
                installNpmModule(moduleName, that);
              }
            });
          }*/

      } //if

      if(that.props.npmInstall === "install"){
        this.log(yosay(
          'Sorry!! We are working to make this feature' + chalk.red('Work') + '!'
        ));
      }
    }
  });
})();
