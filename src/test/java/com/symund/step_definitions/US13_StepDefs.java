package com.symund.step_definitions;

import com.symund.pages.US13_ProfileSettingsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US13_StepDefs {

    private US13_ProfileSettingsPage profileSettingsPage;

    public US13_StepDefs(){
    profileSettingsPage = new US13_ProfileSettingsPage();
    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
    }

    @When("user clicks profile settings")
    public void userClicksProfileSettings(){
        profileSettingsPage.profileSettingsLink.click();
    }

    @Then("the Full name Email and Phone Number titles should be visible")
    public void theFullNameEmailPhoneNumberTitlesShouldBeVisible(){
        profileSettingsPage.fullNameTitle.isDisplayed();
        profileSettingsPage.emailTitle.isDisplayed();
        profileSettingsPage.phoneNumberTitle.isDisplayed();
    }




}
