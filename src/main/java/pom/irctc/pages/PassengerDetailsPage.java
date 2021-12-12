package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PassengerDetailsPage extends GenericWrappers {
	
	public PassengerDetailsPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public PassengerDetailsPage selectTitle(String title) {
		selectValueTextByXPath(prop.getProperty("PassengerDetailsPage.Title.XPath"), title);
		return this;
	}
	
	public PassengerDetailsPage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.FirstName.XPath"), firstname);
		return this;
	}
	
	public PassengerDetailsPage enterLastName(String lastname) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.LastName.XPath"), lastname);
		return this;
	}
	
	public PassengerDetailsPage selectCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("PassengerDetailsPage.Country.XPath"), country);
		return this;
	}
	
	public PassengerDetailsPage selectState(String state) {
		selectValueTextByXPath(prop.getProperty("PassengerDetailsPage.State.XPath"), state);
		return this;
	}
	
	public PassengerDetailsPage enterMobileNo(String mobile) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.MobileNo.XPath"), mobile);
		return this;
	}
	
	public PassengerDetailsPage enterEmail(String email) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.EmailID.XPath"), email);
		return this;
	}
	
	public PassengerDetailsPage selectGSTOptionalNO(String no) {
		selectValueTextByXPath(prop.getProperty("PassengerDetailsPage.GSTOptionalNO.XPath"),no);
		return this;
	}
	
	public PassengerDetailsPage selectGSTOptionalYes(String yes) {
		selectValueTextByXPath(prop.getProperty("PassengerDetailsPage.GSTOptionalYes.XPath"), yes);
		return this;
	}
	
	public PassengerDetailsPage enterGstNumber(String GSTNo) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.GstNumber.XPath"), GSTNo);
		return this;
	}
	
	public PassengerDetailsPage enterCompanyName(String companyName) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.CompanyName.XPath"), companyName);
		return this;
	}
	
	public PassengerDetailsPage enterCompanyAddress(String companyAddress) {
		enterByXpath(prop.getProperty("PassengerDetailsPage.CompanyAddress.XPath"), companyAddress);
		return this;
	}
	
	public PassengerDetailsPage clickonContinue() {
		clickByXpath(prop.getProperty("PassengerDetailsPage.Continue.XPath"));
		return this;
	}
	
	public SummaryPage clickonContinuebutton() {
		clickByXpath(prop.getProperty("PassengerDetailsPage.Continuebutton.XPath"));
		return new SummaryPage(driver,test);
	}
	
	/*public PassengerDetailsPage verifyGSTnumber() {
		verifyTextByXpath(prop.getProperty("PassengerDetailsPage.VerifyGSTnumber.XPath"), "Please Enter Valid GSt number");
		return this;
	}*/
	
	public PassengerDetailsPage waitProerty() {
		waitProperty(2000);
		return this;
	}
	
	public PassengerDetailsPage pageDown() {
		enterXpathpagedown();
		return this;
	}
	

}
