package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopupcancel {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		}

}
