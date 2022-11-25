package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocater1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qspiders.com/");
			Thread.sleep(1000);
			driver.findElement(By.tagName("a")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.id("d")).click();
			driver.navigate().back();
			driver.findElement(By.name("n1")).click();
			driver.navigate().back();
			driver.findElement(By.className("c1")).click();
		
		
		

	}

}
