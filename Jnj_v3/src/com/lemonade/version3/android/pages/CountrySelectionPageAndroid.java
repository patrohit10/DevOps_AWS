package com.lemonade.version3.android.pages;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.support.JNJUtilsIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class CountrySelectionPageAndroid extends com.qmetry.qaf.automation.ui.WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.countryselectionpage.next.btn")
	private QAFWebElement otrcountryselectionpageNextBtn;
	@FindBy(locator = "otr.countryselect.wheredoyoulive.txt")
	private QAFWebElement otrCountryselectWheredoyouliveTxt;
	@FindBy(locator = "otr.countryselectionpage.heading.lbl")
	private QAFWebElement otrcountryselectionpageHeadingLbl;
	@FindBy(locator = "otr.countryselectionpage.countryselection.lst")
	private List<QAFWebElement> otrcountryselectionpageCountryselectionLst;
	@FindBy(locator = "otr.countryselect.unitedstates.btn")
	private QAFWebElement otrCountryselectUnitedstatesBtn;
	@FindBy(locator = "otr.countryselectionpage.back.btn")
	private QAFWebElement otrcountryselectionpageBackBtn;
	@FindBy(locator = "otr.countryselect.spain.btn")
	private QAFWebElement otrCountrySelectSpainBtn;
	@FindBy(locator = "otr.countryselectukireland.btn")
	private QAFWebElement otrCountrySelectUkIrelandBtn;
	@FindBy(locator = "otr.countryselectionpage.selectcountry.txt")
	private QAFWebElement otrCountryselectionpageSelectcountryTxt;
	@FindBy(locator = "otr.countryselectionpage.countryselected.correct.img")
	private QAFWebElement otrCountryselectionpageCountryselectedCorrectImg;
	@FindBy(locator = "otr.loginpage.frenchwelcome.lbl")
	private QAFWebElement otrLoginpageFrenchwelcomeLbl;
	@FindBy(locator = "otr.countryselectionpage.countryselected.iagree.btn")
	private QAFWebElement otrCountryselectionpageCountryselectedIagreeBtn;

	public QAFWebElement getOtrCountryselectionpageCountryselectedIagreeBtn() {
		return otrCountryselectionpageCountryselectedIagreeBtn;
	}

	public void setOtrCountryselectionpageCountryselectedIagreeBtn(
			QAFWebElement otrCountryselectionpageCountryselectedIagreeBtn) {
		this.otrCountryselectionpageCountryselectedIagreeBtn = otrCountryselectionpageCountryselectedIagreeBtn;
	}

	public QAFWebElement getOtrCountryselectionpageCountryselectedCorrectImg() {
		return otrCountryselectionpageCountryselectedCorrectImg;
	}

	public QAFWebElement getOtrCountryselectionpageSelectcountryTxt() {
		return otrCountryselectionpageSelectcountryTxt;
	}

	public QAFWebElement getOtrCountrySelectSpainBtn() {
		return otrCountrySelectSpainBtn;
	}

	public QAFWebElement getOtrCountrySelectUkIrelandBtn() {
		return otrCountrySelectUkIrelandBtn;
	}

	public QAFWebElement getOtrcountrtyselectionpageBackBtn() {
		return otrcountryselectionpageBackBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrcountrtyselectionpageNextBtn() {
		return otrcountryselectionpageNextBtn;
	}

	public QAFWebElement getOtrCountryselectWheredoyouliveTxt() {
		return otrCountryselectWheredoyouliveTxt;
	}

	public QAFWebElement getOtrcountrtyselectionpageHeadingLbl() {
		return otrcountryselectionpageHeadingLbl;
	}

	public List<QAFWebElement> getOtrcountrtyselectionpageCountryselectionLst() {
		return otrcountryselectionpageCountryselectionLst;
	}

	public QAFWebElement getOtrCountryselectUnitedstatesBtn() {
		return otrCountryselectUnitedstatesBtn;
	}

	public QAFWebElement getOtrcountrtyselectionpageStaticText(String text) {
		return JNJUtilsAndroid.getElement("otr.countryselectionpage.statictext.lbl", text);
	}
	
	public QAFWebElement getOtrCountryselectionpageStatictextLbl(String text) {
		return JNJUtilsAndroid.getElement("otr.countryselectionpage.statictext.lbl", text);
	}

	@FindBy(locator = "otr.countryselectionpage.statictext.lbl")
	private QAFWebElement otrCountryselectionpageStatictextLbl;
	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	

	public AndroidDriver getDriver() {
		return androidDriver;
	}

	// method to open OTR app
	public void openOTRApp() {
		launchPage(null);
		AndroidDriver driver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
		try {
			driver.closeApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			driver.launchApp();
			getOtrcountrtyselectionpageHeadingLbl().verifyPresent("Application is launched");
		} catch (Exception e) {
 			e.printStackTrace();
		}

		System.out.println("OTR android app is launched");
	}

	// method to select 11 countries and verify selected country
	public void selectCountry() {
		if (getOtrcountrtyselectionpageCountryselectionLst().get(0).isPresent()) {
			for (QAFWebElement select : getOtrcountrtyselectionpageCountryselectionLst()) {
				String getValue = select.getAttribute("text");
				select.click();
				getOtrcountrtyselectionpageNextBtn().waitForPresent();
				getOtrcountrtyselectionpageNextBtn().click();
				getOtrcountrtyselectionpageBackBtn().waitForPresent();
				Reporter.logWithScreenShot("Signout page for " + getValue, MessageTypes.Pass);
				getOtrcountrtyselectionpageBackBtn().click();
			}
			for (int j = 2; j > 0; j--) {
				JNJUtilsAndroid.scrollToEleAndriod("United Kingdom and Ireland");
				for (int i = getOtrcountrtyselectionpageCountryselectionLst().size()
						- j; i < getOtrcountrtyselectionpageCountryselectionLst().size(); i++) {

					String getValue = getOtrcountrtyselectionpageCountryselectionLst().get(i).getText().toString();
					// JNJUtilsAndroid.scrollToEleAndriod(getValue);
					getOtrcountrtyselectionpageCountryselectionLst().get(i).click();
					JNJUtilsAndroid.swipeWithCoordinates(607, 1531, 596, 1890, 100);
					JNJUtilsAndroid.swipeWithCoordinates(607, 1531, 596, 1890, 100);
					getOtrcountrtyselectionpageNextBtn().isPresent();
					getOtrcountrtyselectionpageNextBtn().click();
					getOtrcountrtyselectionpageBackBtn().waitForPresent();
					Reporter.logWithScreenShot("Signout page for " + getValue, MessageTypes.Pass);
					getOtrcountrtyselectionpageBackBtn().click();
					getOtrCountryselectUnitedstatesBtn().click();
				}
			}
		} else {
			Reporter.logWithScreenShot("Country is already selected", MessageTypes.Pass);
		}

	}

	// Method to verify country selection screen
	// milan
	public void verifyCountrySelectionPage() {
		getOtrcountrtyselectionpageHeadingLbl().waitForPresent();
		getOtrcountrtyselectionpageHeadingLbl().verifyPresent("One touch logo country selection screen");
		getOtrCountryselectionpageSelectcountryTxt().verifyPresent("Select country text");
		getOtrCountryselectWheredoyouliveTxt().verifyPresent("Where do you live question");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.unitedState").toString());
		getOtrcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.unitedState").toString())
						.verifyPresent("United State");

		getOtrcountrtyselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.belgie").toString())
				.verifyPresent("Belgie");
		getOtrcountrtyselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.canada").toString())
				.verifyPresent("Canada");
		getOtrcountrtyselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.france").toString())
				.verifyPresent("France");
		getOtrcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.deutschland").toString())
						.verifyPresent("Deutschland");
		getOtrcountrtyselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.italy").toString())
				.verifyPresent("Italia");
		//SG removing Netherlands per updated user story
		//getOtrcountrtyselectionpageStaticText(
		//		ConfigurationManager.getBundle().getProperty("country.netherland").toString())
		//				.verifyPresent("Netherland");
		getOtrcountrtyselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.spain").toString())
				.verifyPresent("Spain");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.uk").toString());
		getOtrcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.osterreich").toString())
						.verifyPresent("Osterreich");
		getOtrcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.portugal").toString()).verifyPresent("Portugal");
		getOtrcountrtyselectionpageStaticText(ConfigurationManager.getBundle().getProperty("country.uk").toString())
				.verifyPresent("Uk and ireland");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.unitedState").toString());
		getOtrcountrtyselectionpageStaticText(
				ConfigurationManager.getBundle().getProperty("country.unitedState").toString()).click();
		getOtrCountryselectionpageCountryselectedCorrectImg().verifyPresent("Country selected correct icon");
		scrllToCountry(ConfigurationManager.getBundle().getProperty("country.canada").toString());
		getOtrcountrtyselectionpageNextBtn().verifyPresent("Next button");
		getOtrcountrtyselectionpageNextBtn().click();
		getOtrcountrtyselectionpageBackBtn().waitForPresent();
		Reporter.logWithScreenShot("Signup page", MessageTypes.Pass);
		getOtrcountrtyselectionpageBackBtn().click();
		getOtrCountryselectionpageSelectcountryTxt().verifyPresent("Country selection page");
	}

	// method to click on next button
	public void clickOnNextButton() {
		getOtrcountrtyselectionpageNextBtn().waitForPresent();
		Reporter.logWithScreenShot("Next Button is Present", MessageTypes.Pass);
		getOtrcountrtyselectionpageNextBtn().click();
	}


	// To select one specific country
	public void selectCountryFromList(String countryName) {

		if (getOtrCountryselectWheredoyouliveTxt().isPresent()) {
			scrllToCountry(countryName);
			getOtrcountrtyselectionpageStaticText(countryName).click();
			Reporter.logWithScreenShot(countryName + " is selected", MessageTypes.Pass);
			JNJUtilsAndroid.swipeWithCoordinates(443, 831, 443, 1132, 5);
			JNJUtilsAndroid.waitforLoad();
			getOtrcountrtyselectionpageNextBtn().click();
			JNJUtilsAndroid.waitforLoad();
			if (getOtrCountryselectionpageCountryselectedIagreeBtn().isPresent()) {
				//getOtrLoginpageFrenchwelcomeLbl().verifyPresent(countryName + " Welcome text is displayed");
				Reporter.logWithScreenShot(countryName+" Welcome page is displayed", MessageTypes.Pass);
				getOtrCountryselectionpageCountryselectedIagreeBtn().click();
			}
		} else {
			Reporter.logWithScreenShot("Country is already selected", MessageTypes.Pass);

		}
	}

	// Method to redirect the flow from SignUp screen to Login screen and Vice
	// versa
	public void selectScreen(String page) {
		SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
		LoginPageAndroid loginPageAndroid = new LoginPageAndroid();

		int fingers = 1;
		int duration = 1;

		page = page.toUpperCase();
		
		switch (page) {
		case "LOG-IN":
			//signupPageAndroid.getOtrsignuppageloginlnk().waitForPresent();

			if (!(loginPageAndroid.getOtrloginpageforgotpasswordlnk().isPresent())) {
				Point p1 = signupPageAndroid.getOtrsignuppageloginlnk().getLocation();
				Dimension d1 = signupPageAndroid.getOtrsignuppageloginlnk().getSize();
				int startX = p1.getX();
				int startY = p1.getY();
				int endX = startX + d1.getWidth();
				int endY = startY + d1.getHeight();
				int pintloginY = startY + (endY - startY) / 2;
				int pintloginX = endX - 100;
				androidDriver.tap(fingers, pintloginX, pintloginY, duration);
				loginPageAndroid.getOtrloginpageforgotpasswordlnk().waitForPresent();
				Reporter.logWithScreenShot("User is on Login Page");
			} else {
				Reporter.logWithScreenShot("User Already on Login Page", MessageTypes.Pass);
			}
			break;
		case "SIGN-UP":

			//loginPageAndroid.getOtrloginpagesignuplnl().waitForPresent();
			
			try{
				signupPageAndroid.getOtrsignuppagetermofservicecheckbox().waitForPresent(3000);
			}

			catch(Exception e) {
				Reporter.logWithScreenShot("Checkbox is not present", MessageTypes.Pass);
			}
			if (!(signupPageAndroid.getOtrsignuppagetermofservicecheckbox().isPresent())) {
				Point p2 = loginPageAndroid.getOtrloginpagesignuplnl().getLocation();
				Dimension d2 = loginPageAndroid.getOtrloginpagesignuplnl().getSize();

				int startX1 = p2.getX();
				int startY1 = p2.getY();
				int endX1 = startX1 + d2.getWidth();
				int endY1 = startY1 + d2.getHeight();
				int pintSignupY = startY1 + (endY1 - startY1) / 2;
				int pintSignupX = endX1 - 100;

				androidDriver.tap(fingers, pintSignupX, pintSignupY, duration);
				if (getOtrCountryselectionpageCountryselectedIagreeBtn().isPresent()) {
					getOtrCountryselectionpageCountryselectedIagreeBtn().click();
				}
				signupPageAndroid.getOtrsignuppagetermofservicecheckbox().waitForPresent();
				Reporter.logWithScreenShot("User is on SignUp Page");
			} else {
				Reporter.logWithScreenShot("User Already on Signup Page", MessageTypes.Pass);
			}
			break;
		}

	}

	// method to scroll for specific country
	// milan
	public void scrllToCountry(String countryName) {
		int count=0;
		if (!JNJUtilsAndroid.tryDisplayMethod(getOtrcountrtyselectionpageStaticText(countryName))) {

			while (!JNJUtilsIOS.tryMethod(getOtrcountrtyselectionpageStaticText(countryName))) {
				JNJUtilsAndroid.swipeWithCoordinates(476, 1132, 443, 831, 50);
				JNJUtilsAndroid.waitforLoad();
				count++;
				
				if(count==5)
					break;

			}
		} else {

			JNJUtilsAndroid.swipeWithCoordinates(443, 831, 443, 1132, 50);
			JNJUtilsAndroid.waitforLoad();

		}

	}

	

	//Method to click next button on country selection page
	public void clickNext() {
		getOtrcountrtyselectionpageNextBtn().click();
	}

	
	//Method to click login button
	public void clickLogin() {
		SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
		LoginPageAndroid loginPageAndroid = new LoginPageAndroid();

		int fingers = 1;
		int duration = 1;
		Point p1 = signupPageAndroid.getOtrsignuppageloginlnk().getLocation();
		Dimension d1 = signupPageAndroid.getOtrsignuppageloginlnk().getSize();

		int startX = p1.getX();
		int startY = p1.getY();
		int endX = startX + d1.getWidth();
		int endY = startY + d1.getHeight();
		int pintloginY = startY + (endY - startY) / 2;
		int pintloginX = endX - 100;
		androidDriver.tap(fingers, pintloginX, pintloginY, duration);
		loginPageAndroid.getOtrloginpageforgotpasswordlnk().waitForPresent();
	}

	//Method to click back button on Android device
	public void clickBackButton() {
		try {
			AndroidDriver androidDriver = (AndroidDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver();
			androidDriver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
