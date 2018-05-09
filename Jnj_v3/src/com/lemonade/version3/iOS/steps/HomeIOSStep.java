package com.lemonade.version3.iOS.steps;

import com.lemonade.version3.iOS.pages.HomePageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class HomeIOSStep {

	HomePageIOS homePage = new HomePageIOS();


	@QAFTestStep(description = "user click on more menu")
	public void clicksOnMoreMenu() {
		homePage.clickOnMoreMenuIcon();
	}
	@QAFTestStep(description = "user verify navigation bar on homescreen")
	public void verifynav() {
		homePage.verifynavigationBar();
	}

	@QAFTestStep(description = "user click on share button")
	public void clicksOnShareIcon() {
		homePage.clickOnShareIcon();
	}

	@QAFTestStep(description = "user clicks on logbook tab")
	public void clicksOnLogbookIcon() {
		homePage.clickOnLogbookIcon();
	}
	
	@QAFTestStep(description="user click on added event {0} on home screen")
	public void clicksOnAddedEventHomeScreen(String data){
		homePage.clickOnaddEvent(data);
	}
	
	
	@QAFTestStep(description="user verrify added event {0} on home screen")
	public void verifyAddedEventHomeScreen(Object eventDetail){
		homePage.verifyAddedEventHomeScreen(eventDetail);
	}
	@QAFTestStep(description="user verrify event {0} is deleted on home screen")
	public void verifyDeleteEventHomeScreen(Object eventDetail){
		homePage.verifyEventDeleted(eventDetail);
	}
	@QAFTestStep(description="user clicks on Home tab")
	public void clickHomePage(){
		homePage.clickOnHome();
	}

	@QAFTestStep(description = "user redirects to logbook page")
	public void verifyLogbookPage() {
		homePage.verifyLogbook();
	}
	@QAFTestStep(description="user clicks on connections tab")
	public void clicksOnConnectionTab(){
		homePage.clickConnectionIcon();
	}
	@QAFTestStep(description="user redirects to connections page")
	public void verifyConnectionPage(){
		homePage.verifyConnection();
	}
	@QAFTestStep(description="user redirects to Home page")
	public void verifyHomePage(){
		homePage.verifyHome();
	}
	
	@QAFTestStep(description="user clicks Add an Event")
	public void homepageAddEvent() {
		homePage.homepageAddEvent();
	}
	
	@QAFTestStep(description = "user verifies the homepage with no events")
	public void homepageNoEvents() {
		homePage.homePageNoEvents();
	}
	
	@QAFTestStep(description = "user verify tab bar when redirects to homepage")
	public void verifyTabBars() {

		homePage.verifyTabs();
	}
	@QAFTestStep(description = "user clicks on Last Reading tab")
	public void clickLastReading() {
		homePage.clickLastReadingDetail();
	}

	@QAFTestStep(description = "user clicks on Patterns tab")
	public void clickPatterns() {
		homePage.clickPatterns();
	}
	@QAFTestStep(description = "user redirects to Patterns page")
	public void verifyPatternsPage() {
		homePage.verifyPatternsPage();
	}
	@QAFTestStep(description = "user clicks on Last Readings Summary tab")
	public void clickLastReadingsSummary() {
		homePage.clickLastReadingSummaryButton();
	}
	@QAFTestStep(description = "user redirects to Last Readings Summary page")
	public void verifyLastReadingsSummaryPage() {
		homePage.verifyLastReadingsSummaryPage();
	}
	@QAFTestStep(description = "user verifies Last Readings Summary page")
	public void verifyUILastReadingsSummaryPage() {
		homePage.verifyLastReadingsSummaryPageUI();
	}
	@QAFTestStep(description = "user clicks and verify 14, 30, and 90 Day views")
		public void clickAndVerifyDayRangeViews() {
		homePage.verifyPeriodDayViews();
		
	}
	@QAFTestStep(description = "user verifies last meter sync screen")
	public void verifyLastMeterSync() {
		homePage.verifyLastSyncScreen();
	}
	@QAFTestStep(description = "user verifies no of count after adding manual BG")
	public void verifyNoOfReading() {
		homePage.verifyNoOFMeterReadingSame();
	}
	@QAFTestStep(description = "user clicks on last sync reading tab")
	public void clickOnRecentEvent() {
		homePage.clickOnRecentEventBtn();
	}
	@QAFTestStep(description = "user clicks on All events link")
	public void clickOnAllEventLink() {
		homePage.clickAllEventLink();
	}
	@QAFTestStep(description = "user verify 14, 30, and 90 Day views for no event data")
	public void verifyLastReadingWithNoReadingData() {
	homePage.verifyAllLastReadignWithNoRreading();
	
}
	
	@QAFTestStep(description = "user verify recent added BG on last sync tab using {0}")
	public void verifyRecentEventTab(Object eventDetails) {
		homePage.verifyRecentEventDetails(eventDetails);
	}
	
	@QAFTestStep(description = "user check total BG count on last sync screen")
	public void checkBGCountLastSyncScreen() {
		homePage.CheckBGCountLastSync();
	}
	@QAFTestStep(description = "user click on {0} over view tab")
	public void clickOnOverviewScreen(String tab) {
		homePage.click14_30_90Day(tab);
	}
	@QAFTestStep(description = "user verify BG period result popup")
	public void verifyPeriodResultPopUp() {
		homePage.verifyPeriodRusultPage();
	}
	@QAFTestStep(description = "user verify welcome article on home screen for new user")
	public void verifyWelcomeArticle() {
		homePage.verifyWelcomeArticle();
	}
	
	@QAFTestStep(description = "user click on reading button on lastreading screen")
	public void clicksReadingButtonLastreadingPage() {
		homePage.clickReadingButtonLastreadingPage();
	}
	@QAFTestStep(description = "user verify manually added glucose last reading screen using {0}")
	public void verifiesReccentAddedGlucoseLastReading(Object event) {
		homePage.verifyReccentAddedGlucoseLastReading(event);
	}
	@QAFTestStep(description = "user click on added glucose last reading screen using {0}")
	public void clicksReccentAddedGlucoseLastReading(Object event) {
		homePage.clickReccentAddedGlucoseLastReading(event);
	}
	@QAFTestStep(description="user verify added BG get deleted using {0}")
	public void verifyAddedBGDeleted(Object event) {
		homePage.verifyDeletedBGAfterDeletion(event);
	}
	@QAFTestStep(description = "user verify period result popup value")
	public void verifyPeriodResultPopUpValue() {
		homePage.verifyPeriodBgResultPopUpValue();
	}
	@QAFTestStep(description = "user verify BG period result popup value")
	public void verifyPeriodBgResultPopUpValue() {
		homePage.verifyPeriodBgResultPopUpValue();
	}
	@QAFTestStep(description="user clears homepage events")
	public void clearHomeEvents(){
		homePage.deleteAllEvents();
	}
	@QAFTestStep(description="user verify over all range on donut pop up")
	public void overallRangeOnDonutPopUp(){
		homePage.verifyOverallRangeonDonutPopUp();
	}
	@QAFTestStep(description="user verify before and after meal range on donut pop up")
	public void bmamRangeOnDonutPopUp(){
		homePage.verifyAMBMDonutRange();
	}
	@QAFTestStep(description="take screenshot of the page")
	public void screenShotOFPage(){
		homePage.screenShotTake();
	}
	@QAFTestStep(description="user verify BG count for notag before and after meal")
	public void beforeAfterMealCount(){
		homePage.countForBeforeAfterMeal();
	}
	@QAFTestStep(description="user verify BG present in correct period")
	public void verifiesBGDisplayedCorrectPeriod(){
		homePage.verifyBGDisplayedCorrectPeriod();
	}
	@QAFTestStep(description="user verify out of range BG not present on readings page")
	public void outOfRangeBGNotPresent(){
		homePage.verifyBGNotDisplayedNintyRange();
	}
	@QAFTestStep(description="user deleted BG {0} not present on readings page")
	public void verifydeletedBG(Object option){
		homePage.verifyDeletedBGReading(option);
	}
	//Sangram
	@QAFTestStep(description="user verify deleted glucose on home screen")
	public void verifyDeletedBGOnHomepage(){
		homePage.verifyDeletedBGOnHomepage();
	}
	@QAFTestStep(description="user verify average reading units")
	public void verifyReadingsPerDayOn90DayView() {
		homePage.verifyReadingsPerDay();
	}
	@QAFTestStep(description="user verify added event {0} on last sync with meter page")
	public void lastSyncAddedEventVerification(Object option){
		homePage.lastSyncAddedEvent(option);
	}
	
	@QAFTestStep(description="user verify deleted event {0} on last sync with meter page")
	public void lastSyncDeletedEventVerification(Object option){
		homePage.lastSyncDeletedEvent(option);
	}
	@QAFTestStep(description="user click on new added event {0} on home screen")
	public void clicksOnHiddenAddedEventHomeScreen(String data){
		homePage.clickNewBGHomeScreen(data);
	}
	@QAFTestStep(description="user verify today and yesterday added eventcon home screen")
	public void verifyTodayAndLastdayEvent(){
		homePage.verifyTodayLastdayLebel();
	}
	@QAFTestStep(description="user delete the article from homepage")
	public void verifiesCloseArticle(){
		homePage.verifyCloseArticle();
	}
	
}
