@B34G8-200
Feature: Default

	Background:
		#@B34G8-197
		 Given the user is on the login page
		    When user enters the user information
		    Then user should see Dashboard on title
		

	
	@B34G8-196
	Scenario: User can order the all deleted files  alphabetically
		When user click on Files tab
		    And user select Deleted files tab
		    When the user navigates to the Name tab
		    Then the user should be able to order deleted files alphabetically

	@B34G8-198
	Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line
		When user click on Files tab
		And user select Deleted files tab
		And the user clicks the three dots icon next to a deleted file
		And the user selects Delete permanently
		Then the file should no longer be present in the Deleted Files list


	@B34G8-199
	Scenario: User can restore any deleted file and see it again under the All Files tab
		When user click on Files tab
		And user select Deleted files tab
		And user click on Restore tab
		Then the user should be able to restore file to All Files folder