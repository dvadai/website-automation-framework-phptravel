# automation-framework
Selenium test automation framework
This is a step by step documentation on how to build an automation framework from scratch using http://www.phptravels.net/ as the test site. 


# How to start?

#  The basics
- Choose a Development Environment and download it 
- Create a new project 


# 1. The pom file
Sort the maven pom file out: start a new maven project that gives the structure.
It is a maven structure not for the automation project. Open the pom.xml file.
Add the dependencies you need. You can get it from here.  https://mvnrepository.com
Examples: cucumber-java,cucumber-junit, junit, selenium, appium etc.


# 2. Create the basic test framework structure
Important: the feature files go into resource directory and everything else goes into the test dir.
(In this framework there is a java directory under test)
src -> test -> java -> yourprojectname (optional) -> supporting code
src -> test -> resources -> yourprojectname (optional) -> feature files
(This resources dir where your feature files live needs to be marked as source root.Right click>mark as)

# 3. Cucumber runner
 Create cucumber runner in the root dir of test/java because Cucumber runs on Junit in java.
The dependencies will be crucial at this point. Luckily there is great documentation on how to set up this class.
Go to:https://cucumber.io/docs/reference/jvm
If you happen to have issues with the dependencies, enable auto import and let magic happen.


# 4. The BasePage
# 4.1 The webdriver
How to get firefox driver? (Steps are pretty similar for other browsers too)
You can download geckdriver from here: https://github.com/mozilla/geckodriver/releases


I suggest setting up the driver on the BasePage. Do not forget to: import org.openqa.selenium.WebDriver;
Create a constructor for the basePage with your webdriver.
So every page has a WebDriver object called (for simplicity we can call it driver).

So it looks like this


```protected WebDriver driver;

       public BasePage(WebDriver myDriver) {
           driver = myDriver;
       }
   }
   ```


Remember that protected WebDriver driver = new WebDriver(); is not a good idea because:
when you create a web driver it starts a new browser window.
Instead you want the use the constructor to pass around the same object.

# 4.2 Commonly used methods
If you declare a ‘loadPage’ method on the BasePage the problem is that every page will have a different URL.
You can solve this by extending BasePage. However you must declare this method abstract.
By creating ```protected abstract String url();``` you don’t need to implement it now, but anybody that extends your class must implement it.
And hence every page needs to implement a url(), we can create the following method on the BasePage.


```public void loadPage() {
        driver.get(url());
    }```

BasePage should contain the methods that are used all over the tests in order to avoid duplications.

# 5. The hooks (before and after)
Hooks allow you to perform actions at various points in the cucumber testcycle.
This is commonly used for driver management. (before, after hooks)
and the information should live in a support class or on a step definition.


```protected WebDriver driver;

       @Before
       public void setUp() {
           System.setProperty("webdriver.gecko.driver", "/directoryxyz/geckodriver");
           driver = new FirefoxDriver();
           landingPage = new LandingPage(driver);
       }```


# 6. Start building features and step def files
Recommended basic structure:
- Feature files
- Step definitions
- Respective page files
- Hooks
- Base Page


