package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class onlydublicatoptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\User\\Desktop\\hotel.html");
	WebElement mtrlistbox = driver.findElement(By.id("MTR"));
	Select s=new Select(mtrlistbox);
	List<WebElement> alloptions = s.getOptions();
	 HashSet<String> hs = new HashSet<String>();
	 for(int i=0;i<alloptions.size();i++) {
		 String text = alloptions.get(i).getText();
		 if(hs.add(text)==false) {
			 System.out.println(text); 
		 }
		 
		 
	 }
	
	
		
	

	}

}
