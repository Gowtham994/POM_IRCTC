package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRHomePage extends GenericWrappers {
	
	public FTRHomePage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public FTRUserRegistrationPage clickonNewUserSignup() {
		clickByXpath(prop.getProperty("FTRHomePage.NewUserSignup.XPath"));
		return new FTRUserRegistrationPage(driver,test);
	}
	
	public FTRHomePage LastWindow() {
		// TODO Auto-generated method stub
		switchToLastWindow();
		return this;
	}
}
