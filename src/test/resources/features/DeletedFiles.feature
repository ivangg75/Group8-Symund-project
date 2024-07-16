
Feature: Deleted Files management
  As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.


  Background: User is already in the log in page
    Given the user is on the login page
    When user enters the user information
    Then user should see Dashboard on title

  Scenario: AC1 User can order the all deleted files alphabetically
    When user click on Files tab
    And user select Deleted files tab
    When the user navigates to the Name tab
    Then the user should be able to order deleted files alphabetically


  Scenario: AC2 User can delete any deleted file permanently by using the three dots icon in the file’s line
    When user click on Files tab
    And user select Deleted files tab
    And the user clicks the three dots icon next to a deleted file
    And the user selects Delete permanently
    Then the file should no longer be present in the Deleted Files list

  @wip
  Scenario: AC3 User can restore any deleted file and see it again under the All Files tab
    When user click on Files tab
    And user select Deleted files tab
    And user click on Restore tab
    Then the user should be able to restore file to All Files folder
