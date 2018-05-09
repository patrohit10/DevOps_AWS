package com.lemonade.version3.android.steps;

import com.lemonade.version3.android.pages.MyMeters;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class MyMetersSteps {
	MyMeters myMetersPage = new MyMeters();
	@QAFTestStep(description = "user verifies My Meters page UI") 
		public void verifyMyMetersPageUI() {
			myMetersPage.myMetersUI();
	}
	
	@QAFTestStep(description = "user taps time update switch")
		public void tapTimeUpdate() {
		myMetersPage.timeUpdate();
	}
	
	@QAFTestStep(description = "user click to pair meter")
	public void pairMeter(){
		myMetersPage.clickToPairMeter();
		
	}
	
	@QAFTestStep(description="user navigates to homepage")
	public void navigateHomepage(){
		myMetersPage.navigateToHomepage();
	}
	
	
}
	
	
