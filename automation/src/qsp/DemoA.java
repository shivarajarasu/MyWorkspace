 package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class DemoA {
	static void testA(WebDriver driver) {
	driver.get("https:/www.google.com");
		String title = driver.getTitle();
	
	System.out.println(title);
	driver.close();
}
		
	}
	

	


