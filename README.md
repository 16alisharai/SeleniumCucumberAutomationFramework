# SeleniumCucumberAutomationFramework

This repository contains a sample project of UI Test Automation using Selenium and Cucumber with Java as programming language.The aim of this project is not to have more and more E2E testcases but to build a UI Test Automation framework with below capabilities-
1. Page Object Model
2. Reports- HTML, Json, Extent
3. Single Responsibility Principle
4. Dependency Injection
5. Screenshots
6. Parameterized Tests


**Setup**  
Clone the repository to your local machine.  
Open the solution in IntelliJ Idea or eclipse. 
Build the solution once.  

**Writing A Test**

The cucumber features goes in the features library and should have the ".feature" extension.
You can start out by looking at features/first.feature. You can extend this feature or make your own features using some of the predefined steps that comes with selenium-cucumber.

**Run the tests**. 
1. Under src/test/java/cucumberOptions, there is a file testNGTestRunner. Right click on the respective file and run as testNG test.    
OR.  
2. Open the terminal and give the command - mvn test   
OR.  
3. To run the test with a particular tag you can use following command-   
mvn test -Dcucumber.filter.tags = “@smoke”. 

**Dependencies**. 
To know about dependencies you can refer to pom.xml file.  

**Resources**. 
https://thoughtworks.udemy.com/course/cucumber-tutorial. 
