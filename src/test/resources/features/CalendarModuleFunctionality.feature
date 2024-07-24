@B34G8-230
Feature: Calendar Module Functionality

  Background: Login as user
    Given User is on the calendar page
	
#	@B34G8-226
#	Scenario: User can display daily calendar view
#		    When User clicks on daily view
#		    Then User should see the daily calendar
#
#
#	@B34G8-227
#	Scenario: User can display weekly calendar view
#		    When User clicks on weekly view
#		    Then User should see the weekly calendar
#
#
#	@B34G8-228
#	Scenario: User can display monthly calendar view
#		    When User clicks on monthly view
#		    Then User should see the monthly calendar


  @B34G8-226 @B34G8-227 @B34G8-228
  Scenario Outline: User can select "<view>" calendar view
    When User clicks on the calendar view button
    And User select "<view>" view
    Then User should see the "<view>" calendar

    Examples:
      | view  |
      | Day   |
      | Week  |
      | Month |

  @B34G8-229
  Scenario: User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
    When User creates a new event with title "Team Meeting" on today date
    When User clicks on the calendar view button
    And User select "Month" view
    Then User verifies the event "Team Meeting" is displayed in monthly view