package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testcaseName="TC004";
		testcaseDescription="To verify IRCTC Saloon Mandatory Check Validation";
		author="Gowtham R";
		category="System Integration Testing";
		browser="Chrome";
		appName="IRCTC";
	}
	
	@Test
	public void irctcSaloonMandatoryCheck()
	{
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.LastWindow()
		.clickonSidebar()		
		.clickonCharter()
		.clickonSidebarDismiss()
		.clickonEnquiryForm()
		.enterNameofApplication("Gowtham")
		.enterNameoforganization("Pravite")
		.enterAddress("Testing, Address")
		.enterMobile("962068209")
		.enterEmail("gowtham-r@gmail.com")
		.selectRequestfor("Saloon Charter")
		.waitProerty()
		.enterOriginStation("Chennai")
		.enterDestnationStation("Comibatore")
		.clickonDateOfDeparture()
		.clickonYourDeparturedate()
		.clickonCheckOutDate()
		.clickonYourOutdate()
		.enterDurationPeriod("2")
		.enterCoachDetails("1")
		.enterNumberofPassenger("50")
		.enterCharterPurpose("Testing1")
		.enterServices("Testing2")
		.clickonSubmit()
		.verifyMobileNoNotvalid();
}
}
