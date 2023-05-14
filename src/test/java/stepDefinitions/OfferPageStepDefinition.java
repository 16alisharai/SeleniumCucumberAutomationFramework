package stepDefinitions;
import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import PageObjects.LandingPage;
import PageObjects.OffersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utils.TestSetUp;

public class OfferPageStepDefinition {
	
	TestSetUp testSetup;
	public String offerPageProdName;
	
	
	
	public OfferPageStepDefinition(TestSetUp testSetup) {
		
		this.testSetup = testSetup;
		
	}
	
	
	
	
	@Then("User go and search for {string} short name in offers page to check if offer exists")
	public void user_go_and_search_for_same_short_name_in_offers_page_to_check_if_offer_exists(String shortName) throws InterruptedException {
		
		Move_To_Offers_Page();
		OffersPage offersPage = testSetup.pageObjectManager.GetOffersPage();
		offersPage.SearchProduct(shortName);
		Thread.sleep(2000);
		offerPageProdName= offersPage.GetOfferPageProductName();
		System.out.println(offerPageProdName+ " is extracted from Offer Page");
		
		
	}
	
	public void Move_To_Offers_Page() {
		
		
		LandingPage landingPage=testSetup.pageObjectManager.GetLandingPage();
		
		landingPage.ClickOnTopDeals();
		
		testSetup.utils.SwitchWindowToChild();
		
	}
	
	
	
	
	
	@And("User validates product name on landing page with offers page")
	public void User_validates_product_name_on_landing_page_with_offers_page() {
		
		Assert.assertEquals(offerPageProdName,testSetup.landingPageproductName);
		
	}

}
