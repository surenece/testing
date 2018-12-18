package Allpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass;



public class Log_In_Page extends Baseclass {
	
	@FindBy(linkText="Login")WebElement login;
	
	@FindBy(linkText="CSC Login")WebElement csc;
	
	@FindBy(id="lgForm4:user2")WebElement user;
	
	@FindBy(id="lgForm4:password2")WebElement pwd;
	
	@FindBy(id="lgForm4:csclogin")WebElement logbtn;
	
	@FindBy(xpath="//img[contains(@alt,'e-District Tamil Nadu logo')]")WebElement logo;
	
	@FindBy(partialLinkText="Please click here") WebElement relog;
	
	@FindBy(className="logotlnk") WebElement logout;
	
	@FindBy(partialLinkText="Please click here") WebElement Session_out;
	
	/* Initialize page factory*/
	
	public Log_In_Page() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String Title_check(){
		
		return driver.getTitle();
	
	}
	public Boolean logo_check(){
		
		return logo.isDisplayed();
		
	}
	
	public Home_Page log_In(String un,String Pwrd) {
		
		login.click();
		csc.click();
		user.sendKeys(un);
		pwd.sendKeys(Pwrd);
		logbtn.click();
		String Url = driver.getCurrentUrl();
		
		if(Url.equals("http://14.102.15.83/tneda/common/dashboard.xhtml?faces-redirect=true")){
			
			System.out.println("you enterde Service home page");
		}else{
			Session_out.click();
			driver.navigate().refresh();
			login.click();
			csc.click();
			user.sendKeys(un);
			pwd.sendKeys(Pwrd);
			logbtn.click();
		}
				
		return new Home_Page();
	}
	
	public  void logout() {
		
		//JavascriptExecutor js =((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].click();", logout);
		//logout.click();
		driver.quit();
		
	}
	
}
