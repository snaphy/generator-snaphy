(()=>{ 'use strict';})();

module.exports = (server) => {
  //Getting the main root package file of the server..
  const PLUGIN_PATH = `$(__dirname)../../common/plugins`;
  const DESCRIPTION = "<%= props.applicationTitle %>";
  const ANGULAR_MODULE = "<%= props.applicationName %>";
  const SERVER_PATH = `$(__dirname)../../server/server.js`;
  const SERVER_FOLDER = `$(__dirname)../../server`;
  const MODEL_PATH = `$(__dirname)../../common/models`;
  const VALIDATION_PATH = `$(__dirname)../../common/validations`;
  const TABLE_PATH = `$(__dirname)../../common/table`;
  const SETTING_PATH = `$(__dirname)../../common/settings`;

  return {
    PLUGIN_PATH,
    DESCRIPTION,
    ANGULAR_MODULE,
    SERVER_PATH,
    SERVER_FOLDER,
    MODEL_PATH,
    VALIDATION_PATH,
    TABLE_PATH,
    SETTING_PATH
  };
};
