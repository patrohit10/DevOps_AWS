package com.lemonade.version3.iOS.steps;

import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.iOS.pages.CountryselectionPageIOS;
import com.lemonade.version3.iOS.pages.SignupPageIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.ios.IOSDriver;

public class SignupIOSStep {
	SignupPageIOS signupPage = new SignupPageIOS();
	
	@QAFTestStep(description = "user opens app")
	public void user_opens_app() {
		signupPage.openotriosApp();
	}
	@QAFTestStep(description="user opens app without allowing notification")
	public void openAppWithoutAllowingNotify() {
		signupPage.openAppWithoutNotification();
	}
	
	@QAFTestStep(description = "user verify signup page")
	public void userVerifySignUpPage() {
		signupPage.veriySignUpPage();
	}
	@QAFTestStep(description="user enters signup details using {0}")
	public void fillSignupDetails(Object signupDetails){
		signupPage.fillRandomSignUpDetails(signupDetails);
	}
	
	@QAFTestStep(description="user enters signup details without firstname using {0}")
	public void fillSignupDetailsWithoutFirstName(Object signupDetails){
		signupPage.enterSignupFirstScreenDetailsWithoutFirstName(signupDetails);
	}
	
	@QAFTestStep(description="user enters signup details without lastname using {0}")
	public void fillSignupDetailsWithoutLastName(Object signupDetails){
		signupPage.enterSignupFirstScreenDetailsWithoutLastName(signupDetails);
	}
	
	@QAFTestStep(description="user enters signup details with birthdate under age using {0}")
	public void fillDetailsWithBelowAgeBirthdate(Object signupDetails){
		signupPage.enterSignupFirstScreenBelowAgeBirthdate(signupDetails);
	}
	
	@QAFTestStep(description="user enters signup details without birthdate using {0}")
	public void fillDetailsWithoutBirthdate(Object userDetails){
		signupPage.enterSignupDetailsWithoutBirthdate(userDetails);
	}
	
	@QAFTestStep(description="user enters signup details without TOU using {0}")
	public void signUpFlowWithoutCheckBox(Object userDetails){
		signupPage.doSignUpWithoutCheckBox(userDetails);
	}
	
	@QAFTestStep(description="user enters signup details without emailId using {0}")
	public void signUpFlowWithoutEmail(Object userDetails){
		signupPage.fillRandomSignUpDetailsWithoutEmail(userDetails);
	}
	
	@QAFTestStep(description="Signup details with invalid user id and email length more than 75 chars using {0}")
	public void signUpFlowWithInvalidEmail(Object userDetails){
		signupPage.fillDetailsWithInvalidEmails(userDetails);
		
	}
	@QAFTestStep(description = "user redirects to {0} Page")
	public void userShouldBeOnPage(String pageName) {
		signupPage.redirectToPage(pageName);
	}
	@QAFTestStep(description = "user clicks on signup button")
	public void userclicksOnSignupBtn() {
		signupPage.clickOnSignUpBtn();
	}
	@QAFTestStep(description = "user closes the app")
	public void userCloseTheApp() {
		try {
			((IOSDriver) new WebDriverTestCase().getDriver().getUnderLayingDriver()).closeApp();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		JNJUtilsIOS.pause(4000);
		Reporter.logWithScreenShot("App is closed", MessageTypes.Pass);
	}
	@QAFTestStep(description = "user select access type as {0}")
	public void selectAccessType(String option) {
		signupPage.selectAccessType(option);
	}
	@QAFTestStep(description = "user click on skip button")
	public void clickOnSkipBtn() {
		signupPage.clickSkipBtn();
	}
	@QAFTestStep(description = "user verify country selection Page")
	public void verifyCountrySelectionPage() {
		
		CountryselectionPageIOS csPage=new CountryselectionPageIOS();
		csPage.verifyCountrySelectionPage();
	}
	@QAFTestStep(description = "user select country {0} from country list")
	public void userSelectCountryFromList(String countryName) {
		
		CountryselectionPageIOS csPage=new CountryselectionPageIOS();
		csPage.selectCountry(countryName);
	}
	
	@QAFTestStep(description="Signup details with email and confirm email validation using {0}")
	public void emailConfirmEmailValidation(String option){
		signupPage.emailValidations(option);
	}

	@QAFTestStep(description="Signup details without password using {0}")
	public void signupDetailsWithoutPassword(String option){
		signupPage.noPasswordToFill(option);
	}

	@QAFTestStep(description="Signup details with invalid password and less than 16 chars using {0}")
	public void signupDetailsWithInvalidPasword(String option){
		signupPage.invalidPasswordEntry(option);
	}

	@QAFTestStep(description="Signup details with already registered email id using {0}")
	public void signupDetailsWithSamemailId(String option){
		signupPage.repeatedMailIdSignupFlow(option);
	}
	@QAFTestStep(description="user resets app")
	public void uninstallDApp(){
		signupPage.uninstallApp();
	}
	@QAFTestStep(description="user select opt-in as {0} in sign up page")
	public void selectOptInSignup(String option){
		signupPage.selectionOfOptin(option);
	}
	@QAFTestStep(description="user verify invalid and other country clinic code using {0}")
	public void verifyInvalidClinicCode(Object option){
		signupPage.verifyInvalidClinicCode(option);
	}
	
	//HCP
	@QAFTestStep(description="HCP user verify age restriction message")
	public void verifyAgeRestrictionMessageResetScreen(){
		signupPage.verifyLessAgeHCPUser();
	}
	
	@QAFTestStep(description="user enters hcp details for validations using {0}")
	public void hcpUserFieldValidation(Object userDetails){
		signupPage.verifyEmailHCPscreen(userDetails);
	}
	@QAFTestStep(description="user verify blank email field using {0}")
	public void hcpUserNoEmailFieldValidation(){
		signupPage.noEmailResetPassword();
	}
	@QAFTestStep(description="HCP usre set reset password using {0}")
	public void fillResetPasswordDetails(Object userDetails){
		signupPage.addresetPasswordDetailHCP(userDetails);
	}
	@QAFTestStep(description="user clicks on {0} link on Create Account page to verify")
	public void clickTerms(String option) {
		signupPage.clickAndVerifyTermAndPrivecy(option);
	}
		
	@QAFTestStep(description="user select UOM as {0}")
	public void selectUOMASMGDL(String option){
		signupPage.selectUOM(option);
	}
	@QAFTestStep(description="user verify invalid First and Last Name")
	public void verifyInvalidCharactersForFirstsNameandLastName() {
		signupPage.verifyInvalidCharactersInFirstsNameandLastName();
	}
	@QAFTestStep(description="user verify exact 18 date of birth is allowed")
	public void exactDateOfBirthAllowed() {
		signupPage.setYear();
	}
	@QAFTestStep(description="user click on create account button")
	public void clickOnCreateAccountButton() {
		signupPage.clicksOnCreateAccountButton();
	}
	@QAFTestStep(description="user verifies touch id option present")
	public void verifyTouchIDOption() {
		signupPage.verifiesTouchIDOption();
	}
	@QAFTestStep(description = "user select authentication type as {0} on sign up")
	public void selectAuthanticationType(String option) {
		signupPage.clickOnAuthenticationTypeSignup(option);
	}
	
}
