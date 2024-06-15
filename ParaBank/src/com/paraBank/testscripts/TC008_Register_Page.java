package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC008_Register_Page {

@Test	
	public static void tc008() throws Exception
	{
	//without enter "phone"
		WholeApp.openApplication();
		WholeApp.implicityWait();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("Anil", "Uttarkabat");
		Register_Page.address("Badapokharia", "Khordha", "Odisha", "752019");
		Register_Page.contact("", "53435465");
		Register_Page.loginDetails("Anil1504", "Anil1504", "Anil1504");
		Register_Page.registerBtn();
    	WholeApp.closeApplication();
		
		
	}
}
