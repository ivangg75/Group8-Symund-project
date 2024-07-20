
Feature: Deck Module Management

  Scenario: User creates a new board
    Given user is logged in
    When user creates a new board named "Test Board"
    Then the new board "Test Board" should be visible

  Scenario: User creates a new list on a board
    Given user is on the "Test Board"
    When user creates a new list named "To Do"
    Then the new list "To Do" should be visible on the board

  Scenario: User creates a new card on a list
    Given user is on the "Test Board"
    And there is a list named "To Do"
    When user creates a new card named "Test Task" on the list
    Then the new card "Test Task" should be visible on the list

  Scenario: User assigns a card to themselves
    Given user is on the "Test Board"
    And there is a card named "Test Task"
    When user assigns the card to themselves
    Then the card "Test Task" should show the user as the assignee
