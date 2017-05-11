package phptravels.test;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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


    @Given("^I load the front page$")
    public void I_open_front_page() {
        driver.get("http://www.phptravels.net/");
    }


}


