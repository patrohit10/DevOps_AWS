	package com.lemonade.version3.iOS.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import org.apache.commons.lang.RandomStringUtils;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;


public class LoginPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otrios.loginPage.emailAdress.tBox")
	private QAFWebElement otriosLoginpageEmailadressTbox;
	@FindBy(locator = "otrios.loginPage.password.tBox")
	private QAFWebElement otriosLoginpagePasswordTbox;
	@FindBy(locator = "otrios.loginPage.enableTouchID.lbl")
	private QAFWebElement otriosLoginpageEnabletouchidLbl;
	@FindBy(locator = "otrios.loginPage.enableTouchID.switch")
	private QAFWebElement otriosLoginpageEnabletouchidSwitch;
	@FindBy(locator = "otrios.loginPage.title.lbl")
	private QAFWebElement otriosLoginpageTitleLbl;
	@FindBy(locator = "otrios.loginPage.touchID.img")
	private QAFWebElement otriosLoginpageTouchidImg;
	@FindBy(locator = "otrios.loginPage.forgotpwd.emailfield.txt")
	private QAFWebElement otriosLoginpageForgotpwdEmailfieldTxt;
	@FindBy(locator = "otrios.loginPage.forgotpwd.send.btn")
	private QAFWebElement otriosLoginpageForgotpwdSendBtn;
	@FindBy(locator = "otrios.loginPage.forgotpwd.close.btn")
	private QAFWebElement otriosLoginpageForgotpwdCloseBtn;
	@FindBy(locator = "otrios.loginpage.updatepage.agree.chkbx")
	private List<QAFWebElement> otriosLoginpageUpdatepageAgreeChkbx;
	@FindBy(locator = "otrios.loginPage.meterskip.btn")
	private QAFWebElement otriosLoginpageMeterskipBtn;
	@FindBy(locator="otrios.loginPage.forgotPassword.emailError.txt")
	private QAFWebElement otriosLoginPageForgotPasswordEmailErrorTxt;
	@FindBy(locator="otrios.loginPage.cancelErrorMsg.img")
	private QAFWebElement otriosLoginPageCancelErrorMsgImg;
	@FindBy(locator="otrios.loginPage.forgotPassword.OTRLogo.img")
	private QAFWebElement otriosLoginPageForgotPasswordOTRLogoImg;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	
	
	public QAFWebElement getOtriosLoginpageMeterskipBtn() {
		return otriosLoginpageMeterskipBtn;
	}
