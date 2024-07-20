package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US16_TaskList {
    LoginPage loginPage = new LoginPage();


    @Given("the user is logged into the Symund webpage.")
    public void the_user_is_logged_into_the_symund_webpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user navigates to the Tasks section")
    public void the_user_navigates_to_the_tasks_section() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.login();
        loginPage.TaskButton.click();
    }

    @When("the user navigate by clicking on Add List")
    public void the_user_navigate_by_clicking_on_add_list() {

        loginPage.TaskList.click();
    }

    @When("the user enters a name for the new task list")
    public void the_user_enters_a_name_for_the_new_task_list() {
        loginPage.TaskList.sendKeys("MyUS16TaskList" + Keys.ENTER);
    }

    @Then("the new task list is created")
    public void the_new_task_list_is_created() {
        String expectedTxt = "MyUS16TaskList";
        String actualTxt = loginPage.TaskList.getText();
        Assert.assertTrue(expectedTxt.equals(actualTxt));
    }


    @When("the user navigates to the NewTaskList section")
    public void the_user_navigates_to_the_new_task_list_section() throws InterruptedException {


    }

    @When("the user navigate by clicking on the NewTaskList placeholder section.")
    public void the_user_navigate_by_clicking_on_the_new_task_list_placeholder_section() throws InterruptedException {
        loginPage.newTaskList.click();
        loginPage.newTaskListInput.sendKeys("TaskTest" + Keys.ENTER);
    }

    @When("the user enters a name for the new task list --> TaskTest and enter.")
    public void the_user_enters_a_name_for_the_new_task_list_task_test_and_enter() {


    }

    @Then("the new task in the previous task list is created.")
    public void the_new_task_in_the_previous_task_list_is_created() {
       // LoginPage loginPage = new LoginPage();
       // BrowserUtils.verifyElementDisplayed(WebElement loginPage.TaskTest);
    }


    @When("the user navigates to the TaskTest tab section .")
    public void the_user_navigates_to_the_task_test_tab_section() {

    }

    @When("the user navigate by clicking on the Checkbox on the left side of the tab section.")
    public void the_user_navigate_by_clicking_on_the_checkbox_on_the_left_side_of_the_tab_section() {
        loginPage.TaskTestChkBx.click();
    }

    @Then("the task is under Completed Task list.")
    public void the_task_is_under_completed_task_list() {
        System.out.println("The task is under Completed Task list");
    }

    @Given("the user is on the CompletedTask webpage.")
    public void the_user_is_on_the_completed_task_webpage() {
        loginPage.CompletedSec.click();
        System.out.println("The user is on the CompletedTask webpage");
    }

    @When("the user navigate by clicking on the STAR icon on the right side of the tab section.")
    public void the_user_navigate_by_clicking_on_the_star_icon_on_the_right_side_of_the_tab_section() {
        loginPage.STAR.click();
    }

    @Then("the task is added to Important section.")
    public void the_task_is_added_to_important_section() {
        System.out.println("Important section");

    }


    @Given("the user is on the NewTaskList webpage we created.")
    public void the_user_is_on_the_new_task_list_webpage_we_created() {

    }

    @When("the user navigates to the Current tab section by clicking on it.")
    public void the_user_navigates_to_the_current_tab_section_by_clicking_on_it() {
        loginPage.CurrentSec.click();
    }

    @Then("the tasks we created are listed in the page.")
    public void the_tasks_we_created_are_listed_in_the_page() {


    }

}
