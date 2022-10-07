package org.example.pageActions;

import org.example.pageElements.HomeElements;
import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeActions {
    private WebDriver driver;
    HomeElements homeElements;

    public HomeActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.homeElements = new HomeElements(driver);
    }

    public void clickOnLogin(){
        homeElements.logIn.click();
    }

    public void clickOnRegister(){
        homeElements.registerLink.click();
    }
}
