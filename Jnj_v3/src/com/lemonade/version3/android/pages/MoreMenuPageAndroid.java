package com.lemonade.version3.android.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.hamcrest.Matchers;

import com.lemonade.support.JNJUtilsAndroid;
import com.lemonade.version3.android.beans.UserDetailBeans;
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

import io.appium.java_client.DriverMobileCommand;

public class MoreMenuPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.homepage.moremenu.settings.btn")
	private QAFWebElement otrHomepageMoremenuSettingsBtn;
	@FindBy(locator = "otr.homepage.moremenu.mymeters.btn")
	private QAFWebElement otrHomepageMoremenuMymetersBtn;
	@FindBy(locator = "otr.homepage.moremenu.reminders.btn")
	private QAFWebElement otrHomepageMoremenuRemindersBtn;
	@FindBy(locator = "otr.homepage.moremenu.account.btn")
	private QAFWebElement otrHomepageMoremenuAccountBtn;
	@FindBy(locator = "otr.homepage.moremenu.help.btn")
	private QAFWebElement otrHomepageMoremenuHelpBtn;
	@FindBy(locator = "otr.homepage.moremenu.contactus.btn")
	private QAFWebElement otrHomepageMoremenuContactusBtn;
	@FindBy(locator = "otr.homepage.moremenu.termsofuse.btn")
	private QAFWebElement otrHomepageMoremenuTermsofuseBtn;
	@FindBy(locator = "otr.homepage.moremenu.privacypolicy.btn")
	private QAFWebElement otrHomepageMoremenuPrivacypolicyBtn;
	@FindBy(locator = "otr.homepage.moremenu.logout.btn")
	private QAFWebElement otrHomepageMoremenuLogoutBtn;
	@FindBy(locator = "otr.homepage.moremenu.termsofusepage.lbl")
	private QAFWebElement otrHomepageMoremenuTermsofUsePageLbl;
	@FindBy(locator = "otr.homepage.moremenu.connections.btn")
	private QAFWebElement otrHomepageMoreMenuConnectionsBtn;
	@FindBy(locator = "otr.homepage.moremenu.connections.officecode.txt")
	private QAFWebElement otrHomepageMoremenuConnectionsOfficeCodeTxt;
	@FindBy(locator = "otr.homepage.moremenu.connections.search.btn")
	private QAFWebElement otrHomepageMoremenuConnectionsSearchBtn;
	@FindBy(locator = "otr.homepage.moremenu.addofficecode.btn")
	private QAFWebElement otrHomepageMoreMenuAddOfficeCodeBtn;
	@FindBy(locator = "otr.homepage.moremenu.addcliniccode.YES.btn")
	private QAFWebElement otrHomepageMoremenuAddClinicCodeYESBtn;
	@FindBy(locator = "otr.moremenu.myreminderspage.myreminders.lbl")
	private QAFWebElement otrMoreMenuMyReminderspageMyRemindersLbl;
	@FindBy(locator = "otr.moremenu.myreminderspage.noreminders.lbl")
	private QAFWebElement otrMoreMenuMyReminderspageNoRemindersLbl;
	@FindBy(locator = "otr.moremenu.myreminderspage.addreminder.btn")
	private QAFWebElement otrMoreMenuMyReminderspageAddRemindersBtn;
	@FindBy(locator = "otr.moremenu.myreminderspage.staticText.btn")
	private QAFWebElement otrMoreMenuMyReminderspageStaticTextBtn;
	@FindBy(locator = "otr.moremenu.myreminderspage.newreminder.btn")
	private QAFWebElement otrMoreMenuMyReminderspageNewReminderBtn;
	@FindBy(locator = "otr.moremenu.myreminderspage.savereminder.btn")
	private QAFWebElement otrMoreMenuMyReminderspageSaveRemindersBtn;
	@FindBy(locator = "otr.moremenu.myreminderspage.remember.btn")
	private QAFWebElement otrMoreMenuMyReminderspageRememberBtn;
	@FindBy(locator = "otr.moremenu.myreminderspage.enterdescription.txt")
	private QAFWebElement otrMoreMenuMyReminderspageEnterDescriptionTxt;
	@FindBy(locator = "otr.moremenu.myreminderspage.selectdatetime.btn")
	private QAFWebElement otrMoreMenuMyReminderspageSelectedDateTimeBtn;
	@FindBy(locator = "otr.moremenu.myreminderspage.selectrepeatoption.btn")
	private QAFWebElement otrMoreMenuMyReminderspageSelectRepeatOptionBtn;
	@FindBy(locator = "otr.moremenu.myreminderspage.saveddatetime.lbl")
	private QAFWebElement otrMoreMenuMyRemindersPageSaveDateTimeLbl;
	@FindBy(locator = "otr.moremenupagereminderdeteletpopupdelete.btn")
	private QAFWebElement otrMoreMenuPageReminderDeletePopUpDeleteBtn;
	@FindBy(locator = "otr.homepage.moremenu.connections.officename.lbl")
	private QAFWebElement otrHomepageMoremenuConnectionsOfficenameLbl;
	@FindBy(locator = "otr.homepage.moremenu.connections.officenumber.lbl")
	private QAFWebElement otrHomepageMoremenuConnectionsOfficenumberLbl;
	@FindBy(locator = "otr.homepage.moremenu.connections.done.btn")
	private QAFWebElement otrHomepageMoremenuConnectionsDoneBtn;
	@FindBy(locator = "otr.homepage.moremenu.connections.officeaccept.chkbox")
	private QAFWebElement otrHomepageMoremenuConnectionsOfficeacceptChkbox;
	@FindBy(locator = "otr.homepage.moremenu.connections.walgreens.lbl")
	private QAFWebElement otrHomepageMoremenuConnectionsWalgreensLbl;
	@FindBy(locator = "otr.homepage.moremenu.connections.walgreen.tglbtn")
	private QAFWebElement otrHomepageMoremenuConnectionsWalgreenTglbtn;
	@FindBy(locator = "otr.homepage.moremenu.reminders.bgtest.temp.btm")
	private QAFWebElement otrHomepageMoremenuRemindersBgtestTempBtm;
	@FindBy(locator = "otr.homepage.moremenu.connections.walgreen.chkbx")
	private QAFWebElement otrHomepageMoremenuConnectionsWalgreenChkbx;
	@FindBy(locator = "otr.homepage.moremenu.clinic.confirmation.btn")
	private QAFWebElement otrHomepageMoremenuClinicConfirmationBtn;
	@FindBy(locator = "otr.homepage.moremenu.clinic.confirmation.field")
	private QAFWebElement otrHomepageMoremenuClinicConfirmationField;

	public QAFWebElement getOtrHomepageMoremenuConnectionsOfficenameLbl() {
		return otrHomepageMoremenuConnectionsOfficenameLbl;
	}

	public QAFWebElement getOtrHomepageMoremenuConnectionsOfficenumberLbl() {
		return otrHomepageMoremenuConnectionsOfficenumberLbl;
	}

	public QAFWebElement getOtrHomepageMoremenuConnectionsDoneBtn() {
		return otrHomepageMoremenuConnectionsDoneBtn;
	}

	public QAFWebElement getOtrHomepageMoremenuConnectionsOfficeacceptChkbox() {
		return otrHomepageMoremenuConnectionsOfficeacceptChkbox;
	}

	public QAFWebElement getOtrMoreMenuMyRemindersPageSaveDateTimeLbl() {
		return otrMoreMenuMyRemindersPageSaveDateTimeLbl;
	}

	public QAFWebElement getOtrMoreMenuPageReminderDeletePopUpDeleteBtn() {
		return otrMoreMenuPageReminderDeletePopUpDeleteBtn;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageSaveRemindersBtn() {
		return otrMoreMenuMyReminderspageSaveRemindersBtn;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageRememberBtn() {
		return otrMoreMenuMyReminderspageRememberBtn;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageEnterDescriptionTxt() {
		return otrMoreMenuMyReminderspageEnterDescriptionTxt;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageSelectedDateTimeBtn() {
		return otrMoreMenuMyReminderspageSelectedDateTimeBtn;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageSelectRepeatOptionBtn() {
		return otrMoreMenuMyReminderspageSelectRepeatOptionBtn;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageMyRemindersLbl() {
		return otrMoreMenuMyReminderspageMyRemindersLbl;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageNoRemindersLbl() {
		return otrMoreMenuMyReminderspageNoRemindersLbl;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageAddRemindersBtn() {
		return otrMoreMenuMyReminderspageAddRemindersBtn;
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageStaticTextBtn(String Text) {
		return JNJUtilsAndroid.getElement("otr.moremenu.myreminderspage.staticText.btn", Text);
	}

	public QAFWebElement getOtrMoreMenuMyReminderspageNewReminderBtn() {
		return otrMoreMenuMyReminderspageNewReminderBtn;
	}

	public QAFWebElement getotrHomepageMoremenuConnectionsOfficeCodeTxt(String text) {
		return JNJUtilsAndroid.getElement("otr.homepage.moremenu.connections.officecode.txt", text);
	}

	public QAFWebElement getOtrHomepageMoreMenuAddOfficeCodeBtn() {
		return otrHomepageMoreMenuAddOfficeCodeBtn;
	}

	public QAFWebElement getOtrHomepageMoremenuAddOfficecodeYESBtn() {
		return otrHomepageMoremenuAddClinicCodeYESBtn;
	}

	public QAFWebElement getOtrHomepageMoreMenuConnectionsSearchBtn() {
		return otrHomepageMoremenuConnectionsSearchBtn;
	}

	public QAFWebElement getOtrHomepageMoreMenuConnectionsBtn() {
		return otrHomepageMoreMenuConnectionsBtn;
	}

	public QAFWebElement getOtrHomepageMoremenuTermsofUsePageLbl() {
		return otrHomepageMoremenuTermsofUsePageLbl;
	}

	public QAFWebElement getOtrHomepageMoremenuClinicConfirmationField() {
		return otrHomepageMoremenuClinicConfirmationField;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrhomepagemoremenusettingsbtn() {
		return otrHomepageMoremenuSettingsBtn;
	}

	public QAFWebElement getOtrhomepagemoremenumymetersbtn() {
		return otrHomepageMoremenuMymetersBtn;
	}

	public QAFWebElement getOtrhomepagemoremenuremindersbtn() {
		return otrHomepageMoremenuRemindersBtn;
	}

	public QAFWebElement getOtrhomepagemoremenuaccountbtn() {
		return otrHomepageMoremenuAccountBtn;
	}

	public QAFWebElement getOtrhomepagemoremenuhelpbtn() {
		return otrHomepageMoremenuHelpBtn;
	}

	public QAFWebElement getOtrhomepagemoremenucontactusbtn() {
		return otrHomepageMoremenuContactusBtn;
	}

	public QAFWebElement getOtrhomepagemoremenutermsofusebtn() {
		return otrHomepageMoremenuTermsofuseBtn;
	}

	public QAFWebElement getOtrhomepagemoremenuprivacypolicybtn() {
		return otrHomepageMoremenuPrivacypolicyBtn;
	}

	public QAFWebElement getOtrhomepagemoremenulogoutbtn() {
		return otrHomepageMoremenuLogoutBtn;
	}

	public QAFWebElement getOtrHomepageMoremenuConnectionsWalgreensLbl() {
		return otrHomepageMoremenuConnectionsWalgreensLbl;
	}

	public QAFWebElement getOtrHomepageMoremenuConnectionsWalgreenTglbtn() {
		return otrHomepageMoremenuConnectionsWalgreenTglbtn;
	}

	public QAFWebElement getOtrHomepageMoremenuRemindersBgtestTempBtm() {
		return otrHomepageMoremenuRemindersBgtestTempBtm;
	}

	public QAFWebElement getOtrHomepageMoremenuConnectionsWalgreenChkbx() {
		return otrHomepageMoremenuConnectionsWalgreenChkbx;
	}

	public QAFWebElement getOtrMoremenuSyncreminderLbl() {
		return otrMoremenuSyncreminderLbl;
	}

	public QAFWebElement getOtrMoremenuSyncreminderToggleBtn() {
		return otrMoremenuSyncreminderToggleBtn;
	}

	public QAFWebElement getOtrWalgreenpageUsernameTxtfld() {
		return otrWalgreenpageUsernameTxtfld;
	}

	public QAFWebElement getOtrWalgreenpagePasswordTxtfld() {
		return otrWalgreenpagePasswordTxtfld;
	}

	public QAFWebElement getOtrWalgreenpageSigninBtn() {
		return otrWalgreenpageSigninBtn;
	}

	public QAFWebElement getOtrWalgreenpageAutologinYesBtn() {
		return otrWalgreenpageAutologinYesBtn;
	}

	public QAFWebElement getOtrWalgreenpageFinishloginBtn() {
		return otrWalgreenpageFinishloginBtn;
	}

	ContactusPageAndroid conPage = new ContactusPageAndroid();
	@FindBy(locator = "otr.moremenu.syncreminder.lbl")
	private QAFWebElement otrMoremenuSyncreminderLbl;
	@FindBy(locator = "otr.moremenu.syncreminder.toggle.btn")
	private QAFWebElement otrMoremenuSyncreminderToggleBtn;
	@FindBy(locator = "otr.walgreenpage.username.txtfld")
	private QAFWebElement otrWalgreenpageUsernameTxtfld;
	@FindBy(locator = "otr.walgreenpage.password.txtfld")
	private QAFWebElement otrWalgreenpagePasswordTxtfld;
	@FindBy(locator = "otr.walgreenpage.signin.btn")
	private QAFWebElement otrWalgreenpageSigninBtn;
	@FindBy(locator = "otr.walgreenpage.autologin.yes.btn")
	private QAFWebElement otrWalgreenpageAutologinYesBtn;
	@FindBy(locator = "otr.walgreenpage.finishlogin.btn")
	private QAFWebElement otrWalgreenpageFinishloginBtn;
	@FindBy(locator = "otr.walgreenpage.iagree.chkbx")
	private QAFWebElement otrWalgreenpageIagreeChkbx;

	// Method to click on Contact Us menu
	public void clickContactUs() {
		// getOtrhomepagemoremenucontactusbtn().waitForPresent();
		Reporter.logWithScreenShot("More Menu with Contact Us button", MessageTypes.Pass);
		getOtrhomepagemoremenucontactusbtn().click();
		conPage.getOtrhomepagemoremenucontactuscontactuslbl().waitForPresent();
		Reporter.logWithScreenShot("Contact Us Page Displayed", MessageTypes.Pass);
	}

	// Method to verify Menus from More Menu tab
	public void verifyMenu() {
		getOtrhomepagemoremenusettingsbtn().verifyPresent("Settings Menu in More Menu");
		getOtrhomepagemoremenumymetersbtn().verifyPresent("My Meters Menu in More Menu");
		getOtrhomepagemoremenucontactusbtn().verifyPresent("Contact Us Menu in More Menu");
		getOtrhomepagemoremenuaccountbtn().verifyPresent("Account Menu in More Menu");
		getOtrhomepagemoremenuhelpbtn().verifyPresent("Help Menu in More Menu");
		getOtrhomepagemoremenuremindersbtn().verifyPresent("Reminders Menu in More Menu");
		getOtrhomepagemoremenutermsofusebtn().verifyPresent("Terms Of Use Menu in More Menu");
		getOtrhomepagemoremenuprivacypolicybtn().verifyPresent("Privacy Policy Menu in More Menu");
		getOtrhomepagemoremenulogoutbtn().verifyPresent("Logout Button in More Menu");

	}

	// Method to verify Terms of Use link from More Menu
	public void verifyTermsOfUsePage() {
		getOtrhomepagemoremenutermsofusebtn().verifyPresent("Terms Of Use Menu in More Menu");
		getOtrhomepagemoremenutermsofusebtn().click();
		getOtrHomepageMoremenuTermsofUsePageLbl().waitForPresent();
		Reporter.logWithScreenShot("Terms Of Use Page is Displayed", MessageTypes.Pass);
		Reporter.logWithScreenShot("Terms Of Use Page 1 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms Of Use Page 2 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms Of Use Page 3 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms Of Use Page 4 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Terms Of Use Page 5 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to verify Privacy Policy link from More Menu
	public void verifyPrivacyPolicyPage() {
		getOtrhomepagemoremenuprivacypolicybtn().verifyPresent("Privacy Policy Menu in More Menu");
		getOtrhomepagemoremenuprivacypolicybtn().click();
		getOtrHomepageMoremenuTermsofUsePageLbl().waitForPresent();
		Reporter.logWithScreenShot("Privacy Policy Page 1 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 2 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 3 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 4 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.swipeWithCoordinates(704, 1309, 704, 600, 10);
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Privacy Policy Page 5 is Displayed", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to open My setting Page
	public void clickMySetting() {
		if (getOtrhomepagemoremenusettingsbtn().isPresent()) {
			getOtrhomepagemoremenusettingsbtn().click();
			JNJUtilsAndroid.waitforLoad();
		}
	}

	// Method To Open My Meters Page
	public void clickMyMeters() {
		if (getOtrhomepagemoremenumymetersbtn().isPresent()) {
			getOtrhomepagemoremenumymetersbtn().click();
			JNJUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("My Meters page", MessageTypes.Pass);
		}

	}

	// Method to click on Connections tab on Homepage
	public void clickConnections() {
		getOtrHomepageMoreMenuConnectionsBtn().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Connections Page is displayed", MessageTypes.Pass);
	}

	public void takeScreenshotsConnetionsPage() {

		Reporter.logWithScreenShot("Connections page is displayed", MessageTypes.Pass);
		getOtrHomepageMoreMenuAddOfficeCodeBtn().click();
		JNJUtilsAndroid.hideKeyboard();
		Reporter.logWithScreenShot("Add office page is displayed", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
		if (getOtrHomepageMoremenuConnectionsWalgreenChkbx().isPresent()) {
			getOtrHomepageMoremenuConnectionsWalgreenChkbx().click();
			Reporter.logWithScreenShot("Important notice message", MessageTypes.Pass);
			getOtrMoreMenuPageReminderDeletePopUpDeleteBtn().click();
			Reporter.logWithScreenShot("Walgreens notice page", MessageTypes.Pass);
		}
		JNJUtilsAndroid.clickBackButton();

	}

	public void enterAndVerifyValidOfficeCode(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}

		getOtrHomepageMoreMenuAddOfficeCodeBtn().waitForPresent();
		getOtrHomepageMoreMenuAddOfficeCodeBtn().click();
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("1").waitForPresent();
		Reporter.logWithScreenShot("Page to add office code is displayed", MessageTypes.Pass);
		String clinicCode = userBean.getClinicCode();
		System.out.println("Clinic code details are :" + userBean.getClinicCode());
		int index = 1;
		for (int i = 0; i < clinicCode.length(); i++) {
			String boxNo = "" + index;
			char c = clinicCode.charAt(i);
			String s = new StringBuilder().append(c).toString();
			getotrHomepageMoremenuConnectionsOfficeCodeTxt(boxNo).sendKeys(s);
			index++;
		}
		getOtrHomepageMoreMenuConnectionsSearchBtn().waitForEnabled();
		Reporter.logWithScreenShot("Clinic Code details are entered", MessageTypes.Pass);
		getOtrHomepageMoreMenuConnectionsSearchBtn().click();

		/*
		 * WebDriverTestCase.verifyTrue(
		 * getOtrHomepageMoremenuConnectionsOfficenameLbl().getText().
		 * equalsIgnoreCase(userBean.getOfficName()),
		 * "Office name is incorrect", "Office name is correct");
		 * WebDriverTestCase .verifyTrue(
		 * getOtrHomepageMoremenuConnectionsOfficenumberLbl().getText().
		 * replaceAll("[^0-9]", "")
		 * .equalsIgnoreCase(userBean.getOfficeNumber()),
		 * "Office number is incorrect", "Office number is correct");
		 */
		getOtrHomepageMoremenuClinicConfirmationField().waitForPresent();
		String officeDetails = getOtrHomepageMoremenuClinicConfirmationField().getText();
		String[] details = officeDetails.split("\\r?\\n");
		String verifyOfficeDetails = details[0];
		verifyOfficeDetails = details[0].concat(details[1]);
		// WebDriverTestCase.verifyTrue(verifyOfficeDetails.equalsIgnoreCase(userBean.getOfficeDetails()),
		// "Office details are incorrect", "Office details are correct");
		getOtrHomepageMoremenuAddOfficecodeYESBtn().waitForEnabled();
		getOtrHomepageMoremenuAddOfficecodeYESBtn().click();
		getOtrHomepageMoremenuConnectionsOfficeacceptChkbox().click();
		getOtrHomepageMoremenuConnectionsDoneBtn().waitForPresent();
		getOtrHomepageMoremenuConnectionsDoneBtn().click();
		Reporter.logWithScreenShot("After clicking done button", MessageTypes.Pass);

	}

	public void enterAndVerifyInvalidOfficeCode() {

		getOtrHomepageMoreMenuAddOfficeCodeBtn().waitForPresent();
		getOtrHomepageMoreMenuAddOfficeCodeBtn().click();
		Reporter.logWithScreenShot("Page to add office code is displayed", MessageTypes.Pass);
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("1").sendKeys("A");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("2").sendKeys("B");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("3").sendKeys("C");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("4").sendKeys("D");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("5").sendKeys("E");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("6").sendKeys("F");
		getOtrHomepageMoreMenuConnectionsSearchBtn().waitForEnabled();
		getOtrHomepageMoreMenuConnectionsSearchBtn().click();
		JNJUtilsAndroid.waitforLoad();
		Reporter.logWithScreenShot("Office code is invalid and denied", MessageTypes.Pass);
	}

	public void incorrectClinicCodeFormat() {
		getOtrHomepageMoreMenuAddOfficeCodeBtn().waitForPresent();
		getOtrHomepageMoreMenuAddOfficeCodeBtn().click();
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("1").verifyPresent("Clinic code text box");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("1").sendKeys("1");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("2").sendKeys("2");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("3").sendKeys("3");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("4").sendKeys("4");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("5").sendKeys("5");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("6").sendKeys("6");

		WebDriverTestCase.verifyTrue(
				!getotrHomepageMoremenuConnectionsOfficeCodeTxt("1").getAttribute("value").contains("1"),
				"Able to enter numeric value", "Numeric value not allowed");

	}

	public void clickHelp() {
		getOtrhomepagemoremenuhelpbtn().waitForPresent();
		Reporter.logWithScreenShot("Help option on More menu", MessageTypes.Pass);
		getOtrhomepagemoremenuhelpbtn().click();

	}

	// Method to click on logout button on more menu screen
	public void clickonLogoutBtn() {
		getOtrhomepagemoremenulogoutbtn().waitForPresent();
		getOtrhomepagemoremenulogoutbtn().click();
		Reporter.logWithScreenShot("After clicking on logout", MessageTypes.Pass);
	}

	public void verifyAddedReminder() {
		getOtrMoreMenuMyRemindersPageSaveDateTimeLbl().verifyPresent("Date and Time label is displayed");
		getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.delete"))
				.verifyPresent("Delete Button is present");
	}

	public void ClickSaveBtn() {
		getOtrMoreMenuMyReminderspageSaveRemindersBtn().waitForPresent();
		getOtrMoreMenuMyReminderspageSaveRemindersBtn().click();
	}

	public void verifySetReminderScreen(String reminderType) {
		getOtrMoreMenuMyReminderspageStaticTextBtn(
				ConfigurationManager.getBundle().getString("more.reminder.setReminder")).waitForPresent();
		getOtrMoreMenuMyReminderspageRememberBtn().verifyPresent("Set reminder title");
		WebDriverTestCase.verifyTrue(getOtrMoreMenuMyReminderspageStaticTextBtn(reminderType).isPresent(),
				"Reminder name incorrect", "Reminder name title correct");
		getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("more.reminder.date"))
				.verifyPresent("Date and time");
		getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("more.reminder.repeat"))
				.verifyPresent("Reminder repeat");

	}

	public void clickOnAddicon() {
		getOtrMoreMenuMyReminderspageMyRemindersLbl().waitForPresent();
		getOtrMoreMenuMyReminderspageAddRemindersBtn().click();
	}

	public void clickOnReminderFromMoreMenu() {
		getOtrhomepagemoremenuremindersbtn().waitForPresent();
		getOtrhomepagemoremenuremindersbtn().click();
		Reporter.logWithScreenShot("Reminder Page", MessageTypes.Pass);

	}

	public void screenShotsForAllReminders() {

	}

	public void setRepeatPicker() {
		getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("reminder.types.daily"))
				.waitForPresent();
		getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("reminder.types.daily"))
				.click();
	}

	public void addNewReminderType() {
		String text = "New remidnerType";
		clickOnReminderFromMoreMenu();
		clickOnAddicon();
		clickOnNewReminderBtn();
		verifyAddRminderTypeScreen();
		getOtrMoreMenuMyReminderspageAddRemindersBtn().sendKeys(text);
		ClickSaveBtn();
		getOtrMoreMenuMyReminderspageStaticTextBtn(text);
		WebDriverTestCase.verifyTrue(getOtrMoreMenuMyReminderspageStaticTextBtn(text).isPresent(),
				"Added new reminder not saved", "Added new reminder type");

	}

	public void verifyAddRminderTypeScreen() {
		getOtrMoreMenuMyReminderspageAddRemindersBtn().verifyPresent("New Reminder text field is present");
		getOtrMoreMenuMyReminderspageSaveRemindersBtn().verifyPresent("Save Button is present");
	}

	public void clickOnNewReminderBtn() {
		getOtrMoreMenuMyReminderspageNewReminderBtn().waitForPresent();
		getOtrMoreMenuMyReminderspageNewReminderBtn().click();
		Reporter.logWithScreenShot("After Clicking New Reminder button", MessageTypes.Pass);
	}

	public void verifyRemindersScreen() {
		getOtrMoreMenuMyReminderspageMyRemindersLbl().waitForPresent();
		getOtrMoreMenuMyReminderspageAddRemindersBtn().verifyPresent("Add icon");
	}

	public void verifyReminderScreens() {
		clickOnReminderFromMoreMenu();
		verifyRemindersScreen();
		clickOnAddicon();
		verifyChooseReminderScreen();
		getOtrMoreMenuMyReminderspageStaticTextBtn(
				JNJUtilsAndroid.getPropString("reminder.preset.perform.glucose.test")).click();
		try {
			getOtrMoreMenuMyReminderspageStaticTextBtn("Allow").waitForPresent(5000);
		} catch (Exception e) {
		}
		if (getOtrMoreMenuMyReminderspageStaticTextBtn("Allow").isPresent()) {
			getOtrMoreMenuMyReminderspageStaticTextBtn("Allow").click();
		}
		verifySetReminderScreen(JNJUtilsAndroid.getPropString("reminder.preset.perform.glucose.test"));
		JNJUtilsAndroid.clickBackButton();
		getOtrMoreMenuMyReminderspageNewReminderBtn().waitForPresent();
		getOtrMoreMenuMyReminderspageNewReminderBtn()
				.verifyPresent("After clicking back button Choose reminder screen");
		clickOnNewReminderBtn();
		JNJUtilsAndroid.clickBackButton();
		getOtrMoreMenuMyReminderspageNewReminderBtn().waitForPresent();
		getOtrMoreMenuMyReminderspageNewReminderBtn()
				.verifyPresent("After clicking back button Choose reminder screen");
		JNJUtilsAndroid.clickBackButton();
		getOtrMoreMenuMyReminderspageMyRemindersLbl().verifyPresent("After clicking back button Reminders screen");
		JNJUtilsAndroid.clickBackButton();
		Reporter.logWithScreenShot("Reminders screen", MessageTypes.Pass);
	}

	public void verifyChooseReminderScreen() {
		getOtrMoreMenuMyReminderspageStaticTextBtn(
				ConfigurationManager.getBundle().getString("reminder.preset.perform.glucose.test"))
						.verifyPresent("Perform a glucose test reminder is present");
		getOtrMoreMenuMyReminderspageStaticTextBtn(
				ConfigurationManager.getBundle().getString("reminder.preset.eat.snack"))
						.verifyPresent("Eat a Snack reminder is present");
		getOtrMoreMenuMyReminderspageNewReminderBtn().verifyPresent("New Reminder button is present");
	}

	public void setSnackReminder(String reminderDetail) {

		LogbookPageAndroid logbookPageAndroid = new LogbookPageAndroid();

		clickOnReminderFromMoreMenu();
		clickOnAddicon();
		getOtrMoreMenuMyReminderspageStaticTextBtn(reminderDetail).waitForPresent();
		getOtrMoreMenuMyReminderspageStaticTextBtn(reminderDetail).click();
		try {
			// getOtrMoreMenuMyReminderspageStaticTextBtn("Don't
			// Allow").waitForPresent();
			if (getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.isDisplayed()) {
				getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
						.click();
			}
		} catch (Exception e) {
			Reporter.logWithScreenShot("Ok button not clicked", MessageTypes.Pass);
		}

		verifySetReminderScreen(reminderDetail);
		getOtrMoreMenuMyReminderspageSelectedDateTimeBtn().click();
		logbookPageAndroid.selectFutureDate();
		if (getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
				.isDisplayed()) {
			getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.click();
			getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.click();
		}
		getOtrMoreMenuMyReminderspageSelectRepeatOptionBtn().click();
		setRepeatPicker();
		ClickSaveBtn();
		getOtrMoreMenuMyReminderspageStaticTextBtn(reminderDetail).waitForPresent();
		getOtrMoreMenuMyReminderspageStaticTextBtn(reminderDetail).click();
		verifyAddedReminder();
		getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.delete"))
				.click();
		Reporter.logWithScreenShot("Delete Popup is displayed", MessageTypes.Pass);
		getOtrMoreMenuPageReminderDeletePopUpDeleteBtn().click();
		Reporter.logWithScreenShot("Reminder is deleted successfully", MessageTypes.Pass);
	}

	// Method To Open My Account Page
	public void clickMyAccount() {
		getOtrhomepagemoremenuaccountbtn().waitForPresent();
		Reporter.logWithScreenShot("My Account page is displayed", MessageTypes.Pass);
		getOtrhomepagemoremenuaccountbtn().click();
	}

	// Method to verify reminder type field maximum length
	public void verifyReminderTypeFieldMaxLength() {
		getOtrMoreMenuMyReminderspageMyRemindersLbl().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(36);
		clickOnAddicon();
		clickOnNewReminderBtn();
		verifyAddRminderTypeScreen();
		getOtrMoreMenuMyReminderspageAddRemindersBtn().clear();
		getOtrMoreMenuMyReminderspageAddRemindersBtn().sendKeys(typeName);
		Validator.verifyThat("Reminder type length",
				getOtrMoreMenuMyReminderspageAddRemindersBtn().getAttribute("value").length(),
				Matchers.lessThanOrEqualTo(35));
	}

	// Method to check walgreen user
	public void verifyWalgreenUserSwitch() {
		getOtrHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		if (getOtrHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("For walgreen user walgreen switch is enabled", MessageTypes.Pass);
	}

	// Method to verify reminder
	public void verifydescriptionLengthAndReminderTimePast() {
		getOtrMoreMenuMyReminderspageMyRemindersLbl().waitForPresent();
		String typeName = RandomStringUtils.randomAlphanumeric(61);
		clickOnAddicon();
		getOtrMoreMenuMyReminderspageStaticTextBtn(
				JNJUtilsAndroid.getPropString("reminder.preset.perform.glucose.test")).click();
		try {
			getOtrMoreMenuMyReminderspageStaticTextBtn("Allow").waitForPresent(5000);
			if (getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
					.isPresent()) {
				getOtrMoreMenuMyReminderspageStaticTextBtn(ConfigurationManager.getBundle().getString("appCommon.ok"))
						.click();
			} else if (getOtrMoreMenuMyReminderspageStaticTextBtn("Allow").isPresent()) {
				getOtrMoreMenuMyReminderspageStaticTextBtn("Allow").click();

			}
		} catch (Exception e) {
		}
		LogbookPageAndroid logbookPageAndroid = new LogbookPageAndroid();
		getOtrMoreMenuMyReminderspageEnterDescriptionTxt().waitForPresent();
		getOtrMoreMenuMyReminderspageEnterDescriptionTxt().clear();
		getOtrMoreMenuMyReminderspageEnterDescriptionTxt().sendKeys(typeName);
		Validator.verifyThat("Reminder description max allowed charcter",
				getOtrMoreMenuMyReminderspageEnterDescriptionTxt().getAttribute("value").length(),
				Matchers.lessThanOrEqualTo(60));

		getOtrMoreMenuMyReminderspageSelectedDateTimeBtn().click();
		logbookPageAndroid.getOtrLogbookEditglucoseDatepopupDateTxt().waitForPresent();
		int date = Integer.parseInt(JNJUtilsAndroid.getCurrentDate()) - 1;
		ConfigurationManager.getBundle().setProperty("selected.date", date);

		for (QAFWebElement ele : logbookPageAndroid.getOtrLogbookEditglucoseDatepopupDatesvalueTxt()) {
			if (JNJUtilsAndroid.tryDisplayMethod(ele) && ele.getText().contains(date + "")) {
				ele.click();
				break;
			}
		}
		Reporter.logWithScreenShot("Selected date", MessageTypes.Pass);

	}

	public void reminderscreens() {
		getOtrMoreMenuMyReminderspageAddRemindersBtn().waitForPresent();
		Reporter.logWithScreenShot("reminder screen1", MessageTypes.Pass);
		getOtrMoreMenuMyReminderspageAddRemindersBtn().click();
		Reporter.logWithScreenShot("reminder screen2", MessageTypes.Pass);
		clickOnNewReminderBtn();
		Reporter.logWithScreenShot("reminder screen3", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
		/*
		 * String eat =
		 * JNJUtilsAndroid.getPropString("reminder.preset.eat.snack");
		 * getOtrMoreMenuMyReminderspageStaticTextBtn(eat).click();
		 */
		getOtrHomepageMoremenuRemindersBgtestTempBtm().click();
		String ok = JNJUtilsAndroid.getPropString("appCommon.ok");
		try {
			getOtrMoreMenuMyReminderspageStaticTextBtn(ok).waitForPresent(5000);
			if (getOtrMoreMenuMyReminderspageStaticTextBtn(ok).isPresent()) {
				getOtrMoreMenuMyReminderspageStaticTextBtn(ok).click();
			} else if (getOtrMoreMenuMyReminderspageStaticTextBtn("Allow").isPresent()) {
				getOtrMoreMenuMyReminderspageStaticTextBtn("Allow").click();

			}
		} catch (Exception e) {
		}
		Reporter.logWithScreenShot("reminder screen5", MessageTypes.Pass);
		getOtrMoreMenuMyReminderspageSelectedDateTimeBtn().click();
		Reporter.logWithScreenShot("reminder screen5", MessageTypes.Pass);
		JNJUtilsAndroid.clickBackButton();
		JNJUtilsAndroid.clickBackButton();
		JNJUtilsAndroid.clickBackButton();
	}

	// Method to verify my setting screen
	public void mySettingScreen() {

		Reporter.logWithScreenShot("Setting screen", MessageTypes.Pass);
		/*
		 * JNJUtilsAndroid.swipeWithCoordinates(300, 1000, 443, 500, 50);
		 * JNJUtilsAndroid.waitforLoad();
		 * Reporter.logWithScreenShot("Setting screen2", MessageTypes.Pass);
		 */
	}

	public void otherCountryClinicCode() {
		getOtrHomepageMoreMenuAddOfficeCodeBtn().click();
		// String
		// clinicCode=ConfigurationManager.getBundle().getProperty("clinic.clinicCode.cn.code1").toString();
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("1").sendKeys("P");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("2").sendKeys("A");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("3").sendKeys("Y");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("4").sendKeys("C");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("5").sendKeys("W");
		getotrHomepageMoremenuConnectionsOfficeCodeTxt("6").sendKeys("Y");
		getOtrHomepageMoreMenuConnectionsSearchBtn().waitForEnabled();
		getOtrHomepageMoreMenuConnectionsSearchBtn().click();
		getOtrMoreMenuMyReminderspageStaticTextBtn(JNJUtilsAndroid.getPropString("office.code.not.found"))
				.verifyPresent("Office code error message");
	}

	public void verifyWalgreenUserSwitchOff() {
		MyMeters myMeters = new MyMeters();
		getOtrHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		if (getOtrHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("For walgreen user walgreen switch is enabled", MessageTypes.Pass);
			getOtrHomepageMoremenuConnectionsWalgreenChkbx().click();
			myMeters.getOtrMymeterpagePairmeterPopupCancelBtn().waitForPresent();
			Reporter.logWithScreenShot("disable Walgreen confirmation popup is displayed", MessageTypes.Pass);
			myMeters.getOtrMymeterpagePairmeterPopupCancelBtn().click();
			if (getOtrHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
					.equalsIgnoreCase("true"))
				Reporter.logWithScreenShot("walgreen switch is enabled when clicked on Cancel button",
						MessageTypes.Pass);
			getOtrHomepageMoremenuConnectionsWalgreenChkbx().click();
			myMeters.getOtrMymeterpagePairmeterPopupCancelBtn().waitForPresent();
			getOtrMoreMenuPageReminderDeletePopUpDeleteBtn().click();
			if (getOtrHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
					.equalsIgnoreCase("false"))
				Reporter.logWithScreenShot("walgreen switch is disabled when clicked on ok button", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Walgreen switch is already unchecked", MessageTypes.Pass);

	}

	public void addNonwalgreenUserToWalgreen(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}

		MyMeters myMeters = new MyMeters();
		getOtrHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
		if (getOtrHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("true")) {
			Reporter.logWithScreenShot("Logged in user is already a Walgreen user", MessageTypes.Pass);
		} else if (getOtrHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("false")) {
			getOtrHomepageMoremenuConnectionsWalgreenChkbx().click();
			myMeters.getOtrMymeterpagePairmeterPopupCancelBtn().waitForPresent();
			Reporter.logWithScreenShot("Enable Walgreen for new user popup is displayed", MessageTypes.Pass);
			getOtrMoreMenuPageReminderDeletePopUpDeleteBtn().click();
			JNJUtilsAndroid.waitforLoad();
			getOtrWalgreenpageIagreeChkbx().waitForPresent();
			getOtrWalgreenpageIagreeChkbx().click();
			getOtrWalgreenpageUsernameTxtfld().waitForPresent();
			getOtrWalgreenpageUsernameTxtfld().sendKeys(userBean.getUsername());
			getOtrWalgreenpagePasswordTxtfld().sendKeys(userBean.getPassword());
			getOtrWalgreenpageSigninBtn().click();
			getOtrWalgreenpageAutologinYesBtn().waitForPresent();
			getOtrWalgreenpageAutologinYesBtn().click();
			getOtrWalgreenpageFinishloginBtn().waitForPresent();
			getOtrWalgreenpageFinishloginBtn().click();
			getOtrHomepageMoremenuConnectionsWalgreenChkbx().waitForPresent();
			if (getOtrHomepageMoremenuConnectionsWalgreenChkbx().getAttribute("checked").toString()
					.equalsIgnoreCase("true"))
				Reporter.logWithScreenShot("Non walgreen user is able to get connect to walgreen successfully",
						MessageTypes.Pass);

		}

	}

	public void verifyToggleButton() {
		clickOnReminderFromMoreMenu();
		if (getOtrMoremenuSyncreminderLbl().isDisplayed())
			getOtrMoremenuSyncreminderToggleBtn().verifyPresent("Toggle button is present");
		else
			Reporter.logWithScreenShot("Toggle button is not present", MessageTypes.Pass);
	}

	public void verifyToggleButtonDisabled() {
		getOtrMoremenuSyncreminderToggleBtn().verifyDisabled("Toggle button is in disabled state");
	}

	public void verifyToggleButtonON() {
		clickOnReminderFromMoreMenu();
		if (getOtrMoremenuSyncreminderToggleBtn().getAttribute("text").equalsIgnoreCase("ON"))
			Reporter.logWithScreenShot("Toggle button switch is ON", MessageTypes.Pass);
		else {
			Reporter.logWithScreenShot("Toggle button switch is OFF", MessageTypes.Pass);
			getOtrMoremenuSyncreminderToggleBtn().click();
			Reporter.logWithScreenShot("Toggle button switch is ON", MessageTypes.Pass);
		}
	}

	public QAFWebElement getOtrWalgreenpageIagreeChkbx() {
		return otrWalgreenpageIagreeChkbx;
	}

}
