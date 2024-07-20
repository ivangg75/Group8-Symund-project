package com.symund.pages;

import com.symund.utilities.Driver;
import org.apache.velocity.runtime.parser.node.ASTMathNode;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityPage {

    public ActivityPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href=\"/index.php/apps/activity/\"]")
    public WebElement activityTab;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div/span")
    public WebElement newestDate;

    @FindBy(id ="no_more_activities")
    public WebElement noMoreActivities;


}
