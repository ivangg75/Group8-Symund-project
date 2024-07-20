@B34G8-249
Feature: Default

	Background:
		#@B34G8-197
		 Given the user is on the login page
		    When user enters the user information
		    Then user should see Dashboard on title
		

	
	@B34G8-236
	Scenario: Verify full name and username should be the same on Profile Settings
		Given user is on the Symund settings page
		  When user click to user icon from the top right
		  Then user should see same full name and username	

	
	@B34G8-237
	Scenario: Profile Settings Functionality changing email
		Given user is on the Symund settings page
		  When user enter a proper e-mail to Email input box
		  Then user verify checmark turns on in the Email input box	

	
	@B34G8-238
	Scenario: Profile Settings Functionality changing language
		Given user is on the Symund settings page
		  When user click select Language 
		  And user click Italiano 
		  Then user verify language is Italiano