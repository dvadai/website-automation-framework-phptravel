package phptravels.test.stepdefinitions.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import phptravels.pagefiles.AccountHomePage;
import phptravels.pagefiles.LandingPage;
import phptravels.pagefiles.LoginPage;
import phptravels.support.Pages;
import phptravels.support.SessionContext;

import java.util.concurrent.TimeUnit;


public class Hooks {

    protected WebDriver driver;
    protected LandingPage landingPage;
    protected LoginPage loginPage;
    protected AccountHomePage accountHomePage;

    protected SessionContext sessionContext;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/dia/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        sessionContext = SessionContext.getInstance();
        sessionContext.setDriver(driver);

        Pages pages = new Pages(driver);
        sessionContext.setPages(pages);
    }

    @After
    public void afterScenario() {
        driver.close();
    }
}
