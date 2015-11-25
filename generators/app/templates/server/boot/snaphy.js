'use strict';
module.exports = function(server) {
  var loopback = require('loopback');
  var helper   = require(__dirname + '/../../common/helper')(server);


  //Now setting up the static files..
  server.use('/static', loopback.static(__dirname + '/../../.views/app/static'));
  // set the view engine to ejs
  server.set('view engine', 'ejs');

  //Load the required plugins script and styles in the memory..
  var loadPluginsData = function(data){
    var i;
    //get the list of plugins..
    var pluginList = helper.getDirectories(__dirname + '/../../common/plugins');
    for(i=0; i<pluginList.length; i++){
      var pluginName = pluginList[i];
      var pluginPath = __dirname + '/../../common/plugins/' + pluginName +  '/package.json';
      var packageObj = helper.readPackageJsonFile(pluginPath);
      if(packageObj.activate){
        //If the plugin has declared staticFiles
        if(packageObj.staticFiles) {
          if (packageObj.staticFiles.css) {
            data.pluginStyles = data.pluginStyles.concat(packageObj.staticFiles.css);
          }

          if (packageObj.staticFiles.js) {
            data.pluginScript = data.pluginScript.concat(packageObj.staticFiles.js);
          }

          //Load module dependencies..
          if(packageObj.moduleDependencies.length){
            data.moduleDependencies = data.moduleDependencies.concat(packageObj.moduleDependencies);
          }

          //Now getting the html templates...hooks..
          if(packageObj.defaultTemplate && packageObj.bodystructure){
            data.asidebarHook = data.asidebarHook.concat(packageObj.bodystructure.asidebarHook);
            data.sidebarHook  = data.sidebarHook.concat(packageObj.bodystructure.sidebarHook);
            data.headerHook  = data.headerHook.concat(packageObj.bodystructure.headerHook);
          }
        }// if staticFiles..
      }//if activate

    }//for loop
    return data;
  };

  //Loads the title, desc of the app given in the package.json file.
  var loadAppData = function(data){
    var packageObj = helper.readPackageJsonFile(__dirname + '/../../package.json');
    data.title = packageObj.title;
    data.description = packageObj.description;
    data.author = packageObj.author;
    data.module = packageObj.angularModuleName;
    return data;
  };


  //Changing the view folder
  server.set('views', __dirname + '/../../.views');


  //Now render the index page..
  // index page
  server.get('/admin', function(req, res) {
    //Read the main package file..
    var data = {
      title: 'SNAPHY ADMIN CONSOLE',
      author: 'ROBINS GUPTA',
      description: 'Console by Snaphy',
      pluginStyles:[],
      pluginScript: [],
      moduleDependencies:[],
      asidebarHook:[],
      sidebarHook:[],
      headerHook:[]
    };
    data = loadPluginsData(data);
    data = loadAppData(data);
    console.log( data);

    res.render('app/index', data);
  });




};
