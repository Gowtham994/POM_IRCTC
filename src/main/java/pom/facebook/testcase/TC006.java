package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebooksignup.page.CreatePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testcaseName="TC006";
		testcaseDescription="To verify facebook sign up for the new user";
		author="Gowtham R";
		category="System Integration Testing";
		browser="Chrome";
		appName="Facebook";
	}
	
	@Test
	public void facebookSignUp(){
		
		new CreatePage(driver, test)
		.clickonCreateNewAccount()
		.enterFirstName("Gowtham")
		.enterSureName("R")
		.enterEmailAddress("gtham17@gmail.com")
		.enterReEnterEmailAddress("gtham17@gmail.com")
		.enterPassword("Gowtham@865#")
		.selectDay("14")
		.selectMonth("4")
		.selectYear("1994")
		.clickonGender("Male");
		
	}

}
