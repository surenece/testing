package Allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass;



public class Can_no_Page extends Baseclass {
	
	@FindBy(className="sectionheader") WebElement can_hed;
	@FindBy(xpath="//*[@id='canreg']/div/fieldset/table[1]/tbody/tr[2]/td/span") WebElement can_no;
	
public Can_no_Page() {
		
		PageFactory.initElements(driver, this);
		
	}
public String Hedaer_ck() {
	
	String can=can_no.getText();
	System.out.println(can);
	return can_hed.getText();
}
	
}
