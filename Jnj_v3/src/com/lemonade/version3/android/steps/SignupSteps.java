package com.lemonade.version3.android.steps;

import com.lemonade.version3.android.pages.CountrySelectionPageAndroid;
import com.lemonade.version3.android.pages.SignupPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class SignupSteps {
	
	SignupPageAndroid signupPageAndroid = new SignupPageAndroid();
	CountrySelectionPageAndroid countryselectionpage = new CountrySelectionPageAndroid();
	@QAFTestStep(description="user clicks on signup button")
	public void clickSignUp(){
		signupPageAndroid.clickSignUpButton();
	}
	
	@QAFTestStep(description="user clicks on {0} link on Create Account page to verify")
	public void clickTerms(String option) {
		signupPageAndroid.clickTerms(option);
	}
	@QAFTestStep(description = "user click on skip button")
	public void clickOnSkipBtn() {
		signupPageAndroid.clickSkipBtn();
	}
	
	/*@QAFTestStep(description="user opens app without allowing notification")
	public void openAppWithoutAllowingNotify() {
		signupPageAndroid.openAppWithoutNotification();
	}*/

	@QAFTestStep(description="user enters signup details using {0}")
	public void fillDetails(Object userDetails){
		signupPageAndroid.fillSignUpDetails(userDetails);
	}
	
	@QAFTestStep(description="user enters signup details without firstname using {0}")
	public void fillDeatilsWithoutFirstName(Object userDetail){
		signupPageAndroid.doSignUpWithoutFirstName(userDetail);
	}
	
	@QAFTestStep(description="user enters signup details without lastname using {0}")
	public void fillDeatilsWithoutLastName(Object userDetail){
		signupPageAndroid.doSignUpWithoutLastName(userDetail);
	}
	
	@QAFTestStep(description="user enters signup details with birthdate under age using {0}")
	public void fillDetailsWithBirthdateBelowAge(Object userDetail){
		signupPageAndroid.doSignUpWithDateBelowAge(userDetail);
	}
	
	@QAFTestStep(description="user enters signup details without birthdate using {0}")
	public void fillDetailsWithoutBirthdate(Object userDetail){
		signupPageAndroid.fillDetailsWithoutBirthday(userDetail);
	}
	
	@QAFTestStep(description="user enters signup details without TOU using {0}")
	public void verifySignupWithoutTOUCheckbox(Object userDetail){
		signupPageAndroid.fillSignUpDetailsWithoutChckbox(userDetail);
	}
	
	@QAFTestStep(description="user enters signup details without emailId using {0}")
	public void signUpFlowWithoutEmail(Object userDetail){
		signupPageAndroid.fillRandomSignUpDetailsWithoutEmail(userDetail);
	}
	
	@QAFTestStep(description="Signup details with invalid user id and email length more than 75 chars using {0}")
	public void signUpFlowWithInvalidEmail(Object userDetail){
		signupPageAndroid.fillDetailsWithInvalidEmails(userDetail);
	}
	
	@QAFTestStep(description="Signup details with email and confirm email validation using {0}")
	public void emailConfirmEmailValidation(String option){
		signupPageAndroid.emailValidations(option);
	}
	
	@QAFTestStep(description="Signup details without password using {0}")
	public void signupDetailsWithoutPassword(String option){
		signupPageAndroid.noPasswordToFill(option);
	}
	
	@QAFTestStep(description="Signup details with invalid password and less than 16 chars using {0}")
	public void signupDetailsWithInvalidPasword(String option){
		signupPageAndroid.invalidPasswordEntry(option);
	}
	
	@QAFTestStep(description="Signup details with already registered email id using {0}")
	public void signupDetailsWithSamemailId(String option){
		signupPageAndroid.repeatedMailIdSignupFlow(option);
	}
	
	@QAFTestStep(description="user enters signup details with invalid clinic code using {0}")
	public void signupDetailsWithInvalidClinicCode(String option){
		signupPageAndroid.signUpDetailsWithInvalidClinicCode(option);
	}
	
	@QAFTestStep(description="user select opt-in as {0} in sign up page")
	public void selectOptInSignup(String option){
		signupPageAndroid.selectionOfOptin(option);
	}
	@QAFTestStep(description="user clicks login link")
	public void clickLoginLink() {
		countryselectionpage.clickLogin();
	}
	@QAFTestStep(description="user clicks back button")
	public void clickDeviceBackButton() {
		countryselectionpage.clickBackButton();
	}
	@QAFTestStep(description="Sign up negetive positive screenshot using {0}")
	 public void signupScreenShot(Object userDetails){
		signupPageAndroid.signupsecondPageScreen(userDetails);
	 }
	
	@QAFTestStep(description="user enters hcp details for validations using {0}")
	public void hcpUserTOUUnchecked(Object userDetails){
		signupPageAndroid.fillHCPDetails(userDetails);
	}
	@QAFTestStep(description="user verify blank email field using {0}")
	public void hcpBlankMail(Object userDetails){
		signupPageAndroid.verifyBlankMail(userDetails);
	}
	
	@QAFTestStep(description="HCP usre set reset password using {0}")
	public void fillResetPasswordDetails(Object userDetails){
		signupPageAndroid.addresetPasswordDetailHCP(userDetails);
	}
	
	@QAFTestStep(description="user verify invalid and other country clinic code using {0}")
	public void verifyInvalidClinicCode(Object option){
		signupPageAndroid.verifyInvalidClinicCode(option);
	}
	
	@QAFTestStep(description="user select UOM as {0}")
	public void selectUOMASMGDL(String option){
		signupPageAndroid.selectUOM(option);
	}
	@QAFTestStep(description="user verify invalid First and Last Name")
	public void verifyInvalidCharactersForFirstsNameandLastName() {
		signupPageAndroid.veriyFirstAndLastName();
	}
	@QAFTestStep(description="user verify exact 18 date of birth is allowed")
	public void exactDateOfBirthAllowed() {
		signupPageAndroid.setYear();
	}
	@QAFTestStep(description = "user select authentication type as {0} on sign up")
	public void selectAuthanticationTypeAndroid(String option) {
		signupPageAndroid.clickOnAuthenticationTypeSignup(option);
	}
	@QAFTestStep(description="user click on create account button")
	public void clickOnCreateAccountButtonAndroid() {
		signupPageAndroid.clicksOnCreateAccountButton();
	}
	@QAFTestStep(description="user verifies touch id option present")
	public void verifyTouchIDOptionAndroid() {
		signupPageAndroid.verifiesTouchIDOption();
	}
}
