package phptravels.pagefiles;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightsMenuPage extends BasePage {

    private static final String URL = "http://www.phptravels.net/flight";
    private static final String DESTINATION = ".mewtwo-flights-destination.mewtwo-stand-out";
    private static final String FLIGHTS_ORIGIN_LABEL = "#flights-origin-prepop-whitelabel_en";


    public FlightsMenuPage(WebDriver webDriver){super(webDriver);}


    protected String url() {
        return URL;
    }

    protected boolean isDisplayedOnPage() {
        WebElement destination = driver.findElement(By.cssSelector(DESTINATION));
        WebElement flightsOriginLabel = driver.findElement(By.cssSelector(FLIGHTS_ORIGIN_LABEL));
        return destination.isDisplayed() && flightsOriginLabel.isDisplayed();
    }
}
