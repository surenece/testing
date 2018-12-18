package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Allpages.Home_Page;
import Allpages.Log_In_Page;
import Allpages.Prcd_Home;
import Allpages.Service_Home;
import BaseClass.Baseclass;


public class Service_Home_Test extends Baseclass {
	Log_In_Page log_in;
	 Home_Page Homepage;
	 Service_Home ser_home;
	 Prcd_Home prd_hme;
	 
	 public Service_Home_Test() {
		 super();
		 
	 }
	 @BeforeMethod
		
		public void setup() {
			initialization();
			log_in = new Log_In_Page();
			Homepage =log_in.log_In(prop.getProperty("User"), prop.getProperty("Pwrd"));
			ser_home= Homepage.rev_403();
			
			}
	 
	 @Test(priority=1)
		
		public void Service_home_header_Test() {
			String hder = ser_home.Header_Chk();
			Assert.assertEquals(hder, "Instructions for applying  Temporary Crackers License");
			}
		
			@Test
			public void Ser_link_Test() {
				
				prd_hme =ser_home.Prcd_Btn();
						
			}
			@AfterMethod
			public void quite() {
				
				log_in.logout();
				driver.quit();
				
			}
			

}
