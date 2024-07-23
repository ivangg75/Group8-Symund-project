Feature: Log out functionality

  Scenario: user should be able to log out
    Given user is on symund login page
    When user enters correct username
    And user enters correct password
    And user clicks to login button
    Then user should see symund home page

Scenario: user should be able to log out
  Given user clicks to Ubutton
  And user sees Log out button
  Then user clicks to Log out button