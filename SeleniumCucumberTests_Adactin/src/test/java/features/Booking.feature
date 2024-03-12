Feature: Booking

#  Scenario: Verify User is to book a room
#    Given User has logged in the app as a Guest
#    When User books a room for a future date
#    Then User should should see matching booking details

  Scenario: Verify User cannot book a room for a future date
    Given User has logged in the app as a Guest
    When User books for a room using a past date
