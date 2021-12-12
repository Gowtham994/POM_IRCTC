package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FindHotelHomePage extends GenericWrappers {
	
	public FindHotelHomePage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public GuestUserLoginPage clickonLoginPage() {
		clickByXpath(prop.getProperty("FindHotelHomePage.GuestUserLoginPage.XPath"));
		return new GuestUserLoginPage(driver,test);
	}

	public FindHotelHomePage getHotelName() {
		getTextByXpath(prop.getProperty("FindHotelHomePage.getHotelName.XPath"));
		return this;
	}
	
	public FindHotelHomePage getstandardHotelPrice() {
		getTextByXpath(prop.getProperty("FindHotelHomePage.getstandardHotelPrice.XPath"));
		return this;
	}
	
	public FindHotelHomePage getHotelPrice() {
		getTextByXpath(prop.getProperty("FindHotelHomePage.getHotelPrice.XPath"));
		return this;
	}
	
	public PassengerDetailsPage clickonContinueToBook() {
		clickByXpath(prop.getProperty("FindHotelHomePage.ContinueToBook.XPath"));
		return new PassengerDetailsPage(driver,test);
	}
	
	
}
