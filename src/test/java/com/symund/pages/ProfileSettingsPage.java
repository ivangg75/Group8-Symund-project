package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {

    public ProfileSettingsPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy
    public WebElement userButton;

    @FindBy
    public WebElement fullNameBox;

    @FindBy
    public WebElement emailInputBox;

    @FindBy
    public  WebElement emailCheckmark;

    @FindBy
    public WebElement languageSelection;

    @FindBy
    public WebElement italianoSelectLanguage;

    @FindBy
    public WebElement profileName;


}
