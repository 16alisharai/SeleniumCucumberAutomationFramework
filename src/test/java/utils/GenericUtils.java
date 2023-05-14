package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	public void SwitchWindowToChild() {
		
		Set <String> s1= driver.getWindowHandles();  //in s1 we will have [0]parent and [1]child, we need to iterate next
		
		Iterator<String> i1= s1.iterator(); //parent window handle 
		
		String parentWindow= i1.next(); //parent window id gets stored
		String childWindow= i1.next(); // again next takes to child window handle
		
		driver.switchTo().window(childWindow);
	}

}
