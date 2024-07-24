package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//ul[@id='appmenu']/li")
    List<WebElement> dashboardTabs;


    public void clickDashboardTab(String tabName){
        BrowserUtils.waitForVisibility(dashboardTabs.get(1), 5);
        for (WebElement dashboardTab : dashboardTabs) {
            if (dashboardTab.getAttribute("data-id").equalsIgnoreCase(tabName)) {
                dashboardTab.click();
                System.out.println(tabName + " tab is clicked");
                break;
            }
        }
    }

    
}
