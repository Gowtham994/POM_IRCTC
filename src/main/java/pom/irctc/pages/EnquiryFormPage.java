package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers{
	
	public EnquiryFormPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}

	public EnquiryFormPage enterNameofApplication(String name) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NameofApplication.XPath"), name);
		return this;
	}
	
	public EnquiryFormPage enterNameoforganization(String organization) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Nameoforganization.XPath"), organization);
		return this;
	}
	
	public EnquiryFormPage enterAddress(String address) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Address.XPath"), address);
		return this;
	}
	
	public EnquiryFormPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("EnquiryFormPage.MobileNO.XPath"), mobile);
		return this;
	}
	
	public EnquiryFormPage enterEmail(String email) {
		enterByXpath(prop.getProperty("EnquiryFormPage.EmailID.XPath"), email);
		return this;
	}
	
	public EnquiryFormPage selectRequestfor(String value) {
		selectValueTextByXPath(prop.getProperty("EnquiryFormPage.Request.XPath"), value);
		return this;
	}
	
	public EnquiryFormPage enterOriginStation(String originStation) {
		enterByXpath(prop.getProperty("EnquiryFormPage.OriginStation.XPath"), originStation);
		return this;
	}
	
	public EnquiryFormPage enterDestnationStation(String destnStation) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DestnationStation.XPath"), destnStation);
		return this;
	}
	
	public EnquiryFormPage clickonDateOfDeparture() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DateOfDeparture.XPath"));
		return this;
	}
	
	public EnquiryFormPage clickonYourDeparturedate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.YourDeparturedate.XPath"));
		return this;
	}
	
	public EnquiryFormPage clickonCheckOutDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckOutDate.XPath"));
		return this;
	}
	
	public EnquiryFormPage clickonYourOutdate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.YourOutdate.XPath"));
		return this;
	}

	
	public EnquiryFormPage enterDurationPeriod(String durationPeriod) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DurationPeriod.XPath"), durationPeriod);
		return this;
	}
	
	public EnquiryFormPage enterCoachDetails(String coachDetails) {
		enterByXpath(prop.getProperty("EnquiryFormPage.CoachDetails.XPath"), coachDetails);
		return this;
	}
	
	public EnquiryFormPage enterNumberofPassenger(String numPassenger) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NumberofPassenger.XPath"), numPassenger);
		return this;
	}
	
	public EnquiryFormPage enterCharterPurpose(String charterPurpose) {
		enterByXpath(prop.getProperty("EnquiryFormPage.CharterPurpose.XPath"), charterPurpose);
		return this;
	}
	
	public EnquiryFormPage enterServices(String services) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Services.XPath"), services);
		return this;
	}
	
	public EnquiryFormPage clickonSubmit() {
		clickByXpath(prop.getProperty("EnquiryFormPage.SubmitButton.XPath"));
		return this;
	}
	
	public EnquiryFormPage verifyMobileNoNotvalid() {
		verifyTextByXpath(prop.getProperty("EnquiryFormPage.VerifyMobileNoNotValid.XPath"), "Mobile no. not valid");
		return this;
	}
	
	public EnquiryFormPage waitProerty() {
		waitProperty(2000);
		return this;
	}
	
}
