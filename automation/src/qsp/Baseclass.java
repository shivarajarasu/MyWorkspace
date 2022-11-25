package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
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

}
