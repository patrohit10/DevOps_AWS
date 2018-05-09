package com.lemonade.version3.android.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.android.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

import io.appium.java_client.android.AndroidDriver;

public class SignupPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.signuppage.email.txt")
	private QAFWebElement otrSignuppageEmailTxt;
	@FindBy(locator = "otr.signuppage.confirmemail.txt")
	private QAFWebElement otrSignuppageConfirmemailTxt;
	@FindBy(locator = "otr.signuppage.password.txt")
	private QAFWebElement otrSignuppagePasswordTxt;
	@FindBy(locator = "otr.signuppage.signup.btn")
	private QAFWebElement otrSignuppageSignupBtn;
	@FindBy(locator = "otr.signuppage.termofservice.check.box")
	private QAFWebElement otrSignuppageTermofserviceCheckBox;
	@FindBy(locator = "otr.signuppage.onetouch.logo")
	private QAFWebElement otrSignuppageOnetouchLogo;
	@FindBy(locator = "otr.signuppage.back.btn")
	private QAFWebElement otrSignuppageBackBtn;
	@FindBy(locator = "otr.signuppage.login.lnk")
	private QAFWebElement otrSignuppageLoginLnk;
	@FindBy(locator = "otr.signuppage.termofservice.lnk")
	private QAFWebElement otrSignuppageTermofserviceLnk;
	@FindBy(locator = "otr.signuppage.skip.btn")
	private QAFWebElement otrSignuppageSkipBtn;
	@FindBy(locator = "otr.signuppage.importantMessage.txt")
	private QAFWebElement otrSignuppageImportantmessageTxt;
	@FindBy(locator = "otr.signuppage.importantMessageOk.btn")
	private QAFWebElement otrSignuppageImportantmessageokBtn;
	@FindBy(locator = "otr.signuppage.continueButton.btn")
	private QAFWebElement otrSignuppageContinuebuttonBtn;
	@FindBy(locator = "otr.signuppage.termsOfUse.txt")
	private QAFWebElement otrSignuppageTermsofuseTxt;
	@FindBy(locator = "otr.signuppage.termsAndPrivecy.txt")
	private QAFWebElement otrSignuppageTermsandprivecyTxt;
	@FindBy(locator = "otr.signuppage.firstname.txt")
	private QAFWebElement otrSignuppageFirstnameTxt;
	@FindBy(locator = "otr.signuppage.lastname.txt")
	private QAFWebElement otrSignuppageLastnameTxt;
	@FindBy(locator = "otr.signuppage.dob.txt")
	private QAFWebElement otrSignuppageDobTxt;
	@FindBy(locator = "otr.signuppage.confirmpassword.txt")
	private QAFWebElement otrSignuppageConfirmpasswordTxt;
	@FindBy(locator = "otr.signuppage.officecode.txt")
	private QAFWebElement otrSignuppageOfficecodeTxt;
	@FindBy(locator = "otr.signuppage.promotionalcode.chkbox")
	private QAFWebElement otrSignuppagePromotionalcodeChkbox;
	@FindBy(locator = "otr.signuppage.keepmeloggedin.chkbox")
	private QAFWebElement otrSignuppageKeepmeloggedinChkbox;
	@FindBy(locator = "otr.signuppage.calendar.year.btn")
	private QAFWebElement otrSignupPageCalendarYearBtn;
	@FindBy(locator = "otr.signuppage.calendar.next.btn")
	private QAFWebElement otrSignupPageCalendarNextBtn;
	@FindBy(locator = "otr.signuppage.calendar.previous.btn")
	private QAFWebElement otrSignupPageCalendarPreviousBtn;
	@FindBy(locator = "otr.email.validation.error.msg")
	private QAFWebElement otrEmailValidationErrorMsg;
	@FindBy(locator = "otr.confirm.email.validation.error.msg")
	private QAFWebElement otrConfirmEmailValidationErrorMsg;
	@FindBy(locator = "otr.password.validation.error.msg")
	private QAFWebElement otrPasswordValidationErrorMsg;
	@FindBy(locator = "otr.signuppage.clinic.code.txt")
	private QAFWebElement otrSignuppageClinicCodeTxt;
	@FindBy(locator="otr.signuppage.firstNameError.txt")
	private QAFWebElement otrSignuppageFirstNameErrorTxt;
	@FindBy(locator="otr.signuppage.lastNameError.txt")
	private QAFWebElement otrSignuppageLastNameErrorTxt;
	
	@FindBy(locator="otr.signuppage.touchID.btn")
	private QAFWebElement otrSignuppageTouchIDBtn;
	
	public QAFWebElement getOotrSignuppageTouchIDBtn() {
		return otrSignuppageTouchIDBtn;
	}
	public QAFWebElement getOtrHcpsignuppageResetpasswordLbl() {
		return otrHcpsignuppageResetpasswordLbl;
	}

	public QAFWebElement getOtrSignupPageCalendarYearBtn() {
		return otrSignupPageCalendarYearBtn;
	}

	public QAFWebElement getOtrSignupPageCalendarNextBtn() {
		return otrSignupPageCalendarNextBtn;
	}

	public QAFWebElement getOtrSignupPageCalendarPreviousBtn() {
		return otrSignupPageCalendarPreviousBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrsignuppageemailtxt() {
		return otrSignuppageEmailTxt;
	}

	public QAFWebElement getOtrsignuppageconfirmemailtxt() {
		return otrSignuppageConfirmemailTxt;
	}

	public QAFWebElement getOtrsignuppagepasswordtxt() {
		return otrSignuppagePasswordTxt;
	}

	public QAFWebElement getOtrsignuppagesignupbtn() {
		return otrSignuppageSignupBtn;
	}

	public QAFWebElement getOtrsignuppagetermofservicecheckbox() {
		return otrSignuppageTermofserviceCheckBox;
	}

	public QAFWebElement getOtrsignuppageonetouchlogo() {
		return otrSignuppageOnetouchLogo;
	}

	public QAFWebElement getOtrsignuppagebackbtn() {
		return otrSignuppageBackBtn;
	}

	public QAFWebElement getOtrsignuppageloginlnk() {
		return otrSignuppageLoginLnk;
	}

	public QAFWebElement getOtrsignuppagetermofservicelnk() {
		return otrSignuppageTermofserviceLnk;
	}

	public QAFWebElement getOtrsignuppageskipbtn() {
		return otrSignuppageSkipBtn;
	}

	public QAFWebElement getOtrsignuppageimportantmessagetxt() {
		return otrSignuppageImportantmessageTxt;
	}

	public QAFWebElement getOtrsignuppageimportantmessageokbtn() {
		return otrSignuppageImportantmessageokBtn;
	}

	public QAFWebElement getOtrsignuppagecontinuebuttonbtn() {
		return otrSignuppageContinuebuttonBtn;
	}

	public QAFWebElement getOtrsignuppagetermsofusetxt() {
		return otrSignuppageTermsofuseTxt;
	}

	public QAFWebElement getOtrsignuppagetermsandprivecytxt() {
		return otrSignuppageTermsandprivecyTxt;
	}

	public QAFWebElement getOtrsignuppagefirstnametxt() {
		return otrSignuppageFirstnameTxt;
	}

	public QAFWebElement getOtrsignuppagelastnametxt() {
		return otrSignuppageLastnameTxt;
	}

	public QAFWebElement getOtrsignuppagedobtxt() {
		return otrSignuppageDobTxt;
	}

	public QAFWebElement getOtrsignuppageconfirmpasswordtxt() {
		return otrSignuppageConfirmpasswordTxt;
	}

	public QAFWebElement getOtrsignuppageofficecodetxt() {
		return otrSignuppageOfficecodeTxt;
	}

	public QAFWebElement getOtrsignuppagepromotionalcodechkbox() {
		return otrSignuppagePromotionalcodeChkbox;
	}

	public QAFWebElement getOtrsignuppagekeepmeloggedinchkbox() {
		return otrSignuppageKeepmeloggedinChkbox;
	}

	public QAFWebElement getOtrSignuppageTimeStaticText(String text) {
		return JNJUtilsAndroid.getElement("otr.signuppage.dynamic.txt", text);
	}

	public QAFWebElement getOtrSignuppageDynamicTxt() {
		return otrSignuppageDynamicTxt;
	}

	public QAFWebElement getOtrSignuppageIagreeBtn() {
		return otrSignuppageIagreeBtn;
	}

	public QAFWebElement getOtrSignuppageCancelBtn() {
		return otrSignuppageCancelBtn;
	}

	public QAFWebElement getOtrEmailValidationErrorMsg() {
		return otrEmailValidationErrorMsg;
	}

	public QAFWebElement getotrConfirmEmailValidationErrorMsg() {
		return otrConfirmEmailValidationErrorMsg;
	}

	public QAFWebElement getotrPasswordValidationErrorMsg() {
		return otrPasswordValidationErrorMsg;
	}

	public QAFWebElement getotrSignuppageClinicCodeTxt() {
		return otrSignuppageClinicCodeTxt;
	}

	public QAFWebElement getotrSignuppageFirstNameErrorTxt() {
		return otrSignuppageFirstNameErrorTxt;
	}
	
	public QAFWebElement getotrSignuppageLastNameErrorTxt() {
		return otrSignuppageLastNameErrorTxt;
	}
	
	
	private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
	@FindBy(locator = "otr.signuppage.dynamic.txt")
	private QAFWebElement otrSignuppageDynamicTxt;
	@FindBy(locator = "otr.signuppage.iagree.btn")
	private QAFWebElement otrSignuppageIagreeBtn;
	@FindBy(locator = "otr.signuppage.cancel.btn")
	private QAFWebElement otrSignuppageCancelBtn;
	@FindBy(locator = "otr.hcpsignuppage.resetpassword.lbl")
	private QAFWebElement otrHcpsignuppageResetpasswordLbl;
	@FindBy(locator = "otr.germansignuppage.uomselect.mgdl.btn")
	private QAFWebElement otrGermansignuppageUomselectMgdlBtn;
	@FindBy(locator = "otr.germansignuppage.uomselect.mmol.btn")
	private QAFWebElement otrGermansignuppageUomselectMmolBtn;

	public QAFWebElement getOtrGermansignuppageUomselectMgdlBtn() {
		return otrGermansignuppageUomselectMgdlBtn;
	}

	public QAFWebElement getOtrGermansignuppageUomselectMmolBtn() {
		return otrGermansignuppageUomselectMmolBtn;
	}
	
	HomePageAndroid homePage= new  HomePageAndroid();
	LoginPageAndroid android = new LoginPageAndroid();
	public AndroidDriver getDriver() {
		// return (AndroidDriver)new
		// WebDriverTestCase().getDriver().getUnderLayingDriver();
		return androidDriver;
	}

	// Method to click Sign Up button
	public void clickSignUpButton() {

		getOtrsignuppagesignupbtn().waitForPresent();
		getOtrsignuppagesignupbtn().click();
		// 12/20 SG - adding to handle popup after clicking sign up button
		getOtrsignuppageimportantmessagetxt().waitForPresent();
		getOtrsignuppageimportantmessageokbtn().click();
		try {
			android.getOtrLoginpageLocationaccessAllowBtn().waitForPresent(5000);
			android.getOtrLoginpageLocationaccessAllowBtn().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Reporter.logWithScreenShot("Meter Page is displayed", MessageTypes.Pass);

	}

	// Method to click on skip button
	public void clickSkipBtn() {
		getOtrsignuppageskipbtn().waitForPresent();
		Reporter.logWithScreenShot("User Successfully Logged in", MessageTypes.Pass);
		getOtrsignuppageskipbtn().click();
		JNJUtilsAndroid.waitforLoad();
		selectUOM("mmol/L");
		homePage.getOtrHomepageShareBtn().waitForPresent();
		Reporter.logWithScreenShot("Home Page is Displayed", MessageTypes.Pass);
	}

	// Method to select UOM for German user
	public void selectUOM(String option) {
		//String alertMsg = JNJUtilsAndroid.getPropString("alerts.uomDifference.title").toString();
		try {
			if (getOtrSignuppageTimeStaticText(ConfigurationManager.getBundle().getString("alerts.uomDifference.title")).isDisplayed()) {
				Reporter.logWithScreenShot("Unit of measurement selection page for German Users", MessageTypes.Pass);
				option = option.toLowerCase();
				switch (option) {
				case "mg/dl":
					getOtrGermansignuppageUomselectMgdlBtn().waitForPresent();
					getOtrGermansignuppageUomselectMgdlBtn().click();
					break;

				case "mmol/l":
					getOtrGermansignuppageUomselectMmolBtn().waitForPresent();
					getOtrGermansignuppageUomselectMmolBtn().click();
					break;
				}
			} else
				Reporter.logWithScreenShot("UOM is already selected", MessageTypes.Pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Method to click TOU and PP link from SignUp page
	public void clickTerms(String option) {
		int fingers = 1;
		int duration = 1;
		getOtrsignuppagetermofservicecheckbox().waitForPresent();

		Point p1 = getOtrsignuppagetermsandprivecytxt().getLocation();
		Dimension d1 = getOtrsignuppagetermsandprivecytxt().getSize();

		int startX = p1.getX();
		int startY = p1.getY();
		int endX = startX + d1.getWidth();
		int perline = d1.getHeight() / 2;
		int middleX = startX + (d1.getWidth()) / 2;

		option = option.toLowerCase();
		switch (option) {
		case "terms of use":
			System.out.println("............" + (endX - 50) + (startY + 10));
			androidDriver.tap(fingers, endX - 50, startY + 10, duration);

			getOtrsignuppagetermsofusetxt().waitForPresent();
			Reporter.logWithScreenShot("Terms of use Page 1 is Displayed", MessageTypes.Pass);
			JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 2 is Displayed", MessageTypes.Pass);
			JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 3 is Displayed", MessageTypes.Pass);
			JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Terms of use Page 4 is Displayed", MessageTypes.Pass);

			break;
		case "privacy policy":

			// androidDriver.tap(fingers, middleX-20, startY + 50, duration);
			androidDriver.tap(fingers, startX + 200, startY + 5 + perline, duration);
			System.out.println(startX + 200);
			System.out.println(startY + 50);

			getOtrsignuppagetermsofusetxt().waitForPresent();
			Reporter.logWithScreenShot("Privacy Policy Page 1 is Displayed", MessageTypes.Pass);
			JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Privacy Policy Page 2 is Displayed", MessageTypes.Pass);
			JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Privacy Policy Page 3 is Displayed", MessageTypes.Pass);
			JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Privacy Policy Page 4 is Displayed", MessageTypes.Pass);
			System.out.println("..............Privacy Policy.............");
			break;
		}

		JNJUtilsAndroid.clickBackButton();
		getOtrsignuppagetermofservicecheckbox().waitForPresent();
		getOtrsignuppagetermofservicecheckbox().verifyPresent("After clicking back button,Signup screen is displayed");

	}

	// Method to select Birthdate of User
	public void selectBirthDate(UserDetailBeans userDetails) {
		if (getOtrSignupPageCalendarYearBtn().isDisplayed())
			getOtrSignupPageCalendarYearBtn().click();
		getOtrSignuppageTimeStaticText("2016").waitForPresent();

		Point p1 = getOtrSignuppageTimeStaticText("2016").getLocation();
		int startX = p1.getX();
		int startY = p1.getY();

		while (!getOtrSignuppageTimeStaticText(userDetails.getBirthdayYear()).isPresent()) {
			androidDriver.swipe(startX + 10, startY - 300, startX + 10, startY, 500);
		}

		getOtrSignuppageTimeStaticText(userDetails.getBirthdayYear()).click();

		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "01");
		monthmap.put("Feb", "02");
		monthmap.put("Mar", "03");
		monthmap.put("Apr", "04");
		monthmap.put("May", "05");
		monthmap.put("Jun", "06");
		monthmap.put("Jul", "07");
		monthmap.put("Aug", "08");
		monthmap.put("Sep", "09");
		monthmap.put("Oct", "10");
		monthmap.put("Nov", "11");
		monthmap.put("Dec", "12");

		DateFormat df = new SimpleDateFormat("MM");
		Date dateobj = new Date();

		int curMonth = Integer.parseInt(df.format(dateobj));
		System.out.println("Cur month " + curMonth);
		System.out.println(userDetails.getBirthdayMonth().substring(0, 2));
		// int birthMonth =
		// Integer.parseInt(monthmap.get(userDetails.getBirthdayMonth().substring(0,
		// 2)));
		int birthMonth = Integer.parseInt(monthmap.get("Feb"));
		System.out.println("BirthMonth " + birthMonth);
		// String brithmonth = data.getString("birthmonth");
		try {
			// System.out.println();
			if (birthMonth > curMonth) {
				int count = birthMonth - curMonth;
				System.out.println(count);
				while (count != 0) {
					getOtrSignupPageCalendarNextBtn().click();
					count--;
					// System.out.println(count);
				}
			} else if (curMonth > birthMonth) {
				int count = curMonth - birthMonth;

				while (count != 0) {
					getOtrSignupPageCalendarPreviousBtn().click();
					count--;
				}
			} else {
				System.out.println("continue next codes");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// click on date
		getOtrSignuppageTimeStaticText(userDetails.getBirthdayDate()).click();

	}

	// Method to select Birthdate of User
	public void selectBirthDateBelowAge(UserDetailBeans userDetails) {
		if (getOtrSignupPageCalendarYearBtn().isDisplayed())
			getOtrSignupPageCalendarYearBtn().click();
		getOtrSignuppageTimeStaticText("2016").waitForPresent();

		Point p1 = getOtrSignuppageTimeStaticText("2016").getLocation();
		int startX = p1.getX();
		int startY = p1.getY();

		while (!getOtrSignuppageTimeStaticText(userDetails.getBirthdayYear()).isPresent()) {
			androidDriver.swipe(startX + 10, startY - 300, startX + 10, startY, 500);
		}

		getOtrSignuppageTimeStaticText(userDetails.getBirthdayYear()).click();

		HashMap<String, String> monthmap = new HashMap<String, String>();
		monthmap.put("Jan", "01");
		monthmap.put("Feb", "02");
		monthmap.put("Mar", "03");
		monthmap.put("Apr", "04");
		monthmap.put("May", "05");
		monthmap.put("Jun", "06");
		monthmap.put("Jul", "07");
		monthmap.put("Aug", "08");
		monthmap.put("Sep", "09");
		monthmap.put("Oct", "10");
		monthmap.put("Nov", "11");
		monthmap.put("Dec", "12");

		DateFormat df = new SimpleDateFormat("MM");
		Date dateobj = new Date();

		int curMonth = Integer.parseInt(df.format(dateobj));
		System.out.println("Cur month " + curMonth);
		System.out.println(userDetails.getBirthdayMonth().substring(0, 2));
		int birthMonth = Integer.parseInt(monthmap.get("Feb"));
		System.out.println("BirthMonth " + birthMonth);
		try {
			if (birthMonth > curMonth) {
				int count = birthMonth - curMonth;
				System.out.println(count);
				while (count != 0) {
					getOtrSignupPageCalendarNextBtn().click();
					count--;
					// System.out.println(count);
				}
			} else if (curMonth > birthMonth) {
				int count = curMonth - birthMonth;

				while (count != 0) {
					getOtrSignupPageCalendarPreviousBtn().click();
					count--;
				}
			} else {
				System.out.println("continue next codes");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// click on date
		getOtrSignuppageTimeStaticText(userDetails.getBirthdayDate()).click();
		getOtrsignuppageimportantmessageokbtn().click();
		getOtrsignuppageonetouchlogo().click();
		Reporter.logWithScreenShot("Error message for date less than 18 years", MessageTypes.Pass);
		getOtrsignuppageimportantmessageokbtn().click();
		JNJUtilsAndroid.waitforLoad();
	}

	// Method to fill registration details for New User
	public void fillSignUpDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		String email = RandomStringUtils.randomAlphabetic(12) + RandomStringUtils.randomNumeric(4) + "@gmail.com";
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getOtrsignuppagefirstnametxt().clear();
		getOtrsignuppagefirstnametxt().sendKeys(userBean.getFirstName());
		getOtrsignuppagelastnametxt().clear();
		getOtrsignuppagelastnametxt().sendKeys(userBean.getLastName());
		JNJUtilsAndroid.waitforLoad();
		getOtrsignuppagedobtxt().click();
		getOtrsignuppagedobtxt().click();
		JNJUtilsAndroid.waitforLoad();
		selectBirthDate(userBean);
		getOtrsignuppageimportantmessageokbtn().click();
		getOtrsignuppagetermofservicecheckbox().waitForPresent();
		getOtrsignuppagetermofservicecheckbox().click();
		getOtrsignuppagecontinuebuttonbtn().waitForEnabled();
		Reporter.logWithScreenShot("After Continue button is enabled", MessageTypes.Pass);
		getOtrsignuppagecontinuebuttonbtn().click();
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(email);
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys(email);
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		getOtrsignuppageconfirmpasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Complete form", MessageTypes.Pass);
		getOtrsignuppageonetouchlogo().click();

	}

	// Method to fill Signup details with First name field as blank
	public void doSignUpWithoutFirstName(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getOtrsignuppagefirstnametxt().clear();
		getOtrsignuppagelastnametxt().clear();
		getOtrsignuppagelastnametxt().sendKeys(userBean.getLastName());
		Reporter.logWithScreenShot("After Filling last name", MessageTypes.Pass);
		JNJUtilsAndroid.waitforLoad();
		getOtrsignuppagedobtxt().click();
		getOtrsignuppagedobtxt().click();
		JNJUtilsAndroid.waitforLoad();
		selectBirthDate(userBean);
		Reporter.logWithScreenShot("After Selecting Birth date", MessageTypes.Pass);
		getOtrsignuppageimportantmessageokbtn().click();
		Reporter.logWithScreenShot("Before checking service check box", MessageTypes.Pass);
		getOtrsignuppagetermofservicecheckbox().waitForPresent();
		getOtrsignuppagetermofservicecheckbox().click();
		Reporter.logWithScreenShot("After checking service check box", MessageTypes.Pass);
		getOtrsignuppagecontinuebuttonbtn().waitForEnabled();
		Reporter.logWithScreenShot("After Continue button is enabled", MessageTypes.Pass);
		getOtrsignuppagecontinuebuttonbtn().click();
		Reporter.logWithScreenShot("Error message with First Name field as Blank", MessageTypes.Pass);
	}

	// Method to fill Signup details with Last name field as blank
	public void doSignUpWithoutLastName(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getOtrsignuppagefirstnametxt().clear();
		getOtrsignuppagefirstnametxt().sendKeys(userBean.getFirstName());
		Reporter.logWithScreenShot("After Filling first name", MessageTypes.Pass);
		getOtrsignuppagelastnametxt().clear();
		JNJUtilsAndroid.waitforLoad();
		getOtrsignuppagedobtxt().click();
		getOtrsignuppagedobtxt().click();
		JNJUtilsAndroid.waitforLoad();
		selectBirthDate(userBean);
		Reporter.logWithScreenShot("After Selecting Birth date", MessageTypes.Pass);
		getOtrsignuppageimportantmessageokbtn().click();
		Reporter.logWithScreenShot("Before checking service check box", MessageTypes.Pass);
		getOtrsignuppagetermofservicecheckbox().waitForPresent();
		getOtrsignuppagetermofservicecheckbox().click();
		Reporter.logWithScreenShot("After checking service check box", MessageTypes.Pass);
		getOtrsignuppagecontinuebuttonbtn().waitForEnabled();
		Reporter.logWithScreenShot("After Continue button is enabled", MessageTypes.Pass);
		getOtrsignuppagecontinuebuttonbtn().click();
		Reporter.logWithScreenShot("Error message with Last Name field as Blank", MessageTypes.Pass);
	}

	// Method to fill Signup details with Birthdate below age
	public void doSignUpWithDateBelowAge(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getOtrsignuppagefirstnametxt().clear();
		getOtrsignuppagefirstnametxt().sendKeys(userBean.getFirstName());
		Reporter.logWithScreenShot("After Filling first name", MessageTypes.Pass);
		getOtrsignuppagelastnametxt().clear();
		getOtrsignuppagelastnametxt().sendKeys(userBean.getLastName());
		Reporter.logWithScreenShot("After Filling last name", MessageTypes.Pass);
		JNJUtilsAndroid.waitforLoad();
		getOtrsignuppagedobtxt().click();
		getOtrsignuppagedobtxt().click();
		Reporter.logWithScreenShot("Calendar is displayed", MessageTypes.Pass);
		getOtrsignuppageimportantmessageokbtn().click();
		getOtrsignuppageimportantmessageokbtn().waitForPresent();
		Reporter.logWithScreenShot("Error message with Birthdate field below age", MessageTypes.Pass);
		getOtrsignuppageimportantmessageokbtn().click();
		JNJUtilsAndroid.waitforLoad();
	}

	// Method to fill Signup details without Birthdate
	public void fillDetailsWithoutBirthday(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getOtrsignuppagefirstnametxt().clear();
		getOtrsignuppagefirstnametxt().sendKeys(userBean.getFirstName());
		Reporter.logWithScreenShot("After Filling first name", MessageTypes.Pass);
		getOtrsignuppagelastnametxt().clear();
		getOtrsignuppagelastnametxt().sendKeys(userBean.getLastName());
		Reporter.logWithScreenShot("After Filling last name", MessageTypes.Pass);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Before checking service check box", MessageTypes.Pass);
		getOtrsignuppagetermofservicecheckbox().waitForPresent();
		getOtrsignuppagetermofservicecheckbox().click();
		Reporter.logWithScreenShot("After checking service check box", MessageTypes.Pass);

		if (getOtrsignuppagecontinuebuttonbtn().isEnabled()) {
			Reporter.logWithScreenShot("After Continue button is enabled", MessageTypes.Pass);
			getOtrsignuppagecontinuebuttonbtn().click();
		} else
			Reporter.logWithScreenShot("Signup button is disabled as Date of Birth is not selected", MessageTypes.Pass);
	}

	// Method to fill registration details for New User without checkbox checked
	public void fillSignUpDetailsWithoutChckbox(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getOtrsignuppagefirstnametxt().clear();
		getOtrsignuppagefirstnametxt().sendKeys(userBean.getFirstName());
		Reporter.logWithScreenShot("After Filling first name", MessageTypes.Pass);
		getOtrsignuppagelastnametxt().clear();
		getOtrsignuppagelastnametxt().sendKeys(userBean.getLastName());
		Reporter.logWithScreenShot("After Filling last name", MessageTypes.Pass);
		JNJUtilsAndroid.waitforLoad();
		getOtrsignuppagedobtxt().click();
		getOtrsignuppagedobtxt().click();
		JNJUtilsAndroid.waitforLoad();
		selectBirthDate(userBean);
		Reporter.logWithScreenShot("After Selecting Birth date", MessageTypes.Pass);
		getOtrsignuppageimportantmessageokbtn().click();
		Reporter.logWithScreenShot("Before checking service check box", MessageTypes.Pass);
		if (getOtrsignuppagecontinuebuttonbtn().isEnabled()) {
			Reporter.logWithScreenShot("After Continue button is enabled", MessageTypes.Pass);
			getOtrsignuppagecontinuebuttonbtn().click();
		} else
			Reporter.logWithScreenShot("I agree checkbox is not checked", MessageTypes.Pass);

	}

	// Method to fill first page details
	public void fillFirstPageDetails(Object userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		Reporter.logWithScreenShot("Before Filling Details", MessageTypes.Pass);
		getOtrsignuppagefirstnametxt().clear();
		getOtrsignuppagefirstnametxt().sendKeys(userBean.getFirstName());
		Reporter.logWithScreenShot("After Filling first name", MessageTypes.Pass);
		getOtrsignuppagelastnametxt().clear();
		getOtrsignuppagelastnametxt().sendKeys(userBean.getLastName());
		Reporter.logWithScreenShot("After Filling last name", MessageTypes.Pass);
		JNJUtilsAndroid.waitforLoad();
		getOtrsignuppagedobtxt().click();
		getOtrsignuppagedobtxt().click();
		JNJUtilsAndroid.waitforLoad();
		selectBirthDate(userBean);
		Reporter.logWithScreenShot("After Selecting Birth date", MessageTypes.Pass);
		getOtrsignuppageimportantmessageokbtn().click();
		Reporter.logWithScreenShot("Before checking service check box", MessageTypes.Pass);
		getOtrsignuppagetermofservicecheckbox().waitForPresent();
		getOtrsignuppagetermofservicecheckbox().click();
		Reporter.logWithScreenShot("After checking service check box", MessageTypes.Pass);
		getOtrsignuppagecontinuebuttonbtn().waitForEnabled();
		Reporter.logWithScreenShot("After Continue button is enabled", MessageTypes.Pass);
		getOtrsignuppagecontinuebuttonbtn().click();
	}

	// Method to fill details without email id
	public void fillRandomSignUpDetailsWithoutEmail(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		Reporter.logWithScreenShot("Error message with blank email id", MessageTypes.Pass);
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password", MessageTypes.Pass);
		getOtrsignuppageconfirmpasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Confirm password", MessageTypes.Pass);
		if (getOtrsignuppagesignupbtn().isEnabled()) {
			getOtrsignuppagesignupbtn().click();
			Reporter.logWithScreenShot("Error message for empty email text field", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Email text field is blank and thus signup button is disabled",
					MessageTypes.Pass);
	}

	// Method to verify invalid email ids entered
	public void fillDetailsWithInvalidEmails(Object userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys("abcd.gmail.com");
		getOtrsignuppageconfirmemailtxt().click();

		if (getOtrEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("@ is not present", MessageTypes.Pass);
		}

		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys("abcd@.com");
		getOtrsignuppageconfirmemailtxt().click();

		if (getOtrEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Mail domain name is not entered", MessageTypes.Pass);
		}

		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys("abcd@gmail");
		getOtrsignuppageconfirmemailtxt().click();

		if (getOtrEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot(".com/.co.in is not entered", MessageTypes.Pass);
		}

		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys("@.gmail.com");
		getOtrsignuppageconfirmemailtxt().click();

		if (getOtrEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Prefix name is not entered", MessageTypes.Pass);
		}

		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(RandomStringUtils.randomAlphanumeric(70) + "@gmail.com");
		getOtrsignuppageconfirmemailtxt().click();
		if (getOtrEmailValidationErrorMsg().getText().contains("Invalid")) {
			Reporter.logWithScreenShot("Email length exceeds the limit", MessageTypes.Pass);
		}
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(RandomStringUtils.randomAlphanumeric(65) + "@gmail.com");
		getOtrsignuppageconfirmemailtxt().click();
		if (!(getOtrEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email length is within the limit", MessageTypes.Pass);
		}

		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getOtrsignuppageconfirmemailtxt().click();
		if (!(getOtrEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email id is valid", MessageTypes.Pass);
		}

	}

	// Method to verify email validations
	public void emailValidations(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys("abcd@gmail.com");
		getOtrsignuppagepasswordtxt().click();

		if (getotrConfirmEmailValidationErrorMsg().isPresent()
				&& getotrConfirmEmailValidationErrorMsg().getText().contains("match")) {
			Reporter.logWithScreenShot("Email and confirm email fields do not match", MessageTypes.Pass);
		}
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		getOtrsignuppagepasswordtxt().click();

		if (!(getotrConfirmEmailValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Email and Confirm email fields matched", MessageTypes.Pass);
		}

	}

	// Method to enter signup details without password
	public void noPasswordToFill(String userDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		if (getOtrsignuppagesignupbtn().isEnabled())
			Reporter.logWithScreenShot("All details are filled", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Error message with blank password field", MessageTypes.Pass);
	}

	// Method to enter signup details with invalid password
	public void invalidPasswordEntry(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys("abcd1");
		getOtrsignuppageconfirmpasswordtxt().click();

		if (getotrPasswordValidationErrorMsg().isPresent()
				&& getotrPasswordValidationErrorMsg().getText().contains("Passwords")) {
			Reporter.logWithScreenShot("Password field should contains min 6 alphanumeric values", MessageTypes.Pass);
		}

		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys("abcdefg@123456789");
		getOtrsignuppageconfirmpasswordtxt().click();

		if (getotrPasswordValidationErrorMsg().isPresent()
				&& getotrPasswordValidationErrorMsg().getText().contains("Passwords")) {
			Reporter.logWithScreenShot("Password field should contains max 16 aplhanumeric values", MessageTypes.Pass);
		}

		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys("abcd@1234");
		getOtrsignuppageconfirmpasswordtxt().click();

		if (!(getotrPasswordValidationErrorMsg().isPresent())) {
			Reporter.logWithScreenShot("Valid password field is entered", MessageTypes.Pass);
		}
	}

	// Method to verify already exist mail id flow
	public void repeatedMailIdSignupFlow(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys("sgunthe1@its.jnj.com");
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys("sgunthe1@its.jnj.com");
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password field", MessageTypes.Pass);
		getOtrsignuppageconfirmpasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Confirm Password", MessageTypes.Pass);
		getOtrsignuppagesignupbtn().waitForEnabled();
		getOtrsignuppagesignupbtn().click();
		Reporter.logWithScreenShot("User is not able to create account using existing mail id", MessageTypes.Pass);
	}

	// Sign up method with invalid clinic code
	public void signUpDetailsWithInvalidClinicCode(String userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}

		fillFirstPageDetails(userDetails);
		Reporter.logWithScreenShot("Next Page form to fill", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Email Id", MessageTypes.Pass);
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys(userBean.getEmailID());
		Reporter.logWithScreenShot("After Filling Confirm email", MessageTypes.Pass);
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Password", MessageTypes.Pass);
		getOtrsignuppageconfirmpasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
		Reporter.logWithScreenShot("After Filling Confirm password", MessageTypes.Pass);
		getotrSignuppageClinicCodeTxt().sendKeys("");// Send here invalid clinic
														// code. Currently not
														// clear on invalid
														// clinic code so left
														// blank
		Reporter.logWithScreenShot("After Filling Invalid clinic code", MessageTypes.Pass);
		getOtrsignuppageonetouchlogo().click();

	}

	// Method to select optIn option
	public void selectionOfOptin(String option) {

		getOtrsignuppagepromotionalcodechkbox().waitForPresent();

		Point p1 = getOtrsignuppagepromotionalcodechkbox().getLocation();
		Dimension d1 = getOtrsignuppagepromotionalcodechkbox().getSize();

		int startX = p1.getX();
		int startY = p1.getY();
		int pointX = startX + d1.getWidth() / 2;
		int pointY = startY + d1.getHeight() / 2;
		androidDriver.tap(1, pointX, pointY, 1000);
		Reporter.logWithScreenShot("After checking promotional check box", MessageTypes.Pass);
		getOtrSignuppageIagreeBtn().waitForPresent();
		if (option.equalsIgnoreCase("I Agree")) {
			getOtrSignuppageIagreeBtn().click();
			Reporter.logWithScreenShot("User is agree to receive diabetes related information", MessageTypes.Pass);
		} else if (option.equalsIgnoreCase("Cancel")) {
			getOtrSignuppageCancelBtn().click();
			Reporter.logWithScreenShot("User is not agree to receive diabetes related information", MessageTypes.Pass);
		}
	}

	public void signupsecondPageScreen(Object signupDetails) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (signupDetails instanceof String) {

			userBean.fillFromConfig((String) signupDetails);
		} else {
			userBean.fillData(signupDetails);
		}
		fillFirstPageDetails(signupDetails);

		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys("tes1123@gmail");
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys("tes@gmail.com");
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys("abcd");
		getOtrsignuppageconfirmpasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().sendKeys("abcd1234");

		getOtrsignuppageonetouchlogo().click();
		Reporter.logWithScreenShot("filled sign up details", MessageTypes.Pass);

		String email = RandomStringUtils.randomAlphabetic(6) + "@gmail.com";
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(email);
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().clear();
		getOtrsignuppageconfirmemailtxt().sendKeys(email);
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().clear();
		getOtrsignuppagepasswordtxt().sendKeys("Sangram@55");
		getOtrsignuppageconfirmpasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().clear();
		getOtrsignuppageconfirmpasswordtxt().sendKeys("Sangram@55");

		getOtrsignuppageonetouchlogo().click();

		getOtrsignuppagesignupbtn().waitForEnabled();
		JNJUtilsAndroid.swipeWithCoordinates(476, 932, 443, 831, 10);
		Reporter.logWithScreenShot("Signup button is present", MessageTypes.Pass);

	}

	public void fillHCPDetails(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);
		}
		if (getOtrHcpsignuppageResetpasswordLbl().isPresent()) {
			Reporter.logWithScreenShot("Reset Password page for new HCP user", MessageTypes.Pass);
			if (getOtrsignuppageemailtxt().isEnabled()) {
				getOtrsignuppageemailtxt().clear();
				getOtrsignuppageemailtxt().sendKeys("aaaa.com");
				getOtrHcpsignuppageResetpasswordLbl().click();
				Reporter.logWithScreenShot("Email id is invalid", MessageTypes.Pass);
				getOtrsignuppageemailtxt().clear();
				String typeName = RandomStringUtils.randomAlphanumeric(76);
				getOtrsignuppageemailtxt().sendKeys(typeName);
				Validator.verifyThat("Hcp reset page email field charcter length",
						getOtrsignuppageemailtxt().getAttribute("value").length(), Matchers.lessThanOrEqualTo(75));
				getOtrsignuppageemailtxt().clear();
				getOtrsignuppageemailtxt().clear();
				getOtrsignuppageemailtxt().sendKeys(userBean.getEmailID());
			} else
				Reporter.logWithScreenShot("Email id already entered", MessageTypes.Pass);

			getOtrsignuppagepasswordtxt().clear();
			getOtrsignuppagepasswordtxt().sendKeys("aaaa");
			getOtrHcpsignuppageResetpasswordLbl().click();
			Reporter.logWithScreenShot("invalid Password", MessageTypes.Pass);
			getOtrsignuppagepasswordtxt().clear();
			String typeName = RandomStringUtils.randomAlphanumeric(17);
			getOtrsignuppagepasswordtxt().sendKeys(typeName);
			Validator.verifyThat("Hcp reset page password field charcter length",
					getOtrsignuppagepasswordtxt().getAttribute("value").length(), Matchers.lessThanOrEqualTo(16));
			getOtrsignuppagepasswordtxt().clear();
			getOtrsignuppagepasswordtxt().sendKeys(userBean.getPassword());
			getOtrsignuppageconfirmpasswordtxt().clear();
			getOtrsignuppageconfirmpasswordtxt().sendKeys("abcd!1234");
			getOtrsignuppagedobtxt().click();
			Reporter.logWithScreenShot("Password and Confirm password field does not match error", MessageTypes.Pass);
			getOtrsignuppageconfirmpasswordtxt().clear();
			getOtrsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());
			if (getOtrsignuppagesignupbtn().isEnabled()) {
				Reporter.logWithScreenShot("All details are filled", MessageTypes.Pass);
				getOtrsignuppagesignupbtn().click();
			} else
				Reporter.logWithScreenShot("I agree checkbox is not checked", MessageTypes.Pass);
		}
		getOtrsignuppagetermofservicecheckbox().click();
		if (getOtrsignuppagesignupbtn().isEnabled()) {
			Reporter.logWithScreenShot("Done button is enabled", MessageTypes.Pass);
			// getOtrsignuppagesignupbtn().click();
		}

	}

	// Method to verify blank email field for HCP user
	public void verifyBlankMail(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetails instanceof String) {

			userBean.fillFromConfig((String) userDetails);
		} else {
			userBean.fillData(userDetails);

		}
		if (getOtrHcpsignuppageResetpasswordLbl().isPresent()) {
			Reporter.logWithScreenShot("Reset Password page for new HCp user", MessageTypes.Pass);
			if (getOtrsignuppageemailtxt().isEnabled()) {
				getOtrsignuppageemailtxt().clear();

			} else
				Reporter.logWithScreenShot("Email id already entered", MessageTypes.Pass);

			getOtrsignuppagepasswordtxt().clear();
			getOtrsignuppagepasswordtxt().sendKeys(userBean.getPassword());
			getOtrsignuppageconfirmpasswordtxt().clear();
			getOtrsignuppageconfirmpasswordtxt().sendKeys(userBean.getPassword());

			getOtrsignuppagetermofservicecheckbox().click();
			if (getOtrsignuppagesignupbtn().isEnabled()) {
				Reporter.logWithScreenShot("Done button is enabled", MessageTypes.Pass);
			} else
				Reporter.logWithScreenShot("Email field is blank", MessageTypes.Pass);
		}

	}

	// Method to add password reset details for HCP user
	public void addresetPasswordDetailHCP(Object userDetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		userBean.fillData(userDetails);
		getOtrHcpsignuppageResetpasswordLbl().waitForPresent();
		Reporter.logWithScreenShot("Reset password field is displayed", MessageTypes.Pass);
		getOtrsignuppageemailtxt().clear();
		getOtrsignuppageemailtxt().sendKeys(userBean.getEmailID());
		getOtrsignuppagepasswordtxt().sendKeys("abcd1234");
		getOtrsignuppageconfirmpasswordtxt().sendKeys("abcd1234");
		getOtrsignuppagetermofservicecheckbox().click();
		Reporter.logWithScreenShot("Page displayed with all valid details", MessageTypes.Pass);
		getOtrsignuppagesignupbtn().waitForEnabled();
		getOtrsignuppagesignupbtn().click();
	}

	// Method to verify invalid clinic code entered
	public void verifyInvalidClinicCode(Object signupDetails) {
		fillSignUpDetails(signupDetails);
		// entering invalid clinic code
		getOtrsignuppageofficecodetxt().click();
		getOtrsignuppageofficecodetxt().sendKeys("ttccxx");
		getOtrsignuppageonetouchlogo().click();
		JNJUtilsAndroid.waitforLoad();
		getOtrSignuppageTimeStaticText(ConstantUtils.INCORRECT_CLINICCODE_MSG);
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
		getOtrsignuppageofficecodetxt().clear();
		String clinicCode = ConfigurationManager.getBundle().getProperty("clinic.clinicCode.cn.code1").toString();
		getOtrsignuppageofficecodetxt().sendKeys(clinicCode);
		getOtrsignuppagesignupbtn().click();
		getOtrSignuppageTimeStaticText(ConstantUtils.INCORRECT_CLINICCODE_MSG);
		Reporter.logWithScreenShot("Incorrect Clinic Message", MessageTypes.Pass);
	}
	
	public void veriyFirstAndLastName() {
		getOtrsignuppagefirstnametxt().waitForPresent();
		getOtrsignuppagefirstnametxt().sendKeys("=<");
		getOtrsignuppageonetouchlogo().click();
		getotrSignuppageFirstNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid First name is displayed", MessageTypes.Pass);
		getOtrsignuppagelastnametxt().sendKeys("=<");
		getOtrsignuppageonetouchlogo().click();
		getotrSignuppageLastNameErrorTxt().waitForPresent();
		Reporter.logWithScreenShot("Error message for invalid Last name is displayed", MessageTypes.Pass);
	}

	// Method to set year
	public void setYear() {
		int currentYear = Integer.parseInt(ConstantUtils.CURRENT_YEAR);
		int requiredYear = currentYear - 18;
		getOtrsignuppagedobtxt().click();
		
		if (getOtrSignupPageCalendarYearBtn().isDisplayed())
			getOtrSignupPageCalendarYearBtn().click();
		getOtrSignuppageTimeStaticText("2016").waitForPresent();

		Point p1 = getOtrSignuppageTimeStaticText("2016").getLocation();
		int startX = p1.getX();
		int startY = p1.getY();

		while (!getOtrSignuppageTimeStaticText(""+requiredYear).isPresent()) {
			androidDriver.swipe(startX + 10, startY - 300, startX + 10, startY, 500);
		}
		getOtrSignuppageTimeStaticText(""+requiredYear).click();
		Reporter.logWithScreenShot("Selected Year", MessageTypes.Pass);
		getOtrsignuppageimportantmessageokbtn().click();
		
		
		getOtrSignuppageTimeStaticText(JNJUtilsIOS.getPropString("onboarding.ageRestriction.title"))
				.verifyNotVisible("Age restriction pop up");
	}
	
	// Method to clicking authentication type
	// Milan
	public void clickOnAuthenticationTypeSignup(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			if (getOtrsignuppagekeepmeloggedinchkbox().getAttribute("value").contains("0"))
				getOtrsignuppagekeepmeloggedinchkbox().click();
			else {
				Reporter.logWithScreenShot("Keep me login switch is on", MessageTypes.Pass);
			}
			break;
		case "TOUCH ID":
			getOotrSignuppageTouchIDBtn().click();
			break;
		}
		Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}
	//Create account button on sign up first page
	public void clicksOnCreateAccountButton() {
		getOtrsignuppagecontinuebuttonbtn().waitForEnabled();
		getOtrsignuppagecontinuebuttonbtn().click();
		
	}
	
	//method to verify touch ID option is available on the screen
	public void verifiesTouchIDOption() {
		getOotrSignuppageTouchIDBtn().waitForPresent();
		getOotrSignuppageTouchIDBtn().verifyPresent("Enable touch ID");
	}

}
