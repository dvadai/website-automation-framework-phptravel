package phptravels.pagefiles;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToursMenuPage  extends BasePage{

    private static final String SEARCH_SUMMARY = "col-md-1.col-sm-2.col-xs-4.summary.go-right";
    private static final String URL = "http://www.phptravels.net/tours";


    public ToursMenuPage(WebDriver webDriver){super(webDriver);}

    protected String url() {
        return null;
    }

    protected boolean isDisplayedOnPage() {
        WebElement searchSummary = driver.findElement(By.cssSelector(SEARCH_SUMMARY));
        return searchSummary.isDisplayed();
    }



}
