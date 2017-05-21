package phptravels.pagefiles;

import org.openqa.selenium.WebDriver;

/**
 * Created by dia on 21/05/2017.
 */
public class LandingPage extends BasePage {

    public LandingPage(WebDriver webDriver){
        super(webDriver);
    }

    protected String url(){
        return "http://www.phptravels.net/";
    }
}