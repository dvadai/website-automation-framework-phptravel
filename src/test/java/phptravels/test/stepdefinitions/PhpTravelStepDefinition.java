package phptravels.test.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import phptravels.pagefiles.LandingPage;

/**
 * Created by dia on 11/05/2017.
 */
public class PhpTravelStepDefinition {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/dia/Downloads/geckodriver");
        driver = new FirefoxDriver();
    }


    @Given("^I am on the front page$")
    public void I_open_front_page() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.loadPage();
    }


    @When("^I enter my login details$")
    public void iEnterMyLoginDetails() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^submit my login request$")
    public void submitMyLoginRequest() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}


