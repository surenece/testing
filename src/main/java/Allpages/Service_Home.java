package Allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass;

public class Service_Home extends Baseclass {
	@FindBy(xpath="//*[@id=\"phead\"]/div")WebElement header;
	@FindBy(id="form1:j_id1148295558_11cd0f9c") WebElement Proceed;
	
	@FindBy(id="form1:j_id1148295558_11cd0f48")WebElement cnl_btn;
//	@FindBy(linkText="Register Can")WebElement Can_reg;
	
	public Service_Home() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String Header_Chk() {
		return header.getText();
		
	}
	
	public Prcd_Home Prcd_Btn() {
		Proceed.click();
		return new Prcd_Home();
		
	}
	public Service_Home Cncl_btn() {
		
		cnl_btn.click();
		return new Service_Home();
		
	}
	

}
