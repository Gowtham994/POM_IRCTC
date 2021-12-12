package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OTPPage extends GenericWrappers{
	
	public OTPPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public OTPPage clickonVerifybutton() {
		clickByXpath(prop.getProperty("OTPPage.Verifybutton.XPath"));
		return this;
	}
	
	public OTPPage verifyOTPisRequired() {
		verifyTextByXpath(prop.getProperty("OTPPage.VerifyOTPisRequired.XPath"), "otp is required.");
		return this;
	}
	
	
		
	

}
