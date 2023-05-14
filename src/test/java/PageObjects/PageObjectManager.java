package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	public LandingPage landingPage;
	public OffersPage offersPage;

	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public LandingPage GetLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage GetOffersPage() {
		offersPage = new OffersPage(driver);
		return offersPage;
	}
}
