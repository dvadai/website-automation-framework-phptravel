package phptravels.pagefiles;

import org.openqa.selenium.WebDriver;

/**
 * Created by dia on 21/05/2017.
 */
public abstract class BasePage {
    protected WebDriver driver;

    //    contructor for a basepage.
    public BasePage(WebDriver webDriver) {
        driver = webDriver;
    }


    public void waitToLoad() {

    }

    public void loadPage() {
        driver.get(url());
    }

//    every page that inerits will have to declare a string url method.
    protected abstract String url();


    protected abstract boolean isDisplayed();

}

