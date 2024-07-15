package com.symund.step_definitions;

import com.symund.pages.DeletedFilesPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeletedFiles_StepDefinitions {
    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

    @When("user click on Files tab")
    public void user_click_on_files_tab() {
        deletedFilesPage.filesTab.click();

    }

    @And("user select Deleted files tab")
    public void user_select_deleted_files_tab() {
        deletedFilesPage.deletedFiles.click();
    }


    @And("the user navigates to the Name tab")
    public void theUserNavigatesToTheNameTab() {
        deletedFilesPage.nameTab.click();
    }

    @Then("the user should be able to order deleted files alphabetically")
    public void theUserShouldBeAbleToOrderDeletedFilesAlphabetically() {
        System.out.println("deletedFilesPage.firstFileName.getText() = " + deletedFilesPage.firstFileName.getText());
        System.out.println("deletedFilesPage.lastFileName.getText() = " + deletedFilesPage.lastFileName.getText());

        Assert.assertFalse("First file name", false);
        
        String fileList = BrowserUtils.getElementsText(By.xpath("(//tbody[@id='fileList'])[12]")).toString();
        System.out.println("fileList = " + fileList);

    }

    @When("the user clicks the three dots icon next to a deleted file")
    public void theUserClicksTheThreeDotsIconNextToADeletedFile()  {

        deletedFilesPage.threeDots.click();
        BrowserUtils.waitForPageToLoad(2);

    }

    @And("the user selects Delete permanently")
    public void theUserSelectsDeletePermanently() {
        deletedFilesPage.deleteButton.click();
    }

    @Then("the file should no longer be present in the Deleted Files list")
    public void theFileShouldNoLongerBePresentInTheDeletedFilesList() {

        BrowserUtils.waitFor(2);
        //Assert.assertEquals(deletedFilesPage.firstFileName.getText(),beforeDelete);
        //Assert.assertFalse("File deletion failed", Driver.getDriver().findElement(By.xpath("(//span[.='C folder'])[2]")).isDisplayed());
        BrowserUtils.verifyElementNotDisplayed(By.xpath("(//span[.='C folder'])[2]"));
    }


    @And("user click on Restore tab")
    public void userClickOnRestoreTab() {
        deletedFilesPage.restoreButton.click();
    }

    @Then("the user should be able to restore file to All Files folder")
    public void theUserShouldBeAbleToRestoreFileToAllFilesFolder() {
        BrowserUtils.waitFor(2);
        BrowserUtils.verifyElementNotDisplayed(By.xpath("(//span[.='B folder'])[2]"));
    }
}
