package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestSetUp;

public class OffersPage {
	
	
	
	WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		
		this.driver= driver;	
		
	}
	
	By search = By.id("search-field");
	By offerPagePrdName= By.xpath("//td[contains(text(),'Tomato')]");
	
	public void SearchProduct(String Name) {
		driver.findElement(By.id("search-field")).sendKeys(Name);
	}
	
	public String GetOfferPageProductName() {
		
		String offerPageProductName = driver.findElement(By.xpath("//td[contains(text(),'Tomato')]")).getText();
		
		return offerPageProductName;
		
	}
	
	
	

}
