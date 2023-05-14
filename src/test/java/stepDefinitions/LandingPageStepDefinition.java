package stepDefinitions;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSetUp;

public class LandingPageStepDefinition {
	TestSetUp testSetup;
	LandingPage landingPage;
	public String landingPageproductName;
	
	
	
	
	public LandingPageStepDefinition(TestSetUp testSetup) {
		
		this.testSetup= testSetup;
		this.landingPage =testSetup.pageObjectManager.GetLandingPage();
		
	}
	
	
	
	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	 	
	}
	
	
	
	@When("User searched with shortname {string} and extract actual name of product")
	public void user_searched_with_shortname_and_extract_actual_name_of_product(String shortName) throws InterruptedException {
		
		
		landingPage.SearchItem(shortName);
		Thread.sleep(2000);
		landingPageproductName = landingPage.getProductName().split("-")[0].trim(); 
		testSetup.landingPageproductName= landingPageproductName;
		System.out.println(landingPageproductName + " is extracted from HomePage");
	}


}
