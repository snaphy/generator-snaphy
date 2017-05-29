(function(){"use strict";})();
const Promise = require("bluebird");

/**
 * Return the Error object with message
 * @param  {String}  message       Error message
 * @return {Object} Error object.
 */
const getError = function(message){
    message = typeof message === "string" ? message.trim() : "";
    return new Error(message);
};


/**
 * Validate presense of a properties by checking for value in both currentInstance and instance
 * @param  {Object} instance        loopback ctx.instance object.
 * @param  {Object} currentInstance loopback ctx.currentInstance object occurs in the case of beforeSave of updateAttributes method.
 * @param  {String} prop            Properties name which you want to validate
 * @return {Boolean}                True means the validation is true and vice versa.
 */
const validate = function(instance, currentInstance, prop){
    if(instance[prop] === undefined){
        if(currentInstance){
            if(!currentInstance[prop]){
                return false
            }
        }else{
            return false;
        }
    }

    return true;

};


/**
 * //Copying one object to another..
 * @param original
 * @param context {*}
 * @param key
 * @returns {*}
 */
var extend = function(original, context, key) {
    for (key in context) {
        if (context.hasOwnProperty(key)) {
            if (Object.prototype.toString.call(context[key]) === '[object Object]') {
                original[key] = extend(original[key] || {}, context[key]);
            } else {
                original[key] = context[key];
            }
        }
    }
    return original;
};


module.exports = {
  getError: getError,
  validate: validate,
  extend: extend
};