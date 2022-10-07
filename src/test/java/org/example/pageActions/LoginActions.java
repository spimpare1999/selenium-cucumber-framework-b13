package org.example.pageActions;

import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginActions {

    private WebDriver driver;
    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements = new LoginElements(driver);
    }

    public void enterEmail(String email) {
        loginElements.email.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginElements.password.sendKeys(password);
    }

    public void clickOnRememberMe() {
        loginElements.rememberMe.click();
    }

    public void clickOnLoginButton() {
        loginElements.loginButton.click();
    }


}
/*
    How to access instance variables of a class?
        by creating object.
    WebElement email;
    WebElement password;
    WebElement rememberMe;
    WebElement loginButton;
 */