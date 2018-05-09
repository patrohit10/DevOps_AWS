package com.lemonade.version3.iOS.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.iOS.beans.EventDetailBeans;
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

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class LogbookPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otrios.logbookPage.carb.btn")
	private QAFWebElement otriosLogbookpageCarbBtn;
	@FindBy(locator = "otrios.logbookPage.glucose.btn")
	private QAFWebElement otriosLogbookpageGlucoseBtn;
	@FindBy(locator = "otrios.logbookPage.insulin.btn")
	private QAFWebElement otriosLogbookpageInsulinBtn;
	@FindBy(locator = "otrios.logbookPage.activity.btn")
	private QAFWebElement otriosLogbookpageActivityBtn;
	@FindBy(locator = "otrios.logbookPage.glucose.unit.lbl")
	private QAFWebElement otriosLogbookpageGlucoseUnitLbl;
	@FindBy(locator = "otrios.logbookPage.glucose.amount.txt")
	private QAFWebElement otriosLogbookpageGlucoseAmountTxt;
	@FindBy(locator = "otrios.logbookPage.glucose.amount.txt")
	private List<QAFWebElement> otriosLogbookpageGlucoseAmountTxtList;
	@FindBy(locator = "otrios.logbookPage.glucose.timingValue.txt")
	private QAFWebElement otriosLogbookpageGlucoseTimingvalueTxt;
	@FindBy(locator = "otrios.logbookPage.glucose.addnote.txt")
	private QAFWebElement otriosLogbookpageGlucoseAddnoteTxt;
	@FindBy(locator = "otrios.logbookPage.glucose.appleTag.img")
	private QAFWebElement otriosLogbookpageGlucoseAppletagImg;
	@FindBy(locator = "otrios.logbookPage.glucose.hi.btn")
	private QAFWebElement otriosLogbookpageGlucoseHiBtn;
	@FindBy(locator = "otrios.logbookPage.glucose.lo.btn")
	private QAFWebElement otriosLogbookpageGlucoseLoBtn;
	@FindBy(locator = "otrios.logbookPage.glucose.drop.img")
	private QAFWebElement otriosLogbookpageGlucoseDropImg;
	@FindBy(locator = "otrios.logbookPage.glucose.drop.img")
	private List<QAFWebElement> otriosLogbookpageGlucoseDropImgList;
	@FindBy(locator = "otrios.logbookPage.glucose.note.img")
	private QAFWebElement otriosLogbookpageGlucoseNoteImg;
	@FindBy(locator = "otrios.logbookPage.addevent.btn")
	private QAFWebElement otriosLogbookpageAddeventBtn;
	@FindBy(locator = "otrios.logbookPage.timingPicker.date.pkr")
	private QAFWebElement otriosLogbookPageTimingPickerDatePkr;
	@FindBy(locator = "otrios.logbookPage.timingPicker.hour.pkr")
	private QAFWebElement otriosLogbookPageTimingPickerHourPkr;
	@FindBy(locator = "otrios.logbookPage.timingPicker.minute.pkr")
	private QAFWebElement otriosLogbookPageTimingPickerMinutePkr;
	@FindBy(locator = "otrios.logbookPage.glucose.timingValue.btn")
	private QAFWebElement otriosLogbookPageglucoseTimingValuebBtn;
	@FindBy(locator = "otrios.logbookPage.glucose.timingValue.btn")
	private List<QAFWebElement> otriosLogbookPageglucoseTimingValuebBtnList;
	@FindBy(locator = "otrios.logbookPage.carb.spoon.img")
	private QAFWebElement otriosLogbookPageCarbSpoonImg;
	@FindBy(locator = "otrios.logbookPage.carb.spoon.img")
	private List<QAFWebElement> otriosLogbookPageCarbSpoonImgList;
	@FindBy(locator = "otrios.logbookPage.carb.amountField.txt")
	private QAFWebElement otriosLogbookPageCarbAmountFieldTxt;
	@FindBy(locator = "otrios.logbookPage.carb.amountField.txt")
	private List<QAFWebElement> otriosLogbookPageCarbAmountFieldTxtList;
	@FindBy(locator = "otrios.logbookPage.carb.unit.lbl")
	private QAFWebElement otriosLogbookPageCarbUnitLbl;
	@FindBy(locator = "otrios.logbookPage.carb.timing.lbl")
	private QAFWebElement otriosLogbookPageCarbTimingLbl;
	@FindBy(locator = "otrios.logbookPage.carb.noteField.txt")
	private QAFWebElement otriosLogbookPageCarbNoteFieldTxt;
	@FindBy(locator = "otrios.logbookPage.insulin.medicine.img")
	private QAFWebElement otriosLogbookpageInsulinMedicineImg;
	@FindBy(locator = "otrios.logbookPage.insulin.medicine.img")
	private List<QAFWebElement> otriosLogbookpageInsulinMedicineImgList;
	@FindBy(locator = "otrios.logbookPage.insulin.amountField.txt")
	private QAFWebElement otriosLogbookpageInsulinAmountfieldTxt;
	@FindBy(locator = "otrios.logbookPage.insulin.amountField.txt")
	private List<QAFWebElement> otriosLogbookpageInsulinAmountfieldTxtList;
	@FindBy(locator = "otrios.logbookPage.insulin.type.btn")
	private QAFWebElement otriosLogbookpageInsulinTypeBtn;
	@FindBy(locator = "otrios.logbookPage.insulin.timing.lbl")
	private QAFWebElement otriosLogbookpageInsulinTimingLbl;
	
	
	@FindBy(locator = "otrios.logbookPage.insulin.noteField.txt")
	private QAFWebElement otriosLogbookpageInsulinNotefieldTxt;
	
	
	@FindBy(locator = "otrios.logbookPage.activity.heart.img")
	private QAFWebElement otriosLogbookpageActivityHeartImg;
	@FindBy(locator = "otrios.logbookPage.activity.heart.img")
	private List<QAFWebElement> otriosLogbookpageActivityHeartImgList;
	@FindBy(locator = "otrios.logbookPage.activity.intensity.btn")
	private QAFWebElement otriosLogbookpageActivityIntensityBtn;
	@FindBy(locator = "otrios.logbookPage.activity.amountField.txt")
	private QAFWebElement otriosLogbookpageActivityAmountfieldTxt;
	@FindBy(locator = "otrios.logbookPage.activity.amountField.txt")
	private List<QAFWebElement> otriosLogbookpageActivityAmountfieldTxtList;
	@FindBy(locator = "otrios.logbookPage.activity.unit.lbl")
	private QAFWebElement otriosLogbookpageActivityUnitLbl;
	@FindBy(locator = "otrios.logbookPage.activity.timing.lbl")
	private QAFWebElement otriosLogbookpageActivityTimingLbl;
	@FindBy(locator = "otrios.logbookPage.activity.noteField.txt")
	private QAFWebElement otriosLogbookpageActivityNotefieldTxt;
	@FindBy(locator = "otrios.logbookPage.carb.timing.btn")
	private QAFWebElement otriosLogbookpageCarbTimingBtn;
	@FindBy(locator = "otrios.logbookPage.insulin.timing.btn")
	private QAFWebElement otriosLogbookpageInsulinTimingBtn;
	@FindBy(locator = "otrios.logbookPage.activity.timing.btn")
	private QAFWebElement otriosLogbookpageActivityTimingBtn;
	@FindBy(locator = "otrios.logbookPage.editEvent.delete.btn")
	private QAFWebElement otriosLogbookPageEditEventDeleteBtn;
	@FindBy(locator = "otrios.logbookPage.editEvent.delete.btn")
	private List<QAFWebElement> otriosLogbookPageEditEventDeleteBtnList;
	@FindBy(locator = "otrios.logbookPage.undo.btn")
	private QAFWebElement otriosLogbookPageUndoBtn;
	@FindBy(locator = "otrios.logbookPage.classic.datelist.lbl")
	private List<QAFWebElement> otriosLogbookPageClassicDateListLbl;
	@FindBy(locator = "otrios.logbookPage.weekview.info.btn")
	private QAFWebElement otriosLogbookPageWeekInfoBtn;
	@FindBy(locator = "otrios.logbookPage.leftarrow.btn")
	private QAFWebElement otriosLogbookpageLeftarrowBtn;
	@FindBy(locator = "otrios.logbookPage.rightarrow.btn")
	private QAFWebElement otriosLogbookpageRightarrowBtn;
	@FindBy(locator="otrios.logbookPage.selectedDate.text")
	private QAFWebElement otriosLogbookPageSelectedDateText;
	@FindBy(locator="otrios.logbookPage.aftermeal.btn")
	private QAFWebElement otriosLogbookPageAftermealBtn;
	@FindBy(locator="otrios.logbookPage.aftermeal.btn")
	private List<QAFWebElement> otriosLogbookPageAftermealBtnList;
	@FindBy(locator="otrios.logbookPage.insulin.type.lbl")
	private QAFWebElement otriosLogbookPageInsulinTypeLbl;
	
	
	public String dateLabelOnLogbook;
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	
	
	public QAFWebElement getOtriosLogbookPageInsulinTypeLbl() {
		return otriosLogbookPageInsulinTypeLbl;
	}
	public List<QAFWebElement> getOtriosLogbookPageglucoseTimingValuebBtnList() {
		return otriosLogbookPageglucoseTimingValuebBtnList;
	}
	public List<QAFWebElement> getOtriosLogbookpageGlucoseAftermealBtnList() {
		return otriosLogbookPageAftermealBtnList;
	}
	
	public QAFWebElement getOtriosLogbookpageGlucoseAftermealBtn() {
		return otriosLogbookPageAftermealBtn;
	}
	
	public String getDateLabelOnLogbook() {
		return dateLabelOnLogbook;
	}

	public void setDateLabelOnLogbook(String dateLabelOnLogbook) {
		this.dateLabelOnLogbook = dateLabelOnLogbook;
	}

	public QAFWebElement getOtriosLogbookpageLeftarrowBtn() {
		return otriosLogbookpageLeftarrowBtn;
	}

	public QAFWebElement getOtriosLogbookpageRightarrowBtn() {
		return otriosLogbookpageRightarrowBtn;
	}
	public QAFWebElement getOtriosLogbookPageWeekInfoBtn() {
		return otriosLogbookPageWeekInfoBtn;
	}

	public List<QAFWebElement> getOtriosLogbookPageClassicDateListLbl() {
		return otriosLogbookPageClassicDateListLbl;
	}

	public QAFWebElement getOtriosLogbookPageEditEventDeleteBtn() {
		return otriosLogbookPageEditEventDeleteBtn;
	}
	public List<QAFWebElement> getOtriosLogbookPageEditEventDeleteBtnList() {
		return otriosLogbookPageEditEventDeleteBtnList;
	}

	public QAFWebElement getOtriosLogbookpageCarbTimingBtn() {
		return otriosLogbookpageCarbTimingBtn;
	}

	public QAFWebElement getOtriosLogbookpageInsulinTimingBtn() {
		return otriosLogbookpageInsulinTimingBtn;
	}

	public QAFWebElement getOtriosLogbookpageActivityTimingBtn() {
		return otriosLogbookpageActivityTimingBtn;
	}
	public QAFWebElement getOtriosLogbookpageInsulinMedicineImg() {
		return otriosLogbookpageInsulinMedicineImg;
	}
	public List<QAFWebElement> getOotriosLogbookpageInsulinMedicineImgList() {
		return otriosLogbookpageInsulinMedicineImgList;
	}
	public QAFWebElement getOtriosLogbookpageInsulinAmountfieldTxt() {
		return otriosLogbookpageInsulinAmountfieldTxt;
	}
	public List<QAFWebElement> getOtriosLogbookpageInsulinAmountfieldTxtList() {
		return otriosLogbookpageInsulinAmountfieldTxtList;
	}
	public QAFWebElement getOtriosLogbookpageInsulinTypeBtn() {
		return otriosLogbookpageInsulinTypeBtn;
	}

	public QAFWebElement getOtriosLogbookpageInsulinTimingLbl() {
		return otriosLogbookpageInsulinTimingLbl;
	}

	public QAFWebElement getOtriosLogbookpageInsulinNotefieldTxt() {
		return otriosLogbookpageInsulinNotefieldTxt;
	}

	public QAFWebElement getOtriosLogbookpageActivityHeartImg() {
		return otriosLogbookpageActivityHeartImg;
	}
	public List<QAFWebElement> getOtriosLogbookpageActivityHeartImgList() {
		return otriosLogbookpageActivityHeartImgList;
	}
	public QAFWebElement getOtriosLogbookpageActivityIntensityBtn() {
		return otriosLogbookpageActivityIntensityBtn;
	}

	public QAFWebElement getOtriosLogbookpageActivityAmountfieldTxt() {
		return otriosLogbookpageActivityAmountfieldTxt;
	}
	public List<QAFWebElement> getOtriosLogbookpageActivityAmountfieldTxtList() {
		return otriosLogbookpageActivityAmountfieldTxtList;
	}
	public QAFWebElement getOtriosLogbookpageActivityUnitLbl() {
		return otriosLogbookpageActivityUnitLbl;
	}

	public QAFWebElement getOtriosLogbookpageActivityTimingLbl() {
		return otriosLogbookpageActivityTimingLbl;
	}

	public QAFWebElement getOtriosLogbookpageActivityNotefieldTxt() {
		return otriosLogbookpageActivityNotefieldTxt;
	}
	public QAFWebElement getOtriosLogbookPageCarbNoteFieldTxt() {
		return otriosLogbookPageCarbNoteFieldTxt;
	}
	public QAFWebElement getOtriosLogbookPageCarbTimingLbl() {
		return otriosLogbookPageCarbTimingLbl;
	}
	public QAFWebElement getOtriosLogbookPageCarbUnitLbl() {
		return otriosLogbookPageCarbUnitLbl;
	}
	public QAFWebElement getOtriosLogbookPageCarbAmountFieldTxt() {
		return otriosLogbookPageCarbAmountFieldTxt;
	}
	public List<QAFWebElement> getOtriosLogbookPageCarbAmountFieldTxtList() {
		return otriosLogbookPageCarbAmountFieldTxtList;
	}
	public QAFWebElement getOtriosLogbookPageCarbSpoonImg() {
		return otriosLogbookPageCarbSpoonImg;
	}
	public List<QAFWebElement> getOtriosLogbookPageCarbSpoonImgList() {
		return otriosLogbookPageCarbSpoonImgList;
	}
	public QAFWebElement getOtriosLogbookPageglucoseTimingValuebBtn() {
		return otriosLogbookPageglucoseTimingValuebBtn;
	}
	public QAFWebElement getOtriosLogbookPageTimingPickerMinutePkr() {
		return otriosLogbookPageTimingPickerMinutePkr;
	}
	public QAFWebElement getOtriosLogbookPageTimingPickerHourPkr() {
		return otriosLogbookPageTimingPickerHourPkr;
	}
	public QAFWebElement getOtriosLogbookPageTimingPickerDatePkr() {
		return otriosLogbookPageTimingPickerDatePkr;
	}

	public QAFWebElement getOtriosLogbookpageCarbBtn() {
		return otriosLogbookpageCarbBtn;
	}
	
	public QAFWebElement getOtriosLogbookpageGlucoseBtn() {
		return otriosLogbookpageGlucoseBtn;
	}

	public QAFWebElement getOtriosLogbookpageInsulinBtn() {
		return otriosLogbookpageInsulinBtn;
	}

	public QAFWebElement getOtriosLogbookpageActivityBtn() {
		return otriosLogbookpageActivityBtn;
	}

	public QAFWebElement getOtriosLogbookpageGlucoseUnitLbl() {
		return otriosLogbookpageGlucoseUnitLbl;
	}

	public QAFWebElement getOtriosLogbookpageGlucoseAmountTxt() {
		return otriosLogbookpageGlucoseAmountTxt;
	}
	public List<QAFWebElement> getOtriosLogbookpageGlucoseAmountTxtList() {
		return otriosLogbookpageGlucoseAmountTxtList;
	}

	public QAFWebElement getOtriosLogbookpageGlucoseTimingvalueTxt() {
		return otriosLogbookpageGlucoseTimingvalueTxt;
	}

	public QAFWebElement getOtriosLogbookpageGlucoseAddnoteTxt() {
		return otriosLogbookpageGlucoseAddnoteTxt;
	}

	public QAFWebElement getOtriosLogbookpageGlucoseAppletagImg() {
		return otriosLogbookpageGlucoseAppletagImg;
	}

	public QAFWebElement getOtriosLogbookpageGlucoseHiBtn() {
		return otriosLogbookpageGlucoseHiBtn;
	}

	public QAFWebElement getOtriosLogbookpageGlucoseLoBtn() {
		return otriosLogbookpageGlucoseLoBtn;
	}

	public QAFWebElement getOtriosLogbookpageGlucoseDropImg() {
		return otriosLogbookpageGlucoseDropImg;
	}
	public List<QAFWebElement> getOtriosLogbookpageGlucoseDropImgList() {
		return otriosLogbookpageGlucoseDropImgList;
	}
	public QAFWebElement getOtriosLogbookpageGlucoseNoteImg() {
		return otriosLogbookpageGlucoseNoteImg;
	}

	public QAFWebElement getOtriosLogbookpageAddeventBtn() {
		return otriosLogbookpageAddeventBtn;
	}
	public QAFWebElement getOtriosLogbookPageStaticText(String text) {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl", text);
	}
	public QAFWebElement getOtriosLogbookPageClassicViewBGAddedBG(String text1 ,String text2) {
		return JNJUtilsIOS.getElement("otrios.logbookPage.classic.bgValue.txt", text1,text2);
	}
	public QAFWebElement getOtriosLogbookPageDoneBtnText() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("appCommon.done"));
	}
	public QAFWebElement getOtriosLogbookLegendPageTitle() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("progress.report.graph.legend.title"));
	}
	public QAFWebElement getOtriosLogbookInsulinTitle() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("logbook.section.insulin.title"));
	}
	public QAFWebElement getOtriosLogbookPageUndoBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("appCommon.revertValue"));
	}
	public QAFWebElement getOtriosLogbookPageEditaneventLbl() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("log.edit.event.title"));
	}
	public QAFWebElement getOtriosLogbookPageOkBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("appCommon.ok"));
	}
	public QAFWebElement getOtriosLogbookpageSaveBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("appCommon.save"));
	}
	public QAFWebElement getOtriosLogbookpageBackBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("common.backbuttontext"));
	}
	
	public QAFWebElement getOtriosLogbookpageGlucoseBeforemealBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("periods.beforeMeal"));
	}
	public QAFWebElement getOtriosLogbookPageImproperPopUpLbl() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("alerts.wrongValue.title"));
	}
	public QAFWebElement getOtriosLogbookpageAddanothereventLbl() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("log.action.addAnotherEvent"));
	}
	public QAFWebElement getOtriosLogbookPageClassicDayboxBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("appCommon.today"));
	}
	public QAFWebElement getOtriosLogbookPageClassicBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.classic.btn",JNJUtilsIOS.getPropString("logbook.viewSelector.classic"));
	}
	public QAFWebElement getOtriosLogbookPageDayBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.day.btn",JNJUtilsIOS.getPropString("logbook.viewSelector.day"));
	}
	public QAFWebElement getOtriosLogbookPageWeekBtn() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.week.btn",JNJUtilsIOS.getPropString("logbook.viewSelector.week"));
	}
	public QAFWebElement getOtriosLogbookPageAaddEventlbl() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.week.btn",JNJUtilsIOS.getPropString("log.add.event.title"));
	}

	public QAFWebElement getOtriosLogbookPageSelectedDateText() {
		return otriosLogbookPageSelectedDateText;
	}

	public void setOtriosLogbookPageSelectedDateText(QAFWebElement otriosLogbookPageSelectedDateText) {
		this.otriosLogbookPageSelectedDateText = otriosLogbookPageSelectedDateText;
	}


	//method to click on "log event" link on logbook page
	//milan
	public void clickLogevent(){
		getOtriosLogbookpageAddeventBtn().waitForPresent();
		getOtriosLogbookpageAddeventBtn().click();
		Reporter.logWithScreenShot("after clicking add event", MessageTypes.Pass);
	}
	
	//method to enter a manual blood glucose value
	//milan
	public void enterManualBGvalue(String value){
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		
		if(value.equalsIgnoreCase("HI")){
			if(!(jnj.getOtriosKeyBoardDeleteBtn().isPresent()))
				getOtriosLogbookpageGlucoseAmountTxt().click();
			getOtriosLogbookPageStaticText("HI").click();
		}
		else if(value.equalsIgnoreCase("LO")){
			if(!(jnj.getOtriosKeyBoardDeleteBtn().isPresent()))
				getOtriosLogbookpageGlucoseAmountTxt().click();
			getOtriosLogbookPageStaticText("LO").click();
		}
		else{
			JNJUtilsIOS.clearTextField(getOtriosLogbookpageGlucoseAmountTxt());
			getOtriosLogbookpageGlucoseAmountTxt().sendKeys(value);
		}
		Reporter.logWithScreenShot("Entered amount", MessageTypes.Pass);
	}
	
	//method to select after food before food tag
	//milan
	public void addGlucoseSelectBeforeAfter(String data) {
		
		data = data.toLowerCase();
		switch (data) {
		case "before":
			getOtriosLogbookpageGlucoseBeforemealBtn().click();
			Reporter.logWithScreenShot("full apple", MessageTypes.Pass);
			break;
		case "after":
			getOtriosLogbookpageGlucoseAftermealBtn().click();
			Reporter.logWithScreenShot("Half apple", MessageTypes.Pass);
			break;
		}

	}
	//method to click on save button on BG entry
	//milan
	public void clickSaveBtnLogbook(){
		getOtriosLogbookpageSaveBtn().waitForPresent();
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//method to select log event list
	//milan
	public void userSelectFromLogEventList(String option){
		//getOtriosLogbookpageAddanothereventLbl().waitForPresent();
		getOtriosLogbookPageAaddEventlbl().waitForPresent();
		option = option.toUpperCase();
		switch (option) {
		case "GLUCOSE":
			getOtriosLogbookpageGlucoseBtn().click();
			break;
		case "CARBS":
			getOtriosLogbookpageCarbBtn().click();
			break;
		case "INSULIN":
			getOtriosLogbookpageInsulinBtn().click();
			break;
		case "ACTIVITY":
			getOtriosLogbookpageActivityBtn().click();
			break;
		}
		Reporter.logWithScreenShot("After selecting event", MessageTypes.Pass);
	}
	//Method to select event Timing picker
	//milan
	public void selectEventTimingPicker(EventDetailBeans eventdetail){
		Point p1=getOtriosLogbookPageTimingPickerDatePkr().getLocation();
		Dimension d1 =getOtriosLogbookPageTimingPickerDatePkr().getSize();
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		//selecting last day from date picker
		jnj.getDriver().tap(1, p1.getX()+ d1.getWidth(), p1.getY() + ((d1.getHeight())/2)-50, 500);
		Reporter.logWithScreenShot("Selected day", MessageTypes.Pass);
		int hour=Integer.parseInt(eventdetail.getHour());
		int minute=Integer.parseInt(eventdetail.getMiunute());
		JNJUtilsIOS.selectTimePicker(getOtriosLogbookPageTimingPickerHourPkr(),hour);
		JNJUtilsIOS.selectTimePicker(getOtriosLogbookPageTimingPickerMinutePkr(),minute);
		Reporter.logWithScreenShot("Set date and time", MessageTypes.Pass);
		getOtriosLogbookPageDoneBtnText().click();
	}
	//Method to add manual glucose
	//Milan
	public void addManualGlucose(Object eventDetail){
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		getOtriosLogbookpageGlucoseDropImg().click();
		
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
		enterManualBGvalue(eventBean.getAmount());
		Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
		
		getOtriosLogbookpageGlucoseAddnoteTxt().clear();
		getOtriosLogbookpageGlucoseAddnoteTxt().sendKeys("Entering BG");
		ConfigurationManager.getBundle().setProperty("classic.glucose", eventBean.getAmount());
		
//		getOtriosLogbookPageglucoseTimingValuebBtn().click();
//		getOtriosLogbookPageglucoseTimingValuebBtn().click();
//		selectEventTimingPicker(eventBean);
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//Method to edit glucose details
	//Milan
	public void editManualGlucose(Object eventDetail){
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before Editing value", MessageTypes.Pass);
		enterManualBGvalue(eventBean.getAmount());
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+eventBean.getAmount(), MessageTypes.Pass);
		
		getOtriosLogbookpageGlucoseAddnoteTxt().clear();
		getOtriosLogbookpageGlucoseAddnoteTxt().sendKeys("Editing BG");
		
		//getOtriosLogbookPageglucoseTimingValuebBtn().click();
		//getOtriosLogbookPageglucoseTimingValuebBtn().click();
		//selectEventTimingPicker(eventBean);
		
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//Method to add carb amount
	//Milan
	public void addCarbAmount(String amount){
		JNJUtilsIOS.clearTextField(getOtriosLogbookPageCarbAmountFieldTxt());
		getOtriosLogbookPageCarbAmountFieldTxt().sendKeys(amount);
	}
	//Method to add carb
	//Milan
	public void addCarbDetail(Object eventDetail){
		
		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		getOtriosLogbookPageCarbSpoonImg().click();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
				
		Reporter.logWithScreenShot("Carb window before entering value", MessageTypes.Pass);
		addCarbAmount(eventBean.getAmount());
		Reporter.logWithScreenShot("Carb window after entering value"+eventBean.getAmount(), MessageTypes.Pass);
		
//		getOtriosLogbookpageCarbTimingBtn().click();
//		getOtriosLogbookpageCarbTimingBtn().click();
//		selectEventTimingPicker(eventBean);
		
		
		getOtriosLogbookPageCarbNoteFieldTxt().clear();
		getOtriosLogbookPageCarbNoteFieldTxt().sendKeys("Entering carb");
		getOtriosLogbookPageAaddEventlbl().click();
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("Afterclicking on save button", MessageTypes.Pass);
		
	}
	//Method to edit carb details
	//Milan
	public void editCarbDetail(Object eventDetail){
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		
		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		Reporter.logWithScreenShot("Carb window before editing value", MessageTypes.Pass);
		addCarbAmount(eventBean.getAmount());
		Reporter.logWithScreenShot("Carb window after editing value is "+eventBean.getAmount(), MessageTypes.Pass);
		
		//3/10 SG Commenting out time update
		//getOtriosLogbookpageCarbTimingBtn().click();
		//getOtriosLogbookpageCarbTimingBtn().click();
		//selectEventTimingPicker(eventBean);
		
		getOtriosLogbookPageCarbNoteFieldTxt().clear();
		getOtriosLogbookPageCarbNoteFieldTxt().sendKeys("Editing carb");

		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		
	}
	//Method to add insulin amount
	//milan
	public void addInsulinAmount(String amount){
		JNJUtilsIOS.clearTextField(getOtriosLogbookpageInsulinAmountfieldTxt());
		getOtriosLogbookpageInsulinAmountfieldTxt().waitForPresent();
		getOtriosLogbookpageInsulinAmountfieldTxt().sendKeys(amount);
	}
	//Method to select insulin type
	//Milan
	public void selectInsulinType(String insulinType){
		getOtriosLogbookPageTimingPickerDatePkr().waitForPresent();
		Reporter.logWithScreenShot("Insulin type picker", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(insulinType);
		getOtriosLogbookPageDoneBtnText().click();
		Reporter.logWithScreenShot("After selecting insulin type", MessageTypes.Pass);
	}
	//Method to add insuln
	//Milan
	public void addInsulinDetail(Object eventDetail){
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		getOtriosLogbookpageInsulinMedicineImg().click();
		Reporter.logWithScreenShot("Insulin window before adding value", MessageTypes.Pass);
		addInsulinAmount(eventBean.getAmount());
		Reporter.logWithScreenShot("Insulin window after adding value is "+eventBean.getAmount(), MessageTypes.Pass);
		
		getOtriosLogbookpageInsulinTypeBtn().click();
		getOtriosLogbookpageInsulinTypeBtn().click();
		String insulinType=ConfigurationManager.getBundle().getString("event.detail.insulinController.long");
		selectInsulinType(insulinType);
		ConfigurationManager.getBundle().setProperty("last.added.insulin.type", insulinType);
		getOtriosLogbookpageInsulinNotefieldTxt().clear();
		getOtriosLogbookpageInsulinNotefieldTxt().sendKeys("Adding insulin deails");
		getOtriosLogbookPageAaddEventlbl().click();
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		
	}
	//Method to edit insulin value
	//Milan
	public void editInsulinDetail(Object eventDetail){
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		Reporter.logWithScreenShot("Insulin window before edit value", MessageTypes.Pass);
		addInsulinAmount(eventBean.getAmount());
		Reporter.logWithScreenShot("Insulin window after edit value is "+eventBean.getAmount(), MessageTypes.Pass);
		
		getOtriosLogbookpageInsulinMedicineImg().click();
		
		getOtriosLogbookpageInsulinNotefieldTxt().clear();
		getOtriosLogbookpageInsulinNotefieldTxt().sendKeys("Editing insulin deails");
		
		getOtriosLogbookpageInsulinMedicineImg().click();
//		selectEventTimingPicker(eventBean);
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		
	}
	//Method to add Activity amount
	//milan
	public void addActivityAmount(String amount){
		getOtriosLogbookpageActivityAmountfieldTxt().waitForPresent();
		JNJUtilsIOS.clearTextField(getOtriosLogbookpageActivityAmountfieldTxt());
		getOtriosLogbookpageActivityAmountfieldTxt().sendKeys(amount);
	}
	//Method to select Intensity type
	//milan
	public void selectIntensity(String intensityType){
		getOtriosLogbookPageTimingPickerDatePkr().waitForPresent();
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(intensityType);
		getOtriosLogbookPageDoneBtnText().click();
	}
	//Method to add activity details
	//milan
	public void addActivityDetail(Object eventDetail){
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		getOtriosLogbookpageActivityHeartImg().click();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}		
		
		Reporter.logWithScreenShot("Activity window before adding value", MessageTypes.Pass);
		addActivityAmount(eventBean.getAmount());
		Reporter.logWithScreenShot("Activity window after adding value is "+eventBean.getAmount(), MessageTypes.Pass);
		
		getOtriosLogbookpageActivityIntensityBtn().click();
		getOtriosLogbookpageActivityIntensityBtn().click();
		selectIntensity(ConfigurationManager.getBundle().getString("activity.intensity.moderate"));
		Reporter.logWithScreenShot("Selected intensity type", MessageTypes.Pass);
		
		getOtriosLogbookpageActivityNotefieldTxt().clear();
		getOtriosLogbookpageActivityNotefieldTxt().sendKeys("Adding activity deails");
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		
	}
	//Method to verify add or edit event screen for blood glucose
	//milan
	public void verifyAddBGEventScreen() {
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		
		getOtriosLogbookpageGlucoseAmountTxt().verifyPresent("Glucose amount text field");
		
		
		
		if(JNJUtilsIOS.tryMethod(getOtriosLogbookpageGlucoseBeforemealBtn())){
			getOtriosLogbookpageGlucoseBeforemealBtn().verifyPresent("Before meal button");
			getOtriosLogbookpageGlucoseAftermealBtn().verifyPresent("After meal button");
			
			addGlucoseSelectBeforeAfter("after");
		}
		
		getOtriosLogbookpageGlucoseAddnoteTxt().clear();
		getOtriosLogbookpageGlucoseAddnoteTxt().sendKeys("Entering BG");
		
		getOtriosLogbookPageglucoseTimingValuebBtn().click();
		getOtriosLogbookPageglucoseTimingValuebBtn().click();
		//verifyTimingPickerFunctionality(getOtriosLogbookpageGlucoseTimingvalueTxt());
		
		
	}
	//Method to verify Timing picker functionality
	//Milan
	public void verifyTimingPickerFunctionality(QAFWebElement element){
		getOtriosLogbookPageTimingPickerDatePkr().waitForPresent();
		getOtriosLogbookPageTimingPickerDatePkr().verifyPresent("Date picker");
		getOtriosLogbookPageTimingPickerHourPkr().verifyPresent("Hour picker");
		getOtriosLogbookPageTimingPickerMinutePkr().verifyPresent("Minute picker");
		Point p1=getOtriosLogbookPageTimingPickerDatePkr().getLocation();
		Dimension d1 =getOtriosLogbookPageTimingPickerDatePkr().getSize();
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		
		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(JNJUtilsIOS.getPropString("appCommon.today")),
				"Today as default value not present","Today as default value present");
	
		
		//selecting tomorrow day from date picker
		try{
			jnj.getDriver().tap(1, p1.getX()+ d1.getWidth(), p1.getY() + ((d1.getHeight())/2)+50, 500);
			JNJUtilsIOS.pause(1000);
			WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(JNJUtilsIOS.getPropString("appCommon.today")),
					"Selecting future date","Future date not allowed");
			
		}catch(Exception e){	
		}
		
		int hour=7;
		int minute=30;
		jnj.getDriver().tap(1, p1.getX()+ d1.getWidth(), p1.getY() + ((d1.getHeight())/2)-50, 500);
		JNJUtilsIOS.selectTimePicker(getOtriosLogbookPageTimingPickerHourPkr(),hour);
		JNJUtilsIOS.selectTimePicker(getOtriosLogbookPageTimingPickerMinutePkr(),minute);
		Reporter.logWithScreenShot("Set date and time", MessageTypes.Pass);
		
		WebDriverTestCase.verifyTrue(element.getAttribute("label").contains(""+hour),
				"Selected hour not available on event screen","Selected hour available on event screen");
		WebDriverTestCase.verifyTrue(element.getAttribute("label").contains(""+minute),
				"Selected minute not available on event screen","Selected minute available on event screen");
	}
	//method to verify are you sure question flow
	//milan
	public void verifyAreYouSurePopUp(){
		
		getOtriosLogbookpageBackBtn().click();
		getOtriosLogbookPageStaticText(JNJUtilsIOS.getPropString("addEvent.unsavedEntry.title")).waitForPresent();
		getOtriosLogbookPageStaticText(JNJUtilsIOS.getPropString("addEvent.unsavedEntry.title")).verifyPresent("Are you sure pop up");
		getOtriosLogbookPageStaticText(JNJUtilsIOS.getPropString("addEvent.unsavedEntry.message")).verifyPresent("Change will not saved error message");
		//getOtriosLogbookPageCancelBtn().click();
		getOtriosLogbookPageAaddEventlbl().waitForVisible();
		getOtriosLogbookPageAaddEventlbl().verifyPresent("After clicking cancel button event screen");
		getOtriosLogbookpageBackBtn().click();
		getOtriosLogbookPageOkBtn().click();
		Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
		getOtriosLogbookpageAddeventBtn().waitForPresent();
		getOtriosLogbookpageAddeventBtn().verifyPresent("Logbook screen event button ");
		
	}
	//Method to to verify add or edit event screen for carbs
	//milan
	public void verifyAddCarbEventScreen() {
		
		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		
		getOtriosLogbookPageCarbAmountFieldTxt().verifyPresent("Glucose amount text field");
		getOtriosLogbookPageCarbNoteFieldTxt().verifyPresent("Add note text field");
		
		getOtriosLogbookPageCarbNoteFieldTxt().clear();
		getOtriosLogbookPageCarbNoteFieldTxt().sendKeys("Entering BG");
		
		getOtriosLogbookpageCarbTimingBtn().click();
		getOtriosLogbookpageCarbTimingBtn().click();
		getOtriosLogbookPageCarbSpoonImg().click();
		
	}
	//Method to verify add insulin screen
	//milan
	public void verifyAddInsulinEventScreen() {
		
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		getOtriosLogbookpageInsulinMedicineImg().verifyPresent("Insulin image");
		getOtriosLogbookpageInsulinAmountfieldTxt().verifyPresent("Glucose amount text field");
	
		
		getOtriosLogbookpageInsulinNotefieldTxt().clear();
		getOtriosLogbookpageInsulinNotefieldTxt().sendKeys("Entering BG");
		
		getOtriosLogbookpageInsulinTimingBtn().click();
		getOtriosLogbookpageInsulinTimingBtn().click();
		//verifyTimingPickerFunctionality(getOtriosLogbookpageInsulinTimingLbl());
		getOtriosLogbookpageInsulinTypeBtn().verifyPresent("Insulin type button");
		getOtriosLogbookpageInsulinTypeBtn().click();
		getOtriosLogbookpageInsulinTypeBtn().click();
		verifyInsulinType();
	/*	SG moving this to verifyInsulinType
	 	getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_RAPID);
		Reporter.logWithScreenShot("Insulin type rapid", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_lONG);
		Reporter.logWithScreenShot("Insulin type long", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_MIX);
		Reporter.logWithScreenShot("Insulin type mix", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_NPH);
		Reporter.logWithScreenShot("Insulin type nph", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_OTHER);
		Reporter.logWithScreenShot("Insulin type other", MessageTypes.Pass);
	*/	
		//WebDriverTestCase.verifyTrue(getOtriosLogbookpageInsulinTypeBtn().getAttribute("value").contains(ConstantUtils.IISULIN_TYPE_lONG),
		//		"inProper insulin type ",ConstantUtils.IISULIN_TYPE_lONG+" As per selection displayed");
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();

		
	}
	//Method to verify insulin type picker and value
	//milan
	public void verifyInsulinType(){
		getOtriosLogbookPageTimingPickerDatePkr().waitForPresent();
		Reporter.logWithScreenShot("Insulin type none", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(JNJUtilsIOS.getPropString("event.detail.insulinController.rapid"));
		Reporter.logWithScreenShot("Insulin type rapid", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(JNJUtilsIOS.getPropString("event.detail.insulinController.long"));
		Reporter.logWithScreenShot("Insulin type long", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(JNJUtilsIOS.getPropString("event.detail.insulinController.mix"));
		Reporter.logWithScreenShot("Insulin type mix", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(JNJUtilsIOS.getPropString("event.detail.insulinController.nph"));
		Reporter.logWithScreenShot("Insulin type nph", MessageTypes.Pass);
		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(JNJUtilsIOS.getPropString("event.detail.insulinController.other"));
		Reporter.logWithScreenShot("Insulin type other", MessageTypes.Pass);
//		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_RAPID);
//		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(ConstantUtils.IISULIN_TYPE_RAPID),
//				"inProper insulin type ",ConstantUtils.IISULIN_TYPE_RAPID+" As per selection displayed");
//		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_lONG);
//		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(ConstantUtils.IISULIN_TYPE_lONG),
//				"inProper insulin type ",ConstantUtils.IISULIN_TYPE_lONG+" As per selection displayed");
//		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_MIX);
//		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(ConstantUtils.IISULIN_TYPE_MIX),
//				"inProper insulin type ",ConstantUtils.IISULIN_TYPE_MIX+" As per selection displayed");
//		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_NPH);
//		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(ConstantUtils.IISULIN_TYPE_NPH),
//				"inProper insulin type ",ConstantUtils.IISULIN_TYPE_NPH+" As per selection displayed");
//		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.IISULIN_TYPE_OTHER);
//		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(ConstantUtils.IISULIN_TYPE_OTHER),
//				"inProper insulin type ",ConstantUtils.IISULIN_TYPE_OTHER+" As per selection displayed");
		
	}
	//Method to verify add activity screens and flow
	public void verifyAddActivityEventScreen() {
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		getOtriosLogbookpageActivityHeartImg().verifyPresent("Activity heart icon");
		getOtriosLogbookpageActivityAmountfieldTxt().verifyPresent("Glucose amount text field");
		getOtriosLogbookpageActivityUnitLbl().verifyPresent("UOM min ");

		getOtriosLogbookpageActivityNotefieldTxt().verifyPresent("Note field");
		getOtriosLogbookpageActivityNotefieldTxt().sendKeys("Entering BG");
		
		getOtriosLogbookpageActivityTimingBtn().click();
		getOtriosLogbookpageActivityTimingBtn().click();
		//verifyTimingPickerFunctionality(getOtriosLogbookpageActivityTimingLbl());
		getOtriosLogbookpageActivityIntensityBtn().click();
		if(!getOtriosLogbookPageTimingPickerDatePkr().isPresent())
		getOtriosLogbookpageActivityIntensityBtn().click();
		intensityType();
		getOtriosLogbookpageActivityHeartImg().click();

		
	}
	//Method to verify intensity type
	//Milan
	public void intensityType(){
		getOtriosLogbookPageTimingPickerDatePkr().waitForPresent();
		Reporter.logWithScreenShot("activity type", MessageTypes.Pass);
//		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.ACTIVITY_TYPE_LIGHT);
//		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(ConstantUtils.ACTIVITY_TYPE_LIGHT),
//				"inProper intensity type ",ConstantUtils.ACTIVITY_TYPE_LIGHT+" As per selection displayed");
//		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.ACTIVITY_TYPE_MODERATE);
//		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(ConstantUtils.ACTIVITY_TYPE_MODERATE),
//				"inProper intensity type ",ConstantUtils.ACTIVITY_TYPE_MODERATE+" As per selection displayed");
//		getOtriosLogbookPageTimingPickerDatePkr().sendKeys(ConstantUtils.ACTIVITY_TYPE_INTENSE);
//		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(ConstantUtils.ACTIVITY_TYPE_INTENSE),
//				"inProper intensity type ",ConstantUtils.ACTIVITY_TYPE_INTENSE+" As per selection displayed");
//		WebDriverTestCase.verifyTrue(getOtriosLogbookpageActivityIntensityBtn().getAttribute("value").contains(ConstantUtils.ACTIVITY_TYPE_INTENSE),
//				"Selected intensity value not displayed on event screen",ConstantUtils.ACTIVITY_TYPE_INTENSE+" Selected intensity displayed on event screen");
		
	}
	//Method to add multiple event and verify on home screen
	//Milan
	public void addMultipleEvent() {
		
EventDetailBeans eventBean = new EventDetailBeans();
		
		eventBean.fillData("addMultipleEvent.addGlucose");
		enterManualBGvalue(eventBean.getAmount());
		getOtriosLogbookpageGlucoseDropImg().click();
		getOtriosLogbookpageAddanothereventLbl().click();
		Reporter.logWithScreenShot("Added glucose amount"+eventBean.getAmount(), MessageTypes.Pass);
		
		getOtriosLogbookpageAddanothereventLbl().verifyPresent("Add Another Event text");

		userSelectFromLogEventList("carbs");
		eventBean.fillData("addMultipleEvent.addCarb");
		addCarbAmount(eventBean.getAmount());
		getOtriosLogbookPageCarbSpoonImg().click();
		getOtriosLogbookpageAddanothereventLbl().click();
		Reporter.logWithScreenShot("Added carb amount"+eventBean.getAmount(), MessageTypes.Pass);
		
		getOtriosLogbookpageSaveBtn().click();;
		HomePageIOS home=new HomePageIOS();
		home.clickOnHome();
		WebDriverTestCase.verifyTrue(home.getOtriosHomepageAddedEventDynamicAmountText(eventBean.getAmount()).isPresent(),
				eventBean.getAmount()+"Expected amount not present","Proper amount  "+eventBean.getAmount());
		WebDriverTestCase.verifyTrue(home.getOtriosHomepageAddedEventDynamicLbl(eventBean.getUnit()).isPresent(),
				"Inproper unit","Proper UOM  "+eventBean.getUnit());
		eventBean.fillData("addMultipleEvent.addGlucose");
		WebDriverTestCase.verifyTrue(home.getOtriosHomepageAddedEventDynamicAmountText(eventBean.getAmount()).isPresent(),
				eventBean.getAmount()+"Expected amount not present","Proper amount  "+eventBean.getAmount());
		WebDriverTestCase.verifyTrue(home.getOtriosHomepageAddedEventDynamicLbl(eventBean.getUnit()).isPresent(),
				"Inproper unit","Proper UOM  "+eventBean.getUnit());
		
	}
	//Method to verify BG limit
	//milan
	public void verifyAllowedBGRange(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		
		
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		getOtriosLogbookpageGlucoseDropImg().click();
		enterManualBGvalue("HI");
		WebDriverTestCase.verifyTrue(getOtriosLogbookpageGlucoseAmountTxt().getAttribute("value").contains("HI"),
				" HI is not entered after", "HI is entered after");
		enterManualBGvalue("LO");
		WebDriverTestCase.verifyTrue(getOtriosLogbookpageGlucoseAmountTxt().getAttribute("value").contains("LO"),
				" LO is not entered after", "LO is entered after");
		
		
		String option = eventBean.getUnit().toUpperCase();
		switch (option) {
		case "MG/DL":
			int lowvalue=Integer.parseInt(eventBean.getLowestGlucosValue())-1;
			enterManualBGvalue(""+lowvalue);
			getOtriosLogbookpageGlucoseDropImg().click();
			getOtriosLogbookPageStaticText(ConstantUtils.BG_VALUE_RANGE_ERROR_MSG).verifyPresent("Blood glucose range error for low value");
			getOtriosLogbookPageUndoBtn().click();
			int highvalue=Integer.parseInt(eventBean.getHighstGlucosValue())+1;
			enterManualBGvalue(""+highvalue);
			getOtriosLogbookpageGlucoseDropImg().click();
			getOtriosLogbookPageStaticText(ConstantUtils.BG_VALUE_RANGE_ERROR_MSG).verifyPresent("Blood glucose range error for high value");
			getOtriosLogbookPageUndoBtn().click();
			break;
		case "MMOL/L":
			double lowvalue1=(Float.parseFloat(eventBean.getLowestGlucosValue()))-0.1;
			enterManualBGvalue(""+lowvalue1);
			getOtriosLogbookpageGlucoseDropImg().click();
			getOtriosLogbookPageStaticText(ConstantUtils.BG_MMOL_VALUE_RANGE_ERROR_MSG).verifyPresent("Blood glucose range error for low value");
			getOtriosLogbookPageUndoBtn().click();
			double highvalue1= (Float.parseFloat(eventBean.getHighstGlucosValue()))+0.2;
			enterManualBGvalue(""+highvalue1);
			getOtriosLogbookpageGlucoseDropImg().click();
			getOtriosLogbookPageStaticText(ConstantUtils.BG_MMOL_VALUE_RANGE_ERROR_MSG).verifyPresent("Blood glucose range error for high value");
			getOtriosLogbookPageUndoBtn().click();
			
			break;
		}	
		
	}
	
	
	// Method to verify Add Event Screen
	public void verifyAddEventScreen() {
		getOtriosLogbookpageGlucoseBtn().verifyPresent("Add BG button is present");
		getOtriosLogbookpageCarbBtn().verifyPresent("Carbs button is present");
		getOtriosLogbookpageInsulinBtn().verifyPresent("Insulin button is present");
		getOtriosLogbookpageActivityBtn().verifyPresent("Activity button is present");
		getOtriosLogbookpageSaveBtn().verifyPresent("Save button is present");
		getOtriosLogbookpageBackBtn().verifyPresent("Back button is present");
	}
	
		
	// Method to tap back arrow
	public void tapAppBackArrow() {
		getOtriosLogbookpageBackBtn().click();
	}
		
		
	public void verifyUnitOfMeasurement(String option) {
		getOtriosLogbookPageAaddEventlbl().waitForPresent();
		option = option.toUpperCase();
		switch (option) {
		case "MG/DL":
			if(getOtriosLogbookpageGlucoseUnitLbl().getText().toString().equalsIgnoreCase("MG/DL"))
				Reporter.logWithScreenShot("Unit of Measurement is"+option, MessageTypes.Pass);
			break;
		case "MMOL/L":
			if(getOtriosLogbookpageGlucoseUnitLbl().getText().toString().equalsIgnoreCase("MMOL/L"))
				Reporter.logWithScreenShot("Unit of Measurement is"+option, MessageTypes.Pass);
			break;
		}			
	}
	public void clickClassic() {
		getOtriosLogbookPageClassicBtn().waitForPresent();
		getOtriosLogbookPageClassicBtn().click();
			
	}
	//Method to verify event screen and click on delete event 
	//milan
	public void verifydeleteEvent() {
		getOtriosLogbookPageEditaneventLbl().waitForPresent();
		getOtriosLogbookPageEditaneventLbl().verifyPresent("Edit screen");
		getOtriosLogbookPageEditEventDeleteBtn().verifyEnabled("Delete button");
		getOtriosLogbookPageEditEventDeleteBtn().click();
		if(!getOtriosLogbookPageOkBtn().isPresent())
			getOtriosLogbookPageEditEventDeleteBtn().click();
		//SG UPdate
		try{
			getOtriosLogbookPageOkBtn().waitForPresent();
			Reporter.logWithScreenShot("Delete confirm pop up", MessageTypes.Pass);
			getOtriosLogbookPageOkBtn().click();
			JNJUtilsIOS.waitforLoad();
			Reporter.logWithScreenShot("After clicking OK on delete confirm popup", MessageTypes.Pass);
		}catch(Exception e){}
	}
	//method to verify all event
	//Milan
	public void verifyAlleventScreen()
	{
		//getOtriosLogbookPageClassicBtn().waitForPresent();
		Reporter.log("Page Source: "+driver.getPageSource());
		getOtriosLogbookPageClassicBtn().click();
		getOtriosLogbookPageClassicBtn().verifyPresent("Logbook scren classic view btn");
		//getOtriosLogbookPageClassicBtn().verifyVisible("CLASSIC");
		Reporter.log("Page Source: "+driver.getPageSource());
		getOtriosLogbookPageDayBtn().click();
		getOtriosLogbookPageDayBtn().verifyPresent("Logbook scren day view btn");
		getOtriosLogbookPageWeekBtn().click();
		getOtriosLogbookPageWeekBtn().verifyPresent("Logbook scren week view btn");
		
	}
	
	public void clickClassicCurrentDate(Object eventDetail) {
		
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		String currentMonth = JNJUtilsIOS.getCurrentMonth();
		String currentMonthNumeric = JNJUtilsIOS.monthIntValue(currentMonth.substring(0, 3));
		int date = Integer.parseInt(JNJUtilsIOS.getCurrentDate());
			
		String dateformat = currentMonthNumeric + "/" + date;
		QAFWebElement ele=getOtriosLogbookPageClassicViewBGAddedBG(dateformat,eventBean.getAmount());
		ele.verifyPresent("added BG");
		ele.click();
		
			
	}
	//Method to verify note field length
	//milan
	public void maxAllowedNoteFieldCharacter() {
		getOtriosLogbookpageGlucoseAddnoteTxt().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(43);
	
		getOtriosLogbookpageGlucoseAddnoteTxt().clear();
		getOtriosLogbookpageGlucoseAddnoteTxt().sendKeys(typeName);
		Validator.verifyThat("Note charcter length",getOtriosLogbookpageGlucoseAddnoteTxt().
				getAttribute("value").length(),Matchers.lessThanOrEqualTo(42));
			
	}
	//Method to verify time picker future not allowed
	//Milan
	public void verifyTimePickerFutureNotAllowed(){
		
		
		
		Point p1 = getOtriosLogbookPageTimingPickerDatePkr().getLocation();
		Dimension d1 = getOtriosLogbookPageTimingPickerDatePkr().getSize();
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		int count=0;
		while (!(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").toString().contains(JNJUtilsIOS.getPropString("appCommon.today")))) {
			try {
				jnj.getDriver().tap(1, p1.getX()+ d1.getWidth(), p1.getY() + ((d1.getHeight())/2)+70, 500);
			} catch (Exception e) {
			}
			count++;
			if(count==10)
				break;
		}
		
		String day=getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value");
		jnj.getDriver().tap(1, p1.getX() + d1.getWidth(), p1.getY() + ((d1.getHeight()) / 2) + 70, 500);
		JNJUtilsIOS.pause(1000);
		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerDatePkr().getAttribute("value").contains(day), "Selecting future date",
				"picker now allowing Past date ");
		
		Point p2 = getOtriosLogbookPageTimingPickerHourPkr().getLocation();
		Dimension d2 = getOtriosLogbookPageTimingPickerHourPkr().getSize();
		String hour=getOtriosLogbookPageTimingPickerHourPkr().getAttribute("value").replaceAll("[^0-9]", "");
		jnj.getDriver().tap(1, p2.getX() + d2.getWidth(), p2.getY() + ((d2.getHeight()) / 2) + 70, 500);
		JNJUtilsIOS.pause(1000);
		WebDriverTestCase.verifyTrue(getOtriosLogbookPageTimingPickerHourPkr().getAttribute("value").contains(hour), "Selecting future hour",
				"picker now allowing Past hour ");
		
	}
	//Method to verify carb allowed value range
	//Milan
	public void carValuebAllowedRange(){
		getOtriosLogbookPageCarbSpoonImg().click();
		addCarbAmount("1000");
		WebDriverTestCase.verifyTrue(!getOtriosLogbookPageCarbAmountFieldTxt().getAttribute("value").contains("1000"), "Allowing value more than 999",
				"Max allowe value 999");
		
		getOtriosLogbookpageCarbTimingBtn().click();
		getOtriosLogbookpageCarbTimingBtn().click();
		verifyTimePickerFutureNotAllowed();
		getOtriosLogbookPageCarbSpoonImg().click();
		getOtriosLogbookPageCarbSpoonImg().click();
		maxAllowedNoteFieldCharacter();
	}
	//Method to verify insulin allowed range
	//Milan
	public void insulinAllowedRangeTimeType(){
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		getOtriosLogbookpageInsulinTypeBtn().click();
		selectInsulinType(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"));
		addInsulinAmount("251");
		getOtriosLogbookpageInsulinMedicineImg().click();
		getOtriosLogbookPageImproperPopUpLbl().waitForPresent();
		getOtriosLogbookPageStaticText(JNJUtilsIOS.getPropString("insulin.valueAlert.message")).verifyPresent("Insulin value must be between 0 and 250");
		getOtriosLogbookPageUndoBtn().click();
		addInsulinAmount("250");
		getOtriosLogbookpageInsulinMedicineImg().click();
		//todo verification without selecting insulin type
		
		
		getOtriosLogbookpageInsulinTimingBtn().click();
		verifyTimePickerFutureNotAllowed();
		getOtriosLogbookpageInsulinMedicineImg().click();
		getOtriosLogbookpageInsulinMedicineImg().click();
		maxAllowedNoteFieldCharacter();
		
	}
	//Method to verify activity allowed range
	//Milan
	public void activityAllowedRangeTimeDuration(){
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		getOtriosLogbookpageActivityHeartImg().click();
		addActivityAmount("1441");
		getOtriosLogbookpageActivityHeartImg().click();
		getOtriosLogbookPageImproperPopUpLbl().waitForPresent();
		getOtriosLogbookPageStaticText(JNJUtilsIOS.getPropString("activity.timeAlert.message")).verifyPresent("Activity time must be between 0 and 1440");
		getOtriosLogbookPageUndoBtn().click();
		addActivityAmount("1440");
		getOtriosLogbookpageActivityTimingBtn().click();
		//todo verification without selecting ACTIVIY duration
		
		
		getOtriosLogbookpageActivityTimingBtn().click();
		verifyTimePickerFutureNotAllowed();
		getOtriosLogbookpageActivityHeartImg().click();
		getOtriosLogbookpageActivityHeartImg().click();
		maxAllowedNoteFieldCharacter();
		
	}
	//Method to verify glucose time  and note field verification
	//Milan
	public void BGAllowedNoteRangeTime(){
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
//		getOtriosLogbookpageGlucoseDropImg().click();		
		
		getOtriosLogbookPageglucoseTimingValuebBtn().click();
		verifyTimePickerFutureNotAllowed();
		getOtriosLogbookpageGlucoseDropImg().click();
		getOtriosLogbookpageGlucoseDropImg().click();
		maxAllowedNoteFieldCharacter();
		
	}
	//Method to verify adding multiple event and verify on logbook
	//Milan
	public void AddGlucoseCarbActivity(){
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		getOtriosLogbookpageGlucoseDropImg().click();
		int randomNumberGlucose = ThreadLocalRandom.current().nextInt(21, 200);
		ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
		
		enterManualBGvalue(randomNumberGlucose+"");
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberGlucose, MessageTypes.Pass);
		getOtriosLogbookpageGlucoseDropImg().click();
		
		
		userSelectFromLogEventList("CARBS");
		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
		ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
		addCarbAmount(randomNumberCarb+"");
		Reporter.logWithScreenShot("Carb window after entering value"+randomNumberCarb, MessageTypes.Pass);
		getOtriosLogbookPageCarbSpoonImg().click();
		
		userSelectFromLogEventList("ACTIVITY");
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 1000);
		ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity);
		addActivityAmount(randomNumberActivity+"");
		getOtriosLogbookpageActivityHeartImg().click();
		Reporter.logWithScreenShot("Activity window after adding value is "+randomNumberActivity, MessageTypes.Pass);
		getOtriosLogbookpageActivityIntensityBtn().click();
		
		selectIntensity(ConfigurationManager.getBundle().getString("activity.intensity.moderate"));
		Reporter.logWithScreenShot("Selected intensity type", MessageTypes.Pass);
		getOtriosLogbookpageActivityHeartImg().click();
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		
	}
	//Method to edit glucose carb and activity from logbook classic view
	//Milan
	public void editGlucoseCarbActivity(){
		
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageGlucoseAmountTxtList().size();i++){
		String randomNumberGlucose=ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if(getOtriosLogbookpageGlucoseAmountTxtList().get(i).getAttribute("value").equals(randomNumberGlucose)){
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				JNJUtilsIOS.clearTextField(getOtriosLogbookpageGlucoseAmountTxtList().get(i));
				int randomNumberGlucose1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtriosLogbookpageGlucoseAmountTxtList().get(i).sendKeys(randomNumberGlucose1+"");
				Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberGlucose, MessageTypes.Pass);
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
				break;
			}
			
		}
		
		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookPageCarbAmountFieldTxtList().size();i++){
			String randomNumberCarb=ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if(getOtriosLogbookPageCarbAmountFieldTxtList().get(i).getAttribute("value").equals(randomNumberCarb)){
				getOtriosLogbookPageCarbSpoonImgList().get(i).click();
				JNJUtilsIOS.clearTextField(getOtriosLogbookPageCarbAmountFieldTxtList().get(i));
				int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(1, 100);
				getOtriosLogbookPageCarbAmountFieldTxtList().get(i).sendKeys(randomNumberCarb1+"");
				Reporter.logWithScreenShot("Carb window after entering value"+randomNumberCarb, MessageTypes.Pass);
				getOtriosLogbookPageCarbSpoonImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb1);
				break;
			}
		}
		
		
		
		
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageActivityAmountfieldTxtList().size();i++){
			String randomNumberActivity=ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if(getOtriosLogbookpageActivityAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberActivity)){
				getOtriosLogbookpageActivityHeartImgList().get(i).click();
				JNJUtilsIOS.clearTextField(getOtriosLogbookpageActivityAmountfieldTxtList().get(i));
				int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(10, 1000);
				getOtriosLogbookpageActivityAmountfieldTxtList().get(i).sendKeys(randomNumberActivity1+"");
				Reporter.logWithScreenShot("Activity window after entering value"+randomNumberActivity, MessageTypes.Pass);
				getOtriosLogbookpageActivityHeartImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity1);
				break;
			}
		}
		
		
	
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	
	//Method to delete added item from classic view
	//Milan
	public void deleteGlucoseCarbActivity(){

		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookPageCarbAmountFieldTxtList().size();i++){
			String randomNumberCarb=ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if(getOtriosLogbookPageCarbAmountFieldTxtList().get(i).getAttribute("value").equals(randomNumberCarb)){
				getOtriosLogbookPageCarbSpoonImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						if(getOtriosLogbookPageOkBtn().isPresent())
							getOtriosLogbookPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking deleteing carb", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
		
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageActivityAmountfieldTxtList().size();i++){
			String randomNumberActivity=ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if(getOtriosLogbookpageActivityAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberActivity)){
				getOtriosLogbookpageActivityHeartImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						if(getOtriosLogbookPageOkBtn().isPresent())
							getOtriosLogbookPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking deleteing activity", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
		
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageGlucoseAmountTxtList().size();i++){
			String randomNumberGlucose=ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if(getOtriosLogbookpageGlucoseAmountTxtList().get(i).getAttribute("value").equals(randomNumberGlucose)){
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						if(getOtriosLogbookPageOkBtn().isPresent())
							getOtriosLogbookPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking deleteing glucose", MessageTypes.Pass);
						break;
					}
				}
				break;
				
			}
		}
		
	}
	
	//Method to click on Glucose event 
	//Milan
	public void clickOnGlucoseEventClassicView(){
		String randomNumberGlucose=ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		String currentMonth = JNJUtilsIOS.getCurrentMonth();
		String currentMonthNumeric = JNJUtilsIOS.monthIntValue(currentMonth.substring(0, 3));
		int date = Integer.parseInt(JNJUtilsIOS.getCurrentDate());
			
		String dateformat = currentMonthNumeric + "/" + date;
		QAFWebElement ele=getOtriosLogbookPageClassicViewBGAddedBG(dateformat,randomNumberGlucose);
		ele.verifyPresent("added BG");
		ele.click();
	}
	
	//Method to add glucose and insulin
	//Milan
	public void addGlucoseAndInsulin(){
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		//getOtriosLogbookpageGlucoseDropImg().click();
		int randomNumberGlucose = ThreadLocalRandom.current().nextInt(21, 200);
		ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
		
		enterManualBGvalue(randomNumberGlucose+"");
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberGlucose, MessageTypes.Pass);
		getOtriosLogbookpageGlucoseDropImg().click();
		
		
		
		userSelectFromLogEventList("INSULIN");
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		//getOtriosLogbookpageInsulinMedicineImg().click();
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin);
		addInsulinAmount(randomNumberInsulin+"");
		Reporter.logWithScreenShot("Insulin window after adding value is "+randomNumberInsulin, MessageTypes.Pass);
		
		getOtriosLogbookpageInsulinTypeBtn().click();
		getOtriosLogbookpageInsulinTypeBtn().click();
		selectInsulinType(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"));
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//Method to edit blood glucose and insulin details
	//Milan
	public void editGlucoseInsulin(){
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageGlucoseAmountTxtList().size();i++){
			String randomNumberGlucose=ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if(getOtriosLogbookpageGlucoseAmountTxtList().get(i).getAttribute("value").equals(randomNumberGlucose)){
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				//JNJUtilsIOS.clearTextField(getOtriosLogbookpageGlucoseAmountTxtList().get(i));
				getOtriosLogbookpageGlucoseAmountTxtList().get(i).clear();
				int randomNumberGlucose1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtriosLogbookpageGlucoseAmountTxt().sendKeys(randomNumberGlucose1+"");
				Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberGlucose1, MessageTypes.Pass);
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
				break;
			}
			
		}
		
		
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageInsulinAmountfieldTxtList().size();i++){
			String randomNumberInsulin=ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			if(getOtriosLogbookpageInsulinAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberInsulin)){
				getOotriosLogbookpageInsulinMedicineImgList().get(i).click();
				JNJUtilsIOS.clearTextField(getOtriosLogbookpageInsulinAmountfieldTxtList().get(i));
				int randomNumberInsulin1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtriosLogbookpageInsulinAmountfieldTxtList().get(i).sendKeys(randomNumberInsulin1+"");
				Reporter.logWithScreenShot("Insulin window after editing value"+randomNumberInsulin1, MessageTypes.Pass);
				getOotriosLogbookpageInsulinMedicineImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin1);
				break;
			}
		}
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//method to delete glucose and insulin from classic view
	//Milan
	public void deleteGlucoseInsulin(){
		
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageInsulinAmountfieldTxtList().size();i++){
			String randomNumberActivity=ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			if(getOtriosLogbookpageInsulinAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberActivity)){
				getOotriosLogbookpageInsulinMedicineImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						if(getOtriosLogbookPageOkBtn().isPresent())
							getOtriosLogbookPageOkBtn().click();
						break;
					}
				}
				break;
			}
		}
		
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageGlucoseAmountTxtList().size();i++){
			String randomNumberGlucose=ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if(getOtriosLogbookpageGlucoseAmountTxtList().get(i).getAttribute("value").equals(randomNumberGlucose)){
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						if(getOtriosLogbookPageOkBtn().isPresent())
							getOtriosLogbookPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking deleteing glucose", MessageTypes.Pass);
						break;
					}
				}
				break;
				
			}
		}
	}
	//Method to verify 365 days on clasic view screen
	//Milan
	public void verify365DayClassicView(){
		getOtriosLogbookPageStaticText("/").waitForPresent();

		String currentMonth = JNJUtilsIOS.getCurrentMonth().substring(0, 3);
		int currentMonthNumeric = Integer.parseInt(JNJUtilsIOS.monthIntValue(currentMonth	));
		int date = Integer.parseInt(JNJUtilsIOS.getCurrentDate());
		String dateformat1 = currentMonthNumeric + "/" + (date-1);
		
		
		int currentMonthNoDay=Integer.parseInt(JNJUtilsIOS.monthNoOFDay(currentMonth).replaceAll("[^0-9]", ""));
		int date2=0;
		int nextMonthNumeric=currentMonthNumeric+1;
		
		String dateformat2="";
		if(date==currentMonthNoDay){
			date2=1;
			dateformat2=nextMonthNumeric+ "/" + (date2);
		}else{
			date2=date+1;
			dateformat2=currentMonthNumeric+ "/" + (date2);
		}
		
		Point p=getOtriosLogbookPageStaticText(dateformat1).getLocation();
		int count=0;
		while(!getOtriosLogbookPageStaticText(dateformat2).isPresent())
		{
			JNJUtilsIOS.swipeWithCoordinates(p.getX()+100, p.getY()+200, p.getX()+100, p.getY()+60, 10);
			JNJUtilsIOS.pause(1000);
			count++;
			if(count==70)
				break;
		}
		WebDriverTestCase.verifyTrue(getOtriosLogbookPageStaticText(dateformat2).isPresent(),
				" Date 365 day before not present", "Date 365 day before present");
	}
	
	//Method to click on today from logbook week view
	//Milan
	public void clickOnTodayWeekView(){

		getOtriosLogbookPageClassicDayboxBtn().waitForPresent();
		Point p1=getOtriosLogbookpageAddeventBtn().getLocation();
		Dimension d1 =getOtriosLogbookpageAddeventBtn().getSize();
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		
		jnj.getDriver().tap(1, p1.getX(), p1.getY() + (d1.getHeight()+110), 500);
				
		
//		getOtriosLogbookPageClassicDayboxBtn().click();
		
	}
	//Method to edit added glucose
	// Milan
	// Edited By Sangram 09/05/2017
	public static String dateLabelOnLogbook1;

	public void addRandomGlucose() {
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		getOtriosLogbookpageGlucoseDropImg().click();
		int randomNumberGlucose = ThreadLocalRandom.current().nextInt(21, 200);
		ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
		enterManualBGvalue(randomNumberGlucose + "");
		Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose, MessageTypes.Pass);
		dateLabelOnLogbook1 = getOtriosLogbookPageSelectedDateText().getAttribute("label");
		getOtriosLogbookpageGlucoseDropImg().click();
		getOtriosLogbookpageSaveBtn().click();

	}

	// Edit random glucose
	//Milan
	public void editRandomGlucose(){
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageGlucoseAmountTxtList().size();i++){
			String randomNumberGlucose=ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if(getOtriosLogbookpageGlucoseAmountTxtList().get(i).getAttribute("value").equals(randomNumberGlucose)){
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				//JNJUtilsIOS.clearTextField(getOtriosLogbookpageGlucoseAmountTxtList().get(i));
				getOtriosLogbookpageGlucoseAmountTxtList().get(i).clear();
				int randomNumberGlucose1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtriosLogbookpageGlucoseAmountTxt().sendKeys(randomNumberGlucose1+"");
				Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberGlucose1, MessageTypes.Pass);
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
				break;
			}
			
		}
		getOtriosLogbookpageSaveBtn().click();
	}
	//Delete random glucose
	//Milan
	public void deleteRandomGlucose(){
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageGlucoseAmountTxtList().size();i++){
			String randomNumberGlucose=ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if(getOtriosLogbookpageGlucoseAmountTxtList().get(i).getAttribute("value").equals(randomNumberGlucose)){
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						Reporter.logWithScreenShot("After clicking deleteing glucose", MessageTypes.Pass);
						if(getOtriosLogbookPageOkBtn().isPresent())
							Reporter.logWithScreenShot("Delete confirm pop up", MessageTypes.Pass);
							getOtriosLogbookPageOkBtn().click();
						break;
					}
				}
				break;
				
			}
		}
		
	}
	//Method to click on week view button
	//Milan
	public void clickWeekViewBtn(){
		getOtriosLogbookPageWeekBtn().waitForPresent();
		getOtriosLogbookPageWeekBtn().click();
	}
	//Method to add random carb
	//Milan
	public void addRandomCarb(){
		userSelectFromLogEventList("CARBS");
		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		getOtriosLogbookPageCarbSpoonImg().click();
		int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
		ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
		addCarbAmount(randomNumberCarb+"");
		Reporter.logWithScreenShot("Carb window after entering value"+randomNumberCarb, MessageTypes.Pass);
		getOtriosLogbookPageCarbSpoonImg().click();
		getOtriosLogbookpageSaveBtn().click();
	}
	//Method to add random carb
	//Milan
	public void editRandomCarb(){
		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookPageCarbAmountFieldTxtList().size();i++){
			String randomNumberCarb=ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if(getOtriosLogbookPageCarbAmountFieldTxtList().get(i).getAttribute("value").equals(randomNumberCarb)){
				getOtriosLogbookPageCarbSpoonImgList().get(i).click();
				JNJUtilsIOS.clearTextField(getOtriosLogbookPageCarbAmountFieldTxtList().get(i));
				int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(1, 100);
				getOtriosLogbookPageCarbAmountFieldTxtList().get(i).sendKeys(randomNumberCarb1+"");
				Reporter.logWithScreenShot("Carb window after entering value"+randomNumberCarb1, MessageTypes.Pass);
				getOtriosLogbookPageCarbSpoonImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb1);
				break;
			}
		}
		getOtriosLogbookPageCarbSpoonImg().click();
		getOtriosLogbookpageSaveBtn().click();
	}
	//Method to delete random carb
	//Milan
	public void deleteRandomCarb(){
		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookPageCarbAmountFieldTxtList().size();i++){
			String randomNumberCarb=ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if(getOtriosLogbookPageCarbAmountFieldTxtList().get(i).getAttribute("value").equals(randomNumberCarb)){
				getOtriosLogbookPageCarbSpoonImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						Reporter.logWithScreenShot("After clicking deleteing carb", MessageTypes.Pass);
						if(getOtriosLogbookPageOkBtn().isPresent())
							Reporter.logWithScreenShot("Delete confirm pop up", MessageTypes.Pass);
							getOtriosLogbookPageOkBtn().click();
						break;
					}
				}
				break;
			}
		}
	}
	//Method to add random insulin
	//Milan
	public void addRandomInsulin(){
		userSelectFromLogEventList("INSULIN");
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		getOtriosLogbookpageInsulinMedicineImg().click();
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin);
		addInsulinAmount(randomNumberInsulin+"");
		Reporter.logWithScreenShot("Insulin window after adding value is "+randomNumberInsulin, MessageTypes.Pass);
		
		getOtriosLogbookpageInsulinTypeBtn().click();
		getOtriosLogbookpageInsulinTypeBtn().click();
		selectInsulinType(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"));
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//Method to edit random insulin
	//Milan
	public void editRandomInsulin(){
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageInsulinAmountfieldTxtList().size();i++){
			String randomNumberInsulin=ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			if(getOtriosLogbookpageInsulinAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberInsulin)){
				getOotriosLogbookpageInsulinMedicineImgList().get(i).click();
				JNJUtilsIOS.clearTextField(getOtriosLogbookpageInsulinAmountfieldTxtList().get(i));
				int randomNumberInsulin1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtriosLogbookpageInsulinAmountfieldTxtList().get(i).sendKeys(randomNumberInsulin1+"");
				Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberInsulin, MessageTypes.Pass);
				getOotriosLogbookpageInsulinMedicineImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin1);
				break;
			}
			
		}
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//Method to delete random insulin
	//Milan
	public void deleteRandomInsulin(){
		getOtriosLogbookpageInsulinMedicineImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageInsulinAmountfieldTxtList().size();i++){
			String randomNumberActivity=ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			if(getOtriosLogbookpageInsulinAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberActivity)){
				getOotriosLogbookpageInsulinMedicineImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						if(getOtriosLogbookPageOkBtn().isPresent())
							Reporter.logWithScreenShot("Delete confirm pop up", MessageTypes.Pass);
							getOtriosLogbookPageOkBtn().click();
							Reporter.logWithScreenShot("After clicking ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
	}
	//Method to add random activity
	//Milan
	public void addRandomActivity(){
		userSelectFromLogEventList("ACTIVITY");
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		getOtriosLogbookpageActivityHeartImg().click();
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 1000);
		ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity);
		addActivityAmount(randomNumberActivity+"");
		getOtriosLogbookpageActivityHeartImg().click();
		Reporter.logWithScreenShot("Activity window after adding value is "+randomNumberActivity, MessageTypes.Pass);
		getOtriosLogbookpageActivityIntensityBtn().click();
		
		selectIntensity(ConfigurationManager.getBundle().getString("activity.intensity.moderate"));
		Reporter.logWithScreenShot("Selected intensity type", MessageTypes.Pass);
		getOtriosLogbookpageActivityHeartImg().click();
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//Method to edit random activity
	//Milan
	public void editRandomActivity(){
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageActivityAmountfieldTxtList().size();i++){
			String randomNumberActivity=ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if(getOtriosLogbookpageActivityAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberActivity)){
				getOtriosLogbookpageActivityHeartImgList().get(i).click();
				JNJUtilsIOS.clearTextField(getOtriosLogbookpageActivityAmountfieldTxtList().get(i));
				int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(10, 1000);
				getOtriosLogbookpageActivityAmountfieldTxtList().get(i).sendKeys(randomNumberActivity1+"");
				Reporter.logWithScreenShot("Activity window after entering value"+randomNumberActivity, MessageTypes.Pass);
				getOtriosLogbookpageActivityHeartImgList().get(i).click();
				ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity1);
				break;
			}
		}
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//Method delete random activity
	//Milan
	public void deleteRandomActivity(){
		getOtriosLogbookpageActivityHeartImg().waitForPresent();
		for(int i=0;i<getOtriosLogbookpageActivityAmountfieldTxtList().size();i++){
			String randomNumberActivity=ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if(getOtriosLogbookpageActivityAmountfieldTxtList().get(i).getAttribute("value").equals(randomNumberActivity)){
				getOtriosLogbookpageActivityHeartImgList().get(i).click();
				for(int j=0;j<getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						if(getOtriosLogbookPageOkBtn().isPresent())
							Reporter.logWithScreenShot("Delete confirm pop up", MessageTypes.Pass);
							getOtriosLogbookPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking deleteing activity", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
	}
	
	//Method to click and verify info screen
	//Milan
	public void clickAndVerifyInfoScreenLogbook(){
		getOtriosLogbookPageWeekInfoBtn().waitForPresent();
		getOtriosLogbookPageWeekInfoBtn().click();
		getOtriosLogbookLegendPageTitle().waitForPresent();
		Reporter.logWithScreenShot("Graph Legend screen", MessageTypes.Pass);
	}
	//Method to verify insulin field not displaying
	//Milan
	public void verifyNoInsulinSectionWeekView(){
		getOtriosLogbookInsulinTitle().verifyNotVisible("Insulin Section");
	}
	
	//Method to add previous date for glucose
	//Milan
	public void addPreviousDateGlucose(Object eventDetail){
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		getOtriosLogbookpageGlucoseDropImg().click();
		
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
		enterManualBGvalue("200");
		Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
		
		getOtriosLogbookPageglucoseTimingValuebBtn().click();
		getOtriosLogbookPageglucoseTimingValuebBtn().click();
		selectEventTimingPicker(eventBean);
		
		
	}
	
	//Method to click on day view
	//Milan
	public void clickOnDayView(){
		getOtriosLogbookPageDayBtn().waitForPresent();
		getOtriosLogbookPageDayBtn().click();
	}
	//Method to select click on left picker
	//Milan
	public void clickArrow(String option){
		option = option.toLowerCase();
		switch (option) {
		case "left":
		
			getOtriosLogbookpageLeftarrowBtn().click();
			Reporter.logWithScreenShot("After clicking left arrow", MessageTypes.Pass);
			break;
		case "right":
			getOtriosLogbookpageRightarrowBtn().click();
			Reporter.logWithScreenShot("After clicking right arrow", MessageTypes.Pass);
			break;
		}
	}
	//Method to take screen shot of last day
	//Milan
	public void lastDayScreen(){
		Reporter.logWithScreenShot("view screen", MessageTypes.Pass);
	}
	//Method to add multiple glucose for high low and inrange
	//Milan
	public void addMultipleGlucose()
	{
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		getOtriosLogbookpageGlucoseDropImg().click();
		int minGlucose = 70;
		enterManualBGvalue(minGlucose+"");
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+minGlucose, MessageTypes.Pass);
		getOtriosLogbookpageGlucoseDropImg().click();
		
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
//		getOtriosLogbookpageGlucoseDropImgList().get(1).click();
		int inrangeGlucose =110;
		getOtriosLogbookpageGlucoseAmountTxtList().get(1).sendKeys(""+inrangeGlucose);
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+inrangeGlucose, MessageTypes.Pass);
		getOtriosLogbookpageGlucoseDropImgList().get(1).click();
		
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
//		getOtriosLogbookpageGlucoseDropImgList().get(2).click();
		int highGlucose = 200;
		getOtriosLogbookpageGlucoseAmountTxtList().get(2).sendKeys(""+highGlucose);
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+highGlucose, MessageTypes.Pass);
		getOtriosLogbookpageGlucoseDropImgList().get(2).click();
		
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	
	//Method to set before and after meal
	//Milan
	public void setBGForBeforeAfterMeal(){
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		getOtriosLogbookpageGlucoseDropImg().click();
		int minGlucose = 70;
		enterManualBGvalue(minGlucose+"");
		getOtriosLogbookpageGlucoseDropImg().click();
		addGlucoseSelectBeforeAfter("before");
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+minGlucose, MessageTypes.Pass);
		getOtriosLogbookpageGlucoseDropImg().click();
		
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		int inrangeGlucose =110;
		getOtriosLogbookpageGlucoseAmountTxtList().get(1).sendKeys(""+inrangeGlucose);
		getOtriosLogbookpageGlucoseDropImgList().get(1).click();
		
		getOtriosLogbookpageGlucoseAftermealBtnList().get(1).click();
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+inrangeGlucose, MessageTypes.Pass);

		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}
	//Method to edit blood glucose for specific date
	//Milan
	public void setDateRandomBG(String range){
		int dateRange=Integer.parseInt(range)+2;
		int count=0;
		HomePageIOS home=new HomePageIOS();
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		for(int i=0;i<home.getOtriosHomepageLastreadingReadingsValueTxt().size();i++){
		String randomNumberGlucose=ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if(home.getOtriosHomepageLastreadingReadingsValueTxt().get(i).getAttribute("value").equals(randomNumberGlucose)){
				getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				JNJUtilsIOS.clearTextField(getOtriosLogbookpageGlucoseAmountTxt());
				int randomNumberGlucose1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtriosLogbookpageGlucoseAmountTxt().sendKeys(randomNumberGlucose1+"");
				Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberGlucose1, MessageTypes.Pass);
				getOtriosLogbookpageGlucoseDropImg().click();
				ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
				
				getOtriosLogbookPageglucoseTimingValuebBtn().click();
				Point p1=getOtriosLogbookPageTimingPickerDatePkr().getLocation();
				Dimension d1 =getOtriosLogbookPageTimingPickerDatePkr().getSize();
				JNJUtilsIOS jnj=new JNJUtilsIOS();
				//selecting last day from date picker
				while (count!=dateRange) {
					jnj.getDriver().tap(1, p1.getX()+ d1.getWidth(), p1.getY() + ((d1.getHeight())/2)-50, 500);
					JNJUtilsIOS.pause(3000);
					count++;
					
				}
				getOtriosLogbookPageDoneBtnText().click();
				Reporter.logWithScreenShot("Selected day", MessageTypes.Pass);
				
				break;
			}
			
		}
		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
		
	}
	//Method to add glucose for today and yesterday
	//Milan
	public void addTodayYesterDayEvent(){
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		//getOtriosLogbookpageGlucoseDropImg().click();
		int randomNumberGlucose = ThreadLocalRandom.current().nextInt(21, 200);
		ConfigurationManager.getBundle().setProperty("random.glucose1", randomNumberGlucose);
		
		enterManualBGvalue(randomNumberGlucose+"");
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberGlucose, MessageTypes.Pass);
		getOtriosLogbookpageGlucoseDropImg().click();
		
		userSelectFromLogEventList("GLUCOSE");
		getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		//getOtriosLogbookpageGlucoseDropImg().click();
		int randomNumberGlucose2 = ThreadLocalRandom.current().nextInt(21, 200);
		ConfigurationManager.getBundle().setProperty("random.glucose2", randomNumberGlucose2);
		getOtriosLogbookpageGlucoseAmountTxtList().get(1).sendKeys(""+randomNumberGlucose2);
		getOtriosLogbookPageglucoseTimingValuebBtnList().get(1).click();
		Reporter.logWithScreenShot("111111111", MessageTypes.Pass);
		
		if(!getOtriosLogbookPageTimingPickerDatePkr().isPresent())
			getOtriosLogbookPageglucoseTimingValuebBtnList().get(1).click();
		Reporter.logWithScreenShot("22222222", MessageTypes.Pass);
		
		Point p1=getOtriosLogbookPageTimingPickerDatePkr().getLocation();
		Dimension d1 =getOtriosLogbookPageTimingPickerDatePkr().getSize();
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		//selecting last day from date picker
		jnj.getDriver().tap(1, p1.getX()+ d1.getWidth(), p1.getY() + ((d1.getHeight())/2)-50, 500);
		Reporter.logWithScreenShot("Selected day", MessageTypes.Pass);
		getOtriosLogbookPageDoneBtnText().click();
		Reporter.logWithScreenShot("Blood Glucose window after editing value"+randomNumberGlucose2, MessageTypes.Pass);
		getOtriosLogbookpageSaveBtn().click();
	}

	public void verifyDefaultInsulinType() {
		
		WebDriverTestCase.verifyTrue(getOtriosLogbookPageInsulinTypeLbl().getAttribute("label")
				.contains(JNJUtilsIOS.getPropString("event.detail.insulinController.rapid")),
				"Default insulin type not present", "Default insulin type present");
	}

	public void verifyLastInsulinAsDefault() {
		
		String insulinType=ConfigurationManager.getBundle().getString("last.added.insulin.type");
		WebDriverTestCase.verifyTrue(getOtriosLogbookPageInsulinTypeLbl().getAttribute("label")
				.contains(insulinType),
				"Last added insulin type not present", "Last added insulin type present");
	}
	//Method to check date on add event date label
	public void verifyDefaultDateForYesterday(){
		String date=getOtriosLogbookPageglucoseTimingValuebBtn().getAttribute("value");
		WebDriverTestCase.verifyTrue(!date.contains("Today"),
				"Default date is Today", "Default date is correct"+date);
	}
	//Method to click on day view event field
	public void clickOnDayViewEvent(){
		Point p1=getOtriosLogbookpageAddeventBtn().getLocation();
		Dimension d1 =getOtriosLogbookpageAddeventBtn().getSize();
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		
		jnj.getDriver().tap(1, p1.getX(), p1.getY() + (d1.getHeight()+110), 500);
	}
	//Method to verify right forward arrow should not display when in current day
	public void verifyRightArrowInvisible(){
		getOtriosLogbookpageRightarrowBtn().verifyNotVisible("Forward arrow on Today view");
	}

	// Method to edit carb details
	// Milan
	public void noEditDetails(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		getOtriosLogbookPageCarbSpoonImg().waitForPresent();
		Reporter.logWithScreenShot("Carb window before editing value", MessageTypes.Pass);
	
		 getOtriosLogbookpageCarbTimingBtn().click();
		 getOtriosLogbookpageCarbTimingBtn().click();
		 Point p1=getOtriosLogbookPageTimingPickerDatePkr().getLocation();
			Dimension d1 =getOtriosLogbookPageTimingPickerDatePkr().getSize();
			JNJUtilsIOS jnj=new JNJUtilsIOS();
			//selecting last day from date picker
			jnj.getDriver().tap(1, p1.getX()+ d1.getWidth(), p1.getY() - ((d1.getHeight())/2)-50, 500);
		 selectEventTimingPicker(eventBean);
		 Reporter.logWithScreenShot("Set date and time", MessageTypes.Pass);
			getOtriosLogbookPageDoneBtnText().click();


		getOtriosLogbookpageSaveBtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}
}
