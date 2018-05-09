package com.lemonade.version3.iOS.pages;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.lemonade.support.JNJUtilsAndroid;
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

public class HomePageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otrios.homepage.heading.lbl")
	private QAFWebElement otriosHomepageHeadingLbl;
	@FindBy(locator = "otrios.homepage.share.btn")
	private QAFWebElement otriosHomepageShareBtn;
	@FindBy(locator = "otrios.homepage.more.btn")
	private QAFWebElement otriosHomepageMoreBtn;
	@FindBy(locator = "otrios.homepage.home.btn")
	private QAFWebElement otriosHomepageHomeBtn;
	@FindBy(locator = "otrios.homepage.logbook.btn")
	private QAFWebElement otriosHomepageLogbookBtn;
	@FindBy(locator = "otrios.homepage.connection.btn")
	private QAFWebElement otriosHomepageConnectionBtn;
	@FindBy(locator = "otrios.homepage.patterns.btn")
	private QAFWebElement otriosHomePagePatternsBtn;
	@FindBy(locator = "otrios.homepage.lastreadings.btn")
	private QAFWebElement otriosHomepageLastreadingsBtn;
	@FindBy(locator = "otrios.homepage.lastreadingdetail.btn")
	private QAFWebElement otriosHomepageLastreadingsdetailBtn;
	@FindBy(locator = "otrios.homepage.lastreadingdetail14day.btn")
	private QAFWebElement otriosHomepageLastreadingdetail14dayBtn;
	@FindBy(locator = "otrios.homepage.lastreadingdetail30day.btn")
	private QAFWebElement otriosHomepageLastreadingdetail30dayBtn;
	@FindBy(locator = "otrios.homepage.lastreadingdetail90day.btn")
	private QAFWebElement otriosHomepageLastreadingdetail90dayBtn;
	@FindBy(locator = "otrios.homepage.lastreadingdetialNumberofreadingsleft.txt")
	private QAFWebElement otriosHomepageLastreadingdetailNumberofreadingsleftTxt;
	@FindBy(locator = "otrios.homepage.lastreadingdetialReadingsmiddle.txt")
	private QAFWebElement otriosHomepageLastreadingdetailReadingsmiddleTxt;
	@FindBy(locator = "otrios.homepage.lastreadingdetialUnitofmeasure.txt")
	private QAFWebElement otriosHomepageLastreadingdetailUnitofmeasureTxt;
	@FindBy(locator = "otrios.homepage.lastreadingdetialNumberofeadingsmiddle.txt")
	private QAFWebElement otriosHomepageLastreadingdetailNumberofreadingsmiddleTxt;
	@FindBy(locator = "otrios.homepage.addedEvent.value.lbl")
	private List<QAFWebElement> otriosHomepageAddedEventValueLbl;
	@FindBy(locator = "otrios.homepage.addedEvent.event.img")
	private List<QAFWebElement> otriosHomepageAddedEventImg;
	@FindBy(locator = "otrios.homepage.addedEvent.unit.lbl")
	private List<QAFWebElement> otriosHomepageAddedEventUnitLbl;
	@FindBy(locator = "otrios.homepage.addedEvent.date.lbl")
	private List<QAFWebElement> otriosHomepageAddedEventDateLbl;
	@FindBy(locator = "otrios.homepage.recentEventImg.btn")
	private QAFWebElement otriosHomepageRecenteventimgBtn;
	@FindBy(locator = "otrios.homepage.recentEventValue.lbl")
	private QAFWebElement otriosHomepageRecenteventvalueLbl;
	@FindBy(locator = "otrios.homepage.recentEventTime.lbl")
	private QAFWebElement otriosHomepageRecenteventtimeLbl;
	@FindBy(locator = "otrios.homepage.recentEventUnit.lbl")
	private QAFWebElement otriosHomepageRecenteventunitLbl;
	@FindBy(locator = "otrios.homepage.lastreading.recentBGValue.lbl")
	private QAFWebElement otriosHomepageLastreadingRecentbgvalueLbl;
	@FindBy(locator = "otrios.homepage.lastreading.recentBGUnit.lbl")
	private QAFWebElement otriosHomepageLastreadingRecentbgunitLbl;
	@FindBy(locator = "otrios.homepage.lastreading.recentBGLevel.lbl")
	private QAFWebElement otriosHomepageLastreadingRecentbglevelLbl;
	@FindBy(locator = "otrios.homepage.lastreading.recentBG.popup")
	private QAFWebElement otriosHomepageLastreadingRecentBGPopup;
	@FindBy(locator = "otrios.homepage.lastreading.recentBGDate.lbl")
	private QAFWebElement otriosHomepageLastreadingRecentBGDateRangePopup;
	@FindBy(locator = "otrios.homepage.readarticle.lnk")
	private QAFWebElement otriosHomepageReadarticleLnk;
	@FindBy(locator = "otrios.homepage.lastreading.addedEventValue.lbl")
	private QAFWebElement otriosHomepageLastReadingGlucoseValueLbl;
	@FindBy(locator = "otrios.homepage.lastreadingbeforemeal.popup.logo")
	private QAFWebElement otriosHomepageLastreadingbeforemealPopupLogo;
	@FindBy(locator = "otrios.homepage.lastreadingaftermeal.popup.logo")
	private QAFWebElement otriosHomepageLastreadingaftermealPopupLogo;
	@FindBy(locator = "otrios.homepage.lastreading.donat.overallRange.lbl")
	private QAFWebElement otriosHomepageLastreadingDonatOverallrangeLbl;
	@FindBy(locator = "otrios.homepage.lastreading.donat.afterrange.lbl")
	private QAFWebElement otriosHomepageLastreadingDonatAfterrangeLbl;
	@FindBy(locator = "otrios.homepage.lastreading.donat.beforerange.lbl")
	private QAFWebElement otriosHomepageLastreadingDonatBeforerangeLbl;
	@FindBy(locator = "otrios.homepage.lastreading.donat.beforemealcount.lbl")
	private QAFWebElement otriosHomepageLastreadingDonatBeforemealcountLbl;
	@FindBy(locator = "otrios.homepage.lastreading.donat.aftermealcount.lbl")
	private QAFWebElement otriosHomepageLastreadingDonatAftermealcountLbl;
	@FindBy(locator = "otrios.homepage.lastreading.donat.notagmealcount.lbl")
	private QAFWebElement otriosHomepageLastreadingDonatNotagmealcountLbl;
	@FindBy(locator = "otrios.homepage.lastreading.readings.inrange.lbl")
	private QAFWebElement otriosHomepageLastreadingReadingsInrangeLbl;
	@FindBy(locator = "otrios.homepage.lastreading.readings.value.txt")
	private List<QAFWebElement> otriosHomepageLastreadingReadingsValueTxt;
	
	@FindBy(locator = "otrios.homepage.patternon.btn")
	private QAFWebElement otriosHomepagePatternOnBtn;
	@FindBy(locator = "otrios.homepage.recentAddedReading.txt")
	private QAFWebElement otriosHomepageRecentAddedReadingTxt;
	@FindBy(locator="otrios.homepage.readingsPerDay.txt")
	private QAFWebElement otriosHomepageReadingsPerDayTxt;
	@FindBy(locator="otrios.homepage.atricleclose.btn")
	private QAFWebElement otriosHomepageArticleCloseBtn;
	@FindBy(locator="otrios.homepage.atricle.ok.btn")
	private QAFWebElement otriosHomepageArticleOkBtn;
	
	

	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	public QAFWebElement getOtriosHomepageArticleOkBtn() {
		return otriosHomepageArticleOkBtn;
	}
	public QAFWebElement getOtriosHomepageArticleCloseBtn() {
		return otriosHomepageArticleCloseBtn;
	}
	public QAFWebElement getOtriosHomepagePatternOnBtn() {
		return otriosHomepagePatternOnBtn;
	}
	public List<QAFWebElement> getOtriosHomepageLastreadingReadingsValueTxt() {
		return otriosHomepageLastreadingReadingsValueTxt;
	}
	public QAFWebElement getOtriosHomepageLastreadingReadingsInrangeLbl() {
		return otriosHomepageLastreadingReadingsInrangeLbl;
	}
	public QAFWebElement getOtriosHomepageLastreadingDonatBeforemealcountLbl() {
		return otriosHomepageLastreadingDonatBeforemealcountLbl;
	}

	public QAFWebElement getOtriosHomepageLastreadingDonatAftermealcountLbl() {
		return otriosHomepageLastreadingDonatAftermealcountLbl;
	}

	public QAFWebElement getOtriosHomepageLastreadingDonatNotagmealcountLbl() {
		return otriosHomepageLastreadingDonatNotagmealcountLbl;
	}
	public QAFWebElement getOtriosHomepageLastreadingDonatBeforerangeLbl() {
		return otriosHomepageLastreadingDonatBeforerangeLbl;
	}
	public QAFWebElement getOtriosHomepageLastreadingDonatAfterrangeLbl() {
		return otriosHomepageLastreadingDonatAfterrangeLbl;
	}
	public QAFWebElement getOtriosHomepageLastreadingDonatOverallrangeLbl() {
		return otriosHomepageLastreadingDonatOverallrangeLbl;
	}
	public QAFWebElement getOtriosHomepageLastReadingGlucoseValueLbl() {
		return otriosHomepageLastReadingGlucoseValueLbl;
	}
	public QAFWebElement getOtriosHomepageReadarticleLnk() {
		return otriosHomepageReadarticleLnk;
	}
	public QAFWebElement getOtriosHomepageLastreadingRecentBGDateRangePopup() {
		return otriosHomepageLastreadingRecentBGDateRangePopup;
	}
	public QAFWebElement getOtriosHomepageLastreadingRecentBGPopup() {
		return otriosHomepageLastreadingRecentBGPopup;
	}
	public QAFWebElement getOtriosHomepageLastreadingRecentbgvalueLbl() {
		return otriosHomepageLastreadingRecentbgvalueLbl;
	}
	public QAFWebElement getOtriosHomepageLastreadingRecentbgunitLbl() {
		return otriosHomepageLastreadingRecentbgunitLbl;
	}
	public QAFWebElement getOtriosHomepageLastreadingRecentbglevelLbl() {
		return otriosHomepageLastreadingRecentbglevelLbl;
	}
	
	public QAFWebElement getOtriosHomepageRecenteventimgBtn() {
		return otriosHomepageRecenteventimgBtn;
	}
	public QAFWebElement getOtriosHomepageRecenteventvalueLbl() {
		return otriosHomepageRecenteventvalueLbl;
	}
	public QAFWebElement getOtriosHomepageRecenteventtimeLbl() {
		return otriosHomepageRecenteventtimeLbl;
	}
	public QAFWebElement getOtriosHomepageRecenteventunitLbl() {
		return otriosHomepageRecenteventunitLbl;
	}
	public List<QAFWebElement> getOtriosHomepageAddedEventDateLbl() {
		return otriosHomepageAddedEventDateLbl;
	}
	public List<QAFWebElement> getOtriosHomepageAddedEventUnitLbl() {
		return otriosHomepageAddedEventUnitLbl;
	}
	public List<QAFWebElement> getOtriosHomepageAddedEventImg() {
		return otriosHomepageAddedEventImg;
	}
	public List<QAFWebElement> getOotriosHomepageAddedEventValueLbl() {
		return otriosHomepageAddedEventValueLbl;
	}

	public QAFWebElement getOtriosHomepageHeadingLbl() {
		return otriosHomepageHeadingLbl;
	}

	public QAFWebElement getOtriosHomepageShareBtn() {
		return otriosHomepageShareBtn;
	}

	public QAFWebElement getOtriosHomepageMoreBtn() {
		return otriosHomepageMoreBtn;
	}

	public QAFWebElement getOtriosHomepageHomeBtn() {
		return otriosHomepageHomeBtn;
	}

	public QAFWebElement getOtriosHomepageLogbookBtn() {
		return otriosHomepageLogbookBtn;
	}

	public QAFWebElement getOtriosHomepageConnectionBtn() {
		return otriosHomepageConnectionBtn;
	}

	public QAFWebElement getOtriosHomepageAddedEventDynamicAmountText(String text) {
		return JNJUtilsIOS.getElement("otrios.homepage.addedEvent.amountText.lbl", text);
	}
	public QAFWebElement getOtriosHomePagePatternsBtn(){
		return otriosHomePagePatternsBtn;
	}
	public QAFWebElement getOtriosHomepageLastreadingsBtn(){
		return otriosHomepageLastreadingsBtn;
	}
	public QAFWebElement getOtriosHomepageLastreadingsdetailBtn() {
		return otriosHomepageLastreadingsdetailBtn;
	}
	public QAFWebElement getOtriosHomepageLastreadingdetail14dayBtn(){
		return otriosHomepageLastreadingdetail14dayBtn;
	}
	public QAFWebElement getOtriosHomepageLastreadingdetail30dayBtn(){
		return otriosHomepageLastreadingdetail30dayBtn;
	}
	public QAFWebElement getOtriosHomepageLastreadingdetail90dayBtn(){
		return otriosHomepageLastreadingdetail90dayBtn;
	}

	public QAFWebElement getOtriosHomepageLastreadingdetailNumberofreadingsleftTxt(){
		return otriosHomepageLastreadingdetailNumberofreadingsleftTxt;
	}
	
	public QAFWebElement getOtriosHomepageLastreadingdetailReadingsmiddleTxt(){
		return otriosHomepageLastreadingdetailReadingsmiddleTxt;
	}
	public QAFWebElement getOtriosHomepageLastreadingdetailUnitofmeasureTxt(){
		return otriosHomepageLastreadingdetailUnitofmeasureTxt;
	}
	public QAFWebElement getOtriosHomepageLastreadingdetailNumberofreadingsmiddleTxt(){
		return otriosHomepageLastreadingdetailNumberofreadingsmiddleTxt;
	}
	public QAFWebElement getOtriosHomepageAddedEventDynamicLbl(String text) {
		return JNJUtilsIOS.getElement("otrios.homepage.addedEvent.dynamic.lbl", text);
	}
	public QAFWebElement getOtriosHomepageLastreadingbeforemealPopupLogo() {
		return otriosHomepageLastreadingbeforemealPopupLogo;
	}
	public QAFWebElement getOtriosHomepageLastreadingaftermealPopupLogo() {
		return otriosHomepageLastreadingaftermealPopupLogo;
	}
	public QAFWebElement getOtriosHomepageAddEventBtn() {
		return JNJUtilsIOS.getElement("otrios.homepage.addevent.btn",JNJUtilsIOS.getPropString("home.action.addAnEvent"));
	}
	public QAFWebElement getOtriosHomepageLastreadingdetailReadingsperdayTxt(){
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("summary.readingsPerDayText"));
	}
	public QAFWebElement getOtriosHomepageLastsyncwithmeterLbl() {
		return JNJUtilsIOS.getElement("otrios.homepage.lastsyncmetertitle.lbl",JNJUtilsIOS.getPropString("lastSync.meter.title"));
	}
	public QAFWebElement getOtriosHomepageLastsyncwithmeterViewalleventLnk() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("lastSync.meter.viewAllLogbookEvents"));
	}
	public QAFWebElement getOtriosHomepageLastsyncwithmeterTotalreadingLbl() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("summary.readingsText"));
	}
	public QAFWebElement getOtriosHomepageLastReadingNoavarageLbl() {
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("summary.noDataToDisplay"));
	}
	public QAFWebElement getOtriosHomepageLastreadingdetailReadingsleftTxt(){
		return JNJUtilsIOS.getElement("otrios.logbookPage.static.lbl",JNJUtilsIOS.getPropString("summary.readingsText"));
	}
    public QAFWebElement getOtriosHomepageRecentAddedReadingTxt(){
    	return otriosHomepageRecentAddedReadingTxt;
    }
    public QAFWebElement getotriosHomepageReadingsPerDayTxt() {
    	return otriosHomepageReadingsPerDayTxt;
    }
	
	
	
	// method to verify home page
	public void verifynavigationBar() {
		getOtriosHomepageShareBtn().waitForPresent();
		getOtriosHomepageShareBtn().verifyPresent("Share icon");
		getOtriosHomepageMoreBtn().verifyPresent("More icon");

	}

	// method to verify and click More icon
	// Milan
	public void clickOnMoreMenuIcon() {
		getOtriosHomepageMoreBtn().waitForPresent();
		getOtriosHomepageMoreBtn().click();
		MoremenuPageIOS more=new MoremenuPageIOS();
		more.getOtriosMoremenupageMysettingBtn().waitForPresent();
		Reporter.logWithScreenShot("After clicking more menu icon", MessageTypes.Pass);
	}

	// Method to click on share icon
	// milan
	public void clickOnShareIcon() {
		getOtriosHomepageShareBtn().waitForPresent();
		getOtriosHomepageShareBtn().click();
		Reporter.logWithScreenShot("After clicking share icon", MessageTypes.Pass);
	}

	// Method to click on home icon
	public void clickOnHome() {
		getOtriosHomepageHomeBtn().waitForPresent();
		getOtriosHomepageHomeBtn().click();
		Reporter.logWithScreenShot("After clicking Home icon", MessageTypes.Pass);
	}

	// method to click on logbook icon
	// milan
	public void clickOnLogbookIcon() {
		getOtriosHomepageLogbookBtn().waitForPresent();
		getOtriosHomepageLogbookBtn().click();
		LogbookPageIOS log=new LogbookPageIOS();
		log.getOtriosLogbookpageAddeventBtn().waitForPresent();
		Reporter.logWithScreenShot("After clicking logbook icon", MessageTypes.Pass);
	}

	// Method to click on added event displayed on home screen
	public void clickOnaddEvent(String data) {
		try {
			getOtriosHomepageAddedEventDynamicAmountText(data).waitForPresent();
			Point p1=getOtriosHomepageHomeBtn().getLocation();
			Dimension d1 =getOtriosHomepageHomeBtn().getSize();
			int count=0;
			
			while (!JNJUtilsIOS.tryMethod(getOtriosHomepageAddedEventDynamicAmountText(data))) {
				try {
					JNJUtilsIOS.swipeWithCoordinates(p1.getX()+ d1.getWidth(), p1.getY()+ d1.getHeight()+200, p1.getX()+ d1.getWidth(), p1.getY()+ d1.getHeight(), 1000);
					Reporter.logWithScreenShot("After swipe"+count, MessageTypes.Pass);
					count++;
					if(count==10)
						break;
				} catch (Exception e) {
				}
			}	
					
			getOtriosHomepageAddedEventDynamicAmountText(data).click();
		} catch (Exception e) {
		}
	}
	
	//Method to click on new added blood glucose hidden below screen
	public void clickNewBGHomeScreen(String data){
		try {
			getOtriosHomepageAddedEventDynamicAmountText(data).waitForPresent();
			Point p1=getOtriosHomepageHomeBtn().getLocation();
			Dimension d1 =getOtriosHomepageHomeBtn().getSize();
			int count=0;
			
			while (!JNJUtilsIOS.tryMethod(getOtriosHomepageAddedEventDynamicAmountText(data))) {
				try {
					JNJUtilsIOS.swipeWithCoordinates(p1.getX()+ d1.getWidth(), p1.getY()+ d1.getHeight()+200, p1.getX()+ d1.getWidth(), p1.getY()+ d1.getHeight(), 1000);
					Reporter.logWithScreenShot("After swipe"+count, MessageTypes.Pass);
					count++;
					if(count==10)
						break;
				} catch (Exception e) {
				}
			}	
					
			getOtriosHomepageAddedEventDynamicAmountText(data).click();
			getOtriosHomepageAddedEventDynamicAmountText(data).click();
		} catch (Exception e) {
		}
	}

	// Method to click on connection tab
	//SG adding steps to open connections from More Menu per Sprint 4 change
	public void clickConnectionIcon() {
		getOtriosHomepageMoreBtn().waitForPresent();
		getOtriosHomepageMoreBtn().click();
		getOtriosHomepageConnectionBtn().waitForPresent();
		getOtriosHomepageConnectionBtn().click();
		Reporter.logWithScreenShot("After clicking Connection icon", MessageTypes.Pass);
	}

	// Method to verify logbook page elements
	public void verifyLogbook() {
		LogbookPageIOS logbookPageIOS = new LogbookPageIOS();
		logbookPageIOS.getOtriosLogbookPageClassicBtn().verifyPresent("Classic view button is present");
		logbookPageIOS.getOtriosLogbookPageWeekBtn().verifyPresent("Week view button is present");
		logbookPageIOS.getOtriosLogbookPageDayBtn().verifyPresent("Day view button is present");
	}

	public void verifyConnection() {
		Reporter.logWithScreenShot("Connection page is displayed", MessageTypes.Pass);
	}

	// Method to verify home screen elements
	public void verifyHome() {
		//getOtriosHomepageShareBtn().waitForPresent();					
		getOtriosHomepageHomeBtn().waitForPresent();				//Changes done by Manjushri
		getOtriosHomepageHomeBtn().click();
		Reporter.logWithScreenShot("Homepage is displayed", MessageTypes.Pass);
	}

	// Method to verify added event on appear on home screen
	public void verifyAddedEventHomeScreen(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		WebDriverTestCase.verifyTrue(getOtriosHomepageAddedEventDynamicAmountText(eventBean.getAmount()).isPresent(),
				eventBean.getAmount() + "Expected amount not present", "Proper amount  " + eventBean.getAmount());
		WebDriverTestCase.verifyTrue(getOtriosHomepageAddedEventDynamicLbl(eventBean.getUnit()).isPresent(),
				eventBean.getUnit() + "Expected unit not present", "Proper unit  " + eventBean.getUnit());

	}
	
	

	public void verifyEventDeleted(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		int count = 0;
		while (JNJUtilsIOS.tryMethod(getOtriosHomepageAddedEventDynamicAmountText(eventBean.getAmount()))) {
			LogbookPageIOS logbook = new LogbookPageIOS();
			logbook.verifydeleteEvent();
			count++;
			if(count==10)
				break;
		}
		getOtriosHomepageHomeBtn().waitForPresent();
		if(!(JNJUtilsIOS.tryMethod(getOtriosHomepageAddedEventDynamicAmountText(eventBean.getAmount())))){
			Reporter.logWithScreenShot("Event is deleted", MessageTypes.Pass);
		}

	}

	public void homepageAddEvent() {
		if (getOtriosHomepageAddEventBtn().isPresent())
			getOtriosHomepageAddEventBtn().click();
	}

	// Method to verify Home Page with no Events created
	public void homePageNoEvents() {
		getOtriosHomepageAddEventBtn().verifyPresent("Add Event button is present");
	}

	// Method to verify footer tab on Homepage
	//1/15 SG This has been moved to the top of the page in Sprint 4
	public void verifyTabs() {
		//SG Removing Connections from Tab Footer to Settings Menu in Sprint 4
		//getOtriosHomepageConnectionBtn().verifyPresent("Connection Button on Tab bar is present");
		getOtriosHomepageLogbookBtn().verifyPresent("Logbook Button on Tab bar is present");
		getOtriosHomepageHomeBtn().verifyPresent("Home Button on Tab bar is present");
		getOtriosHomepageLastreadingsBtn().verifyPresent("Last Readings button on Tab bar is present");
		getOtriosHomepageLastreadingsdetailBtn().verifyPresent("Last Reading details button on Tab bar is present");
		getOtriosHomePagePatternsBtn().verifyPresent("Patterns button on Tab bar is present");
	}
	//Method to click Last Reading button
	public void clickLastReadingDetail() {
		getOtriosHomepageLastreadingsdetailBtn().verifyPresent("Last Reading Detail is present");
		getOtriosHomepageLastreadingsdetailBtn().click();
	}

	//Method to click Patterns button
	public void clickPatterns() {
		getOtriosHomePagePatternsBtn().verifyPresent("Patterns Button is Present");
		getOtriosHomePagePatternsBtn().click();
		getOtriosHomepagePatternOnBtn().waitForPresent();
		Reporter.logWithScreenShot("pattern page", MessageTypes.Pass);
	}
	//Method to verify Patterns page
	public void verifyPatternsPage() {
		getOtriosHomepagePatternOnBtn().verifyPresent("pattern page");
	}
	//Method to click Last Readings Summary button
	public void clickLastReadingSummaryButton() {
		getOtriosHomepageLastreadingsBtn().verifyPresent("Last Readings button on Tab bar is present");
		getOtriosHomepageLastreadingsBtn().click();
		getOtriosHomepageLastreadingdetail14dayBtn().waitForPresent();
		Reporter.logWithScreenShot("After clicking lastreading summery button", MessageTypes.Pass);
		
	}
	//Method to verify Last Readings Summary page is Open
	public void verifyLastReadingsSummaryPage() {
		getOtriosHomepageLastreadingdetail14dayBtn().verifyPresent("14 Day button is present");
		getOtriosHomepageLastreadingdetail30dayBtn().verifyPresent("30 Day button is present");
		getOtriosHomepageLastreadingdetail90dayBtn().verifyPresent("90 Day button is present");
	}
	//Method to verify Last Readings Summary page UI
	public void verifyLastReadingsSummaryPageUI() {
		getOtriosHomepageLastreadingdetail14dayBtn().verifyPresent("14 Day button is present");
		getOtriosHomepageLastreadingdetail30dayBtn().verifyPresent("30 Day button is present");
		getOtriosHomepageLastreadingdetail90dayBtn().verifyPresent("90 Day button is present");		
		
		getOtriosHomepageLastreadingdetailNumberofreadingsleftTxt().verifyPresent("Number of Readings in left cell of footer present");
		getOtriosHomepageLastreadingdetailNumberofreadingsmiddleTxt().verifyPresent("Number of Readings in middle cell of footer present");
		getOtriosHomepageLastreadingdetailReadingsleftTxt().verifyPresent("Readings text in left cell of footer present");
		getOtriosHomepageLastreadingdetailReadingsmiddleTxt().verifyPresent("Readings text in middle cell of footer present");
		getOtriosHomepageLastreadingdetailReadingsperdayTxt().verifyPresent("Readings per day text in right cell of footer present");
		getOtriosHomepageLastreadingdetailUnitofmeasureTxt().verifyPresent("Unit of Measure in middle cell of footer present");
		
		
	}
	//Method to click 14 30 90 Day button on Last Readings Summary page

	public void click14_30_90Day(String pageName) {
		pageName = pageName.toUpperCase();
		switch (pageName) {
		case "14 DAYS":
			getOtriosHomepageLastreadingdetail14dayBtn().waitForPresent();
			getOtriosHomepageLastreadingdetail14dayBtn().click();
			
			break;
		case "30 DAYS":
			getOtriosHomepageLastreadingdetail30dayBtn().waitForPresent();
			getOtriosHomepageLastreadingdetail30dayBtn().click();
			
			break;
		
		case "90 DAYS":
			getOtriosHomepageLastreadingdetail90dayBtn().waitForPresent();
			getOtriosHomepageLastreadingdetail90dayBtn().click();
		
		break;
		}

	}

	
	//Method to verify recent event values on recent event tab on home screen
	public void verifyRecentEventDetails(Object eventDetail){
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		
		WebDriverTestCase.verifyTrue(getOtriosHomepageRecenteventvalueLbl().getAttribute("label").contains(eventBean.getAmount()),
				eventBean.getAmount() + "Expected amount not present", "Proper amount  " + eventBean.getAmount());
		WebDriverTestCase.verifyTrue(getOtriosHomepageRecenteventunitLbl().getAttribute("label").contains(eventBean.getUnit()),
				eventBean.getUnit() + "Expected unit not present", "Proper unit  " + eventBean.getUnit());
	}
	
	//Method to click on recent event button
	public void clickOnRecentEventBtn(){
		getOtriosHomepageRecenteventimgBtn().waitForPresent();
		getOtriosHomepageRecenteventimgBtn().click();
		Reporter.logWithScreenShot("Last meter screen screen", MessageTypes.Pass);
		
	}
	
	//Method to verify sync meter reading same
	public void verifyNoOFMeterReadingSame(){
		String count=ConfigurationManager.getBundle().getPropertyValue("Lastsync.BG.Count");
		WebDriverTestCase.verifyTrue(getOtriosHomepageLastsyncwithmeterTotalreadingLbl().getAttribute("label").contains(count),
				 "Dispalying manual BG readings ", "No manual BG readings" );
	}
	
	//method to verify last sync with meter screen
	public void verifyLastSyncScreen(){
		getOtriosHomepageLastsyncwithmeterLbl().waitForPresent();
		getOtriosHomepageLastsyncwithmeterLbl().verifyPresent("Last meter sync title");
		getOtriosHomepageLastsyncwithmeterViewalleventLnk().verifyPresent("No of meter reading");
		getOtriosHomepageLastsyncwithmeterTotalreadingLbl().verifyPresent("All event link");
	}
	
	//method to click on all event link and verify logbook element
	public void clickAllEventLink(){
		getOtriosHomepageLastsyncwithmeterLbl().waitForPresent();
		getOtriosHomepageLastsyncwithmeterViewalleventLnk().click();

	}
	//Method to get Blood Glucose count on last sync screen before adding a new manual BG
	//Milan
	public void CheckBGCountLastSync() {
		
		String count=getOtriosHomepageLastsyncwithmeterTotalreadingLbl().getAttribute("label").replaceAll("[^0-9]", "");
		ConfigurationManager.getBundle().setProperty("Lastsync.BG.Count", count);
		Reporter.logWithScreenShot("Last Sync BG count"+count, MessageTypes.Pass);
	}
	//Method to verify detail BG pop up from circle  view
	//Milan
	public void verifyPeriodRusultPage(){
		getOtriosHomepageLastreadingdetail30dayBtn().waitForPresent();
		Point p1=getOtriosHomepageLastreadingRecentbgunitLbl().getLocation();
		int yunit=p1.getY();
		
		Point p2=getOtriosHomepageLastreadingdetail30dayBtn().getLocation();
		Dimension d2 =getOtriosHomepageLastreadingdetail30dayBtn().getSize();
		int x30Day=p2.getX();
		int y30Day=p2.getY();
		int xmidddle30Day=x30Day+d2.getWidth()/2;
		int yMiddleDonat=(yunit+y30Day)/2;
		
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		jnj.getDriver().tap(1, xmidddle30Day,yMiddleDonat, 100);
		
		WebDriverTestCase.verifyTrue(getOtriosHomepageLastreadingRecentBGPopup().isPresent(),
				 "Period result page not displayed ", "Period result page displayed" );
		
	}
	//Method to verify date range
	public void verifyPeriodDayViews(){
		getOtriosHomepageLastreadingRecentBGDateRangePopup().waitForPresent();
		
		
		int todaydate=Integer.parseInt(JNJUtilsIOS.getCurrentDate());
		String currMonth=JNJUtilsIOS.getCurrentMonth().substring(0, 3);
		int currentMonth=Integer.parseInt(JNJUtilsIOS.monthIntValue(currMonth));

		int previoueMonth=0;
		if(currentMonth==1)
			previoueMonth=12;
		else
			previoueMonth=currentMonth-1;
		

		String prevMonth=JNJUtilsIOS.monthIntValue(previoueMonth+"");
		int lastdayPreviousMonth=Integer.parseInt(JNJUtilsIOS.monthNoOFDay(prevMonth).replaceAll("[^0-9]", ""));
		
		//14 day
		click14_30_90Day("14 DAYS");
		String dateRange=getOtriosHomepageLastreadingRecentBGDateRangePopup().getAttribute("label");
		String Date[]=(dateRange.split("-"));
		if (todaydate<14)
		{
			int extraday=14-todaydate;
			
			int calstartDay=lastdayPreviousMonth-extraday+1;
			String date1 =""+calstartDay;
			WebDriverTestCase.verifyTrue(Date[0].contains(date1),
					 "Expected "+date1+"   Actual "+Date[0], "Starting date displayed"+date1 );
			//commenting out today verification
/*			WebDriverTestCase.verifyTrue(Date[1].contains(ConfigurationManager.getBundle().getString("appCommon.today")),
					 "Expected "+ConfigurationManager.getBundle().getString("appCommon.today")+"   Actual "+Date[1], "Today displayed");
*/			
		}
		else{
			int calstartDay=todaydate-14+1;
			String date1 =""+calstartDay;
			WebDriverTestCase.verifyTrue(Date[0].contains(date1),
					 "Expected "+date1+"   Actual "+Date[0], "Starting date displayed"+date1 );
			
			
			
		}
		
		//30 day
		click14_30_90Day("30 DAYS");
		 dateRange=getOtriosHomepageLastreadingRecentBGDateRangePopup().getAttribute("label");
		 String Date1[]=(dateRange.split("-"));
		if (todaydate<30)
		{
			int extraday=30-todaydate;
			int calstartDay=lastdayPreviousMonth-extraday+1;
			String date1 =""+calstartDay;
			WebDriverTestCase.verifyTrue(Date1[0].contains(date1),
					 "Expected "+date1+"   Actual "+Date1[0], "Starting date displayed"+date1 );
			
			
		}
		else{
			int calstartDay=todaydate-30+1;
			String date1 =""+calstartDay;
			WebDriverTestCase.verifyTrue(Date1[0].contains(date1),
					 "Expected "+date1+"   Actual "+Date1[0], "Starting date displayed"+date1 );
			
		}
		
		//90 day
		click14_30_90Day("90 DAYS");
		dateRange=getOtriosHomepageLastreadingRecentBGDateRangePopup().getAttribute("label");
		 String Date2[]=(dateRange.split("-"));
		int previousMonth1=0;
		if(previoueMonth==1)
			previousMonth1=12;
		else
			previousMonth1=previoueMonth-1;
		String prevMonth1=JNJUtilsIOS.monthIntValue(previousMonth1+"");
		int lastdayMonth1=Integer.parseInt(JNJUtilsIOS.monthNoOFDay(prevMonth1));
		int totalDay=todaydate+lastdayPreviousMonth+lastdayMonth1;
		if(totalDay<90){
			int remainingDay=90-totalDay;
			int previousMonth2=0;
			if(previousMonth1==1)
				previousMonth2=12;
			else
				previousMonth2=previousMonth1-1;
			
			String prevMonth2=JNJUtilsIOS.monthIntValue(previousMonth2+"");
			int lastdayMonth2=Integer.parseInt(JNJUtilsIOS.monthNoOFDay(prevMonth2));
			
			int calstartDay=lastdayMonth2-remainingDay+1;
			String date1 =""+calstartDay;
			WebDriverTestCase.verifyTrue(Date2[0].contains(date1),
					 "Expected "+date1+"   Actual "+Date2[0], "Starting date displayed"+date1 );
			
		}
		else{
			
			int calstartDay=totalDay-90+1;
			String date1 =""+calstartDay;
			WebDriverTestCase.verifyTrue(Date2[0].contains(date1),
					 "Expected "+date1+"   Actual "+Date2[0], "Starting date displayed"+date1 );
			
		}

	}
	//Method to verify welcome article on home page for new user
	//Milan
	public void verifyWelcomeArticle() {
		getOtriosHomepageShareBtn().waitForPresent();
		/*getOtriosHomepageReadarticleLnk().verifyPresent("Read article link");
		getOtriosHomepageReadarticleLnk().click();*/
		Reporter.logWithScreenShot("Article page1",MessageTypes.Pass);
		JNJUtilsIOS.swipeWithCoordinates(400, 1000, 400, 700, 100);
		getOtriosHomepageAddedEventDynamicLbl("Back");
		Reporter.logWithScreenShot("Article page2",MessageTypes.Pass);
	}
	//Method to verify last reading screen
	//Milan
	public void verifyAllLastReadignWithNoRreading() {
		click14_30_90Day("14 DAYS");
		getOtriosHomepageAddedEventDynamicLbl("---").verifyPresent("NAN 14 day view");
		getOtriosHomepageLastReadingNoavarageLbl().verifyPresent("No avarage label on 14 day view screen");
		click14_30_90Day("30 DAYS");
		getOtriosHomepageAddedEventDynamicLbl("---").verifyPresent("NAN 30 day view");
		getOtriosHomepageLastReadingNoavarageLbl().verifyPresent("No avarage label on 14 day view screen");
		click14_30_90Day("90 DAYS");
		getOtriosHomepageAddedEventDynamicLbl("---").verifyPresent("NAN 90 day view");
		getOtriosHomepageLastReadingNoavarageLbl().verifyPresent("No avarage label on 14 day view screen");
	}
	//Method to click on readings on last reading scre
	//Milan
	public void clickReadingButtonLastreadingPage(){
		getOtriosHomepageLastreadingdetailReadingsleftTxt().waitForPresent();
		getOtriosHomepageLastreadingdetailReadingsleftTxt().click();
	}
	//Method to verify recent added glucose reading lastreading screen
	//Milan
	public void verifyReccentAddedGlucoseLastReading(Object eventDetail){
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {
			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		getOtriosHomepageAddedEventDynamicLbl(eventBean.getAmount()).verifyPresent("Added Manual Glucose "+eventBean.getAmount());
	}
	//Method to click on added glucose last reading screen
	//Milan
	public void clickReccentAddedGlucoseLastReading(Object eventDetail){
		EventDetailBeans eventBean = new EventDetailBeans();
		eventBean.fillData(eventDetail);
		
		getOtriosHomepageAddedEventDynamicLbl(eventBean.getAmount()).click();
	}
	
	public void verifyDeletedBGAfterDeletion(Object eventDetail){
		EventDetailBeans eventBean = new EventDetailBeans();
		eventBean.fillData(eventDetail);
		getOtriosHomepageAddedEventDynamicLbl(eventBean.getAmount()).verifyNotPresent("Added BG deleted successfuly");
	}
	
	
	public void verifyPeriodBgResultPopUpValue(){

		Point p1=getOtriosHomepageLastreadingRecentbgunitLbl().getLocation();
		int yunit=p1.getY();
		
		Point p2=getOtriosHomepageLastreadingdetail30dayBtn().getLocation();
		Dimension d2 =getOtriosHomepageLastreadingdetail30dayBtn().getSize();
		int x30Day=p2.getX();
		int y30Day=p2.getY();
		int xmidddle30Day=x30Day+d2.getWidth()/2;
		int yMiddleDonat=(yunit+y30Day)/2;
		
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		jnj.getDriver().tap(1, xmidddle30Day,yMiddleDonat, 100);
		try{
			
			getOtriosHomepageLastreadingbeforemealPopupLogo().isPresent();
			Reporter.logWithScreenShot("Full apple Not present",MessageTypes.Pass);
			getOtriosHomepageLastreadingaftermealPopupLogo().isPresent();
			Reporter.logWithScreenShot("Apple logo not present",MessageTypes.Pass);
		}
		catch(Exception e){
			Reporter.logWithScreenShot("Period Bg Result PopUp Value",MessageTypes.Fail);	
		}
	
	}


	public void deleteAllEvents() {
		int count=0;
		int count1=0;
		try{
			int cons = getOotriosHomepageAddedEventValueLbl().size();
			for (int i = 0; i < getOotriosHomepageAddedEventValueLbl().size(); i++) {
				if (JNJUtilsAndroid.tryDisplayMethod(getOotriosHomepageAddedEventValueLbl().get(i))) {
					getOotriosHomepageAddedEventValueLbl().get(i).click();
					LogbookPageIOS logbook = new LogbookPageIOS();
					logbook.verifydeleteEvent();
					cons--;
				}
				count1++;
				if (count == cons||count1==10)
					break;
			}
		}catch(Exception e){
		}
	
	}
	
	//Method to click on donat circle
	//Milan
	public void clickOnDonatCircle()
	{
		Point p1=getOtriosHomepageLastreadingRecentbgunitLbl().getLocation();
		int yunit=p1.getY();
		
		Point p2=getOtriosHomepageLastreadingdetail30dayBtn().getLocation();
		Dimension d2 =getOtriosHomepageLastreadingdetail30dayBtn().getSize();
		int x30Day=p2.getX();
		int y30Day=p2.getY();
		int xmidddle30Day=x30Day+d2.getWidth()/2;
		int yMiddleDonat=(yunit+y30Day)/2;
		
		JNJUtilsIOS jnj=new JNJUtilsIOS();
		jnj.getDriver().tap(1, xmidddle30Day,yMiddleDonat, 100);
	}
	//Method to verify period result pop up range 
	//Milan
	public void verifyOverallRangeonDonutPopUp(){
		clickOnDonatCircle();
		String lowRange=ConfigurationManager.getBundle().getProperty("Low.BG.Range.Value").toString();
		String highRange=ConfigurationManager.getBundle().getProperty("Low.BG.Range.Value").toString();
		
		WebDriverTestCase.verifyTrue(getOtriosHomepageLastreadingDonatOverallrangeLbl().getAttribute("label").contains(lowRange),
				 "Incorrenct low range ", "Correcct low range");
		WebDriverTestCase.verifyTrue(getOtriosHomepageLastreadingDonatOverallrangeLbl().getAttribute("label").contains(highRange),
				 "Incorrenct high range ", "Correcct high range");
	}
	//Methid to verify range for before and after meal on donut pop up
	//Milan
	public void verifyAMBMDonutRange(){
		clickOnDonatCircle();
		String bmLowRange=ConfigurationManager.getBundle().getProperty("BM.BG.Low").toString();
		String bmHighRange=ConfigurationManager.getBundle().getProperty("BM.BG.High").toString();
		
		WebDriverTestCase.verifyTrue(getOtriosHomepageLastreadingDonatBeforerangeLbl().getAttribute("label").contains(bmLowRange),
				 "Expected "+bmLowRange+"  Actual "+getOtriosHomepageLastreadingDonatBeforerangeLbl().getAttribute("label"), "Correcct before meal low range");
		WebDriverTestCase.verifyTrue(getOtriosHomepageLastreadingDonatBeforerangeLbl().getAttribute("label").contains(bmHighRange),
				"Expected "+bmHighRange+"  Actual "+getOtriosHomepageLastreadingDonatBeforerangeLbl().getAttribute("label"), "Correcct before meal high range");
		
		String amLowRange=ConfigurationManager.getBundle().getProperty("AM.BG.Low").toString();
		String amHighRange=ConfigurationManager.getBundle().getProperty("AM.BG.High").toString();
		
		WebDriverTestCase.verifyTrue(getOtriosHomepageLastreadingDonatAfterrangeLbl().getAttribute("label").contains(amLowRange),
				"Expected "+amLowRange+"  Actual "+getOtriosHomepageLastreadingDonatAfterrangeLbl().getAttribute("label"), "Correcct after meal low range");
		WebDriverTestCase.verifyTrue(getOtriosHomepageLastreadingDonatAfterrangeLbl().getAttribute("label").contains(amHighRange),
				"Expected "+amHighRange+"  Actual "+getOtriosHomepageLastreadingDonatAfterrangeLbl().getAttribute("label"), "Correcct after meal high range");
	}
	//Take screen shot
	//Milan
	public void screenShotTake(){
		Reporter.logWithScreenShot("Connection page is displayed", MessageTypes.Pass);
	}


	public void countForBeforeAfterMeal() {
		clickOnDonatCircle();
		Validator.verifyThat("Before Meal count", (getOtriosHomepageLastreadingDonatBeforemealcountLbl().getText()),
				Matchers.equalTo("1"));
		Validator.verifyThat("After Meal count", (getOtriosHomepageLastreadingDonatAftermealcountLbl().getText()),
				Matchers.equalTo("1"));
		Validator.verifyThat("No Meal Tag count", (getOtriosHomepageLastreadingDonatNotagmealcountLbl().getText()),
				Matchers.equalTo("1"));
		
	}
	
	//Method to verify added bg displayed in correct period
	public void verifyBGDisplayedCorrectPeriod(){
		Point p=getOtriosHomepageLastreadingReadingsInrangeLbl().getLocation();
		int count=0;
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		while (!getOtriosHomepageAddedEventDynamicLbl(randomNumberGlucose).isPresent()) {
			JNJUtilsAndroid.swipeWithCoordinates(p.getX()+100, p.getY()+500, p.getX()+100, p.getY()+60, 100);
			JNJUtilsAndroid.waitforLoad();
			count++;
			if (count == 80)
				break;
		}
		getOtriosHomepageAddedEventDynamicLbl(randomNumberGlucose).verifyPresent("Added Glucose");
		LogbookPageIOS logbook = new LogbookPageIOS();
		logbook.getOtriosLogbookpageGlucoseDropImg().waitForPresent();
		for(int i=0;i<getOtriosHomepageLastreadingReadingsValueTxt().size();i++){
			if(getOtriosHomepageLastreadingReadingsValueTxt().get(i).getAttribute("value").equals(randomNumberGlucose)){
				logbook.getOtriosLogbookpageGlucoseDropImgList().get(i).click();
				for(int j=0;j<logbook.getOtriosLogbookPageEditEventDeleteBtnList().size();j++){
					if(JNJUtilsIOS.tryMethod(logbook.getOtriosLogbookPageEditEventDeleteBtnList().get(j))){
						logbook.getOtriosLogbookPageEditEventDeleteBtnList().get(j).click();
						if(logbook.getOtriosLogbookPageOkBtn().isPresent())
							logbook.getOtriosLogbookPageOkBtn().click();
						Reporter.logWithScreenShot("After clicking deleteing glucose", MessageTypes.Pass);
						break;
					}
				}
				break;
				
			}
		}
	}
	
	//Method to verify edited BG above 90day should not display in 90 range
	//Milan
	public void verifyBGNotDisplayedNintyRange(){
		String randomNumberGlucose = ConfigurationManager.getBundle().getProperty("classic.glucose").toString();
		getOtriosHomepageAddedEventDynamicLbl(randomNumberGlucose).verifyNotVisible("Edited BG date out of 90 day range");
	}


	public void verifyDeletedBGReading(Object eventDetail) {
	
        EventDetailBeans eventBean = new EventDetailBeans();
		eventBean.fillData(eventDetail);
		getOtriosHomepageAddedEventDynamicLbl(eventBean.getAmount()).verifyNotPresent("Deleted glucose");
	   
	
	}

	// Method to verify deleted glucose on Home screen
	// Sangram
	String selectedDateOnLogbookpage;

	public void verifyDeletedBGOnHomepage() {
		LogbookPageIOS logbookPaIos = new LogbookPageIOS();
		String addedEventDateOnHomepage = getOtriosHomepageRecentAddedReadingTxt().getAttribute("label");
		if ((addedEventDateOnHomepage.equalsIgnoreCase(logbookPaIos.dateLabelOnLogbook1))) {
			Reporter.logWithScreenShot("Event value present on home screen", MessageTypes.Fail);
		} else if (addedEventDateOnHomepage.contains("---")) {
			Reporter.logWithScreenShot("Event deleted and no other record is present", MessageTypes.Pass);
		} else {
			Reporter.logWithScreenShot("Event deleted successfully", MessageTypes.Pass);
		}
	}
	
	// Sangram
	
	public void verifyReadingsPerDay() {
		getotriosHomepageReadingsPerDayTxt().waitForPresent();
		if(getotriosHomepageReadingsPerDayTxt().getAttribute("label").contains("0.")){
			Reporter.logWithScreenShot("Readings per day has value in decimal", MessageTypes.Pass);
		}
		else {
			Reporter.logWithScreenShot("Readings per day is missing", MessageTypes.Fail);
		}
		String readingPerDay[]=getotriosHomepageReadingsPerDayTxt().getAttribute("label").split(".");
		if(readingPerDay[1].length()==1){
			Reporter.logWithScreenShot("Displaying as per length", MessageTypes.Pass);
		}
		else {
			Reporter.logWithScreenShot("Not displaying as per length", MessageTypes.Fail);
		}
	}


	public void lastSyncAddedEvent(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		
		WebDriverTestCase.verifyTrue(getOtriosHomepageRecenteventvalueLbl().getAttribute("label").contains(eventBean.getAmount()),
				eventBean.getAmount() + "Expected amount not present", "Proper amount  " + eventBean.getAmount());
		
	}


	public void lastSyncDeletedEvent(Object eventDetail) {
		EventDetailBeans eventBean = new EventDetailBeans();
		if (eventDetail instanceof String) {

			eventBean.fillFromConfig((String) eventDetail);
		} else {
			eventBean.fillData(eventDetail);
		}
		
		WebDriverTestCase.verifyTrue(!getOtriosHomepageRecenteventvalueLbl().getAttribute("label").contains(eventBean.getAmount()),
				eventBean.getAmount() + "Expected amount not present", "Proper amount  " + eventBean.getAmount());
	}
	//Method to verify today and yesterday label on home page
	//Milan
	public void verifyTodayLastdayLebel() {
		
		String glucose1 = ConfigurationManager.getBundle().getProperty("random.glucose1").toString();
		if (getOtriosHomepageAddedEventDynamicLbl(JNJUtilsIOS.getPropString("appCommon.today"))
				.getAttribute("visible").equalsIgnoreCase("false")) {
			Point p1 = getOtriosHomepageLogbookBtn().getLocation();
			int count = 0;

			while (!(getOtriosHomepageAddedEventDynamicAmountText(glucose1).getAttribute("visible")
					.equalsIgnoreCase("true"))) {
				JNJUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY() + 500, p1.getX(), p1.getY(), 100);
				JNJUtilsIOS.pause(500);
				count++;
				if (count == 10)
					break;
				System.out.println(count);
			}
		}

		WebDriverTestCase.verifyTrue(
				getOtriosHomepageAddedEventDynamicLbl(JNJUtilsIOS.getPropString("appCommon.today")).isPresent(),
				"Today label not present", "Today label is present");
		
		WebDriverTestCase.verifyTrue(getOtriosHomepageAddedEventDynamicAmountText(glucose1).isPresent(),
				glucose1 + "Expected amount not present", "Proper amount  " + glucose1);

		String glucose2 = ConfigurationManager.getBundle().getProperty("random.glucose2").toString();
		if (getOtriosHomepageAddedEventDynamicLbl(JNJUtilsIOS.getPropString("appCommon.yesterday"))
				.getAttribute("visible").equalsIgnoreCase("false")) {
			Point p1 = getOtriosHomepageLogbookBtn().getLocation();
			int count = 0;

			while (!(getOtriosHomepageAddedEventDynamicAmountText(glucose2).getAttribute("visible")
					.equalsIgnoreCase("true"))) {
				JNJUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY() + 500, p1.getX(), p1.getY(), 100);
				JNJUtilsIOS.pause(500);
				count++;
				if (count == 10)
					break;
				System.out.println(count);
			}
		}

		WebDriverTestCase.verifyTrue(
				getOtriosHomepageAddedEventDynamicLbl(JNJUtilsIOS.getPropString("appCommon.yesterday"))
						.isPresent(),
				"Yesterday label not present", "Yesterday label is present");
		WebDriverTestCase.verifyTrue(getOtriosHomepageAddedEventDynamicAmountText(glucose2).isPresent(),
				glucose2 + "Expected amount not present", "Proper amount  " + glucose2);

	}
	//Method to click on article close icon and remove the article
	//Milan
	public void verifyCloseArticle(){
		getOtriosHomepageHomeBtn().waitForPresent();
	
		if (!getOtriosHomepageArticleCloseBtn().isPresent()) {
			Point p1 = getOtriosHomepageLogbookBtn().getLocation();
			int count = 0;

			while (!(getOtriosHomepageArticleCloseBtn().isPresent())) {
				JNJUtilsIOS.swipeWithCoordinates(p1.getX(), p1.getY() + 500, p1.getX(), p1.getY(), 100);
				JNJUtilsIOS.pause(500);
				count++;
				if (count == 10)
					break;
				System.out.println(count);
			}
			
		}
		getOtriosHomepageArticleCloseBtn().verifyVisible("Article");
		getOtriosHomepageArticleCloseBtn().click();
		JNJUtilsIOS.pause(2000);
		getOtriosHomepageArticleOkBtn().click();
		WebDriverTestCase.verifyTrue(!(getOtriosHomepageArticleCloseBtn().isPresent()),
				"article is present", "Article is removed" );
		
	}
		


}
