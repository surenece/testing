package testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Allpages.Home_Page;
import Allpages.Log_In_Page;
import BaseClass.Baseclass;




public class Log_in_Test extends Baseclass {
	
	Log_In_Page login;
	Home_Page homepage;
	public ExtentReports extent;
	public ExtentTest extentTest;
	
	public Log_in_Test() {
		super();	
	}
	@BeforeTest
	public void setExtent(){
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "Suren windows");
		extent.addSystemInfo("User Name", "Surendhar tester");
		extent.addSystemInfo("Environment", "QA");
	}
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		
		//FileUtils.
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	
	
	@AfterTest
	public void endReport(){
		extent.flush();
		extent.close();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login = new Log_In_Page();
		}
	@Test(priority=1)
	public void Title_Check() {
		extentTest = extent.startTest("Title Check");
		String Title = login.Title_check();
		Assert.assertEquals(Title, "Tamil Nadu e-Districdt");
	}
	@Test(priority=2)
	public void logotest() {
		extentTest = extent.startTest("Logo Check");
		Boolean flag = login.logo_check();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void login() {
		
		extentTest = extent.startTest("Home Page Test");
	homepage =	login.log_In(prop.getProperty("User"), prop.getProperty("Pwrd"));
		
	}
	
	
	@AfterMethod
	
		
		public void tearDown(ITestResult result) throws IOException{
			
			if(result.getStatus()==ITestResult.FAILURE){
				extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
				extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
				
				String screenshotPath = Log_in_Test.getScreenshot(driver, result.getName());
				extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
				//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
			}
			else if(result.getStatus()==ITestResult.SKIP){
				extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
			}
			else if(result.getStatus()==ITestResult.SUCCESS){
				extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
	 		}
			
			
			extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
		
		login.logout();
		driver.quit();
		
	}



}
