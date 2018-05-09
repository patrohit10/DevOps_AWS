package com.lemonade.version3.android.steps;

import com.lemonade.version3.android.pages.MySettingPageAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class MySettingSteps {

	MySettingPageAndroid mySettingPage = new MySettingPageAndroid();
	
	@QAFTestStep(description = "user verifies My Settings page UI") 
	public void verifyMySettingsPageUI() {
		mySettingPage.verifyMySettingUI();
	}
	
	@QAFTestStep(description = "user clicks on Male button") 
	public void clickOnMale() {
		mySettingPage.clickOnMaleButton();
	}
	
	@QAFTestStep(description = "user verifies Male button selected") 
	public void verifyMaleButtonSelected() {
		mySettingPage.verifySelectedMaleButton();
	}
	
	@QAFTestStep(description = "user clicks on Female button") 
	public void clickOnFeMale() {
		mySettingPage.clickOnFemaleButton();
	}
	
	@QAFTestStep(description = "user verifies Female button seleced") 
	public void verifyFeMaleButtonSelected() {
		mySettingPage.verifySelectedFemaleButton();
	}
	
	/*@QAFTestStep(description = "user select the checkboxes for Diabetes Management questions") 
	public void selectCheckboxesForDiabetisQstn() {
		mySettingPage.clickOnAllCheckboxes();
	}*/
	
	@QAFTestStep(description = "user verify selected checkboxes") 
	public void verifySelectedCheckboxes() {
		mySettingPage.verifySelectedCheckboxes();
	}
	
	@QAFTestStep(description = "user select the checkboxes for Diabetes Management questions") 
	public void checkAllSelectedCheckboxes() {
		mySettingPage.checkAllCheckboxes();
	}
	
	@QAFTestStep(description="user uncheck the checkboxes")
	public void uncheckAllSelectedCheckboxes() {
		mySettingPage.uncheckAllCheckboxes();
	}
	
	@QAFTestStep(description = "user make meal tagging switch {0}") 
	  public void verifyMealTagging(String option) {
	   mySettingPage.checkMealTaggingandClick(option);
	   Reporter.logWithScreenShot("meal tagging swich clicked", MessageTypes.Pass);
	  }
	
	@QAFTestStep(description = "user set the High BG range equal to Low BG Range value") 
	public void SetHighBGValue() {
		mySettingPage.setHighBGValueToLow();
	}
	@QAFTestStep(description = "user set the low BG range equal to high BG Range value") 
	public void SetLowBGValue() {
		mySettingPage.setLowBGValueTOHigh();
	}
	@QAFTestStep(description = "user verify BG value") 
	public void VerifyBGValue() {
		mySettingPage.VerifyBGValue();
	}
	
	@QAFTestStep(description = "user change Bg value") 
	public void changeBgValu() {
		mySettingPage.changeBgValue();
	}
	
	@QAFTestStep(description = "user redirect to setting Page") 
	public void verifyMySettingsPage() {
		mySettingPage.verifyMySettingUI();
	}
	
	@QAFTestStep(description = "user click on Begin time in Time of Day of Breakfast") 
	public void clickBeginTime() {
		mySettingPage.clickBeginTime();
	}
	
	@QAFTestStep(description = "user verify default ranges for Time of Day") 
	public void verifyDefaultRangeTOD() {
		mySettingPage.verifyDefaultRangeTOD();
	}
	
	//21march Gaurav Bhamare
	@QAFTestStep(description = "user clicks on insulin switch")
	public void clickOnInsulinSwitch() {
		mySettingPage.clickInsuliSwitch();
	}
	
	@QAFTestStep(description = "user set bg low and high overall value")
	public void setLowHighOverallValue() {
		mySettingPage.setLowHighOverallBG();
	}
	@QAFTestStep(description = "user change bg low and high overall value")
	public void changeLowHighOverallValue() {
		mySettingPage.chsngeLowHighOverallBG();
	}
	@QAFTestStep(description = "user set over all bg range low {0} high {1}")
	public void editBeforeAfterBGRangeALl(String low,String high) {
		mySettingPage.chsngeLowHighOverallBGs(low ,high);
	}

	@QAFTestStep(description = "user verify canada unit as mmol/L setting screen")
	public void canadaUnitSettingPage() {
		mySettingPage.verifyCandammol();
	}
	
	@QAFTestStep(description = "user navigates to page settings menu opened from")
	public void navigateBackFromSettings() {
		mySettingPage.navigateBackFromSettings();
	}
	
	@QAFTestStep(description = "user edit before after bg range")
	public void editBeforeAfterBGRange() {
		mySettingPage.setBGBeforeAndAfter();
	}
	@QAFTestStep(description = "user change Begin time")
	public void changeBeginTime() {
		mySettingPage.changeBeginTime();
	}
	

	
}
