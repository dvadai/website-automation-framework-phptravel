# automation-framework
Selenium test automation framework
This is a step by step documentation on how to build an automation framework from scratch using http://www.phptravels.net/ as the test site. 


# How to start?

# 1. The basics
Prerequisites:
- Choose a Development Environment and download it 
- Create a new project 

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

