package phptravels.pagefiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class BasePage {
    protected WebDriver driver;

    //    contructor for a basepage.
    public BasePage(WebDriver webDriver) {
        driver = webDriver;
    }


    public void waitToLoad() {

    }


    protected abstract String url();

    public void loadPage() {
        driver.get(url());
    }


    protected abstract boolean isDisplayedOnPage();

    protected void clickElement(String locator){
        WebElement element = driver.findElement(By.cssSelector(locator));
        element.click();
    }

}

