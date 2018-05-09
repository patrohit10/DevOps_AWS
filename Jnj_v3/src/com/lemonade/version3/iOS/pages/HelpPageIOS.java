package com.lemonade.version3.iOS.pages;


import java.util.List;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsIOS;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;


public class HelpPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otrios.helpPage.search.box")
	private QAFWebElement otriosHelppageSearchBox;
	@FindBy(locator = "otrios.helpPage.back.btn")
	private QAFWebElement otriosHelppageBackBtn;
	@FindBy(locator = "otrios.helpPage.back.btn")
	private List<QAFWebElement> otriosHelppageBackBtns;
	@FindBy(locator = "otrios.helpPage.Introduction.btn")
	private QAFWebElement otriosHelppageIntroductionBtn;
	@FindBy(locator = "otrios.helpPage.title.lbl")
	private QAFWebElement otriosHelppageTitleLbl;
	@FindBy(locator = "otrios.helpPage.gettingstarted.btn")
	private QAFWebElement otriosHelppageGettingstartedBtn;
	@FindBy(locator = "otrios.helpPage.appoverview.btn")
	private QAFWebElement otriosHelppageAppoverviewBtn;
	@FindBy(locator = "otrios.helpPage.Navigation.btn")
	private QAFWebElement otriosHelppageNavigationBtn;
	@FindBy(locator = "otrios.helpPage.logbook.btn")
	private QAFWebElement otriosHelppageLogbookBtn;
	@FindBy(locator = "otrios.helpPage.patterns.btn")
	private QAFWebElement otriosHelppagePatternsBtn;
	@FindBy(locator = "otrios.helpPage.average.btn")
	private QAFWebElement otriosHelppageAverageBtn;
	@FindBy(locator = "otrios.helpPage.aboutme.btn")
	private QAFWebElement otriosHelppageAboutmeBtn;
	@FindBy(locator = "otrios.helpPage.mymeter.btn")
	private QAFWebElement otriosHelppageMymeterBtn;
	@FindBy(locator = "otrios.helpPage.moremenu.btn")
	private QAFWebElement otriosHelppageMoreMenuBtn;
	@FindBy(locator = "otrios.helpPage.remnder.btn")
	private QAFWebElement otriosHelppageRemnderBtn;
	@FindBy(locator = "otrios.helpPage.account.btn")
	private QAFWebElement otriosHelppageAccountBtn;
	@FindBy(locator = "otrios.helpPage.help.btn")
	private QAFWebElement otriosHelppageHelpBtn;
	@FindBy(locator = "otrios.helpPage.contactus.btn")
	private QAFWebElement otriosHelppageContactusBtn;
	@FindBy(locator = "otrios.helpPage.termsofuse.btn")
	private QAFWebElement otriosHelppageTermsofuseBtn;
	@FindBy(locator = "otrios.helpPage.troubleshoot.btn")
	private QAFWebElement otriosHelppageTroubleshootBtn;
	@FindBy(locator = "otrios.helpPage.hcp.btn")
	private QAFWebElement otriosHelppageHcpBtn;
	@FindBy(locator = "otrios.helpPage.about.btn")
	private QAFWebElement otriosHelppageAboutBtn;
	//SG 2/14 Updates
	@FindBy(locator = "otrios.helpPage.Introduction.OTRMobileApp.btn")
	private QAFWebElement otriosHelppageIntroductionOTRMobileAppBtn;
	
	@FindBy(locator = "otrios.helpPage.Introduction.OTRMobileApp.txt")
	private QAFWebElement otriosHelppageIntroductionOTRMobileAppTxt;
	
	@FindBy(locator = "otrios.helpPage.Introduction.body.txt")
	private QAFWebElement otriosHelppageIntroductionBodyTxt;
	
	@FindBy(locator = "otrios.helpPage.Introduction.backButton.txt")
	private QAFWebElement otriosHelppageIntroductionBackButtonTxt;

	@FindBy(locator = "otrios.helpPage.Introduction.supportedDevices.btn")
	private QAFWebElement otriosHelppageIntroductionSupportedDevicesBtn;
	
	@FindBy(locator = "otrios.helpPage.Introduction.supportedDevices.txt")
	private QAFWebElement otriosHelppageIntroductionSupportedDevicesTxt;
	
	@FindBy(locator = "otrios.helpPage.Introduction.appleLegalNotice.btn")
	private QAFWebElement otriosHelppageIntroductionAppleLegalNoticeBtn;
	
	@FindBy(locator = "otrios.helpPage.Introduction.appleLegalNotice.txt")
	private QAFWebElement otriosHelppageIntroductionAppleLegalNoticeTxt;
	
	@FindBy(locator = "otrios.helpPage.Introduction.appleLegalNotice.body.txt")
	private QAFWebElement otriosHelppageIntroductionAppleLegalNoticeBodyTxt;
	
	@FindBy(locator = "otrios.helpPage.Introduction.androidLegal.Notice.btn")
	private QAFWebElement otriosHelppageIntroductionAndroidLegalNoticeBtn;
	
	@FindBy(locator = "otrios.helpPage.Introduction.googleLegal.Notice.btn")
	private QAFWebElement otriosHelppageIntroductionGoogleLegalNoticeBtn;
	
	@FindBy(locator = "otrios.helpPage.Introduction.bluetooth.trademark.btn")
	private QAFWebElement otriosHelppageIntroductionBluetoothTrademarkBtn;
	
	@FindBy(locator = "otrios.helpPage.Introduction.intendedUse.btn")
	private QAFWebElement otriosHelppageIntroductionIntendedUseBtn;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.gettingstarted.btn")
	private QAFWebElement otriosHelppageGettingstartedGettingStartedBtn;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.createaccount.btn")
	private QAFWebElement otriosHelppageGettingstartedCreateAccountBtn;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.pairing.btn")
	private QAFWebElement otriosHelppageGettingstartedPairingBtn;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.pairingFlexMeter.btn")
	private QAFWebElement otriosHelppageGettingstartedPairingFlexMeterBtn;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.unpairing.btn")
	private QAFWebElement otriosHelppageGettingstartedUnpairingBtn;
	
	
	@FindBy(locator = "otrios.helpPage.Introduction.androidLegal.Noice.txt")
	private QAFWebElement otriosHelppageIntroductionAndroidLegalNoticeTxt;
	
	@FindBy(locator = "otrios.helpPage.Introduction.googleLegal.Noice.txt")
	private QAFWebElement otriosHelppageIntroductionGoogleLegalNoticeTxt;
	
	@FindBy(locator = "otrios.helpPage.Introduction.BluetoothTrademark.txt")
	private QAFWebElement otriosHelppageIntroductionBluetoothTrademarkTxt;
	
	@FindBy(locator = "otrios.helpPage.Introduction.IntendedUse.txt")
	private QAFWebElement otriosHelppageIntroductionIntendedUseTxt;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.gettingstarted.txt")
	private QAFWebElement otriosHelppageGettingStartedGettingStartedTxt;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.createaccount.txt")
	private QAFWebElement otriosHelppageGettingStartedCreateAccountTxt;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.pairing.txt")
	private QAFWebElement otriosHelppageGettingStartedPairingTxt;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.pairingFlexMeter.txt")
	private QAFWebElement otriosHelppageGettingStartedPairingFlexMeterTxt;
	
	@FindBy(locator = "otrios.helpPage.gettingstarted.unpairing.txt")
	private QAFWebElement otriosHelppageGettingStartedUnpairingTxt;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtriosHelppageSearchBox() {
		return otriosHelppageSearchBox;
	}
	
	public List<QAFWebElement> getOtriosHelppageBackBtns() {
		return otriosHelppageBackBtns;
	}
	public QAFWebElement getOtriosHelppageBackBtn() {
		return otriosHelppageBackBtn;
	}

	public QAFWebElement getOtriosHelppageIntroductionBtn() {
		return otriosHelppageIntroductionBtn;
	}

	public QAFWebElement getOtriosHelppageTitleLbl() {
		return otriosHelppageTitleLbl;
	}

	public QAFWebElement getOtriosHelppageGettingstartedBtn() {
		return otriosHelppageGettingstartedBtn;
	}

	public QAFWebElement getOtriosHelppageAppoverviewBtn() {
		return otriosHelppageAppoverviewBtn;
	}

	public QAFWebElement getOtriosHelppagenNavigationBtn() {
		return otriosHelppageNavigationBtn;		
	}

	public QAFWebElement getOtriosHelppageLogbookBtn() {
		return otriosHelppageLogbookBtn;
	}

	public QAFWebElement getOtriosHelppagePatternsBtn() {
		return otriosHelppagePatternsBtn;
	}

	public QAFWebElement getOtriosHelppageAverageBtn() {
			return otriosHelppageAverageBtn;
	}

	public QAFWebElement getOtriosHelppageAboutmeBtn() {
		return otriosHelppageAboutmeBtn;
	}

	public QAFWebElement getOtriosHelppageMymeterBtn() {
		return otriosHelppageMymeterBtn;
	}

	public QAFWebElement getOtriosHelppageMoreMenuBtn() {
		return otriosHelppageMoreMenuBtn;
		
	}

	public QAFWebElement getOtriosHelppageRemnderBtn() {
		return otriosHelppageRemnderBtn;
	}

	public QAFWebElement getOtriosHelppageAccountBtn() {
		return otriosHelppageAccountBtn;
	}

	public QAFWebElement getOtriosHelppageHelpBtn() {
		return otriosHelppageHelpBtn;
	}

	public QAFWebElement getOtriosHelppageContactusBtn() {
		return otriosHelppageContactusBtn;
	}

	public QAFWebElement getOtriosHelppageTermsofuseBtn() {
		return otriosHelppageTermsofuseBtn;
	}

	public QAFWebElement getOtriosHelppageTroubleshootBtn() {
		return otriosHelppageTroubleshootBtn;
	}

	public QAFWebElement getOtriosHelppageHcpBtn() {
		return otriosHelppageHcpBtn;
	}

	public QAFWebElement getOtriosHelppageAboutBtn() {
		return otriosHelppageAboutBtn;
	}
	
	//2/14 SG updates
	public QAFWebElement getotriosHelppageIntroductionOTRMobileAppBtn() {
		return otriosHelppageIntroductionOTRMobileAppBtn;
	}
	
	public QAFWebElement getotriosHelppageIntroductionOTRMobileAppTxt() {
		return otriosHelppageIntroductionOTRMobileAppTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionBodyTxt() {
		return otriosHelppageIntroductionBodyTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionBackButtonTxt() {
		return otriosHelppageIntroductionBackButtonTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionSupportedDevicesBtn() {
		return otriosHelppageIntroductionSupportedDevicesBtn;
	}
	
	public QAFWebElement getotriosHelppageIntroductionSupportedDevicesTxt() {
		return otriosHelppageIntroductionSupportedDevicesTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionAppleLegalNoticeBtn() {
		return otriosHelppageIntroductionAppleLegalNoticeBtn;
	}
	
	public QAFWebElement getotriosHelppageIntroductionAppleLegalNoticeTxt() {
		return otriosHelppageIntroductionAppleLegalNoticeTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionAppleLegalNoticeBodyTxt() {
		return otriosHelppageIntroductionAppleLegalNoticeBodyTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionAndroidLegalNoticeBtn() {
		return otriosHelppageIntroductionAndroidLegalNoticeBtn;
	}
	
	public QAFWebElement getotriosHelppageIntroductionGoogleLegalNoticeBtn() {
		return otriosHelppageIntroductionGoogleLegalNoticeBtn;
	}
	
	public QAFWebElement getotriosHelppageIntroductionBluetoothTrademarkBtn() {
		return otriosHelppageIntroductionBluetoothTrademarkBtn;
	}
	
	public QAFWebElement getotriosHelppageIntroductionIntendedUseBtn() {
		return otriosHelppageIntroductionIntendedUseBtn;
	}
	
	public QAFWebElement getotriosHelppageGettingstartedGettingStartedBtn() {
		return otriosHelppageGettingstartedGettingStartedBtn;
	}
	
	public QAFWebElement getotriosHelppageGettingstartedCreateAccountBtn() {
		return otriosHelppageGettingstartedCreateAccountBtn;
	}
	
	public QAFWebElement getotriosHelppageGettingstartedPairingBtn() {
		return otriosHelppageGettingstartedPairingBtn;
	}
	
	public QAFWebElement getotriosHelppageGettingstartedPairingFlexMeterBtn() {
		return otriosHelppageGettingstartedPairingFlexMeterBtn;
	}
	
	public QAFWebElement getotriosHelppageGettingstartedUnpairingBtn() {
		return otriosHelppageGettingstartedUnpairingBtn;
	}
	
	public QAFWebElement getotriosHelppageIntroductionAndroidLegalNoticeTxt() {
		return otriosHelppageIntroductionAndroidLegalNoticeTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionGoogleLegalNoticeTxt() {
		return otriosHelppageIntroductionGoogleLegalNoticeTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionBluetoothTrademarkTxt() {
		return otriosHelppageIntroductionBluetoothTrademarkTxt;
	}
	
	public QAFWebElement getotriosHelppageIntroductionIntendedUseTxt() {
		return otriosHelppageIntroductionIntendedUseTxt;
	}
	
	public QAFWebElement getotriosHelppageGettingStartedGettingStartedTxt() {
		return otriosHelppageGettingStartedGettingStartedTxt;
	}
	
	public QAFWebElement getotriosHelppageGettingStartedCreateAccountTxt() {
		return otriosHelppageGettingStartedCreateAccountTxt;
	}
	
	public QAFWebElement getotriosHelppageGettingStartedPairingTxt() {
		return otriosHelppageGettingStartedPairingTxt;
	}
	
	public QAFWebElement getotriosHelppageGettingStartedPairingFlexMeterTxt() {
		return otriosHelppageGettingStartedPairingFlexMeterTxt;
	}
	
	public QAFWebElement getotriosHelppageGettingStartedUnpairingTxt() {
		return otriosHelppageGettingStartedUnpairingTxt;
	}
	public QAFWebElement getOtriosHelpPageStaticText(String text) {
		return JNJUtilsIOS.getElement("otrios.helpPage.static.txt", text);
	}
	
	//Method to click on visible back button
	public void clickOnBackButton(){
		getOtriosHelppageBackBtns().get(0).waitForPresent();
		for (QAFWebElement ele : getOtriosHelppageBackBtns()) {
			if (JNJUtilsIOS.tryMethod(ele))
				ele.click();
		}
		Reporter.logWithScreenShot("After clicking on back button", MessageTypes.Pass);
	}
	
	//Method to verify available option on help screen			//Changes by Manjushri
	public void verifyHelpPage(){
//		getOtriosHelppageSearchBox().waitForPresent();
		Reporter.logWithScreenShot("Help page", MessageTypes.Pass);
//		getOtriosHelppageSearchBox().verifyPresent("Seach box on help page");
//		getOtriosHelppageIntroductionBtn().verifyPresent("Introduction button");
//		getOtriosHelppageGettingstartedBtn().verifyPresent("Getting Started button");
//		getOtriosHelppageAppoverviewBtn().verifyPresent("App Overview button");
//		getOtriosHelppagenNavigationBtn().verifyPresent("Navigation Bar");
//		getOtriosHelppageLogbookBtn().verifyPresent("Logbook button");
//		getOtriosHelppagePatternsBtn().verifyPresent("Pattern Button");
//		getOtriosHelppageAverageBtn().verifyPresent("Average");
//		getOtriosHelppageMoreMenuBtn().verifyPresent("More menu");
//		getOtriosHelppageRemnderBtn().verifyPresent("Reminders");
//		getOtriosHelppageTroubleshootBtn().verifyPresent("Troubleshooting button");
//		getOtriosHelppageHcpBtn().verifyPresent("For your healthcare professional (HCP) only button");
//		getOtriosHelppageAboutBtn().verifyPresent("About button");
		/*getOtriosHelppageAccountBtn().verifyPresent("Account button");
		getOtriosHelppageHelpBtn().verifyPresent("Help Button");
		getOtriosHelppageContactusBtn().verifyPresent("Contact us Button");
		JNJUtilsIOS.swipeWithCoordinates(600, 600, 600, 1300, 1000);
		getOtriosHelppageTermsofuseBtn().verifyPresent("Terms of use and privecy policy button");
		*/
	}
	
	public void verifyHelpIntroductionPage() {
		if(getOtriosHelppageIntroductionBtn().isPresent()) {
		getOtriosHelppageIntroductionBtn().click();
		}
		getotriosHelppageIntroductionOTRMobileAppBtn().verifyPresent("OTR Mobile button");
		getotriosHelppageIntroductionSupportedDevicesBtn().verifyPresent("Supported devices button");
		getotriosHelppageIntroductionAppleLegalNoticeBtn().verifyPresent("Apple Legal Notice button");
		getotriosHelppageIntroductionAndroidLegalNoticeBtn().verifyPresent("Android Legal Notice button");
		getotriosHelppageIntroductionGoogleLegalNoticeBtn().verifyPresent("Google Legal Notice button");
		getotriosHelppageIntroductionBluetoothTrademarkBtn().verifyPresent("Bluetooth Trademark button");
		getotriosHelppageIntroductionIntendedUseBtn().verifyPresent("Intended Use button");
	}	
	
	public void verifyOTRMobilePage() {
		getotriosHelppageIntroductionOTRMobileAppBtn().click();	
		getotriosHelppageIntroductionOTRMobileAppTxt().verifyPresent("Text is present");
		//JNJUtilsIOS.swipeWithCoordinates(600, 600, 600, 1300, 1000);
		clickOnBackButton();
	}
	
	public void verifySupportedDevicePage() {
		getotriosHelppageIntroductionSupportedDevicesBtn().click();
		
		getotriosHelppageIntroductionSupportedDevicesTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}
	
	public void verifyAppleLegalNoticePage() {
		getotriosHelppageIntroductionAppleLegalNoticeBtn().click();
		getotriosHelppageIntroductionAppleLegalNoticeTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}
	
	public void verifyAndroidLegalNoticePage() {
		getotriosHelppageIntroductionAndroidLegalNoticeBtn().click();
			
		getotriosHelppageIntroductionAndroidLegalNoticeTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}
	
	public void verifyGoogleLegalNoticePage() {
		getotriosHelppageIntroductionGoogleLegalNoticeBtn().click();
			
		getotriosHelppageIntroductionGoogleLegalNoticeTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}
	
	public void verifyBluetoothTrademarkPage() {
		getotriosHelppageIntroductionBluetoothTrademarkBtn().click();
			
		getotriosHelppageIntroductionBluetoothTrademarkTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}
	
	public void verifyIntendedage() {
		getotriosHelppageIntroductionIntendedUseBtn().click();
			
		getotriosHelppageIntroductionIntendedUseTxt().verifyPresent("Text is present");
		clickOnBackButton();
	}
	
	public void verifyGettingStartedPage() {
		getOtriosHelppageGettingstartedBtn().click();
		getotriosHelppageGettingstartedGettingStartedBtn().verifyPresent("Getting Started button is present");
		getotriosHelppageGettingstartedCreateAccountBtn().verifyPresent("Create Account button is Present");
		getotriosHelppageGettingstartedPairingBtn().verifyPresent("Pairing button is present");
		getotriosHelppageGettingstartedUnpairingBtn().verifyPresent("Unpairing button is present");
	}
	public void verifyGettingStartedGettingStartedPage() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_GETTING_STARTED_GETSRT).click();
		Reporter.logWithScreenShot("Getting started help page", MessageTypes.Pass);
		clickOnBackButton();
	}
	
	public void verifyGettingStartedCreateAccountPage() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_GETTING_STARTED_CREATE_ACCOUNT).click();
		Reporter.logWithScreenShot("Create account help page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void verifyGettingStartedPairingPage() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_GETTING_STARTED_PAIRING).click();
		Reporter.logWithScreenShot("Pairing help page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void verifyGettingStartedPairingFlexMeterPage() {
		getotriosHelppageGettingStartedPairingFlexMeterTxt().click();
		Reporter.logWithScreenShot("Getting started help page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void verifyGettingStartedUnpairingPage() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_GETTING_STARTED_UNPAIR).click();
		Reporter.logWithScreenShot("Unpair help page", MessageTypes.Pass);
		clickOnBackButton();
	}
	
	public void clickOnAppOverView(){
		getOtriosHelppageAppoverviewBtn().click();
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED).verifyPresent("Symbol and icon button");
		getOtriosHelppageMoreMenuBtn().verifyPresent("More button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC).verifyPresent("Meter sync button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES).verifyPresent("Speclial message button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION).verifyPresent("Synchronization button");
		
	}
	public void verifySymbolPage(){
		
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_ICONS_USED).click();
		Reporter.logWithScreenShot("Symbol and icon  help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyOverviewMorePage(){
		getOtriosHelppageMoreMenuBtn().click();
		Reporter.logWithScreenShot("More menu help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpMeterSyncPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_METER_SYNC).click();
		Reporter.logWithScreenShot("Syncing meter help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpSpecilaMessagePage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_SPECIAL_MESSAGES).click();
		Reporter.logWithScreenShot("Special message help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpSynchronizingDataPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_OVERVIEW_DATA_SYNCHRONISATION).click();
		Reporter.logWithScreenShot("Synchronization help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	
	//METHODS FOR HELP NAVIGATION
	
	public void clickOnAppNavigation(){
		getOtriosHelppagenNavigationBtn().click();
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_HOME).verifyPresent("navigation Home button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LOGBOOK).verifyPresent("navigation logbook button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LASTREADING).verifyPresent("navigation lastreading button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS).verifyPresent("navigation pattern button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_AVARAGES).verifyPresent("navigation Avarage button");
		
	}
	public void verifyHelpNavigationHomePage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_HOME).click();
		Reporter.logWithScreenShot("Home help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpNavigationLogbookPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LOGBOOK).click();
		Reporter.logWithScreenShot("Logbook help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpNavigationLastreadingPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LASTREADING).click();
		Reporter.logWithScreenShot("Lastreading help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpNavigationPatternPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_PATTERNS).click();
		Reporter.logWithScreenShot("Pattern help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpNavigationAvaragePage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_AVARAGES).click();
		Reporter.logWithScreenShot("Avarage help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	
	//Method for logbook all option verification
	public void clickOnAppLogbookHelp(){
		getOtriosHelppageLogbookBtn().click();
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWDATA).verifyPresent("View date button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWDATA).verifyPresent("View date button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_MEAL).verifyPresent("Add meal tag button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_READING_NOTE).verifyPresent("Add reading Note button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADDING_EVENT).verifyPresent("Adding event button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_CARB).verifyPresent("Add carb button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_INSULIN).verifyPresent("Add insulin button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_ACTIVITY).verifyPresent("Add activity button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_MANUALBG).verifyPresent("Add manual glucose button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY).verifyPresent("Viewing and adding detail for each day button");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN).verifyPresent("View pattern from logbook button");
		
		
	}
	public void verifyHelpLogbokLogbookViewdatepage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_NAVIGATION_LOGBOOK).click();
		Reporter.logWithScreenShot("Logbook logbook help ", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpLogbokveiewAddmealPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_MEAL).click();
		Reporter.logWithScreenShot("Add meal help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpLogbokveiewReadingNotePage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_READING_NOTE).click();
		Reporter.logWithScreenShot("Reading note to your reading page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpLogbokveiewAddCarbPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_CARB).click();
		Reporter.logWithScreenShot("Add carb help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpLogbookAddInsulinPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_INSULIN).click();
		Reporter.logWithScreenShot("Add carb help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpLogbookAddActivityPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_ACTIVITY).click();
		Reporter.logWithScreenShot("Add activity help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpLogbookAddManualBGPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_ADD_MANUALBG).click();
		Reporter.logWithScreenShot("Add reading Manual Glucose help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpLogbookAddingEachdayBGPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_ADDING_EACHDAY).click();
		Reporter.logWithScreenShot("Adding each day help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	public void verifyHelpLogbookViewingPetternPage(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_LOGBOOK_VIEWING_PATTERN).click();
		Reporter.logWithScreenShot("viewing day help page", MessageTypes.Pass);
		clickOnBackButton();	
	}
	
	//SG Method for Patterns options
	public void clickOnAppPatternsHelp(){
		getOtriosHelppagePatternsBtn().click();
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_PATTERNS_DETECTING_PATTERNS).verifyPresent("Detecting patterns present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_PATTERNS_VIEWING_PATTERN_DETAILS).verifyPresent("Viewing patterns present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_RECEIVING_PATTERN_MESSAGES).verifyPresent("Receiving pattern messages present");
	}
	
	public void verifyHelpPatternsDetctingPatterns() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_PATTERNS_DETECTING_PATTERNS).click();
		Reporter.logWithScreenShot("detecting patterns page", MessageTypes.Pass);
		clickOnBackButton();
	}
	
	public void verifyHelpPatternsViewingPatterns() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_PATTERNS_VIEWING_PATTERN_DETAILS).click();
		Reporter.logWithScreenShot("viewing patterns page", MessageTypes.Pass);
		clickOnBackButton();
	}
	
	public void verifyHelpPatternsReceivingPatternMessages() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_RECEIVING_PATTERN_MESSAGES).click();
		Reporter.logWithScreenShot("receiving pattern messages page", MessageTypes.Pass);
		clickOnBackButton();
	}
	
	
//SG Methods for Help Averges page
	
	public void clickOnAppAveragesHelp(){
		getOtriosHelppageAverageBtn().click();
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_AVERAGES_AVERAGES).verifyPresent("Averages present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_AVERAGES_USING_AVERAGES_WITH_MEAL_TAGGING).verifyPresent("Using Averages with Meal Tagging present");
		
	}
	
	public void verifyHelpAveragesAveragesPage() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_AVERAGES_AVERAGES).click();
		Reporter.logWithScreenShot("averages page", MessageTypes.Pass);
		clickOnBackButton();
	}
	
	public void verifyHelpAveragesUsingAveragesWithMealTaggingPage() {
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_AVERAGES_USING_AVERAGES_WITH_MEAL_TAGGING).click();
		Reporter.logWithScreenShot("averages with meal tagging page", MessageTypes.Pass);
		clickOnBackButton();
	}
	
	//SG Methods for Help More Menu
	public void clickOnMoreMenuHelp(){
		getOtriosHelppageMoreMenuBtn().click();
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MORE_MENU).verifyPresent("More Menu present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_SETTINGS).verifyPresent("Settings present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_RANGE).verifyPresent("My range high and low limits present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_SETTING_YOUR_HIGH_AND_LOW_LIMITS).verifyPresent("Setting your high and low limits present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_METERS).verifyPresent("My Meters present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_AUTO_UPDATE_TIME).verifyPresent("Auto update time present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_REMINDERS).verifyPresent("My Reminders present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_ACCOUNT).verifyPresent("My Account present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_LOGIN_PREFERENCES).verifyPresent("Log-in preferences present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_OPTIN_PREFERENCES).verifyPresent("Opt-in preferences present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_CONNECTIONS).verifyPresent("Connections present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_APPS).verifyPresent("Apps present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_HELP).verifyPresent("Help present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_TERMS_OF_SERVICE).verifyPresent("Terms of Service present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_PRIVACY_POLICY).verifyPresent("Privacy Policy present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_LOG_OUT).verifyPresent("Log out present");
		
	}
	
	
	public void clickOnAppMoreMenuMoreMenu(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MORE_MENU).click();
		Reporter.logWithScreenShot("more menu page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuMySettings(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_SETTINGS).click();
		Reporter.logWithScreenShot("my settings page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuMyRange(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_RANGE).click();
		Reporter.logWithScreenShot("my range page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuYourHighLowLimits(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_SETTING_YOUR_HIGH_AND_LOW_LIMITS).click();
		Reporter.logWithScreenShot("high and low limits page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuMyMeters(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_METERS).click();
		Reporter.logWithScreenShot("my meters page", MessageTypes.Pass);
		clickOnBackButton();
	}

	public void clickOnAppMoreMenuAutoUpdateTime(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_AUTO_UPDATE_TIME).click();
		Reporter.logWithScreenShot("auto update time page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuMyReminders(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_REMINDERS).click();
		Reporter.logWithScreenShot("my reminders page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuMyAccount(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_MY_ACCOUNT).click();
		Reporter.logWithScreenShot("my account page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuLogInPreferences(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_LOGIN_PREFERENCES).click();
		Reporter.logWithScreenShot("login preferences page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuOptInPreferences(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_OPTIN_PREFERENCES).click();
		Reporter.logWithScreenShot("optin preferences page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuConnections(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_CONNECTIONS).click();
		Reporter.logWithScreenShot("Connections page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuApps(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_APPS).click();
		Reporter.logWithScreenShot("Apps page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreMenuHelp(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_HELP).click();
		Reporter.logWithScreenShot("Help page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreTermsOfService(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_TERMS_OF_SERVICE).click();
		Reporter.logWithScreenShot("terms of service page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMorePrivacyPolicy(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_PRIVACY_POLICY).click();
		Reporter.logWithScreenShot("privacy policy page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnAppMoreLogOut(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_MORE_MENU_LOG_OUT).click();
		Reporter.logWithScreenShot("log out page", MessageTypes.Pass);
		clickOnBackButton();
	}


//SG Help Reminders Methods
	public void clickOnMoreMenuReminders(){
		getOtriosHelppageRemnderBtn().click();
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_REMINDERS).verifyPresent("Reminders present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_ADDING_A_REMINDER).verifyPresent("Adding a reminder present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_DELETING_REMINDERS).verifyPresent("Deleting reminders present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_RECEIVING_REMINDERS).verifyPresent("Receiving reminders present");
	}
	public void clickOnRemindersReminders(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_REMINDERS).click();
		Reporter.logWithScreenShot("reminders page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnRemindersAddingAReminder(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_ADDING_A_REMINDER).click();
		Reporter.logWithScreenShot("adding a reminder page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnRemindersDeletingAReminder(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_DELETING_REMINDERS).click();
		Reporter.logWithScreenShot("deleting a reminder page", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnRemindersReceivingReminders(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_REMINDERS_RECEIVING_REMINDERS).click();
		Reporter.logWithScreenShot("receiving reminders page", MessageTypes.Pass);
		clickOnBackButton();
	}
	
//SG Help Troubleshooting page methods
	public void clickOnMoreMenuTroubleshooting(){
		getOtriosHelppageTroubleshootBtn().click();
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_FREQUENTLY_ASKED_QUESTIONS).verifyPresent("Frequently asked questions present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_ERROR_AND_OTHER_MESSAGES).verifyPresent("App error and other messages present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_DATA_ACCESS_ERROR).verifyPresent("Data access error present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_THE_APP_WILL_NOT_LAUNCH).verifyPresent("App will not launch present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_AND_METER_USE_DIFFERNT_UNITS_OF_MEASURE).verifyPresent("App and meter use differnt units of measure present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_DIFFERENT_RANGE).verifyPresent("Different range error present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_BLOOD_SUGAR_VALUE).verifyPresent("Improper blood sugar value present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_CARBOHYDRATE_VALUE).verifyPresent("Improper carbohydrate value present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_INSULIN_VALUE).verifyPresent("Improper insulin value present");
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_MANUAL_BLOOD_SUGAR_VALUE).verifyPresent("Improper manual blood sugar value present");
	}	
	public void clickOnTroubleshootingFAQ(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_FREQUENTLY_ASKED_QUESTIONS).click();
		Reporter.logWithScreenShot("frequently asked questions", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingAppErrorAndOtherMessages(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_ERROR_AND_OTHER_MESSAGES).click();
		Reporter.logWithScreenShot("app error and other messages", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingDataAccessError(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_DATA_ACCESS_ERROR).click();
		Reporter.logWithScreenShot("data access errors", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingAppWillNotLaunch(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_THE_APP_WILL_NOT_LAUNCH).click();
		Reporter.logWithScreenShot("app will not launch", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingAppAndMeterUseDifferntUnitsOfMeasure(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_APP_AND_METER_USE_DIFFERNT_UNITS_OF_MEASURE).click();
		Reporter.logWithScreenShot("app meter use and different units of measure", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingDifferentRange(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_DIFFERENT_RANGE).click();
		Reporter.logWithScreenShot("different range", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingImproperBloodSugarValue(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_BLOOD_SUGAR_VALUE).click();
		Reporter.logWithScreenShot("improper blood sugar value", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingImproperCarbohydrateValue(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_CARBOHYDRATE_VALUE).click();
		Reporter.logWithScreenShot("improper carbohydrate value", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingImproperInsulinValue(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_INSULIN_VALUE).click();
		Reporter.logWithScreenShot("improper insulin value", MessageTypes.Pass);
		clickOnBackButton();
	}
	public void clickOnTroubleshootingImproperManualBloodSugarValue(){
		getOtriosHelpPageStaticText(ConstantUtils.HELP_APP_TROUBLESHOOTING_IMPROPER_MANUAL_BLOOD_SUGAR_VALUE).click();
		Reporter.logWithScreenShot("improper manual blood sugar value", MessageTypes.Pass);
		clickOnBackButton();
	}
	

}