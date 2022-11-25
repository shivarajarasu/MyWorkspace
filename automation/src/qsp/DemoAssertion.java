package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

	@Test
	public void verifytitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title="soogle";
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(title)) {
			System.out.println("title is matching and pass");
		}
		else
		{
			System.out.println("title is not matching and fail");
		}
		
		driver.close();
		
	}
	
		

	}


