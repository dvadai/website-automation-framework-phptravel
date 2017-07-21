package phptravels.pagefiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountHomePage extends BasePage {

    private static String URL = "http://www.phptravels.net/account/";
    private static String USER_GREETING = ".RTL";


    public AccountHomePage(WebDriver webDriver){super(webDriver);}

    protected String url() {
        return URL;
    }

    protected boolean isDisplayedOnPage() {
        WebElement userGreeting = driver.findElement(By.cssSelector(USER_GREETING));
        return userGreeting.isDisplayed();
    }

    public void validateUserGreeting(){
        WebElement userGreeting = driver.findElement(By.cssSelector(USER_GREETING));
        userGreeting.isDisplayed();
    }

}
