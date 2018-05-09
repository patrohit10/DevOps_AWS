package com.lemonade.version3.iOS.steps;

import com.lemonade.version3.iOS.pages.MyAccountPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class MyAccountIOSStep {
	
	MyAccountPageIOS myAccount= new MyAccountPageIOS();
	
	@QAFTestStep(description = "user verify my account screen using {0}")
	public void verifyMyAccountScreen(Object userDetail) {
		myAccount.verifyMyAccountPage(userDetail);
	}
	@QAFTestStep(description = "user select opt-in in my account screen")
	public void selectOptIn() {
		myAccount.selectOptin();
	}
	@QAFTestStep(description = "user verify Opt-in selection my account page")
	public void verifyCheckBoxselection() {
		myAccount.OptinCheckBox();
	}

}
