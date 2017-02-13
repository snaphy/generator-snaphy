"use strict";
module.exports = function(){
  var methods ={
    //Return java type..
    getJavaType: function(loopbackType, isArray){
      if(!isArray){
        return this.getJavaTypeFromLoopback(loopbackType);
      }else{
        var type;
        if(loopbackType === "object" || loopbackType === "geopoint"){
          type = "DataList<Map<String, Object>>";
        }
        else if (loopbackType === "string" || loopbackType === "date") {
          type = "DataList<String>";
        }
        else if (loopbackType === "number") {
          type = "DataList<Double>";
        }
        else if (loopbackType === "boolean") {
          type = "DataList<Boolean>";
        }
        else{
          type = "DataList<Object>";
        }
        return type;
      }
    },
    getJavaTypeFromLoopback: function(loopbackType){
      var type;
      if(loopbackType === "object" || loopbackType === "geopoint"){
        type = "Map<String, Object>";
      }
      else if (loopbackType === "string" || loopbackType === "date") {
        type = "String";
      }
      else if (loopbackType === "boolean") {
        type = "boolean";
      }
      else if (loopbackType === "number") {
        type = "double";
      }
      else{
        type = "Object";
      }

      return type;
    },

    updateDataProperty: "_DATA_UPDATED",

    getSqliteType: function(loopbackType, isArray){
      if(isArray){
        return "TEXT";
      }else{
        var type;
        if(loopbackType === "object" || loopbackType === "geopoint"){
          type = "TEXT";
        }
        else if (loopbackType === "string" || loopbackType === "date") {
          type = "TEXT";
        }
        else if (loopbackType === "boolean") {
          type = "NUMBER";
        }
        else if (loopbackType === "number") {
          type = "NUMBER";
        }
        else{
          type = "TEXT";
        }
        return type;
      }
    },
    createTableTypeQuery(property, type, isArray){
      type = this.getSqliteType(type, isArray);
      return `${property} ${type}`;
    },
    capitalizeFirstLetter: function (string) {
      return string.charAt(0).toUpperCase() + string.slice(1);
    },
    lowercaseFirstLetter: function (string) {
      return string.charAt(0).toLowerCase() + string.slice(1);
    },
    //Prepare method for get foreign key..
    getForeignKeyName: function(lowercaseRelatedModelName, relationObj){
      var foreignKey = relationObj.foreignKey;
      if(!foreignKey) {
        foreignKey = lowercaseRelatedModelName + "Id";
      }
      return foreignKey;
    },
    //Track which models has been processed..
    processed:{}
  };

  return {
    methods: methods
  }
};
