$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FaceBookSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Searching Iphone mobile below 40000",
  "description": "",
  "id": "searching-iphone-mobile-below-40000",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfull Login with valid credentials",
  "description": "",
  "id": "searching-iphone-mobile-below-40000;successfull-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User should launch the broweser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens the URL \"https://www.flipkart.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Close button the login popup",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Search box in home page and Enter the \"Iphone\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "apply the filters",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Get the Mobile name and Price",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Store in in CSV file",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close the broser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_should_launch_the_broweser()"
});
formatter.result({
  "duration": 5910082788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.flipkart.com/",
      "offset": 20
    }
  ],
  "location": "Steps.user_opens_the_URL(String)"
});
formatter.result({
  "duration": 2417790801,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Close_button_the_login_popup()"
});
formatter.result({
  "duration": 314024352,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 48
    }
  ],
  "location": "Steps.click_on_Search_box_in_home_page_and_Enter_the(String)"
});
formatter.result({
  "duration": 296709943,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_the_Search_button()"
});
formatter.result({
  "duration": 160639789,
  "status": "passed"
});
formatter.match({
  "location": "Steps.apply_the_filters()"
});
formatter.result({
  "duration": 1017799960,
  "status": "passed"
});
formatter.match({
  "location": "Steps.get_the_Mobile_name_and_Price()"
});
formatter.result({
  "duration": 4693404963,
  "status": "passed"
});
formatter.match({
  "location": "Steps.store_in_in_CSV_file()"
});
formatter.result({
  "duration": 1281904605,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_the_broser()"
});
formatter.result({
  "duration": 1184575053,
  "status": "passed"
});
});