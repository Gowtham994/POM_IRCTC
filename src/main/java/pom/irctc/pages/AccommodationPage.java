package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}

	public HotelsHomePage clickonHotels() {
		
		clickByXpath(prop.getProperty("AccommodationPage.HotelHomePage.XPath"));
		return new HotelsHomePage(driver,test);
		
	}
	public AccommodationPage clickonSidebar() {
		clickByXpath(prop.getProperty("AccommodationPage.Sidebar.XPath"));
		return this;
	}
	
	public CharterPage clickonCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.Charter.XPath"));
		return new CharterPage(driver,test);
	}
	
	public FTRHomePage clickonBookYourCoach() {
		clickByXpath(prop.getProperty("AccommodationPage.BookYourCoach.XPath"));
		return new FTRHomePage(driver,test);
	}

	public AccommodationPage LastWindow() {
		// TODO Auto-generated method stub
		switchToLastWindow();
		return this;
	}
	
	
}
