Feature: Profile Module

Scenario: User can see at least following titles inside “Personal Info” under Profile Settings page;=> Full name/Email/Phone Number
  Given user is logged in
  When user clicks profile settings
  Then the Full name Email and Phone Number titles should be visible

Scenario: Name of the user in the Settings field should be the same with Full Name input box
  Given user is logged in
  When user clicks profile settings
  Then the text in the "Full name" text box should match the text in the settings field

  Scenario: User cannot pass any characters except numbers into the "Phone Number" input box.
    Given user is logged in
    When user clicks profile settings
    And user enters characters other than numbers in the "phone number" text box
    Then the user should receive an error