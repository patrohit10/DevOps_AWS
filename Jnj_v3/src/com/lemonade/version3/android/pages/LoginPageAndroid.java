package com.lemonade.version3.android.pages;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.version3.android.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class LoginPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.loginpage.username.txt")
	private QAFWebElement otrLoginpageUsernameTxt;
	@FindBy(locator = "otr.loginpage.password.txt")
	private QAFWebElement otrLoginpagePasswordTxt;
	@FindBy(locator = "otr.loginpage.login.btn")
	private QAFWebElement otrLoginpageLoginBtn;
	@FindBy(locator = "otr.loginpage.enabletouchid.lbl")
	private QAFWebElement otrLoginpageEnabletouchidLbl;
	@FindBy(locator = "otr.loginpage.enabletouchid.switch.btn")
	private QAFWebElement otrLoginpageEnabletouchidSwitchBtn;
	@FindBy(locator = "otr.loginpage.keepmelogin.lbl")
	private QAFWebElement otrLoginpageKeepmeloginLbl;
	@FindBy(locator = "otr.loginpage.keepmelogin.switch.btn")
	private QAFWebElement otrLoginpageKeepmeloginSwitchBtn;
	@FindBy(locator = "otr.loginpage.touchid.fingerprint.img")
	private QAFWebElement otrLoginpageTouchidFingerprintImg;
	@FindBy(locator = "otr.loginpage.forgotpassword.lnk")
	private QAFWebElement otrLoginpageForgotpasswordLnk;
	@FindBy(locator = "otr.loginpage.signup.lnk")
	private QAFWebElement otrLoginpageSignupLnk;
	@FindBy(locator = "otr.forgotpassword.email.txt")
	private QAFWebElement otrForgotPasswordEmailTxt;
	@FindBy(locator = "otr.forgotpassword.sendemail.btn")
	private QAFWebElement otrForgotPasswordSenEmailBtn;
	@FindBy(locator = "otr.forgotpassword.emailreset.lbl")
	private QAFWebElement otrForgotPasswordEmailResetLbl;
	@FindBy(locator = "otr.forgotpassword.statictext.btn")
	private QAFWebElement otrForgotpasswordStatictextBtn;
	@FindBy(locator = "otr.loginpage.frenchwelcome.lbl")
	private QAFWebElement otrLoginpageFrenchwelcomeLbl;

	public QAFWebElement getOtrForgotPasswordEmailTxt() {
		return otrForgotPasswordEmailTxt;
	}

	public QAFWebElement getOtrForgotPasswordSenEmailBtn() {
		return otrForgotPasswordSenEmailBtn;
	}

	public QAFWebElement getOtrForgotPasswordEmailResetLbl() {
		return otrForgotPasswordEmailResetLbl;
	}

	public QAFWebElement getOtrForgotPasswordStaticTextBtn(String Text) {
		return JNJUtilsAndroid.getElement("otr.forgotpassword.statictext.btn", Text);
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrloginpageusernametxt() {
		return otrLoginpageUsernameTxt;
	}

	public QAFWebElement getOtrloginpagepasswordtxt() {
		return otrLoginpagePasswordTxt;
	}

	public QAFWebElement getOtrloginpageloginbtn() {
		return otrLoginpageLoginBtn;
	}

	public QAFWebElement getOtrloginpageenabletouchidlbl() {
		return otrLoginpageEnabletouchidLbl;
	}

	public QAFWebElement getOtrloginpageenabletouchidswitchbtn() {
		return otrLoginpageEnabletouchidSwitchBtn;
	}

	public QAFWebElement getOtrloginpagekeepmeloginlbl() {
		return otrLoginpageKeepmeloginLbl;
	}

	public QAFWebElement getOtrloginpagekeepmeloginswitchbtn() {
		return otrLoginpageKeepmeloginSwitchBtn;
	}

	public QAFWebElement getOtrloginpagetouchidfingerprintimg() {
		return otrLoginpageTouchidFingerprintImg;
	}

	public QAFWebElement getOtrloginpageforgotpasswordlnk() {
		return otrLoginpageForgotpasswordLnk;
	}

	public QAFWebElement getOtrloginpagesignuplnl() {
		return otrLoginpageSignupLnk;
	}

	public QAFWebElement getOtrForgotpasswordStatictextBtn() {
		return otrForgotpasswordStatictextBtn;
	}

	public QAFWebElement getOtrLoginpageFrenchwelcomeLbl() {
		return otrLoginpageFrenchwelcomeLbl;
	}

	public QAFWebElement getOtrLoginpageUpdatepageAgreeChkbx() {
		return otrLoginpageUpdatepageAgreeChkbx;
	}

	public QAFWebElement getOtrLoginpageLocationaccessAllowBtn() {
		return otrLoginpageLocationaccessAllowBtn;
	}

	CountrySelectionPageAndroid countrySelectionPageAndroid = new CountrySelectionPageAndroid();
	@FindBy(locator = "otr.loginpage.updatepage.agree.chkbx")
	private QAFWebElement otrLoginpageUpdatepageAgreeChkbx;
	@FindBy(locator = "otr.loginpage.locationaccess.allow.btn")
	private QAFWebElement otrLoginpageLocationaccessAllowBtn;
	@FindBy(locator = "otr.forgotpassword.emailerror.txt")
	private QAFWebElement otrForgotpasswordEmailerrorTxt;

	// method to signin with valid data
	public void doLogin(Object userdetails) {
		UserDetailBeans userBean = new UserDetailBeans();
		if (userdetails instanceof String) {

			userBean.fillFromConfig((String) userdetails);
		} else {
			userBean.fillData(userdetails);
		}
		if (getOtrloginpageusernametxt().isEnabled()) {

			getOtrloginpageusernametxt().click();
			getOtrloginpageusernametxt().sendKeys(userBean.getUsername());
		}
		getOtrloginpagepasswordtxt().click();
		getOtrloginpagepasswordtxt().sendKeys(userBean.getPassword());
		JNJUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Login details are filled", MessageTypes.Pass);
		JNJUtilsAndroid.waitforLoad();

	}

	// Method to click on login button
	public void clickOnLogin_Btn() {
		SignupPageAndroid android = new SignupPageAndroid();
		LogbookPageAndroid logbookPageAndroid = new LogbookPageAndroid();
		try {
			getOtrloginpageloginbtn().waitForEnabled();
			getOtrloginpageloginbtn().click();
			String getOkString = getOtrForgotPasswordStaticTextBtn(JNJUtilsAndroid.getPropString("appCommon.ok"))
					.toString();
			String getStaticOK = getOtrForgotPasswordStaticTextBtn("OK").toString();
			if (getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.isPresent())
				getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			else if (getOtrForgotPasswordStaticTextBtn("OK").isPresent())
				getOtrForgotPasswordStaticTextBtn("OK").click();
			//			getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).waitForPresent(5000);
			//			getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			try {
				getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("updateNotice.title"))
						.waitForPresent();
				Reporter.logWithScreenShot("Update Notice page is displayed", MessageTypes.Pass);
				Reporter.logWithScreenShot("Update page", MessageTypes.Pass);
				getOtrLoginpageUpdatepageAgreeChkbx().click();
				getOtrloginpageloginbtn().click();
			} catch (Exception e) {
				Reporter.logWithScreenShot("Update Notice page is not displayed", MessageTypes.Pass);
			}
			if (getOtrForgotPasswordStaticTextBtn(
					ConfigurationManager.getBundle().getString("addEvent.lastReading.title")).isPresent()) {
				logbookPageAndroid.getOtrlogbookaddeventsavebtn().click();
			}

			if (getOtrLoginpageLocationaccessAllowBtn().isPresent()) {
				Reporter.logWithScreenShot("Location access popup is displayed", MessageTypes.Pass);
				getOtrLoginpageLocationaccessAllowBtn().click();
			}
			//			if (android.getOtrsignuppageskipbtn().isPresent()) {
			//				Reporter.logWithScreenShot("Meter page skip button", MessageTypes.Pass);
			android.getOtrsignuppageskipbtn().click();
			//			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Login button not enabled", MessageTypes.Pass);
		}
	}

	// Login to verify HCP user
	public void clickHCPLogin() {
		getOtrloginpageloginbtn().waitForEnabled();
		getOtrloginpageloginbtn().click();
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).waitForPresent();
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		Reporter.logWithScreenShot("User is not valid HCP user as birthdate is below 18 years of age",
				MessageTypes.Pass);
	}

	// Method to clicking authentication type
	public void clickOnAuthenticationType(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "KEEP ME LOGIN":
			if (getOtrloginpagekeepmeloginswitchbtn().getAttribute("checked").toString().equalsIgnoreCase("false"))
				getOtrloginpagekeepmeloginswitchbtn().click();
			Reporter.logWithScreenShot("Keep me login toggle is On", MessageTypes.Pass);
			break;

		case "REQUIRE LOGIN":
			if (getOtrloginpagekeepmeloginswitchbtn().getAttribute("checked").toString().equalsIgnoreCase("true"))
				getOtrloginpagekeepmeloginswitchbtn().click();
			Reporter.logWithScreenShot("Keep me login toggle is off", MessageTypes.Pass);
			break;
		}
		Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}

	// To verify login page element
	public void verifyLoginPage() {
		getOtrloginpageusernametxt().verifyPresent("Username text field is present");
		getOtrloginpagepasswordtxt().verifyPresent("password text field is present");
		getOtrloginpageloginbtn().verifyPresent("Login button is present");
		getOtrloginpageforgotpasswordlnk().verifyPresent("Forgot password text is present");
		getOtrloginpagekeepmeloginswitchbtn().verifyPresent("Keep me login switch is present");
	}

	// Method to click on Forgot Password button
	public void clickOnforgotpass() {
		getOtrloginpageforgotpasswordlnk().waitForPresent();
		getOtrloginpageforgotpasswordlnk().click();
		Reporter.logWithScreenShot("Forgot Password Screen is displayed", MessageTypes.Pass);

	}

	// Method to verify forgot password page
	public void verifyForgotpwdPage() {
		getOtrForgotPasswordEmailResetLbl().verifyPresent("Label to give details of reset password is present");
		getOtrForgotPasswordEmailTxt().verifyPresent("Email textfield to reset password is present");
		getOtrForgotPasswordSenEmailBtn().verifyPresent("Send button is present");
	}

	// Method to verify reset password with valid emailID
	public void verifyresetPasswordValidMail() {
		getOtrForgotPasswordEmailResetLbl().waitForPresent();
		getOtrForgotPasswordStaticTextBtn(JNJUtilsAndroid.getPropString("auth.forgotInfo.enterYourEmailLabel"))
				.verifyVisible("Email sent label");
		getOtrForgotPasswordEmailTxt().clear();
		getOtrForgotPasswordEmailTxt().sendKeys("infostretchjj@gmail.com");
		getOtrForgotPasswordSenEmailBtn().click();
		getOtrForgotPasswordSenEmailBtn().click();
		getOtrForgotPasswordStaticTextBtn(JNJUtilsAndroid.getPropString("auth.confirmation.checkYourEmail"))
				.waitForPresent();
		getOtrForgotPasswordStaticTextBtn(JNJUtilsAndroid.getPropString("auth.confirmation.checkYourEmail"))
				.verifyVisible("Reset message");
	}

	// Method to reset password with invalid emailID
	public void verifyFGPWDInvalidEmailID() {
		getOtrForgotPasswordEmailResetLbl().waitForPresent();
		getOtrForgotPasswordEmailTxt().clear();
		if (getOtrForgotPasswordSenEmailBtn().isEnabled())
			getOtrForgotPasswordSenEmailBtn().click();
		else
			Reporter.logWithScreenShot("Email Text Field is blank and thus Send button is disabled", MessageTypes.Pass);
		getOtrForgotPasswordEmailResetLbl().waitForVisible();
		getOtrForgotPasswordEmailTxt().clear();
		getOtrForgotPasswordEmailTxt().sendKeys("Test123");
		getOtrForgotPasswordEmailResetLbl().click();
		Reporter.logWithScreenShot("Error Message for Invalid Email Id", MessageTypes.Pass);
		getOtrForgotPasswordEmailTxt().clear();
		getOtrForgotPasswordEmailTxt().sendKeys("Test123@");
		getOtrForgotPasswordEmailResetLbl().click();
		Reporter.logWithScreenShot("Error Message for wrong Email Id", MessageTypes.Pass);
		getOtrForgotPasswordEmailTxt().clear();
		getOtrForgotPasswordEmailTxt().sendKeys("abcdsedsad@gmail.com");
		getOtrForgotPasswordEmailResetLbl().click();
		if (getOtrForgotPasswordSenEmailBtn().isEnabled())
			getOtrForgotPasswordSenEmailBtn().click();
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).waitForPresent();
		Reporter.logWithScreenShot("Error Message for unauthorized Email Id", MessageTypes.Pass);
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();

	}

	// Method to Login without Password field and invalid Password field
	public void loginWithoutPasswordField() {
		getOtrloginpageusernametxt().waitForPresent();
		getOtrloginpageusernametxt().sendKeys("Test123@gmail.com");
		getOtrloginpagepasswordtxt().clear();
		getOtrloginpagekeepmeloginlbl().click();
		if (getOtrloginpageloginbtn().isEnabled())
			getOtrloginpageloginbtn().click();
		else
			Reporter.logWithScreenShot("Password field is blank", MessageTypes.Pass);
		getOtrloginpagepasswordtxt().sendKeys("icpl12345#");
		if (getOtrloginpageloginbtn().isEnabled())
			getOtrloginpageloginbtn().click();
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.waitForPresent(3000);
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		if (getOtrForgotPasswordStaticTextBtn(JNJUtilsAndroid.getPropString("network.error.loginAuthentication"))
				.verifyPresent("Invalid Credential Popup is displayed")) {
			Reporter.logWithScreenShot("Entered Password is not a valid password", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is able to login successfully", MessageTypes.Pass);

	}

	// Method to login with Unregistered User
	public void loginUnregisteredUser() {
		getOtrloginpageusernametxt().waitForPresent();
		getOtrloginpageusernametxt().clear();
		getOtrloginpageusernametxt().sendKeys("sfsd@gmail.com");
		getOtrloginpagepasswordtxt().clear();
		getOtrloginpagepasswordtxt().sendKeys("c0nn3ct");
		getOtrloginpagekeepmeloginlbl().click();
		if (getOtrloginpageloginbtn().isEnabled())
			getOtrloginpageloginbtn().click();
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.waitForPresent(3000);
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		if (getOtrForgotPasswordStaticTextBtn(JNJUtilsAndroid.getPropString("network.error.loginAuthentication"))
				.verifyPresent("Invalid Credential Popup is displayed")) {
			Reporter.logWithScreenShot("User is not a registered user", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("User is a registered user", MessageTypes.Pass);
	}

	// Method to login with Invalid Username
	public void loginWithInvalidUsername() {
		getOtrloginpageusernametxt().waitForPresent();
		getOtrloginpageusernametxt().clear();
		getOtrloginpageusernametxt().sendKeys("#+avsbdf13234");
		getOtrloginpagepasswordtxt().clear();
		getOtrloginpagepasswordtxt().sendKeys("c0nn3ct");
		getOtrloginpagekeepmeloginlbl().click();
		if (getOtrloginpageloginbtn().isEnabled()) {
			getOtrloginpageloginbtn().click();
			JNJUtilsAndroid.waitforLoad();
		}
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).waitForPresent();
		getOtrForgotPasswordStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		if (getOtrForgotPasswordStaticTextBtn(JNJUtilsAndroid.getPropString("network.error.loginAuthentication"))
				.verifyPresent("Invalid Credential Popup is displayed"))
			Reporter.logWithScreenShot("Username is not valid", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Username is valid", MessageTypes.Pass);

	}

	public void validateSpecialCharacterEmailField() {
		getOtrForgotPasswordEmailTxt().clear();
		getOtrForgotPasswordEmailTxt().sendKeys("ab$#%^&@gmail.com");
		getOtrForgotPasswordSenEmailBtn().click();
		if(getOtrForgotpasswordEmailerrorTxt().isDisplayed())
		Reporter.logWithScreenShot("Invalid mail id is entered", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Valid mail id is entered", MessageTypes.Pass);
		
	}

	public QAFWebElement getOtrForgotpasswordEmailerrorTxt() {
		return otrForgotpasswordEmailerrorTxt;
	}
	
	// Method to verify email field is non editable once user login in to
	// application
	public void verifyDisableEmailField() {
		getOtrloginpageusernametxt().waitForPresent();
		getOtrloginpageusernametxt().verifyDisabled("Email field after login once");
	}
	//Method to verify keep me login switch disable
	public void verifyKeepMeLoginSwtchDisable() {
		getOtrloginpagekeepmeloginswitchbtn().waitForPresent();
		
		WebDriverTestCase.verifyTrue(getOtrloginpagekeepmeloginswitchbtn().getAttribute("checked").contains("false"), "Keep me login btn is on",
				"Keep me login btn is off");
	}

}
