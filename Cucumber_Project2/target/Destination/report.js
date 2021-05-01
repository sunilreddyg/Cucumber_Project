$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/features/User_login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login page",
  "description": "",
  "id": "facebook-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verifying login with valid data",
  "description": "",
  "id": "facebook-login-page;verifying-login-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "site url at chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Account Page should be Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "User_login_steps.site_url_at_chrome_browser()"
});
formatter.result({
  "duration": 90145400,
  "status": "passed"
});
formatter.match({
  "location": "User_login_steps.user_enter_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 179800,
  "status": "passed"
});
formatter.match({
  "location": "User_login_steps.click_on_Sign_in_button()"
});
formatter.result({
  "duration": 86300,
  "status": "passed"
});
formatter.match({
  "location": "User_login_steps.account_Page_should_be_Displayed()"
});
formatter.result({
  "duration": 298400,
  "status": "passed"
});
});