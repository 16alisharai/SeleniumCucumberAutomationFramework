package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestSetUp;

public class LandingPage {
	
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver= driver;	
		
	}
	
	By search = By.xpath("//input[@class='search-keyword']");
	By prdName = By.cssSelector("h4.product-name");
	By topDeals = By.linkText("Top Deals");
	By productName = By.cssSelector("h4.product-name");
	
	public void SearchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
	}
	
//	public String GetProductName() {
//		
//		//after .split we get tomato and 1kg
//		//we take only tomato so 0th index 
//		//then in tomato we have space after that so we do trim
//		String landingPagePrdName= driver.findElement(productName).getText();
//		return landingPagePrdName;
//	}
	public void ClickOnTopDeals() {
		driver.findElement(topDeals).click();
	}
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}

}
