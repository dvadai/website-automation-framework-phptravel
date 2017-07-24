package phptravels.support;

import org.openqa.selenium.WebDriver;

//singleton pattern
public class SessionContext {
    private WebDriver driver;
    private Pages pages;

    private static SessionContext instance = null;
    private SessionContext() {
        // Exists only to defeat instantiation.
    }
    public static SessionContext getInstance() {
        if(instance == null) {
            instance = new SessionContext();
        }
        return instance;
    }

    public void setDriver(WebDriver driverToSet) {
        driver = driverToSet;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setPages(Pages pagesToSet){
        pages = pagesToSet;
    }


    public Pages getPages(){
        return pages;

    }


}
