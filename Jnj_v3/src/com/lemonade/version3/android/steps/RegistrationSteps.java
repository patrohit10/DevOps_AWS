package com.lemonade.version3.android.steps;

import java.sql.Driver;

import org.openqa.selenium.remote.DriverCommand;

import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.version3.android.pages.CountrySelectionPageAndroid;
//import com.lemonade.version3.iOS.steps.HCP;
//import com.lemonade.version3.iOS.steps.from;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class RegistrationSteps {

	@QAFTestStep(description = "user opens app")
	public void user_opens_app_android() {
		CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();
		homePage.openOTRApp();
		// takes a screenshot
		//Reporter.logWithScreenShot("User opens app",MessageTypes.Pass);

	}
	
	@QAFTestStep(description = "user reads app name")
	public void user_reads_app_name() {
		System.out.println("user reads app name");
		Reporter.logWithScreenShot("User reads app name",MessageTypes.Pass);

	}

	@QAFTestStep(description = "user verify country selection Page")
	public void user_selects_country() {
		CountrySelectionPageAndroid countrySelectionPageAndroid = new CountrySelectionPageAndroid();
		countrySelectionPageAndroid.verifyCountrySelectionPage();
		
	}

	@QAFTestStep(description = "user clicks on Next button")
	public void user_clicks_on_Next_button() {
		CountrySelectionPageAndroid homePage = new CountrySelectionPageAndroid();
		homePage.clickOnNextButton();
		// takes a screenshot
		Reporter.logWithScreenShot("User clicks on Next button",MessageTypes.Pass);

	}

	@QAFTestStep(description = "user will see Signin and Create an account button")
	public void verify_Signin_CreateAnAccount_buttons() {
		CountrySelectionPageAndroid CountrySelectionPageAndroid = new CountrySelectionPageAndroid();
		
		// takes a screenshot
		Reporter.logWithScreenShot("Create Account and Signin buttons are present",MessageTypes.Pass);
	}

	@QAFTestStep(description = "user clicks on Create an account button")
	public void user_clicks_on_Create_an_account_button() {
		CountrySelectionPageAndroid CountrySelectionPageAndroid = new CountrySelectionPageAndroid();
		// takes a screenshot
		Reporter.logWithScreenShot("User clicks on Create an account button", MessageTypes.Pass);
	}

	// @QAFDataProvider(key = "User.Registration")
	@QAFTestStep(description = "user fills registration form")
	public void user_fills_registration_info() {

		CountrySelectionPageAndroid CountrySelectionPageAndroid = new CountrySelectionPageAndroid();
		// takes a screenshot
		Reporter.logWithScreenShot("User fills registration form",MessageTypes.Pass);
	}

	@QAFTestStep(description = "user should get register successfully")
	public void user_register_successfully() {

		CountrySelectionPageAndroid CountrySelectionPageAndroid = new CountrySelectionPageAndroid();
	}
	
	
	
	
	@QAFTestStep(description = "user closes the app")
	public void userCloseTheAndroidApp() {
		try {
			((AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver()).closeApp();
			JNJUtilsAndroid.waitforLoad();
		} catch (Exception e) {
			System.out.println(e);
		}
		Reporter.logWithScreenShot("User close the android app", MessageTypes.Pass);
		
	}
	
	@QAFTestStep(description="user select country {0} from country list")
	public void selectCountry(String country){
		CountrySelectionPageAndroid homePageAndroid = new CountrySelectionPageAndroid();
		homePageAndroid.selectCountryFromList(country);
	}
	
	@QAFTestStep(description="user resets app")
	public void resetApp() {
		AppiumDriver appiumDriver = (AppiumDriver) (new WebDriverTestBase().getDriver().getUnderLayingDriver());
		appiumDriver.resetApp();
	}
	
	
}
