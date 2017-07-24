package phptravels.test.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import phptravels.pagefiles.AccountHomePage;
import phptravels.pagefiles.LandingPage;
import phptravels.pagefiles.LoginPage;
import phptravels.support.SessionContext;

import java.util.concurrent.TimeUnit;

public class BaseStepDefinitions{

    protected SessionContext sessionContext = SessionContext.getInstance();
    protected WebDriver driver = sessionContext.getDriver();

    protected LandingPage landingPage = sessionContext.getPages().landingPage;
    protected LoginPage loginPage = sessionContext.getPages().loginPage;
    protected AccountHomePage accountHomePage = sessionContext.getPages().accountHomePage;


}