package phptravels.pagefiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by dia on 21/05/2017.
 */
public class LandingPage extends BasePage {
    private static final String MY_ACCOUNT_BUTTON_TEXT = "My Account";
    private static final String MY_ACCOUNT_BUTTON_LOCATOR = "i.icon_set_2_icon-105";
    private static final String URL = "http://www.phptravels.net/";



    public LandingPage(WebDriver webDriver){
        super(webDriver);
    }

    protected String url(){
        return URL;
    }

    public boolean isDisplayed(){
        WebElement myAccountButton = driver.findElement(By.cssSelector(MY_ACCOUNT_BUTTON_LOCATOR));
        return myAccountButton.getText().contains(MY_ACCOUNT_BUTTON_TEXT);
    }
}