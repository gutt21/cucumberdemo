$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:feature/login.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login details of orangehd",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepclass.user_launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter url \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepclass.user_enter_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email id \"Admin\" and  password \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepclass.user_enter_email_id_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepclass.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepclass.user_verify_login()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cOrangeHR[M]\u003e but was:\u003cOrangeHR[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat pageobject.loginpage.verify(loginpage.java:47)\r\n\tat base.stepclass.user_verify_login(stepclass.java:57)\r\n\tat ✽.user verify login(file:feature/login.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepclass.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});