package pom.phptravel.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpRegisterPage extends GenericWrappers {
	
	public PhpRegisterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public PhpRegisterPage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("PhpRegisterPage.FirstName.XPath"), firstname);
		return this;
	}
	
	public PhpRegisterPage enterLastName(String Lastname) {
		enterByXpath(prop.getProperty("PhpRegisterPage.LastName.XPath"), Lastname);
		return this;
	}
	
	public PhpRegisterPage enterEmailAddress(String email) {
		enterByXpath(prop.getProperty("PhpRegisterPage.EmailID.XPath"), email);
		return this;
	}
	
	public PhpRegisterPage clickonListBox() {
		clickByXpath(prop.getProperty("PhpRegisterPage.ListBox.XPath"));
		return this;
	}
	
	public PhpRegisterPage enterCountry(String data) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Country.XPath"), data);
		return this;
	}
	
	public PhpRegisterPage clickonSelectCountry() {
		clickByXpath(prop.getProperty("PhpRegisterPage.SelectCountry.XPath"));
		return this;
	}

	public PhpRegisterPage enterPhonenumber(String Phonenumber) {
		enterByXpath(prop.getProperty("PhpRegisterPage.PhoneNumber.XPath"), Phonenumber);
		return this;
	}
	
	public PhpRegisterPage enterCompanyName(String companyname) {
		enterByXpath(prop.getProperty("PhpRegisterPage.CompanyName.XPath"), companyname);
		return this;
	}
	
	public PhpRegisterPage enterAddress1(String Address1) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Address1.XPath"), Address1);
		return this;
	}
	
	public PhpRegisterPage enterAddress2(String Address2) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Address2.XPath"), Address2);
		return this;
	}
	
	public PhpRegisterPage enterCity(String city) {
		enterByXpath(prop.getProperty("PhpRegisterPage.City.XPath"), city);
		return this;
	}
	
	public PhpRegisterPage enterPostcode(String postcode) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Postcode.XPath"), postcode);
		return this;
	}
	
	public PhpRegisterPage selectCountry(String country) {
		selectValueTextByXPath(prop.getProperty("PhpRegisterPage.Country.XPath"), country);
		return this;
	}
	
	public PhpRegisterPage enterState(String state) {
		enterByXpath(prop.getProperty("PhpRegisterPage.State.XPath"), state);
		return this;
	}
	
	public PhpRegisterPage enterMobilenumber(String mobile) {
		enterByXpath(prop.getProperty("PhpRegisterPage.MobileNo.XPath"), mobile);
		return this;
	}
	
	public PhpRegisterPage enterpassword(String password) {
		enterByXpath(prop.getProperty("PhpRegisterPage.Password.XPath"), password);
		return this;
	}
	
	public PhpRegisterPage enterConfirmpassword(String confirmpassword) {
		enterByXpath(prop.getProperty("PhpRegisterPage.ConfirmPassword.XPath"),confirmpassword);
		return this;
	}
	
	public PhpRegisterPage clickonYes() {
		clickByXpath(prop.getProperty("PhpRegisterPage.Yes.XPath"));
		return this;
	}
	
	public PhpRegisterPage waitProerty() {
		waitProperty(5000);
		return this;
	}
	
	public PhpRegisterPage pageDown() {
		enterXpathpagedown();
		return this;
	}
}