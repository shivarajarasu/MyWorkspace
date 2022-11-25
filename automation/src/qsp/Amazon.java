package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	int count = alllinks.size();
	System.out.println("Number of links present on amazon page is : "+count);
	for(int i=0;i<count;i++) {
		String text = alllinks.get(i).getText();
		System.out.println(text);
	}
	
	
	}
}
