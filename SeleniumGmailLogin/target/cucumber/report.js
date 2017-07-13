$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Peter_Hegedus2/Desktop/Programs/SeleniumGmailLogin/src/main/resources/gmailLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8133102510,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login without credentials",
  "description": "",
  "id": "login;login-without-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the use is on the gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "tries to go to the enter password page without entering the email or username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the enter an email or phone number error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CorrectedTestSteps.the_use_is_on_the_gmail_login_page()"
});
formatter.result({
  "duration": 4138321053,
  "status": "passed"
});
formatter.match({
  "location": "CorrectedTestSteps.tries_to_go_to_the_enter_password_page_without_entering_the_email_or_username()"
});
formatter.result({
  "duration": 1608000,
  "error_message": "java.lang.NullPointerException\r\n\tat PageObject.LoginPage.nextButton(LoginPage.java:30)\r\n\tat StepDefinition.CorrectedTestSteps.tries_to_go_to_the_enter_password_page_without_entering_the_email_or_username(CorrectedTestSteps.java:46)\r\n\tat ✽.When tries to go to the enter password page without entering the email or username(C:/Users/Peter_Hegedus2/Desktop/Programs/SeleniumGmailLogin/src/main/resources/gmailLogin.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CorrectedTestSteps.the_enter_an_email_or_phone_number_error_message_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1380784574,
  "status": "passed"
});
formatter.before({
  "duration": 6046778274,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login with invalid username",
  "description": "",
  "id": "login;login-with-invalid-username",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the use is on the gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the user enters a not existing email or username",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the Couldn\u0027t find your Google Account error messahe should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CorrectedTestSteps.the_use_is_on_the_gmail_login_page()"
});
formatter.result({
  "duration": 3882974925,
  "status": "passed"
});
formatter.match({
  "location": "CorrectedTestSteps.the_user_enters_a_not_existing_email_or_username()"
});
formatter.result({
  "duration": 44321527,
  "error_message": "java.lang.NullPointerException\r\n\tat PageObject.LoginPage.emailOrPhone(LoginPage.java:20)\r\n\tat StepDefinition.CorrectedTestSteps.the_user_enters_a_not_existing_email_or_username(CorrectedTestSteps.java:65)\r\n\tat ✽.When the user enters a not existing email or username(C:/Users/Peter_Hegedus2/Desktop/Programs/SeleniumGmailLogin/src/main/resources/gmailLogin.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CorrectedTestSteps.the_Couldn_t_find_your_Google_Account_error_messahe_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1385648992,
  "status": "passed"
});
formatter.before({
  "duration": 4995870458,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login with invalid password",
  "description": "",
  "id": "login;login-with-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "the use is on the gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the user enters a valid username or password",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the user enters an invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the Wrong password. Try again. error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CorrectedTestSteps.the_use_is_on_the_gmail_login_page()"
});
formatter.result({
  "duration": 4111169812,
  "status": "passed"
});
formatter.match({
  "location": "CorrectedTestSteps.the_user_enters_a_valid_username_or_password()"
});
formatter.result({
  "duration": 25433861,
  "error_message": "java.lang.NullPointerException\r\n\tat PageObject.LoginPage.emailOrPhone(LoginPage.java:20)\r\n\tat StepDefinition.CorrectedTestSteps.the_user_enters_a_valid_username_or_password(CorrectedTestSteps.java:87)\r\n\tat ✽.When the user enters a valid username or password(C:/Users/Peter_Hegedus2/Desktop/Programs/SeleniumGmailLogin/src/main/resources/gmailLogin.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CorrectedTestSteps.the_user_enters_an_invalid_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CorrectedTestSteps.the_Wrong_password_Try_again_error_message_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1384974421,
  "status": "passed"
});
formatter.before({
  "duration": 5162507774,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Successful login",
  "description": "",
  "id": "login;successful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "the use is on the gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user enters a valid username or password",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the user enters an valid password",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the user should be on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CorrectedTestSteps.the_use_is_on_the_gmail_login_page()"
});
formatter.result({
  "duration": 4023520812,
  "status": "passed"
});
formatter.match({
  "location": "CorrectedTestSteps.the_user_enters_a_valid_username_or_password()"
});
formatter.result({
  "duration": 29160199,
  "error_message": "java.lang.NullPointerException\r\n\tat PageObject.LoginPage.emailOrPhone(LoginPage.java:20)\r\n\tat StepDefinition.CorrectedTestSteps.the_user_enters_a_valid_username_or_password(CorrectedTestSteps.java:87)\r\n\tat ✽.When the user enters a valid username or password(C:/Users/Peter_Hegedus2/Desktop/Programs/SeleniumGmailLogin/src/main/resources/gmailLogin.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CorrectedTestSteps.the_user_enters_an_valid_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CorrectedTestSteps.the_user_should_be_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1386294373,
  "status": "passed"
});
});