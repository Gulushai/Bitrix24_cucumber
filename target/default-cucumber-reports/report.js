$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/bitrix24/features/Login/LoginMarketing.feature");
formatter.feature({
  "name": "Login using Marketing credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a task from Activity Stream",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a \"marketing\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginMarketingStepDef.i_login_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});