package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestSetUp {
	
	public WebDriver driver;
	public String landingPageproductName;
	public PageObjectManager pageObjectManager;
	public BaseClass baseclass;
	public GenericUtils utils;
	
	public TestSetUp() throws IOException {
		
		baseclass= new BaseClass();
		pageObjectManager = new PageObjectManager(baseclass.WebDriverManager());
		utils = new GenericUtils(baseclass.WebDriverManager());
	}

}
