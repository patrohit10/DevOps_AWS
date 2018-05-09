package com.lemonade.version3.iOS.steps;

import com.lemonade.version3.iOS.pages.LoginPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class LoginIOSStep {
	
	LoginPageIOS loginPage=new LoginPageIOS();
	
	@QAFTestStep(description = "user verify login page")
	public void userVerifyLoginPage() {
		loginPage.verifyLoginPage();
	}
	@QAFTestStep(description = "user enters login details using {0}")
	public void userfillLoginForm(Object userDetail) {
		loginPage.fillLoginDetail(userDetail);
	}
	@QAFTestStep(description = "user clicks on login button")
	public void clickOnLoginBtn() {
		loginPage.clickOnLogin_Btn();
	}
	@QAFTestStep(description = "user select authentication type as {0}")
	public void selectAuthanticationType(String option) {
		loginPage.clickOnAuthenticationType(option);
	}
	@QAFTestStep(description = "user click on forgot password link")
	public void clickOnForgotPasswordLnk() {
		loginPage.clickOnforgotpass();
	}
	@QAFTestStep(description = "user verify forgot password page")
	public void verifyForgotpassPage() {
		loginPage.verifyForgotpwdPage();
	}
	@QAFTestStep(description="user validate email with special characters")
	public void verifyEmailCharacters() {
		loginPage.verifyEmailWithSplChars();
	}
	@QAFTestStep(description = "user verify reset password with registered mail ID")
	public void verifyForgotpassvalidEmail() {
		loginPage.verifyFGPWDValidEmailID();
	}
	@QAFTestStep(description = "user verify reset password with invalid mail ID")
	public void verifyForgotpassInvalidEmail() {
		loginPage.verifyFGPWDInvalidEmailID();
	}
	
	@QAFTestStep(description="user enters login details without password or incorrect password")
	public void loginWithoutPswrd(){
		loginPage.loginWithoutPasswordField();
	}
	
	@QAFTestStep(description="user enters login details with unregistered user")
	public void loginWithUnregisteredUser(){
		loginPage.loginUnregisteredUser();
	}
	
	@QAFTestStep(description="user enters login details with invalid username")
	public void loginInvalidUser(){
		loginPage.loginWithInvalidUsername();
	}
	
	@QAFTestStep(description="user verify email and password field allowed charcter range login page")
	public void allowedCharacterRange(){
		loginPage.verifyLengthLoginFields();
	}
	@QAFTestStep(description="user enter {0} fingerprint details")
	public void fingerprintEnter(String msg){
		loginPage.verifyFingerPrint(msg);
	}
	@QAFTestStep(description = "user verify email field is non editable login screen")
	public void verifyemilFieldDisable() {
		loginPage.verifyDisableEmailField();
	}
	@QAFTestStep(description = "user verify keep me login switch disable")
	public void verifyKeepMeLoginSwitchDisable() {
		loginPage.verifyKeepMeLoginSwtchDisable();
	}

}
