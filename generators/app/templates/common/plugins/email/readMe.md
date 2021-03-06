# Email plugin for Snaphy


###Plugin for simplifying email sending.

###How to use
0. First configure the `package.json` file of the `email plugin`. Add this property in the package.json file.


    ```
    "mailConfig": [
        {
          "emailModel": "adminEmail",
          "assosiatedUsers": [],
          "templates": {
            "sendNotice": "backend/views/notice.ejs"
          }
        }
      ]
    ```
    
  * Here `mailConfig` is the property name of the mail configuration that contains list of email configuration settings.
  * `emailModel` if the property of the `loopback` email model name attached with a `email configured datasource`.
  * `assosiatedUsers` contains the list of users model name through which this emailModel will be exposed. 
     
     >For Example :-
     
     
           `adminEmail` model can only send email to `employee` model.
     
     
           `offers` email model can send email to `customers` who wants to know about offers and so on.
  * `template` contains an object with property name of the template type name and value having template link.
  * Using template you can send any user templated form of the email. like 
  
  
     ```
        //To send notice to any user use sendNotice template.
        //First load this plugin file inside your plugin.
        var mail = helper.loadPlugin('pluginName');
        //Now call method emailModel.TemplateName(from, to, subject, {}, callback);   
        mail.adminEmail.sendNotice(" 'Rohit Basu' <rohitbasu2050@gmail.com>", "xyz@gmail.com", "Hey this is a subject", {'title': 'this is a test title'}, callback)
     ```
     
     
1. Now  To send any mail first configure this  helper.loadPlugin('pluginName') method AND call
2. `emailModel.send({to, subject, message}, callback)` to send any message
3. `emailModel.TemplateName(from, to, subject, {}, callback)` to send any templated message.



##Some more examples
```
"mailConfig": [{
    "emailModel": "adminEmail",
    "emailLabel": "Send Info",
    "label": "Send Mail To Users",
    "from": "'OrthoPG' <info@orthopg.com>",
    "assosiatedUsers": ["Customer", "Employee"],
    "templates": {
      "sendMciOnHold": {
        "name": "Imran",
        "label": "Send MCI OnHold Mail.",
        "templatePath": "backend/views/mciOnHold.ejs",
        "display": false
      },
      "sendMciAllow": {
        "label": "Send MCI on Verified mail to customer.",
        "templatePath": "backend/views/mciAllow.ejs",
        "display": false
      }
    }
  }],
  
```
	 
####NOTE:

 When using `Google Mail` sometimes `gmail` prevent login for less secure apps. 
 You need to re-enable [Turn On for less secure Apps](https://www.google.com/settings/u/2/security/lesssecureapps)



####Written by Robins Gupta

