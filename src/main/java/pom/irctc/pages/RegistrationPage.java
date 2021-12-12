package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	public RegistrationPage enterUserName(String username) {
		enterByXpath(prop.getProperty("RegistrationPage.Username.XPath"), username);
		return this;
	}
	public RegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), password);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String confirmpassword) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.XPath"), confirmpassword);
		return this;
	}
	public RegistrationPage clickonPreferredLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguage.XPath"));
		return this;
	}
	public RegistrationPage clickonYourLanguage(String Value) {
		clickByXpath(prop.getProperty("RegistrationPage.YourLanguage.XPath"));
		return this;
	}
	public RegistrationPage clickonSecurityQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.XPath"));
		return this;
	}
	public RegistrationPage clickonYourQuestion(String value) {
		clickByXpath(prop.getProperty("RegistrationPage.YourQuestion.XPath"));
		return this;
	}
	public RegistrationPage enterSecurityAnswer(String securityanswer) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.XPath"), securityanswer);
		return this;
	}
	public RegistrationPage clickonContinueButton() {
		clickByXpath(prop.getProperty("RegistrationPage.ContinueButton.XPath"));
		return this;
	}
	public RegistrationPage enterFirstname(String firstname) {
		enterByXpath(prop.getProperty("RegistrationPage.Firstname.XPath"), firstname);
		return this;
	}
	public RegistrationPage enterMiddlename(String middlename) {
		enterByXpath(prop.getProperty("RegistrationPage.Middlename.XPath"), middlename);
		return this;
	}
	public RegistrationPage enterLastname(String lastname) {
		enterByXpath(prop.getProperty("RegistrationPage.Lastname.XPath"), lastname);
		return this;
	}
	public RegistrationPage clickonSelectOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.XPath"));
		return this;
	}
	public RegistrationPage clickonYourOccupation(String value) {
		clickByXpath(prop.getProperty("RegistrationPage.YourOccupation.XPath"));
		return this;
	}
	public RegistrationPage enterDOB(String DOB) {
		enterByXpath(prop.getProperty("RegistrationPage.DOB.XPath"), DOB);
		return this;
	}
	public RegistrationPage clickonMarriageStatus(String value) {
		clickByXpath(prop.getProperty("RegistrationPage.MarriageStatus.XPath"));
		return this;
	}
	public RegistrationPage selectCountry(String country) {
		selectValueTextByXPath(prop.getProperty("RegistrationPage.Country.XPath"), country);
		return this;
	}
	public RegistrationPage clickonGender(String value) {
		clickByXpath(prop.getProperty("RegistrationPage.Gender.XPath"));
		return this;
	}
	public RegistrationPage enterEmail(String email) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.XPath"), email);
		return this;
	}
	public RegistrationPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.XPath"), mobile);
		return this;
	}
	public RegistrationPage selectNationality(String nationality) {
		selectValueTextByXPath(prop.getProperty("RegistrationPage.Nationality.XPath"), nationality);
		return this;
	}
	
	public RegistrationPage clickonCountiune1() {
		clickByXpath(prop.getProperty("RegistrationPage.Countiune1.XPath"));
		return this;
	}
	public RegistrationPage enterAddress1(String address1) {
		enterByXpath(prop.getProperty("RegistrationPage.Address1.XPath"), address1);
		return this;
	}
	public RegistrationPage enterAddress2(String address2) {
		enterByXpath(prop.getProperty("RegistrationPage.Address2.XPath"), address2);
		return this;
	}
	public RegistrationPage enterAddress3(String address3) {
		enterByXpath(prop.getProperty("RegistrationPage.Address3.XPath"), address3);
		return this;
	}
	public RegistrationPage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("RegistrationPage.Pincode.XPath"), pincode);
		return this;
	}
	public RegistrationPage enterState(String state) {
		enterByXpath(prop.getProperty("RegistrationPage.State.XPath"), state);
		return this;
	}
	public RegistrationPage selectCity(String City) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.City.XPath"), City);
		return this;
	}
	public RegistrationPage selectPostOffice(String postoffice) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.PostOffice.XPath"), postoffice);
		return this;
	}
	public RegistrationPage enterPhone(String phone) {
		enterByXpath(prop.getProperty("RegistrationPage.PhoneNo.XPath"), phone);
		return this;
	}
	public RegistrationPage clickonCopyResidenceToOfficeAddressNo() {
		clickByXpath(prop.getProperty("RegistrationPage.CopyResidenceToOfficeAddressNo.XPath"));
		return this;
	}
	public RegistrationPage enterOfficeAddress1(String officeaddress1) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeAddress1.XPath"), officeaddress1);
		return this;
	}
	public RegistrationPage enterOfficeAddress2(String officeaddress2) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeAddress2.XPath"), officeaddress2);
		return this;
	}
	public RegistrationPage enterOfficeAddress3(String officeaddress3) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeAddress3.XPath"), officeaddress3);
		return this;
	}
	public RegistrationPage enterOfficePincode(String officepincode) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePincode.XPath"), officepincode);
		return this;
	}
	public RegistrationPage clickonCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.Country.XPath"));
		return this;
	}
	public RegistrationPage clickonIndia() {
		clickByXpath(prop.getProperty("RegistrationPage.ClickonIndia.XPath"));
		return this;
	}
	public RegistrationPage enterOfficeState(String officestate) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeState.XPath"), officestate);
		return this;
	}
	public RegistrationPage enterOfficeCity(String officeCity) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeCity.XPath"), officeCity);
		return this;
	}
	public RegistrationPage enterOfficePostoffice(String officepostoffice) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePostoffice.XPath"), officepostoffice);
		return this;
	}
	public RegistrationPage enterOfficePhone(String Officephone) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePhone.XPath"), Officephone);
		return this;
	}
	public RegistrationPage clickonTermandCondition() {
		clickByXpath(prop.getProperty("RegistrationPage.TermandCondition.XPath"));
		return this;
	}
	
	public RegistrationPage waitProerty() {
		waitProperty(2000);
		return this;
	}
	
	public RegistrationPage pageDown() {
		enterXpathpagedown();
		return this;
	}
}