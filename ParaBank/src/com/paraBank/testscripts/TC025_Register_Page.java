package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC025_Register_Page {

@Test	
	public static void tc025() throws Exception
	{
   //enter existing data in "phone, SSNno & username" textboxes
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("Anil", "Uttarkabat");
		Register_Page.address("Badapokharia", "Khordha", "Odisha", "752019");
		Register_Page.contact("6370344052", "53435465");//Bug-9
		Register_Page.loginDetails("Anil1504", "Anil1504", "Anil1504");
		Register_Page.registerBtn();
    	WholeApp.closeApplication();
		
		
	}
}