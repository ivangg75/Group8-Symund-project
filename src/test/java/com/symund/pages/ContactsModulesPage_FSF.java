package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsModulesPage_FSF {

    public ContactsModulesPage_FSF() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/index.php/apps/contacts/'][1]")
    public WebElement contactsBtn;

    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement createNewContactBtn;

    @FindBy(xpath = "//input[@id='contact-fullname']")
    public WebElement fullNameBox;

    @FindBy(xpath = "//input[@id='contact-org']")
    public WebElement companyBox;

    @FindBy(xpath = "//input[@id='contact-title']")
    public WebElement titleBox;

    @FindBy(xpath = "//input[@ inputmode ='tel']")
    public WebElement tellNumberBox;

    @FindBy(xpath = "//input[@ inputmode ='email']")
    public WebElement emailBox;


    @FindBy(xpath = "//div[@class='unknown']")
    public WebElement verifyInitial;

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContactsBtn;

    @FindBy(xpath = "//div[@class='app-navigation-entry__counter']")
    public WebElement totalNumberOfContactsBtn;

    @FindBy(xpath = "//div[@class='action-item contact-header-avatar__menu']")
    public WebElement profilePicBtn;

    @FindBy(xpath = "//div[contains(text(),'John Doe')]")
    public WebElement johnDoe;

    @FindBy(xpath = "//span[.='Choose from Files']")
    public WebElement chooseFileBtn;

    @FindBy(xpath = "//span[.='tim2.png']")
    public WebElement imgFile;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement chooseBtn;

    @FindBy(xpath = "//div[contains(@class,'action-item header-menu')]")
    public WebElement buttonActions;

    @FindBy(xpath = "//div[@class='popover__wrapper']//span[text()='Delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//*[contains(text(),'There are no contacts yet')]")
    public WebElement noContactsFound;

//    @FindBy(xpath = "//*[contains(text(),'There are no contacts yet')]")
//    public WebElement noContactsFound;

}

