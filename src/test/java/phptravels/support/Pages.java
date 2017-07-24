package phptravels.support;


import org.openqa.selenium.WebDriver;
import phptravels.pagefiles.AccountHomePage;
import phptravels.pagefiles.LandingPage;
import phptravels.pagefiles.LoginPage;

public class Pages {


    public LandingPage landingPage;
    public LoginPage loginPage;
    public AccountHomePage accountHomePage;

    public Pages(WebDriver driver){
        landingPage = new LandingPage(driver);
        loginPage = new LoginPage(driver);
        accountHomePage = new AccountHomePage(driver);
    }


}
