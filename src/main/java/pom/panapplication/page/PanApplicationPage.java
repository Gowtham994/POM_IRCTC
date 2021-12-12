package pom.panapplication.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanApplicationPage extends GenericWrappers {
	
	public PanApplicationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}

	public PanApplicationPage selectTitle(String title) {
		
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.Title.XPath"), title);
		return this;
	}
	
	public PanApplicationPage enterFirstname(String firstname) {
		enterByXpath(prop.getProperty("PanApplicationPage.FistName.XPath"), firstname);
		return this;
	}
	
	public PanApplicationPage enterMiddletname(String middlename) {
		enterByXpath(prop.getProperty("PanApplicationPage.MiddelName.XPath"), middlename);
		return this;
	}
	public PanApplicationPage enterLastname(String Lastname) {
		enterByXpath(prop.getProperty("PanApplicationPage.LastName.XPath"), Lastname);
		return this;
	}
	public PanApplicationPage enterFatherfirstname(String fatherfirstname) {
		enterByXpath(prop.getProperty("PanApplicationPage.FatherFirstname.XPath"), fatherfirstname);
		return this;
	}
	public PanApplicationPage enterFathermiddlename(String Fathermiddlename) {
		enterByXpath(prop.getProperty("PanApplicationPage.FatherMiddelname.XPath"), Fathermiddlename);
		return this;
	}
	public PanApplicationPage enterFatherLastname(String FatherLastname) {
		enterByXpath(prop.getProperty("PanApplicationPage.FatherLastname.XPath"), FatherLastname);
		return this;
	}
	public PanApplicationPage enterMobilenumber(String Mobilenumber) {
		enterByXpath(prop.getProperty("PanApplicationPage.MobileNo.XPath"), Mobilenumber);
		return this;
	}
	public PanApplicationPage enterEmail(String email) {
		enterByXpath(prop.getProperty("PanApplicationPage.EmailID.XPath"), email);
		return this;
	}
	public PanApplicationPage selectSourceofincome(String Sourceofincome) {
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.Sourceofincome.XPath"), Sourceofincome);
		return this;
	}
	
	public PanApplicationPage clickonOffice() {
		clickByXpath(prop.getProperty("PanApplicationPage.Office.XPath"));
		return this;
	}
	
	public PanApplicationPage enterDOB(String DOB) {
		enterByXpath(prop.getProperty("PanApplicationPage.DOB.XPath"), DOB);
		return this;
	}
	public PanApplicationPage enterAddressline1(String Addressline1) {
		enterByXpath(prop.getProperty("PanApplicationPage.Addressline1.XPath"), Addressline1);
		return this;
	}
	public PanApplicationPage enterAddressline2(String Addressline2) {
		enterByXpath(prop.getProperty("PanApplicationPage.Addressline2.XPath"), Addressline2);
		return this;
	}
	public PanApplicationPage enterCityname(String cityname) {
		enterByXpath(prop.getProperty("PanApplicationPage.Cityname.XPath"), cityname);
		return this;
	}
	public PanApplicationPage selectState(String state) {
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.State.XPath"), state);
		return this;
	}
	
	public PanApplicationPage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("PanApplicationPage.Pincode.XPath"), pincode);
		return this;
	}
	
	public PanApplicationPage selectCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("PanApplicationPage.Country.XPath"), country);
		return this;
	}
	public PanApplicationPage enterofficename(String officename) {
		enterByXpath(prop.getProperty("PanApplicationPage.Officename.XPath"), officename);
		return this;
	}
	public PanApplicationPage enterOfficeAddressline1(String officeAddressline1) {
		enterByXpath(prop.getProperty("PanApplicationPage.OfficeAddressline1.XPath"), officeAddressline1);
		return this;
	}
	public PanApplicationPage enterOfficeAddressline2(String officeAddressline2) {
		enterByXpath(prop.getProperty("PanApplicationPage.OfficeAddressline2.XPath"), officeAddressline2);
		return this;
	}
	public PanApplicationPage enterOfficeCityname(String Officecityname) {
		enterByXpath(prop.getProperty("PanApplicationPage.OfficeCityname.XPath"), Officecityname);
		return this;
	}
	public PanApplicationPage selectofficeState(String officestate) {
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.OfficeState.XPath"), officestate);
		return this;
	}
	
	public PanApplicationPage enterOfficePincode(String officepincode) {
		enterByXpath(prop.getProperty("PanApplicationPage.OfficePincode.XPath"), officepincode);
		return this;
	}
	
	public PanApplicationPage selectOfficeCountry(String officecountry) {
		selectVisibileTextByXpath(prop.getProperty("PanApplicationPage.OfficeCountry.XPath"), officecountry);
		return this;
	}
	
	public PanApplicationPage selectIdentityproof(String Identityproof) {
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.Identityproof.XPath"), Identityproof);
		return this;
	}
	public PanApplicationPage selectAddressproof(String addressproof) {
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.Addressproof.XPath"), addressproof);
		return this;
	}
	public PanApplicationPage selectDOBproof(String DOBproof) {
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.DOBproof.XPath"), DOBproof);
		return this;
	}
	public PanApplicationPage selectAadhaarproof(String aadhaarproof) {
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.Aadhaarproof.XPath"), aadhaarproof);
		return this;
	}
	public PanApplicationPage selectOfficeaddressproof(String officeaddressproof) {
		selectValueTextByXPath(prop.getProperty("PanApplicationPage.Officeaddressproof.XPath"), officeaddressproof);
		return this;
	}
	public PanApplicationPage clickonTermsandcondition() {
		clickByXpath(prop.getProperty("PanApplicationPage.Termsandcondition.XPath"));
		return this;
		}
	public PanApplicationPage pageDown() {
		enterXpathpagedown();
		return this;
	}
}
