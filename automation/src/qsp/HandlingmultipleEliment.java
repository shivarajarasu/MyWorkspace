package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class HandlingmultipleEliment {
	private static final char[] Text = null;

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\User\\Desktop\\handling.html");
	List<WebElement>	allLinks=driver.findElements(By.tagName("a"));
	 int count=allLinks.size();
		System.out.println(count);
		Object allink;
		WebElement allinks;
		WebElement link = null;
		String  text=link.getText();
		System.out.println(Text);
		driver.close();
		
	}

}
