@B34G8-210
Feature: Default

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to search file or contact from the Dashboard
	#
	#{color:#de350b}*_Acceptance Criteria 1:_*{color}
	#
	#User can search file typing its name through the magnifying glass icon inside any Module and see the details side page of the file when clicked on it.
  @B34G8-209
  Scenario Outline: Verify user can search file typing its name through the magnifying glass icon inside any Module and see the details side page of the file when clicked on it
    Given the user is on the login page
    And user enters the user information
    Then user should see Dashboard on title
    And user clicks on the "<module>" Module
    Then user clicks on the magnifying glass icon inside the Module
    And user types the file's name "ReadMe"
    And user clicks on the search result for the file
    Then user should see the details side page of the file
    Examples:
      | module    |
      | dashboard |
      | files     |
      | photos    |
      | activity  |
      | spreed    |
      | mail      |
      | contacts  |
      | circles   |
      | calendar  |
      | notes     |
      | deck      |
      | tasks     |


	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to search file or contact from the Dashboard
	#
	#{color:#de350b}*_Acceptance Criteria 2:_*{color}
	#
	#User can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page.
  @B34G8-208
  Scenario Outline: Verify user can navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page
    Given the user is on the login page
    When user enters the user information
    And user clicks on the "<module>" Module
    And user clicks on the SYMUND icon at the top left corner of the page
    Then user should be navigated to the Dashboard page
    Examples:
      | module    |
      | dashboard |
      | files     |
      | photos    |
      | activity  |
      | spreed    |
      | mail      |
      | contacts  |
      | circles   |
      | calendar  |
      | notes     |
      | deck      |
      | tasks     |