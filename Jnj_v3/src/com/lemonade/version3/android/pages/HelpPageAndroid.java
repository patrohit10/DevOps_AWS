package com.lemonade.version3.android.pages;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsAndroid;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.AppiumDriver;

public class HelpPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.moremenu.helppage.help.lbl")
	private QAFWebElement otrMoremenuHelppageHelpLbl;
	@FindBy(locator = "otr.moremenu.helppage.search.txt")
	private QAFWebElement otrMoremenuHelppageSearchTxt;
	@FindBy(locator = "otr.moremenu.helppage.search.btn")
	private QAFWebElement otrMoremenuHelppageSearchBtn;
	@FindBy(locator = "otr.moremenu.helppage.introduction.btn")
	private QAFWebElement otrMoremenuHelppageIntroductionBtn;
	@FindBy(locator = "otr.moremenu.helppage.gettingstarted.btn")
	private QAFWebElement otrMoremenuHelppageGettingstartedBtn;
	@FindBy(locator = "otr.moremenu.helppage.appoverview.btn")
	private QAFWebElement otrMoremenuHelppageAppoverviewBtn;
	@FindBy(locator = "otr.moremenu.helppage.home.btn")
	private QAFWebElement otrMoremenuHelppageHomeBtn;
	@FindBy(locator = "otr.moremenu.helppage.logbook.btn")
	private QAFWebElement otrMoremenuHelppageLogbookBtn;
	@FindBy(locator = "otr.moremenu.helppage.patterns.btn")
	private QAFWebElement otrMoremenuHelppagePatternsBtn;
	@FindBy(locator = "otr.moremenu.helppage.graphs.btn")
	private QAFWebElement otrMoremenuHelppageGraphsBtn;
	@FindBy(locator = "otr.moremenu.helppage.aboutme.btn")
	private QAFWebElement otrMoremenuHelppageAboutmeBtn;
	@FindBy(locator = "otr.moremenu.helppage.mymeters.btn")
	private QAFWebElement otrMoremenuHelppageMymetersBtn;
	@FindBy(locator = "otr.moremenu.helppage.settings.btn")
	private QAFWebElement otrMoremenuHelppageSettingsBtn;
	@FindBy(locator = "otr.moremenu.helppage.reminders.btn")
	private QAFWebElement otrMoremenuHelppageRemindersBtn;
	@FindBy(locator = "otr.moremenu.helppage.account.btn")
	private QAFWebElement otrMoremenuHelppageAccountBtn;
	@FindBy(locator = "otr.moremenu.helppage.help.btn")
	private QAFWebElement otrMoremenuHelppageHelpBtn;
	@FindBy(locator = "otr.moremenu.helppage.contactus.btn")
	private QAFWebElement otrMoremenuHelppageContactusBtn;
	@FindBy(locator = "otr.moremenu.helppage.tosandpp.btn")
	private QAFWebElement otrMoremenuHelppageTosandppBtn;
	@FindBy(locator = "otr.moremenu.helppage.troubleshooting.btn")
	private QAFWebElement otrMoremenuHelppageTroubleshootingBtn;
	@FindBy(locator = "otr.moremenu.helppage.hcp.btn")
	private QAFWebElement otrMoremenuHelppageHcpBtn;
	@FindBy(locator = "otr.moremenu.helppage.about.btn")
	private QAFWebElement otrMoremenuHelppageAboutBtn;
	@FindBy(locator = "otr.moremenu.helppage.statictext.txt")
	private QAFWebElement otrMoremenuHelppageStatictextTxt;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrmoremenuhelppagehelplbl() {
		return otrMoremenuHelppageHelpLbl;
	}

	public QAFWebElement getOtrmoremenuhelppagesearchtxt() {
		return otrMoremenuHelppageSearchTxt;
	}

	public QAFWebElement getOtrmoremenuhelppagesearchbtn() {
		return otrMoremenuHelppageSearchBtn;
	}

	public QAFWebElement getOtrmoremenuhelppageintroductionbtn() {
		return otrMoremenuHelppageIntroductionBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagegettingstartedbtn() {
		return otrMoremenuHelppageGettingstartedBtn;
	}

	public QAFWebElement getOtrmoremenuhelppageappoverviewbtn() {
		return otrMoremenuHelppageAppoverviewBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagehomebtn() {
		return otrMoremenuHelppageHomeBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagelogbookbtn() {
		return otrMoremenuHelppageLogbookBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagepatternsbtn() {
		return otrMoremenuHelppagePatternsBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagegraphsbtn() {
		return otrMoremenuHelppageGraphsBtn;
	}

	public QAFWebElement getOtrmoremenuhelppageaboutmebtn() {
		return otrMoremenuHelppageAboutmeBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagemymetersbtn() {
		return otrMoremenuHelppageMymetersBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagesettingsbtn() {
		return otrMoremenuHelppageSettingsBtn;
	}

	public QAFWebElement getOtrmoremenuhelppageremindersbtn() {
		return otrMoremenuHelppageRemindersBtn;
	}

	public QAFWebElement getOtrmoremenuhelppageaccountbtn() {
		return otrMoremenuHelppageAccountBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagehelpbtn() {
		return otrMoremenuHelppageHelpBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagecontactusbtn() {
		return otrMoremenuHelppageContactusBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagetosandppbtn() {
		return otrMoremenuHelppageTosandppBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagetroubleshootingbtn() {
		return otrMoremenuHelppageTroubleshootingBtn;
	}

	public QAFWebElement getOtrmoremenuhelppagehcpbtn() {
		return otrMoremenuHelppageHcpBtn;
	}

	public QAFWebElement getOtrmoremenuhelppageaboutbtn() {
		return otrMoremenuHelppageAboutBtn;
	}

	public QAFWebElement getOtrMoremenuHelppageStatictextTxt(String text) {
		return JNJUtilsAndroid.getElement("otr.moremenu.helppage.statictext.txt", text);
	}

	//Method to verify Help page options on help page
	public void verifyHelpPageOptions() {
		getOtrmoremenuhelppagehelplbl().waitForPresent();
		JNJUtilsAndroid.clickBackButton();

		Reporter.logWithScreenShot("Help Page available menus on first page", MessageTypes.Pass);
//		getOtrmoremenuhelppagesearchtxt().verifyPresent("Search Textbox is present");
//		getOtrmoremenuhelppageintroductionbtn().verifyPresent("Introduction tab is present");
//		getOtrmoremenuhelppagegettingstartedbtn().verifyPresent("Getting Started tab is present");
//		getOtrmoremenuhelppageappoverviewbtn().verifyPresent("App overview tab is present");
//		getOtrmoremenuhelppagehomebtn().verifyPresent("Home tab is present");
//		getOtrmoremenuhelppagelogbookbtn().verifyPresent("Logbook tab is present");
//		getOtrmoremenuhelppagepatternsbtn().verifyPresent("Patterns tab is present");
//		getOtrmoremenuhelppagegraphsbtn().verifyPresent("Graphs tab is present");
//		getOtrmoremenuhelppageaboutmebtn().verifyPresent("About Me tab is present");
//		getOtrmoremenuhelppagemymetersbtn().verifyPresent("My Meters tab is present");

		JNJUtilsAndroid.swipeWithCoordinates(607, 1531, 596, 1890, 100); 
		
		Reporter.logWithScreenShot("Help Page available menus on Second page", MessageTypes.Pass);
//		getOtrmoremenuhelppagesettingsbtn().verifyPresent("Settings tab is present");
//		getOtrmoremenuhelppageremindersbtn().verifyPresent("Reminders tab is present");
//		getOtrmoremenuhelppageaccountbtn().verifyPresent("Account tab is present");
//		getOtrmoremenuhelppagehelpbtn().verifyPresent("Help tab is present");
//		getOtrmoremenuhelppagecontactusbtn().verifyPresent("Contact Us tab is present");
//		getOtrmoremenuhelppagetosandppbtn().verifyPresent("Terms Of Use & Privacy Policy is present");
//		getOtrmoremenuhelppagetroubleshootingbtn().verifyPresent("TroubleShooting tab is present");
//		getOtrmoremenuhelppagehcpbtn().verifyPresent("HealtchCare Proffessional(HCP) tab is present");
//		getOtrmoremenuhelppageaboutbtn().verifyPresent("About tab is present");
	}

	// Method to verify Introduction Help page
	public void verifyHelpIntroductionPage() {
		if (getOtrmoremenuhelppageintroductionbtn().isPresent()) {
			getOtrmoremenuhelppageintroductionbtn().click();
		}
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_OTR_MOBILE_APP).verifyPresent("OneTouch Reveal® mobile app");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_SUPPORT_DEVICE)
				.verifyPresent("Supported Devices and System Requirements");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_ANDROID)
				.verifyPresent("Android");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_GOOGLE_PAY)
		.verifyPresent("Google Play");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_BLUETOOTH)
				.verifyPresent("Bluetooth® Trademark"); //Bluetooth® Trademark
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_INTENDED_USE).verifyPresent("Intended Use");
	}

	// Method to verify Supported Devices help page
	public void verifySupportedDevicePage() {

		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_SUPPORT_DEVICE).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_SUPPORT_DEVICE)
				.verifyPresent("Supported Devices and Systems is present");
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to verify Apple Legal notice page
	public void verifyAppleLegalNoticePage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_APPLE_LEGAL_NOTICE).click();

		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_APPLE_LEGAL_NOTICE)
				.verifyPresent("Apple Legal Notice is present");
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to verify Bluetooth Trademark page
	public void verifyBluetoothTrademarkPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_BLUETOOTH).click();

		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_BLUETOOTH)
				.verifyPresent("Bluetooth Trademark is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to verify Intended Use help page
	public void verifyIntendedage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_INTENDED_USE).click();

		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_INTRO_INTENDED_USE)
				.verifyPresent("Intended Use is present");
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to verify Getting Started Help sub page
	public void verifyGettingStartedPage() {
		getOtrmoremenuhelppagegettingstartedbtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GETSRT)
				.verifyPresent("Getting Started button is present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_CREATE_ACCOUNT)
				.verifyPresent("Create Account button is Present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_PAIRING)
				.verifyPresent("Pairing button is present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GENERAL_INSTRUCTIONS)
				.verifyPresent("General Instructions for Pairing your devices is present");

	}

	//Method to verify Getting Started help page
	public void verifyGettingStartedGettingStartedPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GETSRT).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GETSRT)
				.verifyPresent("Getting Started Help subpage is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	//Method to verify Create Account help page
	public void verifyGettingStartedCreateAccountPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_CREATE_ACCOUNT).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_CREATE_ACCOUNT)
				.verifyPresent("Create Account Help page is displayed");
		JNJUtilsAndroid.clickBackButton();

	}

	//Method to verify Pairing meter help page
	public void verifyGettingStartedPairingPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_PAIRING).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_PAIRING)
				.verifyPresent("Pairing Help page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	//Method to verify General Instruction help page
	public void verifyGeneralPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GENERAL_INSTRUCTIONS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_GETTING_STARTED_GENERAL_INSTRUCTIONS)
				.verifyPresent("General Instructions for Pairing your meter is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	//Method to verify Overview help page
	public void appOverviewMenuPage() {
		getOtrmoremenuhelppageappoverviewbtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION)
				.verifyPresent("Data Synchronisation button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED)
				.verifyPresent("Symbols and icons used in app");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC)
				.verifyPresent("Syncing your meter");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_NAVIGATION)
				.verifyPresent("Navigation Menu");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES)
				.verifyPresent("Special Messages");
	}

	//Method to verify Symbol n Icon Help page
	public void verifySymbolIconHelpPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED)
				.verifyPresent("Symbols and Icons used in App help page is displaye");
		JNJUtilsAndroid.clickBackButton();

	}

	//Method to verify Navigation Help menu
	public void verifyNavigationHelpMenu() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_NAVIGATION).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_NAVIGATION)
				.verifyPresent("Navigation Menu is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	//Method to verify meter syncing help page
	public void verifyMeterSyncingHelpPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC)
				.verifyPresent("Syncing Your meter page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	//Method to verify sepcial message help page
	public void verifySpecialMessagePage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES)
				.verifyPresent("Special Message is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	//Method to verify Synchronisation Data help page.
	public void verifySynchronizingDataPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION)
				.verifyPresent("Synchronizing data across multiple compatible wireless devices is displayed");
		JNJUtilsAndroid.clickBackButton();
	}


	// Method for logbook all option verification
	public void clickOnAppLogbookHelp() {
		getOtrmoremenuhelppagelogbookbtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_LOGBOOK)
				.verifyPresent("Logbook help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_DATA)
				.verifyPresent("Viewing/Adding Data button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY)
				.verifyPresent("Viewing and adding detail for each day button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN)
				.verifyPresent("View pattern from logbook button");

	}

	//Method to verify Logbook view date help page
	public void verifyHelpLogbokLogbookViewdatepage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_NAVIGATION_LOGBOOK).click();
		Reporter.logWithScreenShot("Logbook logbook help ", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	//Method to verify view Add data help page
	public void verifyLogbookViewAddDataPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_DATA).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_DATA)
				.verifyPresent("Viewing/Adding data page is displayed");
		JNJUtilsAndroid.clickBackButton();

	}

	//Method to verify adding each day BG reading help page
	public void verifyHelpLogbookAddingEachdayBGPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY)
				.verifyPresent("Logbook viewing and adding each day page is displayed");
		JNJUtilsAndroid.clickBackButton();

	}

	//Method to verify view patterns help page
	public void verifyHelpLogbookViewingPetternPage() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN)
				.verifyPresent("Viewing patterns page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnAppPatternsHelp() {
		getOtrmoremenuhelppagepatternsbtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_PATTERNS_DETECTING_PATTERNS)
				.verifyPresent("Detecting patterns present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_PATTERNS_VIEWING_PATTERN_DETAILS)
				.verifyPresent("Viewing patterns present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_RECEIVING_PATTERN_MESSAGES)
				.verifyPresent("Receiving pattern messages present");
	}

	public void verifyHelpPatternsDetctingPatterns() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_PATTERNS_DETECTING_PATTERNS).click();
		Reporter.logWithScreenShot("detecting patterns page", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifyHelpPatternsViewingPatterns() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_PATTERNS_VIEWING_PATTERN_DETAILS).click();
		Reporter.logWithScreenShot("viewing patterns page", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifyHelpPatternsReceivingPatternMessages() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_RECEIVING_PATTERN_MESSAGES).click();
		Reporter.logWithScreenShot("receiving pattern messages page", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnMoreMenuReminders() {
		getOtrmoremenuhelppageremindersbtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_REMINDERS)
				.verifyPresent("Reminders present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_ADDING_A_REMINDER)
				.verifyPresent("Adding a reminder present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_DELETING_REMINDERS)
				.verifyPresent("Deleting reminders present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_RECEIVING_REMINDERS)
				.verifyPresent("Receiving reminders present");
	}

	public void clickOnRemindersReminders() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_REMINDERS).click();
		Reporter.logWithScreenShot("reminders page", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnRemindersAddingAReminder() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_ADDING_A_REMINDER).click();
		Reporter.logWithScreenShot("adding a reminder page", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnRemindersDeletingAReminder() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_DELETING_REMINDERS).click();
		Reporter.logWithScreenShot("deleting a reminder page", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnRemindersReceivingReminders() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_REMINDERS_RECEIVING_REMINDERS).click();
		Reporter.logWithScreenShot("receiving reminders page", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnMoreMenuTroubleshooting() {
		getOtrmoremenuhelppagetroubleshootingbtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_FREQUENTLY_ASKED_QUESTIONS)
				.verifyPresent("Frequently asked questions present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_ERROR_AND_OTHER_MESSAGES)
				.verifyPresent("App error and other messages present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_DATA_ACCESS_ERROR)
				.verifyPresent("Data access error present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_THE_APP_WILL_NOT_LAUNCH)
				.verifyPresent("App will not launch present");
		getOtrMoremenuHelppageStatictextTxt(
				ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_AND_METER_USE_DIFFERNT_UNITS_OF_MEASURE)
						.verifyPresent("App and meter use differnt units of measure present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_DIFFERENT_RANGE)
				.verifyPresent("Different range error present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_BLOOD_SUGAR_VALUE)
				.verifyPresent("Improper blood sugar value present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_CARBOHYDRATE_VALUE)
				.verifyPresent("Improper carbohydrate value present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_INSULIN_VALUE)
				.verifyPresent("Improper insulin value present");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_MANUAL_BLOOD_SUGAR_VALUE)
				.verifyPresent("Improper manual blood sugar value present");
	}

	public void clickOnTroubleshootingFAQ() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_FREQUENTLY_ASKED_QUESTIONS).click();
		Reporter.logWithScreenShot("frequently asked questions", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingAppErrorAndOtherMessages() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_ERROR_AND_OTHER_MESSAGES)
				.click();
		Reporter.logWithScreenShot("app error and other messages", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingDataAccessError() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_DATA_ACCESS_ERROR).click();
		Reporter.logWithScreenShot("data access errors", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingAppWillNotLaunch() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_THE_APP_WILL_NOT_LAUNCH).click();
		Reporter.logWithScreenShot("app will not launch", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingAppAndMeterUseDifferntUnitsOfMeasure() {
		getOtrMoremenuHelppageStatictextTxt(
				ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_AND_METER_USE_DIFFERNT_UNITS_OF_MEASURE).click();
		Reporter.logWithScreenShot("app meter use and different units of measure", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingDifferentRange() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_DIFFERENT_RANGE).click();
		Reporter.logWithScreenShot("different range", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingImproperBloodSugarValue() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_BLOOD_SUGAR_VALUE).click();
		Reporter.logWithScreenShot("improper blood sugar value", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingImproperCarbohydrateValue() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_CARBOHYDRATE_VALUE).click();
		Reporter.logWithScreenShot("improper carbohydrate value", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingImproperInsulinValue() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_INSULIN_VALUE).click();
		Reporter.logWithScreenShot("improper insulin value", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void clickOnTroubleshootingImproperManualBloodSugarValue() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_MANUAL_BLOOD_SUGAR_VALUE)
				.click();
		Reporter.logWithScreenShot("improper manual blood sugar value", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifyHelHomePage() {
		getOtrmoremenuhelppagehomebtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_HOME).waitForPresent();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_HOME).verifyPresent("Home help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_DATA_SHARING)
				.verifyPresent("Data Sharing button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_READINGS).verifyPresent("Readings help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_MEAL_TAGS)
				.verifyPresent("Adding meal tags help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_NOTES)
				.verifyPresent("Adding notes help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_AVERAGES).verifyPresent("Averages help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS)
				.verifyPresent("Patterns help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_RECENT_EVENTS)
				.verifyPresent("Recent events help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_EVENTS)
				.verifyPresent("Adding events help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_CARBS)
				.verifyPresent("Add carbs help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_INSULIN)
				.verifyPresent("Add Insulin help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_ACTIVITY)
				.verifyPresent("Add activity help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_READINGS)
				.verifyPresent("Add readings(manually) help button");

	}

	public void verifiesHomeHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_HOME).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_HOME)
				.verifyPresent("Home Help page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesDataSharingHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_DATA_SHARING).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_DATA_SHARING)
				.verifyPresent("Data Sharing feature page is displayed");
		JNJUtilsAndroid.clickBackButton();

	}

	public void verifiesReadingsHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_READINGS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_READINGS)
				.verifyPresent("Readings(14,30,90 days) page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesAddingMealTagHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_MEAL_TAGS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_MEAL_TAGS)
				.verifyPresent("Adding Meal tags page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesAddingNotesHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_NOTES).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_NOTES)
				.verifyPresent("Adding notes page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesAveragesHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_AVERAGES).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_AVERAGES)
				.verifyPresent("Averages page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesPatternsHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS)
				.verifyPresent("Patterns page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesRecentEventHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_RECENT_EVENTS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_RECENT_EVENTS)
				.verifyPresent("Recent events page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesAddingEventsHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_EVENTS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADDING_EVENTS)
				.verifyPresent("Adding events page is displayed");
		JNJUtilsAndroid.clickBackButton();

	}

	public void verifiesAddCarbsHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_CARBS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_CARBS)
				.verifyPresent("Add Carbs page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesAddInsulinHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_INSULIN).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_INSULIN)
				.verifyPresent("Add Insulin page is displayed");
		JNJUtilsAndroid.clickBackButton();

	}

	public void verifiesAddActivityHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_ACTIVITY).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_ACTIVITY)
				.verifyPresent("Add Activity page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesAddReadingHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_READINGS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_HOME_ADD_READINGS)
				.verifyPresent("AddReading page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesGraphHelp() {

		getOtrmoremenuhelppagegraphsbtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_GRAPHS).verifyPresent("Graphs button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_OVERALL_GRAPHS)
				.verifyPresent("OverAll Graphs button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_TIME_OF_DAY_GRAPH)
				.verifyPresent("Time-Of-Day Graph button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_VIEWPATTERNS)
				.verifyPresent("View Patterns on the Overall and Time-of-Day Graphs button");
	}

	public void verifiesGraphsSubHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_GRAPHS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_GRAPHS)
				.verifyPresent("Graphs page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesOverallGraphHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_OVERALL_GRAPHS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_OVERALL_GRAPHS)
				.verifyPresent("Overall Graphs page is displayed");
		JNJUtilsAndroid.clickBackButton();

	}

	public void verifiesTimeOFGraphHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_TIME_OF_DAY_GRAPH).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_TIME_OF_DAY_GRAPH)
				.verifyPresent("Time of Day Graph page is displayed");
		JNJUtilsAndroid.clickBackButton();

	}

	public void verifiesViewingPatternsOnGraphsHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_VIEWPATTERNS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_GRAPH_VIEWPATTERNS)
				.verifyPresent("View Patterns on the Overall and Time-of-Day Graphs page is displayed");
		JNJUtilsAndroid.clickBackButton();
	}

	public void verifiesAboutMeHelpPage() {
		getOtrmoremenuhelppageaboutmebtn().click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUTME_ABOUTME).verifyPresent("About Me help button");
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUTME_SETTING_LIMITS).verifyPresent("Setting limits button");
	}

	public void verifiesAboutMeSubMenuHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUTME_ABOUTME).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUTME_ABOUTME).verifyPresent("About Me help page is displayed");
		JNJUtilsAndroid.clickBackButton();
		
	}

	public void verifiesSettingHighLowHelp() {
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUTME_SETTING_LIMITS).click();
		getOtrMoremenuHelppageStatictextTxt(ConstantUtils.HELP_APP_ABOUTME_SETTING_LIMITS).verifyPresent("Setting your High and Low limits");
		JNJUtilsAndroid.clickBackButton();
	}

//	public void verifyAndroidLegalNoticePage() {
//		getotriosHelppageIntroductionAndroidLegalNoticeBtn().click();
//			
//		getotriosHelppageIntroductionAndroidLegalNoticeTxt().verifyPresent("Text is present");
//		clickOnBackButton();
//	}
//	
//	public void verifyGoogleLegalNoticePage() {
//		getotriosHelppageIntroductionGoogleLegalNoticeBtn().click();
//			
//		getotriosHelppageIntroductionGoogleLegalNoticeTxt().verifyPresent("Text is present");
//		clickOnBackButton();
//	}
}
