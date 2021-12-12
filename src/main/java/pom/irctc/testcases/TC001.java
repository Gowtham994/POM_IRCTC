package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers  {	
	
	@BeforeClass
	public void beforeClass() {
		testcaseName="TC001";
		testcaseDescription="To verify IRCTC Registraction";
		author="Gowtham R";
		category="System Integration Testing";
		browser="Chrome";
		appName="IRCTC";
	}
	
	@Test
	public void irctcRegistration() {		
		
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.clickOnRegister()
		.enterUserName("GOwtham123")
		.enterPassword("Gowtham@1234")
		.enterConfirmPassword("Gowtham@1234")
		.clickonPreferredLanguage()
		.clickonYourLanguage("1")
		.clickonSecurityQuestion()
		.clickonYourQuestion("2")
		.enterSecurityAnswer("SKP")
		.clickonContinueButton()
		.enterFirstname("Gowtham")
		.enterMiddlename("bala")
		.enterLastname("R")
		.clickonSelectOccupation()
		.clickonYourOccupation("3")
		.enterDOB("04-10-1994")
		.clickonMarriageStatus("Unmarried")
		.clickonGender("1")
		.enterEmail("gowtham-r@gmail.com")
		.enterMobile("7200521084")
		.selectNationality("94")
		.clickonCountiune1()
		.enterAddress1("No 125, Krisha Street")
		.enterAddress2("Vengaivasal")
		.enterAddress3("Medavakkam")
		.enterPincode("600073")
		.enterState("Tamilnadu")
		.selectCity("Kanchipuram")
		.selectPostOffice("Gowriwakkam S.O")
		.enterPhone("044258963")
		.clickonCopyResidenceToOfficeAddressNo()
		.pageDown()
		.enterOfficeAddress1("No 618")
		.enterOfficeAddress2("Elcot")
		.enterOfficeAddress3("Sholliganallure")
		.clickonCountry()
		.waitProerty()
		.clickonIndia()
		.enterOfficePincode("600019")
		.enterOfficeState("Tamilnadu")
		.enterOfficeCity("Tiruvallur")
		.enterOfficePostoffice("Tiruvottiyur S.O")
		.enterOfficePhone("044258987")
		.clickonTermandCondition()
		.waitProerty();
	
		
	}

}
