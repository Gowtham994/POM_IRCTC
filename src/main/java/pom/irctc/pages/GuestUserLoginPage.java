package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers {
	
	public GuestUserLoginPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public GuestUserLoginPage clickonGuestUserlogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.GuestUserlogin.XPath"));
		return this;
	}

	public GuestUserLoginPage enterEmail(String email) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.EmailID.XPath"), email);
		return this;
	}
	public GuestUserLoginPage enterMobileNumber(String mobile) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.MobileNo.XPath"), mobile);
		return this;
	}
	
	public HotelsHomePage clickonLoginButton() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.LoginButton.XPath"));
		return new HotelsHomePage(driver,test);
	}
	
	public GuestUserLoginPage LastWindow() {
		switchToLastWindow();
		return this;
		
	}
	public GuestUserLoginPage waitProerty() {
		waitProperty(2000);
		return this;
	}
}
