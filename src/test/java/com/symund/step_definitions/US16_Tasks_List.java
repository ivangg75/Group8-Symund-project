package com.symund.step_definitions;

import com.symund.pages.LoginPage_Zac;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class US16_Tasks_List {
    String GREEN = "\u001B[32m";
    LoginPage_Zac loginPage_Zac = new LoginPage_Zac();

    @Given("the user is logged into the Symund webpage.")
    public void the_user_is_logged_into_the_Symund_webpage() {
        loginPage_Zac.openLoginPage();
        loginPage_Zac.login("User3","Userpass123");
    }


    @When("the user navigates the {string} section")
    public void theUserNavigatesToTheSection(String arg0) {


    }

    @And("the user navigate by clicking on {string}")
    public void theUserNavigateByClickingOn(String arg0) {
    }

    @And("the user enters a name for the new task list")
    public void theUserEntersANameForTheNewTaskList() {
    }

    @Then("the new task list is created")
    public void theNewTaskListIsCreated() {
    }

    @Given("the user is on the {string} webpage we created.")
    public void theUserIsOnTheWebpageWeCreated(String arg0) {
    }

    @When("the user navigates to the {string}NewTaskList{string} section .")
    public void theUserNavigatesToTheNewTaskListSection(String arg0, String arg1) {
    }

    @And("the user navigate by clicking on the {string}NewTaskList{string} placeholder section.")
    public void theUserNavigateByClickingOnTheNewTaskListPlaceholderSection(String arg0, String arg1) {
    }

    @And("the user enters a name for the new task list --> {string} and enter.")
    public void theUserEntersANameForTheNewTaskListAndEnter(String arg0) {
    }

    @Then("the new task in the previous task list is created.")
    public void theNewTaskInThePreviousTaskListIsCreated() {
    }

    @When("the user navigates to the {string} tab section .")
    public void theUserNavigatesToTheTabSection(String arg0) {
    }

    @And("the user navigate by clicking on the {string}on the left side of the tab section.")
    public void theUserNavigateByClickingOnTheOnTheLeftSideOfTheTabSection(String arg0) {
    }

    @Then("the task is under {string} list.")
    public void theTaskIsUnderList(String arg0) {
    }

    @And("the user navigate by clicking on the {string} icon on the right side of the tab section.")
    public void theUserNavigateByClickingOnTheIconOnTheRightSideOfTheTabSection(String arg0) {
    }

    @Then("the task is added to {string} section.")
    public void theTaskIsAddedToSection(String arg0) {
    }

    @When("the user navigates to the {string} tab section by clicking on it.")
    public void theUserNavigatesToTheTabSectionByClickingOnIt(String arg0) {
    }

    @Then("the tasks we created are listed in the page.")
    public void theTasksWeCreatedAreListedInThePage() {
    }

}
