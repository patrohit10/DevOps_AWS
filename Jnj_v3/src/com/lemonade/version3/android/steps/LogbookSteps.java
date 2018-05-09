package com.lemonade.version3.android.steps;

import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.version3.android.pages.LogbookPageAndroid;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class LogbookSteps {
	LogbookPageAndroid logBookPage = new LogbookPageAndroid();
	@QAFTestStep(description="user clicks on Add Event")
	public void clickAddEvent(){
		logBookPage.clickOnAddEventButton();
	}
	
	@QAFTestStep(description="user select log event type as {0}")
	public void selectEventToAdd(String option){
		logBookPage.userSelectFromLogEventList(option);
	}
	
	@QAFTestStep(description="user add glucose for last day using {0}")
	public void addPreviousDateGlucose(Object details){
		logBookPage.addPreviousDateGlucose(details);
	}

	@QAFTestStep(description="user edit blood glucose details using {0}")
	public void editBGdetails(Object details){
		logBookPage.editGlucoseDetail(details);
	}
	@QAFTestStep(description="user add blood glucose details using {0}")
	public void addBGdetails(Object details){
		logBookPage.addBGDetail(details);
	}
	@QAFTestStep(description="user add blood glucose details using {0} to verify")
	public void addBGdetails1(Object details){
		logBookPage.addBGDetailToVerify(details);
	}
	@QAFTestStep(description="user add carbs details using {0}")
	public void addcarbsDetails(Object details){
		logBookPage.addCarbManualDetail(details);
	}
	@QAFTestStep(description="user edit carbs details using {0}")
	public void editcarbsDetails(Object details){
		logBookPage.editCarbsDetail(details);
	}
	@QAFTestStep(description="user add insulin details using {0}")
	public void addInsulinDetails(Object details){
		logBookPage.addInsulinDetail(details);
	}
	@QAFTestStep(description="user edit insulin details using {0}")
	public void editInsulinDetails(Object details){
		logBookPage.editInsulinDetail(details);
	}
	@QAFTestStep(description="user add activity details using {0}")
	public void addActivityDetails(Object details){
		logBookPage.addActivityDetail(details);
	}
	@QAFTestStep(description="user verify the delete event flow")
	public void verifyAndDeleteEvent( ){
		logBookPage.verifydeleteEvent();
	}
	@QAFTestStep(description="user verify blood glucose event flow")
	public void verifyEventBGFlow( ){
		logBookPage.verifyAddBGEventScreen();
	}
	
	@QAFTestStep(description="user verify blood glucose page")
	public void bgPageScreenshot(){
		logBookPage.takeScreenshotsOfBGPage();
	}
	@QAFTestStep(description="user verify blood glucose range")
	public void verifyBGRange( ){
		logBookPage.verifyAllowedBGRange();
	}
	@QAFTestStep(description="user verify carbs event flow")
	public void verifyEventCarbsFlow( ){
		logBookPage.verifyAddCarbEventScreen();
	}
	@QAFTestStep(description="user verify insulin event flow")
	public void verifyEventInsulinFlow( ){
		logBookPage.verifyAddInsulinEventScreen();
	}
	@QAFTestStep(description="user verify activity event flow")
	public void verifyEventActivityFlow( ){
		logBookPage.verifyAddActivityEventScreen();
	}
	@QAFTestStep(description="user clicks on save button event screen")
	public void clickOnSaveBtnEventScreen( ){
		logBookPage.clickOnSaveBtnAddEventScreen();
	}
	@QAFTestStep(description="user add multiple event and verify")
	public void addMultipleEventAndVerify( ){
		logBookPage.addMultipleEvent();
	}
	@QAFTestStep(description="user verifies Add Event Screen")
	public void verifyAddEventScreen() {
		logBookPage.verifyAddEventScreen();
	}
	@QAFTestStep(description="user taps back arrow")
	public void tapAppBackArrow() {
		logBookPage.tapAppBackArrow();
	}
	//Test step for tapping Android back button
	@QAFTestStep(description = "user taps device back button")
	public void userTapsDeviceBackButton() {
		JNJUtilsAndroid.clickBackButton();
	}
	@QAFTestStep(description = "user enter blood glucose amount as {0}")
	public void enterBGamount(String value) {
		logBookPage.enterManualBGvalue(value);
	}
	@QAFTestStep(description = "user clicks save button on logbook")
	public void clicksOnSaveBtn() {
		logBookPage.clickSaveBtnLogbook();
	}
	
	@QAFTestStep(description="user verify unit of measurement as {0}")
	public void verifyMOU(String details){
		logBookPage.verifyUnitOfMeasurement(details);
	}
	
	@QAFTestStep(description="user clicks on classic view tab and select current date")
	public void clickClassicANdSelectDate(){
	logBookPage.clickClassicSelectCurrentDate();
	}
	
	@QAFTestStep(description="user verify added BG on classic view using {0}")
	public void clicksClassicCurrentDate(Object eventDetails){
		logBookPage.clickClassicCurrentDate(eventDetails);
	}
	
	@QAFTestStep(description="user verify carb max allowed range time and note field")
	public void verifyCarbAllowedRange(){
		logBookPage.carValuebAllowedRange();
	}
	
	@QAFTestStep(description="user verify time insulin range time  note field and type")
	public void verifyInsulinRangeTimeAndType( ){
		logBookPage.insulinAllowedRangeTimeType();
	}
	
	@QAFTestStep(description="user verify Glucose note field and future timing")
	public void verifyGlucoseNoteFieldTiming( ){
		logBookPage.BGAllowedNoteRangeTime();
	}
	
	@QAFTestStep(description="user verify time activity range time  note field and duration")
	public void verifyActivityRangeTimeAndDuration( ){
		logBookPage.activityAllowedRangeTimeDuration();
	}
	
	@QAFTestStep(description="user click ok button")
	public void clickOKbtn(){
		logBookPage.clickOK();
	}
	
	@QAFTestStep(description="user verify activity page")
	public void screenshotsForActivityPage(){
		logBookPage.clickScreenshotsActivityPage();
	}
	
	@QAFTestStep(description="user verify carbs page")
	public void screenshotsForCarbsPage(){
		logBookPage.clickScreenshotsCarbsPage();
	}
	
	@QAFTestStep(description="user verify insulin page")
	public void screenshotsForInsulinPage(){
		logBookPage.clickScreenshotsInsulinPage();
	}
	@QAFTestStep(description="user click on logbook classic view added glucose")
	public void clickOnAddedGlucoseClassicView( ){
		logBookPage.clickOnGlucoseEventClassicView();
	}
	@QAFTestStep(description="user add glucose carb activity")
	public void addGlucoseCarbActvity( ){
		logBookPage.AddGlucoseCarbActivity();
	}
	@QAFTestStep(description="user edit glucose carb activity from classic view")
	public void editGlucoseCarbActvity( ){
		logBookPage.editGlucoseCarbActivity();
	}
	@QAFTestStep(description="user delete glucose carb activity from classic view")
	public void deleteGlucoseCarbActvity( ){
		logBookPage.deleteGlucoseCarbActivity();
	}
	
	@QAFTestStep(description="user add glucose insulin")
	public void addGlucoseInsulin( ){
		logBookPage.addGlucoseAndInsulin();
	}
	@QAFTestStep(description="user edit glucose insulin from classic view")
	public void editGlucoseInsulin( ){
		logBookPage.editGlucoseInsulin();
	}
	@QAFTestStep(description="user delete glucose insulin from classic view")
	public void deleteGlucoseInsulin( ){
		logBookPage.deleteGlucoseInsulin();
	}
	@QAFTestStep(description="user verify 365 day in logbook classic view")
	public void verify365DayLogbookClassicView( ){
		logBookPage.verify365DayClassicView();
	}
	
	@QAFTestStep(description="user verify blood glucose range for {0}")
	public void verifyBGRange(Object unit){
		logBookPage.verifyAllowedBGRange(unit);
	}
	
	//21march
	
	@QAFTestStep(description="user clicks on week view")
	public void clickOnWeekView( ){
		logBookPage.clickWeekViewBtn();
	}
	
	@QAFTestStep(description="user click and verify logbook info screen")
	public void clicVerifyLogbookInfoScreen( ){
		logBookPage.clickAndVerifyInfoScreenLogbook();
	}
	@QAFTestStep(description="user verify insulin section not displaying week view")
	public void verifyNoInsulinSectionWeekViews( ){
		logBookPage.verifyNoInsulinSectionWeekView();
	}
	@QAFTestStep(description="user add random glucose")
	public void addRandomGlucose( ){
		logBookPage.addRandomGlucose();
	}
	@QAFTestStep(description="user edit random glucose week view")
	public void editRandomGlucose( ){
		logBookPage.editRandomGlucose();
	}
	@QAFTestStep(description="user delete random glucose week view")
	public void deleteRandomGlucose( ){
		logBookPage.deleteRandomGlucose();
	}
	@QAFTestStep(description="user click on today from week view")
	public void clickOntodayWeekView( ){
		logBookPage.clickOnTodayWeekView();
	}

	@QAFTestStep(description="user add random carb")
	public void addRandomCarb( ){
		logBookPage.addRandomCarb();
	}
	@QAFTestStep(description="user edit random carb week view")
	public void editRandomCarbs( ){
		logBookPage.editRandomCarb();
	}
	@QAFTestStep(description="user delete random carb week view")
	public void deleteRandomcarbs( ){
		logBookPage.deleteRandomCarb();
	}
	@QAFTestStep(description="user add random insulin")
	public void addRandominsulin( ){
		logBookPage.addRandomInsulin();
	}
	@QAFTestStep(description="user edit random insulin week view")
	public void editRandominsulin (){
		logBookPage.editRandomInsulin();
	}
	@QAFTestStep(description="user delete random insulin week view")
	public void deleteRandominsulin( ){
		logBookPage.deleteRandomInsulin();
	}
	@QAFTestStep(description="user add random activity")
	public void addRandomactivitys( ){
		logBookPage.addRandomActivity();
	}
	@QAFTestStep(description="user edit random activity week view")
	public void editRandomactivitys (){
		logBookPage.editRandomActivity();
	}
	@QAFTestStep(description="user delete random activity week view")
	public void deleteRandomactivitys( ){
		logBookPage.deleteRandomActivity();
	}
	
	@QAFTestStep(description="user click on day view on logbook")
	public void clickOnDayViewLogbook( ){
		logBookPage.clickOnDayView();
	}
	
	@QAFTestStep(description="user click on {0} arrow in logbook")
	public void clickOnArrowLogbook(String arrow){
		logBookPage.clickArrow(arrow);
	}
	@QAFTestStep(description="user take screen shot view screen")
	public void lastDayScreen(){
		logBookPage.lastDayScreen();
	}
	
	@QAFTestStep(description="user add BG with before and after meal tag")
	public void BGForBeforeAfterMealTag(){
		logBookPage.setBGForBeforeAfterMeal();
	}
	@QAFTestStep(description="user add high low and in range glucose")
	public void setHighLowInrange(){
		logBookPage.addMultipleGlucose();
	}
	
	@QAFTestStep(description="user add random BG before {0} day")
	public void addBGBeforeDays(String range){
		logBookPage.setDateRandomBG(range);
	}
	
	@QAFTestStep(description="user add random BG for today and yesterday")
	public void addRandomTodayAndYesterday(){
		logBookPage.addRandomBGTodayANdYesterday();
	}
	
	@QAFTestStep(description="user verify default insulin type")
	public void defaultInsulin(){
		logBookPage.verifyDefaultInsulinType();
	}
	
	@QAFTestStep(description="user verify last added insulin type as default")
	public void lastAddedInsulinDefault(){
		logBookPage.verifyLastInsulinAsDefault();
	}
	@QAFTestStep(description="user verify next arrow is invisible for current day")
	public void rightArrowInvisible(){
		logBookPage.verifyRightArrowInvisible();
	}
	@QAFTestStep(description="user click on event screen on day view")
	public void clickOnEventScreen(){
		logBookPage.clickOnDayViewEvent();
	}
	@QAFTestStep(description="user verify default date for yesterday from day view")
	public void defaultDateSameAsDayView(){
		logBookPage.verifyDefaultDateForYesterday();
	}
}
