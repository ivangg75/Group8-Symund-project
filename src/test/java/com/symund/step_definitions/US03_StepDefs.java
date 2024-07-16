package com.symund.step_definitions;

import com.symund.pages.ContactsModulesPage_FSF;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_StepDefs {
    ContactsModulesPage_FSF contactsModulesPage_fsf = new ContactsModulesPage_FSF();

    @And("user click Contacts module on top of the web page application")
    public void userClickContactsModuleOnTopOfTheWebPageApplication() {
        contactsModulesPage_fsf.contactsBtn.click();
    }

    @Given("user click New contact button")
    public void user_click_new_contact_button() {
        contactsModulesPage_fsf.createNewContactBtn.click();

    }

    @Given("user should be able enter new contact info")
    public void user_should_be_able_enter_new_contact_info() {
        BrowserUtils.sleep(2);
        contactsModulesPage_fsf.fullNameBox.clear();
        contactsModulesPage_fsf.fullNameBox.sendKeys("John Doe");

        contactsModulesPage_fsf.companyBox.sendKeys("John Doe");
        //contactsModulesPage_fsf.titleBox.sendKeys("CEO");
       // contactsModulesPage_fsf.emailBox.sendKeys("jd@amazon.com");
        BrowserUtils.sleep(2);

    }

    @Then("verify new contact is created")
    public void verify_new_contact_is_created() {

        String expectedTotalContacts = "1";
        Assert.assertEquals(expectedTotalContacts, contactsModulesPage_fsf.totalNumberOfContactsBtn.getText());

    }
    //__________________


    @And("user clicks All contacts button")
    public void userClicksAllContactsButton() {
        contactsModulesPage_fsf.allContactsBtn.click();

    }

    @Then("verify user see total number of the contacts near the All Contacts tab")
    public void verifyUserSeeTotalNumberOfTheContactsNearTheAllContactsTab() {

        String expectedTotalContacts = "1";
        Assert.assertEquals(expectedTotalContacts, contactsModulesPage_fsf.totalNumberOfContactsBtn.getText());

    }
    //___________________

    @And("user click John Doe contact info")
    public void userClickJohnDoeContactInfo() {
        contactsModulesPage_fsf.johnDoe.click();
BrowserUtils.sleep(2);
    }

    @And("user click John Doe profile pictures bottom right conor")
    public void userClickJohnDoeProfilePicturesBottomRightConor() {
        contactsModulesPage_fsf.profilePicBtn.click();

    }

    @When("user click Choose from File option")
    public void user_click_choose_from_file_option() {
        contactsModulesPage_fsf.chooseFileBtn.click();

    }

    @When("user click desired picture")
    public void user_click_desired_picture() {
        contactsModulesPage_fsf.imgFile.click();

    }

    @When("user click Choose button")
    public void user_click_choose_button() {
        contactsModulesPage_fsf.chooseBtn.click();
    }

    //__________________

    @When("user clicks John Doe contact to delete")
    public void user_clicks_johndoe_contact_to_delete() {
        contactsModulesPage_fsf.johnDoe.click();


    }

    @When("user clicks tree dots button on top left side of contacts")
    public void user_clicks_tree_dots_button_on_top_left_side_of_contacts() {
        contactsModulesPage_fsf.buttonActions.click();


    }

    @When("user clicks Delete button")
    public void user_clicks_delete_button() {
        contactsModulesPage_fsf.deleteBtn.click();

    }

    @Then("verify that deleted contact no longer exist in contacts")
    public void verify_that_deleted_contact_no_longer_exist_in_contacts() {
        contactsModulesPage_fsf.allContactsBtn.click();
        String expectedMessage = "There are no contacts yet";
        Assert.assertEquals(expectedMessage, contactsModulesPage_fsf.noContactsFound.getText());

    }
}