//Manjushri
	public List<QAFWebElement> getOtriosLoginpageUpdatepageAgreeChkbx() {
		return otriosLoginpageUpdatepageAgreeChkbx;
	}
	
	public QAFWebElement getOtriosLoginpageEmailadressTbox() {
		return otriosLoginpageEmailadressTbox;
	}

	public QAFWebElement getOtriosLoginpagePasswordTbox() {
		return otriosLoginpagePasswordTbox;
	}

	public QAFWebElement getOtriosLoginpageEnabletouchidLbl() {
		return otriosLoginpageEnabletouchidLbl;
	}

	public QAFWebElement getOtriosLoginpageEnabletouchidSwitch() {
		return otriosLoginpageEnabletouchidSwitch;
	}

	public QAFWebElement getOtriosLoginpageTitleLbl() {
		return otriosLoginpageTitleLbl;
	}

	public QAFWebElement getOtriosLoginpageTouchidImg() {
		return otriosLoginpageTouchidImg;
	}

	public QAFWebElement getOtriosLoginpageForgotpwdEmailfieldTxt() {
		return otriosLoginpageForgotpwdEmailfieldTxt;
	}

	public QAFWebElement getOtriosLoginpageForgotpwdSendBtn() {
		return otriosLoginpageForgotpwdSendBtn;
	}
	public QAFWebElement getOtriosLoginpageForgotpwdCloseBtn() {
		return otriosLoginpageForgotpwdCloseBtn;
	}
	public QAFWebElement getOtriosLoginpageStaticlabel(String text) {
		return JNJUtilsIOS.getElement("otrios.loginPage.statictext.lbl", text);
	}
	
	public QAFWebElement getOtriosLoginpageKeepmeloginSwitch() {
		return JNJUtilsIOS.getElement("otrios.loginPage.keepMeLogin.switch",JNJUtilsIOS.getPropString("common.logintype.persistent"));
	}

	public QAFWebElement getOtriosLoginpageLoginBtn() {
		return JNJUtilsIOS.getElement("otrios.loginPage.statictext.lbl",JNJUtilsIOS.getPropString("login.action.login"));
	}
	public QAFWebElement getOtriosLoginpageForgotpasswordLbl() {
		return JNJUtilsIOS.getElement("otrios.loginPage.statictext.lbl",JNJUtilsIOS.getPropString("login.action.forgotPassword").substring(0, 8));
	}
	public QAFWebElement getOtriosLoginpageSignupLnk() {
		return JNJUtilsIOS.getElement("otrios.loginPage.statictext.lbl",JNJUtilsIOS.getPropString("createaccount.action.signup"));
	}
	public QAFWebElement getOtriosLoginpageForgotpwdResetmsgLbl() {
		return JNJUtilsIOS.getElement("otrios.loginPage.statictext.lbl",JNJUtilsIOS.getPropString("auth.forgotInfo.enterYourEmailLabel"));
	}
	
	public QAFWebElement getOtrLoginpageUpdatepageContinueBtn() {
		return JNJUtilsIOS.getElement("otrios.loginPage.statictext.lbl",JNJUtilsIOS.getPropString("alerts.meterTargetRangeDifferenceConfirmation.continue"));
	}
	public QAFWebElement getOtrLoginpageUpdatepageUpdateNoticeLbl() {
		return JNJUtilsIOS.getElement("otrios.loginPage.updateNotice.lbl",JNJUtilsIOS.getPropString("updateNotice.title"));
	}
	public QAFWebElement getotriosLoginPageForgotPasswordEmailErrorTxt() {
		return otriosLoginPageForgotPasswordEmailErrorTxt;
	}
	public QAFWebElement getotriosLoginPageCancelErrorMsgImg() {
		return otriosLoginPageCancelErrorMsgImg;
	}
	public QAFWebElement getotriosLoginPageForgotPasswordOTRLogoImg() {
		return otriosLoginPageForgotPasswordOTRLogoImg;
	}

	
	//To verify login page element
	//milan
	public void verifyLoginPage(){
		getOtriosLoginpageEmailadressTbox().verifyPresent("Email adress text field");
		getOtriosLoginpagePasswordTbox().verifyPresent("password text field");
		getOtriosLoginpageLoginBtn().verifyPresent("Login button");
		getOtriosLoginpageForgotpasswordLbl().verifyPresent("Forgot password text");
		
	}
	//method to fill login details
	//milan
	public void fillLoginDetail(Object userDetail)
	{
		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getOtriosLoginpageEmailadressTbox().clear();
		getOtriosLoginpageEmailadressTbox().sendKeys(userBean.getUsername());
		getOtriosLoginpagePasswordTbox().clear();
		getOtriosLoginpagePasswordTbox().sendKeys(userBean.getPassword());
		
		Reporter.logWithScreenShot("Filled login details", MessageTypes.Pass);
		getOtriosLoginpageTitleLbl().click();
		
//		if(!JNJUtilsIOS.tryMethod(getOtriosLoginpageEnabletouchidLbl())){
//			clickOnAuthenticationType("KEEP ME LOGIN");
//		}

	
	}
	//Method to click on sign up button when enabled
	//Milan
	public void clickOnLogin_Btn()
	{
		try{
			getOtriosLoginpageLoginBtn().waitForEnabled();
			Reporter.logWithScreenShot("Login button is present", MessageTypes.Pass);
			getOtriosLoginpageLoginBtn().click();
			System.out.println("111111111111111111111111111");
			try{
					SignupPageIOS signup=new SignupPageIOS();
					signup.getOtriosSignuppageSingupOkBtn().waitForPresent();
					signup.getOtriosSignuppageSingupOkBtn().click();
					getOtrLoginpageUpdatepageUpdateNoticeLbl().waitForPresent(5000);
					for(int i=0;i<getOtriosLoginpageUpdatepageAgreeChkbx().size();i++){
					if(getOtriosLoginpageUpdatepageAgreeChkbx().get(i).isPresent()){
						getOtriosLoginpageUpdatepageAgreeChkbx().get(i).click();
						getOtrLoginpageUpdatepageContinueBtn().click();
						break;
					}
					
			}
				
			}catch(Exception e){
			}
			
			//signup.getOtriosSignuppageSkipBtn().waitForPresent();
			if(getOtriosLoginpageMeterskipBtn().isPresent()){
				getOtriosLoginpageMeterskipBtn().click();
			}		
		}
		
		catch(Exception e)
		{
			Reporter.logWithScreenShot("Login button not enabled", MessageTypes.Pass);
		}
	}
	//Method to clicking authentication type 
	//Milan
	public void clickOnAuthenticationType(String option)
	{
		
		option = option.toUpperCase();
		  switch (option) {
		  case "KEEP ME LOGIN":
			 if( getOtriosLoginpageKeepmeloginSwitch().getAttribute("value").contains("0"))
			  getOtriosLoginpageKeepmeloginSwitch().click();
			 else{
				 Reporter.logWithScreenShot("Keep me login switch is on", MessageTypes.Pass);
			 }
		   break;
		  case "TOUCH ID":
			  getOtriosLoginpageEnabletouchidSwitch().click();
		   break;
		   
		  case "REQUIRE LOGIN":
			  Reporter.logWithScreenShot("Keep me login and Touch ID both are off", MessageTypes.Pass);
			break;
		  }
		  Reporter.logWithScreenShot("After selecting Authentication Type", MessageTypes.Pass);
	}
	//Method to click forgot password btn
	//milan
	public void clickOnforgotpass()
	{
		getOtriosLoginpageForgotpasswordLbl().waitForPresent();
		getOtriosLoginpageForgotpasswordLbl().click();
	}
	//Method to verify forgot password page
	//milan
	public void verifyForgotpwdPage()
	{
		//getOtriosLoginpageForgotpwdResetmsgLbl().waitForPresent();
		getOtriosLoginpageForgotpwdEmailfieldTxt().verifyPresent("Email field");
		getOtriosLoginpageForgotpwdSendBtn().verifyPresent("Send button");
		getOtriosLoginpageForgotpwdResetmsgLbl().verifyPresent("Reset message");
		getOtriosLoginpageForgotpwdCloseBtn().verifyPresent("Close button");
		getOtriosLoginpageForgotpwdCloseBtn().click();
		getOtriosLoginpageLoginBtn().waitForPresent();
		getOtriosLoginpageLoginBtn().verifyPresent("After clicking close button Login page");
		
	}
	//Method to verify special characters in email field on forgot password page
	//Sangram 12/05/2017
	public void verifyEmailWithSplChars() {
		getOtriosLoginpageForgotpwdResetmsgLbl().waitForPresent();
		getOtriosLoginpageForgotpwdEmailfieldTxt().clear();
		getOtriosLoginpageForgotpwdEmailfieldTxt().sendKeys("sangram.+{}~^*-_1@gma.com");
		getotriosLoginPageForgotPasswordOTRLogoImg().click();
		if(getotriosLoginPageForgotPasswordEmailErrorTxt().isDisplayed()){
			Reporter.logWithScreenShot("Error message should not present", MessageTypes.Fail);
			getotriosLoginPageCancelErrorMsgImg().waitForPresent();
			getotriosLoginPageCancelErrorMsgImg().click();
		}
		else{
			Reporter.logWithScreenShot("Special characters are allowed", MessageTypes.Pass);
		}
		
		
	}
	
	//Method to verify reset password with valid emailID
	//Milan
	public void verifyFGPWDValidEmailID()
	{
		getOtriosLoginpageForgotpwdResetmsgLbl().waitForPresent();
		getOtriosLoginpageForgotpwdEmailfieldTxt().clear();
		getOtriosLoginpageForgotpwdEmailfieldTxt().sendKeys("Test123@gmail.com");
		getOtriosLoginpageForgotpwdSendBtn().click();
		getOtriosLoginpageForgotpwdSendBtn().waitForEnabled();
		getOtriosLoginpageForgotpwdSendBtn().click();
		getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("auth.confirmation.checkYourEmail")).verifyVisible("Reset message");
		
		
	}
	//Method to reset password with invalid emailID
	//Milan
	public void verifyFGPWDInvalidEmailID()
	{
		getOtriosLoginpageForgotpwdResetmsgLbl().waitForPresent();
		getOtriosLoginpageForgotpwdEmailfieldTxt().clear();
		getOtriosLoginpageForgotpwdSendBtn().click();
		getOtriosLoginpageForgotpwdSendBtn().verifyDisabled("Send button is disable for blank email field");
		getOtriosLoginpageForgotpwdEmailfieldTxt().clear();
		getOtriosLoginpageForgotpwdEmailfieldTxt().sendKeys("Test123");
		getOtriosLoginpageForgotpwdSendBtn().click();
		getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat")).verifyVisible("Error popup for invalid email format");
		getOtriosLoginpageForgotpwdEmailfieldTxt().clear();
		getOtriosLoginpageForgotpwdEmailfieldTxt().sendKeys("Test123@");
		getOtriosLoginpageForgotpwdSendBtn().click();
		getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("auth.emailValidation.emailNotValidFormat")).verifyVisible("Error popup for invalid email format");
		
	}

	public void loginWithoutPasswordField() {
		getOtriosLoginpageEmailadressTbox().sendKeys("milan.dey@gmail.com");
		getOtriosLoginpageLoginBtn().verifyDisabled("When no password entered login button");
		
		getOtriosLoginpagePasswordTbox().sendKeys("1111aaaa");
		getOtriosLoginpageLoginBtn().click();
		getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("alerts.error.title")).waitForPresent();
		
		getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("network.error.loginAuthentication")).verifyVisible("Error popup Username or password was incorrect");
		
	}

	public void loginUnregisteredUser() {
		getOtriosLoginpageEmailadressTbox().clear();
		getOtriosLoginpageEmailadressTbox().sendKeys("a@a.com");
		getOtriosLoginpagePasswordTbox().clear();
		getOtriosLoginpagePasswordTbox().sendKeys("1111aaaa");
		getOtriosLoginpageTitleLbl().click();
		getOtriosLoginpageLoginBtn().click();
		getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("network.error.loginAuthentication")).verifyVisible("Error popup Username or password was incorrect");
		
		
	}

	public void loginWithInvalidUsername() {
		getOtriosLoginpageEmailadressTbox().clear();
		getOtriosLoginpageEmailadressTbox().sendKeys("!!*+-");
		getOtriosLoginpagePasswordTbox().clear();
		getOtriosLoginpagePasswordTbox().sendKeys("1111aaaa");
		getOtriosLoginpageTitleLbl().click();
		getOtriosLoginpageLoginBtn().click();
		getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("network.error.loginAuthentication")).verifyVisible("Error popup Username or password was incorrect");
		
	}
	
	public void verifyLengthLoginFields() {
		getOtriosLoginpageEmailadressTbox().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(76) + "@gmail.com";

		getOtriosLoginpageEmailadressTbox().clear();
		getOtriosLoginpageEmailadressTbox().sendKeys(typeName);
		
		
		getOtriosLoginpagePasswordTbox().clear();
		getOtriosLoginpagePasswordTbox().sendKeys(RandomStringUtils.randomAlphanumeric(76));
		
		getOtriosLoginpageTitleLbl().click();
		 Validator.verifyThat(" length",getOtriosLoginpageEmailadressTbox().
		 getAttribute("value").length(),Matchers.lessThanOrEqualTo(75));
	}
	
	 public  void verifyFingerPrint(String successFail) {
		 clickOnAuthenticationType("TOUCH ID");
		 
		 getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("common.backbuttontext")).click();
		 SignupPageIOS sign=new SignupPageIOS();
		 sign.redirectToPage("LOG-IN");
		 getOtriosLoginpageTouchidImg().click();
		 Reporter.logWithScreenShot("after clicking", MessageTypes.Pass);
		 
		  String command = "mobile:fingerprint:set";
		  JNJUtilsIOS jnjUtil=new JNJUtilsIOS();
		  Map<String, Object> params = new HashMap<>();
		  params.put("identifier", ConfigurationManager.getBundle().getString("appName"));
		  params.put("resultAuth", successFail);
		  jnjUtil.getDriver().executeScript("mobile:fingerprint:set", params);
		  if(successFail.equalsIgnoreCase("success")){
		  getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("appCommon.ok")).waitForPresent();
		  getOtriosLoginpageStaticlabel(JNJUtilsIOS.getPropString("appCommon.ok")).click();
		  JNJUtilsIOS.pause(2000);
		  Reporter.logWithScreenShot("FingerPrint is enabled successfully", MessageTypes.Pass);
		  }
		  else if(successFail.equalsIgnoreCase("fail")){
			  
		  }
		 
		 
//		 if (fingerprintInstrument) {
//		   params.put("fingerprintInstrument", "fingerprint");
//		  } else {
//		   params.put("fingerprintInstrument", "nofingerprint");
//		  }
	 }


	//Method to verify email field is non editable once user login in to application 
	public void verifyDisableEmailField() {
		getOtriosLoginpageEmailadressTbox().waitForPresent();
		getOtriosLoginpageEmailadressTbox().verifyDisabled("Email field after login once");
	}
	//Method to verify keep me login switch disable
	public void verifyKeepMeLoginSwtchDisable() {
		getOtriosLoginpageKeepmeloginSwitch().waitForPresent();
		
		WebDriverTestCase.verifyTrue(getOtriosLoginpageKeepmeloginSwitch().getAttribute("value").contains("0"), "Keep me login btn is on",
				"Keep me login btn is off");
	}
}
