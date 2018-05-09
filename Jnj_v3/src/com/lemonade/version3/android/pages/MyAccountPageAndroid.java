package com.lemonade.version3.android.pages;

import com.lemonade.support.ConstantUtils;
import com.lemonade.version3.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class MyAccountPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "otr.moremenu.myaccountpage.heading.lbl")
	private QAFWebElement otrMoremenuMyaccountpageHeadingLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.accntdtls.lbl")
	private QAFWebElement otrMoremenuMyaccountpageAccntdtlsLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.useremail.lbl")
	private QAFWebElement otrMoremenuMyaccountpageUseremailLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.logout.btn")
	private QAFWebElement otrMoremenuMyaccountpageLogoutBtn;
	@FindBy(locator = "otr.moremenu.myaccountpage.accountsync.lnk")
	private QAFWebElement otrMoremenuMyaccountpageAccountsyncLnk;
	@FindBy(locator = "otr.moremenu.myaccountpage.diabetes.optin.chkbx")
	private QAFWebElement otrMoreMenuMyAccountpageDiabetesOptinChkbx;
	@FindBy(locator = "otr.moremenu.myaccountpage.lastsync.lbl")
	private QAFWebElement otrMoremenuMyaccountpageLastsyncLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.withmeter.lbl")
	private QAFWebElement otrMoremenuMyaccountpageWithmeterLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.withaccount.lbl")
	private QAFWebElement otrMoremenuMyaccountpageWithaccountLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.accountsync.datetime.lbl")
	private QAFWebElement otrMoremenuMyaccountpageAccountsyncDatetimeLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.statictext.lbl")
	private QAFWebElement otrMoremenuMyaccountpageStatictextLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.keepmeloggedin.lbl")
	private QAFWebElement otrMoremenuMyaccountpageKeepmeloggedinLbl;
	@FindBy(locator = "otr.moremenu.myaccountpage.keepmeloggedin.swtch")
	private QAFWebElement otrMoremenuMyaccountpageKeepmeloggedinSwtch;

	public QAFWebElement getOtrMoreMenuMyAccountpageDiabetesOptinChkbx() {
		return otrMoreMenuMyAccountpageDiabetesOptinChkbx;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageAccountsyncLnk() {
		return otrMoremenuMyaccountpageAccountsyncLnk;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageLastsyncLbl() {
		return otrMoremenuMyaccountpageLastsyncLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageWithmeterLbl() {
		return otrMoremenuMyaccountpageWithmeterLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageWithaccountLbl() {
		return otrMoremenuMyaccountpageWithaccountLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageAccountsyncDatetimeLbl() {
		return otrMoremenuMyaccountpageAccountsyncDatetimeLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageStatictextLbl(String optinCheckboxMsg) {
		return otrMoremenuMyaccountpageStatictextLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageKeepmeloggedinLbl() {
		return otrMoremenuMyaccountpageKeepmeloggedinLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageKeepmeloggedinSwtch() {
		return otrMoremenuMyaccountpageKeepmeloggedinSwtch;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOtrMoremenuMyaccountpageHeadingLbl() {
		return otrMoremenuMyaccountpageHeadingLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageAccntdtlsLbl() {
		return otrMoremenuMyaccountpageAccntdtlsLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageUseremailLbl() {
		return otrMoremenuMyaccountpageUseremailLbl;
	}

	public QAFWebElement getOtrMoremenuMyaccountpageLogoutBtn() {
		return otrMoremenuMyaccountpageLogoutBtn;
	}

	// Method to verify opt-in checkbox
	public void OptinCheckBox() {
		if (getOtrMoreMenuMyAccountpageDiabetesOptinChkbx().getAttribute("checked").toString().equalsIgnoreCase("true"))
			Reporter.logWithScreenShot("User has optin to receive diabetes related information", MessageTypes.Pass);
		else
			Reporter.logWithScreenShot("User has optout to receive diabetes related information", MessageTypes.Pass);
	}

	// Method to verify My Account Page
	public void verifyMyAccountPage(Object userDetail) {

		UserDetailBeans userBean = new UserDetailBeans();
		if (userDetail instanceof String) {

			userBean.fillFromConfig((String) userDetail);
		} else {
			userBean.fillData(userDetail);
		}
		getOtrMoremenuMyaccountpageAccntdtlsLbl().waitForPresent();
		WebDriverTestCase.verifyTrue(
				getOtrMoremenuMyaccountpageUseremailLbl().getAttribute("text").contains(userBean.getEmailID()),
				userBean.getEmailID() + "Expected   Actual "
						+ getOtrMoremenuMyaccountpageUseremailLbl().getAttribute("text"),
				"Correct email ID");
		getOtrMoremenuMyaccountpageLogoutBtn().verifyPresent("Sign out button");
		getOtrMoremenuMyaccountpageLastsyncLbl().verifyPresent("Last sync label");
		getOtrMoremenuMyaccountpageWithmeterLbl().verifyPresent("last sync with meter label");
		getOtrMoremenuMyaccountpageWithaccountLbl().verifyPresent("Sync with account label");
		getOtrMoremenuMyaccountpageAccountsyncDatetimeLbl().verifyPresent("Account last sync time");
		getOtrMoremenuMyaccountpageKeepmeloggedinLbl().verifyPresent("Keep me logged in label");
		getOtrMoremenuMyaccountpageKeepmeloggedinSwtch().verifyPresent("Keep me logged in switch");
		//getOtrMoreMenuMyAccountpageDiabetesOptinChkbx().verifyPresent("Opt-in checkbox");
		// getOtrMoremenuMyaccountpageStatictextLbl(ConstantUtils.OPTIN_CHECKBOX_MSG)
		// .verifyPresent("Receive diabetes related message label");
		//getOtrMoremenuMyaccountpageAccountsyncLnk().verifyPresent("Sync with meter button");

	}

	public void selectOptin() {
		SignupPageAndroid android = new SignupPageAndroid();
		getOtrMoreMenuMyAccountpageDiabetesOptinChkbx().waitForPresent();
		if (getOtrMoreMenuMyAccountpageDiabetesOptinChkbx().getAttribute("checked").toString()
				.equalsIgnoreCase("false")) {
			getOtrMoreMenuMyAccountpageDiabetesOptinChkbx().click();
			android.getOtrSignuppageIagreeBtn().waitForPresent(2000);
			android.getOtrSignuppageIagreeBtn().click();

			Reporter.logWithScreenShot("Option is checked successfully", MessageTypes.Pass);
		} else
			Reporter.logWithScreenShot("Option is already checked", MessageTypes.Pass);
	}
	//method to enable keep me login btn on my account screen
	public void enableKeepMeLoginSwitch(){
		if(!(getOtrMoremenuMyaccountpageKeepmeloggedinSwtch().getAttribute("checkble").contains("true"))){
			getOtrMoremenuMyaccountpageKeepmeloggedinSwtch().click();
		}
	}

}
