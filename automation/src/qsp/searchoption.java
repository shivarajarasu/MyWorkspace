package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchoption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the option");
		  String option = sc.nextLine();
		  WebDriver driver=new ChromeDriver();
		  driver.get("C:\\Users\\User\\Desktop\\hotel.html");
		  WebElement mtrlistbox = driver.findElement(By.id("MTR"));
		  Select s=new Select(mtrlistbox);
		  List<WebElement> alloptions = s.getOptions();
		  int counter=0;
		  for(int i=0;i<alloptions.size();i++) {
			String text = alloptions.get(i).getText();
			if(option.equals(text)) {
				counter++;					
			}

	}
		
		if (counter==0) {
			System.out.println(option+" is not prsent");
		}
		else if(counter==1) {
			System.out.println(option+" is present without duplicates");
			
			
		}
	}

}
