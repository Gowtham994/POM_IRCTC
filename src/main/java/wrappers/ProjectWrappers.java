package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers {
	
	public String browser;
	public String appName;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
		
	}
	
	@BeforeTest
	public void beforeTest() {
		loadObject();
	}
	
		
	@BeforeMethod
	public void beforeMethod() {
		startTest(testcaseName, testcaseDescription);
		switch (appName) {
		case "Facebook":
			invokeApp(browser, "http://www.facebook.com");
			break;
		case "FormC":
			invokeApp(browser, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
		case "IRCTC":
			invokeApp(browser, "https://www.irctc.co.in");
			break;
		case "Pancard":
			invokeApp(browser, "https://panind.com/india/new_pan/");
			break;
		case "PHPTravel":
			invokeApp(browser, "https://www.phptravels.org/register.php");
			break;
		}
	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
		
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
		
	}
	
	@AfterTest
	public void afterTest() {
		unloadObjects();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}

}
