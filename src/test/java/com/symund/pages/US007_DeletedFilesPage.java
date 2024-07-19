package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US007_DeletedFilesPage {

    public US007_DeletedFilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement filesTab;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "(//span[.='Name'])[12]")
    public WebElement nameTab;

    @FindBy(xpath = "(//span[@class='innernametext'])[1]")  ////span[.='A folder'])[2]
    public WebElement firstFileName;

    @FindBy(xpath ="//span[.='D file']")
    public WebElement lastFileName;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[4]/td[2]/a/span[3]/a[2]")
    public WebElement threeDots;
    
    @FindBy(xpath = "(//span[.='Delete permanently'])[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//a[@class='action action-restore permanent'])[3]")
    public WebElement restoreButton;





}