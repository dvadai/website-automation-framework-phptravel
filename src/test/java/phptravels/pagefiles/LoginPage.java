package phptravels.pagefiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    private static final String LOGINFORM = "#loginfrm";
    private static final String URL = "http://www.phptravels.net/login";
    private static final String EMAILFIELD = "input[name='username']";
    private static final String PASSWORDFIELD = "input[name='password']";
    private static final String LOGINBUTTON = ".btn.btn-action.btn-block.loginbtn";
    private static final String SIGNUP = "//*[text()= 'Sign Up']";
    private static final String FORGOTPASSWORD = "a[href='#ForgetPassword']";
    private static final String INVALID_EMAIL_OR_PASSWORD_MESSAGE = ".alert.alert-danger";


    public LoginPage(WebDriver webDriver){super(webDriver);}

    protected String url() {
        return URL;
    }

    protected boolean isDisplayedOnPage() {
        WebElement loginform = driver.findElement(By.cssSelector(LOGINFORM));
        return loginform.isDisplayed();
    }

    public void enterExistingUserEmail() {
        WebElement enterEmailAddress = driver.findElement(By.cssSelector(EMAILFIELD));
        enterEmailAddress.sendKeys("user@phptravels.com");

    }
    public void enterExistingUserPassword() {
        WebElement enterPw = driver.findElement(By.cssSelector(PASSWORDFIELD));
        enterPw.sendKeys("demouser");

    }
    public void clickOnLoginButton(){
        WebElement clickLogin = driver.findElement(By.cssSelector(LOGINBUTTON));
        clickLogin.click();
    }
    public void enterInvalidEmailAddress(){
        WebElement invalidEmail = driver.findElement(By.cssSelector(EMAILFIELD));
        invalidEmail.sendKeys("test@abcd.com");
    }

    public void enterInvalidPassword(){
        WebElement invalidPw = driver.findElement(By.cssSelector(PASSWORDFIELD));
        invalidPw.sendKeys("invalidpassword");
    }
    public void validateInvalidEmailOrPasswordMessage(){
        WebElement invalidEmailOrPw = driver.findElement(By.cssSelector(INVALID_EMAIL_OR_PASSWORD_MESSAGE));
        invalidEmailOrPw.isDisplayed();
    }

}





