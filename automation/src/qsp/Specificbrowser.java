package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificbrowser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the title which has to be closed");
	 String expectedTitle = sc.nextLine();
	 WebDriver driver=new ChromeDriver();
	  driver.get("https://secure.indeed.com/");
	  driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	  driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
	  Set<String> allwh = driver.getWindowHandles();
	  for(String wh:allwh) {
		  Thread.sleep(2000);
		  driver.switchTo().window(wh);
		  String actualTitle = driver.getTitle();
		  if(actualTitle.equals(expectedTitle)) {
			  
			 
			    
		  }
		  else {
			  driver.close();
		  }
	  }

	}

}
