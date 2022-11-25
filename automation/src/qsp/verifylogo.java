package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifylogo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean loga = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(loga==true) {
			System.out.println("logon is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
			
		}
		driver.close();

	}

}
