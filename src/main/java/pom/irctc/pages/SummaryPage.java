package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SummaryPage extends GenericWrappers {
	
	public SummaryPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}

	public SummaryPage clickonAgreecheckbox() {
		clickByXpath(prop.getProperty("SummaryPage.Agreecheckbox.XPath"));
		return this;
	}
	
	public OTPPage clickonMakePaymentbutton() {
		clickByXpath(prop.getProperty("SummaryPage.MakePaymentbutton.XPath"));
		return new OTPPage(driver,test);
	}
	
	public SummaryPage verifyHotelPriceAmount() {
		verifyTextByXpath(prop.getProperty("SummaryPage.VerifyHotelPriceAmount.XPath"), "₹ 1100");
		return this;
	}
	
	public SummaryPage verifyHotelName() {
		verifyTextByXpath(prop.getProperty("SummaryPage.VerifyHotelName.XPath"), "Oga Royal Green Accommodation Chennai Airport ");
		return this;
	}
	
	public PassengerDetailsPage verifyGSTnumber() {
		verifyTextByXpath(prop.getProperty("PassengerDetailsPage.VerifyGSTnumber.XPath"), "Please Enter Valid GSt number");
		return new PassengerDetailsPage(driver,test);
	}

	public SummaryPage LastWindow() {
		switchToLastWindow();
		return this;
		
	}
	
}
