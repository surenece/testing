package testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Allpages.Can_form;
import Allpages.Can_no_Page;
import Allpages.Home_Page;
import Allpages.Log_In_Page;
import Allpages.Prcd_Home;
import Allpages.Service_Home;
import BaseClass.Baseclass;
import Excel_lib.testutility_xl;

public class Can_num_Test extends Baseclass {
	
	Log_In_Page log_in;
	 Home_Page Homepage;
	 Service_Home ser_home;
	 Prcd_Home prd_hme;
	 Can_form can_frm;
	 Can_no_Page can_num;
	 	 
	 public Can_num_Test() {
			
			super();
		}
	 
	

	 @BeforeMethod
		
		public void setup() {
			initialization();
			
			 log_in = new Log_In_Page();
				Homepage =log_in.log_In(prop.getProperty("User"), prop.getProperty("Pwrd"));
				ser_home= Homepage.rev_403();
				prd_hme = ser_home.Prcd_Btn();
				can_frm = prd_hme.Can_frm();
			}
		@DataProvider

		 public Iterator<Object[]> exceldata() {

				ArrayList<Object[]> testdata = testutility_xl.getdata();

				System.out.println(testdata);

				return testdata.iterator();
			}
	 
	
	 
	 
	 
	 @Test (dataProvider = "exceldata")
	 public void can_header_chk(String adhar, String appel, String sex, String name, String maritalsts, String DOB,
					String Relationship, String F_name, String M_name, String relgn, String cmunty, String wrk, String Dis,
					String Tal, String village, String St_name, String Stname_tn, String door_no, String pin, String ph) throws InterruptedException {
			 
			
			
				can_num = can_frm.appl_details(adhar, appel, sex, name, maritalsts, DOB, Relationship, F_name, M_name, relgn, cmunty, wrk, Dis, Tal, village, St_name, Stname_tn, door_no, pin, ph);
		 
		 String header = can_num.Hedaer_ck();
		 System.out.println(header);
		 Assert.assertEquals(header, "CAN Registration Successful");
		
	 }
	

	 
	 @AfterMethod
		public void quite() {
			
			log_in.logout();
			driver.quit();
			
		}
	 
	 
}
