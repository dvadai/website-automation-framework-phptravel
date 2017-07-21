package phptravels.pagefiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {
    //login, sign up
    private static final String MY_ACCOUNT_BUTTON_TEXT = "My Account";
    private static final String MY_ACCOUNT_BUTTON_LOCATOR = "//*[text()=' My Account ']";
    private static final String URL = "http://www.phptravels.net/";
    private static final String LOGIN_BUTTON_LOCATOR = ".dropdown-menu > li > a";
    private static final String LOGIN_BUTTON_TEXT = "[href='http://www.phptravels.net/login']";
    private static final String SIGNUP_BUTTON_LOCATOR = ".dropdown-menu > li > a";
    private static final String SIGNUP_BUTTON_TEXT = "[href='http://www.phptravels.net/register']";

    //clicking on the top navigation bar
    private static final String HOME_NAVIGATION = "li.dropdown.go-right > a.dropdown-toggle";
    private static final String FLIGHTS_NAVIGATION = "[href='http://www.phptravels.net/flight']";
    private static final String HOTELS_NAVIGATION = "[href='http://phptravels.net/hotels']";
    private static final String TOURS_NAVIGATION = "[href='http://phptravels.net/tours']";
    private static final String OFFERS_NAVIGATION = "[href='http://www.phptravels.net/offers']";
    private static final String BLOG_NAVIGATION = "[href='http://www.phptravels.net/blog']";
    private static final String CONTACT_US_NAVIGATION = "[href='http://www.phptravels.net/contact-us']";
    private static final String CARS_NAVIGATION = "[href='http://www.phptravels.net/cars']";


    public LandingPage(WebDriver webDriver){
        super(webDriver);
    }

    protected String url(){
        return URL;
    }

    public boolean isDisplayedOnPage(){
        WebElement myAccountButton = driver.findElement(By.xpath(MY_ACCOUNT_BUTTON_LOCATOR));
        return myAccountButton.getText().contains(MY_ACCOUNT_BUTTON_TEXT);
    }

    public void clickOnAccount(){
        WebElement myAccountButton = driver.findElement(By.xpath(MY_ACCOUNT_BUTTON_LOCATOR));
        myAccountButton.click();

    }

    public void clickOnLogin(){
       clickElement(LOGIN_BUTTON_TEXT);
    }

    public void clickOnSignup(){
        clickElement(SIGNUP_BUTTON_TEXT);
    }

    public void clickOnHomeNavigationButton(){
      clickElement(HOME_NAVIGATION);
    }

    public void clickOnFlightsNavigationButton(){
        clickElement(FLIGHTS_NAVIGATION);
    }

    public void clickOnHotelsNavigationButton(){
        clickElement(HOTELS_NAVIGATION);
    }
    public void clickOnToursNavigationButton(){
        clickElement(TOURS_NAVIGATION);
    }
    public void clickOnOffersNavigationButton(){
        clickElement(OFFERS_NAVIGATION);
    }

    public void clickOnBlogNavigationButton(){
        clickElement(BLOG_NAVIGATION);
    }
    public void clickOnContastUsNavigationButton(){
       clickElement(CONTACT_US_NAVIGATION);
    }
    public void clickOnCarsNavigationButton(){
        clickElement(CARS_NAVIGATION);
    }


}