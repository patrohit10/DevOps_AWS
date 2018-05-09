package com.lemonade.version3.android.steps;

import com.lemonade.version3.android.pages.CountrySelectionPageAndroid;
import com.lemonade.version3.android.pages.LoginPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class LoginSteps {
	LoginPageAndroid loginPageAndroid=new LoginPageAndroid();
	CountrySelectionPageAndroid countryselectionpage = new CountrySelectionPageAndroid();
	
	@QAFTestStep(description = "user enters login details using {0}")
	public void userEnterSigninDetails(Object userDetail) {
		loginPageAndroid.doLogin(userDetail);
	}

	@QAFTestStep(description = "user redirects to {0} Page")
	public void selectRedirectPage(String page){
		countryselectionpage.selectScreen(page);
	}
	@QAFTestStep(description = "user clicks on login button")
	public void clickOnLoginBtn() {
		loginPageAndroid.clickOnLogin_Btn();
	}
	
	@QAFTestStep(description="HCP user verify age restriction message")
	public void clickLoginHCP(){
		loginPageAndroid.clickHCPLogin();
	}
	
	@QAFTestStep(description = "user select authentication type as {0}")
	public void selectAuthanticationType(String option) {
		loginPageAndroid.clickOnAuthenticationType(option);
	}
	
	@QAFTestStep(description = "user verify login page")
	public void userVerifyLoginPage() {
		loginPageAndroid.verifyLoginPage();
	}
	@QAFTestStep(description = "user click on forgot password link")
	public void clickOnForgotPasswordLnk() {
		loginPageAndroid.clickOnforgotpass();
	}
	
	@QAFTestStep(description = "user verify forgot password page")
	public void verifyForgotpassPage() {
		loginPageAndroid.verifyForgotpwdPage();
	}
	
	@QAFTestStep(description = "user verify reset password with registered mail ID")
	public void verifyForgotpassvalidEmail() {
		loginPageAndroid.verifyresetPasswordValidMail();
	}
	
	
	@QAFTestStep(description = "user verify reset password with invalid mail ID")
	public void verifyForgotpassInvalidEmail() {
		loginPageAndroid.verifyFGPWDInvalidEmailID();
	}
	
	@QAFTestStep(description="user enters login details without password or incorrect password")
	public void loginWithoutPswrd(){
		loginPageAndroid.loginWithoutPasswordField();
	}
	
	@QAFTestStep(description="user enters login details with unregistered user")
	public void loginWithUnregisteredUser(){
		loginPageAndroid.loginUnregisteredUser();
	}
	
	@QAFTestStep(description="user enters login details with invalid username")
	public void loginInvalidUser(){
		loginPageAndroid.loginWithInvalidUsername();
	}
	
	@QAFTestStep(description="user validate email with special characters")
	public void validateEmail(){
		loginPageAndroid.validateSpecialCharacterEmailField();
	}
	@QAFTestStep(description = "user verify email field is non editable login screen")
	public void verifyemilFieldDisable() {
		loginPageAndroid.verifyDisableEmailField();
	}
	@QAFTestStep(description = "user verify keep me login switch disable")
	public void verifyKeepMeLoginSwitchDisable() {
		loginPageAndroid.verifyKeepMeLoginSwtchDisable();
	}
}
