@B34G8-220
Feature: Default

	
	@B34G8-216
	Scenario: User can create a new contact
		Given the user is on the login page
		When user enters the user information
		And user click Contacts module on top of the web page application
		And user click New contact button
		And user should be able enter new contact info
		Then verify new contact is created	

	
	@B34G8-217
	Scenario: User can see all the contacts as a list inside the middle column and the total number of   the contacts near the “All Contacts” tab
		Given the user is on the login page
		When user enters the user information
		And user click Contacts module on top of the web page application
		And user clicks All contacts button
		Then verify user see total number of the contacts near the All Contacts tab	

	
	@B34G8-218
	Scenario: User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
		Given the user is on the login page
		When user enters the user information
		And user click Contacts module on top of the web page application
		And user click John Doe contact info
		And user click John Doe profile pictures bottom right conor
		And user click Choose from File option
		And user click desired picture
		And user click Choose button	

	
	@B34G8-219
	Scenario: User can delete any selected contact
		Given the user is on the login page
		When user enters the user information
		And user click Contacts module on top of the web page application
		And user clicks All contacts button
		And user clicks John Doe contact to delete
		And user clicks tree dots button on top left side of contacts
		And user clicks Delete button
		Then verify that deleted contact no longer exist in contacts