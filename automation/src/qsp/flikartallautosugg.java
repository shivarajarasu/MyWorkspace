package qsp;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flikartallautosugg {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(4000);
		List<WebElement> allsugg = driver.findElements(By.tagName("ul"));
		int count = allsugg.size();
		for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();
			System.out.print(text);
		} 
		allsugg.get(0).click();
		driver.close();
	}

}
