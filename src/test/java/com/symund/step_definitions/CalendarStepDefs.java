package com.symund.step_definitions;

import com.symund.pages.CalendarPage;
import com.symund.pages.DashboardPage;
import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    CalendarPage calendarPage = new CalendarPage();

    String calendar = "calendar";

    @Given("User is on the calendar page")
    public void userIsOnTheCalendarPage() {

        loginPage.openLoginPage();
        loginPage.login();

        dashboardPage.clickDashboardTab(calendar);

    }

    @When("User clicks on the calendar view button")
    public void userClicksOnTheCalendarViewButton() {

        calendarPage.clickSelectViewButton();

    }

    @And("User select {string} view")
    public void userSelectCalendarView(String viewName) {

        calendarPage.selectCalendarViewOption(viewName);

    }

    @Then("User should see the {string} calendar")
    public void userShouldSeeFormatOfCalendarView(String viewName) {

        Assert.assertTrue("Verify that uRL contain " + viewName,
                Driver.getDriver().getCurrentUrl().contains(viewName));

    }


    @When("User creates a new event with title {string} on today date")
    public void userCreatesANewEventWithTitleOnTodayDate(String eventName) {

        calendarPage.clickNewEventButton();
        calendarPage.createNewEvent(eventName);
        calendarPage.clickSaveButton();

    }

    @Then("User verifies the event {string} is displayed in monthly view")
    public void userVerifiesTheEventIsDisplayedInMonthlyView(String eventName) {

        Assert.assertTrue("Verify that event is displayed in monthly view",
                calendarPage.todayColumn.getText().contains(eventName));

    }
}
