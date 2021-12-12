package pom.facebooksignup.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CreatePage extends GenericWrappers {
	
	public CreatePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public SignupPage clickonCreateNewAccount() {
		clickByXpath(prop.getProperty("FacebookHomePage.CreateAccount.XPath"));
		return new SignupPage(driver,test);
	}
	
	

}
