package com.symund.step_definitions;

import com.symund.pages.ActivityPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Collections;
import java.util.Comparator;

public class activityStepDefs {

    ActivityPage activityPage = new ActivityPage();

    @When("user clicks the activity tab")
    public void user_clicks_the_activity_tab() {
        activityPage.activityTab.click();
        //it worked!!!!
    }




    @Then("user will see newest items at the top")
    public void user_will_see_newest_items_at_the_top() {

        BrowserUtils.verifyElementDisplayed(By.xpath("//*[@id=\"container\"]/div[1]/div[2]/div/span"));
        System.out.println("newest date: " + activityPage.newestDate.getText());


    }


    @Then("user will see no more activities at the bottom of the page")
    public void userWillSeeNoMoreActivitiesAtTheBottomOfThePage() {
        BrowserUtils.scrollToElement(activityPage.noMoreActivities);
        BrowserUtils.verifyElementDisplayed(activityPage.noMoreActivities);


    }



}
