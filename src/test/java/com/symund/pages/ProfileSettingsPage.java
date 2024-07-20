package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfileSettingsPage {

    public ProfileSettingsPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement userButton;

    @FindBy(xpath = "//input[@value='User12']")
    public WebElement fullNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//span[@class='icon-checkmark hidden']")
    public  WebElement emailCheckmark;

    @FindBy(xpath = "//select[@id='languageinput']")
    public WebElement languageInput;

    @FindBy(xpath = "//option[@value='it']")
    public WebElement italianoSelectLanguage;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement profileName;




}
