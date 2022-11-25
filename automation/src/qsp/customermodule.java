package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class customermodule {
	@BeforeMethod
	public void login() {
		Reporter.log("login", true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
	}
	@Test
	public void createcustomer() {
		Reporter.log("creatcustomer", true);
		
	}
	@Test
	public void modifycustomer() {
		Reporter.log("modifycustomer", true);
	}

}
