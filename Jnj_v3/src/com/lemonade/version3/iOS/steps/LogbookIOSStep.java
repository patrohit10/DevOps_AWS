package com.lemonade.version3.iOS.steps;


import com.lemonade.version3.iOS.pages.LogbookPageIOS;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class LogbookIOSStep {
	
	LogbookPageIOS logbook=new LogbookPageIOS();
	
	@QAFTestStep(description = "user enter blood glucose amount as {0}")
	public void enterBGamount(String value) {						
		//Changes done by Manjushri
		logbook.getOtriosLogbookpageGlucoseAmountTxt().click();
		logbook.enterManualBGvalue(value);
		logbook.getOtriosLogbookpageGlucoseDropImg().click();
		
	}
	@QAFTestStep(description = "user clicks on Add Event")
	public void clicksOnLogevent() {
		logbook.clickLogevent();
	}
	@QAFTestStep(description = "user clicks save button on logbook")
	public void clicksOnSaveBtn() {
		logbook.clickSaveBtnLogbook();
	}
	@QAFTestStep(description = "user select log event type as {0}")
	public void selectsLogeventType(String option) {
		logbook.userSelectFromLogEventList(option);
	}
	@QAFTestStep(description="user add blood glucose details using {0}")
	public void addBGdetailsIOS(Object details){
		logbook.addManualGlucose(details);
	}
	
	@QAFTestStep(description="user clicks on classic view tab and select current date")
	public void clicksClassicView(){
		logbook.clickClassic();
	}
	@QAFTestStep(description="user edit blood glucose details using {0}")
	public void editBGdetailsIOS(Object details){
		logbook.editManualGlucose(details);
	}
	@QAFTestStep(description="user add carbs details using {0}")
	public void addcarbsDetails(Object details){
		logbook.addCarbDetail(details);
	}
	@QAFTestStep(description="user edit carbs details using {0}")
	public void editcarbsDetails(Object details){
		logbook.editCarbDetail(details);
	}
	@QAFTestStep(description="user add insulin details using {0}")
	public void addInsulinDetails(Object details){
		logbook.addInsulinDetail(details);
	}
	@QAFTestStep(description="user edit insulin details using {0}")
	public void editInsulinDetails(Object details){
		logbook.editInsulinDetail(details);
	}
	@QAFTestStep(description="user add activity details using {0}")
	public void addActivityDetails(Object details){
		logbook.addActivityDetail(details);
	}
	
	@QAFTestStep(description="user verify unit of measurement as {0}")
	public void verifyMOU(String details){
		logbook.verifyUnitOfMeasurement(details);
	}
	@QAFTestStep(description="user verify blood glucose event flow")
	public void verifyEventBGFlow( ){
		logbook.verifyAddBGEventScreen();
	}
	@QAFTestStep(description="user verify carbs event flow")
	public void verifyEventCarbsFlow( ){
		logbook.verifyAddCarbEventScreen();
	}
	@QAFTestStep(description="user verify insulin event flow")
	public void verifyEventInsulinFlow( ){
		logbook.verifyAddInsulinEventScreen();
	}
	@QAFTestStep(description="user verify activity event flow")
	public void verifyEventActivityFlow( ){
		logbook.verifyAddActivityEventScreen();
	}
	@QAFTestStep(description="user add multiple event and verify")
	public void addMultipleEventAndVerify( ){
		logbook.addMultipleEvent();
	}

	@QAFTestStep(description="user verify blood glucose range for {0}")
	public void verifyBGRange(Object unit){
		logbook.verifyAllowedBGRange(unit);
	}
	@QAFTestStep(description="user verifies Add Event Screen")
	public void verifyAddEventScreen() {
		logbook.verifyAddEventScreen();
	}
	
	@QAFTestStep(description="user taps back arrow")
	public void tapAppBackArrow() {
		logbook.tapAppBackArrow();
	}
	@QAFTestStep(description="user verify the delete event flow")
	public void verifyAndDeleteEvent( ){
		logbook.verifydeleteEvent();
	}
	@QAFTestStep(description="user verify all events")
	public void verifyAlleventScreens( ){
		logbook.verifyAlleventScreen();
	}
	@QAFTestStep(description="user verify added BG on classic view using {0}")
	public void clicksClassicCurrentDate(Object eventDetails){
		logbook.clickClassicCurrentDate(eventDetails);
	}
	@QAFTestStep(description="user verify carb max allowed range time and note field")
	public void verifyCarbAllowedRange(){
		logbook.carValuebAllowedRange();
	}
	@QAFTestStep(description="user verify Add note field allowed charcter length")
	public void verifyAddNoteField( ){
		logbook.maxAllowedNoteFieldCharacter();
	}
	@QAFTestStep(description="user verify time picker future value not allowed")
	public void verifyTimePickerFuturevalue( ){
		logbook.verifyTimePickerFutureNotAllowed();
	}
	@QAFTestStep(description="user verify time insulin range time  note field and type")
	public void verifyInsulinRangeTimeAndType( ){
		logbook.insulinAllowedRangeTimeType();
	}
	@QAFTestStep(description="user verify time activity range time  note field and duration")
	public void verifyActivityRangeTimeAndDuration( ){
		logbook.activityAllowedRangeTimeDuration();
	}
	@QAFTestStep(description="user verify Glucose note field and future timing")
	public void verifyGlucoseNoteFieldTiming( ){
		logbook.BGAllowedNoteRangeTime();
	}
	@QAFTestStep(description="user click on logbook classic view added glucose")
	public void clickOnAddedGlucoseClassicView( ){
		logbook.clickOnGlucoseEventClassicView();
	}
	@QAFTestStep(description="user add glucose carb activity")
	public void addGlucoseCarbActvity( ){
		logbook.AddGlucoseCarbActivity();
	}
	@QAFTestStep(description="user edit glucose carb activity from classic view")
	public void editGlucoseCarbActvity( ){
		logbook.editGlucoseCarbActivity();
	}
	@QAFTestStep(description="user delete glucose carb activity from classic view")
	public void deleteGlucoseCarbActvity( ){
		logbook.deleteGlucoseCarbActivity();
	}
	@QAFTestStep(description="user add glucose insulin")
	public void addGlucoseInsulin( ){
		logbook.addGlucoseAndInsulin();
	}
	@QAFTestStep(description="user edit glucose insulin from classic view")
	public void editGlucoseInsulin( ){
		logbook.editGlucoseInsulin();
	}
	@QAFTestStep(description="user delete glucose insulin from classic view")
	public void deleteGlucoseInsulin( ){
		logbook.deleteGlucoseInsulin();
	}
	@QAFTestStep(description="user verify 365 day in logbook classic view")
	public void verify365DayLogbookClassicView( ){
		logbook.verify365DayClassicView();
	}
	
	@QAFTestStep(description="user add random glucose")
	public void addRandomGlucose( ){
		logbook.addRandomGlucose();
	}
	@QAFTestStep(description="user edit random glucose week view")
	public void editRandomGlucose( ){
		logbook.editRandomGlucose();
	}
	@QAFTestStep(description="user delete random glucose week view")
	public void deleteRandomGlucose( ){
		logbook.deleteRandomGlucose();
	}
	@QAFTestStep(description="user click on today from week view")
	public void clickOntodayWeekView( ){
		logbook.clickOnTodayWeekView();
	}
	@QAFTestStep(description="user clicks on week view")
	public void clickOnWeekView( ){
		logbook.clickWeekViewBtn();
	}
	@QAFTestStep(description="user add random carb")
	public void addRandomCarb( ){
		logbook.addRandomCarb();
	}
	@QAFTestStep(description="user edit random carb week view")
	public void editRandomCarbs( ){
		logbook.editRandomCarb();
	}
	@QAFTestStep(description="user delete random carb week view")
	public void deleteRandomcarbs( ){
		logbook.deleteRandomCarb();
	}
	@QAFTestStep(description="user add random insulin")
	public void addRandominsulin( ){
		logbook.addRandomInsulin();
	}
	@QAFTestStep(description="user edit random insulin week view")
	public void editRandominsulin (){
		logbook.editRandomInsulin();
	}
	@QAFTestStep(description="user delete random insulin week view")
	public void deleteRandominsulin( ){
		logbook.deleteRandomInsulin();
	}
	@QAFTestStep(description="user add random activity")
	public void addRandomactivitys( ){
		logbook.addRandomActivity();
	}
	@QAFTestStep(description="user edit random activity week view")
	public void editRandomactivitys (){
		logbook.editRandomActivity();
	}
	@QAFTestStep(description="user delete random activity week view")
	public void deleteRandomactivitys( ){
		logbook.deleteRandomActivity();
	}
	@QAFTestStep(description="user click and verify logbook info screen")
	public void clicVerifyLogbookInfoScreen( ){
		logbook.clickAndVerifyInfoScreenLogbook();
	}
	@QAFTestStep(description="user verify insulin section not displaying week view")
	public void verifyNoInsulinSectionWeekViews( ){
		logbook.verifyNoInsulinSectionWeekView();
	}
	@QAFTestStep(description="user click on day view on logbook")
	public void clickOnDayViewLogbook( ){
		logbook.clickOnDayView();
	}
	@QAFTestStep(description="user click on {0} arrow in logbook")
	public void clickOnArrowLogbook(String arrow){
		logbook.clickArrow(arrow);
	}
	@QAFTestStep(description="user take screen shot view screen")
	public void lastDayScreen(){
		logbook.lastDayScreen();
	}
	@QAFTestStep(description="user add glucose for last day using {0}")
	public void addPreviousDateGlucose(Object details){
		logbook.addPreviousDateGlucose(details);
	}
	@QAFTestStep(description="user add high low and in range glucose")
	public void setHighLowInrange(){
		logbook.addMultipleGlucose();
	}
	@QAFTestStep(description="user add BG with before and after meal tag")
	public void BGForBeforeAfterMealTag(){
		logbook.setBGForBeforeAfterMeal();
	}
	@QAFTestStep(description="user add random BG before {0} day")
	public void addBGBeforeDays(String range){
		logbook.setDateRandomBG(range);
	}
	@QAFTestStep(description="user add random BG for today and yesterday")
	public void addBGTodayAndYesterday(){
		logbook.addTodayYesterDayEvent();
	}
	@QAFTestStep(description="user verify default insulin type")
	public void defaultInsulin(){
		logbook.verifyDefaultInsulinType();
	}
	@QAFTestStep(description="user verify last added insulin type as default")
	public void lastAddedInsulinDefault(){
		logbook.verifyLastInsulinAsDefault();
	}
	@QAFTestStep(description="user verify default date for yesterday from day view")
	public void defaultDateSameAsDayView(){
		logbook.verifyDefaultDateForYesterday();
	}
	@QAFTestStep(description="user click on event screen on day view")
	public void clickOnEventScreen(){
		logbook.clickOnDayViewEvent();
	}
	@QAFTestStep(description="user verify next arrow is invisible for current day")
	public void rightArrowInvisible(){
		logbook.verifyRightArrowInvisible();
	}
}
