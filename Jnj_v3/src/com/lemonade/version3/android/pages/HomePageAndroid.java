package com.lemonade.version3.android.pages;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.android.beans.EventDetailBeans;
import com.lemonade.version3.iOS.pages.LogbookPageIOS;
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

public class HomePageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.homepage.share.btn")
	private QAFWebElement otrHomepageShareBtn;
	@FindBy(locator = "otr.homepage.more.btn")
	private QAFWebElement otrHomepageMoreBtn;
	@FindBy(locator = "otr.homepage.home.btn")
	private QAFWebElement otrHomepageHomeBtn;
	@FindBy(locator = "otr.homepage.logbook.btn")
	private QAFWebElement otrHomepageLogbookBtn;
	@FindBy(locator = "otr.homepage.connection.btn")
	private QAFWebElement otrHomepageConnectionBtn;
	@FindBy(locator = "otr.homepage.onetouch.img")
	private QAFWebElement otrHomepageOnetouchImg;
	@FindBy(locator = "otr.homepage.eventvalue.txt")
	private List<QAFWebElement> otrHomepageEventValueTxt;
	@FindBy(locator = "otr.homepage.eventUOM.txt")
	private List<QAFWebElement> otrHomepageEventUOMTxt;
	@FindBy(locator = "otr.homepage.eventdatetime.txt")
	private List<QAFWebElement> otrHomepageEventDatetimeTxt;
	@FindBy(locator = "otr.homepage.eventnote.icon")
	private List<QAFWebElement> otrHomepageEventnoteIcon;
	@FindBy(locator = "otr.homepage.event.icon")
	private List<QAFWebElement> otrHomepageEventCircleIcon;
	@FindBy(locator = "otr.homepage.actionbar.img")
	private QAFWebElement otrHomepageActionbarImg;
	@FindBy(locator = "otr.homepage.noevent.txt")
	private QAFWebElement otrHomepageNoeventTxt;
	@FindBy(locator = "otr.homepage.pairmeter.txt")
	private QAFWebElement otrHomepagePairmeterTxt;
	@FindBy(locator = "otr.homepage.addevent.txt")
	private QAFWebElement otrHomepageAddeventTxt;
	@FindBy(locator = "otr.homepage.patterns.btn")
	private QAFWebElement otrHomepagePatternsBtn;
	@FindBy(locator = "otr.homepage.lastreading.btn")
	private QAFWebElement otrHomepageLastReadingBtn;
	@FindBy(locator = "otr.homepage.lastreading14days.btn")
	private QAFWebElement otrHomepageLastreading14DaysBtn;

	@FindBy(locator = "otr.homepage.lastreading30days.btn")
	private QAFWebElement otrHomepageLastreading30DaysBtn;

	@FindBy(locator = "otr.homepage.lastreading90days.btn")
	private QAFWebElement otrHomepageLastreading90DaysBtn;
	@FindBy(locator = "otr.homepage.lastreading.reading.btn")
	private QAFWebElement otrHomepageLastReadingReadingBtn;
	@FindBy(locator = "otr.homepage.lastreading.perdayreading.btn")
	private QAFWebElement otrHomepageLastreadingPerdayReadingBtn;
	@FindBy(locator = "otr.homepage.lastreading.average.btn")
	private QAFWebElement otrHomepageLastReadingAverageBtn;
	@FindBy(locator = "otr.homepage.events.list")
	private List<QAFWebElement> otrHomepageEventsList;
	@FindBy(locator = "otr.homepage.lastreadingdate.lbl")
	private QAFWebElement otrHomepageLastReadingDateLbl;
	@FindBy(locator = "otr.homepage.lastreadingvalue.lbl")
	private QAFWebElement otrHomepageLastReadingValueLbl;
	@FindBy(locator = "otr.homepage.lastreadingallevent.lnk")
	private QAFWebElement otrHomepageLastReadingAllEventLnk;
	@FindBy(locator = "otr.homepage.lastreadingunit.lbl")
	private QAFWebElement otrHomepageLasrReadingUnitLbl;
	@FindBy(locator = "otr.homepage.lastreadingpage.lastsyncwithmeter.lbl")
	private QAFWebElement otrHomepageLastReadingPageLastSyncWithMeterLbl;
	@FindBy(locator = "otr.homepage.lastreadingpage.totalreadingsync.lbl")
	private QAFWebElement otrHomepageLastReadingPageTotalReadingsSyncLbl;
	@FindBy(locator = "otr.homepage.lastreadingpage.viewallreadings.lnk")
	private QAFWebElement otrHomepageLastReadingPageViewAllReadingsLnk;
	@FindBy(locator = "otr.homepage.lastreadingpage.averagechart.img")
	private QAFWebElement otrHomepageLastReadingpageAverageChartImg;
	@FindBy(locator = "otr.homepage.lastreadingpage.bgreading.popup")
	private QAFWebElement otrHomepageLastReadingPageBGReadingPopup;
	@FindBy(locator = "otr.homepage.reading.btn")
	private QAFWebElement otrHomepageReadingBtn;
	@FindBy(locator = "otr.homepage.readings.list")
	private List<QAFWebElement> otrHomepageReadingsList;
	@FindBy(locator = "otr.homepage.newarticle.lnk")
	private QAFWebElement otrHomepageNewarticleLnk;

	@FindBy(locator = "otr.homepage.lastreading.overalllow.lbl")
	private QAFWebElement otrHomepageLastreadingOveralllowLbl;
	@FindBy(locator = "otr.homepage.lastreading.overallhigh.lbl")
	private QAFWebElement otrHomepageLastreadingOverallhighLbl;
	@FindBy(locator = "otr.homepage.lastreading.inrangevalue.lbl")
	private QAFWebElement otrHomepageLastreadingInrangeCountLbl;
	@FindBy(locator = "otr.homepage.total.readings.popup.lbl")
	private QAFWebElement otrHomepageTotalReadingsPopupLbl;
	@FindBy(locator = "otr.homepage.lastreading.bgreading.popup.aftermeal.lowvalue.lbl")
	private QAFWebElement otrHomepageLastreadingBgreadingPopupAftermealLowvalueLbl;
	@FindBy(locator = "otr.homepage.lastreading.bgreading.popup.aftermeal.highvalue.lbl")
	private QAFWebElement otrHomepageLastreadingBgreadingPopupAftermealHighvalueLbl;

	public QAFWebElement getOtrHomepageLastreadingInrangeCountLbl() {
		return otrHomepageLastreadingInrangeCountLbl;
	}

	public QAFWebElement getOtrHomepageTotalReadingsPopupLbl() {
		return otrHomepageTotalReadingsPopupLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingBgreadingPopupAftermealLowvalueLbl() {
		return otrHomepageLastreadingBgreadingPopupAftermealLowvalueLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingBgreadingPopupAftermealHighvalueLbl() {
		return otrHomepageLastreadingBgreadingPopupAftermealHighvalueLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingOveralllowLbl() {
		return otrHomepageLastreadingOveralllowLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingOverallhighLbl() {
		return otrHomepageLastreadingOverallhighLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingFirstpageListItem() {
		return otrHomepageLastreadingFirstpageListItem;
	}

	public QAFWebElement getOtrHomepageNewarticleLnk() {
		return otrHomepageNewarticleLnk;
	}

	public QAFWebElement getOtrHomepageLastReadingpageAverageChartImg() {
		return otrHomepageLastReadingpageAverageChartImg;
	}

	public QAFWebElement getOtrHomepageLastReadingPageBGReadingPopup() {
		return otrHomepageLastReadingPageBGReadingPopup;
	}

	public QAFWebElement getOtrHomepageLastReadingPageLastSyncWithMeterLbl() {
		return otrHomepageLastReadingPageLastSyncWithMeterLbl;
	}

	public QAFWebElement getOtrHomepageLastReadingPageTotalReadingsSyncLbl() {
		return otrHomepageLastReadingPageTotalReadingsSyncLbl;
	}

	public QAFWebElement getOtrHomepageLastReadingPageViewAllReadingsLnk() {
		return otrHomepageLastReadingPageViewAllReadingsLnk;
	}

	public QAFWebElement getOtrHomepageLasrReadingUnitLbl() {
		return otrHomepageLasrReadingUnitLbl;
	}

	public QAFWebElement getOtrHomepageLastReadingDateLbl() {
		return otrHomepageLastReadingDateLbl;
	}

	public QAFWebElement getOtrHomepageLastReadingValueLbl() {
		return otrHomepageLastReadingValueLbl;
	}

	public QAFWebElement getOtrHomepageLastReadingAllEventLnk() {
		return otrHomepageLastReadingAllEventLnk;
	}

	public List<QAFWebElement> getOtrHomepageEventsList() {
		return otrHomepageEventsList;
	}

	public QAFWebElement getOtrHomepageLastReadingAverageBtn() {
		return otrHomepageLastReadingAverageBtn;
	}

	public QAFWebElement getOtrHomepageLastReadingsPerDayReadingsBtn() {
		return otrHomepageLastreadingPerdayReadingBtn;
	}

	public QAFWebElement getOtrHomepageLastReadingReadingBtn() {
		return otrHomepageLastReadingReadingBtn;
	}

	public QAFWebElement getOtrHomepageLastreading14DaysBtn() {
		return otrHomepageLastreading14DaysBtn;
	}

	public QAFWebElement getOtrHomepageLastreading30DaysBtn() {
		return otrHomepageLastreading30DaysBtn;
	}

	public QAFWebElement getOtrHomepageLastreading90DaysBtn() {
		return otrHomepageLastreading90DaysBtn;
	}

	public QAFWebElement getOtrHomepagePatternsBtn() {
		return otrHomepagePatternsBtn;
	}

	public QAFWebElement getOtrHomepageLastReadingBtn() {
		return otrHomepageLastReadingBtn;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {

	}

	public QAFWebElement getOtrHomepageActionbarImg() {
		return otrHomepageActionbarImg;
	}

	public List<QAFWebElement> getOtrHomepageEventCircleIcon() {
		return otrHomepageEventCircleIcon;
	}

	public List<QAFWebElement> getOtrHomepageEventnoteIcon() {
		return otrHomepageEventnoteIcon;
	}

	public List<QAFWebElement> getOtrHomepageEventDatetimeTxt() {
		return otrHomepageEventDatetimeTxt;
	}

	public List<QAFWebElement> getOtrHomepageEventUOMTxt() {
		return otrHomepageEventUOMTxt;
	}

	public List<QAFWebElement> getOtrHomepageEventValueTxt() {
		return otrHomepageEventValueTxt;
	}

	public QAFWebElement getOtrHomepageShareBtn() {
		return otrHomepageShareBtn;
	}

	public QAFWebElement getOtrHomepageMoreBtn() {
		return otrHomepageMoreBtn;
	}

	public QAFWebElement getOtrHomepageHomeBtn() {
		return otrHomepageHomeBtn;
	}

	public QAFWebElement getOtrHomepageLogbookBtn() {
		return otrHomepageLogbookBtn;
	}

	public QAFWebElement getOtrHomepageConnectionBtn() {
		return otrHomepageConnectionBtn;
	}

	public QAFWebElement getOtrHomepageOnetouchImg() {
		return otrHomepageOnetouchImg;

	}

	public QAFWebElement getOtrHomepageNoeventTxt() {
		return otrHomepageNoeventTxt;
	}

	public QAFWebElement getOtrHomepagePairmeterTxt() {
		return otrHomepagePairmeterTxt;
	}

	public QAFWebElement getOtrHomepageAddeventTxt() {
		return otrHomepageAddeventTxt;
	}

	public QAFWebElement getotrHomepageReadingBtn() {
		return otrHomepageReadingBtn;
	}

	public QAFWebElement getOtrHomepageAddedEventDynamicLbl(String text) {
		return JNJUtilsAndroid.getElement("otr.homepage.addedEvent.dynamic.lbl", text);
	}

	public List<QAFWebElement> getotrHomepageReadingsList() {
		return otrHomepageReadingsList;
	}

	public QAFWebElement getOtrHomepageLastreadingBgreadingPopupLowvalueLbl() {
		return otrHomepageLastreadingBgreadingPopupLowvalueLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingBgreadingPopupHighvalueLbl() {
		return otrHomepageLastreadingBgreadingPopupHighvalueLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingBgreadingPopupBeforemealReadingLbl() {
		return otrHomepageLastreadingBgreadingPopupBeforemealReadingLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingBgreadingPopupAftermealReadingLbl() {
		return otrHomepageLastreadingBgreadingPopupAftermealReadingLbl;
	}

	public QAFWebElement getOtrHomepageLastreadingBgreadingPopupNomealReadingLbl() {
		return otrHomepageLastreadingBgreadingPopupNomealReadingLbl;
	}

	public QAFWebElement getOtrHomepageDayvalueLbl(String text) {
		return JNJUtilsAndroid.getElement("otr.homepage.dayvalue.lbl", text);
	}

	LogbookPageAndroid logbookPageAndroid = new LogbookPageAndroid();
	@FindBy(locator = "otr.homepage.lastreading.firstpage.list.item")
	private QAFWebElement otrHomepageLastreadingFirstpageListItem;
	@FindBy(locator = "otr.homepage.lastreading.bgreading.popup.lowvalue.lbl")
	private QAFWebElement otrHomepageLastreadingBgreadingPopupLowvalueLbl;
	@FindBy(locator = "otr.homepage.lastreading.bgreading.popup.highvalue.lbl")
	private QAFWebElement otrHomepageLastreadingBgreadingPopupHighvalueLbl;
	@FindBy(locator = "otr.homepage.lastreading.bgreading.popup.beforemeal.reading.lbl")
	private QAFWebElement otrHomepageLastreadingBgreadingPopupBeforemealReadingLbl;
	@FindBy(locator = "otr.homepage.lastreading.bgreading.popup.aftermeal.reading.lbl")
	private QAFWebElement otrHomepageLastreadingBgreadingPopupAftermealReadingLbl;
	@FindBy(locator = "otr.homepage.lastreading.bgreading.popup.nomeal.reading.lbl")
	private QAFWebElement otrHomepageLastreadingBgreadingPopupNomealReadingLbl;
	@FindBy(locator = "otr.homepage.lastreading.addedreading.value.lbl")
	private List<QAFWebElement> otrHomepageLastreadingAddedreadingValueLbl;
	@FindBy(locator = "otr.homepage.lastreadin.averagereading.unit.txt")
	private QAFWebElement otrHomepageLastreadinAveragereadingUnitTxt;
	@FindBy(locator = "otr.homepage.welcomearticle.dismiss.btn")
	private QAFWebElement otrHomepageWelcomearticleDismissBtn;
	@FindBy(locator = "otr.homepage.welcomearticle.img")
	private QAFWebElement otrHomepageWelcomearticleImg;
	@FindBy(locator = "otr.homepage.dayvalue.lbl")
	private QAFWebElement otrHomepageDayvalueLbl;

	public QAFWebElement getOtrHomepageLastreadinAveragereadingUnitTxt() {
		return otrHomepageLastreadinAveragereadingUnitTxt;
	}

	public List<QAFWebElement> getOtrHomepageLastreadingAddedreadingValueLbl() {
		return otrHomepageLastreadingAddedreadingValueLbl;
	}

	// Method to verify footer tab on Homepage
	// SG Removing Connections per Sprint 4 updates to move connections to More
	// Menu
	public void verifyTabs() {
		// getOtrHomepageConnectionBtn().verifyPresent("Connection Button on Tab
		// bar is present");
		getOtrHomepageLogbookBtn().verifyPresent("Logbook Button on Tab bar is present");
		getOtrHomepageHomeBtn().verifyPresent("Home Button on Tab bar is present");
	}

	// Method to click on Logbook tab on Homepage
	public void clickOnLogbook() {
		getOtrHomepageLogbookBtn().waitForPresent();
		getOtrHomepageLogbookBtn().click();
		logbookPageAndroid.getOtrlogbookaddeventbtn().waitForPresent();
		Reporter.logWithScreenShot("Logbook Page is displayed", MessageTypes.Pass);
	}

	// Method to click on Connections tab on Homepage
	public void clickOnConnections() {
		getOtrHomepageConnectionBtn().waitForPresent();
		getOtrHomepageConnectionBtn().click();
	}

	// Method to verify Logbook page
	public void verifyLogbook() {
		LogbookPageAndroid logbookPageAndroid = new LogbookPageAndroid();
		logbookPageAndroid.getOtrLogbookClassicViewBtn().verifyPresent("Classic View button is present");
		logbookPageAndroid.getOtrLogbookWeekViewBtn().verifyPresent("Week View button is present");
		logbookPageAndroid.getOtrLogbookDayViewBtn().verifyPresent("Day View button is present");
		Reporter.logWithScreenShot("Logbook Page is displayed", MessageTypes.Pass);
	}

	// Method to verify Connections page
	public void verifyConnections() {
		Reporter.logWithScreenShot("Connections Page is displayed", MessageTypes.Pass);
	}

	// Method to click on Home tab on Homepage
	public void clickOnHome() {
		getOtrHomepageHomeBtn().waitForPresent();
		getOtrHomepageHomeBtn().click();
		Reporter.logWithScreenShot("Homepage is selected", MessageTypes.Pass);
	}

	// Method to verify Homepage
	public void verifyHome() {
		Reporter.logWithScreenShot("Home Page is displayed", MessageTypes.Pass);
	}

	// Method to click on More menu from Homepage
	public void clickMoreMenu() {
		getOtrHomepageMoreBtn().waitForPresent();
		getOtrHomepageMoreBtn().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("More Menu on Homepage", MessageTypes.Pass);

	}

	// Method to verify Navigation bar on Homepage
	public void verifyNavigationBar() {
		getOtrHomepageOnetouchImg().verifyPresent("One Touch Reveal Logo on Homepage");
		getOtrHomepageShareBtn().verifyPresent("Share Icon on Homepage");
		getOtrHomepageMoreBtn().verifyPresent("More Menu icon on Homepage");

	}

	// Method to click on Share button on Homepage
	public void clickOnShareBtn() {
		getOtrHomepageShareBtn().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Share Screen is displayed", MessageTypes.Pass);
	}

	// Method to click on added event displayed on home screen
	public void clickOnaddEvent(String value) {
		int count = 0;
		// getOtrHomepageActionbarImg().waitForPresent();
		for (QAFWebElement ele : getOtrHomepageEventValueTxt()) {
			if (JNJUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(value)) {
				ele.click();
				Reporter.logWithScreenShot("After clicking on event", MessageTypes.Pass);
				count++;
				break;
			}
		}
		if (count == 0)
			Reporter.logWithScreenShot("Events are not added", MessageTypes.Fail);

	}

	// Method to verify added event on Home screen
	public void verifyAddedEventHomeScreen(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		for (int i = 0; i < getOtrHomepageEventValueTxt().size(); i++) {
			if (JNJUtilsAndroid.tryDisplayMethod(getOtrHomepageEventValueTxt().get(i))
					&& getOtrHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Added event is displayed", MessageTypes.Pass);
				if (eventDetail.equals("addInsulin")) {
					WebDriverTestCase.verifyTrue(
							getOtrHomepageEventUOMTxt().get(i).getText()
									.contains(ConfigurationManager.getBundle().getString("csv.unit.insulinUnits")),
							"Improper UOM", "Proper UOM  " + eventBean.getUnit());
				} else {
					WebDriverTestCase.verifyTrue(
							getOtrHomepageEventUOMTxt().get(i).getText().contains(eventBean.getUnit()), "Improper UOM",
							"Proper UOM  " + eventBean.getUnit());
				}
				// WebDriverTestCase.verifyTrue(
				// getOtrHomepageEventDatetimeTxt().get(i).getText().contains(eventBean.getHour()),
				// "Improper Hour", "Proper Hour " + eventBean.getHour());

				break;
			}
		}

	}

	// Method to verify event is deleted
	// milan
	public void verifyEventDeleted(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		int count = 0;
		int cons = getOtrHomepageEventValueTxt().size();
		for (int i = 0; i < getOtrHomepageEventValueTxt().size(); i++) {
			if (JNJUtilsAndroid.tryDisplayMethod(getOtrHomepageEventValueTxt().get(i))
					&& getOtrHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())
					&& getOtrHomepageEventUOMTxt().get(i).getText().contains(eventBean.getUnit())) {
				getOtrHomepageEventValueTxt().get(i).click();
				LogbookPageAndroid logbook = new LogbookPageAndroid();
				logbook.deleteEvent();
				count++;
			}
			if (count == cons)
				break;
		}
		for (int i = 0; i < getOtrHomepageEventValueTxt().size(); i++) {
			if (JNJUtilsAndroid.tryDisplayMethod(getOtrHomepageEventValueTxt().get(i))
					&& getOtrHomepageEventValueTxt().get(i).getText().contains(eventBean.getAmount())
					&& getOtrHomepageEventUOMTxt().get(i).getText().contains(eventBean.getUnit())) {
				Reporter.logWithScreenShot("Event having amount:" + eventBean.getAmount() + " and UOM:"
						+ eventBean.getUnit() + " is not deleted", MessageTypes.Fail);
				break;
			} else {
				Reporter.logWithScreenShot("Event deleted successfully", MessageTypes.Pass);
			}
		}

	}

	// Method to verify Home Page with no Events created
	public void homePageNoEvents() {
		getOtrHomepageNoeventTxt().verifyPresent("No Event text is present");
		getOtrHomepagePairmeterTxt().verifyPresent("Pair meter text is present");
		getOtrHomepageAddeventTxt().verifyPresent("Add Event text is present");
	}

	// Method to click Add Event button on homepage
	public void homepageAddEvent() {

		getOtrHomepageAddeventTxt().waitForPresent();
		Reporter.logWithScreenShot("Add event button is present on homescreen", MessageTypes.Pass);
		getOtrHomepageAddeventTxt().click();

	}

	public void clickLastReading() {
		getOtrHomepageHomeBtn().click();
		getOtrHomepageLastReadingBtn().verifyPresent("Last Reading tab is present on Homepage");
		getOtrHomepageLastReadingBtn().click();

	}

	public void verifyLastreading() {
		getOtrHomepageLastreading14DaysBtn().verifyPresent("14 days view button is present");
		getOtrHomepageLastreading30DaysBtn().verifyPresent("30 days view button is present");
		getOtrHomepageLastreading90DaysBtn().verifyPresent("90 days view button is present");
		Reporter.logWithScreenShot("Last reading Page is displayed", MessageTypes.Pass);

	}

	public void verifyLastReadingSummary() {
		getOtrHomepageLastreading14DaysBtn().verifyPresent("14 days view button is present");
		getOtrHomepageLastreading30DaysBtn().verifyPresent("30 days view button is present");
		getOtrHomepageLastreading90DaysBtn().verifyPresent("90 days view button is present");
		getOtrHomepageLastReadingsPerDayReadingsBtn().verifyPresent("Readings per Day button is present");

	}

	public void verifyDayViewsOfLogbook() {
		getOtrHomepageLastreading14DaysBtn().isPresent();
		getOtrHomepageLastreading14DaysBtn().click();
		Reporter.logWithScreenShot("14 day view page is displayed", MessageTypes.Pass);
		getOtrHomepageLastreading30DaysBtn().isPresent();
		getOtrHomepageLastreading30DaysBtn().click();
		Reporter.logWithScreenShot("30 day view page is displayed", MessageTypes.Pass);
		getOtrHomepageLastreading90DaysBtn().isPresent();
		getOtrHomepageLastreading90DaysBtn().click();
		Reporter.logWithScreenShot("90 day view page is displayed", MessageTypes.Pass);

	}

	// Method to delete all events on homepage
	public void deleteEvents() {
		Reporter.logWithScreenShot("You are on Homepage", MessageTypes.Pass);
		for (QAFWebElement element : otrHomepageEventsList) {
			element.click();
			logbookPageAndroid.deleteEvent();
		}

	}

	public void clickLastSyncButton() {
		getOtrHomepageLastReadingDateLbl().verifyPresent("Last Reading date label is present");
		getOtrHomepageLastReadingValueLbl().verifyPresent("Last Reading value label is present");
		getOtrHomepageLastReadingDateLbl().click();
	}

	public void clickAllEventsLinkn() {
		getOtrHomepageLastReadingAllEventLnk().waitForPresent();
		Reporter.logWithScreenShot("Last Reading all event page is displayed", MessageTypes.Pass);
		getOtrHomepageLastReadingAllEventLnk().click();

	}

	public void verifyAllEventScreen() {
		LogbookPageAndroid pageAndroid = new LogbookPageAndroid();
		pageAndroid.getOtrLogbookClassicViewBtn().verifyPresent("Logbook page is displayed");

	}

	// Method to verify recent event values on recent event tab on home screen
	public void verifyRecentEventDetails(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}

		WebDriverTestCase.verifyTrue(
				getOtrHomepageLastReadingValueLbl().getAttribute("text").contains(eventBean.getAmount()),
				eventBean.getAmount() + "Expected amount not present", "Proper amount  " + eventBean.getAmount());
		WebDriverTestCase.verifyTrue(
				getOtrHomepageLasrReadingUnitLbl().getAttribute("text").contains(eventBean.getUnit()),
				eventBean.getUnit() + "Expected unit not present", "Proper unit  " + eventBean.getUnit());
	}

	// method to verify last sync with meter screen
	public void verifyLastSyncScreen() {
		getOtrHomepageLastReadingPageLastSyncWithMeterLbl().waitForPresent();
		getOtrHomepageLastReadingPageLastSyncWithMeterLbl().verifyPresent("Last meter sync title");
		getOtrHomepageLastReadingPageTotalReadingsSyncLbl().verifyPresent("No of meter reading");
		getOtrHomepageLastReadingPageViewAllReadingsLnk().verifyPresent("All event link");
	}

	// Method to verify sync meter reading same
	public void verifyNoOFMeterReadingSame() {
		String count = ConfigurationManager.getBundle().getPropertyValue("Lastsync.BG.Count");
		WebDriverTestCase.verifyTrue(
				getOtrHomepageLastReadingPageTotalReadingsSyncLbl().getAttribute("text").contains(count),
				"Dispalying manual BG readings ", "No manual BG readings");
	}

	// Method to get Blood Glucose count on last sync screen before adding a new
	// manual BG
	public void CheckBGCountLastSync() {

		String count = getOtrHomepageLastReadingPageTotalReadingsSyncLbl().getAttribute("text").replaceAll("[^0-9]",
				"");
		ConfigurationManager.getBundle().setProperty("Lastsync.BG.Count", count);
		Reporter.logWithScreenShot("Last Sync BG count" + count, MessageTypes.Pass);
	}

	// Method to click 14 30 90 Day button on Last Readings Summary page

	public void click14_30_90Day(String pageName) {
		pageName = pageName.toUpperCase();
		switch (pageName) {
		case "14 DAYS":
			getOtrHomepageLastreading14DaysBtn().waitForPresent();
			getOtrHomepageLastreading14DaysBtn().click();

			break;
		case "30 DAYS":
			getOtrHomepageLastreading30DaysBtn().waitForPresent();
			getOtrHomepageLastreading30DaysBtn().click();

			break;

		case "90 DAYS":
			getOtrHomepageLastreading90DaysBtn().waitForPresent();
			getOtrHomepageLastreading90DaysBtn().click();

			break;
		}

	}

	// Method to verify detail BG pop up from circle view
	public void verifyPeriodRusultPage() {
		getOtrHomepageLastreading30DaysBtn().waitForPresent();
		Reporter.logWithScreenShot("Average last reading page for 30 days is displayed", MessageTypes.Pass);
		getOtrHomepageLastReadingpageAverageChartImg().click();
		getOtrHomepageLastReadingPageBGReadingPopup().waitForPresent();
		Reporter.logWithScreenShot("Average BG reading Popup is displayed", MessageTypes.Pass);
	}

	public void verifyNewUserWelcomePage() {
		getOtrHomepageShareBtn().waitForPresent();
		if (getOtrHomepageNewarticleLnk().isPresent())
			getOtrHomepageNewarticleLnk().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Article page1", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(400, 1000, 400, 700, 100);
		Reporter.logWithScreenShot("Article page2", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();

	}

	// Method to click Patterns button
	public void clickPatterns() {
		getOtrHomepagePatternsBtn().verifyPresent("Patterns Button is Present");
		getOtrHomepagePatternsBtn().click();
		Reporter.logWithScreenShot("pattern page", MessageTypes.Pass);
	}

	public void verifyAllLastReadignWithNoRreading() {
		click14_30_90Day("14 DAYS");
		if (getOtrHomepageLastreading14DaysBtn().getAttribute("selected").toString().equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("14 Days view screen", MessageTypes.Pass);
		click14_30_90Day("30 DAYS");
		if (getOtrHomepageLastreading30DaysBtn().getAttribute("selected").toString().equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("30 Days view screen", MessageTypes.Pass);
		click14_30_90Day("90 DAYS");
		if (getOtrHomepageLastreading90DaysBtn().getAttribute("selected").toString().equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("90 Days view screen", MessageTypes.Pass);
	}

	public void clickReadingButtonLastreadingPage() {
		getotrHomepageReadingBtn().waitForPresent();
		getotrHomepageReadingBtn().click();
		JNJUtilsAndroid.waitforLoad();
	}

	// Method to verify recent added glucose reading lastreading screen
	// Sangram
	public void verifyReccentAddedGlucoseLastReading(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		for (QAFWebElement reading : getotrHomepageReadingsList()) {

			if (reading.getText().contains(eventBean.getAmount())) {
				Reporter.logWithScreenShot("Last added reading matched", MessageTypes.Pass);
			}
		}

	}

	public void verifyPeriodBgResultPopUpValue() {
		if (getOtrHomepageLastReadingpageAverageChartImg().isPresent()) {
			getOtrHomepageLastReadingpageAverageChartImg().click();
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("Period Result Popup is displayed", MessageTypes.Pass);
		}

	}

	public void clickReccentAddedGlucoseLastReading(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		eventBean.fillData(eventDetail);
		getOtrHomepageLastreadingFirstpageListItem().click();
	}

	public void screenShotTake() {
		Reporter.logWithScreenShot("Taking screenshot", MessageTypes.Pass);

	}

	public void verifyOverallRangeonDonutPopUp() {
		getOtrHomepageLastReadingpageAverageChartImg().waitForPresent();
		getOtrHomepageLastReadingpageAverageChartImg().click();
		String lowRange = ConfigurationManager.getBundle().getProperty("Low.BG.Range.Value").toString();
		String highRange = ConfigurationManager.getBundle().getProperty("High.BG.Range.Value").toString();

		WebDriverTestCase.verifyTrue(getOtrHomepageLastreadingOveralllowLbl().getText().contains(lowRange),
				"Incorrect low range ", "Correct low range");
		WebDriverTestCase.verifyTrue(getOtrHomepageLastreadingOverallhighLbl().getText().contains(highRange),
				"Incorrect high range ", "Correct high range");

	}

	public void verifyAMBMDonutRange() {
		getOtrHomepageLastReadingpageAverageChartImg().click();
		Reporter.logWithScreenShot("Click on Average chart", MessageTypes.Pass);
		getOtrHomepageTotalReadingsPopupLbl().waitForPresent();
		String bmLowRange = ConfigurationManager.getBundle().getProperty("BM.BG.Low").toString();
		String bmHighRange = ConfigurationManager.getBundle().getProperty("BM.BG.High").toString();
		WebDriverTestCase.verifyTrue(
				getOtrHomepageLastreadingBgreadingPopupLowvalueLbl().getAttribute("text").contains(bmLowRange),
				"Expected " + bmLowRange + "  Actual "
						+ getOtrHomepageLastreadingBgreadingPopupLowvalueLbl().getAttribute("text"),
				"Correcct before meal low range");
		WebDriverTestCase.verifyTrue(
				getOtrHomepageLastreadingBgreadingPopupHighvalueLbl().getAttribute("text").contains(bmHighRange),
				"Expected " + bmHighRange + "  Actual "
						+ getOtrHomepageLastreadingBgreadingPopupHighvalueLbl().getAttribute("text"),
				"Correcct before meal high range");

		String amLowRange = ConfigurationManager.getBundle().getProperty("AM.BG.Low").toString();
		String amHighRange = ConfigurationManager.getBundle().getProperty("AM.BG.High").toString();

		WebDriverTestCase.verifyTrue(
				getOtrHomepageLastreadingBgreadingPopupAftermealLowvalueLbl().getAttribute("text").contains(amLowRange),
				"Expected " + amLowRange + "  Actual "
						+ getOtrHomepageLastreadingBgreadingPopupAftermealLowvalueLbl().getAttribute("text"),
				"Correcct after meal low range");
		WebDriverTestCase.verifyTrue(
				getOtrHomepageLastreadingBgreadingPopupAftermealHighvalueLbl().getAttribute("text")
						.contains(amHighRange),
				"Expected " + amHighRange + "  Actual "
						+ getOtrHomepageLastreadingBgreadingPopupAftermealHighvalueLbl().getAttribute("text"),
				"Correcct after meal high range");

	}

	// Method to verify BF count for no meal tag, before meal tag, after meal
	// tag
	public void countForBeforeAfterMeal() {
		getOtrHomepageLastReadingpageAverageChartImg().click();
		getOtrHomepageLastreadingBgreadingPopupBeforemealReadingLbl().waitForPresent();
		Validator.verifyThat("Before Meal count",
				(getOtrHomepageLastreadingBgreadingPopupBeforemealReadingLbl().getText()), Matchers.equalTo("1"));
		Validator.verifyThat("After Meal count",
				(getOtrHomepageLastreadingBgreadingPopupAftermealReadingLbl().getText()), Matchers.equalTo("1"));
		Validator.verifyThat("No Meal Tag count", (getOtrHomepageLastreadingBgreadingPopupNomealReadingLbl().getText()),
				Matchers.equalTo("1"));

	}

	public void verifyBGDisplayedCorrectPeriod() {

		Point p = getOtrHomepageLastreadingInrangeCountLbl().getLocation();
		int count = 0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!JNJUtilsAndroid.tryDisplayMethod(getOtrHomepageAddedEventDynamicLbl(randomNumberGlucose))) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 800, p.getX() + 100, p.getY() + 100, 10);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}
		getOtrHomepageAddedEventDynamicLbl(randomNumberGlucose).verifyPresent("Edited glucose in proper range");
		LogbookPageAndroid logbook = new LogbookPageAndroid();
		for (int i = 0; i < getOtrHomepageLastreadingAddedreadingValueLbl().size(); i++) {
			if (getOtrHomepageLastreadingAddedreadingValueLbl().get(i).getText().equals(randomNumberGlucose)) {
				logbook.getOtrLogbookAddeventEventiconImg().get(i).click();
				logbook.deleteEvent();
				break;

			}
		}

	}

	public void verifyBGNotDisplayedNintyRange() {
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		getOtrHomepageAddedEventDynamicLbl(randomNumberGlucose).verifyNotVisible("Edited BG date out of 90 day range");
	}

	public void verifyDeletedBGOnHomepage() {
		// TODO Auto-generated method stub

	}

	public void verifyAverageUnits() {
		if (getOtrHomepageLastreadinAveragereadingUnitTxt().getText().contains("0")) {
			Reporter.logWithScreenShot("Units of last reading is displayed as number", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Units of last reading is not displayed as number", MessageTypes.Pass);
		}
		String readingPerDay[]=getOtrHomepageLastreadinAveragereadingUnitTxt().getText().split(".");
		if(readingPerDay[1].length()==1){
			Reporter.logWithScreenShot("Displaying as per length", MessageTypes.Pass);
		}
		else {
			Reporter.logWithScreenShot("Not displaying as per length", MessageTypes.Fail);
		}
	}

	// Method to verify added event on last sync with meter frame
	public void lastSyncAddedEvent(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (getOtrHomepageLastReadingValueLbl().equals(eventBean.getAmount()))
			Reporter.logWithScreenShot("Event is added successfully", MessageTypes.Pass);

	}

	// Method to verify lastly added data is deleted or not
	public void lastSyncDeletedEvent(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		if (getOtrHomepageLastReadingValueLbl().equals("-"))
			Reporter.logWithScreenShot("No events are available", MessageTypes.Pass);

	}

	public void clickNewBGHomeScreen(String value) {
		int count = 0;
		for (QAFWebElement ele : getOtrHomepageEventValueTxt()) {
			if (JNJUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(value)) {
				ele.click();
				Reporter.logWithScreenShot("After clicking on event", MessageTypes.Pass);
				count++;
				break;
			}
		}
		if (count == 0)
			Reporter.logWithScreenShot("Events are not added", MessageTypes.Fail);

	}

	public QAFWebElement getOtrHomepageWelcomearticleDismissBtn() {
		return otrHomepageWelcomearticleDismissBtn;
	}

	public QAFWebElement getOtrHomepageWelcomearticleImg() {
		return otrHomepageWelcomearticleImg;
	}

	public void verifyWelcomeArticle() {
		int count = 0;
		Point p = getOtrHomepageLogbookBtn().getLocation();
		while (!getOtrHomepageWelcomearticleImg().isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 5);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 3)
				break;
		}

		if (getOtrHomepageWelcomearticleImg().isDisplayed()) {
			Reporter.logWithScreenShot("Welcome article is present for new user", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Welcome article is nt present for new user", MessageTypes.Fail);
	}

	public void deleteWelcomeArticle() {
		CountrySelectionPageAndroid countrySelectionPageAndroid = new CountrySelectionPageAndroid();
		if (getOtrHomepageWelcomearticleDismissBtn().isPresent()) {
			Reporter.logWithScreenShot("Dismiss button to delete article is present", MessageTypes.Pass);
			getOtrHomepageWelcomearticleDismissBtn().click();
			countrySelectionPageAndroid
					.getOtrcountrtyselectionpageStaticText(JNJUtilsAndroid.getPropString("appCommon.ok"))
					.waitForPresent();
			countrySelectionPageAndroid
					.getOtrcountrtyselectionpageStaticText(JNJUtilsAndroid.getPropString("appCommon.ok")).click();
			getOtrHomepageLogbookBtn().waitForPresent();
			Reporter.logWithScreenShot("Welcome article is deleted successfully.", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Welcome article dismiss button is not present", MessageTypes.Fail);
	}

	public void verifyTodayYesterdayEvent() {

		int count = 0;
		Point p = getOtrHomepageShareBtn().getLocation();
		while (!getOtrHomepageDayvalueLbl(JNJUtilsAndroid.getPropString("appCommon.yesterday")).isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX() + 100, p.getY() + 500, p.getX() + 100, p.getY() + 60, 5);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 3)
				break;
		}

		if (getOtrHomepageDayvalueLbl(JNJUtilsAndroid.getPropString("appCommon.yesterday")).isDisplayed()) {
			Reporter.logWithScreenShot("Yesterday label is present", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Yesterday label is not present", MessageTypes.Fail);

		 if
		 (getOtrHomepageDayvalueLbl(JNJUtilsAndroid.getPropString("appCommon.today")).isDisplayed())
		 {
		 Reporter.logWithScreenShot("Today label is present",
		 MessageTypes.Pass);
		 } else
		 Reporter.logWithScreenShot("Today label is not present",
		 MessageTypes.Fail);

	}

}
