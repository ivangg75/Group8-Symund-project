@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  @user
  Scenario: Login as user
    When user enters the user information
    Then user should see Dashboard on title

  @employee
  Scenario: Login as employee
    When user enters the employee information
    Then user should see Dashboard on title


