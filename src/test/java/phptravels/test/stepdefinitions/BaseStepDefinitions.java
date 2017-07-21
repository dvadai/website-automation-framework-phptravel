package phptravels.test.stepdefinitions;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import phptravels.pagefiles.AccountHomePage;
import phptravels.pagefiles.LandingPage;
import phptravels.pagefiles.LoginPage;

/**
 * Created by dia on 31/05/2017.
 */
public class BaseStepDefinitions {

    protected WebDriver driver;
    protected LandingPage landingPage;
    protected LoginPage loginPage;
    protected AccountHomePage accountHomePage;


}