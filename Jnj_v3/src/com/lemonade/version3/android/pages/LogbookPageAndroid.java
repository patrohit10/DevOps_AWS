package com.lemonade.version3.android.pages;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.android.beans.EventDetailBeans;
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

public class LogbookPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.logbook.addevent.btn")
	private QAFWebElement otrLogbookAddeventBtn;
	@FindBy(locator = "otr.logbook.addevent.lbl")
	private QAFWebElement otrLogbookAddeventLbl;
	@FindBy(locator = "otr.logbook.addevent.addbgvalue.btn")
	private QAFWebElement otrLogbookAddeventAddbgvalueBtn;
	@FindBy(locator = "otr.logbook.addevent.addcarbvalue.btn")
	private QAFWebElement otrLogbookAddeventAddcarbvalueBtn;
	@FindBy(locator = "otr.logbook.addevent.addinsulinvalue.btn")
	private QAFWebElement otrLogbookAddeventAddinsulinvalueBtn;
	@FindBy(locator = "otr.logbook.addevent.addactivityvalue.btn")
	private QAFWebElement otrLogbookAddeventAddactivityvalueBtn;
	@FindBy(locator = "otr.logbook.addevent.save.btn")
	private QAFWebElement otrLogbookAddeventSaveBtn;
	@FindBy(locator = "otr.logbook.addbg.addvalue.txt")
	private QAFWebElement otrLogbookAddbgAddvalueTxt;
	@FindBy(locator = "otr.logbook.addbg.addvalue.txt")
	private List<QAFWebElement> otrLogbookAddbgAddvalueTxtList;
	@FindBy(locator = "otr.logbook.addbg.beforemeal.tab")
	private QAFWebElement otrLogbookAddbgBeforemealTab;
	@FindBy(locator = "otr.logbook.addbg.aftermeal.tab")
	private QAFWebElement otrLogbookAddbgAftermealTab;
	@FindBy(locator = "otr.logbook.addbg.time.lbl")
	private QAFWebElement otrLogbookAddbgTimeLbl;
	@FindBy(locator = "otr.logbook.addbg.time.btn")
	private QAFWebElement otrLogbookAddbgTimeBtn;
	@FindBy(locator = "otr.logbook.addevent.timeselect.cancel.btn")
	private QAFWebElement otrLogbookAddeventTimeselectCancelBtn;
	@FindBy(locator = "otr.logbook.addevent.timeselect.ok.btn")
	private QAFWebElement otrLogbookAddeventTimeselectOkBtn;
	@FindBy(locator = "otr.logbook.addevent.timeselect.hour.txt")
	private QAFWebElement otrLogbookAddeventTimeselectHourTxt;
	@FindBy(locator = "otr.logbook.addevent.timeselect.minute.txt")
	private QAFWebElement otrLogbookAddeventTimeselectMinuteTxt;
	@FindBy(locator = "otr.logbook.addevent.timeselect.am.txt")
	private QAFWebElement otrLogbookAddeventTimeselectAmTxt;
	@FindBy(locator = "otr.logbook.addevent.timeselect.pm.txt")
	private QAFWebElement otrLogbookAddeventTimeselectPmTxt;
	@FindBy(locator = "otr.logbook.unitofmeasurement.lbl")
	private QAFWebElement otrLogbookUnitofmeasurementLbl;
	@FindBy(locator = "otr.logbook.addinsulin.typeselect.lbl")
	private QAFWebElement otrLogbookAddinsulinTypeselectLbl;
	@FindBy(locator = "otr.logbook.addinsulin.selecttype.btn")
	private QAFWebElement otrLogbookAddinsulinSelecttypeBtn;
	@FindBy(locator = "otr.logbook.addactivity.intensity.lbl")
	private QAFWebElement otrLogbookAddactivityIntensityLbl;
	@FindBy(locator = "otr.logbook.addactivity.selectintensity.btn")
	private QAFWebElement otrLogbookAddactivitySelectintensityBtn;
	@FindBy(locator = "otr.logbook.addevent.timeselect.clock.pkr")
	private QAFWebElement otrLogbookAddEventTimeSelectClockPkr;
	@FindBy(locator = "otr.logbook.addevent.timeselect.clockmin.pkr")
	private QAFWebElement otrLogbookAddeventTimeSelectClockMinPkr;
	@FindBy(locator = "otr.logbook.addinsulin.selecttype.long.btn")
	private QAFWebElement otrLogbookAddInsulinSelectTypeLongBtn;
	@FindBy(locator = "otr.logbook.addactivity.selecttype.moderate.btn")
	private QAFWebElement otrLogbookAddActivitySelectTypeModerateBtn;
	@FindBy(locator = "otr.logbook.editglucose.editeventtitle.txt")
	private QAFWebElement otrLogbookEditglucoseEditeventtitleTxt;
	@FindBy(locator = "otr.logbook.editglucose.datepopup.date.txt")
	private QAFWebElement otrLogbookEditglucoseDatepopupDateTxt;
	@FindBy(locator = "otr.logbook.editglucose.datepopup.datesvalue.txt")
	private List<QAFWebElement> otrLogbookEditglucoseDatepopupDatesvalueTxt;
	@FindBy(locator = "otr.logbook.editglucose.notefield.txt")
	private QAFWebElement otrLogbookEditglucoseNoteFieldTxt;
	@FindBy(locator = "otr.logbook.editglucose.delete.btn")
	private QAFWebElement otrLogbookEditglucoseDeleteBtn;
	@FindBy(locator = "otr.logbook.editglucose.deleteconfirm.txt")
	private QAFWebElement otrLogbookEditglucoseDeleteconfirmTxt;
	@FindBy(locator = "otr.logbook.editglucose.deletepopup.delete.btn")
	private QAFWebElement otrLogbookEditglucoseDeletepopupDeleteBtn;
	@FindBy(locator = "otr.logbook.editglucose.appleicon.img")
	private QAFWebElement otrLogbookEditglucoseAppleiconImg;
	@FindBy(locator = "otr.logbook.editglucose.back.btn")
	private QAFWebElement otrLogbookEditglucoseBackBtn;
	@FindBy(locator = "otr.logbook.editglucose.timepopup.year.txt")
	private QAFWebElement otrLogbookEditglucoseTimepopupYearTxt;
	@FindBy(locator = "otr.logbook.editglucose.lo.btn")
	private QAFWebElement otrLogbookEditglucoseLoBtn;
	@FindBy(locator = "otr.logbook.editglucose.hi.btn")
	private QAFWebElement otrLogbookEditglucoseHiBtn;
	@FindBy(locator = "otr.logbook.classsicview.btn")
	private QAFWebElement otrLogbookClassicViewBtn;
	@FindBy(locator = "otr.logbook.weekview.btn")
	private QAFWebElement otrLogbookWeekViewBtn;
	@FindBy(locator = "otr.logbook.dayview.btn")
	private QAFWebElement otrLogbookDayViewBtn;
	@FindBy(locator = "otr.logbook.classicview.datetoright.btn")
	private QAFWebElement otrLogbookClassicViewDateToRightBtn;
	@FindBy(locator = "otr.logbook.save.btn")
	private QAFWebElement otrLogbookSaveBtn;
	@FindBy(locator = "otr.logbook.classicview.dateheader.lbl")
	private QAFWebElement otrLogbookClassicViewDateHeaderLbl;
	@FindBy(locator = "otr.logbook.classview.datevalue.lbl")
	private List<QAFWebElement> otrLogbookClassicViewDateValueLbl;
	@FindBy(locator = "otr.logbook.addevent.eventicon.img")
	private List<QAFWebElement> otrLogbookAddeventEventiconImg;
	@FindBy(locator = "otr.logbook.editglucose.delete.btn")
	private List<QAFWebElement> otrLogbookEditeventDeleteBtn;
	@FindBy(locator = "otr.logbook.eventview.leftarrow.btn")
	private QAFWebElement otrLogbookClassicViewLeftArrowBtn;
	@FindBy(locator = "otr.logbook.eventview.rightarrow.btn")
	private QAFWebElement otrLogbookClassicViewRightArrowBtn;
	@FindBy(locator = "otr.logbook.weekview.today.img")
	private QAFWebElement otrLogbookWeekviewTodayboxImg;
	@FindBy(locator = "otr.logbook.celender.leftarrow.btn")
	private QAFWebElement otrLogbookCelenderLeftarrowBtn;
	@FindBy(locator = "otr.logbook.celender.rightarrow.btn")
	private QAFWebElement otrLogbookCelenderRightarrowBtn;
	@FindBy(locator = "otr.logbook.dayview.view.fld")
	private QAFWebElement otrLogbookDayviewViewFld;

	
	
	public QAFWebElement getOtrLogbookDayviewViewFld() {
		return otrLogbookDayviewViewFld;
	}
	public QAFWebElement getOtrLogbookCelenderLeftarrowBtn() {
		return otrLogbookCelenderLeftarrowBtn;
	}

	public QAFWebElement getOtrLogbookCelenderRightarrowBtn() {
		return otrLogbookCelenderRightarrowBtn;
	}

	public QAFWebElement getOtrLogbookWeekviewTodayboxImg() {
		return otrLogbookWeekviewTodayboxImg;
	}

	public QAFWebElement getOtrLogbookClassicViewRightArrowBtn() {
		return otrLogbookClassicViewRightArrowBtn;
	}

	public QAFWebElement getOtrLogbookClassicViewLeftArrowBtn() {
		return otrLogbookClassicViewLeftArrowBtn;
	}

	public List<QAFWebElement> getOtrLogbookEditeventDeleteBtn() {
		return otrLogbookEditeventDeleteBtn;
	}

	public List<QAFWebElement> getOtrLogbookAddeventEventiconImg() {
		return otrLogbookAddeventEventiconImg;
	}

	public List<QAFWebElement> getOtrLogbookClassicViewDateValueLbl() {
		return otrLogbookClassicViewDateValueLbl;
	}

	public QAFWebElement getOtrLogbookClassicViewBtn() {
		return otrLogbookClassicViewBtn;
	}

	public QAFWebElement getOtrLogbookClassicViewDateToRightBtn() {
		return otrLogbookClassicViewDateToRightBtn;
	}

	public QAFWebElement getOtrLogbookWeekViewBtn() {
		return otrLogbookWeekViewBtn;
	}

	public QAFWebElement getOtrLogbookClassicViewDateHeaderLbl() {
		return otrLogbookClassicViewDateHeaderLbl;
	}

	public QAFWebElement getOtrLogbookDayViewBtn() {
		return otrLogbookDayViewBtn;
	}

	public QAFWebElement getOtrLogbookEditglucoseHiBtn() {
		return otrLogbookEditglucoseHiBtn;
	}

	public QAFWebElement getOtrLogbookEditglucoseLoBtn() {
		return otrLogbookEditglucoseLoBtn;
	}

	public QAFWebElement getOtrLogbookEditglucoseTimepopupYearTxt() {
		return otrLogbookEditglucoseTimepopupYearTxt;
	}

	public QAFWebElement getOtrLogbookEditglucoseBackBtn() {
		return otrLogbookEditglucoseBackBtn;
	}

	public QAFWebElement getOtrLogbookEditglucoseAppleiconImg() {
		return otrLogbookEditglucoseAppleiconImg;
	}

	public QAFWebElement getOtrLogbookEditglucoseDeletepopupDeleteBtn() {
		return otrLogbookEditglucoseDeletepopupDeleteBtn;
	}

	public QAFWebElement getOtrLogbookEditglucoseDeleteconfirmTxt() {
		return otrLogbookEditglucoseDeleteconfirmTxt;
	}

	public QAFWebElement getOtrLogbookEditglucoseDeleteBtn() {
		return otrLogbookEditglucoseDeleteBtn;
	}

	public QAFWebElement getOtrLogbookEditglucoseNoteFieldTxt() {
		return otrLogbookEditglucoseNoteFieldTxt;
	}

	public List<QAFWebElement> getOtrLogbookEditglucoseDatepopupDatesvalueTxt() {
		return otrLogbookEditglucoseDatepopupDatesvalueTxt;
	}

	public QAFWebElement getOtrLogbookEditglucoseDatepopupDateTxt() {
		return otrLogbookEditglucoseDatepopupDateTxt;
	}

	public QAFWebElement getOtrLogbookEditglucoseEditeventtitleTxt() {
		return otrLogbookEditglucoseEditeventtitleTxt;
	}

	public QAFWebElement getOtrLogbookAddActivitySelectTypeModerateBtn() {
		return otrLogbookAddActivitySelectTypeModerateBtn;
	}

	public QAFWebElement getOtrLogbookAddInsulinSelectTypeLongBtn() {
		return otrLogbookAddInsulinSelectTypeLongBtn;
	}

	public QAFWebElement getOtrLogbookAddeventTimeSelectClockMinPkr() {
		return otrLogbookAddeventTimeSelectClockMinPkr;
	}

	public QAFWebElement getOtrLogbookAddEventTimeSelectClockPkr() {
		return otrLogbookAddEventTimeSelectClockPkr;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrlogbookaddeventbtn() {
		return otrLogbookAddeventBtn;
	}

	public QAFWebElement getOtrlogbookaddeventlbl() {
		return otrLogbookAddeventLbl;
	}

	public QAFWebElement getOtrlogbookaddeventaddbgvaluebtn() {
		return otrLogbookAddeventAddbgvalueBtn;
	}

	public QAFWebElement getOtrlogbookaddeventaddcarbvaluebtn() {
		return otrLogbookAddeventAddcarbvalueBtn;
	}

	public QAFWebElement getOtrlogbookaddeventaddinsulinvaluebtn() {
		return otrLogbookAddeventAddinsulinvalueBtn;
	}

	public QAFWebElement getOtrlogbookaddeventaddactivityvaluebtn() {
		return otrLogbookAddeventAddactivityvalueBtn;
	}

	public QAFWebElement getOtrlogbookaddeventsavebtn() {
		return otrLogbookAddeventSaveBtn;
	}

	public List<QAFWebElement> getOtrLogbookAddbgAddvalueTxtList() {
		return otrLogbookAddbgAddvalueTxtList;
	}

	public QAFWebElement getOtrlogbookaddbgaddvaluetxt() {
		return otrLogbookAddbgAddvalueTxt;
	}

	public QAFWebElement getOtrlogbookaddbgbeforemealtab() {
		return otrLogbookAddbgBeforemealTab;
	}

	public QAFWebElement getOtrlogbookaddbgaftermealtab() {
		return otrLogbookAddbgAftermealTab;
	}

	public QAFWebElement getOtrlogbookaddbgtimelbl() {
		return otrLogbookAddbgTimeLbl;
	}

	public QAFWebElement getOtrlogbookaddbgtimebtn() {
		return otrLogbookAddbgTimeBtn;
	}

	public QAFWebElement getOtrlogbookaddeventtimeselectcancelbtn() {
		return otrLogbookAddeventTimeselectCancelBtn;
	}

	public QAFWebElement getOtrlogbookaddeventtimeselectokbtn() {
		return otrLogbookAddeventTimeselectOkBtn;
	}

	public QAFWebElement getotrLogbookSaveBtn() {
		return otrLogbookSaveBtn;
	}

	public QAFWebElement getOtrlogbookaddeventtimeselecthourtxt() {
		return otrLogbookAddeventTimeselectHourTxt;
	}

	public QAFWebElement getOtrlogbookaddeventtimeselectminutetxt() {
		return otrLogbookAddeventTimeselectMinuteTxt;
	}

	public QAFWebElement getOtrlogbookaddeventtimeselectamtxt() {
		return otrLogbookAddeventTimeselectAmTxt;
	}

	public QAFWebElement getOtrlogbookaddeventtimeselectpmtxt() {
		return otrLogbookAddeventTimeselectPmTxt;
	}

	public QAFWebElement getOtrlogbookunitofmeasurementlbl() {
		return otrLogbookUnitofmeasurementLbl;
	}

	public QAFWebElement getOtrlogbookaddinsulintypeselectlbl() {
		return otrLogbookAddinsulinTypeselectLbl;
	}

	public QAFWebElement getOtrlogbookaddinsulinselecttypebtn() {
		return otrLogbookAddinsulinSelecttypeBtn;
	}

	public QAFWebElement getOtrlogbookaddactivityintensitylbl() {
		return otrLogbookAddactivityIntensityLbl;
	}

	public QAFWebElement getOtrlogbookaddactivityselectintensitybtn() {
		return otrLogbookAddactivitySelectintensityBtn;
	}

	public QAFWebElement getOtrLogbookpageTimeStaticText(String text) {
		return JNJUtilsAndroid.getElement("otr.logbook.editglucose.datepopup.dynamic.txt", text);
	}

	public QAFWebElement getOtrLogbookpageStaticText(String text) {
		return JNJUtilsAndroid.getElement("otr.logbook.editglucose.dynamic.txt", text);
	}

	public QAFWebElement getOtrLogbookDayviewInfoBtn() {
		return otrLogbookDayviewInfoBtn;
	}

	public QAFWebElement getOtrLogbookWeekviewInsulinTab() {
		return otrLogbookWeekviewInsulinTab;
	}

	// Public string values
	String getBGValue, getDate;
	@FindBy(locator = "otr.logbook.editglucose.datepopup.dynamic.txt")
	private QAFWebElement otrLogbookEditglucoseDatepopupDynamicTxt;
	@FindBy(locator = "otr.logbook.editglucose.dynamic.txt")
	private QAFWebElement otrLogbookEditglucoseDynamicTxt;
	@FindBy(locator = "otr.logbook.classicview.recentaddedBGvalue.btn")
	private QAFWebElement otrLogbookClassicviewRecentaddedbgvalueBtn;
	@FindBy(locator = "otr.logbook.dayview.info.btn")
	private QAFWebElement otrLogbookDayviewInfoBtn;
	@FindBy(locator = "otr.logbook.weekview.insulin.tab")
	private QAFWebElement otrLogbookWeekviewInsulinTab;

	// Method to click on add event button
	public void clickOnAddEventButton() {
		getOtrlogbookaddeventbtn().verifyPresent("Log Event button is present");
		getOtrlogbookaddeventbtn().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Add event page is displayed", MessageTypes.Pass);
	}

	// Method to select blood glucose event
	public void selectBloodGlucose() {
		getOtrlogbookaddeventaddbgvaluebtn().waitForPresent();
		getOtrlogbookaddeventaddbgvaluebtn().click();
		Reporter.logWithScreenShot("Add Blood Glucose page is displayed", MessageTypes.Pass);
	}

	// Method to select carbs event
	public void selectCarbEvent() {
		getOtrlogbookaddeventaddcarbvaluebtn().waitForPresent();
		getOtrlogbookaddeventaddcarbvaluebtn().click();
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		Reporter.logWithScreenShot("Add Carbs page is displayed", MessageTypes.Pass);
	}

	// Method to select Insulin event
	public void selectInsulinEvent() {
		getOtrlogbookaddeventaddinsulinvaluebtn().waitForPresent();
		getOtrlogbookaddeventaddinsulinvaluebtn().click();
		Reporter.logWithScreenShot("Add Insulin page is displayed", MessageTypes.Pass);
	}

	// Method to select activity event
	public void selectActivityEvent() {
		getOtrlogbookaddeventaddactivityvaluebtn().waitForPresent();
		getOtrlogbookaddeventaddactivityvaluebtn().click();
		Reporter.logWithScreenShot("Add Activity page is displayed", MessageTypes.Pass);
	}

	// Method to select an event for adding event
	public void userSelectFromLogEventList(String option) {

		option = option.toUpperCase();
		switch (option) {
		case "GLUCOSE":
			selectBloodGlucose();
			break;
		case "CARBS":
			selectCarbEvent();
			break;
		case "INSULIN":
			selectInsulinEvent();
			break;
		case "ACTIVITY":
			selectActivityEvent();
			break;
		}
	}

	// Click on save button add event screen
	public void clickOnSaveBtnAddEventScreen() {
		getOtrlogbookaddeventsavebtn().waitForPresent();
		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("Clicked on save button event screen", MessageTypes.Pass);
	}

	// method to edit glucose details
	public void editGlucoseDetail(Object eventDetail) {

		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
		getOtrlogbookaddbgtimebtn().click();

		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventsavebtn().click();
		JNJUtilsAndroid.waitforLoad();
		if (getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent()) {
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			JNJUtilsAndroid.waitforLoad();
		}
		Reporter.logWithScreenShot("After saving edited details", MessageTypes.Pass);

	}

	// method to select previous day date
	public void selectDate() {
		getOtrlogbookaddeventtimeselectokbtn().waitForPresent();
		int date = (Integer.parseInt(JNJUtilsAndroid.getCurrentDate())) - 1;
		ConfigurationManager.getBundle().setProperty("selected.date", date);

		for (QAFWebElement ele : getOtrLogbookEditglucoseDatepopupDatesvalueTxt()) {
			if (JNJUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(date + "")) {
				ele.click();
				break;
			}
		}
		Reporter.logWithScreenShot("Selected date", MessageTypes.Pass);
	}

	public void selectFutureDate() {
		getOtrLogbookEditglucoseDatepopupDateTxt().waitForPresent();
		int date = Integer.parseInt(JNJUtilsAndroid.getCurrentDate()) + 1;
		if (JNJUtilsAndroid.getCurrentDate().equalsIgnoreCase("30")
				|| JNJUtilsAndroid.getCurrentDate().equalsIgnoreCase("31")) {
			getOtrLogbookClassicViewDateToRightBtn().click();
			date = 1;
		}
		ConfigurationManager.getBundle().setProperty("selected.date", date);

		for (QAFWebElement ele : getOtrLogbookEditglucoseDatepopupDatesvalueTxt()) {
			if (JNJUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(date + "")) {
				ele.click();
				break;
			}
		}
		Reporter.logWithScreenShot("Selected date", MessageTypes.Pass);
	}

	// Method to select today's date
	public void selectTodaysDate(){
	getOtrlogbookaddeventtimeselectokbtn().waitForPresent();
	int date = (Integer.parseInt(JNJUtilsAndroid.getCurrentDate()));
	ConfigurationManager.getBundle().setProperty("selected.date", date);

	for (QAFWebElement ele : getOtrLogbookEditglucoseDatepopupDatesvalueTxt()) {
		if (JNJUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(date + "")) {
			ele.click();
			break;
		}
	}
	Reporter.logWithScreenShot("Selected date", MessageTypes.Pass);
	}


	// selecting meal tag
	public void addGlucoseSelectBeforeAfter(String data) {

		data = data.toLowerCase();
		switch (data) {
		case "before":
			getOtrlogbookaddbgbeforemealtab().click();
			WebDriverTestCase.verifyTrue(getOtrlogbookaddbgbeforemealtab().isSelected(),
					"Before button is not selected", "Before button is selected");

			break;
		case "after":
			getOtrlogbookaddbgaftermealtab().click();
			WebDriverTestCase.verifyTrue(getOtrlogbookaddbgaftermealtab().isSelected(), "After button is not selected",
					"After button is selected");
			break;
		}

	}

	// method to select time
	public void selectTime(String hour, String miunte, String meredian) {
		getOtrLogbookpageTimeStaticText(hour).click();
		getOtrLogbookpageTimeStaticText(miunte).click();
		meredian = meredian.toUpperCase();
		getOtrLogbookpageStaticText(meredian).click();
		Reporter.logWithScreenShot("Selected time", MessageTypes.Pass);
	}

	// method to add glucose
	public void addBGDetail(Object eventDetail) {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before editing value", MessageTypes.Pass);
		getOtrlogbookaddbgaddvaluetxt().click();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		ConfigurationManager.getBundle().setProperty("classic.glucose", eventBean.getAmount());
		getBGValue = eventBean.getAmount().toString();
		Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);

		getOtrLogbookEditglucoseNoteFieldTxt().sendKeys("Entering BG");
		// SG Commenting out to debug
		getOtrlogbookaddbgtimebtn().click();

		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventtimeselectokbtn().click();

		getOtrlogbookaddeventsavebtn().waitForPresent();
		Reporter.logWithScreenShot("BG Form before clicking save", MessageTypes.Pass);
		getOtrlogbookaddeventsavebtn().click();
	}

	public void addBGDetailToVerify(Object eventDetail) {

		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before entering value", MessageTypes.Pass);
		getOtrlogbookaddbgaddvaluetxt().click();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		getBGValue = eventBean.getAmount().toString();
		Reporter.logWithScreenShot("Blood Glucose window after entering value", MessageTypes.Pass);
		getotrLogbookSaveBtn().click();
		JNJUtilsAndroid.waitforLoad();

	}

	// method to add manual carb details
	public void addCarbManualDetail(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Carbs window after entering value", MessageTypes.Pass);

		getOtrLogbookEditglucoseNoteFieldTxt().sendKeys("Adding carb details");

		getOtrlogbookaddbgtimebtn().click();

		// selectDate();
		getOtrlogbookaddeventtimeselectokbtn().click();
		// selectTime(eventBean.getHour(), eventBean.getMiunute(),
		// eventBean.getMeredian());
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventsavebtn().click();
	}

	// method to edit carb details
	public void editCarbsDetail(Object eventDetail) {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Carbs window before editing value", MessageTypes.Pass);
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Carbs window after editing value", MessageTypes.Pass);
		getOtrLogbookEditglucoseNoteFieldTxt().clear();
		getOtrLogbookEditglucoseNoteFieldTxt().sendKeys("Editing carb details");

		// if (getOtrlogbookaddbgtimelbl().isPresent())
		getOtrlogbookaddbgtimebtn().click();

		// selectDate();
		getOtrlogbookaddeventtimeselectokbtn().click();
		// selectTime(eventBean.getHour(), eventBean.getMiunute(),
		// eventBean.getMeredian());
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventsavebtn().click();
	}

	// method to add insulin details
	public void addInsulinDetail(Object eventDetail) {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Insulin window before entering value", MessageTypes.Pass);

		try {
			getOtrlogbookaddinsulinselecttypebtn().waitForPresent(2000);
			getOtrlogbookaddinsulinselecttypebtn().click();
			// getOtrLogbookpageStaticText("Insulin Type").waitForPresent(2000);
			String insulinType=ConfigurationManager.getBundle().getString("event.detail.insulinController.long");
			ConfigurationManager.getBundle().setProperty("last.added.insulin.type", insulinType);
			getOtrLogbookpageStaticText(insulinType).click();
			Reporter.logWithScreenShot(
					"Selected Insulin type is "
							+ insulinType,
					MessageTypes.Pass);
		} catch (Exception e) {
			Reporter.logWithScreenShot("To select Insulin type is not present", MessageTypes.Pass);
		}
		getOtrlogbookaddbgaddvaluetxt().click();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Insulin window after entering value", MessageTypes.Pass);

		getOtrLogbookEditglucoseNoteFieldTxt().sendKeys("Entering Insulin detail");

		// if (getOtrlogbookaddbgtimelbl().isPresent())
		getOtrlogbookaddbgtimebtn().click();

		// selectDate();
		getOtrlogbookaddeventtimeselectokbtn().click();
		// selectTime(eventBean.getHour(), eventBean.getMiunute(),
		// eventBean.getMeredian());
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventsavebtn().click();
	}

	// Method to edit insulin details
	public void editInsulinDetail(Object eventDetail) {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Insulin window before entering value", MessageTypes.Pass);

		if (getOtrlogbookaddinsulintypeselectlbl().isPresent()) {
			getOtrlogbookaddinsulinselecttypebtn().click();
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("insulin.insulinType"))
					.waitForPresent();
			getOtrLogbookpageStaticText(
					ConfigurationManager.getBundle().getString("event.detail.insulinController.long")).click();
			Reporter.logWithScreenShot(
					"Selected Insulin type is "
							+ ConfigurationManager.getBundle().getString("event.detail.insulinController.long"),
					MessageTypes.Pass);
		}
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Insulin window after entering value", MessageTypes.Pass);
		// if (getOtrlogbookaddbgtimelbl().isPresent())
		getOtrlogbookaddbgtimebtn().click();

		// selectDate();
		getOtrlogbookaddeventtimeselectokbtn().click();
		// selectTime(eventBean.getHour(), eventBean.getMiunute(),
		// eventBean.getMeredian());
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventsavebtn().click();
	}

	// Method to enter activity details
	public void addActivityDetail(Object eventDetail) {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().clear();
		Reporter.logWithScreenShot("Activity window before entering value", MessageTypes.Pass);
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Activity window after entering value", MessageTypes.Pass);

		if (getOtrlogbookaddactivityintensitylbl().isPresent()) {
			getOtrlogbookaddactivityselectintensitybtn().click();
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("activity.type")).waitForPresent();
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("activity.type.moderate")).click();
			Reporter.logWithScreenShot("Selected activity type is " + eventBean.getActivityType(), MessageTypes.Pass);
		}

		getOtrLogbookEditglucoseNoteFieldTxt().sendKeys("Entering Activity detail");

		// if (getOtrlogbookaddbgtimelbl().isPresent())
		getOtrlogbookaddbgtimebtn().click();

		// selectDate();
		getOtrlogbookaddeventtimeselectokbtn().click();
		// selectTime(eventBean.getHour(), eventBean.getMiunute(),
		// eventBean.getMeredian());
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventsavebtn().click();
	}

	// Method to verify delete pop up and delete event
	public void verifydeleteEvent() {
		getOtrLogbookEditglucoseDeleteBtn().waitForPresent();
		getOtrLogbookEditglucoseDeleteBtn().click();
		getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
		Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);
		getOtrLogbookEditglucoseDeleteconfirmTxt().verifyPresent("Delete Popup");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("alerts.confirmDeletion.message"))
				.verifyPresent("Delete question");
		// getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.cancel")).verifyPresent("Cancel
		// button");
		// getOtrlogbookaddeventtimeselectcancelbtn().waitForPresent();
		getOtrlogbookaddeventtimeselectcancelbtn().verifyPresent("Cancel button");
		getOtrLogbookEditglucoseDeletepopupDeleteBtn().verifyPresent("Ok button");

		getOtrlogbookaddeventtimeselectcancelbtn().click();
		Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		getOtrLogbookEditglucoseEditeventtitleTxt().verifyVisible("event screen");
		getOtrLogbookEditglucoseDeleteBtn().click();
		getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
		Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);
		getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("After clicking on delete confirmation button", MessageTypes.Pass);

	}

	// Method to delete added event
	public void deleteEvent() {
		getOtrLogbookEditglucoseDeleteBtn().waitForPresent();
		getOtrLogbookEditglucoseDeleteBtn().click();
		getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
		Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);

		getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
		Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);

	}

	// Method to verify add or edit event screen for blood glucose
	public void verifyAddBGEventScreen() {

		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getOtrLogbookEditglucoseEditeventtitleTxt().getText()
						.contains(JNJUtilsAndroid.getPropString("home.action.addAnEvent")),
				"improper title", JNJUtilsAndroid.getPropString("home.action.addAnEvent") + " title is visible");
		getOtrlogbookaddbgaddvaluetxt().verifyPresent("Add event value text field");
		if (getOtrlogbookaddbgbeforemealtab().isPresent()) {
			getOtrlogbookaddbgbeforemealtab().verifyPresent("Before meal button");
			getOtrlogbookaddbgaftermealtab().verifyPresent("After meal button");
		}
		getOtrlogbookunitofmeasurementlbl().verifyPresent("UMO of BG");
		getOtrlogbookaddbgtimebtn().verifyPresent("Time value");
		getOtrLogbookEditglucoseNoteFieldTxt().verifyPresent("Note text field");
		getOtrlogbookaddeventsavebtn().verifyPresent("Save button");
		getOtrLogbookEditglucoseBackBtn().verifyPresent("Back button");

		verifyTimePopUp();
		verifyAreYouSurePopUp();
	}

	// Method to verify time picker
	public void verifyTimePopUp() {

		getOtrlogbookaddbgtimebtn().click();
		getOtrLogbookEditglucoseTimepopupYearTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getOtrLogbookEditglucoseTimepopupYearTxt().getText().contains(ConstantUtils.CURRENT_YEAR),
				"Improper current year", ConstantUtils.CURRENT_YEAR + " current year title is visible");
		// WebDriverTestCase.verifyTrue(
		// getOtrLogbookEditglucoseDatepopupDateTxt().getText().contains(JNJUtilsAndroid.getCurrentDate()),
		// "Improper today date", JNJUtilsAndroid.getCurrentDate() + " Today
		// date is visible");
		WebDriverTestCase.verifyTrue(
				getOtrLogbookEditglucoseDatepopupDateTxt().getText()
						.contains(JNJUtilsAndroid.getCurrentMonth().substring(0, 3)),
				"Improper current month", JNJUtilsAndroid.getCurrentMonth() + " Current month is visible");

		getOtrlogbookaddeventtimeselectcancelbtn().verifyPresent("Cancel button");
		getOtrlogbookaddeventtimeselectokbtn().verifyPresent("Ok button");

		getOtrlogbookaddeventtimeselectcancelbtn().click();
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForVisible();
		getOtrLogbookEditglucoseEditeventtitleTxt().verifyPresent("After clicking cancel button Event screen");

		getOtrlogbookaddbgtimebtn().click();
		getOtrLogbookEditglucoseTimepopupYearTxt().waitForPresent();

		int date = Integer.parseInt(JNJUtilsAndroid.getCurrentDate());

		for (int i = 0; i < getOtrLogbookEditglucoseDatepopupDatesvalueTxt().size(); i++) {
			if (JNJUtilsAndroid.tryDisplayMethod(getOtrLogbookEditglucoseDatepopupDatesvalueTxt().get(i))
					&& getOtrLogbookEditglucoseDatepopupDatesvalueTxt().get(i).getText().contains(date + "")) {
				// WebDriverTestCase.verifyTrue(getOtrLogbookEditglucoseDatepopupDatesvalueTxt().get(i).isEnabled(),
				// "Today date is not enabled", date + " Current date is
				// enable");
				if (!(date == 30 || date == 31)) {
					WebDriverTestCase.verifyFalse(
							getOtrLogbookEditglucoseDatepopupDatesvalueTxt().get(i + 1).isEnabled(),
							"Tomorrow date is enabled", " Tomorrow date is not enabled");
				}
				if (JNJUtilsAndroid.getCurrentDate().equalsIgnoreCase("1")) {
					getOtrLogbookClassicViewLeftArrowBtn().click();
					date = 31;
				}
				getOtrLogbookEditglucoseDatepopupDatesvalueTxt().get(i - 1).click();
				WebDriverTestCase.verifyTrue(getOtrLogbookEditglucoseDatepopupDatesvalueTxt().get(i - 1).isEnabled(),
						"yesterday date is not enabled", "Yesterday is enable");
				break;
			}
		}

		getOtrlogbookaddeventtimeselectokbtn().click();

		String hour = "7";
		String minute = "30";
		getOtrLogbookpageTimeStaticText(hour).click();
		getOtrLogbookpageTimeStaticText(minute).click();
		WebDriverTestCase.verifyTrue(getOtrLogbookpageTimeStaticText(minute).isSelected(),
				minute + "  as minute is not selected", minute + "  as minute is selected");
		getOtrlogbookaddeventtimeselecthourtxt().click();
		// WebDriverTestCase.verifyTrue(getOtrLogbookpageTimeStaticText(hour).isSelected(),
		// hour + "Hour not selected ",
		// hour + "as Hour is selected");
		Reporter.logWithScreenShot("Selected time", MessageTypes.Pass);
		getOtrLogbookpageStaticText("AM").click();
		WebDriverTestCase.verifyTrue(getOtrLogbookpageStaticText("AM").getAttribute("checked").equalsIgnoreCase("true"),
				" AM is not selected", "AM is selected");

		WebDriverTestCase.verifyTrue(getOtrlogbookaddeventtimeselecthourtxt().getText().contains(hour),
				" Proper hour is not displayed on title", "Proper hour is displayed on title");
		WebDriverTestCase.verifyTrue(getOtrlogbookaddeventtimeselectminutetxt().getText().contains(minute),
				" Proper minute is not displayed on title", "Proper minute is displayed on title");

		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForVisible();

		WebDriverTestCase.verifyTrue(
				getOtrlogbookaddbgtimebtn().getText().contains(hour)
						&& getOtrlogbookaddbgtimebtn().getText().contains(minute),
				" Proper Time is not displayed on title", "Proper Time is displayed on event screen");
	}

	// Method to verify min and max amount allowed for blood glucose
	public void verifyAllowedBGRange() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrLogbookEditglucoseLoBtn().click();
		WebDriverTestCase.verifyTrue(getOtrlogbookaddbgaddvaluetxt().getText().contains("LO"),
				" LO is not entered after", "LO is entered after");
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrLogbookEditglucoseHiBtn().click();
		WebDriverTestCase.verifyTrue(getOtrlogbookaddbgaddvaluetxt().getText().contains("HI"),
				" HI is not entered after", "HI is entered after");

		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt()
				.sendKeys(ConfigurationManager.getBundle().getProperty("BG1.lowValue").toString());
		getOtrLogbookEditglucoseAppleiconImg().click();
		getOtrLogbookpageStaticText(ConstantUtils.BG_VALUE_RANGE_ERROR_MSG).verifyPresent("Blood glucose range error");
		getOtrlogbookaddeventtimeselectokbtn().click();

		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt()
				.sendKeys(ConfigurationManager.getBundle().getProperty("BG1.highValue").toString());
		getOtrLogbookEditglucoseAppleiconImg().click();
		getOtrLogbookpageStaticText(ConstantUtils.BG_VALUE_RANGE_ERROR_MSG).verifyPresent("Blood glucose range error");
		getOtrlogbookaddeventtimeselectokbtn().click();

	}

	// method to verify are you sure question flow
	public void verifyAreYouSurePopUp() {
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys("50");
		getOtrLogbookEditglucoseBackBtn().click();
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("addEvent.unsavedEntry.title")).waitForPresent();
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("addEvent.unsavedEntry.title"))
				.verifyPresent("Are you sure pop up");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("addEvent.unsavedEntry.message"))
				.verifyPresent("Change will not saved error message");
		getOtrlogbookaddeventtimeselectcancelbtn().click();
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForVisible();
		getOtrLogbookEditglucoseEditeventtitleTxt().verifyPresent("After clicking cancel button event screen");
		getOtrLogbookEditglucoseBackBtn().click();
		getOtrlogbookaddeventtimeselectokbtn().click();
		Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
		getOtrlogbookaddeventbtn().waitForPresent();
		getOtrlogbookaddeventbtn().verifyPresent("Logbook screen event button ");

	}

	// method to verify add event screen for carbs
	public void verifyAddCarbEventScreen() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getOtrLogbookEditglucoseEditeventtitleTxt().getText()
						.contains(JNJUtilsAndroid.getPropString("home.action.addAnEvent")),
				"improper title", JNJUtilsAndroid.getPropString("home.action.addAnEvent") + " title is visible");
		getOtrlogbookaddbgaddvaluetxt().verifyPresent("Add event value text field");
		getOtrlogbookunitofmeasurementlbl().verifyPresent("UMO for carb");

		getOtrlogbookaddbgtimebtn().verifyPresent("Time value");
		getOtrLogbookEditglucoseNoteFieldTxt().verifyPresent("Note text field");
		getOtrlogbookaddeventsavebtn().verifyPresent("Save button");
		getOtrLogbookEditglucoseBackBtn().verifyPresent("Back button");

		verifyTimePopUp();
		verifyAreYouSurePopUp();
	}

	// Method to verify add event screen for insulin
	public void verifyAddInsulinEventScreen() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getOtrLogbookEditglucoseEditeventtitleTxt().getText()
						.contains(JNJUtilsAndroid.getPropString("home.action.addAnEvent")),
				"improper title", JNJUtilsAndroid.getPropString("home.action.addAnEvent") + " title is visible");
		getOtrlogbookaddbgaddvaluetxt().verifyPresent("Add event value text field");
		getOtrlogbookunitofmeasurementlbl().verifyPresent("UMO for Insulin");
		getOtrlogbookaddinsulintypeselectlbl().verifyPresent("Type text for insulin");
		getOtrlogbookaddinsulinselecttypebtn().verifyPresent("Insulin type value");
		getOtrlogbookaddinsulinselecttypebtn().click();
		verifyInsulinTypePopUp();
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("event.detail.insulinController.long")).click();
		WebDriverTestCase.verifyTrue(
				getOtrlogbookaddinsulinselecttypebtn().getText().contains(
						JNJUtilsAndroid.getPropString("event.detail.insulinController.long")),
				"improper insulin type ",
				JNJUtilsAndroid.getPropString("event.detail.insulinController.long") + " As per selection displayed");

		getOtrlogbookaddbgtimebtn().verifyPresent("Time value");
		getOtrLogbookEditglucoseNoteFieldTxt().verifyPresent("Note text field");
		getOtrlogbookaddeventsavebtn().verifyPresent("Save button");
		getOtrLogbookEditglucoseBackBtn().verifyPresent("Back button");

		verifyTimePopUp();
		verifyAreYouSurePopUp();
	}

	// method to verify insulin type pop up
	public void verifyInsulinTypePopUp() {
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("insulin.insulinType")).waitForPresent();
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("insulin.insulinType"))
				.verifyPresent("Insulin type pop up title");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("event.detail.insulinController.long"))
				.verifyPresent("Insulin type long");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("event.detail.insulinController.mix"))
				.verifyPresent("Insulin type mix");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("event.detail.insulinController.nph"))
				.verifyPresent("Insulin type nph");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("event.detail.insulinController.other"))
				.verifyPresent("Insulin type other");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("event.detail.insulinController.rapid"))
				.verifyPresent("Insulin type Rrapid");
		getOtrlogbookaddeventtimeselectokbtn().verifyPresent("OK button");

	}

	// Method to verify add event screen for activity
	public void verifyAddActivityEventScreen() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getOtrLogbookEditglucoseEditeventtitleTxt().getText()
						.contains(JNJUtilsAndroid.getPropString("home.action.addAnEvent")),
				"improper title", JNJUtilsAndroid.getPropString("home.action.addAnEvent") + " title is visible");
		getOtrlogbookaddbgaddvaluetxt().verifyPresent("Add event value text field");

		getOtrlogbookunitofmeasurementlbl().verifyPresent("UMO for activity");

		getOtrlogbookaddactivityintensitylbl().verifyPresent("Activity Intensity");
		getOtrlogbookaddactivityselectintensitybtn().verifyPresent("Intensity type text");
		getOtrlogbookaddactivityselectintensitybtn().click();
		verifyIntensityTypePopUp();
		getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("activity.intensity.light")).click();
		WebDriverTestCase.verifyTrue(
				getOtrlogbookaddactivityselectintensitybtn().getText()
						.contains(ConfigurationManager.getBundle().getString("activity.intensity.light")),
				"Selection as intensity light is not displayed",
				ConfigurationManager.getBundle().getString("activity.intensity.light") + " As per selection displayed");

		getOtrlogbookaddbgtimebtn().verifyPresent("Time value");
		getOtrLogbookEditglucoseNoteFieldTxt().verifyPresent("Note text field");
		getOtrlogbookaddeventsavebtn().verifyPresent("Save button");
		getOtrLogbookEditglucoseBackBtn().verifyPresent("Back button");

		verifyTimePopUp();
		verifyAreYouSurePopUp();
	}

	// Method to verify intensity type pop up
	public void verifyIntensityTypePopUp() {
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("activity.type")).waitForPresent();
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("activity.type"))
				.verifyPresent("Intensity type pop up title");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("activity.intensity.light"))
				.verifyPresent("Intensity type light");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("activity.intensity.moderate"))
				.verifyPresent("Intensity type moderate");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("activity.intensity.intense"))
				.verifyPresent("Intensity type intense");

	}

	// Method to add multiple event
	public void addMultipleEvent() {

		EventDetailBeans eventBean = new EventDetailBeans();

		eventBean.fillData("addMultipleEvent.addGlucose");
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(eventBean.getAmount());
		Reporter.logWithScreenShot("Added carb amount" + eventBean.getAmount(), MessageTypes.Pass);

		getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("log.action.addAnotherEvent"))
				.verifyPresent("Add Another Event text is present");

		getOtrlogbookaddeventaddcarbvaluebtn().click();
		eventBean.fillData("addMultipleEvent.addCarb");
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).isEnabled()) {
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				getOtrLogbookAddbgAddvalueTxtList().get(i).sendKeys(eventBean.getAmount());
				break;
			}
		}
		Reporter.logWithScreenShot("Added Glucose amount" + eventBean.getAmount(), MessageTypes.Pass);

		clickOnSaveBtnAddEventScreen();
		HomePageAndroid home = new HomePageAndroid();
		home.clickOnHome();
		JNJUtilsAndroid.waitforLoad();
		for (int i = 0; i < home.getOtrHomepageEventValueTxt().size(); i++) {
			if (JNJUtilsAndroid.tryDisplayMethod(home.getOtrHomepageEventValueTxt().get(i))
					&& home.getOtrHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Added carb event" + eventBean.getAmount(), MessageTypes.Pass);
				break;
			}
		}
		eventBean.fillData("addMultipleEvent.addGlucose");
		for (int i = 0; i < home.getOtrHomepageEventValueTxt().size(); i++) {
			if (JNJUtilsAndroid.tryDisplayMethod(home.getOtrHomepageEventValueTxt().get(i))
					&& home.getOtrHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Added Glucose event" + eventBean.getAmount(), MessageTypes.Pass);
				break;
			}
		}

	}

	// Method to verify Add Event Screen
	public void verifyAddEventScreen() {
		getOtrlogbookaddeventlbl().verifyPresent("Add an Event header is present");
		getOtrlogbookaddeventaddbgvaluebtn().verifyPresent("Add BG button is present");
		getOtrlogbookaddeventaddcarbvaluebtn().verifyPresent("Carbs button is present");
		getOtrlogbookaddeventaddinsulinvaluebtn().verifyPresent("Insulin button is present");
		getOtrlogbookaddeventaddactivityvaluebtn().verifyPresent("Activity button is present");
		getOtrlogbookaddeventsavebtn().verifyPresent("Save button is present");
		getOtrLogbookEditglucoseBackBtn().verifyPresent("Back button is present");
	}

	// Method to tap back arrow
	public void tapAppBackArrow() {
		getOtrLogbookEditglucoseBackBtn().click();
	}

	// method to enter a manual blood glucose value
	public void enterManualBGvalue(String value) {
		getOtrlogbookaddbgaddvaluetxt().waitForPresent();
		getOtrlogbookaddbgaddvaluetxt().clear();
		if (value.equalsIgnoreCase("HI")) {
			getOtrLogbookpageStaticText("HI").click();
		} else if (value.equalsIgnoreCase("LO")) {
			getOtrLogbookpageStaticText("LO").click();
		} else {
			getOtrlogbookaddbgaddvaluetxt().click();
			JNJUtilsAndroid.waitforLoad();
			getOtrlogbookaddbgaddvaluetxt().sendKeys(value);
		}
		Reporter.logWithScreenShot("BG value entered", MessageTypes.Pass);
	}

	// method to click on save button on BG entry
	// SG Commenting out back button click. After save user returned to logbook
	public void clickSaveBtnLogbook() {
		getOtrlogbookaddeventsavebtn().waitForPresent();
		getOtrlogbookaddeventsavebtn().click();
		// getOtrLogbookpageStaticText("Back").click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void verifyUnitOfMeasurement(String option) {
		getOtrlogbookaddeventlbl().waitForPresent();
		option = option.toUpperCase();
		switch (option) {
		case "MG/DL":
			if (getOtrlogbookunitofmeasurementlbl().getText().toString().equalsIgnoreCase("MG/DL"))
				Reporter.logWithScreenShot("Unit of Measurement is" + option, MessageTypes.Pass);
			break;
		case "MMOL/L":
			if (getOtrlogbookunitofmeasurementlbl().getText().toString().equalsIgnoreCase("MMOL/L"))
				Reporter.logWithScreenShot("Unit of Measurement is" + option, MessageTypes.Pass);
			break;
		}
	}

	public void clickClassicSelectCurrentDate() {
		getOtrLogbookClassicViewBtn().click();
		getDate = getOtrLogbookClassicViewDateHeaderLbl().getText().toString();
		for (QAFWebElement ele : otrLogbookClassicViewDateValueLbl) {
			String dateformat1 = new String();
			String currentMonth = JNJUtilsAndroid.getCurrentMonth().substring(0, 3);
			int currentMonthNumeric = Integer.parseInt(JNJUtilsAndroid.monthIntValue(currentMonth));
			int date = Integer.parseInt(JNJUtilsAndroid.getCurrentDate());
			System.out.println(date + "$$$$$$$$$$$$$$$$$$$$$$");
			if (ConfigurationManager.getBundle().getString("countryname")
					.equalsIgnoreCase("United Kingdom and Ireland")) {
				System.out.println(ConfigurationManager.getBundle().getString("countryname")
						+ "#################################");
				if (currentMonthNumeric <= 9)
					dateformat1 = date + "/" + "0" + currentMonthNumeric;
				else
					dateformat1 = date + "/" + currentMonthNumeric;
			} else
				dateformat1 = currentMonthNumeric + "/" + date;

			System.out.println(dateformat1 + "c%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			if (getOtrLogbookpageStaticText(dateformat1).isPresent()) {
				Reporter.logWithScreenShot("Selected Date is displayed in Classic View", MessageTypes.Pass);
			} else
				Reporter.logWithScreenShot("Selected Date is not displayed in Classic view", MessageTypes.Fail);
		}
	}

	public void clickClassicCurrentDate(Object eventDetails) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetails instanceof String) {

			eventBean.fillFromConfig((String) eventDetails);
		} else {
			eventBean.fillData(eventDetails);
		}

		String currentMonth = JNJUtilsAndroid.getCurrentMonth().substring(0, 3);
		int currentMonthNumeric = Integer.parseInt(JNJUtilsAndroid.monthIntValue(currentMonth));
		int date = (Integer.parseInt(JNJUtilsAndroid.getCurrentDate()));
		String dateformat1 = new String();
		if (ConfigurationManager.getBundle().getString("countryname").equalsIgnoreCase("United Kingdom and Ireland")) {
			System.out.println(
					ConfigurationManager.getBundle().getString("countryname") + "#################################");
			if (currentMonthNumeric <= 9)
				dateformat1 = date + "/" + "0" + currentMonthNumeric;
			else
				dateformat1 = date + "/" + currentMonthNumeric;
		} else
			dateformat1 = currentMonthNumeric + "/" + date;

		QAFWebElement ele = getOtrLogbookClassicviewRecentaddedbgvalueBtn(dateformat1, eventBean.getAmount());
		ele.verifyPresent("added BG");
		ele.click();

	}

	public QAFWebElement getOtrLogbookEditglucoseDatepopupDynamicTxt() {
		return otrLogbookEditglucoseDatepopupDynamicTxt;
	}

	public QAFWebElement getOtrLogbookEditglucoseDynamicTxt() {
		return otrLogbookEditglucoseDynamicTxt;
	}

	public QAFWebElement getOtrLogbookClassicviewRecentaddedbgvalueBtn(String text1, String text2) {
		return JNJUtilsAndroid.getElement("otr.logbook.classicview.recentaddedBGvalue.btn", text1, text2);
	}

	// Method to verify Blood glucose added note range and time
	public void BGAllowedNoteRangeTime() {

		getOtrlogbookaddbgtimebtn().click();
		verifyTimePickerFutureNotAllowed();
		maxAllowedNoteFieldCharacter();

	}

	// Method to verify max length field for Note field
	public void maxAllowedNoteFieldCharacter() {

		getOtrLogbookEditglucoseNoteFieldTxt().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(43);

		getOtrLogbookEditglucoseNoteFieldTxt().clear();
		getOtrLogbookEditglucoseNoteFieldTxt().sendKeys(typeName);
		Validator.verifyThat("Note charcter length",
				getOtrLogbookEditglucoseNoteFieldTxt().getAttribute("value").length(), Matchers.lessThanOrEqualTo(42));

	}

	// Method to verify time picker do not allow future date
	public void verifyTimePickerFutureNotAllowed() {
		getOtrLogbookEditglucoseDatepopupDateTxt().waitForPresent();
		int date = Integer.parseInt(JNJUtilsAndroid.getCurrentDate()) + 1;
		ConfigurationManager.getBundle().setProperty("selected.date", date);
		if (ConfigurationManager.getBundle().getProperty("selected.date").equals(JNJUtilsAndroid.getCurrentDate()))
			Reporter.logWithScreenShot("Selected date is current date", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Selected date is of Future date", MessageTypes.Pass);
		getOtrlogbookaddeventtimeselectokbtn().click();
		ConfigurationManager.getBundle().setProperty("selected.date", JNJUtilsAndroid.getCurrentDate());
		if (ConfigurationManager.getBundle().getProperty("selected.date").equals(JNJUtilsAndroid.getCurrentDate()))
			Reporter.logWithScreenShot("Selected date is current date", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Selected date is of Future date", MessageTypes.Pass);
		getOtrlogbookaddeventtimeselectokbtn().click();
		if (getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
	}

	// Method to verify Carb value range and date picker do not allow future
	// date
	public void carValuebAllowedRange() {
		if (getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys("1000");
		WebDriverTestCase.verifyTrue(
				getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("carbs.valueAlert.message")).isDisplayed(),
				"Allowed crab range message not present", "Allowed crab range message present");
		if (getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys("200");
		getOtrlogbookaddbgtimebtn().click();
		verifyTimePickerFutureNotAllowed();
		maxAllowedNoteFieldCharacter();
	}

	// Method to verify Insulin range and future date
	public void insulinAllowedRangeTimeType() {
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys("251");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("insulin.valueAlert.message"))
				.verifyPresent("Insulin value must be between 0 and 250");
		if (getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys("220");
		// todo verification without selecting insulin type
		Reporter.logWithScreenShot("Insulin type is required error popup", MessageTypes.Pass);
		if (getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
		getOtrlogbookaddinsulinselecttypebtn().click();
		getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("insulin.insulinType")).waitForPresent();
		getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"))
				.click();
		Reporter.logWithScreenShot("Selected Insulin type", MessageTypes.Pass);
		getOtrlogbookaddbgtimebtn().click();
		verifyTimePickerFutureNotAllowed();
		maxAllowedNoteFieldCharacter();

	}

	// Method to verify Activity range allowed
	public void activityAllowedRangeTimeDuration() {
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys("1441");
		getOtrLogbookpageStaticText(JNJUtilsAndroid.getPropString("activity.timeAlert.message"))
				.verifyPresent("Activity time must be between 0 and 1440");
		if (getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent()) {
			Reporter.logWithScreenShot("OK pop up is present", MessageTypes.Pass);
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			Reporter.logWithScreenShot("Clicked on OK", MessageTypes.Pass);
		}
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys("1420");
		getOtrlogbookaddbgtimebtn().click();
		verifyTimePickerFutureNotAllowed();
		maxAllowedNoteFieldCharacter();

	}

	public void clickOK() {
		getOtrlogbookaddeventtimeselectokbtn().click();
	}

	public void takeScreenshotsOfBGPage() {
		Reporter.logWithScreenShot("Blood Glucose page", MessageTypes.Pass);

	}

	public void clickScreenshotsActivityPage() {
		Reporter.logWithScreenShot("Activity Page", MessageTypes.Pass);
	}

	public void clickScreenshotsCarbsPage() {
		Reporter.logWithScreenShot("Carbs Page", MessageTypes.Pass);
	}

	public void clickScreenshotsInsulinPage() {
		Reporter.logWithScreenShot("Insulin page", MessageTypes.Pass);
	}

	public void clickOnGlucoseEventClassicView() {
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		String currentMonth = JNJUtilsAndroid.getCurrentMonth().substring(0, 3);
		System.out.println(currentMonth);
		int currentMonthNumeric = Integer.parseInt(JNJUtilsAndroid.monthIntValue(currentMonth));
		int date = Integer.parseInt(JNJUtilsAndroid.getCurrentDate());
		String dateformat1 = new String();
		if (ConfigurationManager.getBundle().getString("countryname").equalsIgnoreCase("United Kingdom and Ireland")) {
			System.out.println(
					ConfigurationManager.getBundle().getString("countryname") + "#################################");
			if (currentMonthNumeric <= 9)
				dateformat1 = date + "/" + "0" + currentMonthNumeric;
			else
				dateformat1 = date + "/" + currentMonthNumeric;
		} else
			dateformat1 = currentMonthNumeric + "/" + date;

		QAFWebElement ele = getOtrLogbookClassicviewRecentaddedbgvalueBtn(dateformat1, randomNumberGlucose);
		ele.verifyPresent("added BG");
		ele.click();

	}

	public void AddGlucoseCarbActivity() {

		userSelectFromLogEventList("GLUCOSE");
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		int randomNumberGlucose = ThreadLocalRandom.current().nextInt(21, 200);
		ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
		enterManualBGvalue(randomNumberGlucose + "");
		Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose, MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
		getOtrLogbookAddeventEventiconImg().get(0).click();
		userSelectFromLogEventList("CARBS");
		int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
		ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
		getOtrLogbookAddbgAddvalueTxtList().get(1).sendKeys(randomNumberCarb + "");
		JNJUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Carb window after entering value" + randomNumberCarb, MessageTypes.Pass);
		getOtrLogbookAddeventEventiconImg().get(1).click();

		userSelectFromLogEventList("ACTIVITY");
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 1000);
		ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity);
		getOtrLogbookAddbgAddvalueTxtList().get(2).sendKeys(randomNumberActivity + "");
		JNJUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Activity window after adding value is " + randomNumberActivity, MessageTypes.Pass);

		if (getOtrlogbookaddactivityintensitylbl().isPresent()) {
			getOtrlogbookaddactivityselectintensitybtn().click();
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("activity.type")).waitForPresent();
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("activity.intensity.moderate"))
					.click();
			Reporter.logWithScreenShot("Selected activity type is ", MessageTypes.Pass);
		}

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// method to edit glucose carb and activity from classic view
	public void editGlucoseCarbActivity() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberCarb = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberCarb)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtrLogbookAddbgAddvalueTxtList().get(i).sendKeys(randomNumberCarb1 + "");
				JNJUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Carb window after editing value" + randomNumberCarb1, MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb1);
				break;
			}
		}
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberActivity)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtrLogbookAddbgAddvalueTxtList().get(i).sendKeys(randomNumberActivity1 + "");
				JNJUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Activity window after editing value" + randomNumberActivity1,
						MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity1);
				break;
			}
		}

		Point p = getOtrLogbookEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getOtrLogbookpageStaticText(randomNumberGlucose).isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {

			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberGlucose)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookAddbgAddvalueTxtList().size(); j++) {

					if (getOtrLogbookAddbgAddvalueTxtList().get(j).getText().equals(randomNumberGlucose)) {
						getOtrLogbookAddbgAddvalueTxtList().get(j).clear();
						getOtrLogbookAddbgAddvalueTxtList().get(j).clear();
						int randomNumberGlucose1 = ThreadLocalRandom.current().nextInt(21, 200);
						getOtrLogbookAddbgAddvalueTxtList().get(j).sendKeys(randomNumberGlucose1 + "");
						JNJUtilsAndroid.hideKeyboard();
						Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose1,
								MessageTypes.Pass);
						getOtrLogbookAddeventEventiconImg().get(j).click();
						ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
						break;
					}
				}

				break;
			}

		}
		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void deleteGlucoseCarbActivity() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberActivity)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
		clickOnGlucoseEventClassicView();
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberActivity)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

		clickOnGlucoseEventClassicView();

		Point p = getOtrLogbookEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getOtrLogbookpageStaticText(randomNumberGlucose).isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {

			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberGlucose)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}
	}

	public void addGlucoseAndInsulin() {
		userSelectFromLogEventList("GLUCOSE");
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		int randomNumberGlucose = ThreadLocalRandom.current().nextInt(21, 200);
		ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
		enterManualBGvalue(randomNumberGlucose + "");
		Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose, MessageTypes.Pass);
		JNJUtilsAndroid.hideKeyboard();
		getOtrLogbookAddeventEventiconImg().get(0).click();
		JNJUtilsAndroid.hideKeyboard();

		userSelectFromLogEventList(ConfigurationManager.getBundle().getString("logbook.section.insulin.title"));
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin);
		getOtrlogbookaddinsulinselecttypebtn().click();
		getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("insulin.insulinType")).waitForPresent();
		getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"))
				.click();
		Reporter.logWithScreenShot("Selected Insulin type", MessageTypes.Pass);
		getOtrLogbookAddbgAddvalueTxtList().get(1).clear();
		getOtrLogbookAddbgAddvalueTxtList().get(1).click();
		getOtrLogbookAddbgAddvalueTxtList().get(1).sendKeys(randomNumberInsulin + "");
		JNJUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Insulin window after adding value is " + randomNumberInsulin, MessageTypes.Pass);

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// Method to edit insulin and glucose from classic view
	// Milan
	public void editGlucoseInsulin() {

		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			String arr[] = getOtrLogbookAddbgAddvalueTxtList().get(i).getText().split("\\.");
			if (randomNumberInsulin.equals(arr[0])) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				int randomNumberInsulin1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtrLogbookAddbgAddvalueTxtList().get(i).sendKeys(randomNumberInsulin1 + "");
				JNJUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Insulin window after editing value" + randomNumberInsulin1,
						MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin1);
				break;
			}
		}

		Point p = getOtrLogbookEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!JNJUtilsAndroid.tryMethod(getOtrLogbookpageStaticText(randomNumberGlucose))) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {

			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberGlucose)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookAddbgAddvalueTxtList().size(); j++) {

					if (getOtrLogbookAddbgAddvalueTxtList().get(j).getText().equals(randomNumberGlucose)) {
						getOtrLogbookAddbgAddvalueTxtList().get(j).clear();
						getOtrLogbookAddbgAddvalueTxtList().get(j).clear();
						int randomNumberGlucose1 = ThreadLocalRandom.current().nextInt(21, 200);
						getOtrLogbookAddbgAddvalueTxtList().get(j).sendKeys(randomNumberGlucose1 + "");
						JNJUtilsAndroid.hideKeyboard();
						Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose1,
								MessageTypes.Pass);
						ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
						break;
					}
				}

				break;
			}

		}
		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void deleteGlucoseInsulin() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			String arr[] = getOtrLogbookAddbgAddvalueTxtList().get(i).getText().split("\\.");
			if (randomNumberInsulin.equals(arr[0])) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						Reporter.logWithScreenShot("after clicking delete button", MessageTypes.Pass);
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

		clickOnGlucoseEventClassicView();

		Point p = getOtrLogbookEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getOtrLogbookpageStaticText(randomNumberGlucose).isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {

			if (!JNJUtilsAndroid.tryMethod(getOtrLogbookpageStaticText(randomNumberGlucose))) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	// Method to verify date 365 on cassic view screen
	// Milan
	public void verify365DayClassicView() {

		getOtrLogbookClassicViewBtn().waitForPresent();
		if (getOtrLogbookClassicViewBtn().getAttribute("selected").equalsIgnoreCase("false")) {
			getOtrLogbookClassicViewBtn().click();
			JNJUtilsAndroid.waitforLoad();
		}
		String dateformat1 = new String();
		String currentMonth = JNJUtilsAndroid.getCurrentMonth().substring(0, 3);
		int currentMonthNumeric = Integer.parseInt(JNJUtilsAndroid.monthIntValue(currentMonth));
		int date = Integer.parseInt(JNJUtilsAndroid.getCurrentDate());
		if (ConfigurationManager.getBundle().getString("countryname").equalsIgnoreCase("United Kingdom and Ireland")) {
			System.out.println(
					ConfigurationManager.getBundle().getString("countryname") + "#################################");
			if (currentMonthNumeric <= 9)
				dateformat1 = date + "/" + "0" + currentMonthNumeric;
			else
				dateformat1 = date + "/" + currentMonthNumeric;
		} else
			dateformat1 = currentMonthNumeric + "/" + date;
		getOtrLogbookpageStaticText(dateformat1).waitForPresent();
		int currentMonthNoDay = Integer.parseInt(JNJUtilsAndroid.monthNoOFDay(currentMonth).replaceAll("[^0-9]", ""));
		int date2 = 0;
		int nextMonthNumeric = currentMonthNumeric + 1;

		String dateformat2 = "";
		if (date == currentMonthNoDay) {
			date2 = 1;
			if (ConfigurationManager.getBundle().getString("countryname")
					.equalsIgnoreCase("United Kingdom and Ireland")) {
				System.out.println(ConfigurationManager.getBundle().getString("countryname")
						+ "#################################");
				if (currentMonthNumeric <= 9)
					dateformat2 = date2 + "/" + "0" + currentMonthNumeric;
				else
					dateformat2 = date2 + "/" + currentMonthNumeric;
			} else
				dateformat2 = currentMonthNumeric + "/" + date2;
		} else {
			date2 = date + 1;
			if (ConfigurationManager.getBundle().getString("countryname")
					.equalsIgnoreCase("United Kingdom and Ireland")) {
				System.out.println(ConfigurationManager.getBundle().getString("countryname")
						+ "#################################");
				if (currentMonthNumeric <= 9)
					dateformat2 = date2 + "/" + "0" + currentMonthNumeric;
				else
					dateformat2 = date2 + "/" + currentMonthNumeric;
			} else
				dateformat2 = currentMonthNumeric + "/" + date2;
		}

		Point p = getOtrLogbookpageStaticText(dateformat1).getLocation();
		int count = 0;
		while (!getOtrLogbookpageStaticText(dateformat2).isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 5);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}
		WebDriverTestCase.verifyTrue(getOtrLogbookpageStaticText(dateformat2).isPresent(),
				" Date 365 day before not present", "Date 365 day before present");

	}

	public void verifyAllowedBGRange(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		getOtrlogbookaddeventlbl().waitForPresent();
		// getOtrlogbookaddeventaddbgvaluebtn().click();
		getOtrlogbookaddbgaddvaluetxt().click();
		JNJUtilsAndroid.waitforLoad();
		enterManualBGvalue(ConfigurationManager.getBundle().getString("appCommon.hi"));
		WebDriverTestCase.verifyTrue(
				getOtrlogbookaddbgaddvaluetxt().getText()
						.contains(ConfigurationManager.getBundle().getString("appCommon.hi")),
				" HI is not entered after", "HI is entered after");
		enterManualBGvalue(ConfigurationManager.getBundle().getString("appCommon.lo"));
		WebDriverTestCase.verifyTrue(
				getOtrlogbookaddbgaddvaluetxt().getText()
						.contains(ConfigurationManager.getBundle().getString("appCommon.lo")),
				" LO is not entered after", "LO is entered after");
		String option = eventBean.getUnit().toUpperCase();
		switch (option) {
		case "MG/DL":
			int lowvalue = Integer.parseInt(eventBean.getLowestGlucosValue()) - 1;
			enterManualBGvalue("" + lowvalue);
			// getOtrlogbookaddeventlbl().click();
			JNJUtilsAndroid.waitforLoad();
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("addNote.valueRange"))
					.verifyPresent("Blood glucose range error for low value");
			Reporter.logWithScreenShot("Blood glucose range error for low value", MessageTypes.Pass);
			if (getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).isPresent())
				getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("appCommon.ok")).click();
			int highvalue = Integer.parseInt(eventBean.getHighstGlucosValue()) + 1;
			enterManualBGvalue("" + highvalue);
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("addNote.valueRange"))
					.verifyPresent("Blood glucose range error for high value");
			Reporter.logWithScreenShot("Blood glucose range error for High value", MessageTypes.Pass);
			break;
		case "MMOL/L":
			double lowvalue1 = (Float.parseFloat(eventBean.getLowestGlucosValue())) - 0.1;
			enterManualBGvalue("" + lowvalue1);
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("addNote.valueRange"))
					.verifyPresent("Blood glucose range error for low value");
			Reporter.logWithScreenShot("Blood glucose range error for low value", MessageTypes.Pass);
			double highvalue1 = (Float.parseFloat(eventBean.getHighstGlucosValue())) + 0.2;
			enterManualBGvalue("" + highvalue1);
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("addNote.valueRange"))
					.verifyPresent("Blood glucose range error for high value");
			Reporter.logWithScreenShot("Blood glucose range error for High value", MessageTypes.Pass);
			break;
		}

	}

	// 21March
	// Gaurav Bhamare

	public void clickAndVerifyInfoScreenLogbook() {
		getOtrLogbookDayviewInfoBtn().waitForPresent();
		getOtrLogbookDayviewInfoBtn().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Graph Legend screen", MessageTypes.Pass);

	}

	public void verifyNoInsulinSectionWeekView() {
		if (getOtrLogbookWeekviewInsulinTab().isPresent())
			Reporter.logWithScreenShot("Insulin tab is not present", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("Insulin tab is not present", MessageTypes.Pass);

	}

	public void addRandomGlucose() {
		userSelectFromLogEventList("GLUCOSE");
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		int randomNumberGlucose = ThreadLocalRandom.current().nextInt(21, 200);
		ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose);
		enterManualBGvalue(randomNumberGlucose + "");
		Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose, MessageTypes.Pass);
		getOtrLogbookAddeventEventiconImg().get(0).click();

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void editRandomGlucose() {
		Point p = getOtrLogbookEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getOtrLogbookpageStaticText(randomNumberGlucose).isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {

			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberGlucose)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookAddbgAddvalueTxtList().size(); j++) {

					if (getOtrLogbookAddbgAddvalueTxtList().get(j).getText().equals(randomNumberGlucose)) {
						getOtrLogbookAddbgAddvalueTxtList().get(j).clear();
						getOtrLogbookAddbgAddvalueTxtList().get(j).clear();
						int randomNumberGlucose1 = ThreadLocalRandom.current().nextInt(21, 200);
						getOtrLogbookAddbgAddvalueTxtList().get(j).sendKeys(randomNumberGlucose1 + "");
						JNJUtilsAndroid.hideKeyboard();
						Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose1,
								MessageTypes.Pass);
						getOtrLogbookAddeventEventiconImg().get(j).click();
						ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
						break;
					}
				}

				break;
			}

		}
		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void deleteRandomGlucose() {
		Point p = getOtrLogbookEditglucoseEditeventtitleTxt().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getOtrLogbookpageStaticText(randomNumberGlucose).isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 100);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}

		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {

			if (!JNJUtilsAndroid.tryMethod(getOtrLogbookpageStaticText(randomNumberGlucose))) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						Reporter.logWithScreenShot("After clicking delete button", MessageTypes.Pass);
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	public void clickOnTodayWeekView() {

		getOtrLogbookWeekviewTodayboxImg().waitForPresent();
		getOtrLogbookWeekviewTodayboxImg().click();
		Reporter.logWithScreenShot("Today event Screen", MessageTypes.Pass);

	}

	public void clickWeekViewBtn() {
		getOtrLogbookWeekViewBtn().waitForPresent();
		getOtrLogbookWeekViewBtn().click();
		Reporter.logWithScreenShot("Week view", MessageTypes.Pass);

	}

	public void addRandomCarb() {
		userSelectFromLogEventList("CARBS");
		int randomNumberCarb = ThreadLocalRandom.current().nextInt(1, 100);
		ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb);
		getOtrlogbookaddbgaddvaluetxt().sendKeys(randomNumberCarb + "");
		JNJUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Carb window after entering value" + randomNumberCarb, MessageTypes.Pass);
		getOtrlogbookaddbgaddvaluetxt().click();

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void editRandomCarb() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberCarb = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberCarb)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				int randomNumberCarb1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtrLogbookAddbgAddvalueTxtList().get(i).sendKeys(randomNumberCarb1 + "");
				JNJUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Carb window after editing value" + randomNumberCarb1, MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.carb", randomNumberCarb1);
				break;
			}
		}

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void deleteRandomCarb() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.carb").toString();
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberActivity)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	public void addRandomInsulin() {
		userSelectFromLogEventList("INSULIN");
		int randomNumberInsulin = ThreadLocalRandom.current().nextInt(10, 200);
		ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin);
		getOtrlogbookaddinsulinselecttypebtn().click();
		getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("insulin.insulinType")).waitForPresent();
		getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("event.detail.insulinController.rapid"))
				.click();
		Reporter.logWithScreenShot("Selected Insulin type", MessageTypes.Pass);
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().click();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(randomNumberInsulin + "");
		JNJUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Insulin window after adding value is " + randomNumberInsulin, MessageTypes.Pass);

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void editRandomInsulin() {
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			String arr[] = getOtrLogbookAddbgAddvalueTxtList().get(i).getText().split("\\.");
			if (randomNumberInsulin.equals(arr[0])) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				int randomNumberInsulin1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtrLogbookAddbgAddvalueTxtList().get(i).sendKeys(randomNumberInsulin1 + "");
				JNJUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Insulin window after editing value" + randomNumberInsulin1,
						MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.insulin", randomNumberInsulin1);
				break;
			}
		}
		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void deleteRandomInsulin() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberInsulin = ConfigurationManager.getBundle().getProperty("classic.insulin").toString();
			String arr[] = getOtrLogbookAddbgAddvalueTxtList().get(i).getText().split("\\.");
			if (randomNumberInsulin.equals(arr[0])) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						Reporter.logWithScreenShot("Before clicking delete button", MessageTypes.Pass);
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						Reporter.logWithScreenShot("after clicking delete button", MessageTypes.Pass);
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	public void addRandomActivity() {
		userSelectFromLogEventList("ACTIVITY");
		int randomNumberActivity = ThreadLocalRandom.current().nextInt(10, 1000);
		ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity);
		getOtrlogbookaddbgaddvaluetxt().sendKeys(randomNumberActivity + "");
		JNJUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Activity window after adding value is " + randomNumberActivity, MessageTypes.Pass);

		if (getOtrlogbookaddactivityintensitylbl().isPresent()) {
			getOtrlogbookaddactivityselectintensitybtn().click();
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("activity.type")).waitForPresent();
			getOtrLogbookpageStaticText(ConfigurationManager.getBundle().getString("activity.intensity.moderate"))
					.click();
			Reporter.logWithScreenShot("Selected activity type is ", MessageTypes.Pass);
		}

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void editRandomActivity() {
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberActivity)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				getOtrLogbookAddbgAddvalueTxtList().get(i).clear();
				int randomNumberActivity1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtrLogbookAddbgAddvalueTxtList().get(i).sendKeys(randomNumberActivity1 + "");
				JNJUtilsAndroid.hideKeyboard();
				Reporter.logWithScreenShot("Activity window after editing value" + randomNumberActivity1,
						MessageTypes.Pass);
				ConfigurationManager.getBundle().setProperty("classic.activity", randomNumberActivity1);
				break;
			}
		}
		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public void deleteRandomActivity() {
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();
		for (int i = 0; i < getOtrLogbookAddbgAddvalueTxtList().size(); i++) {
			String randomNumberActivity = ConfigurationManager.getBundle().getProperty("classic.activity").toString();
			if (getOtrLogbookAddbgAddvalueTxtList().get(i).getText().equals(randomNumberActivity)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				for (int j = 0; j < getOtrLogbookEditeventDeleteBtn().size(); j++) {
					if (JNJUtilsAndroid.tryMethod(getOtrLogbookEditeventDeleteBtn().get(j))) {
						getOtrLogbookEditeventDeleteBtn().get(j).click();
						getOtrLogbookEditglucoseDeleteconfirmTxt().waitForPresent();
						getOtrLogbookEditglucoseDeletepopupDeleteBtn().click();
						Reporter.logWithScreenShot("After clicking Ok button", MessageTypes.Pass);
						break;
					}
				}
				break;
			}
		}

	}

	public void clickOnDayView() {
		getOtrLogbookDayViewBtn().waitForPresent();
		getOtrLogbookDayViewBtn().click();
	}

	public void clickArrow(String option) {
		option = option.toLowerCase();
		switch (option) {
		case "left":

			getOtrLogbookClassicViewLeftArrowBtn().click();
			Reporter.logWithScreenShot("After clicking left arrow", MessageTypes.Pass);
			break;
		case "right":
			getOtrLogbookClassicViewRightArrowBtn().click();
			Reporter.logWithScreenShot("After clicking right arrow", MessageTypes.Pass);
			break;
		}
	}

	public void lastDayScreen() {
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("view screen", MessageTypes.Pass);
	}

	public void setBGForBeforeAfterMeal() {
		userSelectFromLogEventList("GLUCOSE");
		int minGlucose = 70;
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrlogbookaddbgaddvaluetxt().sendKeys(minGlucose + "");
		addGlucoseSelectBeforeAfter("before");
		Reporter.logWithScreenShot("Blood Glucose window after editing value" + minGlucose, MessageTypes.Pass);
		userSelectFromLogEventList("GLUCOSE");
		int inrangeGlucose = 110;
		getOtrlogbookaddbgaddvaluetxt().clear();
		getOtrLogbookAddbgAddvalueTxtList().get(1).sendKeys("" + inrangeGlucose);
		addGlucoseSelectBeforeAfter("after");
		Reporter.logWithScreenShot("Blood Glucose window after editing value" + inrangeGlucose, MessageTypes.Pass);

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);
	}

	public void addMultipleGlucose() {
		userSelectFromLogEventList("GLUCOSE");
		getOtrLogbookEditglucoseEditeventtitleTxt().waitForPresent();

		enterManualBGvalue("65");
		Reporter.logWithScreenShot("Blood Glucose window after editing value", MessageTypes.Pass);
		getOtrLogbookAddeventEventiconImg().get(0).click();

		userSelectFromLogEventList("GLUCOSE");
		getOtrLogbookAddbgAddvalueTxtList().get(1).clear();
		getOtrLogbookAddbgAddvalueTxtList().get(1).click();
		getOtrLogbookAddbgAddvalueTxtList().get(1).sendKeys("120");
		Reporter.logWithScreenShot("Blood Glucose window after editing value 120", MessageTypes.Pass);
		JNJUtilsAndroid.hideKeyboard();

		userSelectFromLogEventList("GLUCOSE");
		getOtrLogbookAddbgAddvalueTxtList().get(2).clear();
		getOtrLogbookAddbgAddvalueTxtList().get(2).click();
		getOtrLogbookAddbgAddvalueTxtList().get(2).sendKeys("190");
		Reporter.logWithScreenShot("Blood Glucose window after editing value 190", MessageTypes.Pass);
		JNJUtilsAndroid.hideKeyboard();

		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	// Method to edit blood glucose for specific date
	public void setDateRandomBG(String range) {
		int dateRange = Integer.parseInt(range) + 2;
		int count = 0;
		HomePageAndroid home = new HomePageAndroid();
		// getOtrlogbookaddeventlbl().waitForPresent();
		for (int i = 0; i < home.getOtrHomepageLastreadingAddedreadingValueLbl().size(); i++) {
			String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
			if (home.getOtrHomepageLastreadingAddedreadingValueLbl().get(i).getText().equals(randomNumberGlucose)) {
				getOtrLogbookAddeventEventiconImg().get(i).click();
				getOtrlogbookaddbgaddvaluetxt().clear();
				getOtrlogbookaddbgaddvaluetxt().clear();
				int randomNumberGlucose1 = ThreadLocalRandom.current().nextInt(21, 200);
				getOtrlogbookaddbgaddvaluetxt().sendKeys(randomNumberGlucose1 + "");
				Reporter.logWithScreenShot("Blood Glucose window after editing value" + randomNumberGlucose1,
						MessageTypes.Pass);
				// getotrlogbookaddevent().click();
				ConfigurationManager.getBundle().setProperty("classic.glucose", randomNumberGlucose1);
				getOtrlogbookaddbgtimebtn().click();
				getOtrLogbookEditglucoseDatepopupDateTxt().waitForPresent();

				setDateDatePopup(range);
				Reporter.logWithScreenShot("Selected day", MessageTypes.Pass);

				break;
			}

		}
		getOtrlogbookaddeventsavebtn().click();
		Reporter.logWithScreenShot("After clicking on save button", MessageTypes.Pass);

	}

	public String getDateForRange(String date) {

		int todaydate = Integer.parseInt(JNJUtilsAndroid.getCurrentDate());
		String currMonth = JNJUtilsAndroid.getCurrentMonth().substring(0, 3);
		int currentMonth = Integer.parseInt(JNJUtilsAndroid.monthIntValue(currMonth));

		int previoueMonth = 0;
		if (currentMonth == 1)
			previoueMonth = 12;
		else
			previoueMonth = currentMonth - 1;

		String prevMonth = JNJUtilsAndroid.monthIntValue(previoueMonth + "");
		int lastdayPreviousMonth = Integer.parseInt(JNJUtilsAndroid.monthNoOFDay(prevMonth).replaceAll("[^0-9]", ""));

		date = date.toLowerCase();
		String date1 = "";
		switch (date) {
		case "14":
			// 14 day
			if (todaydate < 14) {
				int extraday = 14 - todaydate;
				int calstartDay = lastdayPreviousMonth - extraday;
				date1 = prevMonth + " " + calstartDay;
			} else {
				int calstartDay = todaydate - 14;
				date1 = currMonth + " " + calstartDay;
			}
			break;
		case "30":
			// 30 day

			if (todaydate < 30) {
				int extraday = 30 - todaydate;
				int calstartDay = lastdayPreviousMonth - extraday;
				date1 = prevMonth + " " + calstartDay;
			} else {
				int calstartDay = todaydate - 30;
				date1 = currMonth + " " + calstartDay;
			}
			break;
		case "90":
			// 90 day
			int previousMonth1 = 0;
			if (previoueMonth == 1)
				previousMonth1 = 12;
			else
				previousMonth1 = previoueMonth - 1;
			String prevMonth1 = JNJUtilsAndroid.monthIntValue(previousMonth1 + "");
			int lastdayMonth1 = Integer.parseInt(JNJUtilsAndroid.monthNoOFDay(prevMonth1));
			int totalDay = todaydate + lastdayPreviousMonth + lastdayMonth1;
			if (totalDay < 90) {
				int remainingDay = 90 - totalDay;
				int previousMonth2 = 0;
				if (previousMonth1 == 1)
					previousMonth2 = 12;
				else
					previousMonth2 = previousMonth1 - 1;

				String prevMonth2 = JNJUtilsAndroid.monthIntValue(previousMonth2 + "");
				int lastdayMonth2 = Integer.parseInt(JNJUtilsAndroid.monthNoOFDay(prevMonth2));

				int calstartDay = lastdayMonth2 - remainingDay;
				date1 = prevMonth2 + " " + calstartDay;

			} else {
				int calstartDay = totalDay - 90;
				date1 = prevMonth1 + " " + calstartDay;
			}
			break;
		}
		return date1;

	}

	public void setDateDatePopup(String date) {
		System.out.println(getDateForRange(date));
		String[] date1 = getDateForRange(date).split(" ");
		int rangeMonthInt = Integer.parseInt(JNJUtilsAndroid.monthIntValue(date1[0]));
		String rangeDate = date1[1];
		String currMonth = JNJUtilsAndroid.getCurrentMonth().substring(0, 3);
		System.out.println("Cur month " + currMonth);
		int currMonthInt = Integer.parseInt(JNJUtilsAndroid.monthIntValue(currMonth));

		try {
			if (rangeMonthInt < currMonthInt) {
				int count = currMonthInt - rangeMonthInt;
				System.out.println(count);
				while (count != 0) {
					getOtrLogbookCelenderLeftarrowBtn().click();
					count--;
					// System.out.println(count);
				}
			} else if (currMonthInt < rangeMonthInt) {
				int count = rangeMonthInt - currMonthInt;

				while (count != 0) {
					getOtrLogbookCelenderRightarrowBtn().click();
					count--;
				}
			} else {
				System.out.println("continue next codes");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		// click on date
		getOtrLogbookpageStaticText(rangeDate).click();
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventtimeselectokbtn().click();
	}

	public void addPreviousDateGlucose(Object eventDetail) {

		getOtrlogbookaddbgaddvaluetxt().waitForPresent();
		getOtrlogbookaddbgaddvaluetxt().clear();
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
		enterManualBGvalue("200");
		Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
		getOtrlogbookaddbgtimebtn().click();
		selectDate();
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventtimeselectokbtn().click();
	}

	public void addRandomBGTodayANdYesterday() {
		// To add yesterday's data
		Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
		enterManualBGvalue("200");
		Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
		getOtrlogbookaddbgtimebtn().click();
		selectDate();
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventsavebtn().waitForPresent();
		getOtrlogbookaddeventsavebtn().click();
		clickOnAddEventButton();
		
		//To add today's data
		userSelectFromLogEventList("GLUCOSE");
		Reporter.logWithScreenShot("Blood Glucose window before adding value", MessageTypes.Pass);
		enterManualBGvalue("200");
		Reporter.logWithScreenShot("Blood Glucose window after adding value", MessageTypes.Pass);
		getOtrlogbookaddbgtimebtn().click();
		selectTodaysDate();
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventtimeselectokbtn().click();
		getOtrlogbookaddeventsavebtn().waitForPresent();
		getOtrlogbookaddeventsavebtn().click();

	}

	public void verifyDefaultInsulinType() {
		WebDriverTestCase.verifyTrue(getOtrlogbookaddinsulinselecttypebtn().getAttribute("text")
				.contains(JNJUtilsAndroid.getPropString("event.detail.insulinController.rapid")),
				"Default insulin type not present", "Default insulin type present");
		
	}

	public void verifyLastInsulinAsDefault() {
		String insulinType=ConfigurationManager.getBundle().getString("last.added.insulin.type");
		WebDriverTestCase.verifyTrue(getOtrlogbookaddinsulinselecttypebtn().getAttribute("text")
				.contains(insulinType),
				"Last added insulin type not present", "Last added insulin type present");		
	}

	//Method to verify right forward arrow should not display when in current day
	public void verifyRightArrowInvisible(){
		getOtrLogbookClassicViewRightArrowBtn().verifyNotVisible("Forward arrow on Today view");
	}

	//Method to click on day view event field
	public void clickOnDayViewEvent(){
		getOtrLogbookDayviewViewFld().waitForPresent();
		getOtrLogbookDayviewViewFld().click();
	}

	// Method to check date on add event date label
	public void verifyDefaultDateForYesterday() {
		String date = getOtrlogbookaddbgtimebtn().getAttribute("value");
		WebDriverTestCase.verifyTrue(!date.contains("Today"), "Default date is Today",
				"Default date is correct" + date);
	}
		

}
