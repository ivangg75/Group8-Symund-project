package com.symund.step_definitions;


import com.symund.pages.LoginPage;
import com.symund.pages.US13_ProfileSettingsPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

public class US13_StepDefs {

    private LoginPage loginPage;
    private US13_ProfileSettingsPage profileSettingsPage;

    public US13_StepDefs(){
        loginPage = new LoginPage();
        profileSettingsPage = new US13_ProfileSettingsPage();
    }

    @Given("user is logged in")
    public void userIsLoggedIn() {
        loginPage.login();
    }

    @When("user clicks profile settings")
    public void userClicksProfileSettings(){
        profileSettingsPage.profileSettingsLink.click();
    }

    @Then("the Full name Email and Phone Number titles should be visible")
    public void theFullNameEmailPhoneNumberTitlesShouldBeVisible(){
        Assert.assertEquals("Full name", profileSettingsPage.fullNameTitle.getText());
        Assert.assertEquals("Email", profileSettingsPage.emailTitle.getText());
        Assert.assertEquals("Phone number", profileSettingsPage.phoneNumberTitle.getText());
    }

    @Then("the text in the Full name text box should match the text in the settings field")
    public void theTextInTheFullNameTextBoxShouldMatchTheTextInTheSettingsField(){
        Assert.assertEquals(profileSettingsPage.fullNameTextBox.getAttribute("value").trim(), profileSettingsPage.settingsName.getText().trim());
    }

    @And("user enters characters other than numbers in the \"phone number\" text box")
    public void userEntersCharactersOtherThanNumbersInThePhoneNumberTextBox(){
        profileSettingsPage.phoneNumberInputBox.sendKeys("abcd");
        profileSettingsPage.phoneNumberInputBox.sendKeys(Keys.ENTER);
    }

    @Then("the user should receive an error")
    public void theUserShouldReceiveAnError(){
        Assert.assertEquals("Unable to set invalid phone number", Driver.getDriver().switchTo().alert().getText().trim());
    }




}
