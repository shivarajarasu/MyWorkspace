package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printfirstselectedoption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\User\\Desktop\\hotel.html");
		WebElement checkpost = driver.findElement(By.id("cp"));
		Select s=new Select(checkpost);
		WebElement fsoption = s.getFirstSelectedOption();
		String text = fsoption.getText();
		System.out.println(text);
		
		
		
		

	}

}
