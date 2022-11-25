package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleselecvtlistbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\User\\Desktop\\hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("dosa");
		s.deselectByIndex(2);
		s.deselectByValue("d");
		s.deselectByVisibleText("idly");
		if(s.isMultiple()==true) {
			System.out.println("listbox multi select");
		}
		else {
			System.out.println("listbox is not multiselected");
		}
	
		
		

	}

}
