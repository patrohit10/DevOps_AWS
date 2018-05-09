package com.lemonade.version3.iOS.steps;

import com.lemonade.version3.iOS.pages.MoremenuPageIOS;
import com.lemonade.version3.iOS.pages.MySettingsPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class MoremenuIOSStep {
	
	MoremenuPageIOS moreMenuPage= new MoremenuPageIOS();
	
	@QAFTestStep(description = "user verify available options in More menu")
	public void verifyMoreMenuElements() {
		moreMenuPage.verifyMoreMenu();
	}
	
	@QAFTestStep(description = "user clicks on My Settings") 
	 public void clickMySettings() {
		moreMenuPage.clickMySetting();
	}
	 
	@QAFTestStep(description = "user clicks on Terms Of Use link and verify")
	public void clickOnTermsOfUse() {
		moreMenuPage.clickAndVerifyTermsOfUseScreen();
	}
	@QAFTestStep(description = "user clicks Privacy Policy link and verify")
	public void clickOnPrivacyPolicy() {
		moreMenuPage.clickAndVerifyPrivecyPilicyScreen();
	}
	@QAFTestStep(description = "user verify Contact Us page")
	public void clickOnContactusScreen() {
		moreMenuPage.verifyContactUsScreen();
	}
	
	@QAFTestStep(description="user clicks and verify Email customer service")
	public void clickEmail(){
		moreMenuPage.clickEmailToVerify();
	}
	@QAFTestStep(description="user select Contact Us")
	public void clickContactUs(){
		moreMenuPage.clickContactUsPage();
	}
	@QAFTestStep(description = "user clicks on logout button")
	public void clickOnLogoutBtn() {
		moreMenuPage.clickonLogoutBtn();
	}
	@QAFTestStep(description = "user verify my meter screen in more menu")
	public void verifyMyMeterScreen() {
		moreMenuPage.verifyMyMeterScreen();
	}
	@QAFTestStep(description = "user set up a new reminder")
	public void setupNewReminder(String option) {
		moreMenuPage.setSnackReminder(option);
	}
	@QAFTestStep(description = "user create a new reminder type")
	public void setNewReminderType() {
		moreMenuPage.addNewReminderType();
	}
	@QAFTestStep(description = "user verify reminder screens")
	public void verifyiesReminderScreens() {
		moreMenuPage.verifyReminderScreens();
	}

	@QAFTestStep(description="user calls customer service centre")
	public void callCustomer(){
		moreMenuPage.callCustomerCare();
	}
	@QAFTestStep(description="user visits application website")
	public void visitSite(){
	moreMenuPage.visitApplicationSite();
	}

	@QAFTestStep(description="user clicks Rate app link")
	public void rateApp(){
	moreMenuPage.rateApplication();
	}
	
	@QAFTestStep(description = "user clicks on My Meters")
	public void clickMyMeters() {
		moreMenuPage.clickMyMeters();
	}
	@QAFTestStep(description = "user verifies My Meters page UI") 
	public void verifyMyMetersPageUI() {
		moreMenuPage.verifyMyMeterScreen();
	}
	
	@QAFTestStep(description = "user taps time update switch")
	public void tapTimeUpdate() {
		moreMenuPage.timeUpdate();
}
	@QAFTestStep(description = "user clicks Connections")
	public void clickConnections() {
		moreMenuPage.clickConnections();
	}
	@QAFTestStep(description = "user verifies Connections page")
	public void verifyConnectionsPage() {
		moreMenuPage.verifyConnetionsPage();
	}
	@QAFTestStep(description = "user verifies returning to more menu")
	public void verifyMoreMenuHeader() {
		moreMenuPage.verifyMoreMenuHeader();
	}
	@QAFTestStep(description = "user clicks back button")
	public void clickBackButton() {
		moreMenuPage.ToClickBackBtn();
	}
	@QAFTestStep(description = "user toggle apple health switch")
	public void ToggleAppleHealthSwitch() {
		moreMenuPage.ToogleAppleHealthSwtch();
	}
	@QAFTestStep(description = "user enter and verify invalid clinic code")
	public void VerifyInvalidOfficeCode() {
		moreMenuPage.incorrectClinicCode();
	}
	@QAFTestStep(description = "user verify invalid clinic code format")
	public void VerifyInvalidOfficeCodeFormats() {
		moreMenuPage.incorrectClinicCodeFormat();
	}
	@QAFTestStep(description = "user clicks help option")
	public void clicksHelpOption() {
		moreMenuPage.clickHelpOption();
	}
	
	@QAFTestStep(description="user set up a new reminder using {0}")
	public void setupReminder(String option){
		moreMenuPage.setSnackReminder(option);
	}
	@QAFTestStep(description = "walgreen user verify default status of walgreen switch is on")
	public void verifywalgreenSwitchDefaultOn() {
		moreMenuPage.verifyWalgreenUserSwitch();
	}
	@QAFTestStep(description = "walgreen user try to switch off walgreen switch")
	public void switchingOffWalgreenSwitch() {
		moreMenuPage.verifyWalgreenUserSwitchOff();
	}
	@QAFTestStep(description = "user add office using {0}")
	public void addOfficeNew(Object clinicDetail) {
		moreMenuPage.validClinicCode(clinicDetail);
	}
	@QAFTestStep(description = "user clicks on My Account")
	public void clickOnMyAccount() {
		moreMenuPage.clickMyAccount();
	}
	@QAFTestStep(description = "user clicks on My Reminder")
	public void clickOnMyReminder() {
		moreMenuPage.clickOnReminderFromMoreMenu();
	}
	@QAFTestStep(description = "user verify reminder type name allowed length")
	public void veriyfyReminderTypeNameLength() {
		moreMenuPage.verifyReminderTypeFieldMaxLength();
	}
	@QAFTestStep(description = "user verify description length past time not allowed for reminder picker")
	public void descLengthAndReminderPastTime() {
		moreMenuPage.verifydescriptionLengthAndReminderTimePast();
	}
	@QAFTestStep(description = "user clicks on more menu back button")
	public void clickMoremunuBack() {
		moreMenuPage.ToClickBackBtn2();
	}
	@QAFTestStep(description = "user go through reminder screen")
	public void reminderScreenss() {
		moreMenuPage.reminderscreens();
	}
	@QAFTestStep(description = "user go through setting screen")
	public void settingScreenss() {
		moreMenuPage.mySettingScreen();
	}
	@QAFTestStep(description = "user click clinic code button")
	public void clickCliniCode() {
		moreMenuPage.clickAndVerifyClinicCodeScreen();
	}
	
	@QAFTestStep(description = "non walgreen user connect walgreen using {0}")
	public void addNonwalgreenUserToWalgreen(Object userDetails) {
		moreMenuPage.addNonwalgreenUserToWalgreen(userDetails);
	}
	@QAFTestStep(description = "user enter and verify other country clinic code")
	public void ohterCountryClinicCodes() {
		moreMenuPage.ohterCountryClinicCode();
	}
	@QAFTestStep(description="user verifies toggle button to sync my readings")
	public void verifySyncReadingToggleButton() {
		moreMenuPage.verifyToggleButton();
	}
	@QAFTestStep(description="user verifies toggle button to be disabled")
	public void verifyToggleButtonToBeDisabled(){
		moreMenuPage.verifyToggleButtonDisabled();
	}
	@QAFTestStep(description="user verifies toggle button is ON")
	public void verifySyncReadingToggleButtonON() {
		moreMenuPage.verifyToggleButtonON();
	}
	@QAFTestStep(description="user verify Rate us label")
	public void verifyRateUslabel() {
		moreMenuPage.verifyRateUsLabel();
	}
	
	@QAFTestStep(description = "user click to pair meter")
	public void pairMeter(){
		moreMenuPage.clickToPairMeter();
	}
	@QAFTestStep(description="user navigates to homepage")
	public void navigateHomepage(){
		moreMenuPage.navigateToHomepage();
	}
}
