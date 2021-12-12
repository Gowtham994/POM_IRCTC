package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public HomePage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Register.XPath"));
		return new RegistrationPage(driver,test);
	}
	
	
	public HomePage mouseHoverOnHolidays() {
		clickByXpath(prop.getProperty("HomePage.Holidays.XPath"));
		return this;
	}
	
	
	public HomePage mouseHoverOnStays() {
		clickByXpath(prop.getProperty("HomePage.Stays.XPath"));
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.XPath"));
		return new AccommodationPage(driver,test);
	}

	public HomePage waitProerty() {
		waitProperty(2000);
		return this;
	}
	
	public HomePage pageDown() {
		enterXpathpagedown();
		return this;
	}
	
	public AccommodationPage LastWindow() {
		switchToLastWindow();
		return new AccommodationPage(driver,test);
		
	}
}
