package pom.panapplication.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panapplication.page.PanApplicationPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testcaseName="TC008";
		testcaseDescription="To verify Applaction New PanCard";
		author="Gowtham R";
		category="System Integration Testing";
		browser="Chrome";
		appName="Pancard";
	}
	
	@Test
	public void applactionNewPanCard() {
		
		new PanApplicationPage(driver,test)
		.selectTitle("1")
		.enterFirstname("Gowtham")
		.enterMiddletname("vijay")
		.enterLastname("Ram")
		.enterFatherfirstname("Ramanathan")
		.enterFathermiddlename("S")
		.enterFatherLastname("M")
		.enterMobilenumber("9620682098")
		.enterEmail("gtham17@gmail.com")
		.selectSourceofincome("1")
		.clickonOffice()
		.enterDOB("14041994")
		.pageDown()
		.enterAddressline1("No 235, vangaivasal")
		.enterAddressline2("Krishna street, vignarajapuram 3rd ext")
		.enterCityname("Chennai")
		.selectState("Tamil Nadu")
		.enterPincode("600073")
		.selectCountry("INDIA")
		.enterofficename("HCL")
		.enterOfficeAddressline1("No 618, Elcot")
		.enterOfficeAddressline2("Sholinganallure")
		.enterOfficeCityname("Chennai")
		.selectofficeState("Tamil Nadu")
		.enterOfficePincode("600119")
		.selectOfficeCountry("INDIA")
		.selectIdentityproof("16")
		.selectAddressproof("5")
		.selectDOBproof("3")
		.pageDown()
		.selectAadhaarproof("Copy of Aadhaar Card/Letter")
		.selectOfficeaddressproof("1")
		.clickonTermsandcondition();
		
	}
	

}
