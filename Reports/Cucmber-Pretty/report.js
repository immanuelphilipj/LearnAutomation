$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "This is to test the login functionality",
  "description": "",
  "id": "this-is-to-test-the-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To test the customer login functionality",
  "description": "",
  "id": "this-is-to-test-the-login-functionality;to-test-the-customer-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User login to the retail application with URL",
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 5,
    "value": "https://ism-qa.rrd.com/retailism/"
  }
});
formatter.step({
  "line": 8,
  "name": "User enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should login application successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "this-is-to-test-the-login-functionality;to-test-the-customer-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "this-is-to-test-the-login-functionality;to-test-the-customer-login-functionality;;1"
    },
    {
      "cells": [
        "RISMRRDAdmin",
        "Tester02"
      ],
      "line": 13,
      "id": "this-is-to-test-the-login-functionality;to-test-the-customer-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "To test the customer login functionality",
  "description": "",
  "id": "this-is-to-test-the-login-functionality;to-test-the-customer-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User login to the retail application with URL",
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 5,
    "value": "https://ism-qa.rrd.com/retailism/"
  }
});
formatter.step({
  "line": 8,
  "name": "User enter the \"RISMRRDAdmin\" and \"Tester02\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should login application successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_login_to_the_retail_application_with_URL(String)"
});
formatter.result({
  "duration": 9682365358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RISMRRDAdmin",
      "offset": 16
    },
    {
      "val": "Tester02",
      "offset": 35
    }
  ],
  "location": "Login.user_enter_the_and(String,String)"
});
formatter.result({
  "duration": 2826433296,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_should_login_application_successfully()"
});
formatter.result({
  "duration": 87241,
  "status": "passed"
});
formatter.uri("src/test/resources/features/Specification.feature");
formatter.feature({
  "line": 1,
  "name": "To test Specification functionality for Pricing selected as Basic",
  "description": "",
  "id": "to-test-specification-functionality-for-pricing-selected-as-basic",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User login to the retail application with URL",
  "keyword": "Given ",
  "doc_string": {
    "content_type": "",
    "line": 5,
    "value": "https://ism-qa.rrd.com/retailism/"
  }
});
formatter.step({
  "line": 8,
  "name": "User enter the \"arun.jacob@ulta.com\" and \"Password1\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_login_to_the_retail_application_with_URL(String)"
});
formatter.result({
  "duration": 4322654380,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arun.jacob@ulta.com",
      "offset": 16
    },
    {
      "val": "Password1",
      "offset": 42
    }
  ],
  "location": "Login.user_enter_the_and(String,String)"
});
formatter.result({
  "duration": 1618543096,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "To Pricing Method as Basic",
  "description": "",
  "id": "to-test-specification-functionality-for-pricing-selected-as-basic;to-pricing-method-as-basic",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User login and navigate to Item Management module",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User navigates to Specification module and click New Specification",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter mandatory field details in Print Specification and click Next",
  "rows": [
    {
      "cells": [
        "Category",
        "ProductType",
        "PrintMethod",
        "Substrate",
        "Width",
        "Height",
        "Depth",
        "Color",
        "InlineFinishing",
        "OfflineFinishing"
      ],
      "line": 14
    },
    {
      "cells": [
        "General",
        "Bin Strip Bath",
        "Digitalsss",
        "11.5 Blockout",
        "29",
        "4128",
        "10",
        "3/0",
        "Laminate front.",
        "Follow dieline."
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enter all mandatory fields in the Pricing and Multipiers and click Finish",
  "rows": [
    {
      "cells": [
        "SellPrice",
        "UOM",
        "Pieces",
        "Multiple",
        "ItemMultiplier"
      ],
      "line": 17
    },
    {
      "cells": [
        "25",
        "Box",
        "22",
        "132",
        "Exclude Stores"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should successfully save see the message",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 20,
    "value": "Your specification has been updated."
  }
});
formatter.match({
  "location": "Specification.user_login_and_navigate_to_Item_Management_module()"
});
formatter.result({
  "duration": 3797256550,
  "status": "passed"
});
formatter.match({
  "location": "Specification.user_navigates_to_Specification_module_and_click_New_Specification()"
});
formatter.result({
  "duration": 4764171523,
  "status": "passed"
});
formatter.match({
  "location": "Specification.user_enter_mandatory_field_details_in_Print_Specification_and_click_Next(DataTable)"
});
formatter.result({
  "duration": 6310616503,
  "status": "passed"
});
formatter.match({
  "location": "Specification.user_enter_all_mandatory_fields_in_the_Pricing_and_Multipiers_and_click_Finish(DataTable)"
});
formatter.result({
  "duration": 20486740116,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.xpath: //*[@id\u003d\u0027sellPrice\u0027]/input (tried for 20 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027TRLAPTIDCSTB4\u0027, ip: \u002710.30.44.59\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\rr236254\\AppData\\Local\\Temp\\scoped_dir10884_7144}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d62.0.3202.94, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 3024fa9bc9fffbc987d669e3fcf0178d\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:82)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:231)\r\n\tat com.rism.objects.SpecificationStepTwo.pricingMultipier(SpecificationStepTwo.java:48)\r\n\tat com.rism.when.Specification.user_enter_all_mandatory_fields_in_the_Pricing_and_Multipiers_and_click_Finish(Specification.java:19)\r\n\tat ✽.And User enter all mandatory fields in the Pricing and Multipiers and click Finish(src/test/resources/features/Specification.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Specification.user_should_successfully_save_see_the_message(String)"
});
formatter.result({
  "status": "skipped"
});
});