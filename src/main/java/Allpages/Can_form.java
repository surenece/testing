package Allpages;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Baseclass;
import Config.datepicking;


public class Can_form extends Baseclass {
	
	@FindBy(id="canreg:aadharnum")WebElement aadhar;
	@FindBy(id="canreg:appelation")WebElement appelation;
	@FindBy(id="canreg:enappname")WebElement App_Name_En;
	@FindBy(id="canreg:tnappname")WebElement App_Name_Tn;
	@FindBy(id="canreg:genderid")WebElement gender;
	@FindBy(id="canreg:maritalid")WebElement Marital_sts;
	@FindBy(id="canreg:dobInputDate")WebElement Dob;
	@FindBy(id="canreg:relation")WebElement Relation;
	@FindBy(id="canreg:enfatname")WebElement F_Name_en;
	@FindBy(id="canreg:tnfatname")WebElement F_Name_tn;
	@FindBy(id="canreg:enmthname")WebElement M_Name_en;
	@FindBy(id="canreg:tnmthname")WebElement M_Name_tn;
	@FindBy(id="canreg:religionid")WebElement Religion;
	@FindBy(id="canreg:communityid")WebElement community;
	@FindBy(id="canreg:occupationid")WebElement occupation;
	@FindBy(id="canreg:cdistrictid")WebElement Dist;
	@FindBy(id="canreg:ctalukaid")WebElement Taluk;
	@FindBy(id="canreg:cvillageid")WebElement Village;
	@FindBy(id="canreg:streetnum")WebElement Street;
	@FindBy(id="canreg:streetnumtm")WebElement Street_tm;
	@FindBy(id="canreg:buildnum")WebElement Door;
	@FindBy(id="canreg:cpin")WebElement Pin;
	@FindBy(id="canreg:sameadd")WebElement Add_same;
	@FindBy(id="canreg:mobile")WebElement Mble;
	@FindBy(id="canreg:j_id1547389060_749b37bf")WebElement otp_gen;
	@FindBy(id="canreg:otp_id")WebElement otp;
	@FindBy(id="canreg:j_id1547389060_749b3618")WebElement otp_cfrm;
	@FindBy(id="canreg:register")WebElement Reg;
	@FindBy(className="sectionheader") WebElement can_hed;
	@FindBy(xpath="//*[@id='canreg']/div/fieldset/table[1]/tbody/tr[2]/td/span") WebElement can_no;
	
public Can_form() {
		
		PageFactory.initElements(driver, this);
		
	}
 public Can_no_Page appl_details(String adhar,String appel,String sex,String name,String maritalsts,String DOB,
		 String Relationship,String F_name,String M_name,String relgn,String cmunty,String wrk,String Dis,String Tal,
		 String village,String St_name,String Stname_tn,String door_no,String pin,String ph) throws InterruptedException {
	 Thread.sleep(2000);
	 
	 aadhar.sendKeys(adhar);
	 
	 //Thread.sleep(2000);
	 Select appl = new Select(appelation);
	 //appl.selectByValue("6");
	 
	   List<WebElement> list = appl.getOptions();
			
			for(int i=0; i <= list.size();i++) {
				if(list.get(i).getText().contains(appel)) {
					list.get(i).click();

				break;
				}
					
			}
			Thread.sleep(2000);
			App_Name_En.sendKeys(name);
			App_Name_Tn.sendKeys(name);
			App_Name_Tn.sendKeys(Keys.SPACE);
			Thread.sleep(2000);
			Select sx = new Select(gender);
			//sex.selectByValue("1");
			 List<WebElement> S_list = sx.getOptions();
				
				for(int i=0; i <= S_list.size();i++) {
					if(S_list.get(i).getText().contains(sex)) {
						S_list.get(i).click();

					break;
					}
						
				}

			
			Thread.sleep(2000);
			 Select marital = new Select(Marital_sts);
			 
			   List<WebElement> Ma_list = marital.getOptions();
					
					for(int i=0; i <= Ma_list.size();i++) {
						if(Ma_list.get(i).getText().equals(maritalsts)) {
							Ma_list.get(i).click();

						break;
						}
							
					}
					// WebElement date= driver.findElement(By.id("paymentForm:challanDateInputDate"));
					 
					// String val= prop.getProperty("val");
					datepicking.datejs(driver,Dob,DOB);
					//Dob.sendKeys(DOB);	
					
					Thread.sleep(4000);
					//System.out.println("ok");
					 Select rel = new Select(Relation);
					 
					   List<WebElement> rel_list = rel.getOptions();
					   System.out.println("ok:"+ rel_list);
							for(int i=0; i <= rel_list.size();i++) {
								if(rel_list.get(i).getText().contains(Relationship)) {
									rel_list.get(i).click();

								break;
								}
									
							}
							
							
							Thread.sleep(4000);
							
							F_Name_en.sendKeys(F_name);
							F_Name_tn.sendKeys(F_name);
							F_Name_tn.sendKeys(Keys.SPACE);
							M_Name_en.sendKeys(M_name);
							M_Name_tn.sendKeys(M_name);
							M_Name_tn.sendKeys(Keys.SPACE);
							Thread.sleep(4000);
							Select religion = new Select(Religion);
							 
							   List<WebElement> re_list = religion.getOptions();
									
									for(int i=0; i <= re_list.size();i++) {
										if(re_list.get(i).getText().contains(relgn)) {
											re_list.get(i).click();

										break;
										}
											
									}
									Thread.sleep(4000);
									
									Select Com = new Select(community);
									 
									   List<WebElement> c_list = Com.getOptions();
											
											for(int i=0; i <= c_list.size();i++) {
												if(c_list.get(i).getText().contains(cmunty)) {
													c_list.get(i).click();

												break;
												}
													
											}
											Thread.sleep(4000);
											
											Select occu = new Select(occupation);
											 
											   List<WebElement> oc_list = occu.getOptions();
													
													for(int i=0; i <= oc_list.size();i++) {
														if(oc_list.get(i).getText().contains(wrk)) {
															oc_list.get(i).click();

														break;
														}
															
													}
	 
 		
													Thread.sleep(4000);
	
	Select district = new Select(Dist);
	 
	   List<WebElement> d_list = district.getOptions();
			
			for(int i=0; i <= d_list.size();i++) {
				if(d_list.get(i).getText().contains(Dis)) {
					d_list.get(i).click();

				break;
				}
					
			}
			Thread.sleep(4000);
			Select taluk = new Select(Taluk);
			 
			   List<WebElement> t_list = taluk.getOptions();
					
					for(int i=0; i <= t_list.size();i++) {
						if(t_list.get(i).getText().contains(Tal)) {
							t_list.get(i).click();

						break;
						}
							
					}
					Thread.sleep(4000);
					Select vilge = new Select(Village);
					 
					   List<WebElement> v_list = vilge.getOptions();
							
							for(int i=0; i <= v_list.size();i++) {
								if(v_list.get(i).getText().contains(village)) {
									v_list.get(i).click();

								break;
								}
									
							}
							
							Street.sendKeys(St_name);
							Street_tm.sendKeys(Stname_tn);
							Street_tm.sendKeys(Keys.SPACE);
							Door.sendKeys(door_no);
							Pin.sendKeys(pin);
							JavascriptExecutor js =((JavascriptExecutor)driver);
							js.executeScript("arguments[0].click();",Add_same);
							//Add_same.click();
	
		
		Mble.sendKeys(ph);
		otp_gen.click();
		Thread.sleep(4000);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter otp no:");
		Thread.sleep(4000);
		String otp_no = in.nextLine();
		Thread.sleep(4000);
		System.out.println(otp_no);
		otp.sendKeys(otp_no);
		
		
		otp_cfrm.click();
		Thread.sleep(2000);
		JavascriptExecutor js1 =((JavascriptExecutor)driver);
		js1.executeScript("arguments[0].click();", Reg);
		//Reg.click();
		Thread.sleep(5000);
		String can=can_no.getText();
		System.out.println(can);
		Thread.sleep(3000);
		in.close();
		return new Can_no_Page();
		
	}

}

