package com.symund.step_definitions;

import com.symund.pages.ProfileSettingsPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ProfileSettings_StepDefs {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();

    @Given("user is on the Symund settings page")
    public void user_is_on_the_symund_settings_page() {

        Driver.getDriver().get("https://qa.symund.com/index.php/settings/user");

    }

    @When("user click to user icon from the top right")
    public void user_click_to_user_icon_from_the_top_right() {

        profileSettingsPage.userButton.click();

    }

    @Then("user should see same full name and username")
    public void user_should_see_same_full_name_and_username() {

        String fullName = profileSettingsPage.fullNameBox.getAttribute("value");
        String actualUserName = profileSettingsPage.profileName.getText();

        Assert.assertEquals(fullName, actualUserName);

    }

    @When("user enter a proper e-mail to Email input box")
    public void user_enter_a_proper_e_mail_to_email_input_box() {

        profileSettingsPage.emailInputBox.sendKeys("shuhratkhojaev2002@gmail.com" + Keys.ENTER);

    }

    @Then("user verify checmark turns on in the Email input box")
    public void user_verify_checmark_turns_on_in_the_email_input_box() {

        profileSettingsPage.emailCheckmark.isDisplayed();

    }

    @When("user click select Language")
    public void user_click_select_language() {

    }
    @When("user click Italiano")
    public void user_click_italiano() {

    }

    @Then("user verify language is Italiano")
    public void user_verify_language_is_italiano() {

    }


}
