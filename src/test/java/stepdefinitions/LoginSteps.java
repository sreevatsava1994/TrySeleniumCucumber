package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = DriverFactory.getDriver();
        driver.get("https://example.com/login"); // replace with your app URL
        loginPage = new LoginPage();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String user, String pass) {
        loginPage.enterUsername(user);
        loginPage.enterPassword(pass);
    }

    @When("I click login")
    public void i_click_login() {
        loginPage.clickLogin();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        // Example assertion
        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.contains("dashboard")) {
            throw new AssertionError("Login failed, current URL: " + currentUrl);
        }
        DriverFactory.quitDriver();
    }
}
