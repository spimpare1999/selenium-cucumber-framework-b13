package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {

    WebDriver driver;

//    WebElement email = driver.findElement(By.id("Email")).click(); equivalent on line 14 and 15

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//label[@for='RememberMe']")
    public WebElement rememberMe;

    @FindBy(css = ".button-1.login-button")
    public WebElement loginButton;

    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}