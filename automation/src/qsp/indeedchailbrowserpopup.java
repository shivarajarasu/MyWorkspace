package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeedchailbrowserpopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		int count=allwh.size();
		System.out.println(count);
		driver.quit();
		
		

	}

}
