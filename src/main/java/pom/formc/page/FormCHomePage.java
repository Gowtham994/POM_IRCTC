package pom.formc.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers {
	
	public FormCHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public FormCUserRegistractionPage clickonSignupRegidtration() {
		clickByXpath(prop.getProperty("FormCHomePage.UserRegisteration.XPath"));
		return new FormCUserRegistractionPage(driver,test);
	}

}
