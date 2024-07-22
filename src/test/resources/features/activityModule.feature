@B34G8-225
Feature: As a user, I should be able to see listed items under the Activity module

	Background: User is already in the log in page
		Given the user is on the login page
		When user enters the user information
		Then user should see Dashboard on title

	
	@B34G8-222
	Scenario: User can display all listed items under the Activity module
				When user clicks the activity tab


	
	@B34G8-223
	Scenario: User can see all items list ordered by newest to oldest
				When user clicks the activity tab
				Then user will see newest items at the top


	
	@B34G8-224
	Scenario: User can see "No more events to load" message at the end of the "All Activities" tab
				When user clicks the activity tab
				And user scrolls down to bottom of page
				Then user should be able to see message No more events to load
