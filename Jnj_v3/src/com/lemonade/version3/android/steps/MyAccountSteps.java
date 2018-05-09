package com.lemonade.version3.android.steps;

import com.lemonade.version3.android.pages.MyAccountPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class MyAccountSteps {

	MyAccountPageAndroid myAccount = new MyAccountPageAndroid();
	
	@QAFTestStep(description = "user verify my account screen using {0}")
	public void verifyMyAccountScreen(Object userDetail) {
		myAccount.verifyMyAccountPage(userDetail);
	}
	
	@QAFTestStep(description = "user verify Opt-in selection my account page")
	public void verifyCheckBoxselection() {
		myAccount.OptinCheckBox();
	}
	
	@QAFTestStep(description = "user select opt-in in my account screen")
	public void selectOptIn() {
		myAccount.selectOptin();
	}
	@QAFTestStep(description = "user enable keep me login button")
	public void enableKeepMeLoginSwtch() {
		myAccount.enableKeepMeLoginSwitch();
	}
}
