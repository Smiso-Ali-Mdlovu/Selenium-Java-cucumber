$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Booking.feature");
formatter.feature({
  "line": 1,
  "name": "Booking",
  "description": "",
  "id": "booking",
  "keyword": "Feature"
});
formatter.before({
  "duration": 25385350416,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#  Scenario: Verify User is to book a room"
    },
    {
      "line": 4,
      "value": "#    Given User has logged in the app as a Guest"
    },
    {
      "line": 5,
      "value": "#    When User books a room for a future date"
    },
    {
      "line": 6,
      "value": "#    Then User should should see matching booking details"
    }
  ],
  "line": 8,
  "name": "Verify User cannot book a room for a future date",
  "description": "",
  "id": "booking;verify-user-cannot-book-a-room-for-a-future-date",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User has logged in the app as a Guest",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User books for a room using a past date",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPage.user_has_logged_in_the_app_as_a_Guest()"
});
formatter.result({
  "duration": 3274662334,
  "status": "passed"
});
formatter.match({
  "location": "LandingPage.user_books_for_a_room_using_a_past_date()"
});
formatter.result({
  "duration": 2446515083,
  "status": "passed"
});
formatter.after({
  "duration": 149722875,
  "status": "passed"
});
formatter.uri("LoggingIn.feature");
formatter.feature({
  "line": 1,
  "name": "LoggingIn",
  "description": "",
  "id": "loggingin",
  "keyword": "Feature"
});
formatter.before({
  "duration": 29344236375,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Scenario: Validate a registered user is able to login",
  "description": "",
  "id": "loggingin;scenario:-validate-a-registered-user-is-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Enters Correct details to login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be able to view the Landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "BasePage.user_navigates_to_the_Login_page()"
});
formatter.result({
  "duration": 973042,
  "status": "passed"
});
formatter.match({
  "location": "loginPage.user_enters_correct_details_to_login()"
});
formatter.result({
  "duration": 3437669250,
  "status": "passed"
});
formatter.match({
  "location": "LandingPage.user_should_be_able_to_view_the_Landing_page()"
});
formatter.result({
  "duration": 2042214042,
  "status": "passed"
});
formatter.after({
  "duration": 144445083,
  "status": "passed"
});
});