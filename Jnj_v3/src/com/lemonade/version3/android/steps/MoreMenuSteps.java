package com.lemonade.version3.android.steps;

import com.lemonade.version3.android.pages.MoreMenuPageAndroid;
import com.lemonade.version3.android.pages.MySettingPageAndroid;
import com.lemonade.version3.iOS.pages.MySettingsPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class MoreMenuSteps {
	MoreMenuPageAndroid moreMenu = new MoreMenuPageAndroid();
	@QAFTestStep(description="user select Contact Us")
	public void selectContactUs(){
		moreMenu.clickContactUs();
	}

	
	@QAFTestStep(description="user verify available options in More menu")
	public void veriyMoreMenu(){
		moreMenu.verifyMenu();
	}
	
	@QAFTestStep(description="user clicks on Terms Of Use link and verify")
	public void verifyTermsOfUse(){
		moreMenu.verifyTermsOfUsePage();
	}
	
	@QAFTestStep(description="user clicks Privacy Policy link and verify")
	public void verifyPrivacyPolicy(){
		moreMenu.verifyPrivacyPolicyPage();
	}

	@QAFTestStep(description = "user clicks on My Meters")
	public void clickMyMeters() {
		moreMenu.clickMyMeters();
	}

        @QAFTestStep(description = "user clicks on My Settings")
	public void clickMySettings() {
		moreMenu.clickMySetting();
	}
	
	@QAFTestStep(description = "user clicks Connections")
	public void clickConnections() {
		moreMenu.clickConnections();
	}
	
//	@QAFTestStep(description = "user takes screenshots of Connections page")
//	public void screenShotsConnectionsPage() {
//		moreMenu.takeScreenshotsConnetionsPage();
//	}
	
	@QAFTestStep(description = "user verifies Connections page")
	public void verifiesConnectionPage() {
		moreMenu.takeScreenshotsConnetionsPage();
	}
	
	
	@QAFTestStep(description="user enter and verify invalid clinic code")
	public void clickAddOfficeInvalidCode(){
		moreMenu.enterAndVerifyInvalidOfficeCode();
	}
	
	@QAFTestStep(description="user verify invalid clinic code format")
	public void VerifyInvalidOfficeCodeFormats() {
		moreMenu.incorrectClinicCodeFormat();
	} 
	@QAFTestStep(description="user clicks help option")
	public void clickHelpOption(){
		moreMenu.clickHelp();
	}
	@QAFTestStep(description = "user clicks on logout button")
	public void clickOnLogoutBtn() {
		moreMenu.clickonLogoutBtn();
	}
	
	
	
	@QAFTestStep(description="user set up a new reminder using {0}")
	public void setupReminder(String option){
		moreMenu.setSnackReminder(option);
	}
	
	@QAFTestStep(description = "user create a new reminder type")
	public void setNewReminderType() {
		moreMenu.addNewReminderType();
	}
	@QAFTestStep(description = "user verify reminder screens")
	public void verifyiesReminderScreens() {
		moreMenu.verifyReminderScreens();
	}
	@QAFTestStep(description = "user add office using {0}")
	public void addOfficeForHCP(Object clinicDetail) {
		moreMenu.enterAndVerifyValidOfficeCode(clinicDetail);
	}
	
	@QAFTestStep(description = "user clicks on My Account")
	public void clickOnMyAccount() {
		moreMenu.clickMyAccount();
	}
	
	@QAFTestStep(description = "user clicks on My Reminder")
	public void clickOnMyReminder() {
		moreMenu.clickOnReminderFromMoreMenu();
	}
	
	
	@QAFTestStep(description = "user verify reminder type name allowed length")
	public void veriyfyReminderTypeNameLength() {
		moreMenu.verifyReminderTypeFieldMaxLength();
	}
	
	@QAFTestStep(description = "walgreen user verify default status of walgreen switch is on")
	public void verifywalgreenSwitchDefaultOn() {
		moreMenu.verifyWalgreenUserSwitch();
	}
	
	@QAFTestStep(description = "user verify description length past time not allowed for reminder picker")
	public void descLengthAndReminderPastTime() {
		moreMenu.verifydescriptionLengthAndReminderTimePast();
	}
	
	@QAFTestStep(description = "user go through reminder screen")
	public void reminderScreenss() {
		moreMenu.reminderscreens();
	}
	
	@QAFTestStep(description = "user go through setting screen")
	public void settingScreenss() {
		moreMenu.mySettingScreen();
	}
	
	@QAFTestStep(description = "user enter and verify other country clinic code")
	public void ohterCountryClinicCodes() {
		moreMenu.otherCountryClinicCode();
	}
	@QAFTestStep(description = "walgreen user try to switch off walgreen switch")
	public void switchingOffWalgreenSwitch() {
		moreMenu.verifyWalgreenUserSwitchOff();
	}
		
	@QAFTestStep(description = "non walgreen user connect walgreen using {0}")
	public void addNonwalgreenUserToWalgreen(Object userDetail) {
		moreMenu.addNonwalgreenUserToWalgreen(userDetail);
	}
	
	@QAFTestStep(description="user verifies toggle button to sync my readings")
	public void verifySyncReadingToggleButton() {
		moreMenu.verifyToggleButton();
	}
	@QAFTestStep(description="user verifies toggle button to be disabled")
	public void verifyToggleButtonToBeDisabled(){
		moreMenu.verifyToggleButtonDisabled();
	}
	@QAFTestStep(description="user verifies toggle button is ON")
	public void verifySyncReadingToggleButtonON() {
		moreMenu.verifyToggleButtonON();
	}
}
