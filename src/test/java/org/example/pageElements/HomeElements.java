package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeElements {

    WebDriver driver;

    @FindBy(className = "ico-register")
    public WebElement registerLink;

    @FindBy(className = "ico-login")
    public WebElement logIn;

    public HomeElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
