package phptravels.pagefiles;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {

    private static final String URL = "http://www.phptravels.net/register";
    private static final String SIGNUP_BUTTON  = ".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg";
    private static final String SIGNUP_CHECKBOX = "i.fa.fa-check-square-o";
    private static final String FIRST_NAME_TEXTFIELD = "input[name='firstname']";
    private static final String LAST_NAME_TEXTFIELD = "input[name='lastname']";
    private static final String MOBILE_NUMBER_TEXTFIELD = "input[name='phone']";
    private static final String EMAIL_TEXTFIELD = "input[name='email']";
    private static final String PASSWORD_TEXTFIELD = "input[name='password']";
    private static final String CONFIRM_PASSWORD_TEXTFIELD = "input[name='confirmpassword']";


    public SignUpPage(WebDriver webDriver){super(webDriver);}

    protected String url() {
        return URL;
    }

    protected boolean isDisplayedOnPage() {
        WebElement signupButton = driver.findElement(By.cssSelector(SIGNUP_BUTTON));
        return signupButton.isDisplayed();

    }


    public void enterFirstName() {
        WebElement enterFirstName= driver.findElement(By.cssSelector(FIRST_NAME_TEXTFIELD));
        enterFirstName.sendKeys("Test");

    }

    public void enterLastName() {
        WebElement enterLastName= driver.findElement(By.cssSelector(LAST_NAME_TEXTFIELD));
        enterLastName.sendKeys("Lastname");

    }

    public void enterEmailAddress(){
        WebElement enterEmail = driver.findElement(By.cssSelector(EMAIL_TEXTFIELD));
        enterEmail.sendKeys("test@test.co.uk");
    }

    public void enterMobileNumber(){
        WebElement enterMobile = driver.findElement(By.cssSelector(MOBILE_NUMBER_TEXTFIELD));
        enterMobile.sendKeys("01234556789");
    }

    public void enterPassword(){
        WebElement enterPw = driver.findElement(By.cssSelector(PASSWORD_TEXTFIELD));
        enterPw.sendKeys("passwd123");

    }

    public void enterConfirmPassword(){
        WebElement confirmPw = driver.findElement(By.cssSelector(CONFIRM_PASSWORD_TEXTFIELD));
        confirmPw.sendKeys("passwd123");
    }

}
