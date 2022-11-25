package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean input = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isSelected();
		if (input ==true) {
			System.out.println("input is selected");
			
		}
		else
		{
			System.out.println("input is not selected");
		}
		driver.close();
	}

}
