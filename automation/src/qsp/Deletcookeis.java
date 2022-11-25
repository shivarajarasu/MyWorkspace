package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletcookeis {


	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] asrgs) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.quit();

	}

}

