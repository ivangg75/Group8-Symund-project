package com.symund.step_definitions;

import com.symund.pages.LogOutPage_Lionel;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US17_StepDefs {

    @Given("user is on symund login page")
    public void user_is_on_symund_login_page() {
      Driver.getDriver().get("http://qa.symund.com/");
    }

    LogOutPage_Lionel logOutPage_Lionel = new LogOutPage_Lionel();

    @When("user enters correct username")
    public void user_enters_correct_username() {
    logOutPage_Lionel.inputUsername.sendKeys("User17");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
     logOutPage_Lionel.inputPassword.sendKeys("Userpass123");
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
logOutPage_Lionel.loginButton.click();
    }

    @Then("user should see symund home page")
    public void user_should_see_symund_home_page() {
String actualPage = Driver.getDriver().getCurrentUrl();
String expectedPage = "dashboard";

        Assert.assertTrue(actualPage.contains(expectedPage));
    }



    @Given("user clicks to Ubutton")
    public void user_clicks_to_ubutton() {
    logOutPage_Lionel.uButton.click();
    }
    @Given("user sees Log out button")
    public void user_sees_log_out_button() {

    }
    @Then("user clicks to Log out button")
    public void user_clicks_to_log_out_button() {
        logOutPage_Lionel.logoutButton.click();

    }

}
