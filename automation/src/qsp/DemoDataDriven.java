package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoDataDriven {
	

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<String>();
		 al.add("https://demo.actitime.com/login.do");
		 al.add("admin");
		 al.add("admin@actitime.com");
		 al.add("manager");
		 System.out.println(al.get(2));
		 HashMap<String, String> hs = new HashMap<String,String>();
		 hs.put("url", "https://demo.actitime.com/login.do");
		 hs.put("username", "admin");
		 hs.put("password", "manager");
		 System.out.println(hs.get("password"));
		 
		
		

	}

}
