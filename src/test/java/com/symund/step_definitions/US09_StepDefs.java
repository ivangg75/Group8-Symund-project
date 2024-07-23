package com.symund.step_definitions;

import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US09_StepDefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    String searchName = ConfigurationReader.getProperty("search_name");

    @When("user clicks on the {string} Module")
    public void user_clicks_on_the_module(String string) throws InterruptedException {
       Driver.getDriver().findElement(By.xpath("//li[@data-id='" + string + "']")).click();
       Thread.sleep(500);
    }
    @Then("user clicks on the magnifying glass icon inside the Module")
    public void user_clicks_on_the_magnifying_glass_icon_inside_the_module() {
       Driver.getDriver().findElement(By.xpath("//span[@aria-label='Magnify icon']")).click();
    }
    @Then("user types the file's name {string}")
    public void user_types_the_name_of_the_file(String name) {
        Driver.getDriver().findElement(By.xpath("//input[@type='search']")).sendKeys(name + Keys.ENTER);
    }
    @Then("user clicks on the search result for the file")
    public void user_clicks_on_the_search_result_for_the_file() {

        Driver.getDriver().findElement(By.xpath("//div[@role='menu']//a")).click();


    }
    @Then("user should see the details side page of the file")
    public void user_should_see_the_details_side_page_of_the_file() throws InterruptedException {
        Thread.sleep(2000);
        String sideBarName = Driver.getDriver().findElement(By.xpath("//h2[@class='app-sidebar-header__maintitle']")).getText();
        Assert.assertTrue(sideBarName.toLowerCase().contains(searchName.toLowerCase()));
    }

    @When("user clicks on the SYMUND icon at the top left corner of the page")
    public void user_clicks_on_the_symund_icon_at_the_top_left_corner_of_the_page() {
        Driver.getDriver().findElement(By.xpath("//a[@id='nextcloud']")).click();
    }

    @Then("user should be navigated to the Dashboard page")
    public void user_should_be_navigated_to_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Dashboard - Symund - QA"));
    }

}
