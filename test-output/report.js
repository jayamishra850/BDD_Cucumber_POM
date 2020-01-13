$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/prctice of java/Selenium/BDD_Cucmber_POM/src/main/java/com/features/bddpom.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate facebook Homepage",
  "description": "",
  "id": "facebook-login-feature;validate-facebook-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is Present on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate the home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_the_browser()"
});
formatter.result({
  "duration": 17922625100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_Present_on_Login_Page()"
});
formatter.result({
  "duration": 408273100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1795220900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3185738700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_the_home_page_title()"
});
formatter.result({
  "duration": 12362900,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]Facebook\u003e but was:\u003c[Log in to Facebook | ]Facebook\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.stepDefinitions.HomePageSteps.validate_the_home_page_title(HomePageSteps.java:44)\r\n\tat ✽.Then Validate the home page title(D:/prctice of java/Selenium/BDD_Cucmber_POM/src/main/java/com/features/bddpom.feature:9)\r\n",
  "status": "failed"
});
});