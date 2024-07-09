package com.symund.step_definitions;

import com.symund.pages.DeckModulesPage_Praveen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US04_StepDefs {

    private DeckModulesPage_Praveen deckModulesPageEmma; // Declare instance variable

    public US04_StepDefs() {
        deckModulesPageEmma = new DeckModulesPage_Praveen(); // Initialize in constructor
    }

    @Given("User is on the Symund login page")
    public void userIsOnTheSymundLoginPage() {
        deckModulesPageEmma.openLoginPage();
    }

    @When("User logs in with valid credentials")
    public void userLogsInWithValidCredentials() {
        // Replace with actual credentials or use predefined ones
        deckModulesPageEmma.loginWithValidCredentials("User12", "Userpass123");
    }

    @When("User creates a new board")
    public void userCreatesANewBoard() {
        deckModulesPageEmma.createNewBoard();
    }

    @Then("New board should be created successfully")
    public void newBoardShouldBeCreatedSuccessfully() {
        deckModulesPageEmma.verifyBoardCreation();
    }

    @Given("User is on the Symund application homepage")
    public void userIsOnTheSymundApplicationHomepage() {
        deckModulesPageEmma.navigateToHomepage();
    }

    @When("User navigates to a specific board")
    public void userNavigatesToASpecificBoard() {
        // Implement logic to navigate to a specific board
        deckModulesPageEmma.navigateToSpecificBoard();
    }

    @When("User creates a new list of tasks")
    public void userCreatesANewListOfTasks() {
        deckModulesPageEmma.createNewListOfTasks();
    }

    @Then("New list should be added successfully under the board")
    public void newListShouldBeAddedSuccessfullyUnderTheBoard() {
        deckModulesPageEmma.verifyListCreation();
    }

    @Given("User is on a specific board with existing lists")
    public void userIsOnASpecificBoardWithExistingLists() {
        // Implement logic to navigate to a specific board with existing lists
        deckModulesPageEmma.navigateToSpecificBoardWithLists();
    }

    @When("User selects a list")
    public void userSelectsAList() {
        deckModulesPageEmma.selectList();
    }

    @When("User adds a new card or task")
    public void userAddsANewCardOrTask() {
        deckModulesPageEmma.addNewCardOrTask();
    }

    @Then("New card/task should be added successfully to the list")
    public void newCardTaskShouldBeAddedSuccessfullyToTheList() {
        deckModulesPageEmma.verifyCardTaskAdded();
    }

    @Given("User is on a board with assigned cards/tasks")
    public void userIsOnABoardWithAssignedCardsTasks() {
        // Implement logic to navigate to a board with assigned cards/tasks
        deckModulesPageEmma.navigateToBoardWithAssignedTasks();
    }

    @When("User selects a specific card/task")
    public void userSelectsASpecificCardTask() {
        deckModulesPageEmma.selectCardTask();
    }

    @When("User assigns the card/task to themselves")
    public void userAssignsTheCardTaskToThemselves() {
        deckModulesPageEmma.assignCardTaskToSelf();
    }

    @Then("Card/task should be successfully assigned to the user")
    public void cardTaskShouldBeSuccessfullyAssignedToTheUser() {
        deckModulesPageEmma.verifyAssignmentToSelf();
    }
}
