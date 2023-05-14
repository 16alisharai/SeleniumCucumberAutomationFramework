package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(file);
		String url= prop.getProperty("QAurl");
		
		
		if(driver==null) {
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				//invoking chrome driver 
				System.setProperty("webdriver.chrome.driver","/Users/alisha.raizada/Downloads/chromedriver_mac_arm64 (1)/chromedriver");
				driver = new ChromeDriver(); 
				driver.get(url);
		}}
		   return driver;
	}
	
	

}
