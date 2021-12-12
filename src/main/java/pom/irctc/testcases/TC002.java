package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testcaseName="TC002";
		testcaseDescription="To verify IRCTC BookHotels OTP Validation";
		author="Gowtham R";
		category="System Integration Testing";
		browser="Chrome";
		appName="IRCTC";
	}
	
	@Test
	public void irctcBookHotelsOTPValidation()
	{
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.mouseHoverOnHolidays()
		//.waitProerty()
		.mouseHoverOnStays()
		//.waitProerty()
		.clickOnLounge()
		.LastWindow()
		.clickonHotels()
		.LastWindow()
		.waitProerty()
		.clickonLogin()
		.clickonGuestUserlogin()
		.enterEmail("gtham17@gmail.com")
		.enterMobileNumber("9620682098")
		.clickonLoginButton()
		.enterHotelName("Oga Royal Green Accommodation Chennai Airport")
		.waitProerty()
		.clickonSelectHotleName()
		.clickonFromDate()
		.clickonSelectFromDate()
		.waitProerty()
		.clickonTodate()
		.clickonSelectTodate()
		.clickonRoomandGuestListbox()
		.selectRooms("1")
		.selectAdult("3")
		.clickonDoneButton()
		.clickonFindHotels()
		.getHotelName()
		.getHotelPrice()
		.clickonContinueToBook()
		.selectTitle("1")
		.enterFirstName("Gowtham")
		.enterLastName("R")
		.selectCountry("India")
		.selectState("TN")
		//.enterMobileNo("9620682098")
		//.enterEmail("gtham17@gmail.com")
		.selectGSTOptionalNO("No")
		.clickonContinuebutton()
		.LastWindow()
		.verifyHotelName()
		.verifyHotelPriceAmount()
		.clickonAgreecheckbox()
		.clickonMakePaymentbutton()
		.clickonVerifybutton()
		.verifyOTPisRequired();
	}

}
