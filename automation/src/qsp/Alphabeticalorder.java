package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphabeticalorder {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\User\\Desktop\\hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("MTR"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		 ArrayList<String> al = new ArrayList<String>();
		 for(int i=0;i<alloptions.size();i++) {
			 String text = alloptions.get(i).getText();
			 al.add(text);
		 
		 }
		 Collections.sort(al);
		 for(int i=0;i<al.size();i++) {
			 String e = al.get(i);
			 System.out.println(e);
		 }
		 
		
	}

}
