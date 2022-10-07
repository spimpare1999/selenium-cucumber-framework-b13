package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import org.example.pageActions.HomeActions;
import org.example.pageActions.LoginActions;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    WebDriver driver;
    HomeActions homeActions;

    public HomeSteps(CommonSteps commonSteps, HomeActions homeActions) {
        this.driver = commonSteps.getDriver();
        this.homeActions = homeActions;
    }

    @Given("I navigate to login page")
    public void i_navigate_to_login_page() {
        homeActions.clickOnLogin();
    }

}
