package phptravels.test.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import phptravels.pagefiles.AccountHomePage;
import phptravels.pagefiles.LandingPage;
import phptravels.pagefiles.LoginPage;
import phptravels.support.SessionContext;
import phptravels.test.stepdefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition  extends BaseStepDefinitions {

    @Given("^I am on the front page$")
    public void I_open_front_page() {
        landingPage.loadPage();
        Assert.assertTrue(landingPage.isDisplayedOnPage());
    }


    @When("^I enter my login details$")
    public void iEnterMyLoginDetails() {
        landingPage.clickOnAccount();
        landingPage.clickOnLogin();
        loginPage.enterExistingUserEmail();
        loginPage.enterExistingUserPassword();
    }

    @And("^submit my login request$")
    public void submitMyLoginRequest() {
        loginPage.clickOnLoginButton();
    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() {
        accountHomePage.validateUserGreeting();
    }

    @When("^I enter invalid login details$")
    public void iEnterInvalidLoginDetails()  {
        landingPage.clickOnAccount();
        landingPage.clickOnLogin();
        loginPage.enterInvalidEmailAddress();
        loginPage.enterInvalidPassword();
    }

    @Then("^I see an error message and not get logged in$")
    public void iSeeAnErrorMessageAndNotGetLoggedIn() {
        loginPage.validateInvalidEmailOrPasswordMessage();

    }
}


