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

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[12]/a")
    public WebElement TaskButton;

    @FindBy(xpath = "/html/body/div[3]/div[1]/ul/li[7]/a/span")
    public WebElement TaskList;

    @FindBy(id = "target")
    public WebElement newTaskList;

    @FindBy(id = "newListInput")
    public WebElement newTaskListInput;

    @FindBy(id = "toggleCompleted_a4ceea3d-d6f9-477b-9942-fce026e8a243")
    public WebElement TaskTestChkBx;

    @FindBy(xpath = "/html/body/div[3]/div[1]/ul/li[6]/a")
    public WebElement CompletedSec;

    @FindBy(xpath = "//*[@id=\"collection_current\"]/a")
    public WebElement CurrentSec;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[2]/div/ol/li/div[1]/div[3]/button/span")
    public WebElement STAR;



    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement submitButton;

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






