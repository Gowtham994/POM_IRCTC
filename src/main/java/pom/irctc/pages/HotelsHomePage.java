package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsHomePage extends GenericWrappers {
	
	public HotelsHomePage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public GuestUserLoginPage clickonLogin() {
		clickByXpath(prop.getProperty("HotelsHomePage.Login.XPath"));
		return new GuestUserLoginPage(driver,test);
	}
	
	public HotelsHomePage enterHotelName(String hotelname) {
		enterByXpath(prop.getProperty("HotelsHomePage.HotelName.XPath"), hotelname);
		return this;
	}
	
	public HotelsHomePage clickonSelectHotleName() {
		clickByXpath(prop.getProperty("HotelsHomePage.SelectHotleName.XPath"));
		return this;
	}
	
	public HotelsHomePage clickonFromDate() {
		clickByXpath(prop.getProperty("HotelsHomePage.FromDate.XPath"));
		return this;
	}
	
	public HotelsHomePage clickonSelectFromDate() {
		clickByXpath(prop.getProperty("HotelsHomePage.SelectFromDate.XPath"));
		return this;
	}
	
	public HotelsHomePage clickonTodate() {
		clickByXpath(prop.getProperty("HotelsHomePage.Todate.XPath"));
		return this;
	}
	
	public HotelsHomePage clickonSelectTodate() {
		clickByXpath(prop.getProperty("HotelsHomePage.SelectTodate.XPath"));
		return this;
	}
	
	public HotelsHomePage clickonRoomandGuestListbox() {
		clickByXpath(prop.getProperty("HotelsHomePage.RoomandGuestListbox.XPath"));
		return this;
	}
	
	public HotelsHomePage selectRooms(String rooms) {
		selectValueTextByXPath(prop.getProperty("HotelsHomePage.Rooms.XPath"), rooms);
		return this;
	}
	
	public HotelsHomePage selectAdult(String adult) {
		selectValueTextByXPath(prop.getProperty("HotelsHomePage.Adult.XPath"), adult);
		return this;
	}
	
	public HotelsHomePage clickonDoneButton() {
		clickByXpath(prop.getProperty("HotelsHomePage.DoneButton.XPath"));
		return this;
	}
	
	public FindHotelHomePage clickonFindHotels() {
		clickByXpath(prop.getProperty("HotelsHomePage.FindHotels.XPath"));
		return new FindHotelHomePage(driver,test);
	}
	public HotelsHomePage LastWindow() {
		switchToLastWindow();
		return this;
	}
	public HotelsHomePage waitProerty() {
		waitProperty(5000);
		return this;
	}
}
