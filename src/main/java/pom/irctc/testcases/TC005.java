package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testcaseName="TC005";
		testcaseDescription="To verify IRCTC Book Your Coach Validation";
		author="Gowtham R";
		category="System Integration Testing";
		browser="Chrome";
		appName="IRCTC";
	}
	
	@Test
	public void irctcBookYourCoach()
	{
		new CovidAlertPage(driver,test)
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.LastWindow()
		.clickonSidebar()
		.clickonBookYourCoach()
		.LastWindow()
		.clickonNewUserSignup()
		.enterUserId("Gowtham1234")
		.enterPassword("Gowtham@89764")
		.enterConfirmPassword("Gowtham@89764")
		.selectSecurityQuestion("2")
		.enterSecurityAnswer("Vijay")
		.enterDateOfBirth("14/04/1994")
		.clickonBirthdate()
		.waitProerty()
		.clickonGender("1")
		.clickonMaritalStatus()
		.enterEmail("gowtham-r@gmail.com")
		.selectOccupation("Public")
		.enterFirstname("Gowtham")
		.enterMiddleName("bala")
		.enterLastName("R")
		.selectNationality("94")
		.pageDown()
		.enterFlatNo("FlatNo B5")
		.enterStreet("Krishna Street")
		.enterArea("Vignarajapuram")
		.SelectCountry("94")
		.enterMobileNo("9620682098")
		.enterPincode("600073")
		.waitProerty()
		.pageDown()
		.selectCity("Kanchipuram")
		.selectState("TAMIL NADU")
		.selectPostOffice("Gowriwakkam S.O")
		.ClickonSameAddressresidentialNo()
		.enterFlatNoOffice("FlatNo 618")
		.enterStreetOffice("Elcot")
		.enterAreaOffice("Sholinganallure")
		.SelectCountryOffice("94")
		.enterMobileOffice("8958684878")
		.enterPincodeOffice("600119")
		.waitProerty()
		.pageDown()
		.SelectCityOffice("Kanchipuram")
		.SelectStateOffice("TAMIL NADU")
		.SelectPostOfficeOffice("Sholinganallur S.O");
	}

}
