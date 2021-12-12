package pom.formc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.page.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testcaseName="TC007";
		testcaseDescription="To verify Form C User Registraction";
		author="Gowtham R";
		category="System Integration Testing";
		browser="Chrome";
		appName="FormC";
	}
	
	@Test
	public void formcUserRegistraction() {
		
		new FormCHomePage(driver,test)
		.clickonSignupRegidtration()
		.enterUserID("Gowtham12")
		.enterPassword("Gowtham@1234")
		.enterConfirmPassword("Gowtham@1234")
		.selectSecurityQuestion("2")
		.enterYourAnswer("SK Hospital")
		.enterUserName("Gowtham")
		.selectGender("M")
		.enterDOB("14/04/1994")
		.enterDesignation("Testing")
		.enterUserEmailID("gowtham-r@gamil.com")
		.enterUserMobileNo("9620682098")
		.enterUserPhoneNo("044235698")
		.selectNationality("IND")
		.enterName("Gowtham")
		.enterCapacity("3")
		.enterAddress("Testing , Address1")
		.selectState("28")
		.selectCitydistr("2D")
		.selectFRRODescription("S003")
		.selectAccomodationtype("H")
		.selectAccomodationGrade("3s")
		.enterEmailID("gtham17@gmail.com")
		.enterMobileNo("9620682098")
		.enterPhoneNo("044253698")
		.enterOwnername("Test1")
		.enterOwneraddress("Testing, Address1")
		.selectOwnerState("28")
		.selectOwnerCity("16D")
		.enterOwnerEmailID("gowtham17@gmail.com")
		.enterOwnerphoneNo("044256893")
		.enterOwnerMobileNo("7896636598")
		.clickonAddbutton();
	}

}
