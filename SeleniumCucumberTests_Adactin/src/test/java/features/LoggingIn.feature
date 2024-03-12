Feature: LoggingIn

  Scenario:  Scenario: Validate a registered user is able to login
    Given User navigates to the Login page
    When User Enters Correct details to login
    Then User should be able to view the Landing page