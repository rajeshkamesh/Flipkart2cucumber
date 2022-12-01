$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Resources/Wool.feature");
formatter.feature({
  "name": "Wool",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wool"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login the flipkart",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.login_the_flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search mobile by using oneD list",
  "rows": [
    {
      "cells": [
        "redmi",
        "realme"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.search_mobile_by_using_oneD_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select mobile",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buy the mobile",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.buy_the_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wool"
    }
  ]
});
formatter.step({
  "name": "login the flipkart",
  "keyword": "Given "
});
formatter.step({
  "name": "search mobile \"\u003cphone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "select mobile",
  "keyword": "And "
});
formatter.step({
  "name": "add to cart",
  "keyword": "And "
});
formatter.step({
  "name": "buy the mobile",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "phone"
      ]
    },
    {
      "cells": [
        "Realme"
      ]
    },
    {
      "cells": [
        "Redmi"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wool"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login the flipkart",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.login_the_flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search mobile \"Realme\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.search_mobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select mobile",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buy the mobile",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.buy_the_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wool"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login the flipkart",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.login_the_flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search mobile \"Redmi\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.search_mobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select mobile",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buy the mobile",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.buy_the_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});