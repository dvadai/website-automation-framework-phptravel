# automation-framework
Selenium test automation framework


How to build an automation framework?

# 1. The basics

1. Sort the maven pom file out: start a new maven project that give the structure.
It is a maven structure not for the automation project. Open the pom.xml file.
Add the dependencies you need. You can get it from here.  https://mvnrepository.com
Examples: cucumber, unit and selenium, appium etc

2. Create the basic test framework structure.
Important: the feature files go into resource directory and everything else goes into the test dir.
(In this framework there is a java directory under test)
3. Create cucumber runner in the root dir of test/java because Cucumber runs on Junit in java.
4. Start building features and step def files
Recommended basic structure:
- Feature files
- Step definitions
- Respective page files
- Hooks
- Base Page

