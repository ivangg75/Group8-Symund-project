package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enters the user information")
    public void userEntersTheUserInformation() {
        loginPage.login();
    }



    @When("user enters the employee information")
    public void userEntersTheEmployeeInformation() {
        loginPage.loginEmployee();

    }

    @Then("user should see Dashboard on title")
    public void userShouldSeeDashboardOnTitle() {

        BrowserUtils.verifyTitleContains("Dashboard");
    }
}

