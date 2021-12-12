package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRUserRegistrationPage extends GenericWrappers {
	
	public FTRUserRegistrationPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public FTRUserRegistrationPage enterUserId(String userid) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.UserID.XPath"), userid);
		return this;
	}
	
	public FTRUserRegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Password.XPath"), password);
		return this;
	}
	
	public FTRUserRegistrationPage enterConfirmPassword(String cnfPassword) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.ConfirmPassword.XPath"), cnfPassword);
		return this;
	}
	
	public FTRUserRegistrationPage selectSecurityQuestion(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.SecurityQuestion.XPath"), value);
		return this;
	}
	public FTRUserRegistrationPage enterSecurityAnswer(String answer) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.SecurityAnswer.XPath"), answer);
		return this;
	}
	
	public FTRUserRegistrationPage enterDateOfBirth(String DOB) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.DateOfBirth.XPath"), DOB);
		return this;
	}
	
	public FTRUserRegistrationPage clickonBirthdate() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.Birthdate.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage clickonGender(String Value) {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.Gender.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage clickonMaritalStatus() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.MaritalStatus.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage enterEmail(String email) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.EmailID.XPath"), email);
		return this;
	}
	
	public FTRUserRegistrationPage selectOccupation(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.Occupation.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterFirstname(String fname) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.FirstName.XPath"), fname);
		return this;
	}
	
	public FTRUserRegistrationPage enterMiddleName(String mname) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.MiddleName.XPath"), mname);
		return this;
	}
	
	public FTRUserRegistrationPage enterLastName(String lname) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.LastName.XPath"), lname);
		return this;
	}
	
	public FTRUserRegistrationPage selectNationality(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.Nationality.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterFlatNo(String flatNo) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.FlatNo.XPath"), flatNo);
		return this;
	}
	
	public FTRUserRegistrationPage enterStreet(String street) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Street.XPath"), street);
		return this;
	}
	
	public FTRUserRegistrationPage enterArea(String area) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Area.XPath"), area);
		return this;
	}
	
	public FTRUserRegistrationPage SelectCountry(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.Country.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterMobileNo(String mobile) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.MobileNo.XPath"), mobile);
		return this;
	}
	
	public FTRUserRegistrationPage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Pincode.XPath"), pincode);
		return this;
	}
	
	public FTRUserRegistrationPage selectCity(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.City.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage selectState(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.State.XPath"), value);
		return this;
	}

	
	public FTRUserRegistrationPage selectPostOffice(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.PostOffice.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage ClickonSameAddressresidentialNo() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.SameAddressresidentialNo.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage enterFlatNoOffice(String flatNoOffice) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.FlatNoOffice.XPath"), flatNoOffice);
		return this;
	}
	
	public FTRUserRegistrationPage enterStreetOffice(String streetOffice) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.StreetOffice.XPath"), streetOffice);
		return this;
	}
	
	public FTRUserRegistrationPage enterAreaOffice(String areaOffice) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.AreaOffice.XPath"), areaOffice);
		return this;
	}
	
	public FTRUserRegistrationPage SelectCountryOffice(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.CountryOffice.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterMobileOffice(String mobileOffice) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.MobileOffice.XPath"), mobileOffice);
		return this;
	}
	
	public FTRUserRegistrationPage enterPincodeOffice(String pincodeOffice) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.PincodeOffice.XPath"), pincodeOffice);
		return this;
	}
	
	public FTRUserRegistrationPage SelectCityOffice(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.CityOffice.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage SelectStateOffice(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.StateOffice.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage SelectPostOfficeOffice(String value) {
		selectValueTextByXPath(prop.getProperty("FTRUserRegistrationPage.PostOfficeOffice.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage waitProerty() {
		waitProperty(2000);
		return this;
	}
	
	public FTRUserRegistrationPage pageDown() {
		enterXpathpagedown();
		return this;
	}
	
}
