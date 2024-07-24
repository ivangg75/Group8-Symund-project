package com.symund.pages;


import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameInput;


    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement submitButton;

    public void openLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void login(){
        usernameInput.sendKeys(ConfigurationReader.getProperty("users_username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("users_password"));
        submitButton.click();
    }

    public void loginEmployee(){
        usernameInput.sendKeys(ConfigurationReader.getProperty("employee_username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("employee_password"));
        submitButton.click();
    }



    }






