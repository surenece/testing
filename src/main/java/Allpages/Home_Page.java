package Allpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass;



public class Home_Page extends Baseclass {
	
	
	@FindBy(xpath="//img[contains(@alt,'tamilndaulogo')]")WebElement Logo;
	@FindBy(partialLinkText="REV-403")WebElement Service_1;
//	@FindBy(id="form1:j_id1148295558_11cd0f9c") WebElement Proceed;
//	@FindBy(className="sectionheader")WebElement header;
//	@FindBy(linkText="Register Can")WebElement Can_reg;
	
	
public Home_Page() {
		
		PageFactory.initElements(driver, this);
		
	}

	public Boolean logo_check(){
	
	return Logo.isDisplayed();

}
	public Service_Home rev_403() {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
		
		Service_1.click();
		return new Service_Home();
	}
	

}
