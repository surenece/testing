package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Allpages.Can_form;
import Allpages.Home_Page;
import Allpages.Log_In_Page;
import Allpages.Service_Home;
import BaseClass.Baseclass;



public class Home_Test extends Baseclass {
	 Log_In_Page log_in;
	 Home_Page Homepage;
	 Service_Home ser_link;
	
public Home_Test() {
		
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		initialization();
		log_in = new Log_In_Page();
		Homepage =log_in.log_In(prop.getProperty("User"), prop.getProperty("Pwrd"));
		}

	@Test(priority=1)
	
	public void homepage_logo_Test() {
		Boolean logo = Homepage.logo_check();
		Assert.assertTrue(logo);
		}
	
		@Test
		public void can_frm_test() {
			
			ser_link = Homepage.rev_403();
					
		}
		@AfterMethod
		public void quite() {
			
			log_in.logout();
			driver.quit();
			
		}
		
		
	}

