package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class customermodule1 {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("openbrowser", true);
	}
	@AfterClass
	public void classbrowser() {
		Reporter.log("closebrowser", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login", true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}
@Test(priority=1,invocationCount=2)
public void editcustomer() {
	Reporter.log("editcustomer", true);
}
@Test
public void registercustomer() {
	Reporter.log("registercustomer", true);
}
@Test
public void deletcustomer() {
	Reporter.log("deletcustomer", true);
		
	}

}
