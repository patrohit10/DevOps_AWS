package com.lemonade.version3.android.steps;

import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.version3.android.pages.HomePageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class HomepageSteps {
	HomePageAndroid homePageAndroid = new HomePageAndroid();

	@QAFTestStep(description = "user verify tab bar when redirects to homepage")
	public void verifyTabBars() {

		homePageAndroid.verifyTabs();
	}

	@QAFTestStep(description = "user clicks on Logbook tab")
	public void clickLogbook() {
		homePageAndroid.clickOnLogbook();
	}

	@QAFTestStep(description = "user redirects to logbook page")
	public void verifyLogbookPage() {
		homePageAndroid.verifyLogbook();
	}

	@QAFTestStep(description = "user clicks on connections tab")
	public void clickConnection() {
		homePageAndroid.clickOnConnections();
	}

	@QAFTestStep(description = "user redirects to connections page")
	public void verifyConnectionsPage() {
		homePageAndroid.verifyConnections();
	}

	@QAFTestStep(description = "user clicks on Home tab")
	public void clickHomePage() {
		homePageAndroid.clickOnHome();
	}

	@QAFTestStep(description = "user redirects to Home page")
	public void verifyHomePage() {
		homePageAndroid.verifyHome();
	}

	@QAFTestStep(description = "user click on more menu")
	public void clickMore() {
		homePageAndroid.clickMoreMenu();
	}

	@QAFTestStep(description = "user click back button")
	public void clickBack() {
		JNJUtilsAndroid.clickBackButton();
	}

	@QAFTestStep(description = "user verify navigation bar on homescreen")
	public void verifynav() {
		homePageAndroid.verifyNavigationBar();
	}

	@QAFTestStep(description = "user click on share button")
	public void clickShare() {
		homePageAndroid.clickOnShareBtn();
	}

	@QAFTestStep(description = "user click on added event {0} on home screen")
	public void clicksOnAddedEventHomeScreen(String data) {
		homePageAndroid.clickOnaddEvent(data);
	}

	@QAFTestStep(description = "user verrify added event {0} on home screen")
	public void verifyAddedEventHomeScreen(Object eventDetail) {
		homePageAndroid.verifyAddedEventHomeScreen(eventDetail);
	}

	@QAFTestStep(description = "user verrify event {0} is deleted on home screen")
	public void verifyDeleteEventHomeScreen(Object eventDetail) {
		homePageAndroid.verifyEventDeleted(eventDetail);
	}

	@QAFTestStep(description = "user verifies the homepage with no events")
	public void homepageNoEvents() {
		homePageAndroid.homePageNoEvents();
	}

	@QAFTestStep(description = "user clicks Add an Event")
	public void homepageAddEvent() {
		homePageAndroid.homepageAddEvent();
	}

	@QAFTestStep(description = "user clicks on Last Readings Summary tab")
	public void clickLastReading() {
		homePageAndroid.clickLastReading();
	}

	@QAFTestStep(description = "user redirects to Last Readings Summary page")
	public void verifyLastReadingPage() {
		homePageAndroid.verifyLastreading();
	}

	@QAFTestStep(description = "user verifies Last Readings Summary page")
	public void verifyLastreadingSummaryPage() {
		homePageAndroid.verifyLastReadingSummary();
	}

	@QAFTestStep(description = "user clicks and verify 14, 30, and 90 Day views")
	public void verifyViews() {
		homePageAndroid.verifyDayViewsOfLogbook();
	}

	@QAFTestStep(description = "user clears homepage events")
	public void clearHomeEvents() {
		homePageAndroid.deleteEvents();
	}

	@QAFTestStep(description = "user clicks on last sync reading tab")
	public void clickLastSync() {
		homePageAndroid.clickLastSyncButton();
	}

	@QAFTestStep(description = "user clicks on All events link")
	public void clickAllEvents() {
		homePageAndroid.clickAllEventsLinkn();
	}

	@QAFTestStep(description = "user verify all events")
	public void verifyAllEvent() {
		homePageAndroid.verifyAllEventScreen();
	}

	@QAFTestStep(description = "user verify recent added BG on last sync tab using {0}")
	public void verifyRecentEventTab(Object eventDetails) {
		homePageAndroid.verifyRecentEventDetails(eventDetails);
	}

	@QAFTestStep(description = "user verifies last meter sync screen")
	public void verifyLastMeterSync() {
		homePageAndroid.verifyLastSyncScreen();
	}

	@QAFTestStep(description = "user verifies no of count after adding manual BG")
	public void verifyNoOfReading() {
		homePageAndroid.verifyNoOFMeterReadingSame();
	}

	@QAFTestStep(description = "user check total BG count on last sync screen")
	public void CheckBGCountLastSyncScreen() {
		homePageAndroid.CheckBGCountLastSync();
	}

	@QAFTestStep(description = "user click on {0} over view tab")
	public void clickOnOverviewScreen(String tab) {
		homePageAndroid.click14_30_90Day(tab);
	}

	@QAFTestStep(description = "user verify BG period result popup")
	public void verifyPeriodResultPopUp() {
		homePageAndroid.verifyPeriodRusultPage();
	}

	@QAFTestStep(description = "user verify welcome article on home screen for new user")
	public void verifyWelcomePage() {
		homePageAndroid.verifyNewUserWelcomePage();
	}

	@QAFTestStep(description = "user click back button")
	public void clickBackBtn() {
		JNJUtilsAndroid.clickBackButton();
	}

	@QAFTestStep(description = "user clicks on Patterns tab")
	public void clickPatterns() {
		homePageAndroid.clickPatterns();
	}

	@QAFTestStep(description = "user verify 14, 30, and 90 Day views for no event data")
	public void verifyLastReadingWithNoReadingData() {
		homePageAndroid.verifyAllLastReadignWithNoRreading();

	}

	@QAFTestStep(description = "user click on reading button on lastreading screen")
	public void clicksReadingButtonLastreadingPage() {
		homePageAndroid.clickReadingButtonLastreadingPage();
	}

	@QAFTestStep(description = "user verify manually added glucose last reading screen using {0}")
	public void verifiesReccentAddedGlucoseLastReading(Object event) {
		homePageAndroid.verifyReccentAddedGlucoseLastReading(event);
	}

	@QAFTestStep(description = "user verify period result popup value")
	public void verifyPeriodResultPopUpValue() {
		homePageAndroid.verifyPeriodBgResultPopUpValue();
	}

	@QAFTestStep(description = "user click on added glucose last reading screen using {0}")
	public void clicksReccentAddedGlucoseLastReading(Object event) {
		homePageAndroid.clickReccentAddedGlucoseLastReading(event);
	}

	@QAFTestStep(description = "user verify before and after meal range on donut pop up")
	public void bmamRangeOnDonutPopUp() {
		homePageAndroid.verifyAMBMDonutRange();
	}

	@QAFTestStep(description = "take screenshot of the page")
	public void screenShotOFPage() {
		homePageAndroid.screenShotTake();
	}

	@QAFTestStep(description = "user verify over all range on donut pop up")
	public void overallRangeOnDonutPopUp() {
		homePageAndroid.verifyOverallRangeonDonutPopUp();
	}

	@QAFTestStep(description = "user verify BG count for notag before and after meal")
	public void beforeAfterMealCount() {
		homePageAndroid.countForBeforeAfterMeal();
	}

	@QAFTestStep(description = "user verify BG present in correct period")
	public void verifiesBGDisplayedCorrectPeriod() {
		homePageAndroid.verifyBGDisplayedCorrectPeriod();
	}

	@QAFTestStep(description = "user verify out of range BG not present on readings page")
	public void outOfRangeBGNotPresent() {
		homePageAndroid.verifyBGNotDisplayedNintyRange();
	}

	@QAFTestStep(description = "user verify deleted glucose on home screen")
	public void verifyDeletedBGOnHomepage() {
		homePageAndroid.verifyDeletedBGOnHomepage();
	}

	@QAFTestStep(description = "user verify average reading units")
	public void verifyUnitsOfAverageReading() {
		homePageAndroid.verifyAverageUnits();
	}

	@QAFTestStep(description = "user verify added event {0} on last sync with meter page")
	public void lastSyncAddedEventVerification(Object option) {
		homePageAndroid.lastSyncAddedEvent(option);
	}

	@QAFTestStep(description = "user verify deleted event {0} on last sync with meter page")
	public void lastSyncDeletedEventVerification(Object option) {
		homePageAndroid.lastSyncDeletedEvent(option);
	}

	@QAFTestStep(description = "user click on new added event {0} on home screen")
	public void clicksOnHiddenAddedEventHomeScreen(String data) {
		homePageAndroid.clickNewBGHomeScreen(data);
	}

	@QAFTestStep(description = "user verify welcome article on homepage")
	public void verifyArticle() {
		homePageAndroid.verifyWelcomeArticle();
	}

	@QAFTestStep(description = "user delete the article from homepage")
	public void deleteArticle() {
		homePageAndroid.deleteWelcomeArticle();
	}

	@QAFTestStep(description = "user verify today and yesterday added eventicon home screen")
	public void verifyEventDay() {
		homePageAndroid.verifyTodayYesterdayEvent();
	}
}
