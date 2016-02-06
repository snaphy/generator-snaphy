(function(){
'use strict';
})();

//Contains the helper methods to be used in generating the sdk..

function describeModels(app) {
  var result = {};
  app.handler('rest').adapter.getClasses().forEach(function(c) {
    var name = c.name;

    if (!c.ctor) {
      // Skip classes that don't have a shared ctor
      // as they are not LoopBack models
      console.error('Skipping %j as it is not a LoopBack model', name);
      return;
    }

    // The URL of prototype methods include sharedCtor parameters like ":id"
    // Because all $resource methods are static (non-prototype) in ngResource,
    // the sharedCtor parameters should be added to the parameters
    // of prototype methods.
    c.methods.forEach(function fixArgsOfPrototypeMethods(method, key) {
      if(method.name=='create'){
        var createMany = Object.create(method);
            createMany.name = 'createMany';
            createMany.isReturningArray = function() { return true; };
            c.methods.splice(key+1, 0, createMany);
      }
      var ctor = method.restClass.ctor;
      if (!ctor || method.sharedMethod.isStatic) return;
      method.accepts = ctor.accepts.concat(method.accepts);

      if(!method.accepts) return;

      // Any extra http action arguments in the path need to be added to the
      // angular resource actions as params
      method.accepts.forEach(function findResourceParams(arg) {
        if(!arg.http) return;

        if(arg.http.source === 'path' && arg.arg !== 'id') {
          if(!method.resourceParams) {
            method.resourceParams = [];
            method.hasResourceParams = true;
          }
          method.resourceParams.push(arg);
        }
      });
    });

    c.isUser = c.sharedClass.ctor.prototype instanceof app.loopback.User ||
      c.sharedClass.ctor.prototype === app.loopback.User.prototype;
    result[name] = c;
  });

  buildScopes(result);

  return result;
}



module.exports = {
    describeModels: describeModels
};
