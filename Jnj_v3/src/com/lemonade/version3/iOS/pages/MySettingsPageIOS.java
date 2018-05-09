package com.lemonade.version3.iOS.pages;

import org.hamcrest.Matchers;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.apache.commons.lang.RandomStringUtils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import java.util.List;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class MySettingsPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	MoremenuPageIOS moreMenuIos = new MoremenuPageIOS();

	@FindBy(locator = "otrios.mysettingpage.genderMale.btn")
	private QAFWebElement otriosMysettingpageGenderMaleBtn;

	@FindBy(locator = "otrios.mysettingpage.genderFemale.btn")
	private QAFWebElement otriosMysettingpageGenderFemaleBtn;

	@FindBy(locator = "otrios.mysettingpage.highRange.btn")
	private QAFWebElement otriosMysettingpageHighRangeBtn;

	@FindBy(locator = "otrios.mysettingpage.lowRange.btn")
	private QAFWebElement otriosMysettingpageLowRangeBtn;
	@FindBy(locator = "otrios.mysettingpage.mealTagging.swch")
	private QAFWebElement otriosMysettingpageMealTaggingSwch;

	@FindBy(locator = "otrios.mysettingpage.beforeMeal.btn")
	private QAFWebElement otriosMysettingpageBeforeMealBtn;

	@FindBy(locator = "otrios.mysettingpage.afterMeal.btn")
	private QAFWebElement otriosMysettingpageAfterMealBtn;

	@FindBy(locator = "otrios.mysettingpage.beforeMealRangeDone.btn")
	private QAFWebElement otriosMysettingpagBeforeMealRangeDoneBtn;
	@FindBy(locator = "otrios.mysettingpage.beforeMealLowLimit.txt")
	private QAFWebElement otriosMysettingpagBeforeMealLowLimitTxt;

	@FindBy(locator = "otrios.mysettingpage.AfterMealRangeDone.btn")
	private QAFWebElement otriosMysettingpagAfterMealRangeDoneBtn;

	@FindBy(locator = "otrios.mysettingpage.AfterMealLowLimit.txt")
	private QAFWebElement otriosMysettingpagAfterMealLowLimitTxt;

	@FindBy(locator = "otrios.mysettingpage.beforeAfterMealLeftArrow.btn")
	private QAFWebElement otriosMysettingpagBeforeAfterMealLeftArrowBtn;

	@FindBy(locator = "otrios.mysettingpage.beforeAfterMealRightArrow.btn")
	private QAFWebElement otriosMysettingpagBeforeAfterMealRightArrowBtn;

	@FindBy(locator = "otrios.mysettingpage.back.btn")
	private QAFWebElement otriosMysettingpageBackBtn;

	@FindBy(locator = "otrios.mysettingpage.mealTagging.btm")
	private QAFWebElement otriosMysettingpageMealTaggingBtm;

	@FindBy(locator = "otrios.mysettingpage.watchDiat.chckbox")
	private QAFWebElement otriosMysettingpageWatchDiatChckbox;

	@FindBy(locator = "otrios.mysettingpage.OralMedication.chckbox")
	private QAFWebElement otriosMysettingpageOralMedicationChckbox;

	@FindBy(locator = "otrios.mysettingpage.injectmedication.chckbox")
	private QAFWebElement otriosMysettingpageInjectmedicationChckbox;

	@FindBy(locator = "otrios.mysettingpage.longeractioninsuline.chckbox")
	private QAFWebElement otriosMysettingpageLongeractioninsulineChckbox;

	@FindBy(locator = "otrios.mysettingpage.mixedinsuline.chckbox")
	private QAFWebElement otriosMysettingpageMixedinsulineChckbox;

	@FindBy(locator = "otrios.mysettingpage.rapidactioninsuline.chckbox")
	private QAFWebElement otriosMysettingpageRapidactioninsulineChckbox;

	@FindBy(locator = "otrios.mysettingpage.insulinePump.chckbox")
	private QAFWebElement otriosMysettingpageInsulinePumpChckbox;

	@FindBy(locator = "otrios.mysettingpage.beforemeal.picker")
	private QAFWebElement otriosMysettingpageBeforemealPicker;
	@FindBy(locator = "otrios.mysettingpage.Done")
	private List<QAFWebElement> otriosMysettingpageBeforemealDoneBtnList;
	@FindBy(locator = "otrios.mysettingpage.beforemeal.backarrow.btn")
	private QAFWebElement otriosMysettingpageBeforemealBackarrowBtn;
	@FindBy(locator = "otrios.mysettingpage.beforemeal.forwardarrow.btn")
	private QAFWebElement otriosMysettingpageBeforemealForwardarrowBtn;
	@FindBy(locator = "otrios.mysettingpage.beforemeal.forwardarrow.btn")
	private List<QAFWebElement> otriosMysettingpageBeforemealForwardarrowBtnList;
	@FindBy(locator = "otrios.mysettingpage.beforemeal.range text.lbl")
	private QAFWebElement otriosMysettingpageBeforemealRangeLbl;
	@FindBy(locator = "otrios.mysettingpage.aftermeal.range text.lbl")
	private QAFWebElement otriosMysettingpageAfteremealRangeLbl;
	@FindBy(locator = "otrios.mysettingpage.Done")
	private List<QAFWebElement> otriosMysettingpageDone;
	@FindBy(locator = "otrios.mysettingpage.timeOfDay.Breakfast")
	private QAFWebElement otriosMysettingpageTimeOfDayBreakfast;
	@FindBy(locator = "otrios.mysettingpage.timeOfDay.Hour")
	private QAFWebElement otriosMysettingpageTimeOfDayHour;
	@FindBy(locator = "otrios.mysettingpage.timeOfDay.Min")
	private QAFWebElement otriosMysettingpageTimeOfDayMin;
	@FindBy(locator = "otrios.mysettingpage.timeOfDay.Lunch.begin")
	private QAFWebElement otriosMysettingpageTimeOfDayLunchBegin;

	@FindBy(locator = "otrios.mysettingpage.timeOfDay.over.begin")
	private QAFWebElement otriosMysettingpageTimeOfDayOverBegin;

	@FindBy(locator = "otrios.mysettingpage.timeOfDay.over.end")
	private QAFWebElement otriosMysettingpageTimeOfDayUverEnd;

	@FindBy(locator = "otrios.mysettingpage.timeOfDay.Lunch.end")
	private QAFWebElement otriosMysettingpageTimeOfDayLunchEnd;
	@FindBy(locator = "otrios.mysettingpage.timeOfDay.Breakfast.end")
	private QAFWebElement otriosMysettingpageTimeOfDayBreakfastEnd;
	@FindBy(locator = "otrios.mysettingpage.timeOfDay.Breakfast.lbl")
	private QAFWebElement otriosMysettingpageTimeOfDayBreakfastLbl;
	@FindBy(locator = "otrios.mysettingpage.insulin.btn")
	private QAFWebElement otriosMysettingpageInsulinSwitch;
	
	@FindBy(locator = "otrios.mysettingpage.beforemeal.picker2")
	private QAFWebElement otriosMysettingpageBeforemealPicker2;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	public QAFWebElement getotriosMysettingpageBeforemealPicker2() {
		return otriosMysettingpageBeforemealPicker2;
	}

	public QAFWebElement getotriosMysettingpageInsulinSwitch() {
		return otriosMysettingpageInsulinSwitch;
	}

	public QAFWebElement getotriosMysettingpageAfteremealRangeLbl() {
		return otriosMysettingpageAfteremealRangeLbl;
	}

	public QAFWebElement getotriosMysettingpageBeforemealRangeLbl() {
		return otriosMysettingpageBeforemealRangeLbl;
	}

	public QAFWebElement getotriosMysettingpageGenderMaleBtn() {
		return otriosMysettingpageGenderMaleBtn;
	}

	public QAFWebElement getotriosMysettingpageGenderFemaleBtn() {
		return otriosMysettingpageGenderFemaleBtn;
	}

	public QAFWebElement getotriosMysettingpageHighRangeBtn() {
		return otriosMysettingpageHighRangeBtn;
	}

	public QAFWebElement getotriosMysettingpageLowRangeBtn() {
		return otriosMysettingpageLowRangeBtn;
	}

	public QAFWebElement getotriosMysettingpageMealTaggingSwch() {
		return otriosMysettingpageMealTaggingSwch;
	}

	public QAFWebElement getotriosMysettingpageBeforeMealBtn() {
		return otriosMysettingpageBeforeMealBtn;
	}

	public QAFWebElement getotriosMysettingpageAfterMealBtn() {
		return otriosMysettingpageAfterMealBtn;
	}

	public QAFWebElement getotriosMysettingpagBeforeMealRangeDoneBtn() {
		return otriosMysettingpagBeforeMealRangeDoneBtn;
	}

	public QAFWebElement getotriosMysettingpagBeforeMealLowLimitTxt() {
		return otriosMysettingpagBeforeMealLowLimitTxt;
	}

	public QAFWebElement getotriosMysettingpagAfterMealRangeDoneBtn() {
		return otriosMysettingpagAfterMealRangeDoneBtn;
	}

	public QAFWebElement getotriosMysettingpagAfterMealLowLimitTxt() {
		return otriosMysettingpagAfterMealLowLimitTxt;
	}

	public QAFWebElement getotriosMysettingpagBeforeAfterMealLeftArrowBtn() {
		return otriosMysettingpagBeforeAfterMealLeftArrowBtn;
	}

	public QAFWebElement getotriosMysettingpagBeforeAfterMealRightArrowBtn() {
		return otriosMysettingpagBeforeAfterMealRightArrowBtn;
	}

	public QAFWebElement getotriosMysettingpageBackBtn() {
		return otriosMysettingpageBackBtn;
	}

	public QAFWebElement getotriosMysettingpageMealTaggingBtm() {
		return otriosMysettingpageMealTaggingBtm;
	}

	public QAFWebElement getotriosMysettingpageWatchDiatChckbox() {
		return otriosMysettingpageWatchDiatChckbox;
	}

	public QAFWebElement getotriosMysettingpageOralMedicationChckbox() {
		return otriosMysettingpageOralMedicationChckbox;
	}

	public QAFWebElement getotriosMysettingpageInjectmedicationChckbox() {
		return otriosMysettingpageInjectmedicationChckbox;
	}

	public QAFWebElement getotriosMysettingpageLongeractioninsulineChckbox() {
		return otriosMysettingpageLongeractioninsulineChckbox;
	}

	public QAFWebElement getotriosMysettingpageMixedinsulineChckbox() {
		return otriosMysettingpageMixedinsulineChckbox;
	}

	public QAFWebElement getotriosMysettingpageRapidactioninsulineChckbox() {
		return otriosMysettingpageRapidactioninsulineChckbox;
	}

	public QAFWebElement getotriosMysettingpageInsulinePumpChckbox() {
		return otriosMysettingpageInsulinePumpChckbox;
	}

	public QAFWebElement getotriosMysettingpageBeforemealPicker() {
		return otriosMysettingpageBeforemealPicker;
	}

	public List<QAFWebElement> getotriosMysettingpageDone() {
		return otriosMysettingpageDone;
	}

	public List<QAFWebElement> getotriosMysettingpageBeforemealDoneBtnList() {
		return otriosMysettingpageBeforemealDoneBtnList;
	}

	public QAFWebElement getotriosMysettingpageBeforemealBackarrowBtn() {
		return otriosMysettingpageBeforemealBackarrowBtn;
	}

	public QAFWebElement getotriosMysettingpageBeforemealForwardarrowBtn() {
		return otriosMysettingpageBeforemealForwardarrowBtn;
	}
	public List<QAFWebElement> getotriosMysettingpageBeforemealForwardarrowBtnList() {
		return otriosMysettingpageBeforemealForwardarrowBtnList;
	}

	public QAFWebElement getotriossettingpageStaticTextlbl(String text) {
		return JNJUtilsIOS.getElement("otrios.mysettingpage.staticText.lbl", text);
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayBreakfast() {
		return otriosMysettingpageTimeOfDayBreakfast;
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayHour() {
		return otriosMysettingpageTimeOfDayHour;
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayMin() {
		return otriosMysettingpageTimeOfDayMin;
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayLunchBegin() {
		return otriosMysettingpageTimeOfDayLunchBegin;
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayOverBegin() {
		return otriosMysettingpageTimeOfDayOverBegin;
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayUverEnd() {
		return otriosMysettingpageTimeOfDayUverEnd;
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayLunchEnd() {
		return otriosMysettingpageTimeOfDayLunchEnd;
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayBreakfastEnd() {
		return otriosMysettingpageTimeOfDayBreakfastEnd;
	}

	public QAFWebElement getotriosMysettingpageTimeOfDayBreakfastLbl() {
		return otriosMysettingpageTimeOfDayBreakfastLbl;
	}
	public QAFWebElement getotriossettingpageDiabetesQuestionchkbox(String text) {
		return JNJUtilsIOS.getElement("otrios.mysettingpage.diabetiesquestion.chk.btn", text);
	}
	public QAFWebElement getotriossettingpageDiabetesQuestionbtn(String text) {
		return JNJUtilsIOS.getElement("otrios.mysettingpage.diabetiesquestion.btn", text);
	}
	public QAFWebElement getotriossettingpageAlertStaticText(String text) {
		return  JNJUtilsIOS.getElement("otrios.mysettingpage.alertbtn.btn", text);
	}
	public QAFWebElement getotriossettingpageOkBtn() {
		return  JNJUtilsIOS.getElement("otrios.mysettingpage.staticText.lbl", JNJUtilsIOS.getPropString("appCommon.ok"));
	}
	public QAFWebElement getotriosMysettingpageBeforemealDoneBtn() {
		return  JNJUtilsIOS.getElement("otrios.mysettingpage.staticText.lbl", JNJUtilsIOS.getPropString("appCommon.done"));
	}
	public QAFWebElement getotriosMysettingpageHighBgValu() {
		return  JNJUtilsIOS.getElement("otrios.mysettingpage.highBgValue.lbl", JNJUtilsIOS.getPropString("appCommon.high"));
	}
	public QAFWebElement getotriosMysettingpageLowBgValue() {
		return  JNJUtilsIOS.getElement("otrios.mysettingpage.lowBgValue.lbl", JNJUtilsIOS.getPropString("appCommon.low"));
	}

	// Method to verify my setting screen
	public void mySettingScreen() {
		Reporter.logWithScreenShot("Setting screen1", MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(300, 800, 443, 500, 50);
		JNJUtilsIOS.pause(2000);
		Reporter.logWithScreenShot("Setting screen2", MessageTypes.Pass);
	}

	// click on setting
	public void verifyMySettingUI() {
		getotriosMysettingpageMealTaggingSwch().waitForPresent();
		getotriosMysettingpageMealTaggingSwch().verifyVisible("My Settings screen");
	}

	public void clickOnMaleButton() {
		String str = "Classic Logbook Meal Settings";
		scrollToElementSettingScreen(getotriosMysettingpageGenderMaleBtn());
		getotriosMysettingpageGenderMaleBtn().click();
//		if (getotriosMysettingpageTimeOfDayBreakfastLbl().isPresent()) {
//			scrollToElementSettingScreen(getotriosMysettingpageGenderMaleBtn());
//			JNJUtilsIOS.pause(1000);
//		}
//		if (getotriosMysettingpageGenderMaleBtn().isPresent()) {
//			getotriosMysettingpageGenderMaleBtn().click();
//		}
	}

	public void verifySelectedMaleButton() {
		getotriosMysettingpageGenderFemaleBtn().click();
		getotriosMysettingpageGenderMaleBtn().click();
		Reporter.logWithScreenShot("Male button is selected", MessageTypes.Pass);
	}

	public void clickOnFemaleButton() {
		if (getotriosMysettingpageGenderFemaleBtn().isPresent()) {
			getotriosMysettingpageGenderFemaleBtn().click();
		}
	}

	public void verifySelectedFemaleButton() {
		getotriosMysettingpageGenderMaleBtn().click();
		getotriosMysettingpageGenderFemaleBtn().click();
		Reporter.logWithScreenShot("Female button is selected", MessageTypes.Pass);

	}

	// for meal tagging
	// Manjushri
	// Edited by Gaurav
	public void checkMealTaggingandClick(String option) {

		option = option.toLowerCase();
		switch (option) {
		case "off":
			if (JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn())) {
				Reporter.logWithScreenShot("Meal Tagging Button is on", MessageTypes.Pass);
				getotriosMysettingpageMealTaggingSwch().click();
				Reporter.logWithScreenShot("Meal Tagging Button is off", MessageTypes.Pass);
			}
			break;
		case "on":
			if (!(JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn()))) {
				Reporter.logWithScreenShot("Meal Tagging Button is off", MessageTypes.Pass);
				getotriosMysettingpageMealTaggingSwch().click();
				Reporter.logWithScreenShot("Meal Tagging Button is on", MessageTypes.Pass);
			}
		}
		

	}

	// Diabetes Management questions
	// Updated by Gaurav Bhamare
	public void verifyDiabeticQuestions() {

		scrollToElementSettingScreen(getotriossettingpageDiabetesQuestionbtn
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		

		WebDriverTestCase.verifyTrue(diabetesChekBoxState(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.dietExercise"))),"Watch diet selected","Watch diet selected");
		WebDriverTestCase.verifyTrue(diabetesChekBoxState(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.oralMedication"))),"Oral medication selected","Oral medication selected");
		WebDriverTestCase.verifyTrue(diabetesChekBoxState(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.injectOther"))),"Inject Medication selected","Inject Medication selected");
		WebDriverTestCase.verifyTrue(diabetesChekBoxState(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.longActing"))),"Long Action insulin selected","Long Action insulin selected");
		WebDriverTestCase.verifyTrue(diabetesChekBoxState(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.mixedInsulin"))),"Mixed Insulin selected","Mixed Insulin selected");
		WebDriverTestCase.verifyTrue(diabetesChekBoxState(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.rapidActing"))),"Rapid Insulin selected","Rapid Insulin selected");
		WebDriverTestCase.verifyTrue(diabetesChekBoxState(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump"))),"Insulin pump selected","Insulin pump selected");
		
	}

	// Low n High BG value
	public void setLowBGValue() {
		
		if (JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn())) {
			getotriosMysettingpageMealTaggingSwch().click();
		}
		getotriosMysettingpageHighBgValu().click();
		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), 110);
		Reporter.logWithScreenShot("Set high BG range", MessageTypes.Pass);
		getotriosMysettingpageBeforemealDoneBtn().click();
		if (JNJUtilsIOS.tryMethod(getotriossettingpageOkBtn())) {
			getotriossettingpageOkBtn().click();
		}
		
		
		getotriosMysettingpageLowBgValue().click();
		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), 110);
		Reporter.logWithScreenShot("Set low BG range", MessageTypes.Pass);
		getotriosMysettingpageBeforemealDoneBtn().click();
		if (JNJUtilsIOS.tryMethod(getotriossettingpageOkBtn())) {
			getotriossettingpageOkBtn().click();
		}
	}
	
	
	public void setHighBGValue() {
		if (JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn())) {
			getotriosMysettingpageMealTaggingSwch().click();
		}
		getotriosMysettingpageLowBgValue().click();
		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), 110);
		Reporter.logWithScreenShot("Set low BG range", MessageTypes.Pass);
		getotriosMysettingpageBeforemealDoneBtn().click();
		if (JNJUtilsIOS.tryMethod(getotriossettingpageOkBtn())) {
			getotriossettingpageOkBtn().click();
		}
		
		getotriosMysettingpageHighBgValu().click();
		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), 110);
		Reporter.logWithScreenShot("Set high BG range", MessageTypes.Pass);
		getotriosMysettingpageBeforemealDoneBtn().click();
		if (JNJUtilsIOS.tryMethod(getotriossettingpageOkBtn())) {
			getotriossettingpageOkBtn().click();
		}
	}

	// Method to set bg before and after value
	// Milan
	
	//INPROGRESS
	public void setBGBeforeAndAfter() {
		Reporter.logWithScreenShot("before updating BG", MessageTypes.Pass);
		//turn meal tagging on if disabled
		if (getotriosMysettingpageBeforeMealBtn().getAttribute("isvisible").toString().equals("false")) {
			getotriosMysettingpageMealTaggingSwch().click();
			Reporter.logWithScreenShot("Meal tagging button is enabled", MessageTypes.Pass);
		}

		getotriosMysettingpageBeforeMealBtn().click();
		
		setBGBeforeAfterMeal("64", "124");

		String rangeBMBG[] = getotriosMysettingpageBeforemealRangeLbl().getAttribute("label").split(" ");
		String bgLowBM = rangeBMBG[0];
		String bghighBM = rangeBMBG[2];
		Validator.verifyThat("Before meal low", bgLowBM, Matchers.equalTo("64"));
		Validator.verifyThat("Before meal high", bghighBM, Matchers.equalTo("124"));
		ConfigurationManager.getBundle().setProperty("BM.BG.range",
				getotriosMysettingpageBeforemealRangeLbl().getAttribute("label"));
		ConfigurationManager.getBundle().setProperty("BM.BG.Low", bgLowBM);
		ConfigurationManager.getBundle().setProperty("BM.BG.High", bghighBM);

		getotriosMysettingpageAfterMealBtn().waitForVisible();
		getotriosMysettingpageAfterMealBtn().click();
		
		Point p1 = getotriosMysettingpageBeforeMealBtn().getLocation();
		JNJUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY() + 130, p1.getX(), p1.getY(), 1100);

		setBGBeforeAfterMeal("71", "175");
		String rangeAMBG[] = getotriosMysettingpageAfteremealRangeLbl().getAttribute("label").split(" ");
		String bgLowAM = rangeAMBG[0];
		String bghighAM = rangeAMBG[2];
		Validator.verifyThat("Note charcter length", bgLowAM, Matchers.equalTo("71"));
		Validator.verifyThat("Note charcter length", bghighAM, Matchers.equalTo("175"));
		ConfigurationManager.getBundle().setProperty("AM.BG.range",
				getotriosMysettingpageAfteremealRangeLbl().getAttribute("label"));
		ConfigurationManager.getBundle().setProperty("AM.BG.Low", bgLowAM);
		ConfigurationManager.getBundle().setProperty("AM.BG.High", bghighAM);
		
		
		//Reset BG to default values
//		getotriosMysettingpageBeforeMealBtn().click();
//		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), 70);
//		getotriosMysettingpageBeforemealForwardarrowBtn().click();
//		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), 130);
//		getotriosMysettingpageBeforemealDoneBtn().click();
//		if (JNJUtilsIOS.tryMethod(getotriossettingpageStaticTextlbl("OK"))) {
//			Reporter.logWithScreenShot("BG update alert displayed", MessageTypes.Pass);
//			getotriossettingpageStaticTextlbl("OK").click();
//		}
//		
//		getotriosMysettingpageAfterMealBtn().waitForVisible();
//		getotriosMysettingpageAfterMealBtn().click();
//		// getotriosMysettingpageBeforemealPicker().sendKeys("70");
//		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), 70);
//		getotriosMysettingpageBeforemealForwardarrowBtn().click();
//		// getotriosMysettingpageBeforemealPicker().sendKeys("180");
//		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), 180);
//		getotriosMysettingpageBeforemealDoneBtn().click();
//		if (JNJUtilsIOS.tryMethod(getotriossettingpageStaticTextlbl("OK"))) {
//			getotriossettingpageStaticTextlbl("OK").click();
//		}
		Reporter.logWithScreenShot("reset default BG range", MessageTypes.Pass);
		
		getotriosMysettingpageBackBtn().click();

	}
	
	//Method to set BG value for before and after meal
	public void setBGBeforeAfterMeal(String lowBG,String highBG){

		if (getotriosMysettingpageBeforemealPicker().getAttribute("visible").toString().equalsIgnoreCase("true")) {

			setBGPickerTry(getotriosMysettingpageBeforemealPicker(), lowBG);
			for (QAFWebElement ele : getotriosMysettingpageBeforemealForwardarrowBtnList()) {
				if (JNJUtilsIOS.tryMethod(ele))
					ele.click();
			}
			getotriosMysettingpageBeforemealForwardarrowBtn().click();

			setBGPickerTry(getotriosMysettingpageBeforemealPicker(), highBG);

			// added for picker wheel on iphone 5s and 6s

		} else if (getotriosMysettingpageBeforemealPicker2().verifyPresent()) {
			setBGPickerTry(getotriosMysettingpageBeforemealPicker2(), lowBG);

			for (QAFWebElement ele : getotriosMysettingpageBeforemealForwardarrowBtnList()) {
				if (JNJUtilsIOS.tryMethod(ele))
					ele.click();
			}
			setBGPickerTry(getotriosMysettingpageBeforemealPicker2(), highBG);
		}

		for (QAFWebElement ele : getotriosMysettingpageBeforemealDoneBtnList()) {
			if (JNJUtilsIOS.tryMethod(ele)){
				ele.click();
				break;
			}
				
			
		}

		if (JNJUtilsIOS.tryMethod(getotriossettingpageOkBtn())) {
			Reporter.logWithScreenShot("BG update alert displayed", MessageTypes.Pass);
			getotriossettingpageOkBtn().click();
			
		}
	}
	
	//Bg picker tryMethod
	public void setBGPickerTry(QAFWebElement ele,String value){
		int count=0;
		while(!(ele.getAttribute("value").contains(value))){
			try{
				ele.sendKeys(value);
				if(count==100)
					break;
				count++;
			}catch(Exception e){
			}
			
		}
		Reporter.logWithScreenShot("After setting picker", MessageTypes.Pass);
	}
	
	// added for verifying bg on settings page with popup on period overview page
	public void getBGValues() {
		if (getotriosMysettingpageBeforeMealBtn().getAttribute("isvisible").toString().equals("false")) {
			getotriosMysettingpageMealTaggingSwch().click();
			Reporter.logWithScreenShot("Meal tagging button is enabled", MessageTypes.Pass);
		}
		
		String rangeAMBG[] = getotriosMysettingpageAfteremealRangeLbl().getAttribute("label").split(" ");
		String bgLowAM = rangeAMBG[0];
		String bghighAM = rangeAMBG[2];
		//Validator.verifyThat("Note charcter length", bgLowAM, Matchers.equalTo("71"));
		//Validator.verifyThat("Note charcter length", bghighAM, Matchers.equalTo("175"));
		ConfigurationManager.getBundle().setProperty("AM.BG.range",
				getotriosMysettingpageAfteremealRangeLbl().getAttribute("label"));
		ConfigurationManager.getBundle().setProperty("AM.BG.Low", bgLowAM);
		ConfigurationManager.getBundle().setProperty("AM.BG.High", bghighAM);
		
		String rangeBMBG[] = getotriosMysettingpageBeforemealRangeLbl().getAttribute("label").split(" ");
		String bgLowBM = rangeBMBG[0];
		String bghighBM = rangeBMBG[2];
		//Validator.verifyThat("Note charcter length", bgLowBM, Matchers.equalTo("64"));
		//Validator.verifyThat("Note charcter length", bghighBM, Matchers.equalTo("124"));
		ConfigurationManager.getBundle().setProperty("BM.BG.range",
				getotriosMysettingpageBeforemealRangeLbl().getAttribute("label"));
		ConfigurationManager.getBundle().setProperty("BM.BG.Low", bgLowBM);
		ConfigurationManager.getBundle().setProperty("BM.BG.High", bghighBM);
		Reporter.logWithScreenShot("BG ranges on settings page", MessageTypes.Pass);
		
		getotriosMysettingpageBackBtn().click();

		
	}

	

	public void ToClickDoneBtn() {
		getotriosMysettingpageDone().get(0).waitForPresent();
		for (QAFWebElement ele : getotriosMysettingpageDone()) {
			if (JNJUtilsIOS.tryMethod(ele)) {
				ele.click();
				break;
			} else {

			}
		}
	}

	public void VerifyBGValue() {
		System.out.println("............" + getotriosMysettingpageHighBgValu().getText());
		String strh = getotriosMysettingpageHighBgValu().getText().toString();
		String sh[] = strh.split(" ");
		String strl = getotriosMysettingpageLowBgValue().getText().toString();
		String sl[] = strl.split(" ");
		strl = sl[1];
		strh = sh[1];
		if (getotriosMysettingpageHighBgValu().getText().toString()
				.equalsIgnoreCase(getotriosMysettingpageLowBgValue().getText().toString())) {
			Reporter.logWithScreenShot(strh + "and" + strl + " values are same", MessageTypes.Pass);
		} else if (!getotriosMysettingpageHighBgValu().getText().toString()
				.equalsIgnoreCase(getotriosMysettingpageLowBgValue().getText().toString()))
			Reporter.logWithScreenShot(strh + "and" + strl + " values are not same", MessageTypes.Pass);
		// Validator.verifyThat("Note charcter length", strl,
		// Matchers.equalTo(strh));

	}

	public void VerifyMealTagging() {
		getotriosMysettingpageMealTaggingBtm().waitForPresent();
		Reporter.logWithScreenShot("Meal Tagging Button is Disable", MessageTypes.Pass);
	}

	// Only change BG value
	public void changeBgValue() {
		if (JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn())) {
			getotriosMysettingpageMealTaggingSwch().click();
		}
		getotriosMysettingpageLowBgValue().click();
		selectBG(72);
		getotriosMysettingpageHighBgValu().click();
		selectBG(182);
		Reporter.logWithScreenShot("Changed value", MessageTypes.Pass);
		
		
	}

	// Breakfast Begin Time of Day
	public void clickBeginTime() {
		getotriosMysettingpageTimeOfDayBreakfast().waitForPresent();
		getotriosMysettingpageTimeOfDayBreakfast().isDisplayed();
		// getotriosMysettingpageTimeOfDayBreakfast().click();
		Reporter.logWithScreenShot("Breakfast time", MessageTypes.Pass);
	}

	// For scrolling Time of Day view
	// Manjushri
	public void scrllToTimeOfDay(String countryName) {
		scrollToElementSettingScreen(getotriosMysettingpageTimeOfDayBreakfastLbl());
	}

	// Changing Begin time
	public void changeBeginTime() {
		String str = JNJUtilsIOS.getPropString("more.aboutme.graph.header");
		if (getotriosMysettingpageTimeOfDayBreakfastLbl().isPresent()) {
			scrllToTimeOfDay(str);
			JNJUtilsIOS.pause(1000);
			getotriosMysettingpageTimeOfDayBreakfast().click();
			Reporter.logWithScreenShot("BreskFast Begin time", MessageTypes.Pass);
			JNJUtilsIOS jnj = new JNJUtilsIOS();
			jnj.getDriver().tap(1, getotriosMysettingpageTimeOfDayBreakfastLbl(), 100);
			getotriosMysettingpageTimeOfDayHour().waitForPresent();
			JNJUtilsIOS.selectTimePicker(getotriosMysettingpageTimeOfDayHour(), 8);
			ToClickDoneBtn();
			Reporter.logWithScreenShot("Time Changed", MessageTypes.Pass);
			
			//reset to default value
			getotriosMysettingpageTimeOfDayBreakfast().click();
			jnj.getDriver().tap(1, getotriosMysettingpageTimeOfDayBreakfastLbl(), 100);
			getotriosMysettingpageTimeOfDayHour().waitForPresent();
			JNJUtilsIOS.selectTimePicker(getotriosMysettingpageTimeOfDayHour(), 5);
			
			ToClickDoneBtn();
			Reporter.logWithScreenShot("Time Changed back", MessageTypes.Pass);
		}
	}

	// Verify default ranges for Time of Day
	public void verifyDefaultRangeTOD() {

		String str = JNJUtilsIOS.getPropString("more.aboutme.graph.header");
		if (getotriosMysettingpageTimeOfDayBreakfastLbl().isPresent()) {
			scrllToTimeOfDay(str);
			JNJUtilsIOS.pause(1000);

			if (getotriosMysettingpageTimeOfDayOverBegin().getText().matches("12:00 AM")) {
				Reporter.logWithScreenShot("Default value for Overnight Begin is correct", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Default value for Overnight Begin need to set as 12.00am",
						MessageTypes.Pass);
			}
			if (getotriosMysettingpageTimeOfDayUverEnd().getText().matches("5:00 AM")) {
				Reporter.logWithScreenShot("Default value for Overnight end is correct", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Default value for Overnight end need to set as 5.00am", MessageTypes.Pass);
			}
			if (getotriosMysettingpageTimeOfDayBreakfast().getText().matches("5:00 AM")) {
				Reporter.logWithScreenShot("Default value for BreakFast Begin time is correct", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Default value for BreakFast Begin need to set as 5.00am",
						MessageTypes.Pass);
			}

			if (getotriosMysettingpageTimeOfDayBreakfastEnd().getText().matches("11:00 AM")) {
				Reporter.logWithScreenShot("Default value for BreakFast End time is correct", MessageTypes.Pass);
			} else {
				Reporter.logWithScreenShot("Default value for BreakFast End time need to set as 11.00am",
						MessageTypes.Pass);
			}
			/*
			 * Validator.verifyThat("Overnight Begin time",
			 * (getotriosMysettingpageTimeOfDayOverBegin().getText()),
			 * Matchers.equalTo("12:00 AM"));
			 * Validator.verifyThat("Overnight End time",
			 * (getotriosMysettingpageTimeOfDayUverEnd().getText()),
			 * Matchers.equalTo("5:00 AM"));
			 * Validator.verifyThat("BreakFast Begin time",
			 * (getotriosMysettingpageTimeOfDayBreakfast().getText()),
			 * Matchers.equalTo("5:00 AM"));
			 * Validator.verifyThat("BreakFast End time",
			 * (getotriosMysettingpageTimeOfDayBreakfastEnd().getText()),
			 * Matchers.equalTo("11:00 AM"));
			 */
		}
	}

	// Method to select insulin tab
	public void clickInsuliSwitch() {
		scrollToElementSettingScreen(getotriosMysettingpageInsulinSwitch());
		Reporter.logWithScreenShot("Insulin switch before clicking", MessageTypes.Pass);
		getotriosMysettingpageInsulinSwitch().click();
		Reporter.logWithScreenShot("Insulin switch clicked", MessageTypes.Pass);
		

	}

	// Method to scroll to element on setting screen
	// Milan
	public void scrollToElementSettingScreen(QAFWebElement element) {
		getotriosMysettingpageMealTaggingSwch().waitForPresent();
		if(getotriosMysettingpageMealTaggingSwch().getAttribute("visible").equalsIgnoreCase("true")){
			   Point p1 = getotriosMysettingpageMealTaggingSwch().getLocation();
			   int count = 0;
			   while (!(element.getAttribute("visible").equalsIgnoreCase("true"))) {
			    JNJUtilsIOS.swipeWithCoordinates(p1.getX() - 50, p1.getY() + 100, p1.getX() - 50, p1.getY() -50, 100);
			    JNJUtilsIOS.pause(1000);
			    count++;
			    if (count == 10)
			     break;
			    System.out.println(count);
			   }
			  }else{
			   int count = 0;
			   while (!(element.getAttribute("visible").equalsIgnoreCase("true"))) {
			    JNJUtilsIOS.swipeWithCoordinates(476, 932, 443, 800, 500);
			    JNJUtilsIOS.pause(1000);
			    count++;
			    if (count == 20)
			     break;
			    System.out.println(count);
			   
			   }
			  }   

	}
	//Method to set blood glucose 
	//Milan
	public void selectBG(int value){
		JNJUtilsIOS.selectTimePicker(getotriosMysettingpageBeforemealPicker(), value);
		Reporter.logWithScreenShot("Set BG range", MessageTypes.Pass);
		getotriosMysettingpageBeforemealDoneBtn().click();
		if (JNJUtilsIOS.tryMethod(getotriossettingpageOkBtn())) {
			getotriossettingpageOkBtn().click();
		}
	}
	//Set low and high blood 
	//milan
	public void setLowHighOverallBG(){
		if (JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn())) {
			getotriosMysettingpageMealTaggingSwch().click();
		}
		getotriosMysettingpageLowBgValue().click();
		selectBG(70);
		ConfigurationManager.getBundle().setProperty("Low.BG.Range.Value", "70");
		getotriosMysettingpageHighBgValu().click();
		selectBG(180);
		ConfigurationManager.getBundle().setProperty("High.BG.Range.Value", "180");
		getotriosMysettingpageBackBtn().click();
		
	}
	public void chsngeLowHighOverallBG(){
		if (JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn())) {
			getotriosMysettingpageMealTaggingSwch().click();
		}
		getotriosMysettingpageLowBgValue().click();
		selectBG(105);
		getotriosMysettingpageHighBgValu().click();
		selectBG(200);
		getotriosMysettingpageBackBtn().click();
		
	}
	public void chsngeLowHighOverallBGs(String low,String high){
		if (JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn())) {
			getotriosMysettingpageMealTaggingSwch().click();
		}
		
		getotriosMysettingpageHighBgValu().click();
		selectBG(Integer.parseInt(high.replaceAll("[^0-9]", "")));
		getotriosMysettingpageLowBgValue().click();
		int lowvalue=Integer.parseInt(low);
		selectBG(lowvalue);
		getotriosMysettingpageBackBtn().click();
		
	}
	//Method to verify app show mmol/L for canada on setting page
	//Milan
	public void verifyCandammol(){
		if (JNJUtilsIOS.tryMethod(getotriosMysettingpageBeforeMealBtn())) {
			getotriosMysettingpageMealTaggingSwch().click();
		}
		WebDriverTestCase.verifyTrue(getotriosMysettingpageHighBgValu().getAttribute("name").contains("mmol/L"),
				"mmol/L as unit not present for canada","mmol/L as unit present for canada");
		
	}

	public void clickOnAllCheckboxes() {
		
		//scrollToElementSettingScreen(getotriosMysettingpageInsulinSwitch());
		scrollToElementSettingScreen(getotriossettingpageDiabetesQuestionbtn
			(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		
		selectCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.dietExercise")));
		selectCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.oralMedication")));
		selectCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.injectOther")));
		selectCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.longActing")));
		selectCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
		selectCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		selectCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.rapidActing")));
		
		if(JNJUtilsIOS.tryMethod(getotriossettingpageAlertStaticText(JNJUtilsIOS.getPropString("appCommon.no")))){
			Reporter.logWithScreenShot("Alert displayed", MessageTypes.Pass);
			getotriossettingpageAlertStaticText(JNJUtilsIOS.getPropString("appCommon.no")).click();
		}
		
		
		Reporter.logWithScreenShot("After checked", MessageTypes.Pass);
		
		getotriosMysettingpageBackBtn().click();
		
	}
	public void selectCheckBox(QAFWebElement element){
		if(element.getAttribute("name").contains("checkbox")){
			element.click();
			
		}
	}
	public void uncheckCheckBox(QAFWebElement element){
		if(element.getAttribute("name").contains("checked")){
			element.click();
		}
	}
	public boolean diabetesChekBoxState(QAFWebElement element){
		boolean flag=false;
		if(element.getAttribute("name").contains("checked")){
			flag=true;
			
		}
		return flag;
	}

	public void checkAllCheckboxes() {
		
		JNJUtilsIOS.swipeWithCoordinates(400, 500, 400, 700, 10);
		  scrollToElementSettingScreen(getotriossettingpageDiabetesQuestionbtn
		    (JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
		
		uncheckCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.dietExercise")));
		uncheckCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.oralMedication")));
		uncheckCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.injectOther")));
		uncheckCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.longActing")));
		uncheckCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.mixedInsulin")));
		
		scrollToElementSettingScreen(getotriossettingpageDiabetesQuestionbtn
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		
		uncheckCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.rapidActing")));
		uncheckCheckBox(getotriossettingpageDiabetesQuestionchkbox
				(JNJUtilsIOS.getPropString("more.aboutme.diabetesManagement.pump")));
		
		Reporter.logWithScreenShot("After unchecked", MessageTypes.Pass);
		
	}
	
	//SG Method to Navigate back from settings menus to screen settings opened from
	public void navigateBackFromSettings() {
		getotriosMysettingpageBackBtn().click();
		getotriosMysettingpageBackBtn().click();
		Reporter.logWithScreenShot("naviagted back", MessageTypes.Pass);
	}
	
}