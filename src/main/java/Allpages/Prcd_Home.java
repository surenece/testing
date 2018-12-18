package Allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass;

public class Prcd_Home extends Baseclass {
	
	
	@FindBy(className="sectionheader")WebElement header;
	@FindBy(linkText="Register Can")WebElement Can_reg;
	
	public Prcd_Home() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String Header_Chk() {
		return header.getText();
		
	}
	
	public Can_form Can_frm() {
		
	Can_reg.click();
		return new Can_form();
	}


}
