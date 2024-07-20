package com.symund.pages;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
public abstract class US13_ProfileSettingsPage {

    @FindBy(xpath = "//*[.='Full name']")
    public WebElement fullNameTitle;

    @FindBy(xpath = "//*[.='Email']")
    public WebElement emailTitle;

    @FindBy(xpath = "//*[.='Phone number']")
    public WebElement phoneNumberTitle;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement settingsName;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phoneNumberInputBox;

    public US13_ProfileSettingsPage() { PageFactory.initElements(Driver.getDriver(), this);}
}
