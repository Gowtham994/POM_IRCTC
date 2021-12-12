package pom.formc.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCUserRegistractionPage extends GenericWrappers{
	
	public FormCUserRegistractionPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public FormCUserRegistractionPage enterUserID(String userid) {
		enterByXpath(prop.getProperty("FormCHomePage.UserId.XPath"), userid);
		return this;
	}
	
	public FormCUserRegistractionPage enterPassword(String password) {
		enterByXpath(prop.getProperty("FormCHomePage.Password.XPath"), password);
		return this;
	}

	public FormCUserRegistractionPage enterConfirmPassword(String cfmpassword) {
		enterByXpath(prop.getProperty("FormCHomePage.ConfirmPassword.XPath"), cfmpassword);
		return this;
	}
	
	public FormCUserRegistractionPage selectSecurityQuestion(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.SecurityQuestion.XPath"), value);
		return this;
	}

	public FormCUserRegistractionPage enterYourAnswer(String answer) {
		enterByXpath(prop.getProperty("FormCHomePage.YourAnswer.XPath"), answer);
		return this;
	}

	public FormCUserRegistractionPage enterUserName(String username) {
		enterByXpath(prop.getProperty("FormCHomePage.UserName.XPath"), username);
		return this;
	}
	
	public FormCUserRegistractionPage selectGender(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.Gender.XPath"), value);
		return this;
	}

	public FormCUserRegistractionPage enterDOB(String dob) {
		enterByXpath(prop.getProperty("FormCHomePage.DOB.XPath"), dob);
		return this;
	}

	public FormCUserRegistractionPage enterDesignation(String designation) {
		enterByXpath(prop.getProperty("FormCHomePage.Designation.XPath"), designation);
		return this;
	}

	public FormCUserRegistractionPage enterUserEmailID(String useremail) {
		enterByXpath(prop.getProperty("FormCHomePage.UserEmailID.XPath"), useremail);
		return this;
	}

	public FormCUserRegistractionPage enterUserMobileNo(String usermobile) {
		enterByXpath(prop.getProperty("FormCHomePage.UserMobileNo.XPath"), usermobile);
		return this;
	}

	public FormCUserRegistractionPage enterUserPhoneNo(String userphone) {
		enterByXpath(prop.getProperty("FormCHomePage.UserPhoneNo.XPath"), userphone);
		return this;
	}
	
	public FormCUserRegistractionPage selectNationality(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.Nationality.XPath"), value);
		return this;
	}

	public FormCUserRegistractionPage enterName(String name) {
		enterByXpath(prop.getProperty("FormCHomePage.Name.XPath"), name);
		return this;
	}

	public FormCUserRegistractionPage enterCapacity(String capacity) {
		enterByXpath(prop.getProperty("FormCHomePage.Capacity.XPath"), capacity);
		return this;
	}

	public FormCUserRegistractionPage enterAddress(String address) {
		enterByXpath(prop.getProperty("FormCHomePage.Address.XPath"), address);
		return this;
	}
	
	public FormCUserRegistractionPage selectState(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.State.XPath"), value);
		return this;
	}
	
	public FormCUserRegistractionPage selectCitydistr(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.Citydistr.XPath"), value);
		return this;
	}
	
	public FormCUserRegistractionPage selectFRRODescription(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.FRRODescription.XPath"), value);
		return this;
	}

	public FormCUserRegistractionPage selectAccomodationtype(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.Accomodationtype.XPath"), value);
		return this;
	}

	public FormCUserRegistractionPage selectAccomodationGrade(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.selectAccomodationGrade.XPath"), value);
		return this;
	}


	public FormCUserRegistractionPage enterEmailID(String email) {
		enterByXpath(prop.getProperty("FormCHomePage.EmailID.XPath"), email);
		return this;
	}

	public FormCUserRegistractionPage enterMobileNo(String mobile) {
		enterByXpath(prop.getProperty("FormCHomePage.MobileNo.XPath"), mobile);
		return this;
	}

	public FormCUserRegistractionPage enterPhoneNo(String phone) {
		enterByXpath(prop.getProperty("FormCHomePage.PhoneNo.XPath"), phone);
		return this;
	}

	public FormCUserRegistractionPage enterOwnername(String ownname) {
		enterByXpath(prop.getProperty("FormCHomePage.OwnerName.XPath"), ownname);
		return this;
	}

	public FormCUserRegistractionPage enterOwneraddress(String ownaddress) {
		enterByXpath(prop.getProperty("FormCHomePage.OwnerAddress.XPath"), ownaddress);
		return this;
	}
	
	public FormCUserRegistractionPage selectOwnerState(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.OwnerState.XPath"), value);
		return this;
	}
	
	public FormCUserRegistractionPage selectOwnerCity(String value) {
		selectValueTextByXPath(prop.getProperty("FormCHomePage.OwnerCity.XPath"), value);
		return this;
	}
	
	public FormCUserRegistractionPage enterOwnerEmailID(String ownemail) {
		enterByXpath(prop.getProperty("FormCHomePage.OwnerEmailID.XPath"), ownemail);
		return this;
	}

	public FormCUserRegistractionPage enterOwnerphoneNo(String ownphone) {
		enterByXpath(prop.getProperty("FormCHomePage.OwnerPhoneNo.XPath"), ownphone);
		return this;
	}

	public FormCUserRegistractionPage enterOwnerMobileNo(String ownmobile) {
		enterByXpath(prop.getProperty("FormCHomePage.OwnerMobileNo.XPath"), ownmobile);
		return this;
	}
	
	public FormCUserRegistractionPage clickonAddbutton() {
		clickByXpath(prop.getProperty("FormCHomePage.Addbutton.XPath"));
		return this;
	}

	
}
