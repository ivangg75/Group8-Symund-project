package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage_Lionel {

    public LogOutPage_Lionel() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "user")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='settings']")
    public WebElement uButton;

    @FindBy(xpath = "//a[@text='Log out']")
    public WebElement logoutButton;

}
