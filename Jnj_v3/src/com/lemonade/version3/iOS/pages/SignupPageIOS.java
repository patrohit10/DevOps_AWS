package com.lemonade.version3.iOS.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Factory;
import org.hamcrest.Matchers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.ios.IOSDriver;

public class SignupPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otrios.signupPage.oneTouch.icon")
	private QAFWebElement otriosSignuppageOnetouchIcon;
	@FindBy(locator = "otrios.signupPage.termOfService.lbl")
	private QAFWebElement otriosSignuppageTermofserviceLbl;
	@FindBy(locator = "otrios.signupPage.termOfService.cBox")
	private QAFWebElement otriosSignuppageTermofserviceCbox;
	@FindBy(locator = "otrios.signupPage.countryTerms.lbl")
	private QAFWebElement otriosSignuppageCountrytermsLbl;
	@FindBy(locator = "otrios.signupPage.countryTerms.cBox")
	private QAFWebElement otriosSignuppageCountrytermsCbox;
	@FindBy(locator = "otrios.signupPage.emailAdress.tBox")
	private QAFWebElement otriosSignuppageEmailadressTbox;
	@FindBy(locator = "otrios.signupPage.confirmEmailAdress.tBox")
	private QAFWebElement otriosSignuppageConfirmemailadressTbox;
	@FindBy(locator = "otrios.signupPage.password.tBox")
	private QAFWebElement otriosSignuppagePasswordTbox;
	@FindBy(locator = "otrios.signupPage.dateOfBirth.tBox")
	private QAFWebElement otriosSignuppageDateofbirthTbox;
	@FindBy(locator = "otrios.signupPage.signUp.btn")
	private QAFWebElement otriosSignuppageSignupBtn;
	@FindBy(locator = "otrios.signupPage.haveAccount.lbl")
	private QAFWebElement otriosSignuppageHaveaccountLbl;
	@FindBy(locator = "otrios.signupPage.login.lnk")
	private QAFWebElement otriosSignuppageLoginLnk;
	@FindBy(locator = "otrios.signupPage.createAccount.lbl")
	private QAFWebElement otriosSignuppageCreateaccountLbl;
	@FindBy(locator = "otrios.signupPage.email.check.img")
	private QAFWebElement otriosSignuppageEmailCheckImg;
	@FindBy(locator = "otrios.signupPage.confirmEmail.check.img")
	private QAFWebElement otriosSignuppageConfirmemailCheckImg;
	@FindBy(locator = "otrios.signupPage.accessQuestion.lbl")
	private QAFWebElement otriosSignuppageAccessquestionLbl;
	@FindBy(locator = "otrios.signupPage.enableTouchID.btn")
	private QAFWebElement otriosSignuppageEnabletouchidBtn;
	@FindBy(locator = "otrios.signupPage.keepMeLogIn.btn")
	private QAFWebElement otriosSignuppageKeepmeloginBtn;
	@FindBy(locator = "otrios.signupPage.requirLogin.btn")
	private QAFWebElement otriosSignuppageRequirloginBtn;
	@FindBy(locator = "otrios.signuppage.firstname.txt")
	private QAFWebElement otriosSignuppageFirstNameTxt;
	@FindBy(locator = "otrios.signuppage.lastname.txt")
	private QAFWebElement otriosSignuppageLastNameTxt;
	@FindBy(locator = "otrios.signuppage.confirmpassword.txt")
	private QAFWebElement otriosSignuppageConfirmPasswordTxt;
	@FindBy(locator = "otrios.signuppage.officecode.txt")
	private QAFWebElement otriosSignuppageOfficeCodeTxt;
	@FindBy(locator = "otrios.signuppage.birthday.month.pkr")
	private QAFWebElement otriosSignuppageBirthdayMonthPkr;
	@FindBy(locator = "otrios.signuppage.birthday.date.pkr")
	private QAFWebElement otriosSignuppageBirthdayDatePkr;
	@FindBy(locator = "otrios.signuppage.timingPicker.year.pkr")
	private QAFWebElement otriosSignuppageTimingpickerYearPkr;
	@FindBy(locator = "otrios.signuppage.signup.ok.btn")
	private QAFWebElement otriosSignuppageSingupOkBtn;
	@FindBy(locator = "otrios.signuppage.optin.iagree.lbl")
	private QAFWebElement otriosSignuppageOptinIagreeLbl;
	@FindBy(locator = "otrios.signuppage.optin.cancel.lbl")
	private QAFWebElement otriosSignuppageOptinCancelLbl;
	@FindBy(locator = "otrios.signuppage.optin.title.lbl")
	private QAFWebElement otriosSignuppageOptinTitleLbl;
	@FindBy(locator = "otrios.signuppage.greeCheck.img")
	private QAFWebElement otriosSignuppagegreenCheckImg;
	@FindBy(locator = "otrios.signuppage.checkebox")
	private QAFWebElement otriosSignuppageCheckebox;
	@FindBy(locator = "otrios.signuppage.Agree.lbl")
	private QAFWebElement otriosSignuppageAgreeLbl;
	@FindBy(locator = "otrios.signuppage.hcp.email.txt")
	private QAFWebElement otriosSignuppageHcpEmailTxt;
	@FindBy(locator = "otrios.signuppage.hcp.pass.txt")
	private QAFWebElement otriosSignuppageHcpPassTxt;
	@FindBy(locator = "otrios.signuppage.hcp.confirmpass.txt")
	private QAFWebElement otriosSignuppageHcpConfirmpassTxt;
	@FindBy(locator = "otrios.signuppage.hcp.datofbirth.txt")
	private QAFWebElement otriosSignuppageHcpDatofbirthTxt;
	@FindBy(locator = "otrios.signuppage.hcp.term.chk")
	private QAFWebElement otriosSignuppageHcpTermChk;
	@FindBy(locator = "otrios.signuppage.hcp.diabetes.chk")
	private QAFWebElement otriosSignuppageHcpDiabetesChk;
	@FindBy(locator = "otrios.signuppage.hcp.dateofbirth.greencheck.img")
	private QAFWebElement otriosSignuppageHcpDateofbirthGreencheckImg;

	// SG Locators for German Unit of Measure Page
	@FindBy(locator = "otrios.signupPage.unitOfMeasure.lbl")
	private QAFWebElement otriosSignupPageUnitOfMeasureLbl;
	@FindBy(locator = "otrios.signupPage.appMeterUnitOfMeasure.txt")
	private QAFWebElement otriosSignupPageAppMeterUnitOfMeasureTxt;
	@FindBy(locator = "otrios.signupPage.useExample.txt")
	private QAFWebElement otriosSignupPageUseExampleTxt;
	@FindBy(locator = "otrios.signupPage.exampleMgDL.lbl")
	private QAFWebElement otriosSignupPageExampleMgDLLbl;
	@FindBy(locator = "otrios.signupPage.useMgDL.lbl")
	private QAFWebElement otriosSignupPageUseMgDLLbl;
	@FindBy(locator = "otrios.signupPage.exampleMmol.lbl")
	private QAFWebElement otriosSignupPageExampleMmolLbl;
	@FindBy(locator = "otrios.signupPage.useMmol.lbl")
	private QAFWebElement otriosSignupPageUseMmolLbl;
	@FindBy(locator = "otrios.signupPage.pairWithMeter.lbl")
	private QAFWebElement otriosSignupPagePairWithMeterLbl;
	@FindBy(locator = "otrios.signuppage.term.lnk")
	private QAFWebElement otriosSignupPageTermLnk;
	@FindBy(locator = "otrios.signuppage.privecy.lnk")
	private QAFWebElement otriosSignupPagePrivecyLnk;
	@FindBy(locator = "otrios.signupPage.meterskip.btn")
	private QAFWebElement otriosSignupPageMeterskipBtn;
	@FindBy(locator = "otrios.signupPage.errorMessage.txt")
	private QAFWebElement otriosSignupPageErrorMessageTxt;
	@FindBy(locator = "otrios.signupPage.errorCancel.img")
	private QAFWebElement otriosSignupPageErrorCancelImg;

	// locators for notification pop up

	@FindBy(locator = "otrios.signupPage.notification.allow.popup")
	private QAFWebElement otriosSignupPageNotificationAllowPopup;
	@FindBy(locator = "otrios.signupPage.notification.dontallow.popup")
	private QAFWebElement otriosSignupPageNotificationDontallowPopup;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	// SG Elements for German Unit of Measure Page
	public QAFWebElement getOtriosSignuppageSkipBtn() {
		return otriosSignupPageMeterskipBtn;
	}

	public QAFWebElement getotriosSignupPagePrivecyLnk() {
		return otriosSignupPagePrivecyLnk;
	}

	public QAFWebElement getotriosSignupPageTermLnk() {
		return otriosSignupPageTermLnk;
	}

	public QAFWebElement getotriosSignupPageUnitOfMeasureLbl() {
		return otriosSignupPageUnitOfMeasureLbl;
	}

	public QAFWebElement getotriosSignupPageAppMeterUnitOfMeasureTxt() {
		return otriosSignupPageAppMeterUnitOfMeasureTxt;
	}

	public QAFWebElement getotriosSignupPageUseExampleTxt() {
		return otriosSignupPageUseExampleTxt;
	}

	public QAFWebElement getotriosSignupPageExampleMgDLLbl() {
		return otriosSignupPageExampleMgDLLbl;
	}

	public QAFWebElement getotriosSignupPageUseMgDLLbl() {
		return otriosSignupPageUseMgDLLbl;
	}

	public QAFWebElement getotriosSignupPageExampleMmolLbl() {
		return otriosSignupPageExampleMmolLbl;
	}

	public QAFWebElement getotriosSignupPageUseMmolLbl() {
		return otriosSignupPageUseMmolLbl;
	}

	public QAFWebElement getotriosSignupPagePairWithMeterLbl() {
		return otriosSignupPagePairWithMeterLbl;
	}

	public QAFWebElement getOtriosSignuppageHcpEmailTxt() {
		return otriosSignuppageHcpEmailTxt;
	}

	public QAFWebElement getOtriosSignuppageHcpPassTxt() {
		return otriosSignuppageHcpPassTxt;
	}

	public QAFWebElement getOtriosSignuppageHcpConfirmpassTxt() {
		return otriosSignuppageHcpConfirmpassTxt;
	}

	public QAFWebElement getOtriosSignuppageHcpDatofbirthTxt() {
		return otriosSignuppageHcpDatofbirthTxt;
	}

	public QAFWebElement getOtriosSignuppageHcpTermChk() {
		return otriosSignuppageHcpTermChk;
	}

	public QAFWebElement getOtriosSignuppageHcpDiabetesChk() {
		return otriosSignuppageHcpDiabetesChk;
	}

	public QAFWebElement getOtriosSignuppageHcpDateofbirthGreencheckImg() {
		return otriosSignuppageHcpDateofbirthGreencheckImg;
	}

	public QAFWebElement getOtriosSignuppagegreenCheckImg() {
		return otriosSignuppagegreenCheckImg;
	}

	public QAFWebElement getOtriosSignuppageOptinTitleLbl() {
		return otriosSignuppageOptinTitleLbl;
	}

	public QAFWebElement getOtriosSignuppageBirthdayMonthPkr() {
		return otriosSignuppageBirthdayMonthPkr;
	}

	public QAFWebElement getOtriosSignuppageBirthdayDatePkr() {
		return otriosSignuppageBirthdayDatePkr;
	}

	public QAFWebElement getOtriosSignuppageTimingpickerYearPkr() {
		return otriosSignuppageTimingpickerYearPkr;
	}

	public QAFWebElement getOtriosSignuppageFirstNameTxt() {
		return otriosSignuppageFirstNameTxt;
	}

	public QAFWebElement getOtriosSignuppageLastNameTxt() {
		return otriosSignuppageLastNameTxt;
	}

	public QAFWebElement getOtriosSignuppageConfirmPasswordTxt() {
		return otriosSignuppageConfirmPasswordTxt;
	}

	public QAFWebElement getOtriosSignuppageOfficeCodeTxt() {
		return otriosSignuppageOfficeCodeTxt;
	}

	public QAFWebElement getOtriosSignuppageOnetouchIcon() {
		return otriosSignuppageOnetouchIcon;
	}

	public QAFWebElement getOtriosSignuppageTermofserviceLbl() {
		return otriosSignuppageTermofserviceLbl;
	}

	public QAFWebElement getOtriosSignuppageTermofserviceCbox() {
		return otriosSignuppageTermofserviceCbox;
	}

	public QAFWebElement getOtriosSignuppageCountrytermsLbl() {
		return otriosSignuppageCountrytermsLbl;
	}

	public QAFWebElement getOtriosSignuppageCountrytermsCbox() {
		return otriosSignuppageCountrytermsCbox;
	}

	public QAFWebElement getOtriosSignuppageEmailadressTbox() {
		return otriosSignuppageEmailadressTbox;
	}

	public QAFWebElement getOtriosSignuppageConfirmemailadressTbox() {
		return otriosSignuppageConfirmemailadressTbox;
	}

	public QAFWebElement getOtriosSignuppagePasswordTbox() {
		return otriosSignuppagePasswordTbox;
	}

	public QAFWebElement getOtriosSignuppageDateofbirthTbox() {
		return otriosSignuppageDateofbirthTbox;
	}

	public QAFWebElement getOtriosSignuppageSignupBtn() {
		return otriosSignuppageSignupBtn;
	}

	public QAFWebElement getOtriosSignuppageHaveaccountLbl() {
		return otriosSignuppageHaveaccountLbl;
	}

	public QAFWebElement getOtriosSignuppageLoginLnk() {
		return otriosSignuppageLoginLnk;
	}

	public QAFWebElement getOtriosSignuppageCreateaccountLbl() {
		return otriosSignuppageCreateaccountLbl;
	}

	public QAFWebElement getOtriosSignuppageEmailCheckImg() {
		return otriosSignuppageEmailCheckImg;
	}

	public QAFWebElement getOtriosSignuppageConfirmemailCheckImg() {
		return otriosSignuppageConfirmemailCheckImg;
	}

	public QAFWebElement getOtriosSignuppageAccessquestionLbl() {
		return otriosSignuppageAccessquestionLbl;
	}

	public QAFWebElement getOtriosSignuppageEnabletouchidBtn() {
		return otriosSignuppageEnabletouchidBtn;
	}

	public QAFWebElement getOtriosSignuppageKeepmeloginBtn() {
		return otriosSignuppageKeepmeloginBtn;
	}

	public QAFWebElement getOtriosSignuppageRequirloginBtn() {
		return otriosSignuppageRequirloginBtn;
	}

	public QAFWebElement getOtriosSignuppageCheckebox() {
		return otriosSignuppageCheckebox;
	}

	public QAFWebElement getOtriosSignuppageAgreeLbl() {
		return otriosSignuppageAgreeLbl;
	}

	public QAFWebElement getOtriosSignuppageStaticlabel(String text) {
		return JNJUtilsIOS.getElement("otrios.signupPage.static.lbl", text);
	}

	public QAFWebElement getOtriosGermansignuppageUomselectMgdlBtn() {
		return otriosGermansignuppageUomselectMgdlBtn;
	}

	public QAFWebElement getOtriosGermansignuppageUomselectMmolBtn() {
		return otriosGermansignuppageUomselectMmolBtn;
	}

	public QAFWebElement getOtriosSignuppageOptinIagreeLbl() {
		return JNJUtilsIOS.getElement("otrios.signupPage.static.lbl", JNJUtilsIOS.getPropString("termsAndCond.agree"));
	}

	public QAFWebElement getOtriosSignuppageOptinCancelLbl() {
		return JNJUtilsIOS.getElement("otrios.signupPage.static.lbl",
				JNJUtilsIOS.getPropString("common.actions.cancel"));
	}

	public QAFWebElement getOtriosSignuppageSingupOkBtn() {
		return JNJUtilsIOS.getElement("otrios.signupPage.static.lbl", JNJUtilsIOS.getPropString("appCommon.ok"));
	}

	public QAFWebElement getOtriosSignuppageHcpDoneBtn() {
		return JNJUtilsIOS.getElement("otrios.signupPage.static.lbl", JNJUtilsIOS.getPropString("appCommon.done"));
	}

	public QAFWebElement getotriosSignupPageNotificationAllowPopup() {
		return otriosSignupPageNotificationAllowPopup;
	}

	public QAFWebElement getotriosSignupPageNotificationDontallowPopup() {
		return otriosSignupPageNotificationDontallowPopup;
	}

	public QAFWebElement getotriosSignupPageErrorMessageTxt() {
		return otriosSignupPageErrorMessageTxt;
	}

	public QAFWebElement getotriosSignupPageErrorCancelImg() {
		return otriosSignupPageErrorCancelImg;
	}

	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "otrios.germansignuppage.uomselect.mgdl.btn")
	private QAFWebElement otriosGermansignuppageUomselectMgdlBtn;
	@FindBy(locator = "otrios.germansignuppage.uomselect.mmol.btn")
	private QAFWebElement otriosGermansignuppageUomselectMmolBtn;
	@FindBy(locator = "otrios.signupPage.static.lbl")
	private QAFWebElement otriosSignuppageStaticLbl;

	String app="com.lifescan.reveal.enterprise";
	String by="identifier";
	// method to open otrios app
	public void openotriosApp() {
//		launchPage(null);

//		try {
//			closeApp(app,by);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		startApp(app,by);
		try {
			startApp(app,by);
			
			JNJUtilsIOS jnjios=new JNJUtilsIOS();

			jnjios.getDriver().context("NATIVE_APP");
			
			
			getotriosSignupPageNotificationAllowPopup().waitForPresent();
			getotriosSignupPageNotificationAllowPopup().click();
			Reporter.logWithScreenShot("App is launched", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("otrios app is launched");
	}
	

	
	


	public  void startApp(String app, String by) {
		System.out.println("instart app method");
	    iosDriver.executeScript("mobile:application:open",new Object[]{getAppParams(app, by)});
	}

	private Object getAppParams(String app2, String by2) {
		HashMap<String, String> map =new HashMap<>();
		map.put(by2, app2);
		return map;
	}

	public  void closeApp(String app, String by) {
	    closeApp(app, by, false);
	}

	public  void closeApp(String app, String by, boolean ignoreExceptions) {
	    try {
	    	iosDriver.executeScript("mobile:application:close", new Object[]{app,by});
	    } catch (Exception var4) {
	        if(!ignoreExceptions) {
	            throw var4;
	        }
	    }

	}

	
	
	
	
	
	
	

	public void openAppWithoutNotification() {
		launchPage(null);

		try {
			iosDriver.closeApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			iosDriver.launchApp();
			getotriosSignupPageNotificationDontallowPopup().waitForPresent();
			getotriosSignupPageNotificationDontallowPopup().click();
			Reporter.logWithScreenShot("App is launched and Dont allow pop up selected", MessageTypes.Pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("otrios app is launched");
	}

	// method to verify sign up page elements
	// Milan
	public void veriySignUpPage() {
		getOtriosSignuppageTermofserviceLbl().waitForPresent();
		getOtriosSignuppageTermofserviceLbl().verifyPresent("Sign up page terms of service label");
		getOtriosSignuppageEmailadressTbox().verifyPresent("Email text box");
		getOtriosSignuppageConfirmemailadressTbox().verifyPresent("Confirm email text box");
		getOtriosSignuppagePasswordTbox().verifyPresent("Password text box");
		getOtriosSignuppageSignupBtn().verifyPresent("Sign up button");
		getOtriosSignuppageLoginLnk().verifyPresent("Login link on sign up page");
	}

	// Method to select diabetes check box
	// Milan
	public void selectionOfOptin(String option) {
		Point p1 = getOtriosSignuppageEmailadressTbox().getLocation();
		JNJUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY(), p1.getX(), p1.getY() - 100, 50);
		getOtriosSignuppageCountrytermsCbox().click();

		getOtriosSignuppageOptinTitleLbl().waitForPresent();
		if (option.equalsIgnoreCase("I Agree")) {
			getOtriosSignuppageOptinIagreeLbl().click();
			Reporter.logWithScreenShot("Selecting I Agree", MessageTypes.Pass);
		} else if (option.equalsIgnoreCase("Cancel")) {
			getOtriosSignuppageOptinCancelLbl().click();
			Reporter.logWithScreenShot("Selecting Cancel button", MessageTypes.Pass);
		}
	}

	// Method to fill sign up details
	// milan
	public void fillRandomSignUpDetails(Object signupDetails) {
		enterSignupFirstScreenDetails(signupDetails);
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().sendKeys(email);
		getOtriosSignuppagePasswordTbox().sendKeys("abcd123#");
		getOtriosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		// getOtriosSignuppageDateofbirthTbox().sendKeys("11051990");
		getOtriosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

	}

	// Method to verify invalid email ids entered
	public void fillDetailsWithInvalidEmails(Object signupDetails) {
		enterSignupFirstScreenDetails(signupDetails);
		String email = "@gmail.com";

		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Prefix name is not entered", MessageTypes.Pass);
		getOtriosSignuppageEmailadressTbox().clear();
		email = "abc.gmail.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("@ is not entered", MessageTypes.Pass);
		getOtriosSignuppageEmailadressTbox().clear();
		email = "abc@.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Mail domain name is not entered", MessageTypes.Pass);
		getOtriosSignuppageEmailadressTbox().clear();
		email = RandomStringUtils.randomAlphanumeric(70) + "@gmail.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().click();
		// Added by Sangram OTRIOS-2603
		getOtriosSignuppageEmailadressTbox().clear();
		email = RandomStringUtils.randomAlphanumeric(125) + "@gmail.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().click();
		Reporter.logWithScreenShot("Large amount of text is entered", MessageTypes.Pass);

		if (getOtriosSignuppageEmailadressTbox().getText().toString().length() > 75) {
			Reporter.logWithScreenShot("Email Length exceeds the limit", MessageTypes.Pass);
			getOtriosSignuppageEmailadressTbox().clear();
			email = RandomStringUtils.randomAlphanumeric(65) + "@gmail.com";
			getOtriosSignuppageEmailadressTbox().sendKeys(email);
			getOtriosSignuppageConfirmemailadressTbox().click();
			Reporter.logWithScreenShot("Email Length is within given limit", MessageTypes.Pass);
		}
		email = "infostretchjj" + RandomStringUtils.randomNumeric(3) + "@gmail.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		Reporter.logWithScreenShot("Valid Email is entered", MessageTypes.Pass);
	}

	// Method to fill details without email id
	public void fillRandomSignUpDetailsWithoutEmail(Object signupDetails) {
		enterSignupFirstScreenDetails(signupDetails);
		/*
		 * getOtriosSignuppageTermofserviceCbox().click(); if
		 * (getOtriosSignuppageCountrytermsCbox().isPresent()) {
		 * getOtriosSignuppageCountrytermsCbox().click(); }
		 */
		String email = "infostretchjj" + RandomStringUtils.randomNumeric(3) + "@gmail.com";
		/* getOtriosSignuppageEmailadressTbox().sendKeys(email); */
		getOtriosSignuppageConfirmemailadressTbox().sendKeys(email);
		getOtriosSignuppagePasswordTbox().sendKeys("abcd123#");
		getOtriosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		// getOtriosSignuppageDateofbirthTbox().sendKeys("11051990");
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageStaticlabel(
				ConfigurationManager.getBundle().getString(("auth.emailValidation.emailsMustMatch")))
						.verifyPresent("Both email address fields must match error message");
		JNJUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		getOtriosSignuppageSignupBtn().verifyDisabled("Sign up button");
	}

	// Method to click on sign up button when enabled
	// Milan
	public void clickOnSignUpBtn() {
		try {
			getOtriosSignuppageSignupBtn().waitForEnabled();
			JNJUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
			Reporter.logWithScreenShot("Signup screen1", MessageTypes.Pass);
			getOtriosSignuppageSignupBtn().click();
			getOtriosSignuppageSingupOkBtn().waitForPresent();
			Reporter.logWithScreenShot("Signup screen4", MessageTypes.Pass);
			getOtriosSignuppageSingupOkBtn().click();
			// if (getOtriosSignuppageSkipBtn().isPresent())
			// Reporter.logWithScreenShot("Skip button is present",
			// MessageTypes.Pass);
			// getOtriosSignuppageSkipBtn().click();

		} catch (Exception e) {
			Reporter.logWithScreenShot("Signup button not enabled", MessageTypes.Pass);
		}
	}

	// Method to navigate to page
	// milan
	public void redirectToPage(String pageName) {
		LoginPageIOS loginPage = new LoginPageIOS();
		pageName = pageName.toUpperCase();
		switch (pageName) {
		case "SIGN-UP":
			try {
				getOtriosSignuppageTermofserviceLbl().waitForPresent();
			} catch (Exception e) {

			}
			if (!getOtriosSignuppageTermofserviceLbl().isPresent()) {
				loginPage.getOtriosLoginpageSignupLnk().click();
				getOtriosSignuppageTermofserviceLbl().waitForPresent();
			}
			Reporter.logWithScreenShot("User is on Sign Up Page");
			break;
		case "LOG-IN":
			if (!loginPage.getOtriosLoginpageForgotpasswordLbl().isPresent()) {
				getOtriosSignuppageLoginLnk().waitForPresent();
				getOtriosSignuppageLoginLnk().click();
				loginPage.getOtriosLoginpageForgotpasswordLbl().waitForPresent();
			}
			Reporter.logWithScreenShot("User is on Login Page");
			break;
		}
	}

	// Method to click on skip button
	// milan
	public void clickSkipBtn() {

		getOtriosSignuppageSkipBtn().waitForPresent();
		Reporter.logWithScreenShot("Skip meter Page");
		getOtriosSignuppageSkipBtn().click();

	}

	/*
	 * Method to select access type milan
	 */
	public void selectAccessType(String option) {
		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			getOtriosSignuppageKeepmeloginBtn().click();
			break;
		case "TOUCH ID":
			getOtriosSignuppageEnabletouchidBtn().click();
			break;

		case "REQUIR LOGIN":
			getOtriosSignuppageRequirloginBtn().click();
			break;
		}
	}

	/*
	 * Method fill sign up first screen details milan
	 */
	public void enterSignupFirstScreenDetails(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getOtriosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getOtriosSignuppageFirstNameTxt().clear();
		getOtriosSignuppageFirstNameTxt().sendKeys(userBean.getFirstName());

		getOtriosSignuppageLastNameTxt().clear();
		getOtriosSignuppageLastNameTxt().sendKeys(userBean.getLastName());
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageCountrytermsCbox().click();
		getOtriosSignuppageSignupBtn().waitForEnabled();
		getOtriosSignuppageSignupBtn().click();

	}

	// Method to fill data without firstname for registration
	public void enterSignupFirstScreenDetailsWithoutFirstName(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		// JNJUtilsIOS jnj = new JNJUtilsIOS();

		getOtriosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getOtriosSignuppageHcpDoneBtn().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageLastNameTxt().clear();
		getOtriosSignuppageLastNameTxt().sendKeys(userBean.getLastName());
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageCountrytermsCbox().click();
		getOtriosSignuppageSignupBtn().verifyDisabled("Sign up button");

	}

	// Method to fill data without lastname for registration
	public void enterSignupFirstScreenDetailsWithoutLastName(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		JNJUtilsIOS jnj = new JNJUtilsIOS();
		getOtriosSignuppageFirstNameTxt().clear();
		getOtriosSignuppageFirstNameTxt().sendKeys(userBean.getFirstName());

		getOtriosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageCountrytermsCbox().click();
		getOtriosSignuppageSignupBtn().verifyDisabled("Sign up button");

	}

	public void enterSignupDetailsWithoutBirthdate(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		JNJUtilsIOS jnj = new JNJUtilsIOS();
		getOtriosSignuppageFirstNameTxt().clear();
		getOtriosSignuppageFirstNameTxt().sendKeys(userBean.getFirstName());

		getOtriosSignuppageLastNameTxt().clear();
		getOtriosSignuppageLastNameTxt().sendKeys(userBean.getLastName());

		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageCountrytermsCbox().click();
		getOtriosSignuppageSignupBtn().verifyDisabled("Sign up button");
	}

	public void doSignUpWithoutCheckBox(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		JNJUtilsIOS jnj = new JNJUtilsIOS();
		getOtriosSignuppageFirstNameTxt().clear();
		getOtriosSignuppageFirstNameTxt().sendKeys(userBean.getFirstName());

		getOtriosSignuppageLastNameTxt().clear();
		getOtriosSignuppageLastNameTxt().sendKeys(userBean.getLastName());

		getOtriosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageSignupBtn().verifyDisabled("Sign up button");
	}

	public void enterSignupFirstScreenBelowAgeBirthdate(Object userDetail) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}

		getOtriosSignuppageFirstNameTxt().clear();
		getOtriosSignuppageFirstNameTxt().sendKeys(userBean.getFirstName());
		Reporter.logWithScreenShot("After Filling first name", MessageTypes.Pass);
		getOtriosSignuppageLastNameTxt().clear();
		getOtriosSignuppageLastNameTxt().sendKeys(userBean.getLastName());
		Reporter.logWithScreenShot("After Filling last name", MessageTypes.Pass);
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageDateofbirthTbox().click();
		setDateOfBirth(userBean);
		getOtriosSignuppageOnetouchIcon().click();

		String ageRestrictionString = JNJUtilsIOS.getPropString("onboarding.ageRestriction.title");
		getOtriosSignuppageStaticlabel(ageRestrictionString).waitForPresent();
		getOtriosSignuppageStaticlabel(ageRestrictionString).verifyPresent("Age restriction pop up");
		ClickOKBtn();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageCountrytermsCbox().click();
		Reporter.logWithScreenShot("Error message with Birthdate field below age", MessageTypes.Pass);
	}

	// Method to set date of birth from picker
	// milan
	// removed commented code for Month selection > Sangram 3.1 Maintainance
	public void setDateOfBirth(UserDetailBeans userBean) {
		getOtriosSignuppageBirthdayMonthPkr().waitForPresent();
		while (!(getOtriosSignuppageBirthdayMonthPkr().getAttribute("value").toString()
				.contains(userBean.getBirthdayMonth()))) {
			try {
				getOtriosSignuppageBirthdayMonthPkr().sendKeys(userBean.getBirthdayMonth());
			} catch (Exception e) {

			}
		}
		// while
		// (!(getOtriosSignuppageBirthdayDatePkr().getAttribute("value").toString()
		// .contains(userBean.getBirthdayDate()))) {
		// try {
		// getOtriosSignuppageBirthdayDatePkr().sendKeys(userBean.getBirthdayDate());
		// } catch (Exception e) {
		//
		// }
		// }
		// while (!(
		// getOtriosSignuppageTimingpickerYearPkr().getAttribute("value").toString()
		// .contains(userBean.getBirthdayYear()))) {
		// try {
		// getOtriosSignuppageTimingpickerYearPkr().sendKeys(userBean.getBirthdayYear());
		// } catch (Exception e) {
		//
		// }
		// }
		JNJUtilsIOS.selectTimePicker(getOtriosSignuppageTimingpickerYearPkr(),
				Integer.parseInt(userBean.getBirthdayYear()));
	}

	public void emailValidations(String option) {

		enterSignupFirstScreenDetails(option);
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().sendKeys("abc@gmail.com");
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("auth.emailValidation.emailsMustMatch"))
				.verifyPresent("Both email address fields must match error message");
		getOtriosSignuppageEmailadressTbox().clear();
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().clear();
		getOtriosSignuppageConfirmemailadressTbox().sendKeys(email);
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppagegreenCheckImg().verifyPresent("Green correct icon ,Email field matched");
		getOtriosSignuppagePasswordTbox().sendKeys("abcd123#");
		getOtriosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageSignupBtn().waitForEnabled();
		getOtriosSignuppageSignupBtn().click();

		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

	}

	// Method to fill details without password field
	public void noPasswordToFill(String option) {
		enterSignupFirstScreenDetails(option);
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmPasswordTxt().sendKeys("abcd@123");
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.verifyPresent("Passwords do not match error message");
	}

	// Method to enter invalid password and verify
	public void invalidPasswordEntry(String option) {

		enterSignupFirstScreenDetails(option);
		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().sendKeys(email);
		getOtriosSignuppagePasswordTbox().clear();
		getOtriosSignuppagePasswordTbox().sendKeys("abcdssas");
		getOtriosSignuppageConfirmPasswordTxt().click();
		WebDriverTestCase.verifyTrue(passworErrorMsg(),
				"expected " + JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getOtriosSignuppageStaticlabel(
								JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for non numeric");

		getOtriosSignuppagePasswordTbox().clear();
		getOtriosSignuppagePasswordTbox().sendKeys("abcd1");
		getOtriosSignuppageConfirmPasswordTxt().click();
		WebDriverTestCase.verifyTrue(passworErrorMsg(),
				"expected " + JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getOtriosSignuppageStaticlabel(
								JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for less length");
		getOtriosSignuppagePasswordTbox().clear();
		getOtriosSignuppagePasswordTbox().sendKeys("abcdefg@123456789");
		getOtriosSignuppageConfirmPasswordTxt().click();
		Validator.verifyThat("Password field charcter length",
				getOtriosSignuppagePasswordTbox().getAttribute("value").length(), Matchers.lessThanOrEqualTo(16));
		getOtriosSignuppagePasswordTbox().clear();
		getOtriosSignuppagePasswordTbox().sendKeys("abcd@1234");
		getOtriosSignuppageConfirmPasswordTxt().click();
		Reporter.logWithScreenShot("Valid password field is entered", MessageTypes.Pass);

	}

	//method to verify error message
	public boolean passworErrorMsg() {
		boolean flag = false;
		if (JNJUtilsIOS.getPropString("Country.name").equalsIgnoreCase("United States")) {
			flag = getOtriosSignuppageStaticlabel(
					JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
							.getAttribute("label")
							.contains(JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar"));
		} else {
			flag = getOtriosSignuppageStaticlabel(
					JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
							.getAttribute("label").contains(JNJUtilsIOS
									.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40));
		}
		return flag;
	}

	public void repeatedMailIdSignupFlow(String option) {
		enterSignupFirstScreenDetails(option);
		getOtriosSignuppageEmailadressTbox().sendKeys("sgunthe1@its.jnj.com");
		getOtriosSignuppageConfirmemailadressTbox().sendKeys("sgunthe1@its.jnj.com");
		getOtriosSignuppagePasswordTbox().clear();
		getOtriosSignuppagePasswordTbox().sendKeys("abcd123#");
		getOtriosSignuppageConfirmPasswordTxt().clear();
		getOtriosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageOnetouchIcon().click();
		JNJUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		getOtriosSignuppageSignupBtn().waitForEnabled();
		getOtriosSignuppageSignupBtn().click();
		getOtriosSignuppageSingupOkBtn().waitForVisible();
		Reporter.logWithScreenShot("Error Message for using already registered mail id", MessageTypes.Pass);

	}

	// method to uninstall app
	// milan
	public void uninstallApp() {
		JNJUtilsIOS jnj = new JNJUtilsIOS();

		String a = ConfigurationManager.getBundle().getProperty("appium.additional.capabilities").toString();

		String filePath = splitCapabilityString(a, "app':'");
		String bundleID = splitCapabilityString(a, "bundleId':'");

		jnj.getDriver().removeApp("com.lifescan.reveal.enterprise");

		jnj.getDriver().installApp(filePath);
		System.out.println("App installed " + jnj.getDriver().isAppInstalled(bundleID));

	}

	public String splitCapabilityString(String value, String splitValue) {
		String str1[] = value.split(splitValue);
		String str2[] = str1[1].split("'");
		return str2[0];
	}

	// Method to verify clinic code
	// Milan
	public void verifyInvalidClinicCode(Object signupDetails) {
		fillRandomSignUpDetails(signupDetails);
		// entering invalid clinic code
		getOtriosSignuppageOfficeCodeTxt().click();
		getOtriosSignuppageOfficeCodeTxt().sendKeys("ttccxx");
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("office.code.not.found")).verifyPresent();
		Reporter.logWithScreenShot("Incorrect Clinic Message");

		getOtriosSignuppageOfficeCodeTxt().clear();
		String clinicCode = ConfigurationManager.getBundle().getProperty("clinic.clinicCode.cn.code1").toString();
		getOtriosSignuppageOfficeCodeTxt().sendKeys(clinicCode);
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("office.code.not.found")).verifyPresent();
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
	}

	// Method to take screen shot for negetive sceen
	// Milan
	public void signupsecondPageScreen(Object signupDetails) {
		enterSignupFirstScreenDetails(signupDetails);

		getOtriosSignuppageEmailadressTbox().sendKeys("tes1123@gmail");
		getOtriosSignuppageConfirmemailadressTbox().sendKeys("tes1223@gmail.com");
		getOtriosSignuppagePasswordTbox().sendKeys("abcd");
		getOtriosSignuppageConfirmPasswordTxt().sendKeys("abcd1234");

		getOtriosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}

		String email1 = userBean.getEmailID();
		getOtriosSignuppageEmailadressTbox().clear();
		getOtriosSignuppageEmailadressTbox().sendKeys(email1);
		getOtriosSignuppageConfirmemailadressTbox().clear();
		getOtriosSignuppageConfirmemailadressTbox().sendKeys(email1);
		getOtriosSignuppagePasswordTbox().clear();
		getOtriosSignuppagePasswordTbox().sendKeys("abcd123#");
		getOtriosSignuppageConfirmPasswordTxt().clear();
		getOtriosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");

		getOtriosSignuppageOnetouchIcon().click();

		getOtriosSignuppageSignupBtn().waitForEnabled();
		JNJUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		Reporter.logWithScreenShot("Signup button is present", MessageTypes.Pass);

		getOtriosSignuppageSignupBtn().click();
		Reporter.logWithScreenShot("Exist user", MessageTypes.Pass);
		ClickOKBtn();

		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getOtriosSignuppageEmailadressTbox().clear();
		getOtriosSignuppageEmailadressTbox().sendKeys(email);
		getOtriosSignuppageConfirmemailadressTbox().clear();
		getOtriosSignuppageConfirmemailadressTbox().sendKeys(email);
		getOtriosSignuppagePasswordTbox().clear();
		getOtriosSignuppagePasswordTbox().sendKeys("abcd123#");
		getOtriosSignuppageConfirmPasswordTxt().clear();
		getOtriosSignuppageConfirmPasswordTxt().sendKeys("abcd123#");

		getOtriosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);
	}

	// Method to clickOnOkButton
	// Milan
	public void ClickOKBtn() {
		String ok = JNJUtilsIOS.getPropString("appCommon.ok");
		try {
			getOtriosSignuppageStaticlabel(ok).waitForPresent();
			getOtriosSignuppageStaticlabel(ok).click();
		} catch (Exception e) {

		}
	}

	// Method to verify emailField for hcp user
	// milan
	public void verifyEmailHCPscreen(Object userDetails) {
		getOtriosSignuppageHcpEmailTxt().clear();
		getOtriosSignuppageHcpEmailTxt().sendKeys("123@eee");
		getOtriosSignuppageHcpPassTxt().click();
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyVisible("Error popup for invalid email format");
		getOtriosSignuppageHcpEmailTxt().clear();
		getOtriosSignuppageHcpEmailTxt().sendKeys("123.com");
		getOtriosSignuppageHcpPassTxt().click();
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyVisible("Error popup for invalid email format");
		verifyPasswordFieldHCPScreen();
		verifyLength();
		verifyHCPWithoutTermsChecked(userDetails);

	}

	// Method to verify password field for hcp
	// milan
	public void verifyPasswordFieldHCPScreen() {
		getOtriosSignuppageHcpPassTxt().clear();
		getOtriosSignuppageHcpPassTxt().sendKeys("abcdssas");
		getOtriosSignuppageHcpConfirmpassTxt().click();
		WebDriverTestCase.verifyTrue(
				getOtriosSignuppageStaticlabel(
						JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
								.getAttribute("label").contains(JNJUtilsIOS
										.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40)),
				"expected " + JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getOtriosSignuppageStaticlabel(
								JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for non numeric");

		getOtriosSignuppageHcpPassTxt().clear();
		getOtriosSignuppageHcpPassTxt().sendKeys("abcd1");
		getOtriosSignuppageHcpConfirmpassTxt().click();
		WebDriverTestCase.verifyTrue(
				getOtriosSignuppageStaticlabel(
						JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
								.getAttribute("label").contains(JNJUtilsIOS
										.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40)),
				"expected " + JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getOtriosSignuppageStaticlabel(
								JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message for less length");
		getOtriosSignuppageHcpPassTxt().clear();
		getOtriosSignuppageHcpPassTxt().sendKeys("abcdefg@123456789");
		getOtriosSignuppageHcpConfirmpassTxt().click();
		WebDriverTestCase.verifyTrue(
				getOtriosSignuppageStaticlabel(
						JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
								.getAttribute("label").contains(JNJUtilsIOS
										.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40)),
				"expected " + JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar") + "  Actual "
						+ getOtriosSignuppageStaticlabel(
								JNJUtilsIOS.getPropString("auth.passwordValidation.forbiddenChar").substring(0, 40))
										.getAttribute("label"),
				" Correct password error message more than length");

		getOtriosSignuppageHcpPassTxt().clear();
		getOtriosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getOtriosSignuppageHcpConfirmpassTxt().sendKeys("abcd1235");
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("auth.passwordValidation.passwordsMustMatch"))
				.verifyPresent("Passwords do not match error message");

	}

	// Method to verify terms privecy check box not selected flow
	// Milan
	public void verifyHCPWithoutTermsChecked(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();

		userBean.fillData(userDetails);

		getOtriosSignuppageHcpEmailTxt().clear();
		getOtriosSignuppageHcpEmailTxt().sendKeys(userBean.getEmailID());
		getOtriosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getOtriosSignuppageHcpConfirmpassTxt().sendKeys("abcd1234");
		getOtriosSignuppageHcpDoneBtn().verifyDisabled("Done button is disable when term check box not selected");

	}

	// Method to verify email field charcter length for hcp email on reset
	// password screen
	// Milan
	public void verifyLength() {
		getOtriosSignuppageHcpEmailTxt().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "@gmail.com";

		getOtriosSignuppageHcpEmailTxt().clear();
		getOtriosSignuppageHcpEmailTxt().sendKeys(typeName);
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat"))
				.verifyVisible("Error popup for invalid email format");
		// Validator.verifyThat("Hcp reset page email field charcter
		// length",getOtriosSignuppageHcpEmailTxt().
		// getAttribute("value").length(),Matchers.lessThanOrEqualTo(75));
	}

	//Method to verify less then 18 hcp user
	public void verifyLessAgeHCPUser() {
		String msg = JNJUtilsIOS.getPropString("auth.ageValidation.ageRestriction").substring(0, 54);
		getOtriosSignuppageStaticlabel(msg).verifyPresent("Age restriction pop up");
	}

	// Method to verify Hcp reset password screen when keeping email field blank
	// Milan
	public void noEmailResetPassword() {
		getOtriosSignuppageHcpPassTxt().waitForPresent();
		getOtriosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getOtriosSignuppageHcpConfirmpassTxt().sendKeys("abcd1234");
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageHcpTermChk().click();
		JNJUtilsIOS.swipeWithCoordinates(476, 932, 443, 831, 10);
		getOtriosSignuppageHcpDoneBtn().verifyDisabled("Done button is disable when term check box not selected");
	}

	// method to enter detail for reset password screen for login user
	// Milan
	public void addresetPasswordDetailHCP(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		userBean.fillData(userDetails);
		getOtriosSignuppageHcpPassTxt().waitForPresent();
		getOtriosSignuppageHcpEmailTxt().clear();
		getOtriosSignuppageHcpEmailTxt().sendKeys(userBean.getEmailID());
		getOtriosSignuppageHcpPassTxt().sendKeys("abcd1234");
		getOtriosSignuppageHcpConfirmpassTxt().sendKeys("abcd1234");
		getOtriosSignuppageOnetouchIcon().click();
		Reporter.logWithScreenShot("After entering reset password details", MessageTypes.Pass);
		getOtriosSignuppageHcpTermChk().click();
		getOtriosSignuppageHcpDoneBtn().waitForEnabled();
		getOtriosSignuppageHcpDoneBtn().click();
		Reporter.logWithScreenShot("After clicking done button", MessageTypes.Pass);
	}

	// Method to click and verify terms and Privacy policy screen
	// milan
	public void clickAndVerifyTermAndPrivecy(String option) {

		option = option.toLowerCase();
		switch (option) {
		case "terms of use":
			getotriosSignupPageTermLnk().waitForPresent();
			getotriosSignupPageTermLnk().click();
			try {
				getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("appCommon.done")).waitForPresent(8000);
			} catch (Exception e) {

			}
			Reporter.logWithScreenShot("Terms of use screen 1", MessageTypes.Pass);
			JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			JNJUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Terms of use screen 2", MessageTypes.Pass);
			JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			JNJUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Terms of use screen 3", MessageTypes.Pass);
			break;
		case "privacy policy":

			getotriosSignupPagePrivecyLnk().waitForPresent();
			getotriosSignupPagePrivecyLnk().click();
			try {
				getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("appCommon.done")).waitForPresent(8000);
			} catch (Exception e) {

			}
			Reporter.logWithScreenShot("Privacy policy screen1", MessageTypes.Pass);

			JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			JNJUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Privacy policy screen2", MessageTypes.Pass);
			JNJUtilsIOS.swipeWithCoordinates(300, 1000, 443, 500, 50);
			JNJUtilsIOS.pause(2000);
			Reporter.logWithScreenShot("Privacy policy screen3", MessageTypes.Pass);
			break;
		}
	}

	public void selectUOM(String option) {
		// String alertMsg =
		// JNJUtilsAndroid.getPropString("alerts.uomDifference.title").toString();
		if (getOtriosSignuppageStaticlabel(ConfigurationManager.getBundle().getString("alerts.uomDifference.title"))
				.isDisplayed()) {
			Reporter.logWithScreenShot("Unit of measurement selection page for German Users", MessageTypes.Pass);
			option = option.toLowerCase();
			switch (option) {
			case "mg/dl":
				getOtriosGermansignuppageUomselectMgdlBtn().waitForPresent();
				getOtriosGermansignuppageUomselectMgdlBtn().click();
				break;

			case "mmol/l":
				getOtriosGermansignuppageUomselectMmolBtn().waitForPresent();
				getOtriosGermansignuppageUomselectMmolBtn().click();
				break;
			}
		} else
			Reporter.logWithScreenShot("UOM is already selected", MessageTypes.Pass);
	}

	public void verifyInvalidCharactersInFirstsNameandLastName() {
		getOtriosSignuppageFirstNameTxt().waitForPresent();
		getOtriosSignuppageFirstNameTxt().sendKeys("=<");
		getOtriosSignuppageOnetouchIcon().click();
		getotriosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
		getotriosSignupPageErrorCancelImg().waitForPresent();
		getotriosSignupPageErrorCancelImg().click();
		getOtriosSignuppageLastNameTxt().waitForPresent();
		getOtriosSignuppageLastNameTxt().sendKeys("=<");
		getOtriosSignuppageOnetouchIcon().click();
		getotriosSignupPageErrorMessageTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid Last name is displayed", MessageTypes.Pass);
		getotriosSignupPageErrorCancelImg().waitForPresent();
		getotriosSignupPageErrorCancelImg().click();
	}

	// Method to set year
	public void setYear() {
		int currentYear = Integer.parseInt(ConstantUtils.CURRENT_YEAR);
		int requiredYear = currentYear - 18;
		getOtriosSignuppageDateofbirthTbox().click();
		JNJUtilsIOS.selectTimePicker(getOtriosSignuppageTimingpickerYearPkr(), requiredYear);
		getOtriosSignuppageOnetouchIcon().click();
		getOtriosSignuppageStaticlabel(JNJUtilsIOS.getPropString("onboarding.ageRestriction.title"))
				.verifyNotVisible("Age restriction pop up");
	}

	//Create account button on sign up first page
	public void clicksOnCreateAccountButton() {
		getOtriosSignuppageSignupBtn().waitForEnabled();
		getOtriosSignuppageSignupBtn().click();

	}

	//method to verify touch ID option is available on the screen
	public void verifiesTouchIDOption() {
		getOtriosSignuppageEnabletouchidBtn().waitForPresent();
		getOtriosSignuppageEnabletouchidBtn().verifyPresent("Enable touch ID");
	}

	// Method to clicking authentication type
	// Milan
	public void clickOnAuthenticationTypeSignup(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			if (getOtriosSignuppageKeepmeloginBtn().getAttribute("value").contains("0"))
				getOtriosSignuppageKeepmeloginBtn().click();
			else {
				Reporter.logWithScreenShot("Keep me login switch is on", MessageTypes.Pass);
			}
			break;
		case "TOUCH ID":
			getOtriosSignuppageEnabletouchidBtn().click();
			break;

		case "REQUIRE LOGIN":
			Reporter.logWithScreenShot("Keep me login and Touch ID both are off", MessageTypes.Pass);
			break;
		}
		Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}

	public QAFWebElement getOtriosSignuppageStaticLbl() {
		return otriosSignuppageStaticLbl;
	}

}
