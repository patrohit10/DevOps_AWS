package com.lemonade.version3.iOS.pages;

import com.lemonade.support.ConstantUtils;
import com.lemonade.support.JNJUtilsIOS;
import com.lemonade.version3.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class MyAccountPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otrios.moremenu.myaccountpage.heading.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageHeadingLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.accntdtls.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageAccntdtlsLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.useremail.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageUseremailLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.logout.btn")
	private QAFWebElement otriosMoremenuMyaccountpageLogoutBtn;
	@FindBy(locator = "otrios.moremenu.myaccountpage.lastsync.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageLastsyncLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.withmeter.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageWithmeterLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.metersynctime.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageMetersynctimeLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.withaccount.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageWithaccountLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.accountlastsynctime.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageAccountlastsynctimeLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.loginpreference.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageLoginpreferenceLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.keepmelogin.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageKeepmeloginLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.keepmelogin.switch")
	private QAFWebElement otriosMoremenuMyaccountpageKeepmeloginSwitch;
	@FindBy(locator = "otrios.moremenu.myaccountpage.optin.chkbox")
	private QAFWebElement otriosMoremenuMyaccountpageOptinChkbox;
	@FindBy(locator = "otrios.moremenu.myaccountpage.syncwithaccount.btn")
	private QAFWebElement otriosMoremenuMyaccountpageSyncwithaccountBtn;
	@FindBy(locator = "otrios.moremenu.myaccountpage.optin.title.lbl")
	private QAFWebElement otriosMoremenuMyaccountpageOptinTitleLbl;
	@FindBy(locator = "otrios.moremenu.myaccountpage.cancel.btn")
	private QAFWebElement otriosMoremenuMyaccountpageCancelBtn;
	@FindBy(locator = "otrios.moremenu.myaccountpage.iagree.btn")
	private QAFWebElement otriosMoremenuMyaccountpageIagreeBtn;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageHeadingLbl() {
		return otriosMoremenuMyaccountpageHeadingLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageAccntdtlsLbl() {
		return otriosMoremenuMyaccountpageAccntdtlsLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageUseremailLbl() {
		return otriosMoremenuMyaccountpageUseremailLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageLogoutBtn() {
		return otriosMoremenuMyaccountpageLogoutBtn;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageLastsyncLbl() {
		return otriosMoremenuMyaccountpageLastsyncLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageWithmeterLbl() {
		return otriosMoremenuMyaccountpageWithmeterLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageMetersynctimeLbl() {
		return otriosMoremenuMyaccountpageMetersynctimeLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageWithaccountLbl() {
		return otriosMoremenuMyaccountpageWithaccountLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageAccountlastsynctimeLbl() {
		return otriosMoremenuMyaccountpageAccountlastsynctimeLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageLoginpreferenceLbl() {
		return otriosMoremenuMyaccountpageLoginpreferenceLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageKeepmeloginLbl() {
		return otriosMoremenuMyaccountpageKeepmeloginLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageKeepmeloginSwitch() {
		return otriosMoremenuMyaccountpageKeepmeloginSwitch;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageOptinChkbox() {
		return otriosMoremenuMyaccountpageOptinChkbox;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageSyncwithaccountBtn() {
		return otriosMoremenuMyaccountpageSyncwithaccountBtn;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageOptinTitleLbl() {
		return otriosMoremenuMyaccountpageOptinTitleLbl;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageCancelBtn() {
		return otriosMoremenuMyaccountpageCancelBtn;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageIagreeBtn() {
		return otriosMoremenuMyaccountpageIagreeBtn;
	}

	public QAFWebElement getOtriosMoremenuMyaccountpageStatictextLbl(String text) {
		return JNJUtilsIOS.getElement("otrios.moremenu.myaccountpage.statictext.lbl", text);
	}

	// Method to verify my account page
	// Milan
	public void verifyMyAccountPage(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getOtriosMoremenuMyaccountpageAccntdtlsLbl().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getOtriosMoremenuMyaccountpageUseremailLbl().getAttribute("label").contains(userBean.getEmailID()),
				userBean.getEmailID() + "Expected   Actual "
						+ getOtriosMoremenuMyaccountpageUseremailLbl().getAttribute("label"),
				"Correct email ID");
		getOtriosMoremenuMyaccountpageLogoutBtn().verifyPresent("Sign out button");
		getOtriosMoremenuMyaccountpageLastsyncLbl().verifyPresent("Last sync label");
		getOtriosMoremenuMyaccountpageWithmeterLbl().verifyPresent("last sync with meter label");
		getOtriosMoremenuMyaccountpageMetersynctimeLbl().verifyPresent("Meter last time sync");
		getOtriosMoremenuMyaccountpageWithaccountLbl().verifyPresent("Sync with account label");
		getOtriosMoremenuMyaccountpageAccountlastsynctimeLbl().verifyPresent("Account last sync time");
		getOtriosMoremenuMyaccountpageKeepmeloginLbl().verifyPresent("Keep me login label");
		getOtriosMoremenuMyaccountpageKeepmeloginSwitch().verifyPresent("Keep me login switch");
//		getOtriosMoremenuMyaccountpageOptinChkbox().verifyPresent("Opt-in checkbox");
//		getOtriosMoremenuMyaccountpageStatictextLbl(ConstantUtils.OPTIN_CHECKBOX_MSG)
//				.verifyPresent("Receive diabetes related message label");
		getOtriosMoremenuMyaccountpageSyncwithaccountBtn().verifyPresent("Sync with meter button");

	}

	// Method to select opt in option
	// Milan
	public void selectOptin() {

		getOtriosMoremenuMyaccountpageOptinChkbox().waitForPresent();
		getOtriosMoremenuMyaccountpageOptinChkbox().click();
		getOtriosMoremenuMyaccountpageOptinTitleLbl().waitForPresent();
		getOtriosMoremenuMyaccountpageOptinTitleLbl().verifyPresent("Opt in screen");
		getOtriosMoremenuMyaccountpageStatictextLbl(ConstantUtils.OPTIN_MSG).verifyPresent("Opt-In message");
		getOtriosMoremenuMyaccountpageCancelBtn().click();
		getOtriosMoremenuMyaccountpageAccntdtlsLbl().verifyPresent("After clicking cancel button my account screen");
		getOtriosMoremenuMyaccountpageOptinChkbox().click();
		getOtriosMoremenuMyaccountpageOptinTitleLbl().waitForPresent();
		getOtriosMoremenuMyaccountpageIagreeBtn().click();
		getOtriosMoremenuMyaccountpageOptinChkbox().verifyPresent("After clicking I Agree");

	}
	//Method to verify optin is selected
	//Milan
	public void OptinCheckBox() {

		getOtriosMoremenuMyaccountpageAccntdtlsLbl().waitForPresent();
		getOtriosMoremenuMyaccountpageOptinChkbox().verifyPresent("Opt in checkbox");

	}
	
}
