package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.utility.WholeApp;

public class TC045_Login_Page {

@Test
	public static void tc045()
	{
	//verify textboxes of the page
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.textboxes();
		WholeApp.closeApplication();
	}
}