package pom.phptravel.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravel.page.PhpRegisterPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testcaseName="TC009";
		testcaseDescription="To verify PHP User Registration";
		author="Gowtham R";
		category="System Integration Testing";
		browser="Chrome";
		appName="PHPTravel";
	}
	
	@Test
	public void phpRegistration() {
		
		new PhpRegisterPage(driver,test)
		.enterFirstName("Gowtham")
		.enterLastName("R")
		.enterEmailAddress("gtham17@gmail.com")
		.clickonListBox()
		.waitProerty()
		.enterCountry("India")
		.clickonSelectCountry()
		.waitProerty()
		.enterPhonenumber("9620682098")
		.enterCompanyName("HCL")
		.enterAddress1("No602/3 , Elcot")
		.pageDown()
		.enterAddress2("sholinganallur, Medavakkam high road")
		.enterCity("Chennai")
		.enterPostcode("600119")
		.enterState("Tamil Nadu")
		.selectCountry("IN")
		.enterMobilenumber("9620682098")
		.enterpassword("Ram@12345")
		.enterConfirmpassword("Ram@12345")
		.clickonYes();
	}

}
