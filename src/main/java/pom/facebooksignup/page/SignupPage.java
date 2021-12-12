package pom.facebooksignup.page;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignupPage extends GenericWrappers {
	
	public SignupPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}

	public SignupPage enterFirstName(String firstname) {
		enterByXpath(prop.getProperty("FacebookHomePage.FirstName.XPath"), firstname);
		return this;
	}
	
	public SignupPage enterSureName(String surename) {
		enterByXpath(prop.getProperty("FacebookHomePage.SureName.XPath"), surename);
		return this;
	}
	
	public SignupPage enterEmailAddress(String email) {
		enterByXpath(prop.getProperty("FacebookHomePage.EmailAddress.XPath"), email);
		return this;
	}
	
	public SignupPage enterReEnterEmailAddress(String reemail) {
		enterByXpath(prop.getProperty("FacebookHomePage.ConfirmEmail.XPath"), reemail);
		return this;
	}
	
	public SignupPage enterPassword(String password) {
		enterByXpath(prop.getProperty("FacebookHomePage.Password.XPath"), password);
		return this;
	}
	
	public SignupPage selectDay(String day) {
		selectValueTextByXPath(prop.getProperty("FacebookHomePage.Day.XPath"), day);
		return this;
	}
	
	public SignupPage selectMonth(String month) {
		selectValueTextByXPath(prop.getProperty("FacebookHomePage.Month.XPath"), month);
		return this;
	}
	
	public SignupPage selectYear(String year) {
		selectValueTextByXPath(prop.getProperty("FacebookHomePage.Year.XPath"), year);
		return this;
	}
	
	public SignupPage clickonGender(String gender) {
		clickByXpath(prop.getProperty("FacebookHomePage.Gender.XPath"), gender);
		return this;
	}
	
}
