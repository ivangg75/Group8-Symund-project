package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//header//button[contains(@class, 'icon action-item__menutoggle')]")
    WebElement selectViewButton;

    @FindBy(xpath = "//div[@class='popover__wrapper']//ul/li")
    List<WebElement> calendarViewOptionsList;

    @FindBy(xpath = "//button[contains(., 'New event')]")
    WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    WebElement eventTitleInput;

    @FindBy(xpath = "//button[contains(., 'Save')]")
    WebElement saveNewEventButton;

    @FindBy(xpath = "//td[contains(@class, 'today')]")
    public WebElement todayColumn;


    public void clickSelectViewButton(){

        BrowserUtils.waitForVisibility(selectViewButton, 5);
        selectViewButton.click();
        System.out.println("Select View button is clicked");

    }

    public void selectCalendarViewOption(String viewName){
        BrowserUtils.waitForVisibility(calendarViewOptionsList.get(0), 5);
        boolean executed = false;
        for (WebElement calendarViewOption : calendarViewOptionsList) {
            if (calendarViewOption.getText().equalsIgnoreCase(viewName)){
                calendarViewOption.click();
                System.out.println(viewName + " calendar view is selected");
                executed = true;
                break;
            }
        }

        //in case if language not English selecting by index
        if (!executed && viewName.equalsIgnoreCase("day")){
            calendarViewOptionsList.get(0).click();
        }else if (!executed && viewName.equalsIgnoreCase("week")){
            calendarViewOptionsList.get(1).click();
        }else if (!executed && viewName.equalsIgnoreCase("month")){
            calendarViewOptionsList.get(2).click();
        }
    }

    public void clickNewEventButton(){

        BrowserUtils.waitForVisibility(newEventButton, 5);
        newEventButton.click();
        System.out.println("New event button is clicked");

    }

    public void createNewEvent(String eventName){

        BrowserUtils.waitForVisibility(eventTitleInput, 5);
        eventTitleInput.sendKeys(eventName);

    }

    public void clickSaveButton(){

        BrowserUtils.waitForVisibility(saveNewEventButton, 5);
        saveNewEventButton.click();
        System.out.println("Save button is clicked");

    }


}
